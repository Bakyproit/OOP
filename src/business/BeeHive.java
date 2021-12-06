package business;

import java.util.ArrayList;
import java.util.Random;

import entity.*;

public class BeeHive {
     // tao ra danh sach 10 con ong
	ArrayList<Bee> beeList = new ArrayList<>() ; 
	// add ong vao danh sach
    
	public void init() {
		// khoi tao ong va add vao danh sach
		
		beeList.add(new WorkerBee());
		beeList.add(new QueenBee());
		beeList.add(new DroneBee());
		
		Random random = new Random() ; 
		for(int i = 0 ; i < 7 ; i++) {
			int n = random.nextInt(3) + 1 ;
			if(n == 1 ) {
				beeList.add(new WorkerBee());
			}else if(n==2) {
				beeList.add(new QueenBee());
			}else {
				beeList.add(new DroneBee());
				
			}
		}
		
	}
	public ArrayList<Bee> getAllBee() {
		return beeList ; 
	}
	// attrack ong
	public void attrackBee() {
		// tan cong toan bo ong
		for(int i = 0 ; i < getAllBee().size() ; i++) {
			getAllBee().get(i).damge(); // tan cong ong
			getAllBee().get(i).updateAlive(); // cap nhat lai trang thai cua ong
		}
	}
	
} 
