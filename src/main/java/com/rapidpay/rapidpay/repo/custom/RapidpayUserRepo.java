package com.rapidpay.rapidpay.repo.custom;

import com.rapidpay.rapidpay.model.RapidpayUser;
import com.rapidpay.rapidpay.repo.CrudRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface RapidpayUserRepo extends CrudRepo<RapidpayUser, Integer> {

}