package sa.gov.sfd.tasksMangment.model.WorkGroup;

import java.util.Objects;

public class WorkGroupId {

    private final long id;

    public WorkGroupId(long id) { this.id = id; }

    public long getId() { return id; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkGroupId)) return false;
        WorkGroupId that = (WorkGroupId) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "WorkGroupId{" +
                "id=" + id +
                '}';
    }
}
