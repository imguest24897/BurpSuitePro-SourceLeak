package burp;

import burp.api.montoya.utilities.json.JsonNode;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

final class Zggv extends Zgg7 {
  private static final Integer ZT;
  
  private final int Zo;
  
  private final boolean ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zggv(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zj : ()I
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: istore_3
    //   8: sipush #4539
    //   11: sipush #19546
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: aload_1
    //   18: invokevirtual equals : (Ljava/lang/Object;)Z
    //   21: ifeq -> 45
    //   24: aload_0
    //   25: getstatic burp/Zggv.ZT : Ljava/lang/Integer;
    //   28: invokevirtual intValue : ()I
    //   31: putfield Zo : I
    //   34: iload_3
    //   35: ifne -> 98
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   44: athrow
    //   45: aload_0
    //   46: aload_1
    //   47: iconst_1
    //   48: aload_1
    //   49: invokevirtual length : ()I
    //   52: iconst_1
    //   53: isub
    //   54: invokevirtual substring : (II)Ljava/lang/String;
    //   57: invokestatic parseInt : (Ljava/lang/String;)I
    //   60: putfield Zo : I
    //   63: aload_0
    //   64: getfield Zo : I
    //   67: ifge -> 98
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   76: athrow
    //   77: new java/lang/IllegalStateException
    //   80: dup
    //   81: sipush #4543
    //   84: sipush #14693
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: invokespecial <init> : (Ljava/lang/String;)V
    //   93: athrow
    //   94: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   97: athrow
    //   98: aload_0
    //   99: iload_2
    //   100: putfield ZN : Z
    //   103: return
    // Exception table:
    //   from	to	target	type
    //   8	38	41	java/lang/IllegalStateException
    //   24	70	73	java/lang/IllegalStateException
    //   45	94	94	java/lang/IllegalStateException
  }
  
  Optional<JsonNode> Zj(JsonNode paramJsonNode, Zslp paramZslp) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic of : (Ljava/lang/Object;)Ljava/util/Optional;
    //   4: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   9: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   12: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   17: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   20: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   25: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   28: aload_0
    //   29: <illegal opcode> test : (Lburp/Zggv;)Ljava/util/function/Predicate;
    //   34: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   37: astore_3
    //   38: aload_0
    //   39: getfield ZN : Z
    //   42: ifne -> 60
    //   45: aload_3
    //   46: aload_0
    //   47: <illegal opcode> apply : (Lburp/Zggv;)Ljava/util/function/Function;
    //   52: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   55: areturn
    //   56: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   59: athrow
    //   60: aload_3
    //   61: aload_0
    //   62: aload_2
    //   63: <illegal opcode> apply : (Lburp/Zggv;Lburp/Zslp;)Ljava/util/function/Function;
    //   68: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   71: areturn
    // Exception table:
    //   from	to	target	type
    //   38	56	56	java/lang/IllegalStateException
  }
  
  private boolean ZI() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Zd() <= ZT.intValue());
  }
  
  public int Zd() {
    return this.Zo;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (paramObject.getClass() == getClass()) {
            Zggv zggv = (Zggv)paramObject;
            try {
            
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return (this.Zo == zggv.Zo);
          } 
          return false;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { Integer.valueOf(this.Zo) });
  }
  
  public String toString() {
    return a(4542, -28293) + a(4542, -28293) + this.Zo;
  }
  
  private JsonNode lambda$findOrApply$7(Zslp paramZslp, List paramList) {
    // Byte code:
    //   0: getstatic burp/Zt2d.ZK : [I
    //   3: aload_1
    //   4: invokevirtual ZE : ()Lburp/Zlkj;
    //   7: invokevirtual ordinal : ()I
    //   10: iaload
    //   11: tableswitch default -> 40, 1 -> 54, 2 -> 82, 3 -> 121, 4 -> 149
    //   40: new java/lang/MatchException
    //   43: dup
    //   44: aconst_null
    //   45: aconst_null
    //   46: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   49: athrow
    //   50: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual ZL : ()Ljava/util/Optional;
    //   58: aload_0
    //   59: aload_2
    //   60: <illegal opcode> apply : (Lburp/Zggv;Ljava/util/List;)Ljava/util/function/Function;
    //   65: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   68: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   73: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   76: checkcast burp/api/montoya/utilities/json/JsonNode
    //   79: goto -> 185
    //   82: aload_0
    //   83: invokevirtual ZI : ()Z
    //   86: ifeq -> 105
    //   89: aload_2
    //   90: invokeinterface getLast : ()Ljava/lang/Object;
    //   95: checkcast burp/api/montoya/utilities/json/JsonNode
    //   98: goto -> 185
    //   101: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   104: athrow
    //   105: aload_2
    //   106: aload_0
    //   107: invokevirtual Zd : ()I
    //   110: invokeinterface get : (I)Ljava/lang/Object;
    //   115: checkcast burp/api/montoya/utilities/json/JsonNode
    //   118: goto -> 185
    //   121: aload_1
    //   122: invokevirtual ZL : ()Ljava/util/Optional;
    //   125: aload_0
    //   126: aload_2
    //   127: <illegal opcode> apply : (Lburp/Zggv;Ljava/util/List;)Ljava/util/function/Function;
    //   132: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   135: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   140: invokevirtual orElseThrow : (Ljava/util/function/Supplier;)Ljava/lang/Object;
    //   143: checkcast burp/api/montoya/utilities/json/JsonNode
    //   146: goto -> 185
    //   149: aload_0
    //   150: invokevirtual ZI : ()Z
    //   153: ifeq -> 172
    //   156: aload_2
    //   157: invokeinterface removeLast : ()Ljava/lang/Object;
    //   162: checkcast burp/api/montoya/utilities/json/JsonNode
    //   165: goto -> 185
    //   168: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   171: athrow
    //   172: aload_2
    //   173: aload_0
    //   174: invokevirtual Zd : ()I
    //   177: invokeinterface remove : (I)Ljava/lang/Object;
    //   182: checkcast burp/api/montoya/utilities/json/JsonNode
    //   185: areturn
    // Exception table:
    //   from	to	target	type
    //   0	50	50	java/lang/IllegalStateException
    //   82	101	101	java/lang/IllegalStateException
    //   149	168	168	java/lang/IllegalStateException
  }
  
  private static IllegalStateException lambda$findOrApply$6() {
    return new IllegalStateException(a(4540, 29644));
  }
  
  private JsonNode lambda$findOrApply$5(List<JsonNode> paramList, JsonNode paramJsonNode) {
    try {
      if (ZI())
        return paramList.set(paramList.size() - 1, paramJsonNode); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramList.set(Zd(), paramJsonNode);
  }
  
  private static IllegalStateException lambda$findOrApply$4() {
    return new IllegalStateException(a(4541, 31711));
  }
  
  private JsonNode lambda$findOrApply$3(List<JsonNode> paramList, JsonNode paramJsonNode) {
    int i = Zmdq.ZW();
    try {
      if (ZI()) {
        try {
          paramList.add(paramJsonNode);
          if (i != 0) {
            paramList.add(Zd(), paramJsonNode);
            return paramJsonNode;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return paramJsonNode;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    paramList.add(Zd(), paramJsonNode);
    return paramJsonNode;
  }
  
  private JsonNode lambda$findOrApply$2(List<JsonNode> paramList) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return ZI() ? paramList.getLast() : paramList.get(Zd());
  }
  
  private boolean lambda$findOrApply$1(List paramList) {
    try {
      if (!ZI()) {
        try {
          if (paramList.size() > Zd())
            try {
              if (Zd() >= 0);
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private static List lambda$findOrApply$0(Object paramObject) {
    return (List)paramObject;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc ' µá¾Å²øC#vöDVçZ¶E8¨?¸=%BH?§sÐ¦KÓ¥r|ÏAí:ÀUÜ>w&t¡Ìà¦\\fÀªØc^\\fÌùQ(oÒ<®àdQ4BÀ¥tÁoÛay&GÇãîÆÑ¥.u§7AP'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #64
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #11
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 140
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
    //   67: ldc ',i.m¼/N4Ê¥È3=ÉÙôþù,ð²ygº.µÂ'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #40
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: iconst_5
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
    //   122: goto -> 81
    //   125: aload #5
    //   127: putstatic burp/Zggv.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zggv.b : [Ljava/lang/String;
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
    //   208: bipush #94
    //   210: goto -> 240
    //   213: bipush #61
    //   215: goto -> 240
    //   218: bipush #101
    //   220: goto -> 240
    //   223: bipush #61
    //   225: goto -> 240
    //   228: bipush #19
    //   230: goto -> 240
    //   233: bipush #47
    //   235: goto -> 240
    //   238: bipush #80
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
    //   279: tableswitch default -> 39, 0 -> 97
    //   296: iconst_m1
    //   297: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   300: putstatic burp/Zggv.ZT : Ljava/lang/Integer;
    //   303: return
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x11BF) & 0xFFFF;
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
      char c = 'Ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */