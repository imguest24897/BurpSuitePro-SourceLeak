package org.yaml;

import burp.Zbqc;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Zjf extends Zg3 {
  private static final Ztx ZI;
  
  protected Class<?> Zy;
  
  private final String Zf;
  
  private transient Method Zm;
  
  private Field ZA;
  
  protected Class<?>[] Zh;
  
  private Zg3 Zp;
  
  private boolean ZZ;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Class<?>[] Zk() {
    return (this.Zh == null && this.Zp != null) ? this.Zp.Zk() : this.Zh;
  }
  
  public void ZO(Object paramObject1, Object paramObject2) throws Exception {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zm : Ljava/lang/reflect/Method;
    //   8: ifnull -> 301
    //   11: aload_0
    //   12: getfield ZZ : Z
    //   15: ifne -> 53
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_0
    //   26: getfield Zm : Ljava/lang/reflect/Method;
    //   29: aload_1
    //   30: iconst_1
    //   31: anewarray java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_2
    //   37: aastore
    //   38: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   41: pop
    //   42: aload_3
    //   43: ifnonnull -> 427
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_2
    //   54: ifnull -> 427
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   63: athrow
    //   64: aload_2
    //   65: instanceof java/util/Collection
    //   68: ifeq -> 138
    //   71: goto -> 78
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: aload_2
    //   79: checkcast java/util/Collection
    //   82: astore #4
    //   84: aload #4
    //   86: invokeinterface iterator : ()Ljava/util/Iterator;
    //   91: astore #5
    //   93: aload #5
    //   95: invokeinterface hasNext : ()Z
    //   100: ifeq -> 134
    //   103: aload #5
    //   105: invokeinterface next : ()Ljava/lang/Object;
    //   110: astore #6
    //   112: aload_0
    //   113: getfield Zm : Ljava/lang/reflect/Method;
    //   116: aload_1
    //   117: iconst_1
    //   118: anewarray java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload #6
    //   125: aastore
    //   126: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   129: pop
    //   130: aload_3
    //   131: ifnonnull -> 93
    //   134: aload_3
    //   135: ifnonnull -> 427
    //   138: aload_2
    //   139: instanceof java/util/Map
    //   142: ifeq -> 235
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   151: athrow
    //   152: aload_2
    //   153: checkcast java/util/Map
    //   156: astore #4
    //   158: aload #4
    //   160: invokeinterface entrySet : ()Ljava/util/Set;
    //   165: invokeinterface iterator : ()Ljava/util/Iterator;
    //   170: astore #5
    //   172: aload #5
    //   174: invokeinterface hasNext : ()Z
    //   179: ifeq -> 231
    //   182: aload #5
    //   184: invokeinterface next : ()Ljava/lang/Object;
    //   189: checkcast java/util/Map$Entry
    //   192: astore #6
    //   194: aload_0
    //   195: getfield Zm : Ljava/lang/reflect/Method;
    //   198: aload_1
    //   199: iconst_2
    //   200: anewarray java/lang/Object
    //   203: dup
    //   204: iconst_0
    //   205: aload #6
    //   207: invokeinterface getKey : ()Ljava/lang/Object;
    //   212: aastore
    //   213: dup
    //   214: iconst_1
    //   215: aload #6
    //   217: invokeinterface getValue : ()Ljava/lang/Object;
    //   222: aastore
    //   223: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   226: pop
    //   227: aload_3
    //   228: ifnonnull -> 172
    //   231: aload_3
    //   232: ifnonnull -> 427
    //   235: aload_2
    //   236: invokevirtual getClass : ()Ljava/lang/Class;
    //   239: invokevirtual isArray : ()Z
    //   242: ifeq -> 427
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: aload_2
    //   253: invokestatic getLength : (Ljava/lang/Object;)I
    //   256: istore #4
    //   258: iconst_0
    //   259: istore #5
    //   261: iload #5
    //   263: iload #4
    //   265: if_icmpge -> 297
    //   268: aload_0
    //   269: getfield Zm : Ljava/lang/reflect/Method;
    //   272: aload_1
    //   273: iconst_1
    //   274: anewarray java/lang/Object
    //   277: dup
    //   278: iconst_0
    //   279: aload_2
    //   280: iload #5
    //   282: invokestatic get : (Ljava/lang/Object;I)Ljava/lang/Object;
    //   285: aastore
    //   286: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   289: pop
    //   290: iinc #5, 1
    //   293: aload_3
    //   294: ifnonnull -> 261
    //   297: aload_3
    //   298: ifnonnull -> 427
    //   301: aload_0
    //   302: getfield ZA : Ljava/lang/reflect/Field;
    //   305: ifnull -> 335
    //   308: goto -> 315
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: aload_0
    //   316: getfield ZA : Ljava/lang/reflect/Field;
    //   319: aload_1
    //   320: aload_2
    //   321: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   324: aload_3
    //   325: ifnonnull -> 427
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: aload_0
    //   336: getfield Zp : Lorg/yaml/Zg3;
    //   339: ifnull -> 369
    //   342: goto -> 349
    //   345: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   348: athrow
    //   349: aload_0
    //   350: getfield Zp : Lorg/yaml/Zg3;
    //   353: aload_1
    //   354: aload_2
    //   355: invokevirtual ZO : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   358: aload_3
    //   359: ifnonnull -> 427
    //   362: goto -> 369
    //   365: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   368: athrow
    //   369: getstatic org/yaml/Zjf.ZI : Lorg/yaml/Ztx;
    //   372: new java/lang/StringBuilder
    //   375: dup
    //   376: invokespecial <init> : ()V
    //   379: sipush #-8062
    //   382: sipush #-24587
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: aload_0
    //   392: invokevirtual ZB : ()Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: sipush #-8061
    //   401: sipush #-18322
    //   404: invokestatic a : (II)Ljava/lang/String;
    //   407: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: aload_1
    //   411: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   414: invokevirtual toString : ()Ljava/lang/String;
    //   417: invokevirtual Zg : (Ljava/lang/String;)V
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   426: athrow
    //   427: return
    // Exception table:
    //   from	to	target	type
    //   4	18	21	java/lang/Exception
    //   11	46	49	java/lang/Exception
    //   25	57	60	java/lang/Exception
    //   53	71	74	java/lang/Exception
    //   134	145	148	java/lang/Exception
    //   231	245	248	java/lang/Exception
    //   297	308	311	java/lang/Exception
    //   301	328	331	java/lang/Exception
    //   315	342	345	java/lang/Exception
    //   335	362	365	java/lang/Exception
    //   349	420	423	java/lang/Exception
  }
  
  private Method ZE(Class<?> paramClass, String paramString, Class<?>... paramVarArgs) {
    Class<?> clazz = paramClass;
    Zbqc[] arrayOfZbqc = Zg3.Z_();
    while (clazz != null) {
      Method[] arrayOfMethod = clazz.getDeclaredMethods();
      int i = arrayOfMethod.length;
      byte b = 0;
      while (b < i) {
        Method method = arrayOfMethod[b];
        if (paramString.equals(method.getName())) {
          Class[] arrayOfClass = method.getParameterTypes();
          if (arrayOfClass.length == paramVarArgs.length || arrayOfZbqc == null) {
            boolean bool = true;
            byte b1 = 0;
            while (b1 < arrayOfClass.length) {
              if (!arrayOfClass[b1].isAssignableFrom(paramVarArgs[b1]))
                bool = false; 
              b1++;
              if (arrayOfZbqc == null)
                break; 
            } 
            if (bool) {
              method.setAccessible(true);
              return method;
            } 
          } 
        } 
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
      clazz = clazz.getSuperclass();
      if (arrayOfZbqc == null)
        break; 
    } 
    if (ZI.Zn(Z_t.WARNING))
      ZI.Zg(String.format(a(-8063, 6630), new Object[] { paramString, Integer.valueOf(paramVarArgs.length), this.Zy.getName(), ZB() })); 
    return null;
  }
  
  public String ZB() {
    String str = super.ZB();
    return (str != null) ? str : ((this.Zp != null) ? this.Zp.ZB() : null);
  }
  
  public Class<?> Zg() {
    Class<?> clazz = super.Zg();
    return (clazz != null) ? clazz : ((this.Zp != null) ? this.Zp.Zg() : null);
  }
  
  public boolean Zm() {
    return (this.Zm != null || this.ZA != null || (this.Zp != null && this.Zp.Zm()));
  }
  
  public void ZO(Zg3 paramZg3) {
    this.Zp = paramZg3;
    if (this.Zf != null && this.Zm == null && !this.ZZ) {
      this.ZZ = true;
      this.Zm = ZE(this.Zy, this.Zf, Zk());
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'M{´¢!]\\b'W7¨ù*Ò²¨º¹¥@ôã¥}r<&$¡Ñ_ÔßT«ÄÇ:\\t4,N ?ByûB!§{Î|\\fRÆÆ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #72
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
    //   69: putstatic org/yaml/Zjf.b : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic org/yaml/Zjf.c : [Ljava/lang/String;
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
    //   152: bipush #57
    //   154: goto -> 184
    //   157: bipush #118
    //   159: goto -> 184
    //   162: bipush #114
    //   164: goto -> 184
    //   167: bipush #59
    //   169: goto -> 184
    //   172: bipush #12
    //   174: goto -> 184
    //   177: bipush #80
    //   179: goto -> 184
    //   182: bipush #66
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
    //   227: ldc org/yaml/Zjf
    //   229: invokevirtual getPackage : ()Ljava/lang/Package;
    //   232: invokevirtual getName : ()Ljava/lang/String;
    //   235: invokestatic Zi : (Ljava/lang/String;)Lorg/yaml/Ztx;
    //   238: putstatic org/yaml/Zjf.ZI : Lorg/yaml/Ztx;
    //   241: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE083) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 109;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zjf.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */