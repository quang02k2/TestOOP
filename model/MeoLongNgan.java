package com.example.testoop.model;

import com.example.testoop.controller.MeoKieuKeu;

public class MeoLongNgan extends Meo implements MeoKieuKeu {

    @Override
    public String keu() {
        return "Meo keu long ngan";
    }
}
