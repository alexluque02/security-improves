package net.openwebinars.springboot.restjwt.security.notifyByDeviceAndLocation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class DeviceMetadata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID userId;
    private String deviceDetails;
    private String location;
    private Date lastLoggedIn;

}