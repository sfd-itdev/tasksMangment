package sa.gov.sfd.taskManagementDeliveryMechanism.controller;


import org.springframework.web.bind.annotation.*;
import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.EmployeeConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.EmployeeViewModel;
import sa.gov.sfd.tasksMangment.actions.Employee.*;


import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/taskManagement/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Inject
    private GetAllEmployees getAllEmployees;
    @Inject
    private AddNewEmployee addNewEmployee;
    @Inject
    private UpdateEmployee updateEmployee;
    @Inject
    private DeleteEmployee deleteEmployee;
    @Inject
    private GetOneEmployeeByEmployeeId getOneEmployeeByEmployeeId;


    @GetMapping("/employees")
    public List<EmployeeViewModel> getAllEmployees() {
        return EmployeeConverter.convertEmployeeEntitiesList(this.getAllEmployees.getAllEmployees());
    }

    @GetMapping("/getOneEmployeeByEmployeeId/{employeeId}")
    public EmployeeViewModel getOneEmployeeByEmployeeId(@PathVariable long employeeId)  {
        // return UnitConverter.convertUnitEntitiesList(this.getOneUnitByUnitId(unitId));
        return getOneEmployeeByEmployeeId(employeeId);
    }


    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody EmployeeViewModel employeeViewModel){
        this.addNewEmployee.addNewEmployee(EmployeeConverter.convertEmployeeViewModel(employeeViewModel));
    }


    @PutMapping("/updateEmployee/{employeeId}")
    public void updateEmployee(@PathVariable Long employeeId, @RequestBody EmployeeViewModel employeeViewModel){
        this.updateEmployee.updateEmployee(employeeId,EmployeeConverter.convertEmployeeViewModel(employeeViewModel));
    }


    @DeleteMapping("/deleteEmployee/{employeeId}")
    public void deleteEmployee(@PathVariable long employeeId) {
        System.out.println("0====== " + employeeId);
        this.deleteEmployee.deleteEmployee(EmployeeConverter.convertEmployeeId(new EmployeeViewModel(employeeId,null,null)));
    }


}
