package burp;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public final class Zxr8<T> {
  private final Zlnb<T> Zs;
  
  private final T Zv;
  
  private static String[] ZM;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zxr8(Zlnb<T> paramZlnb, T paramT) {
    if (paramZlnb == null)
      throw new IllegalArgumentException(); 
    this.Zs = paramZlnb;
    this.Zv = paramT;
  }
  
  public Zxr8(Zlnb<T> paramZlnb) {
    this(paramZlnb, null);
  }
  
  public Zlnb<T> Zq() {
    return this.Zs;
  }
  
  public Optional<T> ZF() {
    return Optional.ofNullable(this.Zv);
  }
  
  public void ZP(Consumer<T> paramConsumer) {
    int i = Zt3y.ZF();
    try {
      if (this.Zv == null) {
        try {
          Zuh.ZT(false, Zqf.Zv, this.Zs.ZS());
          if (i == 0) {
            paramConsumer.accept(this.Zv);
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramConsumer.accept(this.Zv);
  }
  
  public String toString() {
    StringBuilder stringBuilder = (new StringBuilder(a(5116, 6350))).append(this.Zs.ZS());
    int i = Zt3y.ZF();
    try {
      if (this.Zv != null)
        stringBuilder.append(a(5117, 29510)).append(this.Zv); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      stringBuilder.append('}');
      if (Zbqc.Zwu() == null)
        Zt3y.ZH(++i); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return stringBuilder.toString();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (!(paramObject instanceof Zxr8))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zxr8 zxr8 = (Zxr8)paramObject;
    try {
      if (Objects.equals(this.Zs, zxr8.Zs))
        try {
          if (Objects.equals(this.Zv, zxr8.Zv));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zs, this.Zv });
  }
  
  public static void Zd(String[] paramArrayOfString) {
    ZM = paramArrayOfString;
  }
  
  public static String[] Zy() {
    return ZM;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'bà2pÁó.\\fJv¤çÛ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_1
    //   18: anewarray java/lang/String
    //   21: bipush #10
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic Zd : ([Ljava/lang/String;)V
    //   29: bipush #33
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 89
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: aload #5
    //   76: putstatic burp/Zxr8.b : [Ljava/lang/String;
    //   79: iconst_2
    //   80: anewarray java/lang/String
    //   83: putstatic burp/Zxr8.c : [Ljava/lang/String;
    //   86: goto -> 234
    //   89: dup_x2
    //   90: pop
    //   91: invokevirtual toCharArray : ()[C
    //   94: dup_x1
    //   95: arraylength
    //   96: dup_x2
    //   97: pop
    //   98: iconst_0
    //   99: istore #6
    //   101: dup2_x1
    //   102: pop2
    //   103: dup_x2
    //   104: iconst_1
    //   105: if_icmpgt -> 207
    //   108: dup2
    //   109: swap
    //   110: iload #6
    //   112: dup2_x1
    //   113: caload
    //   114: swap
    //   115: iload #6
    //   117: bipush #7
    //   119: irem
    //   120: tableswitch default -> 189, 0 -> 160, 1 -> 165, 2 -> 170, 3 -> 175, 4 -> 179, 5 -> 184
    //   160: bipush #8
    //   162: goto -> 191
    //   165: bipush #125
    //   167: goto -> 191
    //   170: bipush #62
    //   172: goto -> 191
    //   175: iconst_2
    //   176: goto -> 191
    //   179: bipush #19
    //   181: goto -> 191
    //   184: bipush #26
    //   186: goto -> 191
    //   189: bipush #11
    //   191: ixor
    //   192: ixor
    //   193: i2c
    //   194: castore
    //   195: iinc #6, 1
    //   198: dup
    //   199: ifne -> 207
    //   202: dup2
    //   203: dup_x1
    //   204: goto -> 112
    //   207: dup2_x1
    //   208: pop2
    //   209: dup_x2
    //   210: iload #6
    //   212: if_icmpgt -> 108
    //   215: pop
    //   216: new java/lang/String
    //   219: dup_x1
    //   220: swap
    //   221: invokespecial <init> : ([C)V
    //   224: invokevirtual intern : ()Ljava/lang/String;
    //   227: swap
    //   228: pop
    //   229: swap
    //   230: pop
    //   231: goto -> 46
    //   234: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x13FC) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxr8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */