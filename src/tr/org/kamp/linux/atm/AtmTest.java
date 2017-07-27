package tr.org.kamp.linux.atm;



public class AtmTest {
	
	public static void main(String[] args) {
		User user = new User("1", "2");
		ATM atm = new ATM(user);
		
		generateUsers(atm);
		showUsers(atm);
		atm.login(user);
	
		
		
		int credit = atm.credit(100) ;
		if(credit == 1) {
			System.out.println("para yatırma işlemi başarılı");
		}else if(credit == -1){
			System.out.println("para yatırma işlemi başarısız");

		}
			System.out.println(" güncel " + atm.getUser().getAmount());
			
		atm.logout();	
			
		int withDrawal = atm.withdrawal(80);
		if(withDrawal == 1) {
			System.out.println("Para çekme işlemi başarılı");
		}else if(withDrawal == -1) {
			System.out.println("Lütfen giriş yapınız ");
		}else {
			System.out.println("Bakiyeden büyük değer girdiniz, işlem başarısız");
		}
		
		System.out.println(" güncel2 " + atm.getUser().getAmount());

	}

	private static void generateUsers(ATM atm) {
		User u;
		int amount = 500;
		for(int i = 0 ; i < atm.getUserList().length ; i++) {
			u = new User(Integer.toString(i+1), Integer.toString(i+2), amount+=100);
			atm.setUserList(u, i );
			
		}
		
		
	}
	
	private static  void showUsers(ATM atm) {
		System.out.println("======Hesaplar=====");
		for(int i = 0 ; i < atm.getUserList().length ; i++) {
			System.out.println(atm.getUserList()[i].getAccountNumber()+  " "
					+atm.getUserList()[i].getPassword()+"  " +
					atm.getUserList()[i].getAmount());
		}
	}
}



