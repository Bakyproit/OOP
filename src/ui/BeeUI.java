package ui;

import java.util.ArrayList;
import java.util.Scanner;

import business.BeeHive;
import entity.Bee;

public class BeeUI {

	public static void main(String[] args) {
		ArrayList<Bee> beeList = new ArrayList<>();
		BeeHive bh = null;
		boolean kiemTra = true;
		int chon;
		Scanner sc = new Scanner(System.in);
		while (kiemTra) {
			// tao view
			System.out.println("-------Bee Hive------");
			System.out.println("---1. Create beehive------");
			System.out.println("---2. Attrack bee------");
			System.out.println("---3. exit ------");

			System.out.println("Moi ban nhap lua chon cua minh : ");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				// KHOI TAO 1 DOI TUONG MOI
				bh = new BeeHive();
				bh.init(); // tao danh sach ong
				beeList = bh.getAllBee(); // luu danh sach
				System.out.println("In ra danh sach ong : ");
				showBee(beeList);
				break;
			case 2:
				// attrack ong
				if (bh == null) {
					System.out.println("khong co con ong nao de tan cong");
				} else {
					bh.attrackBee();
					beeList = bh.getAllBee(); // luu danh sach
					System.out.println("In ra danh sach ong : ");
					showBee(beeList);
				}
				break;
			default:
				kiemTra = false;
				System.out.println("Chuong trinh da ket thuc ! hen gap lai sau....");

			}

		}
		sc.close();

	}

	private static void showBee(ArrayList<Bee> Bee) {
		System.out.println("Ten ong " + "         " + "chi so hien tai " + "        " + "trang thai ");
		for (int i = 0; i < Bee.size(); i++) {
			System.out.println(Bee.get(i));
		}

	}

}
