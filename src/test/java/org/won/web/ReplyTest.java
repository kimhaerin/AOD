package org.won.web;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.won.domain.ReplyVO;
import org.won.persistence.ReplyDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class ReplyTest {

	@Autowired
	ReplyDAO dao;

	@Test
	public void insertTest() throws Exception {

		ReplyVO vo = new ReplyVO();
		vo.setBno(1);
		vo.setUserid("±Ë«ˆ¡ﬂπŸ∫∏∏€√ª¿Ã");
		vo.setRcontent("very stupid");

		dao.create(vo);

	}

	@Test
	public void deletTest() throws Exception {

		dao.delete("3");
	}

	@Test
	public void listTest() throws Exception {
		ReplyVO vo = new ReplyVO();
		List<ReplyVO> list = new ArrayList<ReplyVO>();
		list = dao.list();
		System.out.println(list);

	}

}