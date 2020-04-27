package co.grandcircus.sessionDemo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.sessionDemo.model.UserPreferences;

@Controller
public class SessionController {

	@Autowired
	private HttpSession sesh;
	
	@RequestMapping("/session")
	public ModelAndView showSessions() {
		ModelAndView mv = new ModelAndView("session");
		
		mv.addObject("sessionId",sesh.getId());
		return mv;
	}
	@PostMapping("/session")
	public ModelAndView setPref(UserPreferences pref) {
		sesh.setAttribute("preferences",pref);
		return new ModelAndView("redirect:/session");
	}
	
	
}
