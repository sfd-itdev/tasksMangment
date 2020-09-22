package sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations;

import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.DepartmentMapper;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentEntity;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;


import java.util.List;

public class DepartmentRepositoryImpl implements sa.gov.sfd.tasksMangment.model.Department.DepartmentRepository {

    private JdbcTemplate jdbcTemplate;
    public DepartmentRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<DepartmentEntity> getAllDepartments(){
        return jdbcTemplate.query("SELECT * FROM TAM_DEPARTMENT", new DepartmentMapper());
    }

    @Override
    public DepartmentEntity getOneDepartmentByDepartmentId (DepartmentId departmentId){
        return jdbcTemplate.queryForObject("SELECT * FROM TAM_DEPARTMENT WHERE DEP_ID = ?",
                new Object[]{departmentId.getId()}, new DepartmentMapper());
    }


    @Override
    public boolean updateDepartment (long departmentId, DepartmentEntity departmentEntity){
        jdbcTemplate.update("UPDATE TAM_DEPARTMENT SET  DEP_NAME= ?,  DEP_NUMBER= ?, " +
                                " WHERE DEP_ID = ?",
                                  new Object[]{departmentEntity.getDepartmentName(),
                                  departmentEntity.getDepartmentNumber(),
                                  departmentId});
        return true;
    }


    @Override
    public boolean addNewDepartment(DepartmentEntity departmentEntity){
        jdbcTemplate.update("INSERT INTO TAM_DEPARTMENT (DEP_NAME, DEP_NUMBER) " +
                                "VALUES(?,?)",
                                 new Object[]{departmentEntity.getDepartmentName(),
                                 departmentEntity.getDepartmentNumber()});
        return true;
    }

    @Override
    public void deleteDepartment(DepartmentId departmentId){
        jdbcTemplate.update("DELETE FROM TAM_DEPARTMENT WHERE DEP_ID = ?",new Object[]{departmentId.getId()});
    }

}
