package sa.gov.sfd.taskManagementDeliveryMechanism;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({"sa.gov.sfd.warehouse","sa.gov.sfd.warehouseDeliveryMechanism"})
public class mainApp {

    public static void main(String[] args) {
        SpringApplication.run(mainApp.class, args);
    }
}
