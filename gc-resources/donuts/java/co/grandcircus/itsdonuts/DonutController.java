package co.grandcircus.itsdonuts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.itsdonuts.entities.Donut;
import co.grandcircus.itsdonuts.entities.DonutsResponse;
@Controller
public class DonutController {

	@Autowired
	private ApiService api;
	
	@RequestMapping("/")
	public ModelAndView home() {
		DonutsResponse donuts = api.getDonuts();
		ModelAndView mv = new ModelAndView("index","donuts",donuts);
		return mv;
	}
	
//	@RequestMapping("/")
//	public static ModelAndView home() {
//		List<Donut> donuts = api.getDonuts();
//		ModelAndView mv = new ModelAndView("index");
//		return mv;
//	}
}
