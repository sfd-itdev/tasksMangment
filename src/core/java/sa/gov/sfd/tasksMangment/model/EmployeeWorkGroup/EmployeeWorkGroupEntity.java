package sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup;

public class EmployeeWorkGroupEntity {

    private EmployeeWorkGroupId employeeWorkGroupId;
    private long workGroupId;
    private long employeeId;


    public EmployeeWorkGroupEntity(EmployeeWorkGroupId employeeWorkGroupId, long workGroupId, long employeeId) {
        this.employeeWorkGroupId = employeeWorkGroupId;
        this.workGroupId = workGroupId;
        this.employeeId = employeeId;
    }

    public EmployeeWorkGroupEntity() {

    }


    public EmployeeWorkGroupId getEmployeeWorkGroupId() {
        return employeeWorkGroupId;
    }

    public void setEmployeeWorkGroupId(EmployeeWorkGroupId employeeWorkGroupId) {
        this.employeeWorkGroupId = employeeWorkGroupId;
    }

    public long getWorkGroupId() {
        return workGroupId;
    }

    public void setWorkGroupId(long workGroupId) {
        this.workGroupId = workGroupId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }
}
