package JPA.Configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class WebConfigInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext applicationContext= new AnnotationConfigWebApplicationContext();
        applicationContext.register(WebXMLConfig.class);
        ServletRegistration.Dynamic springDispatcher = servletContext.addServlet("SpringDispatcher",new DispatcherServlet(applicationContext));
        springDispatcher.setLoadOnStartup(1);
        springDispatcher.addMapping("/");
    }
} 
