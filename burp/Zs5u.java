package burp;

import java.io.File;

class Zs5u implements Zewu {
  private final File ZZ;
  
  private Zr_4 Z_;
  
  private Zltc Zk;
  
  Zs5u(Ztg4 paramZtg4) throws Zev3 {
    this.ZZ = paramZtg4.Zr();
    this.Z_ = Zkit.Za(this.ZZ, Long.MAX_VALUE, 32768, 134217728, 1073741824, Zlrc.Za, Zk9w.ON_CLOSE);
    boolean bool = Zlu6.ZA();
    try {
      this.Zk = this.Z_.<Zltc>ZH(new Zz7k());
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (Zev3 zev3) {
          throw a(null);
        } 
        Zlu6.ZF(!bool);
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
  }
  
  public void Zi(Zgpi paramZgpi1, Zgpi paramZgpi2) {
    this.Zk.ZN(((Zxsr)paramZgpi1).ZXU(), Long.valueOf(((Zxsr)paramZgpi2).ZXU()));
  }
  
  public Long ZY(Zgpi paramZgpi, Zkit paramZkit) {
    long l = ((Zxsr)paramZgpi).ZXU();
    Long long_ = this.Zk.Zg(l);
    if (Long.valueOf(0L).equals(long_))
      long_ = null; 
    return (long_ == null && paramZkit.ZV((Zxsr)paramZgpi)) ? Long.valueOf(l) : long_;
  }
  
  public void Zk() {
    if (this.Z_ != null)
      this.Z_.close(); 
    this.Z_ = null;
    this.Zk = null;
    Zbw6.ZF(this.ZZ);
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */