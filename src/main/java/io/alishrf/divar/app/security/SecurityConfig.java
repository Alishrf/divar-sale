package io.alishrf.divar.app.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.web.bind.annotation.GetMapping;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService getUserDetailsService(){
        return new UserService();
    }


    @Autowired
    public void GlobalConfig(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        final DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
        daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        authenticationManagerBuilder.userDetailsService(getUserDetailsService()).and().authenticationProvider(daoAuthenticationProvider);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().exceptionHandling().authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/login")).
                and().authorizeRequests().antMatchers( "/login", "/register").permitAll().
                antMatchers("/dashboard","/addEstate","/addCar"
                        ,"/car","/saleOfficial","/rentalOfficial","/saleEstate","/rentalEstate").fullyAuthenticated().
                and().logout().logoutSuccessUrl("/");;
    }


    @Bean
    public DaoAuthenticationProvider createDaoAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(getUserDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
