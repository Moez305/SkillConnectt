package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Review;
import or.perso.skillconnec.repository.IReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements IReviewService {
    @Autowired
    IReviewRepository reviewRepository;

    @Override
    public Review getReviewById(Long id) {
        return reviewRepository.findById( id).orElse(null);
    }

    @Override
    public Iterable<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save( review );
    }

    @Override
    public Review updateReview(Long id, Review review) {
        review.setId( id );
        return reviewRepository.save( review );
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);

    }
}
