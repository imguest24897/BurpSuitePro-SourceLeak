package burp;

import burp.theme.BurpTableBackgroundModifier;
import burp.theme.BurpTableUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.Optional;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.plaf.TableUI;

public class Zeeb {
  private static final Border Zr;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static Border Zp() {
    return ZX().orElse(Zr);
  }
  
  private static Optional<Border> ZX() {
    return Optional.ofNullable(Zr52.Zr(Zlq6.CELL_NO_FOCUS_BORDER.key));
  }
  
  public static void Zh(Component paramComponent, JTable paramJTable, boolean paramBoolean, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zt : ()Z
    //   3: aload_1
    //   4: invokevirtual getBackground : ()Ljava/awt/Color;
    //   7: astore #6
    //   9: istore #5
    //   11: aload_1
    //   12: iload_3
    //   13: invokevirtual isRowSelected : (I)Z
    //   16: ifeq -> 25
    //   19: aload_1
    //   20: invokevirtual getSelectionBackground : ()Ljava/awt/Color;
    //   23: astore #6
    //   25: aload_1
    //   26: iload_3
    //   27: aload #6
    //   29: invokestatic ZS : (Ljavax/swing/JTable;ILjava/awt/Color;)Ljava/awt/Color;
    //   32: astore #6
    //   34: aconst_null
    //   35: astore #7
    //   37: aload_1
    //   38: invokevirtual getDropLocation : ()Ljavax/swing/JTable$DropLocation;
    //   41: astore #8
    //   43: aload #8
    //   45: ifnull -> 107
    //   48: aload #8
    //   50: invokevirtual isInsertRow : ()Z
    //   53: ifne -> 107
    //   56: aload #8
    //   58: invokevirtual isInsertColumn : ()Z
    //   61: ifne -> 107
    //   64: aload #8
    //   66: invokevirtual getRow : ()I
    //   69: iload_3
    //   70: if_icmpne -> 107
    //   73: aload #8
    //   75: invokevirtual getColumn : ()I
    //   78: iload #4
    //   80: if_icmpne -> 107
    //   83: getstatic burp/Zlq6.DROP_CELL_FOREGROUND : Lburp/Zlq6;
    //   86: getfield key : Ljava/lang/String;
    //   89: invokestatic Zg : (Ljava/lang/String;)Ljava/awt/Color;
    //   92: astore #7
    //   94: getstatic burp/Zlq6.DROP_CELL_BACKGROUND : Lburp/Zlq6;
    //   97: getfield key : Ljava/lang/String;
    //   100: invokestatic Zg : (Ljava/lang/String;)Ljava/awt/Color;
    //   103: astore #6
    //   105: iconst_1
    //   106: istore_2
    //   107: iload_2
    //   108: ifeq -> 139
    //   111: aload #7
    //   113: ifnonnull -> 123
    //   116: aload_1
    //   117: invokevirtual getSelectionForeground : ()Ljava/awt/Color;
    //   120: goto -> 125
    //   123: aload #7
    //   125: astore #7
    //   127: iload #5
    //   129: ifeq -> 145
    //   132: iconst_5
    //   133: anewarray burp/Zbqc
    //   136: invokestatic Zr : ([Lburp/Zbqc;)V
    //   139: aload_1
    //   140: invokevirtual getForeground : ()Ljava/awt/Color;
    //   143: astore #7
    //   145: getstatic burp/theme/BurpTableBackgroundModifier.MODIFIER : Lburp/theme/BurpTableBackgroundModifier;
    //   148: getfield zebraStripe : Z
    //   151: istore #9
    //   153: iload #9
    //   155: ifeq -> 166
    //   158: aload #6
    //   160: iload_3
    //   161: invokestatic ZX : (Ljava/awt/Color;I)Ljava/awt/Color;
    //   164: astore #6
    //   166: aload_1
    //   167: invokevirtual getModel : ()Ljavax/swing/table/TableModel;
    //   170: astore #12
    //   172: aload #12
    //   174: instanceof burp/Zzk8
    //   177: ifeq -> 260
    //   180: aload #12
    //   182: checkcast burp/Zzk8
    //   185: astore #10
    //   187: aload #10
    //   189: aload_1
    //   190: iload_3
    //   191: invokevirtual convertRowIndexToModel : (I)I
    //   194: invokeinterface ZW : (I)Ljava/lang/Object;
    //   199: astore #12
    //   201: aload #12
    //   203: instanceof burp/Zsmr
    //   206: ifeq -> 260
    //   209: aload #12
    //   211: checkcast burp/Zsmr
    //   214: astore #11
    //   216: aload #11
    //   218: invokeinterface ZaP : ()B
    //   223: ifle -> 260
    //   226: aload #11
    //   228: aload_1
    //   229: iload_3
    //   230: invokevirtual isRowSelected : (I)Z
    //   233: invokestatic ZY : (Lburp/Zsmr;Z)Lburp/Zra2;
    //   236: astore #12
    //   238: aload #12
    //   240: invokevirtual ZA3 : ()Ljava/awt/Color;
    //   243: astore #7
    //   245: aload #12
    //   247: invokevirtual ZAc : ()Ljava/awt/Color;
    //   250: aload_1
    //   251: iload_3
    //   252: invokestatic ZA : (Ljavax/swing/JTable;I)Z
    //   255: invokestatic Zp : (Ljava/awt/Color;Z)Ljava/awt/Color;
    //   258: astore #6
    //   260: aload_0
    //   261: aload #7
    //   263: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   266: aload_0
    //   267: aload #6
    //   269: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   272: return
  }
  
  public static void Zd(JComponent paramJComponent, JTable paramJTable, boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
    ZK(paramJComponent, paramJTable, paramBoolean1, paramBoolean2, BurpTableBackgroundModifier.MODIFIER.zebraStripe, paramInt);
  }
  
  private static void ZK(JComponent paramJComponent, JTable paramJTable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt) {
    Border border = ZN(paramBoolean2, paramBoolean1);
    paramJComponent.setBorder(border);
  }
  
  private static Border ZN(boolean paramBoolean1, boolean paramBoolean2) {
    return !paramBoolean1 ? Zp() : (paramBoolean2 ? Optional.<Border>ofNullable(Zr52.Zr(Zlq6.FOCUS_SELECTED_CELL_HIGHLIGHT_BORDER.key)).orElseGet(Zeeb::lambda$getBorderForRenderer$0) : Zr52.Zr(Zlq6.FOCUS_CELL_HIGHLIGHT_BORDER.key));
  }
  
  static boolean ZG(Component paramComponent, boolean paramBoolean) {
    Color color = paramComponent.getBackground();
    boolean bool = Zm23.Zt();
    Container container = paramComponent.getParent();
    if (container != null)
      container = container.getParent(); 
    boolean bool1 = (color != null && container != null && color.equals(container.getBackground()) && container.isOpaque()) ? true : false;
    if (Zbqc.Zwu() == null)
      Zm23.Zd(!bool); 
    return (!bool1 && paramBoolean);
  }
  
  static void ZK(JComponent paramJComponent) {
    paramJComponent.setOpaque(true);
    paramJComponent.setBorder(Zp());
    paramJComponent.putClientProperty(a(-11266, -12037), Boolean.TRUE);
    paramJComponent.setName(a(-11265, 18156));
  }
  
  private static boolean ZA(JTable paramJTable, int paramInt) {
    TableUI tableUI = paramJTable.getUI();
    BurpTableUI burpTableUI = (BurpTableUI)tableUI;
    byte b = (tableUI instanceof BurpTableUI) ? burpTableUI.getRolloverRowIndex() : -1;
    return (paramInt == b);
  }
  
  private static Color ZS(JTable paramJTable, int paramInt, Color paramColor) {
    if (ZA(paramJTable, paramInt)) {
      Zbws zbws = (Zbws)paramJTable;
      paramColor = (paramJTable instanceof Zbws) ? Optional.<Zlkk>ofNullable(zbws.ZH1()).map(Zlkk::ZS).orElse(paramColor) : Zlkk.TABLE_ROLLOVER_ROW_BACKGROUND.ZS();
    } 
    return paramColor;
  }
  
  private static Border lambda$getBorderForRenderer$0() {
    return Zr52.Zr(Zlq6.FOCUS_CELL_HIGHLIGHT_BORDER.key);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'üÇ\\b^0ù¸ÙVb£ÄAn7B\\f¡!ØXp¥/»C'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #82
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zeeb.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zeeb.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: iconst_5
    //   153: goto -> 183
    //   156: bipush #116
    //   158: goto -> 183
    //   161: bipush #92
    //   163: goto -> 183
    //   166: bipush #124
    //   168: goto -> 183
    //   171: bipush #126
    //   173: goto -> 183
    //   176: bipush #105
    //   178: goto -> 183
    //   181: bipush #79
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: new javax/swing/border/EmptyBorder
    //   229: dup
    //   230: iconst_1
    //   231: iconst_1
    //   232: iconst_1
    //   233: iconst_1
    //   234: invokespecial <init> : (IIII)V
    //   237: putstatic burp/Zeeb.Zr : Ljavax/swing/border/Border;
    //   240: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD3FF) & 0xFFFF;
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
      char c = 'á';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeeb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */