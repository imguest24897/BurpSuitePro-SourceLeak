package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqe;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import org.jetbrains.annotations.NotNull;

public class Zbm2 extends Zbv5 implements Zeq, Zky2 {
  private final Zt4u Za;
  
  private final Ztov ZF;
  
  private final Zgb6 Zy;
  
  private final Zb0h Zb;
  
  private final Ztwv ZP;
  
  private final Ztn2 Z_;
  
  private final Zbws ZG;
  
  private final Ztn9 Zl;
  
  private final List<String[]> ZX;
  
  private final Zxgc Zv;
  
  private final Zrn7 Zd;
  
  private Zeu1 ZW;
  
  private Zm2o Zj;
  
  private Zm2o ZR;
  
  private Zl8w ZO;
  
  private Zbkc ZH;
  
  private Zm99 ZS;
  
  private Zbqc Zh;
  
  private Zmyz Zo;
  
  private Zzdy ZK;
  
  private Ze01 Zg;
  
  private Ze01 Zf;
  
  private Ze01 Zr;
  
  private Ze01 ZU;
  
  private Zbvt Zu;
  
  private Zxer ZI;
  
  private JSeparator ZD;
  
  private Zbqc ZT;
  
  private Zbqc ZJ;
  
  private Zbqc ZE;
  
  private Zbqc Zc;
  
  private Zbup Zn;
  
  private Zbup ZY;
  
  private Zgf8 ZL;
  
  private Zg85 Zt;
  
  private static int Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbm2(Zt4u paramZt4u, Zxgc paramZxgc, Ztov paramZtov, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zlli<Zt1f> paramZlli, Zrn7 paramZrn7, Ztzq paramZtzq) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Za : Lburp/Zt4u;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Zv : Lburp/Zxgc;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield ZF : Lburp/Ztov;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield Zy : Lburp/Zgb6;
    //   25: invokestatic Zc : ()I
    //   28: aload_0
    //   29: aload #5
    //   31: putfield Zb : Lburp/Zb0h;
    //   34: aload_0
    //   35: aload #6
    //   37: putfield ZP : Lburp/Ztwv;
    //   40: aload_0
    //   41: aload #8
    //   43: putfield Zd : Lburp/Zrn7;
    //   46: aload_0
    //   47: new burp/Ztn2
    //   50: dup
    //   51: aload #9
    //   53: invokespecial <init> : (Lburp/Ztzq;)V
    //   56: putfield Z_ : Lburp/Ztn2;
    //   59: aload_0
    //   60: new java/util/ArrayList
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: putfield ZX : Ljava/util/List;
    //   70: aload_0
    //   71: invokevirtual ZZ : ()V
    //   74: istore #10
    //   76: aload_0
    //   77: getfield ZI : Lburp/Zxer;
    //   80: sipush #-10819
    //   83: sipush #-14938
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokevirtual setName : (Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield ZU : Lburp/Ze01;
    //   96: sipush #-10833
    //   99: sipush #-19484
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: invokevirtual setName : (Ljava/lang/String;)V
    //   108: aload_0
    //   109: getfield Zf : Lburp/Ze01;
    //   112: sipush #-10827
    //   115: sipush #13329
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: invokevirtual setName : (Ljava/lang/String;)V
    //   124: aload_0
    //   125: getfield ZL : Lburp/Zgf8;
    //   128: new burp/Zg9y
    //   131: dup
    //   132: aload_0
    //   133: invokespecial <init> : (Lburp/Zbm2;)V
    //   136: bipush #20
    //   138: invokevirtual Zv : (Lburp/Zm6a;I)V
    //   141: aload_0
    //   142: new burp/Zbws
    //   145: dup
    //   146: aload_0
    //   147: getfield Z_ : Lburp/Ztn2;
    //   150: invokespecial <init> : (Lburp/Zztu;)V
    //   153: putfield ZG : Lburp/Zbws;
    //   156: aload_0
    //   157: getfield ZG : Lburp/Zbws;
    //   160: sipush #-10818
    //   163: sipush #-1402
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: invokevirtual setName : (Ljava/lang/String;)V
    //   172: aload_0
    //   173: getfield ZG : Lburp/Zbws;
    //   176: iconst_2
    //   177: invokevirtual setSelectionMode : (I)V
    //   180: aload_0
    //   181: getfield ZY : Lburp/Zbup;
    //   184: aload_0
    //   185: getfield ZG : Lburp/Zbws;
    //   188: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   191: aload_0
    //   192: getfield ZY : Lburp/Zbup;
    //   195: aload_0
    //   196: getfield ZG : Lburp/Zbws;
    //   199: invokevirtual Zy : (Lburp/Zbws;)V
    //   202: aload_0
    //   203: getfield ZG : Lburp/Zbws;
    //   206: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   209: aload_0
    //   210: <illegal opcode> valueChanged : (Lburp/Zbm2;)Ljavax/swing/event/ListSelectionListener;
    //   215: invokeinterface addListSelectionListener : (Ljavax/swing/event/ListSelectionListener;)V
    //   220: aload_0
    //   221: getfield ZG : Lburp/Zbws;
    //   224: aload_0
    //   225: invokevirtual Zc : (Lburp/Zeq;)V
    //   228: aload_0
    //   229: getfield ZG : Lburp/Zbws;
    //   232: aload_0
    //   233: invokevirtual Zk : (Lburp/Zky2;)V
    //   236: aload_0
    //   237: getfield Z_ : Lburp/Ztn2;
    //   240: aload_0
    //   241: <illegal opcode> tableChanged : (Lburp/Zbm2;)Ljavax/swing/event/TableModelListener;
    //   246: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   249: aload_0
    //   250: new burp/Ztn9
    //   253: dup
    //   254: aload_0
    //   255: getfield ZX : Ljava/util/List;
    //   258: invokespecial <init> : (Ljava/util/List;)V
    //   261: putfield Zl : Lburp/Ztn9;
    //   264: aload_0
    //   265: getfield Zn : Lburp/Zbup;
    //   268: new burp/Zbws
    //   271: dup
    //   272: aload_0
    //   273: getfield Zl : Lburp/Ztn9;
    //   276: invokespecial <init> : (Lburp/Zztu;)V
    //   279: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   282: aload_0
    //   283: aconst_null
    //   284: invokevirtual Zd : (Lburp/Zeu1;)V
    //   287: aload_0
    //   288: getfield ZK : Lburp/Zzdy;
    //   291: sipush #-10843
    //   294: sipush #22158
    //   297: invokestatic a : (II)Ljava/lang/String;
    //   300: invokevirtual setName : (Ljava/lang/String;)V
    //   303: aload_0
    //   304: getfield Zu : Lburp/Zbvt;
    //   307: getstatic burp/Zlkk.CUMULATIVE_PERFORMANCE_INDICATOR : Lburp/Zlkk;
    //   310: invokevirtual Zl : (Lburp/Zlkk;)V
    //   313: aload #7
    //   315: getstatic burp/Zt1f.Zc : Lburp/Zlnb;
    //   318: aload_0
    //   319: <illegal opcode> accept : (Lburp/Zbm2;)Ljava/util/function/Consumer;
    //   324: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   329: pop
    //   330: aload #7
    //   332: getstatic burp/Zt1f.Zb : Lburp/Zlnb;
    //   335: aload_0
    //   336: <illegal opcode> accept : (Lburp/Zbm2;)Ljava/util/function/Consumer;
    //   341: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   346: pop
    //   347: aload #7
    //   349: getstatic burp/Zt1f.Zm : Lburp/Zlnb;
    //   352: aload_0
    //   353: aload #9
    //   355: <illegal opcode> accept : (Lburp/Zbm2;Lburp/Ztzq;)Ljava/util/function/Consumer;
    //   360: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   365: pop
    //   366: aload #7
    //   368: getstatic burp/Zt1f.Zv : Lburp/Zlnb;
    //   371: aload_0
    //   372: aload #9
    //   374: <illegal opcode> accept : (Lburp/Zbm2;Lburp/Ztzq;)Ljava/util/function/Consumer;
    //   379: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   384: pop
    //   385: aload #7
    //   387: getstatic burp/Zt1f.ZJ : Lburp/Zlnb;
    //   390: aload_0
    //   391: <illegal opcode> accept : (Lburp/Zbm2;)Ljava/util/function/Consumer;
    //   396: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   401: pop
    //   402: aload #7
    //   404: getstatic burp/Zt1f.ZY : Lburp/Zlnb;
    //   407: aload_0
    //   408: <illegal opcode> accept : (Lburp/Zbm2;)Ljava/util/function/Consumer;
    //   413: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   418: pop
    //   419: iload #10
    //   421: ifeq -> 431
    //   424: iconst_5
    //   425: anewarray burp/Zbqc
    //   428: invokestatic Zr : ([Lburp/Zbqc;)V
    //   431: return
  }
  
  private void ZO(boolean paramBoolean) {
    this.ZI.setEnabled(paramBoolean);
    this.ZK.setEnabled(paramBoolean);
    this.Zt.setEnabled(paramBoolean);
  }
  
  private void Zd(Zeu1 paramZeu1) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_2
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 19
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual Ze : (Lburp/Zeu1;)V
    //   15: iload_2
    //   16: ifne -> 29
    //   19: aload_0
    //   20: aload_1
    //   21: <illegal opcode> run : (Lburp/Zbm2;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   26: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   29: return
  }
  
  private void Ze(Zeu1 paramZeu1) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull -> 64
    //   8: aload_0
    //   9: iconst_0
    //   10: invokevirtual ZO : (Z)V
    //   13: aload_0
    //   14: getfield ZK : Lburp/Zzdy;
    //   17: iconst_0
    //   18: invokevirtual setSelected : (Z)V
    //   21: aload_0
    //   22: getfield Zt : Lburp/Zg85;
    //   25: ldc ''
    //   27: invokevirtual setText : (Ljava/lang/String;)V
    //   30: aload_0
    //   31: getfield ZX : Ljava/util/List;
    //   34: invokeinterface clear : ()V
    //   39: aload_0
    //   40: getfield Zl : Lburp/Ztn9;
    //   43: invokevirtual fireTableDataChanged : ()V
    //   46: aload_0
    //   47: getfield ZE : Lburp/Zbqc;
    //   50: invokevirtual removeAll : ()V
    //   53: aload_0
    //   54: getfield ZJ : Lburp/Zbqc;
    //   57: invokevirtual removeAll : ()V
    //   60: iload_2
    //   61: ifne -> 255
    //   64: aload_0
    //   65: iconst_1
    //   66: invokevirtual ZO : (Z)V
    //   69: aload_0
    //   70: getfield ZK : Lburp/Zzdy;
    //   73: aload_1
    //   74: invokevirtual ZP : ()Z
    //   77: invokevirtual setSelected : (Z)V
    //   80: aload_0
    //   81: getfield Zt : Lburp/Zg85;
    //   84: aload_1
    //   85: invokevirtual ZN : ()Ljava/lang/String;
    //   88: invokevirtual setText : (Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield ZX : Ljava/util/List;
    //   95: invokeinterface clear : ()V
    //   100: aload_1
    //   101: aload_0
    //   102: getfield ZX : Ljava/util/List;
    //   105: invokevirtual Zy : (Ljava/util/List;)V
    //   108: aload_1
    //   109: invokevirtual ZP : ()Z
    //   112: ifeq -> 126
    //   115: aload_1
    //   116: invokevirtual ZF : ()Lburp/Zlz3;
    //   119: aload_0
    //   120: getfield ZX : Ljava/util/List;
    //   123: invokevirtual ZG : (Ljava/util/List;)V
    //   126: aload_0
    //   127: getfield Zl : Lburp/Ztn9;
    //   130: invokevirtual fireTableDataChanged : ()V
    //   133: aload_0
    //   134: getfield ZW : Lburp/Zeu1;
    //   137: aload_1
    //   138: if_acmpeq -> 255
    //   141: aload_0
    //   142: getfield ZE : Lburp/Zbqc;
    //   145: invokevirtual removeAll : ()V
    //   148: aload_0
    //   149: getfield ZJ : Lburp/Zbqc;
    //   152: invokevirtual removeAll : ()V
    //   155: aload_0
    //   156: getfield ZE : Lburp/Zbqc;
    //   159: new burp/Zbvq
    //   162: dup
    //   163: aload_0
    //   164: getfield Za : Lburp/Zt4u;
    //   167: aload_0
    //   168: getfield ZI : Lburp/Zxer;
    //   171: iconst_1
    //   172: aload_1
    //   173: invokevirtual ZU : ()Lburp/Zkvz;
    //   176: iconst_0
    //   177: aload_0
    //   178: getfield Zy : Lburp/Zgb6;
    //   181: aload_0
    //   182: getfield Zb : Lburp/Zb0h;
    //   185: aload_0
    //   186: getfield ZP : Lburp/Ztwv;
    //   189: sipush #-10820
    //   192: sipush #16727
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: invokespecial <init> : (Lburp/Zt4u;Lburp/Zlte;ILburp/Zkvz;ZLburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Ljava/lang/String;)V
    //   201: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   204: pop
    //   205: aload_0
    //   206: getfield ZJ : Lburp/Zbqc;
    //   209: new burp/Zbvq
    //   212: dup
    //   213: aload_0
    //   214: getfield Za : Lburp/Zt4u;
    //   217: aload_0
    //   218: getfield ZI : Lburp/Zxer;
    //   221: iconst_2
    //   222: aload_1
    //   223: invokevirtual ZJ : ()Lburp/Zkvz;
    //   226: iconst_0
    //   227: aload_0
    //   228: getfield Zy : Lburp/Zgb6;
    //   231: aload_0
    //   232: getfield Zb : Lburp/Zb0h;
    //   235: aload_0
    //   236: getfield ZP : Lburp/Ztwv;
    //   239: sipush #-10836
    //   242: sipush #-12820
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: invokespecial <init> : (Lburp/Zt4u;Lburp/Zlte;ILburp/Zkvz;ZLburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Ljava/lang/String;)V
    //   251: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   254: pop
    //   255: aload_0
    //   256: aload_1
    //   257: putfield ZW : Lburp/Zeu1;
    //   260: return
  }
  
  private void ZK(@NotNull Zeu1 paramZeu1, boolean paramBoolean) {
    int i = Zc();
    Zuh.Zb((paramBoolean == (!paramZeu1.ZP())), Zqf.Zr);
    if (!paramBoolean && !Zx6o.ZY(this, a(-10832, 26802) + a(-10832, 26802) + paramZeu1.ZN())) {
      if (paramZeu1 == this.ZW)
        this.ZK.setSelected(true); 
      paramZeu1.Zk.set(false);
      return;
    } 
    if (paramBoolean) {
      ZR(paramZeu1);
      if (i != 0) {
        ZD(paramZeu1);
        return;
      } 
      return;
    } 
    ZD(paramZeu1);
  }
  
  private void Zq(List<Zeu1> paramList) {
    paramList.forEach(this::lambda$loadExtensions$17);
  }
  
  private void ZR(Zeu1 paramZeu1) {
    try {
      paramZeu1.ZU().ZB();
      paramZeu1.ZJ().ZB();
      new Zbn2(this.Za, this.Zv, this.ZF, paramZeu1, this.Zy, this.Zb, this.ZP, this.Zd);
      if (paramZeu1.ZR())
        Zm2.ZB(Zec3.BAPP_ENABLE, paramZeu1.ZN()); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      paramZeu1.Zk.set(false);
    } 
    Zw(paramZeu1, true);
  }
  
  private void ZO(List<Zeu1> paramList) {
    String str = (paramList.size() == 1) ? String.format(a(-10835, -7882), new Object[] { ((Zeu1)paramList.get(0)).ZN() }) : String.format(a(-10840, -5909), new Object[] { Integer.valueOf(paramList.size()) });
    if (!Zx6o.ZY(this, String.format(a(-10825, 21445), new Object[] { str })))
      return; 
    paramList.forEach(this::lambda$unloadExtensions$18);
  }
  
  private void ZD(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZP : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zbm2;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: return
  }
  
  private void ZI(@NotNull Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZP : ()Z
    //   4: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   7: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   10: aload_0
    //   11: getfield ZP : Lburp/Ztwv;
    //   14: aload_0
    //   15: aload_1
    //   16: <illegal opcode> run : (Lburp/Zbm2;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   21: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   26: pop
    //   27: return
  }
  
  private void ZZ(Zeu1 paramZeu1) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: ifnonnull -> 17
    //   8: aload_0
    //   9: aconst_null
    //   10: invokevirtual Zd : (Lburp/Zeu1;)V
    //   13: iload_2
    //   14: ifne -> 49
    //   17: aload_0
    //   18: getfield Z_ : Lburp/Ztn2;
    //   21: aload_1
    //   22: invokevirtual Zr : (Lburp/Zeu1;)I
    //   25: istore_3
    //   26: iload_3
    //   27: iflt -> 49
    //   30: aload_0
    //   31: getfield ZG : Lburp/Zbws;
    //   34: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   37: iload_3
    //   38: iload_3
    //   39: invokeinterface setSelectionInterval : (II)V
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual Zd : (Lburp/Zeu1;)V
    //   49: return
  }
  
  private void Zw(Zeu1 paramZeu1, boolean paramBoolean) {
    int i = this.Z_.Zr(paramZeu1);
    if (i != -1)
      this.Z_.fireTableRowsUpdated(i, i); 
    if (paramBoolean && paramZeu1 == this.ZW)
      Zd(this.ZW); 
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    ZG(this.ZL.getText());
    Zeu1 zeu1 = this.Z_.ZU(paramInt1);
    if (this.ZW != zeu1)
      Zd(zeu1); 
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    int i = this.ZG.rowAtPoint(paramPoint);
    if (!this.ZG.isRowSelected(i)) {
      this.ZG.clearSelection();
      this.ZG.addRowSelectionInterval(i, i);
    } 
    Zkj9 zkj9 = new Zkj9();
    Objects.requireNonNull(zkj9);
    Zw().forEach(zkj9::add);
    zkj9.show(paramMouseEvent.getComponent(), paramPoint.x, paramPoint.y);
  }
  
  private List<Component> Zw() {
    ArrayList<Zepe> arrayList = new ArrayList();
    Objects.requireNonNull(this.Z_);
    List<Zeu1> list1 = (List)Arrays.stream(this.ZG.getSelectedRows()).mapToObj(this.Z_::ZU).filter(Predicate.not(Zeu1::ZP)).collect(Collectors.toList());
    if (!list1.isEmpty())
      arrayList.add(Zc(list1)); 
    Objects.requireNonNull(this.Z_);
    List<Zeu1> list2 = (List)Arrays.stream(this.ZG.getSelectedRows()).mapToObj(this.Z_::ZU).filter(Zeu1::ZP).collect(Collectors.toList());
    if (!list2.isEmpty())
      arrayList.add(Zz(list2)); 
    arrayList.add(new Zem9());
    arrayList.add(ZJ());
    return (List)arrayList;
  }
  
  private Zepe Zc(List<Zeu1> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> actionPerformed : (Lburp/Zbm2;Ljava/util/List;)Ljava/awt/event/ActionListener;
    //   7: astore_2
    //   8: new burp/Zepe
    //   11: dup
    //   12: sipush #-10829
    //   15: sipush #5141
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: astore_3
    //   25: aload_3
    //   26: aload_2
    //   27: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   30: aload_3
    //   31: areturn
  }
  
  private Zepe Zz(List<Zeu1> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> actionPerformed : (Lburp/Zbm2;Ljava/util/List;)Ljava/awt/event/ActionListener;
    //   7: astore_2
    //   8: new burp/Zepe
    //   11: dup
    //   12: sipush #-10848
    //   15: sipush #30752
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokespecial <init> : (Ljava/lang/String;)V
    //   24: astore_3
    //   25: aload_3
    //   26: aload_2
    //   27: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   30: aload_3
    //   31: areturn
  }
  
  private Zepe ZJ() {
    Zepe zepe = new Zepe(a(-10822, 16878));
    zepe.addActionListener(this::ZF);
    return zepe;
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic ZS : ()I
    //   3: istore #4
    //   5: iload_3
    //   6: ifeq -> 10
    //   9: return
    //   10: aload_0
    //   11: getfield Z_ : Lburp/Ztn2;
    //   14: iload_2
    //   15: invokevirtual ZU : (I)Lburp/Zeu1;
    //   18: astore #5
    //   20: aload #5
    //   22: ifnull -> 91
    //   25: aload #5
    //   27: getfield Zk : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   30: iconst_1
    //   31: invokevirtual getAndSet : (Z)Z
    //   34: istore #6
    //   36: iload #6
    //   38: ifeq -> 42
    //   41: return
    //   42: aload #5
    //   44: invokevirtual ZP : ()Z
    //   47: ifeq -> 72
    //   50: aload_1
    //   51: invokevirtual getModifiers : ()I
    //   54: getstatic burp/Zsqw.Zz : I
    //   57: iand
    //   58: ifeq -> 72
    //   61: aload_0
    //   62: aload #5
    //   64: invokevirtual ZI : (Lburp/Zeu1;)V
    //   67: iload #4
    //   69: ifne -> 91
    //   72: aload_0
    //   73: aload #5
    //   75: aload #5
    //   77: invokevirtual ZP : ()Z
    //   80: ifne -> 87
    //   83: iconst_1
    //   84: goto -> 88
    //   87: iconst_0
    //   88: invokevirtual ZK : (Lburp/Zeu1;Z)V
    //   91: return
  }
  
  private void ZG(String paramString) {
    int i = this.ZG.getSelectionModel().getSelectedItemsCount();
    boolean bool1 = (this.ZG.getRowCount() > 0) ? true : false;
    boolean bool2 = (i == 1) ? true : false;
    boolean bool = Zsw8.ZS(paramString);
    this.Zr.setEnabled((bool1 && i > 0));
    this.ZU.setEnabled((bool1 && bool2 && !bool));
    this.Zf.setEnabled((bool1 && bool2 && !bool));
  }
  
  private void ZZ() {
    this.Zc = new Zbqc();
    this.Zu = new Zbvt();
    this.ZD = new JSeparator();
    this.ZH = new Zbkc();
    this.Zo = new Zmyz();
    this.Zh = new Zbqc();
    this.Zg = new Ze01();
    this.ZU = new Ze01();
    this.Zf = new Ze01();
    this.Zr = new Ze01();
    this.ZY = new Zbup();
    this.ZI = new Zxer();
    this.ZT = new Zbqc();
    this.ZK = new Zzdy();
    this.Zn = new Zbup();
    this.ZS = new Zm99();
    this.Zt = new Zg85();
    this.ZR = new Zm2o();
    this.ZE = new Zbqc();
    this.ZJ = new Zbqc();
    this.ZO = new Zl8w();
    this.Zj = new Zm2o();
    this.ZL = new Zgf8();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zc.Zl(Zlkk.CUMULATIVE_PERFORMANCE_INDICATOR);
    this.Zc.setBorder(new Zr6s(new Insets(10, 10, 10, 10)));
    this.Zc.setLayout(new GridBagLayout());
    this.Zu.setMinimumSize(new Dimension(50, 20));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    this.Zc.add(this.Zu, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zc, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    add(this.ZD, gridBagConstraints);
    this.ZH.Zx(a(-10842, 1987));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 21;
    add(this.ZH, gridBagConstraints);
    this.Zo.setOrientation(0);
    this.Zh.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.Zh.setLayout(gridBagLayout2);
    this.Zg.setText(a(-10821, -17494));
    this.Zg.setName(a(-10845, -11636));
    this.Zg.addActionListener(new Zz3q(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zh.add(this.Zg, gridBagConstraints);
    this.ZU.setText(a(-10817, -184));
    this.ZU.setEnabled(false);
    this.ZU.addActionListener(new Zzx1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zh.add(this.ZU, gridBagConstraints);
    this.Zf.setText(a(-10839, 11965));
    this.Zf.setEnabled(false);
    this.Zf.addActionListener(new Zkdf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zh.add(this.Zf, gridBagConstraints);
    this.Zr.setText(a(-10826, 22401));
    this.Zr.setEnabled(false);
    this.Zr.setName(a(-10828, -20826));
    this.Zr.addActionListener(new Zzxm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    this.Zh.add(this.Zr, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Zh.add(this.ZY, gridBagConstraints);
    this.Zo.setLeftComponent(this.Zh);
    this.ZI.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    this.ZT.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    this.ZT.setLayout(gridBagLayout3);
    this.ZK.setText(a(-10844, 12777));
    this.ZK.addActionListener(new Zk2c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.ZT.add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZT.add(this.Zn, gridBagConstraints);
    this.ZS.setText(a(-10847, 6642));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 512;
    this.ZT.add(this.ZS, gridBagConstraints);
    this.Zt.addKeyListener(new Zeiz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 512;
    this.ZT.add(this.Zt, gridBagConstraints);
    this.ZR.Zi(Zk97.DESKTOP_TOOLS_EXTENDER_EXTENSION_DETAILS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    this.ZT.add(this.ZR, gridBagConstraints);
    this.ZI.addTab(a(-10823, -19769), this.ZT);
    this.ZE.setLayout(new BorderLayout());
    this.ZI.addTab(a(-10830, 11833), this.ZE);
    this.ZJ.setLayout(new BorderLayout());
    this.ZI.addTab(a(-10838, -23632), this.ZJ);
    this.Zo.setRightComponent((Component)this.ZI);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zo, gridBagConstraints);
    this.ZO.setText(a(-10846, 20390));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZO, gridBagConstraints);
    this.Zj.Zi(Zk97.DESKTOP_TOOLS_EXTENDER_LOADING_AND_MANAGING_EXTENSIONS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 24;
    add(this.Zj, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 14;
    add(this.ZL, gridBagConstraints);
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    int i = ZS();
    boolean bool = this.ZW.Zk.getAndSet(true);
    if (bool)
      return; 
    if (this.ZW.ZP() && (paramActionEvent.getModifiers() & Zsqw.Zz) != 0) {
      ZI(this.ZW);
      if (i == 0) {
        ZK(this.ZW, this.ZK.isSelected());
        return;
      } 
      return;
    } 
    ZK(this.ZW, this.ZK.isSelected());
  }
  
  private void Zw(KeyEvent paramKeyEvent) {
    Zw(this.ZW, false);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    new Zbn2(this.Za, this.Zv, this.ZF, null, this.Zy, this.Zb, this.ZP, this.Zd);
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    int j = this.ZG.getSelectedRow();
    Objects.requireNonNull(this.Z_);
    List<Zeu1> list = Arrays.stream(this.ZG.getSelectedRows()).mapToObj(this.Z_::ZU).filter(Objects::nonNull).toList();
    int i = Zc();
    if (list.isEmpty())
      return; 
    String str = (list.size() == 1) ? String.format(a(-10841, -13575), new Object[] { ((Zeu1)list.get(0)).ZN() }) : String.format(a(-10831, 23426), new Object[] { Integer.valueOf(list.size()) });
    if (!Zx6o.ZY(this, String.format(a(-10824, 3067), new Object[] { str })))
      return; 
    list.forEach(this::lambda$cmdRemoveActionPerformed$25);
    while (j >= this.Z_.getRowCount()) {
      j--;
      if (i != 0)
        break; 
    } 
    if (j >= 0) {
      this.ZG.getSelectionModel().setSelectionInterval(j, j);
      Zd(this.Z_.ZU(j));
      if (i != 0) {
        Zd((Zeu1)null);
        return;
      } 
      return;
    } 
    Zd((Zeu1)null);
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Zbws;
    //   4: invokevirtual getSelectedRow : ()I
    //   7: istore_2
    //   8: iload_2
    //   9: iconst_1
    //   10: if_icmpge -> 14
    //   13: return
    //   14: aload_0
    //   15: getfield ZF : Lburp/Ztov;
    //   18: iload_2
    //   19: iconst_1
    //   20: isub
    //   21: invokeinterface ZS : (I)V
    //   26: aload_0
    //   27: iload_2
    //   28: <illegal opcode> run : (Lburp/Zbm2;I)Ljava/lang/Runnable;
    //   33: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   36: aload_0
    //   37: getfield ZG : Lburp/Zbws;
    //   40: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   43: iload_2
    //   44: iconst_1
    //   45: isub
    //   46: iload_2
    //   47: iconst_1
    //   48: isub
    //   49: invokeinterface setSelectionInterval : (II)V
    //   54: return
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZG : Lburp/Zbws;
    //   4: invokevirtual getSelectedRow : ()I
    //   7: istore_2
    //   8: iload_2
    //   9: iconst_m1
    //   10: if_icmpeq -> 26
    //   13: iload_2
    //   14: aload_0
    //   15: getfield ZG : Lburp/Zbws;
    //   18: invokevirtual getRowCount : ()I
    //   21: iconst_1
    //   22: isub
    //   23: if_icmpne -> 27
    //   26: return
    //   27: aload_0
    //   28: getfield ZF : Lburp/Ztov;
    //   31: iload_2
    //   32: invokeinterface ZS : (I)V
    //   37: aload_0
    //   38: iload_2
    //   39: <illegal opcode> run : (Lburp/Zbm2;I)Ljava/lang/Runnable;
    //   44: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   47: aload_0
    //   48: getfield ZG : Lburp/Zbws;
    //   51: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   54: iload_2
    //   55: iconst_1
    //   56: iadd
    //   57: iload_2
    //   58: iconst_1
    //   59: iadd
    //   60: invokeinterface setSelectionInterval : (II)V
    //   65: return
  }
  
  private void lambda$cmdDownActionPerformed$27(int paramInt) {
    this.Z_.fireTableRowsUpdated(paramInt, paramInt + 1);
  }
  
  private void lambda$cmdUpActionPerformed$26(int paramInt) {
    this.Z_.fireTableRowsUpdated(paramInt - 1, paramInt);
  }
  
  private void lambda$cmdRemoveActionPerformed$25(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Ztov;
    //   4: aload_1
    //   5: invokeinterface Ze : (Lburp/Zeu1;)V
    //   10: aload_1
    //   11: invokevirtual ZP : ()Z
    //   14: ifeq -> 34
    //   17: aload_0
    //   18: getfield ZP : Lburp/Ztwv;
    //   21: aload_0
    //   22: aload_1
    //   23: <illegal opcode> run : (Lburp/Zbm2;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   28: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   33: pop
    //   34: return
  }
  
  private void lambda$cmdRemoveActionPerformed$24(Zeu1 paramZeu1) {
    this.ZF.Ze(paramZeu1, false);
    paramZeu1.ZU().close();
    paramZeu1.ZJ().close();
    if (paramZeu1.ZR())
      Zm2.ZB(Zec3.BAPP_UNINSTALL, paramZeu1.ZN()); 
  }
  
  private void lambda$createUnloadMenuItem$23(List<Zeu1> paramList, ActionEvent paramActionEvent) {
    ZO(paramList);
    this.Z_.fireTableDataChanged();
  }
  
  private void lambda$createLoadMenuItem$22(List<Zeu1> paramList, ActionEvent paramActionEvent) {
    Zq(paramList);
    this.Z_.fireTableDataChanged();
  }
  
  private void lambda$doFastReload$21(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Ztov;
    //   4: aload_1
    //   5: iconst_1
    //   6: invokeinterface Ze : (Lburp/Zeu1;Z)V
    //   11: aload_0
    //   12: aload_1
    //   13: iconst_1
    //   14: invokevirtual Zw : (Lburp/Zeu1;Z)V
    //   17: aload_0
    //   18: aload_1
    //   19: <illegal opcode> run : (Lburp/Zbm2;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   24: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   27: goto -> 46
    //   30: astore_2
    //   31: aload_2
    //   32: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   35: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   38: aload_1
    //   39: getfield Zk : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   42: iconst_0
    //   43: invokevirtual set : (Z)V
    //   46: return
    // Exception table:
    //   from	to	target	type
    //   0	27	30	java/lang/Exception
  }
  
  private void lambda$doFastReload$20(Zeu1 paramZeu1) {
    try {
      paramZeu1.ZU().ZB();
      paramZeu1.ZJ().ZB();
      new Zbn2(this.Za, this.Zv, this.ZF, paramZeu1, this.Zy, this.Zb, this.ZP, this.Zd);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      paramZeu1.Zk.set(false);
    } 
    Zw(paramZeu1, true);
  }
  
  private void lambda$unloadExtension$19(Zeu1 paramZeu1) {
    try {
      this.ZF.Ze(paramZeu1, true);
      if (paramZeu1.ZR())
        Zm2.ZB(Zec3.BAPP_DISABLE, paramZeu1.ZN()); 
    } finally {
      paramZeu1.Zk.set(false);
    } 
  }
  
  private void lambda$unloadExtensions$18(Zeu1 paramZeu1) {
    paramZeu1.Zk.set(true);
    ZD(paramZeu1);
  }
  
  private void lambda$loadExtensions$17(Zeu1 paramZeu1) {
    paramZeu1.Zk.set(true);
    ZR(paramZeu1);
  }
  
  private void lambda$showExtensionDetails$16(Zeu1 paramZeu1) {
    Ze(paramZeu1);
  }
  
  private void lambda$new$15(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::ZZ);
  }
  
  private void lambda$new$14(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$13);
  }
  
  private void lambda$new$13(Integer paramInteger) {
    Objects.requireNonNull(this.Z_);
    SwingUtilities.invokeLater(this.Z_::fireTableDataChanged);
    ZZ((Zeu1)null);
  }
  
  private void lambda$new$12(Ztzq paramZtzq, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual ZF : ()Ljava/util/Optional;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zbm2;Lburp/Ztzq;)Ljava/util/function/Consumer;
    //   11: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   14: return
  }
  
  private void lambda$new$11(Ztzq paramZtzq, Integer paramInteger) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zbm2;Ljava/lang/Integer;Lburp/Ztzq;)Ljava/lang/Runnable;
    //   8: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void lambda$new$10(Integer paramInteger, Ztzq paramZtzq) {
    this.Z_.fireTableRowsDeleted(paramInteger.intValue(), paramInteger.intValue());
    if (paramZtzq.Zl() == 0)
      ZZ((Zeu1)null); 
  }
  
  private void lambda$new$9(Ztzq paramZtzq, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual ZF : ()Ljava/util/Optional;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zbm2;Lburp/Ztzq;)Ljava/util/function/Consumer;
    //   11: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   14: return
  }
  
  private void lambda$new$8(Ztzq paramZtzq, Integer paramInteger) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zbm2;Ljava/lang/Integer;Lburp/Ztzq;)Ljava/lang/Runnable;
    //   8: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void lambda$new$7(Integer paramInteger, Ztzq paramZtzq) {
    this.Z_.fireTableRowsInserted(paramInteger.intValue(), paramInteger.intValue());
    if (paramZtzq.Zl() == 1)
      ZZ(paramZtzq.ZG(Zbm2::lambda$new$6)); 
  }
  
  private static boolean lambda$new$6(Zeu1 paramZeu1) {
    return true;
  }
  
  private void lambda$new$5(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$4);
  }
  
  private void lambda$new$4(Zqe paramZqe) {
    this.Zu.Zo(paramZqe);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::lambda$new$2);
  }
  
  private void lambda$new$2(Zqe paramZqe) {
    this.Zu.ZU(paramZqe);
  }
  
  private void lambda$new$1(TableModelEvent paramTableModelEvent) {
    ZG(this.ZL.getText());
  }
  
  private void lambda$new$0(ListSelectionEvent paramListSelectionEvent) {
    ZG(this.ZL.getText());
  }
  
  public static void Zu(int paramInt) {
    Zk = paramInt;
  }
  
  public static int Zc() {
    return Zk;
  }
  
  public static int ZS() {
    int i = Zc();
    return (i == 0) ? 26 : 0;
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zu : (I)V
    //   13: ldc 'NGÂØäÞÆÇ¿pvcÉI#a¡Þ\\tzØ^ûÒ;À%\\bQG$Oñii#wÐ¸ÕA)a\\b'½lÃ¿c°m~¦ÞÝAÌ]-PB!l÷Û1ýÝ¤ò¹U"ÝÌ? Tâ+MlhwÉUL\\r­aNr£C^ôr?R¦¡ö¼¦.ne/RÐ*'¢%ö®,L*@'S`µy=¸È-T!(.÷\Q?lÿ&5vIa£³×ü)x;àõqºdqA²þp ¢Q´Õ2«bú#Éo^k0vOãâÀÔ´6ä>ã´;ùð6Ø7r«}ÈäÃ{þGï\\näAKiFXH\ä¶Ëý|-JWÐEâ´!¦úVlÏj8ï\\r8NÜýº J (÷¶#ÙS»@ÜlÍw*Pê'«1´ïKgÕÇ\\nPäV_IkÛôÔ5Êá¨4óvêÆ4O¬ÁÑå0¥øºü4Ö ÊÇä/9FíuvVÕyéùULë*´RëPæ}YÜ«ùéY|Xñ­Ì#8xwá{ fü+^ÇÁ\\n¡î©ßåQ_«|ÖPwÝëô\\r*~Î\\fÎ#u5áÅ'Þ¢D=\\r¶hgÆüç]ýê'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #21
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #32
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc 'ë×óª þ¾0À('
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_4
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #10
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zbm2.a : [Ljava/lang/String;
    //   135: bipush #31
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zbm2.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #33
    //   218: goto -> 248
    //   221: bipush #71
    //   223: goto -> 248
    //   226: bipush #90
    //   228: goto -> 248
    //   231: bipush #31
    //   233: goto -> 248
    //   236: bipush #89
    //   238: goto -> 248
    //   241: bipush #119
    //   243: goto -> 248
    //   246: bipush #55
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD5B4) & 0xFFFF;
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
      byte b1 = 65;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbm2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */