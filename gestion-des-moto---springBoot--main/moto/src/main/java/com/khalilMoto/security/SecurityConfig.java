package com.khalilMoto.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().cors();
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		//lister tous les motos
		http.authorizeRequests().antMatchers("/api/**").hasAnyAuthority("ADMIN","USER");
		
			
		//consulter un moto par son id
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/**").hasAnyAuthority("ADMIN","USER");
		
		//ajouter un moto
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/api/**").hasAuthority("ADMIN");
		
		//modifier un moto 
		http.authorizeRequests().antMatchers(HttpMethod.PUT, "/api/**").hasAuthority("ADMIN");
		
		//supprimer un moto
		http.authorizeRequests().antMatchers(HttpMethod.DELETE, "/api/**").hasAuthority("ADMIN");
		
		http.authorizeRequests().anyRequest().authenticated();
		
		http.addFilterBefore(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);
		
		
	}
	
	
	

}
