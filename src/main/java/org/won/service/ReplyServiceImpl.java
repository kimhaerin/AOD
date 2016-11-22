package org.won.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.won.domain.ReplyVO;
import org.won.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;
	
	@Override
	public void create(ReplyVO rvo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public ReplyVO read(String bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReplyVO> list(String bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
