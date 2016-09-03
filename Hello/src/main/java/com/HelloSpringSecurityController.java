package com;


import java.io.Console;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
 
@Controller  
public class HelloSpringSecurityController {  
     
  @RequestMapping("/hello")  
  public ModelAndView hello(){  
      ModelAndView mav = new ModelAndView();  
      mav.addObject("title", "Welcome - Spring Security Hello World");  
      mav.addObject("message", "This is welcome page!");  
      mav.setViewName("/hello");  
      return mav;  
  }  
     
  @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)  
   public ModelAndView welcome() {  
	  System.out.println("WELCOM...");
      ModelAndView mav = new ModelAndView();  
      mav.addObject("title", "Welcome - Spring Security Hello World");  
      mav.addObject("message", "This is welcome page!");  
      mav.setViewName("/hello");  
      return mav;  
   }  
     
   @RequestMapping(value = "/admin", method = RequestMethod.GET)  
        public ModelAndView admin() {  
       
            ModelAndView mav = new ModelAndView();  
            mav.addObject("title", "Admin - Spring Security Hello World");  
            mav.addObject("message", "This is protected page!");  
            mav.setViewName("/admin");  
           return mav;  
      
      }  
      
   }  
 