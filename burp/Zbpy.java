package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.Window;

class Zbpy {
  private final Window Zz;
  
  private final Zxjc[] ZZ;
  
  private final Zxz8 ZU;
  
  private final Zb93 Zp;
  
  private final Zrn8 ZE;
  
  private Zsuy ZD;
  
  private Zepe ZH;
  
  private Zepe ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbpy(Window paramWindow, Zxjc[] paramArrayOfZxjc, Zxz8 paramZxz8, Zb93 paramZb93, Zrn8 paramZrn8) {
    this.Zz = paramWindow;
    this.ZZ = paramArrayOfZxjc;
    this.ZU = paramZxz8;
    this.Zp = paramZb93;
    this.ZE = paramZrn8;
  }
  
  void ZB(Component paramComponent, boolean paramBoolean, Point paramPoint) {
    // Byte code:
    //   0: new burp/Zg1_
    //   3: dup
    //   4: aload_0
    //   5: invokespecial <init> : (Lburp/Zbpy;)V
    //   8: astore #5
    //   10: new burp/Zkj9
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore #6
    //   19: invokestatic ZKF : ()Z
    //   22: aload_0
    //   23: new burp/Zsuy
    //   26: dup
    //   27: sipush #-31405
    //   30: sipush #15147
    //   33: invokestatic a : (II)Ljava/lang/String;
    //   36: invokespecial <init> : (Ljava/lang/String;)V
    //   39: putfield ZD : Lburp/Zsuy;
    //   42: aload_0
    //   43: getfield ZD : Lburp/Zsuy;
    //   46: aload #5
    //   48: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   51: aload_0
    //   52: getfield ZD : Lburp/Zsuy;
    //   55: iload_2
    //   56: invokevirtual setEnabled : (Z)V
    //   59: aload #6
    //   61: aload_0
    //   62: getfield ZD : Lburp/Zsuy;
    //   65: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   68: pop
    //   69: istore #4
    //   71: aload_0
    //   72: new burp/Zepe
    //   75: dup
    //   76: sipush #-31406
    //   79: sipush #-26689
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: putfield ZP : Lburp/Zepe;
    //   91: aload_0
    //   92: getfield ZP : Lburp/Zepe;
    //   95: aload #5
    //   97: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   100: aload #6
    //   102: aload_0
    //   103: getfield ZP : Lburp/Zepe;
    //   106: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   109: pop
    //   110: aload_0
    //   111: new burp/Zepe
    //   114: dup
    //   115: sipush #-31408
    //   118: sipush #-28419
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: putfield ZH : Lburp/Zepe;
    //   130: aload_0
    //   131: getfield ZH : Lburp/Zepe;
    //   134: aload #5
    //   136: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   139: aload #6
    //   141: aload_0
    //   142: getfield ZH : Lburp/Zepe;
    //   145: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   148: pop
    //   149: aload_0
    //   150: getfield ZZ : [Lburp/Zxjc;
    //   153: arraylength
    //   154: iconst_1
    //   155: if_icmpne -> 212
    //   158: aload_0
    //   159: getfield ZD : Lburp/Zsuy;
    //   162: aload_0
    //   163: getfield ZZ : [Lburp/Zxjc;
    //   166: iconst_0
    //   167: aaload
    //   168: getfield Zm : Z
    //   171: invokevirtual setSelected : (Z)V
    //   174: aload_0
    //   175: getfield ZP : Lburp/Zepe;
    //   178: iload_2
    //   179: ifeq -> 203
    //   182: aload_0
    //   183: getfield ZZ : [Lburp/Zxjc;
    //   186: iconst_0
    //   187: aaload
    //   188: getfield ZV : Ljava/util/Set;
    //   191: invokeinterface isEmpty : ()Z
    //   196: ifne -> 203
    //   199: iconst_1
    //   200: goto -> 204
    //   203: iconst_0
    //   204: invokevirtual setEnabled : (Z)V
    //   207: iload #4
    //   209: ifeq -> 239
    //   212: aload_0
    //   213: getfield ZD : Lburp/Zsuy;
    //   216: aload_0
    //   217: invokevirtual Zt : ()Z
    //   220: invokevirtual setSelected : (Z)V
    //   223: aload_0
    //   224: getfield ZP : Lburp/Zepe;
    //   227: iconst_0
    //   228: invokevirtual setEnabled : (Z)V
    //   231: aload_0
    //   232: getfield ZH : Lburp/Zepe;
    //   235: iconst_0
    //   236: invokevirtual setEnabled : (Z)V
    //   239: aload #6
    //   241: aload_1
    //   242: aload_3
    //   243: getfield x : I
    //   246: aload_3
    //   247: getfield y : I
    //   250: invokevirtual show : (Ljava/awt/Component;II)V
    //   253: invokestatic Zwu : ()[Lburp/Zbqc;
    //   256: ifnonnull -> 272
    //   259: iload #4
    //   261: ifeq -> 268
    //   264: iconst_0
    //   265: goto -> 269
    //   268: iconst_1
    //   269: invokestatic Zu : (Z)V
    //   272: return
  }
  
  private boolean Zt() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: invokestatic ZKF : ()Z
    //   5: iconst_0
    //   6: istore_3
    //   7: istore_1
    //   8: aload_0
    //   9: getfield ZZ : [Lburp/Zxjc;
    //   12: astore #4
    //   14: aload #4
    //   16: arraylength
    //   17: istore #5
    //   19: iconst_0
    //   20: istore #6
    //   22: iload #6
    //   24: iload #5
    //   26: if_icmpge -> 61
    //   29: aload #4
    //   31: iload #6
    //   33: aaload
    //   34: astore #7
    //   36: aload #7
    //   38: getfield Zm : Z
    //   41: ifeq -> 51
    //   44: iinc #2, 1
    //   47: iload_1
    //   48: ifeq -> 54
    //   51: iinc #3, 1
    //   54: iinc #6, 1
    //   57: iload_1
    //   58: ifeq -> 22
    //   61: iload_2
    //   62: iload_3
    //   63: if_icmplt -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: ireturn
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'xÛBz,-RÍ[gæØõ\\tÖ¿`]lîÑOó¿{hàK^ÅzÞQg;g¦¼v'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #22
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #28
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
    //   69: putstatic burp/Zbpy.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zbpy.b : [Ljava/lang/String;
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
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 176
    //   152: bipush #57
    //   154: goto -> 183
    //   157: bipush #83
    //   159: goto -> 183
    //   162: bipush #113
    //   164: goto -> 183
    //   167: bipush #104
    //   169: goto -> 183
    //   172: iconst_2
    //   173: goto -> 183
    //   176: bipush #111
    //   178: goto -> 183
    //   181: bipush #64
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
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8552) & 0xFFFF;
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
      char c = 'Ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */