package io.matheusvictor.springredis.service.impl;

import io.matheusvictor.springredis.domain.Company;
import io.matheusvictor.springredis.repository.CompanyRepository;
import io.matheusvictor.springredis.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    @Cacheable("companies")
    @Override
    public List<Company> findAll() {
        return (List<Company>) this.companyRepository.findAll();
    }

}
