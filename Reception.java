public class Reception {
    private Hotel hotel;

    public Reception(Hotel hotel) {
        this.hotel = hotel;
    }

    public void makeReservation(Guest guest, Room room) {
        hotel.checkIn(guest, room);
    }

    public void cancelReservation(Guest guest) {
        hotel.checkOut(guest);
    }
}