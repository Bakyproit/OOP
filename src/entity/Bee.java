package entity;

import java.util.Random;

public abstract class Bee {
	private String type; // kieu ong
	private int heath; // chi so suc khoe cua ong
	private boolean alive = true;// trang thai cua ong

	// tao constructor khoi tao gia tri
	public Bee() {
		this.heath = 100 ;  // chi so ban dau la 100
		this.alive = true ; // con song
	}
	// tao getter setter 

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeath() {
		return heath;
	}

	public void setHeath(int heath) {
		this.heath = heath;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	// tap damge tan cong ong
	
	public void damge() {
		Random random = new Random() ; 
		if(this.isAlive()) {
			int dam = random.nextInt(100) + 1 ; 
			int delta = this.getHeath()  - dam ; 
			
			if(delta > 0 ) {
				this.setHeath(delta);
			}
			else {
				this.setHeath(0);
			}
		}
	}
	
	// cap nhat tinh trang cua ong
	public void updateAlive() {
		if(this.type.equals("WorkerBee")) {
			if(this.getHeath() < 70 ) {
				this.alive = false ; 
			}
		}else if(this.type.equals("QueenBee")) {
			if(this.getHeath() < 20) {
				this.alive =false ; 
			}
		}else if(this.type.equals("DroneBee")) {
			if(this.getHeath() < 50) {
				this.alive = false ; 
			}
		}else {
			// no thing
		}
	}

	@Override
	public String toString() {
		String detail = getType() + "      " + getHeath() + "      " + (isAlive() == true ? "alive " : "die");
		return detail ;
	}
	

}
