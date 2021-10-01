package com.xiaoge.validation.Controller;

import com.xiaoge.validation.Pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.validation.Valid;

@Controller
public class CustomerLoginController{


    @GetMapping("/")
    public String showMain( Model model){
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }


    @PostMapping("/")
    public String checkPersonInfo(@ModelAttribute @Validated Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return"customer-form";
        }

        // using flash for redirection
        redirectAttributes.addFlashAttribute("customer", customer);
        return "redirect:result";


    }
    @GetMapping("/result")
    public String showInfo(Model m, Customer c){
        m.addAttribute("customer", c);
        return "result";
    }
}
