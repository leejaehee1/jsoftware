package com.jsoftware.platform;

import com.jsoftware.platform.database.model.Product;
import com.jsoftware.platform.database.repository.ProductRepository;
import com.jsoftware.platform.database.repository.ProductRepositoryImpl;
import com.jsoftware.platform.database.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class PlatformApplicationTests {

    @Autowired
    private ProductRepositoryImpl productRepository;

    @Test
    public void getProductById() {
        Product product = productRepository.selectProductById(1);
        System.out.println("product : " + product);
//        log.info("product : {}", product);
    }
}
