package com.linbrox.vehicle.repository;


import com.linbrox.vehicle.common.HyundaiModelEnum;
import com.linbrox.vehicle.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {

    List<Vehicle> findByHyundaiModel(HyundaiModelEnum hyundaiModel);

    List<Vehicle> findByName(String name);

    List<Vehicle> findByHyundaiModelAndAndName(HyundaiModelEnum hyundaiModelEnum, String name);
}
