package com.gqt.corejava.absraction;

abstract class Test{
	void land() {
		System.out.println("Plane lands");
	}
}
abstract class Plane{
	abstract void takeoff();
	abstract void fly();
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane extends Plane{
	@Override
	void takeoff() {
		System.out.println("cargo plane require a long runway to takeoff");
	}
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low height");
	}
	void CarryGoods() {
		System.out.println("CargoPlane carry Goods");
	}
	
}
class PassengerPlane extends Plane{
	@Override
	void takeoff() {
		System.out.println("passenger plane require a short runway to takeoff");
	}
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at high height");
	}
	void CarryHumans() {
		System.out.println("PassengerPlane carry Humans");
	}
}
class FighterPlane extends Plane{
	@Override
	void takeoff() {
		System.out.println("fighter plane require a great runway to takeoff");
	}
	@Override
	void fly() {
		System.out.println("FighterPlane flys at moderate height");
	}
	void CarryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		Airport ap=new Airport();
		ap.permit(cp);
		cp.CarryGoods();
		System.out.println("--------------");
		ap.permit(pp);
		pp.CarryHumans();
		System.out.println("--------------");
		ap.permit(fp);
		fp.CarryWeapons();
		System.out.println("--------------");
//		Plane p=new Plane();
		Plane p1=new Plane() {

			@Override
			void takeoff() {
				// TODO Auto-generated method stub
				System.out.println("takeoff");
			}

			@Override
			void fly() {
				// TODO Auto-generated method stub
				System.out.println("flys");
			}
			
		};
		p1.takeoff();
		p1.fly();
		p1.land();
		Test t=new Test() {};
	}

}

