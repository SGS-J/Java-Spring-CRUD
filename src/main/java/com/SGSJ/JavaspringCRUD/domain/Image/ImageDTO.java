package com.SGSJ.JavaspringCRUD.domain.Image;

import com.SGSJ.JavaspringCRUD.model.Images.Images;
import com.SGSJ.JavaspringCRUD.model.Images.ImagesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImageDTO {

    @Autowired
    private ImagesMapper mapper;

    public Image toImageDomain(Images image) {
        return mapper.toImageDomain(image);
    }

    public List<Image> toImagesDomain(List<Images> images) {
        return mapper.toImagesDomain(images);
    }

    public Images toImageModel(Image image) {
        return mapper.toImageModel(image);
    }

    public List<Images> toImagesModel(List<Image> images) {
        return mapper.toImagesModel(images);
    }
}
