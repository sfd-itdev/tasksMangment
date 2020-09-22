package sa.gov.sfd.tasksMangment.actions.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Task.*;

import java.util.List;

@Service
public class GetAllTasks {

    private TaskService taskService;

    @Autowired
    public GetAllTasks(TaskService taskService) {
        this.taskService = taskService;
    }

    public List<TaskEntity> getAllTasks() {
        return taskService.getAllTasks();
    }

}
