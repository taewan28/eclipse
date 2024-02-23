package mybatis;

import java.util.List;

import day4.mybatis.dao.MybatisBuyDao;
import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.ProductDto;
import project.vo.BuyVo;

public class MybatisSessionTest {

	public static void main(String[] args) {
		testProduct();
		//testBuy();
	}
	
	public static void testProduct(){
		MybatisProductDao dao = new MybatisProductDao();
		System.out.println("dao 객체 : " + dao);
		
		System.out.println("====== SELECTByCategory =====");
		List<ProductDto> list = dao.SELECTByCategory();
		System.out.print(list);
	}
	
	/*public static void testCustomer(){
		MybatisCustomerDao dao = new MybatisProductDao();
		System.out.println("dao 객체 : " + dao);
		
	}*/
	
	public static void testBuy(){
		MybatisBuyDao dao = new MybatisBuyDao();
		System.out.println("dao 객체 : " + dao);
		
		System.out.println("====== selectAll 테스트 =====");
		List<BuyDto> list = dao.selectAll();
		System.out.println(list);
		
		System.out.println("====== insert 테스트 =====");
		int result = dao.insert(new BuyDto(0, "mina012", "CJBAb12g", 3, null));
		System.out.println("반영된 행 개수 : " + result);
	}
	
}	


