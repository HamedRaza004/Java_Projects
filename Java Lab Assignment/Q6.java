class TicketBooking {
    private int availableSeats = 1;

    public synchronized void bookSeat(String userName) {
        System.out.println(userName + " is trying to book a seat.");
        if (availableSeats > 0) {
            System.out.println("Congratulations, " + userName + "! Your seat has been booked.");
            availableSeats--;
        } else {
            System.out.println("Sorry, " + userName + ". The seat is already booked.");
        }
    }
}

class BookingThread extends Thread {
    private TicketBooking bookingSystem;
    private String userName;

    public BookingThread(TicketBooking bookingSystem, String userName) {
        this.bookingSystem = bookingSystem;
        this.userName = userName;
    }

    @Override
    public void run() {
        bookingSystem.bookSeat(userName);
    }
}

public class Q6 {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        BookingThread user1 = new BookingThread(bookingSystem, "Alice");
        BookingThread user2 = new BookingThread(bookingSystem, "Bob");

        user1.start();
        user2.start();
    }
}
