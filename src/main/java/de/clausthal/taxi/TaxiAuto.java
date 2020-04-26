package de.clausthal.taxi;
public class TaxiAuto {
	private int speed; 
	
	public int getSpeed() {
		return speed; 
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			throw new IllegalArgumentException();
		}
		this.speed = speed; 
	}
	
	public void beschleunigen() {
		this.speed++;
	}
	public void bremsen() {
		if(this.speed>0)
			this.speed--;
	}

}
