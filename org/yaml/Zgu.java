package org.yaml;

public class Zgu extends Zg7 {
  final Zt5 Zc;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zgu(Zt5 paramZt5) {}
  
  public Object ZF(Zi paramZi) {
    // Byte code:
    //   0: invokestatic Zy : ()I
    //   3: aload_0
    //   4: getfield Zc : Lorg/yaml/Zt5;
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
    //   34: sipush #15137
    //   37: sipush #15642
    //   40: invokestatic b : (II)Ljava/lang/String;
    //   43: aload_1
    //   44: invokevirtual ZP : ()Lorg/yaml/Zt1;
    //   47: sipush #15139
    //   50: sipush #18705
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
    //   95: ifne -> 118
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
    //   118: bipush #10
    //   120: istore #6
    //   122: ldc '0'
    //   124: aload_3
    //   125: invokevirtual equals : (Ljava/lang/Object;)Z
    //   128: ifeq -> 140
    //   131: iconst_0
    //   132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   135: areturn
    //   136: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   139: athrow
    //   140: aload_3
    //   141: sipush #15136
    //   144: sipush #-16839
    //   147: invokestatic b : (II)Ljava/lang/String;
    //   150: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   153: ifeq -> 169
    //   156: aload_3
    //   157: iconst_2
    //   158: invokevirtual substring : (I)Ljava/lang/String;
    //   161: astore_3
    //   162: iconst_2
    //   163: istore #6
    //   165: iload_2
    //   166: ifne -> 350
    //   169: aload_3
    //   170: sipush #15138
    //   173: sipush #10242
    //   176: invokestatic b : (II)Ljava/lang/String;
    //   179: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   182: ifeq -> 206
    //   185: goto -> 192
    //   188: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   191: athrow
    //   192: aload_3
    //   193: iconst_2
    //   194: invokevirtual substring : (I)Ljava/lang/String;
    //   197: astore_3
    //   198: bipush #16
    //   200: istore #6
    //   202: iload_2
    //   203: ifne -> 350
    //   206: aload_3
    //   207: ldc '0'
    //   209: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   212: ifeq -> 236
    //   215: goto -> 222
    //   218: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   221: athrow
    //   222: aload_3
    //   223: iconst_1
    //   224: invokevirtual substring : (I)Ljava/lang/String;
    //   227: astore_3
    //   228: bipush #8
    //   230: istore #6
    //   232: iload_2
    //   233: ifne -> 350
    //   236: aload_3
    //   237: bipush #58
    //   239: invokevirtual indexOf : (I)I
    //   242: iconst_m1
    //   243: if_icmpeq -> 337
    //   246: goto -> 253
    //   249: invokestatic a : (Lorg/yaml/Zlh;)Lorg/yaml/Zlh;
    //   252: athrow
    //   253: aload_3
    //   254: ldc ':'
    //   256: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   259: astore #7
    //   261: iconst_1
    //   262: istore #8
    //   264: iconst_0
    //   265: istore #9
    //   267: iconst_0
    //   268: istore #10
    //   270: aload #7
    //   272: arraylength
    //   273: istore #11
    //   275: iload #10
    //   277: iload #11
    //   279: if_icmpge -> 320
    //   282: iload #9
    //   284: i2l
    //   285: aload #7
    //   287: iload #11
    //   289: iload #10
    //   291: isub
    //   292: iconst_1
    //   293: isub
    //   294: aaload
    //   295: invokestatic parseLong : (Ljava/lang/String;)J
    //   298: iload #8
    //   300: i2l
    //   301: lmul
    //   302: ladd
    //   303: l2i
    //   304: istore #9
    //   306: iload #8
    //   308: bipush #60
    //   310: imul
    //   311: istore #8
    //   313: iinc #10, 1
    //   316: iload_2
    //   317: ifne -> 275
    //   320: aload_0
    //   321: getfield Zc : Lorg/yaml/Zt5;
    //   324: iload #4
    //   326: iload #9
    //   328: invokestatic valueOf : (I)Ljava/lang/String;
    //   331: bipush #10
    //   333: invokestatic Zh : (Lorg/yaml/Zt5;ILjava/lang/String;I)Ljava/lang/Number;
    //   336: areturn
    //   337: aload_0
    //   338: getfield Zc : Lorg/yaml/Zt5;
    //   341: iload #4
    //   343: aload_3
    //   344: bipush #10
    //   346: invokestatic Zh : (Lorg/yaml/Zt5;ILjava/lang/String;I)Ljava/lang/Number;
    //   349: areturn
    //   350: aload_0
    //   351: getfield Zc : Lorg/yaml/Zt5;
    //   354: iload #4
    //   356: aload_3
    //   357: iload #6
    //   359: invokestatic Zh : (Lorg/yaml/Zt5;ILjava/lang/String;I)Ljava/lang/Number;
    //   362: areturn
    // Exception table:
    //   from	to	target	type
    //   23	64	64	org/yaml/Zlh
    //   94	105	108	org/yaml/Zlh
    //   122	136	136	org/yaml/Zlh
    //   165	185	188	org/yaml/Zlh
    //   202	215	218	org/yaml/Zlh
    //   232	246	249	org/yaml/Zlh
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
    //   8: ldc '­8å¶FæR ²|çïåîÒ°ewv½~z'
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
    //   66: ldc 'D$ÍNÔ6np¥\\búGyÃÆN'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_2
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #31
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
    //   126: putstatic org/yaml/Zgu.c : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic org/yaml/Zgu.d : [Ljava/lang/String;
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
    //   208: bipush #72
    //   210: goto -> 240
    //   213: bipush #10
    //   215: goto -> 240
    //   218: bipush #71
    //   220: goto -> 240
    //   223: bipush #8
    //   225: goto -> 240
    //   228: bipush #53
    //   230: goto -> 240
    //   233: bipush #90
    //   235: goto -> 240
    //   238: bipush #57
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
    //   296: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3B20) & 0xFFFF;
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
      byte b1 = 50;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zgu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */