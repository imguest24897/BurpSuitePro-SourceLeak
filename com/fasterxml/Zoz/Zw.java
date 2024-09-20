package com.fasterxml.Zoz;

import com.fasterxml.Zgr;
import com.fasterxml.Zqh;
import com.fasterxml.Zqj;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class Zw implements Zi8<Zw>, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zw Zl;
  
  protected static final Zw ZP;
  
  protected final Zqh ZS;
  
  protected final Zqh ZC;
  
  protected final Zqh Zf;
  
  protected final Zqh Zw;
  
  protected final Zqh ZU;
  
  private static final String a;
  
  public static Zw Zl() {
    return Zl;
  }
  
  public static Zw Ze() {
    return ZP;
  }
  
  public Zw(Zqh paramZqh1, Zqh paramZqh2, Zqh paramZqh3, Zqh paramZqh4, Zqh paramZqh5) {
    this.ZS = paramZqh1;
    this.ZC = paramZqh2;
    this.Zf = paramZqh3;
    this.Zw = paramZqh4;
    this.ZU = paramZqh5;
  }
  
  protected Zw ZG(Zqh paramZqh1, Zqh paramZqh2, Zqh paramZqh3, Zqh paramZqh4, Zqh paramZqh5) {
    return (paramZqh1 == this.ZS && paramZqh2 == this.ZC && paramZqh3 == this.Zf && paramZqh4 == this.Zw && paramZqh5 == this.ZU) ? this : new Zw(paramZqh1, paramZqh2, paramZqh3, paramZqh4, paramZqh5);
  }
  
  public Zw Zz(Zqj paramZqj) {
    Zw zw = this;
    return (paramZqj != null) ? ZG(Zx(this.ZS, paramZqj.ZA()), Zx(this.ZC, paramZqj.Zl()), Zx(this.Zf, paramZqj.Z_()), Zx(this.Zw, paramZqj.Zp()), Zx(this.ZU, paramZqj.Zx())) : zw;
  }
  
  public Zw ZB(Zgr paramZgr) {
    Zw zw = this;
    return (paramZgr != null) ? ZG(Zx(this.ZS, paramZgr.ZP()), Zx(this.ZC, paramZgr.Zj()), Zx(this.Zf, paramZgr.Zy()), Zx(this.Zw, paramZgr.ZB()), Zx(this.ZU, paramZgr.Zf())) : zw;
  }
  
  private Zqh Zx(Zqh paramZqh1, Zqh paramZqh2) {
    return (paramZqh2 == Zqh.DEFAULT) ? paramZqh1 : paramZqh2;
  }
  
  public Zw ZY(Zqh paramZqh) {
    if (paramZqh == Zqh.DEFAULT)
      paramZqh = Zl.ZS; 
    return (this.ZS == paramZqh) ? this : new Zw(paramZqh, this.ZC, this.Zf, this.Zw, this.ZU);
  }
  
  public Zw Zb(Zqh paramZqh) {
    if (paramZqh == Zqh.DEFAULT)
      paramZqh = Zl.ZC; 
    return (this.ZC == paramZqh) ? this : new Zw(this.ZS, paramZqh, this.Zf, this.Zw, this.ZU);
  }
  
  public Zw ZW(Zqh paramZqh) {
    if (paramZqh == Zqh.DEFAULT)
      paramZqh = Zl.Zf; 
    return (this.Zf == paramZqh) ? this : new Zw(this.ZS, this.ZC, paramZqh, this.Zw, this.ZU);
  }
  
  public Zw ZZ(Zqh paramZqh) {
    if (paramZqh == Zqh.DEFAULT)
      paramZqh = Zl.Zw; 
    return (this.Zw == paramZqh) ? this : new Zw(this.ZS, this.ZC, this.Zf, paramZqh, this.ZU);
  }
  
  public Zw Zp(Zqh paramZqh) {
    if (paramZqh == Zqh.DEFAULT)
      paramZqh = Zl.ZU; 
    return (this.ZU == paramZqh) ? this : new Zw(this.ZS, this.ZC, this.Zf, this.Zw, paramZqh);
  }
  
  public boolean ZA(Member paramMember) {
    return this.Zw.Zp(paramMember);
  }
  
  public boolean ZU(Ziz paramZiz) {
    return ZA(paramZiz.ZI());
  }
  
  public boolean Zx(Field paramField) {
    return this.ZU.Zp(paramField);
  }
  
  public boolean Zc(Zi6 paramZi6) {
    return Zx(paramZi6.ZG());
  }
  
  public boolean Zy(Method paramMethod) {
    return this.ZS.Zp(paramMethod);
  }
  
  public boolean Ze(Ziq paramZiq) {
    return Zy(paramZiq.Zu());
  }
  
  public boolean ZM(Method paramMethod) {
    return this.ZC.Zp(paramMethod);
  }
  
  public boolean ZN(Ziq paramZiq) {
    return ZM(paramZiq.Zu());
  }
  
  public boolean Zx(Method paramMethod) {
    return this.Zf.Zp(paramMethod);
  }
  
  public boolean ZQ(Ziq paramZiq) {
    return Zx(paramZiq.Zu());
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.ZS, this.ZC, this.Zf, this.Zw, this.ZU });
  }
  
  static {
    // Byte code:
    //   0: bipush #110
    //   2: ldc 'j!fk=]{aUT3T{}IqB[fk( E}%JxB{l\\ni#{5E}%JxWjtIqB*'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zoz/Zw.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #95
    //   82: goto -> 111
    //   85: bipush #25
    //   87: goto -> 111
    //   90: bipush #97
    //   92: goto -> 111
    //   95: bipush #118
    //   97: goto -> 111
    //   100: iconst_1
    //   101: goto -> 111
    //   104: bipush #26
    //   106: goto -> 111
    //   109: bipush #58
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: new com/fasterxml/Zoz/Zw
    //   156: dup
    //   157: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   160: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   163: getstatic com/fasterxml/Zqh.ANY : Lcom/fasterxml/Zqh;
    //   166: getstatic com/fasterxml/Zqh.ANY : Lcom/fasterxml/Zqh;
    //   169: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   172: invokespecial <init> : (Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;)V
    //   175: putstatic com/fasterxml/Zoz/Zw.Zl : Lcom/fasterxml/Zoz/Zw;
    //   178: new com/fasterxml/Zoz/Zw
    //   181: dup
    //   182: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   185: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   188: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   191: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   194: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   197: invokespecial <init> : (Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;)V
    //   200: putstatic com/fasterxml/Zoz/Zw.ZP : Lcom/fasterxml/Zoz/Zw;
    //   203: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */