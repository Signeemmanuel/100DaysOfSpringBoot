package com.example.jobapp.review;


import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    boolean addReview(Review review, Long companyId);
    Review getReview(Long companyId, Long reviewId);

    boolean updateReview(Review updateReview, Long companyId, Long reviewId);
    boolean deleteReview(Long companyId, Long reviewId);
}
