package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkeg {
  private final Zt4u ZW;
  
  private final Zx8n ZT;
  
  private final Zrdv ZI;
  
  private final Zbnt Zr;
  
  private final Ztwv Zx;
  
  private final Zey9 Zt;
  
  private final Zbiw ZY;
  
  private final Zbre ZD;
  
  private Zbra Zy;
  
  private Zbrk ZO;
  
  private Zbrc Zu;
  
  private Zbrd Zq;
  
  private static final String a;
  
  Zkeg(Zt4u paramZt4u, Zx8n paramZx8n, Zrdv paramZrdv, Zbnt paramZbnt, Ztwv paramZtwv, Zey9 paramZey9) {
    this.ZW = paramZt4u;
    this.ZT = paramZx8n;
    this.ZI = paramZrdv;
    this.Zr = paramZbnt;
    this.Zx = paramZtwv;
    this.Zt = paramZey9;
    this.ZD = new Zbre(this);
    this.ZY = new Zl0a(paramZx8n.ZYW(), a, 80, 25, this.ZD);
  }
  
  Zsic ZS(Zsic paramZsic) {
    if (paramZsic == this.Zy)
      return this.ZD; 
    if (paramZsic == this.ZO)
      return this.Zy; 
    if (paramZsic == this.Zu)
      return this.ZO; 
    if (paramZsic == this.Zq)
      return this.Zu; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic Zh(Zsic paramZsic) {
    if (paramZsic == this.ZD) {
      if (this.Zy == null)
        this.Zy = new Zbra(this); 
      return this.Zy;
    } 
    if (paramZsic == this.Zy) {
      if (this.ZO == null)
        this.ZO = new Zbrk(this, this.ZD); 
      return this.ZO;
    } 
    if (paramZsic == this.ZO) {
      if (this.Zu == null)
        this.Zu = new Zbrc(this); 
      return this.Zu;
    } 
    if (paramZsic == this.Zu) {
      if (this.Zq == null)
        this.Zq = new Zbrd(this.ZW, this, this.ZD); 
      return this.Zq;
    } 
    if (paramZsic == this.Zq)
      return new Zbrg(this, this.ZY, this.ZD, this.Zy, this.ZO, this.Zu, this.Zq, this.Zr, this.Zx, this.Zt); 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  public Zl04 Z_() {
    return this.ZY.Zu();
  }
  
  Zrdv Zr() {
    return this.ZI;
  }
  
  Zx8n ZC() {
    return this.ZT;
  }
  
  static {
    // Byte code:
    //   0: bipush #83
    //   2: ldc 'Pv]h8 usmA}jSdws@jlxu#Xqbdv'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkeg.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #65
    //   82: goto -> 112
    //   85: bipush #80
    //   87: goto -> 112
    //   90: bipush #124
    //   92: goto -> 112
    //   95: bipush #75
    //   97: goto -> 112
    //   100: bipush #75
    //   102: goto -> 112
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #69
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkeg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */