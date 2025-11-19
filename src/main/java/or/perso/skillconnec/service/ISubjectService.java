package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Subject;

public interface ISubjectService {
    Subject createSubject(Subject subject);
    Subject getSubjectById(Long id);

    Iterable<Subject> getAllSubject();
    Subject updateSubject(Long id, Subject subject);
    void deleteSubject(Long id);

}
