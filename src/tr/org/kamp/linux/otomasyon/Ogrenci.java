package tr.org.kamp.linux.otomasyon;

public class Ogrenci {
	String tc;
	String name;
	int not;

	public void notKOntrol(int not) throws OgrenciException {
		
		if (not < 0 || not > 100)
			throw new OgrenciException();
		else
			this.not = not;

	}

	public void tcKontrol(String tc) {
		try {
			if(tc.length() != 11 ) throw new OgrenciException();
			
		} catch (OgrenciException e) {
			System.out.println("TC Kimlik Numarası 11 karakter olmalıdır ve yalnızca rakam içermelidir");

		}
		
	}

}
