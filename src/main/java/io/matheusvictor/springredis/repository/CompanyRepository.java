package io.matheusvictor.springredis.repository;

import io.matheusvictor.springredis.domain.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
