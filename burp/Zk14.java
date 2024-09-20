package burp;

import java.util.List;

public class Zk14 implements Zetl {
  private final Zl67 Zm;
  
  private final Zm0l ZH;
  
  private final Zl34 Zd;
  
  private final Zl34 Zr;
  
  private final Zxts ZM;
  
  private final Zbnt Zw;
  
  private final Zrfd ZW;
  
  private final Zz8a Zt;
  
  private final Ztwv ZD;
  
  private final Zr_4 ZZ;
  
  private final Zzkr Zc;
  
  private final Zrx_ ZQ;
  
  private final boolean ZN;
  
  private Zev2 Zb;
  
  private Zlcf Zs;
  
  private Zm6q ZY;
  
  private Zzk7 ZT;
  
  private int ZJ = 0;
  
  public Zk14(Zl67 paramZl67, Zzkr paramZzkr, Zm0l paramZm0l, Zl34 paramZl341, Zl34 paramZl342, Zxts paramZxts, Zbnt paramZbnt, Zrfd paramZrfd, Zz8a paramZz8a, Ztwv paramZtwv, Zr_4 paramZr_4, Zrx_ paramZrx_, boolean paramBoolean) {
    this.Zm = paramZl67;
    this.Zc = paramZzkr;
    this.ZH = paramZm0l;
    this.Zd = paramZl341;
    this.Zr = paramZl342;
    this.ZM = paramZxts;
    this.Zw = paramZbnt;
    this.ZW = paramZrfd;
    this.Zt = paramZz8a;
    this.ZD = paramZtwv;
    this.ZZ = paramZr_4;
    this.ZQ = paramZrx_;
    this.ZN = paramBoolean;
  }
  
  public void Zh(Zev2 paramZev2) {
    this.Zb = paramZev2;
    this.Zs = new Zlcf(paramZev2, this.ZM, this.Zw, this.ZZ);
    Zxoi zxoi = new Zxoi(paramZev2, null, this.Zt, false, this.ZN);
    Zg9v zg9v = new Zg9v(paramZev2, this.Zt, this.ZQ, zxoi, this.ZN);
    this.ZY = new Zm6q(zg9v, zxoi, paramZev2);
    int i = Zmet.ZD();
    this.ZT = new Zzk7(paramZev2, this.Zc);
    ZZ2();
    this.Zm.ZC(paramZev2);
    this.Zm.Z_(this);
    this.Zm.Zp();
    paramZev2.ZP(this.ZJ);
    if (i != 0)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  void Zs(Zkcl paramZkcl) {
    paramZkcl = paramZkcl;
    this.Zs.Zc(paramZkcl);
    this.ZY.Zr(paramZkcl);
  }
  
  private void ZZ2() {
    this.Zs.ZB(this.Zd, this.Zr);
  }
  
  public void ZJ(int paramInt) {
    if (this.ZJ == paramInt)
      return; 
    Za(paramInt);
    this.ZJ = paramInt;
    this.Zb.ZP(paramInt);
    this.Zb.Ze("");
  }
  
  private void Za(int paramInt) {
    if (paramInt == 1)
      this.ZY.Zd(); 
  }
  
  public void ZC(String paramString) {
    this.Zb.Ze(paramString);
  }
  
  public void ZSj() {
    this.Zs.ZO();
    this.ZY.Zr(Zkcl.LIVE_AUDIT);
  }
  
  public void ZSk() {
    this.Zs.Zm();
    this.ZY.Zr(Zkcl.LIVE_PASSIVE_CRAWL);
  }
  
  public void Zc(int paramInt) {
    Zk9f zk9f = Zk9f.Zd(paramInt);
    this.Zs.ZG(zk9f);
    this.ZY.Zp(zk9f);
    this.ZT.Za();
  }
  
  public void Zp(boolean paramBoolean) {
    this.Zs.Zk(paramBoolean);
  }
  
  public void ZL(boolean paramBoolean) {
    this.Zs.ZJ(paramBoolean);
  }
  
  public void Zm(boolean paramBoolean) {
    this.Zs.Zt(paramBoolean);
  }
  
  public void ZSX() {
    this.Zs.ZY();
  }
  
  public void ZSd() {
    this.Zs.ZM();
  }
  
  public void ZSW() {
    this.Zs.Zd();
  }
  
  public void Zo(boolean paramBoolean) {
    this.Zs.ZM(paramBoolean);
  }
  
  public void Zb(boolean paramBoolean) {
    this.Zs.ZG(paramBoolean);
  }
  
  public void Z_(List<String> paramList1, List<String> paramList2) {
    this.Zs.Zl(paramList1, paramList2);
  }
  
  public void ZA(Zmy8 paramZmy8) {
    this.Zs.ZH(paramZmy8);
  }
  
  public void ZU(Zmy8 paramZmy8, int paramInt) {
    this.Zs.ZS(paramZmy8, paramInt);
  }
  
  public void Zg(int paramInt) {
    this.Zs.Zk(paramInt);
  }
  
  public void ZY(Zmy8 paramZmy8) {
    this.Zs.Zm(paramZmy8);
  }
  
  public void ZZ(Zmy8 paramZmy8, int paramInt) {
    this.Zs.Zj(paramZmy8, paramInt);
  }
  
  public void ZO(int paramInt) {
    this.Zs.Zl(paramInt);
  }
  
  public void ZZK() {
    this.Zs.Zw();
  }
  
  public void Zl(Zmf_ paramZmf_) {
    this.Zs.ZN(paramZmf_);
  }
  
  public String Zv(String paramString) {
    return this.Zs.Zx(paramString);
  }
  
  public void Z_() {
    this.ZY.Z_();
  }
  
  public void ZQ(Zmln paramZmln) {
    this.ZY.ZQ(paramZmln);
  }
  
  public void Zx(Zkbn paramZkbn) {
    this.ZY.Zx(paramZkbn);
  }
  
  public void ZF(int paramInt) {
    this.ZY.ZF(paramInt);
  }
  
  public void Zm(int paramInt) {
    this.ZY.Zm(paramInt);
  }
  
  public void Zq(int paramInt) {
    this.ZY.Zq(paramInt);
  }
  
  public void Zw(int paramInt, String paramString, Zmf_ paramZmf_) {
    this.ZY.Zw(paramInt, paramString, paramZmf_);
  }
  
  public void Zy(int[] paramArrayOfint) {
    this.ZY.Zy(paramArrayOfint);
  }
  
  public void ZG() {
    this.ZY.ZG();
  }
  
  public void ZK(List<Zkbn> paramList) {
    this.ZY.ZK(paramList);
  }
  
  public void ZJ() {
    this.ZY.ZJ();
  }
  
  public void Zs() {
    this.ZT.ZP();
  }
  
  public void Zw(int paramInt) {
    this.ZT.ZT(paramInt);
  }
  
  public void Zh() {
    this.ZT.ZQ();
  }
  
  public void Zt(String paramString) {
    this.ZT.ZU(paramString);
  }
  
  public void ZM(boolean paramBoolean) {
    this.ZT.ZG(paramBoolean);
  }
  
  public void Zl(int paramInt) {
    this.ZT.Zm(paramInt);
  }
  
  public void Zt(boolean paramBoolean) {
    this.ZT.ZI(paramBoolean);
  }
  
  public void ZU(boolean paramBoolean) {
    this.ZT.ZD(paramBoolean);
  }
  
  public void ZR(boolean paramBoolean) {
    this.ZT.Zg(paramBoolean);
  }
  
  public void ZS(boolean paramBoolean) {
    this.ZT.Zr(paramBoolean);
  }
  
  public void ZI(String paramString) {
    this.ZT.Zm(paramString);
  }
  
  public void Zj(boolean paramBoolean) {
    this.ZT.Zf(paramBoolean);
  }
  
  public void Zr(int paramInt) {
    this.ZT.Zz(paramInt);
  }
  
  public void Zb() {
    this.ZT.Zn();
  }
  
  public void Zg() {
    this.ZT.ZA();
  }
  
  public void ZN() {
    this.ZT.Zs();
  }
  
  public void Zb(int paramInt) {
    this.ZT.ZH(paramInt);
  }
  
  public boolean ZSl() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZZ4 : ()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual isEmpty : ()Z
    //   9: ifne -> 24
    //   12: aload_0
    //   13: getfield Zb : Lburp/Zev2;
    //   16: aload_1
    //   17: invokeinterface Ze : (Ljava/lang/String;)V
    //   22: iconst_0
    //   23: ireturn
    //   24: aload_0
    //   25: getfield Zs : Lburp/Zlcf;
    //   28: invokevirtual ZA : ()Lburp/Zkcl;
    //   31: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   34: if_acmpne -> 47
    //   37: aload_0
    //   38: getfield ZT : Lburp/Zzk7;
    //   41: invokevirtual Zl : ()Lburp/Zb2y;
    //   44: goto -> 50
    //   47: invokestatic ZX : ()Lburp/Zb2y;
    //   50: astore_2
    //   51: aload_0
    //   52: getfield ZD : Lburp/Ztwv;
    //   55: aload_0
    //   56: aload_2
    //   57: <illegal opcode> run : (Lburp/Zk14;Lburp/Zb2y;)Ljava/lang/Runnable;
    //   62: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   67: pop
    //   68: iconst_1
    //   69: ireturn
  }
  
  public boolean ZSO() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual ZZ4 : ()Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: invokevirtual isEmpty : ()Z
    //   9: ifne -> 24
    //   12: aload_0
    //   13: getfield Zb : Lburp/Zev2;
    //   16: aload_1
    //   17: invokeinterface Ze : (Ljava/lang/String;)V
    //   22: iconst_0
    //   23: ireturn
    //   24: aload_0
    //   25: getfield Zs : Lburp/Zlcf;
    //   28: invokevirtual ZA : ()Lburp/Zkcl;
    //   31: getstatic burp/Zkcl.LIVE_AUDIT : Lburp/Zkcl;
    //   34: if_acmpne -> 47
    //   37: aload_0
    //   38: getfield ZT : Lburp/Zzk7;
    //   41: invokevirtual Zl : ()Lburp/Zb2y;
    //   44: goto -> 50
    //   47: invokestatic ZX : ()Lburp/Zb2y;
    //   50: astore_2
    //   51: aload_0
    //   52: getfield ZD : Lburp/Ztwv;
    //   55: aload_0
    //   56: aload_2
    //   57: <illegal opcode> run : (Lburp/Zk14;Lburp/Zb2y;)Ljava/lang/Runnable;
    //   62: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   67: pop
    //   68: iconst_1
    //   69: ireturn
  }
  
  private String ZZ4() {
    String str1 = this.Zs.ZT();
    String str2 = (this.Zs.ZA() == Zkcl.LIVE_AUDIT) ? this.ZT.ZN() : "";
    if (this.ZJ == 0 && !str1.isEmpty())
      return str1; 
    if (this.ZJ == 2 && !str2.isEmpty())
      return str2; 
    if (!str1.isEmpty()) {
      ZJ(0);
      return str1;
    } 
    if (!str2.isEmpty()) {
      ZJ(2);
      return str2;
    } 
    return "";
  }
  
  public void ZH(Zm40 paramZm40) {
    this.ZY.ZH(paramZm40);
  }
  
  public Zm40 ZI() {
    return this.ZY.ZI();
  }
  
  public void Zc(Zrx_ paramZrx_) {
    this.ZY.Zc(paramZrx_);
  }
  
  private void lambda$applyConfigChanges$1(Zb2y paramZb2y) {
    this.Zm.ZL(new Zru5(this.Zs.Zr(), this.ZY.ZP() ? this.ZY.ZH() : null, paramZb2y));
  }
  
  private void lambda$launchTask$0(Zb2y paramZb2y) {
    this.ZW.Zp(new Zru5(this.Zs.Zr(), this.ZY.ZH(), paramZb2y), this.ZH);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */