package sa.gov.sfd.tasksMangment.actions.AssignTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.AssignTask.*;

import java.util.List;

@Service
public class GetAllAssignTasks {

    private AssignTaskService assignTaskService;

    @Autowired
    public GetAllAssignTasks(AssignTaskService assignTaskService) {
        this.assignTaskService = assignTaskService;
    }

    public List<AssignTaskEntity> getAllAssignTasks() {
        return assignTaskService.getAllAssignTasks();
    }

}
