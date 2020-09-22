package sa.gov.sfd.tasksMangment.actions.AssignTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.AssignTask.*;


@Service
public class GetOneAssignTaskByAssignTaskId {

    private AssignTaskService assignTaskService;

    @Autowired
    public GetOneAssignTaskByAssignTaskId(AssignTaskService assignTaskService) {
        this.assignTaskService = assignTaskService;
    }

    public AssignTaskEntity getOneAssignTaskByAssignTaskId (AssignTaskId assignTaskId){
        return assignTaskService.getOneAssignTaskByAssignTaskId(assignTaskId);
    }
}
