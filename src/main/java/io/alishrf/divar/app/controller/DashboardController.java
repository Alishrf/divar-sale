package io.alishrf.divar.app.controller;

import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.domain.User;
import io.alishrf.divar.app.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private AdvertisementService service;


    @GetMapping("/dashboard")
    public String getDashboard(Model model){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user",user);
        List<AdvertisementEntity> advertisementEntities = service.findByUser(user.getId());
        model.addAttribute("advertisements",advertisementEntities);
        model.addAttribute("size",advertisementEntities.size());
        return "Profile.html";
    }



}
