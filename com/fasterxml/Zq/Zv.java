package com.fasterxml.Zq;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zb.Zj;
import com.fasterxml.Zb.Zm6;
import com.fasterxml.Zb.Zmd;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zb.Zmk;
import com.fasterxml.Zb.Zr;
import com.fasterxml.Zc.Zs;
import com.fasterxml.Zc.Zz;
import com.fasterxml.Zv9;
import com.fasterxml.Zx.Zv;
import com.fasterxml.Zyh;
import java.io.IOException;

public abstract class Zv extends Zv {
  protected static final int[] Zq;
  
  protected static final Zz<Zm6> Zc;
  
  protected final Zr ZG;
  
  protected int[] Zp = Zq;
  
  protected int ZM;
  
  protected Zyh Zr;
  
  protected Zj ZP = Zmi.Zh;
  
  protected boolean ZA;
  
  protected boolean Zk;
  
  private static final String e;
  
  public Zv(Zv9 paramZv9, int paramInt, Zmd paramZmd) {
    super(paramInt, paramZmd, paramZv9);
    this.ZG = paramZv9.Zz();
    if (Zi.ESCAPE_NON_ASCII.Zw(paramInt))
      this.ZM = 127; 
    this.Zk = Zi.WRITE_HEX_UPPER_CASE.Zw(paramInt);
    this.ZA = !Zi.QUOTE_FIELD_NAMES.Zw(paramInt);
  }
  
  public Zmk version() {
    return Zs.ZC(getClass());
  }
  
  public Zr ZV() {
    return this.ZG;
  }
  
  public Zf Zf(Zi paramZi) {
    super.Zf(paramZi);
    int i = Zf.ZH();
    if (paramZi == Zi.QUOTE_FIELD_NAMES) {
      this.ZA = true;
      if (i == 0) {
        if (paramZi == Zi.WRITE_HEX_UPPER_CASE)
          this.Zk = false; 
        return (Zf)this;
      } 
      return (Zf)this;
    } 
    if (paramZi == Zi.WRITE_HEX_UPPER_CASE)
      this.Zk = false; 
    return (Zf)this;
  }
  
  protected void ZE(int paramInt1, int paramInt2) {
    super.ZE(paramInt1, paramInt2);
    this.ZA = !Zi.QUOTE_FIELD_NAMES.Zw(paramInt1);
    this.Zk = Zi.WRITE_HEX_UPPER_CASE.Zw(paramInt1);
  }
  
  public Zf ZP(int paramInt) {
    this.ZM = (paramInt < 0) ? 0 : paramInt;
    return (Zf)this;
  }
  
  public Zf ZH(Zyh paramZyh) {
    this.Zr = paramZyh;
    int i = Zf.ZI();
    if (paramZyh == null) {
      this.Zp = Zq;
      if (i != 0) {
        this.Zp = paramZyh.ZA();
        return (Zf)this;
      } 
      return (Zf)this;
    } 
    this.Zp = paramZyh.ZA();
    return (Zf)this;
  }
  
  public Zf Zf(Zj paramZj) {
    this.ZP = paramZj;
    return (Zf)this;
  }
  
  protected void Zd(String paramString, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()I
    //   3: istore_3
    //   4: iload_2
    //   5: tableswitch default -> 199, 0 -> 107, 1 -> 44, 2 -> 65, 3 -> 86, 4 -> 199, 5 -> 183
    //   44: aload_0
    //   45: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   48: aload_0
    //   49: invokeinterface Zj : (Lcom/fasterxml/Zb/Zf;)V
    //   54: iload_3
    //   55: ifeq -> 210
    //   58: goto -> 65
    //   61: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   64: athrow
    //   65: aload_0
    //   66: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   69: aload_0
    //   70: invokeinterface Zc : (Lcom/fasterxml/Zb/Zf;)V
    //   75: iload_3
    //   76: ifeq -> 210
    //   79: goto -> 86
    //   82: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   85: athrow
    //   86: aload_0
    //   87: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   90: aload_0
    //   91: invokeinterface Zg : (Lcom/fasterxml/Zb/Zf;)V
    //   96: iload_3
    //   97: ifeq -> 210
    //   100: goto -> 107
    //   103: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   106: athrow
    //   107: aload_0
    //   108: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   111: invokevirtual Zo : ()Z
    //   114: ifeq -> 145
    //   117: goto -> 124
    //   120: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   123: athrow
    //   124: aload_0
    //   125: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   128: aload_0
    //   129: invokeinterface ZD : (Lcom/fasterxml/Zb/Zf;)V
    //   134: iload_3
    //   135: ifeq -> 210
    //   138: goto -> 145
    //   141: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   144: athrow
    //   145: aload_0
    //   146: getfield Zo : Lcom/fasterxml/Zq/Zf;
    //   149: invokevirtual ZQ : ()Z
    //   152: ifeq -> 210
    //   155: goto -> 162
    //   158: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   161: athrow
    //   162: aload_0
    //   163: getfield Ze : Lcom/fasterxml/Zb/Zp;
    //   166: aload_0
    //   167: invokeinterface ZV : (Lcom/fasterxml/Zb/Zf;)V
    //   172: iload_3
    //   173: ifeq -> 210
    //   176: goto -> 183
    //   179: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   182: athrow
    //   183: aload_0
    //   184: aload_1
    //   185: invokevirtual Zg : (Ljava/lang/String;)V
    //   188: iload_3
    //   189: ifeq -> 210
    //   192: goto -> 199
    //   195: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   198: athrow
    //   199: aload_0
    //   200: invokevirtual ZN : ()V
    //   203: goto -> 210
    //   206: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
    //   209: athrow
    //   210: return
    // Exception table:
    //   from	to	target	type
    //   4	58	61	java/io/IOException
    //   44	79	82	java/io/IOException
    //   65	100	103	java/io/IOException
    //   86	117	120	java/io/IOException
    //   107	138	141	java/io/IOException
    //   124	155	158	java/io/IOException
    //   145	176	179	java/io/IOException
    //   162	192	195	java/io/IOException
    //   183	203	206	java/io/IOException
  }
  
  protected void Zg(String paramString) throws IOException {
    Zr(String.format(e, new Object[] { paramString, this.Zo.ZF() }));
  }
  
  static {
    // Byte code:
    //   0: bipush #81
    //   2: ldc '>N1lxzS`(:CD6x9IU386>MUQ{71TU'\\r"xzS'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zq/Zv.e : Ljava/lang/String;
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
    //   80: bipush #9
    //   82: goto -> 112
    //   85: bipush #14
    //   87: goto -> 112
    //   90: bipush #113
    //   92: goto -> 112
    //   95: bipush #97
    //   97: goto -> 112
    //   100: bipush #14
    //   102: goto -> 112
    //   105: bipush #40
    //   107: goto -> 112
    //   110: bipush #73
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
    //   154: invokestatic Zg : ()[I
    //   157: putstatic com/fasterxml/Zq/Zv.Zq : [I
    //   160: getstatic com/fasterxml/Zq/Zv.ZF : Lcom/fasterxml/Zc/Zz;
    //   163: putstatic com/fasterxml/Zq/Zv.Zc : Lcom/fasterxml/Zc/Zz;
    //   166: return
  }
  
  private static IOException b(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq\Zv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */