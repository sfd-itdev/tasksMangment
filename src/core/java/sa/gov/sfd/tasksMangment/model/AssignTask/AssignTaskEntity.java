package sa.gov.sfd.tasksMangment.model.AssignTask;

import sa.gov.sfd.tasksMangment.model.Employee.EmployeeEntity;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;
import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupEntity;

import java.util.List;

public class AssignTaskEntity {

    private AssignTaskId assignTaskId;
    private TaskId taskId;
    private int  assignTo;
    private String type;


    public AssignTaskEntity(AssignTaskId assignTaskId, TaskId taskId, int assignTo, String type) {
        this.assignTaskId = assignTaskId;
        this.taskId = taskId;
        this.assignTo = assignTo;
        this.type = type;
    }

    public AssignTaskEntity() {

    }


    public AssignTaskId getAssignTaskId() {
        return assignTaskId;
    }

    public void setAssignTaskId(AssignTaskId assignTaskId) {
        this.assignTaskId = assignTaskId;
    }

    public TaskId getTaskId() {
        return taskId;
    }

    public void setTaskId(TaskId taskId) {
        this.taskId = taskId;
    }

    public int getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(int assignTo) {
        this.assignTo = assignTo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
