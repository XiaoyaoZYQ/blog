package com.zyq.blog.repository.es;

import com.zyq.blog.domain.es.EsBlog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogRepositoryTest {
	@Autowired
	private EsBlogRepository esBlogRepository;



	@Test
	public void testFindDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining() {
		System.out.println(esBlogRepository.count());
	}
}