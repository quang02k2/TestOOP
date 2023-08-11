package com.example.testoop.model;

import com.example.testoop.controller.MeoKieuKeu;

public class MeoBaTu extends Meo implements MeoKieuKeu {
    @Override
    public String keu() {
        return "Meo keu ba tu";
    }
}
