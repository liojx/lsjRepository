package studiii.zlsj_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Xgrcontroller {
	
	@RequestMapping("/T25")
	void prit() {
		System.out.println("Now ,i am bigger...");
	}

	@RequestMapping("/T29")
	@ResponseBody
	public String getSome(){
		return  "some one is coming...";
	}
	
	@RequestMapping("/T30")
	String getOnePeaceOFCake(){
		return "tomcat navicat";
	}
}
