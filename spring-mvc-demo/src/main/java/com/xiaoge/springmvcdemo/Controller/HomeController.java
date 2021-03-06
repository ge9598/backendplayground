package com.xiaoge.springmvcdemo.Controller;

import Response.ErrorResponse;
import com.xiaoge.springmvcdemo.Exception.invalidUserExpection;
import com.xiaoge.springmvcdemo.Pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "world")String name,  User user,
                           Model model){
        if(validate(user.getUsername(), user.getPassword())){
            model.addAttribute("user", user);
            return "greeting";
        }
        return "error";

    }
    @PostMapping ("/greetingV2")
    //For some reason, requestParam is getting both th params and name = params. Even though username and password is part of user
    public String greetingV2(@RequestParam(name="username") String name, @RequestParam("password") String password,
                             Model model){

            model.addAttribute("name", name);
            model.addAttribute("password", password);
            System.out.println(name + " " + password);
            return "greetingV2";



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
