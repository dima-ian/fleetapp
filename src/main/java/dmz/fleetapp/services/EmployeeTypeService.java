package dmz.fleetapp.services;

import dmz.fleetapp.models.EmployeeType;
import dmz.fleetapp.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> getEmployeeTypes() {
        return employeeTypeRepository.findAll();
    }

    //Get All EmployeeTypes
    public List<EmployeeType> findAll() {
        return employeeTypeRepository.findAll();
    }

    //Get EmployeeType By Id
    public Optional<EmployeeType> findById(int id) {
        return employeeTypeRepository.findById(id);
    }

    //Delete EmployeeType
    public void delete(int id) {
        employeeTypeRepository.deleteById(id);
    }

    //Update EmployeeType
    public void save( EmployeeType employeeType) {
        employeeTypeRepository.save(employeeType);
    }

}
