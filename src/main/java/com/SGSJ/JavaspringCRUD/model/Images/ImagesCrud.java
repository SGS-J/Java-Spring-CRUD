package com.SGSJ.JavaspringCRUD.model.Images;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface ImagesCrud extends CrudRepository<Images, Long> {
    @Query(value = "SELECT * FROM images WHERE user_id = ?1", nativeQuery = true)
    Images findByUserId(Long userId);
}
