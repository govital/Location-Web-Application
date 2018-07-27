package com.udemy.e2elocationweb.controllers;

import com.udemy.e2elocationweb.entities.Location;
import com.udemy.e2elocationweb.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("saveLoc")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedLocation = service.saveLocation(location);
        String msg = "location saved with id: " + savedLocation.getId();
        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("displayLocations")
    public String getAllLocations(@ModelAttribute("location")Location location, ModelMap modelMap){
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }



    @RequestMapping("/showHello")
    public String showHello() {
        return "helloLocation";
    }
}
