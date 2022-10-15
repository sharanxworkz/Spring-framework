package com.xworkz.criminaldata.configure;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class SpringMVCInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	private String[] servletMappings= {"/"};
	private Class[] servletConfigClasses = {SpringConfiguration.class};
	
	
	public SpringMVCInitializer() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses"+this.getClass().getSimpleName());
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses"+this.getClass().getSimpleName());
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created  getServletMappings"+this.getClass().getSimpleName());
		return servletMappings;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
