package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;



import sa.gov.sfd.taskManagementDeliveryMechanism.view.DepartmentViewModel;
import sa.gov.sfd.tasksMangment.model.Department.*;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentConverter {

    public static DepartmentViewModel convertEmployeeEntity(DepartmentEntity departmentEntity) {
        return new DepartmentViewModel(
                departmentEntity.getDepartmentId().getId(),
                departmentEntity.getDepartmentName(),
                departmentEntity.getDepartmentNumber());
    }

    public static List<DepartmentViewModel> convertDepartmentEntitiesList(List<DepartmentEntity> departmentEntity) {
        return departmentEntity.stream().map(x -> new DepartmentViewModel(x.getDepartmentId().getId(),
                x.getDepartmentName(),
                x.getDepartmentNumber())).collect(Collectors.toList());
    }

    public static DepartmentEntity convertDepartmentViewModel(DepartmentViewModel departmentViewModel) {
        return new DepartmentEntity(
                new DepartmentId(departmentViewModel.getDepartmentId()),
                departmentViewModel.getDepartmentName(),
                (int)departmentViewModel.getDepartmentNumber());
    }

    public static DepartmentId convertDepartmentId(DepartmentViewModel departmentViewModel) { return  new DepartmentId(departmentViewModel.getDepartmentId());}



}
