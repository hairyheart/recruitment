package com.recruitment.security;

import java.util.ArrayList;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.recruitment.dao.entity.Profilo;
import com.recruitment.dao.entity.Utente;
import com.recruitment.service.RecruitmentServiceInterface;

public class MyAuthenticationProvider implements AuthenticationProvider {

	@Autowired(required=true)
	private RecruitmentServiceInterface recService;
	  
	
	public MyAuthenticationProvider() {
		super();
	}
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		MyAuthenticationToken myToken= (MyAuthenticationToken) authentication;
	
		String username= myToken.getUsername();
		String password= myToken.getPassword();
		
		Utente u = recService.find(username, password);
				    		
	        if(u!=null) {
	        	
			List<GrantedAuthority> myAuthorities = new ArrayList<>();
			
			for(Profilo p :u.getProfilo()) {
			myAuthorities.add(new SimpleGrantedAuthority(p.getPrivilegio()));
					
			}
			
			MyAuthenticationToken myToken2=new MyAuthenticationToken(username, password, myAuthorities, u);
			myToken2.setAuthenticated(true);
			
			System.out.println("provider sono autenticato");

			return  myToken2;
			
		}
		    else {
		    	
		    	myToken.setAuthenticated(false);
				System.out.println("provider non sono autenticato");
                 
		    	return myToken;
	   }
}
	
	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
