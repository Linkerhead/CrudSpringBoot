package com.example.CrudSpringBoot.Controllers;


import com.example.CrudSpringBoot.Model.User;
import com.example.CrudSpringBoot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {


    private final UserService userService;

    @Autowired
    public PeopleController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/adduser")
    public String CreateUserForm(@ModelAttribute("user") User user) {
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") long id) {
        userService.deleteById(id);
        return "redirect:/";
    }


    @GetMapping("/updateuser")
    public String UpdateUserForm(@RequestParam("id") long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "updateuser";
    }

    @PostMapping("/updateuser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }




}
