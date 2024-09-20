package burp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.SwingUtilities;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.NavigationFilter;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zz_j extends DefaultCaret {
  private static Action ZZ;
  
  private static Action ZO;
  
  private transient MouseEvent ZX = null;
  
  private final transient Segment ZF = new Segment();
  
  private Zs1s ZD;
  
  private final Zz6a Zw;
  
  private boolean ZE = true;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zz_j() {
    Zi(Zs1s.THICK_VERTICAL_LINE_STYLE);
    this.Zw = new Zz6a();
  }
  
  private void Zt(MouseEvent paramMouseEvent) {
    int i = Zz85.Zm();
    try {
      if ((paramMouseEvent.getModifiers() & 0x1) != 0)
        try {
          if (getDot() != -1) {
            try {
              moveCaret(paramMouseEvent);
              if (i != 0) {
                positionCaret(paramMouseEvent);
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
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    positionCaret(paramMouseEvent);
  }
  
  private void Zo(boolean paramBoolean) {
    int i = Zz85.Zm();
    Zmgw zmgw = Zf();
    try {
      if (zmgw != null) {
        try {
          if (zmgw.isEnabled()) {
            try {
              if (zmgw.isRequestFocusEnabled()) {
                try {
                  if (paramBoolean) {
                    try {
                      zmgw.requestFocusInWindow();
                      if (i != 0) {
                        zmgw.requestFocus();
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
      } else {
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zmgw.requestFocus();
  }
  
  protected synchronized void damage(Rectangle paramRectangle) {
    Zq(paramRectangle);
  }
  
  private void Zq(Rectangle2D paramRectangle2D) {
    if (paramRectangle2D != null) {
      Rectangle2D rectangle2D = ZS(paramRectangle2D);
      this.x = (int)Math.floor(rectangle2D.getX());
      this.y = (int)Math.floor(rectangle2D.getY());
      this.width = (int)Math.ceil(rectangle2D.getWidth());
      this.height = (int)Math.ceil(rectangle2D.getHeight());
      repaint();
    } 
  }
  
  public void deinstall(JTextComponent paramJTextComponent) {
    try {
      if (!(paramJTextComponent instanceof Zmgw))
        throw new IllegalArgumentException(a(18682, 23032)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    super.deinstall(paramJTextComponent);
    paramJTextComponent.setNavigationFilter((NavigationFilter)null);
  }
  
  protected Zmgw Zf() {
    return (Zmgw)getComponent();
  }
  
  protected Highlighter.HighlightPainter getSelectionPainter() {
    return this.Zw;
  }
  
  public void install(JTextComponent paramJTextComponent) {
    try {
      if (!(paramJTextComponent instanceof Zmgw))
        throw new IllegalArgumentException(a(18683, 23383)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    super.install(paramJTextComponent);
    paramJTextComponent.setNavigationFilter(new Zetu(this));
  }
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual isConsumed : ()Z
    //   8: ifne -> 366
    //   11: aload_0
    //   12: invokevirtual Zf : ()Lburp/Zmgw;
    //   15: astore_3
    //   16: aload_1
    //   17: invokevirtual getClickCount : ()I
    //   20: istore #4
    //   22: aload_1
    //   23: invokestatic isLeftMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   26: ifeq -> 198
    //   29: iload #4
    //   31: iconst_2
    //   32: if_icmple -> 366
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: iload #4
    //   44: iconst_2
    //   45: irem
    //   46: istore #4
    //   48: iload #4
    //   50: lookupswitch default -> 194, 0 -> 76, 1 -> 97
    //   76: aload_0
    //   77: aload_1
    //   78: invokevirtual Zs : (Ljava/awt/event/MouseEvent;)V
    //   81: aload_0
    //   82: aconst_null
    //   83: putfield ZX : Ljava/awt/event/MouseEvent;
    //   86: iload_2
    //   87: ifeq -> 194
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: aconst_null
    //   98: astore #5
    //   100: aload_3
    //   101: invokevirtual getActionMap : ()Ljavax/swing/ActionMap;
    //   104: astore #6
    //   106: aload #6
    //   108: ifnull -> 127
    //   111: aload #6
    //   113: sipush #18681
    //   116: sipush #23097
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual get : (Ljava/lang/Object;)Ljavax/swing/Action;
    //   125: astore #5
    //   127: aload #5
    //   129: ifnonnull -> 167
    //   132: getstatic burp/Zz_j.ZO : Ljavax/swing/Action;
    //   135: ifnonnull -> 162
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: new burp/Zzjl
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: putstatic burp/Zz_j.ZO : Ljavax/swing/Action;
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: getstatic burp/Zz_j.ZO : Ljavax/swing/Action;
    //   165: astore #5
    //   167: aload #5
    //   169: new java/awt/event/ActionEvent
    //   172: dup
    //   173: aload_3
    //   174: sipush #1001
    //   177: aconst_null
    //   178: aload_1
    //   179: invokevirtual getWhen : ()J
    //   182: aload_1
    //   183: invokevirtual getModifiers : ()I
    //   186: invokespecial <init> : (Ljava/lang/Object;ILjava/lang/String;JI)V
    //   189: invokeinterface actionPerformed : (Ljava/awt/event/ActionEvent;)V
    //   194: iload_2
    //   195: ifeq -> 366
    //   198: aload_1
    //   199: invokestatic isMiddleMouseButton : (Ljava/awt/event/MouseEvent;)Z
    //   202: ifeq -> 366
    //   205: goto -> 212
    //   208: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   211: athrow
    //   212: iload #4
    //   214: iconst_1
    //   215: if_icmpne -> 366
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload_3
    //   226: invokevirtual isEditable : ()Z
    //   229: ifeq -> 366
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: aload_3
    //   240: invokevirtual isEnabled : ()Z
    //   243: ifeq -> 366
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: aload_1
    //   254: invokevirtual getSource : ()Ljava/lang/Object;
    //   257: checkcast javax/swing/text/JTextComponent
    //   260: astore #5
    //   262: aload #5
    //   264: ifnull -> 366
    //   267: aload #5
    //   269: invokevirtual getToolkit : ()Ljava/awt/Toolkit;
    //   272: astore #6
    //   274: aload #6
    //   276: invokevirtual getSystemSelection : ()Ljava/awt/datatransfer/Clipboard;
    //   279: astore #7
    //   281: aload #7
    //   283: ifnull -> 342
    //   286: aload_0
    //   287: aload_1
    //   288: invokevirtual Zt : (Ljava/awt/event/MouseEvent;)V
    //   291: aload #5
    //   293: invokevirtual getTransferHandler : ()Ljavax/swing/TransferHandler;
    //   296: astore #8
    //   298: aload #8
    //   300: ifnull -> 333
    //   303: aload #7
    //   305: aconst_null
    //   306: invokevirtual getContents : (Ljava/lang/Object;)Ljava/awt/datatransfer/Transferable;
    //   309: astore #9
    //   311: aload #9
    //   313: ifnull -> 333
    //   316: aload #8
    //   318: aload #5
    //   320: aload #9
    //   322: invokevirtual importData : (Ljavax/swing/JComponent;Ljava/awt/datatransfer/Transferable;)Z
    //   325: pop
    //   326: goto -> 333
    //   329: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   332: athrow
    //   333: aload_0
    //   334: iconst_1
    //   335: invokevirtual Zo : (Z)V
    //   338: iload_2
    //   339: ifeq -> 353
    //   342: aload_3
    //   343: invokevirtual paste : ()V
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: goto -> 366
    //   356: astore #6
    //   358: aload #6
    //   360: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   363: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   366: return
    // Exception table:
    //   from	to	target	type
    //   22	35	38	java/awt/HeadlessException
    //   48	90	93	java/awt/HeadlessException
    //   127	138	141	java/awt/HeadlessException
    //   132	155	158	java/awt/HeadlessException
    //   194	205	208	java/awt/HeadlessException
    //   198	218	221	java/awt/HeadlessException
    //   212	232	235	java/awt/HeadlessException
    //   225	246	249	java/awt/HeadlessException
    //   267	353	356	java/awt/HeadlessException
    //   311	326	329	java/awt/HeadlessException
    //   333	346	349	java/awt/HeadlessException
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    try {
      super.mousePressed(paramMouseEvent);
      if (!paramMouseEvent.isConsumed() && SwingUtilities.isRightMouseButton(paramMouseEvent)) {
        JTextComponent jTextComponent = getComponent();
        try {
          if (jTextComponent != null)
            try {
              if (jTextComponent.isEnabled())
                try {
                  if (jTextComponent.isRequestFocusEnabled())
                    jTextComponent.requestFocusInWindow(); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void paint(Graphics paramGraphics) {
    int i = Zz85.Zm();
    if (isVisible())
      try {
        Color color;
        double d5;
        Graphics2D graphics2D = (Graphics2D)paramGraphics;
        Zmgw zmgw = Zf();
        graphics2D.setColor(zmgw.getCaretColor());
        TextUI textUI = zmgw.getUI();
        Rectangle2D rectangle2D = textUI.modelToView2D(zmgw, getDot(), getDotBias());
        rectangle2D = ZS(rectangle2D);
        try {
          if (this.width > 0)
            try {
              if (this.height > 0 && !contains(rectangle2D.getX(), rectangle2D.getY(), rectangle2D.getWidth(), rectangle2D.getHeight())) {
                Rectangle rectangle = graphics2D.getClipBounds();
                try {
                  if (rectangle != null)
                    try {
                      if (!rectangle.contains(this))
                        repaint(); 
                    } catch (BadLocationException badLocationException) {
                      throw a(null);
                    }  
                } catch (BadLocationException badLocationException) {
                  throw a(null);
                } 
                Zq(rectangle2D);
              } 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            }  
        } catch (BadLocationException badLocationException) {
          throw a(null);
        } 
        double d1 = rectangle2D.getX();
        double d2 = rectangle2D.getY();
        double d3 = rectangle2D.getWidth();
        double d4 = rectangle2D.getHeight();
        switch (Zshm.Zq[this.ZD.ordinal()]) {
          case 1:
            color = zmgw.getBackground();
            if (color == null)
              color = Color.white; 
            try {
              graphics2D.setXORMode(color);
              graphics2D.fill(new Rectangle2D.Double(d1, d2, d3, d4));
              if (i != 0);
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
            return;
          case 2:
            graphics2D.draw(new Rectangle2D.Double(d1, d2, d3 - 1.0D, d4));
            if (i != 0);
            return;
          case 3:
            color = zmgw.getBackground();
            if (color == null)
              color = Color.white; 
            graphics2D.setXORMode(color);
            d5 = d2 + d4;
            try {
              graphics2D.draw(new Line2D.Double(d1, d5, d1 + d3 - 1.0D, d5));
              if (i != 0);
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
            return;
          default:
            try {
              graphics2D.draw(new Line2D.Double(d1, d2, d1, d2 + d4));
              if (i != 0)
                break; 
            } catch (BadLocationException badLocationException) {
              throw a(null);
            } 
            return;
          case 5:
            break;
        } 
        graphics2D.fill(new Rectangle2D.Double(d1, d2, 2.0D, d4));
      } catch (BadLocationException badLocationException) {
        Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      }  
  }
  
  private void Zs(MouseEvent paramMouseEvent) {
    try {
      if (this.ZX != null)
        try {
          if (this.ZX.getX() == paramMouseEvent.getX())
            try {
              if (this.ZX.getY() == paramMouseEvent.getY())
                return; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Action action = null;
    Zmgw zmgw = Zf();
    ActionMap actionMap = zmgw.getActionMap();
    if (actionMap != null)
      action = actionMap.get(a(18680, 18728)); 
    try {
      if (action == null) {
        try {
          if (ZZ == null)
            ZZ = new Zzjj(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        action = ZZ;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    action.actionPerformed(new ActionEvent(zmgw, 1001, null, paramMouseEvent.getWhen(), paramMouseEvent.getModifiers()));
    this.ZX = paramMouseEvent;
  }
  
  public void setSelectionVisible(boolean paramBoolean) {
    super.setSelectionVisible(true);
  }
  
  public void Zi(Zs1s paramZs1s) {
    if (paramZs1s == null)
      paramZs1s = Zs1s.THICK_VERTICAL_LINE_STYLE; 
    try {
      if (paramZs1s != this.ZD) {
        this.ZD = paramZs1s;
        repaint();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZN(boolean paramBoolean) {
    this.ZE = paramBoolean;
  }
  
  private Rectangle2D ZS(Rectangle2D paramRectangle2D) {
    try {
      if (paramRectangle2D != null)
        try {
          if (paramRectangle2D.getWidth() <= 1.0D) {
            float f;
            try {
              Zmgw zmgw = Zf();
              zmgw.getDocument().getText(getDot(), 1, this.ZF);
              Font font = zmgw.getFont();
              Zzkh zzkh = zmgw.Zl(font);
              char c = this.ZF.array[this.ZF.offset];
              try {
              
              } catch (BadLocationException badLocationException) {
                throw a(null);
              } 
              f = Zs5o.Zc(c) ? zzkh.Zm('?') : zzkh.Zm(c);
              if (Zkqb.Zq(f, 0.0F))
                f = zzkh.Zm(' '); 
            } catch (BadLocationException badLocationException) {
              Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
              f = 8.0F;
            } 
            return new Rectangle2D.Double(paramRectangle2D.getX(), paramRectangle2D.getY(), f, paramRectangle2D.getHeight());
          } 
          return paramRectangle2D;
        } catch (BadLocationException badLocationException) {
          throw a(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return paramRectangle2D;
  }
  
  protected void adjustVisibility(Rectangle paramRectangle) {
    try {
      if (this.ZE)
        super.adjustVisibility(paramRectangle); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '½d ±`U­·#s+i6NAëEØ¯o8'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #17
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #83
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
    //   67: ldc 'ÃÀF¡u&ç·¤Ðù¹¨g>ÍÜÒ*vÐf þwÓÐÃ§j½>ÕòöÔ}\\rÓ-[¾]pÿWs¨\\r: '
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #31
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #116
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
    //   128: putstatic burp/Zz_j.a : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zz_j.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 258
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #29
    //   214: goto -> 242
    //   217: bipush #89
    //   219: goto -> 242
    //   222: iconst_5
    //   223: goto -> 242
    //   226: bipush #57
    //   228: goto -> 242
    //   231: bipush #84
    //   233: goto -> 242
    //   236: bipush #96
    //   238: goto -> 242
    //   241: iconst_4
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 164
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 160
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 98
    //   300: aconst_null
    //   301: putstatic burp/Zz_j.ZZ : Ljavax/swing/Action;
    //   304: aconst_null
    //   305: putstatic burp/Zz_j.ZO : Ljavax/swing/Action;
    //   308: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x48F9) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz_j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */