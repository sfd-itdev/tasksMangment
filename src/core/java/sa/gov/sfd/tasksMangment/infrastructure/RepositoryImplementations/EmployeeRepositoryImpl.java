package sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations;

import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.EmployeeMapper;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeEntity;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;


import java.util.List;

public class EmployeeRepositoryImpl implements sa.gov.sfd.tasksMangment.model.Employee.EmployeeRepository {

    private JdbcTemplate jdbcTemplate;
    public EmployeeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EmployeeEntity> getAllEmployees(){
        return jdbcTemplate.query("SELECT * FROM TAM_EMPLOYEE", new EmployeeMapper());
    }

    @Override
    public EmployeeEntity getOneEmployeeByEmployeeId (EmployeeId employeeId){
        return jdbcTemplate.queryForObject("SELECT * FROM TAM_Employee WHERE EMP_ID = ?",
                new Object[]{employeeId.getId()}, new EmployeeMapper());
    }


    @Override
    public boolean updateEmployee (long employeeId, EmployeeEntity employeeEntity){
        jdbcTemplate.update("UPDATE TAM_EMPLOYEE SET  EMP_NATIONAL_ID= ?,  EMP_FULL_NAME= ?, " +
                                " WHERE EMP_ID = ?",
                                  new Object[]{employeeEntity.getEmployeeNationalId(),
                                  employeeEntity.getEmployeeFullName(),
                                  employeeId});
        return true;
    }


    @Override
    public boolean addNewEmployee(EmployeeEntity employeeEntity){
        jdbcTemplate.update("INSERT INTO TAM_EMPLOYEE (EMP_NATIONAL_ID, EMP_FULL_NAME) " +
                                "VALUES(?,?)",
                                 new Object[]{employeeEntity.getEmployeeNationalId(),
                                 employeeEntity.getEmployeeFullName()});
        return true;
    }

    @Override
    public void deleteEmployee(EmployeeId employeeId){
        jdbcTemplate.update("DELETE FROM TAM_EMPLOYEE WHERE EMP_ID = ?",new Object[]{employeeId.getId()});
    }



}
