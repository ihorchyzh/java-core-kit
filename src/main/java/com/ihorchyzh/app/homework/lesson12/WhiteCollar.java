package com.ihorchyzh.app.homework.lesson12;

/**
 * Created by ihorchyzh on 2/26/17.
 */
public class WhiteCollar extends Human {

    private String company;

    public void setCompany(String company) {
        if (checkCompanyName(company)) {
            this.company = company;
        } else {
            System.out.println("Company name is invalid");
        }
    }

    private boolean checkCompanyName(String companyName) {
        boolean result = false;
        for (char ch : company.toCharArray()) {
            if (Character.isLetter(ch) || !Character.isSpaceChar(ch) || ch == '-' || ch == ',') {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    public String getCompany() {
        return company;
    }

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

}