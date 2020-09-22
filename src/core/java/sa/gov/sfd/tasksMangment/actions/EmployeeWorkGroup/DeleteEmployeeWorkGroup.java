package sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.*;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;

@Service
public class DeleteEmployeeWorkGroup {

    private EmployeeWorkGroupService employeeWorkGroupService;

    @Autowired
    public DeleteEmployeeWorkGroup(EmployeeWorkGroupService employeeWorkGroupService) {
        this.employeeWorkGroupService = employeeWorkGroupService;
    }

    public boolean deleteEmployeeWorkGroup (EmployeeWorkGroupId employeeWorkGroupId){
        System.out.println("1===Not deleted yet=== *" + employeeWorkGroupId);
        this.employeeWorkGroupService.deleteEmployeeWorkGroup(employeeWorkGroupId);
        System.out.println("2===Deleted now=== *" + employeeWorkGroupId);
        return true;
    }

}
