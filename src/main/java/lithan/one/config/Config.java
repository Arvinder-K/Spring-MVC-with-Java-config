package lithan.one.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class Config implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
	    appContext.register(ViewRes.class);
	     
	    ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
	            "SDispatcher", new DispatcherServlet(appContext));
	    dispatcher.setLoadOnStartup(1);
	    dispatcher.addMapping("/");
		
	}
	

}
