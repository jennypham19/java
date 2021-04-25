package jenny;

import java.util.Scanner;

public class ex2 {
	private static String Name;
	private static String Class_Name;
	private static float C;
	private static float PHP;
	private static float diemTB;
	private String xepLoai;
	public void display(){
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			Name = input.nextLine();
			System.out.println("Enter your class: ");
			Class_Name = input.nextLine();
			System.out.println("Enter your C mark: ");
			C = input.nextFloat();
			System.out.println("Enter your PHP mark: ");
			PHP = input.nextFloat();
		}
		diemTB = (C + PHP)/2;
		System.out.println("Diem trung binh cua " + getName() + " la: " + getDiemTB());
		if(diemTB>=8) {
			xepLoai = "Gioi";
		}else if (diemTB>=6){
			xepLoai = "Kha";
		}else if (diemTB>=5) {
			xepLoai = "TB";
		}else {
			xepLoai = "Khong dat";
		}
		System.out.println("Ket qua xep loai hoc tap cua " + getName()  + " la: " + getXepLoai());
	}
	public ex2(String Name,String Class_Name,float C,float PHP,float diemTB) {
		ex2.Name = Name;
		ex2.Class_Name = Class_Name;
		ex2.C = C;
		ex2.PHP = PHP;
		ex2.diemTB = diemTB;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClass_Name() {
		return Class_Name;
	}
	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}
	public String getXepLoai() {
		return xepLoai;
	}
	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		diemTB = diemTB;
	}
	public float getC() {
		return C;
	}
	public void setC(float c) {
		C = c;
	}
	public float getPHP() {
		return PHP;
	}
	public void setPHP(float pHP) {
		PHP = pHP;
	}

	

}
