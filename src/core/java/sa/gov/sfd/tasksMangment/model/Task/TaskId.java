package sa.gov.sfd.tasksMangment.model.Task;

import java.util.Objects;

public class TaskId {

    private final long id;

    public TaskId(long id) { this.id = id; }

    public long getId() { return id; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskId)) return false;
        TaskId taskId = (TaskId) o;
        return getId() == taskId.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "TaskId{" +
                "id=" + id +
                '}';
    }
}
