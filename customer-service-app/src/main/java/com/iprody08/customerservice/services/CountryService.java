package com.iprody08.customerservice.services;

import com.iprody08.customerservice.dto.CountryDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    Optional<CountryDTO> findCountryById(long id);

    List<CountryDTO> findAll(Pageable pageable);

}
