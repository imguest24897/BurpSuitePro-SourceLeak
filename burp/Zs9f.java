package burp;

import java.awt.Component;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import net.portswigger.Zah;
import net.portswigger.Zcr;
import net.portswigger.Zdk;
import net.portswigger.Zic;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zm2;
import net.portswigger.Zop;

public class Zs9f implements Zmwq, Zsfs {
  public static final Zop ZP;
  
  private final Zt4u Zb;
  
  private final Zt8u ZH;
  
  private final Zl9 Zo;
  
  private final Zl0 ZB;
  
  private final Ztwv ZC;
  
  private final Zrn7 Zi;
  
  private final Ztni ZF;
  
  private final Zg9h Zn;
  
  private final Zgu1 Z_;
  
  private final Zeyr Zz;
  
  private final Zs0i Zu;
  
  private final Zta5 ZR;
  
  private final Zzl_ ZN;
  
  private final Zx0d Zf;
  
  private final Zz26 ZL;
  
  private final Zee5 ZS;
  
  private final Zrbr Zp;
  
  private final Zlpc Zq;
  
  private Zeru ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs9f(Zt4u paramZt4u, Zt8u paramZt8u, Zl9 paramZl9, Zl0 paramZl0, Ztwv paramZtwv, Ze78 paramZe78, Zrn7 paramZrn7, Zto3 paramZto3) {
    this.Zb = paramZt4u;
    this.ZH = paramZt8u;
    this.Zo = paramZl9;
    this.ZB = paramZl0;
    this.ZC = paramZtwv;
    this.Zi = paramZrn7;
    this.Zq = new Zlpc();
    this.ZF = new Ztni(this.Zq, paramZrn7);
    this.Zn = paramZe78.Zf();
    this.Z_ = paramZe78.ZZ();
    this.Zz = paramZe78.Zo();
    this.Zu = paramZe78.Zl();
    this.ZR = paramZe78.Zs();
    this.ZN = paramZe78.Ze();
    this.Zf = paramZe78.Zx();
    this.ZL = paramZe78.ZK();
    this.ZS = paramZe78.ZY();
    this.Zp = paramZe78.Za();
    paramZto3.ZE(Zt1f.Zm, this::lambda$new$1);
    paramZto3.ZE(Zt1f.Zv, this::lambda$new$3);
    paramZto3.ZE(Zt1f.ZJ, this::lambda$new$5);
  }
  
  public Ztni Zo() {
    return this.ZF;
  }
  
  public void ZB(String paramString) {
    this.Zq.ZJ(paramString);
    this.ZF.fireTableDataChanged();
  }
  
  public Zscl Z_(int paramInt) {
    return this.Zq.ZF(paramInt);
  }
  
  public void Zi(Zeru paramZeru) {
    this.ZV = paramZeru;
  }
  
  public void ZN() {
    this.ZC.Zx(this::ZQ);
  }
  
  public void Zd() {
    this.ZC.Zx(this::lambda$refreshBappList$6);
  }
  
  private void ZQ() {
    List<Zscl> list = ZL();
    if (list != null) {
      Zy(list);
      this.ZV.ZH();
    } 
    Zh(false);
  }
  
  private void Zh(boolean paramBoolean) {
    try {
      this.ZV.Zj(false);
      ZX(a(-16073, 22066), paramBoolean);
      Zy(Zs());
      this.ZV.ZH();
      ZX("", paramBoolean);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      ZN(paramBoolean);
    } finally {
      this.ZV.Zj(true);
    } 
  }
  
  private void ZX(String paramString, boolean paramBoolean) {
    if (paramBoolean)
      ZH(paramString); 
  }
  
  private void ZN(boolean paramBoolean) {
    if (paramBoolean)
      Zz(a(-16071, 9832)); 
  }
  
  public boolean Zm(String paramString) {
    int i = Zl9.ZK();
    List<Zscl> list = this.Zq.ZX();
    if (list != null)
      for (Zscl zscl : list) {
        if (zscl.Z_.Zs().equals(paramString))
          return true; 
        if (i == 0)
          break; 
      }  
    return false;
  }
  
  public Zop Zp(String paramString) {
    return this.Zq.Zo().stream().map(Zs9f::lambda$getBappPerformance$7).filter(Objects::nonNull).filter(paramString::lambda$getBappPerformance$8).findFirst().flatMap(Zcr::Zf).orElse(ZP);
  }
  
  public String ZB(Zscl paramZscl) {
    Zcr zcr = paramZscl.Z_;
    if (paramZscl.Zt == Zm36.INSTALLING)
      return a(-16078, -12403); 
    Zeu1 zeu1 = this.Zo.ZS(zcr.Zs());
    return (zeu1 == null) ? a(-16065, 28970) : ((zeu1.ZZ < zcr.Zz()) ? a(-16067, 31753) : a(-16070, -15690));
  }
  
  public void Zz(Zscl paramZscl) {
    // Byte code:
    //   0: aload_1
    //   1: getfield Z_ : Lnet/portswigger/Zcr;
    //   4: astore_2
    //   5: aload_1
    //   6: getfield Zt : Lburp/Zm36;
    //   9: getstatic burp/Zm36.INSTALLING : Lburp/Zm36;
    //   12: if_acmpeq -> 43
    //   15: aload_2
    //   16: invokevirtual Zp : ()B
    //   19: invokestatic Zo : (I)Lburp/Ztqs;
    //   22: aload_2
    //   23: invokevirtual ZF : ()Z
    //   26: aload_2
    //   27: invokevirtual Zl : ()I
    //   30: aload_0
    //   31: getfield Zi : Lburp/Zrn7;
    //   34: invokestatic Zd : (Lburp/Ztqs;ZILburp/Zrn7;)Lburp/Zmi7;
    //   37: invokevirtual Zz : ()Z
    //   40: ifne -> 51
    //   43: iconst_0
    //   44: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   47: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   50: return
    //   51: aload_1
    //   52: getstatic burp/Zm36.INSTALLING : Lburp/Zm36;
    //   55: putfield Zt : Lburp/Zm36;
    //   58: aload_0
    //   59: sipush #-16066
    //   62: sipush #31373
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokevirtual ZH : (Ljava/lang/String;)V
    //   71: aload_0
    //   72: getfield ZC : Lburp/Ztwv;
    //   75: aload_0
    //   76: aload_2
    //   77: aload_1
    //   78: <illegal opcode> run : (Lburp/Zs9f;Lnet/portswigger/Zcr;Lburp/Zscl;)Ljava/lang/Runnable;
    //   83: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   88: pop
    //   89: return
  }
  
  public void ZK(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zp : Lburp/Zrbr;
    //   4: aload_0
    //   5: getfield Zb : Lburp/Zt4u;
    //   8: aload_1
    //   9: iconst_0
    //   10: sipush #-16069
    //   13: sipush #3013
    //   16: invokestatic a : (II)Ljava/lang/String;
    //   19: invokevirtual Zc : (Lburp/Zt4u;Ljava/awt/Component;ILjava/lang/String;)Ljava/io/File;
    //   22: astore_2
    //   23: aload_2
    //   24: ifnonnull -> 28
    //   27: return
    //   28: aload_0
    //   29: sipush #-16080
    //   32: sipush #14448
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual ZH : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield ZC : Lburp/Ztwv;
    //   45: aload_0
    //   46: aload_2
    //   47: aload_1
    //   48: <illegal opcode> run : (Lburp/Zs9f;Ljava/io/File;Ljava/awt/Component;)Ljava/lang/Runnable;
    //   53: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   58: pop
    //   59: return
  }
  
  private void ZH(String paramString) {
    this.ZV.ZU(paramString, false);
  }
  
  private void Zz(String paramString) {
    this.ZV.ZU(paramString, true);
  }
  
  Zscl Zi(String paramString) {
    List<Zscl> list = this.Zq.Zo();
    Iterator<Zscl> iterator = list.iterator();
    int i = Zl9.ZK();
    while (iterator.hasNext()) {
      Zscl zscl = iterator.next();
      if (paramString.equals(zscl.Z_.Zs()))
        return zscl; 
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  public boolean Zr(Zscl paramZscl) {
    if (paramZscl.Zt != Zm36.INSTALLED)
      return false; 
    Zcr zcr = paramZscl.Z_;
    return this.ZL.Zs(zcr.Zs(), zcr.Zz());
  }
  
  public void ZG(Zscl paramZscl, int paramInt) {
    Zcr zcr = paramZscl.Z_;
    this.ZL.Zk(zcr.Zs(), zcr.Zz(), paramInt);
  }
  
  private Zcr ZA(String paramString1, String paramString2) throws Zic {
    try {
    
    } catch (Zic zic) {
      throw a(null);
    } 
    byte[] arrayOfByte = (paramString1 == null) ? this.Z_.ZW(paramString2) : this.Z_.ZG(paramString1);
    this.Zz.ZO(ZC(arrayOfByte));
    this.Zu.ZV(paramString2);
    return this.ZR.Zm(paramString2, ZC(arrayOfByte));
  }
  
  private Zcr ZQ(File paramFile, Component paramComponent) throws Zic {
    try {
      this.Zz.Zq(paramFile, this.ZB);
    } catch (Zlvd zlvd) {
      try {
        Zah.Zl((Throwable)zlvd, Zk_.COMMON_RUNTIME_FAILURE);
        if (!Zt(paramComponent))
          throw zlvd; 
      } catch (Zlvd zlvd1) {
        throw a(null);
      } 
    } catch (Zlvc zlvc) {
      Zah.Zl((Throwable)zlvc, Zk_.COMMON_RUNTIME_FAILURE);
      Zx6o.Zt(paramComponent, a(-16068, 5350), a(-16077, -26831));
    } 
    Zcr zcr = ZO(paramFile);
    this.Zu.ZV(zcr.Zs());
    this.ZR.Zm(zcr.Zs(), Zo(paramFile));
    return zcr;
  }
  
  private boolean Zt(Component paramComponent) {
    return Zx6o.ZY(paramComponent, a(-16072, -2386));
  }
  
  private Zcr ZO(File paramFile) throws Zic {
    try {
      return Ztv9.Zp(paramFile, this.ZB).ZB();
    } catch (Zic zic) {
      Zah.Zl((Throwable)zic, Zk_.UNEXPECTED);
      throw zic;
    } 
  }
  
  private InputStream ZC(byte[] paramArrayOfbyte) {
    return new ByteArrayInputStream(paramArrayOfbyte);
  }
  
  private InputStream Zo(File paramFile) throws Zic {
    try {
      return new BufferedInputStream(this.ZB.ZO(paramFile));
    } catch (FileNotFoundException fileNotFoundException) {
      Zah.Zl(fileNotFoundException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zic(a(-16079, 2125), fileNotFoundException);
    } 
  }
  
  private List<Zscl> ZL() {
    int i = Zl9.Ze();
    try {
      byte[] arrayOfByte = (new Zmz5(this.ZH)).ZN();
      if (arrayOfByte != null) {
        ArrayList<Zscl> arrayList = new ArrayList();
        for (Zcr zcr : Zdk.Zn(arrayOfByte)) {
          arrayList.add(new Zscl(zcr, Zm36.NOT_INSTALLED));
          if (i != 0)
            break; 
        } 
        return arrayList;
      } 
      return null;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      return null;
    } 
  }
  
  private List<Zscl> Zs() throws Zic {
    this.Zn.ZK();
    (new Zmz5(this.ZH)).ZG(this.Zn.ZJ());
    ArrayList<Zscl> arrayList = new ArrayList();
    int i = Zl9.ZK();
    for (Zcr zcr : this.Zn.Z_()) {
      try {
        if (zcr.ZX())
          this.Zf.Za(zcr.Zs()); 
      } catch (Zic zic) {
        throw a(null);
      } 
      arrayList.add(new Zscl(zcr, Zm36.NOT_INSTALLED));
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  private void Zy(List<Zscl> paramList) {
    this.Zq.Zf(paramList);
    Zw();
    this.ZF.fireTableDataChanged();
  }
  
  private void Zw() {
    List<Zscl> list = this.Zq.Zo();
    Iterator<Zscl> iterator = list.iterator();
    int i = Zl9.ZK();
    while (iterator.hasNext()) {
      Zscl zscl = iterator.next();
      boolean bool = (this.Zo.ZS(zscl.Z_.Zs()) != null) ? true : false;
      if (zscl.Zt != Zm36.INSTALLING)
        zscl.Zt = bool ? Zm36.INSTALLED : Zm36.NOT_INSTALLED; 
      if (i == 0)
        break; 
    } 
    this.ZV.ZS();
    this.ZF.fireTableRowsUpdated(0, list.size() - 1);
  }
  
  public Ze4f Zw(String paramString, int paramInt, boolean paramBoolean) throws Zic {
    List<Zscl> list = this.Zq.Zo();
    Iterator<Zscl> iterator = list.iterator();
    int i = Zl9.Ze();
    while (iterator.hasNext()) {
      Zscl zscl = iterator.next();
      Zcr zcr = zscl.Z_;
      try {
        if (zcr.Zs().equals(paramString))
          try {
            if (paramInt < zcr.Zz()) {
              if (paramBoolean) {
                Zcr zcr1 = ZA(zcr.Zr(), paramString);
                String str = this.ZB.Zh(this.ZS.ZS(zcr1.Zs()), zcr1.Zo()).getPath();
                return Ze4f.ZK(Ztqs.Zo(zcr1.Zp()), str, zcr1.ZI(), zcr1.Zz(), zcr1.ZE());
              } 
              return Ze4f.ZB(zcr.ZE(), Ztqs.Zo(zcr.Zp()));
            } 
          } catch (Zic zic) {
            throw a(null);
          }  
      } catch (Zic zic) {
        throw a(null);
      } 
      if (i != 0)
        break; 
    } 
    return Ze4f.ZQ;
  }
  
  private void lambda$installLocalBapp$10(File paramFile, Component paramComponent) {
    Zscl zscl = null;
    try {
      Zcr zcr = ZQ(paramFile, paramComponent);
      Zmi7 zmi7 = Zmi7.Zd(Ztqs.Zo(zcr.Zp()), zcr.ZF(), zcr.Zl(), this.Zi);
      if (!zmi7.Zz()) {
        Zz(zmi7.Zb().ZI());
        return;
      } 
      zscl = Zi(zcr.Zs());
      try {
        if (zscl != null)
          zscl.Zt = Zm36.INSTALLING; 
      } catch (Zlvk zlvk) {
        throw a(null);
      } 
      try {
        this.ZN.Zc(zcr);
        if (zscl != null) {
          zscl.Zt = Zm36.INSTALLED;
          this.ZV.Zh(zscl);
        } 
      } catch (Zlvk zlvk) {
        throw a(null);
      } 
      ZH("");
    } catch (Zlvk zlvk) {
      try {
        Zah.Zl((Throwable)zlvk, Zk_.COMMON_RUNTIME_FAILURE);
        if (zscl != null) {
          zscl.Zt = Zm36.INSTALLED;
          this.ZV.Zh(zscl);
        } 
      } catch (Zlvk zlvk1) {
        throw a(null);
      } 
      Zz(zlvk.getMessage());
    } catch (Zic zic) {
      Zah.Zl((Throwable)zic, Zk_.COMMON_RUNTIME_FAILURE);
      Zz(zic.getMessage());
    } finally {
      this.ZF.fireTableRowsUpdated(0, this.ZF.getRowCount() - 1);
    } 
    try {
      if (zscl != null)
        try {
          if (zscl.Zt == Zm36.INSTALLED)
            Zm2.Zo(Zze0.EXTENDER_BAPP_STORE_MANUAL_INSTALL); 
        } catch (Zlvk zlvk) {
          throw a(null);
        }  
    } catch (Zlvk zlvk) {
      throw a(null);
    } 
  }
  
  private void lambda$installBapp$9(Zcr paramZcr, Zscl paramZscl) {
    try {
      this.ZN.Zc(ZA(paramZcr.Zr(), paramZcr.Zs()));
      System.gc();
      paramZscl.Zt = Zm36.INSTALLED;
      ZH("");
      this.ZV.Zh(paramZscl);
      Zm2.ZB(Zec3.BAPP_INSTALL, paramZcr.ZI());
    } catch (Zlvk zlvk) {
      Zah.Zl((Throwable)zlvk, Zk_.COMMON_RUNTIME_FAILURE);
      System.gc();
      paramZscl.Zt = Zm36.INSTALLED;
      Zz(zlvk.getMessage());
      this.ZV.Zh(paramZscl);
    } catch (Zic zic) {
      Zah.Zl((Throwable)zic, Zk_.COMMON_RUNTIME_FAILURE);
      paramZscl.Zt = Zm36.NOT_INSTALLED;
      Zz(zic.getMessage());
    } finally {
      this.ZV.ZS();
      this.ZF.fireTableRowsUpdated(0, this.ZF.getRowCount() - 1);
    } 
  }
  
  private static boolean lambda$getBappPerformance$8(String paramString, Zcr paramZcr) {
    return Objects.equals(paramZcr.Zs(), paramString);
  }
  
  private static Zcr lambda$getBappPerformance$7(Zscl paramZscl) {
    return paramZscl.Z_;
  }
  
  private void lambda$refreshBappList$6() {
    Zh(true);
  }
  
  private void lambda$new$5(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$0);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$0);
  }
  
  private void lambda$new$1(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$0);
  }
  
  private void lambda$new$0(Integer paramInteger) {
    Zw();
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ']jf¤Ø '\\b*m3c\\tOpà\\\b¤»ìÂü@¸bµNÖ"þô®<«Ö[øTíÆ«ÐiWUºì&ÝÌwË¹&éÉEÄ´iÆê¸*\\r ^Mðd0i4px Æ]IÙKÍÐÛ<3Ò_äx!ãM²ì¥8×Â<mµsâ£(þé¦w!7Cf4&±w°òü¿«þJb¸*yê¦ÿ¡Ló\\tu_U\\t6öKtÔÓÀà_:È:IÎ^@KûZv¾7oÕyx± +ù­íÞ1h\\r|tä¬ÔWNÆ ÃEËKÁ/FzZRú!ý?À3Å'KùæãÃñz)0Òç¤êUÉ©fjÞâû \\n¦[GxÌÞM·Cåé+å]#¹â)"F¨ÚJoùå¹ú`rHá9\\bI$-kï=4\\rj/Ü/\\bXýly/Û1¦"Õ[ØúqÑÃ°HåIÑ7UHãPoEV>»>3-`4az0qËìFÛ¶±y­\\n|ÙäÔáÆHGwöû­Q§ñd7§°é9!F»'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #80
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'JõÆ!ÍéÊ<Õ(üC\\r¼ 8\\rJ.ÌI6o'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #12
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zs9f.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zs9f.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #38
    //   219: goto -> 244
    //   222: bipush #97
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #66
    //   234: goto -> 244
    //   237: bipush #99
    //   239: goto -> 244
    //   242: bipush #41
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new net/portswigger/Zop
    //   303: dup
    //   304: getstatic net/portswigger/Zqe.LOW : Lnet/portswigger/Zqe;
    //   307: getstatic net/portswigger/Zqe.LOW : Lnet/portswigger/Zqe;
    //   310: getstatic net/portswigger/Zqe.LOW : Lnet/portswigger/Zqe;
    //   313: getstatic net/portswigger/Zqe.LOW : Lnet/portswigger/Zqe;
    //   316: getstatic net/portswigger/Zqe.LOW : Lnet/portswigger/Zqe;
    //   319: invokespecial <init> : (Lnet/portswigger/Zqe;Lnet/portswigger/Zqe;Lnet/portswigger/Zqe;Lnet/portswigger/Zqe;Lnet/portswigger/Zqe;)V
    //   322: putstatic burp/Zs9f.ZP : Lnet/portswigger/Zop;
    //   325: return
  }
  
  private static Zic a(Zic paramZic) {
    return paramZic;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC13B) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '¢';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs9f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */