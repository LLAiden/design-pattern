package com.llaiden.designpattern;

public class ClientAdapter implements Target {

    private Company company;

    public ClientAdapter(Company company) {
        this.company = company;
    }

    @Override
    public void action() {
        System.out.println("适配器转调厂商接口...");
        company.companyShow();
    }
}
