package net.openwebinars.springboot.restjwt.security.notifyByDeviceAndLocation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DeviceMetadataRepository extends JpaRepository<DeviceMetadata, UUID> {
    List<DeviceMetadata> findByUserId(UUID userId);
}