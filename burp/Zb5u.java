package burp;

import java.awt.Component;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javax.swing.SwingUtilities;

public class Zb5u extends Zbqc implements Zx8l {
  private final Zxer ZX;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb5u(Zl04 paramZl04, ObservableList<Zg7g> paramObservableList, ObservableList<Zt3i> paramObservableList1, Zx_k paramZx_k, Consumer<Zzbb> paramConsumer) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: new burp/Zb51
    //   7: dup
    //   8: new burp/Zmij
    //   11: dup
    //   12: aload_2
    //   13: invokespecial <init> : (Ljavafx/collections/ObservableList;)V
    //   16: invokespecial <init> : (Lburp/Zmij;)V
    //   19: astore #6
    //   21: new java/awt/GridBagLayout
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #7
    //   30: aload_0
    //   31: aload #7
    //   33: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   36: new burp/Zm99
    //   39: dup
    //   40: sipush #-3795
    //   43: sipush #-9400
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokespecial <init> : (Ljava/lang/String;)V
    //   52: astore #8
    //   54: aload #8
    //   56: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   59: invokevirtual ZE : (Lburp/Zt00;)V
    //   62: new java/awt/GridBagConstraints
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #9
    //   71: aload #9
    //   73: iconst_0
    //   74: putfield gridy : I
    //   77: aload #9
    //   79: iconst_0
    //   80: putfield gridx : I
    //   83: aload #9
    //   85: iconst_3
    //   86: putfield gridwidth : I
    //   89: aload #9
    //   91: dconst_0
    //   92: putfield weighty : D
    //   95: aload #9
    //   97: dconst_1
    //   98: putfield weightx : D
    //   101: aload #9
    //   103: bipush #21
    //   105: putfield anchor : I
    //   108: aload #9
    //   110: iconst_2
    //   111: putfield fill : I
    //   114: aload #9
    //   116: new java/awt/Insets
    //   119: dup
    //   120: bipush #8
    //   122: iconst_0
    //   123: iconst_5
    //   124: iconst_0
    //   125: invokespecial <init> : (IIII)V
    //   128: putfield insets : Ljava/awt/Insets;
    //   131: aload_0
    //   132: aload #8
    //   134: aload #9
    //   136: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   139: new burp/Zm99
    //   142: dup
    //   143: sipush #-3799
    //   146: sipush #-27565
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: invokespecial <init> : (Ljava/lang/String;)V
    //   155: astore #10
    //   157: aload #9
    //   159: iconst_1
    //   160: putfield gridy : I
    //   163: aload #9
    //   165: iconst_0
    //   166: putfield gridx : I
    //   169: aload #9
    //   171: iconst_3
    //   172: putfield gridwidth : I
    //   175: aload #9
    //   177: dconst_0
    //   178: putfield weighty : D
    //   181: aload #9
    //   183: dconst_1
    //   184: putfield weightx : D
    //   187: aload #9
    //   189: bipush #21
    //   191: putfield anchor : I
    //   194: aload #9
    //   196: iconst_2
    //   197: putfield fill : I
    //   200: aload #9
    //   202: new java/awt/Insets
    //   205: dup
    //   206: iconst_0
    //   207: iconst_0
    //   208: iconst_5
    //   209: iconst_0
    //   210: invokespecial <init> : (IIII)V
    //   213: putfield insets : Ljava/awt/Insets;
    //   216: aload_0
    //   217: aload #10
    //   219: aload #9
    //   221: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   224: aload #9
    //   226: iconst_2
    //   227: putfield gridy : I
    //   230: aload #9
    //   232: new java/awt/Insets
    //   235: dup
    //   236: bipush #20
    //   238: iconst_0
    //   239: bipush #20
    //   241: iconst_0
    //   242: invokespecial <init> : (IIII)V
    //   245: putfield insets : Ljava/awt/Insets;
    //   248: aload_0
    //   249: new burp/Zem9
    //   252: dup
    //   253: invokespecial <init> : ()V
    //   256: aload #9
    //   258: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   261: getstatic burp/Zgzq.SCANNER_EMPTY_STATE : Lburp/Zgzq;
    //   264: sipush #-3807
    //   267: sipush #15753
    //   270: invokestatic a : (II)Ljava/lang/String;
    //   273: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   276: sipush #-3800
    //   279: sipush #-32313
    //   282: invokestatic a : (II)Ljava/lang/String;
    //   285: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   288: sipush #-3793
    //   291: sipush #-16566
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: aload #5
    //   299: <illegal opcode> run : (Ljava/util/function/Consumer;)Ljava/lang/Runnable;
    //   304: invokevirtual ZY : (Ljava/lang/String;Ljava/lang/Runnable;)Lburp/Zltn;
    //   307: sipush #-3796
    //   310: sipush #22706
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: invokevirtual ZE : (Ljava/lang/String;)Lburp/Zltn;
    //   319: invokevirtual Zi : ()Lburp/Zbcg;
    //   322: astore #11
    //   324: aload_0
    //   325: invokestatic Zp : ()Lburp/Zrxv;
    //   328: invokevirtual ZW : ()Lburp/Zlte;
    //   331: checkcast burp/Zxer
    //   334: putfield ZX : Lburp/Zxer;
    //   337: aload_0
    //   338: getfield ZX : Lburp/Zxer;
    //   341: sipush #-3808
    //   344: sipush #-6850
    //   347: invokestatic a : (II)Ljava/lang/String;
    //   350: invokevirtual setName : (Ljava/lang/String;)V
    //   353: aload_0
    //   354: getfield ZX : Lburp/Zxer;
    //   357: iconst_0
    //   358: invokevirtual setShowContentSeparators : (Z)V
    //   361: aload_0
    //   362: getfield ZX : Lburp/Zxer;
    //   365: sipush #-3806
    //   368: sipush #21538
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: aload #6
    //   376: invokevirtual addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   379: new burp/Zm2s
    //   382: dup
    //   383: sipush #-3804
    //   386: sipush #-30502
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: invokespecial <init> : (Ljava/lang/String;)V
    //   395: astore #12
    //   397: aload #4
    //   399: aload #12
    //   401: <illegal opcode> accept : (Lburp/Zm2s;)Ljava/util/function/Consumer;
    //   406: invokevirtual Zp : (Ljava/util/function/Consumer;)V
    //   409: new burp/Zb53
    //   412: dup
    //   413: aload_1
    //   414: aload #4
    //   416: invokespecial <init> : (Lburp/Zl04;Lburp/Zx_k;)V
    //   419: astore #13
    //   421: aload_0
    //   422: getfield ZX : Lburp/Zxer;
    //   425: sipush #-3803
    //   428: sipush #-31752
    //   431: invokestatic a : (II)Ljava/lang/String;
    //   434: aload #13
    //   436: invokevirtual addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   439: aload_0
    //   440: getfield ZX : Lburp/Zxer;
    //   443: aload_0
    //   444: getfield ZX : Lburp/Zxer;
    //   447: sipush #-3803
    //   450: sipush #-31752
    //   453: invokestatic a : (II)Ljava/lang/String;
    //   456: invokevirtual indexOfTab : (Ljava/lang/String;)I
    //   459: aload #12
    //   461: invokevirtual setTabComponentAt : (ILjava/awt/Component;)V
    //   464: new burp/Zb5i
    //   467: dup
    //   468: new burp/Zmi6
    //   471: dup
    //   472: aload_2
    //   473: aload_3
    //   474: invokespecial <init> : (Ljava/util/List;Ljavafx/collections/ObservableList;)V
    //   477: invokespecial <init> : (Lburp/Zmi6;)V
    //   480: astore #14
    //   482: aload_0
    //   483: getfield ZX : Lburp/Zxer;
    //   486: sipush #-3801
    //   489: sipush #-9250
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: aload #14
    //   497: invokevirtual addTab : (Ljava/lang/String;Ljava/awt/Component;)V
    //   500: new burp/Zbc9
    //   503: dup
    //   504: iconst_2
    //   505: anewarray java/awt/Component
    //   508: dup
    //   509: iconst_0
    //   510: aload #11
    //   512: aastore
    //   513: dup
    //   514: iconst_1
    //   515: aload_0
    //   516: getfield ZX : Lburp/Zxer;
    //   519: aastore
    //   520: invokespecial <init> : ([Ljava/awt/Component;)V
    //   523: astore #15
    //   525: aload #9
    //   527: iconst_3
    //   528: putfield gridy : I
    //   531: aload #9
    //   533: new java/awt/Insets
    //   536: dup
    //   537: iconst_0
    //   538: iconst_0
    //   539: iconst_0
    //   540: iconst_0
    //   541: invokespecial <init> : (IIII)V
    //   544: putfield insets : Ljava/awt/Insets;
    //   547: aload #9
    //   549: iconst_1
    //   550: putfield fill : I
    //   553: aload #9
    //   555: dconst_1
    //   556: putfield weightx : D
    //   559: aload #9
    //   561: dconst_1
    //   562: putfield weighty : D
    //   565: aload_0
    //   566: aload #15
    //   568: aload #9
    //   570: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   573: aload #15
    //   575: aload_2
    //   576: invokeinterface isEmpty : ()Z
    //   581: ifeq -> 589
    //   584: aload #11
    //   586: goto -> 593
    //   589: aload_0
    //   590: getfield ZX : Lburp/Zxer;
    //   593: invokevirtual ZP : (Ljava/awt/Component;)V
    //   596: aload_2
    //   597: aload_0
    //   598: aload #15
    //   600: aload_2
    //   601: aload #11
    //   603: <illegal opcode> invalidated : (Lburp/Zb5u;Lburp/Zbc9;Ljavafx/collections/ObservableList;Lburp/Zbcg;)Ljavafx/beans/InvalidationListener;
    //   608: invokeinterface addListener : (Ljavafx/beans/InvalidationListener;)V
    //   613: aload_0
    //   614: sipush #-3805
    //   617: sipush #31122
    //   620: invokestatic a : (II)Ljava/lang/String;
    //   623: invokevirtual setName : (Ljava/lang/String;)V
    //   626: return
  }
  
  public Zeuf ZL() {
    return Zeuf.WRENCH;
  }
  
  public Zze2 Zx() {
    return new Zze2(a(-3798, 21001), a(-3802, -30137));
  }
  
  public Component ZZ() {
    return this;
  }
  
  public String ZP() {
    return a(-3797, 3351);
  }
  
  public void Zs() {
    int i = this.ZX.indexOfTab(a(-3803, -31752));
    if (i != -1)
      this.ZX.setSelectedIndex(i); 
  }
  
  private void lambda$new$3(Zbc9 paramZbc9, ObservableList paramObservableList, Zbcg paramZbcg, Observable paramObservable) {
    paramZbc9.ZP(paramObservableList.isEmpty() ? paramZbcg : (Component)this.ZX);
  }
  
  private static void lambda$new$2(Zm2s paramZm2s, List paramList) {
    int[] arrayOfInt = Zt3i.Zu();
    if (paramList.stream().filter(Zgi::ZS).filter(Zgi::ZY).allMatch(Zgi::Ze)) {
      Objects.requireNonNull(paramZm2s);
      SwingUtilities.invokeLater(paramZm2s::ZX);
      if (arrayOfInt != null) {
        SwingUtilities.invokeLater(paramZm2s::lambda$new$1);
        return;
      } 
      return;
    } 
    SwingUtilities.invokeLater(paramZm2s::lambda$new$1);
  }
  
  private static void lambda$new$1(Zm2s paramZm2s) {
    paramZm2s.ZI(Zlkk.SEVERITY_MEDIUM);
  }
  
  private static void lambda$new$0(Consumer<Zzbb> paramConsumer) {
    paramConsumer.accept(Zzbb.API_FILE_PANEL);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ô´`>°÷-ÒóÛ÷#àlnË\\fÿF­_àææroÓQYù Vzªí\\nËìu Øk5MúÌÞ÷¡38?!ÁG869k£  zÉúÉWÔâ\\tõÍ´²½@d8÷°í!Å)zú0÷¯ée¿fÁ3çTe\\n§&¹#R¡HÅ¥§©W©À6/£!ûÊ§(»è¯ÿ(ü¿vh,±jt9yóu£yfYKªf²àvØÇâ\\fù'CZî|\\rGw½J? ¨åóÃ¹Pû·\\bJøá­æËTÓï²&eã¿lý=p>ÀtN°dáF\\rY©È³L{Á?k¹ôíÛ ¡j¼0Îiö'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #54
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #37
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
    //   68: ldc '\\fà+V¼:gßU:.;\(aè`RÛõ{æú]BÊ0÷Úä 2\\nºHhæà{É²¢'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #25
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #23
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
    //   129: putstatic burp/Zb5u.a : [Ljava/lang/String;
    //   132: bipush #15
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb5u.b : [Ljava/lang/String;
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
    //   212: bipush #72
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #67
    //   234: goto -> 244
    //   237: bipush #112
    //   239: goto -> 244
    //   242: bipush #44
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
    int i = (paramInt1 ^ 0xFFFFF121) & 0xFFFF;
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
      byte b1 = 45;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */