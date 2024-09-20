package burp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.text.JTextComponent;
import javax.swing.text.View;

public class Zt5q extends DefaultListCellRenderer {
  private static Color ZZ;
  
  private final JTextComponent ZV;
  
  private boolean Zm;
  
  private Font Zk;
  
  private String ZT;
  
  private Color ZU;
  
  private String Zg;
  
  private Rectangle Zr;
  
  private DefaultListCellRenderer ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt5q(JTextComponent paramJTextComponent) {
    this.ZV = paramJTextComponent;
    Zu(true);
    this.ZT = a(-19536, 11838);
    this.Zg = Zy();
    this.Zr = new Rectangle();
  }
  
  private String Zy() {
    return Zly8.Zo(getForeground()) ? Zl6r.ZN(Zly8.ZB()) : a(-19529, -28529);
  }
  
  public Component getListCellRendererComponent(JList paramJList, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: iload #4
    //   6: iload #5
    //   8: invokespecial getListCellRendererComponent : (Ljavax/swing/JList;Ljava/lang/Object;IZZ)Ljava/awt/Component;
    //   11: pop
    //   12: invokestatic ZM : ()[I
    //   15: aload_0
    //   16: sipush #-19543
    //   19: sipush #23076
    //   22: invokestatic a : (II)Ljava/lang/String;
    //   25: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   28: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   31: aload_1
    //   32: sipush #-19522
    //   35: sipush #-13077
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   44: invokevirtual putClientProperty : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   47: astore #6
    //   49: aload_0
    //   50: getfield Zk : Ljava/awt/Font;
    //   53: ifnull -> 64
    //   56: aload_0
    //   57: aload_0
    //   58: getfield Zk : Ljava/awt/Font;
    //   61: invokevirtual setFont : (Ljava/awt/Font;)V
    //   64: aload_0
    //   65: getstatic burp/Zt5q.ZZ : Ljava/awt/Color;
    //   68: ifnull -> 84
    //   71: iload_3
    //   72: iconst_1
    //   73: iand
    //   74: iconst_1
    //   75: if_icmpne -> 84
    //   78: getstatic burp/Zt5q.ZZ : Ljava/awt/Color;
    //   81: goto -> 88
    //   84: aload_1
    //   85: invokevirtual getBackground : ()Ljava/awt/Color;
    //   88: putfield ZU : Ljava/awt/Color;
    //   91: aload_2
    //   92: checkcast burp/Zmy1
    //   95: astore #7
    //   97: aload_0
    //   98: aload #7
    //   100: invokeinterface ZK : ()Ljavax/swing/Icon;
    //   105: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   108: aload #7
    //   110: instanceof burp/Zg7o
    //   113: ifeq -> 136
    //   116: aload #7
    //   118: checkcast burp/Zg7o
    //   121: astore #8
    //   123: aload_0
    //   124: aload #8
    //   126: iload #4
    //   128: invokevirtual ZA : (Lburp/Zg7o;Z)V
    //   131: aload #6
    //   133: ifnonnull -> 310
    //   136: aload #7
    //   138: instanceof burp/Zgh5
    //   141: ifeq -> 164
    //   144: aload #7
    //   146: checkcast burp/Zgh5
    //   149: astore #9
    //   151: aload_0
    //   152: aload #9
    //   154: iload #4
    //   156: invokevirtual ZW : (Lburp/Zgh5;Z)V
    //   159: aload #6
    //   161: ifnonnull -> 310
    //   164: aload #7
    //   166: instanceof burp/Zghy
    //   169: ifeq -> 192
    //   172: aload #7
    //   174: checkcast burp/Zghy
    //   177: astore #10
    //   179: aload_0
    //   180: aload #10
    //   182: iload #4
    //   184: invokevirtual Zu : (Lburp/Zghy;Z)V
    //   187: aload #6
    //   189: ifnonnull -> 310
    //   192: aload #7
    //   194: instanceof burp/Zg7f
    //   197: ifeq -> 220
    //   200: aload #7
    //   202: checkcast burp/Zg7f
    //   205: astore #11
    //   207: aload_0
    //   208: aload #11
    //   210: iload #4
    //   212: invokevirtual ZC : (Lburp/Zg7f;Z)V
    //   215: aload #6
    //   217: ifnonnull -> 310
    //   220: aload #7
    //   222: instanceof burp/Zg78
    //   225: ifeq -> 246
    //   228: aload #7
    //   230: checkcast burp/Zg78
    //   233: astore #12
    //   235: aload_0
    //   236: aload #12
    //   238: invokevirtual ZL : (Lburp/Zg78;)V
    //   241: aload #6
    //   243: ifnonnull -> 310
    //   246: aload #7
    //   248: instanceof burp/Zghr
    //   251: ifeq -> 274
    //   254: aload #7
    //   256: checkcast burp/Zghr
    //   259: astore #13
    //   261: aload_0
    //   262: aload #13
    //   264: iload #4
    //   266: invokevirtual ZC : (Lburp/Zghr;Z)V
    //   269: aload #6
    //   271: ifnonnull -> 310
    //   274: aload #7
    //   276: instanceof burp/Zght
    //   279: ifeq -> 302
    //   282: aload #7
    //   284: checkcast burp/Zght
    //   287: astore #14
    //   289: aload_0
    //   290: aload #14
    //   292: iload #4
    //   294: invokevirtual ZG : (Lburp/Zght;Z)V
    //   297: aload #6
    //   299: ifnonnull -> 310
    //   302: aload_0
    //   303: aload #7
    //   305: iload #4
    //   307: invokevirtual Zj : (Lburp/Zmy1;Z)V
    //   310: aload_0
    //   311: getfield ZC : Ljavax/swing/DefaultListCellRenderer;
    //   314: ifnull -> 362
    //   317: aload_0
    //   318: getfield ZC : Ljavax/swing/DefaultListCellRenderer;
    //   321: aload_1
    //   322: aload_0
    //   323: invokevirtual getText : ()Ljava/lang/String;
    //   326: iload_3
    //   327: iload #4
    //   329: iload #5
    //   331: invokevirtual getListCellRendererComponent : (Ljavax/swing/JList;Ljava/lang/Object;IZZ)Ljava/awt/Component;
    //   334: pop
    //   335: aload_0
    //   336: getfield ZC : Ljavax/swing/DefaultListCellRenderer;
    //   339: aload_0
    //   340: invokevirtual getFont : ()Ljava/awt/Font;
    //   343: invokevirtual setFont : (Ljava/awt/Font;)V
    //   346: aload_0
    //   347: getfield ZC : Ljavax/swing/DefaultListCellRenderer;
    //   350: aload_0
    //   351: invokevirtual getIcon : ()Ljavax/swing/Icon;
    //   354: invokevirtual setIcon : (Ljavax/swing/Icon;)V
    //   357: aload_0
    //   358: getfield ZC : Ljavax/swing/DefaultListCellRenderer;
    //   361: areturn
    //   362: iload #4
    //   364: ifne -> 387
    //   367: iload_3
    //   368: iconst_1
    //   369: iand
    //   370: iconst_1
    //   371: if_icmpne -> 387
    //   374: getstatic burp/Zt5q.ZZ : Ljava/awt/Color;
    //   377: ifnull -> 387
    //   380: aload_0
    //   381: getstatic burp/Zt5q.ZZ : Ljava/awt/Color;
    //   384: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   387: aload_0
    //   388: areturn
  }
  
  public boolean Zr() {
    return this.Zm;
  }
  
  protected void paintComponent(Graphics paramGraphics) {
    paramGraphics.setColor(this.ZU);
    int i = 0;
    int[] arrayOfInt = Zghd.ZM();
    if (getIcon() != null)
      i = getIcon().getIconWidth(); 
    paramGraphics.setColor(getBackground());
    paramGraphics.fillRect(0, 0, getWidth(), getHeight());
    if (getIcon() != null) {
      Icon icon = getIcon();
      icon.paintIcon(this, paramGraphics, 3, (getHeight() - icon.getIconHeight()) / 2);
    } 
    String str = getText();
    if (str != null) {
      this.Zr.setBounds(i + 3, 0, getWidth() - i - 3, getHeight());
      this.Zr.x += 3;
      int m = this.Zr.height - paramGraphics.getFontMetrics().getHeight();
      View view = (View)getClientProperty(a(-19532, -17372));
      if (view != null) {
        this.Zr.y += m / 2;
        this.Zr.height -= m;
        view.paint(paramGraphics, this.Zr);
        if (arrayOfInt == null) {
          int n = this.Zr.x;
          int i1 = this.Zr.y;
          paramGraphics.drawString(str, n, i1);
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    int j = this.Zr.x;
    int k = this.Zr.y;
    paramGraphics.drawString(str, j, k);
  }
  
  protected void ZW(Zgh5 paramZgh5, boolean paramBoolean) {
    boolean bool = paramZgh5.ZS().contains(Zecn.DEPRECATED);
    StringBuilder stringBuilder = new StringBuilder(a(-19549, 18276));
    if (bool)
      stringBuilder.append(a(-19552, 20281)); 
    Ze4q ze4q = new Ze4q(paramZgh5.Zi(this.ZV), null);
    String str1 = paramZgh5.ZP();
    String str2 = ze4q.Za(str1);
    stringBuilder.append(str2);
    stringBuilder.append(ZR(paramZgh5).formatted(new Object[] { ZJ(paramZgh5, paramBoolean, true) }));
    if (bool)
      stringBuilder.append(a(-19537, -22736)); 
    stringBuilder.append(ZB(paramZgh5, paramBoolean));
    setText(stringBuilder.toString());
  }
  
  protected void ZA(Zg7o paramZg7o, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZS : ()Ljava/util/List;
    //   4: getstatic burp/Zecn.DEPRECATED : Lburp/Zecn;
    //   7: invokeinterface contains : (Ljava/lang/Object;)Z
    //   12: istore #4
    //   14: invokestatic ZM : ()[I
    //   17: new java/lang/StringBuilder
    //   20: dup
    //   21: sipush #-19549
    //   24: sipush #18276
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokespecial <init> : (Ljava/lang/String;)V
    //   33: astore #5
    //   35: astore_3
    //   36: iload #4
    //   38: ifeq -> 56
    //   41: aload #5
    //   43: sipush #-19531
    //   46: sipush #-10126
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_0
    //   57: aload_1
    //   58: iload_2
    //   59: iconst_0
    //   60: invokevirtual ZJ : (Lburp/Zzmq;ZZ)Ljava/lang/String;
    //   63: astore #6
    //   65: aload_1
    //   66: invokevirtual ZR : ()I
    //   69: iconst_1
    //   70: if_icmpne -> 85
    //   73: aload #5
    //   75: aload #6
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_3
    //   82: ifnonnull -> 107
    //   85: aload #5
    //   87: aload_1
    //   88: invokestatic ZR : (Lburp/Zzmq;)Ljava/lang/String;
    //   91: iconst_1
    //   92: anewarray java/lang/Object
    //   95: dup
    //   96: iconst_0
    //   97: aload #6
    //   99: aastore
    //   100: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload #5
    //   109: aload_1
    //   110: invokevirtual ZP : ()Ljava/lang/String;
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: iload #4
    //   119: ifeq -> 137
    //   122: aload #5
    //   124: sipush #-19548
    //   127: sipush #-4199
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload #5
    //   139: aload_0
    //   140: aload_1
    //   141: iload_2
    //   142: invokevirtual ZB : (Lburp/Zgh5;Z)Ljava/lang/String;
    //   145: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_0
    //   150: aload #5
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokevirtual setText : (Ljava/lang/String;)V
    //   158: return
  }
  
  private String ZB(Zgh5 paramZgh5, boolean paramBoolean) {
    StringBuilder stringBuilder = new StringBuilder();
    if (Zr() && paramZgh5.Zv() != null) {
      stringBuilder.append(a(-19535, -4695));
      if (!paramBoolean)
        stringBuilder.append(a(-19530, -5044)).append(this.ZT).append(a(-19539, 29366)); 
      String str = Zswi.Zz(paramZgh5.Zv());
      stringBuilder.append(Zl6r.ZA(str, a(-19546, 29078), false));
      if (!paramBoolean)
        stringBuilder.append(a(-19545, -22627)); 
    } 
    return stringBuilder.toString();
  }
  
  private static String ZR(Zzmq paramZzmq) {
    StringBuilder stringBuilder = new StringBuilder();
    Zlqb zlqb = paramZzmq.ZT();
    char c1 = zlqb.Za();
    if (c1 != '\000')
      stringBuilder.append(c1); 
    stringBuilder.append(a(-19523, 5627));
    char c2 = zlqb.ZC();
    if (c2 != '\000')
      stringBuilder.append(c2); 
    return stringBuilder.toString();
  }
  
  private String ZJ(Zzmq paramZzmq, boolean paramBoolean1, boolean paramBoolean2) {
    int[] arrayOfInt = Zghd.ZM();
    int i = paramZzmq.ZR();
    if (i == 0)
      return ""; 
    StringBuilder stringBuilder = new StringBuilder();
    String str = paramZzmq.ZT().ZK();
    byte b = 0;
    while (b < i) {
      if (b > 0)
        stringBuilder.append(str); 
      Zzat zzat = paramZzmq.ZD(b);
      String str1 = zzat.ZG();
      if (paramBoolean2) {
        String str2 = zzat.ZT();
        if (str2 != null) {
          if (!paramBoolean1)
            stringBuilder.append(a(-19530, -5044)).append(this.Zg).append(a(-19539, 29366)); 
          String str3 = Zswi.Zz(str2);
          str3 = zzat.Zu() ? str3.replaceAll(a(-19534, 23356), a(-19528, -13323)) : str3;
          stringBuilder.append(Zl6r.ZA(str3, a(-19524, 14549), false));
          if (!paramBoolean1)
            stringBuilder.append(a(-19545, -22627)); 
          if (str1 != null)
            stringBuilder.append(' '); 
        } 
      } 
      if (str1 != null)
        stringBuilder.append(str1); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  protected void ZL(Zg78 paramZg78) {
    Ze4q ze4q = new Ze4q(paramZg78.Zi(this.ZV), null);
    String str1 = paramZg78.Zl();
    String str2 = ze4q.Za(str1);
    setText(a(-19527, -29387) + a(-19527, -29387));
  }
  
  protected void ZG(Zght paramZght, boolean paramBoolean) {
    boolean bool = paramZght.ZS().contains(Zecn.DEPRECATED);
    String str1 = bool ? a(-19540, -24476) : a(-19523, 5627);
    StringBuilder stringBuilder = new StringBuilder(a(-19549, 18276));
    String str2 = Zswi.Zz(paramZght.ZG());
    Ze4q ze4q = new Ze4q(paramZght.Zi(this.ZV), null);
    String str3 = ze4q.Za(str2);
    stringBuilder.append(str1.formatted(new Object[] { str3 }));
    String str4 = paramZght.Zs();
    if (str4 != null) {
      if (!paramBoolean)
        stringBuilder.append(a(-19530, -5044)).append(this.ZT).append(a(-19539, 29366)); 
      stringBuilder.append(' ');
      stringBuilder.append(str4);
      if (!paramBoolean)
        stringBuilder.append(a(-19545, -22627)); 
    } 
    setText(stringBuilder.toString());
  }
  
  protected void Zj(Zmy1 paramZmy1, boolean paramBoolean) {
    boolean bool = paramZmy1.ZS().contains(Zecn.DEPRECATED);
    String str1 = bool ? a(-19540, -24476) : a(-19523, 5627);
    StringBuilder stringBuilder = new StringBuilder(a(-19549, 18276));
    Ze4q ze4q = new Ze4q(paramZmy1.Zn(), null);
    String str2 = paramZmy1.ZG();
    String str3 = ze4q.Za(str2);
    stringBuilder.append(str1.formatted(new Object[] { str3 }));
    if (paramZmy1 instanceof Zghg) {
      String str = ((Zghg)paramZmy1).Zy();
      if (str != null) {
        stringBuilder.append(a(-19533, 21004));
        if (!paramBoolean)
          stringBuilder.append(a(-19530, -5044)).append(this.ZT).append(a(-19539, 29366)); 
        stringBuilder.append(str);
        if (!paramBoolean)
          stringBuilder.append(a(-19545, -22627)); 
      } 
    } 
    setText(stringBuilder.toString());
  }
  
  protected void ZC(Zg7f paramZg7f, boolean paramBoolean) {
    boolean bool = paramZg7f.ZS().contains(Zecn.DEPRECATED);
    String str1 = bool ? a(-19540, -24476) : a(-19523, 5627);
    StringBuilder stringBuilder = new StringBuilder(a(-19549, 18276));
    Ze4q ze4q = new Ze4q(paramZg7f.Zi(this.ZV), null);
    String str2 = paramZg7f.ZG();
    String str3 = ze4q.Za(str2);
    stringBuilder.append(str1.formatted(new Object[] { str3 }));
    String str4 = paramZg7f.Z_();
    if (str4 != null) {
      stringBuilder.append(a(-19547, -30592));
      if (!paramBoolean)
        stringBuilder.append(a(-19530, -5044)).append(this.ZT).append(a(-19539, 29366)); 
      stringBuilder.append(str4);
      if (!paramBoolean)
        stringBuilder.append(a(-19545, -22627)); 
    } 
    setText(stringBuilder.toString());
  }
  
  protected void Zu(Zghy paramZghy, boolean paramBoolean) {
    boolean bool = paramZghy.ZS().contains(Zecn.DEPRECATED);
    String str1 = bool ? a(-19540, -24476) : a(-19523, 5627);
    StringBuilder stringBuilder = new StringBuilder(a(-19549, 18276));
    Ze4q ze4q = new Ze4q(paramZghy.Zi(this.ZV), null);
    String str2 = paramZghy.ZP();
    String str3 = ze4q.Za(str2);
    stringBuilder.append(str1.formatted(new Object[] { str3 }));
    if (Zr() && paramZghy.Zv() != null) {
      stringBuilder.append(a(-19535, -4695));
      if (!paramBoolean)
        stringBuilder.append(a(-19530, -5044)).append(this.ZT).append(a(-19539, 29366)); 
      stringBuilder.append(paramZghy.Zv());
      if (!paramBoolean)
        stringBuilder.append(a(-19545, -22627)); 
    } 
    setText(stringBuilder.toString());
  }
  
  protected void ZC(Zghr paramZghr, boolean paramBoolean) {
    boolean bool = paramZghr.ZS().contains(Zecn.DEPRECATED);
    String str1 = bool ? a(-19521, 447) : a(-19551, 32076);
    StringBuilder stringBuilder = new StringBuilder(a(-19549, 18276));
    Ze4q ze4q = new Ze4q(paramZghr.Zi(this.ZV), null);
    String str2 = paramZghr.Zv();
    String str3 = ze4q.Za(str2);
    stringBuilder.append(str1.formatted(new Object[] { str3 }));
    if (Zr() && paramZghr.ZD() != null) {
      stringBuilder.append(a(-19526, -11194));
      if (!paramBoolean)
        stringBuilder.append(a(-19550, -12313)).append(this.ZT).append(a(-19525, -10791)); 
      stringBuilder.append(Zswi.Zz(paramZghr.ZD()));
      if (!paramBoolean)
        stringBuilder.append(a(-19538, -22166)); 
    } 
    setText(stringBuilder.toString());
  }
  
  public void ZI(Font paramFont) {
    this.Zk = paramFont;
  }
  
  public void Zu(boolean paramBoolean) {
    this.Zm = paramBoolean;
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZC != null)
      SwingUtilities.updateComponentTreeUI(this.ZC); 
    this.Zg = Zy();
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '-Ñ²VÆë&6¿¥'E¡\\r c"u>ë\H?q:ÓÜ1§º~Ë?­®©;Þ»¸X(Æ²fo~ò^} Íd\A{\\fòÖ vqNËð\\rÙ\\f£ù¡%\\f{hØ:6Û\Û¸{7Ç\\n\\nÞ¢\\tûÇAË&,ÞýHÚ9Ä8=Ê@\\bçßÅI§¸×Q\\fmd´ÎnØà\\r¬Ç·áy\\nAXf8×Sm?U;!ÝXÛµu\\n¿±VÊ~\\tÈ]zH\Ð'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #8
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #95
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
    //   68: ldc 'úñGu­Þ\\f×D7ð·nEÝÙtÏ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #78
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
    //   129: putstatic burp/Zt5q.a : [Ljava/lang/String;
    //   132: bipush #29
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt5q.b : [Ljava/lang/String;
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
    //   212: bipush #9
    //   214: goto -> 244
    //   217: bipush #80
    //   219: goto -> 244
    //   222: bipush #99
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #84
    //   234: goto -> 244
    //   237: bipush #30
    //   239: goto -> 244
    //   242: bipush #60
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
    int i = (paramInt1 ^ 0xFFFFB3B5) & 0xFFFF;
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
      char c = '´';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt5q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */