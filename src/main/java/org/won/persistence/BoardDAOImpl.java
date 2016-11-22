package org.won.persistence;

import org.springframework.stereotype.Repository;
import org.won.domain.BoardVO;
@Repository
public class BoardDAOImpl extends AbstractDAO<BoardVO, String> implements BoardDAO {
	
	public BoardDAOImpl(){
		this.NAME = "org.won.dao.BoardMapper";
	}
	
}
