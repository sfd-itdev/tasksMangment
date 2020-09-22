package sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.*;

@Service
public class AddNewEmployeeWorkGroup {

    private EmployeeWorkGroupService employeeWorkGroupService;

    @Autowired
    public AddNewEmployeeWorkGroup(EmployeeWorkGroupService employeeWorkGroupService) {
        this.employeeWorkGroupService = employeeWorkGroupService;
    }

    public boolean addNewEmployeeWorkGroup (EmployeeWorkGroupEntity employeeWorkGroupEntity){
        employeeWorkGroupService.addNewEmployeeWorkGroup(employeeWorkGroupEntity);
        return true;
    }

}
