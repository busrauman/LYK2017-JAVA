package tr.org.kamp.linux.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		int a = 5 ; 
		int b = 0 ; 
		int array[] = {1};
		//array[95] = 5;
		//System.out.println("Bir sayı giriniz  : ");
	//	System.out.println(array[array.length]);
		int yas = -10 ;
				
		try {
			//methodB();
			methodA();
			if(yas < 0) {
				throw new MyException();	
				
			}
			System.out.println(array[array.length]);
			
			int sayi = input.nextInt();
			int bolum = a/b;
			
			
		}
		catch (ArithmeticException e) {
			System.out.println("Sıfıra bölme hatası yakalandı");
		}catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Arrayin boyutu aşıldı");
		}catch (InputMismatchException e) {
			System.out.println("Girdi hatası");
		} catch (MyException e) {
			System.out.println(e.getMessage());
			return; // finally > return 
		}
		finally {
			System.out.println("Ne olursa olsun çalışır");
		}
		
		System.out.println("Try-catch bloğu bitti");
	}
	
	public static void methodA() throws ArithmeticException{
		System.out.println("MethodA içindeyim");
		int a = 5/0;
	}
	
	public static  void methodB() {
		System.out.println("MethodB içindeyim");
		try {
			int a = 5/0;
		} catch (Exception e) {
			System.out.println("Hata methodB içerisinde yakalandı");
		}
	}
}
