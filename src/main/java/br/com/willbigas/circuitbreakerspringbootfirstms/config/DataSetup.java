package br.com.willbigas.circuitbreakerspringbootfirstms.config;

import br.com.willbigas.circuitbreakerspringbootfirstms.model.Address;
import br.com.willbigas.circuitbreakerspringbootfirstms.repository.AddressRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class DataSetup {

	private final AddressRepository addressRepository;

	@PostConstruct
	public void setupData() {
		addressRepository.saveAll(Arrays.asList(
				Address.builder().id(1).postalCode("1000001").state("Tokyo").city("Chiyoda")
						.build(),
				Address.builder().id(2).postalCode("1100000").state("Tokyo").city("Taito").build(),
				Address.builder().id(3).postalCode("2100001").state("Kanagawa").city("Kawasaki")
						.build()));
	}
}
