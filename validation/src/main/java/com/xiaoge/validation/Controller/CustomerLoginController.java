package com.xiaoge.validation.Controller;

import com.xiaoge.validation.Pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class CustomerLoginController implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/result").setViewName("result");
    }

    @GetMapping("/")
    public String showMain(Customer customer){
        return "customer-form";
    }
    @PostMapping("/")
    public String checkPersonInfo( @Valid Customer customer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return"customer-form";
        }
        return "redirect:/result";


    }
}
