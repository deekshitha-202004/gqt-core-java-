package com.gqt.corejava.polymerphism;

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
public class polymerphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane cp=new cargoplane();
		passengerplane pp=new passengerplane();
		Fighterplane fp=new Fighterplane();
		plane ref;
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carrygoods();
		System.out.println("----------");
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.CarryHumans();
		System.out.println("---------");
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		fp.CarryWeapons();
	}
}

  

