package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable {

    private String name;
    private List<Address> addresses = new ArrayList<Address>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }
}
