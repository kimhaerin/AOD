package org.won.service;

import java.util.List;

import org.won.domain.ReplyVO;

public interface ReplyService {

	public void create(ReplyVO rvo) throws Exception;

	public ReplyVO read(String bno) throws Exception;

	public List<ReplyVO> list(String bno) throws Exception;
}
