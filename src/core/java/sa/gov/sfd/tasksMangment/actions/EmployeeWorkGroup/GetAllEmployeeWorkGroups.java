package sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.*;

import java.util.List;

@Service
public class GetAllEmployeeWorkGroups {

    private EmployeeWorkGroupService employeeWorkGroupService;

    @Autowired
    public GetAllEmployeeWorkGroups(EmployeeWorkGroupService employeeWorkGroupService) {
        this.employeeWorkGroupService = employeeWorkGroupService;
    }

    public List<EmployeeWorkGroupEntity> getAllEmployeeWorkGroups(){
        return employeeWorkGroupService.getAllEmployeeWorkGroups();
    }

}
