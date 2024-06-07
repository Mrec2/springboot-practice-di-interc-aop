package org.mario.springboot.app.springboot_app_di_inter_aop.interceptors;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("eventInterceptor")
public class EventInterceptor implements HandlerInterceptor{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("This method in PreHandle is " + ((HandlerMethod) handler).getMethod().getName());
		Long start = System.currentTimeMillis();
		request.setAttribute("start", start);
		Random random = new Random();
		int delay = random.nextInt(2000);
		Thread.sleep(delay);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		Long end = System.currentTimeMillis();
		Long start =(Long) request.getAttribute("start");
		Long result = end - start;
		logger.info("Pre to Post last " + result + "ms");
		logger.info("This method is PostHandle is " + ((HandlerMethod) handler).getMethod().getName());
	}

	
	
}
