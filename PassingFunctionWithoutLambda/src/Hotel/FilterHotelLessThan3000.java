package Hotel;

public class FilterHotelLessThan3000 implements filteringCondition {

	@Override
	public boolean test(Hotel hotel) {
		return hotel.getPricePerNight() > 3000;
	}

}
