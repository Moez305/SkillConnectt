package or.perso.skillconnec.repository;

import or.perso.skillconnec.entities.Subject;
import org.springframework.data.repository.CrudRepository;

public interface ISubjectRepository extends CrudRepository<Subject, Long> {
    // May ipmlement later when i have timee: Subject findByName(String name);
}
