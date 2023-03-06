package com.SGSJ.JavaspringCRUD.model.Images;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImagesCrud extends CrudRepository<Images, Long> {
    @Query(value = "SELECT * FROM images WHERE user_id = ?1", nativeQuery = true)
    List<Images> findByUserId(Long userId);
    @Query(value = "SELECT * FROM images WHERE image_url = ?1", nativeQuery = true)
    Images findByUrl(String url);
}
