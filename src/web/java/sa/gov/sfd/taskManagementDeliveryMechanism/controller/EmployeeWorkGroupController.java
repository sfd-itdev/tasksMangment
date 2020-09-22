package sa.gov.sfd.taskManagementDeliveryMechanism.controller;


import org.springframework.web.bind.annotation.*;
import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.EmployeeWorkGroupConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.EmployeeWorkGroupViewModel;
import sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup.*;


import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/taskManagement/employeeWorkGroup")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeWorkGroupController {

    @Inject
    private GetAllEmployeeWorkGroups getAllEmployeeWorkGroups;
    @Inject
    private AddNewEmployeeWorkGroup addNewEmployeeWorkGroup;
    @Inject
    private UpdateEmployeeWorkGroup updateEmployeeWorkGroup;
    @Inject
    private DeleteEmployeeWorkGroup deleteEmployeeWorkGroup;
    @Inject
    private GetOneEmployeeWorkGroupByEmployeeWorkGroupId getOneEmployeeWorkGroupByEmployeeWorkGroupId;


    @GetMapping("/employeeWorkGroups")
    public List<EmployeeWorkGroupViewModel> getAllEmployeeWorkGroups() {
        return EmployeeWorkGroupConverter.convertEmployeeWorkGroupEntitiesList(this.getAllEmployeeWorkGroups.getAllEmployeeWorkGroups());
    }

    @GetMapping("/getOneEmployeeWorkGroupByEmployeeWorkGroupId/{employeeWorkGroupId}")
    public EmployeeWorkGroupViewModel getOneEmployeeWorkGroupByEmployeeWorkGroupId(@PathVariable long employeeWorkGroupId)  {
        // return UnitConverter.convertUnitEntitiesList(this.getOneUnitByUnitId(unitId));
        return getOneEmployeeWorkGroupByEmployeeWorkGroupId(employeeWorkGroupId);
    }


    @PostMapping("/addEmployeeWorkGroup")
    public void addEmployeeWorkGroup(@RequestBody EmployeeWorkGroupViewModel employeeWorkGroupViewModel){
        this.addNewEmployeeWorkGroup.addNewEmployeeWorkGroup(EmployeeWorkGroupConverter.convertEmployeeWorkGroupViewModel(employeeWorkGroupViewModel));
    }


    @PutMapping("/updateEmployeeWorkGroup/{employeeWorkGroupId}")
    public void updateEmployeeWorkGroup(@PathVariable Long employeeWorkGroupId, @RequestBody EmployeeWorkGroupViewModel employeeWorkGroupViewModel){
        this.updateEmployeeWorkGroup.updateEmployeeWorkGroup(employeeWorkGroupId,EmployeeWorkGroupConverter.convertEmployeeWorkGroupViewModel(employeeWorkGroupViewModel));
    }


    @DeleteMapping("/deleteEmployeeWorkGroup/{employeeWorkGroupId}")
    public void deleteEmployeeWorkGroup(@PathVariable long employeeWorkGroupId) {
        System.out.println("0====== " + employeeWorkGroupId);
        this.deleteEmployeeWorkGroup.deleteEmployeeWorkGroup(EmployeeWorkGroupConverter.convertEmployeeWorkGroupId(new EmployeeWorkGroupViewModel(employeeWorkGroupId,null,null)));
    }



}
