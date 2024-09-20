package burp;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;

public class Zb1b {
  private final Zkks Z_;
  
  private final Zmgu Zk;
  
  private final Zthl ZV;
  
  private final Zz3y ZA;
  
  private Zgeb Zj = Zgeb.FULL;
  
  private Zz3y Zp;
  
  private boolean ZE;
  
  private Zb1b(Zkks paramZkks, Zmgu paramZmgu, Zthl paramZthl, Zz3y paramZz3y) {
    this.Z_ = paramZkks;
    this.Zk = paramZmgu;
    this.ZV = paramZthl;
    this.ZA = paramZz3y;
  }
  
  public static Zb1b ZV(Ztc6 paramZtc6, Zkks paramZkks, Zmgu paramZmgu, Zthl paramZthl) {
    LinkedList<Zxlk> linkedList = new LinkedList(Collections.singletonList(new Zxld(paramZtc6.ZQ(0))));
    byte b = 1;
    int i = Zxlk.ZO();
    while (b < paramZtc6.Zr()) {
      linkedList.add(new Zxlk(paramZtc6.ZQ(b)));
      b++;
      if (i == 0)
        break; 
    } 
    Zz3y zz3y = new Zz3y(linkedList, paramZkks, paramZmgu, paramZthl);
    return new Zb1b(paramZkks, paramZmgu, paramZthl, zz3y);
  }
  
  public boolean ZR() {
    return (this.Zj == Zgeb.FULL);
  }
  
  public void ZF() {
    this.Zj = Zgeb.FULL;
  }
  
  public void ZT(Zz3y paramZz3y) {
    this.Zp = paramZz3y;
    this.Zj = Zgeb.SIMPLIFIED;
  }
  
  public void Zw() {
    this.Zj = Zgeb.NONE;
    this.ZE = true;
  }
  
  public Optional<Zz3y> Zj() {
    return (this.Zj == Zgeb.NONE) ? Optional.empty() : Optional.of((this.Zj == Zgeb.SIMPLIFIED) ? this.Zp : this.ZA);
  }
  
  public Zz3y Z_() {
    return this.ZA;
  }
  
  public boolean ZZ() {
    return (this.Zp != null);
  }
  
  public boolean ZP() {
    return this.ZE;
  }
  
  public boolean ZT() {
    return (ZZ() || ZP());
  }
  
  public Optional<Zz3y> Ze(Zb41 paramZb41) {
    return ZH(this.Zp.ZD() - 1, paramZb41);
  }
  
  public Optional<Zz3y> ZH(int paramInt, Zb41 paramZb41) {
    int j = this.ZA.ZD() - 1 - paramInt;
    Zm4b zm4b = paramZb41.ZX(j);
    int i = Zxlk.Zg();
    if (zm4b.ZI() == 0)
      return Optional.empty(); 
    LinkedList<Zxlk> linkedList = new LinkedList(Collections.singletonList(new Zxlc(this.ZA.ZY(j).Zm(), zm4b)));
    int k = j + 1;
    while (k < this.ZA.ZD()) {
      Zm4b zm4b1 = paramZb41.ZX(k);
      linkedList.add(this.ZA.ZY(k).ZA(zm4b1.Zi()));
      k++;
      if (i != 0)
        break; 
    } 
    return Optional.of(new Zz3y(linkedList, this.Z_, this.Zk, this.ZV));
  }
  
  public Zz3y ZP(Zb41 paramZb41) {
    Zxlk zxlk = this.ZA.ZY(0);
    Zxlc zxlc = new Zxlc(zxlk.Zm(), paramZb41.ZX(0).Zv());
    LinkedList<Zxlk> linkedList = new LinkedList(Collections.singletonList(zxlc));
    byte b = 1;
    int i = Zxlk.Zg();
    while (b < this.ZA.ZD()) {
      Zm4b zm4b = paramZb41.ZX(b);
      Zxlk zxlk1 = this.ZA.ZY(b);
      linkedList.add(zxlk1.ZA(zm4b.Zi()));
      b++;
      if (i != 0)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zxlk.ZM(++i); 
    return new Zz3y(linkedList, this.Z_, this.Zk, this.ZV);
  }
  
  public void Zt() {
    this.ZV.Zh();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */