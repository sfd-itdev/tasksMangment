package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;



import sa.gov.sfd.taskManagementDeliveryMechanism.view.TaskViewModel;
import sa.gov.sfd.tasksMangment.model.Task.TaskEntity;
import sa.gov.sfd.tasksMangment.model.Task.TaskId;

import java.util.List;
import java.util.stream.Collectors;

public class TaskConverter {

    public static TaskViewModel convertTaskEntity(TaskEntity taskEntity) {
        return new TaskViewModel(
                taskEntity.getTaskId().getId(),
                taskEntity.getTaskName(),
                taskEntity.getTaskCreateDate(),
                taskEntity.getCreateByEmployeeId(),
                taskEntity.getDepartmentId(),
                taskEntity.getTaskDeliveryDate(),
                taskEntity.getTaskStatus(),
                taskEntity.getAttachment());
    }

    public static List<TaskViewModel> convertTaskEntitiesList(List<TaskEntity> taskEntity) {
        return taskEntity.stream().map(x -> new TaskViewModel(x.getTaskId().getId(),
                        x.getTaskName(),
                        x.getTaskCreateDate(),
                        x.getCreateByEmployeeId(),
                        x.getDepartmentId(),
                        x.getTaskDeliveryDate(),
                        x.getTaskStatus(),
                        x.getAttachment())).collect(Collectors.toList());

    }

    public static TaskEntity convertTaskViewModel(TaskViewModel taskViewModel) {
        return new TaskEntity(
                new TaskId(taskViewModel.getTaskId()),
                taskViewModel.getTaskName(),
                taskViewModel.getTaskCreateDate(),
                taskViewModel.getCreateByEmployeeId(),
                taskViewModel.getDepartmentId(),
                taskViewModel.getTaskDeliveryDate(),
                taskViewModel.getTaskStatus(),
                taskViewModel.getAttachment());
    }

    public static TaskId convertTaskId(TaskViewModel taskViewModel) { return  new TaskId(taskViewModel.getTaskId());}





}
