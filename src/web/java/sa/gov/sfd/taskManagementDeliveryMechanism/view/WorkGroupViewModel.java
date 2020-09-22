package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupEntity;

import java.util.Date;
import java.util.List;

public class WorkGroupViewModel {

    private long workGroupId;
    private String workGroupName;
    private Date workGroupCreateDate;
    private long createByEmployeeId;
    private long departmentId;
    private List employeeWorkGroupEntity;



    public WorkGroupViewModel(long workGroupId, String workGroupName, Date workGroupCreateDate, long createByEmployeeId, long departmentId, List employeeWorkGroupEntity) {
        this.workGroupId = workGroupId;
        this.workGroupName = workGroupName;
        this.workGroupCreateDate = workGroupCreateDate;
        this.createByEmployeeId = createByEmployeeId;
        this.departmentId = departmentId;
        this.employeeWorkGroupEntity = employeeWorkGroupEntity;
    }

    public WorkGroupViewModel(long id, String workGroupName, Date workGroupCreateDate, EmployeeId createByEmployeeId, DepartmentId departmentId, List<EmployeeWorkGroupEntity> employeeWorkGroupEntity) {

    }

    public long getWorkGroupId() {
        return workGroupId;
    }

    public String getWorkGroupName() {
        return workGroupName;
    }

    public Date getWorkGroupCreateDate() {
        return workGroupCreateDate;
    }

    public long getCreateByEmployeeId() {
        return createByEmployeeId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public List getEmployeeWorkGroupEntity() {
        return employeeWorkGroupEntity;
    }
}
