package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.Objects;
import net.portswigger.browser.Zd;
import net.portswigger.browser.Ze3;
import net.portswigger.browser.Zev;
import net.portswigger.devtools.client.Zn;

public class Zxb implements Zf {
  private final Zev ZH;
  
  private final Zd Zd;
  
  private final Zxa Zp;
  
  private final Zn ZM;
  
  private volatile Ze3 Zr;
  
  private static final String a;
  
  public Zxb(Zev paramZev, Zd paramZd, Zxa paramZxa, Zn paramZn) {
    this.ZH = Objects.<Zev>requireNonNull(paramZev);
    this.Zd = Objects.<Zd>requireNonNull(paramZd);
    this.ZM = Objects.<Zn>requireNonNull(paramZn);
    this.Zp = Objects.<Zxa>requireNonNull(paramZxa);
    String[] arrayOfString = Zxa.Zy();
    this.Zr = Ze3.ATTACHED;
    if (Zbqc.Zwu() == null)
      Zxa.Zb(new String[1]); 
  }
  
  public final Zd Z_() {
    return this.Zd;
  }
  
  public final Zev ZG() {
    return this.ZH;
  }
  
  public final Zn Zv() {
    return this.ZM;
  }
  
  public final Ze3 ZO() {
    return this.Zr;
  }
  
  public final void Zo(Ze3 paramZe3) {
    this.Zr = paramZe3;
  }
  
  public String toString() {
    return a.formatted(new Object[] { this.Zp.Zyh(), this.Zd });
  }
  
  public void Zp() {
    this.ZM.ZX();
  }
  
  static {
    // Byte code:
    //   0: bipush #41
    //   2: ldc ']O6yO#z\\fxu9'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zxb.a : Ljava/lang/String;
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
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #77
    //   87: goto -> 112
    //   90: bipush #61
    //   92: goto -> 112
    //   95: bipush #108
    //   97: goto -> 112
    //   100: bipush #53
    //   102: goto -> 112
    //   105: bipush #21
    //   107: goto -> 112
    //   110: bipush #121
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */