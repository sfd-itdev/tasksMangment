package sa.gov.sfd.taskManagementDeliveryMechanism.controller;


import org.springframework.web.bind.annotation.*;
import sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure.TaskConverter;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.TaskViewModel;
import sa.gov.sfd.tasksMangment.actions.Task.*;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api/taskManagement/task")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    @Inject
    private GetAllTasks getAllTasks;
    @Inject
    private AddNewTask addNewTask;
    @Inject
    private UpdateTask updateTask;
    @Inject
    private DeleteTask deleteTask;
    @Inject
    private GetOneTaskByTaskId getOneTaskByTaskId;


    @GetMapping("/tasks")
    public List<TaskViewModel> getAllTasks() {
        return TaskConverter.convertTaskEntitiesList(this.getAllTasks.getAllTasks());
    }

    @GetMapping("/getOneTaskByTaskId/{taskId}")
    public TaskViewModel getOneTaskByTaskId(@PathVariable long taskId)  {
        // return UnitConverter.convertUnitEntitiesList(this.getOneUnitByUnitId(unitId));
        return getOneTaskByTaskId(taskId);
    }


    @PostMapping("/addTask")
    public void addTask(@RequestBody TaskViewModel taskViewModel){
        this.addNewTask.addNewTask(TaskConverter.convertTaskViewModel(taskViewModel));
    }


    @PutMapping("/updateTask/{taskId}")
    public void updateTask(@PathVariable Long taskId, @RequestBody TaskViewModel taskViewModel){
        this.updateTask.updateTask(taskId,TaskConverter.convertTaskViewModel(taskViewModel));
    }


    @DeleteMapping("/deleteTask/{taskId}")
    public void deleteTask(@PathVariable long taskId) {
        System.out.println("0====== " + taskId);
        this.deleteTask.deleteTask(TaskConverter.convertTaskId(new TaskViewModel(taskId,null,null,null,null,null,null,null)));
    }


}
