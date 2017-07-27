package tr.org.kamp.linux.otomasyon;

import java.util.InputMismatchException;
import java.util.Scanner;



public class OtomasyonTest {
	public static void main(String[] args) {
		Ogrenci ogr  = new Ogrenci();
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Ogrencinin adını giriniz  : " );
			ogr.name = input.nextLine();
			System.out.println("Ogrencinin tc kimlik Numarasını giriniz : ");
			ogr.tc = input.next();
			System.out.println("Ogrenci için not giriniz :");
			ogr.not = input.nextInt();
			ogr.notKOntrol(ogr.not);
		}catch (InputMismatchException e) {
			System.out.println("Girdi hatası : " + e.fillInStackTrace());
		}catch (OgrenciException e) {
			System.out.println(e.girdiSinirHatasi());
		}finally {
			System.out.println("Veritabanı bağlantısı kesildi");
		}
	}
}
