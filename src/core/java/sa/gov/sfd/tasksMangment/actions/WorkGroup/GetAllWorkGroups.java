package sa.gov.sfd.tasksMangment.actions.WorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;

import java.util.List;

@Service
public class GetAllWorkGroups {

    private WorkGroupService workGroupService;

    @Autowired
    public GetAllWorkGroups(WorkGroupService workGroupService) {
        this.workGroupService = workGroupService;
    }

    public List<WorkGroupEntity> getAllWorkGroups() {
        return workGroupService.getAllWorkGroups();
    }
}
