package burp.theme;

import burp.Zm9k;
import com.formdev.flatlaf.ui.FlatLabelUI;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.ComponentUI;

public class MultiLineLabelUI extends FlatLabelUI {
  private final Rectangle iconRectangle = new Rectangle();
  
  private final Rectangle textRectangle = new Rectangle();
  
  private final JLabel preferredSizeLabel = new JLabel();
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected MultiLineLabelUI(boolean paramBoolean) {
    super(paramBoolean);
  }
  
  public static ComponentUI createUI(JComponent paramJComponent) {
    return FlatUIUtils.canUseSharedUI(paramJComponent) ? FlatUIUtils.createSharedUI(MultiLineLabelUI.class, MultiLineLabelUI::lambda$createUI$0) : (ComponentUI)new MultiLineLabelUI(false);
  }
  
  public void paint(Graphics paramGraphics, JComponent paramJComponent) {
    // Byte code:
    //   0: aload_2
    //   1: checkcast burp/Zm9k
    //   4: astore #4
    //   6: aload #4
    //   8: invokevirtual getText : ()Ljava/lang/String;
    //   11: astore #5
    //   13: invokestatic ZL : ()I
    //   16: aload #4
    //   18: invokestatic getIcon : (Ljavax/swing/JLabel;)Ljavax/swing/Icon;
    //   21: astore #6
    //   23: istore_3
    //   24: aload #6
    //   26: ifnonnull -> 35
    //   29: aload #5
    //   31: ifnonnull -> 35
    //   34: return
    //   35: aload_2
    //   36: aload_1
    //   37: invokevirtual getFont : ()Ljava/awt/Font;
    //   40: invokevirtual getFontMetrics : (Ljava/awt/Font;)Ljava/awt/FontMetrics;
    //   43: astore #7
    //   45: aload_0
    //   46: aload #4
    //   48: aload #7
    //   50: aload_2
    //   51: invokevirtual getWidth : ()I
    //   54: aload_2
    //   55: invokevirtual getHeight : ()I
    //   58: invokevirtual layout : (Lburp/Zm9k;Ljava/awt/FontMetrics;II)[Ljava/lang/String;
    //   61: astore #8
    //   63: aload #6
    //   65: ifnull -> 91
    //   68: aload #6
    //   70: aload_2
    //   71: aload_1
    //   72: aload_0
    //   73: getfield iconRectangle : Ljava/awt/Rectangle;
    //   76: getfield x : I
    //   79: aload_0
    //   80: getfield iconRectangle : Ljava/awt/Rectangle;
    //   83: getfield y : I
    //   86: invokeinterface paintIcon : (Ljava/awt/Component;Ljava/awt/Graphics;II)V
    //   91: aload #5
    //   93: ifnull -> 240
    //   96: aload_2
    //   97: sipush #15482
    //   100: sipush #5053
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual getClientProperty : (Ljava/lang/Object;)Ljava/lang/Object;
    //   109: checkcast javax/swing/text/View
    //   112: astore #9
    //   114: aload #9
    //   116: ifnull -> 133
    //   119: aload #9
    //   121: aload_1
    //   122: aload_0
    //   123: getfield textRectangle : Ljava/awt/Rectangle;
    //   126: invokevirtual paint : (Ljava/awt/Graphics;Ljava/awt/Shape;)V
    //   129: iload_3
    //   130: ifne -> 240
    //   133: aload_0
    //   134: getfield textRectangle : Ljava/awt/Rectangle;
    //   137: getfield x : I
    //   140: istore #10
    //   142: aload_0
    //   143: getfield textRectangle : Ljava/awt/Rectangle;
    //   146: getfield y : I
    //   149: aload #7
    //   151: invokevirtual getAscent : ()I
    //   154: iadd
    //   155: istore #11
    //   157: aload #8
    //   159: astore #12
    //   161: aload #12
    //   163: arraylength
    //   164: istore #13
    //   166: iconst_0
    //   167: istore #14
    //   169: iload #14
    //   171: iload #13
    //   173: if_icmpge -> 240
    //   176: aload #12
    //   178: iload #14
    //   180: aaload
    //   181: astore #15
    //   183: aload #4
    //   185: invokevirtual isEnabled : ()Z
    //   188: ifeq -> 208
    //   191: aload_0
    //   192: aload #4
    //   194: aload_1
    //   195: aload #15
    //   197: iload #10
    //   199: iload #11
    //   201: invokevirtual paintEnabledText : (Ljavax/swing/JLabel;Ljava/awt/Graphics;Ljava/lang/String;II)V
    //   204: iload_3
    //   205: ifne -> 221
    //   208: aload_0
    //   209: aload #4
    //   211: aload_1
    //   212: aload #15
    //   214: iload #10
    //   216: iload #11
    //   218: invokevirtual paintDisabledText : (Ljavax/swing/JLabel;Ljava/awt/Graphics;Ljava/lang/String;II)V
    //   221: iload #11
    //   223: aload_0
    //   224: getfield textRectangle : Ljava/awt/Rectangle;
    //   227: getfield height : I
    //   230: iadd
    //   231: istore #11
    //   233: iinc #14, 1
    //   236: iload_3
    //   237: ifne -> 169
    //   240: return
  }
  
  private String[] layout(Zm9k paramZm9k, FontMetrics paramFontMetrics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getText : ()Ljava/lang/String;
    //   4: astore #6
    //   6: invokestatic ZL : ()I
    //   9: aload_1
    //   10: invokestatic getIcon : (Ljavax/swing/JLabel;)Ljavax/swing/Icon;
    //   13: astore #7
    //   15: istore #5
    //   17: aload_0
    //   18: aload_1
    //   19: aconst_null
    //   20: invokevirtual getInsets : (Ljava/awt/Insets;)Ljava/awt/Insets;
    //   23: iload_3
    //   24: iload #4
    //   26: invokevirtual viewRectangle : (Ljava/awt/Insets;II)Ljava/awt/Rectangle;
    //   29: astore #8
    //   31: aload_0
    //   32: invokevirtual resetTextAndIconRectangles : ()V
    //   35: iconst_1
    //   36: aload_1
    //   37: invokevirtual Zo : ()I
    //   40: invokestatic max : (II)I
    //   43: anewarray java/lang/String
    //   46: astore #9
    //   48: iconst_0
    //   49: istore #10
    //   51: aload #6
    //   53: ifnonnull -> 60
    //   56: ldc ''
    //   58: astore #6
    //   60: iconst_0
    //   61: istore #11
    //   63: iload #11
    //   65: aload #9
    //   67: arraylength
    //   68: if_icmpge -> 200
    //   71: aload #6
    //   73: invokevirtual isEmpty : ()Z
    //   76: ifeq -> 88
    //   79: aload #6
    //   81: astore #12
    //   83: iload #5
    //   85: ifne -> 185
    //   88: aload_0
    //   89: invokevirtual resetTextAndIconRectangles : ()V
    //   92: aload_0
    //   93: aload_1
    //   94: aload_2
    //   95: aload #6
    //   97: aload #7
    //   99: aload #8
    //   101: aload_0
    //   102: getfield iconRectangle : Ljava/awt/Rectangle;
    //   105: aload_0
    //   106: getfield textRectangle : Ljava/awt/Rectangle;
    //   109: invokevirtual layoutCL : (Ljavax/swing/JLabel;Ljava/awt/FontMetrics;Ljava/lang/String;Ljavax/swing/Icon;Ljava/awt/Rectangle;Ljava/awt/Rectangle;Ljava/awt/Rectangle;)Ljava/lang/String;
    //   112: astore #12
    //   114: iload #10
    //   116: aload_0
    //   117: getfield textRectangle : Ljava/awt/Rectangle;
    //   120: getfield height : I
    //   123: iadd
    //   124: istore #10
    //   126: iload #11
    //   128: aload #9
    //   130: arraylength
    //   131: iconst_1
    //   132: isub
    //   133: if_icmpge -> 185
    //   136: aload #12
    //   138: aload #6
    //   140: invokevirtual equals : (Ljava/lang/Object;)Z
    //   143: ifeq -> 155
    //   146: ldc ''
    //   148: astore #6
    //   150: iload #5
    //   152: ifne -> 185
    //   155: aload #12
    //   157: sipush #15483
    //   160: sipush #12345
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: ldc ''
    //   168: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: astore #12
    //   173: aload #6
    //   175: aload #12
    //   177: invokevirtual length : ()I
    //   180: invokevirtual substring : (I)Ljava/lang/String;
    //   183: astore #6
    //   185: aload #9
    //   187: iload #11
    //   189: aload #12
    //   191: aastore
    //   192: iinc #11, 1
    //   195: iload #5
    //   197: ifne -> 63
    //   200: aload_0
    //   201: getfield textRectangle : Ljava/awt/Rectangle;
    //   204: getfield height : I
    //   207: iload #10
    //   209: if_icmpeq -> 286
    //   212: aload_1
    //   213: invokevirtual getVerticalAlignment : ()I
    //   216: ifne -> 253
    //   219: aload_0
    //   220: getfield textRectangle : Ljava/awt/Rectangle;
    //   223: aload_0
    //   224: getfield textRectangle : Ljava/awt/Rectangle;
    //   227: getfield y : I
    //   230: aload_0
    //   231: getfield textRectangle : Ljava/awt/Rectangle;
    //   234: getfield height : I
    //   237: iconst_2
    //   238: idiv
    //   239: iadd
    //   240: iload #10
    //   242: iconst_2
    //   243: idiv
    //   244: isub
    //   245: putfield y : I
    //   248: iload #5
    //   250: ifne -> 286
    //   253: aload_1
    //   254: invokevirtual getVerticalAlignment : ()I
    //   257: iconst_3
    //   258: if_icmpne -> 286
    //   261: aload_0
    //   262: getfield textRectangle : Ljava/awt/Rectangle;
    //   265: aload_0
    //   266: getfield textRectangle : Ljava/awt/Rectangle;
    //   269: getfield y : I
    //   272: aload_0
    //   273: getfield textRectangle : Ljava/awt/Rectangle;
    //   276: getfield height : I
    //   279: iadd
    //   280: iload #10
    //   282: isub
    //   283: putfield y : I
    //   286: aload #9
    //   288: areturn
  }
  
  public Dimension getPreferredSize(JComponent paramJComponent) {
    Zm9k zm9k = (Zm9k)paramJComponent;
    String str = zm9k.getText();
    Icon icon = getIcon((JLabel)zm9k);
    this.preferredSizeLabel.setFont(paramJComponent.getFont());
    this.preferredSizeLabel.setText(str);
    Dimension dimension = this.preferredSizeLabel.getPreferredSize();
    dimension.height *= zm9k.Zo();
    if (icon != null)
      dimension.height = Math.max(icon.getIconHeight(), dimension.height); 
    return dimension;
  }
  
  private static Icon getIcon(JLabel paramJLabel) {
    return paramJLabel.isEnabled() ? paramJLabel.getIcon() : paramJLabel.getDisabledIcon();
  }
  
  private Rectangle viewRectangle(Insets paramInsets, int paramInt1, int paramInt2) {
    Rectangle rectangle = new Rectangle();
    rectangle.x = paramInsets.left;
    rectangle.y = paramInsets.top;
    rectangle.width = paramInt1 - paramInsets.left + paramInsets.right;
    rectangle.height = paramInt2 - paramInsets.top + paramInsets.bottom;
    return rectangle;
  }
  
  private void resetTextAndIconRectangles() {
    this.textRectangle.x = this.textRectangle.y = this.textRectangle.width = this.textRectangle.height = 0;
    this.iconRectangle.x = this.iconRectangle.y = this.iconRectangle.width = this.iconRectangle.height = 0;
  }
  
  private static ComponentUI lambda$createUI$0() {
    return (ComponentUI)new MultiLineLabelUI(true);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¹Q6Älxxj'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #71
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/theme/MultiLineLabelUI.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/theme/MultiLineLabelUI.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #70
    //   154: goto -> 184
    //   157: bipush #68
    //   159: goto -> 184
    //   162: bipush #110
    //   164: goto -> 184
    //   167: bipush #95
    //   169: goto -> 184
    //   172: bipush #126
    //   174: goto -> 184
    //   177: bipush #119
    //   179: goto -> 184
    //   182: bipush #118
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3C7A) & 0xFFFF;
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
      byte b1 = 109;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\theme\MultiLineLabelUI.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */