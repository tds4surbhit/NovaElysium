package com.novaElysium.carts.service.image;

import org.springframework.web.multipart.MultipartFile;

public class ImageService extends  IImageService{
    @Override
    public Image getImageById(Long id) {
        return null;
    }

    @Override
    public void deleteImageById(Long id) {

    }

    @Override
    public Image saveImage(MultipartFile File, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile image, Long imageId) {

    }
}
