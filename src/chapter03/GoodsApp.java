package chapter03;

import mypackage.Goods2;

public class GoodsApp {
	public static void main(String[] args) {
		System.out.println("git test!!");
		
		Goods goods = new Goods();
//		private는 내부에서만 접근이 가능하다.
//		goods.name = "nikon";
//		goods.price = 20000;
//		goods.countSold = 10;
//		goods.countStock = 100;
		
		goods.setName("nikon");
		int price = -1;
		goods.setPrice(price);
		goods.setCountSold(10);
		goods.setCountStock(100);
		
//		System.out.println("name : " + goods.name + 
//						   ", price : " + goods.price + 
//						   ", countSold : " + goods.countSold + 
//						   ", countStock : " + goods.countStock);
		
		System.out.println("name : " + goods.getName() + 
				           ", price : " + goods.getPrice() +
				           ", countSold : " + goods.getCountSold() + 
				           ", countStock : " + goods.getCountStock());
		
		goods.showInfo();
		
		int discountPrice = goods.calcDiscountPrice(20);
		System.out.println(discountPrice);
		
		
//		default 접근자 필드는 다른 패키지에서는 접근 불가
//		Goods2 good2 = new Goods2();
//		goods2.name = "coke";
		
//		static 변수 테스트
		Goods g = new Goods();
		System.out.println(Goods.getCountOfGoods());
		
		g = new Goods();
		System.out.println(Goods.getCountOfGoods());
		
		g = new Goods();
		System.out.println(Goods.getCountOfGoods());
		
		final int VALUE = 10;
//		final로 정의된 변수 이후에 값 대입은 에러 => 상수
//		value = 20;

		System.out.println(Math.PI * 3 * 3);
	}
}
