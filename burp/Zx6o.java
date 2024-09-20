package burp;

import java.awt.Component;
import java.awt.Window;
import java.io.File;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zx6o {
  private static final Zx6o Zl;
  
  private static Zx6o ZQ;
  
  private static int[] Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zrh7 Zl(Window paramWindow, boolean paramBoolean, Zzv7 paramZzv7) {
    return ZQ.Zs(paramWindow, paramBoolean, paramZzv7);
  }
  
  protected Zrh7 Zs(Window paramWindow, boolean paramBoolean, Zzv7 paramZzv7) {
    return new Zrh7(paramWindow, paramBoolean, paramZzv7);
  }
  
  public static boolean ZY(Component paramComponent, Object paramObject) {
    return ZQ.Zr(paramComponent, paramObject);
  }
  
  protected boolean Zr(Component paramComponent, Object paramObject) {
    Zezu zezu = new Zezu(paramComponent, a(-6659, -22999), paramObject, 0, 2, new String[] { a(-6662, 9874), a(-6658, -17141) }1, -1);
    return (0 == ZP(zezu));
  }
  
  public static int Zc(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt) {
    return Zj(paramComponent, paramString, paramObject, paramArrayOfString, paramInt, -1);
  }
  
  public static int Zj(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt1, int paramInt2) {
    return ZQ.ZX(paramComponent, paramString, paramObject, paramArrayOfString, paramInt1, paramInt2);
  }
  
  protected int ZX(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt1, int paramInt2) {
    Zezu zezu = new Zezu(paramComponent, paramString, paramObject, 0, 2, paramArrayOfString, paramInt1, paramInt2);
    return ZP(zezu);
  }
  
  public static void ZZ(Component paramComponent, String paramString, Object paramObject) {
    ZQ.ZQ(paramComponent, paramString, paramObject, -1, new String[] { a(-6660, -14287) });
  }
  
  public static int Z_(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt) {
    return Zo(paramComponent, paramString, paramObject, paramArrayOfString, paramInt, -1);
  }
  
  public static int Zo(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt1, int paramInt2) {
    return ZQ.ZS(paramComponent, paramString, paramObject, -1, paramArrayOfString, paramInt1, paramInt2);
  }
  
  public static void Zv(Component paramComponent, String paramString, Object paramObject) {
    ZQ.Zk(paramComponent, paramString, paramObject);
  }
  
  protected void Zk(Component paramComponent, String paramString, Object paramObject) {
    ZQ(paramComponent, paramString, paramObject, 2, new String[] { a(-6660, -14287) });
  }
  
  public static int ZC(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt) {
    return Zr(paramComponent, paramString, paramObject, paramArrayOfString, paramInt, -1);
  }
  
  public static int Zr(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt1, int paramInt2) {
    return ZQ.Za(paramComponent, paramString, paramObject, paramArrayOfString, paramInt1, paramInt2);
  }
  
  protected int Za(Component paramComponent, String paramString, Object paramObject, String[] paramArrayOfString, int paramInt1, int paramInt2) {
    return ZS(paramComponent, paramString, paramObject, 2, paramArrayOfString, paramInt1, paramInt2);
  }
  
  public static void Zf(Component paramComponent, String paramString, Object paramObject) {
    ZQ.Zn(paramComponent, paramString, paramObject);
  }
  
  protected void Zn(Component paramComponent, String paramString, Object paramObject) {
    ZQ(paramComponent, paramString, paramObject, 1, new String[] { a(-6660, -14287) });
  }
  
  public static void Zt(Component paramComponent, String paramString, Object paramObject) {
    ZQ.ZQ(paramComponent, paramString, paramObject, 0, new String[] { a(-6657, 10413) });
  }
  
  private void ZQ(Component paramComponent, String paramString, Object paramObject, int paramInt, String[] paramArrayOfString) {
    ZS(paramComponent, paramString, paramObject, paramInt, paramArrayOfString, 0, -1);
  }
  
  private int ZS(Component paramComponent, String paramString, Object paramObject, int paramInt1, String[] paramArrayOfString, int paramInt2, int paramInt3) {
    Zezu zezu = new Zezu(paramComponent, paramString, paramObject, 0, paramInt1, paramArrayOfString, paramInt2, paramInt3);
    return ZP(zezu);
  }
  
  public static Zrvv ZM(Component paramComponent, int paramInt, String paramString1, Zskm paramZskm, String paramString2, File paramFile, Zlfc paramZlfc, FileFilter paramFileFilter) {
    return ZQ.ZL(paramComponent, paramInt, paramString1, paramZskm, paramString2, paramFile, paramZlfc, paramFileFilter);
  }
  
  protected Zrvv ZL(Component paramComponent, int paramInt, String paramString1, Zskm paramZskm, String paramString2, File paramFile, Zlfc paramZlfc, FileFilter paramFileFilter) {
    Zrvv zrvv = new Zrvv((paramComponent == null) ? null : Zt2m.ZF(paramComponent), paramString1, paramInt, paramFileFilter, paramZskm, paramString2, paramFile, paramZlfc);
    zrvv.setVisible(true);
    return zrvv;
  }
  
  public static Zrvv Zp(Component paramComponent, String paramString1, FileFilter paramFileFilter, String paramString2, File paramFile, Zlfc paramZlfc) {
    return ZQ.Zm(paramComponent, paramString1, paramFileFilter, paramString2, paramFile, paramZlfc);
  }
  
  protected Zrvv Zm(Component paramComponent, String paramString1, FileFilter paramFileFilter, String paramString2, File paramFile, Zlfc paramZlfc) {
    Zrvv zrvv = new Zrvv((paramComponent == null) ? null : Zt2m.ZF(paramComponent), paramString1, 0, paramFileFilter, null, paramString2, paramFile, paramZlfc);
    zrvv.setVisible(true);
    return zrvv;
  }
  
  public static String ZL(Component paramComponent, String paramString1, String paramString2) {
    return ZE(paramComponent, 3, paramString1, paramString2, null);
  }
  
  public static String Zf(Component paramComponent, String paramString1, String paramString2, String paramString3) {
    return ZE(paramComponent, 3, paramString1, paramString2, paramString3);
  }
  
  public static String ZE(Component paramComponent, int paramInt, String paramString1, String paramString2, String paramString3) {
    return ZQ.Zv(paramComponent, paramInt, paramString1, paramString2, paramString3);
  }
  
  protected String Zv(Component paramComponent, int paramInt, String paramString1, String paramString2, String paramString3) {
    Zxn1 zxn1 = new Zxn1(paramComponent, paramInt, paramString1, paramString2, paramString3);
    return Zx(zxn1);
  }
  
  private static int ZP(Zezu paramZezu) {
    String[] arrayOfString = Zbv5.ZvS();
    try {
      try {
        if (SwingUtilities.isEventDispatchThread()) {
          try {
            paramZezu.run();
            if (arrayOfString == null)
              SwingUtilities.invokeAndWait(paramZezu); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return paramZezu.Zm;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      SwingUtilities.invokeAndWait(paramZezu);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return paramZezu.Zm;
  }
  
  private static String Zx(Zxn1 paramZxn1) {
    String[] arrayOfString = Zbv5.ZvS();
    try {
      try {
        if (SwingUtilities.isEventDispatchThread()) {
          try {
            paramZxn1.run();
            if (arrayOfString == null)
              SwingUtilities.invokeAndWait(paramZxn1); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return paramZxn1.ZP;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      SwingUtilities.invokeAndWait(paramZxn1);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return paramZxn1.ZP;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_4
    //   7: newarray int
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic ZY : ([I)V
    //   14: ldc 'iTßjÃ"'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: iconst_2
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #85
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
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
    //   72: ldc '2­\\fµ|^ú£Ez'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #7
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #52
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 146
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
    //   133: putstatic burp/Zx6o.a : [Ljava/lang/String;
    //   136: iconst_5
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zx6o.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #7
    //   218: goto -> 248
    //   221: bipush #73
    //   223: goto -> 248
    //   226: bipush #93
    //   228: goto -> 248
    //   231: bipush #127
    //   233: goto -> 248
    //   236: bipush #46
    //   238: goto -> 248
    //   241: bipush #109
    //   243: goto -> 248
    //   246: bipush #43
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: new burp/Zx6o
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: putstatic burp/Zx6o.Zl : Lburp/Zx6o;
    //   314: getstatic burp/Zx6o.Zl : Lburp/Zx6o;
    //   317: putstatic burp/Zx6o.ZQ : Lburp/Zx6o;
    //   320: return
  }
  
  public static void ZY(int[] paramArrayOfint) {
    Zh = paramArrayOfint;
  }
  
  public static int[] ZE() {
    return Zh;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE5FE) & 0xFFFF;
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
      byte b1 = 15;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx6o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */