package burp;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;
import javax.swing.ActionMap;
import javax.swing.DefaultListModel;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgff extends Zg85 implements DocumentListener, ListSelectionListener, AWTEventListener, FocusListener, KeyListener {
  private static final Map<Zlw9, TreeSet<Zzyf>> ZK;
  
  private final Zrpl Zk;
  
  private final DefaultListModel<String> ZB;
  
  private final Zbup ZM;
  
  private Zlw9 ZE;
  
  private boolean ZY;
  
  private int Zm;
  
  private Zgjb Ze;
  
  private TreeSet<Zzyf> Zv;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zgff() {
    ZH((Zlw9)null);
    Zt(Zt00.ITALIC_FONT);
    this.ZB = new DefaultListModel<>();
    this.Zk = new Zrpl();
    this.Zk.setModel(this.ZB);
    this.Zk.setSelectionMode(0);
    this.Zk.setVisibleRowCount(6);
    this.Zk.addListSelectionListener(this);
    this.ZM = new Zbup();
    this.ZM.setViewportView(this.Zk);
    this.ZM.setHorizontalScrollBarPolicy(31);
    this.ZM.setVerticalScrollBarPolicy(20);
    getDocument().addDocumentListener(this);
    addKeyListener(this);
    addFocusListener(this);
    Zt();
  }
  
  public void ZH(Zlw9 paramZlw9) {
    this.ZE = paramZlw9;
    synchronized (ZK) {
      this.Zv = ZK.computeIfAbsent(paramZlw9, Zgff::lambda$setCompletionType$0);
    } 
  }
  
  public void setText(String paramString) {
    this.ZY = true;
    if (paramString == null)
      paramString = ""; 
    super.setText(paramString);
    this.ZY = false;
  }
  
  private void Zu() {
    this.Zm = -1;
    String str = getText();
    this.ZB.clear();
    boolean bool = Zm99.ZQ();
    for (Zzyf zzyf : this.Zv) {
      try {
        if (!zzyf.ZV.startsWith(str))
          continue; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      this.ZB.addElement(zzyf.ZV);
      if (bool)
        break; 
    } 
    try {
      if (this.ZB.getSize() > 0) {
        try {
          this.ZM.getVerticalScrollBar().getModel().setValue(0);
          this.ZM.setPreferredSize(new Dimension(getWidth(), (this.ZM.getPreferredSize()).height));
          if (this.Ze == null) {
            this.Ze = new Zgjb(Zt2m.ZF(this));
            this.Ze.getContentPane().add(this.ZM);
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        try {
          this.Ze.pack();
          Zk();
          this.Ze.pack();
          this.Ze.setVisible(true);
          if (bool) {
            Zi();
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zi();
  }
  
  private void Zk() {
    Point point = getLocationOnScreen();
    Rectangle rectangle = Zt2m.ZW(Zt2m.ZF(this));
    boolean bool = Zm99.ZM();
    try {
      if (point.y + getHeight() + this.Ze.getHeight() <= rectangle.y + rectangle.height) {
        try {
          this.Ze.setLocation(point.x, point.y + getHeight());
          if (!bool) {
            this.Ze.setLocation(point.x, point.y - this.Ze.getHeight());
            return;
          } 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Ze.setLocation(point.x, point.y - this.Ze.getHeight());
  }
  
  private boolean ZB(String paramString) {
    try {
      if (this.ZE == null)
        return true; 
      try {
        switch (this.ZE.ordinal()) {
          case 0:
          
          case 1:
          
          case 2:
            new URL(paramString);
          case 3:
            Long.parseLong(paramString);
          case 5:
          
          case 6:
            try {
            
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return (0 != Zko5.Zi(paramString));
          case 8:
          case 9:
          case 10:
            Pattern.compile(paramString);
          case 12:
          
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      return true;
    } catch (NumberFormatException|java.util.regex.PatternSyntaxException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return false;
  }
  
  public void insertUpdate(DocumentEvent paramDocumentEvent) {
    try {
      if (!this.ZY)
        Zu(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void removeUpdate(DocumentEvent paramDocumentEvent) {
    try {
      if (!this.ZY)
        Zu(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void changedUpdate(DocumentEvent paramDocumentEvent) {
    try {
      if (!this.ZY)
        Zu(); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void valueChanged(ListSelectionEvent paramListSelectionEvent) {
    try {
      if (this.ZB.getSize() != 0)
        try {
          if (this.Zm < 0) {
            String str = this.Zk.getSelectedValue();
            try {
              Zi();
              if (str != null) {
                setText(str);
                dispatchEvent(new KeyEvent(this, 402, 0L, 0, 0, false));
              } 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return;
          } 
          return;
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void eventDispatched(AWTEvent paramAWTEvent) {
    Object object = paramAWTEvent.getSource();
    try {
      if (object instanceof Component)
        try {
          if (Zt2m.Zb((Component)object) == this.Ze)
            return; 
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      if (!(paramAWTEvent instanceof java.awt.event.MouseEvent))
        return; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      switch (paramAWTEvent.getID()) {
        case 500:
        case 501:
        case 502:
        case 506:
          Zi();
          break;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void focusLost(FocusEvent paramFocusEvent) {
    Toolkit.getDefaultToolkit().removeAWTEventListener(this);
    Zi();
    boolean bool = Zm99.ZQ();
    String str = getText();
    try {
      if (!str.isEmpty() && ZB(str)) {
        Zzyf zzyf = new Zzyf(str, System.currentTimeMillis());
        this.Zv.removeIf(str::lambda$focusLost$1);
        this.Zv.add(zzyf);
        while (this.Zv.size() > 50) {
          this.Zv.pollLast();
          if (bool)
            break; 
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  public void focusGained(FocusEvent paramFocusEvent) {
    Toolkit.getDefaultToolkit().addAWTEventListener(this, 16L);
  }
  
  public void keyTyped(KeyEvent paramKeyEvent) {}
  
  public void keyPressed(KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual isControlDown : ()Z
    //   8: ifeq -> 42
    //   11: aload_1
    //   12: invokevirtual getKeyCode : ()I
    //   15: bipush #32
    //   17: if_icmpne -> 42
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   26: athrow
    //   27: aload_0
    //   28: invokevirtual Zu : ()V
    //   31: iload_2
    //   32: ifeq -> 69
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   41: athrow
    //   42: aload_1
    //   43: invokevirtual getKeyCode : ()I
    //   46: bipush #27
    //   48: if_icmpne -> 69
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   57: athrow
    //   58: aload_0
    //   59: invokevirtual Zi : ()V
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   68: athrow
    //   69: aload_0
    //   70: getfield Ze : Lburp/Zgjb;
    //   73: ifnull -> 309
    //   76: aload_0
    //   77: getfield Ze : Lburp/Zgjb;
    //   80: invokevirtual isVisible : ()Z
    //   83: ifeq -> 309
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   92: athrow
    //   93: bipush #40
    //   95: aload_1
    //   96: invokevirtual getKeyCode : ()I
    //   99: if_icmpne -> 174
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   108: athrow
    //   109: aload_0
    //   110: dup
    //   111: getfield Zm : I
    //   114: iconst_1
    //   115: iadd
    //   116: putfield Zm : I
    //   119: aload_0
    //   120: getfield Zm : I
    //   123: aload_0
    //   124: getfield ZB : Ljavax/swing/DefaultListModel;
    //   127: invokevirtual size : ()I
    //   130: if_icmplt -> 152
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   139: athrow
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield Zm : I
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   151: athrow
    //   152: aload_0
    //   153: getfield Zk : Lburp/Zrpl;
    //   156: aload_0
    //   157: getfield Zm : I
    //   160: invokevirtual setSelectedIndex : (I)V
    //   163: aload_0
    //   164: getfield Zk : Lburp/Zrpl;
    //   167: aload_0
    //   168: getfield Zm : I
    //   171: invokevirtual ensureIndexIsVisible : (I)V
    //   174: bipush #38
    //   176: aload_1
    //   177: invokevirtual getKeyCode : ()I
    //   180: if_icmpne -> 249
    //   183: aload_0
    //   184: dup
    //   185: getfield Zm : I
    //   188: iconst_1
    //   189: isub
    //   190: putfield Zm : I
    //   193: aload_0
    //   194: getfield Zm : I
    //   197: ifge -> 227
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   206: athrow
    //   207: aload_0
    //   208: aload_0
    //   209: getfield ZB : Ljavax/swing/DefaultListModel;
    //   212: invokevirtual size : ()I
    //   215: iconst_1
    //   216: isub
    //   217: putfield Zm : I
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   226: athrow
    //   227: aload_0
    //   228: getfield Zk : Lburp/Zrpl;
    //   231: aload_0
    //   232: getfield Zm : I
    //   235: invokevirtual setSelectedIndex : (I)V
    //   238: aload_0
    //   239: getfield Zk : Lburp/Zrpl;
    //   242: aload_0
    //   243: getfield Zm : I
    //   246: invokevirtual ensureIndexIsVisible : (I)V
    //   249: bipush #10
    //   251: aload_1
    //   252: invokevirtual getKeyCode : ()I
    //   255: if_icmpne -> 309
    //   258: aload_0
    //   259: getfield Zm : I
    //   262: iconst_m1
    //   263: if_icmple -> 309
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   272: athrow
    //   273: aload_0
    //   274: getfield Zm : I
    //   277: istore_3
    //   278: aload_0
    //   279: iconst_m1
    //   280: putfield Zm : I
    //   283: aload_0
    //   284: getfield Zk : Lburp/Zrpl;
    //   287: iload_3
    //   288: invokevirtual setSelectedIndex : (I)V
    //   291: aload_0
    //   292: aload_0
    //   293: getfield Zk : Lburp/Zrpl;
    //   296: invokevirtual getSelectedValue : ()Ljava/lang/Object;
    //   299: checkcast java/lang/String
    //   302: invokevirtual setText : (Ljava/lang/String;)V
    //   305: aload_0
    //   306: invokevirtual Zi : ()V
    //   309: return
    // Exception table:
    //   from	to	target	type
    //   4	20	23	java/lang/NumberFormatException
    //   11	35	38	java/lang/NumberFormatException
    //   27	51	54	java/lang/NumberFormatException
    //   42	62	65	java/lang/NumberFormatException
    //   69	86	89	java/lang/NumberFormatException
    //   76	102	105	java/lang/NumberFormatException
    //   93	133	136	java/lang/NumberFormatException
    //   109	145	148	java/lang/NumberFormatException
    //   174	200	203	java/lang/NumberFormatException
    //   183	220	223	java/lang/NumberFormatException
    //   249	266	269	java/lang/NumberFormatException
  }
  
  public void keyReleased(KeyEvent paramKeyEvent) {}
  
  private void Zi() {
    try {
      this.Zk.clearSelection();
      this.Zm = -1;
      if (this.Ze != null) {
        this.Ze.dispose();
        this.Ze = null;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private void Zt() {
    InputMap inputMap = getInputMap();
    inputMap.put(KeyStroke.getKeyStroke(38, 0), a(-653, -30343));
    inputMap.put(KeyStroke.getKeyStroke(40, 0), a(-655, 26341));
    ActionMap actionMap = getActionMap();
    Zg7c zg7c = new Zg7c(this);
    actionMap.put(a(-656, -14506), zg7c);
    actionMap.put(a(-654, -3140), zg7c);
  }
  
  private static boolean lambda$focusLost$1(String paramString, Zzyf paramZzyf) {
    return paramZzyf.ZV.equals(paramString);
  }
  
  private static TreeSet lambda$setCompletionType$0(Zlw9 paramZlw9) {
    return new TreeSet();
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ð0Z[Æ´Ðå\\bÒsã?ªü'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #10
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #21
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
    //   67: ldc 'Æ÷,µ\\nEÿÃÞÅ7þn'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #8
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #86
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
    //   128: putstatic burp/Zgff.b : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zgff.c : [Ljava/lang/String;
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
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #126
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #118
    //   229: goto -> 244
    //   232: bipush #53
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #43
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: new java/util/HashMap
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zgff.ZK : Ljava/util/Map;
    //   310: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFD72) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = '»';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgff.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */