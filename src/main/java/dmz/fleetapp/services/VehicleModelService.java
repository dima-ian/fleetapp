package dmz.fleetapp.services;

import dmz.fleetapp.models.VehicleModel;
import dmz.fleetapp.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    public List<VehicleModel> getVehicleModels(){
        return vehicleModelRepository.findAll();
    }

    //Get All VehicleModels
    public List<VehicleModel> findAll(){
        return vehicleModelRepository.findAll();
    }

    //Get VehicleModel By Id
    public Optional<VehicleModel> findById(int id) {
        return vehicleModelRepository.findById(id);
    }

    //Delete VehicleModel
    public void delete(int id) {
        vehicleModelRepository.deleteById(id);
    }

    //Update VehicleModel
    public void save(VehicleModel vehicleModel) {
        vehicleModelRepository.save(vehicleModel);
    }

}
