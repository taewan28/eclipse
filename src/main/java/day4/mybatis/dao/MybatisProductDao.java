package day4.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.ProductDto;
import mybatis.SqlSessionBean;

public class MybatisProductDao {
	
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();

	public List<ProductDto> SELECTByCategory() {
	      SqlSession sqlSession = sessionFactory.openSession();
	      List<ProductDto> list = sqlSession.selectList("tblproduct.SELECTByCategory");
	      sqlSession.close();
	      return list;
	   }
	
}
