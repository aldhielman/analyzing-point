package id.go.beacukai.bcperak.ap.service;

import id.go.beacukai.bcperak.ap.entity.Tag;

import java.util.List;

public interface TagService {
    List<Tag> findAll();

    Tag findById(Long id);

    Tag update(Long id,Tag tag);

    Tag create(Tag tag);

    void delete(Long id);
}
