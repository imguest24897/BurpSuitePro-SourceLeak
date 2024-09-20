package burp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zzl2 extends JWindow implements ActionListener {
  private static Zzl2 Ze;
  
  private final Zxj Zl;
  
  private final Zl86 ZV;
  
  private final transient Zm1w ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zzl2(Window paramWindow, Zxj paramZxj, String paramString) {
    super(paramWindow);
    this.Zl = paramZxj;
    this.ZW = new Zm1w(this);
    JPanel jPanel = new JPanel(new BorderLayout());
    jPanel.setBorder(Zt48.Zs());
    jPanel.setBackground(Zlkk.TOOLTIP_BACKGROUND.ZS());
    this.ZV = new Zl86();
    this.ZV.setText(paramString);
    this.ZV.setEditable(false);
    this.ZV.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    this.ZV.getCaret().setSelectionVisible(true);
    this.ZV.ZH(Zlkk.FOREGROUND);
    this.ZV.ZL(Zlkk.TOOLTIP_BACKGROUND);
    this.ZV.ZI(Zt00.DEFAULT_FONT);
    this.ZV.addMouseListener(this.ZW);
    jPanel.add(this.ZV);
    setFocusableWindowState(false);
    setContentPane(jPanel);
    Zz();
    pack();
    Zk27 zk27 = new Zk27(this);
    Zbqc[] arrayOfZbqc = Zxj.Zt();
    addKeyListener(zk27);
    this.ZV.addKeyListener(zk27);
    synchronized (Zzl2.class) {
      if (Ze != null)
        Ze.dispose(); 
      Ze = this;
    } 
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (!getFocusableWindowState()) {
      setFocusableWindowState(true);
      Zz();
      this.ZV.removeMouseListener(this.ZW);
      pack();
      addWindowFocusListener(new Zmd0(this));
      this.Zl.ZE();
      if (paramActionEvent == null)
        requestFocus(); 
    } 
  }
  
  public void dispose() {
    Container container = getContentPane();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zxj.Zt();
    while (b < container.getComponentCount()) {
      container.getComponent(b).removeMouseListener(this.ZW);
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    this.Zl.ZE();
    super.dispose();
  }
  
  void Zo() {
    try {
      Rectangle rectangle = this.ZV.modelToView(this.ZV.getDocument().getLength() - 1);
      Dimension dimension = this.ZV.getPreferredSize();
      dimension.width += 25;
      char c1 = 'ɘ';
      char c2 = 'Ɛ';
      dimension.width = Math.min(dimension.width, c1);
      dimension.height = Math.min(dimension.height, c2);
      this.ZV.setPreferredSize(dimension);
      this.ZV.setSize(dimension);
      rectangle = this.ZV.modelToView(this.ZV.getDocument().getLength() - 1);
      try {
        if (rectangle.y + rectangle.height > dimension.height) {
          dimension.height = rectangle.y + rectangle.height + 5;
          this.ZV.setPreferredSize(dimension);
        } 
      } catch (BadLocationException badLocationException) {
        throw a(null);
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    pack();
  }
  
  private void Zz() {
    // Byte code:
    //   0: new javax/swing/JPanel
    //   3: dup
    //   4: new java/awt/BorderLayout
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   14: astore_2
    //   15: invokestatic Zt : ()[Lburp/Zbqc;
    //   18: aload_2
    //   19: new javax/swing/JSeparator
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: sipush #-6134
    //   29: sipush #5435
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   38: astore_1
    //   39: aload_0
    //   40: invokevirtual getFocusableWindowState : ()Z
    //   43: istore_3
    //   44: iload_3
    //   45: ifeq -> 109
    //   48: new burp/Zro1
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #4
    //   57: aload #4
    //   59: aload #4
    //   61: invokevirtual getComponentOrientation : ()Ljava/awt/ComponentOrientation;
    //   64: invokevirtual applyComponentOrientation : (Ljava/awt/ComponentOrientation;)V
    //   67: aload_2
    //   68: aload #4
    //   70: sipush #-6129
    //   73: sipush #-11411
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   82: new burp/Ztx_
    //   85: dup
    //   86: aload_0
    //   87: aload_2
    //   88: invokespecial <init> : (Lburp/Zzl2;Ljavax/swing/JPanel;)V
    //   91: astore #5
    //   93: aload_2
    //   94: aload #5
    //   96: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   99: aload_2
    //   100: aload #5
    //   102: invokevirtual addMouseMotionListener : (Ljava/awt/event/MouseMotionListener;)V
    //   105: aload_1
    //   106: ifnonnull -> 251
    //   109: aload_2
    //   110: iconst_0
    //   111: invokevirtual setOpaque : (Z)V
    //   114: new javax/swing/JLabel
    //   117: dup
    //   118: sipush #-6136
    //   121: sipush #-29197
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokestatic ZR : (Ljava/lang/String;)Ljava/lang/String;
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: astore #4
    //   135: sipush #-6133
    //   138: sipush #-32627
    //   141: invokestatic a : (II)Ljava/lang/String;
    //   144: invokestatic getColor : (Ljava/lang/Object;)Ljava/awt/Color;
    //   147: astore #5
    //   149: aload_0
    //   150: getfield ZV : Lburp/Zl86;
    //   153: invokevirtual getFont : ()Ljava/awt/Font;
    //   156: astore #6
    //   158: aload #6
    //   160: aload #6
    //   162: invokevirtual getSize2D : ()F
    //   165: fconst_1
    //   166: fsub
    //   167: invokevirtual deriveFont : (F)Ljava/awt/Font;
    //   170: astore #6
    //   172: aload #4
    //   174: aload #6
    //   176: invokevirtual setFont : (Ljava/awt/Font;)V
    //   179: aload #5
    //   181: ifnonnull -> 189
    //   184: getstatic java/awt/Color.GRAY : Ljava/awt/Color;
    //   187: astore #5
    //   189: aload #4
    //   191: iconst_1
    //   192: invokevirtual setOpaque : (Z)V
    //   195: getstatic burp/Zlkk.TOOLTIP_BACKGROUND : Lburp/Zlkk;
    //   198: invokevirtual ZS : ()Ljava/awt/Color;
    //   201: astore #7
    //   203: aload #4
    //   205: aload #7
    //   207: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   210: aload #4
    //   212: aload #5
    //   214: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   217: aload #4
    //   219: bipush #11
    //   221: invokevirtual setHorizontalAlignment : (I)V
    //   224: aload #4
    //   226: iconst_0
    //   227: iconst_5
    //   228: iconst_0
    //   229: iconst_5
    //   230: invokestatic createEmptyBorder : (IIII)Ljavax/swing/border/Border;
    //   233: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   236: aload_2
    //   237: aload #4
    //   239: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   242: pop
    //   243: aload_2
    //   244: aload_0
    //   245: getfield ZW : Lburp/Zm1w;
    //   248: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   251: aload_0
    //   252: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   255: astore #4
    //   257: aload #4
    //   259: invokevirtual getComponentCount : ()I
    //   262: iconst_2
    //   263: if_icmpne -> 364
    //   266: aload #4
    //   268: iconst_0
    //   269: invokevirtual getComponent : (I)Ljava/awt/Component;
    //   272: astore #5
    //   274: aload #4
    //   276: iconst_0
    //   277: invokevirtual remove : (I)V
    //   280: new javax/swing/JScrollPane
    //   283: dup
    //   284: aload #5
    //   286: invokespecial <init> : (Ljava/awt/Component;)V
    //   289: astore #6
    //   291: invokestatic createEmptyBorder : ()Ljavax/swing/border/Border;
    //   294: astore #7
    //   296: aload #6
    //   298: aload #7
    //   300: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   303: aload #6
    //   305: aload #7
    //   307: invokevirtual setViewportBorder : (Ljavax/swing/border/Border;)V
    //   310: aload #6
    //   312: aload_0
    //   313: getfield ZV : Lburp/Zl86;
    //   316: invokevirtual getBackground : ()Ljava/awt/Color;
    //   319: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   322: aload #6
    //   324: invokevirtual getViewport : ()Ljavax/swing/JViewport;
    //   327: aload_0
    //   328: getfield ZV : Lburp/Zl86;
    //   331: invokevirtual getBackground : ()Ljava/awt/Color;
    //   334: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   337: aload #4
    //   339: aload #6
    //   341: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   344: pop
    //   345: aload #4
    //   347: iconst_0
    //   348: invokevirtual getComponent : (I)Ljava/awt/Component;
    //   351: aload_0
    //   352: getfield ZW : Lburp/Zm1w;
    //   355: invokevirtual removeMouseListener : (Ljava/awt/event/MouseListener;)V
    //   358: aload #4
    //   360: iconst_0
    //   361: invokevirtual remove : (I)V
    //   364: aload #4
    //   366: aload_2
    //   367: sipush #-6135
    //   370: sipush #4695
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   379: return
  }
  
  private static BadLocationException a(BadLocationException paramBadLocationException) {
    return paramBadLocationException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ê£\\t|p¿Oµ? Ùn??É£§%~@jr"/{I'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #24
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #38
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
    //   67: ldc 'õwe\\nÑC\\tÀ\\rbq'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #11
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #106
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
    //   128: putstatic burp/Zzl2.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zzl2.b : [Ljava/lang/String;
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
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #56
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #44
    //   229: goto -> 244
    //   232: bipush #122
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #24
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE80B) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzl2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */