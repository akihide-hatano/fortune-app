package com.omikuji.domain;

//おみくじ1枚を表す値オブジェクト
public class Fortune {
    private final String name;
    private final String message;
    private final String luckyColor;
    private final String luckyItem;

    public Fortune(String name,String message,String luckColor,String luckyItem){
        this.name = name;
        this.message = message;
        this.luckyColor = luckColor;
        this.luckyItem = luckyItem;
    }

    public String getName(){
        return name;
    }

    public String getMessage(){
        return message;
    }

    public String getLuckColor(){
        return luckyColor;
    }

    public String getLuckyItem(){
        return luckyItem;
    }

    public String label(){
        return String.format(
            "【%s】%s (ラッキーカラー: %s / ラッキーアイテム: %s)",
            name, message, luckyColor, luckyItem
        );
    }
}