package net.portswigger.swagger.v3.parser;

import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zy6;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import javax.net.ssl.SSLHandshakeException;
import net.portswigger.swagger.FileUtils;
import net.portswigger.swagger.v2.ParseOptions;
import net.portswigger.swagger.v2.SwaggerParseResult;
import net.portswigger.swagger.v2.util.OpenAPIDeserializer;
import net.portswigger.swagger.v2.util.RemoteUrl;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.parser.core.extensions.SwaggerParserExtension;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;
import net.portswigger.swagger.v3.parser.exception.ReadContentException;

public class OpenAPIV3Parser implements SwaggerParserExtension {
  public static final String DISABLE_OAS31_RESOLVE;
  
  private static Zy6 JSON_MAPPER;
  
  private static Zy6 YAML_MAPPER;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<SwaggerParserExtension> getExtensions() {
    ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
    List<SwaggerParserExtension> list = getExtensions(classLoader1);
    ClassLoader classLoader2 = SwaggerParserExtension.class.getClassLoader();
    try {
      if (classLoader2 != classLoader1)
        list.addAll(getExtensions(classLoader2)); 
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    list.add(0, new OpenAPIV3Parser());
    return list;
  }
  
  protected static List<SwaggerParserExtension> getExtensions(ClassLoader paramClassLoader) {
    ArrayList<SwaggerParserExtension> arrayList = new ArrayList();
    ServiceLoader<SwaggerParserExtension> serviceLoader = ServiceLoader.load(SwaggerParserExtension.class, paramClassLoader);
    Iterator<SwaggerParserExtension> iterator = serviceLoader.iterator();
    int i = ResolverCache.ZL();
    while (iterator.hasNext()) {
      SwaggerParserExtension swaggerParserExtension = iterator.next();
      arrayList.add(swaggerParserExtension);
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  public SwaggerParseResult readLocation(String paramString, List<AuthorizationValue> paramList, ParseOptions paramParseOptions) {
    try {
      String str = readContentFromLocation(paramString, emptyListIfNull(paramList));
      return readContents(str, paramList, paramParseOptions, paramString);
    } catch (ReadContentException readContentException) {
      return SwaggerParseResult.ofError(readContentException.getMessage());
    } 
  }
  
  public SwaggerParseResult readContents(String paramString, List<AuthorizationValue> paramList, ParseOptions paramParseOptions) {
    return readContents(paramString, paramList, paramParseOptions, null);
  }
  
  public OpenAPI read(String paramString) {
    ParseOptions parseOptions = new ParseOptions();
    parseOptions.setResolve(true);
    return read(paramString, null, parseOptions);
  }
  
  public OpenAPI read(String paramString, List<AuthorizationValue> paramList, ParseOptions paramParseOptions) {
    int i = ResolverCache.ZL();
    try {
      if (paramString == null)
        return null; 
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    List<SwaggerParserExtension> list = getExtensions();
    for (SwaggerParserExtension swaggerParserExtension : list) {
      SwaggerParseResult swaggerParseResult = swaggerParserExtension.readLocation(paramString, paramList, paramParseOptions);
      OpenAPI openAPI = swaggerParseResult.getOpenAPI();
      try {
        if (openAPI != null)
          return openAPI; 
      } catch (ReadContentException readContentException) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  @Deprecated
  public SwaggerParseResult readWithInfo(String paramString, Zb paramZb) {
    return parseJsonNode(paramString, paramZb);
  }
  
  public SwaggerParseResult parseJsonNode(String paramString, Zb paramZb) {
    return (new OpenAPIDeserializer()).deserialize(paramZb, paramString, new ParseOptions());
  }
  
  public SwaggerParseResult parseJsonNode(String paramString, Zb paramZb, ParseOptions paramParseOptions) {
    return (new OpenAPIDeserializer()).deserialize(paramZb, paramString, paramParseOptions, paramParseOptions.isOaiAuthor());
  }
  
  public SwaggerParseResult readContents(String paramString) {
    ParseOptions parseOptions = new ParseOptions();
    parseOptions.setResolve(true);
    return readContents(paramString, null, parseOptions);
  }
  
  public SwaggerParseResult readContents(String paramString1, List<AuthorizationValue> paramList, ParseOptions paramParseOptions, String paramString2) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #5
    //   5: aload_1
    //   6: ifnull -> 26
    //   9: aload_1
    //   10: invokevirtual trim : ()Ljava/lang/String;
    //   13: invokevirtual isEmpty : ()Z
    //   16: ifeq -> 43
    //   19: goto -> 26
    //   22: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   25: athrow
    //   26: sipush #-5297
    //   29: sipush #-30398
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: invokestatic ofError : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   38: areturn
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_0
    //   44: aload_1
    //   45: invokevirtual getRightMapper : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zy6;
    //   48: astore #6
    //   50: new net/portswigger/swagger/v2/SwaggerParseResult
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: astore #8
    //   59: aload_3
    //   60: ifnull -> 90
    //   63: aload_3
    //   64: invokevirtual isLegacyYamlDeserialization : ()Z
    //   67: ifeq -> 90
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload #6
    //   79: aload_1
    //   80: invokevirtual Za : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   83: astore #7
    //   85: iload #5
    //   87: ifne -> 114
    //   90: aload_1
    //   91: aload #4
    //   93: aload_3
    //   94: aload #8
    //   96: invokestatic deserializeIntoTree : (Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/ParseOptions;Lnet/portswigger/swagger/v2/SwaggerParseResult;)Lcom/fasterxml/Zor/Zb;
    //   99: astore #7
    //   101: goto -> 114
    //   104: astore #9
    //   106: aload #6
    //   108: aload_1
    //   109: invokevirtual Za : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   112: astore #7
    //   114: aload_3
    //   115: ifnull -> 134
    //   118: aload_0
    //   119: aload #4
    //   121: aload #7
    //   123: aload_3
    //   124: invokevirtual parseJsonNode : (Ljava/lang/String;Lcom/fasterxml/Zor/Zb;Lnet/portswigger/swagger/v2/ParseOptions;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   127: astore #9
    //   129: iload #5
    //   131: ifne -> 144
    //   134: aload_0
    //   135: aload #4
    //   137: aload #7
    //   139: invokevirtual parseJsonNode : (Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   142: astore #9
    //   144: aload #9
    //   146: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   149: ifnull -> 164
    //   152: aload_0
    //   153: aload #9
    //   155: aload_2
    //   156: aload_3
    //   157: aload #4
    //   159: invokevirtual resolve : (Lnet/portswigger/swagger/v2/SwaggerParseResult;Ljava/util/List;Lnet/portswigger/swagger/v2/ParseOptions;Ljava/lang/String;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   162: astore #9
    //   164: aload #8
    //   166: invokevirtual getMessages : ()Ljava/util/List;
    //   169: ifnull -> 225
    //   172: aload #8
    //   174: invokevirtual getMessages : ()Ljava/util/List;
    //   177: invokeinterface iterator : ()Ljava/util/Iterator;
    //   182: astore #10
    //   184: aload #10
    //   186: invokeinterface hasNext : ()Z
    //   191: ifeq -> 225
    //   194: aload #10
    //   196: invokeinterface next : ()Ljava/lang/Object;
    //   201: checkcast java/lang/String
    //   204: astore #11
    //   206: aload #9
    //   208: aload_0
    //   209: aload #11
    //   211: aload #4
    //   213: invokevirtual getParseErrorMessage : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   216: invokevirtual message : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   219: pop
    //   220: iload #5
    //   222: ifne -> 184
    //   225: aload #9
    //   227: areturn
    //   228: astore #6
    //   230: aload_0
    //   231: aload #6
    //   233: invokevirtual ZU : ()Ljava/lang/String;
    //   236: aload #4
    //   238: invokevirtual getParseErrorMessage : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   241: astore #7
    //   243: aload #7
    //   245: invokestatic ofError : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   248: areturn
    //   249: astore #6
    //   251: aload_0
    //   252: aload #6
    //   254: invokevirtual getMessage : ()Ljava/lang/String;
    //   257: aload #4
    //   259: invokevirtual getParseErrorMessage : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   262: astore #7
    //   264: aload #7
    //   266: invokestatic ofError : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/SwaggerParseResult;
    //   269: areturn
    // Exception table:
    //   from	to	target	type
    //   5	19	22	java/lang/Exception
    //   9	39	39	java/lang/Exception
    //   43	227	228	com/fasterxml/Zb/Zmt
    //   43	227	249	java/lang/Exception
    //   59	70	73	java/lang/Exception
    //   90	101	104	java/lang/Exception
  }
  
  @Deprecated
  public SwaggerParseResult readWithInfo(String paramString, List<AuthorizationValue> paramList) {
    return readContents(readContentFromLocation(paramString, paramList), paramList, null);
  }
  
  private SwaggerParseResult resolve(SwaggerParseResult paramSwaggerParseResult, List<AuthorizationValue> paramList, ParseOptions paramParseOptions, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore #5
    //   5: aload_3
    //   6: ifnull -> 360
    //   9: aload_3
    //   10: invokevirtual isResolve : ()Z
    //   13: ifne -> 37
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload_3
    //   24: invokevirtual isResolveFully : ()Z
    //   27: ifeq -> 309
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: aload_1
    //   38: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   41: invokevirtual getOpenapi : ()Ljava/lang/String;
    //   44: ifnull -> 249
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   58: invokevirtual getOpenapi : ()Ljava/lang/String;
    //   61: sipush #-5301
    //   64: sipush #-16276
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   73: ifeq -> 249
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: sipush #-5308
    //   86: sipush #130
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   95: invokestatic isBlank : (Ljava/lang/String;)Z
    //   98: ifeq -> 221
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: new net/portswigger/swagger/v3/parser/reference/DereferencerContext
    //   111: dup
    //   112: aload_1
    //   113: aload_2
    //   114: aload #4
    //   116: aload_3
    //   117: aconst_null
    //   118: aconst_null
    //   119: iconst_1
    //   120: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   123: invokespecial <init> : (Lnet/portswigger/swagger/v2/SwaggerParseResult;Ljava/util/List;Ljava/lang/String;Lnet/portswigger/swagger/v2/ParseOptions;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;)V
    //   126: astore #6
    //   128: invokestatic getInstance : ()Lnet/portswigger/swagger/v3/parser/reference/DereferencersFactory;
    //   131: invokevirtual getDereferencers : ()Ljava/util/List;
    //   134: astore #7
    //   136: aload #7
    //   138: invokeinterface iterator : ()Ljava/util/Iterator;
    //   143: invokeinterface hasNext : ()Z
    //   148: ifeq -> 184
    //   151: aload #7
    //   153: invokeinterface iterator : ()Ljava/util/Iterator;
    //   158: invokeinterface next : ()Ljava/lang/Object;
    //   163: checkcast net/portswigger/swagger/v3/parser/reference/OpenAPIDereferencer
    //   166: astore #8
    //   168: aload #8
    //   170: aload #6
    //   172: aload #7
    //   174: invokeinterface iterator : ()Ljava/util/Iterator;
    //   179: invokeinterface dereference : (Lnet/portswigger/swagger/v3/parser/reference/DereferencerContext;Ljava/util/Iterator;)V
    //   184: aload_3
    //   185: invokevirtual isResolveFully : ()Z
    //   188: ifeq -> 216
    //   191: new net/portswigger/swagger/v2/util/ResolverFully
    //   194: dup
    //   195: aload_3
    //   196: invokevirtual isResolveCombinators : ()Z
    //   199: invokespecial <init> : (Z)V
    //   202: aload_1
    //   203: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   206: invokevirtual resolveFully : (Lnet/portswigger/swagger/v3/oas/models/OpenAPI;)V
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: iload #5
    //   218: ifeq -> 309
    //   221: sipush #-5309
    //   224: sipush #1714
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: astore #6
    //   232: aload_1
    //   233: invokevirtual getMessages : ()Ljava/util/List;
    //   236: aload #6
    //   238: invokeinterface add : (Ljava/lang/Object;)Z
    //   243: pop
    //   244: iload #5
    //   246: ifeq -> 309
    //   249: new net/portswigger/swagger/v3/parser/OpenAPIResolver
    //   252: dup
    //   253: aload_1
    //   254: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   257: aload_0
    //   258: aload_2
    //   259: invokevirtual emptyListIfNull : (Ljava/util/List;)Ljava/util/List;
    //   262: aload #4
    //   264: aconst_null
    //   265: aload_3
    //   266: invokespecial <init> : (Lnet/portswigger/swagger/v3/oas/models/OpenAPI;Ljava/util/List;Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/OpenAPIResolver$Settings;Lnet/portswigger/swagger/v2/ParseOptions;)V
    //   269: astore #6
    //   271: aload #6
    //   273: aload_1
    //   274: invokevirtual resolve : (Lnet/portswigger/swagger/v2/SwaggerParseResult;)V
    //   277: aload_3
    //   278: invokevirtual isResolveFully : ()Z
    //   281: ifeq -> 309
    //   284: new net/portswigger/swagger/v2/util/ResolverFully
    //   287: dup
    //   288: aload_3
    //   289: invokevirtual isResolveCombinators : ()Z
    //   292: invokespecial <init> : (Z)V
    //   295: aload_1
    //   296: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   299: invokevirtual resolveFully : (Lnet/portswigger/swagger/v3/oas/models/OpenAPI;)V
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   308: athrow
    //   309: aload_3
    //   310: invokevirtual isFlatten : ()Z
    //   313: ifeq -> 360
    //   316: new net/portswigger/swagger/v2/util/InlineModelResolver
    //   319: dup
    //   320: aload_3
    //   321: invokevirtual isFlattenComposedSchemas : ()Z
    //   324: aload_3
    //   325: invokevirtual isCamelCaseFlattenNaming : ()Z
    //   328: aload_3
    //   329: invokevirtual isSkipMatches : ()Z
    //   332: invokespecial <init> : (ZZZ)V
    //   335: astore #6
    //   337: aload_1
    //   338: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   341: ifnull -> 360
    //   344: aload #6
    //   346: aload_1
    //   347: invokevirtual getOpenAPI : ()Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   350: invokevirtual flatten : (Lnet/portswigger/swagger/v3/oas/models/OpenAPI;)V
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   359: athrow
    //   360: goto -> 380
    //   363: astore #6
    //   365: aload_1
    //   366: invokevirtual getMessages : ()Ljava/util/List;
    //   369: aload #6
    //   371: invokevirtual getMessage : ()Ljava/lang/String;
    //   374: invokeinterface add : (Ljava/lang/Object;)Z
    //   379: pop
    //   380: aload_1
    //   381: areturn
    // Exception table:
    //   from	to	target	type
    //   5	16	19	java/lang/Exception
    //   5	360	363	java/lang/Exception
    //   9	30	33	java/lang/Exception
    //   23	47	50	java/lang/Exception
    //   37	76	79	java/lang/Exception
    //   54	101	104	java/lang/Exception
    //   184	209	212	java/lang/Exception
    //   271	302	305	java/lang/Exception
    //   337	353	356	java/lang/Exception
  }
  
  private String getParseErrorMessage(String paramString1, String paramString2) {
    try {
      if (Objects.isNull(paramString1))
        return String.format(a(-5298, 24749), new Object[] { paramString2 }); 
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    try {
      if (paramString1.startsWith(a(-5310, 25664)))
        return String.format(a(-5307, 7015), new Object[] { paramString1, paramString2 }); 
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    return paramString1;
  }
  
  private <T> List<T> emptyListIfNull(List<T> paramList) {
    try {
    
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    return Objects.isNull(paramList) ? new ArrayList<>() : paramList;
  }
  
  private Zy6 getRightMapper(String paramString) {
    try {
      if (paramString.trim().startsWith("{"))
        return JSON_MAPPER; 
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    return YAML_MAPPER;
  }
  
  private String readContentFromLocation(String paramString, List<AuthorizationValue> paramList) {
    String str = paramString.replaceAll(a(-5304, -13987), "/");
    try {
      if (str.toLowerCase().startsWith(a(-5311, 9700)))
        return RemoteUrl.urlToString(str, paramList); 
      String str1 = a(-5300, 23446);
      try {
      
      } catch (SSLHandshakeException sSLHandshakeException) {
        throw a(null);
      } 
      Path path = str.toLowerCase().startsWith(a(-5305, 21397)) ? Paths.get(URI.create(str)) : Paths.get(str, new String[0]);
      if (Files.exists(path, new java.nio.file.LinkOption[0]))
        return FileUtils.readFileToString(path, StandardCharsets.UTF_8); 
      throw new IllegalArgumentException(a(-5299, -11843) + a(-5299, -11843));
    } catch (SSLHandshakeException sSLHandshakeException) {
      String str1 = String.format(a(-5306, 28273), new Object[] { str });
      throw new ReadContentException(str1, sSLHandshakeException);
    } catch (Exception exception) {
      throw new ReadContentException(String.format(a(-5303, 6393), new Object[] { str }), exception);
    } 
  }
  
  @Deprecated
  protected List<AuthorizationValue> transform(List<AuthorizationValue> paramList) {
    int i = ResolverCache.Zv();
    try {
      if (paramList == null)
        return null; 
    } catch (ReadContentException readContentException) {
      throw a(null);
    } 
    ArrayList<AuthorizationValue> arrayList = new ArrayList();
    for (AuthorizationValue authorizationValue1 : paramList) {
      AuthorizationValue authorizationValue2 = new AuthorizationValue();
      authorizationValue2.setKeyName(authorizationValue1.getKeyName());
      authorizationValue2.setValue(authorizationValue1.getValue());
      authorizationValue2.setType(authorizationValue1.getType());
      authorizationValue2.setUrlMatcher(authorizationValue1.getUrlMatcher());
      arrayList.add(authorizationValue2);
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¢-UÂöøØêR^¸ð!wÁ`Jw$ÔG-íqZ¼£F\\r±í¸ÅG7ìÝ8ÁäoKÚÊ¥æUÏnûhx)´Ãgæ¥®èØ¹VsNg\\bÝjO2½®Vþ­\\rèáETq®5çòTi#J\\r¥/ó¶^UbáM5 ñ«Dª¬éâ±¿ëY>s/!.ÿþ3»ôX¡ß$ÅqDâ9kfðª6¥ ñ ®Et{õ}1ÿFS7A¬)+à("\\t´ÒÜ±´»-M6w¥¹^µEî¦°îÕjW;GõIóuµÑPj>6Mwsh\\tnª/@¨á;7JH|ÕãóñZßVNüÔTE¸õ}ÓüêI£'nÀAçJsp`6Ð&dg"Xç\\nº¡ªò/â¾W:Ágf\\røy5¯6mO®NúÁCÑæ>Ñ\\r O}ìáÆZê i¤úÞÌÿ.o`.qÍ \\nÒ¨H¾r]óÐ@È?ãéÙGÚ»­B¼ZnØ­%gcvWkEHÀâr·ßDôqN9'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 154
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
    //   68: ldc 'ø!Lâ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #82
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 154
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
    //   128: putstatic net/portswigger/swagger/v3/parser/OpenAPIV3Parser.a : [Ljava/lang/String;
    //   131: bipush #15
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/swagger/v3/parser/OpenAPIV3Parser.b : [Ljava/lang/String;
    //   139: sipush #-5312
    //   142: sipush #-19451
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: putstatic net/portswigger/swagger/v3/parser/OpenAPIV3Parser.DISABLE_OAS31_RESOLVE : Ljava/lang/String;
    //   151: goto -> 312
    //   154: dup_x2
    //   155: pop
    //   156: invokevirtual toCharArray : ()[C
    //   159: dup_x1
    //   160: arraylength
    //   161: dup_x2
    //   162: pop
    //   163: iconst_0
    //   164: istore #6
    //   166: dup2_x1
    //   167: pop2
    //   168: dup_x2
    //   169: iconst_1
    //   170: if_icmpgt -> 272
    //   173: dup2
    //   174: swap
    //   175: iload #6
    //   177: dup2_x1
    //   178: caload
    //   179: swap
    //   180: iload #6
    //   182: bipush #7
    //   184: irem
    //   185: tableswitch default -> 254, 0 -> 224, 1 -> 229, 2 -> 234, 3 -> 239, 4 -> 244, 5 -> 249
    //   224: bipush #82
    //   226: goto -> 256
    //   229: bipush #63
    //   231: goto -> 256
    //   234: bipush #93
    //   236: goto -> 256
    //   239: bipush #67
    //   241: goto -> 256
    //   244: bipush #10
    //   246: goto -> 256
    //   249: bipush #27
    //   251: goto -> 256
    //   254: bipush #51
    //   256: ixor
    //   257: ixor
    //   258: i2c
    //   259: castore
    //   260: iinc #6, 1
    //   263: dup
    //   264: ifne -> 272
    //   267: dup2
    //   268: dup_x1
    //   269: goto -> 177
    //   272: dup2_x1
    //   273: pop2
    //   274: dup_x2
    //   275: iload #6
    //   277: if_icmpgt -> 173
    //   280: pop
    //   281: new java/lang/String
    //   284: dup_x1
    //   285: swap
    //   286: invokespecial <init> : ([C)V
    //   289: invokevirtual intern : ()Ljava/lang/String;
    //   292: swap
    //   293: pop
    //   294: swap
    //   295: tableswitch default -> 40, 0 -> 98
    //   312: invokestatic createJson : ()Lcom/fasterxml/Zor/Zy6;
    //   315: putstatic net/portswigger/swagger/v3/parser/OpenAPIV3Parser.JSON_MAPPER : Lcom/fasterxml/Zor/Zy6;
    //   318: invokestatic createYaml : ()Lcom/fasterxml/Zor/Zy6;
    //   321: putstatic net/portswigger/swagger/v3/parser/OpenAPIV3Parser.YAML_MAPPER : Lcom/fasterxml/Zor/Zy6;
    //   324: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFEB45) & 0xFFFF;
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
      byte b1 = 49;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\OpenAPIV3Parser.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */