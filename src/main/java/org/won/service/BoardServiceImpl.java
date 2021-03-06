package org.won.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.won.domain.BoardVO;
import org.won.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public void create(BoardVO bvo) throws Exception {
		dao.create(bvo);

	}

	@Override
	public BoardVO read(String bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public List<BoardVO> list(String bno) throws Exception {
		return dao.list();
	}

}
