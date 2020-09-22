package sa.gov.sfd.tasksMangment.actions.AssignTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.AssignTask.*;

@Service
public class DeleteAssignTask {

    private AssignTaskService assignTaskService;

    @Autowired
    public DeleteAssignTask(AssignTaskService assignTaskService) {
        this.assignTaskService = assignTaskService;
    }

    public boolean deleteAssignTask (AssignTaskId assignTaskId){
        System.out.println("1===Not deleted yet=== *" + assignTaskId);
        assignTaskService.deleteAssignTask(assignTaskId);
        System.out.println("2===Deleted now=== *" + assignTaskId);
        return true;
    }
}
