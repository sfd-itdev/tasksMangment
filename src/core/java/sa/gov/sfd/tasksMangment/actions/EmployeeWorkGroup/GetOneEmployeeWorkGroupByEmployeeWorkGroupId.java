package sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.*;

@Service
public class GetOneEmployeeWorkGroupByEmployeeWorkGroupId {

    private EmployeeWorkGroupService employeeWorkGroupService;

    @Autowired
    public GetOneEmployeeWorkGroupByEmployeeWorkGroupId(EmployeeWorkGroupService employeeWorkGroupService) {
        this.employeeWorkGroupService = employeeWorkGroupService;
    }

    public EmployeeWorkGroupEntity getOneEmployeeWorkGroupByEmployeeWorkGroupId (EmployeeWorkGroupId employeeWorkGroupId){
        return employeeWorkGroupService.getOneEmployeeWorkGroupByEmpWorkGrpId(employeeWorkGroupId);
    }

}
