package sa.gov.sfd.taskManagementDeliveryMechanism.controller;


import org.springframework.web.bind.annotation.*;
import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.AssignTaskConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.WorkGroupConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.AssignTaskViewModel;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.WorkGroupViewModel;
import sa.gov.sfd.tasksMangment.actions.AssignTask.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/taskManagement/assignTask")
@CrossOrigin(origins = "http://localhost:4200")
public class AssignTaskController {

    @Inject
    private GetAllAssignTasks getAllAssignTasks;
    @Inject
    private AddNewAssignTask addNewAssignTask;
    @Inject
    private UpdateAssignTask updateAssignTask;
    @Inject
    private DeleteAssignTask deleteAssignTask;
    @Inject
    private GetOneAssignTaskByAssignTaskId getOneAssignTaskByAssignTaskId;


    @GetMapping("/assignTasks")
    public List<AssignTaskViewModel> getAllAssignTasks() {
        return AssignTaskConverter.convertAssignTaskEntitiesList(this.getAllAssignTasks.getAllAssignTasks());
    }

    @GetMapping("/getOneAssignTaskByAssignTaskId/{assignTaskId}")
    public AssignTaskViewModel getOneAssignTaskByAssignTaskId(@PathVariable long assignTaskId)  {
        // return UnitConverter.convertUnitEntitiesList(this.getOneUnitByUnitId(unitId));
        return getOneAssignTaskByAssignTaskId(assignTaskId);
    }


    @PostMapping("/addAssignTask")
    public void addAssignTask(@RequestBody AssignTaskViewModel assignTaskViewModel){
        this.addNewAssignTask.addNewAssignTask(AssignTaskConverter.convertAssignTaskViewModel(assignTaskViewModel));
    }


    @PutMapping("/updateAssignTask/{assignTaskId}")
    public void updateAssignTask(@PathVariable Long assignTaskId, @RequestBody AssignTaskViewModel assignTaskViewModel){
        this.updateAssignTask.updateAssignTask(assignTaskId,AssignTaskConverter.convertAssignTaskViewModel(assignTaskViewModel));
    }


    @DeleteMapping("/deleteAssignTask/{assignTaskId}")
    public void deleteAssignTask(@PathVariable long assignTaskId) {
        System.out.println("0====== " + assignTaskId);
        this.deleteAssignTask.deleteAssignTask(AssignTaskConverter.convertAssignTaskId(new AssignTaskViewModel(assignTaskId,null,null,null)));
    }


}
