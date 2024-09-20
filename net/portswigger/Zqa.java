package net.portswigger;

import burp.Zbqc;

public class Zqa {
  private Zrmf ZZ = new Zrmf();
  
  public Zqa() {}
  
  public Zqa(Zrmf paramZrmf) {
    this.ZZ.Zv = paramZrmf.Zv;
    this.ZZ.ZR.addAll(paramZrmf.ZR);
    this.ZZ.ZX.addAll(paramZrmf.ZX);
    this.ZZ.ZO.addAll(paramZrmf.ZO);
    this.ZZ.Zd.addAll(paramZrmf.Zd);
    this.ZZ.ZK = paramZrmf.ZK;
    this.ZZ.ZD.addAll(paramZrmf.ZD);
    this.ZZ.Zt.addAll(paramZrmf.Zt);
    int i = Zrmf.ZU();
    if (i != 0)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zqa Zq(String paramString) {
    this.ZZ.Zv = paramString;
    return this;
  }
  
  public Zqa ZN(Zms paramZms) {
    this.ZZ.ZR.add(paramZms);
    return this;
  }
  
  public Zqa ZE(Zms paramZms) {
    this.ZZ.ZX.add(paramZms);
    return this;
  }
  
  public Zqa Zh(Zms paramZms) {
    this.ZZ.ZO.add(paramZms);
    return this;
  }
  
  public Zqa Zw(Zu5 paramZu5) {
    this.ZZ.Zd.add(paramZu5);
    return this;
  }
  
  public Zqa ZH(String paramString) {
    this.ZZ.ZK = paramString;
    return this;
  }
  
  public Zqa ZR(Zms paramZms) {
    this.ZZ.ZD.clear();
    this.ZZ.ZD.add(paramZms);
    return this;
  }
  
  public Zqa Za(Zrzk paramZrzk) {
    this.ZZ.Zt.add(paramZrzk);
    return this;
  }
  
  public Zrmf ZG() {
    return this.ZZ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqa.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */