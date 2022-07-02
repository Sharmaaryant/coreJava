package Tinterface;

public abstract  class  businessman implements Richman , SocialWorker {


	public int earnMoney() {
		return 75000;
	}
	public int donation() {
		return 6000;
	}
	public int party() {
		return 20000;
	}
			
	public static void main(String[] args) {
		
	
		businessman bs = new businessman() {
			
			@Override
			public int helptoOther() {
				// TODO Auto-generated method stub
				return 100000;
			}
		};
		
		System.out.println("-----------------");
		System.out.println(bs.helptoOther());
		System.out.println("------------------");
		System.out.println(bs.earnMoney());
		System.out.println("-------------------");
		System.out.println(bs.donation());
		System.out.println("--------------------");
		System.out.println(bs.party());
		System.out.println("---------------------");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
