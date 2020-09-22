package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;



import sa.gov.sfd.taskManagementDeliveryMechanism.view.EmployeeWorkGroupViewModel;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupEntity;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupId;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeWorkGroupConverter {

    public static EmployeeWorkGroupViewModel convertEmployeeWorkGroupEntity(EmployeeWorkGroupEntity employeeWorkGroupEntity) {
        return new EmployeeWorkGroupViewModel(
                employeeWorkGroupEntity.getEmployeeWorkGroupId().getId(),
                employeeWorkGroupEntity.getWorkGroupId(),
                employeeWorkGroupEntity.getEmployeeId());
    }

    public static List<EmployeeWorkGroupViewModel> convertEmployeeWorkGroupEntitiesList(List<EmployeeWorkGroupEntity> employeeWorkGroupEntity) {
        return employeeWorkGroupEntity.stream().map(x -> new EmployeeWorkGroupViewModel(x.getEmployeeWorkGroupId().getId(),
                x.getWorkGroupId(),
                x.getEmployeeId())).collect(Collectors.toList());
    }

    public static EmployeeWorkGroupEntity convertEmployeeWorkGroupViewModel(EmployeeWorkGroupViewModel employeeWorkGroupViewModel) {
        return new EmployeeWorkGroupEntity(
                new EmployeeWorkGroupId(employeeWorkGroupViewModel.getEmployeeWordGroupId()),
                employeeWorkGroupViewModel.getWorkGroupId(),
                employeeWorkGroupViewModel.getEmployeeId());
    }

    public static EmployeeWorkGroupId convertEmployeeWorkGroupId(EmployeeWorkGroupViewModel employeeWorkGroupViewModel) { return  new EmployeeWorkGroupId(employeeWorkGroupViewModel.getEmployeeWordGroupId());}



}
