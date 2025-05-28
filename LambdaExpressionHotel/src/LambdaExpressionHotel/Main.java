package LambdaExpressionHotel;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		HotelService service = new HotelService();
		
		//Comment the code which did with the help of anonymous inner class
//		List<Hotel> hotels = service.filter(new filteringCondition() {
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getPricePerNight() <= 3000;
//				}
//
//		}
//		);
//
		
	  filteringCondition filterByPrice=(hotel)->hotel.getPricePerNight()<=3000;
	  List<Hotel> filteredHotels =service.filter(filterByPrice);
		System.out.println("List of Hotels which price is less than 3000" + filteredHotels);

	
		filteringCondition filterByStar=(hotel)->hotel.getHotelType()==HotelType.FIVE_STAR;
		List<Hotel>filteredHotelByStar=service.filter(filterByStar);
		System.out.println("List of Hotels Based on FiveStar Rating " + filteredHotelByStar);

	}

}
