package sa.gov.sfd.tasksMangment.infrastructure.Mappers;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskEntity;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskId;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;


import java.sql.ResultSet;
import java.sql.SQLException;

public class AssignTaskMapper implements RowMapper<AssignTaskEntity>  {

    @Override
    public AssignTaskEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        AssignTaskEntity assignTask = new AssignTaskEntity();

        assignTask.setAssignTaskId(new AssignTaskId(resultSet.getLong("AST_ID")));
        assignTask.setTaskId(new TaskId(resultSet.getInt("TAS_ID")));
        assignTask.setAssignTo(resultSet.getInt("AST_ASSIGN_TO"));
        assignTask.setType(resultSet.getString("AST_TYPE"));

        return assignTask;
    }

}
