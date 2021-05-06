package jenny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class SortEmployee {
	private String hoTen;
	private float luong;
	public SortEmployee(String hoTen,float luong) {
		this.hoTen = hoTen;
		this.luong = luong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	public void sort () {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so cong nhan");
		int n = input.nextInt();
		ArrayList <SortEmployee> danhSach = new ArrayList<SortEmployee>();
		for(int i = 0; i< n;i++) {
			input.nextLine();
			SortEmployee x = new SortEmployee(hoTen, luong);
			System.out.println("Thong tin cong nhan thu "+ i);
			System.out.println("Ho va ten: ");
			x.hoTen = input.nextLine();
			System.out.println("Luong: ");
			x.luong = input.nextFloat();
			danhSach.add(x);
		}
		 Collections.sort(danhSach, new Comparator<SortEmployee>() {
	            @Override
	            public int compare(SortEmployee nv1, SortEmployee nv2) {
	                if (nv1.luong < nv2.luong) {
	                    return 1;
	                } else {
	                    if (nv1.luong == nv2.luong) {
	                        return 0;
	                    } else {
	                        return -1;
	                    }
	                }
	            }
	        });
		 System.out.println("Danh sach sap xep theo thu tu luong giam dan là: ");
	        for (int i = 0; i < danhSach.size(); i++) {
	            System.out.println("Ten: " + danhSach.get(i).hoTen + " Luong: " + danhSach.get(i).luong);
	        }
	}
}
