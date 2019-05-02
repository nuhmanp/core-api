package com.urbango.in.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CoreApplicationConfig extends WebSecurityConfigurerAdapter {

	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("user1").password(passwordEncoder().encode("user1Pass")).roles("user")
		.and()
		.withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("user")
		.and()
		.withUser("admin").password(passwordEncoder().encode("adminPass")).roles("admin");
		
	}*/

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
        http.authorizeRequests().antMatchers("/locations","/categories").permitAll();
		
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
