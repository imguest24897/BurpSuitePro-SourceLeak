package burp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelEvent;

class Zb5_ extends Zbqc implements Zzyl {
  private final Zbcg ZD;
  
  private final Zbcg Zk;
  
  private final Zbc9 ZJ;
  
  private final Zbws ZY;
  
  private final Zmue Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zb5_(Zr_4 paramZr_4, Zslu paramZslu, Zbnt paramZbnt, Zkl6 paramZkl6, Zmf9 paramZmf9, Zm6x paramZm6x, Zxtg paramZxtg, Zbiv paramZbiv, Zerg paramZerg, Zbp5 paramZbp5, Zei6 paramZei6, Zbws paramZbws, Zmue paramZmue, Zeo_ paramZeo_) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/BorderLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: aload_0
    //   12: aload #12
    //   14: putfield ZY : Lburp/Zbws;
    //   17: aload_0
    //   18: aload #13
    //   20: putfield Zq : Lburp/Zmue;
    //   23: invokestatic ZH : ()Z
    //   26: aload_0
    //   27: getstatic burp/Zgzq.PROXY_INTERCEPT_ON_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   30: sipush #8486
    //   33: sipush #19234
    //   36: invokestatic a : (II)Ljava/lang/String;
    //   39: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   42: sipush #8480
    //   45: sipush #2215
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   54: bipush #80
    //   56: invokevirtual ZC : (I)Lburp/Zltn;
    //   59: getstatic burp/Zlar.PROXY_INTERCEPT_LEARN_MORE_INFO : Lburp/Zlar;
    //   62: invokevirtual ZN : (Lburp/Zlar;)Lburp/Zltn;
    //   65: aload #7
    //   67: invokevirtual ZN : (Lburp/Zxtg;)Lburp/Zltn;
    //   70: sipush #8485
    //   73: sipush #18767
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual ZE : (Ljava/lang/String;)Lburp/Zltn;
    //   82: invokevirtual Zi : ()Lburp/Zbcg;
    //   85: putfield ZD : Lburp/Zbcg;
    //   88: istore #15
    //   90: aload_0
    //   91: getstatic burp/Zgzq.PROXY_INTERCEPT_OFF_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   94: sipush #8487
    //   97: sipush #-9622
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   106: sipush #8484
    //   109: sipush #-32723
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   118: bipush #80
    //   120: invokevirtual ZC : (I)Lburp/Zltn;
    //   123: getstatic burp/Zlar.PROXY_INTERCEPT_LEARN_MORE_INFO : Lburp/Zlar;
    //   126: invokevirtual ZN : (Lburp/Zlar;)Lburp/Zltn;
    //   129: aload #7
    //   131: invokevirtual ZN : (Lburp/Zxtg;)Lburp/Zltn;
    //   134: sipush #8483
    //   137: sipush #-32728
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual ZE : (Ljava/lang/String;)Lburp/Zltn;
    //   146: invokevirtual Zi : ()Lburp/Zbcg;
    //   149: putfield Zk : Lburp/Zbcg;
    //   152: aload_0
    //   153: new burp/Zbc9
    //   156: dup
    //   157: iconst_2
    //   158: anewarray java/awt/Component
    //   161: dup
    //   162: iconst_0
    //   163: aload_0
    //   164: getfield ZD : Lburp/Zbcg;
    //   167: aastore
    //   168: dup
    //   169: iconst_1
    //   170: aload_0
    //   171: getfield Zk : Lburp/Zbcg;
    //   174: aastore
    //   175: invokespecial <init> : ([Ljava/awt/Component;)V
    //   178: putfield ZJ : Lburp/Zbc9;
    //   181: aload_0
    //   182: aload #11
    //   184: invokevirtual ZU : ()Z
    //   187: invokevirtual ZN : (Z)V
    //   190: aload #12
    //   192: iconst_1
    //   193: invokevirtual ZF : (Z)V
    //   196: aload #12
    //   198: aload_0
    //   199: getfield ZJ : Lburp/Zbc9;
    //   202: invokevirtual ZL : (Ljava/awt/Component;)V
    //   205: aload #12
    //   207: invokestatic createEmptyBorder : ()Ljavax/swing/border/Border;
    //   210: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   213: aload #12
    //   215: sipush #8482
    //   218: sipush #-24429
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: invokevirtual setName : (Ljava/lang/String;)V
    //   227: aload #12
    //   229: aconst_null
    //   230: invokevirtual setRowSorter : (Ljavax/swing/RowSorter;)V
    //   233: new burp/Ziy
    //   236: dup
    //   237: aload_1
    //   238: aload #12
    //   240: aload #13
    //   242: aload_2
    //   243: aload #8
    //   245: aload #9
    //   247: aload #10
    //   249: aload #6
    //   251: invokespecial <init> : (Lburp/Zr_4;Lburp/Zbws;Lburp/Zmue;Lburp/Zslu;Lburp/Zbiv;Lburp/Zerg;Lburp/Zbp5;Lburp/Zm6x;)V
    //   254: astore #16
    //   256: aload #12
    //   258: aload #16
    //   260: invokevirtual ZP : (Lburp/Zzyl;)V
    //   263: new burp/Zgzz
    //   266: dup
    //   267: aload_2
    //   268: aload #8
    //   270: aload #9
    //   272: aload_3
    //   273: aload #4
    //   275: aload #6
    //   277: aload #10
    //   279: aload #11
    //   281: aload #5
    //   283: aload #16
    //   285: aload #14
    //   287: invokespecial <init> : (Lburp/Zslu;Lburp/Zbiv;Lburp/Zerg;Lburp/Zbnt;Lburp/Zkl6;Lburp/Zm6x;Lburp/Zbp5;Lburp/Zei6;Lburp/Zmf9;Lburp/Ziy;Lburp/Zeo_;)V
    //   290: astore #17
    //   292: aload #12
    //   294: new burp/Zb0v
    //   297: dup
    //   298: aload #12
    //   300: aload #13
    //   302: aload #17
    //   304: aload #6
    //   306: invokespecial <init> : (Lburp/Zbws;Lburp/Zmue;Lburp/Zgzz;Lburp/Zm6x;)V
    //   309: invokevirtual Zk : (Lburp/Zky2;)V
    //   312: aload #12
    //   314: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   317: astore #18
    //   319: aload #18
    //   321: iconst_2
    //   322: invokeinterface setSelectionMode : (I)V
    //   327: aload #18
    //   329: aload #18
    //   331: aload #12
    //   333: aload #13
    //   335: aload #11
    //   337: <illegal opcode> valueChanged : (Ljavax/swing/ListSelectionModel;Lburp/Zbws;Lburp/Zmue;Lburp/Zei6;)Ljavax/swing/event/ListSelectionListener;
    //   342: invokeinterface addListSelectionListener : (Ljavax/swing/event/ListSelectionListener;)V
    //   347: aload #13
    //   349: aload #12
    //   351: aload #11
    //   353: aload #18
    //   355: aload #13
    //   357: aload #6
    //   359: <illegal opcode> tableChanged : (Lburp/Zbws;Lburp/Zei6;Ljavax/swing/ListSelectionModel;Lburp/Zmue;Lburp/Zm6x;)Ljavax/swing/event/TableModelListener;
    //   364: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   367: aload #12
    //   369: aload #12
    //   371: aload #11
    //   373: aload #13
    //   375: <illegal opcode> ZK : (Lburp/Zbws;Lburp/Zei6;Lburp/Zmue;)Lburp/Zeq;
    //   380: invokevirtual Zc : (Lburp/Zeq;)V
    //   383: new burp/Zbup
    //   386: dup
    //   387: aload #12
    //   389: invokespecial <init> : (Ljava/awt/Component;)V
    //   392: astore #19
    //   394: aload_0
    //   395: aload #19
    //   397: sipush #8481
    //   400: sipush #-193
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   409: aload #6
    //   411: ldc burp/Zlp
    //   413: getstatic burp/Zehw.SWING : Lburp/Zehw;
    //   416: aload_0
    //   417: <illegal opcode> Zy : (Lburp/Zb5_;)Lburp/Zxjl;
    //   422: invokevirtual ZO : (Ljava/lang/Class;Lburp/Zehw;Lburp/Zxjl;)Lburp/Zmt5;
    //   425: pop
    //   426: aload #6
    //   428: ldc burp/Zluv
    //   430: getstatic burp/Zehw.SWING : Lburp/Zehw;
    //   433: aload #13
    //   435: <illegal opcode> Zy : (Lburp/Zmue;)Lburp/Zxjl;
    //   440: invokevirtual ZO : (Ljava/lang/Class;Lburp/Zehw;Lburp/Zxjl;)Lburp/Zmt5;
    //   443: pop
    //   444: invokestatic Zwu : ()[Lburp/Zbqc;
    //   447: ifnonnull -> 463
    //   450: iload #15
    //   452: ifeq -> 459
    //   455: iconst_0
    //   456: goto -> 460
    //   459: iconst_1
    //   460: invokestatic ZF : (Z)V
    //   463: return
  }
  
  private void ZN(boolean paramBoolean) {
    if (this.Zq.getRowCount() == 0) {
      Zbcg zbcg = paramBoolean ? this.ZD : this.Zk;
      this.ZJ.ZP(zbcg);
      this.ZJ.requestFocusInWindow();
    } 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZY.ZI(paramInt, paramObject);
  }
  
  private static void lambda$new$6(Zmue paramZmue, Zluv paramZluv) {
    int i = Ziy.ZO(paramZmue, paramZluv.Zsq());
    if (i >= 0)
      paramZmue.fireTableRowsUpdated(i, i); 
  }
  
  private void lambda$new$5(Zlp paramZlp) {
    ZN(paramZlp.ZQl());
  }
  
  private static void lambda$new$4(Zbws paramZbws, Zei6 paramZei6, Zmue paramZmue, int paramInt1, int paramInt2) {
    int i = paramZbws.convertRowIndexToModel(paramInt1);
    paramZei6.ZN(paramZmue.Zf(i));
  }
  
  private static void lambda$new$3(Zbws paramZbws, Zei6 paramZei6, ListSelectionModel paramListSelectionModel, Zmue paramZmue, Zm6x paramZm6x, TableModelEvent paramTableModelEvent) {
    // Byte code:
    //   0: invokestatic Zm : ()Z
    //   3: istore #6
    //   5: aload #5
    //   7: invokevirtual getType : ()I
    //   10: iconst_1
    //   11: if_icmpne -> 43
    //   14: aload_0
    //   15: invokevirtual getRowCount : ()I
    //   18: iconst_1
    //   19: if_icmplt -> 43
    //   22: aload_1
    //   23: invokevirtual Zy : ()Lburp/Zz6e;
    //   26: ifnonnull -> 43
    //   29: aload_2
    //   30: aload_0
    //   31: aload_1
    //   32: aload_3
    //   33: aload #4
    //   35: <illegal opcode> run : (Ljavax/swing/ListSelectionModel;Lburp/Zbws;Lburp/Zei6;Lburp/Zmue;Lburp/Zm6x;)Ljava/lang/Runnable;
    //   40: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   43: aload #5
    //   45: invokevirtual getType : ()I
    //   48: iconst_m1
    //   49: if_icmpne -> 129
    //   52: aload_0
    //   53: invokevirtual getRowCount : ()I
    //   56: ifne -> 69
    //   59: aload_1
    //   60: aconst_null
    //   61: invokevirtual ZN : (Lburp/Ztf_;)V
    //   64: iload #6
    //   66: ifne -> 129
    //   69: aload_0
    //   70: invokevirtual getSelectedRow : ()I
    //   73: istore #7
    //   75: iload #7
    //   77: aload_0
    //   78: invokevirtual getRowCount : ()I
    //   81: if_icmplt -> 93
    //   84: aload_0
    //   85: invokevirtual getRowCount : ()I
    //   88: iconst_1
    //   89: isub
    //   90: goto -> 95
    //   93: iload #7
    //   95: istore #8
    //   97: aload_0
    //   98: iload #8
    //   100: invokevirtual convertRowIndexToModel : (I)I
    //   103: istore #9
    //   105: aload_1
    //   106: aload_3
    //   107: iload #9
    //   109: invokevirtual Zf : (I)Lburp/Ztf_;
    //   112: invokevirtual ZN : (Lburp/Ztf_;)V
    //   115: aload_2
    //   116: iload #8
    //   118: aload #4
    //   120: aload_3
    //   121: <illegal opcode> run : (Ljavax/swing/ListSelectionModel;ILburp/Zm6x;Lburp/Zmue;)Ljava/lang/Runnable;
    //   126: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   129: return
  }
  
  private static void lambda$new$2(ListSelectionModel paramListSelectionModel, int paramInt, Zm6x paramZm6x, Zmue paramZmue) {
    paramListSelectionModel.setSelectionInterval(paramInt, paramInt);
    paramZm6x.ZB(new Zxfh(paramZmue.ZJ()));
  }
  
  private static void lambda$new$1(ListSelectionModel paramListSelectionModel, Zbws paramZbws, Zei6 paramZei6, Zmue paramZmue, Zm6x paramZm6x) {
    paramListSelectionModel.setSelectionInterval(0, 0);
    int i = paramZbws.convertRowIndexToModel(0);
    paramZei6.ZN(paramZmue.Zf(i));
    paramZm6x.ZB(new Zxfh(paramZmue.ZJ()));
  }
  
  private static void lambda$new$0(ListSelectionModel paramListSelectionModel, Zbws paramZbws, Zmue paramZmue, Zei6 paramZei6, ListSelectionEvent paramListSelectionEvent) {
    if (!paramListSelectionEvent.getValueIsAdjusting()) {
      Objects.requireNonNull(paramZbws);
      Objects.requireNonNull(paramZmue);
      List<Zz6e<?>> list = (List)Arrays.stream(paramListSelectionModel.getSelectedIndices()).map(paramZbws::convertRowIndexToModel).mapToObj(paramZmue::Zf).filter(Objects::nonNull).collect(Collectors.toList());
      paramZei6.Zj(list);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ID?.#þS· 2Üÿoòe²¦¥X¥a×ñÉúáæÈ´°hbyGº{I¦«e½Î@\\fDU#n¼tc÷ìùÒõ°Òu4k?¿×-|ÊäR\\tÙüM,r4¬©èòMtJÚð¯}¥"0é'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #28
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
    //   68: ldc 'â-h©¼ê¹ge·ÔÁ´K±$(iÅIÌZ]*ý"½.#åKdV3Lÿ Ù;ÂÁT[>=5\\nÈPõ{(0\\tôÔvÀþËÍüUú÷«Ü\\f=ÏE©\Àäc^Éúº`Ù\\n¯¥æuÅ¹¸fV¶Qª^Ò*_i!²TÞ¯þÎ´Oâe¨ÐMáÓeFÞÛ¬{ÎMï°êñYÃúäìçñ§ã°Ø.Fþ Æ\\r\\bÌa_>­Á£Ò¢{ì#us¥ZtEpÆ·ü[õ?Lb7ôjÈ\\tL¬¡ôr}ÉTßY¼¸GüLújÍ<ïå£Bø\\r÷xYÖÔY²X_EÄµ}xk[5|?ÂBûK¥gl:X´fÖ=.@å6JÔ³CÓ§°M®'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #176
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: iconst_3
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
    //   124: goto -> 83
    //   127: aload #5
    //   129: putstatic burp/Zb5_.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb5_.b : [Ljava/lang/String;
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
    //   212: bipush #127
    //   214: goto -> 244
    //   217: bipush #20
    //   219: goto -> 244
    //   222: bipush #35
    //   224: goto -> 244
    //   227: bipush #6
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #49
    //   239: goto -> 244
    //   242: bipush #22
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
    int i = (paramInt1 ^ 0x2121) & 0xFFFF;
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
      byte b1 = 6;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */