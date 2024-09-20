package burp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zr7c extends Zrh7 {
  private final Zt4u Zc;
  
  private final Zkrw ZLc;
  
  private final Zbw_<?> ZLt;
  
  private final Zgjf Zu;
  
  private final Window Zr;
  
  private final Zs9s ZW;
  
  private final boolean ZLp;
  
  private final Zkl6 ZP;
  
  private final Ztwv Zy;
  
  private final Zr_4 Zj;
  
  private final Zr_4 ZLm;
  
  private final Zlb7 ZY;
  
  private final boolean ZJ;
  
  private final Zbwh ZLW;
  
  private Zm99 ZLy;
  
  private Zm99 ZLT;
  
  private Zm99 ZLI;
  
  private Zm99 ZLg;
  
  private Zm2o ZO;
  
  private Zbqc ZLk;
  
  private Zbup ZD;
  
  private ButtonGroup ZLo;
  
  private ButtonGroup Zx;
  
  private ButtonGroup Zf;
  
  private Zm2o ZLF;
  
  private Zbqc ZL0;
  
  private Zbup ZQ;
  
  private Zzdy ZL3;
  
  private Zzdy ZL2;
  
  private Zzdy ZN;
  
  private Ze01 ZH;
  
  private Ze01 ZL4;
  
  private Ze01 ZS;
  
  private Ze01 Zm;
  
  private Ze01 ZL;
  
  private Zedd ZLK;
  
  private Zbqc ZLn;
  
  private Zl8w ZA;
  
  private Zl8w ZLH;
  
  private Zl8w Zk;
  
  private Zl8w Zt;
  
  private Zl8w Zp;
  
  private Zbqc ZI;
  
  private Zbup ZE;
  
  private Zm99 Zh;
  
  private Zm99 ZLY;
  
  private Zm99 Zg;
  
  private Zm99 ZT;
  
  private Zbqc ZL_;
  
  private Zbqc ZV;
  
  private Zbqc ZU;
  
  private Zbqc ZLD;
  
  private Zbqc ZLz;
  
  private Zm9v Zv;
  
  private Zm9v ZLe;
  
  private Zm9v ZG;
  
  private Zm9v ZK;
  
  private Zm9v Ze;
  
  private Zm99 Zs;
  
  private Zm9v Zl;
  
  private Zm9v ZR;
  
  private Zm9v ZLB;
  
  private Zm99 ZX;
  
  private Zmg2 ZF;
  
  private Zmg2 ZB;
  
  private Zmg2 Z_;
  
  private Zmg2 ZLi;
  
  private Zmg2 Zn;
  
  private Zmg2 Zb;
  
  private Zmg2 ZLa;
  
  private Zmg2 Zo;
  
  private Zmg2 ZLJ;
  
  private Zm2o ZLh;
  
  private Zbqc ZLZ;
  
  private Zbup Zi;
  
  private Zm2o ZLL;
  
  private Zlte ZLC;
  
  private Zmyw Za;
  
  private Zbup Zd;
  
  private Zm2o ZZ;
  
  private Zbqc ZLP;
  
  private Zl8w ZLM;
  
  private Zbup Zz;
  
  private Zgff ZLx;
  
  private Zgff ZM;
  
  private Zgff Zw;
  
  private Zgff ZLS;
  
  private Zgff ZLj;
  
  private Zgff ZL7;
  
  private static int[] ZL5;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr7c(Zt4u paramZt4u, Zkrw paramZkrw, Zbw_<?> paramZbw_, Zgjf paramZgjf, Window paramWindow, Zs9s paramZs9s, boolean paramBoolean1, Zkl6 paramZkl6, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zlb7 paramZlb7, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: aload #5
    //   3: iconst_1
    //   4: getstatic burp/Zzv7.CONFIG_PANEL_LISTENERS_POPUP : Lburp/Zzv7;
    //   7: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   10: invokestatic Zv : ()[I
    //   13: aload_0
    //   14: aload_1
    //   15: putfield Zc : Lburp/Zt4u;
    //   18: aload_0
    //   19: aload_2
    //   20: putfield ZLc : Lburp/Zkrw;
    //   23: astore #14
    //   25: aload_0
    //   26: aload_3
    //   27: putfield ZLt : Lburp/Zbw_;
    //   30: aload_0
    //   31: aload #4
    //   33: putfield Zu : Lburp/Zgjf;
    //   36: aload_0
    //   37: aload #5
    //   39: putfield Zr : Ljava/awt/Window;
    //   42: aload_0
    //   43: aload #6
    //   45: putfield ZW : Lburp/Zs9s;
    //   48: aload_0
    //   49: iload #7
    //   51: putfield ZLp : Z
    //   54: aload_0
    //   55: aload #8
    //   57: putfield ZP : Lburp/Zkl6;
    //   60: aload_0
    //   61: aload #9
    //   63: putfield Zy : Lburp/Ztwv;
    //   66: aload_0
    //   67: aload #10
    //   69: putfield Zj : Lburp/Zr_4;
    //   72: aload_0
    //   73: aload #11
    //   75: putfield ZLm : Lburp/Zr_4;
    //   78: aload_0
    //   79: aload #12
    //   81: putfield ZY : Lburp/Zlb7;
    //   84: aload_0
    //   85: iload #13
    //   87: putfield ZJ : Z
    //   90: aload_0
    //   91: invokevirtual ZR : ()V
    //   94: aload_0
    //   95: getfield ZLC : Lburp/Zlte;
    //   98: invokeinterface ZO : ()Ljavax/swing/JComponent;
    //   103: bipush #100
    //   105: bipush #26
    //   107: invokestatic Zf : (Ljava/awt/Component;II)V
    //   110: iload #7
    //   112: ifeq -> 127
    //   115: sipush #19450
    //   118: sipush #-17668
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: goto -> 136
    //   127: sipush #19442
    //   130: sipush #-31461
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: astore #15
    //   138: aload_0
    //   139: aload #15
    //   141: invokevirtual setTitle : (Ljava/lang/String;)V
    //   144: aload_0
    //   145: getfield ZK : Lburp/Zm9v;
    //   148: iconst_0
    //   149: invokevirtual setVisible : (Z)V
    //   152: aload_0
    //   153: getfield Ze : Lburp/Zm9v;
    //   156: iconst_0
    //   157: invokevirtual setVisible : (Z)V
    //   160: aload_0
    //   161: getfield Zl : Lburp/Zm9v;
    //   164: iconst_0
    //   165: invokevirtual setVisible : (Z)V
    //   168: aload_0
    //   169: getfield ZR : Lburp/Zm9v;
    //   172: iconst_0
    //   173: invokevirtual setVisible : (Z)V
    //   176: aload_0
    //   177: getfield ZLe : Lburp/Zm9v;
    //   180: iconst_0
    //   181: invokevirtual setVisible : (Z)V
    //   184: aload_0
    //   185: getfield Zv : Lburp/Zm9v;
    //   188: iconst_0
    //   189: invokevirtual setVisible : (Z)V
    //   192: aload_0
    //   193: getfield ZG : Lburp/Zm9v;
    //   196: iconst_0
    //   197: invokevirtual setVisible : (Z)V
    //   200: aload_0
    //   201: getfield ZLB : Lburp/Zm9v;
    //   204: iconst_0
    //   205: invokevirtual setVisible : (Z)V
    //   208: invokestatic Zc : ()Ljava/util/Set;
    //   211: astore #16
    //   213: aload #16
    //   215: invokeinterface iterator : ()Ljava/util/Iterator;
    //   220: astore #17
    //   222: aload #17
    //   224: invokeinterface hasNext : ()Z
    //   229: ifeq -> 268
    //   232: aload #17
    //   234: invokeinterface next : ()Ljava/lang/Object;
    //   239: checkcast java/lang/String
    //   242: astore #18
    //   244: aload #18
    //   246: ldc ':'
    //   248: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   251: ifne -> 263
    //   254: aload_0
    //   255: getfield ZLK : Lburp/Zedd;
    //   258: aload #18
    //   260: invokevirtual addItem : (Ljava/lang/Object;)V
    //   263: aload #14
    //   265: ifnull -> 222
    //   268: aload #16
    //   270: invokeinterface iterator : ()Ljava/util/Iterator;
    //   275: astore #17
    //   277: aload #17
    //   279: invokeinterface hasNext : ()Z
    //   284: ifeq -> 323
    //   287: aload #17
    //   289: invokeinterface next : ()Ljava/lang/Object;
    //   294: checkcast java/lang/String
    //   297: astore #18
    //   299: aload #18
    //   301: ldc ':'
    //   303: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   306: ifeq -> 318
    //   309: aload_0
    //   310: getfield ZLK : Lburp/Zedd;
    //   313: aload #18
    //   315: invokevirtual addItem : (Ljava/lang/Object;)V
    //   318: aload #14
    //   320: ifnull -> 277
    //   323: aload #6
    //   325: invokeinterface ZS : ()I
    //   330: istore #17
    //   332: aload_0
    //   333: getfield Zw : Lburp/Zgff;
    //   336: iload #17
    //   338: ifne -> 346
    //   341: ldc ''
    //   343: goto -> 351
    //   346: iload #17
    //   348: invokestatic toString : (I)Ljava/lang/String;
    //   351: invokevirtual setText : (Ljava/lang/String;)V
    //   354: aload #6
    //   356: invokeinterface Zg : ()Lburp/Zi8;
    //   361: astore #18
    //   363: aload_0
    //   364: getfield ZLj : Lburp/Zgff;
    //   367: aload #18
    //   369: getfield Z_ : Ljava/lang/String;
    //   372: invokevirtual setText : (Ljava/lang/String;)V
    //   375: aload_0
    //   376: getfield ZL7 : Lburp/Zgff;
    //   379: aload #18
    //   381: getfield ZU : I
    //   384: ifne -> 392
    //   387: ldc ''
    //   389: goto -> 400
    //   392: aload #18
    //   394: getfield ZU : I
    //   397: invokestatic toString : (I)Ljava/lang/String;
    //   400: invokevirtual setText : (Ljava/lang/String;)V
    //   403: aload_0
    //   404: getfield ZL3 : Lburp/Zzdy;
    //   407: aload #18
    //   409: getfield Zo : Z
    //   412: invokevirtual setSelected : (Z)V
    //   415: aload_0
    //   416: getfield ZL2 : Lburp/Zzdy;
    //   419: aload #6
    //   421: invokeinterface Zb : ()Z
    //   426: invokevirtual setSelected : (Z)V
    //   429: aload #6
    //   431: invokeinterface ZY : ()B
    //   436: tableswitch default -> 541, 0 -> 464, 1 -> 477, 2 -> 490
    //   464: aload_0
    //   465: getfield ZF : Lburp/Zmg2;
    //   468: iconst_1
    //   469: invokevirtual setSelected : (Z)V
    //   472: aload #14
    //   474: ifnull -> 541
    //   477: aload_0
    //   478: getfield ZLi : Lburp/Zmg2;
    //   481: iconst_1
    //   482: invokevirtual setSelected : (Z)V
    //   485: aload #14
    //   487: ifnull -> 541
    //   490: aload #6
    //   492: invokeinterface ZM : ()Ljava/lang/String;
    //   497: astore #19
    //   499: aload #16
    //   501: aload #19
    //   503: invokeinterface contains : (Ljava/lang/Object;)Z
    //   508: ifeq -> 533
    //   511: aload_0
    //   512: getfield ZLK : Lburp/Zedd;
    //   515: aload #19
    //   517: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   520: aload_0
    //   521: getfield ZLJ : Lburp/Zmg2;
    //   524: iconst_1
    //   525: invokevirtual setSelected : (Z)V
    //   528: aload #14
    //   530: ifnull -> 541
    //   533: aload_0
    //   534: getfield ZLi : Lburp/Zmg2;
    //   537: iconst_1
    //   538: invokevirtual setSelected : (Z)V
    //   541: aload_0
    //   542: getfield ZN : Lburp/Zzdy;
    //   545: aload #6
    //   547: invokeinterface ZV : ()Z
    //   552: invokevirtual setSelected : (Z)V
    //   555: aload #6
    //   557: invokeinterface ZI : ()B
    //   562: tableswitch default -> 639, 0 -> 592, 1 -> 605, 2 -> 618, 3 -> 631
    //   592: aload_0
    //   593: getfield Zo : Lburp/Zmg2;
    //   596: iconst_1
    //   597: invokevirtual setSelected : (Z)V
    //   600: aload #14
    //   602: ifnull -> 639
    //   605: aload_0
    //   606: getfield ZLa : Lburp/Zmg2;
    //   609: iconst_1
    //   610: invokevirtual setSelected : (Z)V
    //   613: aload #14
    //   615: ifnull -> 639
    //   618: aload_0
    //   619: getfield Zb : Lburp/Zmg2;
    //   622: iconst_1
    //   623: invokevirtual setSelected : (Z)V
    //   626: aload #14
    //   628: ifnull -> 639
    //   631: aload_0
    //   632: getfield Zn : Lburp/Zmg2;
    //   635: iconst_1
    //   636: invokevirtual setSelected : (Z)V
    //   639: aload_0
    //   640: getfield Z_ : Lburp/Zmg2;
    //   643: aload #6
    //   645: invokeinterface Zq : ()Z
    //   650: ifne -> 657
    //   653: iconst_1
    //   654: goto -> 658
    //   657: iconst_0
    //   658: invokevirtual setSelected : (Z)V
    //   661: aload_0
    //   662: getfield ZB : Lburp/Zmg2;
    //   665: aload #6
    //   667: invokeinterface Zq : ()Z
    //   672: invokevirtual setSelected : (Z)V
    //   675: aload_0
    //   676: getfield ZLn : Lburp/Zbqc;
    //   679: aload #6
    //   681: invokeinterface Zq : ()Z
    //   686: invokevirtual setVisible : (Z)V
    //   689: aload_0
    //   690: new burp/Zbwh
    //   693: dup
    //   694: aload #6
    //   696: invokeinterface Zq : ()Z
    //   701: aload #6
    //   703: invokeinterface ZT : ()Ljava/util/List;
    //   708: aload_0
    //   709: <illegal opcode> accept : (Lburp/Zr7c;)Ljava/util/function/Consumer;
    //   714: invokespecial <init> : (ZLjava/util/List;Ljava/util/function/Consumer;)V
    //   717: putfield ZLW : Lburp/Zbwh;
    //   720: aload_0
    //   721: getfield Zd : Lburp/Zbup;
    //   724: aload_0
    //   725: getfield ZLW : Lburp/Zbwh;
    //   728: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   731: aload_0
    //   732: invokevirtual Zn : ()V
    //   735: aload_0
    //   736: getfield ZLx : Lburp/Zgff;
    //   739: aload #6
    //   741: invokeinterface ZE : ()Ljava/lang/String;
    //   746: invokevirtual setText : (Ljava/lang/String;)V
    //   749: aload_0
    //   750: getfield ZLS : Lburp/Zgff;
    //   753: aload #6
    //   755: invokeinterface ZO : ()Ljava/lang/String;
    //   760: invokevirtual setText : (Ljava/lang/String;)V
    //   763: aload_0
    //   764: getfield ZM : Lburp/Zgff;
    //   767: aload #6
    //   769: invokeinterface ZB : ()Ljava/lang/String;
    //   774: invokevirtual setText : (Ljava/lang/String;)V
    //   777: aload_0
    //   778: invokevirtual pack : ()V
    //   781: aload_0
    //   782: aload #5
    //   784: invokevirtual Zq : (Ljava/awt/Window;)V
    //   787: invokestatic Zwu : ()[Lburp/Zbqc;
    //   790: ifnonnull -> 799
    //   793: iconst_2
    //   794: newarray int
    //   796: invokestatic Zt : ([I)V
    //   799: return
  }
  
  private void Zn() {
    boolean bool = this.Zn.isSelected();
    this.Zs.setEnabled(bool);
    this.ZX.setEnabled(bool);
    this.ZLS.setEditable(bool);
    this.ZLx.setEnabled(bool);
    this.ZS.setEnabled(bool);
    bool = this.Zb.isSelected();
    this.ZM.setEditable(bool);
  }
  
  private void Zz(Zgff paramZgff, Zm9v paramZm9v) {
    String str = paramZgff.getText();
    try {
      if (str.isEmpty()) {
        paramZm9v.setVisible(false);
        this.ZK.setVisible(false);
        return;
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      int i = Integer.parseInt(str);
      try {
        if (!Zgxs.ZO(i))
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      paramZm9v.setVisible(false);
      this.ZK.setVisible(false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      paramZm9v.setVisible(true);
    } 
  }
  
  private void ZE() {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Ze : Lburp/Zm9v;
    //   8: iconst_0
    //   9: invokevirtual setVisible : (Z)V
    //   12: aload_0
    //   13: getfield ZW : Lburp/Zs9s;
    //   16: invokeinterface ZY : ()B
    //   21: ifeq -> 108
    //   24: aload_0
    //   25: getfield ZF : Lburp/Zmg2;
    //   28: invokevirtual isSelected : ()Z
    //   31: ifeq -> 108
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: iconst_0
    //   42: aload_0
    //   43: sipush #19452
    //   46: sipush #11417
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: sipush #19401
    //   55: sipush #-21525
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: iconst_2
    //   62: anewarray java/lang/String
    //   65: dup
    //   66: iconst_0
    //   67: sipush #19431
    //   70: sipush #21713
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: aastore
    //   77: dup
    //   78: iconst_1
    //   79: sipush #19400
    //   82: sipush #26463
    //   85: invokestatic a : (II)Ljava/lang/String;
    //   88: aastore
    //   89: iconst_1
    //   90: invokestatic Zc : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;I)I
    //   93: if_icmpeq -> 108
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: return
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: getfield Zw : Lburp/Zgff;
    //   112: invokevirtual getText : ()Ljava/lang/String;
    //   115: invokestatic parseInt : (Ljava/lang/String;)I
    //   118: istore_2
    //   119: iload_2
    //   120: invokestatic ZO : (I)Z
    //   123: ifne -> 138
    //   126: new java/lang/Exception
    //   129: dup
    //   130: invokespecial <init> : ()V
    //   133: athrow
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: goto -> 179
    //   141: astore_3
    //   142: aload_3
    //   143: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   146: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   149: aload_0
    //   150: getfield Zl : Lburp/Zm9v;
    //   153: iconst_1
    //   154: invokevirtual setVisible : (Z)V
    //   157: aload_0
    //   158: getfield ZK : Lburp/Zm9v;
    //   161: iconst_1
    //   162: invokevirtual setVisible : (Z)V
    //   165: aload_0
    //   166: getfield ZLC : Lburp/Zlte;
    //   169: aload_0
    //   170: getfield ZD : Lburp/Zbup;
    //   173: invokeinterface setSelectedComponent : (Ljava/awt/Component;)V
    //   178: return
    //   179: iconst_0
    //   180: istore_3
    //   181: aload_0
    //   182: getfield ZL7 : Lburp/Zgff;
    //   185: invokevirtual getText : ()Ljava/lang/String;
    //   188: astore #4
    //   190: aload #4
    //   192: invokevirtual isEmpty : ()Z
    //   195: ifne -> 266
    //   198: aload #4
    //   200: invokestatic parseInt : (Ljava/lang/String;)I
    //   203: istore_3
    //   204: iload_3
    //   205: invokestatic ZO : (I)Z
    //   208: ifne -> 223
    //   211: new java/lang/Exception
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: athrow
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: goto -> 266
    //   226: astore #5
    //   228: aload #5
    //   230: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   233: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   236: aload_0
    //   237: getfield ZR : Lburp/Zm9v;
    //   240: iconst_1
    //   241: invokevirtual setVisible : (Z)V
    //   244: aload_0
    //   245: getfield ZK : Lburp/Zm9v;
    //   248: iconst_1
    //   249: invokevirtual setVisible : (Z)V
    //   252: aload_0
    //   253: getfield ZLC : Lburp/Zlte;
    //   256: aload_0
    //   257: getfield Zi : Lburp/Zbup;
    //   260: invokeinterface setSelectedComponent : (Ljava/awt/Component;)V
    //   265: return
    //   266: aload_0
    //   267: getfield Zo : Lburp/Zmg2;
    //   270: invokevirtual isSelected : ()Z
    //   273: ifeq -> 283
    //   276: iconst_0
    //   277: istore #5
    //   279: aload_1
    //   280: ifnull -> 334
    //   283: aload_0
    //   284: getfield ZLa : Lburp/Zmg2;
    //   287: invokevirtual isSelected : ()Z
    //   290: ifeq -> 307
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   299: athrow
    //   300: iconst_1
    //   301: istore #5
    //   303: aload_1
    //   304: ifnull -> 334
    //   307: aload_0
    //   308: getfield Zb : Lburp/Zmg2;
    //   311: invokevirtual isSelected : ()Z
    //   314: ifeq -> 331
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: iconst_2
    //   325: istore #5
    //   327: aload_1
    //   328: ifnull -> 334
    //   331: iconst_3
    //   332: istore #5
    //   334: aconst_null
    //   335: astore #6
    //   337: aconst_null
    //   338: astore #7
    //   340: aconst_null
    //   341: astore #8
    //   343: iload #5
    //   345: iconst_3
    //   346: if_icmpne -> 443
    //   349: aload_0
    //   350: getfield ZLx : Lburp/Zgff;
    //   353: invokevirtual getText : ()Ljava/lang/String;
    //   356: astore #6
    //   358: aload_0
    //   359: getfield ZLS : Lburp/Zgff;
    //   362: invokevirtual getText : ()Ljava/lang/String;
    //   365: astore #7
    //   367: aload #6
    //   369: invokevirtual isEmpty : ()Z
    //   372: ifeq -> 405
    //   375: aload_0
    //   376: getfield Zv : Lburp/Zm9v;
    //   379: iconst_1
    //   380: invokevirtual setVisible : (Z)V
    //   383: aload_0
    //   384: getfield ZK : Lburp/Zm9v;
    //   387: iconst_1
    //   388: invokevirtual setVisible : (Z)V
    //   391: aload_0
    //   392: getfield ZLC : Lburp/Zlte;
    //   395: aload_0
    //   396: getfield ZQ : Lburp/Zbup;
    //   399: invokeinterface setSelectedComponent : (Ljava/awt/Component;)V
    //   404: return
    //   405: aload #7
    //   407: invokevirtual isEmpty : ()Z
    //   410: ifeq -> 496
    //   413: aload_0
    //   414: getfield ZG : Lburp/Zm9v;
    //   417: iconst_1
    //   418: invokevirtual setVisible : (Z)V
    //   421: aload_0
    //   422: getfield ZK : Lburp/Zm9v;
    //   425: iconst_1
    //   426: invokevirtual setVisible : (Z)V
    //   429: aload_0
    //   430: getfield ZLC : Lburp/Zlte;
    //   433: aload_0
    //   434: getfield ZQ : Lburp/Zbup;
    //   437: invokeinterface setSelectedComponent : (Ljava/awt/Component;)V
    //   442: return
    //   443: iload #5
    //   445: iconst_2
    //   446: if_icmpne -> 496
    //   449: aload_0
    //   450: getfield ZM : Lburp/Zgff;
    //   453: invokevirtual getText : ()Ljava/lang/String;
    //   456: astore #8
    //   458: aload #8
    //   460: invokevirtual isEmpty : ()Z
    //   463: ifeq -> 496
    //   466: aload_0
    //   467: getfield ZLe : Lburp/Zm9v;
    //   470: iconst_1
    //   471: invokevirtual setVisible : (Z)V
    //   474: aload_0
    //   475: getfield ZK : Lburp/Zm9v;
    //   478: iconst_1
    //   479: invokevirtual setVisible : (Z)V
    //   482: aload_0
    //   483: getfield ZLC : Lburp/Zlte;
    //   486: aload_0
    //   487: getfield ZQ : Lburp/Zbup;
    //   490: invokeinterface setSelectedComponent : (Ljava/awt/Component;)V
    //   495: return
    //   496: iconst_0
    //   497: istore #9
    //   499: aconst_null
    //   500: astore #10
    //   502: aload_0
    //   503: getfield ZF : Lburp/Zmg2;
    //   506: invokevirtual isSelected : ()Z
    //   509: ifeq -> 519
    //   512: iconst_0
    //   513: istore #9
    //   515: aload_1
    //   516: ifnull -> 575
    //   519: aload_0
    //   520: getfield ZLi : Lburp/Zmg2;
    //   523: invokevirtual isSelected : ()Z
    //   526: ifeq -> 543
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   535: athrow
    //   536: iconst_1
    //   537: istore #9
    //   539: aload_1
    //   540: ifnull -> 575
    //   543: aload_0
    //   544: getfield ZLJ : Lburp/Zmg2;
    //   547: invokevirtual isSelected : ()Z
    //   550: ifeq -> 575
    //   553: goto -> 560
    //   556: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   559: athrow
    //   560: iconst_2
    //   561: istore #9
    //   563: aload_0
    //   564: getfield ZLK : Lburp/Zedd;
    //   567: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   570: checkcast java/lang/String
    //   573: astore #10
    //   575: aload_0
    //   576: getfield ZB : Lburp/Zmg2;
    //   579: invokevirtual isSelected : ()Z
    //   582: ifeq -> 629
    //   585: aload_0
    //   586: getfield ZLW : Lburp/Zbwh;
    //   589: invokevirtual ZU : ()Ljava/util/List;
    //   592: invokeinterface isEmpty : ()Z
    //   597: ifeq -> 629
    //   600: goto -> 607
    //   603: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   606: athrow
    //   607: aload_0
    //   608: getfield ZK : Lburp/Zm9v;
    //   611: iconst_1
    //   612: invokevirtual setVisible : (Z)V
    //   615: aload_0
    //   616: getfield ZLC : Lburp/Zlte;
    //   619: aload_0
    //   620: getfield Zz : Lburp/Zbup;
    //   623: invokeinterface setSelectedComponent : (Ljava/awt/Component;)V
    //   628: return
    //   629: new burp/Zrk4
    //   632: dup
    //   633: invokespecial <init> : ()V
    //   636: iload_2
    //   637: invokevirtual ZX : (I)Lburp/Zrk4;
    //   640: iload #9
    //   642: invokevirtual ZD : (B)Lburp/Zrk4;
    //   645: aload #10
    //   647: invokevirtual Za : (Ljava/lang/String;)Lburp/Zrk4;
    //   650: aload_0
    //   651: getfield ZLj : Lburp/Zgff;
    //   654: invokevirtual getText : ()Ljava/lang/String;
    //   657: invokevirtual ZF : (Ljava/lang/String;)Lburp/Zrk4;
    //   660: iload_3
    //   661: invokevirtual Zq : (I)Lburp/Zrk4;
    //   664: aload_0
    //   665: getfield ZL3 : Lburp/Zzdy;
    //   668: invokevirtual isSelected : ()Z
    //   671: invokevirtual ZH : (Z)Lburp/Zrk4;
    //   674: aload_0
    //   675: getfield ZN : Lburp/Zzdy;
    //   678: invokevirtual isSelected : ()Z
    //   681: invokevirtual ZG : (Z)Lburp/Zrk4;
    //   684: iload #5
    //   686: invokevirtual ZU : (B)Lburp/Zrk4;
    //   689: aload #8
    //   691: invokevirtual Zf : (Ljava/lang/String;)Lburp/Zrk4;
    //   694: aload #6
    //   696: invokevirtual ZQ : (Ljava/lang/String;)Lburp/Zrk4;
    //   699: aload #7
    //   701: invokevirtual ZJ : (Ljava/lang/String;)Lburp/Zrk4;
    //   704: aload_0
    //   705: getfield ZB : Lburp/Zmg2;
    //   708: invokevirtual isSelected : ()Z
    //   711: invokevirtual Zu : (Z)Lburp/Zrk4;
    //   714: aload_0
    //   715: getfield ZLW : Lburp/Zbwh;
    //   718: invokevirtual ZU : ()Ljava/util/List;
    //   721: invokevirtual Zo : (Ljava/util/List;)Lburp/Zrk4;
    //   724: aload_0
    //   725: getfield ZL2 : Lburp/Zzdy;
    //   728: invokevirtual isSelected : ()Z
    //   731: invokevirtual ZK : (Z)Lburp/Zrk4;
    //   734: astore #11
    //   736: aload_0
    //   737: getfield ZLp : Z
    //   740: ifeq -> 776
    //   743: aload_0
    //   744: aload #11
    //   746: aload_0
    //   747: getfield Zj : Lburp/Zr_4;
    //   750: invokevirtual Zl : (Lburp/Zrk4;Lburp/Zr_4;)Lburp/Zs9s;
    //   753: astore #12
    //   755: aload_0
    //   756: getfield Zu : Lburp/Zgjf;
    //   759: aload #12
    //   761: aload_0
    //   762: getfield Zr : Ljava/awt/Window;
    //   765: aload_0
    //   766: getfield ZJ : Z
    //   769: invokevirtual ZU : (Lburp/Zs9s;Ljava/awt/Window;Z)V
    //   772: aload_1
    //   773: ifnull -> 806
    //   776: aload_0
    //   777: aload #11
    //   779: aload_0
    //   780: getfield ZLm : Lburp/Zr_4;
    //   783: invokevirtual Zl : (Lburp/Zrk4;Lburp/Zr_4;)Lburp/Zs9s;
    //   786: astore #12
    //   788: aload_0
    //   789: getfield Zy : Lburp/Ztwv;
    //   792: aload_0
    //   793: aload #12
    //   795: <illegal opcode> run : (Lburp/Zr7c;Lburp/Zs9s;)Ljava/lang/Runnable;
    //   800: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   805: pop
    //   806: aload_0
    //   807: iconst_0
    //   808: invokevirtual setVisible : (Z)V
    //   811: goto -> 830
    //   814: astore_2
    //   815: aload_2
    //   816: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   819: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   822: aload_0
    //   823: getfield Ze : Lburp/Zm9v;
    //   826: iconst_1
    //   827: invokevirtual setVisible : (Z)V
    //   830: return
    // Exception table:
    //   from	to	target	type
    //   4	34	37	java/lang/Exception
    //   24	96	99	java/lang/Exception
    //   41	104	104	java/lang/Exception
    //   108	138	141	java/lang/Exception
    //   108	178	814	java/lang/Exception
    //   119	134	134	java/lang/Exception
    //   179	265	814	java/lang/Exception
    //   198	223	226	java/lang/Exception
    //   204	219	219	java/lang/Exception
    //   266	404	814	java/lang/Exception
    //   279	293	296	java/lang/Exception
    //   303	317	320	java/lang/Exception
    //   405	442	814	java/lang/Exception
    //   443	495	814	java/lang/Exception
    //   496	628	814	java/lang/Exception
    //   515	529	532	java/lang/Exception
    //   539	553	556	java/lang/Exception
    //   575	600	603	java/lang/Exception
    //   629	811	814	java/lang/Exception
  }
  
  private Zs9s Zl(Zrk4 paramZrk4, Zr_4 paramZr_4) {
    return new Zb2z(paramZr_4.<Zg5n>ZH(paramZrk4), this.ZP, this.Zy, this.ZY, this.ZLt.ZFY(), this.ZLt.ZF0(), new Zryw(this.ZLc), this.Zr);
  }
  
  private void ZN(boolean paramBoolean) {
    ZO(this.ZLB, paramBoolean);
  }
  
  private void ZO(Zm9v paramZm9v, boolean paramBoolean) {
    paramZm9v.setVisible(paramBoolean);
    if (!paramBoolean)
      this.ZK.setVisible(false); 
  }
  
  private void ZR() {
    this.ZLo = new ButtonGroup();
    this.Zx = new ButtonGroup();
    this.Zf = new ButtonGroup();
    this.ZLC = new Zxer();
    this.ZD = new Zbup();
    this.ZLk = new Zbqc();
    this.Zh = new Zm99();
    this.ZLY = new Zm99();
    this.ZF = new Zmg2();
    this.ZLi = new Zmg2();
    this.ZA = new Zl8w();
    this.ZU = new Zbqc();
    this.Zl = new Zm9v();
    this.Zw = new Zgff();
    this.ZLD = new Zbqc();
    this.ZLJ = new Zmg2();
    this.ZLK = new Zedd();
    this.ZO = new Zm2o();
    this.Zi = new Zbup();
    this.ZLZ = new Zbqc();
    this.ZN = new Zzdy();
    this.ZLj = new Zgff();
    this.Zg = new Zm99();
    this.ZL3 = new Zzdy();
    this.ZT = new Zm99();
    this.ZLH = new Zl8w();
    this.Zk = new Zl8w();
    this.ZLz = new Zbqc();
    this.ZR = new Zm9v();
    this.ZL7 = new Zgff();
    this.ZLh = new Zm2o();
    this.ZQ = new Zbup();
    this.ZL0 = new Zbqc();
    this.Zo = new Zmg2();
    this.ZLa = new Zmg2();
    this.Zb = new Zmg2();
    this.ZM = new Zgff();
    this.ZLe = new Zm9v();
    this.Zn = new Zmg2();
    this.ZLx = new Zgff();
    this.Zv = new Zm9v();
    this.ZLS = new Zgff();
    this.ZG = new Zm9v();
    this.ZS = new Ze01();
    this.Zs = new Zm99();
    this.ZX = new Zm99();
    this.ZLF = new Zm2o();
    this.Zt = new Zl8w();
    this.ZLy = new Zm99();
    this.ZLg = new Zm99();
    this.Zz = new Zbup();
    this.ZLP = new Zbqc();
    this.ZZ = new Zm2o();
    this.ZLM = new Zl8w();
    this.Z_ = new Zmg2();
    this.ZB = new Zmg2();
    this.ZLn = new Zbqc();
    this.Za = new Zmyw();
    this.Zd = new Zbup();
    this.ZLB = new Zm9v();
    this.Zm = new Ze01();
    this.ZL = new Ze01();
    this.ZLT = new Zm99();
    this.ZLI = new Zm99();
    this.ZE = new Zbup();
    this.ZI = new Zbqc();
    this.ZL2 = new Zzdy();
    this.Zp = new Zl8w();
    this.ZLL = new Zm2o();
    this.ZL_ = new Zbqc();
    this.ZK = new Zm9v();
    this.Ze = new Zm9v();
    this.ZV = new Zbqc();
    this.ZH = new Ze01();
    this.ZL4 = new Ze01();
    setDefaultCloseOperation(2);
    setMinimumSize(new Dimension(675, 450));
    setPreferredSize(new Dimension(675, 450));
    this.ZLk.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.ZLk.setLayout(gridBagLayout1);
    this.Zh.setText(a(19419, -7923));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZLk.add(this.Zh, gridBagConstraints);
    this.ZLY.setText(a(19441, 30728));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    this.ZLk.add(this.ZLY, gridBagConstraints);
    this.Zx.add(this.ZF);
    this.ZF.setText(a(19427, 30664));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZLk.add(this.ZF, gridBagConstraints);
    this.Zx.add(this.ZLi);
    this.ZLi.setText(a(19454, -13284));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZLk.add(this.ZLi, gridBagConstraints);
    this.ZA.setText(a(19424, -29350));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZLk.add(this.ZA, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZU.setLayout(gridBagLayout2);
    this.Zl.setText(a(19438, -1823));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZU.add(this.Zl, gridBagConstraints);
    this.Zw.setColumns(5);
    this.Zw.ZH(Zlw9.PORT);
    this.Zw.addActionListener(new Ztke(this));
    this.Zw.addKeyListener(new Zthg(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZU.add(this.Zw, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    this.ZLk.add(this.ZU, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0 };
    this.ZLD.setLayout(gridBagLayout3);
    this.Zx.add(this.ZLJ);
    this.ZLJ.setText(a(19415, -21028));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    this.ZLD.add(this.ZLJ, gridBagConstraints);
    this.ZLK.addActionListener(new Zgh6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    this.ZLD.add(this.ZLK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    this.ZLk.add(this.ZLD, gridBagConstraints);
    this.ZO.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_BINDING);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZLk.add(this.ZO, gridBagConstraints);
    this.ZD.setViewportView(this.ZLk);
    this.ZLC.addTab(a(19405, 23842), this.ZD);
    this.ZLZ.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout4 = new GridBagLayout();
    gridBagLayout4.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout4.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    this.ZLZ.setLayout(gridBagLayout4);
    this.ZN.setText(a(19439, 30398));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    this.ZLZ.add(this.ZN, gridBagConstraints);
    this.ZLj.setColumns(20);
    this.ZLj.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZLZ.add(this.ZLj, gridBagConstraints);
    this.Zg.setText(a(19409, 31796));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZLZ.add(this.Zg, gridBagConstraints);
    this.ZL3.setText(a(19393, -27769));
    this.ZL3.addActionListener(new Zb88(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.ZLZ.add(this.ZL3, gridBagConstraints);
    this.ZT.setText(a(19434, -20622));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZLZ.add(this.ZT, gridBagConstraints);
    this.ZLH.setText(a(19437, -12331));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZLZ.add(this.ZLH, gridBagConstraints);
    this.Zk.setText(a(19436, -26854));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    this.ZLZ.add(this.Zk, gridBagConstraints);
    GridBagLayout gridBagLayout5 = new GridBagLayout();
    gridBagLayout5.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout5.rowHeights = new int[] { 0 };
    this.ZLz.setLayout(gridBagLayout5);
    this.ZR.setText(a(19432, 14969));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZLz.add(this.ZR, gridBagConstraints);
    this.ZL7.setColumns(20);
    this.ZL7.ZH(Zlw9.PORT);
    this.ZL7.addKeyListener(new Zzl7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZLz.add(this.ZL7, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZLZ.add(this.ZLz, gridBagConstraints);
    this.ZLh.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_REQUEST_HANDLING);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZLZ.add(this.ZLh, gridBagConstraints);
    this.Zi.setViewportView(this.ZLZ);
    this.ZLC.addTab(a(19406, 11061), this.Zi);
    this.ZL0.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout6 = new GridBagLayout();
    gridBagLayout6.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    gridBagLayout6.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    this.ZL0.setLayout(gridBagLayout6);
    this.ZLo.add(this.Zo);
    this.Zo.setText(a(19449, -26851));
    this.Zo.addActionListener(new Zthj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.anchor = 18;
    this.ZL0.add(this.Zo, gridBagConstraints);
    this.ZLo.add(this.ZLa);
    this.ZLa.setText(a(19447, 26079));
    this.ZLa.addActionListener(new Zzc8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.anchor = 18;
    this.ZL0.add(this.ZLa, gridBagConstraints);
    this.ZLo.add(this.Zb);
    this.Zb.setText(a(19402, 32125));
    this.Zb.addActionListener(new Zgb0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.anchor = 18;
    this.ZL0.add(this.Zb, gridBagConstraints);
    this.ZM.setColumns(25);
    this.ZM.ZH(Zlw9.HOST);
    this.ZM.addKeyListener(new Zgpc(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    this.ZL0.add(this.ZM, gridBagConstraints);
    this.ZLe.setText(a(19433, 14490));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.ZL0.add(this.ZLe, gridBagConstraints);
    this.ZLo.add(this.Zn);
    this.Zn.setText(a(19407, -12857));
    this.Zn.addActionListener(new Zx6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZL0.add(this.Zn, gridBagConstraints);
    this.ZLx.setEditable(false);
    this.ZLx.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    this.ZL0.add(this.ZLx, gridBagConstraints);
    this.Zv.setText(a(19420, 10224));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.ZL0.add(this.Zv, gridBagConstraints);
    this.ZLS.setColumns(25);
    this.ZLS.addKeyListener(new Ztbw(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    this.ZL0.add(this.ZLS, gridBagConstraints);
    this.ZG.setText(a(19453, 13317));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.ZL0.add(this.ZG, gridBagConstraints);
    this.ZS.setText(a(19410, 31764));
    this.ZS.setToolTipText(a(19446, 7140));
    this.ZS.addActionListener(new Zrc2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 18;
    this.ZL0.add(this.ZS, gridBagConstraints);
    this.Zs.setText(a(19411, 16265));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 1280;
    this.ZL0.add(this.Zs, gridBagConstraints);
    this.ZX.setText(a(19394, 20637));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 1280;
    this.ZL0.add(this.ZX, gridBagConstraints);
    this.ZLF.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_CERTIFICATE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZL0.add(this.ZLF, gridBagConstraints);
    this.Zt.setText(a(19455, -11430));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZL0.add(this.Zt, gridBagConstraints);
    this.ZLy.setText(a(19395, -10901));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    this.ZL0.add(this.ZLy, gridBagConstraints);
    this.ZLg.setText(a(19413, 30457));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    this.ZL0.add(this.ZLg, gridBagConstraints);
    this.ZQ.setViewportView(this.ZL0);
    this.ZLC.addTab(a(19448, -353), this.ZQ);
    this.ZLP.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout7 = new GridBagLayout();
    gridBagLayout7.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout7.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.ZLP.setLayout(gridBagLayout7);
    this.ZZ.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_TLS_PROTOCOLS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZLP.add(this.ZZ, gridBagConstraints);
    this.ZLM.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    this.ZLM.setText(a(19423, 20809));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.ZLP.add(this.ZLM, gridBagConstraints);
    this.Zf.add(this.Z_);
    this.Z_.setText(a(19412, 14826));
    this.Z_.addActionListener(new Zrpn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    this.ZLP.add(this.Z_, gridBagConstraints);
    this.Zf.add(this.ZB);
    this.ZB.setText(a(19445, -17153));
    this.ZB.addActionListener(new Zr2y(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    this.ZLP.add(this.ZB, gridBagConstraints);
    GridBagLayout gridBagLayout8 = new GridBagLayout();
    gridBagLayout8.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout8.rowHeights = new int[] { 0, 5, 0 };
    this.ZLn.setLayout(gridBagLayout8);
    this.Za.setLeftComponent(this.Zd);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 5, 0);
    this.ZLn.add(this.Za, gridBagConstraints);
    this.ZLB.setText(a(19403, 14174));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.ZLn.add(this.ZLB, gridBagConstraints);
    this.Zm.setText(a(19443, -8555));
    this.Zm.addActionListener(new Zzt4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    this.ZLn.add(this.Zm, gridBagConstraints);
    this.ZL.setText(a(19435, 23612));
    this.ZL.addActionListener(new Ze3b(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    this.ZLn.add(this.ZL, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.ZLP.add(this.ZLn, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.weighty = 1.0D;
    this.ZLP.add(this.ZLT, gridBagConstraints);
    this.ZLI.setText(a(19430, -6935));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    this.ZLP.add(this.ZLI, gridBagConstraints);
    this.Zz.setViewportView(this.ZLP);
    this.ZLC.addTab(a(19408, 14909), this.Zz);
    this.ZI.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout9 = new GridBagLayout();
    gridBagLayout9.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout9.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.ZI.setLayout(gridBagLayout9);
    this.ZL2.setText(a(19416, -21466));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    this.ZI.add(this.ZL2, gridBagConstraints);
    this.Zp.setText(a(19451, 11708));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZI.add(this.Zp, gridBagConstraints);
    this.ZLL.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_HTTP);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZI.add(this.ZLL, gridBagConstraints);
    this.ZE.setViewportView(this.ZI);
    this.ZLC.addTab(a(19422, 9319), this.ZE);
    getContentPane().add(this.ZLC.ZO(), a(19417, 31760));
    this.ZL_.setBorder(BorderFactory.createEmptyBorder(10, 10, 5, 5));
    this.ZL_.setLayout(new BorderLayout(20, 0));
    this.ZK.setHorizontalAlignment(4);
    this.ZK.setText(a(19428, 17008));
    this.ZL_.add(this.ZK, a(19444, 3531));
    this.Ze.setHorizontalAlignment(2);
    this.Ze.setText(a(19425, -13494));
    this.ZL_.add(this.Ze, a(19421, 12396));
    this.ZV.setLayout(new GridLayout(1, 2, 5, 0));
    this.ZH.setText(a(19414, 27026));
    this.ZH.addActionListener(new Zgze(this));
    this.ZV.add(this.ZH);
    this.ZL4.setText(a(19392, 10729));
    this.ZL4.addActionListener(new Zmwk(this));
    this.ZV.add(this.ZL4);
    this.ZL_.add(this.ZV, a(19429, 24212));
    getContentPane().add(this.ZL_, a(19418, 17239));
    pack();
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    this.Zw.focusLost((FocusEvent)null);
    ZA(paramActionEvent);
    this.Zw.focusGained((FocusEvent)null);
  }
  
  private void Zk(KeyEvent paramKeyEvent) {
    Zz(this.Zw, this.Zl);
  }
  
  private void Zz(KeyEvent paramKeyEvent) {
    Zz(this.ZL7, this.ZR);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    Zn();
    this.ZLe.setVisible(false);
    this.Zv.setVisible(false);
    this.ZG.setVisible(false);
    this.ZK.setVisible(false);
    this.Ze.setVisible(false);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    Zn();
    this.ZLe.setVisible(false);
    this.Zv.setVisible(false);
    this.ZG.setVisible(false);
    this.ZK.setVisible(false);
    this.Ze.setVisible(false);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    Zn();
    this.Zv.setVisible(false);
    this.ZG.setVisible(false);
    this.ZK.setVisible(false);
    this.Ze.setVisible(false);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    Zn();
    this.ZLe.setVisible(false);
    this.ZK.setVisible(false);
    this.Ze.setVisible(false);
  }
  
  private void Za(ActionEvent paramActionEvent) {
    File file = Zs6n.Zp(Zg1m.CONFIG, this.Zc, this, 0, a(19404, -29881));
    this.ZLx.setText((file == null) ? "" : file.getAbsolutePath());
    ZO(this.Zv, (file == null));
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    ZE();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    setVisible(false);
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.ZLJ.setSelected(true);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zv();
    if (this.ZL3.isSelected()) {
      if (this.ZL7.getText().isEmpty()) {
        this.ZL7.setText(a(19440, 954));
        if (arrayOfInt != null) {
          if (this.ZL7.getText().equals(a(19426, 30156)))
            this.ZL7.setText(""); 
          return;
        } 
      } 
      return;
    } 
    if (this.ZL7.getText().equals(a(19426, 30156)))
      this.ZL7.setText(""); 
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    this.ZLW.ZJ(true);
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.ZLW.ZJ(false);
  }
  
  private void Zy(ActionEvent paramActionEvent) {
    this.ZLn.setVisible(false);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    this.ZLn.setVisible(true);
  }
  
  private void ZC(KeyEvent paramKeyEvent) {
    ZO(this.ZLe, this.ZM.getText().isEmpty());
  }
  
  private void Zb(KeyEvent paramKeyEvent) {
    ZO(this.ZG, this.ZLS.getText().isEmpty());
  }
  
  private void lambda$addListener$0(Zs9s paramZs9s) {
    this.Zu.Zf(this.ZW, paramZs9s, this.Zr, this.ZJ);
  }
  
  public static void Zt(int[] paramArrayOfint) {
    ZL5 = paramArrayOfint;
  }
  
  public static int[] Zv() {
    return ZL5;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'ÓQðYºÆuËtÑhâ9ÔûïNfG°ê>Í²IG=ÏÝÉÉ^¨fa>c²æ.©é®ïåZÜ º¨¾´á<o@f¨¨Í¦^g¬kG\\tcv~!uÇHJ¡$ÇÓË×}Iã¢\\fUþ}dyV1X4A¥ºgÛkÓýN^Ï(O`4Ò»ÇnYöø5V\:Dæ´?ßhGÀÑkäæ\\rlô¿³Ï¦CPw¡SyÍGaµ`öö"5¡>ÀÓð\\rX#eP³^áð¤y&]ò?îëoò ÖÀÐ?¥Üá{ óå$ºÀþZÊAlÑ¤×$ÑÃ)Çñ¹l\\r³Ö¨þQß'c&k³ WC¶¹m4(º½ðð>\\n¬Æº2÷´â¥/øì\\n½2ÂËÂF"ÚxS})VêîüVÄúê8÷H1÷R\\foýn(Ð{\\b\\r!xcýIæ+;Ç¤Å ZZP4#aã?}IÜvÝ¨ó\\rxvë5÷é{È¬6tþ\\f5@Tâmà`%zd7\IåBìúÓÿkd)@,ü®»SnÔn³[:¶Cì4ít\\tV4ªÍtx½ml{ Å­è4Q@¬²)ö,ÛGñâd_È\\rôzÙó@{ÑÄ\\\t®Pòè°áF#>áý¡ìp,±1âdC)2xæçQá¤TL×ÅO#\\n²$[ñê¦òÓþàUAïªð5°ãþFohä©ZÆÙNj"cÁ.Ñl\\nÏ'<ôl5í=ØU1yZ,VLVEQ\\n©"t3À5\\r·¸3C6âx=½úB2ô¹û×\\fI}`ÛxtG©ö«Ú¸­ÅGs>Èr#¥> ÷Z³õM,¡Ùé¸9$(ìÝÀ÷­e#Â9=uxßc~ko÷g£¶ñ5ír6É¾ë:A\\bÒ.Ab¢ø7¶$\­ä"ñ§Ìì¤#¦\\rN©nÿkoíd­Ç^ûàF´W7¼*Î:gÊ1Ê\\n©Ñg _Âä!§èa{ñ{ª,pÐ¤ä\\f3ÝPP\\fc¹î¿ °ÁÛkÛ¿%>4'û¹îí@Úù(©v7^}TÈçÕÈ¯]õ·-ÎÞ»ë\\rëL.¹yvl+êµtW*÷6Ådøô§ÊÎl9I>LVÃKàÆxùböÎ°íâ×Û]ìTû´Òê´Ëò»ý\\b(-E\]N5g»wÀÿ7Øýp;~« 6&2þ[oMKUJõ2fÑôU>ªÿ >U]ZöL]ög_î`+¾ôÙ± >©_ëÔ¯I@¥ß{ÂûE©÷¿¬øûæôø~0.¶øè#ÿÚ°ýj+þªOªÖ«°vão8ZéÀ­l\\rÌOêT³ °iµÿ*±5V>ð4üíÈd«kéÐñÍsÁH¿¿&3Ñc\\fô¶øè²è\\rC[6@^/ñw,¤¦T\\\fàÑL]Yö®õVúVVà=Å t$È6\\f)±³3i¢Xeä3Jbq0±T¤ÊÍ÷Ì(å^`Ù¼§¹\\b2[?ômaûùDcõÏÒÝpöÙÎ¢L/Þj\\b¡0¯»{¯w«Tãùi£S«¸4-ªÝ9áhQ²»3tà¸Ef0Ø'¾P-íËµ¹\\b\\f>°ÏÁéK}ÝéÜV+xCéXÈNk÷{Ã¸'' ·§Æ,¼ï¯ÚY[Oû­ÄÜ0öõÂïxº\\t:©'sÄ·ßÞû6=iC2Þ ªÿ&[)I6ónæÜ¬ Êf`¥3\\f\\r<BÊ¹Å&RCÐ0ª÷àÞå_ªã¯nq¥²Ø.hGp¶BAÓÙ´âKÑ¯^²\ÄCêÓzT WÜV,äl:|£Öô`ìÇDJo${A·xÓ#æÉÊë,\\\b½½ÑdPünY2¯½á§9ä=GalcÌ£Ââ¸k°9ýáB±\\tØI¨úäíî'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zt : ([I)V
    //   22: bipush #11
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #87
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
    //   72: ldc '2³ìÖV~]fx'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #9
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #69
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
    //   133: putstatic burp/Zr7c.a : [Ljava/lang/String;
    //   136: bipush #60
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zr7c.b : [Ljava/lang/String;
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
    //   216: bipush #35
    //   218: goto -> 248
    //   221: bipush #32
    //   223: goto -> 248
    //   226: bipush #10
    //   228: goto -> 248
    //   231: bipush #119
    //   233: goto -> 248
    //   236: bipush #13
    //   238: goto -> 248
    //   241: bipush #34
    //   243: goto -> 248
    //   246: bipush #19
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
    int i = (paramInt1 ^ 0x4BF8) & 0xFFFF;
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
      byte b1 = 43;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */