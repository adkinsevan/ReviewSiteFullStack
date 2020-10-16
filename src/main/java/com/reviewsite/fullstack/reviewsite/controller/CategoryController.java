package com.reviewsite.fullstack.reviewsite.controller;

import com.reviewsite.fullstack.reviewsite.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    CategoryRepository categoryRepo;

    public CategoryController(CategoryRepository categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    @RequestMapping("categories")
    public String showAllCategories(Model model){
        model.addAttribute("categoryNames", categoryRepo.findAll());
        return "categoriesTemplate";
    }

//    @RequestMapping("categories/{categoryName}")
//    public String
}
