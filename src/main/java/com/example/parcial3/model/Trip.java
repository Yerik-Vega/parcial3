package com.example.parcial3.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Route route;

    private ZonedDateTime departueTime;

    @Min(value = 1)
    private Integer capacity;

    @Min(value = 1, message = "los asientos no pueden ser nulos")
    private Integer avaibleSeats;

    @Enumerated(value = EnumType.STRING)
    private Status_Trip statusTrip;
}
