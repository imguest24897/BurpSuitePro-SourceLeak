package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zyt;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@Zl
public class Zuk extends Zuy<BigInteger> {
  public static final Zuk Zc;
  
  private static final String e;
  
  public Zuk() {
    super(BigInteger.class);
  }
  
  public Object Zy(Zyg paramZyg) {
    return BigInteger.ZERO;
  }
  
  public final Zd Zb() {
    return Zd.Integer;
  }
  
  public BigInteger Zj(Zg paramZg, Zyg paramZyg) throws IOException {
    BigDecimal bigDecimal;
    Zbqc[] arrayOfZbqc = Zl.Zn();
    try {
      if (paramZg.ZA())
        return paramZg.ZX(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        if (arrayOfZbqc != null);
        break;
      case 8:
        zx = ZV(paramZg, paramZyg, this.ZC);
        try {
          if (zx == Zx.AsNull)
            return (BigInteger)Zj(paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (zx == Zx.AsEmpty)
            return (BigInteger)Zy(paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        bigDecimal = paramZg.ZT();
        paramZg.ZG().Zn(bigDecimal.scale());
        return bigDecimal.toBigInteger();
      case 1:
        str = paramZyg.Zc(paramZg, this, this.ZC);
        try {
          if (arrayOfZbqc != null)
            return ZF(paramZg, paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      case 3:
        return ZF(paramZg, paramZyg);
      default:
        return (BigInteger)paramZyg.ZE(Zq(paramZyg), paramZg);
    } 
    Zx zx = ZR(paramZyg, str);
    try {
      if (zx == Zx.AsNull)
        return (BigInteger)Zj(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return (BigInteger)Zy(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str))
        return (BigInteger)Zj(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Ze(str)) {
        paramZg.ZG().ZZ(str.length());
        try {
          return Zyt.ZI(str, paramZg.Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER));
        } catch (IllegalArgumentException illegalArgumentException) {}
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (BigInteger)paramZyg.ZN(this.ZC, str, e, new Object[0]);
  }
  
  static {
    // Byte code:
    //   0: bipush #66
    //   2: ldc 'ENMmhJMP)VT{[S\>HjJUP"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zuk.e : Ljava/lang/String;
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
    //   80: bipush #105
    //   82: goto -> 112
    //   85: bipush #99
    //   87: goto -> 112
    //   90: bipush #123
    //   92: goto -> 112
    //   95: bipush #15
    //   97: goto -> 112
    //   100: bipush #52
    //   102: goto -> 112
    //   105: bipush #100
    //   107: goto -> 112
    //   110: bipush #92
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
    //   154: new com/fasterxml/Zs/Zuk
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic com/fasterxml/Zs/Zuk.Zc : Lcom/fasterxml/Zs/Zuk;
    //   164: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zuk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */