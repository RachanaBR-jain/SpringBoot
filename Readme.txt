We need to write code for currency-service  having below members
1)Create the Class CurrencyServiceConfiguration
use below annotation at class level
@ConfigurationProperties(prefix = "currency-service") -in all the URL prefix is currency-service,  go to property file and fetch the default value
@Component - to make Spring the handle the bean, //spring will create the instance of this class

private String url;
private String username;
private String keys;
Generate getter and setters

3) go to application.properties file and add default vaues to constructor
currency-service.url = http://default.currenyDemo.com
currency-service.username = defaultusername
currency-service.keys = default

to have dev specfic configuration go to application-dev.properties
currency-service.url = http://dev.currenyDemo.com
currency-service.username = devusername
currency-service.keys = dev


3)create CurrencyConfigurationController
@RestController
public class CurrencyConfigurationController {
	// bean which is created by Spring for CurrencyServiceConfiguration class is mapped here
	@Autowired 
	public CurrencyServiceConfiguration configure;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourse() {
		return configure;
		
	}

}




