package com.SGSJ.JavaspringCRUD.controller;


import com.SGSJ.JavaspringCRUD.domain.Image.Image;
import com.SGSJ.JavaspringCRUD.domain.Image.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageRepository imageRepo;

    @GetMapping("/all")
    public List<Image> getAll() {
        return imageRepo.getAll();
    }

    @GetMapping("/{imageId}")
    public Optional<Image> getImageById(@PathVariable Long imageId) {
        return imageRepo.getById(imageId);
    }

    @PostMapping(value = "/add", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> addImage(@RequestBody Image image) {
        try {
            return new ResponseEntity<>(imageRepo.add(image), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Invalid format!", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/")
    public void deleteImage(@PathVariable Long imageId) {
        imageRepo.deleteById(imageId);
    }
}
