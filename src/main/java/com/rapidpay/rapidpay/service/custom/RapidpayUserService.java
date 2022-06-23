package com.rapidpay.rapidpay.service.custom;

import java.util.List;
import java.util.Optional;
import com.rapidpay.rapidpay.model.RapidpayUser;
import com.rapidpay.rapidpay.service.SuperService;
import org.springframework.stereotype.Service;

@Service
public interface RapidpayUserService extends SuperService {
    public List<RapidpayUser> getAllRapidpayUsers() throws Exception;

    public Optional<RapidpayUser> getRapidpayUser(int id) throws Exception;

    public RapidpayUser checkRapidpayUser(String email) throws Exception;

    public RapidpayUser saveRapidpayUser(RapidpayUser rapidpayUser) throws Exception;

    public RapidpayUser updateRapidpayUser(RapidpayUser rapidpayUser) throws Exception;

    public void deleteRapidpayUser(int id) throws Exception;
}
