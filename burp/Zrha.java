package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.function.Predicate;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import net.portswigger.Zlz;

class Zrha extends Zrh7 {
  final Zlk6 ZP;
  
  private final Predicate<String> Zx;
  
  private final String ZM;
  
  boolean ZJ;
  
  private Zbqc ZT;
  
  private Zm99 Zy;
  
  private Zbqc Zn;
  
  private Ze01 Zp;
  
  private Zzdy Zf;
  
  private Zzdy Zz;
  
  private Zzdy ZF;
  
  private Zzdy Zc;
  
  private Zzdy ZO;
  
  private Zzdy ZH;
  
  private Zm99 Zt;
  
  private Zm99 Zi;
  
  private ButtonGroup Zk;
  
  private Zm99 ZL;
  
  private Zm9v ZK;
  
  private Zm99 Zd;
  
  private Zbqc Zm;
  
  private Ze01 ZG;
  
  private Zmg2 ZX;
  
  private Zmg2 ZU;
  
  private Zmg2 ZV;
  
  private Zm99 ZE;
  
  private Zg85 Zl;
  
  private Zgfo ZD;
  
  private Zgfo Za;
  
  private Zgfo Zv;
  
  private Zg85 ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static Zrha ZH(Window paramWindow, Zlk6 paramZlk6, Predicate<String> paramPredicate) {
    return new Zrha(paramWindow, a(-30570, -6982), paramZlk6, paramPredicate);
  }
  
  static Zrha ZD(Window paramWindow, Zlk6 paramZlk6, Predicate<String> paramPredicate) {
    return new Zrha(paramWindow, a(-30591, -16182), paramZlk6, paramPredicate);
  }
  
  private Zrha(Window paramWindow, String paramString, Zlk6 paramZlk6, Predicate<String> paramPredicate) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_1
    //   3: getstatic burp/Zzv7.RESOURCE_POOL_DETAILS_DIALOG : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: aload_0
    //   10: aload_3
    //   11: putfield ZP : Lburp/Zlk6;
    //   14: invokestatic ZB : ()Z
    //   17: aload_0
    //   18: aload #4
    //   20: putfield Zx : Ljava/util/function/Predicate;
    //   23: aload_0
    //   24: aload_3
    //   25: invokevirtual Zv : ()Ljava/lang/String;
    //   28: putfield ZM : Ljava/lang/String;
    //   31: aload_3
    //   32: invokevirtual Z_ : ()Z
    //   35: istore #6
    //   37: istore #5
    //   39: aload_3
    //   40: invokevirtual Zq : ()I
    //   43: istore #7
    //   45: aload_3
    //   46: invokevirtual Zt : ()Z
    //   49: istore #8
    //   51: aload_3
    //   52: invokevirtual Za : ()I
    //   55: istore #9
    //   57: aload_3
    //   58: invokevirtual Zb : ()Z
    //   61: istore #10
    //   63: aload_3
    //   64: invokevirtual Zm : ()Z
    //   67: istore #11
    //   69: aload_3
    //   70: invokevirtual ZW : ()I
    //   73: istore #12
    //   75: aload_3
    //   76: invokevirtual ZK : ()Z
    //   79: istore #13
    //   81: aload_3
    //   82: invokevirtual ZQ : ()Z
    //   85: istore #14
    //   87: aload_3
    //   88: invokevirtual ZI : ()Z
    //   91: istore #15
    //   93: aload_3
    //   94: invokevirtual ZF : ()Z
    //   97: istore #16
    //   99: aload_3
    //   100: invokevirtual Zo : ()Ljava/util/List;
    //   103: astore #17
    //   105: aload_0
    //   106: invokevirtual ZX : ()V
    //   109: aload_0
    //   110: aload_2
    //   111: invokevirtual setTitle : (Ljava/lang/String;)V
    //   114: aload_0
    //   115: getfield Zv : Lburp/Zgfo;
    //   118: invokevirtual ZI : ()V
    //   121: aload_0
    //   122: getfield ZD : Lburp/Zgfo;
    //   125: invokevirtual ZI : ()V
    //   128: aload_0
    //   129: getfield Za : Lburp/Zgfo;
    //   132: invokevirtual ZI : ()V
    //   135: aload_0
    //   136: getfield ZS : Lburp/Zg85;
    //   139: aload_3
    //   140: invokevirtual Zv : ()Ljava/lang/String;
    //   143: invokevirtual setText : (Ljava/lang/String;)V
    //   146: aload_0
    //   147: getfield ZH : Lburp/Zzdy;
    //   150: iload #6
    //   152: invokevirtual setSelected : (Z)V
    //   155: iload #7
    //   157: ifle -> 169
    //   160: aload_0
    //   161: getfield Zv : Lburp/Zgfo;
    //   164: iload #7
    //   166: invokevirtual ZM : (I)V
    //   169: aload_0
    //   170: getfield ZO : Lburp/Zzdy;
    //   173: iload #8
    //   175: invokevirtual setSelected : (Z)V
    //   178: iload #9
    //   180: ifle -> 192
    //   183: aload_0
    //   184: getfield ZD : Lburp/Zgfo;
    //   187: iload #9
    //   189: invokevirtual ZM : (I)V
    //   192: aload_0
    //   193: iload #8
    //   195: invokevirtual Za : (Z)V
    //   198: iload #10
    //   200: ifeq -> 216
    //   203: aload_0
    //   204: getfield ZV : Lburp/Zmg2;
    //   207: iconst_1
    //   208: invokevirtual setSelected : (Z)V
    //   211: iload #5
    //   213: ifeq -> 242
    //   216: iload #11
    //   218: ifeq -> 234
    //   221: aload_0
    //   222: getfield ZU : Lburp/Zmg2;
    //   225: iconst_1
    //   226: invokevirtual setSelected : (Z)V
    //   229: iload #5
    //   231: ifeq -> 242
    //   234: aload_0
    //   235: getfield ZX : Lburp/Zmg2;
    //   238: iconst_1
    //   239: invokevirtual setSelected : (Z)V
    //   242: iload #12
    //   244: ifeq -> 256
    //   247: aload_0
    //   248: getfield Za : Lburp/Zgfo;
    //   251: iload #12
    //   253: invokevirtual ZM : (I)V
    //   256: aload_0
    //   257: getfield Zf : Lburp/Zzdy;
    //   260: iload #13
    //   262: invokevirtual setSelected : (Z)V
    //   265: aload_0
    //   266: getfield Zz : Lburp/Zzdy;
    //   269: iload #14
    //   271: invokevirtual setSelected : (Z)V
    //   274: aload_0
    //   275: getfield ZF : Lburp/Zzdy;
    //   278: iload #15
    //   280: invokevirtual setSelected : (Z)V
    //   283: aload_0
    //   284: getfield Zc : Lburp/Zzdy;
    //   287: iload #16
    //   289: invokevirtual setSelected : (Z)V
    //   292: aload_0
    //   293: getfield Zl : Lburp/Zg85;
    //   296: aload #17
    //   298: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   303: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   308: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   313: sipush #-30571
    //   316: sipush #-2979
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   325: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   330: checkcast java/lang/String
    //   333: invokevirtual setText : (Ljava/lang/String;)V
    //   336: aload_0
    //   337: getfield Zz : Lburp/Zzdy;
    //   340: iload #13
    //   342: invokevirtual setEnabled : (Z)V
    //   345: aload_0
    //   346: getfield ZF : Lburp/Zzdy;
    //   349: iload #13
    //   351: invokevirtual setEnabled : (Z)V
    //   354: aload_0
    //   355: getfield Zc : Lburp/Zzdy;
    //   358: iload #13
    //   360: invokevirtual setEnabled : (Z)V
    //   363: aload_0
    //   364: getfield Zl : Lburp/Zg85;
    //   367: iload #13
    //   369: ifeq -> 381
    //   372: iload #16
    //   374: ifeq -> 381
    //   377: iconst_1
    //   378: goto -> 382
    //   381: iconst_0
    //   382: invokevirtual setEnabled : (Z)V
    //   385: iconst_2
    //   386: anewarray burp/Zm99
    //   389: dup
    //   390: iconst_0
    //   391: aload_0
    //   392: getfield Zt : Lburp/Zm99;
    //   395: aastore
    //   396: dup
    //   397: iconst_1
    //   398: aload_0
    //   399: getfield Zi : Lburp/Zm99;
    //   402: aastore
    //   403: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   406: aload_0
    //   407: <illegal opcode> accept : (Lburp/Zrha;)Ljava/util/function/Consumer;
    //   412: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   417: aload_0
    //   418: bipush #55
    //   420: bipush #24
    //   422: invokestatic Zf : (Ljava/awt/Component;II)V
    //   425: aload_0
    //   426: invokevirtual pack : ()V
    //   429: aload_0
    //   430: aload_1
    //   431: invokestatic Zy : (Ljava/awt/Window;Ljava/awt/Window;)V
    //   434: aload_0
    //   435: iconst_1
    //   436: invokevirtual setVisible : (Z)V
    //   439: return
  }
  
  private void ZS() {
    boolean bool = Zlfb.ZN();
    if (Zb()) {
      this.ZK.setText(Zkyg.NAME_ALREADY_USED.Zz());
      return;
    } 
    if (this.Zf.isSelected() && this.Zc.isSelected() && !Zk()) {
      this.ZK.setText(Zkyg.AUTO_BACKOFF_INVALID_CUSTOM_STATUS_CODES.Zz());
      return;
    } 
    Zlk6 zlk6 = new Zlk6(this.ZP);
    ZC(zlk6);
    Zm_3 zm_3 = zlk6.ZP();
    if (!zm_3.Zx()) {
      this.ZK.setText(zm_3.ZK());
      if (!bool) {
        ZC(this.ZP);
        this.ZJ = true;
        Zp();
        return;
      } 
      return;
    } 
    ZC(this.ZP);
    this.ZJ = true;
    Zp();
  }
  
  private boolean Zb() {
    String str = this.ZS.getText().trim();
    return (this.ZM == null || !this.ZM.equals(str)) ? this.Zx.test(str) : false;
  }
  
  private boolean Zk() {
    String str = this.Zl.getText();
    return (Zlz.ZX(str) || Zzk7.Zd.matcher(str).matches());
  }
  
  private void Za(boolean paramBoolean) {
    this.ZV.setEnabled(paramBoolean);
    this.ZX.setEnabled(paramBoolean);
    this.ZU.setEnabled(paramBoolean);
    this.Za.setEnabled(paramBoolean);
  }
  
  private void ZC(Zlk6 paramZlk6) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZS : Lburp/Zg85;
    //   9: invokevirtual getText : ()Ljava/lang/String;
    //   12: invokevirtual trim : ()Ljava/lang/String;
    //   15: invokevirtual Zs : (Ljava/lang/String;)Lburp/Zlk6;
    //   18: pop
    //   19: aload_0
    //   20: getfield ZH : Lburp/Zzdy;
    //   23: invokevirtual isSelected : ()Z
    //   26: ifeq -> 49
    //   29: aload_1
    //   30: iconst_1
    //   31: invokevirtual Zq : (Z)Lburp/Zlk6;
    //   34: aload_0
    //   35: getfield Zv : Lburp/Zgfo;
    //   38: invokevirtual ZE : ()I
    //   41: invokevirtual ZA : (I)Lburp/Zlk6;
    //   44: pop
    //   45: iload_2
    //   46: ifne -> 59
    //   49: aload_1
    //   50: iconst_0
    //   51: invokevirtual Zq : (Z)Lburp/Zlk6;
    //   54: iconst_0
    //   55: invokevirtual ZA : (I)Lburp/Zlk6;
    //   58: pop
    //   59: aload_1
    //   60: aload_0
    //   61: getfield Zf : Lburp/Zzdy;
    //   64: invokevirtual isSelected : ()Z
    //   67: invokevirtual Zw : (Z)Lburp/Zlk6;
    //   70: pop
    //   71: aload_1
    //   72: aload_0
    //   73: getfield Zz : Lburp/Zzdy;
    //   76: invokevirtual isSelected : ()Z
    //   79: invokevirtual ZA : (Z)Lburp/Zlk6;
    //   82: pop
    //   83: aload_1
    //   84: aload_0
    //   85: getfield ZF : Lburp/Zzdy;
    //   88: invokevirtual isSelected : ()Z
    //   91: invokevirtual Zt : (Z)Lburp/Zlk6;
    //   94: pop
    //   95: aload_1
    //   96: aload_0
    //   97: getfield Zc : Lburp/Zzdy;
    //   100: invokevirtual isSelected : ()Z
    //   103: invokevirtual Zs : (Z)Lburp/Zlk6;
    //   106: pop
    //   107: aload_0
    //   108: getfield Zl : Lburp/Zg85;
    //   111: invokevirtual getText : ()Ljava/lang/String;
    //   114: astore_3
    //   115: aload_0
    //   116: invokevirtual Zk : ()Z
    //   119: ifeq -> 178
    //   122: aload_3
    //   123: invokestatic Zu : (Ljava/lang/String;)Z
    //   126: ifeq -> 178
    //   129: aload_1
    //   130: aload_3
    //   131: ldc ','
    //   133: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   136: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   139: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   144: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   149: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   154: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   159: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   164: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   169: invokeinterface toList : ()Ljava/util/List;
    //   174: invokevirtual ZN : (Ljava/util/List;)Lburp/Zlk6;
    //   177: pop
    //   178: aload_0
    //   179: getfield ZO : Lburp/Zzdy;
    //   182: invokevirtual isSelected : ()Z
    //   185: ifeq -> 286
    //   188: aload_1
    //   189: iconst_1
    //   190: invokevirtual ZI : (Z)Lburp/Zlk6;
    //   193: aload_0
    //   194: getfield ZD : Lburp/Zgfo;
    //   197: invokevirtual ZE : ()I
    //   200: invokevirtual Zj : (I)Lburp/Zlk6;
    //   203: pop
    //   204: aload_0
    //   205: getfield ZX : Lburp/Zmg2;
    //   208: invokevirtual isSelected : ()Z
    //   211: ifeq -> 228
    //   214: aload_1
    //   215: iconst_0
    //   216: invokevirtual ZU : (Z)Lburp/Zlk6;
    //   219: iconst_0
    //   220: invokevirtual ZM : (Z)Lburp/Zlk6;
    //   223: pop
    //   224: iload_2
    //   225: ifne -> 308
    //   228: aload_0
    //   229: getfield ZV : Lburp/Zmg2;
    //   232: invokevirtual isSelected : ()Z
    //   235: ifeq -> 252
    //   238: aload_1
    //   239: iconst_1
    //   240: invokevirtual ZU : (Z)Lburp/Zlk6;
    //   243: iconst_0
    //   244: invokevirtual ZM : (Z)Lburp/Zlk6;
    //   247: pop
    //   248: iload_2
    //   249: ifne -> 308
    //   252: aload_0
    //   253: getfield ZU : Lburp/Zmg2;
    //   256: invokevirtual isSelected : ()Z
    //   259: ifeq -> 308
    //   262: aload_1
    //   263: iconst_0
    //   264: invokevirtual ZU : (Z)Lburp/Zlk6;
    //   267: iconst_1
    //   268: invokevirtual ZM : (Z)Lburp/Zlk6;
    //   271: aload_0
    //   272: getfield Za : Lburp/Zgfo;
    //   275: invokevirtual ZE : ()I
    //   278: invokevirtual Zr : (I)Lburp/Zlk6;
    //   281: pop
    //   282: iload_2
    //   283: ifne -> 308
    //   286: aload_1
    //   287: iconst_0
    //   288: invokevirtual ZI : (Z)Lburp/Zlk6;
    //   291: iconst_0
    //   292: invokevirtual Zj : (I)Lburp/Zlk6;
    //   295: iconst_0
    //   296: invokevirtual ZU : (Z)Lburp/Zlk6;
    //   299: iconst_0
    //   300: invokevirtual ZM : (Z)Lburp/Zlk6;
    //   303: iconst_0
    //   304: invokevirtual Zr : (I)Lburp/Zlk6;
    //   307: pop
    //   308: return
  }
  
  private void Zp() {
    dispose();
  }
  
  private void ZX() {
    this.Zk = new ButtonGroup();
    this.Zm = new Zbqc();
    this.Zy = new Zm99();
    this.ZS = new Zg85();
    this.ZH = new Zzdy();
    this.Zv = new Zgfo();
    this.ZO = new Zzdy();
    this.ZD = new Zgfo();
    this.Zd = new Zm99();
    this.ZE = new Zm99();
    this.ZX = new Zmg2();
    this.ZV = new Zmg2();
    this.ZU = new Zmg2();
    this.Za = new Zgfo();
    this.ZL = new Zm99();
    this.ZK = new Zm9v();
    this.Zn = new Zbqc();
    this.ZG = new Ze01();
    this.Zp = new Ze01();
    this.Zf = new Zzdy();
    this.Zz = new Zzdy();
    this.ZF = new Zzdy();
    this.ZT = new Zbqc();
    this.Zc = new Zzdy();
    this.Zt = new Zm99();
    this.Zi = new Zm99();
    this.Zl = new Zg85();
    setDefaultCloseOperation(2);
    setMinimumSize(new Dimension(478, 380));
    setModal(true);
    setPreferredSize(new Dimension(478, 380));
    this.Zm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5 };
    this.Zm.setLayout(gridBagLayout);
    this.Zy.setText(a(-30561, 20515));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Zm.add(this.Zy, gridBagConstraints);
    this.ZS.setColumns(25);
    this.ZS.setName(a(-30575, 1973));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.Zm.add(this.ZS, gridBagConstraints);
    this.ZH.setText(a(-30566, 141));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.ZH, gridBagConstraints);
    this.Zv.setColumns(4);
    this.Zv.setName(a(-30589, -26783));
    this.Zv.addKeyListener(new Zzws(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.Zv, gridBagConstraints);
    this.ZO.setText(a(-30585, 12485));
    this.ZO.addActionListener(new Zsxy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.ZO, gridBagConstraints);
    this.ZD.setColumns(4);
    this.ZD.addKeyListener(new Zln8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    this.Zm.add(this.ZD, gridBagConstraints);
    this.Zd.setText(a(-30562, -3145));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.Zd, gridBagConstraints);
    this.ZE.setText(a(-30590, 24489));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    this.Zm.add(this.ZE, gridBagConstraints);
    this.Zk.add(this.ZX);
    this.ZX.setText(a(-30573, 6478));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.Zm.add(this.ZX, gridBagConstraints);
    this.Zk.add(this.ZV);
    this.ZV.setText(a(-30565, 26357));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.Zm.add(this.ZV, gridBagConstraints);
    this.Zk.add(this.ZU);
    this.ZU.setText(a(-30574, -30144));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.Zm.add(this.ZU, gridBagConstraints);
    this.Za.setColumns(4);
    this.Za.addKeyListener(new Zs4d(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 10;
    this.Zm.add(this.Za, gridBagConstraints);
    this.ZL.setText(a(-30576, 11049));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.ZL, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 25;
    this.Zm.add(this.ZK, gridBagConstraints);
    this.Zn.setLayout(new GridLayout(1, 0, 5, 0));
    this.ZG.setText(a(-30569, 15568));
    this.ZG.addActionListener(new Zlux(this));
    this.Zn.add(this.ZG);
    this.Zp.setText(a(-30564, 32219));
    this.Zp.addActionListener(new Zlky(this));
    this.Zn.add(this.Zp);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 26;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zm.add(this.Zn, gridBagConstraints);
    this.Zf.setText(a(-30592, -10675));
    this.Zf.addActionListener(new Zzxo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    this.Zm.add(this.Zf, gridBagConstraints);
    this.Zz.setSelected(true);
    this.Zz.setText(a(-30568, -13941));
    this.Zz.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.Zm.add(this.Zz, gridBagConstraints);
    this.ZF.setText(a(-30563, -24522));
    this.ZF.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.Zm.add(this.ZF, gridBagConstraints);
    this.ZT.setLayout(new GridBagLayout());
    this.Zc.addActionListener(new Zlsj(this));
    this.ZT.add(this.Zc, new GridBagConstraints());
    this.Zt.setHorizontalAlignment(2);
    this.Zt.setText(a(-30586, 5296));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(1, 2, 0, 0);
    this.ZT.add(this.Zt, gridBagConstraints);
    this.Zi.setText(a(-30572, -10041));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(1, 2, 0, 0);
    this.ZT.add(this.Zi, gridBagConstraints);
    this.Zl.setColumns(20);
    this.Zl.setEnabled(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(2, 0, 0, 0);
    this.ZT.add(this.Zl, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 21;
    this.Zm.add(this.ZT, gridBagConstraints);
    getContentPane().add(this.Zm, a(-30567, -29454));
    pack();
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    ZS();
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    Zp();
  }
  
  private void Zq(KeyEvent paramKeyEvent) {
    this.ZH.setSelected(true);
  }
  
  private void Zt(KeyEvent paramKeyEvent) {
    this.ZO.setSelected(true);
    Za(true);
  }
  
  private void ZM(KeyEvent paramKeyEvent) {
    this.ZU.setSelected(true);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    Za(this.ZO.isSelected());
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    boolean bool = this.Zf.isSelected();
    this.Zz.setEnabled(bool);
    this.ZF.setEnabled(bool);
    this.Zc.setEnabled(bool);
    this.Zt.setEnabled(bool);
    this.Zi.setEnabled(bool);
    this.Zl.setEnabled((bool && this.Zc.isSelected()));
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    this.Zl.setEnabled(this.Zc.isSelected());
  }
  
  private void lambda$new$0(Zm99 paramZm99) {
    paramZm99.addMouseListener(new Zs6z(this));
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'A©<­v\\n«ëù;GéÀþC­rÜÆÑR\\t÷Å\\f!äÉæøÓ.Pæ(%ClPV_Þ#6ÚøÚêdhuß`DeË?½´ªù <e½¦o=ôJÔ¢eïÑV¹v1Hñ^¹§((âØþÑ $¿b[ª`JÆG52à<ÜZLªaÈ¯¤õ0­|Íkwtÿö»Þ\ªæwl¥ô\\f DRÕù¬ÊC`G°+Ð¥tË$\\fâ»N\\r÷ÍP&e¤]¥(ÊdôgôÑc6-O¡®\\rhµÅ[HwcoÒë¾¸Þf;s-üã?OéÍh4Õ²×CWVAá}@«¨JèUlÏÂH1\\t^ïüøþÂ%¾í{+K!kNZØÙ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #31
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc 'ºYE2&Ö%Ìa¬äÁÝÊøÖ,rY'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #113
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
    //   128: putstatic burp/Zrha.a : [Ljava/lang/String;
    //   131: bipush #22
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zrha.b : [Ljava/lang/String;
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
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #73
    //   219: goto -> 244
    //   222: bipush #81
    //   224: goto -> 244
    //   227: bipush #56
    //   229: goto -> 244
    //   232: bipush #12
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #80
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8892) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrha.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */