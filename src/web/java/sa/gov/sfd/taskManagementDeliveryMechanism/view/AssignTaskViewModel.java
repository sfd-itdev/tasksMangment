package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.Task.TaskId;

public class AssignTaskViewModel {

    private long assignTaskId;
    private TaskId taskId;
    private int  assignTo;
    private String type;


    public AssignTaskViewModel(long assignTaskId, TaskId taskId, Integer assignTo, String type) {
        this.assignTaskId = assignTaskId;
        this.taskId = taskId;
        this.assignTo = assignTo;
        this.type = type;
    }


    public long getAssignTaskId() {
        return assignTaskId;
    }

    public TaskId getTaskId() {
        return taskId;
    }

    public int getAssignTo() {
        return assignTo;
    }

    public String getType() {
        return type;
    }
}
