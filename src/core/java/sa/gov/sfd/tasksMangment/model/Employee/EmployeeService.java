package sa.gov.sfd.tasksMangment.model.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    public List<EmployeeEntity> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }

    public EmployeeEntity getOneEmployeeByEmployeeId (EmployeeId employeeId){
        return employeeRepository.getOneEmployeeByEmployeeId(employeeId);
    }



    public void updateEmployee (long employeeId, EmployeeEntity employeeEntity){
        employeeRepository.updateEmployee(employeeId, employeeEntity);
    }

    public void addNewEmployee (EmployeeEntity employeeEntity){
        employeeRepository.addNewEmployee(employeeEntity);
    }

    public void deleteEmployee (EmployeeId employeeId){
        employeeRepository.deleteEmployee(employeeId);
    }

}
