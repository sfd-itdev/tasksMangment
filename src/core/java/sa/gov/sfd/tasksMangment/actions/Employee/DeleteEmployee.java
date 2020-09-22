package sa.gov.sfd.tasksMangment.actions.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Employee.*;

@Service
public class DeleteEmployee {

    private EmployeeService employeeService;

    @Autowired
    public DeleteEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public boolean deleteEmployee (EmployeeId employeeId){
        System.out.println("1===Not deleted yet=== *" + employeeId);
        this.employeeService.deleteEmployee(employeeId);
        System.out.println("2===Deleted now=== *" + employeeId);
        return true;
    }
}
