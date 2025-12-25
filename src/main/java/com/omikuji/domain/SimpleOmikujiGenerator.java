package com.omikuji.domain;

import java.util.List;
import java.util.Random;

public class SimpleOmikujiGenerator implements OmikujiGenerator{

    private final List<Fortune> fortunes;
    private final Random random = new Random();

    public SimpleOmikujiGenerator(){
        this.fortunes = List.of(
            new Fortune("大吉", "最高の1日になりそう", "赤", "新しいノート"),
            new Fortune("中吉", "コツコツ積み上げが実を結ぶよ", "青", "お気に入りのペン"),
            new Fortune("小吉", "いつもよりちょっとだけ良い日", "黄色", "コーヒー"),
            new Fortune("凶", "無理は禁物。早めに休もう", "黒", "あたたかいお風呂")
        );
    }

    @Override
    public Fortune draw(){
        int idex = random.nextInt(fortunes.size());
        return fortunes.get(idex);
    }
}