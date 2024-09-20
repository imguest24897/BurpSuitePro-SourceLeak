package net.portswigger;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapi4j.Zp9;
import org.openapi4j.Zpo;

public class Zrxx {
  private final Zp9 ZQ;
  
  private final URL Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrxx(Zp9 paramZp9, URL paramURL) {
    this.ZQ = paramZp9;
    this.Zj = paramURL;
  }
  
  public Zrmf Zp() {
    // Byte code:
    //   0: new net/portswigger/Zqa
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: new net/portswigger/Zf3
    //   11: dup
    //   12: aload_0
    //   13: invokevirtual Zd : ()Ljava/lang/String;
    //   16: invokespecial <init> : (Ljava/lang/String;)V
    //   19: invokevirtual ZU : ()Ljava/util/Map;
    //   22: astore_2
    //   23: aload_0
    //   24: aload_2
    //   25: invokevirtual ZA : (Ljava/util/Map;)V
    //   28: aload_2
    //   29: aload_0
    //   30: aload_1
    //   31: <illegal opcode> accept : (Lnet/portswigger/Zrxx;Lnet/portswigger/Zqa;)Ljava/util/function/BiConsumer;
    //   36: invokeinterface forEach : (Ljava/util/function/BiConsumer;)V
    //   41: goto -> 52
    //   44: astore_2
    //   45: aload_2
    //   46: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   49: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   52: aload_1
    //   53: invokevirtual ZG : ()Lnet/portswigger/Zrmf;
    //   56: areturn
    // Exception table:
    //   from	to	target	type
    //   8	41	44	java/lang/Exception
  }
  
  private String Zd() {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZQ : Lorg/openapi4j/Zp9;
    //   7: invokevirtual getUrl : ()Ljava/lang/String;
    //   10: astore_3
    //   11: astore_1
    //   12: aload_3
    //   13: ifnonnull -> 23
    //   16: ldc '/'
    //   18: astore_2
    //   19: aload_1
    //   20: ifnonnull -> 156
    //   23: aload_3
    //   24: invokestatic Zy : (Ljava/lang/String;)Z
    //   27: ifne -> 51
    //   30: goto -> 37
    //   33: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   36: athrow
    //   37: aload_3
    //   38: invokestatic ZI : (Ljava/lang/String;)Z
    //   41: ifeq -> 57
    //   44: goto -> 51
    //   47: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   50: athrow
    //   51: aload_3
    //   52: astore_2
    //   53: aload_1
    //   54: ifnonnull -> 156
    //   57: aload_0
    //   58: getfield Zj : Ljava/net/URL;
    //   61: invokevirtual getPath : ()Ljava/lang/String;
    //   64: invokestatic Zf : (Ljava/lang/String;)Ljava/lang/String;
    //   67: astore #4
    //   69: aload_3
    //   70: ldc '.'
    //   72: invokevirtual equals : (Ljava/lang/Object;)Z
    //   75: ifeq -> 85
    //   78: aload #4
    //   80: astore_2
    //   81: aload_1
    //   82: ifnonnull -> 156
    //   85: aload_3
    //   86: sipush #1333
    //   89: sipush #13559
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   98: ifeq -> 125
    //   101: goto -> 108
    //   104: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   107: athrow
    //   108: aload #4
    //   110: aload_3
    //   111: iconst_2
    //   112: invokevirtual substring : (I)Ljava/lang/String;
    //   115: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   120: astore_2
    //   121: aload_1
    //   122: ifnonnull -> 156
    //   125: aload_3
    //   126: ldc '{'
    //   128: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   131: ifeq -> 147
    //   134: goto -> 141
    //   137: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   140: athrow
    //   141: aload_3
    //   142: astore_2
    //   143: aload_1
    //   144: ifnonnull -> 156
    //   147: aload #4
    //   149: aload_3
    //   150: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   155: astore_2
    //   156: aload_2
    //   157: areturn
    // Exception table:
    //   from	to	target	type
    //   19	30	33	net/portswigger/Zki
    //   23	44	47	net/portswigger/Zki
    //   81	101	104	net/portswigger/Zki
    //   121	134	137	net/portswigger/Zki
  }
  
  private static String Zf(String paramString) {
    int i = paramString.lastIndexOf("/");
    try {
      if (i == -1)
        return paramString; 
    } catch (Zki zki) {
      throw a(null);
    } 
    return paramString.substring(0, i);
  }
  
  private static boolean Zy(String paramString) {
    try {
      if (!paramString.toLowerCase().startsWith(a(1332, -31224))) {
        try {
          if (paramString.toLowerCase().startsWith(a(1335, 25733)));
        } catch (Zki zki) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zki zki) {
      throw a(null);
    } 
  }
  
  private static boolean ZI(String paramString) {
    return paramString.startsWith("/");
  }
  
  private void ZA(Map<Zba, List<Zgo>> paramMap) {
    List<Zgo> list = paramMap.get(Zba.PATH);
    try {
      if (list.size() == 1)
        try {
          if (((Zgo)list.get(0)).equals(new Zgo("/", false)))
            list.clear(); 
        } catch (Zki zki) {
          throw a(null);
        }  
    } catch (Zki zki) {
      throw a(null);
    } 
    if (!list.isEmpty()) {
      int i = list.size() - 1;
      Zgo zgo = list.get(i);
      try {
        if (!zgo.Za())
          try {
            if (zgo.ZL().endsWith("/")) {
              list.remove(i);
              list.add(new Zgo(zgo.ZL().substring(0, zgo.ZL().length() - 1), zgo.Za()));
            } 
          } catch (Zki zki) {
            throw a(null);
          }  
      } catch (Zki zki) {
        throw a(null);
      } 
    } 
  }
  
  private void lambda$get$2(Zqa paramZqa, Zba paramZba, List paramList) {
    // Byte code:
    //   0: aload_3
    //   1: aload_0
    //   2: aload_2
    //   3: aload_1
    //   4: <illegal opcode> accept : (Lnet/portswigger/Zrxx;Lnet/portswigger/Zba;Lnet/portswigger/Zqa;)Ljava/util/function/Consumer;
    //   9: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   14: return
  }
  
  private void lambda$get$1(Zba paramZba, Zqa paramZqa, Zgo paramZgo) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_3
    //   6: invokevirtual Za : ()Z
    //   9: ifeq -> 81
    //   12: new net/portswigger/Zaq
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #6
    //   21: aload_0
    //   22: getfield ZQ : Lorg/openapi4j/Zp9;
    //   25: invokevirtual getVariables : ()Ljava/util/Map;
    //   28: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   31: new java/util/HashMap
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast java/util/Map
    //   44: aload_3
    //   45: invokevirtual ZL : ()Ljava/lang/String;
    //   48: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   53: checkcast org/openapi4j/Zpo
    //   56: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   59: aload #6
    //   61: <illegal opcode> accept : (Lnet/portswigger/Zaq;)Ljava/util/function/Consumer;
    //   66: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   69: aload #6
    //   71: invokevirtual Zg : ()Lnet/portswigger/Zrmr;
    //   74: astore #5
    //   76: aload #4
    //   78: ifnonnull -> 94
    //   81: new net/portswigger/Zrm7
    //   84: dup
    //   85: aload_3
    //   86: invokevirtual ZL : ()Ljava/lang/String;
    //   89: invokespecial <init> : (Ljava/lang/String;)V
    //   92: astore #5
    //   94: getstatic net/portswigger/Za_.Z_ : [I
    //   97: aload_1
    //   98: invokevirtual ordinal : ()I
    //   101: iaload
    //   102: lookupswitch default -> 166, 1 -> 128, 2 -> 147
    //   128: aload_2
    //   129: aload #5
    //   131: invokevirtual Zh : (Lnet/portswigger/Zms;)Lnet/portswigger/Zqa;
    //   134: pop
    //   135: aload #4
    //   137: ifnonnull -> 192
    //   140: goto -> 147
    //   143: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   146: athrow
    //   147: aload_2
    //   148: aload #5
    //   150: invokevirtual ZN : (Lnet/portswigger/Zms;)Lnet/portswigger/Zqa;
    //   153: pop
    //   154: aload #4
    //   156: ifnonnull -> 192
    //   159: goto -> 166
    //   162: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   165: athrow
    //   166: new net/portswigger/Zki
    //   169: dup
    //   170: getstatic net/portswigger/Ztt.UNSUPPORTED_PATH_TYPE : Lnet/portswigger/Ztt;
    //   173: iconst_1
    //   174: anewarray java/lang/Object
    //   177: dup
    //   178: iconst_0
    //   179: aload_1
    //   180: aastore
    //   181: invokevirtual ZU : ([Ljava/lang/Object;)Ljava/lang/String;
    //   184: invokespecial <init> : (Ljava/lang/String;)V
    //   187: athrow
    //   188: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   191: athrow
    //   192: return
    // Exception table:
    //   from	to	target	type
    //   94	140	143	net/portswigger/Zki
    //   128	159	162	net/portswigger/Zki
    //   147	188	188	net/portswigger/Zki
  }
  
  private static void lambda$get$0(Zaq paramZaq, Zpo paramZpo) {
    Objects.requireNonNull(paramZaq);
    ((List)Optional.<List>ofNullable(paramZpo.getEnums()).orElse(new ArrayList())).forEach(paramZaq::ZO);
    paramZaq.Zt(paramZpo.getDefault());
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'SIBk¥:Å\\bëö^JÎXF'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #31
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
    //   68: putstatic net/portswigger/Zrxx.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic net/portswigger/Zrxx.b : [Ljava/lang/String;
    //   78: goto -> 226
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
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #92
    //   154: goto -> 183
    //   157: iconst_2
    //   158: goto -> 183
    //   161: bipush #69
    //   163: goto -> 183
    //   166: bipush #125
    //   168: goto -> 183
    //   171: bipush #92
    //   173: goto -> 183
    //   176: bipush #107
    //   178: goto -> 183
    //   181: bipush #84
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x535) & 0xFFFF;
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
      byte b1 = 60;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrxx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */