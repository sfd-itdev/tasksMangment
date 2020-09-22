package sa.gov.sfd.taskManagementDeliveryMechanism.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import sa.gov.sfd.tasksMangment.actions.AssignTask.*;
import sa.gov.sfd.tasksMangment.actions.Department.*;
import sa.gov.sfd.tasksMangment.actions.Employee.*;
import sa.gov.sfd.tasksMangment.actions.EmployeeWorkGroup.*;
import sa.gov.sfd.tasksMangment.actions.Task.*;
import sa.gov.sfd.tasksMangment.actions.WorkGroup.*;
import sa.gov.sfd.tasksMangment.infrastructure.RepositoryImplementations.*;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskRepository;
import sa.gov.sfd.tasksMangment.model.AssignTask.AssignTaskService;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentRepository;
import sa.gov.sfd.tasksMangment.model.Department.DepartmentService;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeRepository;
import sa.gov.sfd.tasksMangment.model.Employee.EmployeeService;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupRepository;
import sa.gov.sfd.tasksMangment.model.EmployeeWorkGroup.EmployeeWorkGroupService;
import sa.gov.sfd.tasksMangment.model.Task.TaskRepository;
import sa.gov.sfd.tasksMangment.model.Task.TaskService;
import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupRepository;
import sa.gov.sfd.tasksMangment.model.WorkGroup.WorkGroupService;



import javax.sql.DataSource;

@Configuration
public class BeanConfig {

    //--------------- DB ---------------------
    @Bean
    DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .build();
    }

    @Bean
    JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }



    //---------------REPOSITORIES---------------------

    @Bean
    public WorkGroupRepository workGroupRepository() {
        return new WorkGroupRepositoryImpl(jdbcTemplate());
    }

    @Bean
    public AssignTaskRepository assignTaskRepository() {
        return new AssignTaskRepositoryImpl(jdbcTemplate());
    }

    @Bean
    public TaskRepository taskRepository() {
        return new TaskRepositoryImpl(jdbcTemplate());
    }

    @Bean
    public EmployeeWorkGroupRepository employeeWorkGroupRepository() { return new EmployeeWorkGroupRepositoryImpl(jdbcTemplate()); }

    @Bean
    public EmployeeRepository employeeRepository() { return new EmployeeRepositoryImpl(jdbcTemplate()); }

    @Bean
    public DepartmentRepository departmentRepository() { return new DepartmentRepositoryImpl(jdbcTemplate()); }

    //---------------SERVICES---------------------

    @Bean
    public WorkGroupService workGroupService() {
        return new WorkGroupService(workGroupRepository());
    }

    @Bean
    public AssignTaskService assignTaskService() {
        return new AssignTaskService(assignTaskRepository());
    }

    @Bean
    public TaskService taskService() {
        return new TaskService(taskRepository());
    }

    @Bean
    public EmployeeWorkGroupService employeeWorkGroupService() { return new EmployeeWorkGroupService(employeeWorkGroupRepository()); }

    @Bean
    public EmployeeService employeeService() { return new EmployeeService(employeeRepository()); }

    @Bean
    public DepartmentService departmentService() { return new DepartmentService(departmentRepository()); }

    //------------------------------------ACTIONS------------------------------------------


    //-----Starts-------WorkGroup---------
    @Bean
    public GetAllWorkGroups getAllWorkGroups() { return new GetAllWorkGroups(workGroupService());}
    @Bean
    public AddNewWorkGroup addNewWorkGroup() { return new AddNewWorkGroup(workGroupService());}
    @Bean
    public UpdateWorkGroup updateWorkGroup() { return new UpdateWorkGroup(workGroupService());}
    @Bean
    public DeleteWorkGroup deleteWorkGroup() {return new DeleteWorkGroup(workGroupService());}
    @Bean
    public GetOneWorkGroupByWorkGroupId getOneWorkGroupByWorkGroupId() {return new GetOneWorkGroupByWorkGroupId(workGroupService());}
    //-----Ends-------WorkGroup---------


    //-----Starts-------AssignTask---------
    @Bean
    public GetAllAssignTasks getAllAssignTasks() { return new GetAllAssignTasks(assignTaskService());}
    @Bean
    public AddNewAssignTask addNewAssignTask() { return new AddNewAssignTask(assignTaskService());}
    @Bean
    public UpdateAssignTask updateAssignTask() { return new UpdateAssignTask(assignTaskService());}
    @Bean
    public DeleteAssignTask deleteAssignTask() {return new DeleteAssignTask(assignTaskService());}
    @Bean
    public GetOneAssignTaskByAssignTaskId getOneAssignTaskByAssignTaskId() {return new GetOneAssignTaskByAssignTaskId(assignTaskService());}
    //-----Ends---------AssignTask---------



    //-----Starts-------Task---------
    @Bean
    public GetAllTasks getAllTasks() { return new GetAllTasks(taskService());}
    @Bean
    public AddNewTask addNewTask() { return new AddNewTask(taskService());}
    @Bean
    public UpdateTask updateTask() { return new UpdateTask(taskService());}
    @Bean
    public DeleteTask deleteTask() {return new DeleteTask(taskService());}
    @Bean
    public GetOneTaskByTaskId getOneTaskByTaskId() {return new GetOneTaskByTaskId(taskService());}
    //-----Ends---------Task---------



    //-----Starts-------EmployeeWorkGroup---------
    @Bean
    public GetAllEmployeeWorkGroups getAllEmployeeWorkGroups() { return new GetAllEmployeeWorkGroups(employeeWorkGroupService());}
    @Bean
    public AddNewEmployeeWorkGroup addNewEmployeeWorkGroup() { return new AddNewEmployeeWorkGroup(employeeWorkGroupService());}
    @Bean
    public UpdateEmployeeWorkGroup updateEmployeeWorkGroup() { return new UpdateEmployeeWorkGroup(employeeWorkGroupService());}
    @Bean
    public DeleteEmployeeWorkGroup deleteEmployeeWorkGroup() {return new DeleteEmployeeWorkGroup(employeeWorkGroupService());}
    @Bean
    public GetOneEmployeeWorkGroupByEmployeeWorkGroupId getOneEmployeeWorkGroupByEmployeeWorkGroupId() {return new GetOneEmployeeWorkGroupByEmployeeWorkGroupId(employeeWorkGroupService());}
    //-----Ends---------EmployeeWorkGroup---------



    //-----Starts-------Employee---------
    @Bean
    public GetAllEmployees getAllEmployees() { return new GetAllEmployees(employeeService());}
    @Bean
    public AddNewEmployee addNewEmployee() { return new AddNewEmployee(employeeService());}
    @Bean
    public UpdateEmployee updateEmployee() { return new UpdateEmployee(employeeService());}
    @Bean
    public DeleteEmployee deleteEmployee() {return new DeleteEmployee(employeeService());}
    @Bean
    public GetOneEmployeeByEmployeeId getOneEmployeeByEmployeeId() {return new GetOneEmployeeByEmployeeId(employeeService());}
    //-----Ends---------Employee---------



    //-----Starts-------Department---------
    @Bean
    public GetAllDepartments getAllDepartments() { return new GetAllDepartments(departmentService());}
    @Bean
    public AddNewDepartment addNewDepartment() { return new AddNewDepartment(departmentService());}
    @Bean
    public UpdateDepartment updateDepartment() { return new UpdateDepartment(departmentService());}
    @Bean
    public DeleteDepartment deleteDepartment() {return new DeleteDepartment(departmentService());}
    @Bean
    public GetOneDepartmentByDepartmentId getOneDepartmentByDepartmentId() {return new GetOneDepartmentByDepartmentId(departmentService());}
    //-----Ends---------Department---------






}
