package com.jsoftware.platform.database.model;

import lombok.*;
import org.apache.ibatis.type.Alias;

@NoArgsConstructor @RequiredArgsConstructor @Getter @Setter @ToString
public class Product {

    private Long prodId;
    @NonNull private String prodName;
    @NonNull private int prodPrice;
}