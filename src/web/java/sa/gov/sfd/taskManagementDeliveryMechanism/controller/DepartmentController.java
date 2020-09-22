package sa.gov.sfd.taskManagementDeliveryMechanism.controller;


import org.springframework.web.bind.annotation.*;

import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.DepartmentConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.DepartmentViewModel;
import sa.gov.sfd.tasksMangment.actions.Department.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/taskManagement/department")
@CrossOrigin(origins = "http://localhost:4200")
public class DepartmentController {

    @Inject
    private GetAllDepartments getAllDepartments;
    @Inject
    private AddNewDepartment addNewDepartment;
    @Inject
    private UpdateDepartment updateDepartment;
    @Inject
    private DeleteDepartment deleteDepartment;
    @Inject
    private GetOneDepartmentByDepartmentId getOneDepartmentByDepartmentId;


    @GetMapping("/departments")
    public List<DepartmentViewModel> getAllDepartments() {
        return DepartmentConverter.convertDepartmentEntitiesList(this.getAllDepartments.getAllDepartments());
    }

    @GetMapping("/getOneDepartmentByDepartmentId/{departmentId}")
    public DepartmentViewModel getOneDepartmentByDepartmentId(@PathVariable long departmentId)  {
        // return UnitConverter.convertUnitEntitiesList(this.getOneUnitByUnitId(unitId));
        return getOneDepartmentByDepartmentId(departmentId);
    }


    @PostMapping("/addDepartment")
    public void addDepartment(@RequestBody DepartmentViewModel departmentViewModel){
        this.addNewDepartment.addNewDepartment(DepartmentConverter.convertDepartmentViewModel(departmentViewModel));
    }


    @PutMapping("/updateDepartment/{departmentId}")
    public void updateDepartment(@PathVariable Long departmentId, @RequestBody DepartmentViewModel departmentViewModel){
        this.updateDepartment.updateDepartment(departmentId,DepartmentConverter.convertDepartmentViewModel(departmentViewModel));
    }


    @DeleteMapping("/deleteDepartment/{departmentId}")
    public void deleteDepartment(@PathVariable long departmentId) {
        System.out.println("0====== " + departmentId);
        this.deleteDepartment.deleteDepartment(DepartmentConverter.convertDepartmentId(new DepartmentViewModel(departmentId,null,null)));
    }



}
