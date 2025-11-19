package or.perso.skillconnec.repository;

import or.perso.skillconnec.entities.Tutor;
import org.springframework.data.repository.CrudRepository;

public interface ITutorRepository extends CrudRepository<Tutor, Long> {
    // May ipmlement later when i have time: List<Tutor> findBySubjects_Name(String subjectName);
    //May ipmlement later when i have time:  List<Tutor> findByPriceLessThan(Double maxPrice);
}
