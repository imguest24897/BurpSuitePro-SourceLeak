package burp;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JViewport;
import javax.swing.SizeRequirements;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.BoxView;
import javax.swing.text.Element;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.Position;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class Zgpw extends BoxView implements Zgxu {
  private final Rectangle ZX;
  
  private final RenderingHints Zu;
  
  private final RenderingHints ZZ;
  
  private final Zmgn Zr;
  
  private final JViewport ZY;
  
  private final Ze9f ZP;
  
  private final Zkjk Zl;
  
  private final LayeredHighlighter Zn;
  
  private final Zxam Zk;
  
  private final Zse3 ZU;
  
  private Zeov Zj;
  
  private int ZA = -1;
  
  private int ZJ;
  
  private boolean Zp;
  
  private static int[] ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgpw(Element paramElement, Zmgn paramZmgn, JViewport paramJViewport, Zkjk paramZkjk) {
    super(paramElement, 1);
    int[] arrayOfInt = ZW();
    this.ZJ = -1;
    this.Zr = paramZmgn;
    this.ZY = paramJViewport;
    this.Zl = paramZkjk;
    this.ZP = (Ze9f)paramZmgn.getDocument();
    this.ZX = new Rectangle();
    this.Zu = Zv(false);
    this.ZZ = Zv(true);
    this.Zn = (LayeredHighlighter)paramZmgn.getHighlighter();
    this.ZU = new Zse3((paramZmgn.getBounds()).x, ZF(), paramZmgn.Zi());
    this.Zk = paramZmgn.Zm();
    Zvo6 zvo6 = (Zvo6)SwingUtilities.getAncestorOfClass(Zvo6.class, paramZmgn);
    if (zvo6 != null) {
      JViewport jViewport = zvo6.getViewport();
      this.Zj = new Zeov(jViewport, paramZmgn, this::ZW);
      jViewport.addChangeListener(this.Zj);
    } 
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  private RenderingHints Zv(boolean paramBoolean) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(RenderingHints.KEY_ANTIALIASING, paramBoolean ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
    hashMap.put(RenderingHints.KEY_TEXT_ANTIALIASING, paramBoolean ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
    hashMap.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
    return new RenderingHints((Map)hashMap);
  }
  
  private RenderingHints Zd(Zmgn paramZmgn) {
    return paramZmgn.Zo() ? this.ZZ : this.Zu;
  }
  
  int Zc(int paramInt, Ze7g paramZe7g, Zzkh paramZzkh) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zd : ()F
    //   4: aload_0
    //   5: aload_2
    //   6: aload_3
    //   7: invokevirtual Zi : (Lburp/Ze7g;Lburp/Zzkh;)F
    //   10: fsub
    //   11: fstore #5
    //   13: invokestatic ZW : ()[I
    //   16: iload_1
    //   17: istore #6
    //   19: astore #4
    //   21: fconst_0
    //   22: fstore #7
    //   24: iconst_1
    //   25: istore #8
    //   27: aload_2
    //   28: invokevirtual iterator : ()Ljava/util/Iterator;
    //   31: astore #9
    //   33: aload #9
    //   35: invokeinterface hasNext : ()Z
    //   40: ifeq -> 304
    //   43: aload #9
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast burp/Zska
    //   53: astore #10
    //   55: aload_0
    //   56: getfield Zr : Lburp/Zmgn;
    //   59: invokevirtual getLineWrap : ()Z
    //   62: ifeq -> 223
    //   65: aload #10
    //   67: aload_0
    //   68: getfield Zr : Lburp/Zmgn;
    //   71: aload_0
    //   72: getfield ZU : Lburp/Zse3;
    //   75: fload #7
    //   77: fload #5
    //   79: fconst_1
    //   80: fadd
    //   81: aload_3
    //   82: invokevirtual Zm : (Lburp/Zmgn;Ljavax/swing/text/TabExpander;FFLburp/Zzkh;)Lburp/Zgus;
    //   85: astore #11
    //   87: aload #11
    //   89: invokevirtual Zr : ()Z
    //   92: ifeq -> 164
    //   95: iload #8
    //   97: ifeq -> 119
    //   100: iload #6
    //   102: aload #11
    //   104: invokevirtual ZH : ()I
    //   107: iconst_1
    //   108: invokestatic max : (II)I
    //   111: iadd
    //   112: istore #6
    //   114: aload #4
    //   116: ifnonnull -> 139
    //   119: aload_0
    //   120: getfield Zr : Lburp/Zmgn;
    //   123: invokevirtual getWrapStyleWord : ()Z
    //   126: ifne -> 139
    //   129: iload #6
    //   131: aload #11
    //   133: invokevirtual ZH : ()I
    //   136: iadd
    //   137: istore #6
    //   139: aload_0
    //   140: getfield Zr : Lburp/Zmgn;
    //   143: invokevirtual ZE : ()Z
    //   146: ifeq -> 154
    //   149: iload #6
    //   151: goto -> 163
    //   154: aload_0
    //   155: getfield ZP : Lburp/Ze9f;
    //   158: iload #6
    //   160: invokevirtual Za : (I)I
    //   163: ireturn
    //   164: aload_0
    //   165: getfield Zr : Lburp/Zmgn;
    //   168: invokevirtual Zb : ()Z
    //   171: ifeq -> 198
    //   174: aload #10
    //   176: invokevirtual ZC : ()Z
    //   179: ifeq -> 198
    //   182: aload_0
    //   183: getfield ZP : Lburp/Ze9f;
    //   186: iload #6
    //   188: aload #10
    //   190: invokevirtual Za : ()I
    //   193: iadd
    //   194: invokevirtual Za : (I)I
    //   197: ireturn
    //   198: fload #5
    //   200: aload #11
    //   202: invokevirtual ZU : ()F
    //   205: fsub
    //   206: fstore #5
    //   208: fload #7
    //   210: aload #11
    //   212: invokevirtual ZU : ()F
    //   215: fadd
    //   216: fstore #7
    //   218: aload #4
    //   220: ifnonnull -> 286
    //   223: iload #6
    //   225: aload #10
    //   227: invokevirtual Za : ()I
    //   230: iadd
    //   231: iload_1
    //   232: isub
    //   233: sipush #500
    //   236: if_icmple -> 252
    //   239: aload_0
    //   240: getfield ZP : Lburp/Ze9f;
    //   243: iload_1
    //   244: sipush #500
    //   247: iadd
    //   248: invokevirtual Za : (I)I
    //   251: ireturn
    //   252: aload_0
    //   253: getfield Zr : Lburp/Zmgn;
    //   256: invokevirtual Zb : ()Z
    //   259: ifeq -> 286
    //   262: aload #10
    //   264: invokevirtual ZC : ()Z
    //   267: ifeq -> 286
    //   270: aload_0
    //   271: getfield ZP : Lburp/Ze9f;
    //   274: iload #6
    //   276: aload #10
    //   278: invokevirtual Za : ()I
    //   281: iadd
    //   282: invokevirtual Za : (I)I
    //   285: ireturn
    //   286: iload #6
    //   288: aload #10
    //   290: invokevirtual Za : ()I
    //   293: iadd
    //   294: istore #6
    //   296: iconst_0
    //   297: istore #8
    //   299: aload #4
    //   301: ifnonnull -> 33
    //   304: aload_0
    //   305: getfield Zr : Lburp/Zmgn;
    //   308: invokevirtual ZE : ()Z
    //   311: ifeq -> 319
    //   314: iload #6
    //   316: goto -> 328
    //   319: aload_0
    //   320: getfield ZP : Lburp/Ze9f;
    //   323: iload #6
    //   325: invokevirtual Za : (I)I
    //   328: ireturn
  }
  
  private float Zd() {
    null = getWidth();
    if (null >= 2.1474836E9F)
      null = getPreferredSpan(0); 
    return Math.max(null, 20.0F);
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory) {
    ZY(paramDocumentEvent, paramShape);
  }
  
  private void Zj(int paramInt1, int paramInt2, Rectangle paramRectangle) {
    paramRectangle.x += getOffset(0, paramInt1);
    paramRectangle.y += paramInt2;
    paramRectangle.width = getSpan(0, paramInt1);
    paramRectangle.height = getSpan(1, paramInt1);
  }
  
  public Shape getChildAllocation(int paramInt, Shape paramShape) {
    if (paramShape != null) {
      Shape shape = ZC(paramInt, paramShape);
      if (shape != null && !isAllocationValid()) {
        Rectangle rectangle = (shape instanceof Rectangle) ? (Rectangle)shape : shape.getBounds();
        if (rectangle.width == 0 && rectangle.height == 0)
          return null; 
      } 
      return shape;
    } 
    return null;
  }
  
  public Shape ZC(int paramInt, Shape paramShape) {
    Rectangle rectangle = getInsideAllocation(paramShape);
    int i = rectangle.y;
    List<Zxyv> list = ZF(paramInt);
    byte b = 0;
    int[] arrayOfInt = ZW();
    Zxyv zxyv = list.isEmpty() ? null : list.get(b);
    int j = 0;
    while (j < paramInt) {
      i += getSpan(1, j);
      if (zxyv != null && zxyv.Zp() == j) {
        j += zxyv.Zc();
        zxyv = (++b < list.size()) ? list.get(b) : null;
      } 
      j++;
      if (arrayOfInt == null)
        break; 
    } 
    Zj(paramInt, i, rectangle);
    return rectangle;
  }
  
  private List<Zxyv> ZF(int paramInt) {
    Zxam zxam = this.Zr.Zm();
    ArrayList<Zxyv> arrayList = new ArrayList();
    int[] arrayOfInt = ZW();
    byte b = 0;
    while (b < zxam.Zi()) {
      Zxyv zxyv = zxam.Zt(b);
      Zm(zxyv, arrayList);
      if (zxyv.Zl() >= paramInt)
        break; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private void Zm(Zxyv paramZxyv, List<Zxyv> paramList) {
    if (paramZxyv.ZF())
      paramList.add(paramZxyv); 
  }
  
  public float getPreferredSpan(int paramInt) {
    int[] arrayOfInt = ZW();
    ZB();
    if (this.Zr.getDocument().getLength() == 0 || this.Zp)
      return (paramInt == 0) ? 0.0F : this.Zr.ZS(); 
    if (getWidth() == Integer.MAX_VALUE && paramInt == 1)
      return getViewCount() * this.Zr.ZS(); 
    float f = super.getPreferredSpan(paramInt);
    if (paramInt == 1 && this.Zr.ZY()) {
      Zxam zxam = this.Zr.Zm();
      Set<Integer> set = zxam.Zz();
      for (Integer integer : set) {
        f -= getSpan(1, integer.intValue());
        if (arrayOfInt == null)
          break; 
      } 
    } 
    return f;
  }
  
  protected SizeRequirements calculateMajorAxisRequirements(int paramInt, SizeRequirements paramSizeRequirements) {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: invokevirtual getWidth : ()I
    //   8: ldc 2147483647
    //   10: if_icmpeq -> 30
    //   13: aload_0
    //   14: getfield ZP : Lburp/Ze9f;
    //   17: invokevirtual getLength : ()I
    //   20: ifeq -> 30
    //   23: aload_0
    //   24: getfield Zp : Z
    //   27: ifeq -> 124
    //   30: aload_2
    //   31: ifnonnull -> 42
    //   34: new javax/swing/SizeRequirements
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: astore_2
    //   42: aload_0
    //   43: invokevirtual getWidth : ()I
    //   46: ldc 2147483647
    //   48: if_icmpne -> 80
    //   51: iload_1
    //   52: ifne -> 60
    //   55: ldc 2147483647
    //   57: goto -> 74
    //   60: aload_0
    //   61: invokevirtual getViewCount : ()I
    //   64: i2f
    //   65: aload_0
    //   66: getfield Zr : Lburp/Zmgn;
    //   69: invokevirtual ZS : ()F
    //   72: fmul
    //   73: f2i
    //   74: istore #4
    //   76: aload_3
    //   77: ifnonnull -> 98
    //   80: iload_1
    //   81: ifne -> 88
    //   84: iconst_0
    //   85: goto -> 96
    //   88: aload_0
    //   89: getfield Zr : Lburp/Zmgn;
    //   92: invokevirtual ZS : ()F
    //   95: f2i
    //   96: istore #4
    //   98: aload_2
    //   99: ldc 0.5
    //   101: putfield alignment : F
    //   104: aload_2
    //   105: iload #4
    //   107: putfield minimum : I
    //   110: aload_2
    //   111: iload #4
    //   113: putfield preferred : I
    //   116: aload_2
    //   117: iload #4
    //   119: putfield maximum : I
    //   122: aload_2
    //   123: areturn
    //   124: aload_0
    //   125: iload_1
    //   126: aload_2
    //   127: invokespecial calculateMajorAxisRequirements : (ILjavax/swing/SizeRequirements;)Ljavax/swing/SizeRequirements;
    //   130: areturn
  }
  
  private int ZF() {
    Integer integer = (Integer)getDocument().getProperty(a(27967, 4663));
    return (integer != null) ? integer.intValue() : 2;
  }
  
  protected View getViewAtPoint(int paramInt1, int paramInt2, Rectangle paramRectangle) {
    int i = getViewCount();
    int j = paramRectangle.y + getOffset(1, 0);
    List<Zxyv> list = ZF(i);
    byte b = 0;
    int[] arrayOfInt = ZW();
    Zxyv zxyv = list.isEmpty() ? null : list.get(b);
    int k = 0;
    while (k < i - 1) {
      int m = getSpan(1, k);
      if (paramInt2 < j + m) {
        Zj(k, j, paramRectangle);
        return getView(k);
      } 
      if (zxyv != null && zxyv.Zp() == k) {
        k += zxyv.Zc();
        zxyv = (++b < list.size()) ? list.get(b) : null;
      } 
      if (k < i - 1)
        j += m; 
      k++;
      if (arrayOfInt == null)
        break; 
    } 
    Zj(i - 1, j, paramRectangle);
    return getView(i - 1);
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory) {
    if (this.Zj != null)
      this.Zj.stateChanged(null); 
    ZY(paramDocumentEvent, paramShape);
    Rectangle rectangle = (paramShape != null && isAllocationValid()) ? getInsideAllocation(paramShape) : null;
    int i = paramDocumentEvent.getOffset();
    View view = getViewAtPosition(i, rectangle);
    if (view != null)
      view.insertUpdate(paramDocumentEvent, rectangle, paramViewFactory); 
  }
  
  protected void loadChildren(ViewFactory paramViewFactory) {
    Element element = getElement();
    int i = element.getElementCount();
    int[] arrayOfInt = ZW();
    if (i > 0) {
      View[] arrayOfView = new View[i];
      byte b = 0;
      while (b < i) {
        arrayOfView[b] = new Ztrf(this, element.getElement(b));
        b++;
        if (arrayOfInt == null)
          break; 
      } 
      replace(0, 0, arrayOfView);
    } 
  }
  
  public Shape modelToView(int paramInt, Shape paramShape, Position.Bias paramBias) throws BadLocationException {
    if (!isAllocationValid()) {
      Rectangle2D rectangle2D = paramShape.getBounds2D();
      setSize((float)rectangle2D.getWidth(), (float)rectangle2D.getHeight());
    } 
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    boolean bool = (paramBias == Position.Bias.Backward) ? true : false;
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int i = bool ? Math.max(0, paramInt - 1) : paramInt;
    try {
      if (bool)
        try {
          if (i < getStartOffset())
            return null; 
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    int j = getViewIndexAtPosition(i);
    try {
      if (j != -1 && j < getViewCount()) {
        View view = getView(j);
        try {
          if (view != null)
            try {
              if (i >= view.getStartOffset() && i < view.getEndOffset()) {
                Shape shape1 = getChildAllocation(j, paramShape);
                try {
                  if (shape1 == null)
                    return null; 
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
                Shape shape2 = view.modelToView(paramInt, shape1, paramBias);
                try {
                  if (shape2 == null)
                    try {
                      if (view.getEndOffset() == paramInt && ++j < getViewCount()) {
                        view = getView(j);
                        shape2 = view.modelToView(paramInt, getChildAllocation(j, paramShape), paramBias);
                      } 
                    } catch (BadLocationException badLocationException) {
                      throw a(null);
                    }  
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
                return shape2;
              } 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            }  
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
      } 
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    throw new BadLocationException(a(27966, -14515), paramInt);
  }
  
  public Shape modelToView(int paramInt1, Position.Bias paramBias1, int paramInt2, Position.Bias paramBias2, Shape paramShape) throws BadLocationException {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore #6
    //   5: aload_0
    //   6: iload_1
    //   7: aload #5
    //   9: aload_2
    //   10: invokevirtual modelToView : (ILjava/awt/Shape;Ljavax/swing/text/Position$Bias;)Ljava/awt/Shape;
    //   13: astore #7
    //   15: iload_3
    //   16: aload_0
    //   17: invokevirtual getEndOffset : ()I
    //   20: if_icmpne -> 129
    //   23: aload_0
    //   24: iload_3
    //   25: aload #5
    //   27: aload #4
    //   29: invokevirtual modelToView : (ILjava/awt/Shape;Ljavax/swing/text/Position$Bias;)Ljava/awt/Shape;
    //   32: astore #8
    //   34: goto -> 50
    //   37: astore #9
    //   39: aload #9
    //   41: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   44: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   47: aconst_null
    //   48: astore #8
    //   50: aload #8
    //   52: ifnonnull -> 140
    //   55: aload #5
    //   57: instanceof java/awt/Rectangle
    //   60: ifeq -> 82
    //   63: goto -> 70
    //   66: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   69: athrow
    //   70: aload #5
    //   72: checkcast java/awt/Rectangle
    //   75: goto -> 89
    //   78: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   81: athrow
    //   82: aload #5
    //   84: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   89: astore #9
    //   91: new java/awt/Rectangle
    //   94: dup
    //   95: aload #9
    //   97: getfield x : I
    //   100: aload #9
    //   102: getfield width : I
    //   105: iadd
    //   106: iconst_1
    //   107: isub
    //   108: aload #9
    //   110: getfield y : I
    //   113: iconst_1
    //   114: aload #9
    //   116: getfield height : I
    //   119: invokespecial <init> : (IIII)V
    //   122: astore #8
    //   124: aload #6
    //   126: ifnonnull -> 140
    //   129: aload_0
    //   130: iload_3
    //   131: aload #5
    //   133: aload #4
    //   135: invokevirtual modelToView : (ILjava/awt/Shape;Ljavax/swing/text/Position$Bias;)Ljava/awt/Shape;
    //   138: astore #8
    //   140: aload #7
    //   142: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   147: astore #9
    //   149: aload #8
    //   151: instanceof java/awt/Rectangle
    //   154: ifeq -> 169
    //   157: aload #8
    //   159: checkcast java/awt/Rectangle
    //   162: goto -> 176
    //   165: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   168: athrow
    //   169: aload #8
    //   171: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   176: astore #10
    //   178: aload #9
    //   180: getfield y : I
    //   183: aload #10
    //   185: getfield y : I
    //   188: if_icmpeq -> 247
    //   191: aload #5
    //   193: instanceof java/awt/Rectangle
    //   196: ifeq -> 218
    //   199: goto -> 206
    //   202: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   205: athrow
    //   206: aload #5
    //   208: checkcast java/awt/Rectangle
    //   211: goto -> 225
    //   214: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   217: athrow
    //   218: aload #5
    //   220: invokeinterface getBounds : ()Ljava/awt/Rectangle;
    //   225: astore #11
    //   227: aload #9
    //   229: aload #11
    //   231: getfield x : I
    //   234: putfield x : I
    //   237: aload #9
    //   239: aload #11
    //   241: getfield width : I
    //   244: putfield width : I
    //   247: aload #9
    //   249: aload #10
    //   251: invokevirtual add : (Ljava/awt/Rectangle;)V
    //   254: iload_3
    //   255: iload_1
    //   256: if_icmple -> 281
    //   259: aload #9
    //   261: dup
    //   262: getfield width : I
    //   265: aload #10
    //   267: getfield width : I
    //   270: isub
    //   271: putfield width : I
    //   274: goto -> 281
    //   277: invokestatic a : (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
    //   280: athrow
    //   281: aload #9
    //   283: areturn
    // Exception table:
    //   from	to	target	type
    //   23	34	37	javax/swing/text/BadLocationException
    //   50	63	66	javax/swing/text/BadLocationException
    //   55	78	78	javax/swing/text/BadLocationException
    //   149	165	165	javax/swing/text/BadLocationException
    //   178	199	202	javax/swing/text/BadLocationException
    //   191	214	214	javax/swing/text/BadLocationException
    //   247	274	277	javax/swing/text/BadLocationException
  }
  
  public void paint(Graphics paramGraphics, Shape paramShape) {
    Zl((Graphics2D)paramGraphics, paramShape);
  }
  
  private void Zl(Graphics2D paramGraphics2D, Shape paramShape) {
    int[] arrayOfInt = ZW();
    Rectangle rectangle1 = (paramShape instanceof Rectangle) ? (Rectangle)paramShape : paramShape.getBounds();
    Rectangle rectangle2 = paramGraphics2D.getClipBounds();
    paramGraphics2D.setRenderingHints(Zd(this.Zr));
    Zb8n zb8n = new Zb8n(this.Zn, paramGraphics2D, rectangle1, this.Zr, this);
    Zzkh zzkh = this.Zr.Zi();
    Zep3 zep3 = this.Zr.Zu();
    Zgl1 zgl1 = Zgl1.Zk(zep3, paramGraphics2D, this.ZU);
    Zb1e zb1e = new Zb1e(this, this.Zr, this.ZP, paramGraphics2D, zb8n, rectangle1, zgl1, this.Zl);
    int i = rectangle1.x;
    int j = getViewCount();
    this.ZX.y = rectangle1.y;
    int k = 0;
    while (k < j) {
      this.ZX.x = i + getOffset(0, k);
      this.ZX.width = Math.max(getSpan(0, k), 1);
      this.ZX.height = getSpan(1, k);
      boolean bool = this.ZX.intersects(rectangle2);
      if (bool)
        zb1e.Zl(k, this.ZX.y, zzkh); 
      this.ZX.y += this.ZX.height;
      Zxyv zxyv = this.Zk.ZY(k);
      if (zxyv != null && zxyv.ZF())
        k += zxyv.Zc(); 
      k++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent, Shape paramShape, ViewFactory paramViewFactory) {
    if (this.Zj != null)
      this.Zj.stateChanged(null); 
    ZY(paramDocumentEvent, paramShape);
    Rectangle rectangle = (paramShape != null && isAllocationValid()) ? getInsideAllocation(paramShape) : null;
    int i = paramDocumentEvent.getOffset();
    View view = getViewAtPosition(i, rectangle);
    if (view != null)
      view.removeUpdate(paramDocumentEvent, rectangle, paramViewFactory); 
  }
  
  public void setSize(float paramFloat1, float paramFloat2) {
    int[] arrayOfInt = ZW();
    ZB();
    if ((int)paramFloat1 != getWidth()) {
      preferenceChanged((View)null, true, true);
      Zx(true);
      super.setSize(paramFloat1, paramFloat2);
      Zx(false);
      if (arrayOfInt == null) {
        super.setSize(paramFloat1, paramFloat2);
        return;
      } 
      return;
    } 
    super.setSize(paramFloat1, paramFloat2);
  }
  
  private void Zx(boolean paramBoolean) {
    int i = getViewCount();
    byte b = 0;
    int[] arrayOfInt = ZW();
    while (b < i) {
      View view = getView(b);
      if (view instanceof Ztrf)
        ((Ztrf)view).Zw = paramBoolean; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  void ZW(int paramInt1, int paramInt2) {
    int[] arrayOfInt = ZW();
    if (paramInt1 == this.ZA && paramInt2 == this.ZJ)
      return; 
    this.ZA = paramInt1;
    this.ZJ = paramInt2;
    byte b = 0;
    while (b < getViewCount()) {
      Ztrf ztrf = (Ztrf)getView(b);
      boolean bool = (paramInt2 == -1 || (ztrf.getEndOffset() >= paramInt1 && ztrf.getStartOffset() <= paramInt2));
      if (ztrf.Zi != bool) {
        ztrf.Zi = bool;
        preferenceChanged(ztrf, true, true);
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    preferenceChanged((View)null, true, true);
    this.Zr.repaint();
  }
  
  private void ZY(DocumentEvent paramDocumentEvent, Shape paramShape) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getElement : ()Ljavax/swing/text/Element;
    //   4: astore #4
    //   6: invokestatic ZW : ()[I
    //   9: aload_1
    //   10: aload #4
    //   12: invokeinterface getChange : (Ljavax/swing/text/Element;)Ljavax/swing/event/DocumentEvent$ElementChange;
    //   17: astore #5
    //   19: astore_3
    //   20: aload_1
    //   21: invokeinterface getType : ()Ljavax/swing/event/DocumentEvent$EventType;
    //   26: getstatic javax/swing/event/DocumentEvent$EventType.CHANGE : Ljavax/swing/event/DocumentEvent$EventType;
    //   29: if_acmpne -> 40
    //   32: aload_0
    //   33: invokevirtual ZY : ()V
    //   36: aload_3
    //   37: ifnonnull -> 141
    //   40: aload #5
    //   42: ifnull -> 141
    //   45: aload #5
    //   47: invokeinterface getChildrenRemoved : ()[Ljavax/swing/text/Element;
    //   52: astore #6
    //   54: aload #5
    //   56: invokeinterface getChildrenAdded : ()[Ljavax/swing/text/Element;
    //   61: astore #7
    //   63: aload #7
    //   65: arraylength
    //   66: anewarray javax/swing/text/View
    //   69: astore #8
    //   71: iconst_0
    //   72: istore #9
    //   74: iload #9
    //   76: aload #7
    //   78: arraylength
    //   79: if_icmpge -> 107
    //   82: aload #8
    //   84: iload #9
    //   86: new burp/Ztrf
    //   89: dup
    //   90: aload_0
    //   91: aload #7
    //   93: iload #9
    //   95: aaload
    //   96: invokespecial <init> : (Lburp/Zgpw;Ljavax/swing/text/Element;)V
    //   99: aastore
    //   100: iinc #9, 1
    //   103: aload_3
    //   104: ifnonnull -> 74
    //   107: aload_0
    //   108: aload #5
    //   110: invokeinterface getIndex : ()I
    //   115: aload #6
    //   117: arraylength
    //   118: aload #8
    //   120: invokevirtual replace : (II[Ljavax/swing/text/View;)V
    //   123: aload_2
    //   124: ifnull -> 141
    //   127: aload_0
    //   128: aconst_null
    //   129: iconst_1
    //   130: iconst_1
    //   131: invokevirtual preferenceChanged : (Ljavax/swing/text/View;ZZ)V
    //   134: aload_0
    //   135: invokevirtual getContainer : ()Ljava/awt/Container;
    //   138: invokevirtual repaint : ()V
    //   141: aload_0
    //   142: invokevirtual ZB : ()V
    //   145: return
  }
  
  public void ZY() {
    int i = getViewCount();
    byte b = 0;
    int[] arrayOfInt = ZW();
    while (b < i) {
      if (getView(b) instanceof Ztrf)
        ((Ztrf)getView(b)).Z_(); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    preferenceChanged((View)null, true, true);
    if (this.ZP.getLength() != 0)
      Zt(); 
    this.Zr.repaint();
  }
  
  private void Zt() {
    Zx(true);
    ZB();
    super.getPreferredSpan(1);
    Zx(false);
  }
  
  private void ZB() {
    this.ZU.Zt(this.Zr.Zi());
  }
  
  public int viewToModel(float paramFloat1, float paramFloat2, Shape paramShape, Position.Bias[] paramArrayOfBias) {
    int i = -1;
    if (!isAllocationValid()) {
      Rectangle2D rectangle2D = paramShape.getBounds2D();
      setSize((float)rectangle2D.getWidth(), (float)rectangle2D.getHeight());
    } 
    Rectangle rectangle = getInsideAllocation(paramShape);
    View view = getViewAtPoint(Math.round(paramFloat1), Math.round(paramFloat2), rectangle);
    if (view != null) {
      i = view.viewToModel(paramFloat1, paramFloat2, rectangle, paramArrayOfBias);
      if (this.Zr.ZY() && view == getView(getViewCount() - 1) && i == ((Ze9f)getDocument()).Zz(view.getEndOffset()))
        i = this.Zr.Zd(); 
    } 
    return i;
  }
  
  public float Zp(Rectangle2D paramRectangle2D, int paramInt) throws BadLocationException {
    if (isAllocationValid()) {
      Rectangle2D rectangle2D = (Rectangle2D)modelToView(paramInt, paramRectangle2D, Position.Bias.Forward);
      try {
        if (rectangle2D != null) {
          if (this.Zr.ZY()) {
            int i = this.Zr.getLineOfOffset(paramInt);
            Zxam zxam = this.Zr.Zm();
            try {
              if (zxam.ZN(i))
                return -1.0F; 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
          } 
          return (float)rectangle2D.getY();
        } 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } 
    return -1.0F;
  }
  
  public void Zb(boolean paramBoolean) {
    int[] arrayOfInt = ZW();
    boolean bool = this.Zp;
    if (!paramBoolean && bool) {
      Container container = SwingUtilities.getAncestorOfClass(Zvol.class, this.Zr);
      if (container != null && this.Zr.getDocument().getLength() > 0) {
        container.doLayout();
        ((Zvol)container).getViewport().doLayout();
      } 
      this.Zp = paramBoolean;
      ZY();
      if (arrayOfInt == null) {
        this.Zp = paramBoolean;
        return;
      } 
      return;
    } 
    this.Zp = paramBoolean;
  }
  
  float Zi(Ze7g paramZe7g, Zzkh paramZzkh) {
    int[] arrayOfInt = ZW();
    int i = getWidth();
    if (i == 0 || !this.Zr.Zb())
      return 0.0F; 
    float f = this.Zr.getLineWrap() ? Zs5o.ZI('\n', paramZzkh).Zq() : 0.0F;
    for (Zska zska : paramZe7g) {
      boolean bool = (!zska.Zj() || (this.Zr.ZE() && zska.Zx('\t'))) ? true : false;
      if (bool) {
        float f1 = this.ZU.Zm();
        if (this.Zr.getLineWrap()) {
          float f2 = this.Zr.ZE() ? f : paramZzkh.Zm('m');
          int j = this.ZU.Zj(i - f2);
          int k = zska.ZV() % (j + 1);
          return k * f1;
        } 
        return zska.ZV() * f1;
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return 0.0F;
  }
  
  public static void ZU(int[] paramArrayOfint) {
    ZH = paramArrayOfint;
  }
  
  public static int[] ZW() {
    return ZH;
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '(ÎHgRZ ¢¸K\òRçÔC´Òèfõ#\\bÐåTaG1cê¿y¦'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_2
    //   21: newarray int
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic ZU : ([I)V
    //   28: bipush #35
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 88
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: aload #5
    //   75: putstatic burp/Zgpw.a : [Ljava/lang/String;
    //   78: iconst_2
    //   79: anewarray java/lang/String
    //   82: putstatic burp/Zgpw.b : [Ljava/lang/String;
    //   85: goto -> 231
    //   88: dup_x2
    //   89: pop
    //   90: invokevirtual toCharArray : ()[C
    //   93: dup_x1
    //   94: arraylength
    //   95: dup_x2
    //   96: pop
    //   97: iconst_0
    //   98: istore #6
    //   100: dup2_x1
    //   101: pop2
    //   102: dup_x2
    //   103: iconst_1
    //   104: if_icmpgt -> 204
    //   107: dup2
    //   108: swap
    //   109: iload #6
    //   111: dup2_x1
    //   112: caload
    //   113: swap
    //   114: iload #6
    //   116: bipush #7
    //   118: irem
    //   119: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #26
    //   158: goto -> 188
    //   161: bipush #23
    //   163: goto -> 188
    //   166: bipush #87
    //   168: goto -> 188
    //   171: bipush #81
    //   173: goto -> 188
    //   176: bipush #84
    //   178: goto -> 188
    //   181: bipush #117
    //   183: goto -> 188
    //   186: bipush #90
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 111
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 107
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 45
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6D3F) & 0xFFFF;
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
      byte b1 = 59;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgpw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */