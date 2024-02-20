package edu.fisa.step07_citest_itj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController07 {
	@GetMapping("getdata")
	public String get(){
		return "FISA DATA - STEP 07";
	}
}
