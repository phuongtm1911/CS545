package mum.controller;

import mum.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdviceController {
	@Autowired
	AdviceService adviceService;

	@GetMapping("/advice.do")
	public String getRoast(Model model) {
		Map< String, String > roastMap = new HashMap<String, String>();
		roastMap.put("Light", "light");
		roastMap.put("Medium", "medium");
		roastMap.put("Dark", "dark");
		model.addAttribute("roasts", roastMap);
		return "advice";
	}

	@PostMapping("/advice.do")
	public String getAdvices(Model model, @RequestParam String roast) {
		model.addAttribute("roastList", adviceService.getAdvice(roast.substring(1)));
		model.addAttribute("roast", roast.substring(1).toUpperCase());
		return "display";
	}

}
