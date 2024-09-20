package burp;

import java.awt.Component;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ze3r implements Zmvm {
  private final Zx8n ZU;
  
  private final Zkvh ZR;
  
  private final Zlte ZT;
  
  private final Zbc9 ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze3r(Zx8n paramZx8n, Zkvh paramZkvh, List<Zzyu> paramList, Zeh6 paramZeh6, Zsob paramZsob, Zgwj paramZgwj, Zbc9 paramZbc9, Zxg0 paramZxg0, Zroz paramZroz) {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore #10
    //   5: aload_0
    //   6: invokespecial <init> : ()V
    //   9: aload_1
    //   10: ifnull -> 17
    //   13: iconst_1
    //   14: goto -> 18
    //   17: iconst_0
    //   18: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   21: lconst_1
    //   22: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   25: aload_2
    //   26: ifnull -> 33
    //   29: iconst_1
    //   30: goto -> 34
    //   33: iconst_0
    //   34: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   37: ldc2_w 2
    //   40: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   43: aload #6
    //   45: ifnull -> 52
    //   48: iconst_1
    //   49: goto -> 53
    //   52: iconst_0
    //   53: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   56: ldc2_w 4
    //   59: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   62: aload_0
    //   63: aload_1
    //   64: putfield ZU : Lburp/Zx8n;
    //   67: aload_0
    //   68: aload_2
    //   69: putfield ZR : Lburp/Zkvh;
    //   72: aload_0
    //   73: aload #7
    //   75: putfield ZF : Lburp/Zbc9;
    //   78: new burp/Ztge
    //   81: dup
    //   82: aload #9
    //   84: invokespecial <init> : (Lburp/Zzc2;)V
    //   87: astore #11
    //   89: aload_2
    //   90: invokeinterface Zxi : ()Lburp/Ztal;
    //   95: astore #12
    //   97: aload #9
    //   99: <illegal opcode> test : (Lburp/Zroz;)Ljava/util/function/Predicate;
    //   104: astore #13
    //   106: aload_0
    //   107: invokestatic Zp : ()Lburp/Zrxv;
    //   110: invokevirtual Zh : ()Lburp/Zrxv;
    //   113: invokevirtual ZP : ()Lburp/Zrxv;
    //   116: aload #13
    //   118: invokevirtual Z_ : (Ljava/util/function/Predicate;)Lburp/Zrxv;
    //   121: aload #11
    //   123: invokevirtual Ze : (Lburp/Zzc2;)Lburp/Zrxv;
    //   126: aload #9
    //   128: invokevirtual Zv : (Lburp/Zrsj;)Lburp/Zrxv;
    //   131: invokevirtual ZQ : ()Lburp/Zrxv;
    //   134: invokevirtual ZX : ()Lburp/Zrxv;
    //   137: invokevirtual ZV : ()Lburp/Zrxv;
    //   140: invokevirtual ZI : ()Lburp/Zrxv;
    //   143: invokevirtual Zs : ()Lburp/Zrxv;
    //   146: invokevirtual ZG : ()Lburp/Zrxv;
    //   149: aload #6
    //   151: invokevirtual ZO : (Lburp/Zgwj;)Lburp/Zrxv;
    //   154: new burp/Zg2m
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: invokevirtual ZH : (Lburp/Ztca;)Lburp/Zrxv;
    //   164: invokevirtual ZW : ()Lburp/Zlte;
    //   167: putfield ZT : Lburp/Zlte;
    //   170: aload_0
    //   171: getfield ZT : Lburp/Zlte;
    //   174: sipush #-22232
    //   177: sipush #21718
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: invokeinterface setName : (Ljava/lang/String;)V
    //   188: aload_0
    //   189: getfield ZT : Lburp/Zlte;
    //   192: aload #12
    //   194: invokeinterface Zr : (Lburp/Ztal;)V
    //   199: aload #9
    //   201: aload_0
    //   202: getfield ZT : Lburp/Zlte;
    //   205: invokevirtual Za : (Lburp/Zlte;)V
    //   208: aload #12
    //   210: getstatic burp/Ztal.WRAPPED : Lburp/Ztal;
    //   213: if_acmpne -> 227
    //   216: getstatic burp/Zrrh.REPEATER_UI_WRAPPED_TAB_LAYOUT_SELECTED : Lburp/Zrrh;
    //   219: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   222: aload #10
    //   224: ifnull -> 241
    //   227: aload #12
    //   229: getstatic burp/Ztal.SCROLLING : Lburp/Ztal;
    //   232: if_acmpne -> 241
    //   235: getstatic burp/Zrrh.REPEATER_UI_SCROLLING_TAB_LAYOUT_SELECTED : Lburp/Zrrh;
    //   238: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   241: aload #7
    //   243: aload_0
    //   244: getfield ZT : Lburp/Zlte;
    //   247: invokevirtual ZU : (Lburp/Zrog;)V
    //   250: aload #5
    //   252: invokevirtual Zh : ()I
    //   255: ifle -> 262
    //   258: iconst_1
    //   259: goto -> 263
    //   262: iconst_0
    //   263: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   266: aload #5
    //   268: invokevirtual Zh : ()I
    //   271: i2l
    //   272: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   275: aload #9
    //   277: invokevirtual ZF : ()Ljava/util/List;
    //   280: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   285: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   290: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   295: invokeinterface toList : ()Ljava/util/List;
    //   300: astore #14
    //   302: iconst_0
    //   303: istore #15
    //   305: iload #15
    //   307: aload #5
    //   309: invokevirtual Zh : ()I
    //   312: if_icmpge -> 391
    //   315: aload #5
    //   317: iload #15
    //   319: invokevirtual ZE : (I)Lburp/Zggb;
    //   322: astore #16
    //   324: aload #16
    //   326: invokevirtual Zm : ()Z
    //   329: ifeq -> 354
    //   332: aload #9
    //   334: iload #15
    //   336: invokevirtual Zi : (I)Lburp/Zzb7;
    //   339: astore #17
    //   341: aload_0
    //   342: iload #15
    //   344: aload #17
    //   346: invokevirtual Za : (ILburp/Zr6e;)V
    //   349: aload #10
    //   351: ifnull -> 383
    //   354: aload_3
    //   355: aload #16
    //   357: invokevirtual Zc : ()I
    //   360: invokeinterface get : (I)Ljava/lang/Object;
    //   365: checkcast burp/Zzyu
    //   368: astore #17
    //   370: aload_0
    //   371: aload #17
    //   373: invokevirtual ZM : (Lburp/Zzyu;)V
    //   376: aload #17
    //   378: invokeinterface ZO : ()V
    //   383: iinc #15, 1
    //   386: aload #10
    //   388: ifnull -> 305
    //   391: aload #14
    //   393: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   398: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   403: aload_3
    //   404: invokeinterface size : ()I
    //   409: iconst_1
    //   410: if_icmpne -> 440
    //   413: aload_3
    //   414: iconst_0
    //   415: invokeinterface get : (I)Ljava/lang/Object;
    //   420: checkcast burp/Zzyu
    //   423: invokeinterface Zv : ()Lburp/Zlx1;
    //   428: invokeinterface ZqH : ()Z
    //   433: ifne -> 440
    //   436: iconst_1
    //   437: goto -> 441
    //   440: iconst_0
    //   441: istore #15
    //   443: iload #15
    //   445: aload #8
    //   447: invokevirtual Zz : ()Z
    //   450: ifne -> 457
    //   453: iconst_1
    //   454: goto -> 458
    //   457: iconst_0
    //   458: iand
    //   459: istore #16
    //   461: iload #16
    //   463: ifeq -> 491
    //   466: aload_0
    //   467: aload #7
    //   469: aload #8
    //   471: invokevirtual Zc : (Lburp/Zbc9;Lburp/Zxg0;)Lburp/Zbcd;
    //   474: astore #17
    //   476: aload #7
    //   478: aload #17
    //   480: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   483: pop
    //   484: aload #7
    //   486: aload #17
    //   488: invokevirtual ZP : (Ljava/awt/Component;)V
    //   491: new java/util/concurrent/atomic/AtomicInteger
    //   494: dup
    //   495: aload #4
    //   497: invokeinterface ZEi : ()I
    //   502: invokespecial <init> : (I)V
    //   505: astore #17
    //   507: aload #17
    //   509: invokevirtual get : ()I
    //   512: aload #5
    //   514: invokevirtual Zh : ()I
    //   517: if_icmplt -> 551
    //   520: iconst_0
    //   521: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   524: aload #17
    //   526: invokevirtual get : ()I
    //   529: i2l
    //   530: aload #5
    //   532: invokevirtual Zh : ()I
    //   535: i2l
    //   536: invokestatic ZC : (ZLnet/portswigger/Zqf;JJ)V
    //   539: aload #17
    //   541: aload #5
    //   543: invokevirtual Zh : ()I
    //   546: iconst_1
    //   547: isub
    //   548: invokevirtual set : (I)V
    //   551: aload_0
    //   552: aload #17
    //   554: aload #9
    //   556: <illegal opcode> run : (Lburp/Ze3r;Ljava/util/concurrent/atomic/AtomicInteger;Lburp/Zroz;)Ljava/lang/Runnable;
    //   561: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   564: aload #11
    //   566: invokevirtual ZM : ()V
    //   569: invokestatic Zwu : ()[Lburp/Zbqc;
    //   572: ifnonnull -> 582
    //   575: iconst_4
    //   576: anewarray java/lang/String
    //   579: invokestatic ZY : ([Ljava/lang/String;)V
    //   582: return
  }
  
  private Zbcd Zc(Zbc9 paramZbc9, Zxg0 paramZxg0) {
    return new Zbcd(a(-22231, 28059), Zgzq.REPEATER_EMPTY_PANEL_LEFT_SIDE_ICON, Zgzq.REPEATER_EMPTY_PANEL_RIGHT_SIDE_ICON, a(-22230, 8201), a(-22229, -28688), Zlar.REPEATER_LEARN_MORE_INFO, new Zeid(this, paramZbc9, paramZxg0));
  }
  
  public void ZM(Zzyu paramZzyu) {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Ze3r;Lburp/Zzyu;)Ljava/lang/Runnable;
    //   11: astore_3
    //   12: invokestatic isEventDispatchThread : ()Z
    //   15: ifeq -> 26
    //   18: aload_3
    //   19: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   22: aload_2
    //   23: ifnull -> 32
    //   26: aload_3
    //   27: invokeinterface run : ()V
    //   32: return
  }
  
  private void Za(int paramInt, Zr6e paramZr6e) {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: iload_1
    //   6: aload_2
    //   7: <illegal opcode> run : (Lburp/Ze3r;ILburp/Zr6e;)Ljava/lang/Runnable;
    //   12: astore #4
    //   14: invokestatic isEventDispatchThread : ()Z
    //   17: ifeq -> 29
    //   20: aload #4
    //   22: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   25: aload_3
    //   26: ifnull -> 36
    //   29: aload #4
    //   31: invokeinterface run : ()V
    //   36: return
  }
  
  public void ZQ(Zzyu paramZzyu) {
    int i = this.ZT.indexOfComponent(paramZzyu.ZI());
    if (i == -1)
      return; 
    String str = paramZzyu.ZS();
    if (str != null)
      this.ZT.setTitleAt(i, str); 
    this.ZF.Zz(this.ZT);
  }
  
  public int Zs() {
    return this.ZT.getSelectedIndex();
  }
  
  public void ZT() {
    this.ZT.removeAll();
  }
  
  public void Zi(boolean paramBoolean) {
    this.ZU.ZD(-1, paramBoolean, true, true);
  }
  
  public void Zt2() {
    this.ZT.Zr(this.ZR.Zxi());
  }
  
  private void lambda$insertNewGroupTab$5(int paramInt, Zr6e paramZr6e) {
    this.ZT.Zt(paramInt, paramZr6e);
    this.ZF.Zz(this.ZT);
  }
  
  private void lambda$addNewRequesterPanel$4(Zzyu paramZzyu) {
    Component component = paramZzyu.ZI();
    this.ZT.Zg(paramZzyu.ZS(), component, paramZzyu);
    this.ZT.setSelectedComponent(component);
    this.ZF.Zz(this.ZT);
  }
  
  private void lambda$new$3(AtomicInteger paramAtomicInteger, Zroz paramZroz) {
    this.ZT.setSelectedIndex(paramAtomicInteger.get());
    paramZroz.Zw(paramAtomicInteger.get());
  }
  
  private static void lambda$new$2(Zr6e paramZr6e) {
    paramZr6e.Zo(false);
  }
  
  private static boolean lambda$new$1(Zzb7 paramZzb7) {
    return !paramZzb7.Zy7();
  }
  
  private static boolean lambda$new$0(Zroz paramZroz, Integer paramInteger) {
    return (paramZroz.Zi(paramInteger.intValue()) != null && paramZroz.Z_(paramInteger.intValue()).isPresent());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '4?H"Ó7dfÂ»°çÉ{U±*²>¦ú°ÀfhH×ÖÕi².ãs2ÌFNYËÚVô e>`\\f·­#Keð×°Jð.¦¸ÅY0_Iæ«k<6àQåõ^'2ÜÏ\\fåÁ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #99
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'jÛí\\r 8b½ñ{7!õ$A¥ûbX?k.\\bäbUàÅVoñg>ýxäÖ mÿ´¡wdIMÊ-TÖP.ªªeDS­×'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #20
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #97
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Ze3r.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ze3r.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #70
    //   214: goto -> 244
    //   217: bipush #99
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #96
    //   229: goto -> 244
    //   232: bipush #23
    //   234: goto -> 244
    //   237: bipush #57
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
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
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
    int i = (paramInt1 ^ 0xFFFFA92A) & 0xFFFF;
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
      char c = 'Ã';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze3r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */