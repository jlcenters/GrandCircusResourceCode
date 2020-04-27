package co.grandcircus.madlib;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MadlibController {

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/madlib-form")
	public ModelAndView showform() {
		return new ModelAndView("form");
	}
	
	@RequestMapping("/madlib-story")
	public ModelAndView submitForm(
			@RequestParam("noun")String noun, 
			@RequestParam("verb")String verb, 
			@RequestParam("adjective")String adjective, 
			@RequestParam("adverb")String adverb
			) {
		ModelAndView mv = new ModelAndView("story");
		mv.addObject("noun", noun);
		mv.addObject("verb", verb);
		mv.addObject("adjective", adjective);
		mv.addObject("adverb", adverb);
		
		return mv;
	}
}
