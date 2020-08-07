package io.alishrf.divar.app.controller;

import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.domain.EstateEntity;
import io.alishrf.divar.app.domain.User;
import io.alishrf.divar.app.service.AdvertisementService;
import io.alishrf.divar.app.service.EstateService;
import io.alishrf.divar.app.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private EstateService estateService;

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private AdvertisementService advertisementService;


    @RequestMapping({"/home","/"})
    public String getAllAdvertisements(Model model ,
                                       @RequestParam(name = "pageSize",required = false)Integer pageSize,
                                       @RequestParam(name = "page",required = false)Integer page,
                                       @RequestParam(name = "sort",required = false)Sort sort,
                                       @RequestParam(name="category",required = false)String category){


        page = page == null? 0:page;
        pageSize = pageSize==null?10:pageSize;
        sort = sort == null ? Sort.by("id"):sort;
        if(category != null && category.equals("Estate")){
            Page<AdvertisementEntity> advertisements = estateService.findAdvertisements(PageRequest.of(page, pageSize, sort));
            model.addAttribute("advertisements",advertisements);
        }else if(category != null && category.equals("Vehicle")){
            Page<AdvertisementEntity> advertisements = vehicleService.findAdvertisements(PageRequest.of(page, pageSize, sort));
            model.addAttribute("advertisements",advertisements);
        }else {

            Page<AdvertisementEntity> advertisements = advertisementService.findAll(PageRequest.of(page, pageSize, sort));

            model.addAttribute("advertisements",advertisements);
        }

        return "homepage.html";
    }


}
