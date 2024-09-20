package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrhy extends Zrh7 {
  private final Zg7s ZX;
  
  private final Zbnt ZF;
  
  private final Zzmm Zc;
  
  private Zm99 Zl;
  
  private Zzdy Zo;
  
  private Zzdy ZO;
  
  private Ze01 Zf;
  
  private Ze01 Zr;
  
  private Zl8w ZP;
  
  private Zm9v ZK;
  
  private Zgff Zz;
  
  private Zgff ZE;
  
  private Zgff Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrhy(Zg7s paramZg7s, Zmzk paramZmzk, Zbnt paramZbnt, Zzmm paramZzmm) {
    this(paramZg7s, paramZmzk, (String)null, paramZbnt, paramZzmm);
  }
  
  public Zrhy(Zg7s paramZg7s, Zmzk paramZmzk, String paramString, Zbnt paramZbnt, Zzmm paramZzmm) {
    this(paramZg7s, (paramZmzk == null) ? null : paramZmzk.ZJ1(), (paramZmzk == null) ? 0 : paramZmzk.ZJO(), (paramZmzk != null && paramZmzk.ZJZ()), paramString, paramZbnt, paramZzmm);
  }
  
  public Zrhy(Zg7s paramZg7s, String paramString1, int paramInt, boolean paramBoolean, String paramString2, Zbnt paramZbnt, Zzmm paramZzmm) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokeinterface ZM : ()Ljava/awt/Component;
    //   7: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   10: iconst_1
    //   11: getstatic burp/Zzv7.TARGET_POPUP_PANEL : Lburp/Zzv7;
    //   14: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   17: aload_0
    //   18: aload_1
    //   19: putfield ZX : Lburp/Zg7s;
    //   22: aload_0
    //   23: aload #6
    //   25: putfield ZF : Lburp/Zbnt;
    //   28: aload_0
    //   29: aload #7
    //   31: putfield Zc : Lburp/Zzmm;
    //   34: aload_0
    //   35: invokevirtual ZI : ()V
    //   38: invokestatic ZvS : ()[Ljava/lang/String;
    //   41: aload_0
    //   42: invokevirtual Zx : ()V
    //   45: astore #8
    //   47: aload_0
    //   48: sipush #-21539
    //   51: sipush #11821
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: invokevirtual setTitle : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield Zz : Lburp/Zgff;
    //   64: aload_2
    //   65: ifnonnull -> 77
    //   68: ldc ''
    //   70: goto -> 78
    //   73: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   76: athrow
    //   77: aload_2
    //   78: invokevirtual setText : (Ljava/lang/String;)V
    //   81: aload_0
    //   82: getfield ZE : Lburp/Zgff;
    //   85: iload_3
    //   86: ifne -> 98
    //   89: ldc ''
    //   91: goto -> 102
    //   94: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   97: athrow
    //   98: iload_3
    //   99: invokestatic toString : (I)Ljava/lang/String;
    //   102: invokevirtual setText : (Ljava/lang/String;)V
    //   105: aload_0
    //   106: getfield Zo : Lburp/Zzdy;
    //   109: iload #4
    //   111: invokevirtual setSelected : (Z)V
    //   114: aload_1
    //   115: invokeinterface Zq : ()Z
    //   120: ifeq -> 198
    //   123: aload #5
    //   125: ifnonnull -> 169
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   134: athrow
    //   135: aload_0
    //   136: getfield ZO : Lburp/Zzdy;
    //   139: iconst_0
    //   140: invokevirtual setSelected : (Z)V
    //   143: aload_0
    //   144: getfield Zn : Lburp/Zgff;
    //   147: ldc ''
    //   149: invokevirtual setText : (Ljava/lang/String;)V
    //   152: aload_0
    //   153: iconst_0
    //   154: invokevirtual Zx : (Z)V
    //   157: aload #8
    //   159: ifnonnull -> 218
    //   162: goto -> 169
    //   165: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   168: athrow
    //   169: aload_0
    //   170: getfield ZO : Lburp/Zzdy;
    //   173: iconst_1
    //   174: invokevirtual setSelected : (Z)V
    //   177: aload_0
    //   178: getfield Zn : Lburp/Zgff;
    //   181: aload #5
    //   183: invokevirtual setText : (Ljava/lang/String;)V
    //   186: aload #8
    //   188: ifnonnull -> 218
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   197: athrow
    //   198: aload_0
    //   199: getfield ZO : Lburp/Zzdy;
    //   202: iconst_0
    //   203: invokevirtual setVisible : (Z)V
    //   206: aload_0
    //   207: iconst_0
    //   208: invokevirtual Zx : (Z)V
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   217: athrow
    //   218: aload_0
    //   219: new burp/Ztkb
    //   222: dup
    //   223: aload_0
    //   224: invokespecial <init> : (Lburp/Zrhy;)V
    //   227: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   230: aload_0
    //   231: invokevirtual pack : ()V
    //   234: aload_0
    //   235: aload_1
    //   236: invokeinterface ZM : ()Ljava/awt/Component;
    //   241: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   244: invokevirtual Zq : (Ljava/awt/Window;)V
    //   247: return
    // Exception table:
    //   from	to	target	type
    //   47	73	73	java/lang/NumberFormatException
    //   78	94	94	java/lang/NumberFormatException
    //   102	128	131	java/lang/NumberFormatException
    //   123	162	165	java/lang/NumberFormatException
    //   135	191	194	java/lang/NumberFormatException
    //   169	211	214	java/lang/NumberFormatException
  }
  
  private void Zx(boolean paramBoolean) {
    this.Zl.setVisible(paramBoolean);
    this.Zn.setVisible(paramBoolean);
  }
  
  private void Zx() {
    setName(this.Zc.Ze);
    this.ZE.setName(this.Zc.Zk);
    this.Zz.setName(this.Zc.Zj);
    this.Zn.setName(this.Zc.ZH);
    this.Zo.setName(this.Zc.ZB);
    this.ZO.setName(this.Zc.ZG);
    this.Zf.setName(this.Zc.ZY);
    this.ZK.setName(this.Zc.ZI);
  }
  
  private void ZI() {
    setDefaultCloseOperation(0);
    Zbqc zbqc1 = new Zbqc();
    zbqc1.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    try {
      gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
      (new int[15])[0] = 0;
      (new int[15])[1] = 5;
      (new int[15])[2] = 0;
      (new int[15])[3] = 5;
      (new int[15])[4] = 0;
      (new int[15])[5] = 5;
      (new int[15])[6] = 0;
      (new int[15])[7] = 5;
      (new int[15])[8] = 0;
      (new int[15])[9] = 5;
      (new int[15])[10] = 0;
      (new int[15])[11] = 5;
      (new int[15])[12] = 0;
      (new int[15])[13] = 5;
      (new int[15])[14] = 0;
      (new int[15])[0] = 0;
      (new int[15])[1] = 5;
      (new int[15])[2] = 0;
      (new int[15])[3] = 5;
      (new int[15])[4] = 0;
      (new int[15])[5] = 0;
      (new int[15])[6] = 0;
      (new int[15])[7] = 0;
      (new int[15])[8] = 0;
      (new int[15])[9] = 5;
      (new int[15])[10] = 0;
      (new int[15])[11] = 5;
      (new int[15])[12] = 0;
      (new int[15])[13] = 5;
      (new int[15])[14] = 0;
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    gridBagLayout.rowHeights = this.ZX.Zq() ? new int[15] : new int[15];
    zbqc1.setLayout(gridBagLayout);
    this.ZP = new Zl8w();
    this.ZP.setText(a(-21537, -20645));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    zbqc1.add(this.ZP, gridBagConstraints);
    Zm99 zm991 = new Zm99();
    zm991.setText(a(-21542, -16288));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    zbqc1.add(zm991, gridBagConstraints);
    this.Zz = new Zgff();
    this.Zz.setColumns(20);
    this.Zz.ZH(Zlw9.HOST);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    zbqc1.add(this.Zz, gridBagConstraints);
    this.ZO = new Zzdy();
    this.ZO.setText(a(-21550, -11595));
    this.ZO.addActionListener(new Zt36(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 512;
    zbqc1.add(this.ZO, gridBagConstraints);
    this.Zl = new Zm99();
    this.Zl.setText(a(-21538, -20448));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    zbqc1.add(this.Zl, gridBagConstraints);
    this.Zn = new Zgff();
    this.Zn.setColumns(20);
    this.Zn.ZH(Zlw9.SNI);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    zbqc1.add(this.Zn, gridBagConstraints);
    Zm99 zm992 = new Zm99();
    zm992.setText(a(-21545, -4981));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    zbqc1.add(zm992, gridBagConstraints);
    this.ZE = new Zgff();
    this.ZE.ZH(Zlw9.PORT);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    zbqc1.add(this.ZE, gridBagConstraints);
    this.Zo = new Zzdy();
    this.Zo.setText(a(-21547, -17232));
    this.Zo.addActionListener(new Zzt1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 512;
    zbqc1.add(this.Zo, gridBagConstraints);
    this.ZK = new Zm9v();
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    zbqc1.add(this.ZK, gridBagConstraints);
    Zm99 zm993 = new Zm99();
    zm993.setText(a(-21549, -8477));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 22;
    zbqc1.add(zm993, gridBagConstraints);
    Zbqc zbqc2 = new Zbqc();
    zbqc2.setLayout(new GridLayout(1, 2, 5, 0));
    this.Zf = new Ze01();
    this.Zf.setText(a(-21540, 1529));
    this.Zf.addActionListener(new Zxas(this));
    zbqc2.add(this.Zf);
    this.Zr = new Ze01();
    this.Zr.setText(a(-21544, -24776));
    this.Zr.addActionListener(new Zrph(this));
    zbqc2.add(this.Zr);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 14;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    zbqc1.add(zbqc2, gridBagConstraints);
    getContentPane().add(zbqc1, a(-21541, 23159));
    pack();
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    Zmzk zmzk;
    try {
      int i;
      try {
        i = Integer.parseInt(this.ZE.getText().trim());
      } catch (NumberFormatException numberFormatException) {
        Zah.Zl(numberFormatException, Zk_.USER_ERROR);
        throw new Zxg5(this.ZE.getText().trim());
      } 
      zmzk = this.ZF.ZY(this.Zz.getText().trim(), i, this.Zo.isSelected());
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZK.setText(exception.getMessage());
      return;
    } 
    try {
      if (this.ZX.Zq()) {
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        String str = this.ZO.isSelected() ? this.Zn.getText() : null;
        try {
          if (this.ZO.isSelected())
            try {
              if (!Ztq_.ZJ(str)) {
                this.ZK.setText(a(-21551, -28094));
                return;
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        this.ZX.Zg(str);
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    setVisible(false);
    dispose();
    this.ZX.Zk(zmzk);
  }
  
  private void Zm(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZvS : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zo : Lburp/Zzdy;
    //   8: invokevirtual isSelected : ()Z
    //   11: ifeq -> 66
    //   14: aload_0
    //   15: getfield ZE : Lburp/Zgff;
    //   18: invokevirtual getText : ()Ljava/lang/String;
    //   21: sipush #-21552
    //   24: sipush #-18252
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: ifeq -> 66
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   42: athrow
    //   43: aload_0
    //   44: getfield ZE : Lburp/Zgff;
    //   47: sipush #-21546
    //   50: sipush #-29352
    //   53: invokestatic a : (II)Ljava/lang/String;
    //   56: invokevirtual setText : (Ljava/lang/String;)V
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   65: athrow
    //   66: aload_0
    //   67: getfield Zo : Lburp/Zzdy;
    //   70: invokevirtual isSelected : ()Z
    //   73: ifne -> 128
    //   76: aload_0
    //   77: getfield ZE : Lburp/Zgff;
    //   80: invokevirtual getText : ()Ljava/lang/String;
    //   83: sipush #-21548
    //   86: sipush #-20976
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokevirtual equals : (Ljava/lang/Object;)Z
    //   95: ifeq -> 128
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   104: athrow
    //   105: aload_0
    //   106: getfield ZE : Lburp/Zgff;
    //   109: sipush #-21543
    //   112: sipush #21574
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: invokevirtual setText : (Ljava/lang/String;)V
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   127: athrow
    //   128: aload_0
    //   129: getfield Zo : Lburp/Zzdy;
    //   132: invokevirtual isSelected : ()Z
    //   135: ifeq -> 160
    //   138: aload_0
    //   139: aload_0
    //   140: getfield ZO : Lburp/Zzdy;
    //   143: invokevirtual isSelected : ()Z
    //   146: invokevirtual Zx : (Z)V
    //   149: aload_2
    //   150: ifnonnull -> 175
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   159: athrow
    //   160: aload_0
    //   161: getfield ZO : Lburp/Zzdy;
    //   164: iconst_0
    //   165: invokevirtual setSelected : (Z)V
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   174: athrow
    //   175: aload_0
    //   176: getfield ZO : Lburp/Zzdy;
    //   179: aload_0
    //   180: getfield Zo : Lburp/Zzdy;
    //   183: invokevirtual isSelected : ()Z
    //   186: invokevirtual setEnabled : (Z)V
    //   189: return
    // Exception table:
    //   from	to	target	type
    //   4	36	39	java/lang/NumberFormatException
    //   14	59	62	java/lang/NumberFormatException
    //   66	98	101	java/lang/NumberFormatException
    //   76	121	124	java/lang/NumberFormatException
    //   128	153	156	java/lang/NumberFormatException
    //   138	168	171	java/lang/NumberFormatException
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    boolean bool = this.ZO.isSelected();
    try {
      Zx(bool);
      if (bool)
        try {
          if (this.Zn.getText().isEmpty())
            this.Zn.setText(this.Zz.getText()); 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    pack();
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'h61[rPMM©I50\\fiVÃp+ì>ÂpB7\\t2ñ-ö¥.@ß®¨g£zãÛÂn¥;Àb$KÁe'*ÂÎ0Md¥y.×\\nÙ)ÿË÷³[ÀqË'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #81
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
    //   68: ldc 'gDÆ&[gÊé¡Ljt^ß¹OLxû]µÅrf¤ºÈ¨ç$rôYÕ§YGÀw«äZìnß;vb¥Ý­16¹÷-t'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #68
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #114
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
    //   129: putstatic burp/Zrhy.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrhy.b : [Ljava/lang/String;
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
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #74
    //   219: goto -> 244
    //   222: bipush #123
    //   224: goto -> 244
    //   227: bipush #66
    //   229: goto -> 244
    //   232: bipush #93
    //   234: goto -> 244
    //   237: bipush #67
    //   239: goto -> 244
    //   242: bipush #53
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
    int i = (paramInt1 ^ 0xFFFFABD1) & 0xFFFF;
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
      char c = 'à';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */