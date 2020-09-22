package sa.gov.sfd.tasksMangment.model.Employee;

import java.util.Objects;

public class EmployeeId {

    private final long id;

    public EmployeeId(long id) { this.id = id; }

    public long getId() { return id; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeId)) return false;
        EmployeeId that = (EmployeeId) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    @Override
    public String toString() {
        return "EmployeeId{" +
                "id=" + id +
                '}';
    }
}
