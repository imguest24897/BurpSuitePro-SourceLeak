package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zj.Zj;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zm.Zef;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
final class Zw extends Zc {
  private static final long serialVersionUID = 1L;
  
  protected final Zef Zq;
  
  protected final Ziq ZB;
  
  protected volatile Zef Zo;
  
  protected volatile Zef ZK;
  
  protected final Zef Zk;
  
  protected final Enum<?> ZZ;
  
  private static final String c;
  
  protected Zw(Zef paramZef1, Ziq paramZiq, Zef paramZef2, Zef paramZef3, Zef paramZef4) {
    super(-1, paramZef1.Z_());
    this.Zq = paramZef1;
    this.ZB = paramZiq;
    this.ZZ = paramZef1.ZD();
    this.Zk = paramZef2;
    this.Zo = paramZef3;
    this.ZK = paramZef4;
  }
  
  public Object ZR(String paramString, Zyg paramZyg) throws IOException {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    if (this.ZB != null)
      try {
        return this.ZB.ZC(paramString);
      } catch (Exception exception) {
        Zx.ZJ(exception);
      }  
    Zef zef = Zz(paramZyg);
    Enum<?> enum_ = zef.ZN(paramString);
    try {
      if (enum_ == null && paramZyg.Zj((Zz)Zj.READ_ENUM_KEYS_USING_INDEX)) {
        zef = Zx(paramZyg);
        enum_ = zef.ZN(paramString);
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (enum_ == null) {
        try {
          if (this.ZZ != null && paramZyg.Zg(Zyp.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
            enum_ = this.ZZ;
            try {
              if (arrayOfZbqc != null) {
                try {
                  if (!paramZyg.Zg(Zyp.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
                    return paramZyg.Zk(this.ZE, paramString, c, new Object[] { zef.ZC() }); 
                } catch (Exception exception) {
                  throw b(null);
                } 
                return enum_;
              } 
            } catch (Exception exception) {
              throw b(null);
            } 
            return enum_;
          } 
        } catch (Exception exception) {
          throw b(null);
        } 
      } else {
        return enum_;
      } 
    } catch (Exception exception) {
      throw b(null);
    } 
    try {
      if (!paramZyg.Zg(Zyp.READ_UNKNOWN_ENUM_VALUES_AS_NULL))
        return paramZyg.Zk(this.ZE, paramString, c, new Object[] { zef.ZC() }); 
    } catch (Exception exception) {
      throw b(null);
    } 
    return enum_;
  }
  
  protected Zef Zz(Zyg paramZyg) {
    return (this.Zk != null) ? this.Zk : (paramZyg.Zg(Zyp.READ_ENUMS_USING_TO_STRING) ? ZG(paramZyg) : this.Zq);
  }
  
  @Deprecated
  private Zef ZG(Zyg paramZyg) {
    Zef zef = this.Zo;
    if (zef == null)
      synchronized (this) {
        zef = this.Zo;
        if (zef == null) {
          zef = Zef.Zp(paramZyg.Za(), this.Zq.Z_());
          this.Zo = zef;
        } 
      }  
    return zef;
  }
  
  @Deprecated
  private Zef Zx(Zyg paramZyg) {
    Zef zef = this.ZK;
    if (zef == null)
      synchronized (this) {
        zef = this.ZK;
        if (zef == null) {
          zef = Zef.ZS(paramZyg.Za(), this.Zq.Z_());
          this.ZK = zef;
        } 
      }  
    return zef;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc 'Uu.*Sw|u<*Hq|l;fI|j{9iYim^~zlSk9~t/gzuZi)0<j'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zw.c : Ljava/lang/String;
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
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #46
    //   87: goto -> 112
    //   90: bipush #110
    //   92: goto -> 112
    //   95: bipush #62
    //   97: goto -> 112
    //   100: bipush #8
    //   102: goto -> 112
    //   105: bipush #45
    //   107: goto -> 112
    //   110: bipush #45
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */