package burp;

import java.awt.Window;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zsy {
  private final Zz0n Zh;
  
  private final Zt4u ZU;
  
  private final Zg8x ZC;
  
  private final Zgbj Zd;
  
  private final Zgb6 ZD;
  
  private final Zskh Zr;
  
  private final Zslu Zy;
  
  private final Ze8b ZV;
  
  private final Zbiv ZE;
  
  private final Zgx0 ZR;
  
  private final Zerg ZQ;
  
  private final Zskh Ze;
  
  private final Zbnt Zf;
  
  private final Ze47 Zg;
  
  private final Ztdi Zj;
  
  private static final String a;
  
  public Zsy(Zz0n paramZz0n, Zt4u paramZt4u, Zg8x paramZg8x, Zgbj paramZgbj, Zgb6 paramZgb6, Zskh paramZskh1, Zslu paramZslu, Zkl6 paramZkl6, Ze8b paramZe8b, Zbiv paramZbiv, Zgx0 paramZgx0, Zerg paramZerg, Zskh paramZskh2, Ztdi paramZtdi) {
    this.Zh = paramZz0n;
    this.ZU = paramZt4u;
    this.ZC = paramZg8x;
    this.Zd = paramZgbj;
    this.ZD = paramZgb6;
    this.Zr = paramZskh1;
    this.Zy = paramZslu;
    this.ZV = paramZe8b;
    this.ZE = paramZbiv;
    this.ZR = paramZgx0;
    this.ZQ = paramZerg;
    this.Ze = paramZskh2;
    this.Zf = paramZkl6.ZB();
    this.Zj = paramZtdi;
    Objects.requireNonNull(paramZgb6);
    this.Zg = new Ze47(paramZkl6.ZM(), paramZgb6::ZcC);
  }
  
  public boolean Zu(int paramInt, Ze65 paramZe65) {
    try {
      Window window = Zt2m.ZF(this.ZC);
      Zlit zlit = paramZe65.ZlL();
      Zmzk zmzk = zlit.Zdz();
      try {
        switch (paramInt) {
          case 133408:
          
          case 133440:
          
          case 136448:
          
          case 136704:
          
          case 136960:
          
          case 131584:
          
          case 131328:
          
          case 133120:
          
          case 132992:
          
          case 133008:
          
          case 132672:
          
          case 132736:
          
          case 134912:
          
          case 135168:
          
          case 135424:
          
          case 134400:
          
          case 134416:
          
          case 134432:
          
          case 134784:
          
          case 133376:
          
          case 133888:
          
          case 133632:
          
          case 134144:
          
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      return false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return true;
    } 
  }
  
  private boolean Zu(Zlit paramZlit) {
    this.ZV.ZV(this.ZU.ZA(), this.Zy.ZAy());
    this.Zy.Zl(new Zlit[] { paramZlit });
    return true;
  }
  
  private boolean Zi(Zlit paramZlit) {
    this.Zy.Zi(new Zlit[] { paramZlit });
    return true;
  }
  
  private boolean Zo(Zll9 paramZll9, Window paramWindow) {
    this.ZE.ZH(paramWindow, Collections.singletonList(paramZll9));
    return true;
  }
  
  private boolean Zi(Zll9 paramZll9) {
    this.ZE.Zv().Zp(paramZll9);
    return true;
  }
  
  private boolean Zz(Zll9 paramZll9) {
    this.ZE.Zv().ZV(paramZll9);
    return true;
  }
  
  private boolean ZG(Zll9 paramZll9, Zmzk paramZmzk) {
    this.ZQ.Zg().Zp(paramZmzk, paramZll9.Zos(), null, paramZll9.ZoO());
    return true;
  }
  
  private boolean ZY(Zmzk paramZmzk, Zstu paramZstu) {
    this.ZQ.Zm().Ze(paramZmzk, paramZstu, null, null);
    return true;
  }
  
  private boolean Zt(Zll9 paramZll9, Zmzk paramZmzk) {
    int[] arrayOfInt = Ztpr.ZJx();
    if (paramZll9.ZoO() != null) {
      this.ZQ.ZK().ZP(paramZmzk, paramZll9.Zos(), paramZll9.ZoO());
      if (arrayOfInt != null) {
        this.ZQ.ZK().ZU(paramZmzk, paramZll9.Zos());
        return true;
      } 
      return true;
    } 
    this.ZQ.ZK().ZU(paramZmzk, paramZll9.Zos());
    return true;
  }
  
  private boolean Zw(Zll9 paramZll9, Zmzk paramZmzk) {
    this.ZQ.Ze().ZN(paramZll9.Ze2(), paramZmzk, paramZll9.Zos(), paramZll9.ZoO(), paramZll9.ZoB(), null);
    return true;
  }
  
  private boolean ZY(Zll9 paramZll9, Zmzk paramZmzk) {
    this.ZQ.ZM().ZB(paramZmzk, paramZll9.Zos(), paramZll9.ZoO(), paramZll9.Ze2());
    return true;
  }
  
  private boolean Zk(Zstu paramZstu) {
    this.ZQ.ZH().ZM(paramZstu);
    return true;
  }
  
  private boolean ZL(Zstu paramZstu) {
    this.ZQ.ZH().ZM(paramZstu);
    return true;
  }
  
  private boolean ZL(Zlit paramZlit, Zstu paramZstu, Window paramWindow) {
    this.ZQ.ZJ().Zf(paramZlit, paramZstu, paramWindow, (byte)0);
    return true;
  }
  
  private boolean ZG(Zlit paramZlit, Zstu paramZstu, boolean paramBoolean, Window paramWindow) {
    this.ZQ.ZJ().Zj(paramZlit, paramZstu, paramBoolean, paramWindow);
    return true;
  }
  
  private boolean ZO(Zski paramZski) {
    this.Zh.ZD().ZR(paramZski.toString());
    return true;
  }
  
  private boolean Za(Zmzk paramZmzk, Zstu paramZstu, Window paramWindow) {
    Zz1p zz1p = Zghc.ZY(paramZmzk, paramZstu, (byte)2, this.Zf);
    String str = Zt5w.ZP(zz1p, paramZstu, paramWindow, this.Zr);
    if (!str.isEmpty())
      this.Zh.ZD().ZR(str); 
    return true;
  }
  
  private boolean Zq(Zlit paramZlit, Zstu paramZstu) {
    int[] arrayOfInt = Ztpr.ZJx();
    if (paramZstu == null)
      return true; 
    Zs68 zs68 = Zbwc.Zt((Zlit)null, paramZstu, Zt0k.HTML_ANALYSIS, this.Zf);
    List<Zsq8> list = Zm46.Zl(paramZlit, zs68, paramZstu, null, this.Zj, this.Zf, this.ZD.ZU0());
    Set set = (Set)list.stream().map(Zsy::lambda$copyLinks$0).collect(Collectors.toSet());
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : set) {
      stringBuilder.append(str);
      stringBuilder.append(Zlb0.Zp);
      if (arrayOfInt != null)
        break; 
    } 
    this.Zh.ZD().ZR(stringBuilder.toString());
    return true;
  }
  
  private boolean Zu(Zll9 paramZll9, Window paramWindow) {
    Zg89 zg89 = new Zg89();
    File file = Zs6n.ZA(Zg1m.DATA, this.ZU, paramWindow, 1, a, zg89);
    if (file != null)
      (new Zzq9(new Zll9[] { paramZll9 }, paramWindow, this.Ze, file, zg89.Zi(), this.Zf, this.Zh.ZM())).run(); 
    return true;
  }
  
  private boolean Za(Zlit paramZlit, Window paramWindow) {
    this.ZR.Zj(paramWindow, paramZlit);
    return true;
  }
  
  private boolean Z_(Zlit paramZlit, Window paramWindow) {
    this.Zd.Zt(paramWindow, paramZlit);
    return true;
  }
  
  private boolean ZH(Zlit paramZlit, Window paramWindow) {
    this.Zd.Zl(paramWindow, paramZlit);
    return true;
  }
  
  private boolean Z_(Zmzk paramZmzk, Zstu paramZstu, Window paramWindow) {
    Zkyt zkyt = this.Zg.Zw(paramZmzk);
    Zbr zbr = Zbr.Zy(paramZstu, zkyt);
    Zgsq zgsq = Zxd9.ZT(zbr).<Zgsq>map(Zgsq::ZW).orElse(Zgsq.AUTO);
    this.Zd.ZC(Zeew.TARGET, paramWindow, paramZmzk, zbr, zgsq);
    return true;
  }
  
  private static String lambda$copyLinks$0(Zsq8 paramZsq8) {
    return paramZsq8.ZZ.toString();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #87
    //   2: ldc 'p\\\b B1'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsy.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #116
    //   82: goto -> 111
    //   85: bipush #110
    //   87: goto -> 111
    //   90: bipush #33
    //   92: goto -> 111
    //   95: bipush #58
    //   97: goto -> 111
    //   100: bipush #45
    //   102: goto -> 111
    //   105: iconst_3
    //   106: goto -> 111
    //   109: bipush #120
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
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */