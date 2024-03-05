/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seat.reservation.discussions;

/**
 *
 * @author marti
 */
public class SeatBooking extends Thread{
    private final Seat bookingSystem;
    private final int seatNumber;
    
    public SeatBooking(Seat bookingSystem, int seatNumber){
        this.bookingSystem = bookingSystem;
        this.seatNumber = seatNumber;
    }
    
    public void run(){
        try{
            if(bookingSystem.bookSeat(seatNumber)){
                System.out.println("Thread " + Thread.currentThread().getName() + " booked seat: " + seatNumber);
            }else{
                System.out.println("Thread " + Thread.currentThread().getName() + ": Seat already booked !");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
