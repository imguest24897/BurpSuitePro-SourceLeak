package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import net.portswigger.Zm2;

public class Zbyq extends Zbqc implements Zedo, Zspz, Zm3g {
  private final Zta4 ZZ;
  
  private final Zm6v ZG;
  
  private final boolean ZT;
  
  private final TitledBorder Zo;
  
  private final TitledBorder Za;
  
  private final TitledBorder Zs;
  
  private final TitledBorder ZY;
  
  private final TitledBorder Zm;
  
  private final TitledBorder ZQ;
  
  private final TitledBorder Zi;
  
  private final Zbqc ZNr;
  
  private final Zbup ZJ;
  
  private final Map<Zeew, Zzdy> ZS;
  
  private Zb07 ZB;
  
  private boolean Z_;
  
  private boolean Zj;
  
  private Zzdy ZNO;
  
  private Zzdy Zc;
  
  private Zzdy Zd;
  
  private Zzdy ZO;
  
  private Zzdy Zk;
  
  private Zzdy Zg;
  
  private Zzdy ZL;
  
  private Zzdy Zb;
  
  private Zzdy ZP;
  
  private Zzdy ZA;
  
  private Zzdy Zw;
  
  private Zzdy Zv;
  
  private Zzdy ZH;
  
  private Zzdy ZV;
  
  private Zzdy ZE;
  
  private Zzdy Zq;
  
  private Zzdy Zn;
  
  private Zzdy Zr;
  
  private Zzdy ZF;
  
  private Zzdy Zy;
  
  private Zzdy Zf;
  
  private Zzdy ZK;
  
  private Box.Filler ZU;
  
  private Zbqc ZN;
  
  private Zbqc ZR;
  
  private Zm9v Zx;
  
  private Zbqc Zz;
  
  private Zbqc ZC;
  
  private Zbqc ZD;
  
  private Zbqc Zt;
  
  private Zbqc ZM;
  
  private Zbqc ZW;
  
  private Zbqc ZX;
  
  private Zg85 ZI;
  
  private Zg85 Zh;
  
  private Zg85 Zu;
  
  private static String[] Zl;
  
  private static final String[] a;
  
  private static final String[] c;
  
  public Zbyq(Zta4 paramZta4, Zm6v paramZm6v, boolean paramBoolean, Zbqa paramZbqa, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zbk : ()[Ljava/lang/String;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield ZZ : Lburp/Zta4;
    //   12: astore #6
    //   14: aload_0
    //   15: aload_2
    //   16: putfield ZG : Lburp/Zm6v;
    //   19: aload_0
    //   20: iload_3
    //   21: putfield ZT : Z
    //   24: aload_0
    //   25: new java/util/HashMap
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: putfield ZS : Ljava/util/Map;
    //   35: aload_0
    //   36: invokevirtual Zbh : ()V
    //   39: iload_3
    //   40: ifeq -> 123
    //   43: invokestatic Zc : ()Ljava/util/List;
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore #7
    //   53: aload #7
    //   55: invokeinterface hasNext : ()Z
    //   60: ifeq -> 118
    //   63: aload #7
    //   65: invokeinterface next : ()Ljava/lang/Object;
    //   70: checkcast burp/Zeew
    //   73: astore #8
    //   75: new burp/Zzdy
    //   78: dup
    //   79: aload #8
    //   81: getfield toolName : Ljava/lang/String;
    //   84: invokespecial <init> : (Ljava/lang/String;)V
    //   87: astore #9
    //   89: aload_0
    //   90: getfield ZS : Ljava/util/Map;
    //   93: aload #8
    //   95: aload #9
    //   97: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: aload_0
    //   104: getfield ZX : Lburp/Zbqc;
    //   107: aload #9
    //   109: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   112: pop
    //   113: aload #6
    //   115: ifnonnull -> 53
    //   118: aload #6
    //   120: ifnonnull -> 141
    //   123: aload_0
    //   124: getfield ZD : Lburp/Zbqc;
    //   127: aload_0
    //   128: getfield ZX : Lburp/Zbqc;
    //   131: invokevirtual remove : (Ljava/awt/Component;)V
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   140: athrow
    //   141: aload_0
    //   142: getfield Zx : Lburp/Zm9v;
    //   145: iconst_0
    //   146: invokevirtual setVisible : (Z)V
    //   149: aload_0
    //   150: aload_0
    //   151: getfield ZC : Lburp/Zbqc;
    //   154: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   157: checkcast javax/swing/border/TitledBorder
    //   160: putfield Zo : Ljavax/swing/border/TitledBorder;
    //   163: aload_0
    //   164: aload_0
    //   165: getfield Zz : Lburp/Zbqc;
    //   168: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   171: checkcast javax/swing/border/TitledBorder
    //   174: putfield Za : Ljavax/swing/border/TitledBorder;
    //   177: aload_0
    //   178: aload_0
    //   179: getfield ZW : Lburp/Zbqc;
    //   182: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   185: checkcast javax/swing/border/TitledBorder
    //   188: putfield Zs : Ljavax/swing/border/TitledBorder;
    //   191: aload_0
    //   192: aload_0
    //   193: getfield ZX : Lburp/Zbqc;
    //   196: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   199: checkcast javax/swing/border/TitledBorder
    //   202: putfield ZY : Ljavax/swing/border/TitledBorder;
    //   205: aload_0
    //   206: aload_0
    //   207: getfield ZM : Lburp/Zbqc;
    //   210: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   213: checkcast javax/swing/border/TitledBorder
    //   216: putfield Zm : Ljavax/swing/border/TitledBorder;
    //   219: aload_0
    //   220: aload_0
    //   221: getfield ZN : Lburp/Zbqc;
    //   224: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   227: checkcast javax/swing/border/TitledBorder
    //   230: putfield ZQ : Ljavax/swing/border/TitledBorder;
    //   233: aload_0
    //   234: aload_0
    //   235: getfield ZR : Lburp/Zbqc;
    //   238: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   241: checkcast javax/swing/border/TitledBorder
    //   244: putfield Zi : Ljavax/swing/border/TitledBorder;
    //   247: new burp/Zraw
    //   250: dup
    //   251: aload_0
    //   252: aload #5
    //   254: aload #4
    //   256: invokespecial <init> : (Lburp/Zbyq;Lburp/Zr_4;Lburp/Zbqa;)V
    //   259: astore #7
    //   261: aload_0
    //   262: new burp/Zgoa
    //   265: dup
    //   266: aload #7
    //   268: invokespecial <init> : (Lburp/Zl0f;)V
    //   271: putfield ZNr : Lburp/Zbqc;
    //   274: aload_0
    //   275: new burp/Zbup
    //   278: dup
    //   279: aload_0
    //   280: invokespecial <init> : (Ljava/awt/Component;)V
    //   283: putfield ZJ : Lburp/Zbup;
    //   286: aload_0
    //   287: getfield ZJ : Lburp/Zbup;
    //   290: iconst_0
    //   291: bipush #13
    //   293: iconst_0
    //   294: bipush #13
    //   296: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   299: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   302: return
    // Exception table:
    //   from	to	target	type
    //   118	134	137	java/util/regex/PatternSyntaxException
  }
  
  public void Zq(Zb07 paramZb07) {
    this.ZB = paramZb07;
    this.Z_ = false;
  }
  
  public JComponent Zlj() {
    return this.ZJ;
  }
  
  public void ZlQ() {
    try {
      if (!this.Z_)
        Zbc(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zlt() {
    Zm2.Zo(Zze0.LOGGER_VIEW_FILTER_APPLIED);
    ZbP();
  }
  
  public void Zlm() {
    Zbc();
  }
  
  public Zr1m Zlr() {
    return this.ZG.ZL(this);
  }
  
  private void ZR(Zbz6 paramZbz6) {
    paramZbz6.Zrc(this.Zn.isSelected());
    paramZbz6.Zrt(this.Zc.isSelected());
    paramZbz6.Zrn(this.Zr.isSelected());
    paramZbz6.Zro(this.Zb.isSelected());
    paramZbz6.ZrH(this.Zv.isSelected());
    paramZbz6.ZrK(this.ZH.isSelected());
    paramZbz6.Zr2(this.Zg.isSelected());
    paramZbz6.ZrL(this.Zw.isSelected());
    paramZbz6.ZrG(this.ZP.isSelected());
    paramZbz6.Zrk(this.ZL.isSelected());
    paramZbz6.Zrf(this.ZA.isSelected());
    paramZbz6.ZrS(this.ZF.isSelected());
    paramZbz6.Zru(this.Zy.isSelected());
    paramZbz6.ZrP(this.Zf.isSelected());
    paramZbz6.Zrq(this.ZK.isSelected());
    paramZbz6.ZwM(this.Zh.getText());
    paramZbz6.ZrR(this.Zk.isSelected());
    paramZbz6.Zr_(this.Zd.isSelected());
    paramZbz6.Zrv(this.ZO.isSelected());
    paramZbz6.Zrb(this.ZE.isSelected());
    paramZbz6.Zw3(this.Zu.getText());
    paramZbz6.ZrO(this.ZNO.isSelected());
    paramZbz6.ZwA(this.ZI.getText());
    paramZbz6.Zrz(this.ZV.isSelected());
    paramZbz6.ZrM(this.Zq.isSelected());
    this.ZS.forEach(paramZbz6::lambda$populateModel$0);
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      Arrays.<Component>stream(getComponents()).forEach(SwingUtilities::updateComponentTreeUI);
      if (this.Zi != null) {
        this.Zo.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Za.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zs.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZY.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zm.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZQ.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zi.setTitleFont(Zt00.DEFAULT_FONT.ZV());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zt2() {
    try {
      this.Zn.setSelected(this.ZZ.Zx4());
      this.Zc.setSelected(this.ZZ.Zxc());
      this.Zr.setSelected(this.ZZ.ZxI());
      this.Zb.setSelected(this.ZZ.Zxb());
      this.Zv.setSelected(this.ZZ.Zxf());
      this.ZH.setSelected(this.ZZ.Zxr());
      this.Zg.setSelected(this.ZZ.Zr());
      this.Zw.setSelected(this.ZZ.Zxn());
      this.ZP.setSelected(this.ZZ.ZxA());
      this.ZL.setSelected(this.ZZ.ZxV());
      this.ZA.setSelected(this.ZZ.ZxR());
      this.ZF.setSelected(this.ZZ.Zxk());
      this.Zy.setSelected(this.ZZ.Zxo());
      this.Zf.setSelected(this.ZZ.Zf());
      this.ZK.setSelected(this.ZZ.ZxQ());
      if (this.ZT)
        Zeew.Zc().forEach(this::lambda$configChanged$1); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zh.setText(this.ZZ.Zbo());
    this.Zk.setSelected(this.ZZ.ZbK());
    this.Zd.setSelected(this.ZZ.Zbz());
    this.ZO.setSelected(this.ZZ.Zb1());
    this.ZE.setSelected(this.ZZ.Zxx());
    this.Zu.setText(this.ZZ.Zxw());
    this.ZNO.setSelected(this.ZZ.Zx5());
    this.ZI.setText(this.ZZ.ZxB());
    this.ZV.setSelected(this.ZZ.ZxU());
    this.Zq.setSelected(this.ZZ.ZxO());
    ZC((ActionEvent)null);
    ZM((ActionEvent)null);
    ZbM();
  }
  
  private void Ze(boolean paramBoolean) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zn.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zc.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zr.setSelected(!paramBoolean);
      this.Zb.setSelected(paramBoolean);
      this.Zv.setSelected(paramBoolean);
      this.ZH.setSelected(paramBoolean);
      this.Zg.setSelected(paramBoolean);
      this.Zw.setSelected(paramBoolean);
      this.ZP.setSelected(paramBoolean);
      this.ZL.setSelected(paramBoolean);
      this.ZA.setSelected(paramBoolean);
      this.ZF.setSelected(paramBoolean);
      this.Zy.setSelected(paramBoolean);
      this.Zf.setSelected(paramBoolean);
      this.ZK.setSelected(paramBoolean);
      if (this.ZT)
        this.ZS.forEach(paramBoolean::lambda$setAll$2); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramBoolean) {
        this.Zh.setText("");
        this.Zk.setSelected(false);
        this.Zd.setSelected(false);
        this.ZO.setSelected(false);
        this.Zx.setVisible(false);
        this.ZE.setSelected(false);
        this.ZNO.setSelected(false);
        this.ZV.setSelected(false);
        this.Zq.setSelected(false);
        ZC((ActionEvent)null);
        ZM((ActionEvent)null);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public boolean Zly() {
    return this.Zj;
  }
  
  public JComponent Zlh() {
    return this.ZNr;
  }
  
  private void ZbP() {
    try {
      this.Z_ = true;
      this.ZZ.ZbB(this.Zn.isSelected());
      this.ZZ.Zbl(this.Zc.isSelected());
      this.ZZ.ZbM(this.Zr.isSelected());
      this.ZZ.ZbU(this.Zb.isSelected());
      this.ZZ.ZK(this.Zv.isSelected());
      this.ZZ.ZbS(this.ZH.isSelected());
      this.ZZ.ZbN(this.Zg.isSelected());
      this.ZZ.Zby(this.Zw.isSelected());
      this.ZZ.Zbi(this.ZP.isSelected());
      this.ZZ.Zbg(this.ZL.isSelected());
      this.ZZ.Zb8(this.ZA.isSelected());
      this.ZZ.Zbn(this.ZF.isSelected());
      this.ZZ.ZbQ(this.Zy.isSelected());
      this.ZZ.Zb3(this.Zf.isSelected());
      this.ZZ.ZbO(this.ZK.isSelected());
      if (this.ZT)
        Zeew.Zc().forEach(this::lambda$applyChanges$3); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZZ.Zy(this.Zh.getText());
    this.ZZ.ZX(this.Zk.isSelected());
    this.ZZ.Zba(this.Zd.isSelected());
    this.ZZ.Zu(this.ZO.isSelected());
    ZbM();
    this.ZZ.ZbE(this.ZE.isSelected());
    this.ZZ.ZH(this.Zu.getText());
    this.ZZ.Zy(this.ZNO.isSelected());
    this.ZZ.ZF(this.ZI.getText());
    this.ZZ.ZbL(this.ZV.isSelected());
    this.ZZ.Zbc(this.Zq.isSelected());
    this.ZZ.Zw(Zzca.SETTINGS);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Zzdy;
    //   4: aload_1
    //   5: sipush #16028
    //   8: sipush #-16576
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: aload_0
    //   15: getfield Zn : Lburp/Zzdy;
    //   18: invokevirtual isSelected : ()Z
    //   21: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   26: invokevirtual setSelected : (Z)V
    //   29: aload_0
    //   30: getfield Zc : Lburp/Zzdy;
    //   33: aload_1
    //   34: sipush #16070
    //   37: sipush #-18796
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: aload_0
    //   44: getfield Zc : Lburp/Zzdy;
    //   47: invokevirtual isSelected : ()Z
    //   50: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   55: invokevirtual setSelected : (Z)V
    //   58: aload_0
    //   59: getfield Zr : Lburp/Zzdy;
    //   62: aload_1
    //   63: sipush #16082
    //   66: sipush #1408
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload_0
    //   73: getfield Zr : Lburp/Zzdy;
    //   76: invokevirtual isSelected : ()Z
    //   79: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   84: invokevirtual setSelected : (Z)V
    //   87: aload_0
    //   88: getfield Zb : Lburp/Zzdy;
    //   91: aload_1
    //   92: sipush #16089
    //   95: sipush #-31512
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: aload_0
    //   102: getfield Zb : Lburp/Zzdy;
    //   105: invokevirtual isSelected : ()Z
    //   108: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   113: invokevirtual setSelected : (Z)V
    //   116: aload_0
    //   117: getfield Zv : Lburp/Zzdy;
    //   120: aload_1
    //   121: sipush #16125
    //   124: sipush #-8127
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: aload_0
    //   131: getfield Zv : Lburp/Zzdy;
    //   134: invokevirtual isSelected : ()Z
    //   137: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   142: invokevirtual setSelected : (Z)V
    //   145: aload_0
    //   146: getfield ZH : Lburp/Zzdy;
    //   149: aload_1
    //   150: sipush #16100
    //   153: sipush #7868
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: aload_0
    //   160: getfield ZH : Lburp/Zzdy;
    //   163: invokevirtual isSelected : ()Z
    //   166: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   171: invokevirtual setSelected : (Z)V
    //   174: aload_0
    //   175: getfield Zg : Lburp/Zzdy;
    //   178: aload_1
    //   179: sipush #16116
    //   182: sipush #31359
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: aload_0
    //   189: getfield Zg : Lburp/Zzdy;
    //   192: invokevirtual isSelected : ()Z
    //   195: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   200: invokevirtual setSelected : (Z)V
    //   203: aload_0
    //   204: getfield Zw : Lburp/Zzdy;
    //   207: aload_1
    //   208: sipush #16025
    //   211: sipush #-17043
    //   214: invokestatic a : (II)Ljava/lang/String;
    //   217: aload_0
    //   218: getfield Zw : Lburp/Zzdy;
    //   221: invokevirtual isSelected : ()Z
    //   224: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   229: invokevirtual setSelected : (Z)V
    //   232: aload_0
    //   233: getfield ZP : Lburp/Zzdy;
    //   236: aload_1
    //   237: sipush #16067
    //   240: sipush #-19230
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: aload_0
    //   247: getfield ZP : Lburp/Zzdy;
    //   250: invokevirtual isSelected : ()Z
    //   253: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   258: invokevirtual setSelected : (Z)V
    //   261: aload_0
    //   262: getfield ZL : Lburp/Zzdy;
    //   265: aload_1
    //   266: sipush #16077
    //   269: sipush #7653
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: aload_0
    //   276: getfield ZL : Lburp/Zzdy;
    //   279: invokevirtual isSelected : ()Z
    //   282: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   287: invokevirtual setSelected : (Z)V
    //   290: aload_0
    //   291: getfield ZA : Lburp/Zzdy;
    //   294: aload_1
    //   295: sipush #16086
    //   298: sipush #-28646
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: aload_0
    //   305: getfield ZA : Lburp/Zzdy;
    //   308: invokevirtual isSelected : ()Z
    //   311: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   316: invokevirtual setSelected : (Z)V
    //   319: aload_0
    //   320: getfield ZF : Lburp/Zzdy;
    //   323: aload_1
    //   324: sipush #16121
    //   327: sipush #11564
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: aload_0
    //   334: getfield ZF : Lburp/Zzdy;
    //   337: invokevirtual isSelected : ()Z
    //   340: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   345: invokevirtual setSelected : (Z)V
    //   348: aload_0
    //   349: getfield Zy : Lburp/Zzdy;
    //   352: aload_1
    //   353: sipush #16065
    //   356: sipush #-10582
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: aload_0
    //   363: getfield Zy : Lburp/Zzdy;
    //   366: invokevirtual isSelected : ()Z
    //   369: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   374: invokevirtual setSelected : (Z)V
    //   377: aload_0
    //   378: getfield Zf : Lburp/Zzdy;
    //   381: aload_1
    //   382: sipush #16029
    //   385: sipush #-11710
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: aload_0
    //   392: getfield Zf : Lburp/Zzdy;
    //   395: invokevirtual isSelected : ()Z
    //   398: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   403: invokevirtual setSelected : (Z)V
    //   406: invokestatic Zbk : ()[Ljava/lang/String;
    //   409: aload_0
    //   410: getfield ZK : Lburp/Zzdy;
    //   413: aload_1
    //   414: sipush #16023
    //   417: sipush #-16530
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: aload_0
    //   424: getfield ZK : Lburp/Zzdy;
    //   427: invokevirtual isSelected : ()Z
    //   430: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   435: invokevirtual setSelected : (Z)V
    //   438: aload_0
    //   439: getfield ZS : Ljava/util/Map;
    //   442: aload_1
    //   443: <illegal opcode> accept : (Lburp/Zmf_;)Ljava/util/function/BiConsumer;
    //   448: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   453: aload_0
    //   454: getfield Zh : Lburp/Zg85;
    //   457: aload_1
    //   458: sipush #16093
    //   461: sipush #25374
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aload_0
    //   468: getfield Zh : Lburp/Zg85;
    //   471: invokevirtual getText : ()Ljava/lang/String;
    //   474: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   479: invokevirtual setText : (Ljava/lang/String;)V
    //   482: aload_0
    //   483: getfield Zk : Lburp/Zzdy;
    //   486: aload_1
    //   487: sipush #16091
    //   490: sipush #11138
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: aload_0
    //   497: getfield Zk : Lburp/Zzdy;
    //   500: invokevirtual isSelected : ()Z
    //   503: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   508: invokevirtual setSelected : (Z)V
    //   511: astore_2
    //   512: aload_0
    //   513: getfield Zd : Lburp/Zzdy;
    //   516: aload_1
    //   517: sipush #16110
    //   520: sipush #12728
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: aload_0
    //   527: getfield Zd : Lburp/Zzdy;
    //   530: invokevirtual isSelected : ()Z
    //   533: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   538: invokevirtual setSelected : (Z)V
    //   541: aload_0
    //   542: getfield ZO : Lburp/Zzdy;
    //   545: aload_1
    //   546: sipush #16083
    //   549: sipush #1369
    //   552: invokestatic a : (II)Ljava/lang/String;
    //   555: aload_0
    //   556: getfield ZO : Lburp/Zzdy;
    //   559: invokevirtual isSelected : ()Z
    //   562: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   567: invokevirtual setSelected : (Z)V
    //   570: aload_0
    //   571: getfield Zx : Lburp/Zm9v;
    //   574: iconst_0
    //   575: invokevirtual setVisible : (Z)V
    //   578: aload_0
    //   579: getfield ZE : Lburp/Zzdy;
    //   582: aload_1
    //   583: sipush #16085
    //   586: sipush #-30154
    //   589: invokestatic a : (II)Ljava/lang/String;
    //   592: aload_0
    //   593: getfield ZE : Lburp/Zzdy;
    //   596: invokevirtual isSelected : ()Z
    //   599: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   604: invokevirtual setSelected : (Z)V
    //   607: aload_1
    //   608: sipush #16088
    //   611: sipush #20724
    //   614: invokestatic a : (II)Ljava/lang/String;
    //   617: invokeinterface Ze : (Ljava/lang/String;)Ljava/util/List;
    //   622: astore_3
    //   623: aload_3
    //   624: ifnull -> 644
    //   627: aload_3
    //   628: ldc ','
    //   630: invokestatic Zf : (Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    //   633: astore #4
    //   635: aload_0
    //   636: getfield Zu : Lburp/Zg85;
    //   639: aload #4
    //   641: invokevirtual setText : (Ljava/lang/String;)V
    //   644: aload_0
    //   645: getfield ZNO : Lburp/Zzdy;
    //   648: aload_0
    //   649: getfield ZE : Lburp/Zzdy;
    //   652: invokevirtual isSelected : ()Z
    //   655: ifne -> 698
    //   658: aload_1
    //   659: sipush #16101
    //   662: sipush #28329
    //   665: invokestatic a : (II)Ljava/lang/String;
    //   668: aload_0
    //   669: getfield ZNO : Lburp/Zzdy;
    //   672: invokevirtual isSelected : ()Z
    //   675: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   680: ifeq -> 698
    //   683: goto -> 690
    //   686: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   689: athrow
    //   690: iconst_1
    //   691: goto -> 699
    //   694: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   697: athrow
    //   698: iconst_0
    //   699: invokevirtual setSelected : (Z)V
    //   702: aload_1
    //   703: sipush #16078
    //   706: sipush #20291
    //   709: invokestatic a : (II)Ljava/lang/String;
    //   712: invokeinterface Ze : (Ljava/lang/String;)Ljava/util/List;
    //   717: astore_3
    //   718: aload_3
    //   719: ifnull -> 739
    //   722: aload_3
    //   723: ldc ','
    //   725: invokestatic Zf : (Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    //   728: astore #4
    //   730: aload_0
    //   731: getfield ZI : Lburp/Zg85;
    //   734: aload #4
    //   736: invokevirtual setText : (Ljava/lang/String;)V
    //   739: aload_0
    //   740: getfield ZV : Lburp/Zzdy;
    //   743: aload_1
    //   744: sipush #16030
    //   747: sipush #32219
    //   750: invokestatic a : (II)Ljava/lang/String;
    //   753: aload_0
    //   754: getfield ZV : Lburp/Zzdy;
    //   757: invokevirtual isSelected : ()Z
    //   760: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   765: invokevirtual setSelected : (Z)V
    //   768: aload_0
    //   769: getfield Zq : Lburp/Zzdy;
    //   772: aload_1
    //   773: sipush #16016
    //   776: sipush #14493
    //   779: invokestatic a : (II)Ljava/lang/String;
    //   782: aload_0
    //   783: getfield Zq : Lburp/Zzdy;
    //   786: invokevirtual isSelected : ()Z
    //   789: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   794: invokevirtual setSelected : (Z)V
    //   797: aload_0
    //   798: aconst_null
    //   799: invokevirtual ZC : (Ljava/awt/event/ActionEvent;)V
    //   802: aload_0
    //   803: aconst_null
    //   804: invokevirtual ZM : (Ljava/awt/event/ActionEvent;)V
    //   807: aload_0
    //   808: invokevirtual ZbM : ()V
    //   811: aload_2
    //   812: ifnonnull -> 829
    //   815: iconst_5
    //   816: anewarray burp/Zbqc
    //   819: invokestatic Zr : ([Lburp/Zbqc;)V
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   828: athrow
    //   829: return
    // Exception table:
    //   from	to	target	type
    //   644	683	686	java/util/regex/PatternSyntaxException
    //   658	694	694	java/util/regex/PatternSyntaxException
    //   739	822	825	java/util/regex/PatternSyntaxException
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Zh(a(16022, 1040), this.Zn.isSelected());
    paramZg4j.Zh(a(16080, 17233), this.Zc.isSelected());
    paramZg4j.Zh(a(16019, 1179), this.Zr.isSelected());
    paramZg4j.Zh(a(16071, 25252), this.Zb.isSelected());
    paramZg4j.Zh(a(16112, 8465), this.Zv.isSelected());
    paramZg4j.Zh(a(16099, 13246), this.ZH.isSelected());
    paramZg4j.Zh(a(16026, -2861), this.Zg.isSelected());
    paramZg4j.Zh(a(16127, -5989), this.Zw.isSelected());
    paramZg4j.Zh(a(16124, -19063), this.ZP.isSelected());
    paramZg4j.Zh(a(16068, 27994), this.ZL.isSelected());
    paramZg4j.Zh(a(16104, -22937), this.ZA.isSelected());
    paramZg4j.Zh(a(16074, 932), this.ZF.isSelected());
    paramZg4j.Zh(a(16114, 24044), this.Zy.isSelected());
    paramZg4j.Zh(a(16090, 23368), this.Zf.isSelected());
    paramZg4j.Zh(a(16084, 22825), this.ZK.isSelected());
    this.ZS.forEach(paramZg4j::lambda$saveBurpConfiguration$5);
    String[] arrayOfString1 = Zbk();
    paramZg4j.Za(a(16017, 2623), this.Zh.getText());
    paramZg4j.Zh(a(16111, 2772), this.Zk.isSelected());
    paramZg4j.Zh(a(16024, 452), this.Zd.isSelected());
    paramZg4j.Zh(a(16117, -31277), this.ZO.isSelected());
    paramZg4j.Zh(a(16020, 18719), this.ZE.isSelected());
    Zzqw zzqw1 = paramZg4j.ZP(a(16031, 21912));
    String[] arrayOfString2 = this.Zu.getText().split(",");
    int i = arrayOfString2.length;
    int j = 0;
    while (j < i) {
      String str1 = arrayOfString2[j];
      String str2 = str1.trim();
      try {
        if (!str2.isEmpty())
          zzqw1.Zx(new Zzqs(str2)); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      j++;
      if (arrayOfString1 == null)
        break; 
    } 
    paramZg4j.Zh(a(16069, -28939), this.ZNO.isSelected());
    Zzqw zzqw2 = paramZg4j.ZP(a(16021, 12145));
    String[] arrayOfString3 = this.ZI.getText().split(",");
    j = arrayOfString3.length;
    byte b = 0;
    while (b < j) {
      String str1 = arrayOfString3[b];
      String str2 = str1.trim();
      try {
        if (!str2.isEmpty())
          zzqw2.Zx(new Zzqs(str2)); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      b++;
      if (arrayOfString1 == null)
        break; 
    } 
    try {
      paramZg4j.Zh(a(16118, -11285), this.ZV.isSelected());
      paramZg4j.Zh(a(16096, -11990), this.Zq.isSelected());
      if (Zbqc.Zwu() == null)
        Zu(new String[5]); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void Zbc() {
    Zt2();
  }
  
  private void ZbM() {
    // Byte code:
    //   0: invokestatic Zbk : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zk : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 66
    //   14: aload_0
    //   15: getfield Zh : Lburp/Zg85;
    //   18: invokevirtual getText : ()Ljava/lang/String;
    //   21: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   24: pop
    //   25: aload_0
    //   26: getfield Zx : Lburp/Zm9v;
    //   29: iconst_0
    //   30: invokevirtual setVisible : (Z)V
    //   33: aload_0
    //   34: iconst_1
    //   35: putfield Zj : Z
    //   38: goto -> 86
    //   41: astore_2
    //   42: aload_2
    //   43: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   46: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   49: aload_0
    //   50: getfield Zx : Lburp/Zm9v;
    //   53: iconst_1
    //   54: invokevirtual setVisible : (Z)V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield Zj : Z
    //   62: aload_1
    //   63: ifnonnull -> 86
    //   66: aload_0
    //   67: getfield Zx : Lburp/Zm9v;
    //   70: iconst_0
    //   71: invokevirtual setVisible : (Z)V
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield Zj : Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   85: athrow
    //   86: aload_0
    //   87: getfield ZB : Lburp/Zb07;
    //   90: ifnull -> 109
    //   93: aload_0
    //   94: getfield ZB : Lburp/Zb07;
    //   97: invokeinterface ZgU : ()V
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   108: athrow
    //   109: return
    // Exception table:
    //   from	to	target	type
    //   14	38	41	java/util/regex/PatternSyntaxException
    //   42	79	82	java/util/regex/PatternSyntaxException
    //   86	102	105	java/util/regex/PatternSyntaxException
  }
  
  private void Zbh() {
    this.ZD = new Zbqc();
    this.ZC = new Zbqc();
    this.Zn = new Zzdy();
    this.Zc = new Zzdy();
    this.Zr = new Zzdy();
    this.Zz = new Zbqc();
    this.Zb = new Zzdy();
    this.Zw = new Zzdy();
    this.Zv = new Zzdy();
    this.ZP = new Zzdy();
    this.ZH = new Zzdy();
    this.ZL = new Zzdy();
    this.Zg = new Zzdy();
    this.ZA = new Zzdy();
    this.ZW = new Zbqc();
    this.ZF = new Zzdy();
    this.Zy = new Zzdy();
    this.Zf = new Zzdy();
    this.ZK = new Zzdy();
    this.ZX = new Zbqc();
    this.Zt = new Zbqc();
    this.ZM = new Zbqc();
    this.Zh = new Zg85();
    this.Zk = new Zzdy();
    this.Zd = new Zzdy();
    this.Zx = new Zm9v();
    this.ZO = new Zzdy();
    this.ZN = new Zbqc();
    this.ZE = new Zzdy();
    this.Zu = new Zg85();
    this.ZNO = new Zzdy();
    this.ZI = new Zg85();
    this.ZR = new Zbqc();
    this.ZV = new Zzdy();
    this.Zq = new Zzdy();
    this.ZU = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 10, 0, 10, 0 };
    setLayout(gridBagLayout1);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZD.setLayout(gridBagLayout2);
    this.ZC.setBorder(BorderFactory.createTitledBorder(a(16027, 11208)));
    this.ZC.setLayout(new GridLayout(4, 0, 0, 5));
    this.Zn.setText(a(16106, -16790));
    this.ZC.add(this.Zn);
    this.Zc.setText(a(16107, 25750));
    this.ZC.add(this.Zc);
    this.Zr.setText(a(16094, 1753));
    this.ZC.add(this.Zr);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.ZC, gridBagConstraints);
    this.Zz.setBorder(BorderFactory.createTitledBorder(a(16122, -2744)));
    this.Zz.setLayout(new GridLayout(4, 0, 0, 5));
    this.Zb.setText(a(16075, -13034));
    this.Zz.add(this.Zb);
    this.Zw.setText(a(16095, -3211));
    this.Zz.add(this.Zw);
    this.Zv.setText(a(16076, 11865));
    this.Zz.add(this.Zv);
    this.ZP.setText(a(16079, -11825));
    this.Zz.add(this.ZP);
    this.ZH.setText(a(16018, -128));
    this.Zz.add(this.ZH);
    this.ZL.setText(a(16066, -6611));
    this.Zz.add(this.ZL);
    this.Zg.setText(a(16064, 31447));
    this.Zz.add(this.Zg);
    this.ZA.setText(a(16119, 6200));
    this.Zz.add(this.ZA);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.Zz, gridBagConstraints);
    this.ZW.setBorder(BorderFactory.createTitledBorder(a(16108, 4409)));
    this.ZW.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZF.setText(a(16081, 21146));
    this.ZW.add(this.ZF);
    this.Zy.setText(a(16120, 24221));
    this.ZW.add(this.Zy);
    this.Zf.setText(a(16109, -3311));
    this.ZW.add(this.Zf);
    this.ZK.setText(a(16103, 21365));
    this.ZW.add(this.ZK);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.ZW, gridBagConstraints);
    this.ZX.setBorder(BorderFactory.createTitledBorder(a(16072, 1039)));
    this.ZX.setLayout(new GridLayout(4, 0, 0, 5));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.ZD.add(this.ZX, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZD, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 10, 0, 10, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.Zt.setLayout(gridBagLayout3);
    this.ZM.setBorder(BorderFactory.createTitledBorder(a(16123, -8831)));
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout4.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.ZM.setLayout(gridBagLayout4);
    this.Zh.setColumns(20);
    this.Zh.addKeyListener(new Zebr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZM.add(this.Zh, gridBagConstraints);
    this.Zk.setText(a(16115, -27947));
    this.Zk.addActionListener(new Ztd9(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZM.add(this.Zk, gridBagConstraints);
    this.Zd.setText(a(16073, -1882));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.ZM.add(this.Zd, gridBagConstraints);
    this.Zx.setHorizontalAlignment(4);
    this.Zx.setText(a(16097, -3450));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1536;
    this.ZM.add(this.Zx, gridBagConstraints);
    this.ZO.setText(a(16087, -22020));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weightx = 1.0D;
    this.ZM.add(this.ZO, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zt.add(this.ZM, gridBagConstraints);
    this.ZN.setBorder(BorderFactory.createTitledBorder(a(16092, -16338)));
    this.ZN.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout5 = new GridBagLayout();
    gridBagLayout5.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout5.rowHeights = new int[] { 0, 10, 0 };
    this.ZN.setLayout(gridBagLayout5);
    this.ZE.setText(a(16113, -6573));
    this.ZE.addActionListener(new Zeet(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZN.add(this.ZE, gridBagConstraints);
    this.Zu.setColumns(15);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZN.add(this.Zu, gridBagConstraints);
    this.ZNO.setText(a(16105, -20255));
    this.ZNO.addActionListener(new Zs8c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZN.add(this.ZNO, gridBagConstraints);
    this.ZI.setColumns(15);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZN.add(this.ZI, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zt.add(this.ZN, gridBagConstraints);
    this.ZR.setBorder(BorderFactory.createTitledBorder(a(16126, -23968)));
    this.ZR.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout6 = new GridBagLayout();
    gridBagLayout6.columnWidths = new int[] { 0 };
    gridBagLayout6.rowHeights = new int[] { 0, 10, 0 };
    this.ZR.setLayout(gridBagLayout6);
    this.ZV.setText(a(16098, 23962));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZR.add(this.ZV, gridBagConstraints);
    this.Zq.setText(a(16102, 23478));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.ZR.add(this.Zq, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zt.add(this.ZR, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zt, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 3;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZU, gridBagConstraints);
  }
  
  private void Zp(KeyEvent paramKeyEvent) {
    ZbM();
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    ZbM();
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZNO.setEnabled(!this.ZE.isSelected());
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZE.setEnabled(!this.ZNO.isSelected());
  }
  
  private static void lambda$saveBurpConfiguration$5(Zg4j paramZg4j, Zeew paramZeew, Zzdy paramZzdy) {
    paramZg4j.Zh(paramZeew.loggerDisplayFilterProjectConfigKey, paramZzdy.isSelected());
  }
  
  private static void lambda$loadBurpConfiguration$4(Zmf_ paramZmf_, Zeew paramZeew, Zzdy paramZzdy) {
    paramZzdy.setSelected(paramZmf_.ZC(paramZeew.loggerDisplayFilterProjectConfigKey, paramZzdy.isSelected()));
  }
  
  private void lambda$applyChanges$3(Zeew paramZeew) {
    this.ZZ.Zr(paramZeew, ((Zzdy)this.ZS.get(paramZeew)).isSelected());
  }
  
  private static void lambda$setAll$2(boolean paramBoolean, Zeew paramZeew, Zzdy paramZzdy) {
    paramZzdy.setSelected(paramBoolean);
  }
  
  private void lambda$configChanged$1(Zeew paramZeew) {
    ((Zzdy)this.ZS.get(paramZeew)).setSelected(this.ZZ.Zb(paramZeew));
  }
  
  private static void lambda$populateModel$0(Zbz6 paramZbz6, Zeew paramZeew, Zzdy paramZzdy) {
    paramZbz6.Z_(paramZeew, paramZzdy.isSelected());
  }
  
  public static void Zu(String[] paramArrayOfString) {
    Zl = paramArrayOfString;
  }
  
  public static String[] Zbk() {
    return Zl;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #80
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '®¶IKp\\fE äÆ²$ÂCæïIª\\nÝH(ÉºáÉü$ »îàÅÇ¨+Æau`a®U"þfÞÈ;5¬Q¿P+s?tT ß¸IFÂuÄ3Á-í<<ABGÜ/%b16¥<<=ú9íâHÃ6Qè'~vÒÌ¬6AwØ9Î¼ÝËâÛÎð/!¸rN¦Üè½ûUqÀXÌ/p¹Í9°µÖ8îèa­÷#\\b,´]7ý-§}h2T®éÕ¼öQÐ@lJ-Î0£8ØÊ<³åu97¤4kCnGQ:|Íàª\\ti¬¬S g,k¸\\n&ôÞ(oî\\bñ2(ðÂ5ígP2\\nìðW­4ª>ÉZ`£Hì×GnoX\\b\\b¿Í¨ü.8p:,å[\\nÄsUÏDD°Écª¯s½[É.eg02ó}â2®µé¼^QÅ@Î-D0ò¤8$ªãgvï¨#{\\f=f"ÚòÖäêù,¹÷«c,¬4ÊDWâÈT§\\raÛ¯}9#ë;8\ >)åb×$îòï2Ï-¼a±8Þçd}ÀiG´|Q1­³Ïõ6iTüu=n%T'èDæMß2¸%çaÄ¤ædæõHy·¨coïuë<½\\th«C,È°A¼\\boIÞ°À,átÈYÊQïWx¢¡$\\níÝ âìI¡µ­p»dç½{"ÇXpÏ)·|PpÂ n~§ÚãèÆ*Þîÿs+QÔß&\\b&÷°MU\\n¸,ÃbØ´¡³Ñz¡-Ô¢ÉÑ&âAî\\f·÷b9ò Ënú7×ïh,oì~aæY_IKÒ¬Yºå?î$(n.:"ÛÙ"ÓQF\\fIÍï·f×r}ÛÕø@~ìØ)¼ª0÷ØÙsQË«8v5N-7èzø×#Üå×zô%è0Ú¸ÜáÓÆòÑÒöÔÆ§úVíX×a-ö5p³ët¨PYÌ%óÒêã4éü¾e_¥lx¹J-ÿõ!Øúu7üýEÏÍ|MñÀÑÜ÷¬OB.æYArÀ[$Måf²¦ @Ã¶ÿCëJõ@-ÈÁÝ~¤P«äâÖï .ÇÁ"adáþE(ü'à30­1»E=ÐÓ,C¯ôhÇåí?ôéôK\\n®ÿRj0ÎüQ¦JwüÓ½Øi<EíÂ]jÇ'Z°ù\\rX´Qj®Q°ITy ³h  -»0ë$OhÎË×öV`MÓ°Aò¦´Hõit´\\rôeå¯:Q¿Óáa}¯TÔ-4ÖG V<ìÑ4ªðÁÙ¼Eí+Gíá1ðy[Ì7¤Ä6Fá V~$å+Z2îÈAqx;3Açd:-&1çS*âLÛEOíóÊkZÚ³@¬xð³Eþdw1mÏ.¸ÌÀ¹\\rà¼Ú1E²oèj7Ú×¥öyDªà;\\rIZ\\f@C^ \\nÃ&4®2ÊÌ'X-¬7\\t{xÌeàÅÒ4ÎAg¯y¬h1Ü¨q½Í~sVí¨îfÞãZ.å+#ÜùÂ×MÆY½í¹×Anïszû5ü\nÖi}1ðø9wMB¥P/A¥´)ÏÍì»1;àiv[Z¬õ+8æýT¶;í>XÇÆÇNtè/K=<>Z:£RHlÁ×6°Ñn½XÍCa³ç§TsýDg@ïöC¨T@bMÄléY¥Oü\\fUg~oAÌ|0\\f^cüCKñPDÀa¿--\8ÒïOÁÏ¹µñ¸Taë}ú:%Ä^ÂÛèÔi®u»ktBA >Ú\\t£iG´ó¬êÊùlx¨Jí¹Ê\\r µI@DAÂØmr[×=.ý»#ê=µ²pÐBÜFñ¾ªëèÊ£[}çc£)O\m©ëÆ²È·2·EÄ(.w¼r\\n©÷\\tØ WÒä0êìÔ\\bàæØÕv­Ödç®^ì\\t÷KL«K#!&æ<´[HFú|ìÈ\\tE2øgq)Æ0ä HeÆL7%sÞí!5-*ihxªºhu¯pÒf0¦áæ²ç[â?0Aµ\\n^T÷¬Ù)5OÐ}Ý<·ýuE&¡DÿYWXýñ;æ¯¨l(/[j«ü½oÿ®é+¦&öêfËJ1\\rÖLÖ3¹S@j6åÙ^-|éå([½áÉç~ÿ!T¥Ð2^©ªþ+«>éZd£Hî×Ó\\fFnOX¿Ï¨¼.0p;,Å[\\nÃj+VV^#gXÊ¬ã»Nð\d\\bvÇ½4èÃ&ßqÆ\\fz_hghü5ìýyW:Öa[`­ß6oS§ÿ|+lgAØmiKìõ²¥Äô3aEMldº=W¨¦Á\\bnª¯b+ÏÍeíä¬ð;I>\\tlÃÁÑ 8±&K<ÂµGÿÞ41ÚºÆ0Ô:¼ÆÛu©Ø¡ÜÄùÅë±ñúaäW¡ÈÇõÔx}=!)}Ìc+-Æçz&£E8Â¿ú}!tcsL\\r_Ätq?¢¢ôÌÿ)Ë.BgEº(LFÄ#u[÷O ¬75~{p:?Miå´½üß÷½)+[uæAE3F®/¸KÅíÂ¨±úæp<`#=ó?Ò(¡÷ÕKt.2Ú¯UrÝµ{ÀûßÁ|­õ6DN[ðåÁ6vhaAÊðÕµ»Ùáb%âÀMAA=|¦¾FCÖfO¶j,Å*QËõóð'¾{~§?s¼ò\\n©õ\\t _Òå0ÊìT\\bðäØy¢'\\t²Æ¥¾ÖÞÝ{ôæR,ÆV&Q*Ø¿)l5+$T­]fês¨,ó{¹Ñ°¯lvwFçZ<ÅX2E|»O ¦F¨+øh÷Â%ÙèýÕ.E{/úÜ\\t(ñÅ`®¾"{]øáÝ\\bØá¢n[ÿÄ+)Íý·á8^LÈ<ð!\;'û:Ñ­¦(í¤²±ðMtß<ý *zÆµP¿;"ªòáT?ì9óO,òD/SäïcÕ¶;\\bg«]îâ°2X°«`*`\\tÊ/3òµà1\²qÞ'\(¿@í¾\\tÝ"ÝÕ;è|Çÿz´Âó>üÂÅ9P26`G@.¯¶a¥ÇÎ{#çmomRuÔ_vtñ`©F÷ü\\n½!]fÏs3Á£Va(+\E -é¡m)¸1¢jC8Ì\\f©È<Vÿ c;Øþ½³L³YCÂ.rnÓnÖLOÜíäz"ÈÑc¹¿Ûe»"¨Î[ÚÕ=\"$ï¼ð2JÔrr¦Ï?Õ%}(ÖY£«ø¹@r3éÓ X¢ÕsÒ0g4b½AY×ë¤+@KôËvlò«ß9=)ÍS-­2ö<]}#¦èBFsoÛÐY¸õ0Öl°f#Ô Åüð¬Ê(MY_w¥°¸±R>+Oø°÷ÂFÙýÕ¥.s{éúGÜKñ©í®½] áÆ\\b»áÎn[NÄ&?Hg©¶ïÝZ-¾ìuÄ¾Ó¼}ýÙ+üÛîy^ÕC³ú§Ñ¦P(ÃÏáz^ï08(imý'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: anewarray java/lang/String
    //   22: bipush #66
    //   24: istore_1
    //   25: invokestatic Zu : ([Ljava/lang/String;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #57
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc '²þ6¾cÃ¸jjýwMx#g_®¼èigQÛ/oàçsJ¤ÁñÎgé4Ó¼¡ìC` 5Õ©£­³¦2Í"Ù%°:Ö§ÎOØ r'i+"»ýõzH°4à²¥k9mËÙò÷ÇÜ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #61
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #38
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zbyq.a : [Ljava/lang/String;
    //   139: bipush #80
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zbyq.c : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #27
    //   222: goto -> 252
    //   225: bipush #50
    //   227: goto -> 252
    //   230: bipush #103
    //   232: goto -> 252
    //   235: bipush #32
    //   237: goto -> 252
    //   240: bipush #69
    //   242: goto -> 252
    //   245: bipush #11
    //   247: goto -> 252
    //   250: bipush #68
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3ED0) & 0xFFFF;
    if (c[i] == null) {
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
      byte b1 = 44;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */