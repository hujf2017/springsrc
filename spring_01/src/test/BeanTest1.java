package test;

import spi.Chinese;
import spi.StoneAxe;

public class BeanTest1 {
    public static void main(String[] args) {
        Chinese p = new Chinese();
        StoneAxe axe = new StoneAxe();
        p.setAxe(axe);
        p.useAxe();
    }
}