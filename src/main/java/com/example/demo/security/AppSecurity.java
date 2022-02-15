package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class AppSecurity extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("srinjoy")
		.password("0000")
		.roles("ADMIN");
	}
	
	@Bean
	public PasswordEncoder getpasswordencoder()
	{
		return NoOpPasswordEncoder.getInstance();
		
	}
/*	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/api/getmodels").hasAnyRole("USER","ADMIN")
		.antMatchers("/api/getproducts").hasRole("ADMIN")
		.and().formLogin();
	}
*/	
	

}
