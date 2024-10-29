public class Guest {
    private final String name;
    private long checkInDate;
    private long checkOutDate;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCheckInDate(long checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(long checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public long getCheckInDate() {
        return checkInDate;
    }

    public long getCheckOutDate() {
        return checkOutDate;
    }
}