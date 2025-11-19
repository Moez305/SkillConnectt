package or.perso.skillconnec.repository;

import or.perso.skillconnec.entities.Parent;
import org.springframework.data.repository.CrudRepository;

public interface IParentRepository extends CrudRepository<Parent, Long> {
    //May ipmlement later when i hav time List<Parent> findByName(String name);
}
