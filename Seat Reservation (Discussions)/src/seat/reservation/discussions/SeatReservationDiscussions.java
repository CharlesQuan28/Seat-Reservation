/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seat.reservation.discussions;

/**
 *
 * @author marti
 */
public class SeatReservationDiscussions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Seat bookingSystem = new Seat();
        bookingSystem.displayedSeatAvailability();
        
        SeatBooking client1 = new SeatBooking(bookingSystem, (int) (Math.random() * 10));
        SeatBooking client2 = new SeatBooking(bookingSystem, (int) (Math.random() * 10));
        
        client1.setName("Jack");
        client2.setName("Charles");
        
        client1.start();
        client2.start();
        
        client1.join();
        client2.join();
       
        System.out.println("\nUpdated seat availability: ");
        bookingSystem.displayedSeatAvailability();
    }
    
}
