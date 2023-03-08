package com.SGSJ.JavaspringCRUD.domain.Image;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository {
    List<Image> getAll();
    Optional<Image> getById(Long id);
    Optional<Image> getByUrl(String url);
    Optional<List<Image>> getByUserId(Long userId);
    Image add(Image image);
    void deleteById(Long id);
}
