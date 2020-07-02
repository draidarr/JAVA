package com.company;

import creatures.Human;

public interface Sellable {
    public void sell(Human seller, Human buyer, Double price) throws Exception;

}

