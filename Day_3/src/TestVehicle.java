import java.util.Date;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(8055,"ABDUL "," 4 Wheeler " ,new Date());
		System.out.println(v1);
		Vehicle v2 = new Vehicle(8055," ABDUL "," 4 Wheeler " ,new Date());
		System.out.println(v1);

		
	}

}
