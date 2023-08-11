package com.example.testoop.model;

import com.example.testoop.controller.MeoKieuKeu;

public class MeoLongDai extends Meo implements MeoKieuKeu {
    @Override
    public String keu() {
        return "Meo keo long dai";
    }
}
