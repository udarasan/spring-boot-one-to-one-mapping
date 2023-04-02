package com.example.demo.dto;

import com.example.demo.entity.Address;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

/**
 * @author udarasan
 * @TimeStamp 2023-03-28 13:16
 * @ProjectDetails demo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long uid;
    private String username;
    private String dob;
    private AddressDTO address;
}
