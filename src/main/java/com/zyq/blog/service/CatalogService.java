package com.zyq.blog.service;

import java.util.List;
import java.util.Optional;

import com.zyq.blog.domain.Catalog;
import com.zyq.blog.domain.User;

/**
 * Catalog 服务接口.
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 1.0.0 2017年4月10日
 */
public interface CatalogService {
	/**
	 * 保存Catalog
	 *
	 * @param catalog
	 * @return
	 */
	Catalog saveCatalog(Catalog catalog);

	/**
	 * 删除Catalog
	 *
	 * @param id
	 * @return
	 */
	void removeCatalog(Long id);

	/**
	 * 根据id获取Catalog
	 *
	 * @param id
	 * @return
	 */
	Optional<Catalog> getCatalogById(Long id);

	/**
	 * 获取Catalog列表
	 *
	 * @return
	 */
	List<Catalog> listCatalogs(User user);
}
