package sa.gov.sfd.tasksMangment.actions.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Task.*;

@Service
public class DeleteTask {

    private TaskService taskService;

    @Autowired
    public DeleteTask(TaskService taskService) {
        this.taskService = taskService;
    }

    public boolean deleteTask (TaskId taskId){
        System.out.println("1===Not deleted yet=== *" + taskId);
        this.taskService.deleteTask(taskId);
        System.out.println("2===Deleted now=== *" + taskId);
        return true;
    }

}
