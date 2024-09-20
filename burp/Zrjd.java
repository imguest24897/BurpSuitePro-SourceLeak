package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrjd {
  private final Zeu7 Zt;
  
  private final Zbnt Zz;
  
  private final Zey9 Zd;
  
  private final Zrgd ZN;
  
  private final Zkq4 ZO;
  
  private final Zlba ZJ;
  
  private final Zbjl Zv;
  
  private final Zerg ZU;
  
  private final Zsoh ZP;
  
  private final Zz1m<Zt1o> Zw;
  
  private final boolean Zu;
  
  private static int ZL;
  
  public Zrjd(Zeu7 paramZeu7, Zbnt paramZbnt, Zey9 paramZey9, Zrgd paramZrgd, Zkq4 paramZkq4, Zlba paramZlba, Zbjl paramZbjl, Zerg paramZerg, Zsoh paramZsoh, Zz1m<Zt1o> paramZz1m, boolean paramBoolean) {
    this.Zt = paramZeu7;
    this.Zz = paramZbnt;
    this.Zd = paramZey9;
    this.ZN = paramZrgd;
    this.ZO = paramZkq4;
    this.ZJ = paramZlba;
    this.Zv = paramZbjl;
    this.ZU = paramZerg;
    this.ZP = paramZsoh;
    this.Zw = paramZz1m;
    this.Zu = paramBoolean;
  }
  
  public Ze3n ZO(Zbza paramZbza, Ztpx paramZtpx) {
    Instant instant = Instant.ofEpochMilli(paramZbza.Zgw());
    Zefx zefx = Zo(this.Zd, paramZbza);
    List<Duration> list = Collections.singletonList(Duration.ofMillis(paramZbza.Zgd()));
    Zrsn zrsn = Zrsn.Zq(paramZbza.Zgz(), this.Zz);
    try {
    
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    List<T> list1 = (zrsn == null) ? Collections.<T>emptyList() : Collections.<T>singletonList((T)zrsn);
    try {
      if (!paramZbza.Zge() || !this.ZO.Zql()) {
        Zsxd zsxd = this.ZP.ZD(Ztao.Zc(paramZtpx, paramZbza, paramZbza.ZgC()).Zz(true).ZA());
        Zg3d zg3d = zsxd.ZG();
        Zb6q zb6q = zg3d.Ze();
        try {
          if (zg3d.Zb() == Zvom.TIMED_OUT)
            throw new Zsc5(); 
        } catch (Zsc5 zsc5) {
          throw a(null);
        } 
        try {
          if (zg3d.Zb() != Zvom.UNKNOWN_HOST) {
            try {
              if (zg3d.Zb() == Zvom.CONNECTION_FAILED)
                throw new Zscr(); 
            } catch (Zsc5 zsc5) {
              throw a(null);
            } 
          } else {
            throw new Zscr();
          } 
        } catch (Zsc5 zsc5) {
          throw a(null);
        } 
        try {
          if (zb6q != null) {
            try {
              if (zb6q.Za() != null) {
                try {
                  if (zb6q.Za().Zpu() == 0)
                    throw new Zsct(); 
                } catch (Zsc5 zsc5) {
                  throw a(null);
                } 
              } else {
                throw new Zsct();
              } 
            } catch (Zsc5 zsc5) {
              throw a(null);
            } 
          } else {
            throw new Zsct();
          } 
        } catch (Zsc5 zsc5) {
          throw a(null);
        } 
        instant = this.ZN.Zn();
        zefx = zsxd.Zz().ZR();
        list = zsxd.ZX().stream().map(Zg3d::ZS).toList();
        paramZbza.ZF(((Duration)list.getFirst()).toMillis());
        list1 = zsxd.ZX().stream().map(Zg3d::Ze).toList();
      } 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    Ze3n ze3n = ZV(paramZbza, instant, zefx, list, (List)list1, paramZtpx, Zxdk.Zm, null);
    try {
      if (paramZbza.Zge())
        try {
          if (this.ZO.Zql())
            ze3n.Zr(); 
        } catch (Zsc5 zsc5) {
          throw a(null);
        }  
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    try {
      if (!this.ZJ.Zw(ze3n.ZM()))
        return null; 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    return ze3n;
  }
  
  public Ze3n Zc(Zbza paramZbza, Ztpx paramZtpx) {
    Zefx zefx = Zo(this.Zd, paramZbza);
    Zrsn zrsn = Zrsn.Zq(paramZbza.Zgz(), this.Zz);
    Zxdk zxdk = Zx(paramZbza);
    paramZbza.Zg9(zxdk.Zb().Zq());
    Zlox zlox = Zlox.ZH(this.Zv, this.ZJ, this.Zz, this.Zd, this.ZU);
    try {
    
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    Ze3n ze3n = ZV(paramZbza, Instant.ofEpochMilli(paramZbza.Zgw()), zefx, Collections.singletonList(Duration.ofMillis(paramZbza.Zgd())), (zrsn == null) ? Collections.<Zb6q>emptyList() : Collections.<Zb6q>singletonList(zrsn), paramZtpx, zxdk, zlox);
    try {
      if (!this.ZJ.Zw(paramZbza))
        return null; 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    return ze3n;
  }
  
  private Ze3n ZV(Zbza paramZbza, Instant paramInstant, Zefx paramZefx, List<Duration> paramList, List<Zb6q> paramList1, Ztpx paramZtpx, Zxdk paramZxdk, Zlox paramZlox) {
    Zlub zlub;
    Zzae zzae = new Zzae(this.ZP, paramZtpx, this.Zz, paramInstant, paramZefx, paramList, paramList1);
    try {
      if (paramZbza.Zge() && this.ZO.Zql())
        zlub = new Zlub(zzae, this.Zt.ZA(paramZbza, paramZtpx), this.Zz, this.ZN, paramInstant, paramZefx, paramList, paramList1, paramZbza.Zg3().ZlA()); 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    return paramZbza.Zv(this.Zz, zlub, paramZxdk, paramZlox, this.Zw);
  }
  
  private Zxdk Zx(Zbza paramZbza) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zg0 : ()Lburp/Zmzk;
    //   6: astore_2
    //   7: aload_1
    //   8: invokeinterface ZgC : ()[B
    //   13: astore_3
    //   14: aload_0
    //   15: getfield Zd : Lburp/Zey9;
    //   18: aload_2
    //   19: aload_3
    //   20: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   23: astore #4
    //   25: aload_0
    //   26: aload_1
    //   27: <illegal opcode> ZW : (Lburp/Zrjd;Lburp/Zbza;)Lburp/Zlfl;
    //   32: astore #5
    //   34: new burp/Zzp6
    //   37: dup
    //   38: aload #4
    //   40: aload_1
    //   41: invokeinterface Zgf : ()Lburp/Zefg;
    //   46: aload_0
    //   47: getfield Zz : Lburp/Zbnt;
    //   50: invokespecial <init> : (Lburp/Zefx;Lburp/Zefg;Lburp/Zbnt;)V
    //   53: invokevirtual Zd : ()Lburp/Zzcc;
    //   56: aload_0
    //   57: getfield Zu : Z
    //   60: ifne -> 67
    //   63: iconst_1
    //   64: goto -> 68
    //   67: iconst_0
    //   68: invokevirtual Zq : (Z)Lburp/Zzcc;
    //   71: aload_0
    //   72: getfield ZO : Lburp/Zkq4;
    //   75: aload_0
    //   76: getfield Zz : Lburp/Zbnt;
    //   79: aload #5
    //   81: invokevirtual ZT : (Lburp/Zbph;Lburp/Zbnt;Lburp/Zlfl;)Lburp/Zsmx;
    //   84: aload_1
    //   85: invokeinterface ZgW : ()Lburp/Zmfj;
    //   90: aload_0
    //   91: getfield ZU : Lburp/Zerg;
    //   94: invokevirtual ZU : (Lburp/Zmfj;Lburp/Zerg;)Lburp/Zsmx;
    //   97: invokevirtual Zm : ()Lburp/Zxdk;
    //   100: areturn
  }
  
  private void Zo(Zgh_ paramZgh_, Zexx paramZexx, Zzwo<Zro0, Zga> paramZzwo) {
    Zga zga = paramZzwo.Zd(paramZgh_.ZM());
    try {
      if (zga == null) {
        Zuh.Zb(false, Zqf.Zx);
        return;
      } 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    try {
      switch (Zmzw.Ze[paramZexx.ordinal()]) {
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        default:
          break;
      } 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    Zecx zecx = Zecx.PENDING;
    try {
      if (zga.ZrZ() == Zecx.PENDING)
        zga.Zd(zecx, this.Zw); 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
  }
  
  public static Zefx Zo(Zey9 paramZey9, Zbza paramZbza) {
    try {
    
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    Zstu zstu = (paramZbza.Zgf() == null) ? Zgyj.ZC(paramZbza.Zgy()) : paramZbza.Zgy();
    Zmzk zmzk = paramZbza.Zg0();
    return paramZey9.ZY(zmzk, zstu.ZiD());
  }
  
  private void lambda$findInsertionPoints$0(Zbza paramZbza, Zgh_ paramZgh_, Zexx paramZexx) {
    Zo(paramZgh_, paramZexx, paramZbza.ZgT());
  }
  
  public static void Zs(int paramInt) {
    ZL = paramInt;
  }
  
  public static int ZL() {
    return ZL;
  }
  
  public static int ZG() {
    int i = ZL();
    try {
      if (i == 0)
        return 92; 
    } catch (Zsc5 zsc5) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Zsc5 a(Zsc5 paramZsc5) {
    return paramZsc5;
  }
  
  static {
    if (ZG() != 0)
      Zs(26); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */