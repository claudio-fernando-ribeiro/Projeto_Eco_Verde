package br.univille.projeto_final.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{

    @Autowired
    private UserDetailsService service;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
        .authorizeRequests().antMatchers().permitAll()
        .and().headers().frameOptions().disable()
        .and()
        .authorizeRequests().antMatchers("/funcionarios").authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
        .and()
        .formLogin().permitAll().defaultSuccessUrl("/funcionarios", true)
        .and().logout().permitAll();
    /*  http
        .formLogin()
        .loginPage("/login")
      .and()
        .logout()
        .logoutSuccessUrl("/login"); */
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(service);
    }  
}
