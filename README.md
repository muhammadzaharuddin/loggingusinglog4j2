Mission 7 - Logging using log4j2								
Recommended Duration								
0.5 day(s)								
								
Prerequisites								
1. Completed Mission 6								
2. Basic understanding of logging								
2. Basic understanding of log4j2								
								
What you need to do								
1. Modify all CRUD APIs to require a mandatory request header called "userId"								
2. Use @log4j2 annotation and log.debug() to add logging to the CRUD APIs, so that the console prints userId value at DEBUG level.								
3. For `prod` profile, use `logging.level.<your_pacakage_name>` to change the verbosity to WARN and above								
4. Run your application, verify the CRUD endpoints using Postman using different active profiles. Observe the console logs.								
5. Check in your source code in your GitHub repo.								
								
Extra								
Try customizing the log format/pattern using log4j2.xml file.								
								
Resources								
1. Logging, https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-logging								
2. Spring Boot Logging, https://www.baeldung.com/spring-boot-logging								
