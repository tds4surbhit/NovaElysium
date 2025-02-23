package com.novaElysium.carts.service.image;

import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile File, Long productId);
    void updateImage(MultipartFile image, Long imageId);

}
