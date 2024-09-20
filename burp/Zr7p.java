package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;

class Zr7p extends Zrh7 {
  private final Zecc Zo;
  
  private final Zs3v ZV;
  
  private final Zkl6 Zs;
  
  private final boolean Zh;
  
  private boolean Zr;
  
  private Zbkc ZR;
  
  public Zzdy ZT;
  
  private Ze01 ZB;
  
  private Ze01 Zt;
  
  private Zedd ZZ;
  
  private Zl8w ZG;
  
  private Zm2o ZL;
  
  private Zbqc ZA;
  
  private Zm99 ZH;
  
  private Zm99 Z_;
  
  private Zm99 ZJ;
  
  private Zm99 Zc;
  
  private Zm99 ZK;
  
  private Zm99 Zl;
  
  private Zbqc ZM;
  
  private Zm99 ZN;
  
  private Zbkc ZP;
  
  private Zbup Zv;
  
  private Zgff ZW;
  
  private Zgff ZE;
  
  private Ztln Zy;
  
  private Zl86 Zz;
  
  private Zgff Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr7p(Window paramWindow, Zs3v paramZs3v, Zkl6 paramZkl6, Zecc paramZecc) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: getstatic burp/Zzv7.HTTP_AUTHENTICATION_PROMPTER_UI_DIALOG : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: aload_0
    //   10: aload_2
    //   11: putfield ZV : Lburp/Zs3v;
    //   14: invokestatic ZG : ()I
    //   17: aload_0
    //   18: aload_3
    //   19: putfield Zs : Lburp/Zkl6;
    //   22: istore #5
    //   24: aload_0
    //   25: aload #4
    //   27: putfield Zo : Lburp/Zecc;
    //   30: aload_0
    //   31: invokevirtual Zj : ()V
    //   34: aload_0
    //   35: getfield Zv : Lburp/Zbup;
    //   38: bipush #70
    //   40: bipush #12
    //   42: invokestatic Zf : (Ljava/awt/Component;II)V
    //   45: aload_0
    //   46: aload_2
    //   47: getfield Zo : I
    //   50: sipush #407
    //   53: if_icmpne -> 64
    //   56: iconst_1
    //   57: goto -> 65
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: iconst_0
    //   65: putfield Zh : Z
    //   68: aload_0
    //   69: getfield ZZ : Lburp/Zedd;
    //   72: ldc ''
    //   74: invokevirtual addItem : (Ljava/lang/Object;)V
    //   77: aload_0
    //   78: getfield ZZ : Lburp/Zedd;
    //   81: sipush #-14799
    //   84: sipush #-32726
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokevirtual addItem : (Ljava/lang/Object;)V
    //   93: aload_0
    //   94: getfield ZZ : Lburp/Zedd;
    //   97: sipush #-14801
    //   100: sipush #-5866
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual addItem : (Ljava/lang/Object;)V
    //   109: aload_0
    //   110: getfield ZZ : Lburp/Zedd;
    //   113: sipush #-14800
    //   116: sipush #15484
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual addItem : (Ljava/lang/Object;)V
    //   125: aload_0
    //   126: aload_0
    //   127: getfield Zh : Z
    //   130: ifeq -> 149
    //   133: sipush #-14795
    //   136: sipush #-20476
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: goto -> 158
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: sipush #-14807
    //   152: sipush #-10778
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual setTitle : (Ljava/lang/String;)V
    //   161: aload_0
    //   162: getfield ZP : Lburp/Zbkc;
    //   165: aload_0
    //   166: getfield Zh : Z
    //   169: ifeq -> 188
    //   172: sipush #-14785
    //   175: sipush #21095
    //   178: invokestatic a : (II)Ljava/lang/String;
    //   181: goto -> 197
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: sipush #-14793
    //   191: sipush #-32022
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: invokevirtual Zx : (Ljava/lang/String;)V
    //   200: aload_0
    //   201: getfield Zh : Z
    //   204: ifeq -> 262
    //   207: aload_0
    //   208: getfield ZN : Lburp/Zm99;
    //   211: aload_3
    //   212: invokeinterface Zt : ()Lburp/Zgmh;
    //   217: aload_2
    //   218: getfield Z_ : Lburp/Zmzk;
    //   221: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   226: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   231: invokevirtual ZH : ()Lburp/Zmzk;
    //   234: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   239: sipush #-14805
    //   242: sipush #-26058
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: swap
    //   249: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   254: invokevirtual setText : (Ljava/lang/String;)V
    //   257: iload #5
    //   259: ifne -> 304
    //   262: aload_2
    //   263: getfield ZT : Lburp/Zmzk;
    //   266: aload_2
    //   267: getfield Zp : [B
    //   270: iconst_1
    //   271: aload_3
    //   272: invokeinterface ZB : ()Lburp/Zbnt;
    //   277: invokestatic Zu : (Lburp/Zmzk;[BBLburp/Zbnt;)Lburp/Zz1p;
    //   280: astore #6
    //   282: aload_0
    //   283: getfield ZN : Lburp/Zm99;
    //   286: aload #6
    //   288: getfield Zo : Lburp/Zlit;
    //   291: invokeinterface Zdt : ()Lburp/Zlit;
    //   296: invokeinterface toString : ()Ljava/lang/String;
    //   301: invokevirtual setText : (Ljava/lang/String;)V
    //   304: goto -> 317
    //   307: astore #6
    //   309: aload #6
    //   311: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   314: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   317: aload_0
    //   318: getfield Zz : Lburp/Zl86;
    //   321: aload_2
    //   322: getfield ZJ : [B
    //   325: invokestatic ZG : ([B)Ljava/lang/String;
    //   328: invokevirtual setText : (Ljava/lang/String;)V
    //   331: aload_0
    //   332: invokevirtual pack : ()V
    //   335: aload_0
    //   336: aload_1
    //   337: invokevirtual Zq : (Ljava/awt/Window;)V
    //   340: aload_0
    //   341: getfield Zh : Z
    //   344: ifeq -> 394
    //   347: aload_3
    //   348: invokeinterface Zt : ()Lburp/Zgmh;
    //   353: aload_2
    //   354: getfield Z_ : Lburp/Zmzk;
    //   357: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   362: invokeinterface ZG : (Ljava/lang/String;)Lburp/Zrt_;
    //   367: astore #7
    //   369: aload #7
    //   371: ifnonnull -> 382
    //   374: aconst_null
    //   375: goto -> 387
    //   378: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   381: athrow
    //   382: aload #7
    //   384: invokevirtual ZD : ()Lburp/Zkjm;
    //   387: astore #6
    //   389: iload #5
    //   391: ifne -> 414
    //   394: aload_3
    //   395: invokeinterface Zb : ()Lburp/Zz52;
    //   400: aload_2
    //   401: getfield Z_ : Lburp/Zmzk;
    //   404: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   409: invokevirtual ZI : (Ljava/lang/String;)Lburp/Zkjm;
    //   412: astore #6
    //   414: aload_0
    //   415: aload #6
    //   417: invokevirtual Zg : (Lburp/Zkjm;)V
    //   420: return
    // Exception table:
    //   from	to	target	type
    //   24	60	60	java/lang/Exception
    //   65	145	145	java/lang/Exception
    //   158	184	184	java/lang/Exception
    //   200	304	307	java/lang/Exception
    //   369	378	378	java/lang/Exception
  }
  
  private void Zg(Zkjm paramZkjm) {
    if (paramZkjm == null)
      return; 
    this.Zb.setText(paramZkjm.Zk());
    this.Zy.setText(paramZkjm.ZK());
    this.ZW.setText(paramZkjm.Zd());
    this.ZE.setText(paramZkjm.ZJ());
    this.ZZ.setSelectedIndex(paramZkjm.Zn());
  }
  
  boolean Ze() {
    return this.Zr;
  }
  
  private void ZP() {
    synchronized (this) {
      notifyAll();
    } 
  }
  
  private void Zj() {
    this.ZA = new Zbqc();
    this.ZJ = new Zm99();
    this.ZZ = new Zedd();
    this.ZK = new Zm99();
    this.Zc = new Zm99();
    this.Zl = new Zm99();
    this.Z_ = new Zm99();
    this.Zb = new Zgff();
    this.ZW = new Zgff();
    this.ZE = new Zgff();
    this.ZH = new Zm99();
    this.ZN = new Zm99();
    this.ZT = new Zzdy();
    this.Zy = new Ztln();
    this.ZM = new Zbqc();
    this.Zt = new Ze01();
    this.ZB = new Ze01();
    this.ZL = new Zm2o();
    this.ZP = new Zbkc();
    this.ZG = new Zl8w();
    this.Zv = new Zbup();
    this.Zz = new Zl86();
    this.ZR = new Zbkc();
    addWindowListener(new Zlad(this));
    this.ZA.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    this.ZA.setLayout(gridBagLayout);
    this.ZJ.setText(a(-14792, -3411));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.ZJ, gridBagConstraints);
    this.ZZ.addActionListener(new Ztm8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.ZZ, gridBagConstraints);
    this.ZK.setText(a(-14786, 16885));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.ZK, gridBagConstraints);
    this.Zc.setText(a(-14803, -21912));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.Zc, gridBagConstraints);
    this.Zl.setText(a(-14802, 6312));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.Zl, gridBagConstraints);
    this.Z_.setText(a(-14791, -19104));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.Z_, gridBagConstraints);
    this.Zb.setColumns(20);
    this.Zb.ZH(Zlw9.USERNAME);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.Zb, gridBagConstraints);
    this.ZW.setColumns(20);
    this.ZW.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.ZW, gridBagConstraints);
    this.ZE.setColumns(20);
    this.ZE.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.ZE, gridBagConstraints);
    this.ZH.setText(a(-14787, 8693));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.ZA.add(this.ZH, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    this.ZA.add(this.ZN, gridBagConstraints);
    this.ZT.setText(a(-14794, 26315));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.ZT, gridBagConstraints);
    this.Zy.setColumns(20);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.ZA.add(this.Zy, gridBagConstraints);
    this.ZM.setLayout(new GridLayout(1, 2, 10, 0));
    this.Zt.setText(a(-14797, -8133));
    this.Zt.addActionListener(new Zm0e(this));
    this.ZM.add(this.Zt);
    this.ZB.setText(a(-14798, 848));
    this.ZB.addActionListener(new Zzzb(this));
    this.ZM.add(this.ZB);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 22;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 14;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZA.add(this.ZM, gridBagConstraints);
    this.ZL.Zi(Zk97.DESKTOP_SETTINGS_NETWORK_CONNECTIONS_PLATFORM_AUTHENTICATION);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZA.add(this.ZL, gridBagConstraints);
    this.ZP.Zx(a(-14796, 2763));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.ZA.add(this.ZP, gridBagConstraints);
    this.ZG.setText(a(-14788, -28880));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZA.add(this.ZG, gridBagConstraints);
    this.Zz.setEditable(false);
    this.Zv.setViewportView(this.Zz);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZA.add(this.Zv, gridBagConstraints);
    this.ZR.Zx(a(-14804, -27653));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    this.ZA.add(this.ZR, gridBagConstraints);
    getContentPane().add(this.ZA, a(-14808, -31931));
    pack();
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    ZP();
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zg : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZZ : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: ifeq -> 206
    //   14: aconst_null
    //   15: astore_3
    //   16: aload_0
    //   17: getfield Zo : Lburp/Zecc;
    //   20: aload_0
    //   21: getfield ZZ : Lburp/Zedd;
    //   24: invokevirtual getSelectedIndex : ()I
    //   27: aload_0
    //   28: getfield Zb : Lburp/Zgff;
    //   31: invokevirtual getText : ()Ljava/lang/String;
    //   34: new java/lang/String
    //   37: dup
    //   38: aload_0
    //   39: getfield Zy : Lburp/Ztln;
    //   42: invokevirtual getPassword : ()[C
    //   45: invokespecial <init> : ([C)V
    //   48: aload_0
    //   49: getfield ZW : Lburp/Zgff;
    //   52: invokevirtual getText : ()Ljava/lang/String;
    //   55: aload_0
    //   56: getfield ZE : Lburp/Zgff;
    //   59: invokevirtual getText : ()Ljava/lang/String;
    //   62: aload_0
    //   63: getfield Zh : Z
    //   66: ifeq -> 85
    //   69: sipush #-14789
    //   72: sipush #-2907
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: goto -> 94
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: sipush #-14790
    //   88: sipush #-8804
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: invokevirtual ZH : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lburp/Zkjm;
    //   97: astore_3
    //   98: goto -> 111
    //   101: astore #4
    //   103: aload #4
    //   105: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   108: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   111: aload_0
    //   112: getfield Zh : Z
    //   115: ifeq -> 156
    //   118: aload_0
    //   119: getfield Zs : Lburp/Zkl6;
    //   122: invokeinterface Zt : ()Lburp/Zgmh;
    //   127: aload_0
    //   128: getfield ZV : Lburp/Zs3v;
    //   131: getfield Z_ : Lburp/Zmzk;
    //   134: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   139: aload_3
    //   140: invokeinterface ZD : (Ljava/lang/String;Lburp/Zkjm;)V
    //   145: iload_2
    //   146: ifeq -> 188
    //   149: goto -> 156
    //   152: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   155: athrow
    //   156: aload_0
    //   157: getfield Zs : Lburp/Zkl6;
    //   160: invokeinterface Zb : ()Lburp/Zz52;
    //   165: aload_0
    //   166: getfield ZV : Lburp/Zs3v;
    //   169: getfield Z_ : Lburp/Zmzk;
    //   172: invokeinterface ZJ1 : ()Ljava/lang/String;
    //   177: aload_3
    //   178: invokevirtual Zr : (Ljava/lang/String;Lburp/Zkjm;)V
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload_0
    //   189: iconst_1
    //   190: putfield Zr : Z
    //   193: aload_0
    //   194: iconst_0
    //   195: invokevirtual setVisible : (Z)V
    //   198: aload_0
    //   199: invokevirtual dispose : ()V
    //   202: aload_0
    //   203: invokevirtual ZP : ()V
    //   206: return
    // Exception table:
    //   from	to	target	type
    //   16	81	81	burp/Zxt3
    //   16	98	101	burp/Zxt3
    //   111	149	152	burp/Zxt3
    //   118	181	184	burp/Zxt3
  }
  
  private void ZQ(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZG : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZZ : Lburp/Zedd;
    //   8: invokevirtual getSelectedIndex : ()I
    //   11: tableswitch default -> 168, 0 -> 40, 1 -> 84, 2 -> 128, 3 -> 128
    //   40: aload_0
    //   41: getfield Zb : Lburp/Zgff;
    //   44: iconst_0
    //   45: invokevirtual setEnabled : (Z)V
    //   48: aload_0
    //   49: getfield Zy : Lburp/Ztln;
    //   52: iconst_0
    //   53: invokevirtual setEnabled : (Z)V
    //   56: aload_0
    //   57: getfield ZW : Lburp/Zgff;
    //   60: iconst_0
    //   61: invokevirtual setEnabled : (Z)V
    //   64: aload_0
    //   65: getfield ZE : Lburp/Zgff;
    //   68: iconst_0
    //   69: invokevirtual setEnabled : (Z)V
    //   72: aload_0
    //   73: getfield Zt : Lburp/Ze01;
    //   76: iconst_0
    //   77: invokevirtual setEnabled : (Z)V
    //   80: iload_2
    //   81: ifne -> 168
    //   84: aload_0
    //   85: getfield Zb : Lburp/Zgff;
    //   88: iconst_1
    //   89: invokevirtual setEnabled : (Z)V
    //   92: aload_0
    //   93: getfield Zy : Lburp/Ztln;
    //   96: iconst_1
    //   97: invokevirtual setEnabled : (Z)V
    //   100: aload_0
    //   101: getfield ZW : Lburp/Zgff;
    //   104: iconst_0
    //   105: invokevirtual setEnabled : (Z)V
    //   108: aload_0
    //   109: getfield ZE : Lburp/Zgff;
    //   112: iconst_0
    //   113: invokevirtual setEnabled : (Z)V
    //   116: aload_0
    //   117: getfield Zt : Lburp/Ze01;
    //   120: iconst_1
    //   121: invokevirtual setEnabled : (Z)V
    //   124: iload_2
    //   125: ifne -> 168
    //   128: aload_0
    //   129: getfield Zb : Lburp/Zgff;
    //   132: iconst_1
    //   133: invokevirtual setEnabled : (Z)V
    //   136: aload_0
    //   137: getfield Zy : Lburp/Ztln;
    //   140: iconst_1
    //   141: invokevirtual setEnabled : (Z)V
    //   144: aload_0
    //   145: getfield ZW : Lburp/Zgff;
    //   148: iconst_1
    //   149: invokevirtual setEnabled : (Z)V
    //   152: aload_0
    //   153: getfield ZE : Lburp/Zgff;
    //   156: iconst_1
    //   157: invokevirtual setEnabled : (Z)V
    //   160: aload_0
    //   161: getfield Zt : Lburp/Ze01;
    //   164: iconst_1
    //   165: invokevirtual setEnabled : (Z)V
    //   168: return
  }
  
  private void ZJ(WindowEvent paramWindowEvent) {
    setVisible(false);
    dispose();
    ZP();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\fwIì3&kÍ%x=Ð&Ü"D{³»|\\t¾j¸%:î0Ý[èÚ5\\nyâ8ø=r}+GN¦­ C ÿ«|aó(dÆzÛyç¼W¼\\t\\fv`$îËì\\tEÏá/Àr©DÝî(Íç EFöu $©8Ê(®/5_¥MßqVqîÀçWÌZ÷~UÖ\\r\\r{ÐÙ@ pv¿w]|+i)·kì°¿ä?#c0ì®Ñ©ù3ì\\t`¤'bßÀr\\r\\nÞÏ\\nÃ{1\ùmCò~8\iû-Ìþ2£È¥\\râ~Q¹BjÊr}£é3ñ£x$ :¤î«ôâ6\\n`ðÝ0¹Æ0ú¶ìê¡³\\ffÂÒ\\tTËØgþw{ßÿl{õ5ÂÑe;rgPÞª¼øõ¹`¿ÌÈÀkÂ®~{.\\tV1(?¼µÉíÁÜé]ÓtwÜ}'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #55
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'x Tø¦Ä³Rg\\beÀ\\rÿí'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #95
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
    //   128: putstatic burp/Zr7p.a : [Ljava/lang/String;
    //   131: bipush #23
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr7p.b : [Ljava/lang/String;
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
    //   212: bipush #76
    //   214: goto -> 244
    //   217: bipush #92
    //   219: goto -> 244
    //   222: bipush #35
    //   224: goto -> 244
    //   227: bipush #122
    //   229: goto -> 244
    //   232: bipush #58
    //   234: goto -> 244
    //   237: bipush #119
    //   239: goto -> 244
    //   242: bipush #50
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC63D) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */