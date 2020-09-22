package sa.gov.sfd.tasksMangment.model.Task;


import java.util.List;

public interface TaskRepository {


    //************************* SELECT Operations **************************************************
    List<TaskEntity> getAllTasks();
    TaskEntity getOneTaskByTaskId (TaskId taskId);


    //************************* UPDATE Operations **************************************************
    boolean updateTask (long taskId, TaskEntity taskEntity);


    //************************* INSERT Operations **************************************************
    boolean addNewTask (TaskEntity taskEntity);


    //************************* DELETE Operations **************************************************
    void deleteTask (TaskId taskId);

}
