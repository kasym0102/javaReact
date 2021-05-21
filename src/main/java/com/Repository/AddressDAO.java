package com.Repository;

import com.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressDAO extends JpaRepository<Address, AddressIdentifier> {
    @Query(value = "select address from Address address WHERE address.addressIdentifier.user_email = ?1 ")
    List<Address> findAllAddress(String email);

    @Query(value = "select address from Address address WHERE address.address = ?1 ")
    Optional<Address> findByAddress(String address);

    @Query(value = "select max(id) from has_addresses group by user_email having user_email = ?1", nativeQuery = true)
    Integer findByEmail(String email);
}
