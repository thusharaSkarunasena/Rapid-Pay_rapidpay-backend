package com.rapidpay.rapidpay.controller;

import java.util.List;
import java.util.Optional;
import com.rapidpay.rapidpay.model.RapidpayPayment;
import com.rapidpay.rapidpay.service.custom.RapidpayPaymentService;
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
@RequestMapping("/rapidpay_payment")
public class RapidpayPaymentController {

    @Autowired
    private RapidpayPaymentService rapidpayPaymentService;

    @GetMapping("/getAllRapidpayPayments")
    public List<RapidpayPayment> getAllRapidpayPayments() {
        try {
            return rapidpayPaymentService.getAllRapidpayPayments();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getAllRapidpayPaymentsByUserId/{id}")
    public List<RapidpayPayment> getAllRapidpayPaymentsByUserId(@PathVariable("id") int id) {
        try {
            return rapidpayPaymentService.getAllRapidpayPaymentsByUserId(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getRapidpayPayment/{id}")
    public Optional<RapidpayPayment> getRapidpayPayment(@PathVariable("id") int id) {
        try {
            return rapidpayPaymentService.getRapidpayPayment(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PostMapping("/saveRapidpayPayment")
    public RapidpayPayment saveRapidpayPayment(RapidpayPayment rapidpayPayment) {
        try {
            return rapidpayPaymentService.saveRapidpayPayment(rapidpayPayment);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @PutMapping("/updateRapidpayPayment")
    public RapidpayPayment updateRapidpayPayment(RapidpayPayment rapidpayPayment) {
        try {
            return rapidpayPaymentService.updateRapidpayPayment(rapidpayPayment);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/deleteRapidpayPayment/{id}")
    public void deleteRapidpayPayment(@PathVariable("id") int id) {
        try {
            rapidpayPaymentService.deleteRapidpayPayment(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
