import com.example.constructor_injector.EmailSender;
import com.example.constructor_injector.MessageSender;
import com.example.constructor_injector.NotificationService;
import com.example.method_injector.DataSource;
import com.example.method_injector.DatabaseDataSource;
import com.example.method_injector.ReportGenerator;
import com.example.properties_injector.CustomerService;
import com.example.properties_injector.DatabaseCustomerRepository;


public class Main {
    public static void main(String[] args) {

        System.out.println("Constructor Injector!");

        //dependency
        MessageSender emailSender = new EmailSender();

        //injecting dependency
        NotificationService notificationService = new NotificationService(emailSender);

        // Use the service to send a notification
        notificationService.sendNotification("Hello, Dependency Injection!");




        System.out.println("Method Injector");

        //dependency
        DataSource databaseDataSource = new DatabaseDataSource();

        ReportGenerator reportGenerator = new ReportGenerator();

        // injecting dependency
        reportGenerator.generateReport(databaseDataSource);




        System.out.println("Properties Injector");
        
        //dependency
        DatabaseCustomerRepository repository = new DatabaseCustomerRepository();

        CustomerService customerService = new CustomerService();

        //property injection through a setter
        customerService.setCustomerRepository(repository);

        // Use the service to create a customer with the injected dependency
        customerService.createCustomer("John Doe");

    }
}