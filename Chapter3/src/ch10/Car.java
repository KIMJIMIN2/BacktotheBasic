package ch10;

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void starCar() {
		System.out.println("시동을 켭니다");

	}

	public void turnOff() {
		System.out.println("시동을 끕니다");
	}

	public void washCar() {	} // 추상메소드가 아니라, 정의된 메소드로 내용이 없을뿐... "훅 메소드"

	final public void run() {
		starCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
