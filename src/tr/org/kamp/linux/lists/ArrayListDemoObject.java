package tr.org.kamp.linux.lists;

import java.util.ArrayList;

public class ArrayListDemoObject {
	private ArrayList<String> listDemo;
	
	public ArrayListDemoObject() {
		listDemo = new ArrayList<String>();
	}
	
	public void addElement(String element) {
		listDemo.add(element);
	}
	
	public boolean removeElement(String element) {
		return listDemo.remove(element);
	}
	
	public boolean doesListHaveElement() {
		return !listDemo.isEmpty();
	}
	
	public boolean hasElement(String element) {
		return listDemo.contains(element);
	}
	
	public ArrayList<String> getListDemo() {
		return listDemo;
	}
	
}
