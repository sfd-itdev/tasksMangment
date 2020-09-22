package sa.gov.sfd.tasksMangment.actions.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Department.*;

@Service
public class AddNewDepartment {

    private DepartmentService departmentService;

    @Autowired
    public AddNewDepartment(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public boolean addNewDepartment (DepartmentEntity departmentEntity){
        departmentService.addNewDepartment(departmentEntity);
        return true;
    }
}
