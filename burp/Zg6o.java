package burp;

import net.portswigger.Zsy;

public class Zg6o implements Zm9n {
  private final Zsy ZQ;
  
  private final Zkq4 Zt;
  
  private final Zmhe ZK;
  
  private final Ze3n ZC;
  
  private final Zxs7 ZU;
  
  private final Zbnt Zf;
  
  private final Zbjl Zk;
  
  private final Zr_4 ZD;
  
  public Zg6o(Zkq4 paramZkq4, Zmhe paramZmhe, Ze3n paramZe3n, Zxs7 paramZxs7, Zsy paramZsy, Zbnt paramZbnt, Zbjl paramZbjl, Zr_4 paramZr_4) {
    this.Zt = paramZkq4;
    this.ZK = paramZmhe;
    this.ZC = paramZe3n;
    this.ZU = paramZxs7;
    this.ZQ = paramZsy;
    this.Zf = paramZbnt;
    this.Zk = paramZbjl;
    this.ZD = paramZr_4;
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_XmlManipulation;
  }
  
  public boolean Zf() {
    return (this.ZU.ZZ(this.Zt) && Zx(this.ZU));
  }
  
  public static boolean Zx(Zxs7 paramZxs7) {
    if (paramZxs7.Zg())
      return false; 
    switch (Zkb6.Zk[paramZxs7.Z_().ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      
    } 
    return Z_(paramZxs7);
  }
  
  private static boolean Z_(Zxs7 paramZxs7) {
    String str = paramZxs7.ZI().trim();
    return (str.length() > 3 && str.startsWith("<") && str.endsWith(">"));
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    (new Zn4(this.Zt, this.ZQ, this.ZK, paramZrj.Zg(), this.ZC, this.ZU, this.Zf, this.Zk, this.ZD)).ZO(paramZz4_);
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */