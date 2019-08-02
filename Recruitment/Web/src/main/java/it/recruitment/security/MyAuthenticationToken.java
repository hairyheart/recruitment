package it.recruitment.security;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import it.recruitment.dao.entity.Utente;

public class MyAuthenticationToken extends AbstractAuthenticationToken{

	private String username;
	private String password;
	private Utente u;
		
	public MyAuthenticationToken(String username, String password) {
		super(null);
		this.username=username;
		this.password=password;
	}   
	
	public MyAuthenticationToken(String username, String password,List<GrantedAuthority> authorities,Utente u ) {
	    super(authorities);
	    this.u=u;
		this.username=username;
		this.password=password;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
   

	
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return super.getAuthorities();
	}

	
   
	@Override
	public   Object getCredentials() {
		// TODO Auto-generated method stub
		return Arrays.asList(username,password);
	}

	@Override
	public Object getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utente getPrincipal() {
		// TODO Auto-generated method stub
		return this.u;
	}

	
}
