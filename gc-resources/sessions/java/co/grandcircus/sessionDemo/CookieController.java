package co.grandcircus.sessionDemo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CookieController {

	@Autowired
	private HttpServletResponse response;
	
	@RequestMapping("/cookie")
	public ModelAndView showCount(@CookieValue(name = "count",required = false) String cookie) {
		ModelAndView mv = new ModelAndView("cookies");
		mv.addObject("cookieCount",cookie);
		return null;
	}
	
	@RequestMapping("/cookie/add")
	public ModelAndView addCookie(@CookieValue(name = "count",defaultValue = "0") Integer oldCount) {
		Integer newCount = oldCount + 1;
		Cookie cookie = new Cookie("count",String.valueOf(newCount));
		cookie.setMaxAge(30);
		response.addCookie(cookie);
		return new ModelAndView("redirect:/cookie");
		
	}
}
