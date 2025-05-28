package AnonymousInnerClassHotel;

public class Hotel {
	public int PricePerNight;
	public int rating;
	public HotelType hotelType;
	public Hotel(int pricePerNight, int rating, HotelType hotelType) {
		super();
		PricePerNight = pricePerNight;
		this.rating = rating;
		this.hotelType = hotelType;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hotel [PricePerNight=" + PricePerNight + ", rating=" + rating + ", hotelType=" + hotelType + "]";
	}
	public int getPricePerNight() {
		return PricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		PricePerNight = pricePerNight;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public HotelType getHotelType() {
		return hotelType;
	}
	public void setHotelType(HotelType hotelType) {
		this.hotelType = hotelType;
	}

	
}
