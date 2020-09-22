package sa.gov.sfd.tasksMangment.model.AssignTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignTaskService {

    private final AssignTaskRepository assignTaskRepository;


    @Autowired
    public AssignTaskService(AssignTaskRepository assignTaskRepository) {
        this.assignTaskRepository = assignTaskRepository;
    }

    public List <AssignTaskEntity> getAllAssignTasks(){
        return assignTaskRepository.getAllAssignTasks();
    }

    public AssignTaskEntity getOneAssignTaskByAssignTaskId (AssignTaskId assignTaskId){
        return assignTaskRepository.getOneAssignTaskByAssignTaskId(assignTaskId);
    }

    public void updateAssignTask (long assignTask, AssignTaskEntity assignTaskEntity){
        assignTaskRepository.updateAssignTask(assignTask, assignTaskEntity);
    }

    public void addNewAssignTask (AssignTaskEntity assignTaskEntity){
        assignTaskRepository.addNewAssignTask(assignTaskEntity);
    }

    public void deleteAssignTask (AssignTaskId assignTaskId){
        assignTaskRepository.deleteAssignTask(assignTaskId);
    }
}
