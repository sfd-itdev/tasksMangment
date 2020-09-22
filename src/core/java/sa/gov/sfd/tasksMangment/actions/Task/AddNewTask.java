package sa.gov.sfd.tasksMangment.actions.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Task.*;

@Service
public class AddNewTask {

    private TaskService taskService;

    @Autowired
    public AddNewTask(TaskService taskService) {
        this.taskService = taskService;
    }

    public boolean addNewTask (TaskEntity taskEntity){
        this.taskService.addNewTask(taskEntity);
        return true;
    }

}
