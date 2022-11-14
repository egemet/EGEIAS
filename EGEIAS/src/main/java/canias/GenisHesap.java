package canias;

public class GenisHesap {

	public double REFBEL;
	public double OLCHATA;
	public double BIRLESHATA;
	public double REFKAYMA;
	public double TEKRAR;
	public double SICFARKI;
	public double SICFARKITESTREF;
	public double TESTSIFIR;
	public double TESTOKUHATA;
	public double TVARYANS;
	public double STDUNCER;
	public double EXPUNCER;
	public String EXPUNCER2;
	public String HATAMESAJI;
	
	
	
	public GenisHesap(){}
	public GenisHesap(double refbel,double olchata,double birleshata,double refkayma,double tekrar,double sicfarki,double sicfarkitestref,double testsifir,double testokuhata,
			double tvaryans,double stduncer,double expuncer,String expuncer2,String hatamesaji) {
		this.BIRLESHATA=birleshata;
		this.EXPUNCER=expuncer;
		this.EXPUNCER2 = expuncer2;
		this.OLCHATA=olchata;
		this.REFBEL = refbel;
		this.REFKAYMA = refkayma;
		this.SICFARKI = sicfarki;
		this.SICFARKITESTREF = sicfarkitestref;
		this.STDUNCER = stduncer;
		this.TEKRAR = tekrar;
		this.TESTOKUHATA = testokuhata;
		this.TESTSIFIR = testsifir;
		this.TVARYANS = tvaryans;
		this.HATAMESAJI = hatamesaji;
		
	}
	public String getHATAMESAJI() {
		return HATAMESAJI;
	}
	public void setHATAMESAJI(String hATAMESAJI) {
		HATAMESAJI = hATAMESAJI;
	}
	public double getREFBEL() {
		return REFBEL;
	}
	public void setREFBEL(double rEFBEL) {
		REFBEL = rEFBEL;
	}
	public double getOLCHATA() {
		return OLCHATA;
	}
	public void setOLCHATA(double oLCHATA) {
		OLCHATA = oLCHATA;
	}
	public double getBIRLESHATA() {
		return BIRLESHATA;
	}
	public void setBIRLESHATA(double bIRLESHATA) {
		BIRLESHATA = bIRLESHATA;
	}
	public double getREFKAYMA() {
		return REFKAYMA;
	}
	public void setREFKAYMA(double rEFKAYMA) {
		REFKAYMA = rEFKAYMA;
	}
	public double getTEKRAR() {
		return TEKRAR;
	}
	public void setTEKRAR(double tEKRAR) {
		TEKRAR = tEKRAR;
	}
	public double getSICFARKI() {
		return SICFARKI;
	}
	public void setSICFARKI(double sICFARKI) {
		SICFARKI = sICFARKI;
	}
	public double getSICFARKITESTREF() {
		return SICFARKITESTREF;
	}
	public void setSICFARKITESTREF(double sICFARKITESTREF) {
		SICFARKITESTREF = sICFARKITESTREF;
	}
	public double getTESTSIFIR() {
		return TESTSIFIR;
	}
	public void setTESTSIFIR(double tESTSIFIR) {
		TESTSIFIR = tESTSIFIR;
	}
	public double getTESTOKUHATA() {
		return TESTOKUHATA;
	}
	public void setTESTOKUHATA(double tESTOKUHATA) {
		TESTOKUHATA = tESTOKUHATA;
	}
	public double getTVARYANS() {
		return TVARYANS;
	}
	public void setTVARYANS(double tVARYANS) {
		TVARYANS = tVARYANS;
	}
	public double getSTDUNCER() {
		return STDUNCER;
	}
	public void setSTDUNCER(double sTDUNCER) {
		STDUNCER = sTDUNCER;
	}
	public double getEXPUNCER() {
		return EXPUNCER;
	}
	public void setEXPUNCER(double eXPUNCER) {
		EXPUNCER = eXPUNCER;
	}
	public String getEXPUNCER2() {
		return EXPUNCER2;
	}
	public void setEXPUNCER2(String eXPUNCER2) {
		EXPUNCER2 = eXPUNCER2;
	}

	
	
	
}
