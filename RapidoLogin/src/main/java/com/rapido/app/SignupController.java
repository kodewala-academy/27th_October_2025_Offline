package com.rapido.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

	@RequestMapping("showPage")
	public ModelAndView showSignUpPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sign-up"); // display sign-up.jsp
		return mv;
	}

	@RequestMapping("signup")
	@ResponseBody
	public String signup(@RequestParam("mobile") String mobile, @RequestParam("email") String email,
			@RequestParam("location") String location, @RequestParam("otp") String otp) {
		System.out.println(" Request Received and data received as part of request : mobile :" + mobile + ", email : "
				+ email + " , location" + location + " , otp : " + otp);

		String input = mobile + email;
		String refId = java.util.UUID.nameUUIDFromBytes(input.getBytes()).toString().replace("-", "").substring(0, 8)
				.toUpperCase();
		System.out.println("Generated Ref id " + refId);
		return "Registration Successful and It is pending for verification and ref id is : " + refId;
	}

}
