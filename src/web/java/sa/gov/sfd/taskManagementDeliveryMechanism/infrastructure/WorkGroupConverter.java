package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;

import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupEntity;
import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupId;
import sa.gov.sfd.taskManagementDeliveryMechanism.view.WorkGroupViewModel;

import java.util.List;
import java.util.stream.Collectors;

public class WorkGroupConverter {

    public static WorkGroupViewModel convertWorkGroupEntity(WorkGroupEntity workGroupEntity) {
        return new WorkGroupViewModel(
                workGroupEntity.getWorkGroupId().getId(),
                workGroupEntity.getWorkGroupName(),
                workGroupEntity.getWorkGroupCreateDate(),
                workGroupEntity.getCreateByEmployeeId(),
                workGroupEntity.getDepartmentId(),
                workGroupEntity.getEmployeeWorkGroupEntity());
    }

    public static List<WorkGroupViewModel> convertWorkGroupEntitiesList(List<WorkGroupEntity> workGroupEntity) {
        return workGroupEntity.stream().map(x ->
                new WorkGroupViewModel(x.getWorkGroupId().getId(),
                        x.getWorkGroupName(),
                        x.getWorkGroupCreateDate(),
                        x.getCreateByEmployeeId(),
                        x.getDepartmentId(),
                        x.getEmployeeWorkGroupEntity())).collect(Collectors.toList());

    }

    public static WorkGroupEntity convertWorkGroupViewModel(WorkGroupViewModel workGroupViewModel) {
        return new WorkGroupEntity(
                new WorkGroupId(workGroupViewModel.getWorkGroupId()),
                workGroupViewModel.getWorkGroupName(),
                workGroupViewModel.getWorkGroupCreateDate(),
                workGroupViewModel.getCreateByEmployeeId(),
                workGroupViewModel.getDepartmentId(),
                workGroupViewModel.getEmployeeWorkGroupEntity());
    }

    public static WorkGroupId convertWorkGroupId(WorkGroupViewModel workGroupViewModel) { return  new WorkGroupId(workGroupViewModel.getWorkGroupId());}






}
