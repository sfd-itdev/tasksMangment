package sa.gov.sfd.tasksMangment.actions.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Task.*;

@Service
public class UpdateTask {

    private TaskService taskService;

    @Autowired
    public UpdateTask(TaskService taskService) {
        this.taskService = taskService;
    }

    public boolean updateTask (long taskId, TaskEntity taskEntity){
        taskService.updateTask(taskId, taskEntity);
        return true;
    }

}
