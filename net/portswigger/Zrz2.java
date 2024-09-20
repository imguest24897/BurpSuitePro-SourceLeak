package net.portswigger;

import java.util.Objects;
import java.util.function.Function;

class Zrz2 extends Zrzi {
  private final Number Zt;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zrz2(Number paramNumber) {
    this.Zt = paramNumber;
  }
  
  public Number Zk() {
    return this.Zt;
  }
  
  public Number Zw(Number paramNumber) {
    return this.Zt;
  }
  
  public boolean Zb() {
    return true;
  }
  
  public Zzo ZV() {
    return this;
  }
  
  public <T> T Zv(Function<Zrmq, T> paramFunction, T paramT) {
    return paramFunction.apply(this);
  }
  
  protected void ZC(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Za1 paramZa1) {
    // Byte code:
    //   0: invokestatic ZP : ()Z
    //   3: istore #7
    //   5: iload_3
    //   6: ifne -> 185
    //   9: aload_0
    //   10: getfield Zt : Ljava/lang/Number;
    //   13: instanceof java/lang/Double
    //   16: ifeq -> 100
    //   19: goto -> 26
    //   22: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   25: athrow
    //   26: aload_0
    //   27: getfield Zt : Ljava/lang/Number;
    //   30: invokevirtual doubleValue : ()D
    //   33: invokestatic isNaN : (D)Z
    //   36: ifeq -> 67
    //   39: goto -> 46
    //   42: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   45: athrow
    //   46: new net/portswigger/Zes
    //   49: dup
    //   50: sipush #-28865
    //   53: sipush #-27263
    //   56: invokestatic b : (II)Ljava/lang/String;
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: athrow
    //   63: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   66: athrow
    //   67: aload_0
    //   68: getfield Zt : Ljava/lang/Number;
    //   71: invokevirtual doubleValue : ()D
    //   74: invokestatic isInfinite : (D)Z
    //   77: ifeq -> 185
    //   80: new net/portswigger/Zes
    //   83: dup
    //   84: sipush #-28868
    //   87: bipush #-121
    //   89: invokestatic b : (II)Ljava/lang/String;
    //   92: invokespecial <init> : (Ljava/lang/String;)V
    //   95: athrow
    //   96: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   99: athrow
    //   100: aload_0
    //   101: getfield Zt : Ljava/lang/Number;
    //   104: instanceof java/lang/Float
    //   107: ifeq -> 185
    //   110: aload_0
    //   111: getfield Zt : Ljava/lang/Number;
    //   114: invokevirtual floatValue : ()F
    //   117: invokestatic isNaN : (F)Z
    //   120: ifeq -> 151
    //   123: goto -> 130
    //   126: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   129: athrow
    //   130: new net/portswigger/Zes
    //   133: dup
    //   134: sipush #-28869
    //   137: sipush #6132
    //   140: invokestatic b : (II)Ljava/lang/String;
    //   143: invokespecial <init> : (Ljava/lang/String;)V
    //   146: athrow
    //   147: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   150: athrow
    //   151: aload_0
    //   152: getfield Zt : Ljava/lang/Number;
    //   155: invokevirtual floatValue : ()F
    //   158: invokestatic isInfinite : (F)Z
    //   161: ifeq -> 185
    //   164: new net/portswigger/Zes
    //   167: dup
    //   168: sipush #-28866
    //   171: sipush #-23563
    //   174: invokestatic b : (II)Ljava/lang/String;
    //   177: invokespecial <init> : (Ljava/lang/String;)V
    //   180: athrow
    //   181: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   184: athrow
    //   185: aload_0
    //   186: getfield Zt : Ljava/lang/Number;
    //   189: instanceof java/lang/Double
    //   192: ifeq -> 284
    //   195: aload_0
    //   196: getfield Zt : Ljava/lang/Number;
    //   199: invokevirtual doubleValue : ()D
    //   202: ldc2_w -9.007199254740991E15
    //   205: dcmpl
    //   206: iflt -> 284
    //   209: goto -> 216
    //   212: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   215: athrow
    //   216: aload_0
    //   217: getfield Zt : Ljava/lang/Number;
    //   220: invokevirtual doubleValue : ()D
    //   223: ldc2_w 9.007199254740991E15
    //   226: dcmpg
    //   227: ifgt -> 284
    //   230: goto -> 237
    //   233: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   236: athrow
    //   237: aload_0
    //   238: getfield Zt : Ljava/lang/Number;
    //   241: invokevirtual doubleValue : ()D
    //   244: invokestatic Zf : (D)Z
    //   247: ifeq -> 284
    //   250: goto -> 257
    //   253: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   256: athrow
    //   257: aload #6
    //   259: aload_0
    //   260: getfield Zt : Ljava/lang/Number;
    //   263: invokevirtual longValue : ()J
    //   266: invokeinterface Zk : (J)Lnet/portswigger/Za1;
    //   271: pop
    //   272: iload #7
    //   274: ifeq -> 410
    //   277: goto -> 284
    //   280: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   283: athrow
    //   284: aload_0
    //   285: getfield Zt : Ljava/lang/Number;
    //   288: instanceof java/lang/Float
    //   291: ifeq -> 388
    //   294: goto -> 301
    //   297: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   300: athrow
    //   301: aload_0
    //   302: getfield Zt : Ljava/lang/Number;
    //   305: invokevirtual floatValue : ()F
    //   308: ldc -9.007199E15
    //   310: fcmpl
    //   311: iflt -> 388
    //   314: goto -> 321
    //   317: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   320: athrow
    //   321: aload_0
    //   322: getfield Zt : Ljava/lang/Number;
    //   325: invokevirtual floatValue : ()F
    //   328: ldc 9.007199E15
    //   330: fcmpg
    //   331: ifgt -> 388
    //   334: goto -> 341
    //   337: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   340: athrow
    //   341: aload_0
    //   342: getfield Zt : Ljava/lang/Number;
    //   345: invokevirtual floatValue : ()F
    //   348: invokestatic ZH : (F)Z
    //   351: ifeq -> 388
    //   354: goto -> 361
    //   357: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   360: athrow
    //   361: aload #6
    //   363: aload_0
    //   364: getfield Zt : Ljava/lang/Number;
    //   367: invokevirtual longValue : ()J
    //   370: invokeinterface Zk : (J)Lnet/portswigger/Za1;
    //   375: pop
    //   376: iload #7
    //   378: ifeq -> 410
    //   381: goto -> 388
    //   384: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   387: athrow
    //   388: aload #6
    //   390: aload_0
    //   391: getfield Zt : Ljava/lang/Number;
    //   394: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   397: invokeinterface Z_ : (Ljava/lang/String;)Lnet/portswigger/Za1;
    //   402: pop
    //   403: goto -> 410
    //   406: invokestatic a : (Lnet/portswigger/Zes;)Lnet/portswigger/Zes;
    //   409: athrow
    //   410: aload #6
    //   412: iconst_0
    //   413: aload_0
    //   414: getfield ZU : Ljava/lang/String;
    //   417: iload #4
    //   419: iload #5
    //   421: iload_1
    //   422: iload_2
    //   423: invokestatic Zt : (Lnet/portswigger/Za1;ZLjava/lang/String;ZZII)V
    //   426: return
    // Exception table:
    //   from	to	target	type
    //   5	19	22	net/portswigger/Zes
    //   9	39	42	net/portswigger/Zes
    //   26	63	63	net/portswigger/Zes
    //   67	96	96	net/portswigger/Zes
    //   100	123	126	net/portswigger/Zes
    //   110	147	147	net/portswigger/Zes
    //   151	181	181	net/portswigger/Zes
    //   185	209	212	net/portswigger/Zes
    //   195	230	233	net/portswigger/Zes
    //   216	250	253	net/portswigger/Zes
    //   237	277	280	net/portswigger/Zes
    //   257	294	297	net/portswigger/Zes
    //   284	314	317	net/portswigger/Zes
    //   301	334	337	net/portswigger/Zes
    //   321	354	357	net/portswigger/Zes
    //   341	381	384	net/portswigger/Zes
    //   361	403	406	net/portswigger/Zes
  }
  
  protected String Zg() {
    return b(-28867, -1214);
  }
  
  private static boolean Zf(double paramDouble) {
    try {
      if (paramDouble == Math.floor(paramDouble))
        try {
          if (!Double.isInfinite(paramDouble))
            try {
              if (!Double.isNaN(paramDouble));
            } catch (Zes zes) {
              throw a(null);
            }  
        } catch (Zes zes) {
          throw a(null);
        }  
    } catch (Zes zes) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean ZH(float paramFloat) {
    try {
      if (paramFloat == Math.floor(paramFloat))
        try {
          if (!Float.isInfinite(paramFloat))
            try {
              if (!Float.isNaN(paramFloat));
            } catch (Zes zes) {
              throw a(null);
            }  
        } catch (Zes zes) {
          throw a(null);
        }  
    } catch (Zes zes) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (Zes zes) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zrz2 zrz2 = (Zrz2)paramObject;
            try {
            
            } catch (Zes zes) {
              throw a(null);
            } 
            return (this.Zt.doubleValue() == zrz2.Zt.doubleValue());
          } 
          return false;
        } catch (Zes zes) {
          throw a(null);
        }  
    } catch (Zes zes) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.Zt });
  }
  
  public Zrmq Z_() {
    return Zv3.ZM(this.Zt).Zi(this.ZU);
  }
  
  private static Zes a(Zes paramZes) {
    return paramZes;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '²Äuªçç¾íÁXÝ«à,W®ßìº±ÞÓ6åÃ¥¥6À_Y4_êÈwXÊvï#QÝô´'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #21
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #40
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc '­2R³#NV­ÌÂBK¯Ã²çWV!@V0Qnúwÿ=%,È5/TZ±pH;;¦ÿ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #29
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #124
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/Zrz2.c : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/Zrz2.d : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #43
    //   214: goto -> 243
    //   217: bipush #11
    //   219: goto -> 243
    //   222: bipush #119
    //   224: goto -> 243
    //   227: iconst_2
    //   228: goto -> 243
    //   231: bipush #32
    //   233: goto -> 243
    //   236: bipush #62
    //   238: goto -> 243
    //   241: bipush #24
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8F3F) & 0xFFFF;
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
      char c = 'ð';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrz2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */