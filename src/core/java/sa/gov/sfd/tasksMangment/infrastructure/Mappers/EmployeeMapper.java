package sa.gov.sfd.tasksMangment.infrastructure.Mappers;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeEntity;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeEntity> {

    @Override
    public EmployeeEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        EmployeeEntity employee = new EmployeeEntity();

        employee.setEmployeeId(new EmployeeId(resultSet.getLong("EMP_ID")));
        employee.setEmployeeNationalId(resultSet.getInt("EMP_NATIONAL_ID"));
        employee.setEmployeeFullName(resultSet.getString("EMP_FULL_NAME"));

        return employee;
    }

}
