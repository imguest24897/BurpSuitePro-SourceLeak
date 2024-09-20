package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import net.portswigger.Zkb;
import net.portswigger.Zlz;
import net.portswigger.Zsy;

public class Zl87 implements Zkrr {
  static final List<Zer7> Zj;
  
  static final List<Zer7> Zb;
  
  private final Ze3n ZN;
  
  private final Zbnt ZK;
  
  private final Zsy Zp;
  
  private final Zsoh Zu;
  
  private Zzhh ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl87(Ze3n paramZe3n, Zbnt paramZbnt, Zsy paramZsy, Zsoh paramZsoh) {
    this.ZN = paramZe3n;
    this.ZK = paramZbnt;
    this.Zp = paramZsy;
    this.Zu = paramZsoh;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: iconst_3
    //   1: newarray int
    //   3: dup
    //   4: iconst_0
    //   5: iconst_5
    //   6: iastore
    //   7: dup
    //   8: iconst_1
    //   9: bipush #6
    //   11: iastore
    //   12: dup
    //   13: iconst_2
    //   14: bipush #7
    //   16: iastore
    //   17: astore #4
    //   19: new java/util/concurrent/atomic/AtomicInteger
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore #5
    //   28: new burp/Zrqj
    //   31: dup
    //   32: iconst_2
    //   33: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   38: aload_0
    //   39: getfield ZN : Lburp/Ze3n;
    //   42: aload_0
    //   43: getfield ZK : Lburp/Zbnt;
    //   46: aload_0
    //   47: getfield Zu : Lburp/Zsoh;
    //   50: aload_2
    //   51: aload_3
    //   52: aload_0
    //   53: <illegal opcode> test : (Lburp/Zl87;)Ljava/util/function/Predicate;
    //   58: aload_0
    //   59: <illegal opcode> apply : (Lburp/Zl87;)Ljava/util/function/BiFunction;
    //   64: aload_0
    //   65: aload #4
    //   67: aload #5
    //   69: <illegal opcode> apply : (Lburp/Zl87;[ILjava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Function;
    //   74: aload_0
    //   75: <illegal opcode> apply : (Lburp/Zl87;)Ljava/util/function/BiFunction;
    //   80: invokespecial <init> : (BLjava/util/function/Function;Lburp/Ze3n;Lburp/Zbnt;Lburp/Zsoh;Lburp/Ztpx;Lburp/Zz4_;Ljava/util/function/Predicate;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/BiFunction;)V
    //   83: invokevirtual ZO : ()V
    //   86: return
  }
  
  public Zbsl Zp() {
    return Zbsl.APU_BackupFilesReplaceExtension;
  }
  
  public String toString() {
    return Zp().toString();
  }
  
  private byte[] lambda$doCheck$4(String paramString1, String paramString2) {
    String str = Zrqj.Zi(paramString2) + Zrqj.Zi(paramString2);
    return Zkb.Zy(paramString1.substring(0, this.ZU.Zw) + paramString1.substring(0, this.ZU.Zw));
  }
  
  private byte[] lambda$doCheck$3(int[] paramArrayOfint, AtomicInteger paramAtomicInteger, String paramString) {
    String str = this.Zp.Zi().Zq().ZK(paramArrayOfint[paramAtomicInteger.getAndIncrement() % paramArrayOfint.length]);
    return Zkb.Zy(paramString.substring(0, this.ZU.ZA) + paramString.substring(0, this.ZU.ZA));
  }
  
  private byte[] lambda$doCheck$2(String paramString1, String paramString2) {
    return Zkb.Zy(paramString1.substring(0, this.ZU.ZA) + paramString1.substring(0, this.ZU.ZA));
  }
  
  private boolean lambda$doCheck$1(Zzhh paramZzhh) {
    this.ZU = paramZzhh;
    return Zlz.Zu(paramZzhh.Zx);
  }
  
  private static List lambda$doCheck$0(Zlit paramZlit) {
    ArrayList<Zer7> arrayList = new ArrayList<>(Zj);
    if (a(-27153, -12358).equals(paramZlit.Zd_()))
      arrayList.addAll(Zb); 
    return arrayList;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'RF)Ë&sIÂ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #117
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
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
    //   66: ldc 'X4s?øµº'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_5
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #40
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zl87.a : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zl87.b : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #34
    //   210: goto -> 240
    //   213: bipush #44
    //   215: goto -> 240
    //   218: bipush #100
    //   220: goto -> 240
    //   223: bipush #10
    //   225: goto -> 240
    //   228: bipush #49
    //   230: goto -> 240
    //   233: bipush #44
    //   235: goto -> 240
    //   238: bipush #79
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: new burp/Ztk
    //   299: dup
    //   300: invokespecial <init> : ()V
    //   303: putstatic burp/Zl87.Zj : Ljava/util/List;
    //   306: iconst_3
    //   307: anewarray burp/Zer7
    //   310: dup
    //   311: iconst_0
    //   312: sipush #-27155
    //   315: sipush #18873
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   324: aastore
    //   325: dup
    //   326: iconst_1
    //   327: sipush #-27154
    //   330: sipush #-21149
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   339: aastore
    //   340: dup
    //   341: iconst_2
    //   342: sipush #-27156
    //   345: sipush #3632
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: invokestatic Zf : (Ljava/lang/String;)Lburp/Zgub;
    //   354: aastore
    //   355: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   358: putstatic burp/Zl87.Zb : Ljava/util/List;
    //   361: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF95EE) & 0xFFFF;
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
      char c = 'ó';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl87.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */