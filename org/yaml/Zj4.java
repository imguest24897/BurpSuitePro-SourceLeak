package org.yaml;

import burp.Zbqc;

public class Zj4 extends Zj3 {
  private static final long serialVersionUID = -9119388488683035101L;
  
  private final String Zp;
  
  private final Zt1 ZJ;
  
  private final String Zn;
  
  private final Zt1 ZA;
  
  private final String ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zj4(String paramString1, Zt1 paramZt11, String paramString2, Zt1 paramZt12, String paramString3) {
    this(paramString1, paramZt11, paramString2, paramZt12, paramString3, null);
  }
  
  protected Zj4(String paramString1, Zt1 paramZt11, String paramString2, Zt1 paramZt12, String paramString3, Throwable paramThrowable) {
    super(paramString1 + a(-4967, 15259) + paramString2 + a(-4968, -6888) + paramZt12, paramThrowable);
    this.Zp = paramString1;
    this.ZJ = paramZt11;
    this.Zn = paramString2;
    this.ZA = paramZt12;
    int i = Zj3.Zb();
    try {
      this.ZW = paramString3;
      if (Zbqc.Zwu() == null)
        Zj3.ZA(++i); 
    } catch (Zj4 zj4) {
      throw a(null);
    } 
  }
  
  protected Zj4(String paramString1, Zt1 paramZt11, String paramString2, Zt1 paramZt12) {
    this(paramString1, paramZt11, paramString2, paramZt12, null, null);
  }
  
  protected Zj4(String paramString1, Zt1 paramZt11, String paramString2, Zt1 paramZt12, Throwable paramThrowable) {
    this(paramString1, paramZt11, paramString2, paramZt12, null, paramThrowable);
  }
  
  public String getMessage() {
    return toString();
  }
  
  public String toString() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: getfield Zp : Ljava/lang/String;
    //   12: ifnull -> 38
    //   15: aload_1
    //   16: aload_0
    //   17: getfield Zp : Ljava/lang/String;
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_1
    //   25: ldc '\\n'
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: goto -> 38
    //   34: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   37: athrow
    //   38: aload_0
    //   39: getfield ZJ : Lorg/yaml/Zt1;
    //   42: ifnull -> 171
    //   45: aload_0
    //   46: getfield Zn : Ljava/lang/String;
    //   49: ifnull -> 148
    //   52: goto -> 59
    //   55: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   58: athrow
    //   59: aload_0
    //   60: getfield ZA : Lorg/yaml/Zt1;
    //   63: ifnull -> 148
    //   66: goto -> 73
    //   69: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   72: athrow
    //   73: aload_0
    //   74: getfield ZJ : Lorg/yaml/Zt1;
    //   77: invokevirtual ZX : ()Ljava/lang/String;
    //   80: aload_0
    //   81: getfield ZA : Lorg/yaml/Zt1;
    //   84: invokevirtual ZX : ()Ljava/lang/String;
    //   87: invokevirtual equals : (Ljava/lang/Object;)Z
    //   90: ifne -> 148
    //   93: goto -> 100
    //   96: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   99: athrow
    //   100: aload_0
    //   101: getfield ZJ : Lorg/yaml/Zt1;
    //   104: invokevirtual ZF : ()I
    //   107: aload_0
    //   108: getfield ZA : Lorg/yaml/Zt1;
    //   111: invokevirtual ZF : ()I
    //   114: if_icmpne -> 148
    //   117: goto -> 124
    //   120: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   123: athrow
    //   124: aload_0
    //   125: getfield ZJ : Lorg/yaml/Zt1;
    //   128: invokevirtual Zt : ()I
    //   131: aload_0
    //   132: getfield ZA : Lorg/yaml/Zt1;
    //   135: invokevirtual Zt : ()I
    //   138: if_icmpeq -> 171
    //   141: goto -> 148
    //   144: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   147: athrow
    //   148: aload_1
    //   149: aload_0
    //   150: getfield ZJ : Lorg/yaml/Zt1;
    //   153: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_1
    //   158: ldc '\\n'
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: goto -> 171
    //   167: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   170: athrow
    //   171: aload_0
    //   172: getfield Zn : Ljava/lang/String;
    //   175: ifnull -> 201
    //   178: aload_1
    //   179: aload_0
    //   180: getfield Zn : Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_1
    //   188: ldc '\\n'
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: goto -> 201
    //   197: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   200: athrow
    //   201: aload_0
    //   202: getfield ZA : Lorg/yaml/Zt1;
    //   205: ifnull -> 231
    //   208: aload_1
    //   209: aload_0
    //   210: getfield ZA : Lorg/yaml/Zt1;
    //   213: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload_1
    //   218: ldc '\\n'
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: goto -> 231
    //   227: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   230: athrow
    //   231: aload_0
    //   232: getfield ZW : Ljava/lang/String;
    //   235: ifnull -> 261
    //   238: aload_1
    //   239: aload_0
    //   240: getfield ZW : Ljava/lang/String;
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload_1
    //   248: ldc '\\n'
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: goto -> 261
    //   257: invokestatic a : (Lorg/yaml/Zj4;)Lorg/yaml/Zj4;
    //   260: athrow
    //   261: aload_1
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: areturn
    // Exception table:
    //   from	to	target	type
    //   8	31	34	org/yaml/Zj4
    //   38	52	55	org/yaml/Zj4
    //   45	66	69	org/yaml/Zj4
    //   59	93	96	org/yaml/Zj4
    //   73	117	120	org/yaml/Zj4
    //   100	141	144	org/yaml/Zj4
    //   124	164	167	org/yaml/Zj4
    //   171	194	197	org/yaml/Zj4
    //   201	224	227	org/yaml/Zj4
    //   231	254	257	org/yaml/Zj4
  }
  
  public String Zk() {
    return this.Zn;
  }
  
  private static Zj4 a(Zj4 paramZj4) {
    return paramZj4;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Àë9¥'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #95
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
    //   68: putstatic org/yaml/Zj4.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic org/yaml/Zj4.b : [Ljava/lang/String;
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
    //   152: bipush #105
    //   154: goto -> 184
    //   157: bipush #14
    //   159: goto -> 184
    //   162: bipush #52
    //   164: goto -> 184
    //   167: bipush #15
    //   169: goto -> 184
    //   172: bipush #52
    //   174: goto -> 184
    //   177: bipush #53
    //   179: goto -> 184
    //   182: bipush #62
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
    int i = (paramInt1 ^ 0xFFFFEC98) & 0xFFFF;
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
      byte b1 = 90;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zj4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */