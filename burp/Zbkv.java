package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zbkv extends Zbqc implements Zg4o, Zzyl, Zejf, Zkgx {
  public static final Runnable ZR;
  
  private final Zgb6 Zu;
  
  private final Ztwv ZO;
  
  private final Zb65 ZD;
  
  private final Ze2q Zn;
  
  private final Zvov ZP;
  
  private final Runnable ZU;
  
  private Object ZW;
  
  private Zkv5 ZV;
  
  protected volatile boolean Z_;
  
  private String ZG = Zlqt.ZH;
  
  private String Zx;
  
  private Zbqc Zl;
  
  private Ze0m ZC;
  
  private Ze0m Zd;
  
  private Zm2o Zh;
  
  private Zm9v ZE;
  
  private Zm99 Zm;
  
  private Zm9t ZF;
  
  private Zgff ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbkv(boolean paramBoolean, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv) {
    this(paramBoolean, paramZgb6, paramZb0h, paramZtwv, Zx4v.Zl(paramZgb6, paramZb0h, paramZtwv).Zn(), Zt22.ZG, Zghz.Zq, ZR);
  }
  
  public Zbkv(boolean paramBoolean, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zt22 paramZt22, Zghz paramZghz, Runnable paramRunnable) {
    this(paramBoolean, paramZgb6, paramZb0h, paramZtwv, Zx4v.Zl(paramZgb6, paramZb0h, paramZtwv).ZJ(paramRunnable).Zn(), paramZt22, paramZghz, paramRunnable);
  }
  
  public Zbkv(boolean paramBoolean, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zli0 paramZli0, Zt22 paramZt22, Zghz paramZghz, Runnable paramRunnable) {
    this.Zu = paramZgb6;
    this.ZO = paramZtwv;
    this.ZU = paramRunnable;
    this.ZP = new Zzh7();
    ZL();
    Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.Zm.ZO(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.Zl.Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.Zl.setBorder(new Zr80());
    this.Zn = new Ze2q(paramZgb6);
    this.ZF.Zv(Ze3m.ZC(Zeuf.SETTINGS, Zlkk.ACTION_NORMAL).ZU(Zmcx.EXTRA_LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Zc(Zlkk.ACTION_PRESSED).Z_(), a(-19129, -416), this::Zx);
    this.Zd.setIcon(Ze3m.ZC(Zeuf.ARROW_LEFT, Zlkk.FOREGROUND).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    this.Zd.setName(a(-19108, 13847));
    this.ZC.setIcon(Ze3m.ZC(Zeuf.ARROW_RIGHT, Zlkk.FOREGROUND).ZU(Zmcx.LARGE_LINE_SIZE).Z_());
    this.ZC.setName(a(-19112, 2170));
    this.Zh.ZO(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.Zh.ZD(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.ZA.setName(a(-19111, 5765));
    this.ZF.setName(a(-19124, 3901));
    this.ZF.ZO(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.ZF.ZD(Zlkk.TEXT_EDITOR_BACKGROUND);
    this.ZD = paramZli0.ZR(paramBoolean, this, this.ZP, paramZghz, paramZt22);
    add(this.ZD.ZiB(), a(-19128, 26119));
    this.ZE.setVisible(false);
    this.Zm.setBorder(new EmptyBorder(5, 7, 5, 7));
    this.Zm.setName(a(-19123, -15824));
  }
  
  public void ZJ() {
    this.Zl.setBorder(BorderFactory.createEmptyBorder(2, 0, 1, 0));
  }
  
  public void ZM(Zkvz paramZkvz) {
    // Byte code:
    //   0: new burp/Ze01
    //   3: dup
    //   4: sipush #-19126
    //   7: sipush #-22080
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokespecial <init> : (Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: getfield ZD : Lburp/Zb65;
    //   22: invokeinterface Zi0 : ()Z
    //   27: ifeq -> 46
    //   30: sipush #-19122
    //   33: sipush #-6547
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: goto -> 55
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: sipush #-19109
    //   49: sipush #16543
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: sipush #-19125
    //   58: sipush #11237
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: swap
    //   65: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   70: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   73: aload_2
    //   74: aload_0
    //   75: aload_1
    //   76: <illegal opcode> actionPerformed : (Lburp/Zbkv;Lburp/Zkvz;)Ljava/awt/event/ActionListener;
    //   81: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   84: new java/awt/GridBagConstraints
    //   87: dup
    //   88: invokespecial <init> : ()V
    //   91: astore_3
    //   92: aload_3
    //   93: iconst_2
    //   94: putfield gridx : I
    //   97: aload_3
    //   98: iconst_0
    //   99: putfield gridy : I
    //   102: aload_3
    //   103: new java/awt/Insets
    //   106: dup
    //   107: iconst_0
    //   108: iconst_3
    //   109: iconst_0
    //   110: iconst_3
    //   111: invokespecial <init> : (IIII)V
    //   114: putfield insets : Ljava/awt/Insets;
    //   117: aload_0
    //   118: getfield Zl : Lburp/Zbqc;
    //   121: aload_2
    //   122: aload_3
    //   123: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   126: return
    // Exception table:
    //   from	to	target	type
    //   17	42	42	java/util/regex/PatternSyntaxException
  }
  
  public void Zh(boolean paramBoolean) {
    this.ZD.ZS(paramBoolean);
  }
  
  public void Zk(Zefx paramZefx) {
    ZN(paramZefx, true);
  }
  
  public void ZN(Zefx paramZefx, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface Zw : ()[B
    //   7: iconst_0
    //   8: aload_1
    //   9: invokeinterface ZG : ()Ljava/util/List;
    //   14: aconst_null
    //   15: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   18: aload_0
    //   19: aload_0
    //   20: aload_1
    //   21: iload_2
    //   22: <illegal opcode> run : (Lburp/Zbkv;Lburp/Zefx;Z)Ljava/lang/Runnable;
    //   27: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   30: return
  }
  
  public void ZA(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: getfield Zk : I
    //   6: aload_2
    //   7: getfield ZP : Ljava/util/List;
    //   10: aload_2
    //   11: getfield Zd : Ljava/util/List;
    //   14: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   17: aload_0
    //   18: aload_0
    //   19: aload_2
    //   20: aload_1
    //   21: <illegal opcode> run : (Lburp/Zbkv;Lburp/Zs68;[B)Ljava/lang/Runnable;
    //   26: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   29: return
  }
  
  public void Zb(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: aconst_null
    //   4: aconst_null
    //   5: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   8: aload_0
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zbkv;[B)Ljava/lang/Runnable;
    //   16: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   19: return
  }
  
  public void Zz(byte[] paramArrayOfbyte, List<String> paramList, List<Ztu8> paramList1) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: aload_2
    //   4: aload_3
    //   5: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   8: aload_0
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zbkv;[B)Ljava/lang/Runnable;
    //   16: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   19: return
  }
  
  public void Zx(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: aconst_null
    //   4: aconst_null
    //   5: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   8: aload_0
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zbkv;[B)Ljava/lang/Runnable;
    //   16: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   19: return
  }
  
  public void ZZ(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: aconst_null
    //   4: aconst_null
    //   5: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   8: aload_0
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zbkv;[B)Ljava/lang/Runnable;
    //   16: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   19: return
  }
  
  public void ZC(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: aconst_null
    //   4: aconst_null
    //   5: invokevirtual ZT : ([BILjava/util/List;Ljava/util/List;)V
    //   8: aload_0
    //   9: aload_0
    //   10: aload_1
    //   11: <illegal opcode> run : (Lburp/Zbkv;[B)Ljava/lang/Runnable;
    //   16: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   19: return
  }
  
  public void Zg(boolean paramBoolean) {
    this.ZD.Zf(paramBoolean);
  }
  
  public void ZX(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: iload_3
    //   4: <illegal opcode> run : (Lburp/Zbkv;[BII)Ljava/lang/Runnable;
    //   9: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  private void ZQ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Z_ = true;
    this.ZD.Zv(paramArrayOfbyte, paramInt1, paramInt2);
    this.Z_ = false;
  }
  
  private void ZT(byte[] paramArrayOfbyte, int paramInt, List<String> paramList, List<Ztu8> paramList1) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield Zx : Ljava/lang/String;
    //   9: ifnull -> 32
    //   12: aload_0
    //   13: aload_0
    //   14: getfield Zx : Ljava/lang/String;
    //   17: putfield ZG : Ljava/lang/String;
    //   20: aload #5
    //   22: ifnonnull -> 256
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: aload_0
    //   33: getfield Zu : Lburp/Zgb6;
    //   36: invokeinterface Zf1 : ()Ljava/lang/String;
    //   41: astore #6
    //   43: aload #6
    //   45: astore #7
    //   47: iconst_m1
    //   48: istore #8
    //   50: aload #7
    //   52: invokevirtual hashCode : ()I
    //   55: lookupswitch default -> 139, 676123699 -> 112, 1971001562 -> 80
    //   80: aload #7
    //   82: sipush #-19135
    //   85: sipush #430
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual equals : (Ljava/lang/Object;)Z
    //   94: ifeq -> 139
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iconst_0
    //   105: istore #8
    //   107: aload #5
    //   109: ifnonnull -> 139
    //   112: aload #7
    //   114: sipush #-19106
    //   117: sipush #-21639
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual equals : (Ljava/lang/Object;)Z
    //   126: ifeq -> 139
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   135: athrow
    //   136: iconst_1
    //   137: istore #8
    //   139: iload #8
    //   141: lookupswitch default -> 243, 0 -> 168, 1 -> 224
    //   168: aload_0
    //   169: aload_3
    //   170: aload #4
    //   172: invokestatic ZT : (Ljava/util/List;Ljava/util/List;)Ljava/lang/String;
    //   175: putfield ZG : Ljava/lang/String;
    //   178: aload_1
    //   179: iload_2
    //   180: aload_1
    //   181: arraylength
    //   182: invokestatic Zz : ([BII)[B
    //   185: astore #9
    //   187: aload #9
    //   189: aload_0
    //   190: getfield ZG : Ljava/lang/String;
    //   193: invokestatic ZR : ([BLjava/lang/String;)Z
    //   196: ifeq -> 219
    //   199: aload_0
    //   200: sipush #-19130
    //   203: sipush #27268
    //   206: invokestatic a : (II)Ljava/lang/String;
    //   209: putfield ZG : Ljava/lang/String;
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: aload #5
    //   221: ifnonnull -> 256
    //   224: aload_0
    //   225: getstatic burp/Zlqt.ZH : Ljava/lang/String;
    //   228: putfield ZG : Ljava/lang/String;
    //   231: aload #5
    //   233: ifnonnull -> 256
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: aload_0
    //   244: aload #6
    //   246: putfield ZG : Ljava/lang/String;
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   255: athrow
    //   256: return
    // Exception table:
    //   from	to	target	type
    //   5	25	28	java/util/regex/PatternSyntaxException
    //   50	97	100	java/util/regex/PatternSyntaxException
    //   107	129	132	java/util/regex/PatternSyntaxException
    //   187	212	215	java/util/regex/PatternSyntaxException
    //   219	236	239	java/util/regex/PatternSyntaxException
    //   224	249	252	java/util/regex/PatternSyntaxException
  }
  
  public void ZU() {
    this.Zn.ZF(this.Zu);
    this.ZW = null;
    this.ZA.setText("");
    this.ZE.setVisible(false);
    Zy(Collections.emptyList());
    ZV(Collections.emptyList());
    this.ZD.ZU();
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Ze2q;
    //   4: invokevirtual ZA : ()Z
    //   7: istore_1
    //   8: aload_0
    //   9: getfield Zn : Lburp/Ze2q;
    //   12: invokevirtual Zc : ()Z
    //   15: istore_2
    //   16: aload_0
    //   17: getfield Zn : Lburp/Ze2q;
    //   20: invokevirtual ZH : ()Z
    //   23: istore_3
    //   24: aload_0
    //   25: getfield ZW : Ljava/lang/Object;
    //   28: astore #4
    //   30: aload_0
    //   31: getfield ZA : Lburp/Zgff;
    //   34: invokevirtual getText : ()Ljava/lang/String;
    //   37: astore #5
    //   39: aload_0
    //   40: getfield ZE : Lburp/Zm9v;
    //   43: invokevirtual isVisible : ()Z
    //   46: istore #6
    //   48: aload_0
    //   49: getfield ZG : Ljava/lang/String;
    //   52: astore #7
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: aload_0
    //   59: getfield ZP : Lburp/Zvov;
    //   62: invokeinterface Zi : ()Ljava/util/List;
    //   67: invokespecial <init> : (Ljava/util/Collection;)V
    //   70: astore #8
    //   72: new java/util/ArrayList
    //   75: dup
    //   76: aload_0
    //   77: getfield ZP : Lburp/Zvov;
    //   80: invokeinterface Zq : ()Ljava/util/List;
    //   85: invokespecial <init> : (Ljava/util/Collection;)V
    //   88: astore #9
    //   90: aload_0
    //   91: getfield ZV : Lburp/Zkv5;
    //   94: astore #10
    //   96: aload_0
    //   97: getfield ZD : Lburp/Zb65;
    //   100: invokeinterface ZI : ()Lburp/Ztcw;
    //   105: astore #11
    //   107: aload_0
    //   108: aload #11
    //   110: iload_1
    //   111: iload_2
    //   112: iload_3
    //   113: aload #4
    //   115: aload #5
    //   117: iload #6
    //   119: aload #7
    //   121: aload #8
    //   123: aload #9
    //   125: aload #10
    //   127: <illegal opcode> Zg : (Lburp/Zbkv;Lburp/Ztcw;ZZZLjava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Lburp/Zkv5;)Lburp/Ztcw;
    //   132: areturn
  }
  
  private static boolean ZR(byte[] paramArrayOfbyte, String paramString) {
    String str = Zg12.ZI(paramArrayOfbyte, paramString);
    byte[] arrayOfByte = Zg12.ZB(str, paramString);
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return !Arrays.equals(paramArrayOfbyte, arrayOfByte);
  }
  
  public String Zf() {
    return this.ZG;
  }
  
  public void Zl(int paramInt, char paramChar) {
    this.ZD.ZP(paramInt, paramChar);
  }
  
  public void Zs(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: iload_2
    //   4: iload_3
    //   5: <illegal opcode> run : (Lburp/Zbkv;[BII)Ljava/lang/Runnable;
    //   10: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void ZA(String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: iload_2
    //   4: iload_3
    //   5: <illegal opcode> run : (Lburp/Zbkv;Ljava/lang/String;II)Ljava/lang/Runnable;
    //   10: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   13: return
  }
  
  public void ZV(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: iload_2
    //   4: <illegal opcode> run : (Lburp/Zbkv;Ljava/lang/String;Z)Ljava/lang/Runnable;
    //   9: invokevirtual ZX : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  private void ZX(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zbkv;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void ZQ() {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZW : Ljava/lang/Object;
    //   8: ifnonnull -> 47
    //   11: aload_0
    //   12: getfield ZA : Lburp/Zgff;
    //   15: invokevirtual getText : ()Ljava/lang/String;
    //   18: invokevirtual isEmpty : ()Z
    //   21: ifne -> 47
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: aconst_null
    //   33: invokevirtual ZF : (Ljava/awt/event/KeyEvent;)V
    //   36: aload_1
    //   37: ifnonnull -> 72
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   46: athrow
    //   47: aload_0
    //   48: getfield ZW : Ljava/lang/Object;
    //   51: ifnull -> 72
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: aload_0
    //   62: invokevirtual Zu : ()V
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_0
    //   73: getfield ZP : Lburp/Zvov;
    //   76: invokeinterface Zi : ()Ljava/util/List;
    //   81: invokeinterface isEmpty : ()Z
    //   86: ifeq -> 113
    //   89: aload_0
    //   90: getfield ZP : Lburp/Zvov;
    //   93: invokeinterface Zq : ()Ljava/util/List;
    //   98: invokeinterface isEmpty : ()Z
    //   103: ifne -> 124
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: aload_0
    //   114: invokevirtual Zz : ()V
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_0
    //   125: getfield ZP : Lburp/Zvov;
    //   128: invokeinterface Zi : ()Ljava/util/List;
    //   133: invokeinterface isEmpty : ()Z
    //   138: ifne -> 176
    //   141: aload_0
    //   142: getfield Zn : Lburp/Ze2q;
    //   145: invokevirtual ZH : ()Z
    //   148: ifeq -> 176
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_RAW_TAB_SEARCH_AUTOSCROLL : Lburp/Zrrh;
    //   161: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   164: aload_0
    //   165: iconst_0
    //   166: invokevirtual Zw : (Z)V
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/util/regex/PatternSyntaxException
    //   11	40	43	java/util/regex/PatternSyntaxException
    //   31	54	57	java/util/regex/PatternSyntaxException
    //   47	65	68	java/util/regex/PatternSyntaxException
    //   72	106	109	java/util/regex/PatternSyntaxException
    //   89	117	120	java/util/regex/PatternSyntaxException
    //   124	151	154	java/util/regex/PatternSyntaxException
    //   141	169	172	java/util/regex/PatternSyntaxException
  }
  
  private void Zz() {
    this.ZO.Zx(this::lambda$flashMatchesStatus$15);
  }
  
  public void ZB(boolean paramBoolean) {
    this.ZD.Zt(paramBoolean);
  }
  
  public byte[] ZF() {
    return this.ZD.ZiD();
  }
  
  public String Zp() {
    return this.ZD.ZiW();
  }
  
  public int Zk() {
    return this.ZD.Zi1();
  }
  
  public void Zc(boolean paramBoolean) {
    this.ZD.ZF(paramBoolean);
  }
  
  public void Zl(boolean paramBoolean) {
    this.ZD.ZY(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.ZD.Zg(paramBoolean);
  }
  
  public void ZV(String paramString) {
    this.Zx = paramString;
  }
  
  public boolean Ze() {
    return this.ZD.Zi3();
  }
  
  public void requestFocus() {
    this.ZD.ZiK();
  }
  
  public int Zo() {
    return this.ZD.ZiO();
  }
  
  public boolean Zl() {
    int[] arrayOfInt = this.ZD.Zif();
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return (arrayOfInt[0] != arrayOfInt[1]);
  }
  
  public void Zr(int paramInt) {
    this.ZD.Zg(paramInt);
  }
  
  public int[] ZB() {
    return this.ZD.Zif();
  }
  
  public int[] ZK() {
    return this.ZD.Zm();
  }
  
  public void Ze(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: <illegal opcode> run : (Lburp/Zbkv;II)Ljava/lang/Runnable;
    //   8: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void ZC(int paramInt1, int paramInt2) {
    this.ZD.Zu(paramInt1, paramInt2);
  }
  
  public byte[] Z_() {
    return this.ZD.ZiS();
  }
  
  public String Zy() {
    return this.ZD.ZT();
  }
  
  public void Zj(byte[] paramArrayOfbyte) {
    this.ZD.ZY(paramArrayOfbyte);
  }
  
  public void ZY(String paramString) {
    this.ZD.Zl(paramString);
  }
  
  public void Z_(Zg90 paramZg90) {
    this.ZD.ZH(paramZg90);
  }
  
  public void ZY(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> run : (Lburp/Zbkv;I)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public void ZG(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zn.ZK(paramBoolean1);
    this.Zn.ZT(paramBoolean2);
    this.ZA.setText(paramString);
    ZF((KeyEvent)null);
  }
  
  public void Zx(boolean paramBoolean) {
    this.ZD.Zv(paramBoolean);
  }
  
  public void ZF(boolean paramBoolean) {
    this.ZD.ZB(paramBoolean);
  }
  
  public void ZY(boolean paramBoolean) {
    this.ZD.ZH(paramBoolean);
  }
  
  public void addMouseListener(MouseListener paramMouseListener) {
    this.ZD.ZA(paramMouseListener);
  }
  
  public synchronized void addFocusListener(FocusListener paramFocusListener) {
    this.ZD.ZP(paramFocusListener);
  }
  
  private void ZE() {
    int i = 0;
    ArrayList<Ztly> arrayList = new ArrayList();
    String[] arrayOfString = Zbv5.ZvS();
    for (String str : this.ZD.Zie()) {
      int j = str.length();
      int k = 0;
      try {
        String str1 = (String)this.ZW;
        int m = str1.length();
        Ztj0 ztj0 = new Ztj0(str, str1, this.Zn.ZA());
        while (k < j) {
          k = ztj0.ZA(k);
          try {
            if (k == -1)
              break; 
          } catch (Exception exception) {
            throw a(null);
          } 
          Ztly ztly = new Ztly(i + k, i + k + m);
          arrayList.add(ztly);
          k += m;
          if (arrayOfString == null)
            break; 
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      i += str.length();
      if (arrayOfString == null)
        break; 
    } 
    ZV((List)arrayList);
  }
  
  private void ZP() {
    int i = 0;
    ArrayList<Ztly> arrayList = new ArrayList();
    String[] arrayOfString = Zbv5.ZvS();
    for (String str : this.ZD.Zie()) {
      try {
        Pattern pattern = (Pattern)this.ZW;
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
          Ztly ztly = new Ztly(i + matcher.start(), i + matcher.end());
          arrayList.add(ztly);
          if (arrayOfString == null)
            break; 
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      } 
      i += str.length();
      if (arrayOfString == null)
        break; 
    } 
    ZV((List)arrayList);
  }
  
  public void Zy(List<Zkv5> paramList) {
    try {
      this.ZV = null;
      this.ZP.Zh(paramList);
      if (paramList != null)
        try {
          if (this.ZP.Zi().isEmpty()) {
            try {
            
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            } 
            this.Zm.setText("" + paramList.size() + paramList.size());
          } 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void ZV(List<Zkv5> paramList) {
    try {
      this.ZV = null;
      this.ZP.ZW(paramList);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zm.setText("" + paramList.size() + paramList.size());
  }
  
  private void Zv() {
    Zy(this.ZP.Zq());
  }
  
  private void Zu() {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZW : Ljava/lang/Object;
    //   8: instanceof [B
    //   11: ifne -> 31
    //   14: aload_0
    //   15: getfield ZW : Ljava/lang/Object;
    //   18: instanceof java/lang/String
    //   21: ifeq -> 46
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: invokevirtual ZE : ()V
    //   35: aload_1
    //   36: ifnonnull -> 102
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_0
    //   47: getfield ZW : Ljava/lang/Object;
    //   50: instanceof java/util/regex/Pattern
    //   53: ifeq -> 78
    //   56: goto -> 63
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: invokevirtual ZP : ()V
    //   67: aload_1
    //   68: ifnonnull -> 102
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iconst_0
    //   79: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   82: aload_0
    //   83: getfield ZW : Ljava/lang/Object;
    //   86: invokevirtual getClass : ()Ljava/lang/Class;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/util/regex/PatternSyntaxException
    //   14	39	42	java/util/regex/PatternSyntaxException
    //   31	56	59	java/util/regex/PatternSyntaxException
    //   46	71	74	java/util/regex/PatternSyntaxException
    //   63	95	98	java/util/regex/PatternSyntaxException
  }
  
  public int ZU(int paramInt) {
    return this.ZD.ZC(paramInt);
  }
  
  public int ZH(int paramInt) {
    return this.ZD.Zl(paramInt);
  }
  
  public void Zv(DocumentListener paramDocumentListener) {
    this.ZD.ZT(paramDocumentListener);
  }
  
  private void Zw() {
    this.ZW = null;
    this.ZE.setVisible(false);
    String str = this.ZA.getText();
    try {
      if (str.isEmpty()) {
        ZV(Collections.emptyList());
        return;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_RAW_TAB_SEARCH);
    if (this.Zn.Zc()) {
      Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_RAW_TAB_SEARCH_REGEX);
      try {
        this.ZW = Pattern.compile(str, 0x20 | (this.Zn.ZA() ? 0 : 2));
      } catch (PatternSyntaxException patternSyntaxException) {
        Zah.Zl(patternSyntaxException, Zk_.USER_ERROR);
        this.ZE.setVisible(true);
        return;
      } 
    } else {
      try {
        if (this.Zn.ZA())
          Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_RAW_TAB_SEARCH_CASE_SENSITIVE); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
      this.ZW = str;
    } 
    try {
      Zu();
      if (!this.ZP.Zi().isEmpty())
        this.ZD.Zg(((Zkv5)this.ZP.Zi().getFirst()).startOffset()); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void Zt() {
    this.ZV = null;
    this.ZA.focusLost((FocusEvent)null);
    Zw(false);
    this.ZA.focusGained((FocusEvent)null);
  }
  
  private void Zw(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZP : Lburp/Zvov;
    //   8: invokeinterface Zi : ()Ljava/util/List;
    //   13: invokeinterface isEmpty : ()Z
    //   18: ifeq -> 35
    //   21: aload_0
    //   22: getfield ZP : Lburp/Zvov;
    //   25: invokeinterface Zq : ()Ljava/util/List;
    //   30: astore_3
    //   31: aload_2
    //   32: ifnonnull -> 45
    //   35: aload_0
    //   36: getfield ZP : Lburp/Zvov;
    //   39: invokeinterface Zi : ()Ljava/util/List;
    //   44: astore_3
    //   45: aload_3
    //   46: invokeinterface isEmpty : ()Z
    //   51: ifeq -> 59
    //   54: return
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_0
    //   60: getfield ZV : Lburp/Zkv5;
    //   63: ifnonnull -> 101
    //   66: aload_0
    //   67: aload_3
    //   68: invokeinterface getFirst : ()Ljava/lang/Object;
    //   73: checkcast burp/Zkv5
    //   76: putfield ZV : Lburp/Zkv5;
    //   79: aload_0
    //   80: iconst_0
    //   81: aload_3
    //   82: invokeinterface size : ()I
    //   87: invokevirtual ZA : (II)V
    //   90: aload_2
    //   91: ifnonnull -> 153
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_3
    //   102: aload_0
    //   103: getfield ZV : Lburp/Zkv5;
    //   106: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   111: istore #4
    //   113: iload #4
    //   115: iconst_1
    //   116: iadd
    //   117: aload_3
    //   118: invokeinterface size : ()I
    //   123: irem
    //   124: istore #5
    //   126: aload_0
    //   127: aload_3
    //   128: iload #5
    //   130: invokeinterface get : (I)Ljava/lang/Object;
    //   135: checkcast burp/Zkv5
    //   138: putfield ZV : Lburp/Zkv5;
    //   141: aload_0
    //   142: iload #5
    //   144: aload_3
    //   145: invokeinterface size : ()I
    //   150: invokevirtual ZA : (II)V
    //   153: aload_0
    //   154: invokevirtual ZW : ()V
    //   157: iload_1
    //   158: ifeq -> 177
    //   161: aload_0
    //   162: getfield ZD : Lburp/Zb65;
    //   165: invokeinterface ZiK : ()V
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: return
    // Exception table:
    //   from	to	target	type
    //   45	55	55	java/util/regex/PatternSyntaxException
    //   59	94	97	java/util/regex/PatternSyntaxException
    //   153	170	173	java/util/regex/PatternSyntaxException
  }
  
  private void Zc() {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZP : Lburp/Zvov;
    //   8: invokeinterface Zi : ()Ljava/util/List;
    //   13: invokeinterface isEmpty : ()Z
    //   18: ifeq -> 35
    //   21: aload_0
    //   22: getfield ZP : Lburp/Zvov;
    //   25: invokeinterface Zq : ()Ljava/util/List;
    //   30: astore_2
    //   31: aload_1
    //   32: ifnonnull -> 45
    //   35: aload_0
    //   36: getfield ZP : Lburp/Zvov;
    //   39: invokeinterface Zi : ()Ljava/util/List;
    //   44: astore_2
    //   45: aload_2
    //   46: invokeinterface isEmpty : ()Z
    //   51: ifeq -> 59
    //   54: return
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_0
    //   60: getfield ZV : Lburp/Zkv5;
    //   63: ifnonnull -> 101
    //   66: aload_0
    //   67: aload_2
    //   68: invokeinterface getFirst : ()Ljava/lang/Object;
    //   73: checkcast burp/Zkv5
    //   76: putfield ZV : Lburp/Zkv5;
    //   79: aload_0
    //   80: iconst_0
    //   81: aload_2
    //   82: invokeinterface size : ()I
    //   87: invokevirtual ZA : (II)V
    //   90: aload_1
    //   91: ifnonnull -> 158
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_2
    //   102: aload_0
    //   103: getfield ZV : Lburp/Zkv5;
    //   106: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   111: istore_3
    //   112: iload_3
    //   113: aload_2
    //   114: invokeinterface size : ()I
    //   119: iadd
    //   120: iconst_1
    //   121: isub
    //   122: aload_2
    //   123: invokeinterface size : ()I
    //   128: irem
    //   129: istore #4
    //   131: aload_0
    //   132: aload_2
    //   133: iload #4
    //   135: invokeinterface get : (I)Ljava/lang/Object;
    //   140: checkcast burp/Zkv5
    //   143: putfield ZV : Lburp/Zkv5;
    //   146: aload_0
    //   147: iload #4
    //   149: aload_2
    //   150: invokeinterface size : ()I
    //   155: invokevirtual ZA : (II)V
    //   158: aload_0
    //   159: invokevirtual ZW : ()V
    //   162: aload_0
    //   163: getfield ZD : Lburp/Zb65;
    //   166: invokeinterface ZiK : ()V
    //   171: return
    // Exception table:
    //   from	to	target	type
    //   45	55	55	java/util/regex/PatternSyntaxException
    //   59	94	97	java/util/regex/PatternSyntaxException
  }
  
  private void ZW() {
    int i = this.ZV.startOffset();
    int j = this.ZV.endOffset();
    Zb65 zb65 = this.ZD;
    if (zb65 instanceof Zb65) {
      Zb65 zb651 = zb65;
      try {
        if (zb651.Zc(i, j))
          this.ZU.run(); 
      } catch (PatternSyntaxException patternSyntaxException) {
        throw a(null);
      } 
    } 
    this.ZD.Zu(i, j);
  }
  
  private void ZA(int paramInt1, int paramInt2) {
    try {
      (new Object[3])[0] = Integer.valueOf(paramInt1 + 1);
      (new Object[3])[1] = Integer.valueOf(paramInt2);
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.Zm.setText(a(-19120, 10110).formatted(new Object[] { null, null, (paramInt2 == 1) ? a(-19132, 27153) : a(-19121, 4770) }));
  }
  
  private void ZL() {
    this.Zl = new Zbqc();
    this.Zh = new Zm2o();
    this.ZF = new Zm9t();
    this.Zd = new Ze0m();
    this.ZC = new Ze0m();
    this.ZA = new Zgfj();
    this.ZE = new Zm9v();
    this.Zm = new Zm99();
    setLayout(new BorderLayout());
    this.Zl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.Zl.setLayout(new GridBagLayout());
    this.Zh.Zi(Zk97.DESKTOP_FUNCTIONS_MESSAGE_EDITOR_TEXT_EDITOR);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zl.add(this.Zh, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.Zl.add(this.ZF, gridBagConstraints);
    this.Zd.addActionListener(new Zxja(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new Insets(0, 5, 0, 5);
    this.Zl.add(this.Zd, gridBagConstraints);
    this.ZC.addActionListener(new Zxy3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zl.add(this.ZC, gridBagConstraints);
    this.ZA.ZH(Zlw9.SEARCH_TERM);
    this.ZA.addActionListener(new Zl3_(this));
    this.ZA.addKeyListener(new Zo3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 5;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 5, 0, 5);
    this.Zl.add(this.ZA, gridBagConstraints);
    this.ZE.setText(a(-19131, 2629));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    this.Zl.add(this.ZE, gridBagConstraints);
    this.Zm.setText(a(-19114, -32370));
    this.Zm.setOpaque(true);
    this.Zm.addMouseListener(new Zr13(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 7;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 2048;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.Zl.add(this.Zm, gridBagConstraints);
    add(this.Zl, a(-19116, 30536));
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    Zt();
  }
  
  private void ZF(KeyEvent paramKeyEvent) {
    Zw();
  }
  
  private void Zv(MouseEvent paramMouseEvent) {
    Zw(true);
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    Zc();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    Zw(true);
  }
  
  public List<Zkv5> Zq() {
    try {
      if (this.ZP.Zq() != null)
        return this.ZP.Zq(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return Collections.emptyList();
  }
  
  public List<Zkv5> Zi() {
    return this.ZP.Zi();
  }
  
  public void Zi(Zc paramZc) {
    this.ZP.Zi(paramZc);
  }
  
  public void ZI(DocumentEvent paramDocumentEvent) {
    try {
      if (this.Z_)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zr(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
  }
  
  private void Zr(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZvS : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: getfield ZP : Lburp/Zvov;
    //   16: invokeinterface Zi : ()Ljava/util/List;
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #5
    //   28: astore_3
    //   29: aload #5
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 145
    //   39: aload #5
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast burp/Zkv5
    //   49: astore #6
    //   51: aload #6
    //   53: invokeinterface endOffset : ()I
    //   58: iload_1
    //   59: if_icmpgt -> 83
    //   62: aload #4
    //   64: aload #6
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_3
    //   73: ifnonnull -> 141
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload #6
    //   85: invokeinterface startOffset : ()I
    //   90: iload_1
    //   91: if_icmplt -> 141
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload #4
    //   103: aload #6
    //   105: aload #6
    //   107: invokeinterface startOffset : ()I
    //   112: iload_2
    //   113: iadd
    //   114: aload #6
    //   116: invokeinterface endOffset : ()I
    //   121: iload_2
    //   122: iadd
    //   123: invokeinterface Zg : (II)Lburp/Zkv5;
    //   128: invokeinterface add : (Ljava/lang/Object;)Z
    //   133: pop
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_3
    //   142: ifnonnull -> 29
    //   145: aload_0
    //   146: getfield ZP : Lburp/Zvov;
    //   149: aload #4
    //   151: invokeinterface ZW : (Ljava/util/List;)V
    //   156: return
    // Exception table:
    //   from	to	target	type
    //   51	76	79	java/util/regex/PatternSyntaxException
    //   62	94	97	java/util/regex/PatternSyntaxException
    //   83	134	137	java/util/regex/PatternSyntaxException
  }
  
  public void ZO(DocumentEvent paramDocumentEvent) {
    try {
      if (this.Z_)
        return; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zv(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
  }
  
  private void Zv(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic ZvS : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: getfield ZP : Lburp/Zvov;
    //   16: invokeinterface Zi : ()Ljava/util/List;
    //   21: invokeinterface iterator : ()Ljava/util/Iterator;
    //   26: astore #5
    //   28: astore_3
    //   29: aload #5
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 147
    //   39: aload #5
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast burp/Zkv5
    //   49: astore #6
    //   51: aload #6
    //   53: invokeinterface endOffset : ()I
    //   58: iload_1
    //   59: if_icmpgt -> 83
    //   62: aload #4
    //   64: aload #6
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload_3
    //   73: ifnonnull -> 143
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload #6
    //   85: invokeinterface startOffset : ()I
    //   90: iload_1
    //   91: iload_2
    //   92: iadd
    //   93: if_icmplt -> 143
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload #4
    //   105: aload #6
    //   107: aload #6
    //   109: invokeinterface startOffset : ()I
    //   114: iload_2
    //   115: isub
    //   116: aload #6
    //   118: invokeinterface endOffset : ()I
    //   123: iload_2
    //   124: isub
    //   125: invokeinterface Zg : (II)Lburp/Zkv5;
    //   130: invokeinterface add : (Ljava/lang/Object;)Z
    //   135: pop
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_3
    //   144: ifnonnull -> 29
    //   147: aload_0
    //   148: getfield ZP : Lburp/Zvov;
    //   151: aload #4
    //   153: invokeinterface ZW : (Ljava/util/List;)V
    //   158: return
    // Exception table:
    //   from	to	target	type
    //   51	76	79	java/util/regex/PatternSyntaxException
    //   62	96	99	java/util/regex/PatternSyntaxException
    //   83	136	139	java/util/regex/PatternSyntaxException
  }
  
  public void Zt(String paramString) {
    try {
      if (paramString != null) {
        this.ZA.setText(paramString);
        ZF((KeyEvent)null);
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    this.ZA.requestFocus();
  }
  
  public Font ZM() {
    String str = this.Zu.Zf8();
    int i = this.Zu.ZfF();
    return new Font(str, 0, i);
  }
  
  public boolean Zs() {
    return this.Zu.Zf2();
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    try {
      switch (paramInt) {
        case 395040:
          this.Zd.doClick();
          return true;
        case 395072:
          this.ZC.doClick();
          return true;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramObject == this.ZA)
        return false; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return this.ZD.ZI(paramInt, paramObject);
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZvS : ()[Ljava/lang/String;
    //   11: aload_0
    //   12: invokevirtual Zl : ()Z
    //   15: istore #4
    //   17: new burp/Zztv
    //   20: dup
    //   21: sipush #-19127
    //   24: sipush #1727
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: astore #5
    //   35: aload #5
    //   37: iload #4
    //   39: invokevirtual setEnabled : (Z)V
    //   42: aload_3
    //   43: aload #5
    //   45: invokeinterface add : (Ljava/lang/Object;)Z
    //   50: pop
    //   51: new burp/Zztv
    //   54: dup
    //   55: sipush #-19117
    //   58: sipush #8990
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokespecial <init> : (Ljava/lang/String;)V
    //   67: astore #6
    //   69: aload #5
    //   71: aload #6
    //   73: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   76: pop
    //   77: aload #6
    //   79: aload_0
    //   80: ldc 395520
    //   82: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   85: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   88: pop
    //   89: aload #6
    //   91: aload_0
    //   92: ldc 395776
    //   94: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   97: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   100: pop
    //   101: aload #6
    //   103: aload_0
    //   104: ldc 396032
    //   106: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   109: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   112: pop
    //   113: aload #6
    //   115: aload_0
    //   116: ldc 396288
    //   118: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   121: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   124: pop
    //   125: new burp/Zztv
    //   128: dup
    //   129: sipush #-19134
    //   132: sipush #-11539
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: invokespecial <init> : (Ljava/lang/String;)V
    //   141: astore #6
    //   143: aload #5
    //   145: aload #6
    //   147: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   150: pop
    //   151: astore_2
    //   152: aload #6
    //   154: aload_0
    //   155: ldc 396544
    //   157: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   160: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   163: pop
    //   164: aload #6
    //   166: aload_0
    //   167: ldc 396800
    //   169: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   172: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   175: pop
    //   176: aload #6
    //   178: aload_0
    //   179: ldc 397056
    //   181: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   184: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   187: pop
    //   188: aload #6
    //   190: aload_0
    //   191: ldc 397312
    //   193: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   196: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   199: pop
    //   200: aload #6
    //   202: aload_0
    //   203: ldc 397568
    //   205: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   208: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   211: pop
    //   212: new burp/Zztv
    //   215: dup
    //   216: sipush #-19113
    //   219: sipush #-19122
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokespecial <init> : (Ljava/lang/String;)V
    //   228: astore #6
    //   230: aload #5
    //   232: aload #6
    //   234: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   237: pop
    //   238: aload #6
    //   240: aload_0
    //   241: ldc 397824
    //   243: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   246: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   249: pop
    //   250: aload #6
    //   252: aload_0
    //   253: ldc 398080
    //   255: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   258: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   261: pop
    //   262: new burp/Zztv
    //   265: dup
    //   266: sipush #-19107
    //   269: sipush #-23373
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: invokespecial <init> : (Ljava/lang/String;)V
    //   278: astore #6
    //   280: aload #5
    //   282: aload #6
    //   284: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   287: pop
    //   288: aload #6
    //   290: aload_0
    //   291: ldc 397904
    //   293: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   296: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   299: pop
    //   300: aload #6
    //   302: aload_0
    //   303: ldc 398160
    //   305: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   308: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   311: pop
    //   312: new burp/Zztv
    //   315: dup
    //   316: sipush #-19105
    //   319: sipush #-7891
    //   322: invokestatic a : (II)Ljava/lang/String;
    //   325: invokespecial <init> : (Ljava/lang/String;)V
    //   328: astore #6
    //   330: aload #5
    //   332: aload #6
    //   334: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   337: pop
    //   338: aload #6
    //   340: aload_0
    //   341: ldc 398336
    //   343: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   346: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   349: pop
    //   350: aload #6
    //   352: aload_0
    //   353: ldc 398592
    //   355: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   358: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   361: pop
    //   362: aload #6
    //   364: aload_0
    //   365: ldc 398848
    //   367: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   370: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   373: pop
    //   374: aload #6
    //   376: aload_0
    //   377: ldc 399104
    //   379: invokestatic ZW : (Lburp/Zzyl;I)Lburp/Zepk;
    //   382: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   385: pop
    //   386: aload_0
    //   387: getfield ZD : Lburp/Zb65;
    //   390: invokeinterface Zi0 : ()Z
    //   395: ifeq -> 438
    //   398: aload_0
    //   399: ldc 396416
    //   401: sipush #-19136
    //   404: sipush #3186
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: invokestatic Zt : (Lburp/Zzyl;ILjava/lang/String;)Lburp/Zsu5;
    //   413: astore #7
    //   415: aload #7
    //   417: aload_0
    //   418: getfield ZD : Lburp/Zb65;
    //   421: invokeinterface Zip : ()Z
    //   426: invokevirtual setSelected : (Z)V
    //   429: aload_3
    //   430: aload #7
    //   432: invokeinterface add : (Ljava/lang/Object;)Z
    //   437: pop
    //   438: aload_3
    //   439: new javax/swing/JSeparator
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: invokeinterface add : (Ljava/lang/Object;)Z
    //   451: pop
    //   452: aload_3
    //   453: aload_0
    //   454: ldc 393472
    //   456: aload_0
    //   457: getfield ZD : Lburp/Zb65;
    //   460: invokeinterface Zi0 : ()Z
    //   465: ifeq -> 488
    //   468: iload #4
    //   470: ifeq -> 488
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   479: athrow
    //   480: iconst_1
    //   481: goto -> 489
    //   484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   487: athrow
    //   488: iconst_0
    //   489: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   492: invokeinterface add : (Ljava/lang/Object;)Z
    //   497: pop
    //   498: aload_3
    //   499: aload_0
    //   500: ldc 393728
    //   502: iload #4
    //   504: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   507: invokeinterface add : (Ljava/lang/Object;)Z
    //   512: pop
    //   513: aload_3
    //   514: aload_0
    //   515: ldc 393984
    //   517: aload_0
    //   518: getfield ZD : Lburp/Zb65;
    //   521: invokeinterface Zi0 : ()Z
    //   526: invokestatic ZY : (Lburp/Zzyl;IZ)Lburp/Zepk;
    //   529: invokeinterface add : (Ljava/lang/Object;)Z
    //   534: pop
    //   535: aload_3
    //   536: invokestatic Zwu : ()[Lburp/Zbqc;
    //   539: ifnonnull -> 556
    //   542: iconst_4
    //   543: anewarray java/lang/String
    //   546: invokestatic Zc : ([Ljava/lang/String;)V
    //   549: goto -> 556
    //   552: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   555: athrow
    //   556: areturn
    // Exception table:
    //   from	to	target	type
    //   438	473	476	java/util/regex/PatternSyntaxException
    //   468	484	484	java/util/regex/PatternSyntaxException
    //   489	549	552	java/util/regex/PatternSyntaxException
  }
  
  void Zx() {
    Zm2.Zo(Zze0.SUITE_MESSAGE_ANALYSER_SEARCH_SETTINGS);
    (new Zsvw(this)).Zu(this.ZF);
  }
  
  private void lambda$scrollToOffset$17(int paramInt) {
    this.ZD.ZZ(paramInt);
  }
  
  private void lambda$setSelection$16(int paramInt1, int paramInt2) {
    ZC(paramInt1, paramInt2);
  }
  
  private void lambda$flashMatchesStatus$15() {
    this.Zm.ZO(Zlkk.ALERT_HIGHLIGHT_COLOUR);
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.IGNORED);
    } 
    this.Zm.ZO(Zlkk.TEXT_EDITOR_BACKGROUND);
  }
  
  private void lambda$setEditorAndRedoSearch$14(Runnable paramRunnable) {
    try {
      this.Z_ = true;
      paramRunnable.run();
      this.Z_ = false;
      ZQ();
      Zv();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$setText$13(String paramString, boolean paramBoolean) {
    this.ZD.Zz(paramString, paramBoolean);
  }
  
  private void lambda$replaceText$12(String paramString, int paramInt1, int paramInt2) {
    this.ZD.ZW(paramString, paramInt1, paramInt2);
  }
  
  private void lambda$replaceRawBytes$11(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.ZD.ZW(Zkb.ZG(paramArrayOfbyte), paramInt1, paramInt2);
  }
  
  private void lambda$checkpoint$10(Ztcw paramZtcw, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject, String paramString1, boolean paramBoolean4, String paramString2, List<Zkv5> paramList1, List<Zkv5> paramList2, Zkv5 paramZkv5) {
    try {
      paramZtcw.Zg();
      this.Zn.ZT(paramBoolean1);
      this.Zn.ZK(paramBoolean2);
      this.Zn.ZD(paramBoolean3);
      this.ZW = paramObject;
      this.ZA.setText(paramString1);
      this.ZE.setVisible(paramBoolean4);
      this.ZG = paramString2;
      ZV(paramList1);
      Zy(paramList2);
      this.ZV = paramZkv5;
      if (paramZkv5 != null) {
        try {
        
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
        List<Zkv5> list = !paramList1.isEmpty() ? paramList1 : paramList2;
        ZA(list.indexOf(paramZkv5), list.size());
        this.ZD.Zu(paramZkv5.startOffset(), paramZkv5.endOffset());
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private void lambda$append$9(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    ZQ(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  private void lambda$setJavaScript$8(byte[] paramArrayOfbyte) {
    this.ZD.Z_(Ztof.JAVASCRIPT, this.ZG, paramArrayOfbyte);
  }
  
  private void lambda$setJava$7(byte[] paramArrayOfbyte) {
    this.ZD.Z_(Ztof.JAVA, this.ZG, paramArrayOfbyte);
  }
  
  private void lambda$setPlainText$6(byte[] paramArrayOfbyte) {
    this.ZD.Z_(Ztof.PLAIN_TEXT, this.ZG, paramArrayOfbyte);
  }
  
  private void lambda$setHtml$5(byte[] paramArrayOfbyte) {
    this.ZD.Z_(Ztof.HTML, this.ZG, paramArrayOfbyte);
  }
  
  private void lambda$setWebSocketMessage$4(byte[] paramArrayOfbyte) {
    this.ZD.Za(paramArrayOfbyte, this.ZG, true);
  }
  
  private void lambda$setResponse$3(Zs68 paramZs68, byte[] paramArrayOfbyte) {
    this.ZD.ZK(paramZs68, this.ZG, paramArrayOfbyte, paramZs68.Zk, true);
  }
  
  private void lambda$setRequest$2(Zefx paramZefx, boolean paramBoolean) {
    this.ZD.ZU(paramZefx, this.ZG, paramBoolean);
  }
  
  private void lambda$addClearButton$1(Zkvz paramZkvz, ActionEvent paramActionEvent) {
    try {
      Zx(Zdo.ZQ);
      if (paramZkvz != null)
        paramZkvz.ZB(); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
  }
  
  private static void lambda$static$0() {}
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '6î¶ÚáâÜB²¤ ,8ÛJ<Sf§ËÃL-ójª­µÒ7v*mbVîn×8ÁnSf]ùþ+¼åj\ÑéE >._nbâ¸ÿ`Ä70=à\²#¯¿ç=$÷£¤¹2ÔòHM¡ãrKªGV®¿çTP\\f&¼ýjxZòQuàÆýÄÓwÊê+"\\bÚ\\fûËlRJñÖgþ\\r­NÒ\\t=ëáÝõð}¶ìx°ô=\Ò¾ðY!Ìéñ:ð1 H+Áð"5D÷ðc I3bù b0aQ!0ÌIC|Mþ×Å\\bù6æ ¾XYnªlE.4múÀ4Ke«Ò¥Ã'Ahv@2Í{°}k[QTæÉ\\r5í\\bV¸Æ0\\f¨óö½\\n\\r5<\\rÅS4t-.PiRÅÀØ\\núÏMÉmù#l´ÓÛ¾bË'ÒÓr/ýµl©jjoU]]@¨¶\´¹jG!m¶ó¶rë%Öï'é²ä|°·rÔ$××\\tA6òÂ(>_æ,HZ¢\\t5¤Ó\\b).ým¥\\n5´cl4e\\fÌ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc 'ý½\\n\\bÄ|0^Ã>ºw'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #101
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
    //   128: putstatic burp/Zbkv.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbkv.b : [Ljava/lang/String;
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
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #15
    //   219: goto -> 244
    //   222: bipush #102
    //   224: goto -> 244
    //   227: bipush #52
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #27
    //   239: goto -> 244
    //   242: bipush #11
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
    //   300: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   305: putstatic burp/Zbkv.ZR : Ljava/lang/Runnable;
    //   308: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB54E) & 0xFFFF;
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
      byte b1 = 19;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */