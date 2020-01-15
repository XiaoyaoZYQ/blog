package com.zyq.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zyq.blog.domain.File;


/**
 * File 存储库.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年3月28日
 */
public interface FileRepository extends MongoRepository<File, String> {
}
