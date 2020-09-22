package sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations;

import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.EmployeeWorkGroupMapper;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.WorkGroupMapper;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupEntity;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupId;
import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupEntity;
import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupId;

import java.util.List;

public class EmployeeWorkGroupRepositoryImpl implements sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupRepository{

    private JdbcTemplate jdbcTemplate;
    public EmployeeWorkGroupRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EmployeeWorkGroupEntity> getAllEmployeeWorkGroups(){
        return jdbcTemplate.query("SELECT * FROM TAM_EMPLOYEE_WORK_GROUP", new EmployeeWorkGroupMapper());
    }

    @Override
    public EmployeeWorkGroupEntity getOneEmployeeWorkGroupByEmpWorkGrpId (EmployeeWorkGroupId employeeWorkGroupId){
        return jdbcTemplate.queryForObject("SELECT * FROM TAM_EMPLOYEE_WORK_GROUP WHERE EWG_ID = ?",
                new Object[]{employeeWorkGroupId.getId()}, new EmployeeWorkGroupMapper());
    }


    @Override
    public boolean updateEmployeeWorkGroup (long employeeWorkGroupId, EmployeeWorkGroupEntity employeeWorkGroupEntity){
        jdbcTemplate.update("UPDATE TAM_EMPLOYEE_WORK_GROUP SET  WGP_ID= ?,  EMPLOYEE_ID= ? " +
                                "WHERE EWG_ID = ?",
                                 new Object[]{employeeWorkGroupEntity.getWorkGroupId(),
                                     employeeWorkGroupEntity.getEmployeeId(),
                                     employeeWorkGroupId});
        return true;
    }


    @Override
    public boolean addNewEmployeeWorkGroup(EmployeeWorkGroupEntity employeeWorkGroupEntity){
        jdbcTemplate.update("INSERT INTO TAM_EMPLOYEE_WORK_GROUP (EWG_NAME, WGP_CREATE_DATE, EMPLOYEE_ID, DEPARTMENT_ID) " +
                                "VALUES(?,?)",
                                 new Object[]{employeeWorkGroupEntity.getWorkGroupId(),
                                     employeeWorkGroupEntity.getEmployeeId()});

        return true;
    }

    @Override
    public void deleteEmployeeWorkGroup(EmployeeWorkGroupId employeeWorkGroupId){
        jdbcTemplate.update("DELETE FROM TAM_EMPLOYEE_WORK_GROUP WHERE EWG_ID = ?",new Object[]{employeeWorkGroupId.getId()});
    }

}
