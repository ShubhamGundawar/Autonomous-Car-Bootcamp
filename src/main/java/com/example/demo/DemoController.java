package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.Car;

import com.example.demo.service.Road;

@Controller
public class DemoController {
	
	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request,HttpServletResponse response)
	{
		String i=request.getParameter("t1");
		double j=Double.parseDouble(request.getParameter("t2"));
		Car c=new Car();
		Road r2=c.compute(i,j);
		double totaltime=r2.getTotaltimetaken();
		int refuel=r2.getRefuelCount();
		double totaldistance=r2.getTotaldistance();
		
		System.out.println("home" + totaltime + " " + refuel + " " + totaldistance);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("totaltime",totaltime );
		mv.addObject("refuel",refuel );
		mv.addObject("totaldistance",totaldistance );
		
		//System.out.println("hello");
		return mv;
		//return "display.jsp";
	}

	@RequestMapping("/")
	public String welcome()
	{
		System.out.println("welcome");
		return "home.jsp";
	}

}
