package PassFunctionWithoutLambda.Hotel;

public class FilterHotelBasedOnRating implements filteringCondition {

	@Override
	public boolean test(Hotel hotel) {
		return hotel.getHotelType()==HotelType.FIVE_STAR;
	}

}
