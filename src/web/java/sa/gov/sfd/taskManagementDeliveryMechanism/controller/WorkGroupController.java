package sa.gov.sfd.taskManagementDeliveryMechanism.controller;


import org.springframework.web.bind.annotation.*;
import sa.gov.sfd.tasksMangment.actions.WorkGroup.*;
import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.WorkGroupConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.WorkGroupViewModel;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/taskManagement/workGroup")
@CrossOrigin(origins = "http://localhost:4200")
public class WorkGroupController {

    @Inject
    private GetAllWorkGroups getAllWorkGroups;
    @Inject
    private AddNewWorkGroup addNewWorkGroup;
    @Inject
    private UpdateWorkGroup updateWorkGroup;
    @Inject
    private DeleteWorkGroup deleteWorkGroup;
    @Inject
    private GetOneWorkGroupByWorkGroupId getOneWorkGroupByWorkGroupId;



    @GetMapping("/workGroups")
    public List<WorkGroupViewModel> getAllWorkGroups() {
        return WorkGroupConverter.convertWorkGroupEntitiesList(this.getAllWorkGroups.getAllWorkGroups());
    }

    @GetMapping("/getOneWorkGroupByWorkGroupId/{workGroupId}")
    public WorkGroupViewModel getOneWorkGroupByWorkGroupId(@PathVariable long workGroupId)  {
        // return UnitConverter.convertUnitEntitiesList(this.getOneUnitByUnitId(unitId));
        return getOneWorkGroupByWorkGroupId(workGroupId);
    }


    @PostMapping("/addWorkGroup")
    public void addWorkGroup(@RequestBody WorkGroupViewModel workGroupViewModel){
        this.addNewWorkGroup.addNewWorkGroup(WorkGroupConverter.convertWorkGroupViewModel(workGroupViewModel));
    }


    @PutMapping("/updateWorkGroup/{workGroupId}")
    public void updateWorkGroup(@PathVariable Long workGroupId, @RequestBody WorkGroupViewModel workGroupViewModel){
        this.updateWorkGroup.updateWorkGroup(workGroupId,WorkGroupConverter.convertWorkGroupViewModel(workGroupViewModel));
    }


    @DeleteMapping("/deleteWorkGroup/{workGroupId}")
    public void deleteWorkGroup(@PathVariable long workGroupId) {
        System.out.println("0====== " + workGroupId);
        this.deleteWorkGroup.deleteWorkGroup(WorkGroupConverter.convertWorkGroupId(new WorkGroupViewModel(workGroupId,null,null,null,null,null)));
    }
}
