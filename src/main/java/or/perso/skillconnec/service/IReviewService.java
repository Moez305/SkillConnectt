package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Review;

public interface IReviewService {
    Review getReviewById(Long id);
    Iterable<Review> getAllReviews();
    Review createReview(Review review);
    Review updateReview(Long id, Review review);
    void deleteReview(Long id);
}
