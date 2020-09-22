package sa.gov.sfd.tasksMangment.model.Task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

   private final TaskRepository taskRepository;

   @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public List<TaskEntity> getAllTasks(){
       return taskRepository.getAllTasks();
    }

    public TaskEntity getOneTaskByTaskId (TaskId taskId){
       return taskRepository.getOneTaskByTaskId(taskId);
    }


    public void updateTask (long taskId, TaskEntity taskEntity){ taskRepository.updateTask(taskId, taskEntity); }

    public void addNewTask (TaskEntity taskEntity){
       taskRepository.addNewTask(taskEntity);
    }

    public void deleteTask(TaskId taskId){
       taskRepository.deleteTask(taskId);
    }

}
