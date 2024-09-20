package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze6s<K extends Zgpi> implements Zeu4<Zg49<K>> {
  private final Zllo<Zg49<K>> Zh;
  
  final Zek7 ZI;
  
  final Zekv ZJ;
  
  final Zekv ZX;
  
  public final Zeke<Zkc3> ZL;
  
  final Zekg Zj;
  
  private final Zm31[] ZS;
  
  private static Zbqc[] Zb;
  
  Ze6s(Zeu4<K> paramZeu4, Ztdo paramZtdo) {
    this.Zh = new Zgfh<>(this, paramZeu4, paramZtdo);
    this.ZI = new Zek7(0);
    this.ZJ = new Zekv(1);
    this.ZX = new Zekv(2);
    this.ZL = new Zeke<>(3, Zkc3.ZU);
    this.Zj = new Zekg(4);
    this.ZS = new Zm31[] { this.ZI, this.ZX, this.ZJ, this.ZL, this.Zj };
  }
  
  public Zm31[] Zc() {
    return this.ZS;
  }
  
  public Zllo<Zg49<K>> ZI() {
    return this.Zh;
  }
  
  public Zeu4<? extends Zg49<K>> Z_(byte paramByte) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public byte Z_() {
    return 0;
  }
  
  public boolean Zs() {
    return false;
  }
  
  public static void ZT(Zbqc[] paramArrayOfZbqc) {
    Zb = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZL() {
    return Zb;
  }
  
  static {
    if (ZL() == null)
      ZT(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze6s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */