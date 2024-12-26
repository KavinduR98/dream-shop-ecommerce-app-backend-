package com.ushan.dream_shops.service.image;

import com.ushan.dream_shops.dto.ImageDto;
import com.ushan.dream_shops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
     Image getImageById(Long id);
     void deleteImageById(Long id);
     List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
     void updateImage(MultipartFile file, Long imageId);
}