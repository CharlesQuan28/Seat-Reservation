/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seat.reservation.discussions;

/**
 *
 * @author marti
 */
public class Seat {

    private static final int MAX_SEATS = 10;
    private final int[] seats;

    public Seat() {
        seats = new int[MAX_SEATS];
        for (int i = 0; i < MAX_SEATS; i++) {
            seats[i] = 0; // 0 - available, 1 - booked
        }
    }

    public void displayedSeatAvailability() {
        System.out.println("----------- Seat Available ----------- ");
        for (int i = 0; i < MAX_SEATS; i++) {
            System.out.println(seats[i] == 0 ? "Available " : "Booked ");
            if ((i + 1) % 5 == 0) {
                System.out.println(); //break a line
            }
        }
    }

    public synchronized boolean bookSeat(int seatNumber) throws InterruptedException {
        if (seatNumber < 1 || seatNumber > MAX_SEATS) {
            return false;
        }

        if (seats[seatNumber - 1] == 0) {
            seats[seatNumber - 1] = 1;
            return true;
        } else {
            return false;
        }
    }
}
