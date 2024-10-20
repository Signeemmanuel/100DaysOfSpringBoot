package com.example.companyms.company;

import com.example.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void createCompany(Company company);
    Company getCompanyById(Long id);
    Boolean updateCompany(Long id, Company updatedCompany);
    Boolean deleteCompany(Long id);
    void updateCompanyRating(ReviewMessage reviewMessage);
}
