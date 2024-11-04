package br.com.willbigas.circuitbreakerspringbootfirstms.repository;

import br.com.willbigas.circuitbreakerspringbootfirstms.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

	Optional<Address> findByPostalCode(String postalCode);
}
