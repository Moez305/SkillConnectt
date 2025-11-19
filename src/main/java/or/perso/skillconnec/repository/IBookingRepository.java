package or.perso.skillconnec.repository;

import or.perso.skillconnec.entities.Booking;
import org.springframework.data.repository.CrudRepository;

public interface IBookingRepository extends CrudRepository<Booking, Long> {
    // May ipmlement later when i have time: List<Booking> findByParentId(Long parentId);
    // May ipmlement later when i have time: List<Booking> findByTutorId(Long tutorId);
}
