package react.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() { 
		log.info("#### MainController - index() method invoked ");
		return "index"; 
	}
}
