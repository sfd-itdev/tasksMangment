package sa.gov.sfd.tasksMangment.model.AssignTask;


import sa.gov.sfd.tasksMangment.model.Task.TaskEntity;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;

import java.util.List;

public interface AssignTaskRepository {

    //************************* SELECT Operations **************************************************
    List<AssignTaskEntity> getAllAssignTasks();
    AssignTaskEntity getOneAssignTaskByAssignTaskId (AssignTaskId assignTaskId);

    //************************* UPDATE Operations **************************************************
    boolean updateAssignTask (long AssignTaskId, AssignTaskEntity assignTaskEntity);

    //************************* INSERT Operations **************************************************
    boolean addNewAssignTask (AssignTaskEntity assignTaskEntity);

    //************************* DELETE Operations **************************************************
    void deleteAssignTask (AssignTaskId assignTaskId);

}
