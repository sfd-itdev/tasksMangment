package sa.gov.sfd.tasksMangment.actions.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Employee.*;
import sa.gov.sfd.tasksMangment.model.Task.TaskEntity;

@Service
public class UpdateEmployee {

    private EmployeeService employeeService;

    @Autowired
    public UpdateEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public boolean updateEmployee (long employeeId, EmployeeEntity employeeEntity){
        employeeService.updateEmployee(employeeId, employeeEntity);
        return true;
    }
}
