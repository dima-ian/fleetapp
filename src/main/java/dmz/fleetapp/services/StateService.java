package dmz.fleetapp.services;

import dmz.fleetapp.models.State;
import dmz.fleetapp.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    //Get All States
    public List<State> getStates(){
        return stateRepository.findAll();
    }

    //Get All States
    public List<State> findAll(){
        return stateRepository.findAll();
    }

    //Get State By Id
    public Optional<State> findById(int id) {
        return stateRepository.findById(id);
    }

    //Delete State
    public void delete(int id) {
        stateRepository.deleteById(id);
    }

    //Update State
    public void save( State state) {
        stateRepository.save(state);
    }
}

