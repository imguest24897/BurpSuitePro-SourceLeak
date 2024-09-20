package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Zeus {
  private static int Ze;
  
  protected final Zl_v Zy;
  
  private final List<Ztj1> Zq;
  
  private final Zr_4 Zv;
  
  private final Zxts ZH;
  
  private final Zbnt Zk;
  
  private final Zrzw ZJ;
  
  private final Zzxj Zr;
  
  private final Zr1j ZU;
  
  protected Zkcl ZD;
  
  protected boolean ZW;
  
  protected boolean Zl;
  
  private int ZQ;
  
  private List<? extends Zll9> ZS;
  
  private List<int[]> Za;
  
  private boolean ZF;
  
  private static final String a;
  
  Zeus(Zl_v paramZl_v, List<Ztj1> paramList, Zxts paramZxts, Zbnt paramZbnt, Zr_4 paramZr_4, Zr1j paramZr1j) {
    this.Zy = paramZl_v;
    this.Zq = paramList;
    this.ZH = paramZxts;
    this.Zk = paramZbnt;
    this.Zv = paramZr_4;
    this.ZU = paramZr1j;
    this.ZJ = new Zrzw(paramZbnt);
    this.Zr = new Zzxj(paramZbnt, paramZr_4);
  }
  
  void ZX(Zkcl paramZkcl) {
    this.ZD = paramZkcl;
  }
  
  public void ZU() {
    Zx();
    Zd();
  }
  
  private void Zx() {
    // Byte code:
    //   0: invokestatic Zk : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zy : Lburp/Zl_v;
    //   8: aload_0
    //   9: invokevirtual ZZ : ()Ljava/util/List;
    //   12: invokeinterface ZL : (Ljava/util/List;)V
    //   17: aload_0
    //   18: getfield Zq : Ljava/util/List;
    //   21: invokeinterface isEmpty : ()Z
    //   26: ifeq -> 56
    //   29: aload_0
    //   30: getfield Zy : Lburp/Zl_v;
    //   33: invokeinterface ZB : ()V
    //   38: aload_0
    //   39: getfield Zy : Lburp/Zl_v;
    //   42: invokeinterface ZH : ()V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield ZW : Z
    //   52: aload_1
    //   53: ifnonnull -> 117
    //   56: aload_0
    //   57: aload_0
    //   58: invokevirtual Zo : ()I
    //   61: putfield ZQ : I
    //   64: aload_0
    //   65: getfield ZQ : I
    //   68: iconst_m1
    //   69: if_icmpne -> 90
    //   72: aload_0
    //   73: getfield Zy : Lburp/Zl_v;
    //   76: invokeinterface ZB : ()V
    //   81: aload_0
    //   82: iconst_0
    //   83: putfield ZW : Z
    //   86: aload_1
    //   87: ifnonnull -> 117
    //   90: aload_0
    //   91: getfield Zy : Lburp/Zl_v;
    //   94: invokeinterface Zj : ()V
    //   99: aload_0
    //   100: getfield Zy : Lburp/Zl_v;
    //   103: aload_0
    //   104: getfield ZQ : I
    //   107: invokeinterface ZB : (I)V
    //   112: aload_0
    //   113: iconst_1
    //   114: putfield ZW : Z
    //   117: return
  }
  
  private List<String> ZZ() {
    return (List<String>)this.Zq.stream().map(Ztj1::ZO).collect(Collectors.toList());
  }
  
  private int Zo() {
    int[] arrayOfInt = Zz7i.Zk();
    if (Ze == -1)
      return -1; 
    byte b = 0;
    while (b < this.Zq.size()) {
      if (((Ztj1)this.Zq.get(b)).Zh() == Ze)
        return b; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  protected abstract void Zd();
  
  public void ZN() {
    this.Zy.Ze("");
    this.ZD = Zkcl.SCAN_CRAWL_AND_AUDIT;
    Zd();
    this.Zy.ZW();
    this.Zy.Zg();
    this.Zy.Zi();
  }
  
  public void Zg() {
    this.Zy.Ze("");
    this.ZD = Zkcl.SCAN_CRAWL;
    Zd();
    this.Zy.ZW();
    this.Zy.Zg();
    this.Zy.Zi();
  }
  
  public void Zt() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zy : Lburp/Zl_v;
    //   4: ldc ''
    //   6: invokeinterface Ze : (Ljava/lang/String;)V
    //   11: invokestatic Zk : ()[I
    //   14: aload_0
    //   15: getstatic burp/Zkcl.SCAN_AUDIT : Lburp/Zkcl;
    //   18: putfield ZD : Lburp/Zkcl;
    //   21: astore_1
    //   22: aload_0
    //   23: invokevirtual Zd : ()V
    //   26: aload_0
    //   27: getfield Zy : Lburp/Zl_v;
    //   30: invokeinterface Zr : ()V
    //   35: aload_0
    //   36: getfield Zy : Lburp/Zl_v;
    //   39: invokeinterface Zn : ()V
    //   44: aload_0
    //   45: getfield Zy : Lburp/Zl_v;
    //   48: invokeinterface Zz : ()V
    //   53: aload_0
    //   54: getfield Zq : Ljava/util/List;
    //   57: invokeinterface isEmpty : ()Z
    //   62: ifeq -> 78
    //   65: aload_0
    //   66: getfield Zy : Lburp/Zl_v;
    //   69: invokeinterface ZH : ()V
    //   74: aload_1
    //   75: ifnonnull -> 97
    //   78: aload_0
    //   79: invokevirtual Zo : ()I
    //   82: istore_2
    //   83: aload_0
    //   84: iload_2
    //   85: iconst_m1
    //   86: if_icmpne -> 93
    //   89: iconst_0
    //   90: goto -> 94
    //   93: iload_2
    //   94: putfield ZQ : I
    //   97: return
  }
  
  void Zm(List<String> paramList) {
    this.ZJ.Zf(paramList);
    this.Zr.ZP(Zgvb.Zv(paramList));
    ZF();
  }
  
  void Zw(List<String> paramList, Zl34 paramZl341, Zl34 paramZl342) {
    this.ZJ.Zf(paramList);
    this.Zr.ZU(paramZl341, paramZl342);
    ZF();
  }
  
  public void Zd(List<? extends Zll9> paramList) {
    this.ZS = paramList;
    this.Zy.Zj(ZC());
  }
  
  public void Zp(List<int[]> paramList) {
    this.Za = paramList;
  }
  
  private List<String> ZC() {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<? extends Zll9> iterator = this.ZS.iterator();
    int[] arrayOfInt = Zz7i.Zk();
    while (iterator.hasNext()) {
      Zll9 zll9 = iterator.next();
      arrayList.add(Zmg3.ZD(zll9.ZlL()));
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZF() {
    this.Zy.Zl(this.ZJ.Zq);
    this.Zy.Zp(this.Zr.ZJ, this.Zr.Zl);
    this.Zy.Zb(this.Zr.Zm, this.Zr.Zy);
    Zt(this.Zr.Zq);
  }
  
  void Zb() {
    this.ZW = true;
    if (this.ZQ == -1)
      this.ZQ = 0; 
    Zd();
  }
  
  void ZK() {
    this.ZW = false;
    Zd();
  }
  
  void ZP(int paramInt) {
    this.ZQ = paramInt;
    this.Zy.Zj();
    Zb();
  }
  
  void Z_(boolean paramBoolean) {
    this.Zr.Zt(paramBoolean);
    this.ZJ.Zo(paramBoolean);
    this.Zy.ZT(paramBoolean);
  }
  
  void ZM(List<String> paramList) {
    String str = this.ZJ.ZD(paramList);
    this.Zy.Ze(str);
    this.Zy.Zl(this.ZJ.Zq);
    if (!this.ZF && str.isEmpty())
      ZS(this.ZJ.Zq); 
  }
  
  private void ZS(List<String> paramList) {
    this.Zr.ZW(Zgvb.Zv(paramList), this.Zr.Zl);
    this.Zy.Zp(this.Zr.ZJ, this.Zr.Zl);
  }
  
  void Zd(boolean paramBoolean) {
    this.Zy.Zc(paramBoolean);
  }
  
  void Zt(boolean paramBoolean) {
    this.Zy.Ze("");
    this.Zr.Zq = paramBoolean;
    int[] arrayOfInt = Zz7i.Zk();
    if (paramBoolean) {
      this.Zy.Zb();
      if (arrayOfInt == null) {
        this.Zy.Zk();
        return;
      } 
      return;
    } 
    this.Zy.Zk();
  }
  
  void ZF(List<String> paramList1, List<String> paramList2) {
    List<String> list = this.Zr.ZJ;
    String str = this.Zr.ZW(paramList1, paramList2);
    this.ZF = (this.ZF || !this.Zr.ZJ.equals(list));
    this.Zy.Ze(str);
    this.Zy.Zp(this.Zr.ZJ, this.Zr.Zl);
  }
  
  void ZJ(Zmy8 paramZmy8) {
    this.Zr.Zb(paramZmy8);
  }
  
  void Zw(Zmy8 paramZmy8, int paramInt) {
    this.Zr.Zr(paramInt, paramZmy8);
  }
  
  void ZJ(int paramInt) {
    this.Zr.ZA(paramInt);
  }
  
  void ZY(Zmy8 paramZmy8) {
    this.Zr.ZK(paramZmy8);
  }
  
  void ZE(Zmy8 paramZmy8, int paramInt) {
    this.Zr.Zv(paramInt, paramZmy8);
  }
  
  void Za(int paramInt) {
    this.Zr.ZG(paramInt);
  }
  
  void Zv() {
    this.Zy.Ze("");
    this.Zy.Z_(this.ZS);
  }
  
  void ZG(List<Zll9> paramList) {
    Zd(paramList);
  }
  
  void ZI() {
    this.Zy.Ze("");
    this.Zy.ZK();
  }
  
  void Z_(Zmf_ paramZmf_) {
    this.Zr.ZI(paramZmf_);
    ZF();
  }
  
  String Zc(String paramString) {
    return Zzqb.Za(this.ZH, paramString, Ze());
  }
  
  public void Zo(boolean paramBoolean) {
    this.Zl = paramBoolean;
    this.Zy.ZY(paramBoolean);
  }
  
  String ZM(Zgyw paramZgyw) {
    if (this.ZD == Zkcl.SCAN_CRAWL || this.ZD == Zkcl.SCAN_CRAWL_AND_AUDIT) {
      String str = this.ZJ.Z_();
      if (!str.isEmpty())
        return str; 
      str = this.Zr.Zk();
      return !str.isEmpty() ? str : (!Zgvb.ZV(this.ZJ.ZG(), this.Zr, this.Zk, this.Zv, this.ZU) ? Zrgs.NOT_ALL_SEED_URLS_IN_SCOPE.ZN(new Object[0]) : Zgvb.ZE(this.ZJ.ZG(), paramZgyw).orElse(""));
    } 
    return this.ZS.isEmpty() ? Zrgs.NO_ITEMS_TO_SCAN_SPECIFIED.ZN(new Object[0]) : "";
  }
  
  Ztfs ZQ() {
    Ztj1 ztj1 = null;
    if (this.ZD == Zkcl.SCAN_AUDIT && this.ZW) {
      ztj1 = this.Zq.get(this.ZQ);
      Ze = ztj1.Zh();
    } 
    return new Ztfs(this.ZD, this.ZW, ztj1, this.Zr, this.ZJ.ZG(), this.ZS, this.Za, this.Zl);
  }
  
  private Zzkm Ze() {
    Zl34 zl341 = this.Zv.<Zl34>ZH(new Ztwg(true));
    Zl34 zl342 = this.Zv.<Zl34>ZH(new Ztwg(false));
    Zlor zlor = this.Zr.Ze(zl341, zl342, this.Zv);
    Zzkm zzkm = new Zzkm();
    zlor.Zf(zzkm, a);
    return zzkm;
  }
  
  static {
    // Byte code:
    //   0: bipush #102
    //   2: ldc 'r:gV'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zeus.a : Ljava/lang/String;
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
    //   80: bipush #12
    //   82: goto -> 111
    //   85: bipush #119
    //   87: goto -> 111
    //   90: bipush #51
    //   92: goto -> 111
    //   95: bipush #113
    //   97: goto -> 111
    //   100: bipush #85
    //   102: goto -> 111
    //   105: iconst_5
    //   106: goto -> 111
    //   109: bipush #55
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
    //   153: iconst_m1
    //   154: putstatic burp/Zeus.Ze : I
    //   157: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */