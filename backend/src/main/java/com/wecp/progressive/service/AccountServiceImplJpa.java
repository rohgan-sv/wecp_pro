package com.wecp.progressive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.repository.AccountRepository;

@Service
public class AccountServiceImplJpa {
    
    @Autowired
    private AccountRepository accountRepository;
    

    
}