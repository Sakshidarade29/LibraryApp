package com.tutusfunny.library.web;

import com.tutusfunny.library.dto.AuthorDTO;
import com.tutusfunny.library.dto.AuthorUpdateDTO;
import com.tutusfunny.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
public class AuthorWebController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public String viewAuthors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthor());
        return "authors";
    }

    @PostMapping("/add")
    public String addAuthor(@RequestParam("name") String name) {
        authorService.addAuthor(new com.tutusfunny.library.dto.AuthorSaveDTO(name));
        return "redirect:/authors";
    }

    @GetMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable int id) {
        authorService.deleteAuthor(id);
        return "redirect:/authors";
    }

    // ✅ Place your edit/update methods here:
    @GetMapping("/edit/{id}")
    public String editAuthorForm(@PathVariable int id, Model model) {
        AuthorDTO author = authorService.getAllAuthor().stream()
                .filter(a -> a.getAuthorid() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("author", author);
        return "edit-author";
    }

    @PostMapping("/update")
    public String updateAuthor(@RequestParam int authorid, @RequestParam String name) {
        authorService.updateAuthor(new AuthorUpdateDTO(authorid, name));
        return "redirect:/authors";
    }
}
