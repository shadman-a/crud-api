package dev.shadmanahmed.crudapi.repository;

import dev.shadmanahmed.crudapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository extends JpaRepository<Product,Integer> {
}
