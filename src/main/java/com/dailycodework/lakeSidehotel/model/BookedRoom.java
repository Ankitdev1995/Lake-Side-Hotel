package com.dailycodework.lakeSidehotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    @Column(name = "check_In")
    private LocalDate checkInDate;
    @Column(name = "check_Out")
    private LocalDate checkOutDate;
    @Column(name = "guest_FullName")
    private String guestFullName;
    @Column(name = "guest_Email")
    private String guestEmail;
    @Column(name = "adults")
    private int numOfAdults;
    @Column(name = "children")
    private int numOfChildern;
    @Column(name = "total_guest")
    private int totalNumberOfGuest;
    @Column(name = "confirmation_code")
    private String bookingConfirmationCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;


    public void calculateTotalNoOfGuest(){
        this.totalNumberOfGuest = this.numOfAdults + this.numOfChildern;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
        calculateTotalNoOfGuest();  // Recalculate total number of guests whenever adults are updated
    }

    public void setNumOfChildern(int numOfChildern) {
        this.numOfChildern = numOfChildern;
        calculateTotalNoOfGuest();  // Recalculate total number of guests whenever childrens are updated
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
