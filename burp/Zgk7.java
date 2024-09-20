package burp;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zgk7 {
  private final Window ZD;
  
  private final Zljk Zg;
  
  private final Zzmq Zn;
  
  private final Zvov ZP;
  
  private boolean Zu;
  
  private Ztvw ZR;
  
  private final Highlighter.HighlightPainter Zo;
  
  private final Highlighter.HighlightPainter ZM;
  
  private final List<Ztdr> ZT;
  
  private transient boolean ZE;
  
  private final Zgfu Zp;
  
  private int Ze;
  
  private Position ZS;
  
  private Position ZA;
  
  private int Zj;
  
  private boolean ZK;
  
  private final Ztd4 ZZ;
  
  private final Zlpm ZB;
  
  private final Zlpm Zm;
  
  private final Zlpm Zc;
  
  private final Zlpm ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgk7(Window paramWindow, Zljk paramZljk, Zzmq paramZzmq, Zvov paramZvov) {
    this.ZD = paramWindow;
    this.Zg = paramZljk;
    this.Zn = paramZzmq;
    this.ZP = paramZvov;
    this.Zp = new Zgfu(this);
    Zgyd zgyd = Zljk.ZY();
    this.Zo = new Zrku(zgyd.ZT());
    this.ZM = new Zz6a(zgyd.ZU());
    this.ZT = new ArrayList<>(1);
    JTextComponent jTextComponent = paramZljk.Zr();
    Objects.requireNonNull(jTextComponent);
    Objects.requireNonNull(jTextComponent);
    this.ZZ = new Ztd4(jTextComponent::getInputMap, jTextComponent::getActionMap);
    this.ZB = new Zlpm(KeyStroke.getKeyStroke(9, 0), a(-25579, -22202), this::ZS);
    this.Zm = new Zlpm(KeyStroke.getKeyStroke(9, 64), a(-25580, 5617), this::ZB);
    this.Zc = new Zlpm(KeyStroke.getKeyStroke(10, 0), a(-25577, 10944), this::Zx);
    this.ZW = new Zlpm(KeyStroke.getKeyStroke(27, 0), a(-25583, -32654), this::Zg);
  }
  
  public void Zh() {
    try {
      if (this.Zu)
        return; 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    this.Zg.Zh(Ztjr.PARAMETERISED_COMPLETION_ACTIVATED);
    this.Zu = true;
    this.ZK = this.Zg.Zd();
    this.Zg.ZG(false);
    JTextComponent jTextComponent = this.Zg.Zr();
    this.Zj = -1;
    if (this.Zn.Zl()) {
      this.ZR = new Ztvw(this.ZD, this.Zg, this.Zn);
      try {
        int i = jTextComponent.getCaretPosition();
        Rectangle rectangle = jTextComponent.modelToView2D(i).getBounds();
        Point point = new Point(rectangle.x, rectangle.y);
        SwingUtilities.convertPointToScreen(point, jTextComponent);
        rectangle.x = point.x;
        rectangle.y = point.y;
        this.ZR.ZU(rectangle);
        this.ZR.Zj(true);
      } catch (BadLocationException badLocationException) {
        UIManager.getLookAndFeel().provideErrorFeedback(jTextComponent);
        this.ZR = null;
        Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      } 
    } 
    this.Zp.Zi(jTextComponent);
    this.Zj = ZC();
  }
  
  public void Zz() {
    if (!this.Zu)
      return; 
    this.Zg.Zh(Ztjr.PARAMETERISED_COMPLETION_DEACTIVATED);
    this.Zu = false;
    this.Zg.ZG(this.ZK);
    this.Zp.ZI();
    if (this.ZR != null)
      this.ZR.Zj(false); 
  }
  
  private String ZX(int paramInt) {
    int[] arrayOfInt = Zghd.ZM();
    List<Zkv5> list = Zr();
    try {
      if (list != null)
        try {
          if (!list.isEmpty()) {
            for (Zkv5 zkv5 : list) {
              try {
                if (paramInt >= zkv5.startOffset() && paramInt <= zkv5.endOffset()) {
                  int i = zkv5.startOffset();
                  int j = zkv5.endOffset() - i;
                  JTextComponent jTextComponent = this.Zg.Zr();
                  Document document = jTextComponent.getDocument();
                  try {
                    return document.getText(i, j);
                  } catch (BadLocationException badLocationException) {
                    UIManager.getLookAndFeel().provideErrorFeedback(jTextComponent);
                    Zah.Zl(badLocationException, Zk_.UNEXPECTED);
                    return null;
                  } 
                } 
              } catch (BadLocationException badLocationException) {
                throw a(null);
              } 
              if (arrayOfInt == null)
                break; 
            } 
            return null;
          } 
          return null;
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return null;
  }
  
  private int ZC() {
    JTextComponent jTextComponent = this.Zg.Zr();
    int i = jTextComponent.getCaretPosition();
    List<Zkv5> list = Zr();
    byte b = 0;
    int[] arrayOfInt = Zghd.ZM();
    while (b < list.size()) {
      Zkv5 zkv5 = list.get(b);
      if (i >= zkv5.startOffset() && i <= zkv5.endOffset())
        return b; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  private static int ZZ(List<? extends Zkv5> paramList) {
    byte b = -1;
    Zkv5 zkv5 = null;
    int[] arrayOfInt = Zghd.ZM();
    byte b1 = 0;
    while (b1 < paramList.size()) {
      Zkv5 zkv51 = paramList.get(b1);
      if (zkv5 == null || zkv51.startOffset() < zkv5.startOffset()) {
        zkv5 = zkv51;
        b = b1;
      } 
      b1++;
      if (arrayOfInt == null)
        break; 
    } 
    return b;
  }
  
  private static int ZJ(List<? extends Zkv5> paramList) {
    int i = -1;
    Zkv5 zkv5 = null;
    int j = paramList.size() - 1;
    int[] arrayOfInt = Zghd.ZM();
    while (j >= 0) {
      Zkv5 zkv51 = paramList.get(j);
      if (zkv5 == null || zkv51.startOffset() > zkv5.startOffset()) {
        zkv5 = zkv51;
        i = j;
      } 
      j--;
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  public List<Zkv5> Zr() {
    ArrayList<Zkv5> arrayList = new ArrayList(2);
    List<Zkv5> list = this.ZP.Zi();
    Iterator<Zkv5> iterator = list.iterator();
    int[] arrayOfInt = Zghd.ZM();
    while (iterator.hasNext()) {
      Zkv5 zkv5 = iterator.next();
      Highlighter.HighlightPainter highlightPainter = zkv5.ZOJ();
      if (highlightPainter == this.Zo)
        arrayList.add(zkv5); 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZR() {
    this.ZZ.Zu(this.ZB);
    this.ZZ.Zu(this.Zm);
    this.ZZ.Zu(this.Zc);
    this.ZZ.Zu(this.ZW);
    char c = this.Zn.ZT().ZC();
    if (c > '\000')
      this.ZZ.Zu(new Zlpm(KeyStroke.getKeyStroke(c), a(-25578, 9146), this::ZH)); 
  }
  
  private void Zw() {
    JTextComponent jTextComponent = this.Zg.Zr();
    int i = jTextComponent.getCaretPosition();
    int[] arrayOfInt = Zghd.ZM();
    if (this.ZP.Zi().isEmpty()) {
      jTextComponent.setCaretPosition(this.ZS.getOffset());
      Zz();
    } 
    Zkv5 zkv5 = null;
    int j = -1;
    List<Zkv5> list = Zr();
    int k = 0;
    while (k < list.size()) {
      Zkv5 zkv51 = list.get(k);
      if (zkv5 == null || zkv5.startOffset() <= i || (zkv51.startOffset() > i && zkv51.startOffset() <= zkv5.startOffset())) {
        zkv5 = zkv51;
        j = k;
      } 
      k++;
      if (arrayOfInt == null)
        break; 
    } 
    if (zkv5 != null && zkv5.startOffset() <= i) {
      k = ZZ(list);
      zkv5 = list.get(k);
      j = 0;
    } 
    if (zkv5 != null) {
      jTextComponent.setSelectionStart(zkv5.startOffset());
      jTextComponent.setSelectionEnd(zkv5.endOffset());
      Zp(j);
    } 
  }
  
  private void ZW() {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zljk;
    //   8: invokevirtual Zr : ()Ljavax/swing/text/JTextComponent;
    //   11: astore_2
    //   12: aload_0
    //   13: getfield ZP : Lburp/Zvov;
    //   16: invokeinterface Zi : ()Ljava/util/List;
    //   21: invokeinterface isEmpty : ()Z
    //   26: ifeq -> 46
    //   29: aload_2
    //   30: aload_0
    //   31: getfield ZS : Ljavax/swing/text/Position;
    //   34: invokeinterface getOffset : ()I
    //   39: invokevirtual setCaretPosition : (I)V
    //   42: aload_0
    //   43: invokevirtual Zz : ()V
    //   46: aload_2
    //   47: invokevirtual getCaretPosition : ()I
    //   50: istore_3
    //   51: aload_2
    //   52: invokevirtual getSelectionStart : ()I
    //   55: istore #4
    //   57: aconst_null
    //   58: astore #5
    //   60: iconst_0
    //   61: istore #6
    //   63: aload_0
    //   64: invokevirtual Zr : ()Ljava/util/List;
    //   67: astore #7
    //   69: iconst_0
    //   70: istore #8
    //   72: iload #8
    //   74: aload #7
    //   76: invokeinterface size : ()I
    //   81: if_icmpge -> 167
    //   84: aload #7
    //   86: iload #8
    //   88: invokeinterface get : (I)Ljava/lang/Object;
    //   93: checkcast burp/Zkv5
    //   96: astore #9
    //   98: aload #5
    //   100: ifnull -> 152
    //   103: aload #5
    //   105: invokeinterface startOffset : ()I
    //   110: iload_3
    //   111: if_icmpge -> 152
    //   114: aload #9
    //   116: invokeinterface startOffset : ()I
    //   121: iload #4
    //   123: if_icmpge -> 160
    //   126: aload #9
    //   128: invokeinterface startOffset : ()I
    //   133: aload #5
    //   135: invokeinterface startOffset : ()I
    //   140: if_icmpgt -> 152
    //   143: iload #6
    //   145: aload_0
    //   146: getfield Zj : I
    //   149: if_icmpne -> 160
    //   152: aload #9
    //   154: astore #5
    //   156: iload #8
    //   158: istore #6
    //   160: iinc #8, 1
    //   163: aload_1
    //   164: ifnonnull -> 72
    //   167: aload #7
    //   169: invokestatic ZZ : (Ljava/util/List;)I
    //   172: istore #8
    //   174: iload #6
    //   176: iload #8
    //   178: if_icmpne -> 254
    //   181: aload_0
    //   182: getfield Zj : I
    //   185: iload #8
    //   187: if_icmpne -> 254
    //   190: aload #7
    //   192: invokeinterface size : ()I
    //   197: iconst_1
    //   198: if_icmple -> 254
    //   201: aload #7
    //   203: invokestatic ZJ : (Ljava/util/List;)I
    //   206: istore #6
    //   208: aload #7
    //   210: iload #6
    //   212: invokeinterface get : (I)Ljava/lang/Object;
    //   217: checkcast burp/Zkv5
    //   220: astore #5
    //   222: aload_2
    //   223: aload #5
    //   225: invokeinterface startOffset : ()I
    //   230: invokevirtual setSelectionStart : (I)V
    //   233: aload_2
    //   234: aload #5
    //   236: invokeinterface endOffset : ()I
    //   241: invokevirtual setSelectionEnd : (I)V
    //   244: aload_0
    //   245: iload #6
    //   247: invokevirtual Zp : (I)V
    //   250: aload_1
    //   251: ifnonnull -> 319
    //   254: aload #5
    //   256: ifnull -> 302
    //   259: iload_3
    //   260: aload #5
    //   262: invokeinterface startOffset : ()I
    //   267: if_icmple -> 302
    //   270: aload_2
    //   271: aload #5
    //   273: invokeinterface startOffset : ()I
    //   278: invokevirtual setSelectionStart : (I)V
    //   281: aload_2
    //   282: aload #5
    //   284: invokeinterface endOffset : ()I
    //   289: invokevirtual setSelectionEnd : (I)V
    //   292: aload_0
    //   293: iload #6
    //   295: invokevirtual Zp : (I)V
    //   298: aload_1
    //   299: ifnonnull -> 319
    //   302: aload_2
    //   303: aload_0
    //   304: getfield ZS : Ljavax/swing/text/Position;
    //   307: invokeinterface getOffset : ()I
    //   312: invokevirtual setCaretPosition : (I)V
    //   315: aload_0
    //   316: invokevirtual Zz : ()V
    //   319: return
  }
  
  private void Zr(Document paramDocument) {
    int[] arrayOfInt = Zghd.ZM();
    int i = ZC();
    try {
      if (i > -1 && i < this.Zn.ZR()) {
        Zzat zzat = this.Zn.ZD(i);
        try {
          if (zzat.Zh()) {
            Zz();
            return;
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        List<Zkv5> list = Zr();
        Zkv5 zkv5 = list.get(i);
        int j = zkv5.startOffset();
        int k = zkv5.endOffset() - j;
        String str = null;
        try {
          str = paramDocument.getText(j, k);
        } catch (BadLocationException badLocationException) {
          Zah.Zl(badLocationException, Zk_.UNEXPECTED);
        } 
        for (Ztdr ztdr : this.ZT) {
          try {
            if (ztdr.ZA.equals(zzat.ZG()))
              ztdr.Zr = ZT(paramDocument, ztdr.Zr, str); 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          if (arrayOfInt == null)
            break; 
        } 
        try {
          if (arrayOfInt == null) {
            Zz();
            return;
          } 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        return;
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    Zz();
  }
  
  private void ZH() {
    this.ZP.ZW(Collections.emptyList());
    this.ZT.clear();
  }
  
  private Zbuk ZT(Document paramDocument, Zkv5 paramZkv5, String paramString) {
    int[] arrayOfInt = Zghd.ZM();
    try {
      int i = paramZkv5.startOffset();
      int j = paramZkv5.endOffset() - i;
      try {
        this.ZP.ZB(paramZkv5);
        if (paramDocument instanceof AbstractDocument) {
          try {
            ((AbstractDocument)paramDocument).replace(i, j, paramString, null);
            if (arrayOfInt == null) {
              paramDocument.remove(i, j);
              paramDocument.insertString(i, paramString, null);
              int n = i + paramString.length();
              Zbuk zbuk2 = new Zbuk(i, n, this.ZM);
              this.ZP.ZD(zbuk2);
              return zbuk2;
            } 
          } catch (BadLocationException badLocationException) {
            throw a(null);
          } 
          int m = i + paramString.length();
          Zbuk zbuk1 = new Zbuk(i, m, this.ZM);
          this.ZP.ZD(zbuk1);
          return zbuk1;
        } 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
      paramDocument.remove(i, j);
      paramDocument.insertString(i, paramString, null);
      int k = i + paramString.length();
      Zbuk zbuk = new Zbuk(i, k, this.ZM);
      this.ZP.ZD(zbuk);
      return zbuk;
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private void ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Lburp/Zljk;
    //   4: invokevirtual Zr : ()Ljavax/swing/text/JTextComponent;
    //   7: astore_2
    //   8: invokestatic ZM : ()[I
    //   11: aload_2
    //   12: invokevirtual getSelectionStart : ()I
    //   15: istore_3
    //   16: iconst_m1
    //   17: istore #4
    //   19: aload_0
    //   20: invokevirtual Zr : ()Ljava/util/List;
    //   23: astore #5
    //   25: astore_1
    //   26: iconst_0
    //   27: istore #6
    //   29: iload #6
    //   31: aload #5
    //   33: invokeinterface size : ()I
    //   38: if_icmpge -> 96
    //   41: aload #5
    //   43: iload #6
    //   45: invokeinterface get : (I)Ljava/lang/Object;
    //   50: checkcast burp/Zkv5
    //   53: astore #7
    //   55: aload #7
    //   57: invokeinterface startOffset : ()I
    //   62: istore #8
    //   64: iload_3
    //   65: iload #8
    //   67: if_icmplt -> 89
    //   70: iload_3
    //   71: aload #7
    //   73: invokeinterface endOffset : ()I
    //   78: if_icmpgt -> 89
    //   81: iload #6
    //   83: istore #4
    //   85: aload_1
    //   86: ifnonnull -> 96
    //   89: iinc #6, 1
    //   92: aload_1
    //   93: ifnonnull -> 29
    //   96: aload_0
    //   97: iload #4
    //   99: invokevirtual Zp : (I)V
    //   102: return
  }
  
  private void Zp(int paramInt) {
    if (paramInt != this.Zj) {
      if (this.ZR != null)
        this.ZR.Zx(paramInt); 
      this.Zj = paramInt;
    } 
  }
  
  public void Zv() {
    if (this.ZR != null)
      this.ZR.ZG(); 
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    Zw();
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    ZW();
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zz : ()V
    //   4: invokestatic ZM : ()[I
    //   7: aload_0
    //   8: getfield Zg : Lburp/Zljk;
    //   11: invokevirtual Zr : ()Ljavax/swing/text/JTextComponent;
    //   14: astore_3
    //   15: astore_2
    //   16: aload_3
    //   17: invokevirtual getCaretPosition : ()I
    //   20: istore #4
    //   22: iload #4
    //   24: aload_0
    //   25: getfield ZA : Ljavax/swing/text/Position;
    //   28: invokeinterface getOffset : ()I
    //   33: if_icmpeq -> 53
    //   36: aload_3
    //   37: aload_0
    //   38: getfield ZA : Ljavax/swing/text/Position;
    //   41: invokeinterface getOffset : ()I
    //   46: invokevirtual setCaretPosition : (I)V
    //   49: aload_2
    //   50: ifnonnull -> 83
    //   53: aload_0
    //   54: aload_3
    //   55: invokevirtual ZN : (Ljavax/swing/text/JTextComponent;)Ljavax/swing/Action;
    //   58: astore #5
    //   60: aload #5
    //   62: ifnull -> 77
    //   65: aload #5
    //   67: aload_1
    //   68: invokeinterface actionPerformed : (Ljava/awt/event/ActionEvent;)V
    //   73: aload_2
    //   74: ifnonnull -> 83
    //   77: aload_3
    //   78: ldc '\\n'
    //   80: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   83: return
  }
  
  private Action ZN(JTextComponent paramJTextComponent) {
    ActionMap actionMap = paramJTextComponent.getActionMap();
    return actionMap.get(a(-25584, 23995));
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    Zz();
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    JTextComponent jTextComponent = this.Zg.Zr();
    int i = jTextComponent.getCaretPosition();
    char c = this.Zn.ZT().ZC();
    int[] arrayOfInt = Zghd.ZM();
    if (i >= this.ZS.getOffset() - 2) {
      String str = ZX(i);
      if (str != null) {
        char c1 = this.Zn.ZT().Za();
        int j = ZM(str, c1);
        int k = ZM(str, c);
        if (j > k) {
          jTextComponent.replaceSelection(Character.toString(c));
          return;
        } 
      } 
      jTextComponent.setCaretPosition(Math.min(jTextComponent.getCaretPosition() + 1, jTextComponent.getDocument().getLength()));
      Zz();
      if (arrayOfInt == null) {
        jTextComponent.replaceSelection(Character.toString(c));
        return;
      } 
      return;
    } 
    jTextComponent.replaceSelection(Character.toString(c));
  }
  
  private int ZM(String paramString, char paramChar) {
    byte b = 0;
    int i = 0;
    int[] arrayOfInt = Zghd.ZM();
    int j;
    while ((j = paramString.indexOf(paramChar, i)) > -1) {
      b++;
      i = j + 1;
      if (arrayOfInt == null)
        break; 
    } 
    return b;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÅSxx7Úïüiº®­\?5õ/0Ù¡¯vó±²3Jho +cô~÷7÷Aj\\rÎp°ÄÚAí·À :\\rà59%öËhOØB'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
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
    //   68: ldc 'cæQPK·zÖÞí¾`´cAl\\f§8hKV©ØÕÌt'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #58
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
    //   129: putstatic burp/Zgk7.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgk7.b : [Ljava/lang/String;
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
    //   212: bipush #45
    //   214: goto -> 244
    //   217: bipush #23
    //   219: goto -> 244
    //   222: bipush #115
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #127
    //   234: goto -> 244
    //   237: bipush #93
    //   239: goto -> 244
    //   242: bipush #92
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
    int i = (paramInt1 ^ 0xFFFF9C15) & 0xFFFF;
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
      byte b1 = 74;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgk7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */