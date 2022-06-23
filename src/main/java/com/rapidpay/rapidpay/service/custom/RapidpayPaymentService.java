package com.rapidpay.rapidpay.service.custom;

import java.util.List;
import java.util.Optional;
import com.rapidpay.rapidpay.model.RapidpayPayment;
import com.rapidpay.rapidpay.service.SuperService;
import org.springframework.stereotype.Service;

@Service
public interface RapidpayPaymentService extends SuperService {
    public List<RapidpayPayment> getAllRapidpayPayments() throws Exception;

    public List<RapidpayPayment> getAllRapidpayPaymentsByUserId(int id) throws Exception;

    public Optional<RapidpayPayment> getRapidpayPayment(int id) throws Exception;

    public RapidpayPayment saveRapidpayPayment(RapidpayPayment rapidpayPayment) throws Exception;

    public RapidpayPayment updateRapidpayPayment(RapidpayPayment rapidpayPayment) throws Exception;

    public void deleteRapidpayPayment(int id) throws Exception;
}
