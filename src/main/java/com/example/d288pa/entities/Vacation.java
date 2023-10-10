package com.example.d288pa.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vacations")
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;

    @Column(name = "vacation_title")
    private String vacationTitle;

    @Column(name = "description")
    private String description;

    @Column(name = "travel_fare_price")
    private BigDecimal travelPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @OneToMany
    private Set<Excursion> excursions;
}
