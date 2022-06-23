package com.rapidpay.rapidpay.controller;

import java.util.List;
import java.util.Optional;
import com.rapidpay.rapidpay.model.RapidpayUser;
import com.rapidpay.rapidpay.service.custom.RapidpayUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/rapidpay_user")
public class RapidpayUserController {

    @Autowired
    private RapidpayUserService rapidpayUserService;

    @GetMapping("/getAllRapidpayUsers")
    public List<RapidpayUser> getAllRapidpayUsers() {
        try {
            return rapidpayUserService.getAllRapidpayUsers();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getRapidpayUser/{id}")
    public Optional<RapidpayUser> getRapidpayUser(@PathVariable("id") int id) {
        try {
            return rapidpayUserService.getRapidpayUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/checkRapidpayUser/{email}")
    public RapidpayUser checkRapidpayUser(@PathVariable("email") String email) {
        try {
            return rapidpayUserService.checkRapidpayUser(email);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PostMapping("/saveRapidpayUser")
    public RapidpayUser saveRapidpayUser(RapidpayUser rapidpayUser) {
        try {
            return rapidpayUserService.saveRapidpayUser(rapidpayUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PutMapping("/updateRapidpayUser")
    public RapidpayUser updateRapidpayUser(RapidpayUser rapidpayUser) {
        try {
            return rapidpayUserService.updateRapidpayUser(rapidpayUser);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/deleteRapidpayUser/{id}")
    public void deleteRapidpayUser(@PathVariable("id") int id) {
        try {
            rapidpayUserService.deleteRapidpayUser(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
