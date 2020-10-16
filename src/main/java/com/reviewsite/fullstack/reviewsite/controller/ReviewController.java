package com.reviewsite.fullstack.reviewsite.controller;

import com.reviewsite.fullstack.reviewsite.models.Reviews;
import com.reviewsite.fullstack.reviewsite.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ReviewController {

    @Resource
    private ReviewRepository reviewRepo;

    @RequestMapping({"/reviews","/",""})
    public String displayAllReviews(Model model){
        model.addAttribute("reviews", reviewRepo.findAll());
        return "reviewsTemplate";
    }

    @RequestMapping("reviews/{id}")
    public String showSingleReview(@PathVariable long id, Model model){
        Optional<Reviews> gotReview = reviewRepo.findById(id);
        Reviews foundReview = gotReview.get();
        model.addAttribute("reviews", foundReview);
        return "reviewTemplate";
    }
//    @GetMapping("reviews/{albumName}")
//    public String displayReviewByAlbumName(@PathVariable, String albumName, Model model){
//        Optional<Reviews> gotReview = reviewRepo.findByAlbumName(albumName);
//        Reviews foundReview = gotReview.get();
//        model.addAttribute("reviews", foundReview);
//        return "reviewTemplate";
//    }
}
