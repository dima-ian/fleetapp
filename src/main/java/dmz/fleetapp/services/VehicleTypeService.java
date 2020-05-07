package dmz.fleetapp.services;

import dmz.fleetapp.models.VehicleType;
import dmz.fleetapp.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    public List<VehicleType> getVehicleTypes(){
        return vehicleTypeRepository.findAll();
    }

    //Get All VehicleTypes
    public List<VehicleType> findAll(){
        return vehicleTypeRepository.findAll();
    }

    //Get VehicleType By Id
    public Optional<VehicleType> findById(int id) {
        return vehicleTypeRepository.findById(id);
    }

    //Delete VehicleType
    public void delete(int id) {
        vehicleTypeRepository.deleteById(id);
    }

    //Update VehicleType
    public void save(VehicleType vehicleType) {
        vehicleTypeRepository.save(vehicleType);
    }

}
