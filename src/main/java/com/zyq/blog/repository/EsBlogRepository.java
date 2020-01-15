package com.zyq.blog.repository;

import com.zyq.blog.domain.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {

	/**
	 * 分页查询
	 *
	 * @param tilte
	 * @param summary
	 * @param content
	 * @param pageable
	 * @return
	 */
	Page<EsBlog> findByTitleContainingOrSummaryContainingOrContentContaining(
			String tilte, String summary, String content, Pageable pageable);
}
