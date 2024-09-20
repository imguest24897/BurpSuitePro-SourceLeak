package burp;

import java.util.List;
import java.util.Map;

public class Zbn0 implements Zlfv<Zeqn> {
  private final Zei8<?> Zy;
  
  private final Zrde ZB;
  
  private final String Ze;
  
  private final String Z_;
  
  private final Zefg<Zzi8> ZL;
  
  private final String ZR;
  
  private final String Zc;
  
  private final String Zh;
  
  private final List<Zvow> Zq;
  
  private final String ZZ;
  
  private final String ZY;
  
  private final String Zp;
  
  private final String Zm;
  
  private final boolean Zj;
  
  private final String Zb;
  
  private final String ZO;
  
  private final String Zi;
  
  private final String ZW;
  
  private final String Zd;
  
  private final String ZS;
  
  private final String ZP;
  
  private final String Zk;
  
  private final String ZK;
  
  private static int Zw;
  
  public Zbn0(Zei8<?> paramZei8, List<Zvow> paramList, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18) {
    this.Zq = paramList;
    this.ZZ = paramString6;
    this.ZY = paramString7;
    this.Zp = paramString8;
    this.Zm = paramString9;
    this.Zj = paramBoolean;
    this.Zb = paramString10;
    this.ZO = paramString11;
    this.Zi = paramString12;
    this.ZW = paramString13;
    this.Zd = paramString14;
    this.ZL = null;
    this.ZR = paramString3;
    this.Zc = paramString4;
    this.Zh = paramString5;
    this.ZB = null;
    this.Zy = paramZei8;
    this.Ze = paramString1;
    this.Z_ = paramString2;
    this.ZS = paramString15;
    this.ZP = paramString16;
    this.Zk = paramString17;
    this.ZK = paramString18;
  }
  
  public Zsqx<Zeqn> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zmn8(this, paramMap);
  }
  
  public static void Zx(int paramInt) {
    Zw = paramInt;
  }
  
  public static int Zg() {
    return Zw;
  }
  
  public static int Zu() {
    int i = Zg();
    return (i == 0) ? 65 : 0;
  }
  
  static {
    if (Zg() != 0)
      Zx(103); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbn0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */