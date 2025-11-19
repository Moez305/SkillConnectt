package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Tutor;

public interface ITutorService {
    Tutor createTutor(Tutor tutor);
    Tutor getTutorById(Long id);
    Iterable<Tutor> getAllTutors();
    Tutor updateTutor(Long id, Tutor tutor);
    void deleteTutor(Long id);
}
