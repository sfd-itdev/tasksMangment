package sa.gov.sfd.tasksMangment.actions.WorkGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;


@Service
public class AddNewWorkGroup {

    private WorkGroupService workGroupService;

    @Autowired
    public AddNewWorkGroup(WorkGroupService workGroupService){
       this.workGroupService = workGroupService;
    }


    public boolean addNewWorkGroup (WorkGroupEntity workGroupEntity){
        this.workGroupService.addNewWorkGroup(workGroupEntity);
        return true;
    }

}
