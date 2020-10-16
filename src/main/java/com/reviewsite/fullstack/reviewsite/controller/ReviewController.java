package com.reviewsite.fullstack.reviewsite.controller;

import com.reviewsite.fullstack.reviewsite.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

    private ReviewRepository reviewRepo;


    public ReviewController(ReviewRepository reviewRepo){
        this.reviewRepo = reviewRepo;
    }

    @RequestMapping("reviews/{showTitle}")
    public String showSingleReview(@PathVariable String showAlbumName, Model model){
        model.addAttribute("reviews", reviewRepo.findReviewByAlbumName(showAlbumName));
        return "reviewTemplate";
    }
}
