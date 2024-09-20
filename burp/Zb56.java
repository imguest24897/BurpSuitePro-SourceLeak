package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import net.portswigger.Zl0;
import net.portswigger.Zm2;

public class Zb56 extends Zbqc implements Zzit<Zeo2, Zb_>, Zm3g {
  private final Zt4u Z_;
  
  private final Zb_ ZW;
  
  private final Zskh Zk;
  
  private final Zm6v ZR;
  
  private final Zl0 ZI;
  
  private final Zr_4 ZmB;
  
  private final Zbqa Zi;
  
  private final TitledBorder Zr;
  
  private final TitledBorder Zn;
  
  private final TitledBorder ZA;
  
  private final TitledBorder Zm;
  
  private final TitledBorder ZB;
  
  private final TitledBorder ZK;
  
  private final TitledBorder ZV;
  
  private final Zbqc Zh;
  
  private final Zbup ZT;
  
  private Zb07 ZmZ;
  
  private boolean ZC;
  
  private boolean ZS;
  
  private Zm99 ZQ;
  
  private Zzdy ZmP;
  
  private Zzdy ZM;
  
  private Zzdy ZJ;
  
  private Zzdy Zf;
  
  private Zzdy Zl;
  
  private Zzdy Zg;
  
  private Zzdy Zt;
  
  private Zzdy ZH;
  
  private Zzdy Zmt;
  
  private Zzdy ZG;
  
  private Zzdy ZL;
  
  private Zzdy Zv;
  
  private Zzdy Zo;
  
  private Zzdy ZO;
  
  private Zzdy Zs;
  
  private Zzdy ZE;
  
  private Zzdy ZmL;
  
  private Zzdy Zmx;
  
  private Zzdy ZU;
  
  private Zzdy Za;
  
  private Zzdy Zc;
  
  private Zzdy Zb;
  
  private Box.Filler Zz;
  
  private Zm99 ZmT;
  
  private Zbqc ZmS;
  
  private Zbqc ZZ;
  
  private Zbqc ZP;
  
  private Zbqc Zw;
  
  private Zm9v ZX;
  
  private Zbqc Zu;
  
  private Zbqc ZF;
  
  private Zbqc ZD;
  
  private Zbqc Zy;
  
  private Zbqc Zx;
  
  private Zg85 ZN;
  
  private Zgff Zd;
  
  private Zgff ZY;
  
  private Zg85 Zj;
  
  private static int Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb56(Zb_ paramZb_, Zt4u paramZt4u, Zskh paramZskh, Zm6v paramZm6v, Zl0 paramZl0, Zr_4 paramZr_4, Zbqa paramZbqa) {
    this.ZW = paramZb_;
    this.Z_ = paramZt4u;
    this.Zk = paramZskh;
    this.ZR = paramZm6v;
    this.ZI = paramZl0;
    this.ZmB = paramZr_4;
    this.Zi = paramZbqa;
    this.ZS = true;
    paramZb_.ZGN();
    Zxl();
    Zxt();
    this.ZX.setVisible(false);
    this.Zr = (TitledBorder)this.Zw.getBorder();
    this.Zn = (TitledBorder)this.Zu.getBorder();
    this.ZA = (TitledBorder)this.ZF.getBorder();
    this.Zm = (TitledBorder)this.Zx.getBorder();
    this.ZB = (TitledBorder)this.ZmS.getBorder();
    this.ZK = (TitledBorder)this.ZZ.getBorder();
    this.ZV = (TitledBorder)this.ZP.getBorder();
    Zryi zryi = new Zryi(this, paramZr_4, paramZbqa);
    this.Zh = new Zgoa(zryi);
    this.ZT = new Zbup(this);
    this.ZT.setBorder(BorderFactory.createEmptyBorder(0, 13, 0, 13));
  }
  
  private void Zxt() {
    this.ZmL.setName(a(15014, 15433));
    this.Zmx.setName(a(15055, 3029));
    this.ZO.setName(a(15062, -25422));
    this.ZE.setName(a(15027, 12099));
    this.ZM.setName(a(15025, -20016));
    this.Zl.setName(a(15043, -28460));
    this.ZJ.setName(a(15018, 31173));
    this.Zf.setName(a(15087, -17494));
    this.ZH.setName(a(15057, 3818));
    this.Zv.setName(a(15082, 22874));
    this.Zo.setName(a(15094, -31604));
    this.Zg.setName(a(15075, -14670));
    this.ZL.setName(a(15101, 7090));
    this.Zmt.setName(a(15084, -29719));
    this.ZG.setName(a(15070, -15032));
    this.Zt.setName(a(15033, 11114));
    this.ZU.setName(a(15037, -13786));
    this.Za.setName(a(15064, 27514));
    this.Zc.setName(a(15016, -23332));
    this.Zb.setName(a(15078, -2966));
    this.ZmP.setName(a(15088, 32190));
    this.Zs.setName(a(15023, 27899));
    this.ZN.setName(a(15100, 2837));
    this.Zj.setName(a(15036, 19594));
    this.ZY.setName(a(15041, 16375));
  }
  
  public JComponent Zlj() {
    return this.ZT;
  }
  
  public void Zq(Zb07 paramZb07) {
    this.ZmZ = paramZb07;
    this.ZC = false;
  }
  
  public void ZlQ() {
    try {
      if (!this.ZC)
        ZxP(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public void Zlt() {
    Zm2.Zo(Zze0.PROXY_HTTP_HISTORY_FILTER_APPLIED);
    Zxb();
  }
  
  public void Zlm() {
    ZxP();
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      Arrays.<Component>stream(getComponents()).forEach(SwingUtilities::updateComponentTreeUI);
      if (this.ZV != null) {
        this.Zr.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zn.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZA.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.Zm.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZB.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZK.setTitleFont(Zt00.DEFAULT_FONT.ZV());
        this.ZV.setTitleFont(Zt00.DEFAULT_FONT.ZV());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  public boolean Zly() {
    return this.ZS;
  }
  
  public JComponent Zlh() {
    return this.Zh;
  }
  
  private void Zv(boolean paramBoolean) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.ZmL.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.ZM.setSelected(!paramBoolean);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      this.Zmx.setSelected(!paramBoolean);
      this.ZH.setSelected(paramBoolean);
      this.Zv.setSelected(paramBoolean);
      this.Zo.setSelected(paramBoolean);
      this.Zg.setSelected(paramBoolean);
      this.ZL.setSelected(paramBoolean);
      this.Zmt.setSelected(paramBoolean);
      this.Zt.setSelected(paramBoolean);
      this.ZG.setSelected(paramBoolean);
      this.ZU.setSelected(paramBoolean);
      this.Za.setSelected(paramBoolean);
      this.Zc.setSelected(paramBoolean);
      this.Zb.setSelected(paramBoolean);
      if (paramBoolean) {
        this.ZY.setText("");
        this.Zl.setSelected(false);
        this.ZJ.setSelected(false);
        this.Zf.setSelected(false);
        this.ZX.setVisible(false);
        this.Zs.setSelected(false);
        this.ZmP.setSelected(false);
        this.ZO.setSelected(false);
        this.ZE.setSelected(false);
        Zo((ActionEvent)null);
        this.Zd.setText("");
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void Zxb() {
    this.ZC = true;
    this.ZW.ZV0(this.ZmL.isSelected());
    this.ZW.ZVY(this.ZM.isSelected());
    this.ZW.ZVR(this.Zmx.isSelected());
    this.ZW.ZVQ(this.ZH.isSelected());
    this.ZW.ZVB(this.Zv.isSelected());
    this.ZW.ZVj(this.Zo.isSelected());
    this.ZW.ZVJ(this.Zg.isSelected());
    this.ZW.ZVi(this.ZL.isSelected());
    this.ZW.ZV6(this.Zmt.isSelected());
    this.ZW.ZVv(this.Zt.isSelected());
    this.ZW.ZVz(this.ZG.isSelected());
    this.ZW.ZVs(this.ZU.isSelected());
    this.ZW.ZVg(this.Za.isSelected());
    this.ZW.ZVO(this.Zc.isSelected());
    this.ZW.ZVS(this.Zb.isSelected());
    this.ZW.Zo(this.ZY.getText());
    this.ZW.ZVc(this.Zl.isSelected());
    this.ZW.ZVC(this.ZJ.isSelected());
    this.ZW.ZVh(this.Zf.isSelected());
    this.ZW.ZV3(this.Zs.isSelected());
    this.ZW.Zd(this.Zj.getText());
    this.ZW.ZV1(this.ZmP.isSelected());
    this.ZW.Zx(this.ZN.getText());
    this.ZW.ZVI(this.ZO.isSelected());
    this.ZW.ZVr(this.ZE.isSelected());
    this.ZW.ZQ(this.Zd.getText());
    this.ZW.Zw(Zzca.SETTINGS);
  }
  
  private void ZxP() {
    Zt2();
  }
  
  public void Zt2() {
    try {
      this.ZmL.setSelected(this.ZW.ZOU());
      this.ZM.setSelected(this.ZW.ZOi());
      this.Zmx.setSelected(this.ZW.ZOn());
      this.ZH.setSelected(this.ZW.ZOM());
      this.Zv.setSelected(this.ZW.ZOe());
      this.Zo.setSelected(this.ZW.ZOm());
      this.Zg.setSelected(this.ZW.ZOT());
      this.ZL.setSelected(this.ZW.ZOl());
      this.Zmt.setSelected(this.ZW.ZOB());
      this.Zt.setSelected(this.ZW.ZOx());
      this.ZG.setSelected(this.ZW.ZOr());
      this.ZU.setSelected(this.ZW.ZOt());
      this.Za.setSelected(this.ZW.ZO2());
      this.Zc.setSelected(this.ZW.ZOY());
      this.Zb.setSelected(this.ZW.ZO3());
      this.ZY.setText(this.ZW.ZOZ());
      this.ZJ.setSelected(this.ZW.ZOK());
      this.Zl.setSelected(this.ZW.ZOC());
      this.Zf.setSelected(this.ZW.ZOQ());
      this.Zs.setSelected(this.ZW.ZOq());
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZmP.setEnabled(!this.Zs.isSelected());
    this.Zj.setText(this.ZW.ZOS());
    this.ZmP.setSelected(this.ZW.ZOH());
    this.ZN.setText(this.ZW.ZO6());
    this.ZO.setSelected(this.ZW.ZOI());
    this.ZE.setSelected(this.ZW.ZO9());
    this.Zd.setText(this.ZW.ZO5());
    Zo((ActionEvent)null);
    ZC((ActionEvent)null);
    Zx1();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface ZK : ()V
    //   6: aload_0
    //   7: getfield ZmL : Lburp/Zzdy;
    //   10: aload_1
    //   11: sipush #15086
    //   14: sipush #-14726
    //   17: invokestatic a : (II)Ljava/lang/String;
    //   20: aload_0
    //   21: getfield ZmL : Lburp/Zzdy;
    //   24: invokevirtual isSelected : ()Z
    //   27: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   32: invokevirtual setSelected : (Z)V
    //   35: aload_0
    //   36: getfield ZM : Lburp/Zzdy;
    //   39: aload_1
    //   40: sipush #15089
    //   43: sipush #12317
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: aload_0
    //   50: getfield ZM : Lburp/Zzdy;
    //   53: invokevirtual isSelected : ()Z
    //   56: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   61: invokevirtual setSelected : (Z)V
    //   64: aload_0
    //   65: getfield Zmx : Lburp/Zzdy;
    //   68: aload_1
    //   69: sipush #14995
    //   72: sipush #-18289
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: aload_0
    //   79: getfield Zmx : Lburp/Zzdy;
    //   82: invokevirtual isSelected : ()Z
    //   85: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   90: invokevirtual setSelected : (Z)V
    //   93: aload_0
    //   94: getfield ZH : Lburp/Zzdy;
    //   97: aload_1
    //   98: sipush #15004
    //   101: sipush #-26568
    //   104: invokestatic a : (II)Ljava/lang/String;
    //   107: aload_0
    //   108: getfield ZH : Lburp/Zzdy;
    //   111: invokevirtual isSelected : ()Z
    //   114: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   119: invokevirtual setSelected : (Z)V
    //   122: aload_0
    //   123: getfield Zv : Lburp/Zzdy;
    //   126: aload_1
    //   127: sipush #15006
    //   130: sipush #3621
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: aload_0
    //   137: getfield Zv : Lburp/Zzdy;
    //   140: invokevirtual isSelected : ()Z
    //   143: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   148: invokevirtual setSelected : (Z)V
    //   151: invokestatic ZxL : ()I
    //   154: aload_0
    //   155: getfield Zo : Lburp/Zzdy;
    //   158: aload_1
    //   159: sipush #15090
    //   162: sipush #-27899
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: aload_0
    //   169: getfield Zo : Lburp/Zzdy;
    //   172: invokevirtual isSelected : ()Z
    //   175: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   180: invokevirtual setSelected : (Z)V
    //   183: aload_0
    //   184: getfield Zg : Lburp/Zzdy;
    //   187: aload_1
    //   188: sipush #14998
    //   191: sipush #12477
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: aload_0
    //   198: getfield Zg : Lburp/Zzdy;
    //   201: invokevirtual isSelected : ()Z
    //   204: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   209: invokevirtual setSelected : (Z)V
    //   212: aload_0
    //   213: getfield ZL : Lburp/Zzdy;
    //   216: aload_1
    //   217: sipush #15077
    //   220: sipush #16440
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: aload_0
    //   227: getfield ZL : Lburp/Zzdy;
    //   230: invokevirtual isSelected : ()Z
    //   233: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   238: invokevirtual setSelected : (Z)V
    //   241: aload_0
    //   242: getfield Zmt : Lburp/Zzdy;
    //   245: aload_1
    //   246: sipush #15044
    //   249: sipush #7903
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: aload_0
    //   256: getfield Zmt : Lburp/Zzdy;
    //   259: invokevirtual isSelected : ()Z
    //   262: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   267: invokevirtual setSelected : (Z)V
    //   270: aload_0
    //   271: getfield Zt : Lburp/Zzdy;
    //   274: aload_1
    //   275: sipush #15038
    //   278: sipush #-15694
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: aload_0
    //   285: getfield Zt : Lburp/Zzdy;
    //   288: invokevirtual isSelected : ()Z
    //   291: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   296: invokevirtual setSelected : (Z)V
    //   299: aload_0
    //   300: getfield ZG : Lburp/Zzdy;
    //   303: aload_1
    //   304: sipush #15032
    //   307: sipush #-5280
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: aload_0
    //   314: getfield ZG : Lburp/Zzdy;
    //   317: invokevirtual isSelected : ()Z
    //   320: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   325: invokevirtual setSelected : (Z)V
    //   328: aload_0
    //   329: getfield ZU : Lburp/Zzdy;
    //   332: aload_1
    //   333: sipush #15091
    //   336: sipush #-32014
    //   339: invokestatic a : (II)Ljava/lang/String;
    //   342: aload_0
    //   343: getfield ZU : Lburp/Zzdy;
    //   346: invokevirtual isSelected : ()Z
    //   349: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   354: invokevirtual setSelected : (Z)V
    //   357: aload_0
    //   358: getfield Za : Lburp/Zzdy;
    //   361: aload_1
    //   362: sipush #15080
    //   365: sipush #-366
    //   368: invokestatic a : (II)Ljava/lang/String;
    //   371: aload_0
    //   372: getfield Za : Lburp/Zzdy;
    //   375: invokevirtual isSelected : ()Z
    //   378: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   383: invokevirtual setSelected : (Z)V
    //   386: aload_0
    //   387: getfield Zc : Lburp/Zzdy;
    //   390: aload_1
    //   391: sipush #15039
    //   394: sipush #-30109
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: aload_0
    //   401: getfield Zc : Lburp/Zzdy;
    //   404: invokevirtual isSelected : ()Z
    //   407: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   412: invokevirtual setSelected : (Z)V
    //   415: aload_0
    //   416: getfield Zb : Lburp/Zzdy;
    //   419: aload_1
    //   420: sipush #15069
    //   423: sipush #-29400
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: aload_0
    //   430: getfield Zb : Lburp/Zzdy;
    //   433: invokevirtual isSelected : ()Z
    //   436: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   441: invokevirtual setSelected : (Z)V
    //   444: aload_0
    //   445: getfield ZY : Lburp/Zgff;
    //   448: aload_1
    //   449: sipush #15058
    //   452: sipush #13247
    //   455: invokestatic a : (II)Ljava/lang/String;
    //   458: aload_0
    //   459: getfield ZY : Lburp/Zgff;
    //   462: invokevirtual getText : ()Ljava/lang/String;
    //   465: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   470: invokevirtual setText : (Ljava/lang/String;)V
    //   473: istore_2
    //   474: aload_0
    //   475: getfield Zl : Lburp/Zzdy;
    //   478: aload_1
    //   479: sipush #15035
    //   482: sipush #16464
    //   485: invokestatic a : (II)Ljava/lang/String;
    //   488: aload_0
    //   489: getfield Zl : Lburp/Zzdy;
    //   492: invokevirtual isSelected : ()Z
    //   495: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   500: invokevirtual setSelected : (Z)V
    //   503: aload_0
    //   504: getfield ZJ : Lburp/Zzdy;
    //   507: aload_1
    //   508: sipush #15103
    //   511: sipush #-28899
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: aload_0
    //   518: getfield ZJ : Lburp/Zzdy;
    //   521: invokevirtual isSelected : ()Z
    //   524: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   529: invokevirtual setSelected : (Z)V
    //   532: aload_0
    //   533: getfield Zf : Lburp/Zzdy;
    //   536: aload_1
    //   537: sipush #15010
    //   540: sipush #-4511
    //   543: invokestatic a : (II)Ljava/lang/String;
    //   546: aload_0
    //   547: getfield Zf : Lburp/Zzdy;
    //   550: invokevirtual isSelected : ()Z
    //   553: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   558: invokevirtual setSelected : (Z)V
    //   561: aload_0
    //   562: getfield Zs : Lburp/Zzdy;
    //   565: aload_1
    //   566: sipush #15079
    //   569: sipush #-14867
    //   572: invokestatic a : (II)Ljava/lang/String;
    //   575: aload_0
    //   576: getfield Zs : Lburp/Zzdy;
    //   579: invokevirtual isSelected : ()Z
    //   582: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   587: invokevirtual setSelected : (Z)V
    //   590: aload_1
    //   591: sipush #15048
    //   594: sipush #21571
    //   597: invokestatic a : (II)Ljava/lang/String;
    //   600: invokeinterface Ze : (Ljava/lang/String;)Ljava/util/List;
    //   605: astore_3
    //   606: aload_3
    //   607: ifnull -> 627
    //   610: aload_3
    //   611: ldc ','
    //   613: invokestatic Zf : (Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    //   616: astore #4
    //   618: aload_0
    //   619: getfield Zj : Lburp/Zg85;
    //   622: aload #4
    //   624: invokevirtual setText : (Ljava/lang/String;)V
    //   627: aload_0
    //   628: getfield ZmP : Lburp/Zzdy;
    //   631: aload_0
    //   632: getfield Zs : Lburp/Zzdy;
    //   635: invokevirtual isSelected : ()Z
    //   638: ifne -> 681
    //   641: aload_1
    //   642: sipush #14993
    //   645: sipush #25813
    //   648: invokestatic a : (II)Ljava/lang/String;
    //   651: aload_0
    //   652: getfield ZmP : Lburp/Zzdy;
    //   655: invokevirtual isSelected : ()Z
    //   658: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   663: ifeq -> 681
    //   666: goto -> 673
    //   669: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   672: athrow
    //   673: iconst_1
    //   674: goto -> 682
    //   677: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   680: athrow
    //   681: iconst_0
    //   682: invokevirtual setSelected : (Z)V
    //   685: aload_1
    //   686: sipush #14999
    //   689: sipush #20910
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: invokeinterface Ze : (Ljava/lang/String;)Ljava/util/List;
    //   700: astore_3
    //   701: aload_3
    //   702: ifnull -> 722
    //   705: aload_3
    //   706: ldc ','
    //   708: invokestatic Zf : (Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;
    //   711: astore #4
    //   713: aload_0
    //   714: getfield ZN : Lburp/Zg85;
    //   717: aload #4
    //   719: invokevirtual setText : (Ljava/lang/String;)V
    //   722: aload_0
    //   723: getfield ZO : Lburp/Zzdy;
    //   726: aload_1
    //   727: sipush #15072
    //   730: sipush #23625
    //   733: invokestatic a : (II)Ljava/lang/String;
    //   736: aload_0
    //   737: getfield ZO : Lburp/Zzdy;
    //   740: invokevirtual isSelected : ()Z
    //   743: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   748: invokevirtual setSelected : (Z)V
    //   751: aload_0
    //   752: getfield ZE : Lburp/Zzdy;
    //   755: aload_1
    //   756: sipush #15092
    //   759: sipush #10076
    //   762: invokestatic a : (II)Ljava/lang/String;
    //   765: aload_0
    //   766: getfield ZE : Lburp/Zzdy;
    //   769: invokevirtual isSelected : ()Z
    //   772: invokeinterface ZC : (Ljava/lang/String;Z)Z
    //   777: invokevirtual setSelected : (Z)V
    //   780: aload_0
    //   781: getfield Zd : Lburp/Zgff;
    //   784: aload_1
    //   785: sipush #15059
    //   788: sipush #-16552
    //   791: invokestatic a : (II)Ljava/lang/String;
    //   794: aload_0
    //   795: getfield Zd : Lburp/Zgff;
    //   798: invokevirtual getText : ()Ljava/lang/String;
    //   801: invokeinterface Zm : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   806: invokevirtual setText : (Ljava/lang/String;)V
    //   809: aload_1
    //   810: invokeinterface Zb : ()Z
    //   815: ifeq -> 839
    //   818: aload_0
    //   819: aconst_null
    //   820: invokevirtual Zo : (Ljava/awt/event/ActionEvent;)V
    //   823: aload_0
    //   824: aconst_null
    //   825: invokevirtual ZC : (Ljava/awt/event/ActionEvent;)V
    //   828: aload_0
    //   829: invokevirtual Zx1 : ()V
    //   832: goto -> 839
    //   835: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   838: athrow
    //   839: invokestatic Zwu : ()[Lburp/Zbqc;
    //   842: ifnonnull -> 859
    //   845: iinc #2, 1
    //   848: iload_2
    //   849: invokestatic ZL : (I)V
    //   852: goto -> 859
    //   855: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   858: athrow
    //   859: return
    // Exception table:
    //   from	to	target	type
    //   627	666	669	java/util/regex/PatternSyntaxException
    //   641	677	677	java/util/regex/PatternSyntaxException
    //   722	832	835	java/util/regex/PatternSyntaxException
    //   839	852	855	java/util/regex/PatternSyntaxException
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Zh(a(15021, -30247), this.ZmL.isSelected());
    paramZg4j.Zh(a(15093, 8515), this.ZM.isSelected());
    paramZg4j.Zh(a(15030, -1118), this.Zmx.isSelected());
    paramZg4j.Zh(a(15076, 3554), this.ZH.isSelected());
    paramZg4j.Zh(a(15097, 22446), this.Zv.isSelected());
    paramZg4j.Zh(a(15068, 11253), this.Zo.isSelected());
    paramZg4j.Zh(a(15049, 5127), this.Zg.isSelected());
    paramZg4j.Zh(a(15074, -30171), this.ZL.isSelected());
    paramZg4j.Zh(a(15061, 24286), this.Zmt.isSelected());
    paramZg4j.Zh(a(15102, 19168), this.Zt.isSelected());
    paramZg4j.Zh(a(15005, -23153), this.ZG.isSelected());
    paramZg4j.Zh(a(15056, 7635), this.ZU.isSelected());
    paramZg4j.Zh(a(15026, 22110), this.Za.isSelected());
    paramZg4j.Zh(a(15063, -24229), this.Zc.isSelected());
    paramZg4j.Zh(a(15067, 14162), this.Zb.isSelected());
    paramZg4j.Za(a(15073, 27229), this.ZY.getText());
    paramZg4j.Zh(a(15098, -23961), this.Zl.isSelected());
    paramZg4j.Zh(a(15065, 5346), this.ZJ.isSelected());
    paramZg4j.Zh(a(15028, 23433), this.Zf.isSelected());
    paramZg4j.Zh(a(15012, -10164), this.Zs.isSelected());
    Zzqw zzqw1 = paramZg4j.ZP(a(15050, -24928));
    int i = ZxE();
    String[] arrayOfString1 = this.Zj.getText().split(",");
    int j = arrayOfString1.length;
    int k = 0;
    while (k < j) {
      String str1 = arrayOfString1[k];
      String str2 = str1.trim();
      try {
        if (!str2.isEmpty())
          zzqw1.Zx(new Zzqs(str2)); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      k++;
      if (i == 0)
        break; 
    } 
    paramZg4j.Zh(a(15096, 18951), this.ZmP.isSelected());
    Zzqw zzqw2 = paramZg4j.ZP(a(15042, -30240));
    String[] arrayOfString2 = this.ZN.getText().split(",");
    k = arrayOfString2.length;
    byte b = 0;
    while (b < k) {
      String str1 = arrayOfString2[b];
      String str2 = str1.trim();
      try {
        if (!str2.isEmpty())
          zzqw2.Zx(new Zzqs(str2)); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      b++;
      if (i == 0)
        break; 
    } 
    paramZg4j.Zh(a(15081, 21544), this.ZO.isSelected());
    paramZg4j.Zh(a(15053, -333), this.ZE.isSelected());
    paramZg4j.Za(a(15009, -1308), this.Zd.getText());
  }
  
  private void Zx1() {
    // Byte code:
    //   0: invokestatic ZxE : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zl : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 66
    //   14: aload_0
    //   15: getfield ZY : Lburp/Zgff;
    //   18: invokevirtual getText : ()Ljava/lang/String;
    //   21: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   24: pop
    //   25: aload_0
    //   26: getfield ZX : Lburp/Zm9v;
    //   29: iconst_0
    //   30: invokevirtual setVisible : (Z)V
    //   33: aload_0
    //   34: iconst_1
    //   35: putfield ZS : Z
    //   38: goto -> 86
    //   41: astore_2
    //   42: aload_2
    //   43: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   46: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   49: aload_0
    //   50: getfield ZX : Lburp/Zm9v;
    //   53: iconst_1
    //   54: invokevirtual setVisible : (Z)V
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield ZS : Z
    //   62: iload_1
    //   63: ifne -> 86
    //   66: aload_0
    //   67: getfield ZX : Lburp/Zm9v;
    //   70: iconst_0
    //   71: invokevirtual setVisible : (Z)V
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield ZS : Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/util/regex/PatternSyntaxException;)Ljava/util/regex/PatternSyntaxException;
    //   85: athrow
    //   86: aload_0
    //   87: getfield ZmZ : Lburp/Zb07;
    //   90: ifnull -> 109
    //   93: aload_0
    //   94: getfield ZmZ : Lburp/Zb07;
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
  
  public Zr1m Zlr() {
    return this.ZR.ZL(this);
  }
  
  private void ZW(Zzt9 paramZzt9) {
    paramZzt9.Zan(this.ZmL.isSelected());
    paramZzt9.Zao(this.ZM.isSelected());
    paramZzt9.ZaC(this.Zmx.isSelected());
    paramZzt9.Zal(this.ZH.isSelected());
    paramZzt9.ZaZ(this.Zv.isSelected());
    paramZzt9.Zaq(this.Zo.isSelected());
    paramZzt9.Zab(this.Zg.isSelected());
    paramZzt9.Zai(this.ZL.isSelected());
    paramZzt9.ZaU(this.Zmt.isSelected());
    paramZzt9.Zah(this.Zt.isSelected());
    paramZzt9.Zas(this.ZG.isSelected());
    paramZzt9.Zaa(this.ZU.isSelected());
    paramZzt9.Zaw(this.Za.isSelected());
    paramZzt9.Za7(this.Zc.isSelected());
    paramZzt9.ZaR(this.Zb.isSelected());
    paramZzt9.ZHv(this.ZY.getText());
    paramZzt9.ZaI(this.Zl.isSelected());
    paramZzt9.ZaG(this.ZJ.isSelected());
    paramZzt9.ZaQ(this.Zf.isSelected());
    paramZzt9.Zat(this.Zs.isSelected());
    paramZzt9.ZHK(this.Zj.getText());
    paramZzt9.ZaB(this.ZmP.isSelected());
    paramZzt9.ZHd(this.ZN.getText());
    paramZzt9.ZaM(this.ZO.isSelected());
    paramZzt9.ZaE(this.ZE.isSelected());
    paramZzt9.ZHF(this.Zd.getText());
  }
  
  private void Zxl() {
    this.ZD = new Zbqc();
    this.Zw = new Zbqc();
    this.ZmL = new Zzdy();
    this.ZM = new Zzdy();
    this.Zmx = new Zzdy();
    this.ZF = new Zbqc();
    this.ZU = new Zzdy();
    this.Za = new Zzdy();
    this.Zc = new Zzdy();
    this.Zb = new Zzdy();
    this.Zu = new Zbqc();
    this.ZH = new Zzdy();
    this.ZL = new Zzdy();
    this.Zv = new Zzdy();
    this.Zmt = new Zzdy();
    this.Zo = new Zzdy();
    this.Zt = new Zzdy();
    this.Zg = new Zzdy();
    this.ZG = new Zzdy();
    this.Zy = new Zbqc();
    this.Zx = new Zbqc();
    this.ZY = new Zgff();
    this.Zl = new Zzdy();
    this.ZJ = new Zzdy();
    this.ZX = new Zm9v();
    this.Zf = new Zzdy();
    this.ZmS = new Zbqc();
    this.Zs = new Zzdy();
    this.Zj = new Zg85();
    this.ZmP = new Zzdy();
    this.ZN = new Zg85();
    this.ZZ = new Zbqc();
    this.ZO = new Zzdy();
    this.ZE = new Zzdy();
    this.ZP = new Zbqc();
    this.Zd = new Zgff();
    this.ZmT = new Zm99();
    this.ZQ = new Zm99();
    this.Zz = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 10, 0, 10, 0 };
    setLayout(gridBagLayout1);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 10, 0, 10, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZD.setLayout(gridBagLayout2);
    this.Zw.setBorder(BorderFactory.createTitledBorder(a(15013, 11461)));
    this.Zw.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZmL.setText(a(15051, -24495));
    this.Zw.add(this.ZmL);
    this.ZM.setText(a(15052, 21453));
    this.Zw.add(this.ZM);
    this.Zmx.setText(a(15054, 5323));
    this.Zw.add(this.Zmx);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.ZD.add(this.Zw, gridBagConstraints);
    this.ZF.setBorder(BorderFactory.createTitledBorder(a(14992, 25474)));
    this.ZF.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZU.setText(a(15085, 12757));
    this.ZF.add(this.ZU);
    this.Za.setText(a(15015, 25083));
    this.ZF.add(this.Za);
    this.Zc.setText(a(15071, -29930));
    this.ZF.add(this.Zc);
    this.Zb.setText(a(15022, -5167));
    this.ZF.add(this.Zb);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.ZD.add(this.ZF, gridBagConstraints);
    this.Zu.setBorder(BorderFactory.createTitledBorder(a(15029, -16357)));
    this.Zu.setLayout(new GridLayout(4, 0, 0, 5));
    this.ZH.setText(a(15020, -24371));
    this.Zu.add(this.ZH);
    this.ZL.setText(a(15007, -25611));
    this.Zu.add(this.ZL);
    this.Zv.setText(a(15024, -14899));
    this.Zu.add(this.Zv);
    this.Zmt.setText(a(15011, 23478));
    this.Zu.add(this.Zmt);
    this.Zo.setText(a(15095, -1053));
    this.Zu.add(this.Zo);
    this.Zt.setText(a(15017, -7441));
    this.Zu.add(this.Zt);
    this.Zg.setText(a(14996, -18642));
    this.Zu.add(this.Zg);
    this.ZG.setText(a(15019, -14613));
    this.Zu.add(this.ZG);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.33D;
    this.ZD.add(this.Zu, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZD, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 10, 0, 10, 0, 10, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.Zy.setLayout(gridBagLayout3);
    this.Zx.setBorder(BorderFactory.createTitledBorder(a(15040, -26441)));
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout4.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.Zx.setLayout(gridBagLayout4);
    this.ZY.setColumns(20);
    this.ZY.ZH(Zlw9.SEARCH_TERM);
    this.ZY.addKeyListener(new Zm3m(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Zx.add(this.ZY, gridBagConstraints);
    this.Zl.setText(a(15008, -12003));
    this.Zl.addActionListener(new Zrx2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zx.add(this.Zl, gridBagConstraints);
    this.ZJ.setText(a(15034, 16795));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.Zx.add(this.ZJ, gridBagConstraints);
    this.ZX.setHorizontalAlignment(4);
    this.ZX.setText(a(15002, 21516));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1536;
    this.Zx.add(this.ZX, gridBagConstraints);
    this.Zf.setText(a(15031, -17938));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weightx = 1.0D;
    this.Zx.add(this.Zf, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zy.add(this.Zx, gridBagConstraints);
    this.ZmS.setBorder(BorderFactory.createTitledBorder(a(14997, -16883)));
    this.ZmS.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout5 = new GridBagLayout();
    gridBagLayout5.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout5.rowHeights = new int[] { 0, 10, 0 };
    this.ZmS.setLayout(gridBagLayout5);
    this.Zs.setText(a(15060, 12317));
    this.Zs.addActionListener(new Zbqn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZmS.add(this.Zs, gridBagConstraints);
    this.Zj.setColumns(15);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZmS.add(this.Zj, gridBagConstraints);
    this.ZmP.setText(a(15099, -22042));
    this.ZmP.addActionListener(new Zzhz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZmS.add(this.ZmP, gridBagConstraints);
    this.ZN.setColumns(15);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZmS.add(this.ZN, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zy.add(this.ZmS, gridBagConstraints);
    this.ZZ.setBorder(BorderFactory.createTitledBorder(a(15046, 21942)));
    this.ZZ.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout6 = new GridBagLayout();
    gridBagLayout6.columnWidths = new int[] { 0 };
    gridBagLayout6.rowHeights = new int[] { 0, 10, 0 };
    this.ZZ.setLayout(gridBagLayout6);
    this.ZO.setText(a(15047, -4741));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.ZZ.add(this.ZO, gridBagConstraints);
    this.ZE.setText(a(15083, 32001));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.ZZ.add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zy.add(this.ZZ, gridBagConstraints);
    this.ZP.setBorder(BorderFactory.createTitledBorder(a(14994, -3004)));
    this.ZP.setRequestFocusEnabled(false);
    GridBagLayout gridBagLayout7 = new GridBagLayout();
    gridBagLayout7.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout7.rowHeights = new int[] { 0 };
    this.ZP.setLayout(gridBagLayout7);
    this.Zd.setColumns(5);
    this.Zd.ZH(Zlw9.PORT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZP.add(this.Zd, gridBagConstraints);
    this.ZmT.setText(a(15045, -26598));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZmT, gridBagConstraints);
    this.ZQ.setText(a(15066, -6051));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    this.ZP.add(this.ZQ, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 0.25D;
    this.Zy.add(this.ZP, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 3;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zz, gridBagConstraints);
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    Zx1();
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZmP.setEnabled(!this.Zs.isSelected());
  }
  
  private void ZO(KeyEvent paramKeyEvent) {
    Zx1();
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zs.setEnabled(!this.ZmP.isSelected());
  }
  
  public static void ZL(int paramInt) {
    Zq = paramInt;
  }
  
  public static int ZxL() {
    return Zq;
  }
  
  public static int ZxE() {
    int i = ZxL();
    try {
      if (i == 0)
        return 7; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
  
  static {
    // Byte code:
    //   0: bipush #109
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '/¸ÿþß»(¥êðP«´Ã¶½¹8Þx­Kn*×¬¼íîD^sÏ¬©C¯éPL'Kã_\\nÐo#7þÇ·aÈ¨(ÆÝôUêËFãÓÿ:{{9X¤§Â6ægÎm\\tÊ\\tqèN)õ=¤NÒ±#ÏçøOsQË[Tð÷ÂZ.=þæëFÐÄµÿé\AÅ}ó¡zAùa´s¥ÆRþA¥ç/÷!bj¨ÖÛíÜ\\r·£ô7¡=,½lñõGGki }Â5ÙJMÒÔâÖ?¬Ü»¢­ÎMÁÝ¡·È\\bB$Ëé;¢®$jOI9_©ñÜxãvMK­«å£&õaÏb]ÓSðgh×#Ã¾â/D¼­Ë¯')¥ßß·ßBq¢²SNp .`ny®èlKGÁ=\\fk8Ì}H.VN-¿±+OjhIÏy/µdýO$XêJ×D³¿O-s]vßWÖeÌ¯Ì¾I\\b¼t!Ç¯§Æ\>­+%èÑ1ºÌ³¸w°^:É©¹½9eÝ´¡r7e¨Eä2ãÒQÁWäÝØ¶míª\\n­YÁ²\\nÕþËåúÑfg68gÍ8mÄ:kû9è^äHg\\r.ñ¤ã1\\r:û2õKÈR7s<ôI_¦pØ¼Ò}æ«LjmÛÙò©-©Líqß²h[ZP¢ä`Pô*25|"\\tzÈo}>Ígñ¨3pò&k ´õãîr»ß½PqÙ1ùæ'Æ\\rÙªÂÖ£Þ¶ ëØA6³»ªkÊM`sÊ¦ÀøqVFxðk­Ø²tzñA2W^ð"X<r~Í4½Dç^fJi8 }O×¨px8!>þ]'³ï+~±ñÎtý:óÁÛ´ïTXýîÐ<\\r8Ìð:\\nÁY"Â 9ý¤DJBÒrÿ?Ò|'S+hU6ÿJe±´BzbðrÇÝ!Öf\\t{Û»Ï²v\\r¥¹®Þõ¿m\\rúåR+AÕ¯Ünjî@0×»ÑøF¼FÒ{úÜ)ç£*îÄxé"¦9\\b_@aZeJvÓ6b²Õo99ßiß·µS:þz>ÞªnïM\\b#Ðpäu®!8.[ÝqRh2t¿\\r\\f¥Cä¾Ve»ìMAÑi° `?"ÞA+0p½0n]è(pG«-á_èDÏ)>ª\\nO¨¯mTqFìKèl¿)¯]^+ÿÚç/e×/EÛq \\f²$Ö¹\\bÂØ©et#Æ>¦Ì9pavU7)!atúÞ'ªÉÎDðá1ä²Éi!Y½4¸JLl\\nà¹¥£N aÆÙÊ^D*djW{Êñ(z\\bÆ¹Êêñ&Ðb°Ý`«ImrµT_Ìà÷®¤OLÓ¤áéàE]"¦2ïhÄ×X4¸Ö&\\tU$Ì©R\\rù7Z|P\\fîDu´øª%£G<½Hwp7É0vAÖ23 y:¬¼Ub|Ö°Â%mÜìT)¤N1;RþfP¢®<gNôJvÔÜ)âÜß`ÿÎ¯o`H}$4ùZG\\nbL:²io÷wö´G»g(Oy§z¿(fpz\Å§¸6§úò¾¼ÊtfõíKV8Tã$Õä¢½ðÓÍFilE?îg3\\f}õ-q[Ë,!5VzQ28¯'7PFBE¾bÿImÈc\\tï\\n¡XÐO´:N7©÷hc9FíÎ¥Ã]XÏØ»;3jï[C^Ð:Y?¿þTãÕ{Ü0×¶ÚjiMï´}°B\\t.{§9ÎxÁÑäBå±?Íã{,¹¶F§åoÁ1@gá&êÙ¡\\b,u>2¹)[Rî3%æø·dºCââIxÙÒä"å½?LãK,¿vF¿ålÁQ@k`&7êßa\\b4ug#?õâØqÐ©TPÆõpXlý!\lÞBÌýx¼"d\{(\\bIÑê7w~bZã¿×ÄÑ9ÈÙð}fÖ5Y]/iµû,þ ®)NXsãäqês´én%¹=9\\r¶ß¹@wq®¾¨ÚÁÑ\\n$RÛË)u-w:0H*O=^06ÄNHH¬x¸jN5,ó¸P.Ð_âó(ç7YÑòa{¯·å3(Ñ=ñß}ë0tÚA;n´¸¦Õl\\n\\fäð±KlÌ¨c©B\\fª{!ö\\bQocytÿD2áZ$QmlÕôC§°¤ÀdB¡ÓI¦Q ¿bÌb *É1 "ÝzÉáØb 9NÚÑAÓn´¹Ì¦[½\\n6ä·±mKqo¨àc'BÝ!ª<!\\b]o:(rF70fZ§0¸É£³Ó«`,÷VjÛ\\tv¨Øt3XÉ8éb\ÓÑ\\b±$¶úÌ¶¹²ä4<ÎÃÔñ_¹:Ê#:8}0atµXñSþ³í~ËA§ÕN²zèýãÂ7ûje¤êì$dwä,ÌSëÅ\\fÏ²º[!P\\n3üi®íëd&©GXª®Aèü¢TP9Ù*Ò"½ LKR¿Ðv¿¿Úl&Q¼k`Õ7ßHañ4Je}Â>&¨¨b5ê&¯[¹¤yÔ"ÀR\\b9Ex°ÿäå\\t?Úã,å=FÖåAÁô@ßö&åê*\\b]u2Ø>¹>[°îo%møÆdC!â){O5:ÄçÐ¸é ºrÌ¹ºüa%½O:.RÝPRL2ð¿\\f·C¦¾NVl» ìiAUi  r?`ÞÖA"00*|++\\r×hõÙÐ\\fÝúÁ»àwJ' Ìï÷kiÂíµÔî¦Wåá;FàýíhâAìÁ0 Îa¢\ ë áéãJç:=^¿Ñ|»ö]*¯¥&.E`Ù! YÈSXàjûcF¶R.R±Óù?>{âì1ß>ä=H\\tÂ¹­'$½¥>e´u×y+5ä<"ÒiÁPärÝÄ¶îíó¤\\nlYù²ÕzÚkï!{ã¤¾1B¶V±~º°Ò³¹'/þ\\fÿå,Þ%îwµ\AîÄa#lûs÷_\\b^°ufMêæK#$=y¿ûWw8I¸±³àäé,n¢ÇçI¾©{ÍÀËæ V:LO»!sòé@úàQÛ¶ þL=Ã&òIDÀ¨|ÆíxõK³âg~? Â32Ñ"jûM¸ÜÎ=Û&$AÆ§ZK]®Ôf$´Ö=ÚóéVé=Þ~óKìºYS[èós¨ô;ãJç4 þEU¥ÜµÈluhÚe"'"ÉB¶-L¾\\n3Î¬¢rD})EKÈ£¤t¼¦^|> ú'ÉºXSÉ:ïÝ|þîD TlËtµüEkPu~7öe\\n¹·.p`¶ÜGö¼åu+tH¢VzêCUZb*3kº/èóÚè>)8=Nå±ÅÏ;c<Q[íðÀÂ`.¦þúæFHÐ}ó@8B#ü( ¯7µh'`°7/¾`r7QØ0ò@&q=­\±IfÿV~o¾ÀLeUÔëpt5 Îi!5P?8d¸²Î\\rü"òûëZ©ïàRøz\\t\\tYXÒ¡öò\\bÄ=a·,*ý5Ð4h\sêÄnA.fÂ/Í@k$mFô¥MT@ùÂy:ÐÔºS¢i&\\t!lw1Ð\\r!kãÏ¼3Ô;«mõDøðfçOí"í'ÓAúÝÃ1ò+(^+ò¿Ä¾½sßÜ2åenÄå!ê¸ Ñ]¼V|¤Ø$Áüüóî*\\td9½g¯öûjÎ+Ý§ë"çÅYÉ¢½ÏPsÛ-BÒBÑþ¤±HÏe)¨ÝçÙw?[m $ú´G±DåêÇ¯säLO~Äöòßºt%c»´þ$4©àY1isì ºèMôúâ=çîËã=5h·¦s~ëï2½2 N9dvÔ{ÜâßÿÑ¯ìoHò$ÅùdGÍb´:­i÷y´¶¤U+¼É²º;ÂgÌMcc¸¸Ô9[s\\bGè±æ2X#®ø9bû4>\\fÊ÷bÐuÀ4àhJ!×Jk77Ôbsyìà/É×«âoµÍÒj8íOùä¾¦h¥\\t?SB9;oáõ&WäO³I>mÊ:R÷Í"ågV0ÜÚ`åÕëÇR]M>ûH¿1Éû!eÍêÁ$ÁÃäºÌ±ÅGsÏ²ºï!Æ\\ná¦Ì ÿU;·êEè@z×WàZ2úÅ¤¼VÇbé1½k,xy*|ú§ºÎ"Zûu¦õñ=SåÏymÕyý·f²·Õ¤Â¿RïP*æ¾r\\nþÈÉx×\\nfzT_VøE¡ 1æ>Æ.ø¡ÌV9c]çºÞ-ºÑ­ÞÖhM5,Æ6£â}Ï3JÖà/ð¾=VFlúE[î¤æÓ¬ÄóµåË`Mª¤#¯JÌx%QgÈ¦­3¶êBí},ÂÑc$¿4?'Æ ÌþâíÓ9Ì$N<|õCìA!f-;OñÙ×}Ö©YÎ/µµ,7 )iXñsäâêgsÕ´ n¹Ì\\r=Éð ÎÂnáXÉ²\\bNÇ½JNs.ßt|P2{Cwr\\bxê¦âÆ}¹-ëÝ<1Pj$t^3ÊqÚ®tëü9G¶HU#»×ðLQÕ5\\nõ®®#û_w8§Ù°6×)Èw¼ó»Fn kDA(-ÉJôfÖ9_êÞ¹ßõ«hïXà&¹,OÄcm\\bwk¶ôû x~ZOæjÁÇø@¯4óU­ôåpI0Ï 0â$Í{£T´YôÛ;ßIE$®¾=!õçÃ¢Iªn\\r}ÓÊ\\fîÅ½u¯]$·_5ó¼·%°^ÄÆÓQýL$y§(vÚpl°°µðz)7ð!>)]IRª±QôzHÕ`Î¤.ì¼(MQë^äùÝÉàî±xó§4!å>\\nÏYãÂ: >ýDDJÁ¢rñ?|S+ùhI6ÿ:e¿´IbýrGÌ4Õ wSKÿùáXmCd\\tGjÑ<=åLÒÍL<'é»ä»F"+DîtñÌsr Ø´J#N ¤/è@R90?Å¹ÁÎ»"s>]AYì°àÊd¶úøfÅV@Ò|Ã¢÷]åö÷!TQ<x\\r#¡¦èÎ2í÷[GJ÷×ZÊêüVÅà_iIÆGNfWyíTÿé7ãÐn°AV¨Ðü\çòÝ[¿©§ãnýhÎ ByWÓ`wzÕaöê&E°1/¥1Þÿ×³|Óî¢xÁ&À>àx3ÄG:f]Ô±spw;m©Qeü6c²AÍUeÒíÐ°l-£®\\t-9Ñ¾\\bT¾´Íä:ñeçV(~À¿8]ß\\nÙüÒ¬]2Áò8\\nX¨MmÐTq7ì¶KLè,l¨hu$]òp+Ôÿbç8e5/Ûú z"²á¨Á¾êÀ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #28
    //   20: istore_1
    //   21: iconst_0
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZL : (I)V
    //   27: bipush #55
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'þÆ/*äë\\fìö2\\nþ­øIÚZÎIFK-÷v85¶ÂJ)N%Paj ý|­³õL£¸m[ø¹`\\r\\rÅO%ÇwÓà0ñP:'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #64
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #83
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
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zb56.a : [Ljava/lang/String;
    //   136: bipush #109
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zb56.b : [Ljava/lang/String;
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
    //   216: bipush #127
    //   218: goto -> 248
    //   221: bipush #95
    //   223: goto -> 248
    //   226: bipush #55
    //   228: goto -> 248
    //   231: bipush #100
    //   233: goto -> 248
    //   236: bipush #37
    //   238: goto -> 248
    //   241: bipush #66
    //   243: goto -> 248
    //   246: bipush #51
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
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3AF6) & 0xFFFF;
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
      byte b1 = 4;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb56.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */