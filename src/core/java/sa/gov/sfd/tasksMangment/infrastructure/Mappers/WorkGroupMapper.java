package sa.gov.sfd.tasksMangment.infrastructure.Mappers;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;
import sa.gov.sfd.tasksMangment.model.WorkGroup.*;

import java.sql.ResultSet;
import java.sql.SQLException;


public class WorkGroupMapper implements RowMapper<WorkGroupEntity>{

    @Override
    public WorkGroupEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        WorkGroupEntity workGroup = new WorkGroupEntity();

        workGroup.setWorkGroupId(new WorkGroupId(resultSet.getLong("WGP_ID")));
        workGroup.setWorkGroupName(resultSet.getString("WGP_NAME"));
        workGroup.setWorkGroupCreateDate(resultSet.getDate("WGP_CREATE_DATE"));
        workGroup.setCreateByEmployeeId(new EmployeeId(resultSet.getLong("EMPLOYEE_ID")));
        workGroup.setDepartmentId(new DepartmentId(resultSet.getLong("DEPARTMENT_ID")));
        return workGroup;
    }

}
