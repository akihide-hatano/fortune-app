package com.omikuji.domain;

public class PremiumOmikujiGenerator implements OmikujiGenerator{

    @Override
    public Fortune draw(){
            return new Fortune("大大吉","人生最高の日", "金", "金のコイン");
    }
}