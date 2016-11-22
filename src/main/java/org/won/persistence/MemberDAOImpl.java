package org.won.persistence;

import org.springframework.stereotype.Repository;
import org.won.domain.MemberVO;
@Repository
public class MemberDAOImpl extends AbstractDAO<MemberVO, String> implements MemberDAO {

	public MemberDAOImpl(){
		this.NAME = "org.won.dao.MemberMapper";
		}
}
