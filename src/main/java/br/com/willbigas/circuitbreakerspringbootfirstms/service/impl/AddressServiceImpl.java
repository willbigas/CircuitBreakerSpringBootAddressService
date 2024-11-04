package br.com.willbigas.circuitbreakerspringbootfirstms.service.impl;

import br.com.willbigas.circuitbreakerspringbootfirstms.model.Address;
import br.com.willbigas.circuitbreakerspringbootfirstms.repository.AddressRepository;
import br.com.willbigas.circuitbreakerspringbootfirstms.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

	@Override
    public Address getAddressByPostalCode(String postalCode) {
        return addressRepository.findByPostalCode(postalCode)
                .orElseThrow(() -> new RuntimeException("Address Not Found: " + postalCode));
    }

}
