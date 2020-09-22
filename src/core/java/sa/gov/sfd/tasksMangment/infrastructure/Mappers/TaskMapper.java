package sa.gov.sfd.tasksMangment.infrastructure.Mappers;

import org.springframework.jdbc.core.RowMapper;

import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;
import sa.gov.sfd.tasksMangment.model.Task.TaskEntity;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<TaskEntity>  {

    @Override
    public TaskEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        TaskEntity task = new TaskEntity();

        task.setTaskId(new TaskId(resultSet.getLong("TAS_ID")));
        task.setTaskName(resultSet.getString("TAS_NAME"));
        task.setTaskCreateDate(resultSet.getDate("TAS_CREATE_DATE"));
        task.setCreateByEmployeeId(new EmployeeId(resultSet.getLong("EMP_ID")));
        task.setDepartmentId      (new DepartmentId(resultSet.getLong("DEP_ID")));
        task.setTaskDeliveryDate(resultSet.getDate("TAS_DELIVERY_DATE"));
        task.setTaskStatus(resultSet.getString("TAS_STATUS"));
        task.setAttachment(resultSet.getString("TAS_ATTACHMENT"));

        return task;
    }


}
