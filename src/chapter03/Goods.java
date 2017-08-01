package chapter03;

public class Goods {
	private static int countofgoods;
	private String name;
	int price;
	int countStock;
	int countSold;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	void showInfo() {
		// private는 내부에서만 접근이 가능하다.
		System.out.println(name);
	}
}
