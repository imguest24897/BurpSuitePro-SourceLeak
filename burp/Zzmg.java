package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zzmg {
  private Zstu Zo;
  
  private int Zw;
  
  private int ZF;
  
  private List<Zt8g> Zk = new ArrayList<>();
  
  private static int[] Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<Zt8g> Zy(Zstu paramZstu, int paramInt1, int paramInt2) {
    return ZS(paramZstu, paramInt1, paramInt2, Zzmg::lambda$parseMessage$0);
  }
  
  public static List<Zt8g> ZS(Zstu paramZstu, int paramInt1, int paramInt2, Supplier<Boolean> paramSupplier) {
    return (new Zzmg(paramZstu, paramInt1, paramInt2, paramSupplier)).Zk;
  }
  
  private Zzmg(Zstu paramZstu, int paramInt1, int paramInt2, Supplier<Boolean> paramSupplier) {
    try {
      Zuh.ZT((paramInt1 <= paramInt2), Zqf.Zk, a(22680, 11818));
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
    try {
      Zuh.ZT((paramInt2 <= paramZstu.Zpu()), Zqf.Zk, a(22681, -7348));
      if (paramInt2 > paramInt1)
        try {
          if (paramInt2 <= paramZstu.Zpu()) {
            this.Zo = paramZstu;
            this.ZF = paramInt1;
            this.Zw = paramInt2;
            try {
              ZM(new int[] { 0, 0 }, (byte)0, paramSupplier);
            } catch (Zm5d zm5d) {
              Zah.Zl(zm5d, Zk_.IGNORED);
            } catch (Exception exception) {
              Zah.Zl(exception, Zk_.UNEXPECTED);
            } 
            return;
          } 
          return;
        } catch (Zm5d zm5d) {
          throw a(null);
        }  
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
  }
  
  private void ZI(Supplier<Boolean> paramSupplier) {
    int[] arrayOfInt = ZP();
    try {
      ZV();
      if (this.Zo.Zp(this.ZF) != 123)
        return; 
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
    this.ZF++;
    while (true) {
      while (true)
        break; 
      if (this.Zo.Zp(this.ZF) == 125) {
        this.ZF++;
        return;
      } 
    } 
  }
  
  private void Zy(int[] paramArrayOfint, Supplier<Boolean> paramSupplier) {
    int[] arrayOfInt = ZP();
    try {
      ZV();
      if (this.Zo.Zp(this.ZF) != 91)
        return; 
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
    this.ZF++;
    while (this.ZF < this.Zw) {
      try {
        if (((Boolean)paramSupplier.get()).booleanValue())
          return; 
      } catch (Zm5d zm5d) {
        throw a(null);
      } 
      int[] arrayOfInt1 = ZM(paramArrayOfint, (byte)93, paramSupplier);
      try {
        if (arrayOfInt1 != null)
          try {
            if (paramArrayOfint != null)
              this.Zk.add(new Zck(Zrdu.JSON_PARAM, this.Zo.Zb(paramArrayOfint[0], paramArrayOfint[1]).Zis(), this.Zo.Zb(arrayOfInt1[0], arrayOfInt1[1]).Zis(), paramArrayOfint[0], paramArrayOfint[1], arrayOfInt1[0], arrayOfInt1[1])); 
          } catch (Zm5d zm5d) {
            throw a(null);
          }  
      } catch (Zm5d zm5d) {
        throw a(null);
      } 
      try {
        ZV();
        switch (this.Zo.Zp(this.ZF)) {
          case 44:
            this.ZF++;
            ZV();
            if (this.Zo.Zp(this.ZF) == 93) {
              this.ZF++;
              return;
            } 
            continue;
          case 93:
            this.ZF++;
            return;
        } 
      } catch (Zm5d zm5d) {
        throw a(null);
      } 
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private int[] ZM(int[] paramArrayOfint, byte paramByte, Supplier<Boolean> paramSupplier) {
    try {
      ZV();
      switch (this.Zo.Zp(this.ZF)) {
        case 123:
          ZI(paramSupplier);
          return null;
        case 34:
          return Zw();
        case 91:
          Zy(paramArrayOfint, paramSupplier);
          return null;
      } 
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
    return ZZ((byte)44, paramByte);
  }
  
  private int[] Zw() {
    int[] arrayOfInt = ZP();
    try {
      ZV();
      if (this.Zo.Zp(this.ZF) != 34)
        return ZZ((byte)58, (byte)0); 
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
    int i = ++this.ZF;
    int j = -1;
    while (this.ZF < this.Zw) {
      switch (this.Zo.Zp(this.ZF)) {
        case 34:
          j = this.ZF;
        case 92:
          this.ZF++;
          break;
      } 
      this.ZF++;
      continue;
      if (arrayOfInt == null)
        break; 
    } 
    if (j == -1)
      j = this.Zw; 
    return new int[] { i, j };
  }
  
  private int[] ZZ(byte paramByte1, byte paramByte2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : I
    //   4: istore #4
    //   6: invokestatic ZP : ()[I
    //   9: iconst_m1
    //   10: istore #5
    //   12: astore_3
    //   13: aload_0
    //   14: getfield ZF : I
    //   17: aload_0
    //   18: getfield Zw : I
    //   21: if_icmpge -> 115
    //   24: aload_0
    //   25: getfield Zo : Lburp/Zstu;
    //   28: aload_0
    //   29: getfield ZF : I
    //   32: invokeinterface Zp : (I)B
    //   37: istore #6
    //   39: iload #6
    //   41: iflt -> 58
    //   44: iload #6
    //   46: bipush #32
    //   48: if_icmple -> 84
    //   51: goto -> 58
    //   54: invokestatic a : (Lburp/Zm5d;)Lburp/Zm5d;
    //   57: athrow
    //   58: iload #6
    //   60: iload_1
    //   61: if_icmpeq -> 84
    //   64: goto -> 71
    //   67: invokestatic a : (Lburp/Zm5d;)Lburp/Zm5d;
    //   70: athrow
    //   71: iload #6
    //   73: iload_2
    //   74: if_icmpne -> 94
    //   77: goto -> 84
    //   80: invokestatic a : (Lburp/Zm5d;)Lburp/Zm5d;
    //   83: athrow
    //   84: aload_0
    //   85: getfield ZF : I
    //   88: istore #5
    //   90: aload_3
    //   91: ifnonnull -> 115
    //   94: aload_0
    //   95: dup
    //   96: getfield ZF : I
    //   99: iconst_1
    //   100: iadd
    //   101: putfield ZF : I
    //   104: aload_3
    //   105: ifnonnull -> 13
    //   108: goto -> 115
    //   111: invokestatic a : (Lburp/Zm5d;)Lburp/Zm5d;
    //   114: athrow
    //   115: iload #5
    //   117: iconst_m1
    //   118: if_icmpne -> 127
    //   121: aload_0
    //   122: getfield Zw : I
    //   125: istore #5
    //   127: iload #4
    //   129: iload #5
    //   131: if_icmpne -> 140
    //   134: aconst_null
    //   135: areturn
    //   136: invokestatic a : (Lburp/Zm5d;)Lburp/Zm5d;
    //   139: athrow
    //   140: iconst_2
    //   141: newarray int
    //   143: dup
    //   144: iconst_0
    //   145: iload #4
    //   147: iastore
    //   148: dup
    //   149: iconst_1
    //   150: iload #5
    //   152: iastore
    //   153: areturn
    // Exception table:
    //   from	to	target	type
    //   39	51	54	burp/Zm5d
    //   44	64	67	burp/Zm5d
    //   58	77	80	burp/Zm5d
    //   90	108	111	burp/Zm5d
    //   127	136	136	burp/Zm5d
  }
  
  private void ZV() {
    int[] arrayOfInt = ZP();
    while (this.ZF < this.Zw) {
      byte b = this.Zo.Zp(this.ZF);
      try {
        if (b <= 32) {
          try {
            if (b < 0)
              break; 
          } catch (Zm5d zm5d) {
            throw a(null);
          } 
          this.ZF++;
          if (arrayOfInt == null)
            break; 
        } 
      } catch (Zm5d zm5d) {
        throw a(null);
      } 
    } 
    try {
      if (Zt())
        throw new Zm5d(this); 
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
  }
  
  private boolean Zt() {
    try {
    
    } catch (Zm5d zm5d) {
      throw a(null);
    } 
    return (this.ZF >= this.Zw);
  }
  
  private static Boolean lambda$parseMessage$0() {
    return Boolean.valueOf(false);
  }
  
  public static void Zc(int[] paramArrayOfint) {
    Zn = paramArrayOfint;
  }
  
  public static int[] ZP() {
    return Zn;
  }
  
  private static Zm5d a(Zm5d paramZm5d) {
    return paramZm5d;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'iþ8á#@Ü*­ZR=0 ¤KôôÂuûDÊÇo¬ÈtþÞ¼³ßíiâW'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: newarray int
    //   20: bipush #33
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic Zc : ([I)V
    //   28: iconst_5
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
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
    //   69: goto -> 28
    //   72: aload #5
    //   74: putstatic burp/Zzmg.a : [Ljava/lang/String;
    //   77: iconst_2
    //   78: anewarray java/lang/String
    //   81: putstatic burp/Zzmg.b : [Ljava/lang/String;
    //   84: goto -> 231
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 204
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #11
    //   158: goto -> 188
    //   161: bipush #62
    //   163: goto -> 188
    //   166: bipush #37
    //   168: goto -> 188
    //   171: bipush #110
    //   173: goto -> 188
    //   176: bipush #117
    //   178: goto -> 188
    //   181: bipush #40
    //   183: goto -> 188
    //   186: bipush #13
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 110
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 106
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 44
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5899) & 0xFFFF;
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
      byte b1 = 24;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzmg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */