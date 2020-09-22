package sa.gov.sfd.tasksMangment.model.Department;

import java.util.Objects;

public class DepartmentId {

    private final long id;

    public DepartmentId(long id) {
            this.id = id;
        }

    public long getId() {
            return id;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepartmentId)) return false;
        DepartmentId that = (DepartmentId) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "DepartmentId{" +
                "id=" + id +
                '}';
    }

}
