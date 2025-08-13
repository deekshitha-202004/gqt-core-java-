package com.gqt.corejava.polymerphism;
class plane4{
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
class cargoplane4 extends plane4{
	@Override
	void fly() {
		System.out.println("cargoplane flys at low heights");
	}
	void carrygoods() {
		System.out.println("cargoplane carry goods");
	}
}
	class passengerplane4 extends plane4{
		@Override
		void fly() {
			System.out.println("passengerplane flys at high height");
		}
		void CarryHumans() {
			System.out.println("passengerplane carry Humans");
		}
	}
	class Fighterplane4 extends plane4{
		@Override
		void fly() {
			System.out.println("Fighterplane flys at moderate height");
		}
		void CarryWeapons() {
			System.out.println("fighterplane carry Humans");
		}
	}
	class Airport{
		void permit (plane4  ref) {
			ref.takeoff();
			ref.fly();
			ref.land();
		}
	}
public class condensedpolymerphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane4 cp=new cargoplane4();
		passengerplane4 pp=new passengerplane4();
		Fighterplane4 fp=new Fighterplane4();
		Airport ap=new Airport();
		ap.permit(cp);
		cp.carrygoods();
		System.out.println("----------");
		ap.permit(pp);
		pp.CarryHumans();
		System.out.println("---------");
		ap.permit(fp);
		fp.CarryWeapons();
	}
}

