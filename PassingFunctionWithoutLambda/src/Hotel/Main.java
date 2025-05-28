package Hotel;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		HotelService service= new HotelService();
		
		List<Hotel>hotels=service.filter(new FilterHotelLessThan3000());
		System.out.println("List of Hotels less than 3000"+ hotels);
		
		List<Hotel>hotelsByFiveStar=service.filter(new FilterHotelBasedOnRating());
		System.out.println("List of Hotels Based on FiveStar Rating "+ hotelsByFiveStar);

	}
	

}
