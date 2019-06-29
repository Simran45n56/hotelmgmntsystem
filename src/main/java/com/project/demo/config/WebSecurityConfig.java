//package com.project.demo.config;
//
//import javax.activation.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//	
//
//	@Configuration
//	@EnableWebSecurity
//	class  WebSecurityConfig extends WebSecurityConfigurerAdapter{
//		  
//	   
//	    
//		@Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http.authorizeRequests()
//	                .antMatchers("/login").permitAll()
//	                
//	                .antMatchers("/admin/**").hasRole("ADMIN")  // ROLE_ADMIN
//	              //  .antMatchers("/**").hasAnyRole("ADMIN", "USER") // ROLE_ADMIN /  ROLE_USER
//	                .antMatchers("/**").permitAll()
//	                .and()
//	                
//	                .formLogin()
//	                .usernameParameter("email")
//	                .passwordParameter("password")
//	                .defaultSuccessUrl("/home")
//	                .failureUrl("/login?error=true")
//	                .permitAll()
//	                .and()
//	            .logout()
//	                .logoutSuccessUrl("/login?logout=true")
//	                .invalidateHttpSession(true)
//	                .permitAll()
//	                .and()
//	               
//	            .csrf()
//	                .disable();
//	      
//	    }
//		
////		
////		
////	}
////	    
////
////
