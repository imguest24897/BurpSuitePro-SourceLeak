package burp;

import java.awt.BorderLayout;
import java.awt.event.HierarchyEvent;
import javax.swing.ImageIcon;
import net.portswigger.browser.Zct;

public class Zb7z extends Zbqc implements Zlpt {
  private final Zbc9 ZL = new Zbc9();
  
  private final Zbcg Zd;
  
  private final Zbqc Zj;
  
  private final Zm99 ZV;
  
  private boolean Zs;
  
  private static Zbqc[] Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb7z() {
    super(new BorderLayout());
    Zbqc[] arrayOfZbqc = Z_();
    this.Zd = Zltn.ZK(Zgzq.SCANNER_EMPTY_STATE, a(31775, -4717)).Za(a(31772, 15314)).Zi();
    this.Zj = new Zbqc();
    this.Zj.setLayout(new BorderLayout());
    this.ZV = new Zm99();
    this.Zj.add(this.ZV, a(31773, 13823));
    this.ZL.add(this.Zd);
    this.ZL.add(this.Zj);
    this.ZL.ZP(this.Zd);
    add(this.ZL, a(31774, -4262));
    addHierarchyListener(this::lambda$new$0);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void Zg(Zct paramZct) {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zs : Z
    //   8: ifeq -> 92
    //   11: aload_1
    //   12: ifnonnull -> 19
    //   15: aconst_null
    //   16: goto -> 31
    //   19: aload_1
    //   20: aload_0
    //   21: invokevirtual getWidth : ()I
    //   24: aload_0
    //   25: invokevirtual getHeight : ()I
    //   28: invokevirtual Zn : (II)Ljava/awt/Image;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnonnull -> 40
    //   36: aconst_null
    //   37: goto -> 48
    //   40: new javax/swing/ImageIcon
    //   43: dup
    //   44: aload_3
    //   45: invokespecial <init> : (Ljava/awt/Image;)V
    //   48: astore #4
    //   50: aload #4
    //   52: ifnonnull -> 70
    //   55: aload_0
    //   56: getfield ZL : Lburp/Zbc9;
    //   59: aload_0
    //   60: getfield Zd : Lburp/Zbcg;
    //   63: invokevirtual ZP : (Ljava/awt/Component;)V
    //   66: aload_2
    //   67: ifnull -> 92
    //   70: aload_0
    //   71: getfield ZL : Lburp/Zbc9;
    //   74: aload_0
    //   75: getfield Zj : Lburp/Zbqc;
    //   78: invokevirtual ZP : (Ljava/awt/Component;)V
    //   81: aload_0
    //   82: aload #4
    //   84: <illegal opcode> run : (Lburp/Zb7z;Ljavax/swing/ImageIcon;)Ljava/lang/Runnable;
    //   89: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   92: return
  }
  
  private void lambda$setCurrentFrame$1(ImageIcon paramImageIcon) {
    this.ZV.setIcon(paramImageIcon);
  }
  
  private void lambda$new$0(HierarchyEvent paramHierarchyEvent) {
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) > 0L)
      this.Zs = isShowing(); 
  }
  
  public static void ZG(Zbqc[] paramArrayOfZbqc) {
    Zk = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Z_() {
    return Zk;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '}àCÑ'-ÃgÙÀÂÌ9@úÆø«:&/¢Ã~T$Øð1,ÕZbãRß\¿sw'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #40
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic ZG : ([Lburp/Zbqc;)V
    //   26: bipush #108
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'Ý/nbö÷Sò×Ä)ù*ýÂÞÿÛ\\nüz¾¤'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #6
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #75
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zb7z.a : [Ljava/lang/String;
    //   135: iconst_4
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zb7z.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #47
    //   218: goto -> 248
    //   221: bipush #49
    //   223: goto -> 248
    //   226: bipush #87
    //   228: goto -> 248
    //   231: bipush #62
    //   233: goto -> 248
    //   236: bipush #53
    //   238: goto -> 248
    //   241: bipush #46
    //   243: goto -> 248
    //   246: bipush #42
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7C1F) & 0xFFFF;
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
      byte b1 = 11;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */