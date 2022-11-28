@Controller
public class AppController {
	@RequestMapping(value = "/home/{page}")
	public String home(@PathParam String page,
			@RequestHeader("Accept-Encoding") String encoding) {
		return "index.jsp";
	}
}
