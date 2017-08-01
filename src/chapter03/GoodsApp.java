package chapter03;

import mypackage.Goods2;

public class GoodsApp {
	public static void main(String[] args) {
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
		
//		default 접근자 필드는 다른 패키지에서는 접근 불가
//		Goods2 good2 = new Goods2();
//		goods2.name = "coke";
	}
}
