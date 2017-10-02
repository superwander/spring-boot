package com.boot.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
//    @RequestMapping("")
//    public String index(){
//        return "examples/index";
//    }
      @RequestMapping(value="/abc",method=RequestMethod.GET)
      //@ResponseBody
      String home(HttpServletResponse response,Model model) throws IOException {
    	 model.addAttribute("name", "wangwu");
         return "hello";
      }
}
