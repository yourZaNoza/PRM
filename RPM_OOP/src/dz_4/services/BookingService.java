package dz_4.services;

import dz_4.entity.Bill;
import dz_4.entity.Client;
import dz_4.entity.Hotel;
import dz_4.entity.Room;

public class BookingService {
    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] roomes = hotel.getRoomes();
        boolean isFreeRoomes = false;
        for (Room r : roomes) {
            if (r.isFree()) {
                isFreeRoomes = true;
            }
        }
        if (!isFreeRoomes) {
            System.out.println("Свободных номеров в отеле " + hotel.getName() + " - нет");
        }

        bookRoom(client, numberOfPerson, roomes);
    }
    private void bookRoom(Client client, int numberOfPerson, Room[] roomes) {
        for (Room room : roomes) {
            String clientName = client.getName();
            if (room.getNumberOfPerson() == numberOfPerson) {
                System.out.println("Нашелся номер для клиента: " + clientName);
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентом: " + clientName);
                } else {
                    System.out.println("Недостаточно средств для бронирования номера клиентом: " + clientName);
                }
                boolean succes = false;
                if (!succes) {
                    System.out.println("Не нашлось нужного номера для клиента: " + clientName);
                }
            }
        }
    }
}

