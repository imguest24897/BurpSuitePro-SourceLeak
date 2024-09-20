package burp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Window;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zl8k extends JDialog implements HyperlinkListener, Zsdg {
  private final Zljk Zd;
  
  private final JEditorPane Zz;
  
  private final JScrollPane ZW;
  
  private final List<Ztan> Zc;
  
  private int Zf;
  
  private final Timer ZF;
  
  private final Zg95 Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zl8k(Window paramWindow, Zljk paramZljk) {
    super(paramWindow);
    setUndecorated(true);
    setType(Window.Type.POPUP);
    this.Zd = paramZljk;
    ComponentOrientation componentOrientation = paramZljk.Zq();
    JPanel jPanel1 = new JPanel(new BorderLayout());
    jPanel1.setBorder(Zm());
    this.Zz = new JEditorPane(a(22211, 9514), null);
    Zgyz.Zg(this.Zz);
    this.Zz.addHyperlinkListener(this);
    this.ZW = new JScrollPane(this.Zz);
    Border border = BorderFactory.createEmptyBorder();
    this.Zz.setBackground(paramZljk.ZC());
    this.ZW.setBorder(border);
    this.ZW.setViewportBorder(border);
    this.ZW.setBackground(this.Zz.getBackground());
    this.ZW.getViewport().setBackground(this.Zz.getBackground());
    jPanel1.add(this.ZW);
    JPanel jPanel2 = new JPanel(new BorderLayout());
    jPanel2.setBackground(paramZljk.ZC());
    Zehv zehv = new Zehv();
    jPanel2.add(zehv, a(22208, 13756));
    zehv.setBackground(paramZljk.ZC());
    int[] arrayOfInt = Zghd.ZM();
    jPanel1.add(jPanel2, a(22215, 8891));
    setContentPane(jPanel1);
    applyComponentOrientation(componentOrientation);
    setFocusableWindowState(false);
    if (Zly8.ZW()) {
      Zsqd zsqd = Zsqd.Zo();
      if (zsqd != null)
        zsqd.Zh(this); 
    } 
    this.Zc = new ArrayList<>(1);
    this.Zf = -1;
    this.Zk = new Zg95(this);
    this.ZF = new Timer(120, this.Zk);
    this.ZF.setRepeats(false);
    if (Zbqc.Zwu() == null)
      Zghd.ZD(new int[1]); 
  }
  
  private void Zb(Ztan paramZtan) {
    this.Zc.add(++this.Zf, paramZtan);
    Zn();
  }
  
  private void Zd() {
    this.Zc.clear();
    this.Zf = -1;
  }
  
  private void Zn() {
    if (this.Zc.size() > this.Zf + 1)
      this.Zc.subList(this.Zf + 1, this.Zc.size()).clear(); 
  }
  
  public boolean Zg() {
    if (isVisible() && this.Zz.getSelectionStart() != this.Zz.getSelectionEnd()) {
      this.Zz.copy();
      return true;
    } 
    return false;
  }
  
  private static Border ZB(Border paramBorder) {
    Class<?> clazz = paramBorder.getClass();
    Color color = null;
    Method[] arrayOfMethod1 = clazz.getDeclaredMethods();
    Method[] arrayOfMethod2 = arrayOfMethod1;
    int i = arrayOfMethod2.length;
    int[] arrayOfInt = Zghd.ZM();
    byte b = 0;
    while (b < i) {
      Method method = arrayOfMethod2[b];
      if (a(22210, -16230).equals(method.getName()))
        try {
          color = (Color)method.invoke(paramBorder, new Object[0]);
        } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {
          Zah.Zl(illegalAccessException, Zk_.UNEXPECTED);
        }  
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    try {
      if (color != null)
        return BorderFactory.createLineBorder(color); 
    } catch (IllegalAccessException illegalAccessException) {
      throw a(null);
    } 
    return BorderFactory.createEmptyBorder();
  }
  
  private static Border Zm() {
    Border border = Zt48.Zs();
    if (Zr(border))
      border = ZB(border); 
    return border;
  }
  
  public void hyperlinkUpdate(HyperlinkEvent paramHyperlinkEvent) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual getEventType : ()Ljavax/swing/event/HyperlinkEvent$EventType;
    //   8: astore_3
    //   9: aload_3
    //   10: getstatic javax/swing/event/HyperlinkEvent$EventType.ACTIVATED : Ljavax/swing/event/HyperlinkEvent$EventType;
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: ifne -> 24
    //   19: return
    //   20: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   23: athrow
    //   24: aload_1
    //   25: invokevirtual getURL : ()Ljava/net/URL;
    //   28: astore #4
    //   30: aload #4
    //   32: ifnull -> 105
    //   35: invokestatic Zx : ()Lburp/Ztry;
    //   38: astore #5
    //   40: aload #5
    //   42: ifnull -> 105
    //   45: aload #5
    //   47: aload #4
    //   49: invokeinterface ZW : (Ljava/net/URL;)Ljava/net/URL;
    //   54: astore #6
    //   56: aload #6
    //   58: ifnull -> 105
    //   61: aload #6
    //   63: aload #4
    //   65: if_acmpeq -> 105
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload #6
    //   77: astore #4
    //   79: new javax/swing/event/HyperlinkEvent
    //   82: dup
    //   83: aload_1
    //   84: invokevirtual getSource : ()Ljava/lang/Object;
    //   87: aload_1
    //   88: invokevirtual getEventType : ()Ljavax/swing/event/HyperlinkEvent$EventType;
    //   91: aload #6
    //   93: aload_1
    //   94: invokevirtual getDescription : ()Ljava/lang/String;
    //   97: aload_1
    //   98: invokevirtual getSourceElement : ()Ljavax/swing/text/Element;
    //   101: invokespecial <init> : (Ljava/lang/Object;Ljavax/swing/event/HyperlinkEvent$EventType;Ljava/net/URL;Ljava/lang/String;Ljavax/swing/text/Element;)V
    //   104: astore_1
    //   105: aload_0
    //   106: getfield Zd : Lburp/Zljk;
    //   109: invokevirtual Zu : ()Lburp/Zg7m;
    //   112: astore #5
    //   114: aload #5
    //   116: ifnull -> 152
    //   119: aload_0
    //   120: getfield Zc : Ljava/util/List;
    //   123: aload_0
    //   124: getfield Zf : I
    //   127: invokeinterface get : (I)Ljava/lang/Object;
    //   132: checkcast burp/Ztan
    //   135: astore #6
    //   137: aload #5
    //   139: aload_1
    //   140: aload #6
    //   142: getfield ZE : Lburp/Zmy1;
    //   145: aload_0
    //   146: invokeinterface Zh : (Ljavax/swing/event/HyperlinkEvent;Lburp/Zmy1;Lburp/Zsdg;)V
    //   151: return
    //   152: aload #4
    //   154: ifnull -> 199
    //   157: new java/net/URI
    //   160: dup
    //   161: aload #4
    //   163: invokevirtual toString : ()Ljava/lang/String;
    //   166: invokespecial <init> : (Ljava/lang/String;)V
    //   169: invokestatic Zr : (Ljava/net/URI;)V
    //   172: goto -> 309
    //   175: astore #6
    //   177: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   180: aload_0
    //   181: getfield Zz : Ljavax/swing/JEditorPane;
    //   184: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   187: aload #6
    //   189: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   192: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   195: aload_2
    //   196: ifnonnull -> 309
    //   199: aload_0
    //   200: invokevirtual getParent : ()Ljava/awt/Container;
    //   203: checkcast burp/Zkmv
    //   206: astore #6
    //   208: aload #6
    //   210: invokevirtual Ze : ()Lburp/Zmy1;
    //   213: invokeinterface ZT : ()Lburp/Zlqb;
    //   218: astore #7
    //   220: aload #7
    //   222: instanceof burp/Zts6
    //   225: ifeq -> 309
    //   228: aload_1
    //   229: invokevirtual getDescription : ()Ljava/lang/String;
    //   232: astore #8
    //   234: aload #7
    //   236: checkcast burp/Zts6
    //   239: aload #8
    //   241: invokevirtual ZN : (Ljava/lang/String;)Ljava/util/List;
    //   244: astore #9
    //   246: aload #9
    //   248: ifnull -> 292
    //   251: aload #9
    //   253: invokeinterface isEmpty : ()Z
    //   258: ifne -> 292
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   267: athrow
    //   268: aload #9
    //   270: iconst_0
    //   271: invokeinterface get : (I)Ljava/lang/Object;
    //   276: checkcast burp/Zmy1
    //   279: astore #10
    //   281: aload_0
    //   282: aload #10
    //   284: iconst_1
    //   285: invokevirtual ZI : (Lburp/Zmy1;Z)V
    //   288: aload_2
    //   289: ifnonnull -> 309
    //   292: invokestatic getLookAndFeel : ()Ljavax/swing/LookAndFeel;
    //   295: aload_0
    //   296: getfield Zz : Ljavax/swing/JEditorPane;
    //   299: invokevirtual provideErrorFeedback : (Ljava/awt/Component;)V
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   308: athrow
    //   309: return
    // Exception table:
    //   from	to	target	type
    //   9	20	20	java/net/URISyntaxException
    //   56	68	71	java/net/URISyntaxException
    //   157	172	175	java/net/URISyntaxException
    //   246	261	264	java/net/URISyntaxException
    //   281	302	305	java/net/URISyntaxException
  }
  
  private static boolean Zr(Border paramBorder) {
    return (paramBorder != null && paramBorder.getClass().getName().startsWith(a(22209, 16029)));
  }
  
  public void ZL(Zmy1 paramZmy1) {
    ZI(paramZmy1, false);
  }
  
  protected void ZI(Zmy1 paramZmy1, boolean paramBoolean) {
    ZT(paramZmy1, (String)null, paramBoolean);
  }
  
  protected void ZT(Zmy1 paramZmy1, String paramString, boolean paramBoolean) {
    this.ZF.stop();
    this.Zk.ZD(paramZmy1, paramString, paramBoolean);
    this.ZF.start();
  }
  
  private void Zp(Zmy1 paramZmy1, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 13
    //   9: aconst_null
    //   10: goto -> 19
    //   13: aload_1
    //   14: invokeinterface ZH : ()Ljava/lang/String;
    //   19: astore #5
    //   21: aload_0
    //   22: getfield Zd : Lburp/Zljk;
    //   25: invokevirtual Z_ : ()Z
    //   28: ifeq -> 48
    //   31: aload #5
    //   33: ifnull -> 48
    //   36: aload #5
    //   38: invokevirtual isBlank : ()Z
    //   41: ifne -> 48
    //   44: iconst_1
    //   45: goto -> 49
    //   48: iconst_0
    //   49: istore #6
    //   51: aload_0
    //   52: invokevirtual isVisible : ()Z
    //   55: iload #6
    //   57: if_icmpeq -> 66
    //   60: aload_0
    //   61: iload #6
    //   63: invokevirtual setVisible : (Z)V
    //   66: aload #5
    //   68: ifnonnull -> 75
    //   71: ldc ''
    //   73: astore #5
    //   75: aload_0
    //   76: getfield Zz : Ljavax/swing/JEditorPane;
    //   79: aload #5
    //   81: invokevirtual setText : (Ljava/lang/String;)V
    //   84: aload_2
    //   85: ifnull -> 103
    //   88: aload_0
    //   89: aload_2
    //   90: <illegal opcode> run : (Lburp/Zl8k;Ljava/lang/String;)Ljava/lang/Runnable;
    //   95: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   98: aload #4
    //   100: ifnonnull -> 111
    //   103: aload_0
    //   104: getfield Zz : Ljavax/swing/JEditorPane;
    //   107: iconst_0
    //   108: invokevirtual setCaretPosition : (I)V
    //   111: iload_3
    //   112: ifne -> 119
    //   115: aload_0
    //   116: invokevirtual Zd : ()V
    //   119: aload_0
    //   120: new burp/Ztan
    //   123: dup
    //   124: aload_1
    //   125: aload #5
    //   127: aconst_null
    //   128: invokespecial <init> : (Lburp/Zmy1;Ljava/lang/String;Ljava/lang/String;)V
    //   131: invokevirtual Zb : (Lburp/Ztan;)V
    //   134: return
  }
  
  public void setVisible(boolean paramBoolean) {
    if (!paramBoolean) {
      this.ZF.stop();
      Zd();
    } 
    super.setVisible(paramBoolean);
  }
  
  public void Zp() {
    SwingUtilities.updateComponentTreeUI(this);
    Zgyz.Zg(this.Zz);
    this.ZW.setBackground(this.Zz.getBackground());
    this.ZW.getViewport().setBackground(this.Zz.getBackground());
    ((JPanel)getContentPane()).setBorder(Zgyz.Zt());
  }
  
  private void lambda$setDisplayedDesc$0(String paramString) {
    this.Zz.scrollToReference(paramString);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ý»ÝÆV\ä\\f\^TY$?¬WoDúZ8pïgi*÷$IÉ8\\f½]X¯F×X(!'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #9
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #16
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   67: ldc 'Ò0gÞYW^*^'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #16
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   127: putstatic burp/Zl8k.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zl8k.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #16
    //   210: goto -> 240
    //   213: bipush #74
    //   215: goto -> 240
    //   218: bipush #48
    //   220: goto -> 240
    //   223: bipush #76
    //   225: goto -> 240
    //   228: bipush #41
    //   230: goto -> 240
    //   233: bipush #36
    //   235: goto -> 240
    //   238: bipush #7
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 39, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x56C3) & 0xFFFF;
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
      byte b1 = 113;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl8k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */