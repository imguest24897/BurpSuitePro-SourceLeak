package burp;

public class Zza implements Zbph {
  private final int ZQ;
  
  private final boolean ZN;
  
  public Zza(int paramInt) {
    boolean bool = false;
    if (paramInt > 128) {
      bool = true;
      paramInt -= 128;
    } 
    this.ZQ = paramInt;
    this.ZN = bool;
  }
  
  public boolean ZNr() {
    return (this.ZQ == 1 || this.ZQ == 9 || this.ZQ == 10);
  }
  
  public boolean ZN6() {
    return (this.ZQ == 2 || this.ZQ == 8 || this.ZQ == 13);
  }
  
  public boolean ZNI() {
    return (this.ZQ == 3 || this.ZQ == 11 || this.ZQ == 12);
  }
  
  public boolean ZNU() {
    return (this.ZQ == 4);
  }
  
  public boolean ZNF() {
    return (this.ZQ == 5);
  }
  
  public boolean ZNX() {
    return (this.ZQ == 17);
  }
  
  public boolean ZNg() {
    return (this.ZQ == 18 || ZN5());
  }
  
  public boolean ZN5() {
    return (this.ZQ == 7);
  }
  
  public boolean ZNy() {
    return true;
  }
  
  public boolean ZN8() {
    return true;
  }
  
  public boolean ZN9() {
    return true;
  }
  
  public boolean ZNf() {
    return true;
  }
  
  public boolean ZNz() {
    return true;
  }
  
  public boolean ZNc() {
    return true;
  }
  
  public boolean ZNd() {
    return true;
  }
  
  public boolean ZN2() {
    return true;
  }
  
  public boolean ZNC() {
    return this.ZN;
  }
  
  public boolean ZNP() {
    return (this.ZQ == 8);
  }
  
  public boolean ZNQ() {
    return (this.ZQ == 11);
  }
  
  public boolean ZNO() {
    return (this.ZQ == 9);
  }
  
  public boolean ZN0() {
    return (this.ZQ == 12);
  }
  
  public boolean ZNY() {
    return (this.ZQ == 10);
  }
  
  public boolean ZNo() {
    return (this.ZQ == 13);
  }
  
  public int ZNE() {
    return Integer.MAX_VALUE;
  }
  
  public boolean ZI(Zs66 paramZs66, String paramString1, String paramString2) {
    return false;
  }
  
  public boolean Z_(Zs66 paramZs66, String paramString1, String paramString2) {
    return false;
  }
  
  public boolean ZW(Zs66 paramZs66) {
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */