package org.won.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

public abstract class AbstractDAO<E, K> implements GenericDAO<E, K> {

	@Inject
	protected SqlSession sqlSession;

	protected String NAME;
	
	@Override
	public void create(E vo) throws Exception {
		
		sqlSession.insert(NAME + ".create", vo);
	}
	@Override
	public void photocreate(E vo) throws Exception {
		
		sqlSession.insert(NAME + ".photocreate", vo);
	}

	@Override
	public E read(K key) throws Exception {
		return sqlSession.selectOne(NAME + ".read", key);
	}

	@Override
	public void update(E vo) throws Exception {
		sqlSession.update(NAME + ".update", vo);
	}

	@Override
	public void delete(K key) throws Exception {
		sqlSession.delete(NAME + ".delete", key);

	}
	
	@Override
	public void photodelete(K key) throws Exception {
		sqlSession.delete(NAME + ".photodelete", key);

	}	

	@Override
	public List<E> list() throws Exception {
		return sqlSession.selectList(NAME + ".list");
	}

}
