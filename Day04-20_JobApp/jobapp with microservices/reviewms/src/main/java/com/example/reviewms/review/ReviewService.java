package com.example.reviewms.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    Boolean addReview(Long companyId, Review review);
    Review getReviewById(Long reviewId);
    Boolean updateReview(Long reviewId, Review updatedReview);
    Boolean deleteReview(Long reviewId);
}
