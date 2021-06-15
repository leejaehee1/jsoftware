package com.jsoftware.platform.database.service;

import com.jsoftware.platform.database.model.Product;
import com.jsoftware.platform.database.repository.ProductRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

/*    @Autowired
    private SqlSession sqlSessionTemplate;

    public Product getProductById(Long id) {
        return sqlSessionTemplate.selectProductById(id);
    }

    public List<Product> getAllProducts() {

        return productRepository.selectAllProducts();
    }

    @Transactional
    public void addProduct(Product product) {

        productRepository.insertProduct(product);
    }*/
}