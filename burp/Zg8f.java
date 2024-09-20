package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Zg8f extends Zbqc {
  private final Zxgc ZS;
  
  private final Zic ZE;
  
  private final Zgb6 Zv;
  
  private Image Zs;
  
  private Image ZY;
  
  private Image Zn;
  
  private Image Z_;
  
  private Image ZV;
  
  private Image Zl;
  
  private Ze01 Zd;
  
  private Zbqc Zo;
  
  private Zbqc ZO;
  
  private Zbup ZD;
  
  private Zm99 Zj;
  
  private Zbqc Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg8f(Zxgc paramZxgc, Zic paramZic, Zgb6 paramZgb6) {
    this.ZS = paramZxgc;
    this.ZE = paramZic;
    this.Zv = paramZgb6;
    Zo();
    ZT();
    this.Zj.ZE(Zt00.TITLE_FONT_LARGE);
    byte b = 0;
    ZI(b++, new Zbqc[] { ZD(a(21115, 10334), a(21090, 25177), a(21109, -9080), a(21089, 23621), this::lambda$new$0), ZG(a(21106, -13783), a(21096, 8569), a(21095, -16477), a(21099, -19877), this::lambda$new$1) });
    ZI(b++, new Zbqc[] { Zd(a(21119, -19604), a(21100, -31968), a(21105, -12786), a(21113, 24051), this::lambda$new$2), Zd(a(21114, -1324), a(21094, -2851), a(21088, 11981), a(21101, 7449), this::lambda$new$3) });
    ZI(b++, new Zbqc[] { Zd(a(21108, -23759), a(21097, 1581), a(21091, -32194), a(21116, -5145), this::lambda$new$4), Zd(a(21112, -20000), a(21063, 13599), a(21103, 6618), a(21117, 19613), this::lambda$new$5) });
    ZD(b++);
    ZQ(b);
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZO != null)
      ZT(); 
  }
  
  private void ZT() {
    this.Zs = Zbz3.ZK(Zxpj.LEARN_GETTING_STARTED_BACKGROUND).getImage();
    this.ZY = Zbz3.ZK(Zxpj.LEARN_VIDEO_TOUR_BACKGROUND).getImage();
    this.Zn = Zbz3.ZK(Zxpj.LEARN_VIDEO_TUTORIALS_BACKGROUND).getImage();
    this.Z_ = Zbz3.ZK(Zxpj.LEARN_ACADEMY_BACKGROUND).getImage();
    this.ZV = Zbz3.ZK(Zxpj.LEARN_SUPPORT_CENTRE_BACKGROUND).getImage();
    this.Zl = Zbz3.ZK(Zxpj.LEARN_TWITTER_BACKGROUND).getImage();
  }
  
  private void ZI(int paramInt, Zbqc... paramVarArgs) {
    Zbqc zbqc = new Zbqc(new GridLayout(1, paramVarArgs.length, 20, 0));
    Objects.requireNonNull(zbqc);
    Arrays.<Zbqc>stream(paramVarArgs).forEach(zbqc::add);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = paramInt * 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    this.ZO.add(zbqc, gridBagConstraints);
  }
  
  private Zbqc Zd(String paramString1, String paramString2, String paramString3, String paramString4, Supplier<Image> paramSupplier) {
    return Z_(paramString1, paramString2, paramString3, false, paramString4, Zt00.TITLE_BOLD_FONT, paramSupplier, 30);
  }
  
  private Zbqc ZG(String paramString1, String paramString2, String paramString3, String paramString4, Supplier<Image> paramSupplier) {
    return Z_(paramString1, paramString2, paramString3, false, paramString4, Zt00.TITLE_FONT_LARGE, paramSupplier, 50);
  }
  
  private Zbqc ZD(String paramString1, String paramString2, String paramString3, String paramString4, Supplier<Image> paramSupplier) {
    return Z_(paramString1, paramString2, paramString3, true, paramString4, Zt00.TITLE_FONT_LARGE, paramSupplier, 50);
  }
  
  private Zbqc Z_(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, Zt00 paramZt00, Supplier<Image> paramSupplier, int paramInt) {
    // Byte code:
    //   0: aload #7
    //   2: ifnonnull -> 15
    //   5: new burp/Zbqc
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: goto -> 25
    //   15: new burp/Zg8j
    //   18: dup
    //   19: aload_0
    //   20: aload #7
    //   22: invokespecial <init> : (Lburp/Zg8f;Ljava/util/function/Supplier;)V
    //   25: astore #9
    //   27: new java/awt/GridBagLayout
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore #10
    //   36: aload #10
    //   38: iconst_2
    //   39: newarray int
    //   41: dup
    //   42: iconst_0
    //   43: iconst_0
    //   44: iastore
    //   45: dup
    //   46: iconst_1
    //   47: iconst_0
    //   48: iastore
    //   49: putfield columnWidths : [I
    //   52: aload #10
    //   54: iconst_5
    //   55: newarray int
    //   57: dup
    //   58: iconst_0
    //   59: iconst_0
    //   60: iastore
    //   61: dup
    //   62: iconst_1
    //   63: bipush #10
    //   65: iastore
    //   66: dup
    //   67: iconst_2
    //   68: iconst_0
    //   69: iastore
    //   70: dup
    //   71: iconst_3
    //   72: bipush #10
    //   74: iastore
    //   75: dup
    //   76: iconst_4
    //   77: iconst_0
    //   78: iastore
    //   79: putfield rowHeights : [I
    //   82: aload #9
    //   84: aload #10
    //   86: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   89: aload #9
    //   91: getstatic burp/Zlkk.ACTION_PANEL_BACKGROUND : Lburp/Zlkk;
    //   94: invokevirtual Zl : (Lburp/Zlkk;)V
    //   97: aload #9
    //   99: new burp/Zr43
    //   102: dup
    //   103: getstatic burp/Zlkk.ACTION_PANEL_BORDER : Lburp/Zlkk;
    //   106: iconst_1
    //   107: new java/awt/Insets
    //   110: dup
    //   111: iload #8
    //   113: bipush #20
    //   115: iload #8
    //   117: bipush #20
    //   119: invokespecial <init> : (IIII)V
    //   122: invokespecial <init> : (Lburp/Zlkk;ILjava/awt/Insets;)V
    //   125: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   128: new burp/Zl8w
    //   131: dup
    //   132: aload_1
    //   133: invokespecial <init> : (Ljava/lang/String;)V
    //   136: astore #11
    //   138: aload #11
    //   140: aload #6
    //   142: invokevirtual ZI : (Lburp/Zt00;)V
    //   145: new java/awt/GridBagConstraints
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: astore #12
    //   154: aload #12
    //   156: iconst_0
    //   157: putfield gridx : I
    //   160: aload #12
    //   162: iconst_0
    //   163: putfield gridy : I
    //   166: aload #12
    //   168: iconst_2
    //   169: putfield fill : I
    //   172: aload #12
    //   174: bipush #23
    //   176: putfield anchor : I
    //   179: aload #12
    //   181: new java/awt/Insets
    //   184: dup
    //   185: iconst_0
    //   186: iconst_0
    //   187: bipush #10
    //   189: iconst_0
    //   190: invokespecial <init> : (IIII)V
    //   193: putfield insets : Ljava/awt/Insets;
    //   196: aload #9
    //   198: aload #11
    //   200: aload #12
    //   202: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   205: new burp/Zl8w
    //   208: dup
    //   209: aload_2
    //   210: invokespecial <init> : (Ljava/lang/String;)V
    //   213: astore #13
    //   215: new java/awt/GridBagConstraints
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore #12
    //   224: aload #12
    //   226: iconst_0
    //   227: putfield gridx : I
    //   230: aload #12
    //   232: iconst_2
    //   233: putfield gridy : I
    //   236: aload #12
    //   238: aload #7
    //   240: ifnonnull -> 247
    //   243: dconst_1
    //   244: goto -> 250
    //   247: ldc2_w 0.33
    //   250: putfield weightx : D
    //   253: aload #12
    //   255: dconst_1
    //   256: putfield weighty : D
    //   259: aload #12
    //   261: iconst_2
    //   262: putfield fill : I
    //   265: aload #12
    //   267: bipush #23
    //   269: putfield anchor : I
    //   272: aload #9
    //   274: aload #13
    //   276: aload #12
    //   278: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   281: iload #4
    //   283: ifeq -> 297
    //   286: new burp/Ze0q
    //   289: dup
    //   290: aload_3
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: goto -> 305
    //   297: new burp/Ze01
    //   300: dup
    //   301: aload_3
    //   302: invokespecial <init> : (Ljava/lang/String;)V
    //   305: astore #14
    //   307: iload #4
    //   309: ifne -> 320
    //   312: aload #14
    //   314: getstatic burp/Zlkk.ACTION_PANEL_BACKGROUND : Lburp/Zlkk;
    //   317: invokevirtual Zj : (Lburp/Zlkk;)V
    //   320: aload #14
    //   322: aload_0
    //   323: aload #5
    //   325: <illegal opcode> actionPerformed : (Lburp/Zg8f;Ljava/lang/String;)Ljava/awt/event/ActionListener;
    //   330: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   333: new java/awt/GridBagConstraints
    //   336: dup
    //   337: invokespecial <init> : ()V
    //   340: astore #12
    //   342: aload #12
    //   344: iconst_0
    //   345: putfield gridx : I
    //   348: aload #12
    //   350: iconst_4
    //   351: putfield gridy : I
    //   354: aload #12
    //   356: bipush #25
    //   358: putfield anchor : I
    //   361: aload #9
    //   363: aload #14
    //   365: aload #12
    //   367: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   370: aload #7
    //   372: ifnull -> 456
    //   375: aload #9
    //   377: iconst_0
    //   378: invokevirtual setOpaque : (Z)V
    //   381: new burp/Zm99
    //   384: dup
    //   385: ldc ' '
    //   387: invokespecial <init> : (Ljava/lang/String;)V
    //   390: astore #15
    //   392: aload #15
    //   394: ldc ' '
    //   396: invokevirtual setText : (Ljava/lang/String;)V
    //   399: new java/awt/GridBagConstraints
    //   402: dup
    //   403: invokespecial <init> : ()V
    //   406: astore #12
    //   408: aload #12
    //   410: iconst_1
    //   411: putfield gridx : I
    //   414: aload #12
    //   416: iconst_0
    //   417: putfield gridy : I
    //   420: aload #12
    //   422: ldc2_w 0.67
    //   425: putfield weightx : D
    //   428: aload #12
    //   430: iconst_5
    //   431: putfield gridheight : I
    //   434: aload #12
    //   436: iconst_1
    //   437: putfield fill : I
    //   440: aload #12
    //   442: bipush #23
    //   444: putfield anchor : I
    //   447: aload #9
    //   449: aload #15
    //   451: aload #12
    //   453: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   456: aload #9
    //   458: areturn
  }
  
  private void ZD(int paramInt) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = paramInt * 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    this.ZO.add(new Zm99(), gridBagConstraints);
  }
  
  private void ZQ(int paramInt) {
    ((GridBagLayout)this.ZO.getLayout()).rowHeights = ZT(paramInt);
  }
  
  private int[] ZT(int paramInt) {
    int[] arrayOfInt = new int[paramInt * 2 - 1];
    byte b = 1;
    String str = Zbk_.Zb();
    while (b < arrayOfInt.length) {
      arrayOfInt[b] = 20;
      b += 2;
      if (str == null)
        break; 
    } 
    return arrayOfInt;
  }
  
  private void Zu(Component paramComponent, Graphics paramGraphics, Supplier<Image> paramSupplier) {
    paramGraphics.setColor(paramComponent.getBackground());
    paramGraphics.fillRect(0, 0, paramComponent.getWidth(), paramComponent.getHeight());
    Image image = paramSupplier.get();
    int i = paramComponent.getWidth() - image.getWidth(paramComponent);
    int j = (paramComponent.getHeight() - image.getHeight(paramComponent)) / 2;
    paramGraphics.drawImage(image, i, j, paramComponent);
  }
  
  private void ZF() {
    int i = Zx6o.Zc(this, a(21107, -9477), a(21111, -9914), new String[] { a(21093, -21880), a(21104, 7726) }1);
    if (i == 1) {
      this.Zv.ZHG(false);
      this.ZS.ZAv(false);
      this.ZE.ZW();
    } 
  }
  
  private void ZR(String paramString) {
    Zke4.Zt(Zt2m.ZF(this), paramString, true);
  }
  
  private void Zo() {
    this.ZD = new Zbup();
    this.Zo = new Zbqc();
    this.Zc = new Zbqc();
    this.Zj = new Zm99();
    this.Zd = new Ze01();
    this.ZO = new Zbqc();
    setLayout(new BorderLayout());
    this.ZD.setBorder((Border)null);
    this.Zo.setLayout(new BorderLayout());
    this.Zc.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 20, 0 };
    gridBagLayout.rowHeights = new int[] { 0 };
    this.Zc.setLayout(gridBagLayout);
    this.Zj.setText(a(21118, 5763));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Zc.add(this.Zj, gridBagConstraints);
    this.Zd.setText(a(21110, -10829));
    this.Zd.addActionListener(new Zmay(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    this.Zc.add(this.Zd, gridBagConstraints);
    this.Zo.add(this.Zc, a(21102, 29154));
    this.ZO.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    this.ZO.setLayout(new GridBagLayout());
    this.Zo.add(this.ZO, a(21092, 30883));
    this.ZD.setViewportView(this.Zo);
    add(this.ZD, a(21098, -3196));
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    ZF();
  }
  
  private void lambda$panel$6(String paramString, ActionEvent paramActionEvent) {
    ZR(paramString);
  }
  
  private Image lambda$new$5() {
    return this.Zl;
  }
  
  private Image lambda$new$4() {
    return this.ZV;
  }
  
  private Image lambda$new$3() {
    return this.Z_;
  }
  
  private Image lambda$new$2() {
    return this.Zn;
  }
  
  private Image lambda$new$1() {
    return this.ZY;
  }
  
  private Image lambda$new$0() {
    return this.Zs;
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ù 9x>en ¿Ø!8íy5©K.·4³ººÅë¤éÙ{¿UújY7¶t\\rvðÎ×ÚÖ¢é «bò;al${.\\f±ü:®ýÓ"VÐ05å-Ç4#éI#1ÙQy?¬i±qâU Ý½§]­ p×ÍÐø´[r\\t"|Ò*7¬¨ûèä­¡ÞvÓbEg_,[ñ«¥~9¡Å}"aq´ýÓå/~é Êg¾î77=Nµâ¢q£ÄKè/U£@Eás^Õm_aáPÙ¾¸Aª§§aR¼V>ª¢ØÆ¿Ç&ª9a­¶÷[®ÂF OúÏµì¦,^³·D¬\\bfä_+lêØG9\\tm-fÔÃo`;XÊak[õß'û¯ÏÉn¡Ú1\\tGoZ#ÏõVÙA"Ï)}<zÛÿhë"?\\rúnGfáÊó¦¾d£[å÷*Rjåß¿Ç¸Ê}EFAJZ?F/ÖJT9CÈV±É{«[^×G¹Ø«õÒQÊ©za7 ©R¥áotûäds×+PH~s­¯%-ÿgÃ»ª-u½4â\\rìY79;ÞgC¬(\\n\\nùmîÂ9µâ»á2SÜÅO!n<òÌS#cG=FSyt ÌIæwèÌâYì_nÄÇ~)BKª ÏÊÌÁJ}g0ñÄ2HyJ¥Ò¦÷0LãÿÝfµÇ(1Qà°É3Í¯OÚ¹Ísâißsm,]ýÙ2æp\\nGþ>;'©2$9ë¶B^ÚMÁxÒ8Y"r}QP\\bH¨·òé­J@"7üÕ;ZØÅhgQ¸H%+çURüÕK#î|o»/¾Õ&P®èht]GgÃñG!ê7ZHíAû¯\\nîè9DÍãáytPW¤-Ï>l¢ÜNT¼v-þÿ ¯`¹\\nì}'þùFª-ÜhÒ×ÿM  $5@Æ@C8/ßÝ\\r¤]Zú!±Ê¾!«ë\\n)'¼äÜ(§ê´â}È<Øð6IâÂZ7SO.ý\\t¦Y~1×¨ í7Ã~¶ð|g]QX¬}?;ÆýÀo×fI¯È\\r,åa§Ã"zôx*À¢Õ.ÍèîÐØiGRí­Õl(x¾ûÐ²(¯Ù²çw©äXbjë»Ç¬s­ðÝÀ&ï}fß÷Ô¸Ë­Õ\\fOZF2t×üÎ\\tó¨qKM2"UPHùðµZ°éP~BàBÎªT9~=Ý@²Ð-Úl´òÙ\\r8ì©¿rÇÒº®õÞvXí_êð~dbMÜqÎlûGpsZ}Ú-/àO1\ÑJª²e Ca2ü¼¼Ñ±N|þ#u§«\\nuýÃ¾!ÆW>ë;'Îpc+ï0îÚö÷'jaàgÆ§í1 [¬>èüxbü3ª{wøç3Ü¦+ ;ØîÖ>´%ß>5ò>Ïî;Ñ·µ*-{ê\\bõ¯\\tTTN¥.Oº´\\b\P,¡XsõB$8½\\tëÓâÁµ@1åt³\yU}iæ¾.~öÑÔjvHÐ&#M6¥v ¶O¼nýyDÁ0Ïbþ Îi'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #14
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
    //   68: ldc 'û½G¡aâ÷ÝÚÇhI%£$gàî7ýàMC³³ß§¡0#íã³Öþµ \ò|J°6ðQi^oPÉ4ü¹îqj;Ù1æg'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #21
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #104
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
    //   129: putstatic burp/Zg8f.a : [Ljava/lang/String;
    //   132: bipush #33
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zg8f.b : [Ljava/lang/String;
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
    //   212: bipush #26
    //   214: goto -> 244
    //   217: bipush #60
    //   219: goto -> 244
    //   222: bipush #102
    //   224: goto -> 244
    //   227: bipush #95
    //   229: goto -> 244
    //   232: bipush #60
    //   234: goto -> 244
    //   237: bipush #117
    //   239: goto -> 244
    //   242: bipush #104
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
    int i = (paramInt1 ^ 0x5267) & 0xFFFF;
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
      byte b1 = 69;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */