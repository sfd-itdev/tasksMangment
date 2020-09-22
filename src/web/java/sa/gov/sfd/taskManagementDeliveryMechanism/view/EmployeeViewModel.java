package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;

public class EmployeeViewModel {

    private long employeeId;
    private long        employeeNationalId;
    private String     employeeFullName;


    public EmployeeViewModel(long employeeId, long employeeNationalId, String employeeFullName) {
        this.employeeId = employeeId;
        this.employeeNationalId = employeeNationalId;
        this.employeeFullName = employeeFullName;
    }

    public EmployeeViewModel(long employeeId, Long aLong, Object employeeFullName) {
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public long getEmployeeNationalId() {
        return employeeNationalId;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }
}
