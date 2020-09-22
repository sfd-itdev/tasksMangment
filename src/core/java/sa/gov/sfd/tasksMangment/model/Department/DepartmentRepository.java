package sa.gov.sfd.tasksMangment.model.Department;


import java.util.List;

public interface DepartmentRepository {


    //************************* SELECT Operations **************************************************
    List <DepartmentEntity> getAllDepartments();
    DepartmentEntity getOneDepartmentByDepartmentId (DepartmentId departmentId);


    //************************* UPDATE Operations **************************************************
    boolean updateDepartment (long departmentId, DepartmentEntity departmentEntity);

    //************************* INSERT Operations **************************************************
    boolean addNewDepartment (DepartmentEntity departmentEntity);


    //************************* DELETE Operations **************************************************
    void deleteDepartment (DepartmentId departmentId);

}
