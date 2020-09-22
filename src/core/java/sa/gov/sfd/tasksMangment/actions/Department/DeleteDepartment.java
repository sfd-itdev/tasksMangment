package sa.gov.sfd.tasksMangment.actions.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Department.*;

@Service
public class DeleteDepartment {

    private DepartmentService departmentService;

    @Autowired
    public DeleteDepartment(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public boolean deleteDepartment (DepartmentId departmentId){
        System.out.println("1===Not deleted yet=== *" + departmentId);
        this.departmentService.deleteDepartment(departmentId);
        System.out.println("2===Deleted now=== *" + departmentId);
        return true;
    }
}
