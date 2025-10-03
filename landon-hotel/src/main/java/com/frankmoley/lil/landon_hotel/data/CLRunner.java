package com.frankmoley.lil.landon_hotel.data;

import com.frankmoley.lil.landon_hotel.data.entity.Guest;
import com.frankmoley.lil.landon_hotel.data.entity.Reservation;
import com.frankmoley.lil.landon_hotel.data.entity.Room;
import com.frankmoley.lil.landon_hotel.data.repository.GuestRepository;
import com.frankmoley.lil.landon_hotel.data.repository.ReservationRepository;
import com.frankmoley.lil.landon_hotel.data.repository.RoomRepository;
import com.frankmoley.lil.landon_hotel.data.service.RoomReservationService;
import com.frankmoley.lil.landon_hotel.data.service.model.RoomReservation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CLRunner implements CommandLineRunner {

    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    private final RoomRepository roomRepository;

    private final RoomReservationService roomReservationService;

    public CLRunner(
            GuestRepository guestRepository,
            ReservationRepository reservationRepository,
            RoomRepository roomRepository,
            RoomReservationService roomReservationService) {
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
        this.roomReservationService = roomReservationService;
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         * Optional<Room> room = this.roomRepository.findByRoomNumberIgnoreCase("P1");
         * System.out.println(room);
         */

        /**
         *         System.out.println("*** GUESTS ***");
         *         List<Guest> guests = this.guestRepository.findAll();
         *         guests.forEach(System.out::println);
         *
         *         System.out.println("*** ROOMS ***");
         *         List<Room> rooms = this.roomRepository.findAll();
         *         rooms.forEach(System.out::println);
         *
         *         System.out.println("*** RESERVATION ***");
         *         List<Reservation> reservations = this.reservationRepository.findAll();
         *         reservations.forEach(System.out::println);
         */

        List<RoomReservation> reservations = this.roomReservationService.getRoomReservationForDate("2023-08-28");
        reservations.forEach(System.out::println);
    }
}
