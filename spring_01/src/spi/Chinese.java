package spi;

import Interface.Axe;
import Interface.Person;

public class Chinese implements Person {
    private Axe axe;
    
    public Chinese(Axe axe){
    	this.axe = axe;
    }
    
    public Chinese() {
    	
	}

	public void setAxe(Axe axe) {
        this.axe = axe;
    }
    public void useAxe() {
        System.out.println("�Ҵ���ȥ������");
        System.out.println(axe.chop());
    }
}