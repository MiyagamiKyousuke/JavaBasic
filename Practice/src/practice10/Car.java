package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	int run() {
		int move= 0;
		gasoline--;
		if(gasoline < 0) {
			return -1;
		}
		move = new java.util.Random().nextInt(16);
		return move;

	}
}
