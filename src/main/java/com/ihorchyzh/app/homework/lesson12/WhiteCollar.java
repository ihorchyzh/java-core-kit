package com.ihorchyzh.app.homework.lesson12;

/**
 * Created by ihorchyzh on 2/26/17.
 */
public class WhiteCollar extends Human {

    private String company;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.company = company;
    }

    public void setCompany(String company) {
        if (checkCompanyName(company)) {
            this.company = company;
        } else {
            System.out.println("Company name is invalid");
        }
    }

    private boolean checkCompanyName(String company) {
        boolean result = false;
        for (char ch : company.toCharArray()) {
            result = Character.isLetter(ch) || !Character.isSpaceChar(ch) || ch == '-' || ch == ',';
        }
        return result;
    }

    public String getCompany() {
        return company;
    }

}