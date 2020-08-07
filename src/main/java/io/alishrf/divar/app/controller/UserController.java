package io.alishrf.divar.app.controller;


import io.alishrf.divar.app.domain.User;
import io.alishrf.divar.app.security.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {



    @Autowired
    private UserService userService;

    @Autowired
    private DaoAuthenticationProvider daoAuthenticationProvider;


    @GetMapping("/login")
    public String login() {
        return "security/login.html";
    }


    @PostMapping("/login")
    public String authenticate(@RequestParam(name = "uname") String username,
                               @RequestParam(name = "psw") String password) {
        Authentication auth = new UsernamePasswordAuthenticationToken(username, password);
        Authentication authenticated = daoAuthenticationProvider.authenticate(auth);
        SecurityContextHolder.getContext().setAuthentication(authenticated);
        return "redirect:/dashboard";

    }

    @GetMapping("/logout")
    public String logout() {
        SecurityContextHolder.clearContext();
        return "redirect:/login";
    }

    @GetMapping("/register")
    public String register() {
        return "security/signup.html";
    }


    @PostMapping("/register")
    public String register(HttpServletRequest request) {
        if(request.getParameter("uname") == null || request.getParameter("password") ==null){
            return "redirect:/register?error=tru";
        }
        User user = new User();
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setUsername(request.getParameter("uname"));
        user.setPassword(bCryptPasswordEncoder.encode( request.getParameter("password")));
        user.setName( request.getParameter("fname"));
        user.setFamilyName( request.getParameter("lname"));
        user.setPhone(request.getParameter("phone"));
        userService.save(user);
        return "redirect:/login";

    }

}
