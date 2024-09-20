package org.yaml;

import burp.Zbqc;
import java.beans.FeatureDescriptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zt7 {
  private final Map<Class<?>, Map<String, Zg3>> ZE = new HashMap<>();
  
  private final Map<Class<?>, Set<Zg3>> ZC = new HashMap<>();
  
  private Zjw Zn = Zjw.DEFAULT;
  
  private boolean ZM;
  
  private boolean Zh;
  
  private final Zli ZF;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt7() {
    this(new Zli());
  }
  
  Zt7(Zli paramZli) {
    Zbqc[] arrayOfZbqc = Zg3.Z_();
    try {
      this.ZM = false;
      this.Zh = false;
      this.ZF = paramZli;
      if (paramZli.Zk())
        this.Zn = Zjw.FIELD; 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    try {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
  }
  
  protected Map<String, Zg3> ZF(Class<?> paramClass, Zjw paramZjw) {
    // Byte code:
    //   0: invokestatic Z_ : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZE : Ljava/util/Map;
    //   8: aload_1
    //   9: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   14: ifeq -> 35
    //   17: aload_0
    //   18: getfield ZE : Ljava/util/Map;
    //   21: aload_1
    //   22: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   27: checkcast java/util/Map
    //   30: areturn
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: new java/util/LinkedHashMap
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #4
    //   44: iconst_0
    //   45: istore #5
    //   47: aload_2
    //   48: getstatic org/yaml/Zjw.FIELD : Lorg/yaml/Zjw;
    //   51: if_acmpne -> 194
    //   54: aload_1
    //   55: astore #6
    //   57: aload #6
    //   59: ifnull -> 190
    //   62: aload #6
    //   64: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   67: astore #7
    //   69: aload #7
    //   71: arraylength
    //   72: istore #8
    //   74: iconst_0
    //   75: istore #9
    //   77: iload #9
    //   79: iload #8
    //   81: if_icmpge -> 179
    //   84: aload #7
    //   86: iload #9
    //   88: aaload
    //   89: astore #10
    //   91: aload #10
    //   93: invokevirtual getModifiers : ()I
    //   96: istore #11
    //   98: iload #11
    //   100: invokestatic isStatic : (I)Z
    //   103: ifne -> 172
    //   106: iload #11
    //   108: invokestatic isTransient : (I)Z
    //   111: ifne -> 172
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload #4
    //   123: aload #10
    //   125: invokevirtual getName : ()Ljava/lang/String;
    //   128: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   133: ifne -> 172
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload #4
    //   145: aload #10
    //   147: invokevirtual getName : ()Ljava/lang/String;
    //   150: new org/yaml/Zg4
    //   153: dup
    //   154: aload #10
    //   156: invokespecial <init> : (Ljava/lang/reflect/Field;)V
    //   159: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   164: pop
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: iinc #9, 1
    //   175: aload_3
    //   176: ifnonnull -> 77
    //   179: aload #6
    //   181: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   184: astore #6
    //   186: aload_3
    //   187: ifnonnull -> 57
    //   190: aload_3
    //   191: ifnonnull -> 469
    //   194: aload_1
    //   195: invokestatic getBeanInfo : (Ljava/lang/Class;)Ljava/beans/BeanInfo;
    //   198: invokeinterface getPropertyDescriptors : ()[Ljava/beans/PropertyDescriptor;
    //   203: astore #6
    //   205: aload #6
    //   207: arraylength
    //   208: istore #7
    //   210: iconst_0
    //   211: istore #8
    //   213: iload #8
    //   215: iload #7
    //   217: if_icmpge -> 318
    //   220: aload #6
    //   222: iload #8
    //   224: aaload
    //   225: astore #9
    //   227: aload #9
    //   229: invokevirtual getReadMethod : ()Ljava/lang/reflect/Method;
    //   232: astore #10
    //   234: aload #10
    //   236: ifnull -> 266
    //   239: aload #10
    //   241: invokevirtual getName : ()Ljava/lang/String;
    //   244: sipush #-25501
    //   247: sipush #-32578
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: invokevirtual equals : (Ljava/lang/Object;)Z
    //   256: ifne -> 311
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: aload_0
    //   267: aload #9
    //   269: invokespecial ZE : (Ljava/beans/FeatureDescriptor;)Z
    //   272: ifne -> 311
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload #4
    //   284: aload #9
    //   286: invokevirtual getName : ()Ljava/lang/String;
    //   289: new org/yaml/Zj6
    //   292: dup
    //   293: aload #9
    //   295: invokespecial <init> : (Ljava/beans/PropertyDescriptor;)V
    //   298: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   303: pop
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   310: athrow
    //   311: iinc #8, 1
    //   314: aload_3
    //   315: ifnonnull -> 213
    //   318: goto -> 333
    //   321: astore #6
    //   323: new org/yaml/Zj3
    //   326: dup
    //   327: aload #6
    //   329: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   332: athrow
    //   333: aload_1
    //   334: astore #6
    //   336: aload #6
    //   338: ifnull -> 469
    //   341: aload #6
    //   343: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   346: astore #7
    //   348: aload #7
    //   350: arraylength
    //   351: istore #8
    //   353: iconst_0
    //   354: istore #9
    //   356: iload #9
    //   358: iload #8
    //   360: if_icmpge -> 458
    //   363: aload #7
    //   365: iload #9
    //   367: aaload
    //   368: astore #10
    //   370: aload #10
    //   372: invokevirtual getModifiers : ()I
    //   375: istore #11
    //   377: iload #11
    //   379: invokestatic isStatic : (I)Z
    //   382: ifne -> 451
    //   385: iload #11
    //   387: invokestatic isTransient : (I)Z
    //   390: ifne -> 451
    //   393: goto -> 400
    //   396: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   399: athrow
    //   400: iload #11
    //   402: invokestatic isPublic : (I)Z
    //   405: ifeq -> 448
    //   408: goto -> 415
    //   411: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   414: athrow
    //   415: aload #4
    //   417: aload #10
    //   419: invokevirtual getName : ()Ljava/lang/String;
    //   422: new org/yaml/Zg4
    //   425: dup
    //   426: aload #10
    //   428: invokespecial <init> : (Ljava/lang/reflect/Field;)V
    //   431: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   436: pop
    //   437: aload_3
    //   438: ifnonnull -> 451
    //   441: goto -> 448
    //   444: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   447: athrow
    //   448: iconst_1
    //   449: istore #5
    //   451: iinc #9, 1
    //   454: aload_3
    //   455: ifnonnull -> 356
    //   458: aload #6
    //   460: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   463: astore #6
    //   465: aload_3
    //   466: ifnonnull -> 336
    //   469: aload #4
    //   471: invokeinterface isEmpty : ()Z
    //   476: ifeq -> 532
    //   479: iload #5
    //   481: ifeq -> 532
    //   484: goto -> 491
    //   487: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   490: athrow
    //   491: new org/yaml/Zj3
    //   494: dup
    //   495: new java/lang/StringBuilder
    //   498: dup
    //   499: invokespecial <init> : ()V
    //   502: sipush #-25502
    //   505: sipush #-4409
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: aload_1
    //   515: invokevirtual getName : ()Ljava/lang/String;
    //   518: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: invokevirtual toString : ()Ljava/lang/String;
    //   524: invokespecial <init> : (Ljava/lang/String;)V
    //   527: athrow
    //   528: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   531: athrow
    //   532: aload_0
    //   533: getfield ZE : Ljava/util/Map;
    //   536: aload_1
    //   537: aload #4
    //   539: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   544: pop
    //   545: aload #4
    //   547: areturn
    // Exception table:
    //   from	to	target	type
    //   4	31	31	java/beans/IntrospectionException
    //   98	114	117	java/beans/IntrospectionException
    //   106	136	139	java/beans/IntrospectionException
    //   121	165	168	java/beans/IntrospectionException
    //   194	318	321	java/beans/IntrospectionException
    //   234	259	262	java/beans/IntrospectionException
    //   239	275	278	java/beans/IntrospectionException
    //   266	304	307	java/beans/IntrospectionException
    //   377	393	396	java/beans/IntrospectionException
    //   385	408	411	java/beans/IntrospectionException
    //   400	441	444	java/beans/IntrospectionException
    //   469	484	487	java/beans/IntrospectionException
    //   479	528	528	java/beans/IntrospectionException
  }
  
  private boolean ZE(FeatureDescriptor paramFeatureDescriptor) {
    return Boolean.TRUE.equals(paramFeatureDescriptor.getValue(a(-25504, -17274)));
  }
  
  public Zg3 Zc(Class<? extends Object> paramClass, String paramString) {
    return ZQ(paramClass, paramString, this.Zn);
  }
  
  public Zg3 ZQ(Class<? extends Object> paramClass, String paramString, Zjw paramZjw) {
    Map<String, Zg3> map = ZF(paramClass, paramZjw);
    Zg3 zg3 = map.get(paramString);
    try {
      if (zg3 == null && this.Zh)
        zg3 = new Zjh(paramString); 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    try {
      if (zg3 == null)
        throw new Zj3(a(-25499, -8562) + paramString + a(-25503, -25931) + paramClass.getName()); 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return zg3;
  }
  
  public void ZM(boolean paramBoolean) {
    try {
      if (this.ZM != paramBoolean) {
        this.ZM = paramBoolean;
        this.ZC.clear();
      } 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
  }
  
  public boolean ZZ() {
    return this.ZM;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ª/¿¸z`;ø\\tû]õvIipäª\\b­ê¥îi'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #12
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #118
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
    //   67: ldc ' Ã\\rõ92©Íb5ÅY] êe¢ý×«ñ3ÞI|3T9ìÃ^i÷¹#³ofòtGì'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #40
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
    //   128: putstatic org/yaml/Zt7.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic org/yaml/Zt7.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #28
    //   214: goto -> 244
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #42
    //   224: goto -> 244
    //   227: bipush #127
    //   229: goto -> 244
    //   232: bipush #52
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #31
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9C61) & 0xFFFF;
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
      byte b1 = 120;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zt7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */