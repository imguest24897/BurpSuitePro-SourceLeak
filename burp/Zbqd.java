package burp;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.Timer;
import javax.swing.event.DocumentEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zbqd extends Zbqc implements Zg4o, Zzyl {
  private static final int ZY;
  
  private final Zgb6 ZM;
  
  private final Ztwv ZJ;
  
  private final Zl5q ZP;
  
  private final Zvov ZI;
  
  private final Timer ZX;
  
  private final Zm7b ZE;
  
  protected volatile boolean Zs;
  
  protected volatile boolean Zr;
  
  protected volatile boolean ZC;
  
  private boolean ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbqd(boolean paramBoolean, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zvov paramZvov, Zm7b paramZm7b, Zrid paramZrid, Zm51 paramZm51) {
    super(new BorderLayout());
    this.ZW = paramBoolean;
    this.ZM = paramZgb6;
    this.ZJ = paramZtwv;
    this.ZI = paramZvov;
    this.ZE = paramZm7b;
    int[] arrayOfInt = Zs4l.Zz();
    this.ZX = new Timer(1000, new Zz17(this, paramZm51));
    this.ZX.setRepeats(false);
    Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    Zmgn zmgn = ZD(paramBoolean);
    zmgn.ZM(new Zxg1(paramZm7b));
    zmgn.Zs(new Ztcp());
    Zvo6 zvo6 = new Zvo6(zmgn);
    this.ZP = new Zl5q(zvo6, paramZgb6, new Zlwt(zmgn, paramZb0h), paramZvov, paramZm51);
    addAncestorListener(new Zrhx(paramZrid, paramZtwv));
    this.ZP.Zr(this::lambda$new$0);
    add(this.ZP.ZiB(), a(-23459, -23621));
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  private Zmgn ZD(boolean paramBoolean) {
    Zbqb zbqb = new Zbqb();
    Zmgn zmgn = ZT(zbqb);
    zmgn.addMouseListener(new Ze32(this));
    zmgn.setEditable(paramBoolean);
    zmgn.setRows(1);
    return zmgn;
  }
  
  private Zmgn ZT(Zbqb paramZbqb) {
    Ze9f ze9f = new Ze9f(paramZbqb, a(-23460, 2769));
    return new Zmg_(this, ze9f, this);
  }
  
  public void Z_(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: iload_2
    //   4: <illegal opcode> run : (Lburp/Zbqd;Ljava/lang/String;Z)Ljava/lang/Runnable;
    //   9: invokevirtual Z_ : (Ljava/lang/Runnable;)V
    //   12: return
  }
  
  private void Z_(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zbqd;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public String Zg() {
    return this.ZP.ZiW();
  }
  
  public int ZU() {
    return this.ZP.Zi1();
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.ZP.Zg(paramBoolean);
  }
  
  public void requestFocus() {
    this.ZP.ZiK();
  }
  
  public void ZR(int paramInt) {
    this.ZP.Zg(paramInt);
  }
  
  private void ZM(int paramInt1, int paramInt2) {
    this.ZP.Zu(paramInt1, paramInt2);
  }
  
  public void addMouseListener(MouseListener paramMouseListener) {
    this.ZP.ZA(paramMouseListener);
  }
  
  public synchronized void addFocusListener(FocusListener paramFocusListener) {
    this.ZP.ZP(paramFocusListener);
  }
  
  public void ZI(DocumentEvent paramDocumentEvent) {
    if (this.Zs)
      return; 
    ZK();
    Zb(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
  }
  
  private void Zb(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZI : Lburp/Zvov;
    //   4: invokeinterface Zq : ()Ljava/util/List;
    //   9: astore #4
    //   11: invokestatic Zz : ()[I
    //   14: new java/util/ArrayList
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: astore_3
    //   24: aload #4
    //   26: invokeinterface iterator : ()Ljava/util/Iterator;
    //   31: astore #6
    //   33: aload #6
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 128
    //   43: aload #6
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast burp/Zkv5
    //   53: astore #7
    //   55: aload #7
    //   57: invokeinterface endOffset : ()I
    //   62: iload_1
    //   63: if_icmpgt -> 80
    //   66: aload #5
    //   68: aload #7
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_3
    //   77: ifnonnull -> 124
    //   80: aload #7
    //   82: invokeinterface startOffset : ()I
    //   87: iload_1
    //   88: if_icmplt -> 124
    //   91: aload #5
    //   93: aload #7
    //   95: aload #7
    //   97: invokeinterface startOffset : ()I
    //   102: iload_2
    //   103: iadd
    //   104: aload #7
    //   106: invokeinterface endOffset : ()I
    //   111: iload_2
    //   112: iadd
    //   113: invokeinterface Zg : (II)Lburp/Zkv5;
    //   118: invokeinterface add : (Ljava/lang/Object;)Z
    //   123: pop
    //   124: aload_3
    //   125: ifnonnull -> 33
    //   128: aload_0
    //   129: getfield ZI : Lburp/Zvov;
    //   132: aload #5
    //   134: invokeinterface Zh : (Ljava/util/List;)V
    //   139: aload_0
    //   140: getfield ZI : Lburp/Zvov;
    //   143: invokeinterface Zi : ()Ljava/util/List;
    //   148: iload_1
    //   149: iload_2
    //   150: invokestatic Za : (Ljava/util/List;II)Ljava/util/List;
    //   153: astore #6
    //   155: aload_0
    //   156: getfield ZI : Lburp/Zvov;
    //   159: aload #6
    //   161: invokeinterface ZW : (Ljava/util/List;)V
    //   166: return
  }
  
  public void ZO(DocumentEvent paramDocumentEvent) {
    if (this.Zs)
      return; 
    ZK();
    Zm(paramDocumentEvent.getOffset(), paramDocumentEvent.getLength());
  }
  
  private void Zm(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZI : Lburp/Zvov;
    //   4: invokeinterface Zq : ()Ljava/util/List;
    //   9: astore #4
    //   11: invokestatic Zz : ()[I
    //   14: new java/util/ArrayList
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: aload #4
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore #6
    //   32: astore_3
    //   33: aload #6
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 130
    //   43: aload #6
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast burp/Zkv5
    //   53: astore #7
    //   55: aload #7
    //   57: invokeinterface endOffset : ()I
    //   62: iload_1
    //   63: if_icmpgt -> 80
    //   66: aload #5
    //   68: aload #7
    //   70: invokeinterface add : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_3
    //   77: ifnonnull -> 126
    //   80: aload #7
    //   82: invokeinterface startOffset : ()I
    //   87: iload_1
    //   88: iload_2
    //   89: iadd
    //   90: if_icmplt -> 126
    //   93: aload #5
    //   95: aload #7
    //   97: aload #7
    //   99: invokeinterface startOffset : ()I
    //   104: iload_2
    //   105: isub
    //   106: aload #7
    //   108: invokeinterface endOffset : ()I
    //   113: iload_2
    //   114: isub
    //   115: invokeinterface Zg : (II)Lburp/Zkv5;
    //   120: invokeinterface add : (Ljava/lang/Object;)Z
    //   125: pop
    //   126: aload_3
    //   127: ifnonnull -> 33
    //   130: aload_0
    //   131: getfield ZI : Lburp/Zvov;
    //   134: aload #5
    //   136: invokeinterface Zh : (Ljava/util/List;)V
    //   141: aload_0
    //   142: getfield ZI : Lburp/Zvov;
    //   145: invokeinterface Zi : ()Ljava/util/List;
    //   150: iload_1
    //   151: iload_2
    //   152: invokestatic Zk : (Ljava/util/List;II)Ljava/util/List;
    //   155: astore #6
    //   157: aload_0
    //   158: getfield ZI : Lburp/Zvov;
    //   161: aload #6
    //   163: invokeinterface ZW : (Ljava/util/List;)V
    //   168: return
  }
  
  static List<Zkv5> Za(List<Zkv5> paramList, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic Zz : ()[I
    //   12: aload_0
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #5
    //   20: astore_3
    //   21: aload #5
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 173
    //   31: aload #5
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast burp/Zkv5
    //   41: astore #6
    //   43: iload_1
    //   44: aload #6
    //   46: invokeinterface startOffset : ()I
    //   51: if_icmplt -> 100
    //   54: iload_1
    //   55: aload #6
    //   57: invokeinterface endOffset : ()I
    //   62: if_icmpgt -> 100
    //   65: aload #4
    //   67: aload #6
    //   69: aload #6
    //   71: invokeinterface startOffset : ()I
    //   76: aload #6
    //   78: invokeinterface endOffset : ()I
    //   83: iload_2
    //   84: iadd
    //   85: invokeinterface Zg : (II)Lburp/Zkv5;
    //   90: invokeinterface add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: aload_3
    //   97: ifnonnull -> 169
    //   100: iload_1
    //   101: aload #6
    //   103: invokeinterface endOffset : ()I
    //   108: if_icmplt -> 125
    //   111: aload #4
    //   113: aload #6
    //   115: invokeinterface add : (Ljava/lang/Object;)Z
    //   120: pop
    //   121: aload_3
    //   122: ifnonnull -> 169
    //   125: iload_1
    //   126: aload #6
    //   128: invokeinterface startOffset : ()I
    //   133: if_icmpgt -> 169
    //   136: aload #4
    //   138: aload #6
    //   140: aload #6
    //   142: invokeinterface startOffset : ()I
    //   147: iload_2
    //   148: iadd
    //   149: aload #6
    //   151: invokeinterface endOffset : ()I
    //   156: iload_2
    //   157: iadd
    //   158: invokeinterface Zg : (II)Lburp/Zkv5;
    //   163: invokeinterface add : (Ljava/lang/Object;)Z
    //   168: pop
    //   169: aload_3
    //   170: ifnonnull -> 21
    //   173: aload #4
    //   175: areturn
  }
  
  static List<Zkv5> Zk(List<Zkv5> paramList, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: invokestatic Zz : ()[I
    //   12: aload_0
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #5
    //   20: astore_3
    //   21: aload #5
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 239
    //   31: aload #5
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast burp/Zkv5
    //   41: astore #6
    //   43: iload_1
    //   44: aload #6
    //   46: invokeinterface startOffset : ()I
    //   51: if_icmplt -> 100
    //   54: iload_1
    //   55: aload #6
    //   57: invokeinterface endOffset : ()I
    //   62: if_icmpge -> 100
    //   65: aload #4
    //   67: aload #6
    //   69: aload #6
    //   71: invokeinterface startOffset : ()I
    //   76: aload #6
    //   78: invokeinterface endOffset : ()I
    //   83: iload_2
    //   84: isub
    //   85: invokeinterface Zg : (II)Lburp/Zkv5;
    //   90: invokeinterface add : (Ljava/lang/Object;)Z
    //   95: pop
    //   96: aload_3
    //   97: ifnonnull -> 235
    //   100: iload_1
    //   101: aload #6
    //   103: invokeinterface startOffset : ()I
    //   108: if_icmpge -> 166
    //   111: iload_1
    //   112: iload_2
    //   113: iadd
    //   114: aload #6
    //   116: invokeinterface startOffset : ()I
    //   121: if_icmple -> 166
    //   124: iload_1
    //   125: iload_2
    //   126: iadd
    //   127: aload #6
    //   129: invokeinterface endOffset : ()I
    //   134: if_icmpgt -> 166
    //   137: aload #4
    //   139: aload #6
    //   141: iload_1
    //   142: aload #6
    //   144: invokeinterface endOffset : ()I
    //   149: iload_2
    //   150: isub
    //   151: invokeinterface Zg : (II)Lburp/Zkv5;
    //   156: invokeinterface add : (Ljava/lang/Object;)Z
    //   161: pop
    //   162: aload_3
    //   163: ifnonnull -> 235
    //   166: iload_1
    //   167: aload #6
    //   169: invokeinterface endOffset : ()I
    //   174: if_icmplt -> 191
    //   177: aload #4
    //   179: aload #6
    //   181: invokeinterface add : (Ljava/lang/Object;)Z
    //   186: pop
    //   187: aload_3
    //   188: ifnonnull -> 235
    //   191: iload_1
    //   192: aload #6
    //   194: invokeinterface startOffset : ()I
    //   199: if_icmpgt -> 235
    //   202: aload #4
    //   204: aload #6
    //   206: aload #6
    //   208: invokeinterface startOffset : ()I
    //   213: iload_2
    //   214: isub
    //   215: aload #6
    //   217: invokeinterface endOffset : ()I
    //   222: iload_2
    //   223: isub
    //   224: invokeinterface Zg : (II)Lburp/Zkv5;
    //   229: invokeinterface add : (Ljava/lang/Object;)Z
    //   234: pop
    //   235: aload_3
    //   236: ifnonnull -> 21
    //   239: aload #4
    //   241: areturn
  }
  
  private void ZO() {
    this.ZX.stop();
  }
  
  private void ZK() {
    if (!this.Zr && !this.ZC)
      this.ZX.restart(); 
  }
  
  public void Zt(String paramString) {}
  
  public Font ZM() {
    String str = this.ZM.Zf8();
    int i = this.ZM.ZfF();
    return new Font(str, 0, i);
  }
  
  public boolean Zs() {
    return this.ZM.Zf2();
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.ZP.ZI(paramInt, paramObject);
  }
  
  private void lambda$setSelection$5(int paramInt1, int paramInt2) {
    ZM(paramInt1, paramInt2);
  }
  
  private void lambda$setEditor$4(Runnable paramRunnable) {
    try {
      this.Zs = true;
      paramRunnable.run();
      this.Zs = false;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void lambda$setText$3(String paramString, boolean paramBoolean) {
    this.ZP.Zz(paramString, paramBoolean);
  }
  
  private void lambda$replaceText$2(String paramString, int paramInt1, int paramInt2) {
    this.ZP.ZW(paramString, paramInt1, paramInt2);
  }
  
  private void lambda$replaceRawBytes$1(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.ZP.ZW(Zkb.ZG(paramArrayOfbyte), paramInt1, paramInt2);
  }
  
  private void lambda$new$0(Znj paramZnj) {
    // Byte code:
    //   0: invokestatic Zz : ()[I
    //   3: astore_2
    //   4: getstatic burp/Zkvc.ZJ : [I
    //   7: aload_1
    //   8: invokevirtual ZO : ()Lburp/Ztjr;
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: tableswitch default -> 92, 1 -> 44, 2 -> 57, 3 -> 70, 4 -> 83
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield Zr : Z
    //   49: aload_0
    //   50: invokevirtual ZO : ()V
    //   53: aload_2
    //   54: ifnonnull -> 92
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield ZC : Z
    //   62: aload_0
    //   63: invokevirtual ZO : ()V
    //   66: aload_2
    //   67: ifnonnull -> 92
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield Zr : Z
    //   75: aload_0
    //   76: invokevirtual ZK : ()V
    //   79: aload_2
    //   80: ifnonnull -> 92
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield ZC : Z
    //   88: aload_0
    //   89: invokevirtual ZK : ()V
    //   92: return
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'dêkò»uJxá¤\\rZ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #9
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #59
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zbqd.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zbqd.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #86
    //   154: goto -> 184
    //   157: bipush #122
    //   159: goto -> 184
    //   162: bipush #61
    //   164: goto -> 184
    //   167: bipush #73
    //   169: goto -> 184
    //   172: bipush #12
    //   174: goto -> 184
    //   177: bipush #51
    //   179: goto -> 184
    //   182: bipush #93
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: invokestatic sharedInstance : ()Ljavax/swing/ToolTipManager;
    //   230: invokevirtual getDismissDelay : ()I
    //   233: putstatic burp/Zbqd.ZY : I
    //   236: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA45C) & 0xFFFF;
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
      char c = 'Þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbqd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */