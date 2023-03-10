package com.yarkov.energymanagement.repository;

import com.yarkov.energymanagement.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {

    Account findByEmail(String email);

}
