package com.example.GoGoGo.mapper;

import com.example.GoGoGo.dto.CompanyDTO;
import com.example.GoGoGo.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyToDtoMapper implements Mapper<CompanyDTO, Company> {

    @Override
    public CompanyDTO toDto(Company company) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setId(company.getId());
        companyDTO.setName(company.getName());
        companyDTO.setAddress(company.getAddress());
        //companyDTO.setEvent();
        return companyDTO;
    }

    @Override
    public Company toEntity(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setId(companyDTO.getId());
        company.setName(companyDTO.getName());
        company.setAddress(companyDTO.getAddress());
        //companyDTO.setEvent()
        return company;
    }
}
