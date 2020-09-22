package sa.gov.sfd.tasksMangment.actions.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Task.*;


@Service
public class GetOneTaskByTaskId {

    private TaskService taskService;

    @Autowired
    public GetOneTaskByTaskId(TaskService taskService) {
        this.taskService = taskService;
    }

    public TaskEntity getOneTaskByTaskId (TaskId taskId){
        return taskService.getOneTaskByTaskId(taskId);
    }

}
