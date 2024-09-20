package burp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.InputMap;
import javax.swing.JTextArea;
import javax.swing.JToolTip;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.plaf.TextUI;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmgw extends JTextArea {
  private static final Color Z_;
  
  private static final Color ZE;
  
  protected final Zkjk Zx;
  
  protected Zlkk ZD;
  
  int ZI;
  
  private final Zrf ZX;
  
  private Zth1 Zu;
  
  private int Zm;
  
  private Zefy ZB;
  
  private Zmtl ZP;
  
  private Zs1s[] Ze;
  
  private int Za;
  
  private boolean ZN;
  
  private boolean Zw;
  
  private Color ZC;
  
  private boolean Zt;
  
  private boolean ZV;
  
  private Zr8v ZG;
  
  private static int[] Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmgw(AbstractDocument paramAbstractDocument, Zkjk paramZkjk, Zrf paramZrf) {
    super(paramAbstractDocument);
    this.Zx = paramZkjk;
    this.ZX = paramZrf;
    Zw();
  }
  
  public static Color ZT() {
    return Z_;
  }
  
  public static Color ZD() {
    return ZE;
  }
  
  public void ZJ() {
    this.ZP.ZX();
  }
  
  protected Zmtl Zp() {
    return this.ZP;
  }
  
  protected Document createDefaultModel() {
    return new Ze98();
  }
  
  protected Zr8v Zt() {
    return new Zr8m(this, this);
  }
  
  protected Ztf6 Zh() {
    return new Ztf6(this);
  }
  
  protected Zmtl Zl() {
    return this.ZX.Zk(this);
  }
  
  public void Zn() {
    this.ZP.discardAllEdits();
  }
  
  public void ZA() {
    this.ZP.ZJ();
  }
  
  protected void fireCaretUpdate(CaretEvent paramCaretEvent) {
    ZW();
    super.fireCaretUpdate(paramCaretEvent);
  }
  
  private void ZL() {
    InputMap inputMap1 = getInputMap();
    KeyStroke keyStroke = KeyStroke.getKeyStroke(a(-18337, -30374));
    int i = Zz85.Zm();
    InputMap inputMap2 = inputMap1;
    while (inputMap2 != null) {
      inputMap2.remove(keyStroke);
      inputMap2 = inputMap2.getParent();
      if (i != 0)
        break; 
    } 
    if (inputMap1 != null) {
      KeyStroke keyStroke1 = KeyStroke.getKeyStroke(a(-18339, 14403));
      inputMap1.put(keyStroke1, a(-18340, -14096));
    } 
  }
  
  public float Zg() {
    return Zl(getFont()).Zi();
  }
  
  public float Zk() {
    return Zl(getFont()).Zy();
  }
  
  public final int Zv() {
    return this.Zm;
  }
  
  private Zefy Za() {
    return this.ZB;
  }
  
  public String getToolTipText(MouseEvent paramMouseEvent) {
    String str = null;
    if (Za() != null)
      str = Za().ZD(this, paramMouseEvent); 
    try {
    
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    return (str != null) ? str : getToolTipText();
  }
  
  private void ZY(String paramString) {
    super.replaceSelection(paramString);
  }
  
  protected void Zw() {
    putClientProperty(a(-18345, 29627), Boolean.TRUE);
    ZR(Zh());
    enableEvents(9L);
    Zm(true);
    ZY(ZD());
    setBackground(Color.WHITE);
    setWrapStyleWord(true);
    setTabSize(2);
    setForeground(Color.BLACK);
    this.Za = this.ZI = (getInsets()).top;
    this.ZG = Zt();
    addFocusListener(this.ZG);
    ZH();
    Zr(Zl());
    this.Ze = new Zs1s[2];
    Zl(0, Zs1s.THICK_VERTICAL_LINE_STYLE);
    Zl(1, Zs1s.BLOCK_STYLE);
    int i = Zz85.Zm();
    try {
      if (!Zb12.ZG())
        setDragEnabled(true); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    try {
      ZN(0);
      ZL();
      if (Zbqc.Zwu() == null)
        Zz85.Zr(++i); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  private void Zr(Zmtl paramZmtl) {
    try {
      if (this.ZP != null)
        getDocument().removeUndoableEditListener(this.ZP); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    this.ZP = paramZmtl;
    getDocument().addUndoableEditListener(paramZmtl);
  }
  
  protected void Zg(Ze9f paramZe9f, Zmtl paramZmtl) {
    super.setDocument(paramZe9f);
    this.ZP = paramZmtl;
    Objects.requireNonNull(paramZe9f);
    Arrays.<UndoableEditListener>stream(paramZe9f.<UndoableEditListener>getListeners(UndoableEditListener.class)).forEach(paramZe9f::removeUndoableEditListener);
    paramZe9f.addUndoableEditListener(paramZmtl);
  }
  
  public void paste() {
    ZJ();
    try {
      super.paste();
    } finally {
      ZA();
    } 
  }
  
  public void read(Reader paramReader, Object paramObject) throws IOException {
    Ze86 ze86 = (Ze86)getUI().getEditorKit(this);
    setText((String)null);
    Document document = getDocument();
    try {
      if (paramObject != null)
        document.putProperty(a(-18348, 15189), paramObject); 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    try {
      ze86.read(paramReader, document, 0);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.RETHROWN);
      throw new IOException(badLocationException.getMessage());
    } 
  }
  
  public void Z_() {
    try {
      try {
        if (this.ZP.canRedo())
          this.ZP.redo(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
    } catch (CannotRedoException cannotRedoException) {
      Zah.Zl(cannotRedoException, Zk_.UNEXPECTED);
    } 
  }
  
  public void replaceRange(String paramString, int paramInt1, int paramInt2) {
    try {
      if (paramInt2 < paramInt1)
        throw new IllegalArgumentException(a(-18341, 20394)); 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    Document document = getDocument();
    if (document != null)
      try {
        this.ZP.ZX();
        ((AbstractDocument)document).replace(paramInt1, paramInt2 - paramInt1, paramString, null);
      } catch (BadLocationException badLocationException) {
        Zah.Zl(badLocationException, Zk_.RETHROWN);
        throw new IllegalArgumentException(badLocationException.getMessage());
      } finally {
        this.ZP.ZJ();
      }  
  }
  
  public void replaceSelection(String paramString) {
    try {
      if (paramString == null) {
        ZY(paramString);
        return;
      } 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    if (this.Zw) {
      int i = paramString.indexOf('\t');
      if (i > -1) {
        int j = getSelectionStart();
        try {
          paramString = Zt(paramString, j, i);
        } catch (BadLocationException badLocationException) {
          Zah.Zl(badLocationException, Zk_.IMPOSSIBLE);
        } 
      } 
    } 
    try {
      if (this.Zm == 1)
        try {
          if (!"\n".equals(paramString) && !a(-18347, -616).equals(paramString)) {
            Caret caret = getCaret();
            int i = caret.getDot();
            Document document = getDocument();
            Element element = document.getDefaultRootElement();
            int j = element.getElementIndex(i);
            int k = element.getElementCount() - 1;
            try {
              int m = getLineEndOffset(j);
              try {
                if (j != k) {
                  try {
                  
                  } catch (BadLocationException badLocationException) {
                    throw b(null);
                  } 
                  m = (document instanceof Ze98) ? ((Ze98)document).Zz(m) : (m - 1);
                } 
              } catch (BadLocationException badLocationException) {
                throw b(null);
              } 
              try {
                if (i == caret.getMark())
                  try {
                    if (i != m)
                      caret.moveDot(Math.min(i + paramString.length(), m)); 
                  } catch (BadLocationException badLocationException) {
                    throw b(null);
                  }  
              } catch (BadLocationException badLocationException) {
                throw b(null);
              } 
            } catch (BadLocationException badLocationException) {
              Zah.Zl(badLocationException, Zk_.UNEXPECTED);
            } 
          } 
        } catch (BadLocationException badLocationException) {
          throw b(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    ZY(paramString);
  }
  
  private String Zt(String paramString, int paramInt1, int paramInt2) throws BadLocationException {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getTabSize : ()I
    //   4: istore #5
    //   6: aload_0
    //   7: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   10: astore #6
    //   12: aload #6
    //   14: invokeinterface getDefaultRootElement : ()Ljavax/swing/text/Element;
    //   19: astore #7
    //   21: invokestatic ZT : ()I
    //   24: aload #7
    //   26: iload_2
    //   27: invokeinterface getElementIndex : (I)I
    //   32: istore #8
    //   34: istore #4
    //   36: aload #7
    //   38: iload #8
    //   40: invokeinterface getElement : (I)Ljavax/swing/text/Element;
    //   45: astore #9
    //   47: aload #9
    //   49: invokeinterface getStartOffset : ()I
    //   54: istore #10
    //   56: iload_2
    //   57: iload #10
    //   59: isub
    //   60: istore #11
    //   62: new javax/swing/text/Segment
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #12
    //   71: iload #11
    //   73: ifle -> 153
    //   76: aload #6
    //   78: iload #10
    //   80: iload #11
    //   82: aload #12
    //   84: invokeinterface getText : (IILjavax/swing/text/Segment;)V
    //   89: iconst_0
    //   90: istore #11
    //   92: iconst_0
    //   93: istore #13
    //   95: iload #13
    //   97: aload #12
    //   99: getfield count : I
    //   102: if_icmpge -> 153
    //   105: aload #12
    //   107: getfield array : [C
    //   110: aload #12
    //   112: getfield offset : I
    //   115: iload #13
    //   117: iadd
    //   118: caload
    //   119: istore #14
    //   121: iload #14
    //   123: bipush #9
    //   125: if_icmpne -> 136
    //   128: iconst_0
    //   129: istore #11
    //   131: iload #4
    //   133: ifne -> 145
    //   136: iload #11
    //   138: iconst_1
    //   139: iadd
    //   140: iload #5
    //   142: irem
    //   143: istore #11
    //   145: iinc #13, 1
    //   148: iload #4
    //   150: ifne -> 95
    //   153: aload_1
    //   154: invokevirtual length : ()I
    //   157: iconst_1
    //   158: if_icmpne -> 174
    //   161: iload #5
    //   163: iload #11
    //   165: isub
    //   166: invokestatic Zu : (I)Ljava/lang/String;
    //   169: areturn
    //   170: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   173: athrow
    //   174: new java/lang/StringBuilder
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: astore #13
    //   183: aload_1
    //   184: invokevirtual toCharArray : ()[C
    //   187: astore #14
    //   189: iconst_0
    //   190: istore #15
    //   192: iload #11
    //   194: istore #16
    //   196: iload_3
    //   197: istore #17
    //   199: iload #17
    //   201: aload #14
    //   203: arraylength
    //   204: if_icmpge -> 341
    //   207: aload #14
    //   209: iload #17
    //   211: caload
    //   212: istore #18
    //   214: iload #18
    //   216: lookupswitch default -> 323, 9 -> 244, 10 -> 315
    //   244: iload #17
    //   246: iload #15
    //   248: if_icmple -> 280
    //   251: goto -> 258
    //   254: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   257: athrow
    //   258: aload #13
    //   260: aload #14
    //   262: iload #15
    //   264: iload #17
    //   266: iload #15
    //   268: isub
    //   269: invokevirtual append : ([CII)Ljava/lang/StringBuilder;
    //   272: pop
    //   273: goto -> 280
    //   276: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   279: athrow
    //   280: iload #5
    //   282: iload #16
    //   284: iload #5
    //   286: irem
    //   287: isub
    //   288: istore #19
    //   290: aload #13
    //   292: iload #19
    //   294: invokestatic Zu : (I)Ljava/lang/String;
    //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: pop
    //   301: iload #17
    //   303: iconst_1
    //   304: iadd
    //   305: istore #15
    //   307: iconst_0
    //   308: istore #16
    //   310: iload #4
    //   312: ifne -> 333
    //   315: iconst_0
    //   316: istore #16
    //   318: iload #4
    //   320: ifne -> 333
    //   323: iinc #16, 1
    //   326: goto -> 333
    //   329: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   332: athrow
    //   333: iinc #17, 1
    //   336: iload #4
    //   338: ifne -> 199
    //   341: iload #15
    //   343: aload #14
    //   345: arraylength
    //   346: if_icmpge -> 372
    //   349: aload #13
    //   351: aload #14
    //   353: iload #15
    //   355: aload #14
    //   357: arraylength
    //   358: iload #15
    //   360: isub
    //   361: invokevirtual append : ([CII)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: goto -> 372
    //   368: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   371: athrow
    //   372: aload #13
    //   374: invokevirtual toString : ()Ljava/lang/String;
    //   377: areturn
    // Exception table:
    //   from	to	target	type
    //   153	170	170	javax/swing/text/BadLocationException
    //   214	251	254	javax/swing/text/BadLocationException
    //   244	273	276	javax/swing/text/BadLocationException
    //   318	326	329	javax/swing/text/BadLocationException
    //   341	365	368	javax/swing/text/BadLocationException
  }
  
  private static String Zu(int paramInt) {
    return " ".repeat(Math.max(0, paramInt));
  }
  
  public void setCaret(Caret paramCaret) {
    try {
      super.setCaret(paramCaret);
      if (this.Ze != null)
        try {
          if (paramCaret instanceof Zz_j)
            ((Zz_j)paramCaret).Zi(this.Ze[Zv()]); 
        } catch (CannotRedoException cannotRedoException) {
          throw b(null);
        }  
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  public void Zl(int paramInt, Zs1s paramZs1s) {
    if (paramZs1s == null)
      paramZs1s = Zs1s.THICK_VERTICAL_LINE_STYLE; 
    try {
      this.Ze[paramInt] = paramZs1s;
      if (paramInt == Zv())
        try {
          if (getCaret() instanceof Zz_j)
            ((Zz_j)getCaret()).Zi(paramZs1s); 
        } catch (CannotRedoException cannotRedoException) {
          throw b(null);
        }  
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  public void setDocument(Document paramDocument) {
    try {
      if (!(paramDocument instanceof Ze98))
        throw new IllegalArgumentException(a(-18346, -32751)); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    if (this.ZP != null) {
      Document document = getDocument();
      try {
        if (document != null)
          document.removeUndoableEditListener(this.ZP); 
      } catch (CannotRedoException cannotRedoException) {
        throw b(null);
      } 
    } 
    try {
      super.setDocument(paramDocument);
      if (this.ZP != null)
        paramDocument.addUndoableEditListener(this.ZP); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  public void ZN(int paramInt) {
    try {
      if (paramInt != 0 && paramInt != 1)
        paramInt = 0; 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    if (this.Zm != paramInt) {
      Caret caret = getCaret();
      try {
        if (caret instanceof Zz_j)
          ((Zz_j)caret).Zi(this.Ze[paramInt]); 
      } catch (CannotRedoException cannotRedoException) {
        throw b(null);
      } 
      this.Zm = paramInt;
      caret.setVisible(false);
      caret.setVisible(true);
    } 
  }
  
  public void ZM(Zefy paramZefy) {
    this.ZB = paramZefy;
  }
  
  public final void setUI(TextUI paramTextUI) {
    Ztf6 ztf6 = (Ztf6)getUI();
    try {
      if (ztf6 != null)
        ztf6.installDefaults(); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  public void Zr() {
    try {
      try {
        if (this.ZP.canUndo())
          this.ZP.undo(); 
      } catch (CannotRedoException cannotRedoException) {
        throw b(null);
      } 
    } catch (CannotUndoException cannotUndoException) {
      Zah.Zl(cannotUndoException, Zk_.UNEXPECTED);
    } 
  }
  
  public Zzkh Zl(Font paramFont) {
    return Zzkh.Zb(getFontMetrics(paramFont));
  }
  
  public JToolTip createToolTip() {
    JToolTip jToolTip = super.createToolTip();
    jToolTip.putClientProperty(a(-18352, 32730), Boolean.TRUE);
    return jToolTip;
  }
  
  public float Zh(int paramInt) throws BadLocationException {
    return ((Ztf6)getUI()).ZA(paramInt);
  }
  
  public void ZM(boolean paramBoolean) {
    this.Zw = paramBoolean;
  }
  
  public void setMargin(Insets paramInsets) {
    Insets insets = getInsets();
    try {
    
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    boolean bool1 = (insets != null) ? insets.top : false;
    try {
    
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    boolean bool2 = (paramInsets != null) ? paramInsets.top : false;
    try {
      if (bool1 != bool2)
        this.Za = this.ZI = bool2; 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    super.setMargin(paramInsets);
  }
  
  protected void paintComponent(Graphics paramGraphics) {
    this.Zu.ZI(paramGraphics, getVisibleRect());
    TextUI textUI = getUI();
    if (textUI != null) {
      Graphics graphics = paramGraphics.create();
      try {
        textUI.update(graphics, this);
      } finally {
        graphics.dispose();
      } 
    } 
  }
  
  public boolean Zb() {
    return this.Zt;
  }
  
  public void Zy(boolean paramBoolean) {
    try {
      if (this.Zt == paramBoolean)
        return; 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    boolean bool = this.Zt;
    this.Zt = paramBoolean;
    firePropertyChange(a(-18350, -27845), bool, paramBoolean);
  }
  
  protected void processComponentEvent(ComponentEvent paramComponentEvent) {
    try {
      if (paramComponentEvent.getID() == 101)
        try {
          if (getLineWrap())
            try {
              if (ZB())
                fireCaretUpdate(this.ZG); 
            } catch (CannotRedoException cannotRedoException) {
              throw b(null);
            }  
        } catch (CannotRedoException cannotRedoException) {
          throw b(null);
        }  
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    super.processComponentEvent(paramComponentEvent);
  }
  
  void ZH() {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: invokevirtual getMouseMotionListeners : ()[Ljava/awt/event/MouseMotionListener;
    //   6: astore_3
    //   7: aload_3
    //   8: astore #4
    //   10: aload #4
    //   12: arraylength
    //   13: istore #5
    //   15: invokestatic ZT : ()I
    //   18: iconst_0
    //   19: istore #6
    //   21: istore_1
    //   22: iload #6
    //   24: iload #5
    //   26: if_icmpge -> 65
    //   29: aload #4
    //   31: iload #6
    //   33: aaload
    //   34: astore #7
    //   36: aload #7
    //   38: aload_0
    //   39: getfield ZG : Lburp/Zr8v;
    //   42: if_acmpne -> 51
    //   45: iconst_0
    //   46: istore_2
    //   47: iload_1
    //   48: ifne -> 65
    //   51: iinc #6, 1
    //   54: iload_1
    //   55: ifne -> 22
    //   58: goto -> 65
    //   61: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   64: athrow
    //   65: iload_2
    //   66: ifeq -> 84
    //   69: aload_0
    //   70: aload_0
    //   71: getfield ZG : Lburp/Zr8v;
    //   74: invokevirtual addMouseMotionListener : (Ljava/awt/event/MouseMotionListener;)V
    //   77: goto -> 84
    //   80: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: aload_0
    //   85: invokevirtual getMouseListeners : ()[Ljava/awt/event/MouseListener;
    //   88: astore #4
    //   90: aload #4
    //   92: astore #5
    //   94: aload #5
    //   96: arraylength
    //   97: istore #6
    //   99: iconst_0
    //   100: istore #7
    //   102: iload #7
    //   104: iload #6
    //   106: if_icmpge -> 145
    //   109: aload #5
    //   111: iload #7
    //   113: aaload
    //   114: astore #8
    //   116: aload #8
    //   118: aload_0
    //   119: getfield ZG : Lburp/Zr8v;
    //   122: if_acmpne -> 131
    //   125: iconst_0
    //   126: istore_2
    //   127: iload_1
    //   128: ifne -> 145
    //   131: iinc #7, 1
    //   134: iload_1
    //   135: ifne -> 102
    //   138: goto -> 145
    //   141: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: iload_2
    //   146: ifeq -> 164
    //   149: aload_0
    //   150: aload_0
    //   151: getfield ZG : Lburp/Zr8v;
    //   154: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   157: goto -> 164
    //   160: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: return
    // Exception table:
    //   from	to	target	type
    //   47	58	61	javax/swing/undo/CannotRedoException
    //   65	77	80	javax/swing/undo/CannotRedoException
    //   127	138	141	javax/swing/undo/CannotRedoException
    //   145	157	160	javax/swing/undo/CannotRedoException
  }
  
  protected void ZF() {
    try {
      if (isShowing())
        SwingUtilities.invokeLater(this::lambda$forceCurrentLineHighlightRepaint$0); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  public final int ZM() {
    try {
      return getLineOfOffset(getCaretPosition());
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return 0;
    } 
  }
  
  public Color ZP() {
    return this.ZC;
  }
  
  public boolean ZB() {
    return this.ZN;
  }
  
  public final Color getBackground() {
    try {
    
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    return (this.Zu instanceof Zzzn) ? ((Zzzn)this.Zu).Za() : null;
  }
  
  public void setBackground(Color paramColor) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: invokevirtual getBackground : ()Ljava/awt/Color;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnull -> 35
    //   13: aload_0
    //   14: getfield Zu : Lburp/Zth1;
    //   17: checkcast burp/Zzzn
    //   20: aload_1
    //   21: invokevirtual ZT : (Ljava/awt/Color;)V
    //   24: iload_2
    //   25: ifne -> 54
    //   28: goto -> 35
    //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: new burp/Zzzn
    //   39: dup
    //   40: aload_1
    //   41: invokespecial <init> : (Ljava/awt/Color;)V
    //   44: putfield Zu : Lburp/Zth1;
    //   47: goto -> 54
    //   50: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_0
    //   55: aload_1
    //   56: ifnull -> 76
    //   59: aload_1
    //   60: invokevirtual getAlpha : ()I
    //   63: sipush #255
    //   66: if_icmpne -> 84
    //   69: goto -> 76
    //   72: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: iconst_1
    //   77: goto -> 85
    //   80: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: iconst_0
    //   85: invokevirtual setOpaque : (Z)V
    //   88: aload_0
    //   89: sipush #-18351
    //   92: sipush #-14401
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: aload_3
    //   99: aload_1
    //   100: invokevirtual firePropertyChange : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   103: aload_0
    //   104: invokevirtual repaint : ()V
    //   107: return
    // Exception table:
    //   from	to	target	type
    //   9	28	31	javax/swing/undo/CannotRedoException
    //   13	47	50	javax/swing/undo/CannotRedoException
    //   54	69	72	javax/swing/undo/CannotRedoException
    //   59	80	80	javax/swing/undo/CannotRedoException
  }
  
  public void Zn(Zlkk paramZlkk) {
    this.ZD = paramZlkk;
    setBackground(paramZlkk.ZS());
  }
  
  protected void ZR(Ztf6 paramZtf6) {
    try {
      super.setUI(paramZtf6);
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    setOpaque((getBackground() != null));
  }
  
  public float ZS() {
    return getRowHeight();
  }
  
  protected void ZW() {
    int i = getWidth();
    float f = ZS();
    try {
      Rectangle rectangle = Zy();
      if (rectangle == null)
        return; 
      this.ZI = rectangle.y;
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    try {
      ZB(this.ZI, i, f);
      if (this.Za != this.ZI)
        ZB(this.Za, i, f); 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    this.Za = this.ZI;
  }
  
  protected Rectangle Zy() throws BadLocationException {
    DefaultCaret defaultCaret = (DefaultCaret)getCaret();
    int i = defaultCaret.getDot();
    TextUI textUI = getUI();
    try {
      if (i != -1)
        try {
          if (textUI != null) {
            Rectangle2D rectangle2D = textUI.modelToView2D(this, i, defaultCaret.getDotBias());
            try {
            
            } catch (BadLocationException badLocationException) {
              throw b(null);
            } 
            return (rectangle2D == null) ? null : rectangle2D.getBounds();
          } 
          return null;
        } catch (BadLocationException badLocationException) {
          throw b(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    return null;
  }
  
  void ZB(int paramInt1, int paramInt2, float paramFloat) {
    repaint(0, paramInt1, paramInt2, (int)Math.ceil(paramFloat));
  }
  
  public void ZY(Color paramColor) {
    try {
      if (paramColor == null)
        throw new NullPointerException(); 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    if (!paramColor.equals(this.ZC)) {
      Color color = this.ZC;
      this.ZC = paramColor;
      firePropertyChange(a(-18338, -31036), color, paramColor);
    } 
  }
  
  public void setFont(Font paramFont) {
    try {
      if (paramFont != null)
        try {
          if (paramFont.getSize() <= 0)
            throw new IllegalArgumentException(a(-18349, 32326)); 
        } catch (CannotRedoException cannotRedoException) {
          throw b(null);
        }  
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    try {
      super.setFont(paramFont);
      if (paramFont != null)
        try {
          if (this.ZN)
            ZW(); 
        } catch (CannotRedoException cannotRedoException) {
          throw b(null);
        }  
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    Zgmc.Zy();
  }
  
  public void Zm(boolean paramBoolean) {
    try {
      if (paramBoolean != this.ZN) {
        try {
          this.ZN = paramBoolean;
        } catch (CannotRedoException cannotRedoException) {
          throw b(null);
        } 
        firePropertyChange(a(-18342, 6071), !paramBoolean, paramBoolean);
        repaint();
      } 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
  }
  
  public boolean ZE() {
    return this.ZV;
  }
  
  public void Zs(boolean paramBoolean) {
    try {
      if (this.ZV == paramBoolean)
        return; 
    } catch (CannotRedoException cannotRedoException) {
      throw b(null);
    } 
    boolean bool = this.ZV;
    this.ZV = paramBoolean;
    firePropertyChange(a(-18344, -12941), bool, paramBoolean);
  }
  
  private void lambda$forceCurrentLineHighlightRepaint$0() {
    fireCaretUpdate(this.ZG);
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'JÜð\\r9ú3ævKço´ü¿þßN5vpUY\{jop±¾e¶L~\\nÂ+ÑÈ7#S¼U»\\f0#¼ÙãøPÒ é\\t>bKD\`iíéjJlþXM /ÜbüSÎüþÎÊ\\r?Ù:Ã¦Ãñwg\\f\\f Äº%A|S¬`&\\nK7ëBTÜZ ÏÁ:nñÒÞÌÌWÔÜÅ!½ú>2Ý7óÚFC*Üâ¼j óøØ£²(Ûë\\nðåø03Éf¾7¦\\rS"<ò¾À~ñ¾,ÚQá\\r¥Ëù'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #58
    //   20: istore_1
    //   21: aconst_null
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZH : ([I)V
    //   27: bipush #58
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'N×4°èCFWO\Õ$Hv4OF¦ÍµFPS U>E5Àö°)îXO¸¯'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #16
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #28
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zmgw.a : [Ljava/lang/String;
    //   136: bipush #15
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zmgw.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #7
    //   218: goto -> 248
    //   221: bipush #112
    //   223: goto -> 248
    //   226: bipush #47
    //   228: goto -> 248
    //   231: bipush #88
    //   233: goto -> 248
    //   236: bipush #96
    //   238: goto -> 248
    //   241: bipush #43
    //   243: goto -> 248
    //   246: bipush #90
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: new javax/swing/plaf/ColorUIResource
    //   307: dup
    //   308: sipush #255
    //   311: bipush #51
    //   313: bipush #51
    //   315: invokespecial <init> : (III)V
    //   318: putstatic burp/Zmgw.Z_ : Ljava/awt/Color;
    //   321: new java/awt/Color
    //   324: dup
    //   325: sipush #255
    //   328: sipush #255
    //   331: sipush #170
    //   334: invokespecial <init> : (III)V
    //   337: putstatic burp/Zmgw.ZE : Ljava/awt/Color;
    //   340: return
  }
  
  public static void ZH(int[] paramArrayOfint) {
    Zc = paramArrayOfint;
  }
  
  public static int[] Ze() {
    return Zc;
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB856) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */