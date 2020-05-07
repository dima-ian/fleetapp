package dmz.fleetapp.controllers;

import java.util.Optional;

import dmz.fleetapp.models.Client;
import dmz.fleetapp.services.ClientService;
import dmz.fleetapp.services.CountryService;
import dmz.fleetapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ClientController {

    @Autowired private StateService stateService;
    @Autowired private CountryService countryService;
    @Autowired private ClientService clientService;

    //Get All Clients
    @GetMapping("/clients")
    public String getClients(Model model) {
        model.addAttribute("countries", countryService.getCountries());
        model.addAttribute("states", stateService.getStates());
        model.addAttribute("clients", clientService.getClients());
        return "client";
    }


    @GetMapping("/clnts")
    public String findAll(Model model){
        model.addAttribute("countries", countryService.findAll());
        model.addAttribute("states", stateService.findAll());
        model.addAttribute("clients", clientService.findAll());
        return "client";
    }

    @RequestMapping("clients/findById")
    @ResponseBody
    public Optional<Client> findById(Integer id)
    {
        return clientService.findById(id);
    }

    //Add Client
    @PostMapping(value="clients/addNew")
    public String addNew(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client) {
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value="clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        clientService.delete(id);
        return "redirect:/clients";
    }

}
