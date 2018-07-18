package com.rajeev.location.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.rajeev.location.entity.*;
import com.rajeev.location.repos.LocationReposgatry;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/locations")
public class RestController {
    @Autowired  
	LocationReposgatry locationReposatry;
      
    @GetMapping
    public List<Location> getLocation(){
    	return locationReposatry.findAll();
    }
    @PostMapping
    public Location CreateLocation(@RequestBody Location location){
    	return locationReposatry.save(location);
    }
    
    
    @PutMapping
    public Location upadteLocation(@RequestBody Location location){
    	return locationReposatry.save(location);
    }
    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id")int id){
    	locationReposatry.deleteById(id);
    }
    @GetMapping("/{id}")
    public void getLocation(@PathVariable("id")Integer id) {
    	locationReposatry.findOne(id);
    }
}
