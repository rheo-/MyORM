package com.sd.saki.myorm;

import com.orm.SugarRecord;

/**
 * Created by Saki on 7/18/2016.
 */
public class Contact extends SugarRecord {
    String name;
    String phone;

    public Contact(){
    }

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}