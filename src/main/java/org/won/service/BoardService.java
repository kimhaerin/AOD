package org.won.service;

import java.util.List;

import org.won.domain.BoardVO;

public interface BoardService {

	public void create(BoardVO bvo) throws Exception;

	public BoardVO read(String bno) throws Exception;

	public List<BoardVO> list(String bno) throws Exception;

}
