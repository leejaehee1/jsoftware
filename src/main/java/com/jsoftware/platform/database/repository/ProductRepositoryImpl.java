package com.jsoftware.platform.database.repository;

import com.jsoftware.platform.database.model.Product;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    SqlSessionFactory sqlSession;

    @Override
    public Product selectProductById(long id) {
        Product product = new Product();
        product.setProdId(id);
        return sqlSession.openSession().selectOne("selectProductById", product);
    }

    @Override
    public List<Product> selectAllProducts() {
        return sqlSession.openSession().selectList("selectAllProducts");
    }

    @Override
    public void insertProduct(Product product) {
        sqlSession.openSession().insert("insertProduct", product);
    }

}