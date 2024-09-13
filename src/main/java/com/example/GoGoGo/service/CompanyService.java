package com.example.GoGoGo.service;

import com.example.GoGoGo.dto.CompanyDTO;
import com.example.GoGoGo.entity.Company;
import com.example.GoGoGo.mapper.CompanyToDtoMapper;
import com.example.GoGoGo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    @Autowired
   private CompanyRepository companyRepository;

    @Autowired
    private CompanyToDtoMapper  companyToDtoMapper;

    public List<CompanyDTO> getAllCompany() {
        List<Company> companies = companyRepository.findAll();
        List<CompanyDTO> dtoList = companies.stream()
                .map(company -> companyToDtoMapper.toDto(company))
                .collect(Collectors.toList());

        return dtoList;
    }

    public CompanyDTO save(CompanyDTO companyDto) {

        Company entity = companyToDtoMapper.toEntity(companyDto);
        Company save = companyRepository.save(entity);
        return companyToDtoMapper.toDto(entity);

    }
    public CompanyDTO getCompanyById(long id) {
        return companyToDtoMapper.toDto(companyRepository.findById(id).get());
    }
    public CompanyDTO updateCompany(CompanyDTO companyDto) {
        Company entity = companyToDtoMapper.toEntity(companyDto);
        Company save = companyRepository.save(entity);
        return companyToDtoMapper.toDto(entity);
    }
    public void deleteCompany(long id) {
        companyRepository.deleteById(id);
    }
}
