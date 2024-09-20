package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbk9 extends Zbv5 implements Zepx, DocumentListener {
  private final Zz2l ZA;
  
  private final Zb0h ZH;
  
  private final Zsd9 Zg;
  
  private final List<Zz8_> Zf;
  
  private Zz8_ Z_;
  
  private Zbk9 ZY;
  
  private Zm2o Zt;
  
  private ButtonGroup ZB;
  
  private Ze01 ZS;
  
  private Zedd ZM;
  
  private Zedd Zo;
  
  private Zedd Zw;
  
  private Zbqc Zm;
  
  private Zbqc ZW;
  
  private Zbqc ZP;
  
  private Zmg2 Zn;
  
  private Zmg2 ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbk9(Zz2l paramZz2l, byte[] paramArrayOfbyte, boolean paramBoolean, Zb0h paramZb0h) {
    this.ZA = paramZz2l;
    this.ZH = paramZb0h;
    String str = Zgj.ZB();
    ZK();
    if (paramBoolean) {
      this.Zm.setPreferredSize(this.Zt.getPreferredSize());
      this.Zt.setVisible(false);
    } 
    Objects.requireNonNull(paramZz2l);
    this.Zg = new Zsd9(paramZz2l::Zh, true, true, this, this, paramZb0h);
    Zmse.Zf(this.Zg.ZO(), 20, 5);
    add(this.Zg.ZO(), a(26275, 18992));
    this.Zo.addItem(a(26278, 19965));
    Zed_ zed_1 = new Zed_((byte)0);
    this.Zo.setRenderer(zed_1);
    byte b1 = 0;
    while (b1 < Zz8_.ZW.length) {
      this.Zo.addItem((Zz8_.ZW[b1]).ZY);
      b1++;
      if (str != null) {
        Zbqc.Zr(new Zbqc[1]);
        break;
      } 
    } 
    this.ZM.addItem(a(26274, -3079));
    Zed_ zed_2 = new Zed_((byte)1);
    this.ZM.setRenderer(zed_2);
    byte b2 = 0;
    while (b2 < Zz8_.ZT.length) {
      this.ZM.addItem((Zz8_.ZT[b2]).ZY);
      b2++;
      if (str != null)
        break; 
    } 
    this.Zw.addItem(a(26272, -29728));
    Zed_ zed_3 = new Zed_((byte)2);
    this.Zw.setRenderer(zed_3);
    byte b3 = 0;
    while (b3 < Zz8_.ZH.length) {
      this.Zw.addItem((Zz8_.ZH[b3]).ZY);
      b3++;
      if (str != null)
        break; 
    } 
    this.Zf = new ArrayList<>();
    this.Z_ = Zz8_.ZT[0];
    Zs(paramArrayOfbyte);
  }
  
  public void Zs(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: astore #4
    //   5: aload #4
    //   7: arraylength
    //   8: istore #5
    //   10: invokestatic ZB : ()Ljava/lang/String;
    //   13: iconst_0
    //   14: istore #6
    //   16: astore_2
    //   17: iload #6
    //   19: iload #5
    //   21: if_icmpge -> 72
    //   24: aload #4
    //   26: iload #6
    //   28: baload
    //   29: istore #7
    //   31: iload #7
    //   33: bipush #32
    //   35: if_icmpge -> 65
    //   38: iload #7
    //   40: bipush #13
    //   42: if_icmpeq -> 65
    //   45: iload #7
    //   47: bipush #10
    //   49: if_icmpeq -> 65
    //   52: iload #7
    //   54: bipush #9
    //   56: if_icmpeq -> 65
    //   59: iconst_1
    //   60: istore_3
    //   61: aload_2
    //   62: ifnull -> 72
    //   65: iinc #6, 1
    //   68: aload_2
    //   69: ifnull -> 17
    //   72: iload_3
    //   73: ifeq -> 97
    //   76: aload_0
    //   77: getfield Zg : Lburp/Zsd9;
    //   80: iconst_0
    //   81: iconst_0
    //   82: invokevirtual ZC : (ZZ)V
    //   85: aload_0
    //   86: getfield Zn : Lburp/Zmg2;
    //   89: iconst_1
    //   90: invokevirtual setSelected : (Z)V
    //   93: aload_2
    //   94: ifnull -> 114
    //   97: aload_0
    //   98: getfield Zg : Lburp/Zsd9;
    //   101: iconst_1
    //   102: iconst_0
    //   103: invokevirtual ZC : (ZZ)V
    //   106: aload_0
    //   107: getfield ZV : Lburp/Zmg2;
    //   110: iconst_1
    //   111: invokevirtual setSelected : (Z)V
    //   114: aload_0
    //   115: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   118: iconst_0
    //   119: aaload
    //   120: putfield Z_ : Lburp/Zz8_;
    //   123: aload_0
    //   124: getfield Zf : Ljava/util/List;
    //   127: invokeinterface clear : ()V
    //   132: iconst_0
    //   133: istore #4
    //   135: iload #4
    //   137: aload_1
    //   138: arraylength
    //   139: if_icmpge -> 163
    //   142: aload_0
    //   143: getfield Zf : Ljava/util/List;
    //   146: aload_0
    //   147: getfield Z_ : Lburp/Zz8_;
    //   150: invokeinterface add : (Ljava/lang/Object;)Z
    //   155: pop
    //   156: iinc #4, 1
    //   159: aload_2
    //   160: ifnull -> 135
    //   163: aload_0
    //   164: getfield Zg : Lburp/Zsd9;
    //   167: aload_1
    //   168: invokevirtual ZM : ([B)V
    //   171: return
  }
  
  public Zr4_ ZT(int paramInt) {
    if (paramInt < 0 || paramInt >= this.Zf.size()) {
      Zuh.ZC(false, Zqf.Zk, paramInt, this.Zf.size());
      return Zr4_.ZZ;
    } 
    return ((Zz8_)this.Zf.get(paramInt)).Zr;
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {}
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface getOffset : ()I
    //   10: istore #4
    //   12: iload #4
    //   14: ifne -> 26
    //   17: aload_0
    //   18: getfield Z_ : Lburp/Zz8_;
    //   21: astore_3
    //   22: aload_2
    //   23: ifnull -> 85
    //   26: iload #4
    //   28: aload_0
    //   29: getfield Zf : Ljava/util/List;
    //   32: invokeinterface size : ()I
    //   37: if_icmplt -> 68
    //   40: aload_0
    //   41: getfield Zf : Ljava/util/List;
    //   44: aload_0
    //   45: getfield Zf : Ljava/util/List;
    //   48: invokeinterface size : ()I
    //   53: iconst_1
    //   54: isub
    //   55: invokeinterface get : (I)Ljava/lang/Object;
    //   60: checkcast burp/Zz8_
    //   63: astore_3
    //   64: aload_2
    //   65: ifnull -> 85
    //   68: aload_0
    //   69: getfield Zf : Ljava/util/List;
    //   72: iload #4
    //   74: iconst_1
    //   75: isub
    //   76: invokeinterface get : (I)Ljava/lang/Object;
    //   81: checkcast burp/Zz8_
    //   84: astore_3
    //   85: iconst_0
    //   86: istore #5
    //   88: iload #5
    //   90: aload_1
    //   91: invokeinterface getLength : ()I
    //   96: if_icmpge -> 121
    //   99: aload_0
    //   100: getfield Zf : Ljava/util/List;
    //   103: iload #4
    //   105: iload #5
    //   107: iadd
    //   108: aload_3
    //   109: invokeinterface add : (ILjava/lang/Object;)V
    //   114: iinc #5, 1
    //   117: aload_2
    //   118: ifnull -> 88
    //   121: aload_0
    //   122: invokevirtual ZX : ()V
    //   125: return
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    int i = paramDocumentEvent.getOffset();
    byte b = 0;
    String str = Zgj.ZB();
    while (b < paramDocumentEvent.getLength()) {
      this.Zf.remove(i);
      b++;
      if (str != null)
        break; 
    } 
    ZX();
  }
  
  private void ZM(Zz8_ paramZz8_) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zsd9;
    //   8: invokevirtual ZX : ()Z
    //   11: ifeq -> 37
    //   14: aload_0
    //   15: getfield Zg : Lburp/Zsd9;
    //   18: invokevirtual Z_ : ()I
    //   21: istore_3
    //   22: aload_0
    //   23: getfield Zg : Lburp/Zsd9;
    //   26: invokevirtual Zo : ()I
    //   29: iload_3
    //   30: isub
    //   31: istore #4
    //   33: aload_2
    //   34: ifnull -> 48
    //   37: iconst_0
    //   38: istore_3
    //   39: aload_0
    //   40: getfield Zg : Lburp/Zsd9;
    //   43: invokevirtual ZY : ()I
    //   46: istore #4
    //   48: iload_3
    //   49: istore #5
    //   51: iload #5
    //   53: iload_3
    //   54: iload #4
    //   56: iadd
    //   57: if_icmpge -> 91
    //   60: aload_0
    //   61: getfield Zf : Ljava/util/List;
    //   64: iload #5
    //   66: invokeinterface remove : (I)Ljava/lang/Object;
    //   71: pop
    //   72: aload_0
    //   73: getfield Zf : Ljava/util/List;
    //   76: iload #5
    //   78: aload_1
    //   79: invokeinterface add : (ILjava/lang/Object;)V
    //   84: iinc #5, 1
    //   87: aload_2
    //   88: ifnull -> 51
    //   91: goto -> 104
    //   94: astore #5
    //   96: aload #5
    //   98: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   101: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   104: iload_3
    //   105: ifne -> 120
    //   108: aload_0
    //   109: aload_1
    //   110: putfield Z_ : Lburp/Zz8_;
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_0
    //   121: getfield Zg : Lburp/Zsd9;
    //   124: iload_3
    //   125: iload #4
    //   127: invokevirtual ZO : (II)V
    //   130: aload_0
    //   131: invokevirtual ZX : ()V
    //   134: return
    // Exception table:
    //   from	to	target	type
    //   48	91	94	java/lang/Exception
    //   104	113	116	java/lang/Exception
  }
  
  private void ZX() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zsd9;
    //   4: invokevirtual Zk : ()[B
    //   7: astore_2
    //   8: invokestatic ZB : ()Ljava/lang/String;
    //   11: aload_2
    //   12: arraylength
    //   13: istore_3
    //   14: new burp/Zbi8
    //   17: dup
    //   18: aload_2
    //   19: invokespecial <init> : ([B)V
    //   22: astore #4
    //   24: new java/io/ByteArrayOutputStream
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore #5
    //   33: astore_1
    //   34: aload #4
    //   36: getfield Zv : I
    //   39: iload_3
    //   40: if_icmpge -> 255
    //   43: aload_0
    //   44: getfield Zf : Ljava/util/List;
    //   47: aload #4
    //   49: getfield Zv : I
    //   52: invokeinterface get : (I)Ljava/lang/Object;
    //   57: checkcast burp/Zz8_
    //   60: astore #6
    //   62: aload #6
    //   64: getfield ZX : Lburp/Zrch;
    //   67: ifnonnull -> 108
    //   70: aload #5
    //   72: aload_2
    //   73: aload #4
    //   75: getfield Zv : I
    //   78: baload
    //   79: invokevirtual write : (I)V
    //   82: aload #4
    //   84: dup
    //   85: getfield Zv : I
    //   88: iconst_1
    //   89: iadd
    //   90: putfield Zv : I
    //   93: aload #4
    //   95: dup
    //   96: getfield Zo : I
    //   99: iconst_1
    //   100: isub
    //   101: putfield Zo : I
    //   104: aload_1
    //   105: ifnull -> 34
    //   108: aload #4
    //   110: iconst_0
    //   111: putfield Zo : I
    //   114: aload #4
    //   116: getfield Zv : I
    //   119: aload #4
    //   121: getfield Zo : I
    //   124: iadd
    //   125: iload_3
    //   126: if_icmpge -> 172
    //   129: aload #6
    //   131: aload_0
    //   132: getfield Zf : Ljava/util/List;
    //   135: aload #4
    //   137: getfield Zv : I
    //   140: aload #4
    //   142: getfield Zo : I
    //   145: iadd
    //   146: invokeinterface get : (I)Ljava/lang/Object;
    //   151: if_acmpeq -> 157
    //   154: goto -> 172
    //   157: aload #4
    //   159: dup
    //   160: getfield Zo : I
    //   163: iconst_1
    //   164: iadd
    //   165: putfield Zo : I
    //   168: aload_1
    //   169: ifnull -> 114
    //   172: aload #4
    //   174: getfield Zo : I
    //   177: ifle -> 251
    //   180: aload #6
    //   182: getfield ZX : Lburp/Zrch;
    //   185: aload #4
    //   187: invokeinterface ZN : (Lburp/Zbi8;)Z
    //   192: ifeq -> 213
    //   195: aload #6
    //   197: getfield ZX : Lburp/Zrch;
    //   200: aload #4
    //   202: aload #5
    //   204: invokeinterface Zq : (Lburp/Zbi8;Ljava/io/ByteArrayOutputStream;)V
    //   209: aload_1
    //   210: ifnull -> 172
    //   213: aload #5
    //   215: aload_2
    //   216: aload #4
    //   218: getfield Zv : I
    //   221: baload
    //   222: invokevirtual write : (I)V
    //   225: aload #4
    //   227: dup
    //   228: getfield Zv : I
    //   231: iconst_1
    //   232: iadd
    //   233: putfield Zv : I
    //   236: aload #4
    //   238: dup
    //   239: getfield Zo : I
    //   242: iconst_1
    //   243: isub
    //   244: putfield Zo : I
    //   247: aload_1
    //   248: ifnull -> 172
    //   251: aload_1
    //   252: ifnull -> 34
    //   255: aload_0
    //   256: aload #5
    //   258: invokevirtual toByteArray : ()[B
    //   261: invokevirtual ZH : ([B)V
    //   264: return
  }
  
  public void ZD() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zf : Ljava/util/List;
    //   4: invokeinterface clear : ()V
    //   9: iconst_0
    //   10: istore_2
    //   11: invokestatic ZB : ()Ljava/lang/String;
    //   14: aload_0
    //   15: getfield Zg : Lburp/Zsd9;
    //   18: invokevirtual Zk : ()[B
    //   21: astore_3
    //   22: aload_3
    //   23: arraylength
    //   24: istore #4
    //   26: new burp/Zbi8
    //   29: dup
    //   30: aload_3
    //   31: invokespecial <init> : ([B)V
    //   34: astore #5
    //   36: aload #5
    //   38: iload #4
    //   40: putfield Zo : I
    //   43: astore_1
    //   44: new java/io/ByteArrayOutputStream
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: astore #6
    //   53: aload #5
    //   55: getfield Zv : I
    //   58: iload #4
    //   60: if_icmpge -> 277
    //   63: aconst_null
    //   64: astore #7
    //   66: iconst_0
    //   67: istore #8
    //   69: iconst_1
    //   70: istore #9
    //   72: iload #9
    //   74: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   77: arraylength
    //   78: if_icmpge -> 125
    //   81: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   84: iload #9
    //   86: aaload
    //   87: getfield ZX : Lburp/Zrch;
    //   90: aload #5
    //   92: invokeinterface ZX : (Lburp/Zbi8;)S
    //   97: istore #10
    //   99: iload #10
    //   101: iload #8
    //   103: if_icmple -> 118
    //   106: iload #10
    //   108: istore #8
    //   110: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   113: iload #9
    //   115: aaload
    //   116: astore #7
    //   118: iinc #9, 1
    //   121: aload_1
    //   122: ifnull -> 72
    //   125: iload #8
    //   127: iconst_3
    //   128: if_icmpge -> 184
    //   131: aload_0
    //   132: getfield Zf : Ljava/util/List;
    //   135: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   138: iconst_0
    //   139: aaload
    //   140: invokeinterface add : (Ljava/lang/Object;)Z
    //   145: pop
    //   146: aload #6
    //   148: aload_3
    //   149: aload #5
    //   151: getfield Zv : I
    //   154: baload
    //   155: invokevirtual write : (I)V
    //   158: aload #5
    //   160: dup
    //   161: getfield Zv : I
    //   164: iconst_1
    //   165: iadd
    //   166: putfield Zv : I
    //   169: aload #5
    //   171: dup
    //   172: getfield Zo : I
    //   175: iconst_1
    //   176: isub
    //   177: putfield Zo : I
    //   180: aload_1
    //   181: ifnull -> 53
    //   184: iconst_1
    //   185: istore_2
    //   186: aload #5
    //   188: getfield Zo : I
    //   191: istore #9
    //   193: aload #7
    //   195: getfield ZX : Lburp/Zrch;
    //   198: aload #5
    //   200: aload #6
    //   202: invokeinterface Zq : (Lburp/Zbi8;Ljava/io/ByteArrayOutputStream;)V
    //   207: iload #9
    //   209: aload #5
    //   211: getfield Zo : I
    //   214: isub
    //   215: istore #9
    //   217: iconst_0
    //   218: istore #10
    //   220: iload #10
    //   222: iload #9
    //   224: if_icmpge -> 246
    //   227: aload_0
    //   228: getfield Zf : Ljava/util/List;
    //   231: aload #7
    //   233: invokeinterface add : (Ljava/lang/Object;)Z
    //   238: pop
    //   239: iinc #10, 1
    //   242: aload_1
    //   243: ifnull -> 220
    //   246: iload #9
    //   248: ifne -> 273
    //   251: aload #5
    //   253: dup
    //   254: getfield Zv : I
    //   257: iconst_1
    //   258: iadd
    //   259: putfield Zv : I
    //   262: aload #5
    //   264: dup
    //   265: getfield Zo : I
    //   268: iconst_1
    //   269: isub
    //   270: putfield Zo : I
    //   273: aload_1
    //   274: ifnull -> 53
    //   277: aload_0
    //   278: getfield Zf : Ljava/util/List;
    //   281: invokeinterface size : ()I
    //   286: ifle -> 310
    //   289: aload_0
    //   290: aload_0
    //   291: getfield Zf : Ljava/util/List;
    //   294: iconst_0
    //   295: invokeinterface get : (I)Ljava/lang/Object;
    //   300: checkcast burp/Zz8_
    //   303: putfield Z_ : Lburp/Zz8_;
    //   306: aload_1
    //   307: ifnull -> 319
    //   310: aload_0
    //   311: getstatic burp/Zz8_.ZT : [Lburp/Zz8_;
    //   314: iconst_0
    //   315: aaload
    //   316: putfield Z_ : Lburp/Zz8_;
    //   319: iload_2
    //   320: ifeq -> 343
    //   323: aload_0
    //   324: aload #6
    //   326: invokevirtual toByteArray : ()[B
    //   329: invokevirtual ZH : ([B)V
    //   332: aload_0
    //   333: getfield ZY : Lburp/Zbk9;
    //   336: invokevirtual ZD : ()V
    //   339: aload_1
    //   340: ifnull -> 367
    //   343: aload_0
    //   344: getfield ZY : Lburp/Zbk9;
    //   347: ifnull -> 367
    //   350: aload_0
    //   351: invokevirtual Ze : ()Z
    //   354: ifeq -> 367
    //   357: aload_0
    //   358: getfield ZA : Lburp/Zz2l;
    //   361: invokevirtual Zh : ()Lburp/Zl04;
    //   364: invokevirtual validate : ()V
    //   367: aload_0
    //   368: getfield Zg : Lburp/Zsd9;
    //   371: iconst_0
    //   372: iload #4
    //   374: invokevirtual ZO : (II)V
    //   377: return
  }
  
  private void ZH(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZB : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZY : Lburp/Zbk9;
    //   8: ifnonnull -> 58
    //   11: aload_0
    //   12: new burp/Zbk9
    //   15: dup
    //   16: aload_0
    //   17: getfield ZA : Lburp/Zz2l;
    //   20: aload_1
    //   21: iconst_1
    //   22: aload_0
    //   23: getfield ZH : Lburp/Zb0h;
    //   26: invokespecial <init> : (Lburp/Zz2l;[BZLburp/Zb0h;)V
    //   29: putfield ZY : Lburp/Zbk9;
    //   32: aload_0
    //   33: invokevirtual getParent : ()Ljava/awt/Container;
    //   36: aload_0
    //   37: getfield ZY : Lburp/Zbk9;
    //   40: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   43: pop
    //   44: aload_0
    //   45: getfield ZA : Lburp/Zz2l;
    //   48: invokevirtual Zh : ()Lburp/Zl04;
    //   51: invokevirtual validate : ()V
    //   54: aload_2
    //   55: ifnull -> 86
    //   58: aload_0
    //   59: getfield ZY : Lburp/Zbk9;
    //   62: aload_1
    //   63: invokevirtual Zs : ([B)V
    //   66: aload_0
    //   67: getfield ZY : Lburp/Zbk9;
    //   70: invokevirtual Ze : ()Z
    //   73: ifeq -> 86
    //   76: aload_0
    //   77: getfield ZA : Lburp/Zz2l;
    //   80: invokevirtual Zh : ()Lburp/Zl04;
    //   83: invokevirtual validate : ()V
    //   86: return
  }
  
  boolean Ze() {
    if (this.ZY == null)
      return false; 
    this.ZY.ZM();
    this.ZY = null;
    return true;
  }
  
  private void ZM() {
    Ze();
    getParent().remove(this);
  }
  
  private void ZK() {
    this.ZB = new ButtonGroup();
    this.ZP = new Zbqc();
    this.ZM = new Zedd();
    this.Zo = new Zedd();
    this.ZS = new Ze01();
    this.Zw = new Zedd();
    this.ZW = new Zbqc();
    this.ZV = new Zmg2();
    this.Zn = new Zmg2();
    this.Zm = new Zbqc();
    this.Zt = new Zm2o();
    setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
    setLayout(new BorderLayout(10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.ZP.setLayout(gridBagLayout);
    this.ZM.setMaximumRowCount(10);
    this.ZM.addActionListener(new Zshl(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.ZM, gridBagConstraints);
    this.Zo.setMaximumRowCount(10);
    this.Zo.addActionListener(new Zcr(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zo, gridBagConstraints);
    this.ZS.setText(a(26285, 3622));
    this.ZS.setToolTipText(a(26279, -64));
    this.ZS.addActionListener(new Zlyk(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weighty = 1.0D;
    this.ZP.add(this.ZS, gridBagConstraints);
    this.Zw.setMaximumRowCount(10);
    this.Zw.addActionListener(new Zrob(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.ZP.add(this.Zw, gridBagConstraints);
    this.ZW.setLayout(new GridLayout(1, 2, 10, 0));
    this.ZV.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZB.add(this.ZV);
    this.ZV.setSelected(true);
    this.ZV.setText(a(26273, 394));
    this.ZV.setMargin(new Insets(0, 0, 0, 0));
    this.ZV.addActionListener(new Zm4v(this));
    this.ZW.add(this.ZV);
    this.Zn.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    this.ZB.add(this.Zn);
    this.Zn.setText(a(26276, -6800));
    this.Zn.setMargin(new Insets(0, 0, 0, 0));
    this.Zn.addActionListener(new Ztfb(this));
    this.ZW.add(this.Zn);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    this.ZP.add(this.ZW, gridBagConstraints);
    this.Zm.setLayout(new GridBagLayout());
    this.Zt.Zi(Zk97.DESKTOP_TOOLS_DECODER);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 12;
    this.Zm.add(this.Zt, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    this.ZP.add(this.Zm, gridBagConstraints);
    add(this.ZP, a(26277, 23970));
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    int i = this.Zw.getSelectedIndex();
    if (i < 1)
      return; 
    ZM(Zz8_.ZH[i - 1]);
    this.Zw.setSelectedIndex(0);
  }
  
  private void Zs(ActionEvent paramActionEvent) {
    ZD();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    int i = this.Zo.getSelectedIndex();
    if (i < 1)
      return; 
    ZM(Zz8_.ZW[i - 1]);
    this.Zo.setSelectedIndex(0);
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    int i = this.ZM.getSelectedIndex();
    if (i < 1)
      return; 
    ZM(Zz8_.ZT[i - 1]);
    this.ZM.setSelectedIndex(0);
  }
  
  private void ZZ(ActionEvent paramActionEvent) {
    if (this.Zg.Zu())
      this.Zg.ZC(false, true); 
  }
  
  private void Zf(ActionEvent paramActionEvent) {
    if (!this.Zg.Zu())
      this.Zg.ZC(true, true); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '>gMLìæ á"hKÑ®UùþÀH|zt­\\n\\r©4íÒ¡è&ù\\ræ®òð\\b@ÂlåsëÌ}G¼Í-'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #90
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc ')vÌ\\n@A{\\fµæØ´ÊÏ×'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #13
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #60
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
    //   128: putstatic burp/Zbk9.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbk9.b : [Ljava/lang/String;
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
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #111
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #63
    //   234: goto -> 244
    //   237: bipush #33
    //   239: goto -> 244
    //   242: bipush #6
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x66A5) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbk9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */