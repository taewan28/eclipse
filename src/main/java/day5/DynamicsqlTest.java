package day5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.ProductDto;

public class DynamicsqlTest {
	
	public static void main(String[] args) {
		testPnameCateFilter();
		
	}
	
	public static void testNoFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		List<ProductDto> list = dao.search(null);
		System.out.println("검색 필터 없음 : " + list);		//전체 조회
	}
	
	
	public static void testPnameCateFilter() {
	      MybatisProductDao dao = new MybatisProductDao();
	      Map<String, Object> map = new HashMap<>();
	      map.put("keyword", "햇반");
	      map.put("category", "B1");         //key는 파라미터 이름, value는 검색하고 싶은 컬럼값
	      map.put("from",10000);
	      map.put("to",40000);
	      List<ProductDto> list = dao.search(map);
	      System.out.println("검색 필터 -카테고리 : " + list);
	   }
	
	
	public static void testCateFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String,Object> map = new HashMap<>();
		map.put("category", "B1");	//KEY는 파라미터 이름, value 는 검색하고 싶은 컬럼값
							//key는 매퍼 xml 확인			// value는 변경해서 테스트하기
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 -카테고리 : " + list);	//전체 조회
	}
	
	public static void testPnameFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String,Object> map = new HashMap<>();
		map.put("keyword", "사과");	//KEY는 파라미터 이름, value 는 검색하고 싶은 컬럼값
							//key는 매퍼 xml 확인			// value는 변경해서 테스트하기
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 - 상품명과 카테고리 : " + list);	//전체 조회
	}

	
}
