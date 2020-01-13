package com.jarven.repository;

import com.jarven.domain.product.ProductIndex;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 何佳文
 * @date: 2020-01-10 15:30
 */
@Repository
public interface ProductIndexRepository extends ElasticsearchRepository<ProductIndex, Integer> {
}
