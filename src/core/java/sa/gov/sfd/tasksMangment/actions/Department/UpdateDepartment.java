package sa.gov.sfd.tasksMangment.actions.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Department.*;

@Service
public class UpdateDepartment {

    private DepartmentService departmentService;

    @Autowired
    public UpdateDepartment(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public boolean updateDepartment (long departmentId, DepartmentEntity departmentEntity){
        departmentService.updateDepartment(departmentId, departmentEntity);
        return true;
    }
}
