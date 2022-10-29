About debug log
Go to application.property file and add below line to enable debug logs
--> logging.level.org.springframework = debug

Run the program -> in server logs you can see positive and negative log
1)Positive matches: this which are autoConfigured
ex:
AopAutoConfiguration
--DispatcherServletAutoConfiguration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
@AutoConfiguration(after = ServletWebServerFactoryAutoConfiguration.class)
@ConditionalOnWebApplication(type = Type.SERVLET)
@ConditionalOnClass(DispatcherServlet.class)
public class DispatcherServletAutoConfiguration {

	/**
	 * The bean name for a DispatcherServlet that will be mapped to the root URL "/".
	 */
EmbeddedWebServerFactoryCustomizerAutoConfiguration -error (Whitelabel Error Page when no explicit mapping for /error)
ErrorMvcAutoConfiguration
GenericCacheConfiguration
HttpEncodingAutoConfiguration
HttpMessageConvertersAutoConfiguration
JacksonAutoConfiguration
JacksonHttpMessageConvertersConfiguration
LifecycleAutoConfiguration
MultipartAutoConfiguration
NoOpCacheConfiguration
RestTemplateAutoConfiguration
ServletWebServerFactoryAutoConfiguration
SimpleCacheConfiguration
SqlInitializationAutoConfiguration
TaskExecutionAutoConfiguration
WebMvcAutoConfiguration
WebSocketServletAutoConfiguration

2)Negative matches: this which are not autoConfigured




