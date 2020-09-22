package sa.gov.sfd.tasksMangment.model.WorkGroup;

import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupEntity;

import java.util.Date;
import java.util.List;

public class WorkGroupEntity {


    private WorkGroupId workGroupId;
    private String workGroupName;
    private Date workGroupCreateDate;
    private EmployeeId createByEmployeeId;
    private DepartmentId departmentId;
    private List <EmployeeWorkGroupEntity> employeeWorkGroupEntity;


    public WorkGroupEntity(WorkGroupId workGroupId, String workGroupName, Date workGroupCreateDate, EmployeeId createByEmployeeId, DepartmentId departmentId, List<EmployeeWorkGroupEntity> employeeWorkGroupEntity) {
        this.workGroupId = workGroupId;
        this.workGroupName = workGroupName;
        this.workGroupCreateDate = workGroupCreateDate;
        this.createByEmployeeId = createByEmployeeId;
        this.departmentId = departmentId;
        this.employeeWorkGroupEntity = employeeWorkGroupEntity;
    }

    public WorkGroupEntity() {

    }

    public WorkGroupEntity(WorkGroupId workGroupId, String workGroupName, Date workGroupCreateDate, long createByEmployeeId, long departmentId, List employeeWorkGroupEntity) {
    }


    public WorkGroupId getWorkGroupId() { return workGroupId; }

    public String getWorkGroupName() { return workGroupName; }

    public Date getWorkGroupCreateDate() { return workGroupCreateDate; }

    public EmployeeId getCreateByEmployeeId() { return createByEmployeeId; }

    public DepartmentId getDepartmentId() { return departmentId; }

    public List<EmployeeWorkGroupEntity> getEmployeeWorkGroupEntity() { return employeeWorkGroupEntity; }

    public void setWorkGroupId(WorkGroupId workGroupId) {
        this.workGroupId = workGroupId;
    }

    public void setWorkGroupName(String workGroupName) {
        this.workGroupName = workGroupName;
    }

    public void setWorkGroupCreateDate(Date workGroupCreateDate) {
        this.workGroupCreateDate = workGroupCreateDate;
    }

    public void setCreateByEmployeeId(EmployeeId createByEmployeeId) {
        this.createByEmployeeId = createByEmployeeId;
    }

    public void setDepartmentId(DepartmentId departmentId) {
        this.departmentId = departmentId;
    }

    public void setEmployeeWorkGroupEntity(List<EmployeeWorkGroupEntity> employeeWorkGroupEntity) {
        this.employeeWorkGroupEntity = employeeWorkGroupEntity;
    }
}
