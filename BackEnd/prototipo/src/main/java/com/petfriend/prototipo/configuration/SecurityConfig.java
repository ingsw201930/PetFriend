package com.petfriend.prototipo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


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
		.withUser("admin").password("{noop}password").roles("ADMIN")
        .and()
        .withUser("user").password("{noop}password").roles("USER");
		
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
            .antMatchers("/public/**", "/login/**", "/test/**","/pubAnimal/**").permitAll()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/usuario/**").hasRole("USER")
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
/*         http.csrf().disable().
        authorizeRequests().
        antMatchers(HttpMethod.OPTIONS, "/**").permitAll().
        anyRequest().authenticated().
        and().
        httpBasic(); */
    }
    @Bean
	public CorsFilter corsFilter() {
		// ver https://stackoverflow.com/a/42053745
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("http://localhost:4200");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
    }
    
}
