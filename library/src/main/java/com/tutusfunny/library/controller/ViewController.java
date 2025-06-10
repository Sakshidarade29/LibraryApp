package com.tutusfunny.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController
{
    @GetMapping("/borrow")
    public String borrowPage() 
    {
        return "borrow";  
    }
    
    @GetMapping("/publisher")
    public String publisherPage() {
        return "publisher";  // Loads publisher.html from templates
    }
}
