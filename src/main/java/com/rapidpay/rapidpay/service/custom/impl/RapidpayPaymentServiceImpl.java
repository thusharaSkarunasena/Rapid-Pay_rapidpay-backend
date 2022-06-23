package com.rapidpay.rapidpay.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.rapidpay.rapidpay.model.RapidpayPayment;
import com.rapidpay.rapidpay.repo.custom.RapidpayPaymentRepo;
import com.rapidpay.rapidpay.service.custom.RapidpayPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RapidpayPaymentServiceImpl implements RapidpayPaymentService{

    @Autowired
    private RapidpayPaymentRepo rapidpayPaymentRepo;

    @Override
    public List<RapidpayPayment> getAllRapidpayPayments() throws Exception {
        return rapidpayPaymentRepo.findAll();
    }

    @Override
    public List<RapidpayPayment> getAllRapidpayPaymentsByUserId(int id) throws Exception {
        List<RapidpayPayment> filteredRapidpayPayments = new ArrayList<>();

        List<RapidpayPayment> rapidpayPayments = rapidpayPaymentRepo.findAll();

        for (RapidpayPayment rapidpayPayment: rapidpayPayments){
            if(rapidpayPayment.getUser_id() == id){
                filteredRapidpayPayments.add(rapidpayPayment);
            }
        }

        return filteredRapidpayPayments;
    }

    @Override
    public Optional<RapidpayPayment> getRapidpayPayment(int id) throws Exception {
        return rapidpayPaymentRepo.findById(id);
    }

    @Override
    public RapidpayPayment saveRapidpayPayment(RapidpayPayment rapidpayPayment) throws Exception {
        return rapidpayPaymentRepo.save(rapidpayPayment);
    }

    @Override
    public RapidpayPayment updateRapidpayPayment(RapidpayPayment rapidpayPayment) throws Exception {
        if(!rapidpayPaymentRepo.findById(rapidpayPayment.getId()).isEmpty()){
            return rapidpayPaymentRepo.save(rapidpayPayment);
        }else{
            return null;
        }  
    }

    @Override
    public void deleteRapidpayPayment(int id) throws Exception {
        rapidpayPaymentRepo.deleteById(id);
    }

}
