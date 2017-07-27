package tr.org.kamp.linux.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student();
		Scanner  in = new Scanner(System.in);
		
		try {
			System.out.println("Ogrencinin adını giriniz : ");
			st.name = in.nextLine();
			System.out.println("Ogrencinin Tc No giriniz : ");
			st.id = in.nextLine();
			st.idControl(st.id);
			System.out.println("Ogrencinin Notunu giriniz : ");
			st.grade = in.nextInt();
			st.gradeControl(st.grade);
			
		} catch (InputMismatchException e) {
			System.out.println("Hatalı tip girişi");
		}catch (StudentException e) {
			System.out.println(e.getMessageForId());
		}
		
		System.out.println("adı : "+ st.name + "  tc "+ st.id + " not " + st.grade);
		
		
	}
}
