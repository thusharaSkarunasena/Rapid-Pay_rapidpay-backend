package com.rapidpay.rapidpay.repo.custom;

import com.rapidpay.rapidpay.model.RapidpayPayment;
import com.rapidpay.rapidpay.repo.CrudRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface RapidpayPaymentRepo extends CrudRepo<RapidpayPayment, Integer>{
    
}
