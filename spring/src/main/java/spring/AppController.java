package spring;

import javax.swing.text.html.parser.Entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class AppController {

	@RequestMapping(value= "/home/{page}")
	public String home(@RequestParam String page,
			@RequestHeader("Accept-Encoding")String encoding,
			@CookieValue("languaje") String lang,
			@RequestBody Entity entity
			) {
		return "index.jsp";
	}
}
