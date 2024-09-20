package net.portswigger.swagger.v1.parser.util;

import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zy6;
import com.fasterxml.Zv.Zf;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.IdentityHashMap;
import java.util.Map;
import net.portswigger.swagger.v1.util.Json;
import net.portswigger.swagger.v1.util.ObjectMapperFactory;
import org.yaml.Z_k;
import org.yaml.Zl7;
import org.yaml.Zt5;
import org.yaml.Ztp;
import org.yaml.Ztw;
import org.yaml.Zx;

public class DeserializationUtils {
  private static DeserializationUtils$Options options;
  
  private static Zy6 yamlMapper;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void setYamlMapper(Zf paramZf) {
    yamlMapper = ObjectMapperFactory.createYaml(paramZf);
  }
  
  public static Zy6 getYamlMapper() {
    return yamlMapper;
  }
  
  public static DeserializationUtils$Options getOptions() {
    return options;
  }
  
  public static Zb deserializeIntoTree(String paramString1, String paramString2) {
    return deserializeIntoTree(paramString1, paramString2, null);
  }
  
  public static Zb deserializeIntoTree(String paramString1, String paramString2, SwaggerDeserializationResult paramSwaggerDeserializationResult) {
    Zb zb;
    int[] arrayOfInt = RemoteUrl.ZS();
    try {
      if (isJson(paramString1)) {
        Zb zb1 = Json.mapper().Za(paramString1);
        if (arrayOfInt == null)
          zb1 = readYamlTree(paramString1, paramSwaggerDeserializationResult); 
        return zb1;
      } 
      zb = readYamlTree(paramString1, paramSwaggerDeserializationResult);
    } catch (IOException iOException) {
      throw new RuntimeException(a(26615, -418) + a(26615, -418) + paramString2, iOException);
    } 
    return zb;
  }
  
  public static <T> T deserialize(Object paramObject, String paramString, Class<T> paramClass) {
    return deserialize(paramObject, paramString, paramClass, null);
  }
  
  public static <T> T deserialize(Object paramObject, String paramString, Class<T> paramClass, SwaggerDeserializationResult paramSwaggerDeserializationResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: instanceof java/lang/String
    //   9: ifeq -> 37
    //   12: aload_0
    //   13: checkcast java/lang/String
    //   16: invokestatic isJson : (Ljava/lang/String;)Z
    //   19: ifeq -> 37
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   28: athrow
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #6
    //   40: aload_0
    //   41: instanceof java/lang/String
    //   44: ifeq -> 99
    //   47: iload #6
    //   49: ifeq -> 77
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   58: athrow
    //   59: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   62: aload_0
    //   63: checkcast java/lang/String
    //   66: aload_2
    //   67: invokevirtual Za : (Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   70: astore #5
    //   72: aload #4
    //   74: ifnonnull -> 109
    //   77: invokestatic getYamlMapper : ()Lcom/fasterxml/Zor/Zy6;
    //   80: aload_0
    //   81: checkcast java/lang/String
    //   84: aload_3
    //   85: invokestatic readYamlTree : (Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Lcom/fasterxml/Zor/Zb;
    //   88: aload_2
    //   89: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   92: astore #5
    //   94: aload #4
    //   96: ifnonnull -> 109
    //   99: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   102: aload_0
    //   103: aload_2
    //   104: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   107: astore #5
    //   109: goto -> 155
    //   112: astore #7
    //   114: new java/lang/RuntimeException
    //   117: dup
    //   118: aload_1
    //   119: aload_2
    //   120: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   123: sipush #26614
    //   126: sipush #26330
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: dup_x2
    //   133: pop
    //   134: sipush #26608
    //   137: sipush #-26251
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: swap
    //   144: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   149: aload #7
    //   151: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   154: athrow
    //   155: aload #5
    //   157: areturn
    // Exception table:
    //   from	to	target	type
    //   5	22	25	java/lang/Exception
    //   12	33	33	java/lang/Exception
    //   40	52	55	java/lang/Exception
    //   40	109	112	java/lang/Exception
  }
  
  private static boolean isJson(String paramString) {
    return paramString.trim().startsWith("{");
  }
  
  public static Zx buildSnakeYaml(Ztp paramZtp) {
    try {
      Ztw.class.getMethod(a(26618, 32093), new Class[0]);
    } catch (NoSuchMethodException noSuchMethodException) {
      return new Zx(paramZtp);
    } 
    try {
      Ztw ztw = buildLoaderOptions();
      return new Zx(paramZtp, new Zl7(new Z_k()), new Z_k(), ztw, new DeserializationUtils$CustomResolver());
    } catch (Exception exception) {
      return new Zx(paramZtp);
    } 
  }
  
  public static Ztw buildLoaderOptions() {
    Ztw ztw = new Ztw();
    try {
      Method method = Ztw.class.getMethod(a(26613, -15201), new Class[] { int.class });
      method.invoke(ztw, new Object[] { options.getMaxYamlAliasesForCollections() });
      method = Ztw.class.getMethod(a(26616, 23924), new Class[] { boolean.class });
      method.invoke(ztw, new Object[] { Boolean.valueOf(options.isYamlAllowRecursiveKeys()) });
      method = Ztw.class.getMethod(a(26617, 7475), new Class[] { int.class });
      method.invoke(ztw, new Object[] { options.getMaxYamlCodePoints() });
    } catch (ReflectiveOperationException reflectiveOperationException) {}
    return ztw;
  }
  
  public static Zb readYamlTree(String paramString, SwaggerDeserializationResult paramSwaggerDeserializationResult) throws IOException {
    try {
      if (!options.isSupportYamlAnchors())
        return getYamlMapper().Za(paramString); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      Zx zx = null;
      if (options.isValidateYamlInput()) {
        zx = buildSnakeYaml((Ztp)new DeserializationUtils$CustomSnakeYamlConstructor());
      } else {
        zx = buildSnakeYaml((Ztp)new Zt5(buildLoaderOptions()));
      } 
      Object object = zx.Zs(paramString);
      if (options.isValidateYamlInput()) {
        boolean bool = exceedsLimits(object, null, Integer.valueOf(0), new IdentityHashMap<>(), paramSwaggerDeserializationResult);
        if (bool)
          return getYamlMapper().Za(paramString); 
      } 
      return (Zb)Json.mapper().Zb(object, Zb.class);
    } catch (Throwable throwable) {
      try {
        if (paramSwaggerDeserializationResult != null)
          paramSwaggerDeserializationResult.message(throwable.getMessage()); 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      return getYamlMapper().Za(paramString);
    } 
  }
  
  private static boolean exceedsLimits(Object paramObject1, Object paramObject2, Integer paramInteger, Map<Object, Long> paramMap, SwaggerDeserializationResult paramSwaggerDeserializationResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #5
    //   5: aload_0
    //   6: ifnonnull -> 15
    //   9: iconst_0
    //   10: ireturn
    //   11: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   14: athrow
    //   15: aload_0
    //   16: instanceof java/util/List
    //   19: ifne -> 42
    //   22: aload_0
    //   23: instanceof java/util/Map
    //   26: ifne -> 42
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   35: athrow
    //   36: iconst_0
    //   37: ireturn
    //   38: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   41: athrow
    //   42: aload_2
    //   43: invokevirtual intValue : ()I
    //   46: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   49: invokevirtual getMaxYamlDepth : ()Ljava/lang/Integer;
    //   52: invokevirtual intValue : ()I
    //   55: if_icmple -> 107
    //   58: sipush #26619
    //   61: sipush #25841
    //   64: invokestatic a : (II)Ljava/lang/String;
    //   67: iconst_1
    //   68: anewarray java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   76: invokevirtual getMaxYamlDepth : ()Ljava/lang/Integer;
    //   79: aastore
    //   80: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   83: astore #6
    //   85: aload #4
    //   87: ifnull -> 105
    //   90: aload #4
    //   92: aload #6
    //   94: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   97: pop
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   104: athrow
    //   105: iconst_1
    //   106: ireturn
    //   107: aload_2
    //   108: invokevirtual intValue : ()I
    //   111: istore #6
    //   113: aload_3
    //   114: aload_0
    //   115: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   120: ifeq -> 281
    //   123: aload_1
    //   124: astore #7
    //   126: aload #7
    //   128: ifnonnull -> 134
    //   131: aload_0
    //   132: astore #7
    //   134: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   137: invokevirtual isYamlCycleCheck : ()Z
    //   140: ifeq -> 175
    //   143: aload_0
    //   144: aload #7
    //   146: iconst_0
    //   147: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   150: new java/util/IdentityHashMap
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: aload #4
    //   159: invokestatic hasReference : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/Map;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Z
    //   162: istore #8
    //   164: iload #8
    //   166: ifeq -> 175
    //   169: iconst_1
    //   170: ireturn
    //   171: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   174: athrow
    //   175: aload_3
    //   176: aload_0
    //   177: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   182: checkcast java/lang/Long
    //   185: invokevirtual longValue : ()J
    //   188: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   191: invokevirtual getMaxYamlReferences : ()Ljava/lang/Long;
    //   194: invokevirtual longValue : ()J
    //   197: lcmp
    //   198: ifle -> 250
    //   201: sipush #26609
    //   204: sipush #1389
    //   207: invokestatic a : (II)Ljava/lang/String;
    //   210: iconst_1
    //   211: anewarray java/lang/Object
    //   214: dup
    //   215: iconst_0
    //   216: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   219: invokevirtual getMaxYamlReferences : ()Ljava/lang/Long;
    //   222: aastore
    //   223: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   226: astore #8
    //   228: aload #4
    //   230: ifnull -> 248
    //   233: aload #4
    //   235: aload #8
    //   237: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   240: pop
    //   241: goto -> 248
    //   244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   247: athrow
    //   248: iconst_1
    //   249: ireturn
    //   250: aload_3
    //   251: aload_0
    //   252: aload_3
    //   253: aload_0
    //   254: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   259: checkcast java/lang/Long
    //   262: invokevirtual longValue : ()J
    //   265: lconst_1
    //   266: ladd
    //   267: invokestatic valueOf : (J)Ljava/lang/Long;
    //   270: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   275: pop
    //   276: aload #5
    //   278: ifnonnull -> 300
    //   281: aload_3
    //   282: aload_0
    //   283: lconst_1
    //   284: invokestatic valueOf : (J)Ljava/lang/Long;
    //   287: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   292: pop
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   299: athrow
    //   300: aload_0
    //   301: instanceof java/util/Map
    //   304: ifeq -> 450
    //   307: aload_0
    //   308: checkcast java/util/Map
    //   311: invokeinterface keySet : ()Ljava/util/Set;
    //   316: invokeinterface iterator : ()Ljava/util/Iterator;
    //   321: astore #7
    //   323: aload #7
    //   325: invokeinterface hasNext : ()Z
    //   330: ifeq -> 376
    //   333: aload #7
    //   335: invokeinterface next : ()Ljava/lang/Object;
    //   340: astore #8
    //   342: aload #8
    //   344: aload_0
    //   345: iload #6
    //   347: iconst_1
    //   348: iadd
    //   349: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   352: aload_3
    //   353: aload #4
    //   355: invokestatic exceedsLimits : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/Map;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Z
    //   358: istore #9
    //   360: iload #9
    //   362: ifeq -> 371
    //   365: iconst_1
    //   366: ireturn
    //   367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   370: athrow
    //   371: aload #5
    //   373: ifnonnull -> 323
    //   376: aload_0
    //   377: checkcast java/util/Map
    //   380: invokeinterface values : ()Ljava/util/Collection;
    //   385: invokeinterface iterator : ()Ljava/util/Iterator;
    //   390: astore #7
    //   392: aload #7
    //   394: invokeinterface hasNext : ()Z
    //   399: ifeq -> 445
    //   402: aload #7
    //   404: invokeinterface next : ()Ljava/lang/Object;
    //   409: astore #8
    //   411: aload #8
    //   413: aload_0
    //   414: iload #6
    //   416: iconst_1
    //   417: iadd
    //   418: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   421: aload_3
    //   422: aload #4
    //   424: invokestatic exceedsLimits : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/Map;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Z
    //   427: istore #9
    //   429: iload #9
    //   431: ifeq -> 440
    //   434: iconst_1
    //   435: ireturn
    //   436: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   439: athrow
    //   440: aload #5
    //   442: ifnonnull -> 392
    //   445: aload #5
    //   447: ifnonnull -> 528
    //   450: aload_0
    //   451: instanceof java/util/List
    //   454: ifeq -> 528
    //   457: goto -> 464
    //   460: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   463: athrow
    //   464: aload_0
    //   465: checkcast java/util/List
    //   468: invokeinterface iterator : ()Ljava/util/Iterator;
    //   473: astore #7
    //   475: aload #7
    //   477: invokeinterface hasNext : ()Z
    //   482: ifeq -> 528
    //   485: aload #7
    //   487: invokeinterface next : ()Ljava/lang/Object;
    //   492: astore #8
    //   494: aload #8
    //   496: aload_0
    //   497: iload #6
    //   499: iconst_1
    //   500: iadd
    //   501: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   504: aload_3
    //   505: aload #4
    //   507: invokestatic exceedsLimits : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/Map;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Z
    //   510: istore #9
    //   512: iload #9
    //   514: ifeq -> 523
    //   517: iconst_1
    //   518: ireturn
    //   519: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   522: athrow
    //   523: aload #5
    //   525: ifnonnull -> 475
    //   528: iconst_0
    //   529: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/lang/RuntimeException
    //   15	29	32	java/lang/RuntimeException
    //   22	38	38	java/lang/RuntimeException
    //   85	98	101	java/lang/RuntimeException
    //   164	171	171	java/lang/RuntimeException
    //   228	241	244	java/lang/RuntimeException
    //   250	293	296	java/lang/RuntimeException
    //   360	367	367	java/lang/RuntimeException
    //   429	436	436	java/lang/RuntimeException
    //   445	457	460	java/lang/RuntimeException
    //   512	519	519	java/lang/RuntimeException
  }
  
  private static boolean hasReference(Object paramObject1, Object paramObject2, Integer paramInteger, Map<Object, Long> paramMap, SwaggerDeserializationResult paramSwaggerDeserializationResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #5
    //   5: aload_0
    //   6: ifnull -> 20
    //   9: aload_1
    //   10: ifnonnull -> 26
    //   13: goto -> 20
    //   16: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   19: athrow
    //   20: iconst_0
    //   21: ireturn
    //   22: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   25: athrow
    //   26: aload_0
    //   27: instanceof java/util/List
    //   30: ifne -> 53
    //   33: aload_0
    //   34: instanceof java/util/Map
    //   37: ifne -> 53
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   46: athrow
    //   47: iconst_0
    //   48: ireturn
    //   49: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   52: athrow
    //   53: aload_1
    //   54: instanceof java/util/List
    //   57: ifne -> 80
    //   60: aload_1
    //   61: instanceof java/util/Map
    //   64: ifne -> 80
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   73: athrow
    //   74: iconst_0
    //   75: ireturn
    //   76: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   79: athrow
    //   80: aload_2
    //   81: invokevirtual intValue : ()I
    //   84: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   87: invokevirtual getMaxYamlDepth : ()Ljava/lang/Integer;
    //   90: invokevirtual intValue : ()I
    //   93: if_icmple -> 145
    //   96: sipush #26611
    //   99: sipush #-31597
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: iconst_1
    //   106: anewarray java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: getstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   114: invokevirtual getMaxYamlDepth : ()Ljava/lang/Integer;
    //   117: aastore
    //   118: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   121: astore #6
    //   123: aload #4
    //   125: ifnull -> 143
    //   128: aload #4
    //   130: aload #6
    //   132: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   135: pop
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   142: athrow
    //   143: iconst_1
    //   144: ireturn
    //   145: aload_2
    //   146: invokevirtual intValue : ()I
    //   149: istore #6
    //   151: aload_3
    //   152: aload_1
    //   153: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   158: ifeq -> 167
    //   161: iconst_0
    //   162: ireturn
    //   163: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   166: athrow
    //   167: aload_3
    //   168: aload_0
    //   169: lconst_1
    //   170: invokestatic valueOf : (J)Ljava/lang/Long;
    //   173: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   178: pop
    //   179: new java/util/ArrayList
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: astore #7
    //   188: aload_0
    //   189: instanceof java/util/Map
    //   192: ifeq -> 237
    //   195: aload #7
    //   197: aload_0
    //   198: checkcast java/util/Map
    //   201: invokeinterface keySet : ()Ljava/util/Set;
    //   206: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   209: pop
    //   210: aload #7
    //   212: aload_0
    //   213: checkcast java/util/Map
    //   216: invokeinterface values : ()Ljava/util/Collection;
    //   221: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   224: pop
    //   225: aload #5
    //   227: ifnonnull -> 268
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   236: athrow
    //   237: aload_0
    //   238: instanceof java/util/List
    //   241: ifeq -> 268
    //   244: goto -> 251
    //   247: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   250: athrow
    //   251: aload #7
    //   253: aload_0
    //   254: checkcast java/util/List
    //   257: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   260: pop
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   267: athrow
    //   268: aload #7
    //   270: invokevirtual iterator : ()Ljava/util/Iterator;
    //   273: astore #8
    //   275: aload #8
    //   277: invokeinterface hasNext : ()Z
    //   282: ifeq -> 367
    //   285: aload #8
    //   287: invokeinterface next : ()Ljava/lang/Object;
    //   292: astore #9
    //   294: aload #9
    //   296: aload_1
    //   297: if_acmpne -> 333
    //   300: sipush #26612
    //   303: sipush #14677
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: astore #10
    //   311: aload #4
    //   313: ifnull -> 331
    //   316: aload #4
    //   318: aload #10
    //   320: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;
    //   323: pop
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   330: athrow
    //   331: iconst_1
    //   332: ireturn
    //   333: aload #9
    //   335: aload_1
    //   336: iload #6
    //   338: iconst_1
    //   339: iadd
    //   340: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   343: aload_3
    //   344: aload #4
    //   346: invokestatic hasReference : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/util/Map;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializationResult;)Z
    //   349: istore #10
    //   351: iload #10
    //   353: ifeq -> 362
    //   356: iconst_1
    //   357: ireturn
    //   358: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   361: athrow
    //   362: aload #5
    //   364: ifnonnull -> 275
    //   367: iconst_0
    //   368: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	13	16	java/lang/RuntimeException
    //   9	22	22	java/lang/RuntimeException
    //   26	40	43	java/lang/RuntimeException
    //   33	49	49	java/lang/RuntimeException
    //   53	67	70	java/lang/RuntimeException
    //   60	76	76	java/lang/RuntimeException
    //   123	136	139	java/lang/RuntimeException
    //   151	163	163	java/lang/RuntimeException
    //   188	230	233	java/lang/RuntimeException
    //   195	244	247	java/lang/RuntimeException
    //   237	261	264	java/lang/RuntimeException
    //   311	324	327	java/lang/RuntimeException
    //   351	358	358	java/lang/RuntimeException
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '&ðWÙ2Å ÎüoëfvJ¸á>]?iÆ>PjÔ\\n°6Ys=x>Û÷Ý\\tóuùïßå:a5Í®P5}Åo¬ÅELé½¬¶W»jsðÖ¦Å¬È)i¶¼V»£)u\\r^R3æÚÐP9V&TfL:99BåCzÙnFØOHHªÝ{bl¹%+U+ç?å¯D7©õïá«Ý1ý¶n¡kØæÈÐô2=µ-óì(.Ñµ¶{l4;ûbîù3\\fP©B'Ù\\nÐµ,;ÖÞYÓÔ.ü£î¦çíqêß*×øÔj÷E0HÇ¬cWÝ\\f!VLcxfjÛÏ8®sõÌì]®)ä£ßÊ±^RDº\\r`Ñyª.<æ}êMVºËÃâÉQþHCðÙ>ø'LX ÒfÛ1q)þDD¾IbHbÐ%Îôs.&¸è=&«0DXÃ<\\bBâÍ Ð#à/YZ XÛiò f¯ÕmaïQ®|íà@!÷©?Ð»ëT©ÚD³ÿKÄelÞvóYÚ h,Þ~à(ÃMJ`\\nºçh2(*{T3aÚÿ Ä_ª7­Î*}ZtZ&Ô6U]bq3&/)A¶t;¬ÿûXðWÐ­ïbÏ%÷pÞÙøôØy8kÛ3<ÄB\\b£[jÏõqêôb\\f¸iï0îÜÍ¼d]äG§ Óãbåþ²ÔDº)i)5ä{îìÆ?8<x¼Ø*3ófïÍ~ugö³Ý \\b}× Fd[ëß¥Ó Ø)òz>ðG¨îgÖyéý$U4ÔãXwÍmQµz|·BféõjýEÑ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #21
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #82
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '÷ãÅã'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
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
    //   128: putstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #72
    //   214: goto -> 244
    //   217: bipush #92
    //   219: goto -> 244
    //   222: bipush #111
    //   224: goto -> 244
    //   227: bipush #37
    //   229: goto -> 244
    //   232: bipush #37
    //   234: goto -> 244
    //   237: bipush #85
    //   239: goto -> 244
    //   242: bipush #45
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: new net/portswigger/swagger/v1/parser/util/DeserializationUtils$Options
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.options : Lnet/portswigger/swagger/v1/parser/util/DeserializationUtils$Options;
    //   310: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   313: putstatic net/portswigger/swagger/v1/parser/util/DeserializationUtils.yamlMapper : Lcom/fasterxml/Zor/Zy6;
    //   316: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x67F2) & 0xFFFF;
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
      byte b1 = 12;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\DeserializationUtils.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */