package dz_4;

import dz_4.entity.Bill;
import dz_4.entity.Client;
import dz_4.entity.Hotel;
import dz_4.entity.Room;
import dz_4.services.BookingService;

public class Main {
    public static void main(String[] args) {
        Bill loriBill = new Bill(10000);
        Client loriClient = new Client("Lori", "Cat", "88005553535", "lori@cat.xyz", loriBill);

        Bill baxBill = new Bill(12000);
        Client baxClient = new Client("Bax", "Cat", "88008808888", "bax@cat.xyz", baxBill);

        Room[] rostovondonHotelRooms = new Room[] {new Room(1,1500,true),
                new Room(3,3500,true),
                new Room(2, 2500, true)};

        Hotel rostovondonHotel = new Hotel("Rostov-on-Don", rostovondonHotelRooms);

        Room[] moscowHotelRooms = new Room[] {new Room(2,2800,true),
                new Room(3,4000,true),
                new Room(1, 2000, true)};

        Hotel moscowHotel = new Hotel("Moscow", moscowHotelRooms);

        BookingService bookingService = new BookingService();
        bookingService.book(rostovondonHotel, loriClient, 2);
        System.out.println();
        bookingService.book(rostovondonHotel,loriClient, 4);
        System.out.println();
        bookingService.book(moscowHotel, baxClient, 3);
    }
}
