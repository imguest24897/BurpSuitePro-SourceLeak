package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zyt;
import java.io.IOException;

@Zl
public class Zu3 extends Zuy<Object> {
  public static final Zu3 Zy;
  
  private static final String e;
  
  public Zu3() {
    super(Number.class);
  }
  
  public final Zd Zb() {
    return Zd.Integer;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    switch (paramZg.Zy()) {
      case 6:
        str = paramZg.ZR();
        try {
          if (arrayOfZbqc != null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      case 7:
        try {
          if (paramZyg.ZM(Z_))
            return Ze(paramZg, paramZyg); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramZg.Zb();
      case 8:
        try {
          if (paramZyg.Zg(Zyp.USE_BIG_DECIMAL_FOR_FLOATS))
            try {
              if (!paramZg.Zr())
                return paramZg.ZT(); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramZg.Zb();
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
        return paramZyg.ZE(Zq(paramZyg), paramZg);
    } 
    Zx zx = ZR(paramZyg, str);
    try {
      if (zx == Zx.AsNull)
        return Zj(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return Zy(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = str.trim();
    try {
      if (Zo(str))
        return Zj(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zy(str))
        return Double.valueOf(Double.POSITIVE_INFINITY); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zp(str))
        return Double.valueOf(Double.NEGATIVE_INFINITY); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (ZY(str))
        return Double.valueOf(Double.NaN); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      try {
        if (Ze(str)) {
          paramZg.ZG().ZZ(str.length());
          if (paramZyg.Zg(Zyp.USE_BIG_INTEGER_FOR_INTS))
            return Zyt.ZI(str, paramZg.Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER)); 
          long l = Zyt.ZO(str);
          try {
            if (!paramZyg.Zg(Zyp.USE_LONG_FOR_INTS))
              try {
                if (l <= 2147483647L && l >= -2147483648L)
                  return Integer.valueOf((int)l); 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              }  
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          return Long.valueOf(l);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (Zyt.ZA(str)) {
          paramZg.ZG().Z_(str.length());
          return paramZyg.Zg(Zyp.USE_BIG_DECIMAL_FOR_FLOATS) ? Zyt.Zu(str, paramZg.Zt(Zmv.USE_FAST_BIG_NUMBER_PARSER)) : Double.valueOf(Zyt.ZE(str, paramZg.Zt(Zmv.USE_FAST_DOUBLE_PARSER)));
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {}
    return paramZyg.ZN(this.ZC, str, e, new Object[0]);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 6:
        case 7:
        case 8:
          return deserialize(paramZg, paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZt.ZR(paramZg, paramZyg);
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc ':1E\\r\\f\\n9uC7\\rc'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zu3.e : Ljava/lang/String;
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
    //   80: bipush #93
    //   82: goto -> 112
    //   85: bipush #99
    //   87: goto -> 112
    //   90: bipush #94
    //   92: goto -> 112
    //   95: bipush #39
    //   97: goto -> 112
    //   100: bipush #18
    //   102: goto -> 112
    //   105: bipush #27
    //   107: goto -> 112
    //   110: bipush #76
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
    //   154: new com/fasterxml/Zs/Zu3
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic com/fasterxml/Zs/Zu3.Zy : Lcom/fasterxml/Zs/Zu3;
    //   164: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */