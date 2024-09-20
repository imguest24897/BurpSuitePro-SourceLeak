package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.util.regex.PatternSyntaxException;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbyg extends Zbyv implements Zl5s {
  private final Zs1e ZL;
  
  private final Zxzh ZU;
  
  private final Zz0n ZE;
  
  private final Zerg ZS;
  
  private final Zgb6 ZM;
  
  private final Ztwv Zs;
  
  private final Zr_4 ZJ;
  
  private final Zt0_ ZtS;
  
  private final Zbws ZR;
  
  private final Zbye Zz;
  
  private final Zbyb ZK;
  
  private final Zgq7 ZP;
  
  private final Zlr9 Zu;
  
  private final Ze4m Zh;
  
  private final Ztyg ZG;
  
  private final Zbnt Zto;
  
  private final Zey9 ZQ;
  
  private Zbqc Zta;
  
  private Zm99 ZV;
  
  private Zmyw Zg;
  
  private ButtonGroup ZN;
  
  private ButtonGroup Za;
  
  private ButtonGroup ZT;
  
  private ButtonGroup Zq;
  
  private Zzdy Zb;
  
  private Zzdy ZW;
  
  private Zzdy Zr;
  
  private Zzdy ZB;
  
  private Zzdy ZH;
  
  private Zzdy Zd;
  
  private Ze01 Zf;
  
  private Ze01 Zj;
  
  private Zedd Zi;
  
  private Zm2o ZX;
  
  private Zm99 Zo;
  
  private Zm99 ZI;
  
  private Zm99 Zc;
  
  private Zm99 ZD;
  
  private Zm99 ZZ;
  
  private Zm99 Zv;
  
  private Zbqc ZO;
  
  private Zm99 Zy;
  
  private Zm99 Z_;
  
  private Zm99 Zn;
  
  private Zmg2 Zl;
  
  private Zmg2 Zk;
  
  private Zmg2 ZtW;
  
  private Zmg2 ZF;
  
  private Zmg2 ZA;
  
  private Zmg2 Zt9;
  
  private Zmg2 Zt;
  
  private Zmg2 ZY;
  
  private Zbup Zw;
  
  private Zbqc Zx;
  
  private Zl8w Zt4;
  
  private Zgff Zm;
  
  private Zgff ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbyg(Zs1e paramZs1e, Zxzh paramZxzh, Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgb6 paramZgb6, Zbnt paramZbnt, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Ze4m paramZe4m, Zey9 paramZey9) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zr : ()Z
    //   7: aload_0
    //   8: aload_1
    //   9: putfield ZL : Lburp/Zs1e;
    //   12: istore #15
    //   14: aload_0
    //   15: aload_2
    //   16: putfield ZU : Lburp/Zxzh;
    //   19: aload_0
    //   20: aload_3
    //   21: putfield ZE : Lburp/Zz0n;
    //   24: aload_0
    //   25: aload #5
    //   27: putfield ZS : Lburp/Zerg;
    //   30: aload_0
    //   31: aload #6
    //   33: putfield ZM : Lburp/Zgb6;
    //   36: aload_0
    //   37: aload #8
    //   39: putfield Zs : Lburp/Ztwv;
    //   42: aload_0
    //   43: aload #9
    //   45: putfield ZJ : Lburp/Zr_4;
    //   48: aload_0
    //   49: aload #10
    //   51: putfield ZG : Lburp/Ztyg;
    //   54: aload_0
    //   55: aload #11
    //   57: putfield ZP : Lburp/Zgq7;
    //   60: aload_0
    //   61: aload #12
    //   63: putfield Zu : Lburp/Zlr9;
    //   66: aload_0
    //   67: aload #13
    //   69: putfield Zh : Lburp/Ze4m;
    //   72: aload_0
    //   73: aload #14
    //   75: putfield ZQ : Lburp/Zey9;
    //   78: aload_0
    //   79: invokevirtual ZH : ()V
    //   82: aload_0
    //   83: getfield Zy : Lburp/Zm99;
    //   86: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   89: invokevirtual Ze : (Lburp/Zlkk;)V
    //   92: aload_0
    //   93: getfield Z_ : Lburp/Zm99;
    //   96: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   99: invokevirtual Ze : (Lburp/Zlkk;)V
    //   102: aload_0
    //   103: getfield Zn : Lburp/Zm99;
    //   106: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   109: invokevirtual Ze : (Lburp/Zlkk;)V
    //   112: aload_1
    //   113: invokevirtual Zr : ()B
    //   116: lookupswitch default -> 196, 0 -> 144, 1 -> 183
    //   144: aload_0
    //   145: getfield ZY : Lburp/Zmg2;
    //   148: iconst_1
    //   149: invokevirtual setSelected : (Z)V
    //   152: aload_0
    //   153: aconst_null
    //   154: invokevirtual Zn : (Ljava/awt/event/ActionEvent;)V
    //   157: iload #15
    //   159: ifeq -> 196
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   168: athrow
    //   169: iconst_5
    //   170: anewarray burp/Zbqc
    //   173: invokestatic Zr : ([Lburp/Zbqc;)V
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_0
    //   184: getfield Zt : Lburp/Zmg2;
    //   187: iconst_1
    //   188: invokevirtual setSelected : (Z)V
    //   191: aload_0
    //   192: aconst_null
    //   193: invokevirtual Zw : (Ljava/awt/event/ActionEvent;)V
    //   196: aload_0
    //   197: getfield Zd : Lburp/Zzdy;
    //   200: aload_1
    //   201: invokevirtual Zq : ()Z
    //   204: invokevirtual setSelected : (Z)V
    //   207: aload_0
    //   208: getfield ZC : Lburp/Zgff;
    //   211: aload_1
    //   212: invokevirtual Zx : ()I
    //   215: invokestatic toString : (I)Ljava/lang/String;
    //   218: invokevirtual setText : (Ljava/lang/String;)V
    //   221: aload_0
    //   222: getfield ZW : Lburp/Zzdy;
    //   225: aload_1
    //   226: invokevirtual ZF : ()Z
    //   229: invokevirtual setSelected : (Z)V
    //   232: aload_0
    //   233: getfield Zb : Lburp/Zzdy;
    //   236: aload_1
    //   237: invokevirtual Za : ()Z
    //   240: invokevirtual setSelected : (Z)V
    //   243: aload_0
    //   244: getfield Zr : Lburp/Zzdy;
    //   247: aload_1
    //   248: invokevirtual Zo : ()Z
    //   251: invokevirtual setSelected : (Z)V
    //   254: aload_0
    //   255: getfield Zm : Lburp/Zgff;
    //   258: aload_1
    //   259: invokevirtual ZD : ()Ljava/lang/String;
    //   262: invokevirtual setText : (Ljava/lang/String;)V
    //   265: aload_1
    //   266: invokevirtual Zc : ()Z
    //   269: ifeq -> 292
    //   272: aload_0
    //   273: getfield Zt9 : Lburp/Zmg2;
    //   276: iconst_1
    //   277: invokevirtual setSelected : (Z)V
    //   280: iload #15
    //   282: ifeq -> 307
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   291: athrow
    //   292: aload_0
    //   293: getfield ZA : Lburp/Zmg2;
    //   296: iconst_1
    //   297: invokevirtual setSelected : (Z)V
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: aload_1
    //   308: invokevirtual ZI : ()Z
    //   311: ifeq -> 334
    //   314: aload_0
    //   315: getfield Zk : Lburp/Zmg2;
    //   318: iconst_1
    //   319: invokevirtual setSelected : (Z)V
    //   322: iload #15
    //   324: ifeq -> 349
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   333: athrow
    //   334: aload_0
    //   335: getfield Zl : Lburp/Zmg2;
    //   338: iconst_1
    //   339: invokevirtual setSelected : (Z)V
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   348: athrow
    //   349: aload_1
    //   350: invokevirtual Zy : ()Z
    //   353: ifeq -> 376
    //   356: aload_0
    //   357: getfield ZF : Lburp/Zmg2;
    //   360: iconst_1
    //   361: invokevirtual setSelected : (Z)V
    //   364: iload #15
    //   366: ifeq -> 391
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   375: athrow
    //   376: aload_0
    //   377: getfield ZtW : Lburp/Zmg2;
    //   380: iconst_1
    //   381: invokevirtual setSelected : (Z)V
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: aload_0
    //   392: new burp/Zt0_
    //   395: dup
    //   396: invokespecial <init> : ()V
    //   399: putfield ZtS : Lburp/Zt0_;
    //   402: aload_0
    //   403: new burp/Zbws
    //   406: dup
    //   407: aload_0
    //   408: getfield ZtS : Lburp/Zt0_;
    //   411: invokespecial <init> : (Lburp/Zztu;)V
    //   414: putfield ZR : Lburp/Zbws;
    //   417: aload_0
    //   418: aload_1
    //   419: invokevirtual ZM : ()Lburp/Zlil;
    //   422: invokevirtual ZQ : (Lburp/Zlil;)V
    //   425: aload_0
    //   426: getfield Zw : Lburp/Zbup;
    //   429: aload_0
    //   430: getfield ZR : Lburp/Zbws;
    //   433: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   436: aload_0
    //   437: getfield ZH : Lburp/Zzdy;
    //   440: aload_1
    //   441: invokevirtual ZP : ()Z
    //   444: invokevirtual setSelected : (Z)V
    //   447: aload_0
    //   448: getfield ZB : Lburp/Zzdy;
    //   451: aload_1
    //   452: invokevirtual Zf : ()Z
    //   455: invokevirtual setSelected : (Z)V
    //   458: aload_0
    //   459: new burp/Zbye
    //   462: dup
    //   463: aload_1
    //   464: invokevirtual ZB : ()Lburp/Zs1h;
    //   467: iconst_1
    //   468: aload_2
    //   469: aload_3
    //   470: aload #4
    //   472: aload #5
    //   474: aload #6
    //   476: aload #8
    //   478: aload #9
    //   480: aload #10
    //   482: aload #11
    //   484: aload #12
    //   486: aload #13
    //   488: aload #7
    //   490: aload #14
    //   492: invokespecial <init> : (Lburp/Zs1h;ZLburp/Zxzh;Lburp/Zz0n;Lburp/Zt4u;Lburp/Zerg;Lburp/Zgb6;Lburp/Ztwv;Lburp/Zr_4;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zlr9;Lburp/Ze4m;Lburp/Zbnt;Lburp/Zey9;)V
    //   495: putfield Zz : Lburp/Zbye;
    //   498: aload_0
    //   499: new burp/Zbyb
    //   502: dup
    //   503: aload_3
    //   504: aload #4
    //   506: aload_1
    //   507: invokevirtual ZO : ()Lburp/Zs1q;
    //   510: iconst_1
    //   511: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zs1q;Z)V
    //   514: putfield ZK : Lburp/Zbyb;
    //   517: aload_0
    //   518: getfield Zi : Lburp/Zedd;
    //   521: getstatic burp/Zlf9.ACTION_RUN_MACRO : Lburp/Zlf9;
    //   524: getfield description : Ljava/lang/String;
    //   527: invokevirtual addItem : (Ljava/lang/Object;)V
    //   530: aload_0
    //   531: getfield Zi : Lburp/Zedd;
    //   534: getstatic burp/Zlf9.ACTION_PROMPT_FOR_BROWSER_RECOVERY : Lburp/Zlf9;
    //   537: getfield description : Ljava/lang/String;
    //   540: invokevirtual addItem : (Ljava/lang/Object;)V
    //   543: aload_1
    //   544: invokevirtual ZL : ()Lburp/Ztb;
    //   547: getstatic burp/Ztb.RUN_MACRO : Lburp/Ztb;
    //   550: if_acmpne -> 573
    //   553: aload_0
    //   554: getfield Zi : Lburp/Zedd;
    //   557: iconst_0
    //   558: invokevirtual setSelectedIndex : (I)V
    //   561: iload #15
    //   563: ifeq -> 605
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   572: athrow
    //   573: aload_1
    //   574: invokevirtual ZL : ()Lburp/Ztb;
    //   577: getstatic burp/Ztb.PROMPT_FOR_IN_BROWSER_SESSION_RECOVERY : Lburp/Ztb;
    //   580: if_acmpne -> 605
    //   583: goto -> 590
    //   586: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   589: athrow
    //   590: aload_0
    //   591: getfield Zi : Lburp/Zedd;
    //   594: iconst_1
    //   595: invokevirtual setSelectedIndex : (I)V
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   604: athrow
    //   605: aload_0
    //   606: aload #7
    //   608: putfield Zto : Lburp/Zbnt;
    //   611: return
    // Exception table:
    //   from	to	target	type
    //   14	162	165	java/util/regex/PatternSyntaxException
    //   144	176	179	java/util/regex/PatternSyntaxException
    //   196	285	288	java/util/regex/PatternSyntaxException
    //   272	300	303	java/util/regex/PatternSyntaxException
    //   307	327	330	java/util/regex/PatternSyntaxException
    //   314	342	345	java/util/regex/PatternSyntaxException
    //   349	369	372	java/util/regex/PatternSyntaxException
    //   356	384	387	java/util/regex/PatternSyntaxException
    //   391	566	569	java/util/regex/PatternSyntaxException
    //   553	583	586	java/util/regex/PatternSyntaxException
    //   573	598	601	java/util/regex/PatternSyntaxException
  }
  
  private void ZQ(Zlil paramZlil) {
    Ze5r<Zlil, Zmk5> ze5r = this.ZU.Zp();
    synchronized (ze5r) {
      this.ZtS.ZM(ze5r.Za());
      int i = ze5r.Zo(paramZlil);
      try {
        if (i >= 0)
          this.ZR.getSelectionModel().setSelectionInterval(i, i); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } 
  }
  
  public void ZX(Zlil paramZlil) {
    this.ZU.ZX(paramZlil);
    ZQ(paramZlil);
  }
  
  public void Zu(Zlil paramZlil) {
    this.ZU.Zu(paramZlil);
    ZQ(paramZlil);
  }
  
  public String ZW() {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZR : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_2
    //   12: iload_2
    //   13: iconst_m1
    //   14: if_icmpne -> 36
    //   17: aload_0
    //   18: getfield ZL : Lburp/Zs1e;
    //   21: aconst_null
    //   22: invokevirtual Zi : (Lburp/Zlil;)V
    //   25: iload_1
    //   26: ifne -> 72
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: getfield ZL : Lburp/Zs1e;
    //   40: aload_0
    //   41: getfield ZtS : Lburp/Zt0_;
    //   44: invokevirtual ZL : ()Ljava/util/List;
    //   47: aload_0
    //   48: getfield ZR : Lburp/Zbws;
    //   51: invokevirtual getSelectedRow : ()I
    //   54: invokeinterface get : (I)Ljava/lang/Object;
    //   59: checkcast burp/Zlil
    //   62: invokevirtual Zi : (Lburp/Zlil;)V
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: goto -> 91
    //   75: astore_2
    //   76: aload_2
    //   77: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   80: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   83: aload_0
    //   84: getfield ZL : Lburp/Zs1e;
    //   87: aconst_null
    //   88: invokevirtual Zi : (Lburp/Zlil;)V
    //   91: aload_0
    //   92: getfield ZL : Lburp/Zs1e;
    //   95: invokevirtual Zr : ()B
    //   98: iconst_1
    //   99: if_icmpne -> 133
    //   102: aload_0
    //   103: getfield ZL : Lburp/Zs1e;
    //   106: invokevirtual ZM : ()Lburp/Zlil;
    //   109: ifnonnull -> 133
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   118: athrow
    //   119: sipush #-18379
    //   122: sipush #10968
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: areturn
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: aload_0
    //   134: getfield ZL : Lburp/Zs1e;
    //   137: aload_0
    //   138: getfield ZW : Lburp/Zzdy;
    //   141: invokevirtual isSelected : ()Z
    //   144: invokevirtual Zn : (Z)V
    //   147: aload_0
    //   148: getfield ZL : Lburp/Zs1e;
    //   151: aload_0
    //   152: getfield Zb : Lburp/Zzdy;
    //   155: invokevirtual isSelected : ()Z
    //   158: invokevirtual Zb : (Z)V
    //   161: aload_0
    //   162: getfield ZL : Lburp/Zs1e;
    //   165: aload_0
    //   166: getfield Zr : Lburp/Zzdy;
    //   169: invokevirtual isSelected : ()Z
    //   172: invokevirtual ZQ : (Z)V
    //   175: aload_0
    //   176: getfield ZL : Lburp/Zs1e;
    //   179: invokevirtual ZF : ()Z
    //   182: ifne -> 233
    //   185: aload_0
    //   186: getfield ZL : Lburp/Zs1e;
    //   189: invokevirtual Za : ()Z
    //   192: ifne -> 233
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: aload_0
    //   203: getfield ZL : Lburp/Zs1e;
    //   206: invokevirtual Zo : ()Z
    //   209: ifne -> 233
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: sipush #-18383
    //   222: sipush #5487
    //   225: invokestatic a : (II)Ljava/lang/String;
    //   228: areturn
    //   229: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   232: athrow
    //   233: aload_0
    //   234: getfield ZL : Lburp/Zs1e;
    //   237: aload_0
    //   238: getfield Zm : Lburp/Zgff;
    //   241: invokevirtual getText : ()Ljava/lang/String;
    //   244: invokevirtual Zq : (Ljava/lang/String;)V
    //   247: aload_0
    //   248: getfield ZL : Lburp/Zs1e;
    //   251: invokevirtual ZD : ()Ljava/lang/String;
    //   254: invokevirtual isEmpty : ()Z
    //   257: ifeq -> 274
    //   260: sipush #-18376
    //   263: sipush #18400
    //   266: invokestatic a : (II)Ljava/lang/String;
    //   269: areturn
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: aload_0
    //   275: getfield ZL : Lburp/Zs1e;
    //   278: aload_0
    //   279: getfield Zk : Lburp/Zmg2;
    //   282: invokevirtual isSelected : ()Z
    //   285: invokevirtual Ze : (Z)V
    //   288: aload_0
    //   289: getfield ZL : Lburp/Zs1e;
    //   292: aload_0
    //   293: getfield ZF : Lburp/Zmg2;
    //   296: invokevirtual isSelected : ()Z
    //   299: invokevirtual Zu : (Z)V
    //   302: aload_0
    //   303: getfield ZL : Lburp/Zs1e;
    //   306: aload_0
    //   307: getfield Zt9 : Lburp/Zmg2;
    //   310: invokevirtual isSelected : ()Z
    //   313: invokevirtual Zl : (Z)V
    //   316: aload_0
    //   317: getfield ZL : Lburp/Zs1e;
    //   320: invokevirtual Zc : ()Z
    //   323: ifeq -> 358
    //   326: aload_0
    //   327: getfield ZL : Lburp/Zs1e;
    //   330: invokevirtual Zz : ()V
    //   333: goto -> 365
    //   336: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   339: athrow
    //   340: astore_2
    //   341: sipush #-18387
    //   344: aload_2
    //   345: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   348: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   351: sipush #3124
    //   354: invokestatic a : (II)Ljava/lang/String;
    //   357: areturn
    //   358: aload_0
    //   359: getfield ZL : Lburp/Zs1e;
    //   362: invokevirtual Zs : ()V
    //   365: aload_0
    //   366: getfield Zz : Lburp/Zbye;
    //   369: invokevirtual ZW : ()Ljava/lang/String;
    //   372: astore_2
    //   373: aload_0
    //   374: getfield ZK : Lburp/Zbyb;
    //   377: invokevirtual ZW : ()Ljava/lang/String;
    //   380: astore_3
    //   381: aload_0
    //   382: getfield Zi : Lburp/Zedd;
    //   385: invokevirtual getSelectedIndex : ()I
    //   388: istore #4
    //   390: iload #4
    //   392: lookupswitch default -> 487, 0 -> 420, 1 -> 457
    //   420: aload_0
    //   421: getfield ZL : Lburp/Zs1e;
    //   424: getstatic burp/Ztb.RUN_MACRO : Lburp/Ztb;
    //   427: invokevirtual ZC : (Lburp/Ztb;)V
    //   430: aload_0
    //   431: getfield ZL : Lburp/Zs1e;
    //   434: invokevirtual Zf : ()Z
    //   437: ifeq -> 455
    //   440: goto -> 447
    //   443: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   446: athrow
    //   447: aload_2
    //   448: goto -> 456
    //   451: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   454: athrow
    //   455: aconst_null
    //   456: areturn
    //   457: aload_0
    //   458: getfield ZL : Lburp/Zs1e;
    //   461: getstatic burp/Ztb.PROMPT_FOR_IN_BROWSER_SESSION_RECOVERY : Lburp/Ztb;
    //   464: invokevirtual ZC : (Lburp/Ztb;)V
    //   467: aload_0
    //   468: getfield ZL : Lburp/Zs1e;
    //   471: invokevirtual Zf : ()Z
    //   474: ifeq -> 485
    //   477: aload_3
    //   478: goto -> 486
    //   481: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   484: athrow
    //   485: aconst_null
    //   486: areturn
    //   487: iconst_0
    //   488: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   491: iload #4
    //   493: i2l
    //   494: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   497: aconst_null
    //   498: areturn
    // Exception table:
    //   from	to	target	type
    //   4	72	75	java/lang/Exception
    //   12	29	32	java/lang/Exception
    //   17	65	68	java/lang/Exception
    //   91	112	115	java/lang/Exception
    //   102	129	129	java/lang/Exception
    //   133	195	198	java/lang/Exception
    //   185	212	215	java/lang/Exception
    //   202	229	229	java/lang/Exception
    //   233	270	270	java/lang/Exception
    //   274	336	336	java/lang/NumberFormatException
    //   326	333	340	java/util/regex/PatternSyntaxException
    //   390	440	443	java/lang/Exception
    //   420	451	451	java/lang/Exception
    //   457	481	481	java/lang/Exception
  }
  
  private void ZH() {
    this.ZN = new ButtonGroup();
    this.Za = new ButtonGroup();
    this.ZT = new ButtonGroup();
    this.Zq = new ButtonGroup();
    this.Zn = new Zm99();
    this.Zt = new Zmg2();
    this.ZY = new Zmg2();
    this.Zf = new Ze01();
    this.Zj = new Ze01();
    this.ZO = new Zbqc();
    this.Zd = new Zzdy();
    this.ZC = new Zgff();
    this.Zo = new Zm99();
    this.Zy = new Zm99();
    this.Z_ = new Zm99();
    this.ZB = new Zzdy();
    this.ZH = new Zzdy();
    this.Zi = new Zedd();
    this.ZI = new Zm99();
    this.Zb = new Zzdy();
    this.Zr = new Zzdy();
    this.ZW = new Zzdy();
    this.Zc = new Zm99();
    this.Zm = new Zgff();
    this.ZD = new Zm99();
    this.ZF = new Zmg2();
    this.ZtW = new Zmg2();
    this.ZZ = new Zm99();
    this.Zl = new Zmg2();
    this.Zk = new Zmg2();
    this.Zv = new Zm99();
    this.Zt9 = new Zmg2();
    this.ZA = new Zmg2();
    this.Zg = new Zmyw();
    this.Zw = new Zbup();
    this.Zt4 = new Zl8w();
    this.ZX = new Zm2o();
    this.ZV = new Zm99();
    this.Zx = new Zbqc();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zn.setText(a(-18382, -21787));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 36;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Zn, gridBagConstraints);
    this.ZN.add(this.Zt);
    this.Zt.setText(a(-18381, 27245));
    this.Zt.addActionListener(new Zzst(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zt, gridBagConstraints);
    this.ZN.add(this.ZY);
    this.ZY.setText(a(-18394, 4956));
    this.ZY.addActionListener(new Zk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZY, gridBagConstraints);
    this.Zf.setText(a(-18370, 9895));
    this.Zf.setToolTipText(a(-18385, -24398));
    this.Zf.addActionListener(new Zl78(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zf, gridBagConstraints);
    this.Zj.setText(a(-18377, -24549));
    this.Zj.setToolTipText(a(-18391, 19252));
    this.Zj.addActionListener(new Zx_t(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zj, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZO.setLayout(gridBagLayout2);
    this.Zd.setText(a(-18398, 22786));
    this.Zd.addActionListener(new Zkuo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.ZO.add(this.Zd, gridBagConstraints);
    this.ZC.setColumns(5);
    this.ZC.ZH(Zlw9.NUMBER);
    this.ZC.addFocusListener(new Zg_1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.ZO.add(this.ZC, gridBagConstraints);
    this.Zo.setText(a(-18373, -14523));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    this.ZO.add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZO, gridBagConstraints);
    this.Zy.setText(a(-18399, 23129));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.Zy, gridBagConstraints);
    this.Z_.setText(a(-18388, -9764));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.Z_, gridBagConstraints);
    this.ZB.setText(a(-18395, 10888));
    this.ZB.addActionListener(new Zrd1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 40;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZB, gridBagConstraints);
    this.ZH.setText(a(-18386, 19161));
    this.ZH.addActionListener(new Zbuy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 38;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZH, gridBagConstraints);
    this.Zi.addActionListener(new Zg_r(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 42;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zi, gridBagConstraints);
    this.ZI.setText(a(-18375, -3763));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 32;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZI, gridBagConstraints);
    this.Zb.setText(a(-18426, -9808));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 18;
    add(this.Zb, gridBagConstraints);
    this.Zr.setText(a(-18392, 22129));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 18;
    add(this.Zr, gridBagConstraints);
    this.ZW.setText(a(-18369, 13277));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 18;
    add(this.ZW, gridBagConstraints);
    this.Zc.setText(a(-18396, 30207));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zc, gridBagConstraints);
    this.Zm.setColumns(25);
    this.Zm.ZH(Zlw9.SEARCH_TERM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.anchor = 18;
    add(this.Zm, gridBagConstraints);
    this.ZD.setText(a(-18389, 5397));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZD, gridBagConstraints);
    this.Zq.add(this.ZF);
    this.ZF.setText(a(-18400, -24858));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 34;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.Zq.add(this.ZtW);
    this.ZtW.setText(a(-18374, 13807));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 32;
    gridBagConstraints.anchor = 18;
    add(this.ZtW, gridBagConstraints);
    this.ZZ.setText(a(-18371, -3087));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.ZZ, gridBagConstraints);
    this.ZT.add(this.Zl);
    this.Zl.setText(a(-18378, 19051));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 30;
    gridBagConstraints.anchor = 18;
    add(this.Zl, gridBagConstraints);
    this.ZT.add(this.Zk);
    this.Zk.setText(a(-18425, -25381));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 28;
    gridBagConstraints.anchor = 18;
    add(this.Zk, gridBagConstraints);
    this.Zv.setText(a(-18393, 27549));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    add(this.Zv, gridBagConstraints);
    this.Za.add(this.Zt9);
    this.Zt9.setText(a(-18372, 21712));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 26;
    gridBagConstraints.anchor = 18;
    add(this.Zt9, gridBagConstraints);
    this.Za.add(this.ZA);
    this.ZA.setText(a(-18380, 13786));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.anchor = 18;
    add(this.ZA, gridBagConstraints);
    this.Zg.setLeftComponent(this.Zw);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.fill = 1;
    add(this.Zg, gridBagConstraints);
    this.Zt4.setText(a(-18384, 2470));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zt4, gridBagConstraints);
    this.ZX.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_RULE_EDITOR_CHECK_SESSION_IS_VALID);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 15;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZX, gridBagConstraints);
    this.ZV.setText(a(-18397, 6485));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    add(this.ZV, gridBagConstraints);
    this.Zx.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 44;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zx, gridBagConstraints);
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    int i = this.ZR.getSelectedRow();
    try {
      if (i == -1)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zlil zlil = this.ZtS.ZL().get(i);
    try {
      if (zlil == null)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zr73 zr73 = new Zr73(this, zlil, false, this.ZU, this.ZE, this.ZS, this.ZM, Zt2m.ZF(this), this.Zs, this.ZJ, this.ZG, this.ZP, this.Zu, this.Zh, this.Zto, this.ZQ);
    zr73.setVisible(true);
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    Zr73 zr73 = new Zr73(this, new Zlil(this.ZU.ZS(), this.Zto, this.ZJ), true, this.ZU, this.ZE, this.ZS, this.ZM, Zt2m.ZF(this), this.Zs, this.ZJ, this.ZG, this.ZP, this.Zu, this.Zh, this.Zto, this.ZQ);
    zr73.setVisible(true);
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    this.ZL.ZO(this.ZH.isSelected());
  }
  
  private void ZX(ActionEvent paramActionEvent) {
    this.ZL.Zg(this.ZB.isSelected());
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    Zbyb zbyb;
    Zbye zbye = null;
    switch (this.Zi.getSelectedIndex()) {
      case 0:
        zbye = this.Zz;
        break;
      case 1:
        zbyb = this.ZK;
        break;
    } 
    try {
      if (this.Zta != zbyb) {
        try {
          this.Zx.removeAll();
          if (zbyb != null)
            this.Zx.add(zbyb, a(-18390, -20544)); 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        this.Zta = zbyb;
        revalidate();
        validate();
        repaint();
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    this.ZL.ZD((byte)0);
    this.ZH.setSelected(true);
    this.ZH.setEnabled(false);
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.ZL.ZD((byte)1);
    this.ZH.setEnabled(true);
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    this.ZL.ZY(this.Zd.isSelected());
  }
  
  private void Zu(FocusEvent paramFocusEvent) {
    try {
      this.ZL.ZP(Integer.parseInt(this.ZC.getText()));
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      this.ZL.ZP(1);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #34
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'cl;,¹ÎÕ}lB¼®\¨aY3Öµî)±Æ»\\f.ç'Ö9Nú^VK0ðÅ¨¤ËføqÉBÞdZm=¦Õ@w/9O8ò*>Iè$@hu¢ÎYíÁ»WGâ«Å§\\r_8#\\rX&"T¨Ô®hÃh\\rUåêqÿ\\r8»³UyDêvà$¾ïi©:K&rAÙgn\ÃgBtÚÁ±Ejp P¤fÜõEL)PKaËçl®U+J§%÷r]ô°°Ìì\\n|1Å°Yq/õ;ñ'ñT%`\\fàü³¬ì,ëUr»JMÒ$½yCàkåÏ9Äå¦¸¾ù)·òêSxJ,¼n]/Û§a*°ê5X ÆÚÜ6â²±<3$ÅÓ]»ÿêõa9­Á©ÛQZdx&:Y|^ÎÁ ²\\f&"oC¢·bHÂÞ\\n]\\n`ïlºIT±ù>&§ü7h\\b-u£}m:²òä±¬¹¾à í\\bOëÄ¬âSPnmÀÐáy= kÖw\\rüÖ\\n©5:sMì5n¶b0ÌóqP6^{ßÉÎÛ²+¦D~$c:Ò6êJ/Ý(k2U<[¡$ë²R­Són-Ù[ôö.*,zÜ¥Õ.OàÜ¥ìðój[hiZVNmÕiòÏ¯a¼ô ç\\nÙ\\tÃIÂ{-ď%ÂW(<\\nK¸r>fXaí=é£4ÎcÝ¨»¬Cu½\6R¨!yÃæL<ª_ÕÕLðsõcÚçm`\«ðky'v³"cðc÷v¶æT¨gúÈér;ê¬Ðþ.-¼:*¯¡?QK¸¤§:K]v\\t:ÒT@Ò\Úõª»æo¨%vÝØìû¸NÚ]°'Ê2qý«#¤i«4ý@ýî4;ècwØÊe¥-R¦» K¿ðq¬UµÍýS»bzØ¬"2{¸)KÎ{C7v²a9´Y7[ZÆß9r\\t. #\\n+ÖÏÑ£¿ }å'¹ùx`-ÏdT±{ Ý2XLK=ª²á¤ðÏÃ¸KûÙ`QW£Sw¦9 ½þ?,Èb5¨Ûj$Ê·«B°¶«ïªÝ»+FÎò]Æ¾Ç¢¾ø¤í\èÞß²ýÐw«. \\f¦hJèË}Ã³Ò/rïe@´x5¤¡ÛëM ü\\b~ÅW>ûIß¢Ç1Á°¼!ÛVïlÐ½\\rs±\\blÅ\\f t@Ç,&±[~ÂÝiÊ'ec-»¼9\\nCCeùR·ül\\få_×v:MÌ°ß·Ü:S\\fýjýÉkÞYDo7fh±?n'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #117
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
    //   68: ldc '5ûà<T'SP°w\\t %4þib-'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic burp/Zbyg.a : [Ljava/lang/String;
    //   132: bipush #34
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbyg.b : [Ljava/lang/String;
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
    //   212: bipush #38
    //   214: goto -> 244
    //   217: bipush #90
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #22
    //   234: goto -> 244
    //   237: bipush #64
    //   239: goto -> 244
    //   242: bipush #81
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
    int i = (paramInt1 ^ 0xFFFFB826) & 0xFFFF;
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
      byte b1 = 94;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */