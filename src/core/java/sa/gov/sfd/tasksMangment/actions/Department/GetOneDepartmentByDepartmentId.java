package sa.gov.sfd.tasksMangment.actions.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Department.*;

@Service
public class GetOneDepartmentByDepartmentId {

    private DepartmentService departmentService;

    @Autowired
    public GetOneDepartmentByDepartmentId(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public DepartmentEntity getOneDepartmentByDepartmentId (DepartmentId departmentId){
        return departmentService.getOneDepartmentByDepartmentId(departmentId);
    }
}
