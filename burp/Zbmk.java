package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.util.function.Supplier;
import javax.swing.BorderFactory;
import javax.swing.JSeparator;

public class Zbmk extends Zbv5 implements Zg0 {
  private final Zbme ZV;
  
  private final Zbma ZR;
  
  private final Zkr6 ZG;
  
  private final Runnable Z_;
  
  private final boolean ZU;
  
  private final Zz0n Zf;
  
  private final Zt4u Zy;
  
  private final Zr_4 Zo;
  
  private final Zx09 Zh;
  
  private final String[] ZS;
  
  private final Zbc9 Zm;
  
  private final Zbc9 ZK;
  
  private final Zbc9 ZN;
  
  private final Zbyw[] ZY;
  
  private final Supplier<Zejb> ZH;
  
  private final Zxaw ZB;
  
  private int Zi;
  
  private int Zw;
  
  private Zbkc Zq;
  
  private Zbkc ZA;
  
  private Zbkc Za;
  
  private Zm99 Zg;
  
  private Ze0q Zd;
  
  private Zedd<String> Zt;
  
  private Zedd<String> Zj;
  
  private Zl8w Zl;
  
  private Zm2o Zb;
  
  private Zm2o ZD;
  
  private Zm2o ZC;
  
  private Zm2o ZL;
  
  private Zm99 ZT;
  
  private Zm99 ZX;
  
  private Zm99 Zv;
  
  private JSeparator ZF;
  
  private JSeparator ZP;
  
  private JSeparator ZJ;
  
  private Zm99 ZI;
  
  private Zm99 ZQ;
  
  private Zbqc Zs;
  
  private Zbqc Zn;
  
  private Zbqc ZM;
  
  private Zbkc ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbmk(Zbme paramZbme, Zbma paramZbma, Zkr6 paramZkr6, Zz0n paramZz0n, Zt4u paramZt4u, Zr_4 paramZr_4, Zx09 paramZx09, Runnable paramRunnable, boolean paramBoolean, Supplier<Zejb> paramSupplier, Zxaw paramZxaw) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iconst_m1
    //   6: putfield Zw : I
    //   9: invokestatic Zp : ()I
    //   12: aload_0
    //   13: aload_1
    //   14: putfield ZV : Lburp/Zbme;
    //   17: aload_0
    //   18: aload_2
    //   19: putfield ZR : Lburp/Zbma;
    //   22: aload_0
    //   23: aload_3
    //   24: putfield ZG : Lburp/Zkr6;
    //   27: aload_0
    //   28: aload #8
    //   30: putfield Z_ : Ljava/lang/Runnable;
    //   33: aload_0
    //   34: iload #9
    //   36: putfield ZU : Z
    //   39: istore #12
    //   41: aload_0
    //   42: aload #4
    //   44: putfield Zf : Lburp/Zz0n;
    //   47: aload_0
    //   48: aload #5
    //   50: putfield Zy : Lburp/Zt4u;
    //   53: aload_0
    //   54: aload #6
    //   56: putfield Zo : Lburp/Zr_4;
    //   59: aload_0
    //   60: aload #7
    //   62: putfield Zh : Lburp/Zx09;
    //   65: aload_0
    //   66: aload #10
    //   68: putfield ZH : Ljava/util/function/Supplier;
    //   71: aload_0
    //   72: aload #11
    //   74: putfield ZB : Lburp/Zxaw;
    //   77: aload_0
    //   78: bipush #20
    //   80: anewarray burp/Zbyw
    //   83: putfield ZY : [Lburp/Zbyw;
    //   86: aload_0
    //   87: invokevirtual Zy : ()V
    //   90: aload_0
    //   91: new burp/Zbc9
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: putfield Zm : Lburp/Zbc9;
    //   101: aload_0
    //   102: getfield Zn : Lburp/Zbqc;
    //   105: aload_0
    //   106: getfield Zm : Lburp/Zbc9;
    //   109: sipush #10020
    //   112: sipush #-20400
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   121: aload_0
    //   122: new burp/Zbc9
    //   125: dup
    //   126: invokespecial <init> : ()V
    //   129: putfield ZK : Lburp/Zbc9;
    //   132: aload_0
    //   133: getfield ZM : Lburp/Zbqc;
    //   136: aload_0
    //   137: getfield ZK : Lburp/Zbc9;
    //   140: sipush #10047
    //   143: sipush #4254
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   152: aload_0
    //   153: new burp/Zbc9
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: putfield ZN : Lburp/Zbc9;
    //   163: aload_0
    //   164: getfield Zs : Lburp/Zbqc;
    //   167: aload_0
    //   168: getfield ZN : Lburp/Zbc9;
    //   171: sipush #10047
    //   174: sipush #4254
    //   177: invokestatic a : (II)Ljava/lang/String;
    //   180: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   183: iload #9
    //   185: ifeq -> 201
    //   188: aload_0
    //   189: getfield Zd : Lburp/Ze0q;
    //   192: iconst_0
    //   193: invokevirtual setVisible : (Z)V
    //   196: iload #12
    //   198: ifne -> 211
    //   201: aload_0
    //   202: getfield Zd : Lburp/Ze0q;
    //   205: getstatic burp/Zt00.BOLD_FONT : Lburp/Zt00;
    //   208: invokevirtual ZX : (Lburp/Zt00;)V
    //   211: aload_0
    //   212: bipush #20
    //   214: anewarray java/lang/String
    //   217: putfield ZS : [Ljava/lang/String;
    //   220: iconst_0
    //   221: istore #13
    //   223: iload #13
    //   225: bipush #20
    //   227: if_icmpge -> 252
    //   230: aload_0
    //   231: getfield ZS : [Ljava/lang/String;
    //   234: iload #13
    //   236: iload #13
    //   238: iconst_1
    //   239: iadd
    //   240: invokestatic toString : (I)Ljava/lang/String;
    //   243: aastore
    //   244: iinc #13, 1
    //   247: iload #12
    //   249: ifne -> 223
    //   252: invokestatic Zy : ()Ljava/util/List;
    //   255: aload_0
    //   256: <illegal opcode> accept : (Lburp/Zbmk;)Ljava/util/function/Consumer;
    //   261: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   266: iload #9
    //   268: ifeq -> 279
    //   271: aload_0
    //   272: getfield Zj : Lburp/Zedd;
    //   275: iconst_0
    //   276: invokevirtual setEnabled : (Z)V
    //   279: return
  }
  
  public void ZL(Zmp0 paramZmp0) {
    this.Zm.add(paramZmp0.Zz());
  }
  
  void ZO(Zby1 paramZby1, Zby3 paramZby3) {
    this.ZK.add(paramZby1);
    this.ZN.add(paramZby3);
  }
  
  void Zz(Zbqc paramZbqc1, Zbqc paramZbqc2, Zbqc paramZbqc3) {
    this.Zm.ZP(paramZbqc1);
    this.ZK.ZP(paramZbqc2);
    this.ZN.ZP(paramZbqc3);
  }
  
  void ZS() {
    if (this.Zw == -1)
      return; 
    Ze9k ze9k = this.ZY[this.Zw].Zj();
    ZO(ze9k.Zyv(), ze9k.ZyP());
  }
  
  void ZO(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zx : ()I
    //   3: istore_3
    //   4: iload_1
    //   5: ifge -> 28
    //   8: aload_0
    //   9: getfield ZI : Lburp/Zm99;
    //   12: sipush #10044
    //   15: sipush #16529
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: invokevirtual setText : (Ljava/lang/String;)V
    //   24: iload_3
    //   25: ifeq -> 70
    //   28: aload_0
    //   29: getfield ZI : Lburp/Zm99;
    //   32: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   35: iload_1
    //   36: i2l
    //   37: invokevirtual format : (J)Ljava/lang/String;
    //   40: iload_2
    //   41: ifeq -> 60
    //   44: iload_1
    //   45: ifeq -> 60
    //   48: sipush #10046
    //   51: sipush #-7884
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: goto -> 62
    //   60: ldc ''
    //   62: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   67: invokevirtual setText : (Ljava/lang/String;)V
    //   70: iconst_m1
    //   71: istore #4
    //   73: iconst_0
    //   74: istore #5
    //   76: getstatic burp/Zlpx.ZF : [I
    //   79: aload_0
    //   80: getfield ZH : Ljava/util/function/Supplier;
    //   83: invokeinterface get : ()Ljava/lang/Object;
    //   88: checkcast burp/Zejb
    //   91: invokevirtual ordinal : ()I
    //   94: iaload
    //   95: tableswitch default -> 383, 1 -> 124, 2 -> 142, 3 -> 152, 4 -> 269
    //   124: aload_0
    //   125: getfield ZR : Lburp/Zbma;
    //   128: invokevirtual ZQ : ()I
    //   131: iload_1
    //   132: imul
    //   133: istore #4
    //   135: iload_2
    //   136: istore #5
    //   138: iload_3
    //   139: ifeq -> 383
    //   142: iload_1
    //   143: istore #4
    //   145: iload_2
    //   146: istore #5
    //   148: iload_3
    //   149: ifeq -> 383
    //   152: iconst_0
    //   153: istore #6
    //   155: iload #6
    //   157: aload_0
    //   158: getfield Zi : I
    //   161: if_icmpge -> 265
    //   164: iconst_0
    //   165: istore #7
    //   167: iconst_0
    //   168: istore #8
    //   170: aload_0
    //   171: getfield ZY : [Lburp/Zbyw;
    //   174: iload #6
    //   176: aaload
    //   177: ifnull -> 232
    //   180: aload_0
    //   181: getfield ZY : [Lburp/Zbyw;
    //   184: iload #6
    //   186: aaload
    //   187: invokevirtual Zj : ()Lburp/Ze9k;
    //   190: astore #9
    //   192: aload #9
    //   194: ifnonnull -> 201
    //   197: iconst_0
    //   198: goto -> 208
    //   201: aload #9
    //   203: invokeinterface Zyv : ()I
    //   208: istore #7
    //   210: aload #9
    //   212: ifnull -> 229
    //   215: aload #9
    //   217: invokeinterface ZyP : ()Z
    //   222: ifeq -> 229
    //   225: iconst_1
    //   226: goto -> 230
    //   229: iconst_0
    //   230: istore #8
    //   232: iload #7
    //   234: iflt -> 258
    //   237: iload #4
    //   239: iconst_m1
    //   240: if_icmpeq -> 250
    //   243: iload #7
    //   245: iload #4
    //   247: if_icmpge -> 258
    //   250: iload #7
    //   252: istore #4
    //   254: iload #8
    //   256: istore #5
    //   258: iinc #6, 1
    //   261: iload_3
    //   262: ifeq -> 155
    //   265: iload_3
    //   266: ifeq -> 383
    //   269: iconst_1
    //   270: istore #4
    //   272: iconst_0
    //   273: istore #6
    //   275: iload #6
    //   277: aload_0
    //   278: getfield Zi : I
    //   281: if_icmpge -> 383
    //   284: iconst_0
    //   285: istore #7
    //   287: iconst_0
    //   288: istore #8
    //   290: aload_0
    //   291: getfield ZY : [Lburp/Zbyw;
    //   294: iload #6
    //   296: aaload
    //   297: ifnull -> 334
    //   300: aload_0
    //   301: getfield ZY : [Lburp/Zbyw;
    //   304: iload #6
    //   306: aaload
    //   307: invokevirtual Zj : ()Lburp/Ze9k;
    //   310: invokeinterface Zyv : ()I
    //   315: istore #7
    //   317: aload_0
    //   318: getfield ZY : [Lburp/Zbyw;
    //   321: iload #6
    //   323: aaload
    //   324: invokevirtual Zj : ()Lburp/Ze9k;
    //   327: invokeinterface ZyP : ()Z
    //   332: istore #8
    //   334: iload #7
    //   336: ifge -> 346
    //   339: iconst_m1
    //   340: istore #4
    //   342: iload_3
    //   343: ifeq -> 383
    //   346: iload #7
    //   348: ifne -> 361
    //   351: iconst_0
    //   352: istore #4
    //   354: iconst_0
    //   355: istore #5
    //   357: iload_3
    //   358: ifeq -> 383
    //   361: iload #4
    //   363: iload #7
    //   365: imul
    //   366: istore #4
    //   368: iload #8
    //   370: ifeq -> 376
    //   373: iconst_1
    //   374: istore #5
    //   376: iinc #6, 1
    //   379: iload_3
    //   380: ifeq -> 275
    //   383: iload #4
    //   385: ifge -> 408
    //   388: aload_0
    //   389: getfield ZQ : Lburp/Zm99;
    //   392: sipush #10045
    //   395: sipush #-32215
    //   398: invokestatic a : (II)Ljava/lang/String;
    //   401: invokevirtual setText : (Ljava/lang/String;)V
    //   404: iload_3
    //   405: ifeq -> 453
    //   408: aload_0
    //   409: getfield ZQ : Lburp/Zm99;
    //   412: getstatic burp/Zlb0.Zl : Ljava/text/NumberFormat;
    //   415: iload #4
    //   417: i2l
    //   418: invokevirtual format : (J)Ljava/lang/String;
    //   421: iload #5
    //   423: ifeq -> 443
    //   426: iload #4
    //   428: ifeq -> 443
    //   431: sipush #10031
    //   434: sipush #-316
    //   437: invokestatic a : (II)Ljava/lang/String;
    //   440: goto -> 445
    //   443: ldc ''
    //   445: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   450: invokevirtual setText : (Ljava/lang/String;)V
    //   453: return
  }
  
  void Zt(int paramInt) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: istore_2
    //   4: iload_1
    //   5: bipush #20
    //   7: invokestatic min : (II)I
    //   10: istore_1
    //   11: iload_1
    //   12: aload_0
    //   13: getfield Zi : I
    //   16: if_icmple -> 53
    //   19: aload_0
    //   20: getfield Zi : I
    //   23: istore_3
    //   24: iload_3
    //   25: iload_1
    //   26: if_icmpge -> 49
    //   29: aload_0
    //   30: getfield Zt : Lburp/Zedd;
    //   33: aload_0
    //   34: getfield ZS : [Ljava/lang/String;
    //   37: iload_3
    //   38: aaload
    //   39: invokevirtual addItem : (Ljava/lang/Object;)V
    //   42: iinc #3, 1
    //   45: iload_2
    //   46: ifne -> 24
    //   49: iload_2
    //   50: ifne -> 91
    //   53: iload_1
    //   54: aload_0
    //   55: getfield Zi : I
    //   58: if_icmpge -> 91
    //   61: iload_1
    //   62: istore_3
    //   63: iload_3
    //   64: aload_0
    //   65: getfield Zi : I
    //   68: if_icmpge -> 91
    //   71: aload_0
    //   72: getfield Zt : Lburp/Zedd;
    //   75: aload_0
    //   76: getfield ZS : [Ljava/lang/String;
    //   79: iload_3
    //   80: aaload
    //   81: invokevirtual removeItem : (Ljava/lang/Object;)V
    //   84: iinc #3, 1
    //   87: iload_2
    //   88: ifne -> 63
    //   91: aload_0
    //   92: iload_1
    //   93: putfield Zi : I
    //   96: return
  }
  
  public Zbws ZX() {
    return this.ZV.ZS();
  }
  
  private void Zy() {
    this.Zt = new Zedd<>();
    this.ZT = new Zm99();
    this.ZX = new Zm99();
    this.ZI = new Zm99();
    this.ZQ = new Zm99();
    this.Zv = new Zm99();
    this.ZL = new Zm2o();
    this.Zg = new Zm99();
    this.Zj = new Zedd<>();
    this.Zn = new Zbqc();
    this.ZM = new Zbqc();
    this.ZD = new Zm2o();
    this.ZC = new Zm2o();
    this.Zq = new Zbkc();
    this.ZE = new Zbkc();
    this.ZA = new Zbkc();
    this.Zb = new Zm2o();
    this.Za = new Zbkc();
    this.Zs = new Zbqc();
    this.ZF = new JSeparator();
    this.ZP = new JSeparator();
    this.ZJ = new JSeparator();
    this.Zl = new Zl8w();
    this.Zd = new Ze0q();
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zt.setName(a(10018, 19058));
    this.Zt.addActionListener(new Zepu(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zt, gridBagConstraints);
    this.ZT.setText(a(10017, -32572));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZT, gridBagConstraints);
    this.ZX.setText(a(10024, -15431));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZX, gridBagConstraints);
    this.ZI.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.ZI, gridBagConstraints);
    this.ZQ.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZQ, gridBagConstraints);
    this.Zv.setText(a(10019, -14541));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zv, gridBagConstraints);
    this.ZL.Zi(null);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZL, gridBagConstraints);
    this.Zg.setText(a(10022, -15144));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zg, gridBagConstraints);
    this.Zj.setName(a(10029, 8109));
    this.Zj.addActionListener(new Zm85(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zj, gridBagConstraints);
    this.Zn.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zn, gridBagConstraints);
    this.ZM.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZM, gridBagConstraints);
    this.ZD.Zi(Zk97.DESKTOP_TOOLS_INTRUDER_PAYLOADS_PROCESSING_PAYLOAD_PROCESSING_RULES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZD, gridBagConstraints);
    this.ZC.Zi(Zk97.DESKTOP_TOOLS_INTRUDER_PAYLOADS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZC, gridBagConstraints);
    this.Zq.Zx(a(10021, -7080));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.Zq, gridBagConstraints);
    this.ZE.Zx(a(10027, 25799));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.ZE, gridBagConstraints);
    this.ZA.Zx(a(10016, -781));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.ZA, gridBagConstraints);
    this.Zb.Zi(Zk97.DESKTOP_TOOLS_INTRUDER_PAYLOADS_PROCESSING_PAYLOAD_ENCODING);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zb, gridBagConstraints);
    this.Za.Zx(a(10026, -7682));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.Zs.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 24;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 20, 0);
    add(this.Zs, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 15, 0);
    add(this.ZF, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 15, 0);
    add(this.ZP, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 11;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 15, 0);
    add(this.ZJ, gridBagConstraints);
    this.Zl.setText(a(10028, -2739));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zl, gridBagConstraints);
    this.Zd.setText(a(10023, -29049));
    this.Zd.setName(a(10025, 8620));
    this.Zd.addActionListener(new Zgqb(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 10;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    add(this.Zd, gridBagConstraints);
  }
  
  private void Zk(ActionEvent paramActionEvent) {
    this.Zw = this.Zt.getSelectedIndex();
    if (this.ZY[this.Zw] == null) {
      Objects.requireNonNull(this.ZR);
      this.ZY[this.Zw] = new Zbyw(this, this.ZG, this.Zf, this.Zy, this.ZU, this.Zo, this.Zh, this.ZR::ZH, this.Zw, this.ZB);
    } 
    Ze9k ze9k = this.ZY[this.Zw].Zj();
    this.Zj.setSelectedIndex((ze9k == null) ? 0 : (ze9k.Zyi()).id);
    Zj(paramActionEvent);
    ZS();
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    Zzvm zzvm = Zzvm.ZU((byte)this.Zj.getSelectedIndex());
    if (zzvm == null || this.Zw < 0)
      return; 
    this.ZE.Zx(a(10030, -23857) + a(10030, -23857) + zzvm.name);
    this.ZY[this.Zw].ZU(zzvm);
    ZS();
    this.ZL.Zi(zzvm.documentationItem);
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.Z_.run();
  }
  
  public void Zr(Zsh8 paramZsh8) {
    Zrte<Ze9k> zrte = paramZsh8.ZPq();
    byte b = 0;
    int i = Zbyw.Zp();
    while (b < zrte.Zpu()) {
      Ze9k ze9k = zrte.ZdF(b);
      if (ze9k != null) {
        if (this.ZY[b] == null) {
          Objects.requireNonNull(this.ZR);
          Zbyw zbyw = new Zbyw(this, this.ZG, this.Zf, this.Zy, this.ZU, this.Zo, this.Zh, this.ZR::ZH, b, this.ZB);
          this.ZY[b] = zbyw;
        } 
        this.ZY[b].ZA(ze9k, paramZsh8, b);
      } 
      b++;
      if (i == 0)
        break; 
    } 
    this.Zt.setSelectedIndex(0);
    Zk((ActionEvent)null);
  }
  
  public void ZX(Zsh8 paramZsh8) {
    Zrte<Ze9k> zrte = this.Zo.<Zrte>Zv((Zllg)new Zguz<>(Ze9k.ZX), this.Zi);
    Zmjc zmjc = new Zmjc(paramZsh8, this.Zo);
    byte b = 0;
    int i = Zbyw.Zx();
    while (b < this.Zi) {
      Zbyw zbyw = this.ZY[b];
      if (zbyw != null) {
        zbyw.ZE(zmjc, b);
        Ze9k ze9k1 = zbyw.Zj();
        Ze9k ze9k2 = ze9k1.Zw(this.Zo);
        zrte.ZU(b, ze9k2);
      } 
      b++;
      if (i != 0)
        break; 
    } 
    paramZsh8.Zf(zrte);
  }
  
  public void ZP(Zb_j paramZb_j) {
    this.ZY[0].ZP(paramZb_j);
  }
  
  public void Zs(Zb_j paramZb_j) {
    this.ZY[0].Zs(paramZb_j);
  }
  
  public void ZNH() {
    this.ZY[0].ZNH();
  }
  
  private void lambda$new$0(Zzvm paramZzvm) {
    this.Zj.addItem(paramZzvm.name);
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'î¬ÒwDPy<,î}ôE×¹\\t\\tª×]4HçD¡j}æÔ6°{}4ézñ»i:Vïå3yxÁ¡¶b¨L+©ºBÞI°Þ`Ífø,\\t3oÿÎÄ³/Ü¤?ÔQxÊzÉRòÚÒª¡6þÕ1÷R¤>TeW3ûðß~ÂõFc@>q@#SvIÐÐñÿð÷X«øã_ÔnÚ\\rÃ®9¦CÆøîqWqµ+ÚYe·xÊØa(êj|ÁáB¯ÚþG/º@¤Áíÿ²üÑ·ÐçT0ßkuöjzÆ©^ÕWËí)4ÅÔGÂÛ¨Tó¤á(±¨zuBÚP? Ù5Ý·oÚH±=\\nëzGF»0^ì%¤ÓH{M<RùE¨7'÷«¼wviFü©6émJr«rdÀðñûÕ\\f]O¹¸a÷©ä£ª\\rR#MùàXçXß%\\f\\f¥èL4cÏÔºç%¯«£Ð\\f*½\\n]\\bBiøÎ{"9mÍärÉIm±dÕ¿s"[þ'Jy.à9Ù$¨|<eÎûò@1¤neÑ£^¢)\\tVïNÐ¯¤dç'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #126
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
    //   68: ldc '¹=0ÐØ(µ´<'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #27
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
    //   129: putstatic burp/Zbmk.a : [Ljava/lang/String;
    //   132: bipush #20
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbmk.b : [Ljava/lang/String;
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
    //   212: bipush #47
    //   214: goto -> 244
    //   217: bipush #35
    //   219: goto -> 244
    //   222: bipush #30
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #98
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #82
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
    int i = (paramInt1 ^ 0x272F) & 0xFFFF;
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
      byte b1 = 61;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbmk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */