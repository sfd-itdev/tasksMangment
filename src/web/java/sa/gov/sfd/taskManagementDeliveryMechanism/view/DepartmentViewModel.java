package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;

public class DepartmentViewModel {

    private long departmentId;
    private String       departmentName;
    private long          departmentNumber;

    public DepartmentViewModel(long departmentId, String departmentName, long departmentNumber) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
    }

    public DepartmentViewModel(long departmentId, String departmentName, Long integer) {
    }


    public long getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public long getDepartmentNumber() {
        return departmentNumber;
    }
}
