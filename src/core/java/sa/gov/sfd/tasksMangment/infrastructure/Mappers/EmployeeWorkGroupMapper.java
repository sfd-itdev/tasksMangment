package sa.gov.sfd.tasksMangment.infrastructure.Mappers;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupEntity;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupId;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeWorkGroupMapper implements RowMapper<EmployeeWorkGroupEntity> {

    @Override

    public EmployeeWorkGroupEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        EmployeeWorkGroupEntity employeeWorkGroup = new EmployeeWorkGroupEntity();

        employeeWorkGroup.setEmployeeWordGroupId(new EmployeeWorkGroupId(resultSet.getLong("EWG_ID")));
        employeeWorkGroup.setWorkGroupId(resultSet.getLong("WGP_ID"));
        employeeWorkGroup.setEmployeeId(resultSet.getLong("EMPLOYEE_ID"));

        return employeeWorkGroup;
    }
}
