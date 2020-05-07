package dmz.fleetapp.services;

import dmz.fleetapp.models.Country;
import dmz.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    //Get All Countrys
    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public void save(Country country) {
        countryRepository.save(country);
    }

    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

    public void delete(int id) {
        countryRepository.deleteById(id);
    }


}
