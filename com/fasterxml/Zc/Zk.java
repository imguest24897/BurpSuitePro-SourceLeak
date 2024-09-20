package com.fasterxml.Zc;

import java.io.Serializable;

public class Zk implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final char Zi;
  
  private final Zxm Zc;
  
  private final char ZU;
  
  private final Zxm Zf;
  
  private final String ZS;
  
  private final char ZD;
  
  private final Zxm ZE;
  
  private final String Za;
  
  private final String ZZ;
  
  public static Zk Zh() {
    return new Zk();
  }
  
  public Zk() {
    this(':', ',', ',');
  }
  
  public Zk(char paramChar1, char paramChar2, char paramChar3) {
    this(" ", paramChar1, Zxm.BOTH, paramChar2, Zxm.NONE, " ", paramChar3, Zxm.NONE, " ");
  }
  
  public Zk(String paramString1, char paramChar1, Zxm paramZxm1, char paramChar2, Zxm paramZxm2, String paramString2, char paramChar3, Zxm paramZxm3, String paramString3) {
    this.ZZ = paramString1;
    this.Zi = paramChar1;
    this.Zc = paramZxm1;
    this.ZU = paramChar2;
    this.Zf = paramZxm2;
    this.ZS = paramString2;
    this.ZD = paramChar3;
    this.ZE = paramZxm3;
    this.Za = paramString3;
  }
  
  public Zk ZA(Zxm paramZxm) {
    return (this.Zc == paramZxm) ? this : new Zk(this.ZZ, this.Zi, paramZxm, this.ZU, this.Zf, this.ZS, this.ZD, this.ZE, this.Za);
  }
  
  public String Ze() {
    return this.ZZ;
  }
  
  public char ZT() {
    return this.Zi;
  }
  
  public Zxm ZK() {
    return this.Zc;
  }
  
  public char Zt() {
    return this.ZU;
  }
  
  public Zxm Zq() {
    return this.Zf;
  }
  
  public String Zr() {
    return this.ZS;
  }
  
  public char Zi() {
    return this.ZD;
  }
  
  public Zxm Za() {
    return this.ZE;
  }
  
  public String Zv() {
    return this.Za;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zc\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */