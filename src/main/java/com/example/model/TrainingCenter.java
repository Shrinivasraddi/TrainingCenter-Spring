package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "training_centers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)         //id generation based on post api call
    private Long id;

    @Column(nullable = false, length = 40)
    @NotBlank(message = "Center name is required")                              //Bean for validating Not-Blank
    @Size(max = 40, message = "Center name must be less than 40 characters")    //Bean for validating maximum character of 40
    private String centerName;

    @Column(nullable = false, unique = true, length = 12)
    @NotBlank(message = "Center code is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Embedded
    @NotNull(message = "Address is required")
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;        //list creation for coursedOffered

    @Column(nullable = false, updatable = false)
    private Instant createdOn;                      //Epoch time generation

    @Email(message = "Invalid email format")
    private String contactEmail;

    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number format")     //validation for phone number
    @NotBlank(message = "Contact phone is required")
    private String contactPhone;

    @PrePersist
    public void prePersist() {
        this.createdOn = Instant.now();
    }
}
