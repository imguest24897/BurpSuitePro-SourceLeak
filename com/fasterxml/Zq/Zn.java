package com.fasterxml.Zq;

import com.fasterxml.Zb.Ze;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zm0;
import com.fasterxml.Zb.Zm5;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zq6;

public final class Zn extends Ze {
  protected final Zn Zg;
  
  protected Zs ZX;
  
  protected Zn ZT;
  
  protected String Za;
  
  protected Object Zp;
  
  protected int ZP;
  
  protected int ZJ;
  
  private static final String c;
  
  public Zn(Zn paramZn, int paramInt1, Zs paramZs, int paramInt2, int paramInt3, int paramInt4) {
    this.Zg = paramZn;
    this.ZX = paramZs;
    this.Zz = paramInt2;
    this.ZP = paramInt3;
    this.ZJ = paramInt4;
    this.Zb = -1;
    this.Zv = paramInt1;
  }
  
  public void ZJ(int paramInt1, int paramInt2, int paramInt3) {
    this.Zz = paramInt1;
    this.Zb = -1;
    this.ZP = paramInt2;
    this.ZJ = paramInt3;
    this.Za = null;
    this.Zp = null;
    if (this.ZX != null)
      this.ZX.Zh(); 
  }
  
  public Zn Zc(Zs paramZs) {
    this.ZX = paramZs;
    return this;
  }
  
  public Object Zb() {
    return this.Zp;
  }
  
  public void Z_(Object paramObject) {
    this.Zp = paramObject;
  }
  
  public static Zn ZK(Zs paramZs) {
    return new Zn(null, 0, paramZs, 0, 1, 0);
  }
  
  public Zn Zs(int paramInt1, int paramInt2) {
    Zn zn = this.ZT;
    int i = Zf.ZH();
    if (zn == null) {
      this.ZT = zn = new Zn(this, this.Zv + 1, (this.ZX == null) ? null : this.ZX.Zw(), 1, paramInt1, paramInt2);
      if (i == 0) {
        zn.ZJ(1, paramInt1, paramInt2);
        return zn;
      } 
      return zn;
    } 
    zn.ZJ(1, paramInt1, paramInt2);
    return zn;
  }
  
  public Zn Zb(int paramInt1, int paramInt2) {
    Zn zn = this.ZT;
    if (zn == null) {
      this.ZT = zn = new Zn(this, this.Zv + 1, (this.ZX == null) ? null : this.ZX.Zw(), 2, paramInt1, paramInt2);
      return zn;
    } 
    zn.ZJ(2, paramInt1, paramInt2);
    return zn;
  }
  
  public String Z_() {
    return this.Za;
  }
  
  public boolean ZV() {
    return (this.Za != null);
  }
  
  public Zn ZH() {
    return this.Zg;
  }
  
  public Zm5 Zj(Zq6 paramZq6) {
    long l = -1L;
    return new Zm5(paramZq6, l, this.ZP, this.ZJ);
  }
  
  public Zn Zg() {
    this.Zp = null;
    return this.Zg;
  }
  
  public Zs Zt() {
    return this.ZX;
  }
  
  public boolean ZO() {
    int i = ++this.Zb;
    return (this.Zz != 0 && i > 0);
  }
  
  public void Zr(String paramString) throws Zmt {
    try {
      this.Za = paramString;
      if (this.ZX != null)
        ZL(this.ZX, paramString); 
    } catch (Zmt zmt) {
      throw a(null);
    } 
  }
  
  private void ZL(Zs paramZs, String paramString) throws Zmt {
    if (paramZs.ZH(paramString)) {
      Object object = paramZs.ZD();
      try {
      
      } catch (Zmt zmt) {
        throw a(null);
      } 
      throw new Zm0((object instanceof Zg) ? (Zg)object : null, c + paramString + "'");
    } 
  }
  
  private static Zmt a(Zmt paramZmt) {
    return paramZmt;
  }
  
  static {
    // Byte code:
    //   0: bipush #122
    //   2: ldc 'KOvu!3{_&'>k!'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zq/Zn.c : Ljava/lang/String;
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
    //   80: bipush #117
    //   82: goto -> 112
    //   85: bipush #64
    //   87: goto -> 112
    //   90: bipush #124
    //   92: goto -> 112
    //   95: bipush #99
    //   97: goto -> 112
    //   100: bipush #23
    //   102: goto -> 112
    //   105: bipush #56
    //   107: goto -> 112
    //   110: bipush #40
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */