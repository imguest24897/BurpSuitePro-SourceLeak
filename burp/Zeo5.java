package burp;

import java.awt.Component;
import java.util.List;
import java.util.Optional;

class Zeo5 implements Ze0 {
  private final Zm7j ZI;
  
  private final Zs4c ZU;
  
  private final Zxts ZX;
  
  private final Zrag Zw;
  
  private final Zzkr ZP;
  
  private final Zm0l ZD;
  
  private final Zbnt ZL;
  
  private final Zrfd Zo;
  
  private final Ztwv Zj;
  
  private final Zr_4 Zp;
  
  private final Zr1j ZY;
  
  private final Zz8a Zy;
  
  private final Zrx_ Zt;
  
  private final Zm9o Za;
  
  private final boolean Zs;
  
  private final boolean Zd;
  
  private Zl_v Zh;
  
  private Zeus ZS;
  
  private Zttu ZJ;
  
  private Zm6q Zn;
  
  private Zbs9 Z_;
  
  private Zzk7 ZC;
  
  private int Zk = 0;
  
  Zeo5(Zm7j paramZm7j, Zs4c paramZs4c, Zxts paramZxts, Zrag paramZrag, Zzkr paramZzkr, Zm0l paramZm0l, Zbnt paramZbnt, Zrfd paramZrfd, Ztwv paramZtwv, Zr_4 paramZr_4, Zr1j paramZr1j, Zz8a paramZz8a, Zrx_ paramZrx_, Zm9o paramZm9o, boolean paramBoolean1, boolean paramBoolean2) {
    this.ZI = paramZm7j;
    this.ZU = paramZs4c;
    this.ZX = paramZxts;
    this.Zw = paramZrag;
    this.ZP = paramZzkr;
    this.ZD = paramZm0l;
    this.ZL = paramZbnt;
    this.Zo = paramZrfd;
    this.Zj = paramZtwv;
    this.Zp = paramZr_4;
    this.ZY = paramZr1j;
    this.Zy = paramZz8a;
    this.Zt = paramZrx_;
    this.Za = paramZm9o;
    this.Zs = paramBoolean1;
    this.Zd = paramBoolean2;
  }
  
  public void Zb(Zl_v paramZl_v) {
    this.Zh = paramZl_v;
    this.ZS = new Zeu3(paramZl_v, this.Zw.ZG(Zkcl.SCAN_AUDIT), this.ZX, this.ZL, this.Zp, this.ZY);
    this.ZJ = new Zttu(paramZl_v);
    Zxoi zxoi = new Zxoi(paramZl_v, this.ZU, this.Zy, this.Zs, this.Zd);
    int[] arrayOfInt = Zz7i.Zk();
    Zg9v zg9v = new Zg9v(paramZl_v, this.Zy, this.Zt, zxoi, this.Zd);
    this.Zn = new Zm6q(zg9v, zxoi, paramZl_v);
    this.Z_ = new Zbs9(paramZl_v, this.ZX, this.Za);
    this.ZC = new Zzk7(paramZl_v, this.ZP);
    paramZl_v.Zu();
    this.ZI.Zz(paramZl_v);
    this.ZI.Zm(this);
    this.ZS.ZU();
    this.ZI.ZR();
    paramZl_v.ZP(this.Zk);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void ZN(Zkcl paramZkcl) {
    this.ZS.ZX(paramZkcl);
    this.Zn.Zr(paramZkcl);
  }
  
  public void ZW(List<String> paramList) {
    this.ZS.Zm(paramList);
  }
  
  public void ZX(List<String> paramList, Zl34 paramZl341, Zl34 paramZl342) {
    this.ZS.Zw(paramList, paramZl341, paramZl342);
  }
  
  public void Zn(List<? extends Zll9> paramList) {
    this.ZS.Zd(paramList);
  }
  
  public void ZO(List<int[]> paramList) {
    this.ZS.Zp(paramList);
  }
  
  public void ZJ(int paramInt) {
    if (this.Zk == paramInt)
      return; 
    Zv(paramInt);
    this.Zk = paramInt;
    this.Zh.ZP(paramInt);
    this.Zh.Ze("");
  }
  
  private void Zv(int paramInt) {
    if (paramInt == 1)
      this.Zn.Zd(); 
  }
  
  public void ZC(String paramString) {
    this.Zh.Ze(paramString);
  }
  
  public void ZRE() {
    this.ZS.ZN();
    this.Zn.Zr(Zkcl.SCAN_CRAWL_AND_AUDIT);
  }
  
  public void ZRe() {
    this.ZS.Zg();
    this.Zn.Zr(Zkcl.SCAN_CRAWL);
  }
  
  public void ZRM() {
    this.ZS.Zt();
    this.Zn.Zr(Zkcl.SCAN_AUDIT);
  }
  
  public void ZRx() {
    this.ZS.Zb();
  }
  
  public void ZRS() {
    this.ZS.ZK();
  }
  
  public void Zx(int paramInt) {
    this.ZS.ZP(paramInt);
  }
  
  public void Zs(boolean paramBoolean) {
    this.ZS.Z_(paramBoolean);
  }
  
  public void Zb(List<String> paramList) {
    this.ZS.ZM(paramList);
  }
  
  public void Zn(boolean paramBoolean) {
    this.ZS.Zd(paramBoolean);
  }
  
  public void Zb(boolean paramBoolean) {
    this.ZS.Zt(paramBoolean);
  }
  
  public void Z_(List<String> paramList1, List<String> paramList2) {
    this.ZS.ZF(paramList1, paramList2);
  }
  
  public void ZA(Zmy8 paramZmy8) {
    this.ZS.ZJ(paramZmy8);
  }
  
  public void ZU(Zmy8 paramZmy8, int paramInt) {
    this.ZS.Zw(paramZmy8, paramInt);
  }
  
  public void Zg(int paramInt) {
    this.ZS.ZJ(paramInt);
  }
  
  public void ZY(Zmy8 paramZmy8) {
    this.ZS.ZY(paramZmy8);
  }
  
  public void ZZ(Zmy8 paramZmy8, int paramInt) {
    this.ZS.ZE(paramZmy8, paramInt);
  }
  
  public void ZO(int paramInt) {
    this.ZS.Za(paramInt);
  }
  
  public void ZRm() {
    this.ZS.Zv();
  }
  
  public void ZI(List<Zll9> paramList) {
    this.ZS.ZG(paramList);
  }
  
  public void ZZK() {
    this.ZS.ZI();
  }
  
  public void Zl(Zmf_ paramZmf_) {
    this.ZS.Z_(paramZmf_);
  }
  
  public String Zv(String paramString) {
    return this.ZS.Zc(paramString);
  }
  
  public void Zv(boolean paramBoolean) {
    this.ZS.Zo(paramBoolean);
  }
  
  public void Z_() {
    this.Zn.Z_();
  }
  
  public void ZQ(Zmln paramZmln) {
    this.Zn.ZQ(paramZmln);
  }
  
  public void Zx(Zkbn paramZkbn) {
    this.Zn.Zx(paramZkbn);
  }
  
  public void ZF(int paramInt) {
    this.Zn.ZF(paramInt);
  }
  
  public void Zm(int paramInt) {
    this.Zn.Zm(paramInt);
  }
  
  public void Zq(int paramInt) {
    this.Zn.Zq(paramInt);
  }
  
  public void Zw(int paramInt, String paramString, Zmf_ paramZmf_) {
    this.Zn.Zw(paramInt, paramString, paramZmf_);
  }
  
  public void Zy(int[] paramArrayOfint) {
    this.Zn.Zy(paramArrayOfint);
  }
  
  public void ZG() {
    this.Zn.ZG();
  }
  
  public void ZK(List<Zkbn> paramList) {
    this.Zn.ZK(paramList);
  }
  
  public void ZJ() {
    this.Zn.ZJ();
  }
  
  public Optional<String> Zy(Zs3n paramZs3n) {
    return this.Z_.Zy(paramZs3n);
  }
  
  public void ZB(int paramInt) {
    this.Z_.ZY(paramInt);
  }
  
  public Optional<String> Za(int paramInt, Zs3n paramZs3n) {
    return this.Z_.Zl(paramInt, paramZs3n);
  }
  
  public void ZE(List<Integer> paramList) {
    this.Z_.ZN(paramList);
  }
  
  public void ZU() {
    this.Z_.ZR();
  }
  
  public void ZP(Zmf_ paramZmf_) {
    this.Z_.ZH(paramZmf_);
  }
  
  public String ZR(String paramString) {
    return this.Z_.ZM(paramString);
  }
  
  public void Zk() {
    this.Z_.ZS();
  }
  
  public boolean ZB() {
    return this.Z_.Zd();
  }
  
  public void Z_(Zz62 paramZz62) {
    this.Z_.ZH(paramZz62);
  }
  
  public Optional<String> Zr(Zg96 paramZg96) {
    return this.Z_.ZY(paramZg96);
  }
  
  public void ZL(Zmle paramZmle, Zg96 paramZg96, Zrvo paramZrvo) {
    this.Z_.Zu(paramZmle, paramZg96, paramZrvo);
  }
  
  public void ZY() {
    this.Z_.ZU();
  }
  
  public void ZQ() {
    this.Z_.Zh();
  }
  
  public int ZS() {
    return this.Z_.Zf();
  }
  
  public void Zl(Component paramComponent) {
    Zrvf.ZC(Zt2m.ZF(paramComponent), this);
  }
  
  public void Zg(Component paramComponent) {
    Zrv6.ZC(Zt2m.ZF(paramComponent), this);
  }
  
  public void Zs() {
    this.ZC.ZP();
  }
  
  public void Zw(int paramInt) {
    this.ZC.ZT(paramInt);
  }
  
  public void Zh() {
    this.ZC.ZQ();
  }
  
  public void Zt(String paramString) {
    this.ZC.ZU(paramString);
  }
  
  public void ZM(boolean paramBoolean) {
    this.ZC.ZG(paramBoolean);
  }
  
  public void Zl(int paramInt) {
    this.ZC.Zm(paramInt);
  }
  
  public void Zt(boolean paramBoolean) {
    this.ZC.ZI(paramBoolean);
  }
  
  public void ZU(boolean paramBoolean) {
    this.ZC.ZD(paramBoolean);
  }
  
  public void ZR(boolean paramBoolean) {
    this.ZC.Zg(paramBoolean);
  }
  
  public void ZS(boolean paramBoolean) {
    this.ZC.Zr(paramBoolean);
  }
  
  public void ZI(String paramString) {
    this.ZC.Zm(paramString);
  }
  
  public void Zj(boolean paramBoolean) {
    this.ZC.Zf(paramBoolean);
  }
  
  public void Zr(int paramInt) {
    this.ZC.Zz(paramInt);
  }
  
  public void Zb() {
    this.ZC.Zn();
  }
  
  public void Zg() {
    this.ZC.ZA();
  }
  
  public void ZN() {
    this.ZC.Zs();
  }
  
  public void Zb(int paramInt) {
    this.ZC.ZH(paramInt);
  }
  
  public boolean ZRN() {
    String str = ZtE();
    if (!str.isEmpty()) {
      this.Zh.Ze(str);
      return false;
    } 
    this.Zj.Zx(this::lambda$launchScan$0);
    return true;
  }
  
  public boolean ZRH() {
    String str = Ztq();
    if (!str.isEmpty()) {
      this.Zh.Ze(str);
      return false;
    } 
    this.Zj.Zx(this::lambda$applyConfigChanges$1);
    return true;
  }
  
  private String ZtE() {
    String str1 = this.Zn.ZC();
    if (!str1.isEmpty()) {
      if (this.Zk != 1)
        ZJ(1); 
      return str1;
    } 
    Zgyw zgyw = this.Zn.ZH();
    String str2 = this.ZS.ZM(zgyw);
    if (!str2.isEmpty()) {
      if (this.Zk != 0)
        ZJ(0); 
      return str2;
    } 
    String str3 = this.Z_.ZQ(zgyw);
    if (!str3.isEmpty()) {
      if (this.Zk != 2)
        ZJ(2); 
      return str3;
    } 
    String str4 = this.ZC.ZN();
    if (!str4.isEmpty()) {
      if (this.Zk != 3)
        ZJ(3); 
      return str4;
    } 
    return "";
  }
  
  private String Ztq() {
    String str1 = this.Zn.ZC();
    String str2 = this.ZC.ZN();
    if (this.Zk == 1 && !str1.isEmpty())
      return str1; 
    if (this.Zk == 3 && !str2.isEmpty())
      return str2; 
    if (!str1.isEmpty()) {
      ZJ(1);
      return str1;
    } 
    if (!str2.isEmpty()) {
      ZJ(3);
      return str2;
    } 
    return "";
  }
  
  public void ZH(Zm40 paramZm40) {
    this.Zn.ZH(paramZm40);
  }
  
  public Zm40 ZI() {
    return this.Zn.ZI();
  }
  
  public void Zc(Zrx_ paramZrx_) {
    this.Zn.Zc(paramZrx_);
  }
  
  private void lambda$applyConfigChanges$1() {
    this.ZI.Z_(this.Zn.ZP() ? this.Zn.ZH() : null, this.ZC.Zl());
  }
  
  private void lambda$launchScan$0() {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZS : Lburp/Zeus;
    //   8: ifnull -> 15
    //   11: iconst_1
    //   12: goto -> 16
    //   15: iconst_0
    //   16: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   19: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   22: aload_0
    //   23: getfield ZS : Lburp/Zeus;
    //   26: invokevirtual ZQ : ()Lburp/Ztfs;
    //   29: astore_2
    //   30: aload_2
    //   31: getfield Zk : Z
    //   34: ifeq -> 95
    //   37: aload_2
    //   38: getfield Za : Lburp/Ztj1;
    //   41: invokevirtual Zi : ()Lburp/Zrbm;
    //   44: astore_3
    //   45: aload_3
    //   46: instanceof burp/Zriy
    //   49: ifeq -> 62
    //   52: aload_3
    //   53: checkcast burp/Zriy
    //   56: astore #4
    //   58: aload_1
    //   59: ifnonnull -> 70
    //   62: iconst_0
    //   63: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   66: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   69: return
    //   70: aload_2
    //   71: getfield ZR : Ljava/util/List;
    //   74: aload #4
    //   76: dup
    //   77: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   80: pop
    //   81: <illegal opcode> accept : (Lburp/Zriy;)Ljava/util/function/Consumer;
    //   86: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   91: aload_1
    //   92: ifnonnull -> 149
    //   95: new burp/Zkv4
    //   98: dup
    //   99: aload_2
    //   100: aload_0
    //   101: getfield ZJ : Lburp/Zttu;
    //   104: invokevirtual ZB : ()Lburp/Zz5;
    //   107: aload_0
    //   108: getfield Zn : Lburp/Zm6q;
    //   111: invokevirtual ZH : ()Lburp/Zgyw;
    //   114: aload_0
    //   115: getfield Z_ : Lburp/Zbs9;
    //   118: invokevirtual ZO : ()Lburp/Zmpo;
    //   121: aload_0
    //   122: getfield ZC : Lburp/Zzk7;
    //   125: invokevirtual Zl : ()Lburp/Zb2y;
    //   128: getstatic burp/Zlj4.MANUAL : Lburp/Zlj4;
    //   131: iconst_0
    //   132: invokespecial <init> : (Lburp/Ztfs;Lburp/Zz5;Lburp/Zgyw;Lburp/Zmpo;Lburp/Zb2y;Lburp/Zlj4;Z)V
    //   135: astore_3
    //   136: aload_0
    //   137: getfield Zo : Lburp/Zrfd;
    //   140: aload_3
    //   141: aload_0
    //   142: getfield ZD : Lburp/Zm0l;
    //   145: invokevirtual Zq : (Lburp/Zkv4;Lburp/Zm0l;)Lburp/Ztj1;
    //   148: pop
    //   149: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeo5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */