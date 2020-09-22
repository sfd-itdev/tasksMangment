package sa.gov.sfd.tasksMangment.model.WorkGroup;

import java.util.List;


public interface WorkGroupRepository {


//************************* SELECT Operations **************************************************

    List <WorkGroupEntity> getAllWorkGroups();

    WorkGroupEntity getOneWorkGroupByWorkGroupId(WorkGroupId workGroupId);


 //************************* UPDATE Operations **************************************************

    boolean updateWorkGroup (long workGroupId, WorkGroupEntity workGroupEntity);

 //************************* INSERT Operations **************************************************

    boolean addNewWorkGroup (WorkGroupEntity workGroupEntity);

 //************************* DELETE Operations **************************************************

    void deleteWorkGroup (WorkGroupId workGroupId);
}
