package dmz.fleetapp.services;

import dmz.fleetapp.models.VehicleMake;
import dmz.fleetapp.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    public List<VehicleMake> getVehicleMakes(){
        return vehicleMakeRepository.findAll();
    }

    //Get All VehicleMakes
    public List<VehicleMake> findAll(){
        return vehicleMakeRepository.findAll();
    }

    //Get VehicleMake By Id
    public Optional<VehicleMake> findById(int id) {
        return vehicleMakeRepository.findById(id);
    }

    //Delete VehicleMake
    public void delete(int id) {
        vehicleMakeRepository.deleteById(id);
    }

    //Update VehicleMake
    public void save(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }

}
