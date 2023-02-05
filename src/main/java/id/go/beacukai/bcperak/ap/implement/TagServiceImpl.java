package id.go.beacukai.bcperak.ap.implement;

import id.go.beacukai.bcperak.ap.entity.Tag;
import id.go.beacukai.bcperak.ap.repository.TagRepository;
import id.go.beacukai.bcperak.ap.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;


    @Override
    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    @Override
    public Tag findById(Long id) {
        return tagRepository.getOne(id);
    }

    @Override
    public Tag update(Long id, Tag tag) {
        tag.getId();
        return tagRepository.save(tag);
    }

    @Override
    public Tag create(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void delete(Long id) {
        tagRepository.deleteById(id);
    }
}
