package burp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zrmf;
import net.portswigger.Zuh;

public class Zbj9 implements Zm5j, Zzoo, Zrsm, Ze7o, Zerv {
  private final ObservableList<Zt3i> ZB;
  
  private final Zx_k Zh;
  
  private final Zs4c ZW;
  
  private final Zz8a Zy;
  
  private final Zzkr ZV;
  
  private final Zl66 Zv;
  
  private final ObservableList<Zg7g> ZM;
  
  private final boolean Zs;
  
  private final Ztwv Zl;
  
  private final Zzxj Zq;
  
  private final Zrfd ZQ;
  
  private final Zm0l ZP;
  
  private final Zxnt Zb;
  
  private Zzbb ZF;
  
  private Zlit Zz;
  
  private boolean ZT;
  
  private Zleo ZU;
  
  private Zxoi ZI;
  
  private Zzk7 Zp;
  
  private Zeh7 Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbj9(Zxnt paramZxnt, Zs4c paramZs4c, Zz8a paramZz8a, Zzkr paramZzkr, Zl66 paramZl66, Ztwv paramZtwv, Zbnt paramZbnt, Zr_4 paramZr_4, Zrfd paramZrfd, Zm0l paramZm0l, boolean paramBoolean) {
    this.Zb = paramZxnt;
    this.ZW = paramZs4c;
    this.Zy = paramZz8a;
    this.ZV = paramZzkr;
    this.Zv = paramZl66;
    this.Zl = paramZtwv;
    this.ZQ = paramZrfd;
    this.ZP = paramZm0l;
    this.Zs = paramBoolean;
    this.ZM = FXCollections.observableArrayList();
    this.ZB = FXCollections.observableArrayList();
    this.Zh = new Zx_k();
    this.ZF = paramZxnt.Zy();
    this.Zq = new Zzxj(paramZbnt, paramZr_4);
  }
  
  public void Zy(Zleo paramZleo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZU : Lburp/Zleo;
    //   5: aload_0
    //   6: new burp/Zxoi
    //   9: dup
    //   10: aload_1
    //   11: aload_0
    //   12: getfield ZW : Lburp/Zs4c;
    //   15: aload_0
    //   16: getfield Zy : Lburp/Zz8a;
    //   19: iconst_0
    //   20: aload_0
    //   21: getfield Zs : Z
    //   24: invokespecial <init> : (Lburp/Zs1n;Lburp/Zs4c;Lburp/Zz8a;ZZ)V
    //   27: putfield ZI : Lburp/Zxoi;
    //   30: aload_0
    //   31: new burp/Zzk7
    //   34: dup
    //   35: aload_1
    //   36: aload_0
    //   37: getfield ZV : Lburp/Zzkr;
    //   40: invokespecial <init> : (Lburp/Ztue;Lburp/Zzkr;)V
    //   43: putfield Zp : Lburp/Zzk7;
    //   46: aload_0
    //   47: new burp/Zeh7
    //   50: dup
    //   51: aload_1
    //   52: invokespecial <init> : (Lburp/Zsc9;)V
    //   55: putfield Zd : Lburp/Zeh7;
    //   58: aload_0
    //   59: getfield ZI : Lburp/Zxoi;
    //   62: getstatic burp/Zkcl.API_AUDIT : Lburp/Zkcl;
    //   65: invokevirtual Zr : (Lburp/Zkcl;)V
    //   68: aload_1
    //   69: invokeinterface Zu : ()V
    //   74: aload_0
    //   75: getfield Zb : Lburp/Zxnt;
    //   78: aload_1
    //   79: aload_0
    //   80: invokeinterface Zk : (Lburp/Zleo;Lburp/Zbj9;)V
    //   85: aload_1
    //   86: invokeinterface ZT : ()V
    //   91: aload_0
    //   92: aload_1
    //   93: <illegal opcode> run : (Lburp/Zbj9;Lburp/Zleo;)Ljava/lang/Runnable;
    //   98: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   101: return
  }
  
  public void ZJ(int paramInt) {
    if (paramInt == ZA(this.ZF) || paramInt < 0 || paramInt >= (Zzbb.values()).length)
      return; 
    if (paramInt == ZA(Zzbb.SCAN_CONFIGURATION_PANEL))
      this.ZI.Zd(); 
    this.ZF = this.Zb.ZK(paramInt);
    this.Zb.Z_(this.ZF);
    this.ZU.ZP(paramInt);
    this.ZU.Ze("");
  }
  
  public void ZY() {
    ZJ(ZA(this.ZF) - 1);
  }
  
  public void ZO() {
    if (Zi())
      ZJ(ZA(this.ZF) + 1); 
  }
  
  public void ZY(Zzbb paramZzbb) {
    ZJ(ZA(paramZzbb));
  }
  
  public void ZV() {
    ZY(Zzbb.API_DETAILS_PANEL);
    this.Zd.ZV();
  }
  
  public void Z_() {
    this.ZI.Z_();
  }
  
  public void ZQ(Zmln paramZmln) {
    this.ZI.ZQ(paramZmln);
  }
  
  public void Zx(Zkbn paramZkbn) {
    this.ZI.Zx(paramZkbn);
  }
  
  public void ZF(int paramInt) {
    this.ZI.ZF(paramInt);
  }
  
  public void Zm(int paramInt) {
    this.ZI.Zm(paramInt);
  }
  
  public void Zq(int paramInt) {
    this.ZI.Zq(paramInt);
  }
  
  public void Zw(int paramInt, String paramString, Zmf_ paramZmf_) {
    this.ZI.Zw(paramInt, paramString, paramZmf_);
  }
  
  public void Zy(int[] paramArrayOfint) {
    this.ZI.Zy(paramArrayOfint);
  }
  
  public void ZG() {
    this.ZI.ZG();
  }
  
  public void ZK(List<Zkbn> paramList) {
    this.ZI.ZK(paramList);
  }
  
  public void ZJ() {
    this.ZI.ZJ();
  }
  
  public void ZH(Zm40 paramZm40) {}
  
  public Zm40 ZI() {
    return null;
  }
  
  public void Zs() {
    this.Zp.ZP();
  }
  
  public void Zw(int paramInt) {
    this.Zp.ZT(paramInt);
  }
  
  public void Zh() {
    this.Zp.ZQ();
  }
  
  public void Zt(String paramString) {
    this.Zp.ZU(paramString);
  }
  
  public void ZM(boolean paramBoolean) {
    this.Zp.ZG(paramBoolean);
  }
  
  public void Zl(int paramInt) {
    this.Zp.Zm(paramInt);
  }
  
  public void Zt(boolean paramBoolean) {
    this.Zp.ZI(paramBoolean);
  }
  
  public void ZU(boolean paramBoolean) {
    this.Zp.ZD(paramBoolean);
  }
  
  public void ZR(boolean paramBoolean) {
    this.Zp.Zg(paramBoolean);
  }
  
  public void ZS(boolean paramBoolean) {
    this.Zp.Zr(paramBoolean);
  }
  
  public void ZI(String paramString) {
    this.Zp.Zm(paramString);
  }
  
  public void Zj(boolean paramBoolean) {
    this.Zp.Zf(paramBoolean);
  }
  
  public void Zr(int paramInt) {
    this.Zp.Zz(paramInt);
  }
  
  public void Zb() {
    this.Zp.Zn();
  }
  
  public void Zg() {
    this.Zp.ZA();
  }
  
  public void ZN() {
    this.Zp.Zs();
  }
  
  public void Zb(int paramInt) {
    this.Zp.ZH(paramInt);
  }
  
  public void Zc(Zrx_ paramZrx_) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public boolean Zd() {
    String str = ZH();
    if (!str.isEmpty()) {
      this.ZU.Ze(str);
      return false;
    } 
    this.Zl.Zx(this::lambda$applyConfigChanges$1);
    return true;
  }
  
  private String ZH() {
    String str1 = this.ZI.ZC();
    String str2 = this.Zp.ZN();
    if (this.ZF == Zzbb.SCAN_CONFIGURATION_PANEL && !str1.isEmpty())
      return str1; 
    if (this.ZF == Zzbb.RESOURCE_POOL_PANEL && !str2.isEmpty())
      return str2; 
    if (!str1.isEmpty()) {
      ZJ(ZA(Zzbb.SCAN_CONFIGURATION_PANEL));
      return str1;
    } 
    if (!str2.isEmpty()) {
      ZJ(ZA(Zzbb.RESOURCE_POOL_PANEL));
      return str2;
    } 
    return "";
  }
  
  public boolean Zv() {
    // Byte code:
    //   0: invokestatic Zf : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual Zi : ()Z
    //   8: ifne -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: invokevirtual ZL : ()Ljava/lang/String;
    //   17: astore_2
    //   18: aload_2
    //   19: invokevirtual isEmpty : ()Z
    //   22: ifne -> 37
    //   25: aload_0
    //   26: getfield ZU : Lburp/Zleo;
    //   29: aload_2
    //   30: invokeinterface Ze : (Ljava/lang/String;)V
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_0
    //   38: getfield Zh : Lburp/Zx_k;
    //   41: invokevirtual Zp : ()Ljavafx/collections/ObservableList;
    //   44: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   49: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   54: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   59: ifeq -> 276
    //   62: new burp/Zlvz
    //   65: dup
    //   66: aload_0
    //   67: getfield ZU : Lburp/Zleo;
    //   70: checkcast burp/Zl04
    //   73: invokespecial <init> : (Ljava/awt/Window;)V
    //   76: sipush #-30826
    //   79: sipush #-31018
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zlvz;
    //   88: sipush #-30827
    //   91: sipush #30742
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: invokevirtual ZN : (Ljava/lang/String;)Lburp/Zlvz;
    //   100: iconst_2
    //   101: anewarray java/lang/String
    //   104: dup
    //   105: iconst_0
    //   106: sipush #-30831
    //   109: sipush #16594
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: aastore
    //   116: dup
    //   117: iconst_1
    //   118: sipush #-30829
    //   121: sipush #3186
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: aastore
    //   128: invokevirtual Z_ : ([Ljava/lang/String;)Lburp/Zlvz;
    //   131: invokevirtual ZS : ()Lburp/Zlvz;
    //   134: sipush #-30832
    //   137: sipush #-19041
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual Zt : (Ljava/lang/String;)Lburp/Zlvz;
    //   146: sipush #-30825
    //   149: sipush #-13001
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: invokevirtual ZC : (Ljava/lang/String;)Lburp/Zlvz;
    //   158: new burp/Ze3m
    //   161: dup
    //   162: getstatic burp/Zeuf.WARNING : Lburp/Zeuf;
    //   165: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   168: invokespecial <init> : (Lburp/Zeuf;Lburp/Zlkk;)V
    //   171: getstatic burp/Zmcx.EXTRA_LARGE_LINE_SIZE : Lburp/Zmcx;
    //   174: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   177: invokevirtual Z_ : ()Lburp/Ze9n;
    //   180: invokevirtual Zs : (Lburp/Ze9n;)Lburp/Zlvz;
    //   183: invokevirtual Zc : ()Lburp/Zr7j;
    //   186: astore_3
    //   187: aload_3
    //   188: invokevirtual Zj : ()Lburp/Zt3;
    //   191: invokevirtual ZuO : ()Z
    //   194: ifeq -> 270
    //   197: aload_0
    //   198: getfield Zh : Lburp/Zx_k;
    //   201: invokevirtual Zp : ()Ljavafx/collections/ObservableList;
    //   204: invokeinterface isEmpty : ()Z
    //   209: ifne -> 260
    //   212: aload_0
    //   213: getfield Zh : Lburp/Zx_k;
    //   216: invokevirtual Zp : ()Ljavafx/collections/ObservableList;
    //   219: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   224: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   229: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   234: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   239: invokestatic not : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   242: invokeinterface allMatch : (Ljava/util/function/Predicate;)Z
    //   247: ifeq -> 260
    //   250: getstatic burp/Zze0.SCANNER_API_SCAN_STARTED_WITH_ALL_AUTH_UNCONFIGURED : Lburp/Zze0;
    //   253: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   256: aload_1
    //   257: ifnonnull -> 276
    //   260: getstatic burp/Zze0.SCANNER_API_SCAN_STARTED_WITH_UNCONFIGURED_AUTH : Lburp/Zze0;
    //   263: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   266: aload_1
    //   267: ifnonnull -> 276
    //   270: aload_0
    //   271: invokevirtual ZV : ()V
    //   274: iconst_0
    //   275: ireturn
    //   276: aload_0
    //   277: getfield Zl : Lburp/Ztwv;
    //   280: aload_0
    //   281: <illegal opcode> run : (Lburp/Zbj9;)Ljava/lang/Runnable;
    //   286: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   291: pop
    //   292: iconst_1
    //   293: ireturn
  }
  
  public ObservableList<Zg7g> ZX() {
    return this.ZM;
  }
  
  public ObservableList<Zt3i> Ze() {
    return this.ZB;
  }
  
  public Zx_k ZF() {
    return this.Zh;
  }
  
  private List<? extends Zll9> ZW() {
    Zm2.Zi(Zv8r.SCANNER_API_ENDPOINTS_DISABLED, this.ZM.stream().filter(Predicate.not(Zg7g::ZB)).count());
    return this.ZM.stream().filter(Zg7g::ZB).flatMap(this::lambda$buildItemsToAudit$5).map(Zbj9::lambda$buildItemsToAudit$6).toList();
  }
  
  String ZC() {
    return this.ZM.isEmpty() ? a(-30828, -6440) : "";
  }
  
  String Zl() {
    return this.ZM.stream().noneMatch(Zg7g::ZB) ? ((this.ZM.size() == 1) ? a(-30817, -7735) : a(-30830, -29494)) : "";
  }
  
  String Zx() {
    return this.ZI.ZC();
  }
  
  String Zz() {
    return this.Zp.ZN();
  }
  
  private boolean Zi() {
    String str = this.ZF.validate.apply(this);
    if (!str.isEmpty()) {
      this.ZU.Ze(str);
      return false;
    } 
    return true;
  }
  
  private String ZL() {
    Zzbb[] arrayOfZzbb = Zzbb.values();
    int i = arrayOfZzbb.length;
    byte b = 0;
    int[] arrayOfInt = Zg7g.Zf();
    while (b < i) {
      Zzbb zzbb = arrayOfZzbb[b];
      String str = zzbb.validate.apply(this);
      if (!str.isEmpty()) {
        ZJ(ZA(zzbb));
        return str;
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return "";
  }
  
  private int ZA(Zzbb paramZzbb) {
    return this.Zb.ZV(paramZzbb);
  }
  
  public void ZU(Collection<Zrmf> paramCollection, Zlit paramZlit) {
    int[] arrayOfInt = Zg7g.Zf();
    this.ZT = (paramZlit == null);
    this.Zz = paramZlit;
    this.ZM.clear();
    this.ZM.addAll(this.Zv.Zw(paramCollection.stream(), this.Zz));
    this.ZB.clear();
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    this.ZM.stream().flatMap(this::lambda$apiParsed$7).forEach(linkedHashMap::lambda$apiParsed$8);
    this.ZB.addAll(linkedHashMap.values());
    this.Zh.Zc((List<Zg7g>)this.ZM);
    if (Zbqc.Zwu() == null)
      Zg7g.Zs(new int[5]); 
  }
  
  public void Zm() {
    this.ZM.clear();
    this.ZB.clear();
    this.Zh.Z_();
    this.Zz = null;
    this.ZU.Ze("");
  }
  
  private static void lambda$apiParsed$8(Map<Zryz, Zt3i> paramMap, Zt3i paramZt3i) {
    paramMap.putIfAbsent(paramZt3i.ZT(), paramZt3i);
  }
  
  private Stream lambda$apiParsed$7(Zg7g paramZg7g) {
    return this.Zv.ZL(paramZg7g, this.Zz);
  }
  
  private static Zetn lambda$buildItemsToAudit$6(Zefx paramZefx) {
    return new Zetn(paramZefx.ZF(), Zyf.Zy(paramZefx.ZD()), null);
  }
  
  private Stream lambda$buildItemsToAudit$5(Zg7g paramZg7g) {
    return this.Zv.ZN(paramZg7g, this.Zz, (List<Zgi>)this.Zh.Zp());
  }
  
  private void lambda$launchScan$4() {
    Ztf3 ztf3 = new Ztf3(this.Zq, ZW(), this.ZT);
    Zkv4 zkv4 = new Zkv4(ztf3, Zz5.ZO, this.ZI.ZH(), Zmpo.Zi, this.Zp.Zl(), Zlj4.MANUAL, false);
    this.ZQ.Zq(zkv4, this.ZP);
  }
  
  private static boolean lambda$launchScan$3(Zgi paramZgi) {
    return (paramZgi.ZS() && paramZgi.ZY());
  }
  
  private static boolean lambda$launchScan$2(Zgi paramZgi) {
    return (paramZgi.ZS() && paramZgi.ZY() && !paramZgi.Ze());
  }
  
  private void lambda$applyConfigChanges$1() {
    this.Zb.Zb(this.ZI.ZP() ? this.ZI.ZH() : null, this.Zp.Zl());
  }
  
  private void lambda$setView$0(Zleo paramZleo) {
    paramZleo.ZP(ZA(this.ZF));
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÛekùÀ\\fYÈ+)i`Y6O­Ü)^è¢Cì]ø¾t\\ta¹[¼©þké,X¢ª±%PzÖ7fEUy{úrúôT+\\ncÄOÍÊ;@<]|íåè%¡&»Ù$vÔJýBoYÆ¨RvÖ»PÎwñß¯ _IUË)òù¦Êr\\rÖÇ².öÈZÊG6p?Í¹2Ñ¬¨~û%n5þÖøÿïC\\r\zè1 ç¼g'_É8®ó:ábÓÝ\\t[6ÄÏÞ¥íê×P"TÙ~+¬gÅ¦18KýÄÕ®KN³ì9ûÐºaòøl·»m~NðÜ~0Ü\\b3É'ÐâNìPV¦¨dÁEH4ï(-ÊïKû¸íÊÂ`xqÛí.7Y}¦Ø"sëXGÎÕ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #6
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
    //   68: ldc 'ÙòÔ6AæÜHH\\bDá y°Xcy ×=íØÿÙèAk&¶5[«·±\\rÍô}Øø¾Ýó¼Rìm©â0P6)Gñ×õÑúIzã»Ó÷'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #80
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
    //   129: putstatic burp/Zbj9.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbj9.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #19
    //   214: goto -> 243
    //   217: bipush #62
    //   219: goto -> 243
    //   222: bipush #88
    //   224: goto -> 243
    //   227: iconst_3
    //   228: goto -> 243
    //   231: bipush #23
    //   233: goto -> 243
    //   236: bipush #103
    //   238: goto -> 243
    //   241: bipush #111
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8797) & 0xFFFF;
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
      byte b1 = 111;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbj9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */