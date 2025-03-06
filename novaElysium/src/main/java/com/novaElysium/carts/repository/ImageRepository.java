package com.novaElysium.carts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.novaElysium.carts.model.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
}
