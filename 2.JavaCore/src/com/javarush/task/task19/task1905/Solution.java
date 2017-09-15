package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA","Ukraine");
        countries.put("CA","Canada");
        countries.put("RU","Russia");
    }


    public static void main(String[] args) {
        String contact = "Ivanov, Ivan";
        System.out.println(contact.substring(contact.indexOf(',')+1).trim());
        System.out.println(contact.substring(0,contact.indexOf(',')));
    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private  Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            Object countryCode="";
            for(Map.Entry key : countries.entrySet()){
                Object k = key.getKey();
                Object obj = countries.get(k);
                if(k != null){
                    if(customer.getCountryName().equals(obj)){
                        countryCode = k;
                    }
                }
            }
            return countryCode.toString();
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().substring(0,contact.getName().indexOf(','));
        }

        @Override
        public String getDialString() {
            String telNumber = contact.getPhoneNumber();
            //telNumber = telNumber.replaceAll("\\D+","");
            return "callto://" + telNumber.replaceAll("[^+0-9]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}