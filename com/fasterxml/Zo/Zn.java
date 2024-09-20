package com.fasterxml.Zo;

import com.fasterxml.Ze.Zh;
import com.fasterxml.Ze.Zs;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zi8;
import com.fasterxml.Zoz.Zif;
import com.fasterxml.Zoz.Zp;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Zn {
  public final Zyg ZW;
  
  public final Zyv ZO;
  
  public final Zi8<?> ZQ;
  
  public final Zh Zm;
  
  public final Map<Zif, Zp[]> ZZ;
  
  private List<Zs> ZU;
  
  private int Zt;
  
  private List<Zs> ZG;
  
  private int ZC;
  
  public Zn(Zyg paramZyg, Zyv paramZyv, Zi8<?> paramZi8, Zh paramZh, Map<Zif, Zp[]> paramMap) {
    this.ZW = paramZyg;
    this.ZO = paramZyv;
    this.ZQ = paramZi8;
    this.Zm = paramZh;
    this.ZZ = paramMap;
  }
  
  public Zt Zq() {
    return this.ZW.Zv();
  }
  
  public void Zw(Zs paramZs) {
    if (this.ZU == null)
      this.ZU = new LinkedList<>(); 
    this.ZU.add(paramZs);
  }
  
  public void Zs() {
    this.Zt++;
  }
  
  public boolean Zn() {
    return (this.Zt > 0);
  }
  
  public boolean ZJ() {
    return (this.ZU != null);
  }
  
  public List<Zs> ZF() {
    return this.ZU;
  }
  
  public void Zc(Zs paramZs) {
    if (this.ZG == null)
      this.ZG = new LinkedList<>(); 
    this.ZG.add(paramZs);
  }
  
  public void ZI() {
    this.ZC++;
  }
  
  public boolean ZL() {
    return (this.ZC > 0);
  }
  
  public boolean ZD() {
    return (this.ZG != null);
  }
  
  public List<Zs> ZR() {
    return this.ZG;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */