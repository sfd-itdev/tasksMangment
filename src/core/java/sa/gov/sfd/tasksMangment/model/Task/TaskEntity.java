package sa.gov.sfd.tasksMangment.model.Task;

import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskEntity;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;

import java.util.Date;
import java.util.List;

public class TaskEntity {

    private TaskId taskId;
    private String taskName;
    private Date taskCreateDate;
    private EmployeeId createByEmployeeId;
    private DepartmentId departmentId;
    private Date taskDeliveryDate;
    private String taskStatus;
    private String attachment;
    private List<AssignTaskEntity> assignTaskEntityList;


    public TaskEntity(TaskId taskId, String taskName, Date taskCreateDate, EmployeeId createByEmployeeId, DepartmentId departmentId, Date taskDeliveryDate, String taskStatus, String attachment, List<AssignTaskEntity> assignTaskEntityList) {
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

    public TaskEntity() {

    }

    public TaskEntity(TaskId taskId, String taskName, Date taskCreateDate, long createByEmployeeId, long departmentId, Date taskDeliveryDate, String taskStatus, String attachment) {
    }


    public TaskId getTaskId() { return taskId; }

    public String getTaskName() { return taskName; }

    public Date getTaskCreateDate() { return taskCreateDate; }

    public EmployeeId getCreateByEmployeeId() { return createByEmployeeId; }

    public DepartmentId getDepartmentId() { return departmentId; }

    public Date getTaskDeliveryDate() { return taskDeliveryDate; }

    public String getTaskStatus() { return taskStatus; }

    public String getAttachment() { return attachment; }

    public List<AssignTaskEntity> getAssignTaskEntityList() { return assignTaskEntityList; }

    public void setTaskId(TaskId taskId) {
        this.taskId = taskId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskCreateDate(Date taskCreateDate) {
        this.taskCreateDate = taskCreateDate;
    }

    public void setCreateByEmployeeId(EmployeeId createByEmployeeId) {
        this.createByEmployeeId = createByEmployeeId;
    }

    public void setDepartmentId(DepartmentId departmentId) {
        this.departmentId = departmentId;
    }

    public void setTaskDeliveryDate(Date taskDeliveryDate) {
        this.taskDeliveryDate = taskDeliveryDate;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public void setAssignTaskEntityList(List<AssignTaskEntity> assignTaskEntityList) {
        this.assignTaskEntityList = assignTaskEntityList;
    }
}
