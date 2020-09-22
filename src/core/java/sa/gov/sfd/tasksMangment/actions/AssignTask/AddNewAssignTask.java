package sa.gov.sfd.tasksMangment.actions.AssignTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.AssignTask.*;

@Service
public class AddNewAssignTask {

    private AssignTaskService assignTaskService;

    @Autowired
    public AddNewAssignTask(AssignTaskService assignTaskService) {
        this.assignTaskService = assignTaskService;
    }

    public boolean addNewAssignTask (AssignTaskEntity assignTaskEntity){
        assignTaskService.addNewAssignTask(assignTaskEntity);
        return true;
    }
}
