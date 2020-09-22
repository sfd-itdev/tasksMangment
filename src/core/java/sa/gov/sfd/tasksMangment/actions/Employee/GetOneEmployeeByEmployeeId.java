package sa.gov.sfd.tasksMangment.actions.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Employee.*;


@Service
public class GetOneEmployeeByEmployeeId {

    private EmployeeService employeeService;

    @Autowired
    public GetOneEmployeeByEmployeeId(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeEntity getOneEmployeeByEmployeeId (EmployeeId employeeId){
        return employeeService.getOneEmployeeByEmployeeId(employeeId);
    }

}
