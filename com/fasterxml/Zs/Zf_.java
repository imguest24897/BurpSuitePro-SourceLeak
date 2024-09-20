package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zyt;
import java.io.IOException;

@Zl
public class Zf_ extends Zux<Double> {
  private static final long serialVersionUID = 1L;
  
  static final Zf_ Ze;
  
  static final Zf_ ZN;
  
  private static final String f;
  
  public Zf_(Class<Double> paramClass, Double paramDouble) {
    super(paramClass, Zd.Float, paramDouble, Double.valueOf(0.0D));
  }
  
  public Double Zg(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NUMBER_FLOAT))
        return Double.valueOf(paramZg.ZH()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Double.valueOf(Zm(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zi(paramZg, paramZyg);
  }
  
  public Double ZC(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NUMBER_FLOAT))
        return Double.valueOf(paramZg.ZH()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Double.valueOf(Zm(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zi(paramZg, paramZyg);
  }
  
  protected final Double Zi(Zg paramZg, Zyg paramZyg) throws IOException {
    Zx zx2;
    Zbqc[] arrayOfZbqc = Zl.Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        try {
          if (arrayOfZbqc != null)
            return Zj(paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      case 11:
        return Zj(paramZyg);
      case 7:
        zx2 = Zk(paramZg, paramZyg, this.ZC);
        try {
          if (zx2 == Zx.AsNull)
            return Zj(paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (zx2 == Zx.AsEmpty)
            return (Double)Zy(paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      case 8:
        return Double.valueOf(paramZg.ZH());
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
        return (Double)paramZyg.ZE(Zq(paramZyg), paramZg);
    } 
    Double double_ = ZN(str);
    try {
      if (double_ != null)
        return double_; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx zx1 = ZR(paramZyg, str);
    try {
      if (zx1 == Zx.AsNull)
        return Zj(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (zx1 == Zx.AsEmpty)
        return (Double)Zy(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = str.trim();
    try {
      if (Za(paramZyg, str))
        return Zj(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zyt.ZA(str)) {
        paramZg.ZG().Z_(str.length());
        try {
          return Double.valueOf(ZV(str, paramZg.Zt(Zmv.USE_FAST_DOUBLE_PARSER)));
        } catch (IllegalArgumentException illegalArgumentException) {}
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Double)paramZyg.ZN(this.ZC, str, f, new Object[0]);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: ldc 'b"YG\\bm!\\bS:c8[]^z,\\rB]'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zf_.f : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_3
    //   81: goto -> 111
    //   84: bipush #66
    //   86: goto -> 111
    //   89: bipush #110
    //   91: goto -> 111
    //   94: bipush #56
    //   96: goto -> 111
    //   99: bipush #55
    //   101: goto -> 111
    //   104: bipush #104
    //   106: goto -> 111
    //   109: bipush #113
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
    //   153: new com/fasterxml/Zs/Zf_
    //   156: dup
    //   157: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
    //   160: dconst_0
    //   161: invokestatic valueOf : (D)Ljava/lang/Double;
    //   164: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Double;)V
    //   167: putstatic com/fasterxml/Zs/Zf_.Ze : Lcom/fasterxml/Zs/Zf_;
    //   170: new com/fasterxml/Zs/Zf_
    //   173: dup
    //   174: ldc java/lang/Double
    //   176: aconst_null
    //   177: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Double;)V
    //   180: putstatic com/fasterxml/Zs/Zf_.ZN : Lcom/fasterxml/Zs/Zf_;
    //   183: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zf_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */