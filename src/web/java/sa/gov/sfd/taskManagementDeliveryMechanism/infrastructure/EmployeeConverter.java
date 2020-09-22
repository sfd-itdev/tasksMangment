package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;



import sa.gov.sfd.taskManagementDeliveryMechanism.view.EmployeeViewModel;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeEntity;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeId;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeConverter {

    public static EmployeeViewModel convertEmployeeEntity(EmployeeEntity employeeEntity) {
        return new EmployeeViewModel(
                employeeEntity.getEmployeeId().getId(),
                employeeEntity.getEmployeeNationalId(),
                employeeEntity.getEmployeeFullName());
    }

    public static List<EmployeeViewModel> convertEmployeeEntitiesList(List<EmployeeEntity> employeeEntity) {
        return employeeEntity.stream().map(x -> new EmployeeViewModel(x.getEmployeeId().getId(),
                x.getEmployeeNationalId(),
                x.getEmployeeFullName())).collect(Collectors.toList());
    }

    public static EmployeeEntity convertEmployeeViewModel(EmployeeViewModel employeeViewModel) {
        return new EmployeeEntity(
                new EmployeeId(employeeViewModel.getEmployeeId()),
                employeeViewModel.getEmployeeNationalId(),
                employeeViewModel.getEmployeeFullName());
    }

    public static EmployeeId convertEmployeeId(EmployeeViewModel employeeViewModel) { return  new EmployeeId(employeeViewModel.getEmployeeId());}




}
