package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbc5 extends Zbqc implements Zg5o, Zkgx {
  private static final Zrqt ZQ;
  
  private final SimpleAttributeSet ZO;
  
  private Zr6h ZF;
  
  private Zm99 Zu;
  
  private Zbqc Zl;
  
  private Zx0x Zo;
  
  private Zm99 Zj;
  
  private Zx0x ZR;
  
  private Zm2o Zk;
  
  private JSeparator Zy;
  
  private Zbqc ZN;
  
  private Zx0x ZM;
  
  private Zx0x Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbc5() {
    this((String)null);
  }
  
  public Zbc5(String paramString) {
    Z_();
    this.ZO = new SimpleAttributeSet();
    StyleConstants.setFontFamily(this.ZO, Zt00.MONOSPACED_FONT.ZV().getFamily());
    SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
    StyleConstants.setItalic(simpleAttributeSet, true);
    try {
      Document document = this.ZR.getDocument();
      document.insertString(0, a(-17439, 10474), null);
      document.insertString(document.getLength(), a(-17413, 26122), simpleAttributeSet);
      document.insertString(document.getLength(), a(-17421, -26513), null);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    try {
      this.Zj.Ze(Zlkk.BURP_TITLE);
      this.Zj.ZE(Zt00.TITLE_BOLD_FONT);
      this.Zt.ZN(Zt00.BOLD_FONT);
      this.Zu.ZE(Zt00.BOLD_FONT);
      this.Zk.Zi(Zk97.DESKTOP_TOOLS_REPEATER_KETTLE_INFORMATION);
      setVisible(false);
      setFocusable(false);
      this.ZR.setCaret(ZQ);
      this.Zt.setCaret(ZQ);
      this.ZM.setCaret(ZQ);
      this.Zo.setCaret(ZQ);
      this.Zo.setText(paramString);
      this.Zl.setBorder(new Zr6s(new Insets(0, 0, 0, 0)));
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    this.Zl.setVisible((paramString != null));
    this.ZM.setName(a(-17422, 17019));
  }
  
  public void Zs(Zr6q paramZr6q) {
    this.ZF = null;
    SwingUtilities.invokeLater(this::lambda$visit$0);
  }
  
  public void ZS(Zr6h paramZr6h) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual ZH : ()Z
    //   5: ifeq -> 12
    //   8: aload_1
    //   9: goto -> 13
    //   12: aconst_null
    //   13: putfield ZF : Lburp/Zr6h;
    //   16: aload_0
    //   17: aload_1
    //   18: <illegal opcode> run : (Lburp/Zbc5;Lburp/Zr6h;)Ljava/lang/Runnable;
    //   23: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   26: return
  }
  
  private void Zz(Zbzi paramZbzi) throws BadLocationException {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: getstatic burp/Zt03.Zc : [I
    //   7: aload_1
    //   8: getfield ZB : Lburp/Ztey;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 264, 1 -> 60, 2 -> 85, 3 -> 110, 4 -> 135, 5 -> 160, 6 -> 185, 7 -> 210, 8 -> 243
    //   60: aload_0
    //   61: sipush #-17415
    //   64: sipush #-30435
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: aload_1
    //   71: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   74: aload_2
    //   75: ifnull -> 264
    //   78: goto -> 85
    //   81: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   84: athrow
    //   85: aload_0
    //   86: sipush #-17409
    //   89: sipush #28317
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: aload_1
    //   96: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   99: aload_2
    //   100: ifnull -> 264
    //   103: goto -> 110
    //   106: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   109: athrow
    //   110: aload_0
    //   111: sipush #-17423
    //   114: sipush #31248
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: aload_1
    //   121: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   124: aload_2
    //   125: ifnull -> 264
    //   128: goto -> 135
    //   131: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   134: athrow
    //   135: aload_0
    //   136: sipush #-17410
    //   139: sipush #-28172
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: aload_1
    //   146: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   149: aload_2
    //   150: ifnull -> 264
    //   153: goto -> 160
    //   156: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   159: athrow
    //   160: aload_0
    //   161: sipush #-17419
    //   164: sipush #32407
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: aload_1
    //   171: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   174: aload_2
    //   175: ifnull -> 264
    //   178: goto -> 185
    //   181: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   184: athrow
    //   185: aload_0
    //   186: sipush #-17424
    //   189: sipush #-18006
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: aload_1
    //   196: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   199: aload_2
    //   200: ifnull -> 264
    //   203: goto -> 210
    //   206: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   209: athrow
    //   210: aload_0
    //   211: sipush #-17414
    //   214: sipush #-14052
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: sipush #-17417
    //   223: sipush #30103
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: invokevirtual ZC : (Ljava/lang/String;Ljava/lang/String;)V
    //   232: aload_2
    //   233: ifnull -> 264
    //   236: goto -> 243
    //   239: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   242: athrow
    //   243: aload_0
    //   244: sipush #-17416
    //   247: sipush #-17138
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: aload_1
    //   254: invokevirtual Zn : (Ljava/lang/String;Lburp/Zbzi;)V
    //   257: goto -> 264
    //   260: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   263: athrow
    //   264: return
    // Exception table:
    //   from	to	target	type
    //   4	78	81	javax/swing/text/BadLocationException
    //   60	103	106	javax/swing/text/BadLocationException
    //   85	128	131	javax/swing/text/BadLocationException
    //   110	153	156	javax/swing/text/BadLocationException
    //   135	178	181	javax/swing/text/BadLocationException
    //   160	203	206	javax/swing/text/BadLocationException
    //   185	236	239	javax/swing/text/BadLocationException
    //   210	257	260	javax/swing/text/BadLocationException
  }
  
  private void Zn(String paramString, Zbzi paramZbzi) {
    int[] arrayOfInt = Zbdf.ZM();
    for (String str : paramZbzi.ZT) {
      ZC(paramString, str);
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private void ZC(String paramString1, String paramString2) {
    Document document = this.ZM.getDocument();
    try {
      try {
        if (document.getLength() > 0)
          document.insertString(document.getLength(), "\n", null); 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      document.insertString(document.getLength(), paramString1, null);
      document.insertString(document.getLength(), paramString2, this.ZO);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZF != null)
      ZS(this.ZF); 
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Zr6h;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual isVisible : ()Z
    //   9: istore_2
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: <illegal opcode> Zg : (Lburp/Zbc5;Lburp/Zr6h;Z)Lburp/Ztcw;
    //   18: areturn
  }
  
  public void ZU() {
    this.ZF = null;
    setVisible(false);
  }
  
  private void Z_() {
    this.Zk = new Zm2o();
    this.ZR = new Zx0x();
    this.Zt = new Zx0x();
    this.ZN = new Zbqc();
    this.ZM = new Zx0x();
    this.Zl = new Zbqc();
    this.Zu = new Zm99();
    this.Zo = new Zx0x();
    this.Zy = new JSeparator();
    this.Zj = new Zm99();
    setBorder(BorderFactory.createEmptyBorder(6, 0, 0, 0));
    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    add(this.Zk, gridBagConstraints);
    this.ZR.setEditable(false);
    this.ZR.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
    this.ZR.setOpaque(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    add(this.ZR, gridBagConstraints);
    this.Zt.setEditable(false);
    this.Zt.setBorder((Border)null);
    this.Zt.setText(a(-17412, -8201));
    this.Zt.setOpaque(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 10, 0, 0);
    add(this.Zt, gridBagConstraints);
    this.ZN.Zl(Zlkk.PANEL_BACKGROUND);
    this.ZN.setLayout(new BorderLayout());
    this.ZM.setEditable(false);
    this.ZM.setOpaque(false);
    this.ZN.add(this.ZM, a(-17420, -12421));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 17;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    add(this.ZN, gridBagConstraints);
    this.Zl.Zl(Zlkk.PROXY_KETTLING_SUPPORT_PANEL_BACKGROUND);
    this.Zl.setLayout(new GridBagLayout());
    this.Zu.setIcon(Zbz3.ZK(Zxpj.PANEL_INFO_SMALL));
    this.Zu.setText(a(-17411, -30907));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 10, 0, 10);
    this.Zl.add(this.Zu, gridBagConstraints);
    this.Zo.setEditable(false);
    this.Zo.Zx(Zlkk.PROXY_KETTLING_SUPPORT_PANEL_BACKGROUND);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    this.Zl.add(this.Zo, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    add(this.Zl, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zy, gridBagConstraints);
    this.Zj.setText(a(-17418, -23848));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = new Insets(5, 10, 5, 0);
    add(this.Zj, gridBagConstraints);
  }
  
  private void lambda$checkpoint$2(Zr6h paramZr6h, boolean paramBoolean) {
    this.ZF = paramZr6h;
    if (paramZr6h != null)
      ZS(paramZr6h); 
    setVisible(paramBoolean);
  }
  
  private void lambda$visit$1(Zr6h paramZr6h) {
    StyleConstants.setBackground(this.ZO, Zlkk.TASK_LIST_HEADER_BACKGROUND.ZS());
    this.ZM.setText("");
    Iterator<Zbzi> iterator = paramZr6h.Zk().iterator();
    int[] arrayOfInt = Zbdf.ZM();
    while (iterator.hasNext()) {
      Zbzi zbzi = iterator.next();
      try {
        Zz(zbzi);
      } catch (BadLocationException badLocationException) {
        Zah.Zl(badLocationException, Zk_.IGNORED);
      } 
      if (arrayOfInt != null)
        break; 
    } 
    setVisible(paramZr6h.ZH());
  }
  
  private void lambda$visit$0() {
    setVisible(false);
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '⃓­ªKÉ[¸q !QäbÀ9I¯ ò¡é#5÷Óñ|2è\\fv¨J\\t;03\\n1¼Ñ'Sì÷åÛY*⃺ù  ïÌ]q*4rªg±M=ÖáJÊHO²+si·4Óf\\fÐNoî&æ§S4n¬LõÀ@`MºA)+d×KcógxÕ X¨' á\\b#ê Ly§áÂ­û&A´û°ÏªÁï¬÷qè¢»[bÕ-Åæ#Î®5´¿áhé±B$5VtËfh^½>P©É Q7G4þvJõnçÐ%h;óRtn´A_ç«×Øët²ÔÖþfîã¬tò\\rÈ¯6§-⁍DÖ1:¯QïÑxºW¿I(×®:üÃ4jÎt$y5,\\b½¼¶çX«ë}9%èmNó¦ÞRù>⃴PáÛkôÈ¹ä\Ufû2ÀÄC¦GJ¯=ßµúÏåêAõ³5èøAðMé*IçªÿGüu<f©o";⃔såqWæJ4È.¿Åvé#ÍÛÃó`è=Å5\\bÛyã\\nFÍ\\n2Tq\\r½>UH?p¯ªR¢uºh/ₕ2ÍY^â£Åî{ ÍuP+OR2lP\\tí©²µ^óöÞdô(+è½HS¾Ôc\\n \\bûK`$µÁØÕù%á¨.7§|+W¼ûÛ.d6ø4⁼½ð¨ùÜW¨?~.Ñ\\tsß¾'wµ.[t8FÛh)8\\f\\bCãòp@âíøô\\t'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #63
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #101
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
    //   68: ldc '⁪XÅÁHNOx¬Ð\\n¦1'\\n$gô ¤)¸g(¸zléÁ)¨\\nK¡¿*!ô1¹õÀ£ó¹þ^'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #44
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #110
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
    //   129: putstatic burp/Zbc5.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbc5.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #23
    //   214: goto -> 243
    //   217: iconst_5
    //   218: goto -> 243
    //   221: bipush #102
    //   223: goto -> 243
    //   226: bipush #58
    //   228: goto -> 243
    //   231: bipush #85
    //   233: goto -> 243
    //   236: bipush #81
    //   238: goto -> 243
    //   241: bipush #111
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Zrqt
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zbc5.ZQ : Lburp/Zrqt;
    //   310: return
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBBF1) & 0xFFFF;
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
      byte b1 = 7;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbc5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */