package com.example.eranot.androidstateerrorwithsugarorm;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by eranot on 09/08/17.
 */

public class Attribute extends SugarRecord<Attribute> implements Serializable {
    private int type;

    public Attribute(){}

}