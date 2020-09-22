package sa.gov.sfd.tasksMangment.actions.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Employee.*;

@Service
public class AddNewEmployee {

    private EmployeeService employeeService;

    @Autowired
    public AddNewEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public boolean addNewEmployee(EmployeeEntity employeeEntity){
        employeeService.addNewEmployee(employeeEntity);
        return true;
    }

}
