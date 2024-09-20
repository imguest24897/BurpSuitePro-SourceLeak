package burp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.Position;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvh;

public class Zmgn extends Zmgw implements Zg7l {
  private static final Color ZH;
  
  private final Zg4o Zg;
  
  private Zxam Zr;
  
  private Zzcn ZW;
  
  private boolean Zy;
  
  private String Zl;
  
  private Point Zz;
  
  private Zsy1 Zs;
  
  private Zep3 ZU;
  
  private Zmsq ZJ = Zmsq.LF;
  
  private float ZM;
  
  private float ZQ;
  
  private JViewport Zi;
  
  private static Zbqc[] ZO;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zmgn(Ze9f paramZe9f, Zg4o paramZg4o) {
    this(paramZe9f, paramZg4o, Zkjk.Zf, Zrf.ZL);
  }
  
  public Zmgn(Ze9f paramZe9f, Zg4o paramZg4o, Zkjk paramZkjk, Zrf paramZrf) {
    super(paramZe9f, paramZkjk, paramZrf);
    this.Zg = paramZg4o;
    Zw(paramZe9f.ZK());
  }
  
  public void addNotify() {
    try {
      super.addNotify();
      if (getCaretPosition() != 0)
        SwingUtilities.invokeLater(this::lambda$addNotify$0); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ToolTipManager.sharedInstance().registerComponent(this);
  }
  
  public void removeNotify() {
    super.removeNotify();
    ToolTipManager.sharedInstance().unregisterComponent(this);
  }
  
  public void ZQ() {
    try {
      if (isEditable()) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        this.Zy = !this.Zy;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zy)
        Zm2.ZC(Zrrh.SUITE_MESSAGE_EDITOR_URL_ENCODE_AS_YOU_TYPE); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public boolean Zc() {
    return this.Zy;
  }
  
  private void ZG() {
    this.ZM = this.ZQ = 0.0F;
    Zzkh zzkh = Zi();
    float f1 = zzkh.Zh();
    try {
      if (f1 > this.ZM)
        this.ZM = f1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    float f2 = zzkh.ZV();
    try {
      if (f2 > this.ZQ)
        this.ZQ = f2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  protected Document createDefaultModel() {
    return new Ze9f(b(-7399, -8841));
  }
  
  protected Ztf6 Zh() {
    return new Ztfz(this, this.Zi, this.Zx);
  }
  
  public void ZK() {
    // Byte code:
    //   0: invokestatic ZR : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: invokevirtual getLineWrap : ()Z
    //   8: ifeq -> 31
    //   11: aload_0
    //   12: <illegal opcode> run : (Lburp/Zmgn;)Ljava/lang/Runnable;
    //   17: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   20: aload_1
    //   21: ifnull -> 42
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_0
    //   32: invokevirtual ZW : ()V
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: invokevirtual revalidate : ()V
    //   46: return
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/IllegalArgumentException
    //   11	35	38	java/lang/IllegalArgumentException
  }
  
  public Zzkh Zi() {
    return Zgmc.ZZ(this);
  }
  
  public Zxam Zm() {
    return this.Zr;
  }
  
  public void Zs() {
    try {
      if (this.Zr != null)
        this.Zr.ZN(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public Color ZT(Zska paramZska) {
    return ZF(paramZska.ZX());
  }
  
  public Color ZF(int paramInt) {
    Color color = this.ZW.ZO(paramInt);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (color != null) ? color : getForeground();
  }
  
  public int Zd() {
    if (ZY()) {
      int i = this.Zr.Zh();
      try {
        if (i < getLineCount() - 1)
          try {
            return ((Ze9f)getDocument()).Zz(getLineEndOffset(i));
          } catch (BadLocationException badLocationException) {
            Zah.Zl(badLocationException, Zk_.UNEXPECTED);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return getDocument().getLength();
  }
  
  public String Zq() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.Zy ? this.ZJ.encodedText : this.ZJ.text;
  }
  
  public float ZS() {
    return this.ZM;
  }
  
  public float Zg() {
    return this.ZQ;
  }
  
  public String ZV() {
    try {
      if (getDocument() == null)
        return b(-7394, -2085); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ((Ze9f)getDocument()).ZK();
  }
  
  public Ze7g ZL(int paramInt) {
    return ((Ze9f)getDocument()).Zw(paramInt);
  }
  
  public Zep3 Zu() {
    return this.ZU;
  }
  
  public String getToolTipText(MouseEvent paramMouseEvent) {
    if (Zvh.ZU.ZG()) {
      Point point = paramMouseEvent.getPoint();
      try {
        if (point.equals(this.Zz))
          return this.Zl; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      this.Zz = point;
    } 
    return this.Zl = ZB(paramMouseEvent);
  }
  
  protected String ZB(MouseEvent paramMouseEvent) {
    String str = super.getToolTipText(paramMouseEvent);
    try {
      if (str != null)
        return this.Zs.ZT(paramMouseEvent, str); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.Zs != null)
        this.Zs.ZX(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  protected void Zw() {
    super.Zw();
    this.ZU = new Zrty(this, new Zmo8(this));
    setSelectionColor(ZH);
    this.Zr = Zx();
    Zs(new Zxj(this));
    this.ZW = new Zzcn();
  }
  
  protected Zxam Zx() {
    return new Zgbb(this);
  }
  
  public boolean ZY() {
    return this.Zr.ZZ();
  }
  
  public Zska Z_(int paramInt) {
    if (paramInt >= 0)
      try {
        int i = getLineOfOffset(paramInt);
        Ze7g ze7g = ZL(i);
        return Zk80.ZU(ze7g, paramInt);
      } catch (BadLocationException badLocationException) {
        Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
      }  
    return null;
  }
  
  public void ZG(boolean paramBoolean) {
    try {
      if (paramBoolean != this.Zr.ZZ()) {
        try {
          this.Zr.Zd(paramBoolean);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        firePropertyChange(b(-7397, 8604), !paramBoolean, paramBoolean);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zg(Zzio paramZzio) {
    this.Zr.ZO(paramZzio);
  }
  
  public void setDocument(Document paramDocument) {
    try {
      if (!(paramDocument instanceof Ze9f))
        throw new IllegalArgumentException(b(-7398, -6184)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    super.setDocument(paramDocument);
    Zw(((Ze9f)paramDocument).ZK());
  }
  
  public void setFont(Font paramFont) {
    Font font = getFont();
    try {
      super.setFont(paramFont);
      if (font != null)
        ZG(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (isDisplayable()) {
        ZF();
        firePropertyChange(b(-7393, -6108), font, paramFont);
        revalidate();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void setLineWrap(boolean paramBoolean) {
    try {
      super.setLineWrap(paramBoolean);
      if (ZX())
        ZN(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ZF();
  }
  
  public void Zs(boolean paramBoolean) {
    try {
      super.Zs(paramBoolean);
      if (ZX())
        ZN(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ZF();
  }
  
  private boolean ZX() {
    return ((DefaultCaret)getCaret()).isActive();
  }
  
  private void ZN() {
    Zbsv.Zb(this::lambda$ensureCaretIsVisible$2);
  }
  
  public void setHighlighter(Highlighter paramHighlighter) {
    if (paramHighlighter == null)
      paramHighlighter = new Zxrf(); 
    try {
      if (!(paramHighlighter instanceof Zxrf))
        throw new IllegalArgumentException(b(-7400, -4471)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    super.setHighlighter(paramHighlighter);
  }
  
  public void Zq(Zmsq paramZmsq) {
    this.ZJ = paramZmsq;
  }
  
  public void Zw(String paramString) {
    if (paramString == null)
      paramString = b(-7394, -2085); 
    Ze9f ze9f = (Ze9f)getDocument();
    String str = ze9f.ZK();
    try {
      if (!paramString.equals(str)) {
        ze9f.ZI(paramString);
        firePropertyChange(b(-7395, 22871), str, paramString);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zs(Zsy1 paramZsy1) {
    this.Zs = paramZsy1;
  }
  
  public int Zd(Point2D paramPoint2D, Position.Bias[] paramArrayOfBias) {
    return getUI().viewToModel2D(this, paramPoint2D, paramArrayOfBias);
  }
  
  public boolean Zo() {
    try {
      if (this.Zg != null)
        try {
          if (this.Zg.Zs());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zg4o ZC() {
    return this.Zg;
  }
  
  public void Zx(JViewport paramJViewport) {
    this.Zi = paramJViewport;
  }
  
  public void Zc(int paramInt, Position.Bias paramBias) {
    Zbqc[] arrayOfZbqc = ZR();
    Caret caret = getCaret();
    if (caret instanceof DefaultCaret) {
      DefaultCaret defaultCaret = (DefaultCaret)caret;
      try {
        defaultCaret.setDot(paramInt, paramBias);
        if (arrayOfZbqc != null) {
          Zuh.ZT(false, Zqf.Zr, getCaret().getClass().getName());
          return;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return;
    } 
    Zuh.ZT(false, Zqf.Zr, getCaret().getClass().getName());
  }
  
  public void updateUI() {
    try {
      super.updateUI();
      if (this.Zg != null)
        Zf(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void Zf() {
    Font font = this.Zg.ZM();
    setFont(font);
    setBackground(this.ZD.ZS());
    setCaretColor(Zlkk.BURP_TITLE.ZS());
    setSelectedTextColor(Zlkk.TEXT_EDITOR_SELECTION_FOREGROUND.ZS());
    setSelectionColor(Zlkk.TEXT_EDITOR_SELECTION_BACKGROUND.ZS());
    ZY(Zlkk.TEXT_EDITOR_CURRENT_LINE_BACKGROUND.ZS());
    this.ZW = new Zzcn();
    Zsqn zsqn = Zk80.Zh(this);
    try {
      if (zsqn != null) {
        zsqn.setBackground(this.ZD.ZS());
        zsqn.Zh(Zlkk.TEXT_EDITOR_GUTTER_BORDER.ZS());
        zsqn.Zq(Zlkk.TEXT_EDITOR_LINE_NUMBERS.ZS());
        zsqn.ZU(font);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private void lambda$ensureCaretIsVisible$2() {
    try {
      Rectangle rectangle = Zy();
      try {
        if (rectangle != null) {
          scrollRectToVisible(rectangle);
          getCaret().setVisible(true);
        } 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private static void lambda$addNotify$0(Zmgn paramZmgn) {
    paramZmgn.ZW();
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'Úua?;|/\\råyó*\\tNäC:ÝÂ:Æpt"Ú*ÜÕTÓÄmùá&üpX_oåëõÐSEÊÐç±¹¸©óÜUþÕ.ò£ð#W¯\\nÕ[N?vü¤iûxJöiÉü!ÑÔÏJ­¬Ó!tm&é}°IÍ¡#¡z ºÄIyé[!¤ïâ=3lïdôÄ<§SHÝ¯­Iy&/Y¯îí«ÜÿMí'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #16
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zp : ([Lburp/Zbqc;)V
    //   27: bipush #28
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
    //   72: ldc '\L.Ý-" Ø²³{úÜ6­-:Ä8 '
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #10
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #96
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
    //   133: putstatic burp/Zmgn.c : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zmgn.d : [Ljava/lang/String;
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
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: bipush #87
    //   218: goto -> 247
    //   221: bipush #114
    //   223: goto -> 247
    //   226: iconst_3
    //   227: goto -> 247
    //   230: bipush #56
    //   232: goto -> 247
    //   235: bipush #24
    //   237: goto -> 247
    //   240: bipush #9
    //   242: goto -> 247
    //   245: bipush #80
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: new java/awt/Color
    //   307: dup
    //   308: sipush #200
    //   311: sipush #200
    //   314: sipush #255
    //   317: invokespecial <init> : (III)V
    //   320: putstatic burp/Zmgn.ZH : Ljava/awt/Color;
    //   323: return
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    ZO = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZR() {
    return ZO;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE31B) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmgn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */