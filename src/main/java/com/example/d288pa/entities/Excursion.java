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
@Table(name = "excursions")
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;

    @Column(name = "excursion_title")
    private String excursionTitle;

    @Column(name = "excursion_price")
    private BigDecimal excursionPrice;

    @Column(name = "image_URL")
    private String imageUrl;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "last_update")
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    @ManyToMany
    private Set<CartItem> cartItems;
}
