package org.openapi4j;

import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Zaz<M> extends Za9<Zpf, M> {
  private static final Zpy ZI;
  
  private static final Zpy Zp;
  
  private static final Pattern Zy;
  
  private static final Pattern Za;
  
  private static final Pattern Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  void ZQ(Zpf paramZpf, Zpe paramZpe, String paramString, Zpu paramZpu) {
    boolean bool = false;
    Matcher matcher = Zy.matcher(paramString);
    String str = Zp4.Zi();
    while (matcher.find()) {
      bool = true;
      if (!Zn(paramZpf, paramZpe, matcher.group(1), paramZpu)) {
        Zl(paramZpf, paramZpe, matcher.group(1), paramZpu);
        if (str != null)
          break; 
      } 
    } 
    if (!bool && !Zn(paramZpf, paramZpe, paramString, paramZpu))
      Zl(paramZpf, paramZpe, paramString, paramZpu); 
  }
  
  private boolean Zn(Zpf paramZpf, Zpe paramZpe, String paramString, Zpu paramZpu) {
    Matcher matcher = Za.matcher(paramString);
    boolean bool = matcher.matches();
    String str = Zp4.Zi();
    if (bool) {
      if (matcher.group(2).equals(a(-10249, 25732))) {
        Zw zw = paramZpe.getRequestBody();
        if (zw != null && ZK(paramZpf, matcher.group(3), zw.getContentMediaTypes(), paramZpu))
          return true; 
        paramZpu.Zl(ZI, new Object[] { paramString });
        return (str != null) ? (Zn(matcher.group(2), matcher.group(3), paramZpf.getContext(), paramZpe, paramZpu) ? true : bool) : bool;
      } 
    } else {
      return bool;
    } 
    return Zn(matcher.group(2), matcher.group(3), paramZpf.getContext(), paramZpe, paramZpu) ? true : bool;
  }
  
  private boolean Zl(Zpf paramZpf, Zpe paramZpe, String paramString, Zpu paramZpu) {
    // Byte code:
    //   0: invokestatic Zi : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_2
    //   6: invokevirtual getResponses : ()Ljava/util/Map;
    //   9: ifnonnull -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: getstatic org/openapi4j/Zaz.Zh : Ljava/util/regex/Pattern;
    //   17: aload_3
    //   18: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   21: astore #6
    //   23: aload #6
    //   25: invokevirtual matches : ()Z
    //   28: istore #7
    //   30: iload #7
    //   32: ifeq -> 272
    //   35: aload #6
    //   37: iconst_2
    //   38: invokevirtual group : (I)Ljava/lang/String;
    //   41: sipush #-10255
    //   44: sipush #-4485
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 143
    //   56: aload_2
    //   57: invokevirtual getResponses : ()Ljava/util/Map;
    //   60: invokeinterface values : ()Ljava/util/Collection;
    //   65: invokeinterface iterator : ()Ljava/util/Iterator;
    //   70: astore #8
    //   72: aload #8
    //   74: invokeinterface hasNext : ()Z
    //   79: ifeq -> 122
    //   82: aload #8
    //   84: invokeinterface next : ()Ljava/lang/Object;
    //   89: checkcast org/openapi4j/Zv
    //   92: astore #9
    //   94: aload_0
    //   95: aload_1
    //   96: aload #6
    //   98: iconst_3
    //   99: invokevirtual group : (I)Ljava/lang/String;
    //   102: aload #9
    //   104: invokevirtual getContentMediaTypes : ()Ljava/util/Map;
    //   107: aload #4
    //   109: invokevirtual ZK : (Lorg/openapi4j/Zpf;Ljava/lang/String;Ljava/util/Map;Lorg/openapi4j/Zpu;)Z
    //   112: ifeq -> 117
    //   115: iconst_1
    //   116: ireturn
    //   117: aload #5
    //   119: ifnull -> 72
    //   122: aload #4
    //   124: getstatic org/openapi4j/Zaz.ZI : Lorg/openapi4j/Zpy;
    //   127: iconst_1
    //   128: anewarray java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_3
    //   134: aastore
    //   135: invokevirtual Zl : (Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   138: aload #5
    //   140: ifnull -> 272
    //   143: aload_2
    //   144: invokevirtual getResponses : ()Ljava/util/Map;
    //   147: invokeinterface values : ()Ljava/util/Collection;
    //   152: invokeinterface iterator : ()Ljava/util/Iterator;
    //   157: astore #8
    //   159: aload #8
    //   161: invokeinterface hasNext : ()Z
    //   166: ifeq -> 254
    //   169: aload #8
    //   171: invokeinterface next : ()Ljava/lang/Object;
    //   176: checkcast org/openapi4j/Zv
    //   179: astore #9
    //   181: aload #9
    //   183: invokevirtual getHeaders : ()Ljava/util/Map;
    //   186: ifnull -> 249
    //   189: aload #9
    //   191: invokevirtual getHeaders : ()Ljava/util/Map;
    //   194: invokeinterface keySet : ()Ljava/util/Set;
    //   199: invokeinterface iterator : ()Ljava/util/Iterator;
    //   204: astore #10
    //   206: aload #10
    //   208: invokeinterface hasNext : ()Z
    //   213: ifeq -> 249
    //   216: aload #10
    //   218: invokeinterface next : ()Ljava/lang/Object;
    //   223: checkcast java/lang/String
    //   226: astore #11
    //   228: aload #11
    //   230: aload #6
    //   232: iconst_3
    //   233: invokevirtual group : (I)Ljava/lang/String;
    //   236: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   239: ifeq -> 244
    //   242: iconst_1
    //   243: ireturn
    //   244: aload #5
    //   246: ifnull -> 206
    //   249: aload #5
    //   251: ifnull -> 159
    //   254: aload #4
    //   256: getstatic org/openapi4j/Zaz.ZI : Lorg/openapi4j/Zpy;
    //   259: iconst_1
    //   260: anewarray java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload_3
    //   266: aastore
    //   267: invokevirtual Zl : (Lorg/openapi4j/Zpy;[Ljava/lang/Object;)V
    //   270: iconst_0
    //   271: ireturn
    //   272: iload #7
    //   274: ireturn
  }
  
  private boolean ZK(Zpf paramZpf, String paramString, Map<String, Zpj> paramMap, Zpu paramZpu) {
    String str = Zp4.Zi();
    try {
      if (paramMap == null)
        return false; 
    } catch (Zau zau) {
      throw a(null);
    } 
    String[] arrayOfString = paramString.split("/");
    for (Map.Entry<String, Zpj> entry : paramMap.entrySet()) {
      try {
        if (Zl(paramZpf, ((Zpj)entry.getValue()).getSchema(), arrayOfString, 0))
          return true; 
      } catch (Zau zau) {
        paramZpu.Zl(Zp, new Object[] { paramString, zau.getMessage() });
      } 
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zl(Zpf paramZpf, Zf paramZf, String[] paramArrayOfString, int paramInt) throws Zau {
    try {
      if (paramZf == null)
        return false; 
    } catch (Zau zau) {
      throw a(null);
    } 
    try {
      if (paramArrayOfString.length > paramInt) {
        if (paramZf.isRef())
          paramZf = paramZf.getReference(paramZpf.getContext()).<Zf>Zg(Zf.class); 
        try {
          if (a(-10251, -13893).equals(paramZf.getType()))
            return Zl(paramZpf, paramZf.getItemsSchema(), paramArrayOfString, paramInt); 
        } catch (Zau zau) {
          throw a(null);
        } 
        Zf zf = paramZf.getProperty(paramArrayOfString[paramInt]);
        try {
          if (zf == null)
            return false; 
        } catch (Zau zau) {
          throw a(null);
        } 
        try {
          if (paramArrayOfString.length != ++paramInt) {
            try {
              if (Zl(paramZpf, zf, paramArrayOfString, paramInt));
            } catch (Zau zau) {
              throw a(null);
            } 
            return false;
          } 
        } catch (Zau zau) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (Zau zau) {
      throw a(null);
    } 
  }
  
  private boolean Zn(String paramString1, String paramString2, Zx paramZx, Zpe paramZpe, Zpu paramZpu) {
    Iterator<Zo> iterator = paramZpe.getParametersIn(paramZx, paramString1).iterator();
    String str = Zp4.Zi();
    while (iterator.hasNext()) {
      Zo zo = iterator.next();
      if (zo.getName().equals(paramString2))
        return true; 
      if (str != null)
        break; 
    } 
    paramZpu.Zl(ZI, new Object[] { paramString2 });
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'gÙw-aã\\r&/W><×2p±5Äãjl$lyÙ¶õt\\rßðç½\\b>Ùä-ª-´ê9÷bVâõÈeºÈFñÖíÖÑr.+h{°g®ÞÒ°_²ÓªøÅÚûè0igB8«q¬?\\bWIÃXå2¿øpwvzË¹ðyOvt'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #38
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #84
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'àâVðÍ´±5¾5^ÕÁ§è¯|Ó]ÂéØvßgøJ/ÌÓ\\n[WÎ= ¨øb¾R^MÚõsÁ]\\tà´¤öOî-9ëÈ¸$ùMa'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #79
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #15
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic org/openapi4j/Zaz.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic org/openapi4j/Zaz.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #113
    //   214: goto -> 244
    //   217: bipush #50
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #13
    //   229: goto -> 244
    //   232: bipush #36
    //   234: goto -> 244
    //   237: bipush #20
    //   239: goto -> 244
    //   242: bipush #42
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: new org/openapi4j/Zpy
    //   303: dup
    //   304: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   307: bipush #111
    //   309: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   312: sipush #-10250
    //   315: sipush #-28476
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   324: putstatic org/openapi4j/Zaz.ZI : Lorg/openapi4j/Zpy;
    //   327: new org/openapi4j/Zpy
    //   330: dup
    //   331: getstatic org/openapi4j/Zd.ERROR : Lorg/openapi4j/Zd;
    //   334: bipush #112
    //   336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   339: sipush #-10253
    //   342: sipush #30488
    //   345: invokestatic a : (II)Ljava/lang/String;
    //   348: invokespecial <init> : (Lorg/openapi4j/Zd;Ljava/lang/Integer;Ljava/lang/String;)V
    //   351: putstatic org/openapi4j/Zaz.Zp : Lorg/openapi4j/Zpy;
    //   354: sipush #-10252
    //   357: sipush #-640
    //   360: invokestatic a : (II)Ljava/lang/String;
    //   363: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   366: putstatic org/openapi4j/Zaz.Zy : Ljava/util/regex/Pattern;
    //   369: sipush #-10256
    //   372: sipush #25902
    //   375: invokestatic a : (II)Ljava/lang/String;
    //   378: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   381: putstatic org/openapi4j/Zaz.Za : Ljava/util/regex/Pattern;
    //   384: sipush #-10254
    //   387: sipush #3139
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   396: putstatic org/openapi4j/Zaz.Zh : Ljava/util/regex/Pattern;
    //   399: return
  }
  
  private static Zau a(Zau paramZau) {
    return paramZau;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD7F6) & 0xFFFF;
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
      char c = '¿';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zaz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */