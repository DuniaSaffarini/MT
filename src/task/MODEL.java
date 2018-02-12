package task;

import javax.swing.JOptionPane;

public class MODEL {

	CONTROLLER R= new CONTROLLER();
	private double resultValue;
	public boolean flag=false;
	public boolean flagForMod =false; 

	
	public void addNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum+secondNum ;
		
	}
	
	public void subNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum-secondNum ;
		
	}
	
	public void modNum (double firstNum , double secondNum) {
		
		

			 this.resultValue=firstNum%secondNum ;

		 }
	
	
	public void mulNum (double firstNum , double secondNum) {
		flag=false;
		this.resultValue=firstNum*secondNum ;
		
	}
	
	public void divNum (double firstNum , double secondNum) {
		flag=false;
		if (secondNum == 0.0)	{
		JOptionPane.showMessageDialog(null, "Divide by 0 !!");
		flag=true;
		}
		else {
			flag=false;
			this.resultValue=firstNum/secondNum ;
		}
		
	}
	
	public void sqrNum (double firstNum ) {
		flag=false;
		if (firstNum < 0.0) {
			flag=true;
			JOptionPane.showMessageDialog(null, "The Number is Negative !!");
		}
		flag=false;
		this.resultValue= Math.sqrt(firstNum);
		
	}
	
	public double getResultValue () {
		return this.resultValue;
	}
	
	public int getResultValueForMOD () {
		return (int)(this.resultValue);
		
	}
	
}
