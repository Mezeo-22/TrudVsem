package com.example.trudvsem;

public class Vacancies {

    private String region_code;
    private String source;
    private String company_name;
    private String job_name;

    @Override
    public String toString() { return region_code + source + company_name + job_name; }
}
