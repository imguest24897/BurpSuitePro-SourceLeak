package burp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zl0r extends Zl04 implements Zsoy, Zmgv {
  private static boolean ZX;
  
  private final Zbk8 Za;
  
  private final Zrgd ZR;
  
  private final Zr_4 Zv;
  
  private final Zt_z ZJ;
  
  private final Zbws Ze;
  
  private final Zt_6 Zl;
  
  private final Zbws Zw;
  
  private final Zbkv Zs;
  
  private final Zbdf Zn;
  
  private final Zbdf ZK;
  
  private Zmjg ZB;
  
  private Zgp3 ZI;
  
  private boolean Zo;
  
  private Zm2o ZY;
  
  private Ze01 ZA;
  
  private Ze01 ZV;
  
  private Ze01 ZP;
  
  private Ze01 ZQ;
  
  private Zlte Zm;
  
  private Zm99 Zx;
  
  private Zm99 Zu;
  
  private Zm99 ZH;
  
  private Zbqc ZL;
  
  private Zbqc ZM;
  
  private Zbqc ZW;
  
  private Zbqc ZS;
  
  private Zbqc Zh;
  
  private Zbqc Zk;
  
  private Zbqc Zr;
  
  private Zbqc Z_;
  
  private Zmyz Zb;
  
  private Zmyz Zf;
  
  private Zbqc ZN;
  
  private Zbup Zq;
  
  private Zbup ZF;
  
  private Zl86 ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl0r(Zbk8 paramZbk8, Zz0n paramZz0n, Zgb6 paramZgb6, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zrgd paramZrgd) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZY : ()[I
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield Zo : Z
    //   12: astore #9
    //   14: aload_0
    //   15: aload #8
    //   17: putfield ZR : Lburp/Zrgd;
    //   20: aload #5
    //   22: ifnull -> 29
    //   25: iconst_1
    //   26: goto -> 30
    //   29: iconst_0
    //   30: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   33: ldc2_w 3
    //   36: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   39: aload_0
    //   40: aload_1
    //   41: putfield Za : Lburp/Zbk8;
    //   44: aload_0
    //   45: aload #5
    //   47: putfield Zv : Lburp/Zr_4;
    //   50: aload_0
    //   51: invokevirtual ZV : ()V
    //   54: aload_0
    //   55: getfield ZF : Lburp/Zbup;
    //   58: bipush #120
    //   60: bipush #8
    //   62: invokestatic Zf : (Ljava/awt/Component;II)V
    //   65: aload_0
    //   66: getfield Zq : Lburp/Zbup;
    //   69: bipush #120
    //   71: iconst_5
    //   72: invokestatic Zf : (Ljava/awt/Component;II)V
    //   75: aload_0
    //   76: getfield Zm : Lburp/Zlte;
    //   79: invokeinterface ZO : ()Ljavax/swing/JComponent;
    //   84: bipush #120
    //   86: bipush #12
    //   88: invokestatic Zf : (Ljava/awt/Component;II)V
    //   91: getstatic burp/Zl0r.ZX : Z
    //   94: ifeq -> 117
    //   97: aload_0
    //   98: aload_0
    //   99: getfield ZN : Lburp/Zbqc;
    //   102: invokevirtual remove : (Ljava/awt/Component;)V
    //   105: aload #9
    //   107: ifnonnull -> 143
    //   110: iconst_4
    //   111: anewarray burp/Zbqc
    //   114: invokestatic Zr : ([Lburp/Zbqc;)V
    //   117: aload_0
    //   118: getfield ZN : Lburp/Zbqc;
    //   121: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   124: invokevirtual Zl : (Lburp/Zlkk;)V
    //   127: aload_0
    //   128: getfield ZU : Lburp/Zl86;
    //   131: sipush #19441
    //   134: sipush #19498
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: invokevirtual setText : (Ljava/lang/String;)V
    //   143: aload_0
    //   144: new burp/Zt_z
    //   147: dup
    //   148: invokespecial <init> : ()V
    //   151: putfield ZJ : Lburp/Zt_z;
    //   154: aload_0
    //   155: new burp/Zbws
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: putfield Ze : Lburp/Zbws;
    //   165: aload_0
    //   166: getfield Ze : Lburp/Zbws;
    //   169: aload_0
    //   170: <illegal opcode> ZK : (Lburp/Zl0r;)Lburp/Zeq;
    //   175: invokevirtual Zc : (Lburp/Zeq;)V
    //   178: aload_0
    //   179: getfield Ze : Lburp/Zbws;
    //   182: aload_0
    //   183: getfield ZJ : Lburp/Zt_z;
    //   186: invokevirtual ZL : (Lburp/Zztu;)V
    //   189: aload_0
    //   190: getfield ZF : Lburp/Zbup;
    //   193: aload_0
    //   194: getfield Ze : Lburp/Zbws;
    //   197: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   200: aload_0
    //   201: new burp/Zt_6
    //   204: dup
    //   205: invokespecial <init> : ()V
    //   208: putfield Zl : Lburp/Zt_6;
    //   211: aload_0
    //   212: new burp/Zbwq
    //   215: dup
    //   216: aload_0
    //   217: invokespecial <init> : (Lburp/Zl0r;)V
    //   220: putfield Zw : Lburp/Zbws;
    //   223: aload_0
    //   224: getfield Zw : Lburp/Zbws;
    //   227: aload_0
    //   228: <illegal opcode> ZK : (Lburp/Zl0r;)Lburp/Zeq;
    //   233: invokevirtual Zc : (Lburp/Zeq;)V
    //   236: aload_0
    //   237: getfield Zw : Lburp/Zbws;
    //   240: aload_0
    //   241: getfield Zl : Lburp/Zt_6;
    //   244: invokevirtual ZL : (Lburp/Zztu;)V
    //   247: new burp/Zm2g
    //   250: dup
    //   251: aload_0
    //   252: invokespecial <init> : (Lburp/Zl0r;)V
    //   255: astore #10
    //   257: aload_0
    //   258: getfield Zw : Lburp/Zbws;
    //   261: invokevirtual getColumnModel : ()Ljavax/swing/table/TableColumnModel;
    //   264: invokeinterface getColumns : ()Ljava/util/Enumeration;
    //   269: astore #11
    //   271: aload #11
    //   273: invokeinterface hasMoreElements : ()Z
    //   278: ifeq -> 301
    //   281: aload #11
    //   283: invokeinterface nextElement : ()Ljava/lang/Object;
    //   288: checkcast javax/swing/table/TableColumn
    //   291: aload #10
    //   293: invokevirtual setCellRenderer : (Ljavax/swing/table/TableCellRenderer;)V
    //   296: aload #9
    //   298: ifnonnull -> 271
    //   301: aload_0
    //   302: getfield Zq : Lburp/Zbup;
    //   305: aload_0
    //   306: getfield Zw : Lburp/Zbws;
    //   309: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   312: aload_0
    //   313: getfield Zw : Lburp/Zbws;
    //   316: iconst_0
    //   317: invokevirtual setShowGrid : (Z)V
    //   320: aload_0
    //   321: getfield Zw : Lburp/Zbws;
    //   324: new java/awt/Dimension
    //   327: dup
    //   328: iconst_0
    //   329: iconst_0
    //   330: invokespecial <init> : (II)V
    //   333: invokevirtual setIntercellSpacing : (Ljava/awt/Dimension;)V
    //   336: aload_0
    //   337: getfield Zw : Lburp/Zbws;
    //   340: aload_0
    //   341: getfield Zw : Lburp/Zbws;
    //   344: invokevirtual getRowHeight : ()I
    //   347: iconst_2
    //   348: iadd
    //   349: invokevirtual setRowHeight : (I)V
    //   352: aload_0
    //   353: aload #6
    //   355: aload_0
    //   356: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   359: iconst_0
    //   360: getstatic burp/Zbdf.ZD : Ljava/util/EnumSet;
    //   363: getstatic burp/Zb9b.Zx : Lburp/Zb9b;
    //   366: invokevirtual Zz : (Lburp/Zmgv;Lburp/Zeew;ZLjava/util/EnumSet;Lburp/Zb9b;)Lburp/Zbdf;
    //   369: putfield Zn : Lburp/Zbdf;
    //   372: aload_0
    //   373: getfield Zm : Lburp/Zlte;
    //   376: sipush #19445
    //   379: sipush #19571
    //   382: invokestatic a : (II)Ljava/lang/String;
    //   385: aload #7
    //   387: getstatic burp/Zxff.SESSION_TRACER : Lburp/Zxff;
    //   390: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   393: aload_0
    //   394: getfield Zn : Lburp/Zbdf;
    //   397: invokeinterface Zc : (Lburp/Zbdf;)Lburp/Zefl;
    //   402: invokeinterface Zz : ()Lburp/Zefl;
    //   407: invokeinterface Zo : ()Lburp/Zefl;
    //   412: invokeinterface Zl : ()Lburp/Zbdx;
    //   417: invokeinterface addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   422: aload_0
    //   423: aload #6
    //   425: aload_0
    //   426: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   429: iconst_0
    //   430: getstatic burp/Zbdf.ZU : Ljava/util/EnumSet;
    //   433: getstatic burp/Zb9b.Zx : Lburp/Zb9b;
    //   436: invokevirtual Zz : (Lburp/Zmgv;Lburp/Zeew;ZLjava/util/EnumSet;Lburp/Zb9b;)Lburp/Zbdf;
    //   439: putfield ZK : Lburp/Zbdf;
    //   442: aload_0
    //   443: getfield Zm : Lburp/Zlte;
    //   446: sipush #19450
    //   449: sipush #-334
    //   452: invokestatic a : (II)Ljava/lang/String;
    //   455: aload #7
    //   457: getstatic burp/Zxff.SESSION_TRACER : Lburp/Zxff;
    //   460: invokevirtual ZP : (Lburp/Zxff;)Lburp/Zefl;
    //   463: aload_0
    //   464: getfield ZK : Lburp/Zbdf;
    //   467: invokeinterface Zc : (Lburp/Zbdf;)Lburp/Zefl;
    //   472: invokeinterface Zz : ()Lburp/Zefl;
    //   477: invokeinterface Zo : ()Lburp/Zefl;
    //   482: invokeinterface Zl : ()Lburp/Zbdx;
    //   487: invokeinterface addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   492: aload_0
    //   493: new burp/Zbkv
    //   496: dup
    //   497: iconst_0
    //   498: aload_3
    //   499: aload_2
    //   500: invokeinterface ZD : ()Lburp/Zb0h;
    //   505: aload #4
    //   507: invokespecial <init> : (ZLburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;)V
    //   510: putfield Zs : Lburp/Zbkv;
    //   513: aload_0
    //   514: getfield Zm : Lburp/Zlte;
    //   517: sipush #19453
    //   520: sipush #-14161
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: aload_0
    //   527: getfield Zs : Lburp/Zbkv;
    //   530: invokeinterface addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   535: aload_0
    //   536: aconst_null
    //   537: invokevirtual Zk : (Lburp/Zgp3;)V
    //   540: aload_0
    //   541: sipush #19439
    //   544: sipush #18884
    //   547: invokestatic a : (II)Ljava/lang/String;
    //   550: invokevirtual setTitle : (Ljava/lang/String;)V
    //   553: aload_0
    //   554: invokevirtual pack : ()V
    //   557: aload_0
    //   558: aload_1
    //   559: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   562: invokevirtual ZO : (Ljava/awt/Window;)V
    //   565: aload_0
    //   566: iconst_0
    //   567: invokevirtual setDefaultCloseOperation : (I)V
    //   570: aload_0
    //   571: new burp/Zxxg
    //   574: dup
    //   575: aload_0
    //   576: invokespecial <init> : (Lburp/Zl0r;)V
    //   579: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   582: return
  }
  
  private void ZF() {
    if (0 != Zx6o.Zc(this, a(19446, -2470), a(19427, 27625), new String[] { a(19428, 11353), a(19449, 14616) }0))
      return; 
    this.Za.ZR();
    setVisible(false);
    dispose();
  }
  
  private void ZE(int paramInt) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: aload_0
    //   6: getfield ZJ : Lburp/Zt_z;
    //   9: iload_1
    //   10: invokevirtual ZF : (I)Lburp/Zmjg;
    //   13: putfield ZB : Lburp/Zmjg;
    //   16: aload_0
    //   17: getfield ZB : Lburp/Zmjg;
    //   20: ifnonnull -> 39
    //   23: aload_0
    //   24: getfield Zl : Lburp/Zt_6;
    //   27: invokevirtual ZO : ()V
    //   30: aload_0
    //   31: aconst_null
    //   32: invokevirtual Zk : (Lburp/Zgp3;)V
    //   35: aload_2
    //   36: ifnonnull -> 87
    //   39: aload_0
    //   40: getfield Zl : Lburp/Zt_6;
    //   43: aload_0
    //   44: getfield ZB : Lburp/Zmjg;
    //   47: getfield ZG : Ljava/util/List;
    //   50: invokevirtual ZK : (Ljava/util/List;)V
    //   53: aload_0
    //   54: getfield ZB : Lburp/Zmjg;
    //   57: getfield ZG : Ljava/util/List;
    //   60: invokeinterface isEmpty : ()Z
    //   65: ifne -> 87
    //   68: aload_0
    //   69: getfield Zw : Lburp/Zbws;
    //   72: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   75: iconst_0
    //   76: iconst_0
    //   77: invokeinterface setSelectionInterval : (II)V
    //   82: aload_0
    //   83: iconst_0
    //   84: invokevirtual Zh : (I)V
    //   87: return
  }
  
  private void Zh(int paramInt) {
    this.ZI = this.Zl.ZL(paramInt);
    Zk(this.ZI);
  }
  
  private void Zk(Zgp3 paramZgp3) {
    // Byte code:
    //   0: invokestatic ZY : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 12
    //   8: aconst_null
    //   9: goto -> 16
    //   12: aload_1
    //   13: invokevirtual ZF : ()[B
    //   16: astore_3
    //   17: aload_1
    //   18: ifnonnull -> 25
    //   21: aconst_null
    //   22: goto -> 29
    //   25: aload_1
    //   26: invokevirtual ZH : ()Lburp/Zstu;
    //   29: astore #4
    //   31: aload_1
    //   32: ifnonnull -> 39
    //   35: aconst_null
    //   36: goto -> 43
    //   39: aload_1
    //   40: invokevirtual Zb : ()Lburp/Zstu;
    //   43: astore #5
    //   45: aload #4
    //   47: ifnonnull -> 79
    //   50: aload_0
    //   51: getfield Zn : Lburp/Zbdf;
    //   54: aconst_null
    //   55: checkcast [B
    //   58: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   61: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   64: aload_0
    //   65: getfield Zm : Lburp/Zlte;
    //   68: iconst_0
    //   69: iconst_0
    //   70: invokeinterface setEnabledAt : (IZ)V
    //   75: aload_2
    //   76: ifnonnull -> 107
    //   79: aload_0
    //   80: getfield Zn : Lburp/Zbdf;
    //   83: aload #4
    //   85: invokeinterface ZiD : ()[B
    //   90: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   93: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   96: aload_0
    //   97: getfield Zm : Lburp/Zlte;
    //   100: iconst_0
    //   101: iconst_1
    //   102: invokeinterface setEnabledAt : (IZ)V
    //   107: aload #5
    //   109: ifnonnull -> 141
    //   112: aload_0
    //   113: getfield ZK : Lburp/Zbdf;
    //   116: aconst_null
    //   117: checkcast [B
    //   120: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   123: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   126: aload_0
    //   127: getfield Zm : Lburp/Zlte;
    //   130: iconst_1
    //   131: iconst_0
    //   132: invokeinterface setEnabledAt : (IZ)V
    //   137: aload_2
    //   138: ifnonnull -> 169
    //   141: aload_0
    //   142: getfield ZK : Lburp/Zbdf;
    //   145: aload #5
    //   147: invokeinterface ZiD : ()[B
    //   152: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   155: invokevirtual ZN : ([BLburp/Zgu3;)V
    //   158: aload_0
    //   159: getfield Zm : Lburp/Zlte;
    //   162: iconst_1
    //   163: iconst_1
    //   164: invokeinterface setEnabledAt : (IZ)V
    //   169: aload_3
    //   170: ifnonnull -> 198
    //   173: aload_0
    //   174: getfield Zs : Lburp/Zbkv;
    //   177: getstatic net/portswigger/Zdo.ZQ : [B
    //   180: invokevirtual Zx : ([B)V
    //   183: aload_0
    //   184: getfield Zm : Lburp/Zlte;
    //   187: iconst_2
    //   188: iconst_0
    //   189: invokeinterface setEnabledAt : (IZ)V
    //   194: aload_2
    //   195: ifnonnull -> 217
    //   198: aload_0
    //   199: getfield Zs : Lburp/Zbkv;
    //   202: aload_3
    //   203: invokevirtual Zx : ([B)V
    //   206: aload_0
    //   207: getfield Zm : Lburp/Zlte;
    //   210: iconst_2
    //   211: iconst_1
    //   212: invokeinterface setEnabledAt : (IZ)V
    //   217: aload_0
    //   218: getfield Zm : Lburp/Zlte;
    //   221: aload_0
    //   222: getfield Zm : Lburp/Zlte;
    //   225: invokeinterface getSelectedIndex : ()I
    //   230: invokeinterface isEnabledAt : (I)Z
    //   235: ifne -> 315
    //   238: aload_0
    //   239: getfield Zm : Lburp/Zlte;
    //   242: iconst_0
    //   243: invokeinterface isEnabledAt : (I)Z
    //   248: ifeq -> 265
    //   251: aload_0
    //   252: getfield Zm : Lburp/Zlte;
    //   255: iconst_0
    //   256: invokeinterface setSelectedIndex : (I)V
    //   261: aload_2
    //   262: ifnonnull -> 315
    //   265: aload_0
    //   266: getfield Zm : Lburp/Zlte;
    //   269: iconst_1
    //   270: invokeinterface isEnabledAt : (I)Z
    //   275: ifeq -> 292
    //   278: aload_0
    //   279: getfield Zm : Lburp/Zlte;
    //   282: iconst_1
    //   283: invokeinterface setSelectedIndex : (I)V
    //   288: aload_2
    //   289: ifnonnull -> 315
    //   292: aload_0
    //   293: getfield Zm : Lburp/Zlte;
    //   296: iconst_2
    //   297: invokeinterface isEnabledAt : (I)Z
    //   302: ifeq -> 315
    //   305: aload_0
    //   306: getfield Zm : Lburp/Zlte;
    //   309: iconst_2
    //   310: invokeinterface setSelectedIndex : (I)V
    //   315: return
  }
  
  void ZV(Zmjg paramZmjg, Zgp3 paramZgp3) {
    int[] arrayOfInt = Zgsg.ZY();
    if (paramZmjg == this.ZB) {
      int i = this.Zw.getSelectedRow();
      this.Zl.Zy();
      if (i != -1) {
        this.Zw.getSelectionModel().setSelectionInterval(i, i);
        if (arrayOfInt == null) {
          if (this.ZB.ZG.size() == 1) {
            this.Zw.getSelectionModel().setSelectionInterval(0, 0);
            Zh(0);
          } 
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    if (this.ZB.ZG.size() == 1) {
      this.Zw.getSelectionModel().setSelectionInterval(0, 0);
      Zh(0);
    } 
  }
  
  void ZA(Zmjg paramZmjg, Zgp3 paramZgp3) {
    if (paramZmjg == this.ZB && paramZgp3 == this.ZI) {
      Zstu zstu = paramZgp3.Zb();
      if (zstu != null) {
        this.ZK.ZN(zstu.ZiD(), Zgu3.HTTP_RESPONSE);
        this.Zm.setEnabledAt(1, true);
      } 
    } 
  }
  
  public Ze44 Zl(Zeew paramZeew, Zlit paramZlit) {
    try {
      if (this.Zo)
        return null; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zmjg zmjg = new Zmjg(this, paramZeew, this.Zv, this.ZR, paramZlit);
      try {
        this.ZJ.Zs(zmjg);
        if (this.ZJ.getRowCount() == 1) {
          this.Ze.getSelectionModel().setSelectionInterval(0, 0);
          ZE(0);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      return zmjg;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public Zmzk Zod() {
    return (this.ZI == null) ? null : this.ZI.ZJ();
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return new Zepa(a(19454, -10370), Zk97.DESKTOP_OPTIONS_SESSIONS_SESSION_HANDLING_TRACER, Zt2m.ZF(this));
  }
  
  public Zstu Zos() {
    return (this.ZI == null) ? null : this.ZI.ZH();
  }
  
  public Zstu ZoO() {
    return (this.ZI == null) ? null : this.ZI.Zb();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return (this.ZI == null) ? 0L : this.ZI.Zg();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Zsou.ZD(this, paramZkl6.ZH());
  }
  
  private void ZV() {
    this.Zb = new Zmyz();
    this.Zf = new Zmyz();
    this.Zh = new Zbqc();
    this.Zk = new Zbqc();
    this.Zu = new Zm99();
    this.Zq = new Zbup();
    this.Zr = new Zbqc();
    this.Z_ = new Zbqc();
    this.ZH = new Zm99();
    this.Zm = new Zxer();
    this.ZW = new Zbqc();
    this.ZF = new Zbup();
    this.ZS = new Zbqc();
    this.Zx = new Zm99();
    this.ZL = new Zbqc();
    this.ZQ = new Ze01();
    this.ZA = new Ze01();
    this.ZV = new Ze01();
    this.ZY = new Zm2o();
    this.ZN = new Zbqc();
    this.ZM = new Zbqc();
    this.ZU = new Zl86();
    this.ZP = new Ze01();
    setDefaultCloseOperation(3);
    this.Zb.setOrientation(0);
    this.Zf.setOrientation(0);
    this.Zh.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.Zh.setLayout(new BorderLayout());
    this.Zk.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.Zk.setLayout(new BorderLayout());
    this.Zu.setText(a(19437, 25571));
    this.Zk.add(this.Zu, a(19452, 943));
    this.Zh.add(this.Zk, a(19455, 20827));
    this.Zh.add(this.Zq, a(19432, 12581));
    this.Zf.setLeftComponent(this.Zh);
    this.Zr.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.Zr.setLayout(new BorderLayout());
    this.Z_.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.Z_.setLayout(new BorderLayout());
    this.ZH.setText(a(19430, -32531));
    this.Z_.add(this.ZH, a(19438, 23694));
    this.Zr.add(this.Z_, a(19447, 3100));
    this.Zr.add(this.Zm.ZO(), a(19431, 5576));
    this.Zf.setRightComponent(this.Zr);
    this.Zb.setRightComponent(this.Zf);
    this.ZW.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    this.ZW.setLayout(new BorderLayout());
    this.ZW.add(this.ZF, a(19431, 5576));
    this.ZS.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.ZS.setLayout(new BorderLayout());
    this.Zx.setText(a(19433, 18521));
    this.ZS.add(this.Zx, a(19438, 23694));
    this.ZW.add(this.ZS, a(19447, 3100));
    this.Zb.setLeftComponent(this.ZW);
    getContentPane().add(this.Zb, a(19431, 5576));
    this.ZL.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0 };
    this.ZL.setLayout(gridBagLayout1);
    this.ZQ.setText(a(19426, -2000));
    this.ZQ.addActionListener(this::ZO);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    gridBagConstraints.weightx = 1.0D;
    this.ZL.add(this.ZQ, gridBagConstraints);
    this.ZA.setText(a(19425, -22966));
    this.ZA.addActionListener(this::Zp);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.ZL.add(this.ZA, gridBagConstraints);
    this.ZV.setText(a(19436, 11352));
    this.ZV.addActionListener(this::ZZ);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 22;
    this.ZL.add(this.ZV, gridBagConstraints);
    this.ZY.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_SESSION_HANDLING_TRACER);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.ZL.add(this.ZY, gridBagConstraints);
    getContentPane().add(this.ZL, a(19435, 7981));
    this.ZN.setBackground(Color.white);
    this.ZN.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
    this.ZM.setOpaque(false);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.ZM.setLayout(gridBagLayout2);
    this.ZU.setBorder((Border)null);
    this.ZU.setColumns(50);
    this.ZU.setEditable(false);
    this.ZU.setLineWrap(true);
    this.ZU.setRows(1);
    this.ZU.setWrapStyleWord(true);
    this.ZU.Zl(true);
    this.ZU.setOpaque(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.ZM.add(this.ZU, gridBagConstraints);
    this.ZP.setText(a(19448, -1974));
    this.ZP.addActionListener(this::ZC);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    this.ZM.add(this.ZP, gridBagConstraints);
    this.ZN.add(this.ZM);
    getContentPane().add(this.ZN, a(19447, 3100));
    pack();
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    ZF();
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    if (0 != Zx6o.Zc(this, a(19429, -13197), a(19434, 28790), new String[] { a(19451, 6315), a(19442, -7728) }0))
      return; 
    this.ZJ.Zt();
    ZE(-1);
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zgsg.ZY();
    this.Zo = !this.Zo;
    if (this.Zo) {
      setTitle(a(19443, 24547));
      this.ZQ.setText(a(19424, -11335));
      if (arrayOfInt == null) {
        setTitle(a(19444, -29784));
        this.ZQ.setText(a(19440, -13228));
        return;
      } 
      return;
    } 
    setTitle(a(19444, -29784));
    this.ZQ.setText(a(19440, -13228));
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    ZX = true;
    this.ZN.setVisible(false);
  }
  
  private void lambda$new$1(int paramInt1, int paramInt2) {
    Zh(paramInt1);
  }
  
  private void lambda$new$0(int paramInt1, int paramInt2) {
    ZE(paramInt1);
  }
  
  static {
    // Byte code:
    //   0: bipush #32
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'H'À(¸&?Iq?ÈwF> -õú\\nU_ðNÃÀÙ+FµïÉiÕ^I.Ï(·î¹:&)Y÷`+E­Gü*M¤2E=V_{´ÝLü¸(Ïîx¨\\f?LáêÛ¼CTdö¦¨·ù[§g£MKWÖÄh\\ffä}\\nêÿ ò~õ)Sk$ Oã²Ã¥oBÖß¿n*fþ`ñÍHÔ@ÿÒý­Ñ#¯{î\\tSaDZ­ÅìÝ|¨Ê*á+ÚUt\\f%·ÜÔhu]¬¢4g4Ï"ï·¿!i%ópçºø~¤dbÙáD\\fºÄÒâ¹$RÓøù<ß\\b(æÎ>ÁX­"®¢à[1¥v¶ÇwË\Z/6¸¹Û3¯åäÒ¦kQs#wK»Ä\\bàyt+-Û¨x05±mæé\\tú[@ÐÁóàêè{<!ÒÉþ_¢<+Ü>h"®ËÉµk«õrÌÂ£Z[ *päñ4cê¢Ü©®_ {X§Ý:\\tó«¢Â,/[«Ø¯)|-Yò.Ýr2YÂZê\\nÖJÚÿAºTDÛë?°îeÍÁØj\\fb³ð'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #44
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc ' ÐG:ÃÒÃ­â}Ä\\nà¨r¢Ùáe/µPëë5µ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: iconst_3
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 140
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 80
    //   124: aload #5
    //   126: putstatic burp/Zl0r.a : [Ljava/lang/String;
    //   129: bipush #32
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zl0r.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #57
    //   210: goto -> 240
    //   213: bipush #20
    //   215: goto -> 240
    //   218: bipush #46
    //   220: goto -> 240
    //   223: bipush #112
    //   225: goto -> 240
    //   228: bipush #71
    //   230: goto -> 240
    //   233: bipush #97
    //   235: goto -> 240
    //   238: bipush #97
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 39, 0 -> 96
    //   296: iconst_0
    //   297: putstatic burp/Zl0r.ZX : Z
    //   300: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4BEC) & 0xFFFF;
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
      byte b1 = 92;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */