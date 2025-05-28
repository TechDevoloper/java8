package LambdaExpressionHotel;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
	List<Hotel> hotels = new ArrayList<>();

	public HotelService() {
		hotels.add(new Hotel(1000, 5, HotelType.THREE_STAR));
		hotels.add(new Hotel(2000, 4, HotelType.FOUR_STAR));
		hotels.add(new Hotel(3000, 4, HotelType.FIVE_STAR));
		hotels.add(new Hotel(4000, 3, HotelType.FIVE_STAR));
		hotels.add(new Hotel(5000, 2, HotelType.FOUR_STAR));
	}

	
	
	public List<Hotel> filter(filteringCondition FilteringCondition) {
		List<Hotel> filteredHotels = new ArrayList<>();
		for (Hotel hotel : hotels) {
			if (FilteringCondition.test(hotel)) {
				filteredHotels.add(hotel);
			}
		}
		return filteredHotels;
	}

}
