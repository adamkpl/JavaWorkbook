package com.herokuapp.restfulbooker.utils;

import com.herokuapp.restfulbooker.booking.Booking;
import com.herokuapp.restfulbooker.booking.Bookingdates;
import com.herokuapp.restfulbooker.booking.Bookingid;
import io.restassured.response.Response;
import org.junit.Assert;

public class Deserialization {

/*    private static final T T;

    public static <T> T deserialize() {

        return T;
    }*/
/*
    // Declare variables;
    Response responseToPost;

    // Create a full payload
    Booking payload = new Booking.BookingBuilder()
            .withFirstname("Ela")
            .withLastname("Smith")
            .withTotalprice(10)
            .withDepositpaid(true)
            .withBookingdates(
                    new Bookingdates.BookingdatesBuilder()
                            .withCheckin("2000-01-01")
                            .withCheckout("2000-01-31").build())
            .withAdditionalneeds("Breakfast before 7.00 AM")
            .build();

    // POST
    responseToPost = HttpMethod.post(payload, Endpoint.MAIN_URL + Endpoint.BOOKING);

    // THEN
    Bookingid bookingid = responseToPost.as(Bookingid.class);

        System.out.println("Request booking : " + payload.toString());
        System.out.println("Response booking: " + bookingid.getBooking().toString());

        Assert.assertEquals(payload.toString(), bookingid.getBooking().toString());
*/

}