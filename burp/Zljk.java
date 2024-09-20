package burp;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.KeyAdapter;
import java.util.List;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.event.EventListenerList;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;

public class Zljk {
  private final Zvov ZD;
  
  private JTextComponent ZI;
  
  private Window ZX;
  
  private Zkmv Z_;
  
  private Dimension ZA;
  
  private Dimension ZR;
  
  private Color ZM;
  
  private Zgk7 Zw;
  
  private Zlqb Zg;
  
  private ListCellRenderer<Object> Zj;
  
  private Zg7m Zz;
  
  private static Ztry ZJ;
  
  private boolean ZF;
  
  private boolean Zi;
  
  private boolean Zb;
  
  private boolean Zf;
  
  private boolean Zr;
  
  private int Zn;
  
  private ListCellRenderer<Object> ZY;
  
  private KeyStroke Zl;
  
  private Object ZC;
  
  private Action Zm;
  
  private Object Zv;
  
  private Action ZT;
  
  private final Zemc ZS;
  
  private final Zzo8 ZB;
  
  private final Zl3d Zq;
  
  private final Zzh3 ZV;
  
  private final Zr1p Zo;
  
  private final EventListenerList Zk;
  
  private final KeyAdapter Zp;
  
  private boolean ZL;
  
  private boolean Zs;
  
  private static final Zgyd ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zljk(Zlqb paramZlqb, Zvov paramZvov) {
    this.ZD = paramZvov;
    ZP(75, 20);
    Zs(50, 20);
    ZX(paramZlqb);
    ZR(ZO());
    Zl(true);
    Zc(true);
    ZG(false);
    ZI(false);
    Zd(true);
    ZQ(true);
    Zs(300);
    this.ZS = new Zemc(this);
    this.ZB = new Zzo8(this);
    this.Zq = new Zl3d(this);
    this.ZV = new Zzh3(this);
    this.Zo = new Zr1p(this);
    this.Zk = new EventListenerList();
    this.Zp = new Zd2(this);
  }
  
  public void ZM(Zzil paramZzil) {
    this.Zk.add(Zzil.class, paramZzil);
  }
  
  public void Zz() {
    Zo();
  }
  
  protected void Zh(Ztjr paramZtjr) {
    Object[] arrayOfObject = this.Zk.getListenerList();
    Znj znj = null;
    int[] arrayOfInt = Zghd.ZM();
    int i = arrayOfObject.length - 2;
    while (i >= 0) {
      try {
        if (arrayOfObject[i] == Zzil.class) {
          if (znj == null)
            znj = new Znj(this, paramZtjr); 
          ((Zzil)arrayOfObject[i + 1]).ZE(znj);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      i -= 2;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public boolean Zn() {
    return this.Zf;
  }
  
  public Zlqb ZT() {
    return this.Zg;
  }
  
  public static KeyStroke ZO() {
    byte b = 2;
    return KeyStroke.getKeyStroke(32, b);
  }
  
  public Zg7m Zu() {
    return this.Zz;
  }
  
  int Zg() {
    Document document = this.ZI.getDocument();
    Element element = document.getDefaultRootElement();
    return element.getElementIndex(this.ZI.getCaretPosition());
  }
  
  public static Ztry Zx() {
    return ZJ;
  }
  
  public boolean Z_() {
    return this.ZF;
  }
  
  public static Zgyd ZY() {
    return ZH;
  }
  
  public Color ZC() {
    return this.ZM;
  }
  
  public int ZX() {
    return this.Zn;
  }
  
  public JTextComponent Zr() {
    return this.ZI;
  }
  
  ComponentOrientation Zq() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.ZI == null) ? null : this.ZI.getComponentOrientation();
  }
  
  public KeyStroke ZK() {
    return this.Zl;
  }
  
  public boolean ZJ() {
    boolean bool = ZM();
    bool |= Zh();
    return bool;
  }
  
  private boolean Zh() {
    try {
      if (this.Zw != null) {
        this.Zw.Zz();
        this.Zw = null;
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  protected boolean ZM() {
    try {
      if (this.Z_ != null)
        try {
          if (this.Z_.isVisible()) {
            Zx(false);
            return true;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  protected final void Zp(Zmy1 paramZmy1) {
    Zu(paramZmy1, false);
  }
  
  protected void Zu(Zmy1 paramZmy1, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zr : ()Ljavax/swing/text/JTextComponent;
    //   4: astore #4
    //   6: aload_0
    //   7: invokevirtual ZM : ()Z
    //   10: pop
    //   11: aload #4
    //   13: invokevirtual getCaret : ()Ljavax/swing/text/Caret;
    //   16: astore #5
    //   18: aload_1
    //   19: aload #4
    //   21: invokeinterface Zj : (Ljavax/swing/text/JTextComponent;)Lburp/Zmh_;
    //   26: astore #6
    //   28: aload #5
    //   30: aload #6
    //   32: invokevirtual Ziu : ()I
    //   35: invokeinterface setDot : (I)V
    //   40: invokestatic ZM : ()[I
    //   43: aload #5
    //   45: aload #6
    //   47: invokevirtual Zih : ()I
    //   50: invokeinterface moveDot : (I)V
    //   55: astore_3
    //   56: aload_0
    //   57: invokevirtual ZZ : ()Z
    //   60: ifeq -> 93
    //   63: aload_1
    //   64: instanceof burp/Zg7o
    //   67: ifeq -> 93
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload_1
    //   78: checkcast burp/Zg7o
    //   81: astore #7
    //   83: aload_0
    //   84: aload #7
    //   86: invokevirtual Zr : (Lburp/Zg7o;)V
    //   89: aload_3
    //   90: ifnonnull -> 145
    //   93: aload #4
    //   95: aload_1
    //   96: invokeinterface Zn : ()Ljava/lang/String;
    //   101: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   104: aload_0
    //   105: invokevirtual ZZ : ()Z
    //   108: ifeq -> 145
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_1
    //   119: instanceof burp/Zzmq
    //   122: ifeq -> 145
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload_1
    //   133: checkcast burp/Zzmq
    //   136: astore #8
    //   138: aload_0
    //   139: aload #8
    //   141: iload_2
    //   142: invokevirtual ZZ : (Lburp/Zzmq;Z)V
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   56	70	73	java/lang/IllegalArgumentException
    //   83	111	114	java/lang/IllegalArgumentException
    //   93	125	128	java/lang/IllegalArgumentException
  }
  
  public void ZN(JTextComponent paramJTextComponent) {
    try {
      if (this.ZI != null)
        ZS(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZI = paramJTextComponent;
    Zx(ZK());
    paramJTextComponent.addKeyListener(this.Zp);
    char c = this.Zg.Za();
    try {
      if (c != '\000' && c != ' ') {
        InputMap inputMap = paramJTextComponent.getInputMap();
        ActionMap actionMap = paramJTextComponent.getActionMap();
        KeyStroke keyStroke = KeyStroke.getKeyStroke(c);
        this.Zv = inputMap.get(keyStroke);
        inputMap.put(keyStroke, a(13138, 1961));
        this.ZT = actionMap.get(a(13141, -16002));
        actionMap.put(a(13141, -16002), new Zroc(this, c));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.ZB.Zi(this.ZI);
      this.ZB.hierarchyChanged(null);
      if (Zd())
        this.Zq.Z_(this.ZI); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      UIManager.addPropertyChangeListener(this.ZV);
      Za();
      this.Z_ = new Zkmv(this.ZX, this);
      this.Zo.Zs(this.Z_);
      this.Z_.applyComponentOrientation(Zq());
      if (this.Zj != null)
        this.Z_.Zy(this.Zj); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZA != null) {
        Zmse.Zf(this.Z_, this.ZA.width, this.ZA.height);
        this.Z_.setSize(this.Z_.getPreferredSize());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZR != null)
        this.Z_.ZJ(this.ZR); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void Zx(KeyStroke paramKeyStroke) {
    InputMap inputMap = this.ZI.getInputMap();
    this.ZC = inputMap.get(paramKeyStroke);
    inputMap.put(paramKeyStroke, a(13142, -26231));
    ActionMap actionMap = this.ZI.getActionMap();
    this.Zm = actionMap.get(a(13142, -26231));
    actionMap.put(a(13142, -26231), Zb());
  }
  
  protected Action Zb() {
    return new Zktf(this);
  }
  
  public boolean Zd() {
    return this.Zb;
  }
  
  public boolean ZH() {
    return this.Zi;
  }
  
  protected boolean Zs() {
    return this.Zs;
  }
  
  protected boolean ZR() {
    return this.ZL;
  }
  
  public boolean ZZ() {
    return this.Zr;
  }
  
  public boolean Zj() {
    try {
      if (this.Z_ != null)
        try {
          if (this.Z_.isVisible());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  protected int Zo() {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zg : Lburp/Zlqb;
    //   8: aload_0
    //   9: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   12: invokeinterface ZN : (Ljavax/swing/text/JTextComponent;)Ljava/lang/String;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnonnull -> 45
    //   22: aload_0
    //   23: invokevirtual Zj : ()Z
    //   26: ifne -> 45
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   35: athrow
    //   36: aload_0
    //   37: invokevirtual Zg : ()I
    //   40: ireturn
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_2
    //   46: ifnonnull -> 57
    //   49: iconst_0
    //   50: goto -> 61
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_2
    //   58: invokevirtual length : ()I
    //   61: istore_3
    //   62: iload_3
    //   63: ifne -> 108
    //   66: aload_0
    //   67: invokevirtual ZR : ()Z
    //   70: ifeq -> 108
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload_0
    //   81: invokevirtual Zj : ()Z
    //   84: ifeq -> 108
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual ZM : ()Z
    //   98: pop
    //   99: aload_0
    //   100: invokevirtual Zg : ()I
    //   103: ireturn
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: getfield Zg : Lburp/Zlqb;
    //   112: aload_0
    //   113: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   116: invokeinterface Zk : (Ljavax/swing/text/JTextComponent;)Ljava/util/List;
    //   121: astore #4
    //   123: aload #4
    //   125: ifnonnull -> 136
    //   128: iconst_0
    //   129: goto -> 143
    //   132: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   135: athrow
    //   136: aload #4
    //   138: invokeinterface size : ()I
    //   143: istore #5
    //   145: iload #5
    //   147: iconst_1
    //   148: if_icmpgt -> 216
    //   151: iload #5
    //   153: iconst_1
    //   154: if_icmpne -> 189
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_0
    //   165: invokevirtual Zj : ()Z
    //   168: ifne -> 216
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: iload_3
    //   179: ifeq -> 216
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: iload #5
    //   191: iconst_1
    //   192: if_icmpne -> 339
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: aload_0
    //   203: invokevirtual Zn : ()Z
    //   206: ifne -> 339
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: aload_0
    //   217: getfield Z_ : Lburp/Zkmv;
    //   220: aload #4
    //   222: invokevirtual ZU : (Ljava/util/List;)V
    //   225: aload_0
    //   226: getfield Z_ : Lburp/Zkmv;
    //   229: invokevirtual isVisible : ()Z
    //   232: ifne -> 386
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: aload_0
    //   243: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   246: aload_0
    //   247: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   250: invokevirtual getCaretPosition : ()I
    //   253: invokevirtual modelToView : (I)Ljava/awt/Rectangle;
    //   256: astore #6
    //   258: goto -> 273
    //   261: astore #7
    //   263: aload #7
    //   265: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   268: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   271: iconst_m1
    //   272: ireturn
    //   273: new java/awt/Point
    //   276: dup
    //   277: aload #6
    //   279: getfield x : I
    //   282: aload #6
    //   284: getfield y : I
    //   287: invokespecial <init> : (II)V
    //   290: astore #7
    //   292: aload #7
    //   294: aload_0
    //   295: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   298: invokestatic convertPointToScreen : (Ljava/awt/Point;Ljava/awt/Component;)V
    //   301: aload #6
    //   303: aload #7
    //   305: getfield x : I
    //   308: putfield x : I
    //   311: aload #6
    //   313: aload #7
    //   315: getfield y : I
    //   318: putfield y : I
    //   321: aload_0
    //   322: getfield Z_ : Lburp/Zkmv;
    //   325: aload #6
    //   327: invokevirtual ZZ : (Ljava/awt/Rectangle;)V
    //   330: aload_0
    //   331: iconst_1
    //   332: invokevirtual Zx : (Z)V
    //   335: aload_1
    //   336: ifnonnull -> 386
    //   339: iload #5
    //   341: iconst_1
    //   342: if_icmpne -> 374
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   351: athrow
    //   352: aload_0
    //   353: aload #4
    //   355: <illegal opcode> run : (Lburp/Zljk;Ljava/util/List;)Ljava/lang/Runnable;
    //   360: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   363: aload_1
    //   364: ifnonnull -> 386
    //   367: goto -> 374
    //   370: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   373: athrow
    //   374: aload_0
    //   375: invokevirtual ZM : ()Z
    //   378: pop
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   385: athrow
    //   386: aload_0
    //   387: invokevirtual Zg : ()I
    //   390: ireturn
    // Exception table:
    //   from	to	target	type
    //   18	29	32	javax/swing/text/BadLocationException
    //   22	41	41	javax/swing/text/BadLocationException
    //   45	53	53	javax/swing/text/BadLocationException
    //   62	73	76	javax/swing/text/BadLocationException
    //   66	87	90	javax/swing/text/BadLocationException
    //   80	104	104	javax/swing/text/BadLocationException
    //   123	132	132	javax/swing/text/BadLocationException
    //   145	157	160	javax/swing/text/BadLocationException
    //   151	171	174	javax/swing/text/BadLocationException
    //   164	182	185	javax/swing/text/BadLocationException
    //   178	195	198	javax/swing/text/BadLocationException
    //   189	209	212	javax/swing/text/BadLocationException
    //   202	235	238	javax/swing/text/BadLocationException
    //   242	258	261	javax/swing/text/BadLocationException
    //   292	345	348	javax/swing/text/BadLocationException
    //   339	367	370	javax/swing/text/BadLocationException
    //   352	379	382	javax/swing/text/BadLocationException
  }
  
  public void ZL(int paramInt) {
    paramInt = Math.max(0, paramInt);
    this.Zq.ZY.stop();
    this.Zq.ZY.setInitialDelay(paramInt);
  }
  
  public void ZG(boolean paramBoolean) {
    int[] arrayOfInt = Zghd.ZM();
    try {
      if (paramBoolean != this.Zb) {
        try {
          this.Zb = paramBoolean;
          if (this.ZI != null) {
            try {
              if (this.Zb) {
                try {
                  this.Zq.Z_(this.ZI);
                  if (arrayOfInt == null) {
                    this.Zq.Zt(this.ZI);
                    return;
                  } 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zq.Zt(this.ZI);
  }
  
  public void Zl(boolean paramBoolean) {
    try {
      if (paramBoolean != this.Zi) {
        this.Zi = paramBoolean;
        ZM();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zc(boolean paramBoolean) {
    this.Zf = paramBoolean;
  }
  
  public void ZX(Zlqb paramZlqb) {
    try {
      if (paramZlqb == null)
        throw new IllegalArgumentException(a(13144, -7028)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zg = paramZlqb;
      if (Zs())
        ZM(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZP(int paramInt1, int paramInt2) {
    try {
      this.ZA = new Dimension(paramInt1, paramInt2);
      if (this.Z_ != null) {
        Zmse.Zf(this.Z_, paramInt1, paramInt2);
        this.Z_.setSize(this.Z_.getPreferredSize());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zs(int paramInt1, int paramInt2) {
    try {
      this.ZR = new Dimension(paramInt1, paramInt2);
      if (this.Z_ != null)
        this.Z_.ZJ(this.ZR); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  protected void Zd(boolean paramBoolean) {
    this.Zs = paramBoolean;
  }
  
  protected void ZQ(boolean paramBoolean) {
    this.ZL = paramBoolean;
  }
  
  public void ZS(ListCellRenderer<Object> paramListCellRenderer) {
    try {
      this.Zj = paramListCellRenderer;
      if (this.Z_ != null) {
        this.Z_.Zy(paramListCellRenderer);
        ZM();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZU(boolean paramBoolean) {
    this.Zr = paramBoolean;
  }
  
  protected void Zx(boolean paramBoolean) {
    try {
      if (paramBoolean != this.Z_.isVisible())
        this.Z_.setVisible(paramBoolean); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZI(boolean paramBoolean) {
    this.ZF = paramBoolean;
  }
  
  public void ZR(KeyStroke paramKeyStroke) {
    try {
      if (paramKeyStroke == null)
        throw new IllegalArgumentException(a(13139, -3320)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!paramKeyStroke.equals(this.Zl)) {
        try {
          if (this.ZI != null) {
            ZQ();
            Zx(paramKeyStroke);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        this.Zl = paramKeyStroke;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void ZZ(Zzmq paramZzmq, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual Zh : ()Z
    //   8: pop
    //   9: aload_1
    //   10: invokeinterface ZR : ()I
    //   15: ifne -> 163
    //   18: aload_1
    //   19: instanceof burp/Zg7f
    //   22: ifne -> 163
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: aload_1
    //   33: invokeinterface ZT : ()Lburp/Zlqb;
    //   38: astore #4
    //   40: aload #4
    //   42: invokeinterface ZC : ()C
    //   47: istore #5
    //   49: iload #5
    //   51: ifne -> 63
    //   54: ldc ''
    //   56: goto -> 68
    //   59: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   62: athrow
    //   63: iload #5
    //   65: invokestatic toString : (C)Ljava/lang/String;
    //   68: astore #6
    //   70: iload_2
    //   71: ifeq -> 137
    //   74: aload #6
    //   76: sipush #13143
    //   79: sipush #26671
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: swap
    //   86: sipush #13140
    //   89: sipush #2947
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: astore #7
    //   102: aload_0
    //   103: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   106: aload #4
    //   108: invokeinterface Za : ()C
    //   113: invokestatic toString : (C)Ljava/lang/String;
    //   116: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   119: new burp/Zg7f
    //   122: dup
    //   123: aload #4
    //   125: aconst_null
    //   126: aconst_null
    //   127: aload #7
    //   129: invokespecial <init> : (Lburp/Zlqb;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   132: astore_1
    //   133: aload_3
    //   134: ifnonnull -> 163
    //   137: aload #4
    //   139: invokeinterface Za : ()C
    //   144: aload #6
    //   146: <illegal opcode> makeConcatWithConstants : (CLjava/lang/String;)Ljava/lang/String;
    //   151: astore #6
    //   153: aload_0
    //   154: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   157: aload #6
    //   159: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   162: return
    //   163: aload_0
    //   164: new burp/Zgk7
    //   167: dup
    //   168: aload_0
    //   169: getfield ZX : Ljava/awt/Window;
    //   172: aload_0
    //   173: aload_1
    //   174: aload_0
    //   175: getfield ZD : Lburp/Zvov;
    //   178: invokespecial <init> : (Ljava/awt/Window;Lburp/Zljk;Lburp/Zzmq;Lburp/Zvov;)V
    //   181: putfield Zw : Lburp/Zgk7;
    //   184: aload_0
    //   185: getfield Zw : Lburp/Zgk7;
    //   188: invokevirtual Zh : ()V
    //   191: return
    // Exception table:
    //   from	to	target	type
    //   4	25	28	java/lang/IllegalArgumentException
    //   49	59	59	java/lang/IllegalArgumentException
  }
  
  private void Zr(Zg7o paramZg7o) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: aload_1
    //   13: invokevirtual ZR : ()I
    //   16: iconst_1
    //   17: if_icmpne -> 40
    //   20: aload_3
    //   21: aload_1
    //   22: invokestatic Zh : (Lburp/Zzmq;)Ljava/lang/String;
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_2
    //   30: ifnonnull -> 70
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_3
    //   41: aload_1
    //   42: invokestatic ZA : (Lburp/Zzmq;)Ljava/lang/String;
    //   45: iconst_1
    //   46: anewarray java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_1
    //   52: invokestatic Zh : (Lburp/Zzmq;)Ljava/lang/String;
    //   55: aastore
    //   56: invokevirtual formatted : ([Ljava/lang/Object;)Ljava/lang/String;
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_3
    //   71: aload_1
    //   72: invokevirtual Zn : ()Ljava/lang/String;
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload_0
    //   80: getfield ZI : Ljavax/swing/text/JTextComponent;
    //   83: aload_3
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: invokevirtual replaceSelection : (Ljava/lang/String;)V
    //   90: return
    // Exception table:
    //   from	to	target	type
    //   12	33	36	java/lang/IllegalArgumentException
    //   20	63	66	java/lang/IllegalArgumentException
  }
  
  private static String ZA(Zzmq paramZzmq) {
    StringBuilder stringBuilder = new StringBuilder();
    Zlqb zlqb = paramZzmq.ZT();
    char c1 = zlqb.Za();
    try {
      if (c1 != '\000')
        stringBuilder.append(c1); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    stringBuilder.append(a(13136, -1594));
    char c2 = zlqb.ZC();
    try {
      if (c2 != '\000')
        stringBuilder.append(c2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  private static String Zh(Zzmq paramZzmq) {
    int[] arrayOfInt = Zghd.ZM();
    int i = paramZzmq.ZR();
    try {
      if (i == 0)
        return ""; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    String str = paramZzmq.ZT().ZK();
    byte b = 0;
    while (b < i) {
      try {
        if (b > 0)
          stringBuilder.append(str); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      String str1 = paramZzmq.ZD(b).ZG();
      try {
        if (str1 != null)
          stringBuilder.append(str1); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  public void ZS() {
    if (this.ZI != null) {
      ZM();
      this.ZI.removeKeyListener(this.Zp);
      ZQ();
      char c = this.Zg.Za();
      if (c != '\000') {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(c);
        InputMap inputMap = this.ZI.getInputMap();
        inputMap.put(keyStroke, this.Zv);
        ActionMap actionMap = this.ZI.getActionMap();
        actionMap.put(a(13141, -16002), this.ZT);
      } 
      try {
        this.ZB.Zl(this.ZI);
        if (this.ZX != null)
          this.ZS.ZA(this.ZX); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (Zd())
          this.Zq.Zt(this.ZI); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      UIManager.removePropertyChangeListener(this.ZV);
      this.ZI = null;
      this.Zo.ZT(this.Z_);
      this.Z_ = null;
    } 
  }
  
  private void ZQ() {
    InputMap inputMap = this.ZI.getInputMap();
    inputMap.put(this.Zl, this.ZC);
    ActionMap actionMap = this.ZI.getActionMap();
    actionMap.put(a(13137, 1887), this.Zm);
  }
  
  private void Za() {
    try {
      if (this.Z_ != null)
        this.Z_.Zp(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zw != null)
        this.Zw.Zv(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.ZY instanceof JComponent)
        ((JComponent)this.ZY).updateUI(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zs(int paramInt) {
    this.Zn = paramInt;
  }
  
  private void lambda$refreshPopupWindow$0(List<Zmy1> paramList) {
    Zp(paramList.get(0));
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'b\\füs ^.lïkvÇ¤íó?T@ î²öô\\r»gf¡¬u¸SX²D*ä÷µæÁ!½hE©\~¦È¹§Ú5n´\\tJÒ5£Áe­â©vä´ùçm7ÙI53»vð~1âÛ£\\f×´¯¼R½¬<ú'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #105
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
    //   67: ldc '!¤<uóëÅÅç¶aÇô½>éRx¨'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #126
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zljk.a : [Ljava/lang/String;
    //   130: bipush #9
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zljk.b : [Ljava/lang/String;
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
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #6
    //   219: goto -> 244
    //   222: bipush #118
    //   224: goto -> 244
    //   227: bipush #126
    //   229: goto -> 244
    //   232: bipush #47
    //   234: goto -> 244
    //   237: bipush #76
    //   239: goto -> 244
    //   242: bipush #64
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: new burp/Zgyd
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zljk.ZH : Lburp/Zgyd;
    //   310: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3350) & 0xFFFF;
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
      byte b1 = 15;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zljk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */