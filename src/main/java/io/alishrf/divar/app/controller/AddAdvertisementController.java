package io.alishrf.divar.app.controller;

import io.alishrf.divar.app.domain.*;
import io.alishrf.divar.app.dto.CarDto;
import io.alishrf.divar.app.dto.EstateDto;
import io.alishrf.divar.app.repository.CityRepository;
import io.alishrf.divar.app.repository.SectorRepository;
import io.alishrf.divar.app.service.AdvertisementService;
import io.alishrf.divar.app.service.EstateService;
import io.alishrf.divar.app.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddAdvertisementController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private SectorRepository sectorRepository;


    @Autowired
    private EstateService estateService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping("/rentalEstate")
    public String rentalEstate() {
        return "forms/rentalEstate.html";
    }

    @GetMapping("/saleEstate")
    public String saleEstate() {
        return "forms/saleEstate.html";
    }


    @GetMapping("/rentalOfficial")
    public String rentalOfficial() {
        return "forms/rentalOfficial.html";
    }


    @GetMapping("/saleOfficial")
    public String saleOfficial() {
        return "forms/saleOfficial.html";
    }

    @GetMapping("/car")
    public String car() {
        return "forms/car.html";
    }

    @PostMapping("/addEstate")
    public String add(@ModelAttribute("ad") EstateDto dto) {
        CityEntity city = new CityEntity(dto.getCity());
        cityRepository.save(city);
        SectorEntity sector = new SectorEntity();
        sector.setCity(city);
        sector.setName(dto.getSector());
        sectorRepository.save(sector);


        AdvertisementEntity advertisementEntity = new AdvertisementEntity();


        advertisementEntity.setSectorEntity(sector);
        advertisementEntity.setTitle(dto.getTitle());
        advertisementEntity.setPrice(dto.getPrice());
        advertisementEntity.setDescription(dto.getDescription());
        advertisementEntity.setExpired(false);
        advertisementEntity.setAdvertisementType(dto.getAdvertisementType());
        advertisementEntity.setHasPrice(dto.isHasPrice());
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        advertisementEntity.setUser(user);
        advertisementService.save(advertisementEntity);
        EstateEntity estate = null;
        if (dto.getType().equals("saleOfficial")) {
            estate = new SaleEstateEntity();
            estate.setOfficial(true);
        }
        if (dto.getType().equals("rentalOfficial")) {
            estate = new RentalEstateEntity();
            estate.setOfficial(true);
        }
        if (dto.getType().equals("rentalEstate")) {
            estate = new RentalEstateEntity();
            estate.setOfficial(false);
        }
        if (dto.getType().equals("saleEstate")) {
            estate = new SaleEstateEntity();
            estate.setOfficial(false);
        }
        estate.setAddress(dto.getAddress());
        estate.setOfficial(dto.isOfficial());
        estate.setAdvertisement(advertisementEntity);
        estate.setArea(dto.getArea());
        estate.setHasElevator(dto.isHasElevator());
        estate.setHasParking(dto.isHasParking());
        estate.setHasWareHouse(dto.isHasWareHouse());
        estate.setNumberOfRoom(dto.getNumberOfRoom());
        estate.setYearOfConstruction(dto.getYearOfConstruction());
        if (estate instanceof RentalEstateEntity) {
            estateService.save((RentalEstateEntity) estate);
        }

        if (estate instanceof SaleEstateEntity) {
            estateService.save((SaleEstateEntity) estate);
        }


        return "redirect:/home";

    }

    @PostMapping("/addCar")
    public String addCar(@ModelAttribute("ad") CarDto dto) {
        CityEntity city = new CityEntity(dto.getCity());
        cityRepository.save(city);
        SectorEntity sector = new SectorEntity();
        sector.setCity(city);
        sector.setName(dto.getSector());
        sectorRepository.save(sector);


        AdvertisementEntity advertisementEntity = new AdvertisementEntity();


        advertisementEntity.setSectorEntity(sector);
        advertisementEntity.setTitle(dto.getTitle());
        advertisementEntity.setPrice(dto.getPrice());
        advertisementEntity.setDescription(dto.getDescription());
        advertisementEntity.setExpired(false);
        advertisementEntity.setAdvertisementType(dto.getAdvertisementType());
        advertisementEntity.setHasPrice(dto.isHasPrice());
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        advertisementEntity.setUser(user);
        advertisementService.save(advertisementEntity);
        VehicleEntity vehicleEntity = null;
        if (dto.getType().equals("car")) {
            vehicleEntity = new CarEntity();

        }
        if (dto.getType().equals("heavy_car")) {
            vehicleEntity = new HeavyVehicleEntity();

        }

        vehicleEntity.setYear(dto.getYear());
        vehicleEntity.setAdvertisement(advertisementEntity);
        vehicleEntity.setBrand(dto.getBrand());
        vehicleEntity.setFree(dto.isFree());
        vehicleEntity.setExchange(dto.isExchange());
        vehicleEntity.setOnSale(dto.isOnSale());
        vehicleEntity.setResidential(dto.isResidential());
        vehicleEntity.setAddress(dto.getAddress());

        if (vehicleEntity instanceof CarEntity) {
            vehicleService.save((CarEntity) vehicleEntity);
        }

        if (vehicleEntity instanceof HeavyVehicleEntity) {
            vehicleService.save((HeavyVehicleEntity) vehicleEntity);
        }


        return "redirect:/home";

    }



}
