package com.mfs.client.tnmmwi.persistence;

import com.mfs.client.tnmmwi.persistence.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * I'm extending this interface with "JpaRepository", to get access to all it's CRUD
 * functionalities.
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}