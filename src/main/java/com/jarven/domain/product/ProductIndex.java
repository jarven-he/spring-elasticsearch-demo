package com.jarven.domain.product;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * @description:
 * @author: 何佳文
 * @date: 2020-01-10 15:28
 */

@Data
@Document(indexName = "product-index", type = "product", replicas = 0)
public class ProductIndex {

    @Id
    @Field(type = FieldType.Integer)
    private Integer productId;

    @Field(type = FieldType.Text)
    private String productName;

    @Field(type = FieldType.Keyword)
    private List<String> tag;

    @Field(type = FieldType.Keyword)
    private String brand;

    @Field(type = FieldType.Keyword)
    private String category;

    @Field(type = FieldType.Keyword)
    private String image;
}
