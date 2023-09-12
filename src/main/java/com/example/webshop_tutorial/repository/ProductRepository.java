package com.example.webshop_tutorial.repository;

import com.example.webshop_tutorial.model.ProductResponse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public List<ProductResponse> findAll(String tag) {
        List<ProductResponse> products = Arrays.asList(
                new ProductResponse(
                        "1",
                        "AMD",
                        "lorem ipsum",
                        790899,
                        Arrays.asList("AMD", "Processor")
                ),
                new ProductResponse(
                        "2",
                        "Intel",
                        "lorem ipsum",
                        863499,
                        Arrays.asList("Intel", "Processor")
                )
        );

        if(tag == null)
            return products;
        else {
            List<ProductResponse> filtered = new ArrayList<>();

            for(ProductResponse p: products) {

                List<String> productTags = new ArrayList<>();

                for(String t: p.getTags()) {
                    productTags.add(t.toLowerCase());
                }

                if(productTags.contains(tag.toLowerCase())) {
                    filtered.add(p);
                }
            }

            return filtered;
        }
    }
}
