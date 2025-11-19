package or.perso.skillconnec.repository;

import or.perso.skillconnec.entities.Review;
import org.springframework.data.repository.CrudRepository;

public interface IReviewRepository extends CrudRepository<Review, Long> {
    // May ipmlement later when i have time List<Review> findByTutorId(Long tutorId);
}
