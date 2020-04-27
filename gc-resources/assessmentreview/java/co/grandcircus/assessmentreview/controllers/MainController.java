package co.grandcircus.assessmentreview.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import co.grandcircus.assessmentreview.entities.Hotel;
import co.grandcircus.assessmentreview.repositories.HotelRepo;

@Controller
public class MainController {

	@Autowired
	HotelRepo hrepo;
	
	@RequestMapping("/")
	public ModelAndView index() {
	List<String> cities = hrepo.findAllCity();
		return new ModelAndView("index","cities",cities);
	}
	
	@RequestMapping("/hotels")
	public ModelAndView findByCity(@RequestParam("city")String city) {
	List<Hotel> hotels = hrepo.findHotelByCity(city);
		return new ModelAndView("narrow-search","hotels",hotels);
	}
}
