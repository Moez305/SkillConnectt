package or.perso.skillconnec.service;

import or.perso.skillconnec.entities.Booking;

public interface IBookingService {
    Booking getBookingById(Long id);
    Iterable<Booking> getAllBookings();
    Booking createBooking(Booking booking);
    Booking updateBooking(Long id, Booking booking);
    void deleteBooking(Long id);

}
