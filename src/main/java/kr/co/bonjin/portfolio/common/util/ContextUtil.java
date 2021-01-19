package kr.co.bonjin.portfolio.common.util;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Spring Bean, Servlet Utils
 * @author gigas
 *
 */
public class ContextUtil {

	/**
	 * ServletRequestAttributes
	 * @return
	 */
	public static ServletRequestAttributes getServletRequestAttributes() {
		return (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	}
	
	/**
	 * Bean
	 * @param name
	 * @return
	 */
	public static Object getBean(String name) {
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		return context.getBean(name);
	}
	
	/**
	 * HttpServletRequest 객체
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		return getServletRequestAttributes().getRequest();
	}
	
	/**
	 * HttpServletResponse 객체
	 * @return
	 */
	public static HttpServletResponse getResponse() {
		return getServletRequestAttributes().getResponse();
	}
	
	/**
	 * HttpSession 객체
	 * @param create
	 * @return
	 */
	public static HttpSession getSession(boolean create) {
		return ContextUtil.getRequest().getSession(create);
	}
	
	/**
	 * Request 
	 * @param name
	 * @return
	 */
	public static Object getAttrFromRequest(String name) {
		return getServletRequestAttributes().getAttribute(name, ServletRequestAttributes.SCOPE_REQUEST);
	}
	
	/**
	 * Request 저장
	 * @param name
	 * @param value
	 */
	public static void setAttrToRequest(String name, Object value) {
		getServletRequestAttributes().setAttribute(name, value, ServletRequestAttributes.SCOPE_REQUEST);
	}
	
	/**
	 * Session
	 * @param name
	 * @return
	 */
	public static Object getAttrFromSession(String name) {
		return getServletRequestAttributes().getAttribute(name, ServletRequestAttributes.SCOPE_SESSION);
	}
	
	/**
	 * Session 저장
	 * @param name
	 * @param value
	 */
	public static void setAttrToSession(String name, Object value) {
		getServletRequestAttributes().setAttribute(name, value, ServletRequestAttributes.SCOPE_SESSION);
	}
}
