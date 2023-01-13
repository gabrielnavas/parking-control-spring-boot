package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;

@Service
public class ParkingSpotService {
  
  public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
    return parkingSpotModel;
  }
}
