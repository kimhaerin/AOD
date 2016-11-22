package org.won.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.won.domain.BoardVO;
import org.won.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class BoardTest {

	@Autowired
	private BoardDAO dao;
	private BoardVO vo;

	@Test
	public void deleteTest() throws Exception {
		dao.delete("16");
		dao.photodelete("16");
	}

	@Test
	public void listTest() throws Exception {
		System.out.println(dao.list());
	}
}
