package com.fasterxml.Zq;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zm1;
import com.fasterxml.Zb.Zmt;

public class Zf extends Ze {
  protected final Zf ZD;
  
  protected Zs ZC;
  
  protected Zf Zy;
  
  protected String ZK;
  
  protected Object ZP;
  
  protected boolean Zi;
  
  private static int Zf;
  
  private static final String c;
  
  protected Zf(int paramInt, Zf paramZf, Zs paramZs) {
    this.Zz = paramInt;
    this.ZD = paramZf;
    this.Zv = (paramZf == null) ? 0 : (paramZf.Zv + 1);
    this.ZC = paramZs;
    this.Zb = -1;
  }
  
  protected Zf(int paramInt, Zf paramZf, Zs paramZs, Object paramObject) {
    this.Zz = paramInt;
    this.ZD = paramZf;
    this.Zv = (paramZf == null) ? 0 : (paramZf.Zv + 1);
    this.ZC = paramZs;
    this.Zb = -1;
    this.ZP = paramObject;
  }
  
  public Zf Zs(int paramInt) {
    this.Zz = paramInt;
    this.Zb = -1;
    this.ZK = null;
    this.Zi = false;
    this.ZP = null;
    if (this.ZC != null)
      this.ZC.Zh(); 
    return this;
  }
  
  public Zf Zr(int paramInt, Object paramObject) {
    this.Zz = paramInt;
    this.Zb = -1;
    this.ZK = null;
    this.Zi = false;
    this.ZP = paramObject;
    if (this.ZC != null)
      this.ZC.Zh(); 
    return this;
  }
  
  public Zf ZY(Zs paramZs) {
    this.ZC = paramZs;
    return this;
  }
  
  public Object Zb() {
    return this.ZP;
  }
  
  public void Z_(Object paramObject) {
    this.ZP = paramObject;
  }
  
  public static Zf Zu(Zs paramZs) {
    return new Zf(0, null, paramZs);
  }
  
  public Zf Ze() {
    Zf zf = this.Zy;
    if (zf == null) {
      this.Zy = zf = new Zf(1, this, (this.ZC == null) ? null : this.ZC.Zw());
      return zf;
    } 
    return zf.Zs(1);
  }
  
  public Zf Zx(Object paramObject) {
    Zf zf = this.Zy;
    if (zf == null) {
      this.Zy = zf = new Zf(1, this, (this.ZC == null) ? null : this.ZC.Zw(), paramObject);
      return zf;
    } 
    return zf.Zr(1, paramObject);
  }
  
  public Zf ZD() {
    Zf zf = this.Zy;
    if (zf == null) {
      this.Zy = zf = new Zf(2, this, (this.ZC == null) ? null : this.ZC.Zw());
      return zf;
    } 
    return zf.Zs(2);
  }
  
  public Zf Zu(Object paramObject) {
    Zf zf = this.Zy;
    if (zf == null) {
      this.Zy = zf = new Zf(2, this, (this.ZC == null) ? null : this.ZC.Zw(), paramObject);
      return zf;
    } 
    return zf.Zr(2, paramObject);
  }
  
  public final Zf ZJ() {
    return this.ZD;
  }
  
  public final String Z_() {
    return this.ZK;
  }
  
  public boolean ZV() {
    return (this.ZK != null);
  }
  
  public Zf Zp() {
    this.ZP = null;
    return this.ZD;
  }
  
  public Zs ZB() {
    return this.ZC;
  }
  
  public int Zc(String paramString) throws Zmt {
    try {
      if (this.Zz == 2)
        try {
          if (!this.Zi) {
            try {
              this.Zi = true;
              this.ZK = paramString;
              if (this.ZC != null)
                ZV(this.ZC, paramString); 
            } catch (Zmt zmt) {
              throw a(null);
            } 
            try {
            
            } catch (Zmt zmt) {
              throw a(null);
            } 
            return (this.Zb < 0) ? 0 : 1;
          } 
          return 4;
        } catch (Zmt zmt) {
          throw a(null);
        }  
    } catch (Zmt zmt) {
      throw a(null);
    } 
    return 4;
  }
  
  private final void ZV(Zs paramZs, String paramString) throws Zmt {
    if (paramZs.ZH(paramString)) {
      Object object = paramZs.ZD();
      try {
      
      } catch (Zmt zmt) {
        throw a(null);
      } 
      throw new Zm1(c + paramString + "'", (object instanceof com.fasterxml.Zb.Zf) ? (com.fasterxml.Zb.Zf)object : null);
    } 
  }
  
  public int Zz() {
    if (this.Zz == 2) {
      if (!this.Zi)
        return 5; 
      this.Zi = false;
      this.Zb++;
      return 2;
    } 
    if (this.Zz == 1) {
      int i = this.Zb;
      this.Zb++;
      return (i < 0) ? 0 : 1;
    } 
    this.Zb++;
    return (this.Zb == 0) ? 0 : 3;
  }
  
  public static void ZR(int paramInt) {
    Zf = paramInt;
  }
  
  public static int ZH() {
    return Zf;
  }
  
  public static int ZI() {
    int i = ZH();
    return (i == 0) ? 12 : 0;
  }
  
  private static Zmt a(Zmt paramZmt) {
    return paramZmt;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZH : ()I
    //   3: ifne -> 11
    //   6: bipush #65
    //   8: invokestatic ZR : (I)V
    //   11: iconst_1
    //   12: ldc '\\r`B/Y~=pFH/_s-5A'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic com/fasterxml/Zq/Zf.c : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #72
    //   94: goto -> 124
    //   97: bipush #20
    //   99: goto -> 124
    //   102: bipush #103
    //   104: goto -> 124
    //   107: bipush #47
    //   109: goto -> 124
    //   112: bipush #71
    //   114: goto -> 124
    //   117: bipush #59
    //   119: goto -> 124
    //   122: bipush #30
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */