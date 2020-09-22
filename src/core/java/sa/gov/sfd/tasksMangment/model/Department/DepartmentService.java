package sa.gov.sfd.tasksMangment.model.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<DepartmentEntity> getAllDepartment(){
        return departmentRepository.getAllDepartments();
    }

    public DepartmentEntity getOneDepartmentByDepartmentId (DepartmentId departmentId){
        return departmentRepository.getOneDepartmentByDepartmentId(departmentId);
    }

    public void updateDepartment (long departmentId, DepartmentEntity departmentEntity){
        departmentRepository.updateDepartment(departmentId, departmentEntity);
    }

    public void addNewDepartment (DepartmentEntity departmentEntity){
        departmentRepository.addNewDepartment(departmentEntity);
    }

    public void deleteDepartment (DepartmentId departmentId){
        departmentRepository.deleteDepartment(departmentId);
    }
}
