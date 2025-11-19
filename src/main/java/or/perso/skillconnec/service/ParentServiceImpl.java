package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Parent;
import or.perso.skillconnec.repository.IParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParentServiceImpl implements IParentService {
    @Autowired
    IParentRepository parentRepository;
    @Override
    public Parent createParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public Parent getParentById(Long id) {
        return parentRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Parent> getAllParents() {
        return parentRepository.findAll();
    }

    @Override
    public Parent updateParent(Long id, Parent parent) {
        parent.setId(id);
        return parentRepository.save(parent);
    }

    @Override
    public void deleteParent(Long id) {
        parentRepository.deleteById(id);

    }
}
