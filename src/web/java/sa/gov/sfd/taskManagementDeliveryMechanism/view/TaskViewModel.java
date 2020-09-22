package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskEntity;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;

import java.util.Date;
import java.util.List;

public class TaskViewModel {


    private long taskId;
    private String taskName;
    private Date taskCreateDate;
    private long createByEmployeeId;
    private long departmentId;
    private Date taskDeliveryDate;
    private String taskStatus;
    private String attachment;
    private List assignTaskEntityList;


    public TaskViewModel(long taskId, String taskName, Date taskCreateDate, long createByEmployeeId, long departmentId, Date taskDeliveryDate, String taskStatus, String attachment, List assignTaskEntityList) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskCreateDate = taskCreateDate;
        this.createByEmployeeId = createByEmployeeId;
        this.departmentId = departmentId;
        this.taskDeliveryDate = taskDeliveryDate;
        this.taskStatus = taskStatus;
        this.attachment = attachment;
        this.assignTaskEntityList = assignTaskEntityList;
    }

    public TaskViewModel(long id, String taskName, Date taskCreateDate, EmployeeId createByEmployeeId, DepartmentId departmentId, Date taskDeliveryDate, String taskStatus, String attachment) {
    }


    public long getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public Date getTaskCreateDate() {
        return taskCreateDate;
    }

    public long getCreateByEmployeeId() {
        return createByEmployeeId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public Date getTaskDeliveryDate() {
        return taskDeliveryDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public String getAttachment() {
        return attachment;
    }

    public List getAssignTaskEntityList() {
        return assignTaskEntityList;
    }
}
