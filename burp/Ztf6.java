package burp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.TransferHandler;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ActionMapUIResource;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.InputMapUIResource;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.basic.BasicTextAreaUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.EditorKit;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;
import javax.swing.text.PlainView;
import javax.swing.text.Position;
import javax.swing.text.View;
import javax.swing.text.WrappedPlainView;

public class Ztf6 extends BasicTextAreaUI {
  private static final EditorKit ZO;
  
  private static final TransferHandler ZA;
  
  protected Zmgw Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return new Ztf6(paramJComponent);
  }
  
  public Ztf6(JComponent paramJComponent) {
    if (!(paramJComponent instanceof Zmgw))
      throw new IllegalArgumentException(a(10276, -22280)); 
    this.Zq = (Zmgw)paramJComponent;
  }
  
  private void Zc(JTextComponent paramJTextComponent) {
    Color color = paramJTextComponent.getCaretColor();
    try {
      if (color == null)
        paramJTextComponent.setCaretColor(Zmgw.ZT()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    color = paramJTextComponent.getSelectionColor();
    if (color == null) {
      color = UIManager.getColor(a(10281, 10221));
      if (color == null) {
        color = UIManager.getColor(a(10277, -3925));
        if (color == null)
          color = new ColorUIResource(Color.BLUE); 
      } 
      paramJTextComponent.setSelectionColor(color);
    } 
    color = paramJTextComponent.getSelectedTextColor();
    if (color == null) {
      color = UIManager.getColor(a(10272, -12270));
      if (color == null) {
        color = UIManager.getColor(a(10285, 11359));
        if (color == null)
          color = new ColorUIResource(Color.WHITE); 
      } 
      paramJTextComponent.setSelectedTextColor(color);
    } 
    color = paramJTextComponent.getDisabledTextColor();
    if (color == null) {
      color = UIManager.getColor(a(10275, 24602));
      if (color == null) {
        color = UIManager.getColor(a(10279, -20160));
        if (color == null)
          color = new ColorUIResource(Color.DARK_GRAY); 
      } 
      paramJTextComponent.setDisabledTextColor(color);
    } 
    Border border = paramJTextComponent.getBorder();
    try {
      if (border == null)
        paramJTextComponent.setBorder(new BasicBorders.MarginBorder()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public View create(Element paramElement) {
    try {
      if (this.Zq.getLineWrap())
        return new WrappedPlainView(paramElement, this.Zq.getWrapStyleWord()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new PlainView(paramElement);
  }
  
  protected Caret createCaret() {
    Zz_j zz_j = new Zz_j();
    zz_j.setBlinkRate(500);
    return zz_j;
  }
  
  protected Keymap createKeymap() {
    Keymap keymap = JTextComponent.getKeymap(a(10284, 15674));
    if (keymap == null) {
      Keymap keymap1 = JTextComponent.getKeymap(a(10286, -23862));
      keymap = JTextComponent.addKeymap(a(10274, -17555), keymap1);
      keymap.setDefaultAction(new Zzf0());
    } 
    return keymap;
  }
  
  protected ActionMap Zx() {
    ActionMapUIResource actionMapUIResource = new ActionMapUIResource();
    Action[] arrayOfAction1 = this.Zq.getActions();
    Action[] arrayOfAction2 = arrayOfAction1;
    int j = arrayOfAction2.length;
    byte b = 0;
    int i = Zz85.Zm();
    while (b < j) {
      Action action = arrayOfAction2[b];
      actionMapUIResource.put(action.getValue(a(10273, 6864)), action);
      b++;
      if (i != 0)
        break; 
    } 
    actionMapUIResource.put(TransferHandler.getCutAction().getValue(a(10287, 10586)), TransferHandler.getCutAction());
    actionMapUIResource.put(TransferHandler.getCopyAction().getValue(a(10287, 10586)), TransferHandler.getCopyAction());
    actionMapUIResource.put(TransferHandler.getPasteAction().getValue(a(10287, 10586)), TransferHandler.getPasteAction());
    return actionMapUIResource;
  }
  
  protected String ZF() {
    return a(10299, -10625);
  }
  
  public EditorKit getEditorKit(JTextComponent paramJTextComponent) {
    return ZO;
  }
  
  public Zmgw ZN() {
    return this.Zq;
  }
  
  private ActionMap Zk() {
    ActionMap actionMap = (ActionMap)UIManager.get(ZF());
    if (actionMap == null) {
      actionMap = Zx();
      UIManager.put(ZF(), actionMap);
    } 
    ActionMapUIResource actionMapUIResource = new ActionMapUIResource();
    try {
      actionMapUIResource.put(a(10280, 13777), new Zlyl(this));
      if (actionMap != null)
        actionMapUIResource.setParent(actionMap); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return actionMapUIResource;
  }
  
  protected InputMap Zc() {
    InputMapUIResource inputMapUIResource = new InputMapUIResource();
    InputMap inputMap = (InputMap)UIManager.get(a(10283, -6499));
    if (inputMap == null) {
      inputMap = new Ze_o();
      UIManager.put(a(10282, 30032), inputMap);
    } 
    inputMapUIResource.setParent(inputMap);
    return inputMapUIResource;
  }
  
  protected Rectangle getVisibleEditorRect() {
    return super.getVisibleEditorRect();
  }
  
  protected void installDefaults() {
    super.installDefaults();
    JTextComponent jTextComponent = getComponent();
    jTextComponent.setMargin(new InsetsUIResource(2, 5, 2, 2));
    Zc(jTextComponent);
    jTextComponent.setTransferHandler(ZA);
  }
  
  protected void installKeyboardActions() {
    Zmgw zmgw = ZN();
    zmgw.setKeymap(createKeymap());
    InputMap inputMap = Zc();
    SwingUtilities.replaceUIInputMap(zmgw, 0, inputMap);
    ActionMap actionMap = Zk();
    SwingUtilities.replaceUIActionMap(zmgw, actionMap);
  }
  
  public void installUI(JComponent paramJComponent) {
    try {
      if (!(paramJComponent instanceof Zmgw))
        throw new Error(a(10278, 20714)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    super.installUI(paramJComponent);
  }
  
  protected void paintBackground(Graphics paramGraphics) {
    Color color = this.Zq.getBackground();
    try {
      if (color != null) {
        paramGraphics.setColor(color);
        paramGraphics.fillRect(0, 0, this.Zq.getWidth(), this.Zq.getHeight());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zo((Graphics2D)paramGraphics);
  }
  
  protected void ZA(Graphics paramGraphics) {
    if (this.Zq.ZB()) {
      Caret caret = this.Zq.getCaret();
      try {
        if (caret.getDot() == caret.getMark()) {
          paramGraphics.setColor(this.Zq.ZP());
          paramGraphics.fillRect(0, this.Zq.ZI, this.Zq.getWidth(), (int)Math.ceil(this.Zq.ZS()));
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  protected void Zo(Graphics2D paramGraphics2D) {
    ZA(paramGraphics2D);
  }
  
  protected void paintSafely(Graphics paramGraphics) {
    try {
      if (!this.Zq.isOpaque())
        Zo((Graphics2D)paramGraphics); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    super.paintSafely(paramGraphics);
  }
  
  public float ZA(int paramInt) throws BadLocationException {
    Rectangle2D rectangle2D = modelToView2D(this.Zq, paramInt, Position.Bias.Forward);
    try {
    
    } catch (BadLocationException badLocationException) {
      throw a(null);
    } 
    return (rectangle2D != null) ? (float)rectangle2D.getY() : -1.0F;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'bõ?|âø=©ÈÌ\\tâ;Sli|!P'yIH7ûóm@½t\\tÑ6¡ÆeH>ÉcüL_æ.®Wrn\\b«¯&¯ý1\\föfv\T{Û=Vº¼:¸Â¹ò$¼29ýmÆåø».>¹RVüÄ 5g¸`¢ºdª²EÞGJ3ËXþÎÿñlF£± OÌ~ÓbÁlâþñ¸ åsÝØæOÌav|lÍÁL2Vf\\n£gÄ$ÀW \¯Ù²ùïùRê"Ü>+¦e¢\\fV¶PA\\b=\káÜò&rÃ¼©°¾þz¹.@¤¾¤*ªU·\\rÚ{ÒÔ;iA\\r/!¼é'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #46
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
    //   68: ldc 'a\0A¤F;¤iíÍDo¢Yé&PpoöÜ@ÀÇ6îêM4M¬|×hu»qPû¸ocuq¥òîÉCÍÁ\\tU¶Ëu? l'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #47
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #37
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
    //   129: putstatic burp/Ztf6.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztf6.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #111
    //   214: goto -> 243
    //   217: iconst_4
    //   218: goto -> 243
    //   221: bipush #13
    //   223: goto -> 243
    //   226: bipush #109
    //   228: goto -> 243
    //   231: bipush #63
    //   233: goto -> 243
    //   236: bipush #116
    //   238: goto -> 243
    //   241: bipush #65
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: new burp/Ze86
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Ztf6.ZO : Ljavax/swing/text/EditorKit;
    //   310: new burp/Zz9m
    //   313: dup
    //   314: invokespecial <init> : ()V
    //   317: putstatic burp/Ztf6.ZA : Ljavax/swing/TransferHandler;
    //   320: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x282B) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztf6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */