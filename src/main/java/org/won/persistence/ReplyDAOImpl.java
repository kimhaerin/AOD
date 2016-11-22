package org.won.persistence;

import org.springframework.stereotype.Repository;
import org.won.domain.ReplyVO;
@Repository
public class ReplyDAOImpl extends AbstractDAO<ReplyVO, String> implements ReplyDAO {
	
	public ReplyDAOImpl(){
		this.NAME = "org.won.dao.ReplyMapper";
	}
}
