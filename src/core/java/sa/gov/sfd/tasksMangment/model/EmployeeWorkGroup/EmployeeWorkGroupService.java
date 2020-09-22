package sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeWorkGroupService {


    private final EmployeeWorkGroupRepository employeeWorkGroupRepository;


    @Autowired
    public EmployeeWorkGroupService(EmployeeWorkGroupRepository employeeWorkGroupRepository) {
        this.employeeWorkGroupRepository = employeeWorkGroupRepository;
    }



    public List<EmployeeWorkGroupEntity> getAllEmployeeWorkGroups(){
        return employeeWorkGroupRepository.getAllEmployeeWorkGroups();
    }

    public EmployeeWorkGroupEntity getOneEmployeeWorkGroupByEmpWorkGrpId(EmployeeWorkGroupId employeeWorkGroupId){
        return employeeWorkGroupRepository.getOneEmployeeWorkGroupByEmpWorkGrpId(employeeWorkGroupId);
    }



    public void updateEmployeeWorkGroup (long employeeWorkGroupId, EmployeeWorkGroupEntity employeeWorkGroupEntity){
        employeeWorkGroupRepository.updateEmployeeWorkGroup(employeeWorkGroupId, employeeWorkGroupEntity);
    }

    public void addNewEmployeeWorkGroup (EmployeeWorkGroupEntity employeeWorkGroupEntity){
        employeeWorkGroupRepository.addNewEmployeeWorkGroup(employeeWorkGroupEntity);
    }

    public void deleteEmployeeWorkGroup (EmployeeWorkGroupId employeeWorkGroupId){
        employeeWorkGroupRepository.deleteEmployeeWorkGroup(employeeWorkGroupId);
    }

}
