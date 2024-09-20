package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.swing.event.DocumentEvent;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze9f extends Ze98 implements Zg7l {
  public static final ExecutorService ZF;
  
  private Zbqi ZJ;
  
  private Zmhz ZR;
  
  private Zmhz ZK;
  
  private Future<?> Zk;
  
  private boolean ZN;
  
  private String ZX;
  
  private Zg50 Zv;
  
  private List<Ze7g> Zc = new CopyOnWriteArrayList<>();
  
  private final Segment Zd;
  
  private boolean Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ze9f(String paramString) {
    this((Zbqi)null, paramString);
  }
  
  public Ze9f(Zbqi paramZbqi, String paramString) {
    putProperty(a(-29165, -5224), Integer.valueOf(5));
    this.Zv = new Zg50(400);
    this.Zv.add(Zska.ZK());
    this.Zd = new Segment();
    Zb(paramZbqi);
    ZI(paramString);
  }
  
  protected void fireInsertUpdate(DocumentEvent paramDocumentEvent) {
    Element element = getDefaultRootElement();
    DocumentEvent.ElementChange elementChange = paramDocumentEvent.getChange(element);
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Element[] arrayOfElement = (elementChange == null) ? null : elementChange.getChildrenAdded();
    int i = element.getElementCount();
    boolean bool = (Zq() && arrayOfElement != null && i == arrayOfElement.length) ? true : false;
    ZR();
    if (bool)
      this.Zk = ZF.submit(this::Zz); 
    this.Zv.clear();
    this.Zc.clear();
    Zska zska = Zska.ZK();
    byte b = 0;
    while (b < i) {
      Zj(b, zska, bool);
      zska = ZP(b);
      this.Zv.add(zska);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    super.fireChangedUpdate(new AbstractDocument.DefaultDocumentEvent(this, 0, i - 1, DocumentEvent.EventType.CHANGE));
    super.fireInsertUpdate(paramDocumentEvent);
  }
  
  protected void fireRemoveUpdate(DocumentEvent paramDocumentEvent) {
    ZR();
    this.Zc.clear();
    this.Zv.clear();
    Element element = getDefaultRootElement();
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    int i = element.getElementCount();
    Zska zska = Zska.ZK();
    byte b = 0;
    while (b < i) {
      Zj(b, zska, false);
      zska = ZP(b);
      this.Zv.add(zska);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    super.fireChangedUpdate(new AbstractDocument.DefaultDocumentEvent(this, 0, i - 1, DocumentEvent.EventType.CHANGE));
    super.fireRemoveUpdate(paramDocumentEvent);
  }
  
  protected void fireChangedUpdate(DocumentEvent paramDocumentEvent) {
    ZR();
    this.Zc.clear();
    this.Zv.clear();
    Element element = getDefaultRootElement();
    int i = element.getElementCount();
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Zska zska = Zska.ZK();
    byte b = 0;
    while (b < i) {
      Zj(b, zska, false);
      zska = ZP(b);
      this.Zv.add(zska);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    super.fireChangedUpdate(paramDocumentEvent);
  }
  
  public int Zf(int paramInt) {
    return this.ZR.Zb(paramInt);
  }
  
  public Zska Zk(int paramInt) {
    return this.Zv.get(paramInt);
  }
  
  public String ZK() {
    return this.ZX;
  }
  
  public Ze7g Zw(int paramInt) {
    if (paramInt < 0 || paramInt >= this.Zc.size()) {
      Zuh.Zb(false, Zqf.Zr);
      return new Ze7g();
    } 
    return this.Zc.get(paramInt);
  }
  
  private void Zz() {
    // Byte code:
    //   0: invokestatic Zj : ()Ljavax/swing/text/Segment;
    //   3: astore_2
    //   4: invokestatic ZR : ()[Lburp/Zbqc;
    //   7: new burp/Zg50
    //   10: dup
    //   11: aload_0
    //   12: getfield Zv : Lburp/Zg50;
    //   15: invokevirtual size : ()I
    //   18: invokespecial <init> : (I)V
    //   21: astore_3
    //   22: astore_1
    //   23: new java/util/ArrayList
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore #4
    //   32: aload_0
    //   33: invokevirtual readLock : ()V
    //   36: aload_0
    //   37: invokevirtual getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   40: astore #6
    //   42: aload #6
    //   44: invokeinterface getElementCount : ()I
    //   49: istore #5
    //   51: invokestatic ZK : ()Lburp/Zska;
    //   54: astore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iload #8
    //   61: iload #5
    //   63: if_icmpge -> 118
    //   66: invokestatic interrupted : ()Z
    //   69: ifeq -> 81
    //   72: aload_0
    //   73: invokevirtual readUnlock : ()V
    //   76: aload_2
    //   77: invokestatic ZJ : (Ljavax/swing/text/Segment;)V
    //   80: return
    //   81: aload_0
    //   82: iload #8
    //   84: aload_0
    //   85: getfield ZR : Lburp/Zmhz;
    //   88: aload_2
    //   89: aload #4
    //   91: aload #7
    //   93: invokevirtual ZE : (ILburp/Zmhz;Ljavax/swing/text/Segment;Ljava/util/List;Lburp/Zska;)V
    //   96: aload_0
    //   97: iload #8
    //   99: invokevirtual ZP : (I)Lburp/Zska;
    //   102: astore #7
    //   104: aload_3
    //   105: aload #7
    //   107: invokevirtual add : (Ljava/lang/Object;)Z
    //   110: pop
    //   111: iinc #8, 1
    //   114: aload_1
    //   115: ifnull -> 59
    //   118: aload_0
    //   119: invokevirtual readUnlock : ()V
    //   122: aload_2
    //   123: invokestatic ZJ : (Ljavax/swing/text/Segment;)V
    //   126: goto -> 142
    //   129: astore #9
    //   131: aload_0
    //   132: invokevirtual readUnlock : ()V
    //   135: aload_2
    //   136: invokestatic ZJ : (Ljavax/swing/text/Segment;)V
    //   139: aload #9
    //   141: athrow
    //   142: aload_0
    //   143: getfield Zk : Ljava/util/concurrent/Future;
    //   146: astore #6
    //   148: invokestatic interrupted : ()Z
    //   151: ifeq -> 155
    //   154: return
    //   155: aload_0
    //   156: aload #6
    //   158: aload #4
    //   160: aload_3
    //   161: iload #5
    //   163: <illegal opcode> run : (Lburp/Ze9f;Ljava/util/concurrent/Future;Ljava/util/ArrayList;Lburp/Zg50;I)Ljava/lang/Runnable;
    //   168: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   171: return
    // Exception table:
    //   from	to	target	type
    //   32	72	129	finally
    //   81	118	129	finally
    //   129	131	129	finally
  }
  
  private void Zj(int paramInt, Zska paramZska, boolean paramBoolean) {
    Zmhz zmhz = paramBoolean ? this.ZK : this.ZR;
    ZE(paramInt, zmhz, this.Zd, this.Zc, paramZska);
  }
  
  private void ZE(int paramInt, Zmhz paramZmhz, Segment paramSegment, List<Ze7g> paramList, Zska paramZska) {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    Element element = getDefaultRootElement();
    boolean bool = (element.getElement(paramInt).getEndOffset() < element.getEndOffset()) ? true : false;
    Ze7g ze7g = ZK(paramInt, paramZmhz, paramSegment, paramZska, bool);
    if (paramInt < paramList.size()) {
      paramList.set(paramInt, ze7g);
      if (arrayOfZbqc != null) {
        paramList.add(ze7g);
        return;
      } 
      return;
    } 
    paramList.add(ze7g);
  }
  
  private Ze7g ZK(int paramInt, Zmhz paramZmhz, Segment paramSegment, Zska paramZska, boolean paramBoolean) {
    Element element1 = getDefaultRootElement();
    Element element2 = element1.getElement(paramInt);
    int i = element2.getStartOffset();
    int j = element2.getEndOffset();
    int k = Zz(j);
    try {
      getText(i, k - i, paramSegment);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return new Ze7g();
    } 
    Ze7g ze7g = paramZmhz.ZE(paramInt, paramSegment, paramZska, i);
    if (paramBoolean) {
      Zska zska = ZV(k, j);
      zska.Zb(ze7g.ZA());
      ze7g.ZX(zska);
    } 
    return ze7g;
  }
  
  private Zska ZP(int paramInt) {
    if (this.ZR.Zh())
      return Zska.ZK(); 
    Element element = getDefaultRootElement();
    boolean bool = (element.getElement(paramInt).getEndOffset() < element.getEndOffset()) ? true : false;
    Ze7g ze7g = this.Zc.get(paramInt);
    return (bool && ze7g.ZA().ZG()) ? (ze7g.ZA()).ZO : ze7g.ZA();
  }
  
  private Zska ZV(int paramInt1, int paramInt2) {
    try {
      getText(paramInt1, paramInt2 - paramInt1, this.Zd);
      return new Zska(this.Zd, this.Zd.offset, this.Zd.offset + this.Zd.count - 1, paramInt1, 49, 0);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return new Zska();
    } 
  }
  
  public boolean Zq(int paramInt, char paramChar) {
    return this.ZR.ZA(paramInt, paramChar);
  }
  
  public void ZI(String paramString) {
    this.ZR = this.ZJ.ZA(paramString);
    ZY();
    this.ZX = paramString;
  }
  
  public void ZF(Zmhz paramZmhz) {
    this.ZR = paramZmhz;
    ZY();
    this.ZX = a(-29167, 20895);
  }
  
  public void Zx(Zmhz paramZmhz) {
    this.ZK = paramZmhz;
  }
  
  public void Zu(boolean paramBoolean) {
    this.ZN = paramBoolean;
  }
  
  public void Zb(Zbqi paramZbqi) {
    this.ZJ = (paramZbqi != null) ? paramZbqi : Zbqi.Zx();
  }
  
  private void ZY() {
    Zbqc[] arrayOfZbqc = Zmgn.ZR();
    if (this.Zg)
      return; 
    this.Zv.clear();
    this.Zc.clear();
    Element element = getDefaultRootElement();
    int i = element.getElementCount();
    Zska zska = Zska.ZK();
    byte b = 0;
    while (b < i) {
      ZE(b, this.ZR, this.Zd, this.Zc, zska);
      zska = ZP(b);
      this.Zv.add(zska);
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    super.fireChangedUpdate(new AbstractDocument.DefaultDocumentEvent(this, 0, i - 1, DocumentEvent.EventType.CHANGE));
  }
  
  private boolean Zq() {
    return (this.ZN && this.ZK != null && getLength() > 200000);
  }
  
  public void ZH() {
    this.Zg = true;
  }
  
  public void ZD() {
    this.Zg = false;
  }
  
  private void ZR() {
    if (this.Zk != null) {
      this.Zk.cancel(true);
      this.Zk = null;
    } 
  }
  
  private void ZA() {
    try {
      if (this.Zk != null && !this.Zk.isDone())
        try {
          this.Zk.get();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  protected void insertUpdate(AbstractDocument.DefaultDocumentEvent paramDefaultDocumentEvent, AttributeSet paramAttributeSet) {
    putProperty(a(-29168, 24942), Boolean.valueOf(false));
    super.insertUpdate(paramDefaultDocumentEvent, paramAttributeSet);
  }
  
  public void remove(int paramInt1, int paramInt2) throws BadLocationException {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: iload_1
    //   5: ifne -> 38
    //   8: iload_2
    //   9: aload_0
    //   10: invokevirtual getLength : ()I
    //   13: if_icmpne -> 38
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_0
    //   24: invokevirtual ZR : ()V
    //   27: aload_3
    //   28: ifnull -> 49
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual ZA : ()V
    //   42: goto -> 49
    //   45: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   48: athrow
    //   49: aload_0
    //   50: iload_1
    //   51: iload_2
    //   52: invokespecial remove : (II)V
    //   55: return
    // Exception table:
    //   from	to	target	type
    //   4	16	19	javax/swing/text/BadLocationException
    //   8	31	34	javax/swing/text/BadLocationException
    //   23	42	45	javax/swing/text/BadLocationException
  }
  
  public void insertString(int paramInt, String paramString, AttributeSet paramAttributeSet) throws BadLocationException {
    ZA();
    super.insertString(paramInt, paramString, paramAttributeSet);
  }
  
  public void replace(int paramInt1, int paramInt2, String paramString, AttributeSet paramAttributeSet) throws BadLocationException {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: iload_1
    //   6: ifne -> 40
    //   9: iload_2
    //   10: aload_0
    //   11: invokevirtual getLength : ()I
    //   14: if_icmpne -> 40
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_0
    //   25: invokevirtual ZR : ()V
    //   28: aload #5
    //   30: ifnull -> 51
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_0
    //   41: invokevirtual ZA : ()V
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload_0
    //   52: iload_1
    //   53: iload_2
    //   54: aload_3
    //   55: aload #4
    //   57: invokespecial replace : (IILjava/lang/String;Ljavax/swing/text/AttributeSet;)V
    //   60: return
    // Exception table:
    //   from	to	target	type
    //   5	17	20	javax/swing/text/BadLocationException
    //   9	33	36	javax/swing/text/BadLocationException
    //   24	44	47	javax/swing/text/BadLocationException
  }
  
  private void lambda$createTokenListLookup$0(Future<?> paramFuture, ArrayList<Ze7g> paramArrayList, Zg50 paramZg50, int paramInt) {
    if (this.Zk != paramFuture)
      return; 
    this.Zc = paramArrayList;
    this.Zv = paramZg50;
    super.fireChangedUpdate(new AbstractDocument.DefaultDocumentEvent(this, 0, paramInt - 1, DocumentEvent.EventType.CHANGE));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '\\níV³@>U¹­wN®×aVÎ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #12
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
    //   69: putstatic burp/Ze9f.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Ze9f.b : [Ljava/lang/String;
    //   79: goto -> 225
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
    //   98: if_icmpgt -> 198
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 180, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 165, 4 -> 170, 5 -> 175
    //   152: iconst_4
    //   153: goto -> 182
    //   156: bipush #122
    //   158: goto -> 182
    //   161: iconst_1
    //   162: goto -> 182
    //   165: bipush #104
    //   167: goto -> 182
    //   170: bipush #70
    //   172: goto -> 182
    //   175: bipush #118
    //   177: goto -> 182
    //   180: bipush #96
    //   182: ixor
    //   183: ixor
    //   184: i2c
    //   185: castore
    //   186: iinc #6, 1
    //   189: dup
    //   190: ifne -> 198
    //   193: dup2
    //   194: dup_x1
    //   195: goto -> 105
    //   198: dup2_x1
    //   199: pop2
    //   200: dup_x2
    //   201: iload #6
    //   203: if_icmpgt -> 101
    //   206: pop
    //   207: new java/lang/String
    //   210: dup_x1
    //   211: swap
    //   212: invokespecial <init> : ([C)V
    //   215: invokevirtual intern : ()Ljava/lang/String;
    //   218: swap
    //   219: pop
    //   220: swap
    //   221: pop
    //   222: goto -> 39
    //   225: invokestatic newVirtualThreadPerTaskExecutor : ()Ljava/util/concurrent/ExecutorService;
    //   228: putstatic burp/Ze9f.ZF : Ljava/util/concurrent/ExecutorService;
    //   231: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8E11) & 0xFFFF;
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
      char c = 'ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */