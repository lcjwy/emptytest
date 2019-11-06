package com.lcj.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * 获取在使用系统过程中的session
 * @author lcj
 *
 */

@Controller
public class BaseAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1L;
	protected Map<String, Object> session;

	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}
	
	
	
}
