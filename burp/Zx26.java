package burp;

import java.nio.LongBuffer;
import java.util.Arrays;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zx26<T extends Zgpi> extends Zxsr implements Zrte<T> {
  private final Zeu4<T> Zk;
  
  private final int ZF;
  
  private final LongBuffer ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zx26(Zkit paramZkit, Zeu4<T> paramZeu4, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zk = paramZeu4;
    this.ZF = paramInt;
    this.ZH = paramZso4.Z_();
  }
  
  public Zeu4<Zrte<T>> ZF() {
    return new Zguz<>(this.Zk);
  }
  
  public int Zpu() {
    return this.ZF;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZW(this);
  }
  
  public void ZE(Zrte<T> paramZrte) {
    boolean bool = Zguz.ZU();
    try {
      if (paramZrte.Zpu() < Zpu())
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramZrte instanceof Zx26)) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zx26 zx26 = (Zx26)paramZrte;
    try {
      if (this.Za != zx26.ZPz()) {
        Zuh.Zb(false, Zqf.Zk);
        throw new IllegalArgumentException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    LongBuffer longBuffer = zx26.ZH;
    try {
      longBuffer.duplicate().put(this.ZH.duplicate());
      if (!bool)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public T[] ZbF() {
    Zllo<T> zllo = this.Zk.ZI();
    T[] arrayOfT = zllo.ZF(this.ZF);
    boolean bool = Zguz.ZU();
    byte b = 0;
    while (b < this.ZF) {
      long l = this.ZH.get(b);
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      arrayOfT[b] = (l == 0L) ? null : this.Za.<T>Zo(l, this.Zk);
      b++;
      if (!bool)
        break; 
    } 
    return arrayOfT;
  }
  
  public Zrte<T> ZP(T[] paramArrayOfT) {
    boolean bool = Zguz.ZU();
    try {
      if (paramArrayOfT.length != this.ZF)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < this.ZF) {
      this.ZH.put(b, this.Za.ZY((Zgpi)paramArrayOfT[b]));
      b++;
      if (!bool)
        break; 
    } 
    return this;
  }
  
  public T ZdF(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZF) {
            long l = this.ZH.get(paramInt);
            try {
              if (l == 0L)
                return null; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return this.Za.Zo(l, this.Zk);
          } 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZU(int paramInt, T paramT) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZF) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            long l = (paramT == null) ? 0L : this.Za.ZY((Zgpi)paramT);
            this.ZH.put(paramInt, l);
            return;
          } 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public String toString() {
    // Byte code:
    //   0: invokestatic ZU : ()Z
    //   3: new java/lang/StringBuffer
    //   6: dup
    //   7: ldc '['
    //   9: invokespecial <init> : (Ljava/lang/String;)V
    //   12: astore_2
    //   13: istore_1
    //   14: iconst_0
    //   15: istore_3
    //   16: iload_3
    //   17: aload_0
    //   18: getfield ZF : I
    //   21: if_icmpge -> 117
    //   24: aload_0
    //   25: getfield ZH : Ljava/nio/LongBuffer;
    //   28: iload_3
    //   29: invokevirtual get : (I)J
    //   32: lstore #4
    //   34: lload #4
    //   36: lconst_0
    //   37: lcmp
    //   38: ifne -> 66
    //   41: aload_2
    //   42: sipush #-11887
    //   45: sipush #13145
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   54: pop
    //   55: iload_1
    //   56: ifne -> 110
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   65: athrow
    //   66: aload_2
    //   67: aload_0
    //   68: getfield Za : Lburp/Zkit;
    //   71: lload #4
    //   73: aload_0
    //   74: getfield Zk : Lburp/Zeu4;
    //   77: invokevirtual Zo : (JLburp/Zeu4;)Lburp/Zgpi;
    //   80: invokeinterface toString : ()Ljava/lang/String;
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   88: pop
    //   89: aload_2
    //   90: sipush #-11888
    //   93: sipush #-32573
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   102: pop
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   109: athrow
    //   110: iinc #3, 1
    //   113: iload_1
    //   114: ifne -> 16
    //   117: aload_2
    //   118: ldc ']'
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   123: pop
    //   124: aload_2
    //   125: invokevirtual toString : ()Ljava/lang/String;
    //   128: areturn
    // Exception table:
    //   from	to	target	type
    //   34	59	62	java/lang/IllegalArgumentException
    //   41	103	106	java/lang/IllegalArgumentException
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (ZF(paramObject))
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Zrte))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zrte<Object> zrte = (Zrte)paramObject;
    return Arrays.equals((Object[])ZbF(), zrte.ZbF());
  }
  
  public int hashCode() {
    return Arrays.hashCode((Object[])ZbF());
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
    //   8: ldc '°^É|ßL'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #15
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
    //   69: putstatic burp/Zx26.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zx26.b : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #96
    //   154: goto -> 184
    //   157: bipush #58
    //   159: goto -> 184
    //   162: bipush #94
    //   164: goto -> 184
    //   167: bipush #86
    //   169: goto -> 184
    //   172: bipush #19
    //   174: goto -> 184
    //   177: bipush #82
    //   179: goto -> 184
    //   182: bipush #37
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
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
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD191) & 0xFFFF;
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
      byte b1 = 2;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx26.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */