package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.HashSet;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbrw extends Zbg2 {
  private final Zs14 Zd;
  
  private final Zbiw Zi;
  
  private final Zerg ZC;
  
  private Zm99 Zt;
  
  private Zm2o Zf;
  
  private Zzdy Zo;
  
  private Zzdy ZD;
  
  private Zzdy ZM;
  
  private Zzdy ZF;
  
  private Zzdy ZK;
  
  private Zzdy ZE;
  
  private Zzdy ZW;
  
  private Zzdy Zm;
  
  private Zl8w ZX;
  
  private Zm9v Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbrw(Zs14 paramZs14, Zbiw paramZbiw, Zerg paramZerg) {
    this.Zd = paramZs14;
    this.Zi = paramZbiw;
    this.ZC = paramZerg;
    Zt();
    this.ZB = new String[] { a(931, -8478), a(930, -923) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  public void ZC() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zd : Lburp/Zs14;
    //   4: invokevirtual Zi : ()Lburp/Zr_4;
    //   7: getstatic burp/Zzir.Zg : Lburp/Zeu4;
    //   10: invokeinterface Zj : (Lburp/Zeu4;)Lburp/Zgpi;
    //   15: checkcast burp/Zzir
    //   18: astore_2
    //   19: aload_0
    //   20: aload_2
    //   21: invokevirtual Zq : (Lburp/Zzir;)Z
    //   24: istore_3
    //   25: aload_0
    //   26: aload_2
    //   27: invokevirtual ZR : (Lburp/Zzir;)Z
    //   30: istore #4
    //   32: aload_0
    //   33: aload_2
    //   34: invokevirtual Zr : (Lburp/Zzir;)Z
    //   37: istore #5
    //   39: invokestatic Zo : ()Z
    //   42: aload_0
    //   43: aload_2
    //   44: invokevirtual ZA : (Lburp/Zzir;)Z
    //   47: istore #6
    //   49: istore_1
    //   50: aload_0
    //   51: aload_2
    //   52: invokevirtual Zt : (Lburp/Zzir;)Z
    //   55: istore #7
    //   57: aload_0
    //   58: aload_2
    //   59: invokevirtual ZS : (Lburp/Zzir;)Z
    //   62: istore #8
    //   64: aload_0
    //   65: aload_2
    //   66: invokevirtual ZM : (Lburp/Zzir;)Z
    //   69: istore #9
    //   71: aload_0
    //   72: aload_0
    //   73: getfield ZW : Lburp/Zzdy;
    //   76: iload_3
    //   77: ifeq -> 97
    //   80: aload_0
    //   81: getfield ZC : Lburp/Zerg;
    //   84: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   87: invokevirtual ZU : (Lburp/Zeew;)Z
    //   90: ifeq -> 97
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   101: aload_0
    //   102: aload_0
    //   103: getfield ZF : Lburp/Zzdy;
    //   106: iload #4
    //   108: ifeq -> 128
    //   111: aload_0
    //   112: getfield ZC : Lburp/Zerg;
    //   115: getstatic burp/Zeew.PROXY : Lburp/Zeew;
    //   118: invokevirtual ZU : (Lburp/Zeew;)Z
    //   121: ifeq -> 128
    //   124: iconst_1
    //   125: goto -> 129
    //   128: iconst_0
    //   129: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   132: aload_0
    //   133: aload_0
    //   134: getfield ZE : Lburp/Zzdy;
    //   137: iload #5
    //   139: ifeq -> 159
    //   142: aload_0
    //   143: getfield ZC : Lburp/Zerg;
    //   146: getstatic burp/Zeew.DASHBOARD : Lburp/Zeew;
    //   149: invokevirtual ZU : (Lburp/Zeew;)Z
    //   152: ifeq -> 159
    //   155: iconst_1
    //   156: goto -> 160
    //   159: iconst_0
    //   160: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   163: aload_0
    //   164: aload_0
    //   165: getfield ZK : Lburp/Zzdy;
    //   168: iload #6
    //   170: ifeq -> 190
    //   173: aload_0
    //   174: getfield ZC : Lburp/Zerg;
    //   177: getstatic burp/Zeew.REPEATER : Lburp/Zeew;
    //   180: invokevirtual ZU : (Lburp/Zeew;)Z
    //   183: ifeq -> 190
    //   186: iconst_1
    //   187: goto -> 191
    //   190: iconst_0
    //   191: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   194: aload_0
    //   195: aload_0
    //   196: getfield Zo : Lburp/Zzdy;
    //   199: iload #7
    //   201: ifeq -> 221
    //   204: aload_0
    //   205: getfield ZC : Lburp/Zerg;
    //   208: getstatic burp/Zeew.COLLABORATOR : Lburp/Zeew;
    //   211: invokevirtual ZU : (Lburp/Zeew;)Z
    //   214: ifeq -> 221
    //   217: iconst_1
    //   218: goto -> 222
    //   221: iconst_0
    //   222: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   225: aload_0
    //   226: aload_0
    //   227: getfield ZM : Lburp/Zzdy;
    //   230: iload #8
    //   232: ifeq -> 252
    //   235: aload_0
    //   236: getfield ZC : Lburp/Zerg;
    //   239: getstatic burp/Zeew.ORGANISER : Lburp/Zeew;
    //   242: invokevirtual ZU : (Lburp/Zeew;)Z
    //   245: ifeq -> 252
    //   248: iconst_1
    //   249: goto -> 253
    //   252: iconst_0
    //   253: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   256: aload_0
    //   257: aload_0
    //   258: getfield ZD : Lburp/Zzdy;
    //   261: iload #9
    //   263: ifeq -> 283
    //   266: aload_0
    //   267: getfield ZC : Lburp/Zerg;
    //   270: getstatic burp/Zeew.EXTENDER : Lburp/Zeew;
    //   273: invokevirtual ZU : (Lburp/Zeew;)Z
    //   276: ifeq -> 283
    //   279: iconst_1
    //   280: goto -> 284
    //   283: iconst_0
    //   284: invokevirtual Za : (Lburp/Zzdy;Z)V
    //   287: iload_3
    //   288: ifne -> 353
    //   291: iload #4
    //   293: ifne -> 353
    //   296: iload #5
    //   298: ifne -> 353
    //   301: iload #6
    //   303: ifne -> 353
    //   306: iload #7
    //   308: ifne -> 353
    //   311: iload #8
    //   313: ifne -> 353
    //   316: iload #9
    //   318: ifne -> 353
    //   321: aload_0
    //   322: getfield Zl : Lburp/Zm9v;
    //   325: iconst_1
    //   326: invokevirtual setVisible : (Z)V
    //   329: aload_0
    //   330: getfield Zi : Lburp/Zbiw;
    //   333: iconst_1
    //   334: sipush #941
    //   337: sipush #25768
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: iconst_0
    //   344: invokeinterface Zx : (ILjava/lang/String;Z)V
    //   349: iload_1
    //   350: ifeq -> 361
    //   353: aload_0
    //   354: getfield Zl : Lburp/Zm9v;
    //   357: iconst_0
    //   358: invokevirtual setVisible : (Z)V
    //   361: invokestatic Zwu : ()[Lburp/Zbqc;
    //   364: ifnonnull -> 379
    //   367: iload_1
    //   368: ifeq -> 375
    //   371: iconst_0
    //   372: goto -> 376
    //   375: iconst_1
    //   376: invokestatic Zt : (Z)V
    //   379: return
  }
  
  private boolean Zq(Zzir paramZzir) {
    return !paramZzir.Zvm().Zwx().Zl6();
  }
  
  private boolean ZR(Zzir paramZzir) {
    return (!paramZzir.Zvu().ZGl().isEmpty() || !paramZzir.Zvu().ZGW().isEmpty());
  }
  
  private boolean Zr(Zzir paramZzir) {
    return !paramZzir.Zv9().ZV_().isEmpty();
  }
  
  private boolean ZA(Zzir paramZzir) {
    Zefg<Zlx1> zefg = paramZzir.Zvj().Ziv();
    return zefg.isEmpty() ? false : ((zefg.size() > 1 || ((Zlx1)zefg.get(0)).ZqH()));
  }
  
  private boolean Zt(Zzir paramZzir) {
    Zefg<Zmx> zefg = paramZzir.Zvl().ZI();
    return zefg.stream().anyMatch(Zbrw::lambda$collaboratorDataPresent$0);
  }
  
  private boolean ZS(Zzir paramZzir) {
    return (paramZzir.ZvA().ZsI().size() > 0);
  }
  
  private boolean ZM(Zzir paramZzir) {
    return (paramZzir.Zvo().ZoK() > 0);
  }
  
  private void Za(Zzdy paramZzdy, boolean paramBoolean) {
    paramZzdy.setSelected(paramBoolean);
    paramZzdy.setEnabled(paramBoolean);
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return this.Zd.ZZ(this);
      case 1:
        return this.Zd.Zt(this);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  Set<Zeew> Zk() {
    HashSet<Zeew> hashSet = new HashSet();
    if (this.ZW.isSelected())
      hashSet.add(Zeew.TARGET); 
    if (this.ZF.isSelected())
      hashSet.add(Zeew.PROXY); 
    if (this.ZE.isSelected())
      hashSet.add(Zeew.SCANNER); 
    if (this.ZK.isSelected())
      hashSet.add(Zeew.REPEATER); 
    if (this.Zo.isSelected())
      hashSet.add(Zeew.COLLABORATOR); 
    if (this.ZM.isSelected())
      hashSet.add(Zeew.ORGANISER); 
    if (this.ZD.isSelected())
      hashSet.add(Zeew.EXTENDER); 
    return hashSet;
  }
  
  boolean Zj() {
    return this.Zm.isSelected();
  }
  
  private void Zt() {
    this.Zf = new Zm2o();
    this.ZX = new Zl8w();
    this.ZW = new Zzdy();
    this.ZF = new Zzdy();
    this.ZE = new Zzdy();
    this.ZK = new Zzdy();
    this.Zo = new Zzdy();
    this.ZM = new Zzdy();
    this.ZD = new Zzdy();
    this.Zt = new Zm99();
    this.Zm = new Zzdy();
    this.Zl = new Zm9v();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zf.Zi(Zk97.DESKTOP_GETTING_STARTED_PROJECTS_IMPORTING_PROJECTS);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zf, gridBagConstraints);
    this.ZX.setText(Zrgs.IMPORT_PROJECT_SELECT_TOOLS.ZN(new Object[0]));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.ZW.setText(a(940, 7605));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZW, gridBagConstraints);
    this.ZF.setText(a(942, -21624));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    add(this.ZF, gridBagConstraints);
    this.ZE.setText(a(929, -18254));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    add(this.ZE, gridBagConstraints);
    this.ZK.setText(a(937, -32442));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 18;
    add(this.ZK, gridBagConstraints);
    this.Zo.setText(a(938, -29077));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 18;
    add(this.Zo, gridBagConstraints);
    this.ZM.setText(a(939, 5615));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 18;
    add(this.ZM, gridBagConstraints);
    this.ZD.setText(a(943, -13016));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.anchor = 18;
    add(this.ZD, gridBagConstraints);
    this.Zt.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 23;
    add(this.Zt, gridBagConstraints);
    this.Zm.setText(a(936, 17973));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zm, gridBagConstraints);
    this.Zl.setText(Zrgs.IMPORT_PROJECT_NO_IMPORTABLE_DATA.ZN(new Object[0]));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 20;
    gridBagConstraints.anchor = 25;
    add(this.Zl, gridBagConstraints);
  }
  
  private static boolean lambda$collaboratorDataPresent$0(Zmx paramZmx) {
    return !paramZmx.Zp().isEmpty();
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'å¯\\r#s%Ñ\\f\\fìÊy,crë¢\\b4Ûr«ÅcÂÙ 9ß7áÉà#Ã±£âBDÂ_©\ÅÇêÁE¡)b!+WW·iÚ(Ì¹9ó¨C¨ªÖ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc 'GÜø\\b[\\f¶<'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #66
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
    //   128: putstatic burp/Zbrw.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbrw.b : [Ljava/lang/String;
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
    //   212: bipush #37
    //   214: goto -> 244
    //   217: bipush #56
    //   219: goto -> 244
    //   222: bipush #101
    //   224: goto -> 244
    //   227: bipush #11
    //   229: goto -> 244
    //   232: bipush #97
    //   234: goto -> 244
    //   237: bipush #62
    //   239: goto -> 244
    //   242: bipush #29
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
    int i = (paramInt1 ^ 0x3AB) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbrw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */