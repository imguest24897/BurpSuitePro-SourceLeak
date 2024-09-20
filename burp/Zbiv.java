package burp;

import java.awt.Component;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.swing.JMenuItem;
import net.portswigger.Zl0;
import net.portswigger.Zsy;

public class Zbiv {
  private final Zerg Zr;
  
  private final Zs4c ZT;
  
  private final Zbqp Zn;
  
  private final Zxts ZD;
  
  private final Zz_z ZE;
  
  private final Zz8a Zo;
  
  private final Zrag ZZ;
  
  private final Zzkr ZM;
  
  private final Zkl6 Zk;
  
  private final Zrfd Zp;
  
  private final Zl34 Z_;
  
  private final Zl34 ZK;
  
  private final Ztwv ZO;
  
  private final Zr_4 ZY;
  
  private final Zr_4 Za;
  
  private final Zvo_ Zd;
  
  private final Zr49 ZV;
  
  private final Zzov Zi;
  
  private final Zb_8 ZF;
  
  private final Zl0 ZS;
  
  private final Zgx8 Zt;
  
  private final Zsy ZN;
  
  private final Zskh ZP;
  
  private final Zm9o ZQ;
  
  private static int Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbiv(Zerg paramZerg, Zs4c paramZs4c, Zbqp paramZbqp, Zxts paramZxts, Zr49 paramZr49, Zz8a paramZz8a, Zrag paramZrag, Zzkr paramZzkr, Zkl6 paramZkl6, Zrfd paramZrfd, Zl34 paramZl341, Zl34 paramZl342, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zvo_ paramZvo_, Zzov paramZzov, Zb_8 paramZb_8, Zl0 paramZl0, Zgx8 paramZgx8, Zsy paramZsy, Zskh paramZskh, Zm9o paramZm9o) {
    this.Zr = paramZerg;
    this.ZT = paramZs4c;
    this.Zn = paramZbqp;
    this.ZD = paramZxts;
    this.ZV = paramZr49;
    this.Zo = paramZz8a;
    this.ZZ = paramZrag;
    this.ZM = paramZzkr;
    this.Zk = paramZkl6;
    this.Zp = paramZrfd;
    int i = Zd();
    this.Z_ = paramZl341;
    this.ZK = paramZl342;
    this.ZO = paramZtwv;
    this.ZY = paramZr_41;
    this.Za = paramZr_42;
    this.Zd = paramZvo_;
    this.Zi = paramZzov;
    this.ZF = paramZb_8;
    this.ZS = paramZl0;
    this.Zt = paramZgx8;
    this.ZN = paramZsy;
    this.ZP = paramZskh;
    this.ZQ = paramZm9o;
    this.ZE = new Zz_z(paramZrfd, paramZerg, paramZrag, paramZz8a, paramZtwv);
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zrfd ZW() {
    return this.Zp;
  }
  
  public void ZA(Zkj9 paramZkj9, Consumer<Ztj1> paramConsumer, Zzyl paramZzyl) {
    ZT(paramZkj9, a(26658, 25893), null, null, paramConsumer, paramZzyl);
  }
  
  public void ZQ(Zkj9 paramZkj9, String paramString1, String paramString2, Consumer<Ztj1> paramConsumer, Zzyl paramZzyl) {
    ZT(paramZkj9, a(26663, -29946), paramString1, paramString2, paramConsumer, paramZzyl);
  }
  
  public void ZK(Zkj9 paramZkj9, String paramString, Consumer<Ztj1> paramConsumer, Zzyl paramZzyl) {
    ZT(paramZkj9, paramString, null, null, paramConsumer, paramZzyl);
  }
  
  private void ZT(Zkj9 paramZkj9, String paramString1, String paramString2, String paramString3, Consumer<Ztj1> paramConsumer, Zzyl paramZzyl) {
    int i = Zd();
    for (Component component : Zl(paramString2, paramString3, paramZzyl, new Zmwa[] { Zmwa.ZA(paramString1, paramConsumer) })) {
      paramZkj9.add(component);
      if (i != 0)
        break; 
    } 
  }
  
  public List<Component> ZT(Zzyl paramZzyl, Zmwa... paramVarArgs) {
    return Zl(null, null, paramZzyl, paramVarArgs);
  }
  
  private List<Component> Zl(String paramString1, String paramString2, Zzyl paramZzyl, Zmwa... paramVarArgs) {
    // Byte code:
    //   0: aload #4
    //   2: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   5: aload_0
    //   6: aload_3
    //   7: <illegal opcode> apply : (Lburp/Zbiv;Lburp/Zzyl;)Ljava/util/function/Function;
    //   12: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   17: invokestatic toList : ()Ljava/util/stream/Collector;
    //   20: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   25: checkcast java/util/List
    //   28: astore #5
    //   30: aload #5
    //   32: aload_3
    //   33: ldc 136704
    //   35: aload_1
    //   36: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   39: invokeinterface add : (Ljava/lang/Object;)Z
    //   44: pop
    //   45: aload #5
    //   47: aload_3
    //   48: ldc 136960
    //   50: aload_2
    //   51: invokestatic Zx : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zepk;
    //   54: invokeinterface add : (Ljava/lang/Object;)Z
    //   59: pop
    //   60: aload #5
    //   62: areturn
  }
  
  public Zz7i Zv() {
    return this.ZE.ZK();
  }
  
  public void Zn(Component paramComponent) {
    ZJ(paramComponent, new Zraa(Zkcl.SCAN_CRAWL_AND_AUDIT, this.Z_, this.ZY), a(26665, 26566), Zzr6::ZRN, true, false);
  }
  
  public void ZN(Component paramComponent) {
    ZZ(paramComponent, new Zzj3(), a(26667, -32160), true);
  }
  
  public void Zm(Component paramComponent, Zstu paramZstu1, Zstu paramZstu2, Zlit paramZlit) {
    ZH(paramComponent, Collections.singletonList(new Zetn(paramZlit, paramZstu1, paramZstu2)));
  }
  
  public void ZH(Component paramComponent, List<? extends Zll9> paramList) {
    ZJ(paramComponent, new Zmzi(paramList), a(26670, 30126), Zzr6::ZRN, true, false);
  }
  
  public void Zm(Component paramComponent, Zll9 paramZll9, List<int[]> paramList) {
    ZJ(paramComponent, new Zs8t(paramZll9, paramList), a(26670, 30126), Zzr6::ZRN, true, false);
  }
  
  public void Za(Component paramComponent, Ze3h paramZe3h) {
    ZJ(paramComponent, new Zsyk(paramZe3h), a(26666, 32235), Zzr6::ZRN, true, false);
  }
  
  public void Ze(Component paramComponent) {
    Ztu9 ztu9 = new Ztu9();
    boolean bool = true;
    Zk14 zk14 = new Zk14(ztu9, this.ZM, this.Zr.Zk(), this.Z_, this.ZK, this.ZD, this.Zk.ZB(), this.Zp, this.Zo, this.ZO, this.ZY, Zrx_.CUSTOM, bool);
    Zgo8 zgo8 = new Zgo8(zk14, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, bool);
    Zl4f zl4f = new Zl4f(a(26687, -17044), zk14, zgo8, this.ZV, this.Zn, Zetl::ZSl);
    zk14.Zh(zl4f);
    zl4f.Zg(paramComponent);
  }
  
  public void Zg(Component paramComponent, Ztj1 paramZtj1, Zgna paramZgna) {
    // Byte code:
    //   0: invokestatic Zd : ()I
    //   3: istore #4
    //   5: getstatic burp/Zrnj.Zt : [I
    //   8: aload_2
    //   9: invokevirtual Zl : ()Lburp/Zkcl;
    //   12: invokevirtual ordinal : ()I
    //   15: iaload
    //   16: tableswitch default -> 251, 1 -> 68, 2 -> 83, 3 -> 161, 4 -> 176, 5 -> 191, 6 -> 206, 7 -> 221, 8 -> 221, 9 -> 236
    //   68: aload_0
    //   69: aload_1
    //   70: aload_2
    //   71: aload_3
    //   72: checkcast burp/Zlog
    //   75: invokevirtual ZL : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zlog;)V
    //   78: iload #4
    //   80: ifeq -> 265
    //   83: aload_0
    //   84: getfield Zr : Lburp/Zerg;
    //   87: invokevirtual Zk : ()Lburp/Zkrj;
    //   90: astore #5
    //   92: aload_2
    //   93: invokevirtual Zh : ()I
    //   96: aload #5
    //   98: invokevirtual ZF1 : ()I
    //   101: if_icmpne -> 119
    //   104: aload_0
    //   105: aload_1
    //   106: aload_2
    //   107: aload_3
    //   108: checkcast burp/Zr5h
    //   111: invokevirtual ZN : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zr5h;)V
    //   114: iload #4
    //   116: ifeq -> 265
    //   119: aload_2
    //   120: invokevirtual Zh : ()I
    //   123: aload #5
    //   125: invokevirtual ZFo : ()I
    //   128: if_icmpne -> 146
    //   131: aload_0
    //   132: aload_1
    //   133: aload_2
    //   134: aload_3
    //   135: checkcast burp/Zr5h
    //   138: invokevirtual ZL : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zr5h;)V
    //   141: iload #4
    //   143: ifeq -> 265
    //   146: aload_0
    //   147: aload_1
    //   148: aload_2
    //   149: aload_3
    //   150: checkcast burp/Zr5h
    //   153: invokevirtual Zt : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zr5h;)V
    //   156: iload #4
    //   158: ifeq -> 265
    //   161: aload_0
    //   162: aload_1
    //   163: aload_2
    //   164: aload_3
    //   165: checkcast burp/Zzep
    //   168: invokevirtual Zn : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zzep;)V
    //   171: iload #4
    //   173: ifeq -> 265
    //   176: aload_0
    //   177: aload_1
    //   178: aload_2
    //   179: aload_3
    //   180: checkcast burp/Zbob
    //   183: invokevirtual ZP : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zbob;)V
    //   186: iload #4
    //   188: ifeq -> 265
    //   191: aload_0
    //   192: aload_1
    //   193: aload_2
    //   194: aload_3
    //   195: checkcast burp/Zzep
    //   198: invokevirtual ZQ : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Zzep;)V
    //   201: iload #4
    //   203: ifeq -> 265
    //   206: aload_0
    //   207: aload_1
    //   208: aload_2
    //   209: aload_3
    //   210: checkcast burp/Ztr3
    //   213: invokevirtual ZD : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Ztr3;)V
    //   216: iload #4
    //   218: ifeq -> 265
    //   221: aload_0
    //   222: aload_1
    //   223: aload_2
    //   224: aload_3
    //   225: checkcast burp/Ztr3
    //   228: invokevirtual Zo : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Ztr3;)V
    //   231: iload #4
    //   233: ifeq -> 265
    //   236: aload_0
    //   237: aload_1
    //   238: aload_2
    //   239: aload_3
    //   240: checkcast burp/Ze9i
    //   243: invokevirtual ZK : (Ljava/awt/Component;Lburp/Ztj1;Lburp/Ze9i;)V
    //   246: iload #4
    //   248: ifeq -> 265
    //   251: iconst_0
    //   252: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   255: aload_2
    //   256: invokevirtual Zl : ()Lburp/Zkcl;
    //   259: invokevirtual name : ()Ljava/lang/String;
    //   262: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   265: return
  }
  
  private void ZL(Component paramComponent, Ztj1 paramZtj1, Zlog paramZlog) {
    ZJ(paramComponent, new Zxgw(paramZtj1, paramZlog, this.Zp), a(26664, 445), Zzr6::ZRH, false, false);
  }
  
  private void Zt(Component paramComponent, Ztj1 paramZtj1, Zr5h paramZr5h) {
    ZJ(paramComponent, new Zlnj(paramZtj1, paramZr5h, this.Zp), a(26668, -23416), Zzr6::ZRH, false, false);
  }
  
  private void Zn(Component paramComponent, Ztj1 paramZtj1, Zzep paramZzep) {
    ZJ(paramComponent, new Zb8l(paramZtj1, paramZzep, this.Zp), a(26657, 22990), Zzr6::ZRH, false, false);
  }
  
  public void ZP(Component paramComponent, Ztj1 paramZtj1, Zbob paramZbob) {
    ZZ(paramComponent, new Zkb8(paramZtj1, paramZbob, this.Zp), a(26661, -5402), false);
  }
  
  public void ZQ(Component paramComponent, Ztj1 paramZtj1, Zzep paramZzep) {
    ZD(paramComponent, new Zgza(paramZtj1, paramZzep, this.Zp), a(26671, -20880), false);
  }
  
  private void ZN(Component paramComponent, Ztj1 paramZtj1, Zr5h paramZr5h) {
    ZJ(paramComponent, new Zlnl(paramZtj1, paramZr5h, this.Zp, Zze0.DASHBOARD_INSTANT_PASSIVE_SCAN_CONFIG_EDITED), a(26656, -9544), Zzr6::ZRH, false, true);
  }
  
  private void ZL(Component paramComponent, Ztj1 paramZtj1, Zr5h paramZr5h) {
    ZJ(paramComponent, new Zlnl(paramZtj1, paramZr5h, this.Zp, Zze0.DASHBOARD_INSTANT_ACTIVE_SCAN_CONFIG_EDITED), a(26659, -31073), Zzr6::ZRH, false, false);
  }
  
  private void ZJ(Component paramComponent, Zm7j paramZm7j, String paramString, Function<Zzr6, Boolean> paramFunction, boolean paramBoolean1, boolean paramBoolean2) {
    Zrx_ zrx_ = paramBoolean1 ? Zerf.ZG : Zrx_.CUSTOM;
    Ze0 ze0 = Ze0.Zb(paramZm7j, this.ZT, this.ZD, this.ZZ, this.ZM, this.Zr.Zk(), this.Zk.ZB(), this.Zp, this.ZO, this.ZY, this.Zk.Zq(), this.Zo, zrx_, this.ZQ, paramBoolean2, paramBoolean1);
    Zgo8 zgo8 = new Zgo8(ze0, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, paramBoolean1, paramBoolean2);
    Zl4j zl4j = new Zl4j(paramString, ze0, zgo8, this.ZV, this.Zn, paramFunction, this.Zd);
    ze0.Zb(zl4j);
    zl4j.Zg(paramComponent);
  }
  
  private void ZZ(Component paramComponent, Zxnt paramZxnt, String paramString, boolean paramBoolean) {
    Zskh zskh = this.ZP.ZQ(Zeew.SCANNER);
    Zg40 zg40 = new Zg40(zskh);
    Zbj9 zbj9 = ZS(paramBoolean, paramZxnt, this.ZN, zg40);
    Zl4l zl4l = Zs(paramBoolean, paramString, zbj9);
    zbj9.Zy(zl4l);
    zl4l.Zg(paramComponent);
  }
  
  private void ZD(Component paramComponent, Ztvr paramZtvr, String paramString, boolean paramBoolean) {
    Zebs zebs = ZU(paramZtvr, paramBoolean);
    Zxgl zxgl = Zs(paramBoolean, paramString, zebs);
    zebs.Zh(zxgl);
    zxgl.Zg(paramComponent);
  }
  
  private Zl4l Zs(boolean paramBoolean, String paramString, Zbj9 paramZbj9) {
    Zgo8 zgo8 = new Zgo8(paramZbj9, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, paramBoolean, false);
    return new Zl4l(paramBoolean, paramString, this.ZO, paramZbj9, zgo8, this.Zi);
  }
  
  private Zxgl Zs(boolean paramBoolean, String paramString, Zebs paramZebs) {
    Zgo8 zgo8 = new Zgo8(paramZebs, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, paramBoolean, false);
    return new Zl46(paramString, paramZebs, zgo8);
  }
  
  private Zbj9 ZS(boolean paramBoolean, Zxnt paramZxnt, Zsy paramZsy, Zg1z paramZg1z) {
    String str = paramZsy.Z_(4);
    Zlje zlje = new Zlje(this.Zk.ZB(), Zx8e.Zr, str, paramZg1z);
    return new Zbj9(paramZxnt, this.ZT, this.Zo, this.ZM, new Zl66(zlje, this.Zk, str, this.ZY), this.ZO, this.Zk.ZB(), this.ZY, this.Zp, this.Zr.Zk(), paramBoolean);
  }
  
  private Zebs ZU(Ztvr paramZtvr, boolean paramBoolean) {
    return new Zebs(paramZtvr, this.ZT, this.Zo, this.ZM, this.ZO, this.Zk.ZB(), this.ZY, this.Zp, this.Zr.Zk(), paramBoolean);
  }
  
  private void ZD(Component paramComponent, Ztj1 paramZtj1, Ztr3 paramZtr3) {
    Zdt zdt = new Zdt(paramZtj1, paramZtr3, this.Zp, this.ZY, this.Za);
    boolean bool = false;
    Zk14 zk14 = new Zk14(zdt, this.ZM, this.Zr.Zk(), this.Z_, this.ZK, this.ZD, this.Zk.ZB(), this.Zp, this.Zo, this.ZO, this.ZY, Zrx_.CUSTOM, bool);
    Zgo8 zgo8 = new Zgo8(zk14, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, bool);
    Zl4f zl4f = new Zl4f(a(26662, -7521), zk14, zgo8, this.ZV, this.Zn, Zetl::ZSO);
    zk14.Zh(zl4f);
    zl4f.Zg(paramComponent);
  }
  
  private void Zo(Component paramComponent, Ztj1 paramZtj1, Ztr3 paramZtr3) {
    Zsmm zsmm = new Zsmm(paramZtj1, paramZtr3, this.Zp);
    boolean bool = false;
    Zt43 zt43 = new Zt43(zsmm, this.ZM, this.Zo, this.ZO, bool);
    Zgo8 zgo8 = new Zgo8(zt43, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, bool);
    Zl48 zl48 = new Zl48(a(26660, 9976), zt43, Zkd2::ZL, zgo8);
    zt43.Zl(zl48);
    zl48.Zg(paramComponent);
  }
  
  private void ZK(Component paramComponent, Ztj1 paramZtj1, Ze9i paramZe9i) {
    Ztif ztif = new Ztif(paramZtj1, paramZe9i, this.Zp, this.ZY, this.Za);
    boolean bool = false;
    Zk14 zk14 = new Zk14(ztif, this.ZM, this.Zr.Zk(), this.Z_, this.ZK, this.ZD, this.Zk.ZB(), this.Zp, this.Zo, this.ZO, this.ZY, Zrx_.CUSTOM, bool);
    Zgo8 zgo8 = new Zgo8(zk14, this.ZV, this.Zn, this.ZF, this.ZS, this.Zt, bool);
    Zl4f zl4f = new Zl4f(a(26669, 29296), zk14, zgo8, this.ZV, this.Zn, Zetl::ZSO);
    zk14.Zh(zl4f);
    zl4f.Zg(paramComponent);
  }
  
  public Ztj1 Zn(Ztvd paramZtvd, Zm0l paramZm0l, Zzys paramZzys, Zb_x paramZb_x, Zl2h paramZl2h, Zb2y paramZb2y, Zto9 paramZto9, Zskh paramZskh) {
    return this.Zp.Ze(paramZtvd, paramZm0l, paramZzys, paramZb_x, paramZl2h, paramZb2y, paramZto9, paramZskh);
  }
  
  private JMenuItem lambda$getScanLauncherMenuItems$0(Zzyl paramZzyl, Zmwa paramZmwa) {
    return paramZmwa.ZQ(this.ZZ, this.Zr, paramZzyl);
  }
  
  public static void ZE(int paramInt) {
    Zl = paramInt;
  }
  
  public static int ZV() {
    return Zl;
  }
  
  public static int Zd() {
    int i = ZV();
    return (i == 0) ? 109 : 0;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'T¿Qò×ð­ÅÇ:`ä÷]ÝS\\b\\fø.o¶­<TsQk×üàÖÛú§Uö63¸g$½Ö}d£PúÙØàá_Q*>ÀXy\\f\U$ÚÅ(¤êÅ¥\\b¢û\\f2ÁÏHÆ¦¨£S³k¿fS`¤H¡Ò1§¸Lã<&íÃE\\nbI®¸¤h3ÊWÄ¼ìuLro\\rèÁÆ=%ì«a9òÂ8#ÎÙ>½_×¾nîÐ¨\\f_ÃõVåj2%X¾0ÀÚA¿±,3xòy~ÂÂÜÿ4@¿O<}> *¸.lQjÊ>^?FþÚÅ>þ¹ÿ.²Ð=©ÙZ²h®'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #114
    //   20: bipush #18
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic ZE : (I)V
    //   28: bipush #43
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 147
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc '¤¯:L6/þ¸ð¼9¯ËónÂ,,àè\\r£Ý ñêÊK'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #31
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: iconst_4
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 87
    //   131: aload #5
    //   133: putstatic burp/Zbiv.a : [Ljava/lang/String;
    //   136: bipush #17
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zbiv.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #99
    //   218: goto -> 248
    //   221: bipush #103
    //   223: goto -> 248
    //   226: bipush #125
    //   228: goto -> 248
    //   231: bipush #59
    //   233: goto -> 248
    //   236: bipush #120
    //   238: goto -> 248
    //   241: bipush #46
    //   243: goto -> 248
    //   246: bipush #125
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x682F) & 0xFFFF;
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
      char c = '½';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbiv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */