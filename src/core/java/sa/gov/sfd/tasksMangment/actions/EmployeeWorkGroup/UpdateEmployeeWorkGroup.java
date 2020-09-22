package sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.*;

@Service
public class UpdateEmployeeWorkGroup {

    private EmployeeWorkGroupService employeeWorkGroupService;

    @Autowired
    public UpdateEmployeeWorkGroup(EmployeeWorkGroupService employeeWorkGroupService) {
        this.employeeWorkGroupService = employeeWorkGroupService;
    }

    public boolean updateEmployeeWorkGroup (long employeeWorkGroupId, EmployeeWorkGroupEntity employeeWorkGroupEntity){
        employeeWorkGroupService.updateEmployeeWorkGroup(employeeWorkGroupId, employeeWorkGroupEntity);
        return  true;
    }

}
