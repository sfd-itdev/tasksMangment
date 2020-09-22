package sa.gov.sfd.tasksMangment.actions.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Department.*;

import java.util.List;

@Service
public class GetAllDepartments {

    private DepartmentService departmentService;

    @Autowired
    public GetAllDepartments(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public List<DepartmentEntity> getAllDepartments() {
        return departmentService.getAllDepartment();
    }

}
