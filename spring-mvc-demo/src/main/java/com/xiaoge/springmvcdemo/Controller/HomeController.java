package com.xiaoge.springmvcdemo.Controller;

import Response.ErrorResponse;
import com.xiaoge.springmvcdemo.Exception.invalidUserExpection;
import com.xiaoge.springmvcdemo.Pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showMyPage(Model model){
        model.addAttribute("user", new User());
        return "#";
    }
//    @PostMapping ("/showForm")
//    public String formSubmit(@ModelAttribute User user, Model model){
//        model.addAttribute("user", user);
//        return "showForm";
//    }


    @PostMapping ("/greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "world")String name, User user, Model model, HttpServletResponse httpServletResponse){
        if(validate(user.getUsername(), user.getPassword())){
            model.addAttribute("name", name);
            model.addAttribute("user", user);
            return "greeting";
        }
        return "error";

    }

    private boolean validate(String username, String password) {
        //TODO: implement database side to check authentication
        if(username.equals("admin") && password.equals("admin"))return true;
        return false;
    }
//    @ExceptionHandler(invalidUserExpection.class)
//    public ResponseEntity exceptionHandler(Exception e){
//
//        return new ResponseEntity(new ErrorResponse("User can not found", "404"), HttpStatus.NOT_FOUND);
//    }


}
