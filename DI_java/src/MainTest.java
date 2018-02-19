import com.consumer.MyApp;
import com.injector.EmailInjector;
import com.injector.Injector;
import com.injector.SMSInjector;

public class MainTest {

	public static void main(String[] args) {
		String msg = "Hi Kuldeep";
		String email = "kuldeep@abc.com";
		String phone = "1213213";
		
		
		Injector injector = null;
		MyApp app = null;
		
		//Send email
		injector = new EmailInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
