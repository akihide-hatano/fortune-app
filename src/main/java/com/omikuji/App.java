package com.omikuji;

import com.omikuji.app.OmikujiRunner;
import com.omikuji.domain.PremiumOmikujiGenerator;
import com.omikuji.domain.PremiumOmikujiGenerator;
import com.omikuji.domain.SimpleOmikujiGenerator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args){
        OmikujiRunner runner = new OmikujiRunner(new PremiumOmikujiGenerator());
        runner.run();
    }
}
