package com.riwi.riwi_ecomerce.api.dto.response;

import java.math.BigDecimal;
import java.util.List;

import com.riwi.riwi_ecomerce.domain.entities.CategoryEntity;
import com.riwi.riwi_ecomerce.domain.entities.ProductToPurchase;
import com.riwi.riwi_ecomerce.domain.entities.ShoppingCart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;
    private Integer stock;
    private CategoryEntity category;
    private ShoppingCart shoppingCart;
    private List<ProductToPurchase> purchases;
}
