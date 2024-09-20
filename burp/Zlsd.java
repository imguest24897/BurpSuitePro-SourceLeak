package burp;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import net.portswigger.Z_2;
import net.portswigger.Z_a;
import net.portswigger.Z_v;
import net.portswigger.Zbj;
import net.portswigger.Zbu;
import net.portswigger.Zbx;
import net.portswigger.Zbz;
import net.portswigger.Zm2;
import net.portswigger.Zy3;
import net.portswigger.Zy4;
import net.portswigger.Zyb;
import net.portswigger.Zyd;
import net.portswigger.Zyi;
import net.portswigger.Zyo;
import net.portswigger.Zyr;

public class Zlsd {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zmgt Za(Zyd paramZyd) {
    String[] arrayOfString = Zbiy.ZY();
    LinkedList<Zbiy> linkedList = new LinkedList();
    try {
      if (!paramZyd.ZM())
        return new Zmr8(List.of(new Zb96(paramZyd.toString()))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (Object object : paramZyd.ZB()) {
      linkedList.add(Ze(object));
      if (arrayOfString != null)
        break; 
    } 
    return new Zmr8(linkedList);
  }
  
  public static Zmgt ZZ(Zbu paramZbu) {
    return new Zmr8(List.of(Ze(paramZbu)));
  }
  
  public static Zeqj Zk(Zbj paramZbj) {
    return ZH(paramZbj.Zj(), true);
  }
  
  private static Zeqj ZH(String paramString, boolean paramBoolean) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramString.contains(".") ? Zeqj.Ze(paramString, paramBoolean) : Zeqj.ZA(paramString::lambda$convertReference$0);
  }
  
  public static String ZL(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZY : ()[Ljava/lang/String;
    //   11: aload_2
    //   12: ldc '`'
    //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: pop
    //   18: astore_1
    //   19: iconst_0
    //   20: istore_3
    //   21: iconst_0
    //   22: istore #4
    //   24: iload #4
    //   26: aload_0
    //   27: invokevirtual length : ()I
    //   30: if_icmpge -> 330
    //   33: aload_0
    //   34: iload #4
    //   36: invokevirtual charAt : (I)C
    //   39: istore #5
    //   41: iload #4
    //   43: ifeq -> 66
    //   46: aload_0
    //   47: iload #4
    //   49: iconst_1
    //   50: isub
    //   51: invokevirtual charAt : (I)C
    //   54: bipush #92
    //   56: if_icmpeq -> 74
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   65: athrow
    //   66: iconst_1
    //   67: goto -> 75
    //   70: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   73: athrow
    //   74: iconst_0
    //   75: istore #6
    //   77: iload #5
    //   79: bipush #123
    //   81: if_icmpne -> 110
    //   84: iload #6
    //   86: ifeq -> 110
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   95: athrow
    //   96: iinc #3, 1
    //   99: aload_1
    //   100: ifnull -> 146
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   109: athrow
    //   110: iload #5
    //   112: bipush #125
    //   114: if_icmpne -> 146
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   123: athrow
    //   124: iload #6
    //   126: ifeq -> 146
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   135: athrow
    //   136: iinc #3, -1
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   145: athrow
    //   146: iload #5
    //   148: bipush #96
    //   150: if_icmpne -> 201
    //   153: iload #6
    //   155: ifeq -> 201
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   164: athrow
    //   165: iload_3
    //   166: ifgt -> 201
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   175: athrow
    //   176: aload_2
    //   177: sipush #-27950
    //   180: sipush #-29499
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload_1
    //   191: ifnull -> 323
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   200: athrow
    //   201: iload #5
    //   203: bipush #92
    //   205: if_icmpne -> 309
    //   208: goto -> 215
    //   211: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   214: athrow
    //   215: iload_3
    //   216: ifgt -> 309
    //   219: goto -> 226
    //   222: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   225: athrow
    //   226: iload #4
    //   228: aload_0
    //   229: invokevirtual length : ()I
    //   232: iconst_1
    //   233: isub
    //   234: if_icmpeq -> 284
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   243: athrow
    //   244: aload_0
    //   245: iload #4
    //   247: iconst_1
    //   248: iadd
    //   249: invokevirtual charAt : (I)C
    //   252: bipush #123
    //   254: if_icmpeq -> 309
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   263: athrow
    //   264: aload_0
    //   265: iload #4
    //   267: iconst_1
    //   268: iadd
    //   269: invokevirtual charAt : (I)C
    //   272: bipush #96
    //   274: if_icmpeq -> 309
    //   277: goto -> 284
    //   280: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   283: athrow
    //   284: aload_2
    //   285: sipush #-27951
    //   288: sipush #-17554
    //   291: invokestatic a : (II)Ljava/lang/String;
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: aload_1
    //   299: ifnull -> 323
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   308: athrow
    //   309: aload_2
    //   310: iload #5
    //   312: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   315: pop
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   322: athrow
    //   323: iinc #4, 1
    //   326: aload_1
    //   327: ifnull -> 24
    //   330: aload_2
    //   331: ldc '`'
    //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: pop
    //   337: aload_2
    //   338: invokevirtual toString : ()Ljava/lang/String;
    //   341: areturn
    // Exception table:
    //   from	to	target	type
    //   41	59	62	java/lang/IllegalStateException
    //   46	70	70	java/lang/IllegalStateException
    //   77	89	92	java/lang/IllegalStateException
    //   84	103	106	java/lang/IllegalStateException
    //   96	117	120	java/lang/IllegalStateException
    //   110	129	132	java/lang/IllegalStateException
    //   124	139	142	java/lang/IllegalStateException
    //   146	158	161	java/lang/IllegalStateException
    //   153	169	172	java/lang/IllegalStateException
    //   165	194	197	java/lang/IllegalStateException
    //   176	208	211	java/lang/IllegalStateException
    //   201	219	222	java/lang/IllegalStateException
    //   215	237	240	java/lang/IllegalStateException
    //   226	257	260	java/lang/IllegalStateException
    //   244	277	280	java/lang/IllegalStateException
    //   264	302	305	java/lang/IllegalStateException
    //   284	316	319	java/lang/IllegalStateException
  }
  
  public static Zbiy Ze(Object paramObject) {
    if (paramObject instanceof String) {
      String str = (String)paramObject;
      return new Zb9f(str);
    } 
    if (paramObject instanceof Zyd) {
      Zyd zyd = (Zyd)paramObject;
      return new Zb9n(zyd);
    } 
    if (paramObject instanceof Zy4) {
      Zy4 zy4 = (Zy4)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27942, 31143));
      return new Zb9l(zy4.ZY());
    } 
    if (paramObject instanceof Zyb) {
      Zyb zyb = (Zyb)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27946, -8262));
      return new Zb9_(Ze(zyb.ZA()));
    } 
    if (paramObject instanceof Zbz) {
      Zbz zbz = (Zbz)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27937, -22088));
      return new Zb90(Ze(zbz.Zm()));
    } 
    if (paramObject instanceof Z_v) {
      Z_v z_v = (Z_v)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27947, -31827));
      return new Zbi5(Ze(z_v.ZA()));
    } 
    if (paramObject instanceof Z_a) {
      Z_a z_a = (Z_a)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27941, 15631));
      return new Zb9o(Ze(z_a.Zb()));
    } 
    if (paramObject instanceof Zyo) {
      Zyo zyo = (Zyo)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27949, -26094));
      return new Zb9z(Ze(zyo.ZN()), zyo.ZG().toString(), Ze(zyo.Zk()));
    } 
    try {
      if (paramObject instanceof net.portswigger.Z_f) {
        Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27948, -7018));
        return new Zb98();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (paramObject instanceof Zy3) {
      Zy3 zy3 = (Zy3)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27944, -9255));
      return new Zb9j(Ze(zy3.ZK()));
    } 
    if (paramObject instanceof Zyi) {
      Zyi zyi = (Zyi)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27943, -3305));
      return new Zb9w(Ze(zyi.ZC()));
    } 
    if (paramObject instanceof Zyr) {
      Zyr zyr = (Zyr)paramObject;
      Zm2.ZB(Zec3.SCANNER_BCHECK_FUNCTION_USE, a(-27952, -24721));
      return new Zb9x(Ze(zyr.ZA()));
    } 
    if (paramObject instanceof Zbj) {
      Zbj zbj = (Zbj)paramObject;
      return new Zb94(zbj.Zj());
    } 
    if (paramObject instanceof Zbx) {
      Zbx zbx = (Zbx)paramObject;
      return Ze(zbx.ZY());
    } 
    if (paramObject instanceof Zbu) {
      Zbu zbu = (Zbu)paramObject;
      Zbx zbx = (Zbx)zbu.ZO(1);
      return Ze(zbx.ZY());
    } 
    if (paramObject instanceof Z_2) {
      Z_2 z_2 = (Z_2)paramObject;
      return Ze(z_2.ZO(0));
    } 
    Zm2.ZB(Zec3.SCANNER_BCHECK_UNKNOWN_NODE, a(-27945, -31957).formatted(new Object[] { paramObject }));
    throw new IllegalStateException(a(-27938, 29555).formatted(new Object[] { paramObject }));
  }
  
  static String ZH(String paramString1, Pattern paramPattern, String paramString2) {
    return paramPattern.matcher(paramString1).replaceAll(paramString2);
  }
  
  private static Object lambda$convertReference$0(String paramString, Zzvx paramZzvx) {
    return paramZzvx.ZE(paramString);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Qè~3Où)¨\\b"áB³ÈÅjNTýß©¯ÌIÝLS1û&©øÓùRD\\bÇßR·´\\rÏ«QÞ©P¸µõ¹ËÝwe6È³àÓe2n³@7O´M¨6.¥"\\r¡þU¶¸\\nv}$±qÇÀdxÒ¯UÇ-_'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #26
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
    //   68: ldc ''¿ÅHJÇÜÝö¯qÕó÷ÐÎE­MÁpó"'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #40
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
    //   129: putstatic burp/Zlsd.a : [Ljava/lang/String;
    //   132: bipush #14
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zlsd.b : [Ljava/lang/String;
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
    //   212: bipush #105
    //   214: goto -> 244
    //   217: bipush #79
    //   219: goto -> 244
    //   222: bipush #123
    //   224: goto -> 244
    //   227: bipush #18
    //   229: goto -> 244
    //   232: bipush #57
    //   234: goto -> 244
    //   237: bipush #107
    //   239: goto -> 244
    //   242: bipush #82
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF92D3) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlsd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */