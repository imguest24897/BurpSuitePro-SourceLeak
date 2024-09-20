package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zebs implements Zrsm, Ze7o, Zerv {
  private final Zs4c Zb;
  
  private final Zz8a Zr;
  
  private final Zzkr ZN;
  
  private final boolean Zg;
  
  private final Ztwv ZY;
  
  private final Zzxj ZZ;
  
  private final Zrfd Zf;
  
  private final Zm0l ZI;
  
  private final Ztvr ZF;
  
  private Zlze ZX;
  
  private Zxgl ZH;
  
  private Zkfo ZD;
  
  private Zxoi Zi;
  
  private Zzk7 ZM;
  
  public Zebs(Ztvr paramZtvr, Zs4c paramZs4c, Zz8a paramZz8a, Zzkr paramZzkr, Ztwv paramZtwv, Zbnt paramZbnt, Zr_4 paramZr_4, Zrfd paramZrfd, Zm0l paramZm0l, boolean paramBoolean) {
    this.ZF = paramZtvr;
    this.Zb = paramZs4c;
    this.Zr = paramZz8a;
    this.ZN = paramZzkr;
    this.ZY = paramZtwv;
    this.Zf = paramZrfd;
    this.ZI = paramZm0l;
    this.Zg = paramBoolean;
    this.ZX = paramZtvr.Zw();
    this.ZZ = new Zzxj(paramZbnt, paramZr_4);
  }
  
  public void Zh(Zxgl paramZxgl) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZH : Lburp/Zxgl;
    //   5: aload_0
    //   6: new burp/Zkfo
    //   9: dup
    //   10: aload_1
    //   11: invokespecial <init> : (Lburp/Zbfu;)V
    //   14: putfield ZD : Lburp/Zkfo;
    //   17: aload_0
    //   18: new burp/Zxoi
    //   21: dup
    //   22: aload_1
    //   23: aload_0
    //   24: getfield Zb : Lburp/Zs4c;
    //   27: aload_0
    //   28: getfield Zr : Lburp/Zz8a;
    //   31: iconst_0
    //   32: aload_0
    //   33: getfield Zg : Z
    //   36: invokespecial <init> : (Lburp/Zs1n;Lburp/Zs4c;Lburp/Zz8a;ZZ)V
    //   39: putfield Zi : Lburp/Zxoi;
    //   42: aload_0
    //   43: new burp/Zzk7
    //   46: dup
    //   47: aload_1
    //   48: aload_0
    //   49: getfield ZN : Lburp/Zzkr;
    //   52: invokespecial <init> : (Lburp/Ztue;Lburp/Zzkr;)V
    //   55: putfield ZM : Lburp/Zzk7;
    //   58: aload_0
    //   59: getfield Zi : Lburp/Zxoi;
    //   62: getstatic burp/Zkcl.API_AUDIT : Lburp/Zkcl;
    //   65: invokevirtual Zr : (Lburp/Zkcl;)V
    //   68: aload_1
    //   69: invokeinterface Zu : ()V
    //   74: aload_0
    //   75: getfield ZF : Lburp/Ztvr;
    //   78: aload_1
    //   79: aload_0
    //   80: invokeinterface Zi : (Lburp/Zxgl;Lburp/Zebs;)V
    //   85: aload_1
    //   86: invokeinterface ZT : ()V
    //   91: aload_0
    //   92: aload_1
    //   93: <illegal opcode> run : (Lburp/Zebs;Lburp/Zxgl;)Ljava/lang/Runnable;
    //   98: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   101: return
  }
  
  void Zx(List<String> paramList) {
    this.ZD.Zb(paramList);
  }
  
  public void ZJ(int paramInt) {
    if (paramInt == ZE(this.ZX) || paramInt < 0 || paramInt >= (Zlze.values()).length)
      return; 
    if (paramInt == ZE(Zlze.SCAN_CONFIGURATION_PANEL))
      this.Zi.Zd(); 
    this.ZX = this.ZF.ZP(paramInt);
    this.ZF.Zm(this.ZX);
    this.ZH.ZP(paramInt);
    this.ZH.Ze("");
  }
  
  public void ZK() {
    ZJ(ZE(this.ZX) - 1);
  }
  
  public void Za() {
    if (ZQ())
      ZJ(ZE(this.ZX) + 1); 
  }
  
  public void Z_() {
    this.Zi.Z_();
  }
  
  public void ZQ(Zmln paramZmln) {
    this.Zi.ZQ(paramZmln);
  }
  
  public void Zx(Zkbn paramZkbn) {
    this.Zi.Zx(paramZkbn);
  }
  
  public void ZF(int paramInt) {
    this.Zi.ZF(paramInt);
  }
  
  public void Zm(int paramInt) {
    this.Zi.Zm(paramInt);
  }
  
  public void Zq(int paramInt) {
    this.Zi.Zq(paramInt);
  }
  
  public void Zw(int paramInt, String paramString, Zmf_ paramZmf_) {
    this.Zi.Zw(paramInt, paramString, paramZmf_);
  }
  
  public void Zy(int[] paramArrayOfint) {
    this.Zi.Zy(paramArrayOfint);
  }
  
  public void ZG() {
    this.Zi.ZG();
  }
  
  public void ZK(List<Zkbn> paramList) {
    this.Zi.ZK(paramList);
  }
  
  public void ZJ() {
    this.Zi.ZJ();
  }
  
  public void ZH(Zm40 paramZm40) {}
  
  public Zm40 ZI() {
    return null;
  }
  
  public void Zs() {
    this.ZM.ZP();
  }
  
  public void Zw(int paramInt) {
    this.ZM.ZT(paramInt);
  }
  
  public void Zh() {
    this.ZM.ZQ();
  }
  
  public void Zt(String paramString) {
    this.ZM.ZU(paramString);
  }
  
  public void ZM(boolean paramBoolean) {
    this.ZM.ZG(paramBoolean);
  }
  
  public void Zl(int paramInt) {
    this.ZM.Zm(paramInt);
  }
  
  public void Zt(boolean paramBoolean) {
    this.ZM.ZI(paramBoolean);
  }
  
  public void ZU(boolean paramBoolean) {
    this.ZM.ZD(paramBoolean);
  }
  
  public void ZR(boolean paramBoolean) {
    this.ZM.Zg(paramBoolean);
  }
  
  public void ZS(boolean paramBoolean) {
    this.ZM.Zr(paramBoolean);
  }
  
  public void ZI(String paramString) {
    this.ZM.Zm(paramString);
  }
  
  public void Zj(boolean paramBoolean) {
    this.ZM.Zf(paramBoolean);
  }
  
  public void Zr(int paramInt) {
    this.ZM.Zz(paramInt);
  }
  
  public void Zb() {
    this.ZM.Zn();
  }
  
  public void Zg() {
    this.ZM.ZA();
  }
  
  public void ZN() {
    this.ZM.Zs();
  }
  
  public void Zb(int paramInt) {
    this.ZM.ZH(paramInt);
  }
  
  public void Zc(Zrx_ paramZrx_) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public boolean Zw() {
    String str = ZA();
    if (!str.isEmpty()) {
      this.ZH.Ze(str);
      return false;
    } 
    this.ZY.Zx(this::lambda$applyConfigChanges$1);
    return true;
  }
  
  private String ZA() {
    String str1 = this.Zi.ZC();
    String str2 = this.ZM.ZN();
    if (this.ZX == Zlze.SCAN_CONFIGURATION_PANEL && !str1.isEmpty())
      return str1; 
    if (this.ZX == Zlze.RESOURCE_POOL_PANEL && !str2.isEmpty())
      return str2; 
    if (!str1.isEmpty()) {
      ZJ(ZE(Zlze.SCAN_CONFIGURATION_PANEL));
      return str1;
    } 
    if (!str2.isEmpty()) {
      ZJ(ZE(Zlze.RESOURCE_POOL_PANEL));
      return str2;
    } 
    return "";
  }
  
  public boolean ZW() {
    if (!ZQ())
      return false; 
    String str = Zx();
    if (!str.isEmpty()) {
      this.ZH.Ze(str);
      return false;
    } 
    this.ZY.Zx(this::lambda$launchScan$2);
    return true;
  }
  
  String ZY() {
    return this.ZD.ZB();
  }
  
  String Zp() {
    return this.Zi.ZC();
  }
  
  String Zf() {
    return this.ZM.ZN();
  }
  
  private boolean ZQ() {
    String str = this.ZX.validate.apply(this);
    if (!str.isEmpty()) {
      this.ZH.Ze(str);
      return false;
    } 
    return true;
  }
  
  private String Zx() {
    Zlze[] arrayOfZlze = Zlze.values();
    int i = arrayOfZlze.length;
    byte b = 0;
    int[] arrayOfInt = Zg7g.Zf();
    while (b < i) {
      Zlze zlze = arrayOfZlze[b];
      String str = zlze.validate.apply(this);
      if (!str.isEmpty()) {
        ZJ(ZE(zlze));
        return str;
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return "";
  }
  
  private int ZE(Zlze paramZlze) {
    return this.ZF.Zn(paramZlze);
  }
  
  private void lambda$launchScan$2() {
    List<String> list = this.ZD.Zl();
    this.ZZ.ZP(list);
    Ztfs ztfs = new Ztfs(Zkcl.SOAP_API_AUDIT, this.ZZ, list, Collections.emptyList());
    Zkv4 zkv4 = new Zkv4(ztfs, Zz5.ZO, this.Zi.ZH(), Zmpo.Zi, this.ZM.Zl(), Zlj4.MANUAL, false);
    this.Zf.Zq(zkv4, this.ZI);
  }
  
  private void lambda$applyConfigChanges$1() {
    this.ZF.ZF(this.Zi.ZP() ? this.Zi.ZH() : null, this.ZM.Zl());
  }
  
  private void lambda$setView$0(Zxgl paramZxgl) {
    paramZxgl.ZP(ZE(this.ZX));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zebs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */