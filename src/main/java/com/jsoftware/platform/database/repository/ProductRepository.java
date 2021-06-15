package com.jsoftware.platform.database.repository;

import com.jsoftware.platform.database.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductRepository {

    Product selectProductById(long id);

    List<Product> selectAllProducts();

    void insertProduct(Product product);
}