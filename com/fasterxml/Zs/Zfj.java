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
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zyt;
import java.io.IOException;

@Zl
public class Zfj extends Zux<Float> {
  private static final long serialVersionUID = 1L;
  
  static final Zfj ZQ;
  
  static final Zfj Ze;
  
  private static final String f;
  
  public Zfj(Class<Float> paramClass, Float paramFloat) {
    super(paramClass, Zd.Float, paramFloat, Float.valueOf(0.0F));
  }
  
  public Float ZC(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_NUMBER_FLOAT))
        return Float.valueOf(paramZg.Zg()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zg)
        return Float.valueOf(Zx(paramZg, paramZyg)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Zc(paramZg, paramZyg);
  }
  
  protected final Float Zc(Zg paramZg, Zyg paramZyg) throws IOException {
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
            return (Float)Zy(paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      case 8:
        return Float.valueOf(paramZg.Zg());
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
        return (Float)paramZyg.ZE(Zq(paramZyg), paramZg);
    } 
    Float float_ = ZH(str);
    try {
      if (float_ != null)
        return float_; 
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
        return (Float)Zy(paramZyg); 
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
          return Float.valueOf(Zyt.ZT(str, paramZg.Zt(Zmv.USE_FAST_DOUBLE_PARSER)));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw new Error();
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Float)paramZyg.ZN(this.ZC, str, f, new Object[0]);
  }
  
  static {
    // Byte code:
    //   0: bipush #51
    //   2: ldc 'E<MPJxG\\r`GhMPJy'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zfj.f : Ljava/lang/String;
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
    //   80: bipush #24
    //   82: goto -> 112
    //   85: bipush #68
    //   87: goto -> 112
    //   90: bipush #93
    //   92: goto -> 112
    //   95: bipush #47
    //   97: goto -> 112
    //   100: bipush #84
    //   102: goto -> 112
    //   105: bipush #94
    //   107: goto -> 112
    //   110: bipush #21
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
    //   154: new com/fasterxml/Zs/Zfj
    //   157: dup
    //   158: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   161: fconst_0
    //   162: invokestatic valueOf : (F)Ljava/lang/Float;
    //   165: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Float;)V
    //   168: putstatic com/fasterxml/Zs/Zfj.ZQ : Lcom/fasterxml/Zs/Zfj;
    //   171: new com/fasterxml/Zs/Zfj
    //   174: dup
    //   175: ldc java/lang/Float
    //   177: aconst_null
    //   178: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Float;)V
    //   181: putstatic com/fasterxml/Zs/Zfj.Ze : Lcom/fasterxml/Zs/Zfj;
    //   184: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */