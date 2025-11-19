package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Parent;

public interface IParentService {
    Parent createParent(Parent parent);
    Parent getParentById(Long id);
    Iterable<Parent> getAllParents();
    Parent updateParent(Long id, Parent parent);
    void deleteParent(Long id);
}
