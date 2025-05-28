package AnonymousInnerClassHotel;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		HotelService service = new HotelService();

		List<Hotel> hotels = service.filter(new filteringCondition() {

			@Override
			public boolean test(Hotel hotel) {
				return hotel.getPricePerNight() <= 3000;
			}

		}

		);

		System.out.println("List of Hotels which price is less than 3000" + hotels);

		List<Hotel> hotelsByFiveStar = service.filter(new filteringCondition() {

			@Override
			public boolean test(Hotel hotel) {
				return hotel.getHotelType() == HotelType.FIVE_STAR;
			}
		});
		System.out.println("List of Hotels Based on FiveStar Rating " + hotelsByFiveStar);

	}

}
