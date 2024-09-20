package burp;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zm2;

public class Zzh8 implements Zg3q {
  private static final List<Zbin> Zl = List.of(Zbin.Zb("", 0), Zbin.ZN("", 0));
  
  private final Zbnt ZH;
  
  private final Zey9 ZL;
  
  private final Supplier<Boolean> Zo;
  
  private volatile Zgsq Zx;
  
  private volatile Zmlg Zm;
  
  private volatile Zgyq Zb;
  
  private Zzxp ZC = Zzxp.Zr;
  
  private Zzxp ZF = Zzxp.Zr;
  
  private Zzxp Zf = Zzxp.Zr;
  
  private volatile boolean Za;
  
  private volatile boolean Zq;
  
  public Zzh8(Zbnt paramZbnt, Zey9 paramZey9, Supplier<Boolean> paramSupplier) {
    this.ZH = paramZbnt;
    this.ZL = paramZey9;
    this.Zo = paramSupplier;
  }
  
  public void ZW(Zzxp paramZzxp) {
    this.ZC = paramZzxp;
    ZQ();
  }
  
  public void ZP(Zzxp paramZzxp) {
    this.ZF = paramZzxp;
    Zf();
  }
  
  public void Zu(Zzxp paramZzxp) {
    this.Zf = paramZzxp;
  }
  
  public Zgsq Zu() {
    return this.Zx;
  }
  
  public List<Zbin> Zl() {
    return ZE() ? this.Zm.Zx() : Zl;
  }
  
  public List<Zb6w> Zh() {
    return ZE() ? this.Zm.ZU() : Collections.<Zb6w>emptyList();
  }
  
  public List<Zevy> Zy() {
    return ZE() ? this.Zm.ZS() : Collections.<Zevy>emptyList();
  }
  
  public List<Zmv3> ZM() {
    return ZE() ? this.Zm.ZP() : Collections.<Zmv3>emptyList();
  }
  
  public List<Ztnj> Zn() {
    return ZE() ? this.Zm.Zc() : Collections.<Ztnj>emptyList();
  }
  
  public List<Ztnj> ZK() {
    return Z_() ? this.Zb.ZV() : Collections.<Ztnj>emptyList();
  }
  
  public boolean ZE() {
    return (this.Zm != null);
  }
  
  public boolean Z_() {
    return (this.Zb != null);
  }
  
  public boolean ZG() {
    return this.ZC.ZQ();
  }
  
  public boolean ZI() {
    return this.ZF.ZQ();
  }
  
  public boolean ZX() {
    return this.Zf.ZQ();
  }
  
  public boolean ZD() {
    return this.ZC.ZB();
  }
  
  public boolean Zc() {
    return this.ZF.ZB();
  }
  
  public boolean ZC() {
    return (this.Zm == null || this.Zm.ZO() == null) ? false : Zt6s.ZX(this.Zm.ZO());
  }
  
  public boolean ZF() {
    return (ZG() || ZE());
  }
  
  public boolean ZR() {
    return (ZG() || !Zh().isEmpty());
  }
  
  public boolean Zg() {
    return ZG() ? ((ZE() && this.Zm.ZX())) : (!ZM().isEmpty());
  }
  
  public boolean Zb() {
    return (ZG() || !Zy().isEmpty());
  }
  
  public boolean ZH() {
    return (ZG() || !Zn().isEmpty());
  }
  
  public boolean ZL() {
    return (ZI() || !ZK().isEmpty());
  }
  
  public void ZQ() {
    this.Za = true;
  }
  
  public void Zf() {
    this.Zq = true;
  }
  
  public boolean ZT() {
    if (this.Za)
      Zv(); 
    if (((Boolean)this.Zo.get()).booleanValue())
      return false; 
    if (this.Zq)
      ZY(); 
    return !((Boolean)this.Zo.get()).booleanValue();
  }
  
  private void Zv() {
    // Byte code:
    //   0: invokestatic ZI : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zzxp;
    //   8: invokeinterface Za : ()Lburp/Zsmh;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield Zm : Lburp/Zmlg;
    //   18: ifnull -> 34
    //   21: aload_0
    //   22: getfield Zm : Lburp/Zmlg;
    //   25: invokeinterface ZO : ()Lburp/Zefx;
    //   30: aload_2
    //   31: if_acmpeq -> 124
    //   34: aload_2
    //   35: ifnull -> 47
    //   38: aload_2
    //   39: invokeinterface Zh : ()Z
    //   44: ifeq -> 56
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield Zm : Lburp/Zmlg;
    //   52: aload_1
    //   53: ifnull -> 124
    //   56: aload_0
    //   57: getfield ZC : Lburp/Zzxp;
    //   60: invokeinterface Zd : ()Lburp/Zgsq;
    //   65: astore_3
    //   66: aload_0
    //   67: getfield ZC : Lburp/Zzxp;
    //   70: aload_0
    //   71: getfield ZH : Lburp/Zbnt;
    //   74: aload_0
    //   75: getfield ZL : Lburp/Zey9;
    //   78: aload_0
    //   79: getfield Zo : Ljava/util/function/Supplier;
    //   82: invokeinterface Zg : (Lburp/Zbnt;Lburp/Zey9;Ljava/util/function/Supplier;)Lburp/Zmlg;
    //   87: astore #4
    //   89: aload #4
    //   91: ifnull -> 112
    //   94: aload_0
    //   95: getfield Zo : Ljava/util/function/Supplier;
    //   98: invokeinterface get : ()Ljava/lang/Object;
    //   103: checkcast java/lang/Boolean
    //   106: invokevirtual booleanValue : ()Z
    //   109: ifeq -> 113
    //   112: return
    //   113: aload_0
    //   114: aload_3
    //   115: putfield Zx : Lburp/Zgsq;
    //   118: aload_0
    //   119: aload #4
    //   121: putfield Zm : Lburp/Zmlg;
    //   124: aload_0
    //   125: iconst_0
    //   126: putfield Za : Z
    //   129: return
  }
  
  private void ZY() {
    // Byte code:
    //   0: invokestatic ZI : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zzxp;
    //   8: invokeinterface Za : ()Lburp/Zsmh;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield Zb : Lburp/Zgyq;
    //   18: ifnull -> 32
    //   21: aload_0
    //   22: getfield Zb : Lburp/Zgyq;
    //   25: invokevirtual Zp : ()Lburp/Zsmh;
    //   28: aload_2
    //   29: if_acmpeq -> 100
    //   32: aload_2
    //   33: ifnull -> 45
    //   36: aload_2
    //   37: invokeinterface Zh : ()Z
    //   42: ifeq -> 54
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield Zb : Lburp/Zgyq;
    //   50: aload_1
    //   51: ifnull -> 100
    //   54: aload_0
    //   55: getfield ZF : Lburp/Zzxp;
    //   58: aload_0
    //   59: getfield ZH : Lburp/Zbnt;
    //   62: aload_0
    //   63: getfield Zo : Ljava/util/function/Supplier;
    //   66: invokeinterface ZX : (Lburp/Zbnt;Ljava/util/function/Supplier;)Lburp/Zgyq;
    //   71: astore_3
    //   72: aload_3
    //   73: ifnull -> 94
    //   76: aload_0
    //   77: getfield Zo : Ljava/util/function/Supplier;
    //   80: invokeinterface get : ()Ljava/lang/Object;
    //   85: checkcast java/lang/Boolean
    //   88: invokevirtual booleanValue : ()Z
    //   91: ifeq -> 95
    //   94: return
    //   95: aload_0
    //   96: aload_3
    //   97: putfield Zb : Lburp/Zgyq;
    //   100: aload_0
    //   101: iconst_0
    //   102: putfield Zq : Z
    //   105: return
  }
  
  public void Zs(Zgsq paramZgsq) {
    paramZgsq.Ze();
    this.ZC.ZG(paramZgsq);
  }
  
  public void ZB(String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_ADD_QUERY_PARAMETER);
    ZN().ZS(paramString1, paramString2);
  }
  
  public void Zo(String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_ADD_REQUEST_COOKIE);
    ZN().ZA(paramString1, paramString2);
  }
  
  public void Zf(String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_ADD_BODY_PARAMETER);
    ZN().ZE(paramString1, paramString2);
  }
  
  public void ZJ(int paramInt, String paramString) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_APPLY_REQUEST_ATTRIBUTE_CHANGE);
    ZN().Zg(paramInt, paramString);
  }
  
  public void Z_(int paramInt, String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_APPLY_QUERY_PARAMETER_CHANGE);
    ZN().ZG(paramInt, paramString1, paramString2);
  }
  
  public void Zn(int paramInt, String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_APPLY_REQUEST_COOKIE_CHANGE);
    ZN().ZN(paramInt, paramString1, paramString2);
  }
  
  public void Zl(int paramInt, String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_APPLY_BODY_PARAMETER_CHANGE);
    ZN().ZX(paramInt, paramString1, paramString2);
  }
  
  public void ZL(List<Integer> paramList) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_REMOVE_QUERY_PARAMETER);
    this.Zm.ZJ(paramList);
  }
  
  public void ZQ(List<Integer> paramList) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_REMOVE_REQUEST_COOKIE);
    this.Zm.ZN(paramList);
  }
  
  public void ZX(List<Integer> paramList) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_REMOVE_BODY_PARAMETER);
    this.Zm.ZF(paramList);
  }
  
  public void ZO(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_UP_QUERY_PARAMETER);
    this.Zm.Zk(paramInt, paramInt - 1);
  }
  
  public void Zi(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_DOWN_QUERY_PARAMETER);
    this.Zm.Zk(paramInt, paramInt + 1);
  }
  
  public void Zu(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_UP_REQUEST_COOKIE);
    this.Zm.Zf(paramInt, paramInt - 1);
  }
  
  public void ZP(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_DOWN_REQUEST_COOKIE);
    this.Zm.Zf(paramInt, paramInt + 1);
  }
  
  public void ZN(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_UP_BODY_PARAMETER);
    this.Zm.Zb(paramInt, paramInt - 1);
  }
  
  public void ZU(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_DOWN_BODY_PARAMETER);
    this.Zm.Zb(paramInt, paramInt + 1);
  }
  
  public void Zp(String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_ADD_REQUEST_HEADER);
    ZN().ZW(paramString1, paramString2);
  }
  
  public void Zi(int paramInt, String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_APPLY_REQUEST_HEADER_CHANGE);
    ZN().ZZ(paramInt, paramString1, paramString2);
  }
  
  public void Zi(List<Integer> paramList) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_REMOVE_REQUEST_HEADER);
    this.Zm.ZI(paramList);
  }
  
  public void Zm(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_UP_REQUEST_HEADER);
    this.Zm.ZO(paramInt, paramInt - 1);
  }
  
  public void ZQ(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_DOWN_REQUEST_HEADER);
    this.Zm.ZO(paramInt, paramInt + 1);
  }
  
  private Zmlg ZN() {
    if (this.Zm == null) {
      this.Zx = this.ZC.Zd();
      this.Zm = this.ZC.Zg(this.ZH, this.ZL, this.Zo);
    } 
    return this.Zm;
  }
  
  public void Zd(String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_ADD_RESPONSE_HEADER);
    Za().ZD(paramString1, paramString2);
  }
  
  public void Ze(int paramInt, String paramString1, String paramString2) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_APPLY_RESPONSE_HEADER_CHANGE);
    Za().ZS(paramInt, paramString1, paramString2);
  }
  
  public void ZF(List<Integer> paramList) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_REMOVE_RESPONSE_HEADER);
    this.Zb.ZP(paramList);
  }
  
  public void Zy(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_UP_RESPONSE_HEADER);
    this.Zb.ZS(paramInt, paramInt - 1);
  }
  
  public void Zs(int paramInt) {
    Zm2.ZC(Zrrh.MESSAGE_INSPECTOR_MOVE_DOWN_RESPONSE_HEADER);
    this.Zb.ZS(paramInt, paramInt + 1);
  }
  
  private Zgyq Za() {
    if (this.Zb == null)
      this.Zb = this.ZF.ZX(this.ZH, this.Zo); 
    return this.Zb;
  }
  
  public void ZG(int paramInt1, int paramInt2, String paramString) {
    this.ZC.ZW(paramInt1, paramInt2, paramString);
    ZQ();
  }
  
  public void Zb(int paramInt1, int paramInt2, String paramString) {
    this.ZF.ZW(paramInt1, paramInt2, paramString);
    Zf();
  }
  
  public void Zm(int paramInt1, int paramInt2, String paramString) {
    this.Zf.ZW(paramInt1, paramInt2, paramString);
  }
  
  public Zre8 Zq(int paramInt) {
    return (Zp(paramInt) || ZX(paramInt) || ZR(paramInt)) ? new Zljs() : (ZY(paramInt) ? new Zsoi() : Zre8.Zw);
  }
  
  public Zre8 Zv(int paramInt) {
    return ZW(paramInt) ? new Zsoi() : Zre8.Zw;
  }
  
  private boolean Zp(int paramInt) {
    return Zh().stream().anyMatch(paramInt::lambda$isOffsetInQueryParameter$0);
  }
  
  private boolean ZX(int paramInt) {
    return Zn().stream().anyMatch(paramInt::lambda$isOffsetInCookie$1);
  }
  
  private boolean ZR(int paramInt) {
    return ZM().stream().anyMatch(paramInt::lambda$isOffsetInUrlEncodedBodyParameter$2);
  }
  
  private boolean ZY(int paramInt) {
    return (ZE() && this.Zm.Zp(paramInt));
  }
  
  private boolean ZW(int paramInt) {
    return (Z_() && this.Zb.Zx(paramInt));
  }
  
  private static boolean lambda$isOffsetInUrlEncodedBodyParameter$2(int paramInt, Zmv3 paramZmv3) {
    return (paramZmv3.Zb == Zrdu.BODY_PARAM_URL_ENCODED && paramInt >= paramZmv3.ZW && paramInt < paramZmv3.Zu);
  }
  
  private static boolean lambda$isOffsetInCookie$1(int paramInt, Ztnj paramZtnj) {
    return (paramZtnj.ZA() && paramZtnj.ZR(paramInt));
  }
  
  private static boolean lambda$isOffsetInQueryParameter$0(int paramInt, Zb6w paramZb6w) {
    return (paramInt >= paramZb6w.Zk && paramInt < paramZb6w.ZT);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzh8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */