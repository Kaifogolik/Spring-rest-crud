package com.example.GoGoGo.controller;

import com.example.GoGoGo.dto.CompanyDTO;
import com.example.GoGoGo.entity.Company;
import com.example.GoGoGo.service.CompanyService;
import com.example.GoGoGo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public List<CompanyDTO> get() {

        return companyService.getAllCompany();
    }

    @GetMapping("/{id}")
    public CompanyDTO getById(@PathVariable long id) {
        return companyService.getCompanyById(id);
    }

    //TODO везде сделать как зедсть
    @PostMapping
    public CompanyDTO addCompany(@RequestBody CompanyDTO companyDto) {
        return companyService.save(companyDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable long id) {
        companyService.deleteCompany(id);
    }

    @PutMapping("/{id}")
    public CompanyDTO updateCompany(@RequestBody CompanyDTO company, @PathVariable Long id) {
        return companyService.updateCompany(company);
    }

}
