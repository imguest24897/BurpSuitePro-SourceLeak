package burp;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Zepn implements Iterator<Integer> {
  private Zefg<Zmyi> ZQ;
  
  private int ZW;
  
  private int Zc;
  
  private int Zr;
  
  private Zmyi Zt;
  
  private int Zg;
  
  private int ZC;
  
  private int ZD;
  
  final Zx20 Ze;
  
  private Zepn(Zx20 paramZx20) {
    this(paramZx20, 0);
  }
  
  private Zepn(Zx20 paramZx20, int paramInt) {
    ZS(paramInt);
  }
  
  private void ZS(int paramInt) {
    this.ZQ = this.Ze.ZB();
    this.ZW = this.ZQ.size();
    this.Zc = this.Ze.ZR();
    this.Zr = this.Ze.size();
    if (this.Zr > 0) {
      int i = paramInt + this.Ze.Zl();
      this.Zg = i / this.Zc;
      this.ZC = i % this.Zc;
      this.Zt = this.ZQ.get(this.Zg);
    } 
    this.ZD = paramInt;
  }
  
  public boolean hasNext() {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (this.ZD < this.Zr);
  }
  
  public Integer Za() {
    try {
      if (!hasNext())
        throw new NoSuchElementException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    Integer integer = Integer.valueOf(this.Zt.ZN(this.ZC++));
    try {
      if (this.ZC >= this.Zc)
        try {
          this.ZC = 0;
          if (++this.Zg < this.ZW)
            this.Zt = this.ZQ.get(this.Zg); 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.ZD++;
    return integer;
  }
  
  public void remove() {
    try {
      if (this.ZD == 0)
        throw new IllegalStateException(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    this.Ze.Zq(--this.ZD);
    ZS(this.ZD);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zepn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */