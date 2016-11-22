package org.won.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.won.domain.MemberVO;
import org.won.persistence.MemberDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberTest {
	@Autowired
	private MemberDAO dao;
	
	@Test
	public void Test() throws Exception{
		
		MemberVO vo = new MemberVO();
		
		vo.setUserid("bbb");
		vo.setUserpw("bbb");
		vo.setUname("bbb");
		vo.setUphoto("bbb");
		dao.create(vo);
		
	}
}