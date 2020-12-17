package com.herokuapp.restfulbooker.booking;

public class ToDo {
    public static void main(String[] args) {
        //todo patch every field separately? yes, every
        //todo patch add test that fails
        //todo checkin later than checkout
        //todo Implement better URL and paths handling? Lepsze adresy i ścieżki
        //todo get z wczytaniem specyfikacji!

        /*

                    POST:
            {
                "bookingid": 13,
                "booking": {
                    "firstname": "Jim",
                    "lastname": "Brown",
                    "totalprice": 111,
                    "depositpaid": true,
                    "bookingdates": {
                        "checkin": "2018-01-01",
                        "checkout": "2019-01-01"
                    },
                    "additionalneeds": "Breakfast"
                }
            }
            responseCreated.actualBookingId: 13
            CREATED: softAssertions.assertAll()
            PATCH:
            {
                "firstname": "Veronica",
                "lastname": "Brown",
                "totalprice": 111,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2018-01-02",
                    "checkout": "2020-12-11"
                },
                "additionalneeds": "Breakfast"
            }

            org.assertj.core.api.SoftAssertionError:
            The following assertion failed:
            1) expected:<"20[19-01-0]1"> but was:<"20[20-12-1]1">

         */


        // ZROBIONE
        //todo write tests for this - no login, no password, invalid both credentials = SC = not authorized, get token from header


        // AKCEPTOWALNE:

        // AuthenticationTest
        // DeleteBookingTest
        // GetBookingsTest
        // GetBookingTest
        // PostBookingTest
        // PutBookingTest

        // ODRZUCONE

        //todo delete on teardown?
    }
}