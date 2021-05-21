package com.Controller;


import com.Repository.paymentIden;
import com.Entity.cc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/cc")
public class ccController {

    @Autowired
    com.Service.ccService ccService;

    @GetMapping
    public List<cc> gelAllCCpayments(){return ccService.getAllCCPayments();}

    @PostMapping(path="/info")
    public Optional<cc> getCCInfo(@RequestBody paymentIden paymentIden){
        return ccService.getCCInfo(paymentIden);
    }

    @PostMapping
    public void payWithCC(@RequestBody cc cc){
        ccService.payWithCreditCard(cc);
    }


}
