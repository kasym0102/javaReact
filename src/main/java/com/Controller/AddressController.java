package com.Controller;

import com.Repository.AddressIdentifier;
import com.dto.AddressDTO;
import com.Service.AddressService;
import com.Entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/email={email}")
    public ResponseEntity getAddresses(@PathVariable String email) {

        return ResponseEntity.ok(addressService.getAddresses(email));

    }

    @PutMapping
    public void updateAddress(@RequestBody Address address){
        addressService.updateAddress(address);
    }


    @PostMapping
    public ResponseEntity addAddress(@RequestBody AddressDTO addressDTO) {
        Address temp = addressService.addAddress(addressDTO);
        if(temp != null){
            return ResponseEntity.ok(temp);

        }
        return ResponseEntity.unprocessableEntity().build();

    }

    @DeleteMapping
        public ResponseEntity deleteAddress(@RequestBody AddressIdentifier addressIdentifier) {
        if(addressService.deleteAddress(addressIdentifier)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.unprocessableEntity().build();


    }
}
