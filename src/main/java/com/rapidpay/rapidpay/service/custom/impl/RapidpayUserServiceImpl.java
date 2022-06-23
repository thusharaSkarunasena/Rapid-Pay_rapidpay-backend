package com.rapidpay.rapidpay.service.custom.impl;

import java.util.List;
import java.util.Optional;
import com.rapidpay.rapidpay.model.RapidpayUser;
import com.rapidpay.rapidpay.repo.custom.RapidpayUserRepo;
import com.rapidpay.rapidpay.service.custom.RapidpayUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RapidpayUserServiceImpl implements RapidpayUserService{

    @Autowired
    private RapidpayUserRepo rapidpayUserRepo;

    @Override
    public List<RapidpayUser> getAllRapidpayUsers() throws Exception {
        return rapidpayUserRepo.findAll();
    }

    @Override
    public Optional<RapidpayUser> getRapidpayUser(int id) throws Exception {
        return rapidpayUserRepo.findById(id);
    }

    @Override
    public RapidpayUser checkRapidpayUser(String email) throws Exception {
        List<RapidpayUser> rapidpayUsers = rapidpayUserRepo.findAll();

        for (RapidpayUser rapidpayUser: rapidpayUsers){
            if(rapidpayUser.getEmail().equals(email)){
                return rapidpayUser;
            }
        }
        
        return null;
    }

    @Override
    public RapidpayUser saveRapidpayUser(RapidpayUser rapidpayUser) throws Exception {
        return rapidpayUserRepo.save(rapidpayUser);
    }

    @Override
    public RapidpayUser updateRapidpayUser(RapidpayUser rapidpayUser) throws Exception {
        if(!rapidpayUserRepo.findById(rapidpayUser.getId()).isEmpty()){
            return rapidpayUserRepo.save(rapidpayUser);
        }else{
            return null;
        }   
    }

    @Override
    public void deleteRapidpayUser(int id) throws Exception {
        rapidpayUserRepo.deleteById(id);
    }

}
