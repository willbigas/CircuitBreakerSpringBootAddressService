package br.com.willbigas.circuitbreakerspringbootfirstms.service;

import br.com.willbigas.circuitbreakerspringbootfirstms.model.Address;

public interface AddressService {

	Address getAddressByPostalCode(String postalCode);
}
