package com.example.demo.businesslevel.servicelayer.impl;

import com.example.demo.businesslevel.domainlayer.Truck;
import com.example.demo.businesslevel.servicelayer.TruckRestService;
import com.example.demo.daolevel.repositories.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TruckRestServiceImpl implements TruckRestService {

    @Autowired
    private TruckRepository truckRepository;

    @Override
    public void addNewTruck(Truck truck) {
        truckRepository.save(truck);
    }

    @Override
    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }

    @Override
    public Truck getTruck(Long id) {
        Truck truck = truckRepository.findTruckById(id);
        if (truck == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "грузовика с таким id не существует");
        return truck;
    }

    @Override
    public Truck updateTruck(Long id, Truck truck) {
        Truck currentTruck = getTruck(id);
        currentTruck.setCarNumber(truck.getCarNumber());
        currentTruck.setDescription(truck.getDescription());
        truckRepository.save(currentTruck);
        return currentTruck;
    }

    @Override
    public void deleteTruck(Long id) {
        Truck currentTruck = getTruck(id);
        truckRepository.delete(currentTruck);
    }

}
