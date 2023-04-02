package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author udarasan
 * @TimeStamp 2023-03-27 14:30
 * @ProjectDetails demo
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String addressName;


}
