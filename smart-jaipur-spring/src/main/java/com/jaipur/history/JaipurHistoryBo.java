package com.jaipur.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class JaipurHistoryBo {
	
	@Autowired
	private HistoryObject history;
	
	@GetMapping(value= "/welcome")
	@ResponseBody
	public String retrieveWelcomeMessage(@RequestParam(value= "place", defaultValue= "Ajmeri Gate", required=false) String localPlace) {
		// Complex Method //
		return this.history.getPlace(localPlace);
	}
	
}
