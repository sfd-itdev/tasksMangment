package sa.gov.sfd.tasksMangment.actions.WorkGroup;


import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;

@Service
public class DeleteWorkGroup {
    private WorkGroupService workGroupService;

    public DeleteWorkGroup(WorkGroupService workGroupService) {
        this.workGroupService = workGroupService;
    }

    public boolean deleteWorkGroup(WorkGroupId workGroupId){
        System.out.println("1===Not deleted yet=== *" + workGroupId);
        this.workGroupService.deleteWorkGroup(workGroupId);
        System.out.println("2===Deleted now=== *" + workGroupId);
        return true;
    }

}
