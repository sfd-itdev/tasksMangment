package sa.gov.sfd.tasksMangment.actions.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.gov.sfd.tasksMangment.model.Employee.*;

import java.util.List;

@Service
public class GetAllEmployees {

    private EmployeeService employeeService;

    @Autowired
    public GetAllEmployees(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}
