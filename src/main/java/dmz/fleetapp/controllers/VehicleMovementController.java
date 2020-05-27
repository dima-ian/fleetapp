package dmz.fleetapp.controllers;

import dmz.fleetapp.models.VehicleMovement;
import dmz.fleetapp.services.LocationService;
import dmz.fleetapp.services.VehicleMovementService;
import dmz.fleetapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMovementController {

    @Autowired private VehicleMovementService vehicleMovementService;
    @Autowired private LocationService locationService;
    @Autowired private VehicleService vehicleService;

    //Get All VehicleMovements
    @GetMapping("vehicleMovements")
    public String getVehicleMovements(Model model){
        model.addAttribute("vehicleMovements", vehicleMovementService.findAll());
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("vehicles", vehicleService.findAll());

        return "vehicleMovement";
    }

    @GetMapping("vhclMvmnts")
    public String findAll(Model model){
        model.addAttribute("vehicleMovements", vehicleMovementService.findAll());
        model.addAttribute("locations", locationService.findAll());
        model.addAttribute("vehicles", vehicleService.findAll());

        return "vehicleMovement";
    }

    @RequestMapping("vehicleMovements/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(Integer id)
    {
        return vehicleMovementService.findById(id);
    }

    //Add VehicleMovement
    @PostMapping(value="vehicleMovements/addNew")
    public String addNew(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @RequestMapping(value="vehicleMovements/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovements";
    }

    @RequestMapping(value="vehicleMovements/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleMovementService.delete(id);
        return "redirect:/vehicleMovements";
    }


}

