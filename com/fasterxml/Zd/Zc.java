package com.fasterxml.Zd;

import burp.Zbqc;
import com.fasterxml.Zgd;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zia;
import com.fasterxml.Zoz.Zik;
import com.fasterxml.Zoz.Ziv;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Zc {
  protected final Zia Zp;
  
  protected final Zf<?> ZC;
  
  protected final Zt ZX;
  
  protected final List<Zik> ZR;
  
  protected final Zik ZP;
  
  protected final Zx[] Zq;
  
  private static final String a;
  
  Zc(Zia paramZia, Zt paramZt, Zf<?> paramZf) {
    this.Zp = paramZia;
    this.ZX = paramZt;
    this.ZC = paramZf;
    boolean bool = Zn.Zx();
    try {
      this.Zq = Zs.ZQ().Zc(paramZia.ZN());
      if (this.Zq == null)
        try {
          this.ZR = paramZia.Zx();
          this.ZP = null;
          if (!bool) {
            Zbqc.Zr(new Zbqc[3]);
          } else {
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = this.Zq.length;
    Zik zik = null;
    if (i == 0) {
      zik = paramZia.ZV();
      this.ZR = Collections.singletonList(zik);
    } else {
      this.ZR = paramZia.Zx();
      label44: for (Zik zik1 : this.ZR) {
        try {
          if (zik1.ZL() == i || !bool) {
            byte b = 0;
            while (b < i) {
              try {
                if (zik1.ZP(b).equals((this.Zq[b]).ZO) || !bool) {
                  b++;
                  if (!bool)
                    break; 
                  continue;
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              continue label44;
            } 
            zik = zik1;
            break;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } 
    try {
      if (zik == null)
        throw new IllegalArgumentException(a + Zx.ZN(this.Zp.Zf())); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZP = zik;
  }
  
  public Zik Zr(List<String> paramList) {
    Iterator<Zik> iterator = this.ZR.iterator();
    boolean bool = Zn.ZB();
    while (iterator.hasNext()) {
      Zik zik = iterator.next();
      Zgd zgd = this.ZX.ZD(this.ZC, (Ziv)zik);
      if (null != zgd)
        try {
          if (Zgd.DISABLED != zgd || bool) {
            try {
              if (Zgd.DELEGATING == zgd)
                return null; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            try {
              if (zik != this.ZP)
                return null; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            if (bool)
              break; 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } 
    try {
      if (this.Zq == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx[] arrayOfZx = this.Zq;
    int i = arrayOfZx.length;
    byte b = 0;
    while (b < i) {
      Zx zx = arrayOfZx[b];
      paramList.add(zx.ZS);
      b++;
      if (bool)
        break; 
    } 
    try {
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Zn.Zj(!bool);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZP;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #40
    //   2: ldc '$8fXj4*qjR.`19#_+.*?\\n`]&`4 lN.`&>\\rpH85&%\\fq%&e%sYj'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zd/Zc.a : Ljava/lang/String;
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
    //   80: bipush #104
    //   82: goto -> 112
    //   85: bipush #109
    //   87: goto -> 112
    //   90: bipush #121
    //   92: goto -> 112
    //   95: bipush #75
    //   97: goto -> 112
    //   100: bipush #43
    //   102: goto -> 112
    //   105: bipush #20
    //   107: goto -> 112
    //   110: bipush #98
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zd\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */