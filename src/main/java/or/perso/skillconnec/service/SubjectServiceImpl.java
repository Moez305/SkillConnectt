package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Subject;
import or.perso.skillconnec.repository.ISubjectRepository;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements ISubjectService {
    ISubjectRepository subjectRepository;
    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject updateSubject(Long id, Subject subject) {
        subject.setId(id);
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);

    }
}
