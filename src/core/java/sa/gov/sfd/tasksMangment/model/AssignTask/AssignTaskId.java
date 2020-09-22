package sa.gov.sfd.tasksMangment.model.AssignTask;

import java.util.Objects;

public class AssignTaskId {

    private final long id;

    public AssignTaskId(long id) { this.id = id; }

    public long getId() { return id; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignTaskId)) return false;
        AssignTaskId that = (AssignTaskId) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "AssignTaskId{" +
                "id=" + id +
                '}';
    }
}
