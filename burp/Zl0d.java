package burp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Zl0d extends Zl04 {
  private final Zmuy ZJ;
  
  private final Zbws Zr;
  
  private final Zsh8 Za;
  
  private final Zldc ZO;
  
  private final Zzm6 Zv;
  
  private Zgxp Zg;
  
  private Ze01 ZT;
  
  private Zbqc Zl;
  
  private Ze01 Zo;
  
  private Zbqc Zz;
  
  private Zbqc ZA;
  
  private Zl86 ZH;
  
  private static int Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl0d(Zbws paramZbws, Zmuy paramZmuy, Zsh8 paramZsh8, int paramInt, Ztyg paramZtyg, Zey9 paramZey9, Zxco paramZxco) {
    this.Zr = paramZbws;
    this.ZJ = paramZmuy;
    int i = ZN();
    this.Za = paramZsh8;
    Zz();
    this.ZO = new Zldc(paramZsh8, paramZtyg, paramZey9, paramZxco);
    Zmse.Zf(this.ZO.Zx(), 100, 20);
    add(this.ZO.Zx(), a(17471, 12300));
    Objects.requireNonNull(this.ZO);
    this.Zv = this.ZO::Zd;
    paramZmuy.Zu(this.Zv);
    addWindowListener(new Zlir(this, paramZmuy));
    pack();
    ZO(Zt2m.ZF(paramZbws));
    Zu(paramZmuy.ZW(paramZbws.convertRowIndexToModel(paramInt)));
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private void Zu(Zgxp paramZgxp) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield Zg : Lburp/Zgxp;
    //   5: invokestatic ZN : ()I
    //   8: aload_0
    //   9: getfield ZO : Lburp/Zldc;
    //   12: aload_1
    //   13: invokevirtual ZE : (Lburp/Zgxp;)V
    //   16: istore_2
    //   17: aload_0
    //   18: aload_1
    //   19: invokeinterface Zep : ()I
    //   24: sipush #17458
    //   27: sipush #540
    //   30: invokestatic a : (II)Ljava/lang/String;
    //   33: swap
    //   34: sipush #17464
    //   37: sipush #28263
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   48: invokevirtual setTitle : (Ljava/lang/String;)V
    //   51: new java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore_3
    //   59: aload_1
    //   60: invokeinterface Zer : ()S
    //   65: iconst_m1
    //   66: if_icmpne -> 87
    //   69: aload_3
    //   70: sipush #17457
    //   73: sipush #-29757
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: iload_2
    //   84: ifne -> 381
    //   87: aload_0
    //   88: getfield Za : Lburp/Zsh8;
    //   91: invokeinterface ZPa : ()Lburp/Zejb;
    //   96: getstatic burp/Zejb.SNIPER : Lburp/Zejb;
    //   99: if_acmpne -> 157
    //   102: aload_0
    //   103: getfield Za : Lburp/Zsh8;
    //   106: invokeinterface ZPJ : ()Lburp/Zstu;
    //   111: aload_0
    //   112: getfield Za : Lburp/Zsh8;
    //   115: invokeinterface ZPq : ()Lburp/Zrte;
    //   120: invokestatic Z_ : (Lburp/Zstu;Lburp/Zrte;)I
    //   123: iconst_1
    //   124: if_icmple -> 157
    //   127: aload_3
    //   128: sipush #17462
    //   131: sipush #-18561
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload_1
    //   141: invokeinterface Zer : ()S
    //   146: iconst_1
    //   147: iadd
    //   148: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   151: ldc '\\n'
    //   153: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_0
    //   158: getfield Za : Lburp/Zsh8;
    //   161: invokeinterface ZPa : ()Lburp/Zejb;
    //   166: getstatic burp/Zejb.SNIPER : Lburp/Zejb;
    //   169: if_acmpne -> 221
    //   172: aload_3
    //   173: sipush #17463
    //   176: sipush #13278
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: aload_1
    //   186: invokeinterface Ze9 : ()Lburp/Zxph;
    //   191: aload_1
    //   192: invokeinterface Zer : ()S
    //   197: invokestatic valueOf : (S)Ljava/lang/Short;
    //   200: invokeinterface Zm : (Ljava/lang/Number;)[B
    //   205: invokestatic ZG : ([B)Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: ldc '\\n'
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: iload_2
    //   218: ifne -> 381
    //   221: aload_0
    //   222: getfield Za : Lburp/Zsh8;
    //   225: invokeinterface ZPa : ()Lburp/Zejb;
    //   230: getstatic burp/Zejb.BATTERING_RAM : Lburp/Zejb;
    //   233: if_acmpeq -> 251
    //   236: aload_1
    //   237: invokeinterface Ze9 : ()Lburp/Zxph;
    //   242: invokeinterface Zxp : ()I
    //   247: iconst_1
    //   248: if_icmpne -> 295
    //   251: aload_3
    //   252: sipush #17468
    //   255: sipush #20721
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: aload_1
    //   265: invokeinterface Ze9 : ()Lburp/Zxph;
    //   270: iconst_0
    //   271: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   274: invokeinterface Zm : (Ljava/lang/Number;)[B
    //   279: invokestatic ZG : ([B)Ljava/lang/String;
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: ldc '\\n'
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: iload_2
    //   292: ifne -> 381
    //   295: iconst_0
    //   296: istore #4
    //   298: iload #4
    //   300: aload_1
    //   301: invokeinterface Ze9 : ()Lburp/Zxph;
    //   306: invokeinterface Zxp : ()I
    //   311: if_icmpge -> 381
    //   314: aload_3
    //   315: sipush #17469
    //   318: sipush #1287
    //   321: invokestatic a : (II)Ljava/lang/String;
    //   324: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: iload #4
    //   329: iconst_1
    //   330: iadd
    //   331: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   334: sipush #17470
    //   337: sipush #4484
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_1
    //   347: invokeinterface Ze9 : ()Lburp/Zxph;
    //   352: iload #4
    //   354: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   357: invokeinterface Zm : (Ljava/lang/Number;)[B
    //   362: invokestatic ZG : ([B)Ljava/lang/String;
    //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: ldc '\\n'
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: iinc #4, 1
    //   377: iload_2
    //   378: ifne -> 298
    //   381: aload_3
    //   382: sipush #17460
    //   385: sipush #13027
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: aload_1
    //   395: invokeinterface Zl7 : ()S
    //   400: ifne -> 408
    //   403: ldc '-'
    //   405: goto -> 417
    //   408: aload_1
    //   409: invokeinterface Zl7 : ()S
    //   414: invokestatic toString : (S)Ljava/lang/String;
    //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: ldc '\\n'
    //   422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: aload_3
    //   427: sipush #17455
    //   430: sipush #24885
    //   433: invokestatic a : (II)Ljava/lang/String;
    //   436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: aload_1
    //   440: invokeinterface Zlq : ()I
    //   445: ifne -> 453
    //   448: ldc '-'
    //   450: goto -> 462
    //   453: aload_1
    //   454: invokeinterface Zlq : ()I
    //   459: invokestatic toString : (I)Ljava/lang/String;
    //   462: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: ldc '\\n'
    //   467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload_3
    //   472: sipush #17454
    //   475: sipush #-5438
    //   478: invokestatic a : (II)Ljava/lang/String;
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   484: aload_1
    //   485: invokeinterface Zey : ()J
    //   490: ldc2_w -1
    //   493: lcmp
    //   494: ifne -> 502
    //   497: ldc '-'
    //   499: goto -> 511
    //   502: aload_1
    //   503: invokeinterface Zey : ()J
    //   508: invokestatic toString : (J)Ljava/lang/String;
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: pop
    //   515: aload_1
    //   516: invokeinterface Ze4 : ()Z
    //   521: ifeq -> 538
    //   524: aload_3
    //   525: sipush #17459
    //   528: sipush #26461
    //   531: invokestatic a : (II)Ljava/lang/String;
    //   534: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   537: pop
    //   538: aload_1
    //   539: invokeinterface ZeZ : ()Z
    //   544: ifeq -> 561
    //   547: aload_3
    //   548: sipush #17465
    //   551: sipush #-12768
    //   554: invokestatic a : (II)Ljava/lang/String;
    //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: pop
    //   561: aload_0
    //   562: getfield ZH : Lburp/Zl86;
    //   565: aload_3
    //   566: invokevirtual toString : ()Ljava/lang/String;
    //   569: invokevirtual setText : (Ljava/lang/String;)V
    //   572: return
  }
  
  private void Zz() {
    this.Zz = new Zbqc();
    this.ZA = new Zbqc();
    this.Zl = new Zbqc();
    this.Zo = new Ze01();
    this.ZT = new Ze01();
    this.ZH = new Zl86();
    setDefaultCloseOperation(2);
    this.Zz.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.Zz.setLayout(new BorderLayout());
    this.ZA.setLayout(new BorderLayout());
    this.Zl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.Zl.setLayout(new GridLayout(0, 1, 5, 5));
    this.Zo.setText(a(17461, 17662));
    this.Zo.addActionListener(new Zene(this));
    this.Zl.add(this.Zo);
    this.ZT.setText(a(17456, -12318));
    this.ZT.addActionListener(new Zzpx(this));
    this.Zl.add(this.ZT);
    this.ZA.add(this.Zl, a(17453, -32068));
    this.Zz.add(this.ZA, a(17467, 29549));
    this.ZH.setBorder((Border)null);
    this.ZH.setEditable(false);
    this.ZH.setOpaque(false);
    this.Zz.add(this.ZH, a(17452, 4132));
    getContentPane().add(this.Zz, a(17466, -3578));
    pack();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    int i = this.ZJ.Zj(this.Zg);
    if (i == -1)
      return; 
    i = this.Zr.convertRowIndexToView(i);
    if (i == -1)
      return; 
    if (++i >= this.Zr.getModel().getRowCount())
      return; 
    i = this.Zr.convertRowIndexToModel(i);
    if (i == -1)
      return; 
    Zgxp zgxp = this.ZJ.ZW(i);
    if (zgxp != null)
      Zu(zgxp); 
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    int i = this.ZJ.Zj(this.Zg);
    if (i == -1)
      return; 
    i = this.Zr.convertRowIndexToView(i);
    if (i == -1)
      return; 
    if (--i < 0)
      return; 
    i = this.Zr.convertRowIndexToModel(i);
    if (i == -1)
      return; 
    Zgxp zgxp = this.ZJ.ZW(i);
    if (zgxp != null)
      Zu(zgxp); 
  }
  
  public static void ZD(int paramInt) {
    Zh = paramInt;
  }
  
  public static int ZD() {
    return Zh;
  }
  
  public static int ZN() {
    int i = ZD();
    return (i == 0) ? 107 : 0;
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_0
    //   10: ldc 'òxDdÂ& \\t×«Ö`[6¡,\\bëþQÊ«Ñ(üÛe¹@¸L¸åÖ8¶¦«óãlë°:Àété{a@ûççà ´ùl\\n\\fÑ§å%_âN\\ty7óáöaïÆ\\r}!øR³r6*/j\\bÒ2$^[AÜgPØ÷a!5;äÿð+#jøÆÄrÊ'ùQwÌSkñ²b,XÃ8æ'ªø·§|ú%ë%@¤úÞgo¢åA= úl8\¹¾\\bJÓ­Î'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic ZD : (I)V
    //   22: iconst_2
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #54
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'LTõ5ö7f*8'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #6
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #6
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zl0d.a : [Ljava/lang/String;
    //   135: bipush #20
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zl0d.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #53
    //   218: goto -> 248
    //   221: bipush #31
    //   223: goto -> 248
    //   226: bipush #89
    //   228: goto -> 248
    //   231: bipush #39
    //   233: goto -> 248
    //   236: bipush #99
    //   238: goto -> 248
    //   241: bipush #28
    //   243: goto -> 248
    //   246: bipush #39
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x443E) & 0xFFFF;
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
      byte b1 = 85;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */