package com.example.GoGoGo.repository;

import com.example.GoGoGo.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends ListCrudRepository<Company, Long> {
    public Company findByName(String companyName);
    public Company save(Company company);
    Optional<Company> findById(long id);

}
