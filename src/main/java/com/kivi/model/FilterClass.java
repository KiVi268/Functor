package com.kivi.model;

import java.util.List;

public class FilterClass implements Filter<List> {


    @Override
    public boolean apply(List o) {
        return false;
    }
}
