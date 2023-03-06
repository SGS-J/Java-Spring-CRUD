package com.SGSJ.JavaspringCRUD.domain.Image;

import com.SGSJ.JavaspringCRUD.model.Images.Images;
import com.SGSJ.JavaspringCRUD.model.Images.ImagesCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService implements ImageRepository{

    @Autowired
    private ImageDTO imageDto;
    @Autowired
    private ImagesCrud imagesCrud;
    @Override
    public List<Image> getAll() {
        return imageDto.toImagesDomain((List<Images>) imagesCrud.findAll());
    }

    @Override
    public Optional<Image> getById(Long id) {
        Optional<Images> imageModel =  imagesCrud.findById(id);
        if(imageModel.isEmpty()){
            return Optional.empty();
        }
        Image image = imageDto.toImageDomain(imageModel.get());
        return Optional.of(image);
    }

    @Override
    public Optional<Image> getByUrl(String url) {
        Optional<Images> imageModel = Optional.ofNullable(imagesCrud.findByUrl(url));
        if(imageModel.isEmpty()){
            return Optional.empty();
        }
        Image image = imageDto.toImageDomain(imageModel.get());
        return Optional.of(image);
    }

    @Override
    public Optional<List<Image>> getByUserId(Long userId) {
        Optional<List<Images>> imageModel = Optional.ofNullable(imagesCrud.findByUserId(userId));
        if(imageModel.isEmpty()){
            return Optional.empty();
        }
        List<Image> image = imageDto.toImagesDomain(imageModel.get());
        return Optional.of(image);
    }
}
