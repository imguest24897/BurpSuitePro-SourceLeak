package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

class Zlg {
  private final List<Zevy> Zp;
  
  private final Zet2 Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zlg(Zet2 paramZet2) {
    this.Zx = paramZet2;
    this.Zp = new ArrayList<>();
    Zz();
  }
  
  void Zz() {
    this.Zp.clear();
    Objects.requireNonNull(this.Zp);
    this.Zx.ZK().stream().filter(Ztnj::ZA).flatMap(this::lambda$updateCookies$0).forEach(this.Zp::add);
  }
  
  List<Zevy> Zp() {
    return this.Zp;
  }
  
  List<Zxeq> ZI(String paramString1, String paramString2) {
    this.Zp.add(new Zevy(paramString1, paramString2));
    return this.Zx.Zd(ZV());
  }
  
  List<Zxeq> Zw(int paramInt, String paramString1, String paramString2) {
    this.Zp.set(paramInt, new Zevy(paramString1, paramString2));
    return this.Zx.Zd(ZV());
  }
  
  List<Zxeq> ZM(List<Integer> paramList) {
    ArrayList<Integer> arrayList = new ArrayList<>(paramList);
    arrayList.sort(Comparator.reverseOrder());
    Iterator<Integer> iterator = arrayList.iterator();
    int[] arrayOfInt = Zb6u.ZI();
    while (iterator.hasNext()) {
      int i = ((Integer)iterator.next()).intValue();
      this.Zp.remove(i);
      if (arrayOfInt != null)
        break; 
    } 
    return this.Zx.Zd(ZV());
  }
  
  List<Zxeq> ZD(int paramInt1, int paramInt2) {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    Zevy zevy1 = (paramInt1 < paramInt2) ? this.Zp.get(paramInt1) : this.Zp.get(paramInt2);
    Zevy zevy2 = (paramInt1 < paramInt2) ? this.Zp.get(paramInt2) : this.Zp.get(paramInt1);
    this.Zp.set(i, zevy2);
    this.Zp.set(j, zevy1);
    return this.Zx.Zd(ZV());
  }
  
  private List<Zevy> Zr(String paramString) {
    // Byte code:
    //   0: invokestatic ZI : ()[I
    //   3: astore_2
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_3
    //   12: iconst_0
    //   13: istore #4
    //   15: aload_1
    //   16: invokevirtual length : ()I
    //   19: istore #5
    //   21: iload #4
    //   23: iload #5
    //   25: if_icmpge -> 295
    //   28: iload #4
    //   30: istore #6
    //   32: iconst_m1
    //   33: istore #7
    //   35: iload #4
    //   37: iload #5
    //   39: if_icmpge -> 93
    //   42: aload_1
    //   43: iload #4
    //   45: invokevirtual charAt : (I)C
    //   48: bipush #61
    //   50: if_icmpne -> 61
    //   53: iload #4
    //   55: istore #7
    //   57: aload_2
    //   58: ifnull -> 93
    //   61: aload_1
    //   62: iload #4
    //   64: invokevirtual charAt : (I)C
    //   67: bipush #32
    //   69: if_icmpge -> 86
    //   72: goto -> 79
    //   75: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   78: athrow
    //   79: goto -> 93
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: iinc #4, 1
    //   89: aload_2
    //   90: ifnull -> 35
    //   93: iload #7
    //   95: iconst_m1
    //   96: if_icmpeq -> 295
    //   99: iload #7
    //   101: iload #6
    //   103: if_icmpne -> 120
    //   106: goto -> 113
    //   109: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   112: athrow
    //   113: goto -> 295
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: iload #4
    //   122: iconst_1
    //   123: iadd
    //   124: istore #8
    //   126: iconst_m1
    //   127: istore #9
    //   129: iload #4
    //   131: iload #5
    //   133: if_icmpge -> 187
    //   136: aload_1
    //   137: iload #4
    //   139: invokevirtual charAt : (I)C
    //   142: bipush #59
    //   144: if_icmpeq -> 165
    //   147: aload_1
    //   148: iload #4
    //   150: invokevirtual charAt : (I)C
    //   153: bipush #32
    //   155: if_icmpge -> 173
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: iload #4
    //   167: istore #9
    //   169: aload_2
    //   170: ifnull -> 187
    //   173: iinc #4, 1
    //   176: aload_2
    //   177: ifnull -> 129
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: iload #9
    //   189: iconst_m1
    //   190: if_icmpne -> 197
    //   193: iload #5
    //   195: istore #9
    //   197: aload_3
    //   198: new burp/Zevy
    //   201: dup
    //   202: aload_1
    //   203: iload #6
    //   205: iload #7
    //   207: invokevirtual substring : (II)Ljava/lang/String;
    //   210: aload_1
    //   211: iload #8
    //   213: iload #9
    //   215: invokevirtual substring : (II)Ljava/lang/String;
    //   218: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   221: invokeinterface add : (Ljava/lang/Object;)Z
    //   226: pop
    //   227: iload #4
    //   229: iload #5
    //   231: if_icmpge -> 277
    //   234: aload_1
    //   235: iload #4
    //   237: invokevirtual charAt : (I)C
    //   240: bipush #32
    //   242: if_icmple -> 270
    //   245: aload_1
    //   246: iload #4
    //   248: invokevirtual charAt : (I)C
    //   251: bipush #59
    //   253: if_icmpeq -> 270
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   262: athrow
    //   263: goto -> 277
    //   266: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   269: athrow
    //   270: iinc #4, 1
    //   273: aload_2
    //   274: ifnull -> 227
    //   277: iload #4
    //   279: iload #5
    //   281: if_icmpne -> 291
    //   284: goto -> 295
    //   287: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   290: athrow
    //   291: aload_2
    //   292: ifnull -> 21
    //   295: goto -> 308
    //   298: astore #4
    //   300: aload #4
    //   302: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   305: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   308: aload_3
    //   309: areturn
    // Exception table:
    //   from	to	target	type
    //   12	295	298	java/lang/Exception
    //   57	72	75	java/lang/Exception
    //   61	82	82	java/lang/Exception
    //   93	106	109	java/lang/Exception
    //   99	116	116	java/lang/Exception
    //   136	158	161	java/lang/Exception
    //   169	180	183	java/lang/Exception
    //   234	256	259	java/lang/Exception
    //   245	266	266	java/lang/Exception
    //   277	287	287	java/lang/Exception
  }
  
  private String ZV() {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZI : ()[I
    //   11: iconst_0
    //   12: istore_3
    //   13: astore_1
    //   14: aload_0
    //   15: invokevirtual Zp : ()Ljava/util/List;
    //   18: invokeinterface iterator : ()Ljava/util/Iterator;
    //   23: astore #4
    //   25: aload #4
    //   27: invokeinterface hasNext : ()Z
    //   32: ifeq -> 116
    //   35: aload #4
    //   37: invokeinterface next : ()Ljava/lang/Object;
    //   42: checkcast burp/Zevy
    //   45: astore #5
    //   47: iload_3
    //   48: ifeq -> 69
    //   51: aload_2
    //   52: sipush #-15574
    //   55: sipush #-6152
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload_1
    //   66: ifnull -> 83
    //   69: aload_2
    //   70: sipush #-15573
    //   73: sipush #28461
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload_2
    //   84: aload #5
    //   86: invokevirtual Zp : ()Ljava/lang/String;
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: aload_2
    //   94: ldc '='
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload_2
    //   101: aload #5
    //   103: invokevirtual ZP : ()Ljava/lang/String;
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: pop
    //   110: iconst_1
    //   111: istore_3
    //   112: aload_1
    //   113: ifnull -> 25
    //   116: iload_3
    //   117: ifeq -> 127
    //   120: aload_2
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: goto -> 128
    //   127: aconst_null
    //   128: areturn
  }
  
  private Stream lambda$updateCookies$0(Ztnj paramZtnj) {
    return Zr(paramZtnj.Z_()).stream();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÏOÚÖKúþ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #105
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
    //   69: putstatic burp/Zlg.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zlg.b : [Ljava/lang/String;
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
    //   152: bipush #25
    //   154: goto -> 184
    //   157: bipush #119
    //   159: goto -> 184
    //   162: bipush #81
    //   164: goto -> 184
    //   167: bipush #112
    //   169: goto -> 184
    //   172: bipush #34
    //   174: goto -> 184
    //   177: bipush #57
    //   179: goto -> 184
    //   182: bipush #48
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
    int i = (paramInt1 ^ 0xFFFFC32B) & 0xFFFF;
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
      byte b1 = 97;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */