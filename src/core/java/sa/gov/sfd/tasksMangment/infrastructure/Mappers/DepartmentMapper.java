package sa.gov.sfd.tasksMangment.infrastructure.Mappers;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentEntity;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentId;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapper implements RowMapper<DepartmentEntity> {

    @Override
    public DepartmentEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        DepartmentEntity department = new DepartmentEntity();

        department.setDepartmentId(new DepartmentId(resultSet.getLong("DEP_ID")));
        department.setDepartmentName(resultSet.getString("DEP_NAME"));
        department.setDepartmentNumber(resultSet.getInt("DEP_NUMBER"));

        return department;
    }

}
