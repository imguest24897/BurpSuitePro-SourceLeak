package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;

public class Zl4u extends Zl04 {
  private final Zt4u ZA;
  
  private final Zskh Zi;
  
  private final Zbnt Zf;
  
  private final Ztwv ZZ;
  
  private final Zez3[] Zt;
  
  private final List<Zez3> ZQ;
  
  private final List<Zxkf> ZP;
  
  private final Set<String> ZK;
  
  private final Map<String, List<Zxkf>> ZJ;
  
  private int Zk;
  
  private Zm2o ZL;
  
  private Ze01 ZB;
  
  private Zm99 ZH;
  
  private Zm99 Zc;
  
  private Zm99 Za;
  
  private Zm99 ZR;
  
  private Zbqc ZT;
  
  private Zbup ZM;
  
  private Zl8w Zu;
  
  private Zm99 Zh;
  
  private Zm99 Zv;
  
  private Zm99 Zn;
  
  private Zm99 Zz;
  
  private Zlte Zq;
  
  private static int[] Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl4u(Window paramWindow, Zt4u paramZt4u, Zskh paramZskh, Zbnt paramZbnt, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Zez3[] paramArrayOfZez3, Zkl6 paramZkl6, Ze47 paramZe47) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield ZQ : Ljava/util/List;
    //   15: aload_0
    //   16: new java/util/ArrayList
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: putfield ZP : Ljava/util/List;
    //   26: aload_0
    //   27: new java/util/HashSet
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: putfield ZK : Ljava/util/Set;
    //   37: aload_0
    //   38: new java/util/HashMap
    //   41: dup
    //   42: invokespecial <init> : ()V
    //   45: putfield ZJ : Ljava/util/Map;
    //   48: getstatic burp/Zrrh.SUITE_TOOLS_TARGET_ANALYZER : Lburp/Zrrh;
    //   51: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   54: aload_0
    //   55: aload_2
    //   56: putfield ZA : Lburp/Zt4u;
    //   59: aload_0
    //   60: aload_3
    //   61: putfield Zi : Lburp/Zskh;
    //   64: aload_0
    //   65: aload #4
    //   67: putfield Zf : Lburp/Zbnt;
    //   70: aload_0
    //   71: aload #5
    //   73: putfield ZZ : Lburp/Ztwv;
    //   76: invokestatic Zp : ()[I
    //   79: aload_0
    //   80: aload #9
    //   82: putfield Zt : [Lburp/Zez3;
    //   85: aload_0
    //   86: invokevirtual Ze : ()V
    //   89: aload_0
    //   90: aload #9
    //   92: invokevirtual Zq : ([Lburp/Zez3;)V
    //   95: aload_0
    //   96: iconst_0
    //   97: invokevirtual setDefaultCloseOperation : (I)V
    //   100: aload_0
    //   101: new burp/Zt8c
    //   104: dup
    //   105: aload_0
    //   106: invokespecial <init> : (Lburp/Zl4u;)V
    //   109: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   112: aload_0
    //   113: aload #9
    //   115: invokevirtual ZN : ([Lburp/Zez3;)V
    //   118: aload_0
    //   119: getfield Zq : Lburp/Zlte;
    //   122: sipush #-30049
    //   125: sipush #-21621
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: new burp/Zgoy
    //   134: dup
    //   135: aload_0
    //   136: getfield ZP : Ljava/util/List;
    //   139: aload #4
    //   141: aload #6
    //   143: aload #7
    //   145: aload #8
    //   147: aload_0
    //   148: iconst_0
    //   149: aload #10
    //   151: aload #11
    //   153: invokespecial <init> : (Ljava/util/List;Lburp/Zbnt;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zz1z;Lburp/Zl04;ZLburp/Zkl6;Lburp/Ze47;)V
    //   156: invokeinterface add : (Ljava/lang/String;Ljava/awt/Component;)Ljava/awt/Component;
    //   161: pop
    //   162: astore #12
    //   164: aload_0
    //   165: getfield Zq : Lburp/Zlte;
    //   168: iconst_1
    //   169: aload_0
    //   170: getfield ZP : Ljava/util/List;
    //   173: invokeinterface isEmpty : ()Z
    //   178: ifne -> 185
    //   181: iconst_1
    //   182: goto -> 186
    //   185: iconst_0
    //   186: invokeinterface setEnabledAt : (IZ)V
    //   191: aload_0
    //   192: getfield Zq : Lburp/Zlte;
    //   195: sipush #-30053
    //   198: sipush #-25429
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: new burp/Zgo5
    //   207: dup
    //   208: aload_0
    //   209: getfield ZQ : Ljava/util/List;
    //   212: aload #6
    //   214: aload #7
    //   216: aload #8
    //   218: aload_0
    //   219: aload #10
    //   221: aload #11
    //   223: invokespecial <init> : (Ljava/util/List;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zz1z;Lburp/Zl04;Lburp/Zkl6;Lburp/Ze47;)V
    //   226: invokeinterface add : (Ljava/lang/String;Ljava/awt/Component;)Ljava/awt/Component;
    //   231: pop
    //   232: aload_0
    //   233: getfield Zq : Lburp/Zlte;
    //   236: iconst_2
    //   237: aload_0
    //   238: getfield ZQ : Ljava/util/List;
    //   241: invokeinterface isEmpty : ()Z
    //   246: ifne -> 253
    //   249: iconst_1
    //   250: goto -> 254
    //   253: iconst_0
    //   254: invokeinterface setEnabledAt : (IZ)V
    //   259: aload_0
    //   260: getfield Zq : Lburp/Zlte;
    //   263: sipush #-30062
    //   266: sipush #-21606
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: new burp/Zgot
    //   275: dup
    //   276: aload_0
    //   277: getfield ZK : Ljava/util/Set;
    //   280: aload_0
    //   281: getfield ZJ : Ljava/util/Map;
    //   284: aload #4
    //   286: aload #6
    //   288: aload #7
    //   290: aload #8
    //   292: aload_0
    //   293: aload #10
    //   295: aload #11
    //   297: invokespecial <init> : (Ljava/util/Set;Ljava/util/Map;Lburp/Zbnt;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zz1z;Lburp/Zl04;Lburp/Zkl6;Lburp/Ze47;)V
    //   300: invokeinterface add : (Ljava/lang/String;Ljava/awt/Component;)Ljava/awt/Component;
    //   305: pop
    //   306: aload_0
    //   307: getfield Zq : Lburp/Zlte;
    //   310: iconst_3
    //   311: aload_0
    //   312: getfield ZK : Ljava/util/Set;
    //   315: invokeinterface isEmpty : ()Z
    //   320: ifne -> 327
    //   323: iconst_1
    //   324: goto -> 328
    //   327: iconst_0
    //   328: invokeinterface setEnabledAt : (IZ)V
    //   333: aload_0
    //   334: aload_1
    //   335: <illegal opcode> run : (Lburp/Zl4u;Ljava/awt/Window;)Ljava/lang/Runnable;
    //   340: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   343: aload #12
    //   345: ifnonnull -> 355
    //   348: iconst_2
    //   349: anewarray burp/Zbqc
    //   352: invokestatic Zr : ([Lburp/Zbqc;)V
    //   355: return
  }
  
  private void Zq(Zez3[] paramArrayOfZez3) {
    int[] arrayOfInt = Zp();
    switch (paramArrayOfZez3.length) {
      case 1:
        setTitle(a(-30064, -24538) + a(-30064, -24538));
        if (arrayOfInt == null);
        return;
      case 2:
        setTitle(a(-30056, 21483) + a(-30056, 21483) + paramArrayOfZez3[0].ZlL().toString());
        if (arrayOfInt == null)
          break; 
        return;
    } 
    a(-30056, 21483);
    setTitle(a(-30056, 21483) + a(-30056, 21483) + paramArrayOfZez3[0].ZlL().toString() + a(-30057, 627) + paramArrayOfZez3.length - 1);
  }
  
  private void ZN(Zez3[] paramArrayOfZez3) {
    Zez3[] arrayOfZez3 = paramArrayOfZez3;
    int i = arrayOfZez3.length;
    byte b = 0;
    int[] arrayOfInt = Zp();
    while (b < i) {
      Zez3 zez3 = arrayOfZez3[b];
      this.Zk += (new Ztwt(zez3, this.ZQ, this.ZP, this.Zf, this.ZJ, this.ZK)).ZD();
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    this.Zh.setText(Integer.toString(this.ZP.size()));
    this.Zn.setText(Integer.toString(this.ZQ.size()));
    this.Zv.setText(Integer.toString(this.Zk));
    this.Zz.setText(Integer.toString(this.ZK.size()));
  }
  
  private void Ze() {
    this.Zq = new Zxer();
    this.ZM = new Zbup();
    this.ZT = new Zbqc();
    this.ZR = new Zm99();
    this.Zh = new Zm99();
    this.Zc = new Zm99();
    this.Zn = new Zm99();
    this.ZH = new Zm99();
    this.Zv = new Zm99();
    this.Za = new Zm99();
    this.Zz = new Zm99();
    this.ZB = new Ze01();
    this.Zu = new Zl8w();
    this.ZL = new Zm2o();
    setDefaultCloseOperation(3);
    this.ZT.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    this.ZT.setLayout(gridBagLayout);
    this.ZR.setText(a(-30055, 19267));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZR, gridBagConstraints);
    this.Zh.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.Zh, gridBagConstraints);
    this.Zc.setText(a(-30050, 2636));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.Zc, gridBagConstraints);
    this.Zn.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.Zn, gridBagConstraints);
    this.ZH.setText(a(-30063, -19300));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.ZH, gridBagConstraints);
    this.Zv.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.Zv, gridBagConstraints);
    this.Za.setText(a(-30060, 12723));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.Za, gridBagConstraints);
    this.Zz.setText("0");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.ZT.add(this.Zz, gridBagConstraints);
    this.ZB.setText(a(-30061, -5970));
    this.ZB.addActionListener(this::Zw);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.ZT.add(this.ZB, gridBagConstraints);
    this.Zu.setText(a(-30052, 28294));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.ZT.add(this.Zu, gridBagConstraints);
    this.ZL.Zi(Zk97.DESKTOP_FUNCTIONS_TARGET_ANALYZER);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZT.add(this.ZL, gridBagConstraints);
    this.ZM.setViewportView(this.ZT);
    this.Zq.addTab(a(-30058, -14446), this.ZM);
    getContentPane().add(this.Zq.ZO(), a(-30054, 17318));
    pack();
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.ZZ.Zx(new Zr6k(this.ZA, this.Zi, this, this.Zt, this.ZQ, this.ZP, this.Zk, this.ZK));
  }
  
  private void lambda$new$0(Window paramWindow) {
    pack();
    ZO(paramWindow);
    setVisible(true);
  }
  
  public static void Zf(int[] paramArrayOfint) {
    Zo = paramArrayOfint;
  }
  
  public static int[] Zp() {
    return Zo;
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_3
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic Zf : ([I)V
    //   15: ldc '+ÔÛ\\bÒkAÎÒósÿZ»`Á[=OM>IÜéåÎ²b}ÕÊ«Ïÿþ[8Î^8¹ÚM!j|úí¡b,¦cÅú2XâìùÄÉç?SõFç ÚO\\f­Ìì|Oa9ª®Ńo[%ô:ÎªC¡çì ¢=·$rî<®³ OìþO.¤oÆkÚrR*(!Kâ\\t5|¿`§×oÅÉ-úêÀgÌÀ5±¶ø¹þñ$c±Â¤S¹E³²pE j8>Òâ¿©m^\ \z p(Sâ/>S¦M86ÿ¥;¼k!¬¢\\n)­¸ÈÁÄÆV zù¾±p¹00I)å\»ÌgØ'±÷}X;µrùÿ<è<CÓùWÁ5:)(+ØeÉzÙ@ÌÒîd½·ëû×YMbÛçpÕ\\rÎí&Ó6?¥ Í3xØ,fñMeÊB¡:ßgA°ÐníYö>Ò<¿jÀ¼gÕ§^ÑÐ# \\fÂþ¶NRýÕëøW`b_\\bP¡EägI\\nÅßkølóE¯e ZU¼sµÀ¼í:j§V4´u8tß½BÕxøl¶7÷Ýæ§@§_S~7½òÇÈÁwÖ+'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #6
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #100
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '~¥êp:*!ß]È÷_à(I¬½7ê¾³Òªh¿¨¼.¸BÒS\\rýK¹¸Y'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #33
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #67
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zl4u.a : [Ljava/lang/String;
    //   138: bipush #16
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zl4u.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #50
    //   222: goto -> 252
    //   225: bipush #14
    //   227: goto -> 252
    //   230: bipush #85
    //   232: goto -> 252
    //   235: bipush #6
    //   237: goto -> 252
    //   240: bipush #109
    //   242: goto -> 252
    //   245: bipush #115
    //   247: goto -> 252
    //   250: bipush #8
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8A9A) & 0xFFFF;
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
      byte b1 = 115;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */