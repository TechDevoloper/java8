package Hotel;

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

	// Here if we want to filter the hotel which more than 2 start then again we
	// want to write the same code but only require to change the condition
	// Code duplication is there
	
	
	// Filter Hotel Based on the Price

//	private boolean isHotelLessThanPrice(int price, Hotel hotel) {
//		return hotel.getPricePerNight() <= price;
//	}
//
//	public List<Hotel> filterHotel(int price) {
//		// create new List of returned filteredHotel
//		List<Hotel> filteredHotel = new ArrayList<>();
//		for (Hotel hotel : hotels) {
//			if (isHotelLessThanPrice(price, hotel)) {
//				filteredHotel.add(hotel);
//			}
//		}
//		return filteredHotel;
//	}
//
//	// Filter the hotel which are all five stars
	
//	private boolean isFiveStar(Hotel hotel) {
//	return hotel.getHotelType() == HotelType.FIVE_STAR;
//}
	
//	public List<Hotel> filterFiveStarHotel(HotelType hoteltype) {
//		List<Hotel> fiveStar = new ArrayList<>();
//		for (Hotel hotel : hotels) {
//			if (isFiveStar(hotel)) {
//				fiveStar.add(hotel);
//			}
//		}
//		return fiveStar;
//	}


	// Create a one generic method for filter pass a function as parameter without lambda
	
	/*1)Create a interface
	 *2)Instantiate a class that implements the interface
	 *3)Implement the method of the interface where method body == function body which you want to pass as a parameter
	 *4)Pass an object of concrete implementation of the interface
	 * 
	 * 
	 * 
	 * 
	 */
	
	
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
