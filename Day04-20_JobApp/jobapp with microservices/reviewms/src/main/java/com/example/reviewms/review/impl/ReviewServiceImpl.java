package com.example.reviewms.review.impl;

import com.example.reviewms.review.Review;
import com.example.reviewms.review.ReviewRepository;
import com.example.reviewms.review.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }

    @Override
    public Boolean addReview(Long companyId, Review review) {
        if (companyId != null && review != null) {
            review.setCompanyId(companyId);
            reviewRepository.save(review);
            return true;
        }
        return false;
    }

    @Override
    public Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    @Override
    public Boolean updateReview(Long reviewId, Review updatedReview) {
        Review review = getReviewById(reviewId);
        if (review != null) {
            updatedReview.setId(reviewId);
            reviewRepository.save(updatedReview);
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteReview(Long reviewId) {
        Review review = getReviewById(reviewId);
        if (review != null) {
            reviewRepository.deleteById(reviewId);
            return true;
        }
        return false;
    }
}
