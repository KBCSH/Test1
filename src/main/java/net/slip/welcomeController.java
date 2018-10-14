package net.slip;

import java.awt.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//Mustach 템플릿을 사용하기 위해 반드시 사용
//컨트롤러 인지 아닌지 알 수 없기 때문에 자바에 annotation 사용
@Controller
public class welcomeController {

	@PostMapping("/welcome")
	public String welcome(Model model,String name) {
		if(name!="") {
			System.out.println("name="+name);
			model.addAttribute("name",name);
			
		}
		return "welcome";
	}
}
