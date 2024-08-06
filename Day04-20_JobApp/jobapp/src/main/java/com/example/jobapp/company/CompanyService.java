package com.example.jobapp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    void createCompany(Company company);

    Company getCompany(Long id);
    boolean updateCompany(Company updatedCompany, Long id);

    boolean deleteCompany(Long id);
}
