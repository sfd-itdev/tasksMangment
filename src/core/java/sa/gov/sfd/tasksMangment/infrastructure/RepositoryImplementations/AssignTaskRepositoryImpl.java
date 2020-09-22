package sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations;

import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.AssignTaskMapper;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskEntity;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskId;


import java.util.List;

public class AssignTaskRepositoryImpl implements sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskRepository {

    private JdbcTemplate jdbcTemplate;
    public AssignTaskRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<AssignTaskEntity> getAllAssignTasks(){
        return jdbcTemplate.query("SELECT * FROM TAM_ASSIGN_TASK", new AssignTaskMapper());
    }

    @Override
    public AssignTaskEntity getOneAssignTaskByAssignTaskId (AssignTaskId assignTaskId){
        return jdbcTemplate.queryForObject("SELECT * FROM TAM_ASSIGN_TASK WHERE AST_ID = ?",
                new Object[]{assignTaskId.getId()}, new AssignTaskMapper());
    }


    @Override
    public boolean updateAssignTask (long assignTaskId, AssignTaskEntity assignTaskEntity){
        jdbcTemplate.update("UPDATE TAM_ASSIGN_TASK SET  TAS_ID= ?,  AST_ASSIGN_TO= ?, AST_TYPE=? " +
                               " WHERE AST_ID = ?",
                                 new Object[]{assignTaskEntity.getTaskId(),
                                 assignTaskEntity.getAssignTo(),
                                 assignTaskEntity.getType(),
                                 assignTaskId});
        return true;
    }


    @Override
    public boolean addNewAssignTask(AssignTaskEntity assignTaskEntity){
        jdbcTemplate.update("INSERT INTO TAM_ASSIGN_TASK (TAS_ID, AST_ASSIGN_TO, AST_TYPE) " +
                                "VALUES(?,?,?)",
                                 new Object[]{assignTaskEntity.getTaskId(),
                                 assignTaskEntity.getAssignTo(),
                                 assignTaskEntity.getType()});
        return true;
    }

    @Override
    public void deleteAssignTask(AssignTaskId assignTaskId){
        jdbcTemplate.update("DELETE FROM TAM_ASSIGN_TO WHERE AST_ID = ?",new Object[]{assignTaskId.getId()});
    }

}
