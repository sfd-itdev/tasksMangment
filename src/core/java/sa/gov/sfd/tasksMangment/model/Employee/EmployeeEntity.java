package sa.gov.sfd.tasksMangment.model.Employee;


public class EmployeeEntity {

    private EmployeeId employeeId;
    private long        employeeNationalId;
    private String     employeeFullName;


    public EmployeeEntity(EmployeeId employeeId, long employeeNationalId, String employeeFullName) {
        this.employeeId = employeeId;
        this.employeeNationalId = employeeNationalId;
        this.employeeFullName = employeeFullName;
    }

    public EmployeeEntity() {

    }

    public EmployeeId getEmployeeId() { return employeeId; }

    public long getEmployeeNationalId() { return employeeNationalId; }

    public String getEmployeeFullName() { return employeeFullName; }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeNationalId(int employeeNationalId) {
        this.employeeNationalId = employeeNationalId;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }
}



