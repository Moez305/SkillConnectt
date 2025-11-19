package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Tutor;
import or.perso.skillconnec.repository.ITutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorServiceImpl implements ITutorService {
    @Autowired
    ITutorRepository tutorRepository;
    @Override
    public Tutor createTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    @Override
    public Tutor getTutorById(Long id) {
        return tutorRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Tutor> getAllTutors() {
        return tutorRepository.findAll();
    }

    @Override
    public Tutor updateTutor(Long id, Tutor tutor) {
        tutor.setId(id);
        return tutorRepository.save(tutor);
    }

    @Override
    public void deleteTutor(Long id) {
        tutorRepository.deleteById(id);

    }
}
