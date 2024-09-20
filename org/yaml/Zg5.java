package org.yaml;

public class Zg5 extends Zg7 {
  final Zt5 ZH;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zg5(Zt5 paramZt5) {}
  
  public Object ZF(Zi paramZi) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: aload_0
    //   4: getfield ZH : Lorg/yaml/Zt5;
    //   7: aload_1
    //   8: checkcast org/yaml/Zu
    //   11: invokevirtual ZN : (Lorg/yaml/Zu;)Ljava/lang/String;
    //   14: ldc '_'
    //   16: ldc ''
    //   18: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   21: astore_3
    //   22: istore_2
    //   23: aload_3
    //   24: invokevirtual isEmpty : ()Z
    //   27: ifeq -> 68
    //   30: new org/yaml/Zlh
    //   33: dup
    //   34: sipush #-26882
    //   37: sipush #8299
    //   40: invokestatic b : (II)Ljava/lang/String;
    //   43: aload_1
    //   44: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   47: sipush #-26881
    //   50: sipush #-11001
    //   53: invokestatic b : (II)Ljava/lang/String;
    //   56: aload_1
    //   57: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   60: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   63: athrow
    //   64: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   67: athrow
    //   68: iconst_1
    //   69: istore #4
    //   71: aload_3
    //   72: iconst_0
    //   73: invokevirtual charAt : (I)C
    //   76: istore #5
    //   78: iload #5
    //   80: bipush #45
    //   82: if_icmpne -> 98
    //   85: iconst_m1
    //   86: istore #4
    //   88: aload_3
    //   89: iconst_1
    //   90: invokevirtual substring : (I)Ljava/lang/String;
    //   93: astore_3
    //   94: iload_2
    //   95: ifeq -> 118
    //   98: iload #5
    //   100: bipush #43
    //   102: if_icmpne -> 118
    //   105: goto -> 112
    //   108: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   111: athrow
    //   112: aload_3
    //   113: iconst_1
    //   114: invokevirtual substring : (I)Ljava/lang/String;
    //   117: astore_3
    //   118: aload_3
    //   119: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   122: astore #6
    //   124: sipush #-26884
    //   127: sipush #13095
    //   130: invokestatic b : (II)Ljava/lang/String;
    //   133: aload #6
    //   135: invokevirtual equals : (Ljava/lang/Object;)Z
    //   138: ifeq -> 171
    //   141: iload #4
    //   143: iconst_m1
    //   144: if_icmpne -> 164
    //   147: goto -> 154
    //   150: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   153: athrow
    //   154: ldc2_w -Infinity
    //   157: goto -> 167
    //   160: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   163: athrow
    //   164: ldc2_w Infinity
    //   167: invokestatic valueOf : (D)Ljava/lang/Double;
    //   170: areturn
    //   171: sipush #-26883
    //   174: sipush #-11347
    //   177: invokestatic b : (II)Ljava/lang/String;
    //   180: aload #6
    //   182: invokevirtual equals : (Ljava/lang/Object;)Z
    //   185: ifeq -> 199
    //   188: ldc2_w NaN
    //   191: invokestatic valueOf : (D)Ljava/lang/Double;
    //   194: areturn
    //   195: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   198: athrow
    //   199: aload_3
    //   200: bipush #58
    //   202: invokevirtual indexOf : (I)I
    //   205: iconst_m1
    //   206: if_icmpeq -> 284
    //   209: aload_3
    //   210: ldc ':'
    //   212: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   215: astore #7
    //   217: iconst_1
    //   218: istore #8
    //   220: dconst_0
    //   221: dstore #9
    //   223: iconst_0
    //   224: istore #11
    //   226: aload #7
    //   228: arraylength
    //   229: istore #12
    //   231: iload #11
    //   233: iload #12
    //   235: if_icmpge -> 274
    //   238: dload #9
    //   240: aload #7
    //   242: iload #12
    //   244: iload #11
    //   246: isub
    //   247: iconst_1
    //   248: isub
    //   249: aaload
    //   250: invokestatic parseDouble : (Ljava/lang/String;)D
    //   253: iload #8
    //   255: i2d
    //   256: dmul
    //   257: dadd
    //   258: dstore #9
    //   260: iload #8
    //   262: bipush #60
    //   264: imul
    //   265: istore #8
    //   267: iinc #11, 1
    //   270: iload_2
    //   271: ifeq -> 231
    //   274: iload #4
    //   276: i2d
    //   277: dload #9
    //   279: dmul
    //   280: invokestatic valueOf : (D)Ljava/lang/Double;
    //   283: areturn
    //   284: aload_3
    //   285: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   288: astore #7
    //   290: aload #7
    //   292: invokevirtual doubleValue : ()D
    //   295: iload #4
    //   297: i2d
    //   298: dmul
    //   299: invokestatic valueOf : (D)Ljava/lang/Double;
    //   302: areturn
    // Exception table:
    //   from	to	target	type
    //   23	64	64	org/yaml/Zlh
    //   94	105	108	org/yaml/Zlh
    //   124	147	150	org/yaml/Zlh
    //   141	160	160	org/yaml/Zlh
    //   171	195	195	org/yaml/Zlh
  }
  
  private static Zlh a(Zlh paramZlh) {
    return paramZlh;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¨µ3Âq'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #88
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
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
    //   66: ldc '9#Ód]ª¬yú§:p©ÍÙ\\b·¦ÜKº¶@¤ÚN>Ùr'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #17
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #32
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic org/yaml/Zg5.c : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic org/yaml/Zg5.d : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #78
    //   210: goto -> 240
    //   213: bipush #53
    //   215: goto -> 240
    //   218: bipush #54
    //   220: goto -> 240
    //   223: bipush #13
    //   225: goto -> 240
    //   228: bipush #93
    //   230: goto -> 240
    //   233: bipush #33
    //   235: goto -> 240
    //   238: bipush #36
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF96FD) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 102;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zg5.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */