package br.com.willbigas.circuitbreakerspringbootfirstms.controller;

import br.com.willbigas.circuitbreakerspringbootfirstms.model.Address;
import br.com.willbigas.circuitbreakerspringbootfirstms.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("addresses")
@RequiredArgsConstructor
public class AddressController {

	private final AddressService addressService;

	@GetMapping("/{postalCode}")
	public Address getAddressByPostalCode(@PathVariable("postalCode") String postalCode) {
		return addressService.getAddressByPostalCode(postalCode);
	}
}
