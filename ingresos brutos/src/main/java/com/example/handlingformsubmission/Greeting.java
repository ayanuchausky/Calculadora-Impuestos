package com.example.handlingformsubmission;

public class Greeting {

    private double montoIVA;
    private double montoIIBB;
    private double porcentajeIVA = 21;
    private double porcentajeIIBB = 50;
    private double conIVA;
    private double conIIBB;
  
    
    
    public double getId() {
        return montoIVA;
    }

    public void setId(double montoIVA) {
        this.montoIVA = montoIVA;
    }

    public double getContent() {
        return montoIIBB;
    }

    public void setContent(double content) {
        this.montoIIBB = content;
    }
    
    public double getPorcentajeIVA() {
		return porcentajeIVA;
	}

	public void setPorcentajeIVA(double porcentajeIVA) {
		this.porcentajeIVA = porcentajeIVA;
	}

	public double getPorcentajeIIBB() {
		return porcentajeIIBB;
	}

	public void setPorcentajeIIBB(double porcentajeIIBB) {
		this.porcentajeIIBB = porcentajeIIBB;
	}
	

	public double getConIVA() {
		return conIVA;
	}

	public void setConIVA(double conIVA) {
		this.conIVA = conIVA;
	}

	public double getConIIBB() {
		return conIIBB;
	}

	public void setConIIBB(double conIIBB) {
		this.conIIBB = conIIBB;
	}

	public void calcularIVA() {
		conIVA = (montoIVA*(1+(porcentajeIVA/100))); 
		}
	
    public void calcularIIBB() {
   
    	conIIBB=(montoIIBB*(1-(porcentajeIIBB/100)));
    	}
  
    

}
