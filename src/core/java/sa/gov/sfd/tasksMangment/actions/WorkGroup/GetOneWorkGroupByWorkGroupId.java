package sa.gov.sfd.tasksMangment.actions.WorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;


@Service
public class GetOneWorkGroupByWorkGroupId {
    private WorkGroupService workGroupService;

    @Autowired
    public GetOneWorkGroupByWorkGroupId(WorkGroupService workGroupService) {
        this.workGroupService = workGroupService;
    }

    public WorkGroupEntity getOneWorkGroupByWorkGroupId (WorkGroupId workGroupId){
        return workGroupService.getOneWorkGroupByWorkGroupId(workGroupId);
    }
}
