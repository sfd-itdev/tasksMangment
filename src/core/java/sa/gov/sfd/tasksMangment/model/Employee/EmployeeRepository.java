package sa.gov.sfd.tasksMangment.model.Employee;


import java.util.List;

public interface EmployeeRepository {

    //************************* SELECT Operations **************************************************
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity getOneEmployeeByEmployeeId (EmployeeId employeeId);


    //************************* UPDATE Operations **************************************************
    boolean updateEmployee (long EmployeeId, EmployeeEntity employeeEntity);


    //************************* INSERT Operations **************************************************
    boolean addNewEmployee (EmployeeEntity employeeEntity);


    //************************* DELETE Operations **************************************************
    void deleteEmployee (EmployeeId employeeId);


}
