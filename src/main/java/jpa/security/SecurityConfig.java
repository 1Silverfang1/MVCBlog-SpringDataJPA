package jpa.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter  {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder builder= User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication().withUser(builder.username("root").password("toor").roles("USER").authorities("WRITE_PRIVILEGE"));
    }
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers(HttpMethod.GET).permitAll();
//        http.authorizeRequests().antMatchers(HttpMethod.POST).authenticated();
//        http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/you/can/alsoSpecifyAPath").denyAll();
//        http.authorizeRequests().antMatchers(HttpMethod.PATCH,"/path/is/Case/Insensitive").denyAll();
//        http.authorizeRequests().antMatchers(HttpMethod.PUT,"/and/can/haveWildcards/*").denyAll();
//
//    }

}
