package sa.gov.sfd.tasksMangment.model.WorkGroup;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkGroupService {

    private final WorkGroupRepository workGroupRepository;


    @Autowired
    public WorkGroupService(WorkGroupRepository workGroupRepository) {
        this.workGroupRepository = workGroupRepository;
    }


    public List <WorkGroupEntity> getAllWorkGroups (){
        return workGroupRepository.getAllWorkGroups();
    }
    public WorkGroupEntity getOneWorkGroupByWorkGroupId (WorkGroupId workGroupId){
        return workGroupRepository.getOneWorkGroupByWorkGroupId(workGroupId);
    }



    public void updateWorkGroup (long workGroupId, WorkGroupEntity workGroupEntity){
        workGroupRepository.updateWorkGroup(workGroupId, workGroupEntity);
    }
    public void addNewWorkGroup (WorkGroupEntity workGroupEntity){
         workGroupRepository.addNewWorkGroup(workGroupEntity);
    }
    public void deleteWorkGroup (WorkGroupId workGroupId){
        workGroupRepository.deleteWorkGroup(workGroupId);
    }

}
