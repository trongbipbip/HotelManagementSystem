public class HotelManagementSystem {
    public static void main(String[] args) {
        // Khởi tạo khách sạn
        Hotel hotel = new Hotel("Khách sạn ABC", "Hà Nội");

        // Khởi tạo các phòng
        Room room1 = new DoubleRoom(101, 100);
        Room room2 = new SingleRoom(102, 80);
        Room room3 = new Suite(103, 150);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        // Khởi tạo tiếp tân
        Reception reception = new Reception(hotel);

        // Khách hàng
        Guest guest1 = new Guest("Nguyễn Văn A");
        Guest guest2 = new Guest("Trần Thị B");

        // Đặt phòng
        reception.makeReservation(guest1, room1);
        reception.makeReservation(guest2, room2);

        // Hủy đặt phòng
        reception.cancelReservation(guest1);

        // Đặt đồ ăn
        Food foodService = new Food();
        foodService.orderFood("Phở");
        foodService.orderFood("Bánh mì");

        // Hủy món ăn
        foodService.cancelFood("Phở");

        // Kiểm tra danh sách món ăn đã đặt
        System.out.println("Danh sách món ăn đã đặt: " + foodService.getFoodItems());
    }
}
