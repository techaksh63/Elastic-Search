package com.stash.ElasticSearchFirst.repo;

import com.stash.ElasticSearchFirst.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {

        }
