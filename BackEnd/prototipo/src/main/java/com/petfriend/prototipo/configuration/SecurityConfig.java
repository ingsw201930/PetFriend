package com.petfriend.prototipo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	private BCryptPasswordEncoder bCrypt;
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		BCryptPasswordEncoder bCrypt =new BCryptPasswordEncoder();
//		return bCrypt;
//	}
	@Autowired
    private RESTAuthenticationEntryPoint entryPoint;

    @Autowired
    private RESTAuthSuccessHandler successHandler;
    
    
    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;
    
	@Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("admin").password(encoder().encode("password")).roles("ADMIN")
        .and()
        .withUser("user").password(encoder().encode("password")).roles("USER");
		
	}
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		 http
         .cors()
         .and()
         .csrf().disable()
         .exceptionHandling()
         .authenticationEntryPoint(entryPoint)
         .and()
         .authorizeRequests()
             .antMatchers("/public/**", "/login/**", "/test/**","/pubAnimal/**","/usuario/**").permitAll()
             .antMatchers("/admin/**").hasRole("ADMIN")
             //.antMatchers("/usuario/**").hasRole("USER")
             .anyRequest().authenticated()
         .and()
         .formLogin()
             .successHandler(successHandler)
             .failureHandler(new SimpleUrlAuthenticationFailureHandler())
         .and()
         .logout() 
             .logoutSuccessHandler(logoutSuccessHandler)
         .and()
         ;
		
	}
}
