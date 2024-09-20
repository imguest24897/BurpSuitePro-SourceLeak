package burp;

import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zl0;

abstract class Zbm5 extends Zbv5 implements Zedf {
  private static final List<Zz9z> ZT;
  
  protected final Zt0_<byte[]> ZN;
  
  protected final Zbws ZU;
  
  protected final Zb0h ZR;
  
  protected final Zl0 Za;
  
  protected final Zt4u Zf;
  
  protected final Zr_4 ZX;
  
  protected final Zbkk ZI;
  
  protected final Zm99 Zu;
  
  protected final Zmyw ZB;
  
  protected final ButtonGroup ZF;
  
  protected final Zzdy Zi;
  
  protected final Zzdy Zz;
  
  protected final Zzdy ZC;
  
  protected final Ze01 Zn;
  
  protected final Ze01 Zv;
  
  protected final Ze01 Zk;
  
  protected final Ze01 Zj;
  
  protected final Ze01 ZL;
  
  protected final Zl8w Z_;
  
  protected final Zbkc ZG;
  
  protected final Zmg2 Zc;
  
  protected final Zmg2 ZK;
  
  protected final Zbup ZW;
  
  protected final Zgff ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbm5(Zb0h paramZb0h, Zl0 paramZl0, Zt4u paramZt4u, Zr_4 paramZr_4) {
    this.ZR = paramZb0h;
    this.Za = paramZl0;
    this.Zf = paramZt4u;
    this.ZX = paramZr_4;
    this.ZN = (Zt0_)new Zt0_<>();
    this.ZU = new Zbws(this.ZN);
    this.ZF = new ButtonGroup();
    this.Zn = new Ze01();
    this.ZJ = new Zgff();
    this.Zk = new Ze01();
    this.ZL = new Ze01();
    this.Zv = new Ze01();
    this.Zi = new Zzdy();
    this.ZC = new Zzdy();
    this.Zz = new Zzdy();
    this.ZK = new Zmg2();
    this.Zc = new Zmg2();
    this.Zj = new Ze01();
    this.ZB = new Zmyw();
    this.ZW = new Zbup();
    this.Z_ = new Zl8w();
    this.ZG = new Zbkc();
    this.Zu = new Zm99();
    int[] arrayOfInt = Zes0.ZA();
    this.ZI = new Zbkk();
    this.ZI.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_OPTIONS_GREP_MATCH, this, a(-7661, 16239));
    this.ZW.setViewportView(this.ZU);
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  protected Zl8c[] Zd(boolean paramBoolean, Zr_4 paramZr_4) {
    List<byte> list = this.ZN.ZL();
    Zl8c[] arrayOfZl8c = new Zl8c[list.size()];
    byte b = 0;
    int[] arrayOfInt = Zes0.ZA();
    while (b < list.size()) {
      byte[] arrayOfByte = (byte[])list.get(b);
      arrayOfZl8c[b] = paramBoolean ? paramZr_4.<Zl8c>ZH(new Zz46(Zkb.ZG(arrayOfByte))) : paramZr_4.<Zl8c>ZH(new Zms3(arrayOfByte));
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return arrayOfZl8c;
  }
  
  protected void ZZ(Zl8c[] paramArrayOfZl8c) {
    int[] arrayOfInt = Zes0.ZA();
    ArrayList<byte[]> arrayList = new ArrayList();
    if (paramArrayOfZl8c != null) {
      Zl8c[] arrayOfZl8c = paramArrayOfZl8c;
      int i = arrayOfZl8c.length;
      byte b = 0;
      while (b < i) {
        Zl8c zl8c = arrayOfZl8c[b];
        arrayList.add(zl8c.ZNb());
        b++;
        if (arrayOfInt == null)
          break; 
      } 
    } 
    this.ZN.ZS();
    this.ZN.Za(arrayList);
  }
  
  protected void ZF(boolean paramBoolean) {
    int[] arrayOfInt = Zes0.ZA();
    if (paramBoolean) {
      this.Zc.setSelected(true);
      if (arrayOfInt == null) {
        this.ZK.setSelected(true);
        return;
      } 
      return;
    } 
    this.ZK.setSelected(true);
  }
  
  public void Zr(Zsh8 paramZsh8) {
    if (paramZsh8.ZP_() == null)
      return; 
    this.Zi.setSelected(paramZsh8.ZP_().Zvz());
    this.ZC.setSelected(paramZsh8.ZP_().Zvd());
    this.Zz.setSelected(paramZsh8.ZP_().Zvg());
    ZF(paramZsh8.ZP_().Zvc());
    ZZ(paramZsh8.ZP_().Zvb());
  }
  
  public void ZX(Zsh8 paramZsh8) {
    Zz4g zz4g = paramZsh8.ZP_();
    if (zz4g == null)
      zz4g = this.ZX.<Zz4g>ZH(new Zrrq()); 
    zz4g.ZVW(this.Zi.isSelected());
    zz4g.ZVm(this.ZC.isSelected());
    zz4g.ZV_(this.Zz.isSelected());
    zz4g.ZVC(this.Zc.isSelected());
    zz4g.Zz(Zd(zz4g.Zvc(), this.ZX));
    paramZsh8.ZK(zz4g);
  }
  
  public void ZNH() {
    this.Zi.setSelected(false);
    this.ZC.setSelected(false);
    this.Zz.setSelected(true);
    ZF(false);
    ZE();
  }
  
  public void ZP(Zb_j paramZb_j) {
    int[] arrayOfInt = Zes0.ZA();
    paramZb_j.ZR(Zeew.INTRUDER, a(-7621, -7620), this.Zi.isSelected() ? a(-7660, -3768) : a(-7671, -6414));
    paramZb_j.ZR(Zeew.INTRUDER, a(-7648, -5476), this.ZC.isSelected() ? a(-7669, -20589) : a(-7623, -10851));
    paramZb_j.ZR(Zeew.INTRUDER, a(-7663, 28969), this.Zz.isSelected() ? a(-7669, -20589) : a(-7623, -10851));
    paramZb_j.ZR(Zeew.INTRUDER, a(-7638, 11882), this.ZK.isSelected() ? a(-7669, -20589) : a(-7623, -10851));
    List<byte> list = this.ZN.ZL();
    int i = 0;
    while (i < list.size()) {
      paramZb_j.ZR(Zeew.INTRUDER, a(-7618, -28361) + a(-7618, -28361), Zkb.ZG((byte[])list.get(i)));
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    i = list.size();
    while (paramZb_j.Za(Zeew.INTRUDER, a(-7625, 26328) + a(-7625, 26328))) {
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    if (list.isEmpty())
      paramZb_j.ZR(Zeew.INTRUDER, a(-7673, -9340), a(-7649, 29406)); 
  }
  
  public void Zs(Zb_j paramZb_j) {
    // Byte code:
    //   0: invokestatic ZA : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   8: sipush #-7664
    //   11: sipush #27346
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnonnull -> 39
    //   27: aload_0
    //   28: getfield Zi : Lburp/Zzdy;
    //   31: iconst_0
    //   32: invokevirtual setSelected : (Z)V
    //   35: aload_2
    //   36: ifnonnull -> 59
    //   39: aload_0
    //   40: getfield Zi : Lburp/Zzdy;
    //   43: aload_3
    //   44: sipush #-7669
    //   47: sipush #-20589
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: invokevirtual setSelected : (Z)V
    //   59: aload_1
    //   60: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   63: sipush #-7628
    //   66: sipush #22707
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   77: astore_3
    //   78: aload_3
    //   79: ifnonnull -> 94
    //   82: aload_0
    //   83: getfield ZC : Lburp/Zzdy;
    //   86: iconst_0
    //   87: invokevirtual setSelected : (Z)V
    //   90: aload_2
    //   91: ifnonnull -> 114
    //   94: aload_0
    //   95: getfield ZC : Lburp/Zzdy;
    //   98: aload_3
    //   99: sipush #-7669
    //   102: sipush #-20589
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: invokevirtual equals : (Ljava/lang/Object;)Z
    //   111: invokevirtual setSelected : (Z)V
    //   114: aload_1
    //   115: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   118: sipush #-7644
    //   121: sipush #11040
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   132: astore_3
    //   133: aload_3
    //   134: ifnonnull -> 149
    //   137: aload_0
    //   138: getfield Zz : Lburp/Zzdy;
    //   141: iconst_1
    //   142: invokevirtual setSelected : (Z)V
    //   145: aload_2
    //   146: ifnonnull -> 169
    //   149: aload_0
    //   150: getfield Zz : Lburp/Zzdy;
    //   153: aload_3
    //   154: sipush #-7669
    //   157: sipush #-20589
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual equals : (Ljava/lang/Object;)Z
    //   166: invokevirtual setSelected : (Z)V
    //   169: aload_1
    //   170: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   173: sipush #-7655
    //   176: sipush #13399
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   187: astore_3
    //   188: aload_3
    //   189: ifnull -> 212
    //   192: aload_3
    //   193: sipush #-7669
    //   196: sipush #-20589
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   205: ifne -> 212
    //   208: iconst_1
    //   209: goto -> 213
    //   212: iconst_0
    //   213: istore #4
    //   215: aload_0
    //   216: iload #4
    //   218: invokevirtual ZF : (Z)V
    //   221: aload_0
    //   222: getfield ZN : Lburp/Zt0_;
    //   225: invokevirtual ZL : ()Ljava/util/List;
    //   228: invokeinterface clear : ()V
    //   233: aload_1
    //   234: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   237: sipush #-7643
    //   240: sipush #31485
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   251: astore #5
    //   253: aload #5
    //   255: ifnonnull -> 266
    //   258: aload_0
    //   259: invokevirtual ZE : ()V
    //   262: aload_2
    //   263: ifnonnull -> 337
    //   266: sipush #-7645
    //   269: sipush #31856
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: aload #5
    //   277: invokevirtual equals : (Ljava/lang/Object;)Z
    //   280: ifne -> 337
    //   283: iconst_0
    //   284: istore #6
    //   286: aload_1
    //   287: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   290: iload #6
    //   292: sipush #-7625
    //   295: sipush #26328
    //   298: invokestatic a : (II)Ljava/lang/String;
    //   301: swap
    //   302: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   307: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   312: dup
    //   313: astore #7
    //   315: ifnull -> 337
    //   318: aload_0
    //   319: getfield ZN : Lburp/Zt0_;
    //   322: aload #7
    //   324: invokestatic Zy : (Ljava/lang/String;)[B
    //   327: invokevirtual Zr : (Ljava/lang/Object;)V
    //   330: iinc #6, 1
    //   333: aload_2
    //   334: ifnonnull -> 286
    //   337: aload_0
    //   338: getfield ZN : Lburp/Zt0_;
    //   341: invokevirtual fireTableDataChanged : ()V
    //   344: invokestatic Zwu : ()[Lburp/Zbqc;
    //   347: ifnonnull -> 356
    //   350: iconst_5
    //   351: newarray int
    //   353: invokestatic ZI : ([I)V
    //   356: return
  }
  
  protected void ZY(int paramInt1, int paramInt2) {
    if (paramInt1 >= paramInt2)
      return; 
    this.ZN.Zq(paramInt1);
  }
  
  protected List<byte[]> Zk() {
    int[] arrayOfInt = Zes0.ZA();
    try {
      String str = this.ZR.Zp();
      if (str == null)
        return null; 
      ArrayList<byte[]> arrayList = new ArrayList();
      BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
      try {
        String str1;
        while ((str1 = bufferedReader.readLine()) != null) {
          arrayList.add(Zkb.Zy(str1));
          if (arrayOfInt == null)
            break; 
        } 
        bufferedReader.close();
      } catch (Throwable throwable) {
        try {
          bufferedReader.close();
        } catch (Throwable throwable1) {
          throwable.addSuppressed(throwable1);
        } 
        throw throwable;
      } 
      this.ZN.Za(arrayList);
      this.Zi.setSelected(true);
      return (List<byte[]>)arrayList;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return (List)Collections.emptyList();
    } 
  }
  
  protected void ZQ() {
    if (ZH())
      Zy(); 
  }
  
  protected List<byte[]> Zw() {
    File file = Zs6n.ZP(Zg1m.CONFIG, this.Zf, this, 0);
    try {
      if (file == null)
        return (List)Collections.emptyList(); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      List<byte[]> list = Zs6n.Zu(file);
      this.ZN.Za(list);
      this.Zi.setSelected(true);
      return list;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return (List)Collections.emptyList();
    } 
  }
  
  protected boolean[] ZN() {
    int[] arrayOfInt2 = this.ZU.getSelectedRows();
    int i = this.ZN.getRowCount();
    boolean[] arrayOfBoolean = new boolean[i];
    int[] arrayOfInt1 = Zes0.ZA();
    int j = arrayOfInt2.length - 1;
    while (j >= 0) {
      int k = arrayOfInt2[j];
      ZY(k, i);
      arrayOfBoolean[k] = true;
      j--;
      if (arrayOfInt1 == null)
        break; 
    } 
    return arrayOfBoolean;
  }
  
  private boolean ZH() {
    int i = this.ZN.getRowCount();
    return (i == 0) ? false : Zx6o.ZY(this, a(-7646, 23604));
  }
  
  protected void Zy() {
    this.ZN.ZS();
  }
  
  protected byte[] ZJ() {
    byte[] arrayOfByte = Zkb.Zy(this.ZJ.getText());
    this.ZN.Zr(arrayOfByte);
    this.Zi.setSelected(true);
    return arrayOfByte;
  }
  
  protected void Za() {
    Function<byte[], byte[]> function = ZJ(this.Zc.isSelected());
    List<byte> list = (List)this.ZN.ZL().stream().<byte[]>map((Function)function).collect(Collectors.toList());
    this.ZN.ZM(list);
  }
  
  protected void ZC() {
    Za();
  }
  
  protected void ZB() {
    Za();
  }
  
  private Function<byte[], byte[]> ZJ(boolean paramBoolean) {
    // Byte code:
    //   0: iload_1
    //   1: ifeq -> 12
    //   4: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   9: goto -> 17
    //   12: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   17: astore_2
    //   18: iload_1
    //   19: ifeq -> 30
    //   22: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   27: goto -> 35
    //   30: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   35: astore_3
    //   36: aload_0
    //   37: aload_2
    //   38: aload_3
    //   39: <illegal opcode> apply : (Lburp/Zbm5;Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;
    //   44: areturn
  }
  
  private byte[] Zm(Function<Zz9z, String> paramFunction1, Function<Zz9z, String> paramFunction2, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic burp/Zbm5.ZT : Ljava/util/List;
    //   3: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   8: aload_1
    //   9: aload_3
    //   10: <illegal opcode> test : (Ljava/util/function/Function;[B)Ljava/util/function/Predicate;
    //   15: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   20: invokeinterface findFirst : ()Ljava/util/Optional;
    //   25: astore #4
    //   27: aload #4
    //   29: aload_2
    //   30: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   33: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   38: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   41: aload_3
    //   42: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   45: checkcast [B
    //   48: areturn
  }
  
  private void ZE() {
    this.ZN.ZS();
    Objects.requireNonNull(this.ZN);
    ZT.stream().map(this::ZN).forEach(this.ZN::Zr);
    this.ZN.fireTableDataChanged();
  }
  
  private byte[] ZN(Zz9z paramZz9z) {
    String str = this.Zc.isSelected() ? paramZz9z.Za() : paramZz9z.Zl();
    return Zkb.Zy(str);
  }
  
  private static List<Zz9z> ZM() {
    return List.of(new Zz9z[] { 
          new Zz9z(a(-7680, 9598), a(-7657, -2880)), new Zz9z(a(-7619, -27190), a(-7662, 5005)), new Zz9z(a(-7650, -31294), a(-7679, 23706)), new Zz9z(a(-7652, -20894), a(-7617, -13567)), new Zz9z(a(-7629, -14779), a(-7635, 17592)), new Zz9z(a(-7651, -1933), a(-7620, 5364)), new Zz9z(a(-7637, -9152), a(-7627, 16323)), new Zz9z(a(-7622, 2074), a(-7641, -10674)), new Zz9z(a(-7626, 20935), a(-7672, 15156)), new Zz9z(a(-7631, 10847), a(-7640, 29983)), 
          new Zz9z(a(-7656, -14163), a(-7653, 24650)), new Zz9z(a(-7632, 6002), a(-7659, 12177)), new Zz9z(a(-7658, -12149), a(-7624, -18595)), new Zz9z(a(-7630, 28529), a(-7634, 17096)), new Zz9z(a(-7654, -18935), a(-7675, -16857)), new Zz9z(a(-7633, 1601), a(-7674, 10790)), new Zz9z(a(-7678, 32563), a(-7647, 25762)), new Zz9z(a(-7677, 25867), a(-7670, -1832)), new Zz9z(a(-7639, -21336), a(-7642, -74)), new Zz9z(a(-7676, 3254), a(-7636, -14605)) });
  }
  
  private static boolean lambda$convertFormIfDefaultExpression$1(Function<Zz9z, String> paramFunction, byte[] paramArrayOfbyte, Zz9z paramZz9z) {
    return Arrays.equals(Zkb.Zy(paramFunction.apply(paramZz9z)), paramArrayOfbyte);
  }
  
  private byte[] lambda$grepMatchItemTransformer$0(Function<Zz9z, String> paramFunction1, Function<Zz9z, String> paramFunction2, byte[] paramArrayOfbyte) {
    return Zm(paramFunction1, paramFunction2, paramArrayOfbyte);
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'SUj ÷BkødÅtÐû\\t=þvâDébð@ÄÄIæüW¨sCîÔ¹Iµ¢¨VPçìo1`M ¶|÷pw±ú\\tÎæwÛD^\\fyÿútAÌk@é~pzVÖì°Ó¯ QjÿÆáÁÂÔÞÍ2ú½ñ\ý\\tV#&¯Í$(¤9©Q:\Ü<b×±a­­åò¦ë4°Óÿj÷Þ¦ï\\ty^ï2]ùíÝpÅÛ3e$ïÐ$Lûû>¬Øí:Bèçtv±öÂ¶mi"Z\\ta;j¬x°*»¯\\t ª p-î/«÷.¾ä¥d1ÈV\ÀõÍ5§ä·Û-ýò}\\nNÝ0Dð3µý°Þ¹$]N°\\fqe¿É;\\t¬`U³bØÒ6«!uñã&>B÷Úä·AÉx«#|¾\\tvö®7³-4r\\n*e;yìvÊ5i dY\\b5Cåú¾¯.P;ìH¨W¡xï©!{ó4\\nýôÍf<÷vwW·oE§É|ÂmÀØ²Á"øöo|Th;Åâ"Ïì»ÞåöJEOÉèüFÌÛÖ±ÿO~­-Ê:õ\\t#¤j4Ô8§o\\fÔLÈYqè,ò±¤bn´¼®c½YëïÒ¨\\bupYÃÌm+ýµAÈý¡wÃþþEoÁ>_éøÆè,j5ï'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #58
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'hM2@ÖM'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #43
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbm5.a : [Ljava/lang/String;
    //   131: bipush #60
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbm5.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #60
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #98
    //   234: goto -> 244
    //   237: bipush #103
    //   239: goto -> 244
    //   242: bipush #100
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: invokestatic ZM : ()Ljava/util/List;
    //   303: putstatic burp/Zbm5.ZT : Ljava/util/List;
    //   306: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE232) & 0xFFFF;
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
      byte b1 = 13;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */