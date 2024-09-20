package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import net.portswigger.Zm2;

public class Zby9 extends Zbqc implements Zedo, Zspz, Zm3g {
  private final Zg6x Zw;
  
  private final boolean ZO;
  
  private final Zm3g ZV;
  
  private final Map<Zeew, Zzdy> ZM;
  
  private final TitledBorder ZY;
  
  private final TitledBorder Zq;
  
  private final TitledBorder Zv;
  
  private final TitledBorder Zi;
  
  private final TitledBorder Zo;
  
  private final TitledBorder ZZ;
  
  private final TitledBorder ZU;
  
  private final JComponent Zc;
  
  private final Zm6v Za;
  
  private Zb07 ZN;
  
  private boolean ZB;
  
  private boolean Zm;
  
  private Zm99 ZW;
  
  private Zm99 ZF;
  
  private Zzdy ZP;
  
  private Zzdy ZQ;
  
  private Zzdy ZJ;
  
  private Zzdy ZX;
  
  private Zzdy ZA;
  
  private Zzdy ZR;
  
  private Zzdy Zt;
  
  private Zzdy Zk;
  
  private Zzdy Zs;
  
  private Zzdy Zf;
  
  private Zzdy ZE;
  
  private Zzdy ZD;
  
  private Zzdy ZI;
  
  private Zzdy Zl;
  
  private Zzdy Zn;
  
  private Zzdy Zy;
  
  private Zzdy Zg;
  
  private Zzdy ZK;
  
  private Zzdy Zb;
  
  private Zedd Zu;
  
  private Zedd Zz;
  
  private Zm9v ZT;
  
  private Zbqc Zd;
  
  private Zbqc ZG;
  
  private Zbqc Zh;
  
  private Zbqc Zx;
  
  private Zbqc Zr;
  
  private Zbqc ZH;
  
  private Zbqc ZC;
  
  private Zbqc Z_;
  
  private Zbqc Zj;
  
  private Zg85 ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zby9(Zg6x paramZg6x, Zm6v paramZm6v, boolean paramBoolean, Zm3g paramZm3g, Zr_4 paramZr_4, Zbqa paramZbqa) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zl : ()I
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zw : Lburp/Zg6x;
    //   12: aload_0
    //   13: iload_3
    //   14: putfield ZO : Z
    //   17: aload_0
    //   18: aload #4
    //   20: putfield ZV : Lburp/Zm3g;
    //   23: istore #7
    //   25: aload_0
    //   26: new java/util/HashMap
    //   29: dup
    //   30: invokespecial <init> : ()V
    //   33: putfield ZM : Ljava/util/Map;
    //   36: aload_0
    //   37: aload_2
    //   38: putfield Za : Lburp/Zm6v;
    //   41: aload_0
    //   42: invokevirtual ZWf : ()V
    //   45: iload_3
    //   46: ifeq -> 129
    //   49: invokestatic Zc : ()Ljava/util/List;
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore #8
    //   59: aload #8
    //   61: invokeinterface hasNext : ()Z
    //   66: ifeq -> 124
    //   69: aload #8
    //   71: invokeinterface next : ()Ljava/lang/Object;
    //   76: checkcast burp/Zeew
    //   79: astore #9
    //   81: new burp/Zzdy
    //   84: dup
    //   85: aload #9
    //   87: getfield toolName : Ljava/lang/String;
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: astore #10
    //   95: aload_0
    //   96: getfield ZM : Ljava/util/Map;
    //   99: aload #9
    //   101: aload #10
    //   103: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: aload_0
    //   110: getfield Zj : Lburp/Zbqc;
    //   113: aload #10
    //   115: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   118: pop
    //   119: iload #7
    //   121: ifne -> 59
    //   124: iload #7
    //   126: ifne -> 147
    //   129: aload_0
    //   130: getfield Zh : Lburp/Zbqc;
    //   133: aload_0
    //   134: getfield Zj : Lburp/Zbqc;
    //   137: invokevirtual remove : (Ljava/awt/Component;)V
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   146: athrow
    //   147: invokestatic values : ()[Lburp/Zrse;
    //   150: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   153: aload_0
    //   154: getfield Zu : Lburp/Zedd;
    //   157: dup
    //   158: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: <illegal opcode> accept : (Lburp/Zedd;)Ljava/util/function/Consumer;
    //   167: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   172: invokestatic values : ()[Lburp/Zrse;
    //   175: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   178: aload_0
    //   179: getfield Zz : Lburp/Zedd;
    //   182: dup
    //   183: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   186: pop
    //   187: <illegal opcode> accept : (Lburp/Zedd;)Ljava/util/function/Consumer;
    //   192: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   197: aload_0
    //   198: getfield ZT : Lburp/Zm9v;
    //   201: iconst_0
    //   202: invokevirtual setVisible : (Z)V
    //   205: aload_0
    //   206: aload_0
    //   207: getfield ZG : Lburp/Zbqc;
    //   210: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   213: checkcast javax/swing/border/TitledBorder
    //   216: putfield ZY : Ljavax/swing/border/TitledBorder;
    //   219: aload_0
    //   220: aload_0
    //   221: getfield Zd : Lburp/Zbqc;
    //   224: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   227: checkcast javax/swing/border/TitledBorder
    //   230: putfield Zq : Ljavax/swing/border/TitledBorder;
    //   233: aload_0
    //   234: aload_0
    //   235: getfield Z_ : Lburp/Zbqc;
    //   238: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   241: checkcast javax/swing/border/TitledBorder
    //   244: putfield Zv : Ljavax/swing/border/TitledBorder;
    //   247: aload_0
    //   248: aload_0
    //   249: getfield Zj : Lburp/Zbqc;
    //   252: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   255: checkcast javax/swing/border/TitledBorder
    //   258: putfield Zi : Ljavax/swing/border/TitledBorder;
    //   261: aload_0
    //   262: aload_0
    //   263: getfield Zr : Lburp/Zbqc;
    //   266: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   269: checkcast javax/swing/border/TitledBorder
    //   272: putfield Zo : Ljavax/swing/border/TitledBorder;
    //   275: aload_0
    //   276: aload_0
    //   277: getfield ZH : Lburp/Zbqc;
    //   280: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   283: checkcast javax/swing/border/TitledBorder
    //   286: putfield ZZ : Ljavax/swing/border/TitledBorder;
    //   289: aload_0
    //   290: aload_0
    //   291: getfield ZC : Lburp/Zbqc;
    //   294: invokevirtual getBorder : ()Ljavax/swing/border/Border;
    //   297: checkcast javax/swing/border/TitledBorder
    //   300: putfield ZU : Ljavax/swing/border/TitledBorder;
    //   303: new burp/Zkk4
    //   306: dup
    //   307: aload_0
    //   308: aload #5
    //   310: aload #6
    //   312: invokespecial <init> : (Lburp/Zby9;Lburp/Zr_4;Lburp/Zbqa;)V
    //   315: astore #8
    //   317: aload_0
    //   318: new burp/Zgoa
    //   321: dup
    //   322: aload #8
    //   324: invokespecial <init> : (Lburp/Zl0f;)V
    //   327: putfield Zc : Ljavax/swing/JComponent;
    //   330: return
    // Exception table:
    //   from	to	target	type
    //   124	140	143	java/util/regex/PatternSyntaxException
  }
  
  public Zr1m Zlr() {
    return this.Za.ZL(this);
  }
  
  public void Zq(Zb07 paramZb07) {
    this.ZN = paramZb07;
    this.ZB = false;
  }
  
  public JComponent Zlj() {
    return this;
  }
  
  public void ZlQ() {
    try {
      if (!this.ZB)
        ZWS(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zlt() {
    Zm2.Zo(Zze0.LOGGER_CAPTURE_FILTER_APPLIED);
    ZWO();
  }
  
  public void Zlm() {
    ZWS();
  }
  
  public boolean Zly() {
    return this.Zm;
  }
  
  public JComponent Zlh() {
    return this.Zc;
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      Arrays.<Component>stream(getComponents()).forEach(SwingUtilities::updateComponentTreeUI);
      if (this.ZU != null) {
        this.ZY.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zq.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zv.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zi.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zo.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZZ.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZU.setTitleFont(Zt00.DEFAULT_FONT.ZV());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zt2() {
    try {
      this.Zs.setSelected(this.Zw.Zl());
      this.Zn.setSelected(this.Zw.Zg());
      this.Zf.setSelected(this.Zw.Zt());
      this.ZJ.setSelected(this.Zw.Zw());
      this.Zt.setSelected(this.Zw.Zh());
      this.Zk.setSelected(this.Zw.Zv());
      this.ZP.setSelected(this.Zw.ZI());
      this.ZR.setSelected(this.Zw.Zx());
      this.ZX.setSelected(this.Zw.Z_());
      this.ZQ.setSelected(this.Zw.Za());
      this.ZA.setSelected(this.Zw.ZL());
      this.ZE.setSelected(this.Zw.ZC());
      this.ZD.setSelected(this.Zw.Zm());
      this.ZI.setSelected(this.Zw.Zi());
      this.Zl.setSelected(this.Zw.ZK());
      if (this.ZO)
        Zeew.Zc().forEach(this::lambda$configChanged$0); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZL.setText(this.Zw.Zbo());
    this.Zb.setSelected(this.Zw.ZbK());
    this.Zg.setSelected(this.Zw.Zbz());
    this.ZK.setSelected(this.Zw.Zb1());
    this.Zy.setSelected(this.Zw.ZP());
    this.Zu.setSelectedItem(Zrse.ZG(this.Zw.ZD()));
    this.Zz.setSelectedItem(Zrse.ZG(this.Zw.ZT()));
    ZWm();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.ZV.Zd(paramZmf_);
    this.Zs.setSelected(paramZmf_.ZC(a(-11876, -5128), this.Zs.isSelected()));
    this.Zn.setSelected(paramZmf_.ZC(a(-11854, -12816), this.Zn.isSelected()));
    this.Zf.setSelected(paramZmf_.ZC(a(-11855, -20108), this.Zf.isSelected()));
    this.ZJ.setSelected(paramZmf_.ZC(a(-11836, 16916), this.ZJ.isSelected()));
    this.Zt.setSelected(paramZmf_.ZC(a(-11834, -17869), this.Zt.isSelected()));
    this.Zk.setSelected(paramZmf_.ZC(a(-11879, 20701), this.Zk.isSelected()));
    this.ZP.setSelected(paramZmf_.ZC(a(-11899, 18904), this.ZP.isSelected()));
    this.ZR.setSelected(paramZmf_.ZC(a(-11845, -17468), this.ZR.isSelected()));
    this.ZX.setSelected(paramZmf_.ZC(a(-11856, 15603), this.ZX.isSelected()));
    this.ZQ.setSelected(paramZmf_.ZC(a(-11903, 27887), this.ZQ.isSelected()));
    int i = Zl8b.Zp();
    try {
      this.ZA.setSelected(paramZmf_.ZC(a(-11890, 13474), this.ZA.isSelected()));
      this.ZE.setSelected(paramZmf_.ZC(a(-11864, -23808), this.ZE.isSelected()));
      this.ZD.setSelected(paramZmf_.ZC(a(-11865, -11224), this.ZD.isSelected()));
      this.ZI.setSelected(paramZmf_.ZC(a(-11838, 26170), this.ZI.isSelected()));
      this.Zl.setSelected(paramZmf_.ZC(a(-11870, 30428), this.Zl.isSelected()));
      this.ZM.forEach(paramZmf_::lambda$loadBurpConfiguration$1);
      this.ZL.setText(paramZmf_.Zm(a(-11884, -14702), this.ZL.getText()));
      this.Zb.setSelected(paramZmf_.ZC(a(-11859, 22476), this.Zb.isSelected()));
      this.Zg.setSelected(paramZmf_.ZC(a(-11850, -20815), this.Zg.isSelected()));
      this.ZK.setSelected(paramZmf_.ZC(a(-11841, -12085), this.ZK.isSelected()));
      this.Zy.setSelected(paramZmf_.ZC(a(-11843, -22589), this.Zy.isSelected()));
      this.Zu.setSelectedItem(Ze(paramZmf_));
      this.Zz.setSelectedItem(Zz(paramZmf_));
      ZWm();
      if (i != 0)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private Zrse Ze(Zmf_ paramZmf_) {
    return Zl(paramZmf_, this.Zu, a(-11886, -4291));
  }
  
  private Zrse Zz(Zmf_ paramZmf_) {
    return Zl(paramZmf_, this.Zz, a(-11846, 10011));
  }
  
  private Zrse Zl(Zmf_ paramZmf_, Zedd<Zrse> paramZedd, String paramString) {
    List<String> list = Zrse.Zo();
    Zrse zrse = (Zrse)paramZedd.getSelectedItem();
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    String str = (zrse == null) ? Zrse.MB_1.displayName : zrse.displayName;
    int i = list.indexOf(str);
    int j = paramZmf_.ZM(paramString, list, i);
    return Zrse.ZV(list.get(j));
  }
  
  public void Zl(Zg4j paramZg4j) {
    this.ZV.Zl(paramZg4j);
    paramZg4j.Zh(a(-11860, -3527), this.Zs.isSelected());
    paramZg4j.Zh(a(-11875, -10), this.Zn.isSelected());
    paramZg4j.Zh(a(-11847, -31779), this.Zf.isSelected());
    paramZg4j.Zh(a(-11902, 22804), this.ZJ.isSelected());
    paramZg4j.Zh(a(-11871, 14193), this.Zt.isSelected());
    paramZg4j.Zh(a(-11898, -23450), this.Zk.isSelected());
    paramZg4j.Zh(a(-11861, -23647), this.ZP.isSelected());
    paramZg4j.Zh(a(-11878, -20546), this.ZR.isSelected());
    paramZg4j.Zh(a(-11839, 31991), this.ZX.isSelected());
    paramZg4j.Zh(a(-11835, 15735), this.ZQ.isSelected());
    paramZg4j.Zh(a(-11853, -4254), this.ZA.isSelected());
    paramZg4j.Zh(a(-11852, -7434), this.ZE.isSelected());
    paramZg4j.Zh(a(-11873, -23747), this.ZD.isSelected());
    paramZg4j.Zh(a(-11872, 17804), this.ZI.isSelected());
    paramZg4j.Zh(a(-11900, -11259), this.Zl.isSelected());
    this.ZM.forEach(paramZg4j::lambda$saveBurpConfiguration$2);
    paramZg4j.Za(a(-11842, 11204), this.ZL.getText());
    paramZg4j.Zh(a(-11882, 3019), this.Zb.isSelected());
    paramZg4j.Zh(a(-11868, -26640), this.Zg.isSelected());
    paramZg4j.Zh(a(-11833, -9132), this.ZK.isSelected());
    paramZg4j.Zh(a(-11849, 17014), this.Zy.isSelected());
    List<String> list = Zrse.Zo();
    Zrse zrse1 = (Zrse)this.Zu.getSelectedItem();
    try {
      if (zrse1 != null)
        paramZg4j.Zr(a(-11877, 4695), list, list.indexOf(zrse1.displayName)); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zrse zrse2 = (Zrse)this.Zz.getSelectedItem();
    try {
      if (zrse2 != null)
        paramZg4j.Zr(a(-11889, 22616), list, list.indexOf(zrse2.displayName)); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void Zb(boolean paramBoolean) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zs.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zn.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zf.setSelected(!paramBoolean);
      this.ZJ.setSelected(paramBoolean);
      this.Zt.setSelected(paramBoolean);
      this.Zk.setSelected(paramBoolean);
      this.ZP.setSelected(paramBoolean);
      this.ZR.setSelected(paramBoolean);
      this.ZX.setSelected(paramBoolean);
      this.ZQ.setSelected(paramBoolean);
      this.ZA.setSelected(paramBoolean);
      this.ZE.setSelected(paramBoolean);
      this.ZD.setSelected(paramBoolean);
      this.ZI.setSelected(paramBoolean);
      this.Zl.setSelected(paramBoolean);
      if (this.ZO)
        this.ZM.forEach(paramBoolean::lambda$setAll$3); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramBoolean) {
        this.ZL.setText("");
        this.Zb.setSelected(false);
        this.ZK.setSelected(false);
        this.ZT.setVisible(false);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zy.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zrse zrse = paramBoolean ? Zrse.UNLIMITED : Zrse.MB_1;
    this.Zu.setSelectedItem(zrse);
    this.Zz.setSelectedItem(zrse);
  }
  
  private void ZWO() {
    try {
      this.ZB = true;
      this.Zw.Zw(this.Zs.isSelected());
      this.Zw.ZE(this.Zn.isSelected());
      this.Zw.ZZ(this.Zf.isSelected());
      this.Zw.ZR(this.ZJ.isSelected());
      this.Zw.Zq(this.Zt.isSelected());
      this.Zw.ZC(this.Zk.isSelected());
      this.Zw.Zd(this.ZP.isSelected());
      this.Zw.Zv(this.ZR.isSelected());
      this.Zw.ZP(this.ZX.isSelected());
      this.Zw.ZH(this.ZQ.isSelected());
      this.Zw.Zc(this.ZA.isSelected());
      this.Zw.ZD(this.ZE.isSelected());
      this.Zw.ZG(this.ZD.isSelected());
      this.Zw.ZS(this.ZI.isSelected());
      this.Zw.Zs(this.Zl.isSelected());
      if (this.ZO)
        Zeew.Zc().forEach(this::lambda$applyChanges$4); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zw.Zl(this.ZL.getText());
    this.Zw.Zl(this.Zb.isSelected());
    this.Zw.Ze(this.Zg.isSelected());
    this.Zw.Zi(this.ZK.isSelected());
    this.Zw.Zh(this.Zy.isSelected());
    Object object1 = this.Zu.getSelectedItem();
    try {
      if (object1 != null)
        this.Zw.ZY(((Zrse)object1).size); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Object object2 = this.Zz.getSelectedItem();
    try {
      if (object2 != null)
        this.Zw.Zt(((Zrse)object2).size); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    ZWr();
    this.Zw.Zw(Zzca.SETTINGS);
  }
  
  private void ZV(Zgzp paramZgzp) {
    paramZgzp.ZPC(this.Zs.isSelected());
    paramZgzp.ZPZ(this.Zn.isSelected());
    paramZgzp.ZPK(this.Zf.isSelected());
    paramZgzp.ZP2(this.ZJ.isSelected());
    paramZgzp.ZPe(this.Zt.isSelected());
    paramZgzp.ZPP(this.Zk.isSelected());
    paramZgzp.ZPn(this.ZP.isSelected());
    paramZgzp.ZPs(this.ZR.isSelected());
    paramZgzp.ZPH(this.ZX.isSelected());
    paramZgzp.ZPh(this.ZQ.isSelected());
    paramZgzp.ZPM(this.ZA.isSelected());
    paramZgzp.ZP4(this.ZE.isSelected());
    paramZgzp.ZPq(this.ZD.isSelected());
    paramZgzp.ZP7(this.ZI.isSelected());
    paramZgzp.ZP5(this.Zl.isSelected());
    this.ZM.forEach(paramZgzp::lambda$populateModel$5);
    paramZgzp.ZP4(this.ZL.getText());
    paramZgzp.ZPr(this.Zb.isSelected());
    paramZgzp.ZPW(this.Zg.isSelected());
    paramZgzp.ZP8(this.ZK.isSelected());
    paramZgzp.ZPB(this.Zy.isSelected());
    Zrse zrse1 = (Zrse)this.Zu.getSelectedItem();
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    paramZgzp.Zkh(((zrse1 == null) ? Zrse.UNLIMITED : zrse1).size);
    Zrse zrse2 = (Zrse)this.Zz.getSelectedItem();
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    paramZgzp.Zkm(((zrse2 == null) ? Zrse.UNLIMITED : zrse2).size);
  }
  
  private void ZWS() {
    Zt2();
  }
  
  private void ZWm() {
    ZWr();
  }
  
  private void ZWr() {
    // Byte code:
    //   0: invokestatic Zl : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zb : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 66
    //   14: aload_0
    //   15: getfield ZL : Lburp/Zg85;
    //   18: invokevirtual getText : ()Ljava/lang/String;
    //   21: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   24: pop
    //   25: aload_0
    //   26: getfield ZT : Lburp/Zm9v;
    //   29: iconst_0
    //   30: invokevirtual setVisible : (Z)V
    //   33: aload_0
    //   34: iconst_1
    //   35: putfield Zm : Z
    //   38: goto -> 86
    //   41: astore_2
    //   42: aload_2
    //   43: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   46: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   49: aload_0
    //   50: getfield ZT : Lburp/Zm9v;
    //   53: iconst_1
    //   54: invokevirtual setVisible : (Z)V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield Zm : Z
    //   62: iload_1
    //   63: ifne -> 86
    //   66: aload_0
    //   67: getfield ZT : Lburp/Zm9v;
    //   70: iconst_0
    //   71: invokevirtual setVisible : (Z)V
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield Zm : Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   85: athrow
    //   86: aload_0
    //   87: getfield ZN : Lburp/Zb07;
    //   90: ifnull -> 109
    //   93: aload_0
    //   94: getfield ZN : Lburp/Zb07;
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
  
  private void ZWf() {
    this.Zh = new Zbqc();
    this.ZG = new Zbqc();
    this.Zs = new Zzdy();
    this.Zn = new Zzdy();
    this.Zf = new Zzdy();
    this.Zd = new Zbqc();
    this.ZJ = new Zzdy();
    this.ZR = new Zzdy();
    this.Zt = new Zzdy();
    this.ZX = new Zzdy();
    this.Zk = new Zzdy();
    this.ZQ = new Zzdy();
    this.ZP = new Zzdy();
    this.ZA = new Zzdy();
    this.Z_ = new Zbqc();
    this.ZE = new Zzdy();
    this.ZD = new Zzdy();
    this.ZI = new Zzdy();
    this.Zl = new Zzdy();
    this.Zj = new Zbqc();
    this.Zx = new Zbqc();
    this.Zr = new Zbqc();
    this.ZL = new Zg85();
    this.Zb = new Zzdy();
    this.Zg = new Zzdy();
    this.ZT = new Zm9v();
    this.ZK = new Zzdy();
    this.ZH = new Zbqc();
    this.Zy = new Zzdy();
    this.ZC = new Zbqc();
    this.ZW = new Zm99();
    this.Zu = new Zedd();
    this.ZF = new Zm99();
    this.Zz = new Zedd();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 10, 0 };
    setLayout(gridBagLayout1);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zh.setLayout(gridBagLayout2);
    this.ZG.setBorder(BorderFactory.createTitledBorder(a(-11901, -17275)));
    this.ZG.setLayout(new GridLayout(4, 0, 0, 5));
    this.Zs.setText(a(-11893, 24743));
    this.ZG.add(this.Zs);
    this.Zn.setText(a(-11862, 5068));
    this.ZG.add(this.Zn);
    this.Zf.setText(a(-11866, 4028));
    this.ZG.add(this.Zf);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zh.add(this.ZG, gridBagConstraints);
    this.Zd.setBorder(BorderFactory.createTitledBorder(a(-11897, 4953)));
    this.Zd.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZJ.setText(a(-11892, 24665));
    this.Zd.add(this.ZJ);
    this.ZR.setText(a(-11883, -223));
    this.Zd.add(this.ZR);
    this.Zt.setText(a(-11840, 31933));
    this.Zd.add(this.Zt);
    this.ZX.setText(a(-11895, -17097));
    this.Zd.add(this.ZX);
    this.Zk.setText(a(-11904, 31326));
    this.Zd.add(this.Zk);
    this.ZQ.setText(a(-11885, 22605));
    this.Zd.add(this.ZQ);
    this.ZP.setText(a(-11869, -5545));
    this.Zd.add(this.ZP);
    this.ZA.setText(a(-11837, 29021));
    this.Zd.add(this.ZA);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zh.add(this.Zd, gridBagConstraints);
    this.Z_.setBorder(BorderFactory.createTitledBorder(a(-11863, -22612)));
    this.Z_.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZE.setText(a(-11894, 31742));
    this.Z_.add(this.ZE);
    this.ZD.setText(a(-11858, 5682));
    this.Z_.add(this.ZD);
    this.ZI.setText(a(-11829, -4578));
    this.Z_.add(this.ZI);
    this.Zl.setText(a(-11880, -3312));
    this.Z_.add(this.Zl);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zh.add(this.Z_, gridBagConstraints);
    this.Zj.setBorder(BorderFactory.createTitledBorder(a(-11848, -21070)));
    this.Zj.setLayout(new GridLayout(4, 0, 0, 5));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zh.add(this.Zj, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zh, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.Zx.setLayout(gridBagLayout3);
    this.Zr.setBorder(BorderFactory.createTitledBorder(a(-11857, -23469)));
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout4.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.Zr.setLayout(gridBagLayout4);
    this.ZL.setColumns(20);
    this.ZL.addKeyListener(new Zbfv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Zr.add(this.ZL, gridBagConstraints);
    this.Zb.setText(a(-11888, 4364));
    this.Zb.addActionListener(new Zssy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zr.add(this.Zb, gridBagConstraints);
    this.Zg.setText(a(-11851, -8741));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.Zr.add(this.Zg, gridBagConstraints);
    this.ZT.setHorizontalAlignment(4);
    this.ZT.setText(a(-11874, 12647));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1536;
    this.Zr.add(this.ZT, gridBagConstraints);
    this.ZK.setText(a(-11896, -389));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weightx = 1.0D;
    this.Zr.add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zx.add(this.Zr, gridBagConstraints);
    this.ZH.setBorder(BorderFactory.createTitledBorder(a(-11881, -15937)));
    this.ZH.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout5 = new GridBagLayout();
    gridBagLayout5.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout5.rowHeights = new int[] { 0, 10, 0 };
    this.ZH.setLayout(gridBagLayout5);
    this.Zy.setText(a(-11887, -3894));
    this.ZH.add(this.Zy, new GridBagConstraints());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zx.add(this.ZH, gridBagConstraints);
    this.ZC.setBorder(BorderFactory.createTitledBorder(a(-11844, 24807)));
    this.ZC.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout6 = new GridBagLayout();
    gridBagLayout6.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout6.rowHeights = new int[] { 0, 5, 0 };
    this.ZC.setLayout(gridBagLayout6);
    this.ZW.setText(a(-11867, -28386));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZC.add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZC.add(this.Zu, gridBagConstraints);
    this.ZF.setText(a(-11891, 12154));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZC.add(this.ZF, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZC.add(this.Zz, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.Zx.add(this.ZC, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zx, gridBagConstraints);
  }
  
  private void ZD(KeyEvent paramKeyEvent) {
    ZWr();
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    ZWr();
  }
  
  private static void lambda$populateModel$5(Zgzp paramZgzp, Zeew paramZeew, Zzdy paramZzdy) {
    paramZgzp.Zc(paramZeew, paramZzdy.isSelected());
  }
  
  private void lambda$applyChanges$4(Zeew paramZeew) {
    this.Zw.ZM(paramZeew, ((Zzdy)this.ZM.get(paramZeew)).isSelected());
  }
  
  private static void lambda$setAll$3(boolean paramBoolean, Zeew paramZeew, Zzdy paramZzdy) {
    paramZzdy.setSelected(paramBoolean);
  }
  
  private static void lambda$saveBurpConfiguration$2(Zg4j paramZg4j, Zeew paramZeew, Zzdy paramZzdy) {
    paramZg4j.Zh(paramZeew.loggerCaptureFilterProjectConfigKey, paramZzdy.isSelected());
  }
  
  private static void lambda$loadBurpConfiguration$1(Zmf_ paramZmf_, Zeew paramZeew, Zzdy paramZzdy) {
    paramZzdy.setSelected(paramZmf_.ZC(paramZeew.loggerCaptureFilterProjectConfigKey, paramZzdy.isSelected()));
  }
  
  private void lambda$configChanged$0(Zeew paramZeew) {
    ((Zzdy)this.ZM.get(paramZeew)).setSelected(this.Zw.ZR(paramZeew));
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #73
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4S+!\\tï+wÇx~H­Ì@ó ÎJ/h¢AÉ$Sáòò2`ô²f61;©\\fJ«$ÀÆÏýiHHÐeÑõæ´¬È0£38û!b¶)!eÑÀñAì?#]àóihÏzL\\r^[gÞ­ÙÈbË^Ê® Ã«é4þê{TøüÌEÝè_7.3B*Õc§þ(D3ä­Åg¯R\\r*\¨KºLþÇ/u%å ÐßC7{.&¸7Ltìy(nÆ¡m°º¨¯u\\bs"6M5~\\t-VÕ4*qðoÝpiÙ ?01ïj`kÿG\\b]@hdÆÕ\\n­ÿMT.©<^£ÂÀ[_ÝÔ¥G¦¿ªEV$Å){ìþÜ÷HØÒÌa¼fçØæf^5<Ø-ªÛÇS¯\u±1íQ\\r;sq|ÑfYëà¢üHGíÂmom¶g¦Õ`åWÒI¾±«Uh8hð¸_ÔQ©ø"¡¼TjW`¢ø±OX[§ì0oJ%1Q=Ö5¿mL%K±êb|Ït\\baü¨dnfç@ð@O¹W@û7HñE£iCH¼²T:AúÔáb\±V«¡Lì%ZæùÈÕXygäµG¼zÀ¼ûóßô¦Ä½\\töâ²p4±Á ]ß_KÂçhÊöáÖ0Fì%HÍõ\\föÇk¹®[2QÒó§£Ù<Ïb©"èwÙwKÉ¤Hl6ù*Aõh¹üØbRãÕ$õ~flb||) C¬m®øU#¦}BðÐ¨fSçI`0¯yõúÉI vÐõ-"gøz@×¾u¤O¿Bý%r½*fX^n<xÆÌ´RÏî­%ÕYg\\b´\\b{4f~ª?,q\\nt5Q«¶$®í 0Fñ}lF)2ý¾ß*&fÅ~Æ0(Êo¤sHÄÔ\\f¼öWk«®zXóó£]<_b»"Åè?Ùwj¸É Hl6»bAÔhü\bRã$½wf3lF|ø)5g?qÁ3ª¢ÕyÎäNwþ\\füÙÈëÁfÚ»î5\\nÑ±2ZjHß^\\b(s©&ð.lî«Àç} hÛT©Kÿ±§?Þ8Àåo\\t¯öÐNí|üLóB'÷óÚ~zàÐ8Ò}vÃ\\bá7+0ÍXõÏÇ&¹[+2·QHÒi§ð×Fó%Z­ÿð¼â!c:±üVm}pÑ¼ù>½Ã~\\rX%×æ,>bLoíúE>oáð®{"ÚÌØÀÉÞÏø¡Ø÷#x#m¡'^\{ÅõmôÒÌ`(E!üXd*jê aøl*·Æù¶N\AØ WÌ,à©öpD°pvó]:¢«aMªî7li5è)Ïgb }áÛ'Ú9»ä>óÒ6XëRnö`àÐ0RÇeæ±NS>ß8¼ÌÎKÎ×!Ù\\nÜe@¾üÉB(¢²(ÆÙ\?1þ­BUàÏëL<Jë$î½¬j¶ßQÂòC¼"¡âÕéûþ;Ez¿á_y0/ë©àðEé|`ãÇ%*³û,>¦ÝÊG«ÃÐfÇw¤^êyVÔä0\\f×Ígña[ÛÞ:+È<ËÇê Î7ïÝÙ²²àì@ûhºl)?æN^Í#Ý *EÄ¾¸WøLÝø]6K°`Ë \\tÞZë=?Ç¾ãc¯|>©¾£|©\\b&Ô¾¨Á¨.ì¸ÑLìÕ(ûÆ;°p¨öu#sG6á+\\tl Þ>úÕ`Ê¥âêã,Ü.¦«è5 4eqoà×i(:»¿\\n?b¿EX)éR\\bÆ$Hs¼/TAhÿ ûn¸O£p((ùf¬ 0gR±¾µCI_X}ndv(¥%QgF'î2J0¤²âö]U´]0=Ïëd[ùWÈ_X(gÎµ¡ßÌd®¯ü\»Ã;^Ñô$C?\\b¶¨]ÖYDÃàÃß0¤Ðl(¸Dß^þUÖu=8«$¡)ÖÌaQpÂîÿ%Î\\fÿmöZk\\n®-üéóÀ£;,nhøÓM#vàWA]ç?ÚúÉ:Îòx¶ÝÁÀÀåÅàúðj&ËµéÜ+þÿ\\r½:ûvºJ9w¼T4(U1\\bnà9tÚÍ7>ÜZ½V%¯S@+Ë\\t²x.û¥isug]Õs¡C$*S`úûê>«,Ø¦Â7<F\\r¸bE9k?Kúû:òPfxÝ¥LÀtÅ­à¼ð¢&Ò8µÜ\\t+oÿ8µxäIÊ5V\\r4³+@\\b4ýÆâÒSãöI³Ã:åa¡¾Q E0ÄÍÁk/Ó^è·p6l\\nXñE¤zÖÔ«'ÿNÁRØ÷:[cy¥IDA*|.d%7ü©\\rõ1Mµå+xÁjÏø¸Ü{P6ØÑ¥ÂÔ¥G°ûåFdÓn\\rxãØYÜÄÚ[7 ¿Éädó@óG­ùOô±ûÁÊyC1Á1Þ°&Ëö=ÈÕ½!%Og$V?8òë6"è.·õí>´Äú·ÿÇ«ýøV\\t~¦&-\\fñ.½±û«Yh¹hÀ¸YÔGQ±ø!¡ÜTfWï²ô»«~ô ÊÎ7Ðô%î\\rfÿs¬>Ó»á'Éº\\rfÃÝÓç0p>áo®"¤WÌ!Àö`lÞPøR§æýhúN£Kñ´öBiS ©©¶1>5ioap\\nÓUðiræõF5,Ý¹HÑÚØ,®ÇÝÐL¯È6u\\r÷zôÝÉHÚ{÷';IÆý"´YNw|¯LBjZí³Ýf\u¿ÀE´/R*¸°\\f!ð²{Ô;Xr0F9]Ú/E}¥8¼É®kf|I~|VX7üSÞ©·þ¯\\râ¤i­íÈQ,eÊÆáhr°\\bZ0¾rÌ §0n«\\t½¥iÒÝ2H©Y®ËëÙJaØmØÁÐÌTï`Rì/rxfO^<$ÆG´#Ï¶îh%mYp\\bV\\b'4íî~\\fú0ÍWd¯ô2ÈÚ$iÿab\\nQÓO\ðHrÂõïF5n¹_âÁ¦¸\\r}\1Gj|Ð©§!cH§P&z[/8àC\\nÑD*(D¨KØÓ ýäôí@%9ÖÁÂ1àt\\t¡d¥uói÷îRZ¹ÿççUÿ¯\\b1ädüÕØ\\bÉø*ëÁx@:§\\f1FÁ5ÉÑÕ)F0a`Í*¤×ñ\\rà²pWaýG2+9ÔFÙ4¹¯êN=;º|åL\\f¦¯1ü½¹ª¥0C³)µI}p}ÛBóêw®×\\ráCKÝ+l@ÿ¾»ë. ÖIµå;ûþ[/±6z[iv¿« ÀAÛD°ÑÄ-&]¤VIéq4Ã³q÷}`öÏ´Hn$³KhÂ[Ä1/,Ãêvª{¬î^\\bÓü§¼¬fêF`¿¹µà$ñGR#£cAÄm0ÐV/ìøzúXÚÙLqÐÓÇY "ç}$´fáy~øêªDKî¢c\\n­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #83
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
    //   68: ldc 'k¶B(\\r{Piûñß1SÛ÷¦e×2D³ªægm'{ÅÛþKÇKXf£öË·jËáq_b´¢FÁËRÂ\\b½Y½¤­9'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #47
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
    //   129: putstatic burp/Zby9.a : [Ljava/lang/String;
    //   132: bipush #73
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zby9.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #45
    //   214: goto -> 244
    //   217: bipush #33
    //   219: goto -> 244
    //   222: bipush #86
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #59
    //   234: goto -> 244
    //   237: bipush #113
    //   239: goto -> 244
    //   242: bipush #43
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD183) & 0xFFFF;
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
      byte b1 = 48;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zby9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */