package com.novaElysium.carts.service.image;

import com.novaElysium.carts.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
@RequiredArgsConstructor
public class ImageService implements IImageService {

    private final ImageRepository imageRepository;
    private final IProductService  productService;

    @Override
    public Image getImageById(Long id) {
        return imageRepository.findById(id).orElseThrow(() -> )
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
