package sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup;

import java.util.Objects;

public class EmployeeWorkGroupId {

    private final long id;

    public EmployeeWorkGroupId(long id) { this.id = id; }

    public long getId() { return id; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeWorkGroupId)) return false;
        EmployeeWorkGroupId that = (EmployeeWorkGroupId) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "EmployeeWorkGroup{" +
                "id=" + id +
                '}';
    }
}
