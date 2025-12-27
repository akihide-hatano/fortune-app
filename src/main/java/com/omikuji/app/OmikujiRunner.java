package com.omikuji.app;

import com.omikuji.domain.Fortune;
import com.omikuji.domain.OmikujiGenerator;

import java.util.Scanner;

public class OmikujiRunner {
    private final OmikujiGenerator generator;

    public OmikujiRunner(OmikujiGenerator generator){
        this.generator = generator;
    }

    public void run(){
        System.out.println("=== おみくじアプリ === ");
        System.out.print("Enterキーでおみくじを引きます");

        try(Scanner scanner = new Scanner(System.in)){
            scanner.nextLine();
        };

        Fortune f = generator.draw();
        System.out.println(f.label());
    }
}
