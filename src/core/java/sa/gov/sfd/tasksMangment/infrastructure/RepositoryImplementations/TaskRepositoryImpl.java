package sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations;

import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.tasksMangment.infrastructure.Mappers.TaskMapper;
import sa.gov.sfd.tasksMangment.model.Task.TaskEntity;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;


import java.util.List;

public class TaskRepositoryImpl implements sa.gov.sfd.tasksMangment.model.Task.TaskRepository{

    private JdbcTemplate jdbcTemplate;
    public TaskRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<TaskEntity> getAllTasks(){
        return jdbcTemplate.query("SELECT * FROM TAM_TASK", new TaskMapper());
    }

    @Override
    public TaskEntity getOneTaskByTaskId (TaskId taskId){
        return jdbcTemplate.queryForObject("SELECT * FROM TAM_TASK WHERE TAS_ID = ?",
                new Object[]{taskId.getId()}, new TaskMapper());
    }


    @Override
    public boolean updateTask (long taskId, TaskEntity taskEntity){
        jdbcTemplate.update("UPDATE TAM_TASK SET  TAS_NAME= ?,  TAS_CREATE_DATE= ?, " +
                                "EMP_ID=?, DEP_ID=?, TAS_DELIVERY_DATE=?, " +
                                "TAS_STATUS=?, TAS_ATTACHMENT " +
                                " WHERE AST_ID = ?",
                                 new Object[]{taskEntity.getTaskName(),
                                 taskEntity.getTaskCreateDate(),
                                 taskEntity.getCreateByEmployeeId(),
                                 taskEntity.getDepartmentId(),
                                 taskEntity.getTaskDeliveryDate(),
                                 taskEntity.getTaskStatus(),
                                 taskEntity.getAttachment(),
                                 taskId});
        return true;
    }


    @Override
    public boolean addNewTask(TaskEntity taskEntity){
        jdbcTemplate.update("INSERT INTO TAM_TASK (TAS_NAME, TAS_CREATE_DATE, EMP_ID, DEP_ID, " +
                                "TAS_DELIVERY_DATE, TAS_STATUS, TAS_ATTACHMENT) " +
                                "VALUES(?,?,?,?,?,?,?)",
                                 new Object[]{taskEntity.getTaskName(),
                                 taskEntity.getTaskCreateDate(),
                                 taskEntity.getCreateByEmployeeId(),
                                 taskEntity.getDepartmentId(),
                                 taskEntity.getTaskDeliveryDate(),
                                 taskEntity.getTaskStatus(),
                                 taskEntity.getAttachment()});
        return true;
    }

    @Override
    public void deleteTask(TaskId taskId){
        jdbcTemplate.update("DELETE FROM TAM_TASK WHERE TAS_ID = ?",new Object[]{taskId.getId()});
    }


}
