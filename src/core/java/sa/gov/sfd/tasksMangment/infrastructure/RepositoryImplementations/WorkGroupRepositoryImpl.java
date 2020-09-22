package sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations;

import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.WorkGroupMapper;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;

import java.util.List;


public class WorkGroupRepositoryImpl implements sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupRepository {

    private JdbcTemplate jdbcTemplate;
    public WorkGroupRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List <WorkGroupEntity> getAllWorkGroups(){
        return jdbcTemplate.query("SELECT * FROM TAM_WORK_GROUP", new WorkGroupMapper());
    }

    @Override
    public WorkGroupEntity getOneWorkGroupByWorkGroupId (WorkGroupId workGroupId){
        return jdbcTemplate.queryForObject("SELECT * FROM TAM_WORK_GROUP WHERE WGP_ID = ?",
                                               new Object[]{workGroupId.getId()}, new WorkGroupMapper());
    }


    @Override
    public boolean updateWorkGroup (long workGroupId, WorkGroupEntity workGroupEntity){
        jdbcTemplate.update("UPDATE TAM_WORK_GROUP SET  WGP_NAME= ?,  WGP_CREATE_DATE= ?, " +
                                "EMPLOYEE_ID=?, DEPARTMENT=? WHERE WGP_ID = ?",
                                 new Object[]{workGroupEntity.getWorkGroupName(),
                                              workGroupEntity.getWorkGroupCreateDate(),
                                              workGroupEntity.getCreateByEmployeeId(),
                                              workGroupEntity.getDepartmentId(),
                                              workGroupId});
        return true;
    }


    @Override
    public boolean addNewWorkGroup(WorkGroupEntity workGroupEntity){
        jdbcTemplate.update("INSERT INTO TAM_WORK_GROUP (WGP_NAME, WGP_CREATE_DATE, EMPLOYEE_ID, DEPARTMENT_ID) " +
                                "VALUES(?,?,?,?)",
                                 new Object[]{workGroupEntity.getWorkGroupName(),
                                              workGroupEntity.getWorkGroupCreateDate(),
                                              workGroupEntity.getCreateByEmployeeId(),
                                              workGroupEntity.getDepartmentId()});
        return true;
    }

    @Override
    public void deleteWorkGroup(WorkGroupId workGroupId){
        jdbcTemplate.update("DELETE FROM TAM_WORK_GROUP WHERE WGP_ID = ?",new Object[]{workGroupId.getId()});
    }
}
