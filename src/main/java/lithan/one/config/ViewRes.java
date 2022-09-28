package lithan.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan("lithan.one")
public class ViewRes implements WebMvcConfigurer{
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		   registry.addResourceHandler("/resource/**")
	       .addResourceLocations("/WEB-INF/resource/css/") ;
	registry.addResourceHandler("/js/**")
	      .addResourceLocations("/WEB-INF/resource/js/");
		
	}
}
