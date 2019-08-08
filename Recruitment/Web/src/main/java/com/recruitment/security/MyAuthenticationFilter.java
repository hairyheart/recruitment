package com.recruitment.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;


public class MyAuthenticationFilter extends AbstractAuthenticationProcessingFilter{

	//@Autowired MyAuthenticationProvider authenticationProvider;
	private Logger logger = Logger.getLogger("FILTER");
	
    private static AuthenticationManager authenticationManager;
    
	public MyAuthenticationFilter() {
		super("/entry");
	}

	@Override
	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
	
		MyAuthenticationFilter.authenticationManager=authenticationManager;
		
		super.setAuthenticationManager(authenticationManager);
		
		System.out.println ("Sono nel filtro");
	}
	
	
		@Override
		public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
				throws AuthenticationException, IOException, ServletException {

			String username=request.getParameter("username");
			String password=request.getParameter("password");
						
			Authentication auth= new MyAuthenticationToken(username,password);
			
			this.setAuthenticationManager(MyAuthenticationFilter.authenticationManager);
			
			auth= this.getAuthenticationManager().authenticate(auth);
			
			
			if(auth.isAuthenticated()) {
				
				System.out.println("filtro sono autenticato");
				
	         	
		     	MyAuthenticationSuccessHandler successhandler=new MyAuthenticationSuccessHandler();
				successhandler.onAuthenticationSuccess(request, response, auth);
						
		
			}
			else {
				System.out.println("filtro non sono autenticato");
			
				MyAuthenticationFailureHandler failureHandler= new MyAuthenticationFailureHandler();
				AuthenticationException exception = null ;
				failureHandler.onAuthenticationFailure(request, response, exception);		
			}
			return auth;
		}
	}
