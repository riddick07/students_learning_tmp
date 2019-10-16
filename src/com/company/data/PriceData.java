package com.company.data;

public class PriceData {

    public String currency;
    public int currencyNumber;
    public double amount;
    public int introduction;
    public String code;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getCurrencyNumber() {
        return currencyNumber;
    }

    public void setCurrencyNumber(int currencyNumber) {
        this.currencyNumber = currencyNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getIntroduction() {
        return introduction;
    }

    public void setIntroduction(int introduction) {
        this.introduction = introduction;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
