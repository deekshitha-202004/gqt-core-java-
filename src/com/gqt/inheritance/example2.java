package com.gqt.inheritance;
class plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane flys");
	}
	void land() {
		System.out.println("plane lands");
	}
}
class cargoplane extends plane{
	@Override
	void fly() {
		System.out.println("cargoplane flys at low heights");
	}
	void carrygoods() {
		System.out.println("cargoplane carry goods");
	}
}
	class passengerplane extends plane{
		@Override
		void fly() {
			System.out.println("passengerplane flys at high height");
		}
		void CarryHumans() {
			System.out.println("passengerplane carry Humans");
		}
	}
	class Fighterplane extends plane{
		@Override
		void fly() {
			System.out.println("Fighterplane flys at moderate height");
		}
		void CarryWeapons() {
			System.out.println("fighterplane carry Humans");
		}
	}
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane cp=new cargoplane();
		passengerplane pp=new passengerplane();
		Fighterplane fp=new Fighterplane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carrygoods();
		System.out.println("----------");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryHumans();
		System.out.println("---------");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.CarryWeapons();
	}
}
  

	


