package sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup;


import java.util.List;

public interface EmployeeWorkGroupRepository {

    //************************* SELECT Operations **************************************************
    List<EmployeeWorkGroupEntity> getAllEmployeeWorkGroups();
    EmployeeWorkGroupEntity getOneEmployeeWorkGroupByEmpWorkGrpId (EmployeeWorkGroupId employee);

    //************************* UPDATE Operations **************************************************
    boolean updateEmployeeWorkGroup (long EmployeeWorkGroupId, EmployeeWorkGroupEntity employeeWorkGroupEntity);


    //************************* INSERT Operations **************************************************
    boolean addNewEmployeeWorkGroup (EmployeeWorkGroupEntity employeeWorkGroupEntity);


    //************************* DELETE Operations **************************************************
    void deleteEmployeeWorkGroup (EmployeeWorkGroupId employeeWorkGroupId);

}
