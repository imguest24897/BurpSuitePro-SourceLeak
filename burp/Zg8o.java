package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zg8o extends Zbqc {
  private final String Zj;
  
  private final Zzqi ZF;
  
  private final Consumer<Zzqi> ZV;
  
  private Zm2o ZB;
  
  private ButtonGroup Zu;
  
  private Zedd Zd;
  
  private Zl8w Zy;
  
  private Zm99 Zb;
  
  private Zm99 Zf;
  
  private Zbqc ZS;
  
  private Zbqc ZT;
  
  private Zbqc ZN;
  
  private Zm9v ZH;
  
  private Zmg2 ZJ;
  
  private Zmg2 Zn;
  
  private Zmg2 ZA;
  
  private Zgff ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zg8o(String paramString, Zzqi paramZzqi, Consumer<Zzqi> paramConsumer, Zk97 paramZk97) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zb : ()Ljava/lang/String;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zj : Ljava/lang/String;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield ZF : Lburp/Zzqi;
    //   17: aload_0
    //   18: aload_3
    //   19: putfield ZV : Ljava/util/function/Consumer;
    //   22: astore #5
    //   24: aload_0
    //   25: invokevirtual Zt : ()V
    //   28: aload_0
    //   29: getfield ZH : Lburp/Zm9v;
    //   32: iconst_0
    //   33: invokevirtual setVisible : (Z)V
    //   36: aload_0
    //   37: getfield ZB : Lburp/Zm2o;
    //   40: aload #4
    //   42: invokevirtual Zi : (Lburp/Zk97;)V
    //   45: invokestatic Zc : ()Ljava/util/Set;
    //   48: astore #6
    //   50: aload #6
    //   52: invokeinterface iterator : ()Ljava/util/Iterator;
    //   57: astore #7
    //   59: aload #7
    //   61: invokeinterface hasNext : ()Z
    //   66: ifeq -> 105
    //   69: aload #7
    //   71: invokeinterface next : ()Ljava/lang/Object;
    //   76: checkcast java/lang/String
    //   79: astore #8
    //   81: aload #8
    //   83: ldc ':'
    //   85: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   88: ifne -> 100
    //   91: aload_0
    //   92: getfield Zd : Lburp/Zedd;
    //   95: aload #8
    //   97: invokevirtual addItem : (Ljava/lang/Object;)V
    //   100: aload #5
    //   102: ifnonnull -> 59
    //   105: aload #6
    //   107: invokeinterface iterator : ()Ljava/util/Iterator;
    //   112: astore #7
    //   114: aload #7
    //   116: invokeinterface hasNext : ()Z
    //   121: ifeq -> 160
    //   124: aload #7
    //   126: invokeinterface next : ()Ljava/lang/Object;
    //   131: checkcast java/lang/String
    //   134: astore #8
    //   136: aload #8
    //   138: ldc ':'
    //   140: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   143: ifeq -> 155
    //   146: aload_0
    //   147: getfield Zd : Lburp/Zedd;
    //   150: aload #8
    //   152: invokevirtual addItem : (Ljava/lang/Object;)V
    //   155: aload #5
    //   157: ifnonnull -> 114
    //   160: aload_2
    //   161: getfield ZQ : I
    //   164: istore #7
    //   166: aload_0
    //   167: getfield ZD : Lburp/Zgff;
    //   170: iload #7
    //   172: ifne -> 180
    //   175: ldc ''
    //   177: goto -> 185
    //   180: iload #7
    //   182: invokestatic toString : (I)Ljava/lang/String;
    //   185: invokevirtual setText : (Ljava/lang/String;)V
    //   188: getstatic burp/Zrq6.ZA : [I
    //   191: aload_2
    //   192: getfield Zj : Lburp/Zs8b;
    //   195: invokevirtual ordinal : ()I
    //   198: iaload
    //   199: tableswitch default -> 298, 1 -> 224, 2 -> 237, 3 -> 250
    //   224: aload_0
    //   225: getfield ZJ : Lburp/Zmg2;
    //   228: iconst_1
    //   229: invokevirtual setSelected : (Z)V
    //   232: aload #5
    //   234: ifnonnull -> 298
    //   237: aload_0
    //   238: getfield Zn : Lburp/Zmg2;
    //   241: iconst_1
    //   242: invokevirtual setSelected : (Z)V
    //   245: aload #5
    //   247: ifnonnull -> 298
    //   250: aload_2
    //   251: getfield Zf : Ljava/lang/String;
    //   254: astore #8
    //   256: aload #6
    //   258: aload #8
    //   260: invokeinterface contains : (Ljava/lang/Object;)Z
    //   265: ifeq -> 290
    //   268: aload_0
    //   269: getfield Zd : Lburp/Zedd;
    //   272: aload #8
    //   274: invokevirtual setSelectedItem : (Ljava/lang/Object;)V
    //   277: aload_0
    //   278: getfield ZA : Lburp/Zmg2;
    //   281: iconst_1
    //   282: invokevirtual setSelected : (Z)V
    //   285: aload #5
    //   287: ifnonnull -> 298
    //   290: aload_0
    //   291: getfield Zn : Lburp/Zmg2;
    //   294: iconst_1
    //   295: invokevirtual setSelected : (Z)V
    //   298: return
  }
  
  private void Zt() {
    this.Zu = new ButtonGroup();
    this.ZS = new Zbqc();
    this.Zb = new Zm99();
    this.Zf = new Zm99();
    this.ZJ = new Zmg2();
    this.Zn = new Zmg2();
    this.Zy = new Zl8w();
    this.ZT = new Zbqc();
    this.ZH = new Zm9v();
    this.ZD = new Zgff();
    this.ZN = new Zbqc();
    this.ZA = new Zmg2();
    this.Zd = new Zedd();
    this.ZB = new Zm2o();
    this.ZS.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.ZS.setLayout(gridBagLayout);
    this.Zb.setText(a(17614, 12262));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZS.add(this.Zb, gridBagConstraints);
    this.Zf.setText(a(17606, 3341));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    this.ZS.add(this.Zf, gridBagConstraints);
    this.Zu.add(this.ZJ);
    this.ZJ.setText(a(17610, -23226));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZS.add(this.ZJ, gridBagConstraints);
    this.Zu.add(this.Zn);
    this.Zn.setText(a(17605, -26003));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZS.add(this.Zn, gridBagConstraints);
    this.Zy.setText(a(17615, -9695) + a(17615, -9695));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.ZS.add(this.Zy, gridBagConstraints);
    this.ZT.setLayout(new GridBagLayout());
    this.ZH.setText(a(17612, 12694));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.ZT.add(this.ZH, gridBagConstraints);
    this.ZD.setColumns(5);
    this.ZD.ZH(Zlw9.PORT);
    this.ZD.addActionListener(new Zmrd(this));
    this.ZD.addKeyListener(new Ztld(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZD, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    this.ZS.add(this.ZT, gridBagConstraints);
    this.ZN.setLayout(new GridBagLayout());
    this.Zu.add(this.ZA);
    this.ZA.setText(a(17609, 16180));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    this.ZN.add(this.ZA, gridBagConstraints);
    this.Zd.addActionListener(new Zm1c(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    this.ZN.add(this.Zd, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    this.ZS.add(this.ZN, gridBagConstraints);
    this.ZB.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_BINDING);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZS.add(this.ZB, gridBagConstraints);
    GroupLayout groupLayout = new GroupLayout(this);
    setLayout(groupLayout);
    groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(this.ZS, -2, 911, -2).addGap(0, 12, 32767)));
    groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.ZS, -2, 442, -2)));
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    this.ZD.focusLost((FocusEvent)null);
    Zg();
    this.ZD.focusGained((FocusEvent)null);
  }
  
  private void Zf(KeyEvent paramKeyEvent) {
    String str = this.ZD.getText();
    try {
      if (str.isEmpty()) {
        this.ZH.setVisible(false);
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
      this.ZH.setVisible(false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZH.setVisible(true);
    } 
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    this.ZA.setSelected(true);
  }
  
  private Zzqi Zg() {
    // Byte code:
    //   0: invokestatic Zb : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield ZF : Lburp/Zzqi;
    //   8: getfield Zj : Lburp/Zs8b;
    //   11: getstatic burp/Zs8b.ALL_INTERFACES : Lburp/Zs8b;
    //   14: if_acmpeq -> 102
    //   17: aload_0
    //   18: getfield ZJ : Lburp/Zmg2;
    //   21: invokevirtual isSelected : ()Z
    //   24: ifeq -> 102
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: iconst_0
    //   35: aload_0
    //   36: sipush #17613
    //   39: sipush #217
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: sipush #17607
    //   48: sipush #8508
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: iconst_2
    //   55: anewarray java/lang/String
    //   58: dup
    //   59: iconst_0
    //   60: sipush #17611
    //   63: sipush #23757
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: sipush #17608
    //   75: sipush #22756
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: aastore
    //   82: iconst_1
    //   83: invokestatic Zc : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;I)I
    //   86: if_icmpeq -> 102
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aconst_null
    //   97: areturn
    //   98: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   101: athrow
    //   102: aload_0
    //   103: getfield ZD : Lburp/Zgff;
    //   106: invokevirtual getText : ()Ljava/lang/String;
    //   109: invokestatic parseInt : (Ljava/lang/String;)I
    //   112: istore_2
    //   113: iload_2
    //   114: invokestatic ZO : (I)Z
    //   117: ifne -> 132
    //   120: new java/lang/Exception
    //   123: dup
    //   124: invokespecial <init> : ()V
    //   127: athrow
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: goto -> 153
    //   135: astore_3
    //   136: aload_3
    //   137: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   140: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   143: aload_0
    //   144: getfield ZH : Lburp/Zm9v;
    //   147: iconst_1
    //   148: invokevirtual setVisible : (Z)V
    //   151: aconst_null
    //   152: areturn
    //   153: getstatic burp/Zs8b.LOOPBACK_ONLY : Lburp/Zs8b;
    //   156: astore_3
    //   157: aconst_null
    //   158: astore #4
    //   160: aload_0
    //   161: getfield ZJ : Lburp/Zmg2;
    //   164: invokevirtual isSelected : ()Z
    //   167: ifeq -> 178
    //   170: getstatic burp/Zs8b.ALL_INTERFACES : Lburp/Zs8b;
    //   173: astore_3
    //   174: aload_1
    //   175: ifnonnull -> 236
    //   178: aload_0
    //   179: getfield Zn : Lburp/Zmg2;
    //   182: invokevirtual isSelected : ()Z
    //   185: ifeq -> 203
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   194: athrow
    //   195: getstatic burp/Zs8b.LOOPBACK_ONLY : Lburp/Zs8b;
    //   198: astore_3
    //   199: aload_1
    //   200: ifnonnull -> 236
    //   203: aload_0
    //   204: getfield ZA : Lburp/Zmg2;
    //   207: invokevirtual isSelected : ()Z
    //   210: ifeq -> 236
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: getstatic burp/Zs8b.SPECIFIC_ADDRESS : Lburp/Zs8b;
    //   223: astore_3
    //   224: aload_0
    //   225: getfield Zd : Lburp/Zedd;
    //   228: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   231: checkcast java/lang/String
    //   234: astore #4
    //   236: new burp/Zzqi
    //   239: dup
    //   240: iload_2
    //   241: aload_3
    //   242: aload #4
    //   244: invokespecial <init> : (ILburp/Zs8b;Ljava/lang/String;)V
    //   247: areturn
    // Exception table:
    //   from	to	target	type
    //   4	27	30	java/lang/Exception
    //   17	89	92	java/lang/Exception
    //   34	98	98	java/lang/Exception
    //   102	132	135	java/lang/Exception
    //   113	128	128	java/lang/Exception
    //   174	188	191	java/lang/Exception
    //   199	213	216	java/lang/Exception
  }
  
  public boolean ZX() {
    Zzqi zzqi = Zg();
    if (zzqi != null) {
      this.ZV.accept(zzqi);
      return true;
    } 
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '§gø¼yºFL¦ÏÃ>Å±JA<h±&+Gß¿Ð%¯D:Ó:¬Á]vÛAª}ÝíV®TnÄ\\r¸?)ºóµ=MÊÛ*Xàà5¢oyì¼Êv´Im«"nk\\núÈSÜkÝÙLÑáå3ä>k~/ë_e_Õ"Oÿ>ø:|Fd«ðÐôïàS6M«Î¶4gÝk@ïæ!®Pì»:ûñÙ,f!%TipA[ÎÛ@Ë>.õû´í,iNýû)äÓwø8ëõÁ¸|'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #42
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
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
    //   68: ldc 'öBÜçë]¶ sù\\rètùøb\\tQÓ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_2
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zg8o.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zg8o.b : [Ljava/lang/String;
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
    //   212: bipush #114
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #120
    //   224: goto -> 244
    //   227: bipush #31
    //   229: goto -> 244
    //   232: bipush #90
    //   234: goto -> 244
    //   237: bipush #90
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x44CF) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */