package sa.gov.sfd.tasksMangment.model.Department;



public class DepartmentEntity {

    private DepartmentId departmentId;
    private String       departmentName;
    private int          departmentNumber;


    public DepartmentEntity(DepartmentId departmentId, String departmentName, int departmentNumber) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentNumber = departmentNumber;
    }

    public DepartmentEntity() {

    }


    public DepartmentId getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(DepartmentId departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
}
