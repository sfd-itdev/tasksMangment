package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;



import sa.gov.sfd.taskManagementDeliveryMechanism.view.AssignTaskViewModel;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskEntity;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskId;


import java.util.List;
import java.util.stream.Collectors;

public class AssignTaskConverter {


    public static AssignTaskViewModel convertAssignTaskEntity(AssignTaskEntity assignTaskEntity) {
        return new AssignTaskViewModel(
                assignTaskEntity.getAssignTaskId().getId(),
                assignTaskEntity.getTaskId(),
                assignTaskEntity.getAssignTo(),
                assignTaskEntity.getType());
    }

    public static List<AssignTaskViewModel> convertAssignTaskEntitiesList(List<AssignTaskEntity> assignTaskEntity) {
        return assignTaskEntity.stream().map(x ->
                new AssignTaskViewModel(x.getAssignTaskId().getId(),
                        x.getTaskId(),
                        x.getAssignTo(),
                        x.getType())).collect(Collectors.toList());

    }

    public static AssignTaskEntity convertAssignTaskViewModel(AssignTaskViewModel assignTaskViewModel) {
        return new AssignTaskEntity(
                new AssignTaskId(assignTaskViewModel.getAssignTaskId()),
                assignTaskViewModel.getTaskId(),
                assignTaskViewModel.getAssignTo(),
                assignTaskViewModel.getType());
    }

    public static AssignTaskId convertAssignTaskId(AssignTaskViewModel assignTaskViewModel) { return  new AssignTaskId(assignTaskViewModel.getAssignTaskId());}


}
