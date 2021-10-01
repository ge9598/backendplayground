package com.xiaoge.validation.Controller;

import com.xiaoge.validation.Pojo.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerLoginController {

    @GetMapping("/")
    public String showCustomerForm(Customer customer, Model model){
        model.addAttribute("customer", customer);
        System.out.println("in get");
        return "customer-form";
    }
    @PostMapping("/")
    public String checkPersonInfo(@Valid Customer customer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("in post");
            return"customer-form";
        }
        return "redirect:/result";
    }
}
