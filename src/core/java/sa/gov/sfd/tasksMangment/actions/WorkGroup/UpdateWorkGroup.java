package sa.gov.sfd.tasksMangment.actions.WorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;

@Service
public class UpdateWorkGroup {

    private WorkGroupService workGroupService;

    @Autowired
    public UpdateWorkGroup(WorkGroupService workGroupService) {
        this.workGroupService = workGroupService;
    }

    public boolean updateWorkGroup (long workGroupId, WorkGroupEntity workGroupEntity){
        this.workGroupService.updateWorkGroup(workGroupId, workGroupEntity);
        return true;
    }
}
