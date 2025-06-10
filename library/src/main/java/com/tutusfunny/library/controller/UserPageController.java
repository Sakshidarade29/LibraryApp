package com.tutusfunny.library.controller;

import com.tutusfunny.library.dto.UserDTO;

import com.tutusfunny.library.dto.UserSaveDTO;
import com.tutusfunny.library.dto.UserUpdateDTO;
import com.tutusfunny.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserPageController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user-list";
    }

    @GetMapping("/add")
    public String showAddUserForm(Model model) {
        model.addAttribute("user", new UserSaveDTO());
        return "user-add";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") UserSaveDTO userSaveDTO) {
        userService.addUser(userSaveDTO);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        UserDTO user = userService.getAllUser()
                                  .stream()
                                  .filter(u -> u.getUserid() == id)
                                  .findFirst()
                                  .orElse(null);
        if (user != null) {
            UserUpdateDTO updateDTO = new UserUpdateDTO(user.getUserid(), user.getName(), user.getEmail());
            model.addAttribute("user", updateDTO);
            return "user-edit";
        }
        return "redirect:/users";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute("user") UserUpdateDTO userUpdateDTO) {
        userService.updateUser(userUpdateDTO);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
