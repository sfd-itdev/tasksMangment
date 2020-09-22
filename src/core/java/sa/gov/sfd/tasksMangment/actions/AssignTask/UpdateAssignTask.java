package sa.gov.sfd.tasksMangment.actions.AssignTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.AssignTask.*;

@Service
public class UpdateAssignTask {

    private AssignTaskService assignTaskService;

    @Autowired
    public UpdateAssignTask(AssignTaskService assignTaskService) {
        this.assignTaskService = assignTaskService;
    }

    public boolean updateAssignTask (long assignTaskId, AssignTaskEntity assignTaskEntity){
        assignTaskService.updateAssignTask(assignTaskId, assignTaskEntity);
        return true;
    }
}
