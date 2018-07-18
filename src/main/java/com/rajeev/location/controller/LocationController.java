package com.rajeev.location.controller;

import java.util.List;
import java.util.Optional;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.rajeev.location.entity.Location;
import com.rajeev.location.repos.LocationReposgatry;
import com.rajeev.location.service.EmailUtil;
import com.rajeev.location.service.LocationService;
import com.rajeev.location.service.ReportUtil;
/**
 * 
 * @author Rajeev
 *
 */
@Controller
public class LocationController {
	@Autowired
	LocationService service;
	@Autowired
	EmailUtil emailUtil;
	@Autowired
	LocationReposgatry re;
	@Autowired
	ReportUtil reportUtil;
	
	@Autowired
	ServletContext sc;
	
		@RequestMapping("/showCreate")
       public String showCreate() {
    	   return "createLocation";
       }
		@RequestMapping("/saveloc")
		public String saveLocation(@ModelAttribute("location")Location location,ModelMap modelmap) {
			service.saveLocation(location);
			String msg="LocationSaveWithId:------>>> "+location.getId()+" "+location.getName()+" "+location.getCode()+" "+location.getType();
			modelmap.addAttribute("msg", msg);
			emailUtil.sendEmail("rajeev28492849@gmail.com","Location Saved","Location Seved Successfully and About to return a Responce");
			System.out.println("email Succussfuly Send");
			return "createLocation";
		}
		@RequestMapping("/displayLocation")
		public String displayLocation(ModelMap modelmap) {
			List<Location> locations=service.getAllLocation();
			modelmap.addAttribute("locations",locations);
			return "displayLocation";
		}
		
		@RequestMapping("/deleteLocation")
		public String deleteLocation(@RequestParam("id")int id,ModelMap modelmap) {
			Location location=new Location();
			location.setId(id);
			service.deleteLocation(location);
			List<Location> locations=service.getAllLocation();
			modelmap.addAttribute("location", locations);
			return "displayLocation";
		}
		
		@RequestMapping("/showUpdate")
		public String showUpdate(@RequestParam("id")int id,ModelMap modelmap) {
			Optional<Location> locations=service.getLocationById(id);
			modelmap.addAttribute("location", locations);
			return "updateLocation";
		}
		
		
		@RequestMapping("/upadteLoc")
		public String updateLocation(@ModelAttribute("location")Location location,ModelMap modelmap) {
			service.deleteLocation(location);
			List<Location> locations=service.getAllLocation();
			modelmap.addAttribute("location", locations);
			return "displayLocation";
		}
		
		@RequestMapping("/genrateReport")
		public String genrateReport() {
			try {
			String path=sc.getRealPath("/");
			List<Object[]> data=re.findAndTypeCount();
			reportUtil.genratePieChart(path, data);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "report";
		}
		
}
