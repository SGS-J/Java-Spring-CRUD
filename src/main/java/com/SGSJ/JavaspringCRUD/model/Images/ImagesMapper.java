package com.SGSJ.JavaspringCRUD.model.Images;

import com.SGSJ.JavaspringCRUD.domain.Image.Image;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ImagesMapper {
    @Mappings({
            @Mapping(source = "imageId", target = "imageId"),
            @Mapping(source = "imageUrl", target = "imageUrl"),
            @Mapping(source = "user", target = "user")
    })
    Image toImageDomain(Images image);
    List<Image> toImagesDomain(List<Images> images);

    @InheritInverseConfiguration
    Images toImageModel(Image image);
    List<Images> toImagesModel(List<Image> images);

}
