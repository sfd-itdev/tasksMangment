package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupId;

public class EmployeeWorkGroupViewModel {

    private long employeeWorkGroupId;
    private long workGroupId;
    private long employeeId;


    public EmployeeWorkGroupViewModel(long employeeWorkGroupId, long workGroupId, long employeeId) {
        this.employeeWorkGroupId = employeeWorkGroupId;
        this.workGroupId = workGroupId;
        this.employeeId = employeeId;
    }

    public EmployeeWorkGroupViewModel(Long employeeWorkGroupId, Long workGroupId, Long employeeId) {
    }


    public long getEmployeeWordGroupId() {
        return employeeWorkGroupId;
    }

    public long getWorkGroupId() {
        return workGroupId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

}
