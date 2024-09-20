package net.portswigger.swagger.v1.parser;

import com.fasterxml.Zor.Zb;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.swagger.StringUtils;
import net.portswigger.swagger.urlresolver.PermittedUrlsChecker;
import net.portswigger.swagger.urlresolver.exceptions.HostDeniedException;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;
import net.portswigger.swagger.v1.models.parameters.BodyParameter;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.parser.util.DeserializationUtils;
import net.portswigger.swagger.v1.parser.util.ParseOptions;
import net.portswigger.swagger.v1.parser.util.RefUtils;

public class ResolverCache {
  private static final Pattern PARAMETER_PATTERN;
  
  private static final Pattern DEFINITION_PATTERN;
  
  private static final Pattern RESPONSE_PATTERN;
  
  private static final Pattern PATHS_PATTERN;
  
  private final Swagger swagger;
  
  private final List<AuthorizationValue> auths;
  
  private final Path parentDirectory;
  
  private final String parentUrl;
  
  private final String rootPath;
  
  private final ParseOptions parseOptions;
  
  private Map<String, Object> resolutionCache;
  
  private Map<String, String> externalFileCache;
  
  private Set<String> referencedModelKeys;
  
  private Map<String, String> renameCache;
  
  private static String[] Zx;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public ResolverCache(Swagger paramSwagger, List<AuthorizationValue> paramList, String paramString) {
    this(paramSwagger, paramList, paramString, new ParseOptions());
  }
  
  public ResolverCache(Swagger paramSwagger, List<AuthorizationValue> paramList, String paramString, ParseOptions paramParseOptions) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZL : ()[Ljava/lang/String;
    //   7: aload_0
    //   8: new java/util/HashMap
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield resolutionCache : Ljava/util/Map;
    //   18: aload_0
    //   19: new java/util/HashMap
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield externalFileCache : Ljava/util/Map;
    //   29: aload_0
    //   30: new java/util/HashSet
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: putfield referencedModelKeys : Ljava/util/Set;
    //   40: aload_0
    //   41: new java/util/concurrent/ConcurrentHashMap
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: putfield renameCache : Ljava/util/Map;
    //   51: aload_0
    //   52: aload_1
    //   53: putfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   56: astore #5
    //   58: aload_0
    //   59: aload_2
    //   60: putfield auths : Ljava/util/List;
    //   63: aload_0
    //   64: aload_3
    //   65: putfield rootPath : Ljava/lang/String;
    //   68: aload_0
    //   69: aload #4
    //   71: putfield parseOptions : Lnet/portswigger/swagger/v1/parser/util/ParseOptions;
    //   74: aload_3
    //   75: ifnull -> 138
    //   78: aload_3
    //   79: sipush #-3888
    //   82: sipush #22274
    //   85: invokestatic a : (II)Ljava/lang/String;
    //   88: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   91: ifeq -> 118
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   100: athrow
    //   101: aload_0
    //   102: aconst_null
    //   103: putfield parentDirectory : Ljava/nio/file/Path;
    //   106: aload #5
    //   108: ifnonnull -> 158
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_0
    //   119: aload_3
    //   120: invokestatic getParentDirectoryOfFile : (Ljava/lang/String;)Ljava/nio/file/Path;
    //   123: putfield parentDirectory : Ljava/nio/file/Path;
    //   126: aload #5
    //   128: ifnonnull -> 158
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: new java/io/File
    //   141: dup
    //   142: ldc '.'
    //   144: invokespecial <init> : (Ljava/lang/String;)V
    //   147: astore #6
    //   149: aload_0
    //   150: aload #6
    //   152: invokevirtual toPath : ()Ljava/nio/file/Path;
    //   155: putfield parentDirectory : Ljava/nio/file/Path;
    //   158: aload_0
    //   159: aload_3
    //   160: putfield parentUrl : Ljava/lang/String;
    //   163: invokestatic Zwu : ()[Lburp/Zbqc;
    //   166: ifnonnull -> 183
    //   169: iconst_5
    //   170: anewarray java/lang/String
    //   173: invokestatic ZD : ([Ljava/lang/String;)V
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: return
    // Exception table:
    //   from	to	target	type
    //   58	94	97	java/lang/RuntimeException
    //   78	111	114	java/lang/RuntimeException
    //   101	131	134	java/lang/RuntimeException
    //   158	176	179	java/lang/RuntimeException
  }
  
  public <T> T loadRef(String paramString, RefFormat paramRefFormat, Class<T> paramClass) {
    // Byte code:
    //   0: invokestatic ZL : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_2
    //   6: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.INTERNAL : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   9: if_acmpne -> 30
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual loadInternalRef : (Ljava/lang/String;)Ljava/lang/Object;
    //   17: astore #5
    //   19: aload_3
    //   20: aload #5
    //   22: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: areturn
    //   26: astore #6
    //   28: aconst_null
    //   29: areturn
    //   30: aload_1
    //   31: sipush #-3899
    //   34: sipush #14606
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   43: astore #5
    //   45: aload #5
    //   47: arraylength
    //   48: iconst_2
    //   49: if_icmple -> 80
    //   52: new java/lang/RuntimeException
    //   55: dup
    //   56: aload_1
    //   57: sipush #-3903
    //   60: sipush #-13783
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: swap
    //   67: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: athrow
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: aload #5
    //   82: iconst_0
    //   83: aaload
    //   84: astore #6
    //   86: aload #5
    //   88: arraylength
    //   89: iconst_2
    //   90: if_icmpne -> 104
    //   93: aload #5
    //   95: iconst_1
    //   96: aaload
    //   97: goto -> 105
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aconst_null
    //   105: astore #7
    //   107: aload_0
    //   108: getfield resolutionCache : Ljava/util/Map;
    //   111: aload_1
    //   112: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   117: astore #8
    //   119: aload #8
    //   121: ifnull -> 135
    //   124: aload_3
    //   125: aload #8
    //   127: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   130: areturn
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload_0
    //   136: getfield externalFileCache : Ljava/util/Map;
    //   139: aload #6
    //   141: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   146: checkcast java/lang/String
    //   149: astore #9
    //   151: aload #9
    //   153: ifnonnull -> 258
    //   156: aload_0
    //   157: getfield parseOptions : Lnet/portswigger/swagger/v1/parser/util/ParseOptions;
    //   160: invokevirtual isSafelyResolveURL : ()Z
    //   163: ifeq -> 186
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: aload #6
    //   176: invokevirtual checkUrlIsPermitted : (Ljava/lang/String;)V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload_0
    //   187: getfield parentDirectory : Ljava/nio/file/Path;
    //   190: ifnull -> 214
    //   193: aload #6
    //   195: aload_2
    //   196: aload_0
    //   197: getfield auths : Ljava/util/List;
    //   200: aload_0
    //   201: getfield parentDirectory : Ljava/nio/file/Path;
    //   204: invokestatic readExternalRef : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;Ljava/util/List;Ljava/nio/file/Path;)Ljava/lang/String;
    //   207: astore #9
    //   209: aload #4
    //   211: ifnonnull -> 244
    //   214: aload_0
    //   215: getfield rootPath : Ljava/lang/String;
    //   218: ifnull -> 244
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   227: athrow
    //   228: aload #6
    //   230: aload_2
    //   231: aload_0
    //   232: getfield auths : Ljava/util/List;
    //   235: aload_0
    //   236: getfield rootPath : Ljava/lang/String;
    //   239: invokestatic readExternalUrlRef : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    //   242: astore #9
    //   244: aload_0
    //   245: getfield externalFileCache : Ljava/util/Map;
    //   248: aload #6
    //   250: aload #9
    //   252: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   257: pop
    //   258: aload #7
    //   260: ifnonnull -> 289
    //   263: aload #9
    //   265: aload #6
    //   267: aload_3
    //   268: invokestatic deserialize : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   271: astore #10
    //   273: aload_0
    //   274: getfield resolutionCache : Ljava/util/Map;
    //   277: aload_1
    //   278: aload #10
    //   280: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   285: pop
    //   286: aload #10
    //   288: areturn
    //   289: aload_0
    //   290: aload #9
    //   292: aload #6
    //   294: invokevirtual deserialize : (Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   297: astore #10
    //   299: aload #7
    //   301: ldc '/'
    //   303: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   306: astore #11
    //   308: aload #11
    //   310: astore #12
    //   312: aload #12
    //   314: arraylength
    //   315: istore #13
    //   317: iconst_0
    //   318: istore #14
    //   320: iload #14
    //   322: iload #13
    //   324: if_icmpge -> 402
    //   327: aload #12
    //   329: iload #14
    //   331: aaload
    //   332: astore #15
    //   334: aload #10
    //   336: aload_0
    //   337: aload #15
    //   339: invokevirtual unescapePointer : (Ljava/lang/String;)Ljava/lang/String;
    //   342: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   345: astore #10
    //   347: aload #10
    //   349: ifnonnull -> 394
    //   352: new java/lang/RuntimeException
    //   355: dup
    //   356: aload #7
    //   358: aload #6
    //   360: sipush #-3894
    //   363: sipush #-16382
    //   366: invokestatic a : (II)Ljava/lang/String;
    //   369: dup_x2
    //   370: pop
    //   371: sipush #-3900
    //   374: sipush #-18713
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: swap
    //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   386: invokespecial <init> : (Ljava/lang/String;)V
    //   389: athrow
    //   390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   393: athrow
    //   394: iinc #14, 1
    //   397: aload #4
    //   399: ifnonnull -> 320
    //   402: aload_3
    //   403: ldc net/portswigger/swagger/v1/models/Model
    //   405: invokevirtual equals : (Ljava/lang/Object;)Z
    //   408: ifeq -> 445
    //   411: new net/portswigger/swagger/v1/parser/util/SwaggerDeserializer
    //   414: dup
    //   415: invokespecial <init> : ()V
    //   418: astore #13
    //   420: aload #13
    //   422: aload #10
    //   424: checkcast com/fasterxml/Zg/Zr
    //   427: aload #7
    //   429: ldc '/'
    //   431: ldc '.'
    //   433: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   436: aconst_null
    //   437: invokevirtual definition : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Model;
    //   440: astore #12
    //   442: goto -> 455
    //   445: aload #10
    //   447: aload #6
    //   449: aload_3
    //   450: invokestatic deserialize : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   453: astore #12
    //   455: aload_0
    //   456: aload #6
    //   458: aload #12
    //   460: invokevirtual updateLocalRefs : (Ljava/lang/String;Ljava/lang/Object;)V
    //   463: aload_0
    //   464: getfield resolutionCache : Ljava/util/Map;
    //   467: aload_1
    //   468: aload #12
    //   470: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   475: pop
    //   476: aload #12
    //   478: instanceof net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   481: ifeq -> 502
    //   484: aload_0
    //   485: aload_1
    //   486: aload_2
    //   487: aload #12
    //   489: checkcast net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   492: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;Lnet/portswigger/swagger/v1/models/parameters/BodyParameter;)V
    //   495: goto -> 502
    //   498: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   501: athrow
    //   502: aload #12
    //   504: areturn
    // Exception table:
    //   from	to	target	type
    //   19	25	26	java/lang/Exception
    //   45	76	76	java/lang/Exception
    //   86	100	100	java/lang/Exception
    //   119	131	131	java/lang/Exception
    //   151	166	169	java/lang/Exception
    //   156	179	182	java/lang/Exception
    //   209	221	224	java/lang/Exception
    //   347	390	390	java/lang/Exception
    //   455	495	498	java/lang/Exception
  }
  
  private void loadRef(String paramString, RefFormat paramRefFormat, BodyParameter paramBodyParameter) {
    Model model = paramBodyParameter.getSchema();
    try {
      if (model instanceof RefModel)
        try {
          if (paramRefFormat != RefFormat.INTERNAL)
            loadRef(paramString, paramRefFormat, (RefModel)model); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void loadRef(String paramString, RefFormat paramRefFormat, RefModel paramRefModel) {
    String str1 = paramString.substring(0, paramString.indexOf('#'));
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str2 = RefUtils.isAnExternalRefFormat(paramRefModel.getRefFormat()) ? paramRefModel.getReference() : (str1 + str1);
    Model model = loadRef(str2, paramRefFormat, Model.class);
    this.swagger.addDefinition(paramRefModel.getSimpleRef(), model);
  }
  
  protected Zb deserialize(String paramString1, String paramString2) {
    return DeserializationUtils.deserializeIntoTree(paramString1, paramString2);
  }
  
  protected <T> void updateLocalRefs(String paramString, T paramT) {
    // Byte code:
    //   0: invokestatic ZL : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: instanceof net/portswigger/swagger/v1/models/Response
    //   8: ifeq -> 31
    //   11: aload_2
    //   12: checkcast net/portswigger/swagger/v1/models/Response
    //   15: astore #4
    //   17: aload_0
    //   18: aload_1
    //   19: aload #4
    //   21: invokevirtual getResponseSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   24: invokevirtual updateLocalRefs : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   27: aload_3
    //   28: ifnonnull -> 89
    //   31: aload_2
    //   32: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   35: ifeq -> 62
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_2
    //   46: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   49: astore #4
    //   51: aload_0
    //   52: aload_1
    //   53: aload #4
    //   55: invokevirtual updateLocalRefs : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   58: aload_3
    //   59: ifnonnull -> 89
    //   62: aload_2
    //   63: instanceof net/portswigger/swagger/v1/models/Model
    //   66: ifeq -> 89
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload_2
    //   77: checkcast net/portswigger/swagger/v1/models/Model
    //   80: astore #4
    //   82: aload_0
    //   83: aload_1
    //   84: aload #4
    //   86: invokevirtual updateLocalRefs : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   89: return
    // Exception table:
    //   from	to	target	type
    //   17	38	41	java/lang/RuntimeException
    //   51	69	72	java/lang/RuntimeException
  }
  
  protected <T> void updateLocalRefs(String paramString, Model paramModel) {
    // Byte code:
    //   0: invokestatic ZL : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: instanceof net/portswigger/swagger/v1/models/RefModel
    //   8: ifeq -> 40
    //   11: aload_2
    //   12: checkcast net/portswigger/swagger/v1/models/RefModel
    //   15: astore #4
    //   17: aload_0
    //   18: aload_1
    //   19: aload #4
    //   21: invokevirtual get$ref : ()Ljava/lang/String;
    //   24: invokevirtual merge : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   27: astore #5
    //   29: aload #4
    //   31: aload #5
    //   33: invokevirtual set$ref : (Ljava/lang/String;)V
    //   36: aload_3
    //   37: ifnonnull -> 119
    //   40: aload_2
    //   41: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   44: ifeq -> 119
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_2
    //   55: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   58: astore #4
    //   60: aload #4
    //   62: invokevirtual getProperties : ()Ljava/util/Map;
    //   65: ifnull -> 119
    //   68: aload_2
    //   69: invokeinterface getProperties : ()Ljava/util/Map;
    //   74: invokeinterface values : ()Ljava/util/Collection;
    //   79: invokeinterface iterator : ()Ljava/util/Iterator;
    //   84: astore #5
    //   86: aload #5
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 119
    //   96: aload #5
    //   98: invokeinterface next : ()Ljava/lang/Object;
    //   103: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   106: astore #6
    //   108: aload_0
    //   109: aload_1
    //   110: aload #6
    //   112: invokevirtual updateLocalRefs : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   115: aload_3
    //   116: ifnonnull -> 86
    //   119: return
    // Exception table:
    //   from	to	target	type
    //   29	47	50	java/lang/RuntimeException
  }
  
  protected <T> void updateLocalRefs(String paramString, Property paramProperty) {
    if (paramProperty instanceof RefProperty) {
      RefProperty refProperty = (RefProperty)paramProperty;
      String str = merge(paramString, refProperty.get$ref());
      refProperty.set$ref(str);
    } 
  }
  
  protected String merge(String paramString1, String paramString2) {
    try {
      if (StringUtils.isBlank(paramString1))
        return paramString2; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramString2.startsWith(a(-3896, -28106)))
        try {
          if (!paramString2.startsWith(a(-3886, -26864))) {
            try {
              if (!paramString1.startsWith(a(-3901, 28181)))
                try {
                  if (!paramString1.startsWith(a(-3897, -13556)))
                    return paramString2; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (paramString2.startsWith("."))
                return paramString2; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (paramString1.endsWith("/"))
                try {
                  if (paramString2.startsWith("/"))
                    return paramString1 + paramString1; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return paramString1 + paramString1;
          } 
          return paramString2;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramString2;
  }
  
  private String unescapePointer(String paramString) {
    try {
      paramString = URLDecoder.decode(paramString, a(-3891, 26499));
    } catch (UnsupportedEncodingException unsupportedEncodingException) {}
    paramString = paramString.replaceAll(a(-3904, 893), "/");
    return paramString.replaceAll(a(-3890, -15534), "~");
  }
  
  private Object loadInternalRef(String paramString) {
    Object object = null;
    if (paramString.startsWith(a(-3885, 1437))) {
      object = getFromMap(paramString, this.swagger.getParameters(), PARAMETER_PATTERN);
    } else if (paramString.startsWith(a(-3895, -19933))) {
      object = getFromMap(paramString, this.swagger.getResponses(), RESPONSE_PATTERN);
    } else if (paramString.startsWith(a(-3889, 3081))) {
      object = getFromMap(paramString, this.swagger.getParameters(), PARAMETER_PATTERN);
    } else if (paramString.startsWith(a(-3892, -233))) {
      object = getFromMap(paramString, this.swagger.getPaths(), PATHS_PATTERN);
    } 
    if (object == null)
      object = getFromMap(paramString, this.swagger.getDefinitions(), DEFINITION_PATTERN); 
    return object;
  }
  
  private Object getFromMap(String paramString, Map paramMap, Pattern paramPattern) {
    Matcher matcher = paramPattern.matcher(paramString);
    if (matcher.matches()) {
      String str = unescapePointer(matcher.group(a(-3898, -15254)));
      try {
        if (paramMap != null)
          return paramMap.get(str); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  protected void checkUrlIsPermitted(String paramString) {
    try {
      PermittedUrlsChecker permittedUrlsChecker = new PermittedUrlsChecker(this.parseOptions.getRemoteRefAllowList(), this.parseOptions.getRemoteRefBlockList());
      permittedUrlsChecker.verify(paramString);
    } catch (HostDeniedException hostDeniedException) {
      throw new RuntimeException(hostDeniedException.getMessage());
    } 
  }
  
  public boolean hasReferencedKey(String paramString) {
    try {
      if (this.referencedModelKeys == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.referencedModelKeys.contains(paramString);
  }
  
  public void addReferencedKey(String paramString) {
    this.referencedModelKeys.add(paramString);
  }
  
  public String getRenamedRef(String paramString) {
    return this.renameCache.get(paramString);
  }
  
  public void putRenamedRef(String paramString1, String paramString2) {
    this.renameCache.put(paramString1, paramString2);
  }
  
  public Map<String, Object> getResolutionCache() {
    return Collections.unmodifiableMap(this.resolutionCache);
  }
  
  public Map<String, String> getExternalFileCache() {
    return Collections.unmodifiableMap(this.externalFileCache);
  }
  
  public Map<String, String> getRenameCache() {
    return Collections.unmodifiableMap(this.renameCache);
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_5
    //   10: anewarray java/lang/String
    //   13: ldc '9ìcªÅ ne¢i¨i2ñµ\\bË{: ÿ)Ê2M±\!­Ñ½#ÜeÕô!ÿP»-â:üVZÓì1\6GÇÇë×9,;!lg.öÄo¼_ê9D½Ì¬_¿¹pXé-yóñ^B<\\tû²¼Ûp\\fèÑ*Ië'6/éæÃ\\bDdü&\­ÏlÍ'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic ZD : ([Ljava/lang/String;)V
    //   25: bipush #11
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #55
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'Ò¶ØÞúØ¹ÛÕÙ(Û'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #13
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #10
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic net/portswigger/swagger/v1/parser/ResolverCache.b : [Ljava/lang/String;
    //   139: bipush #19
    //   141: anewarray java/lang/String
    //   144: putstatic net/portswigger/swagger/v1/parser/ResolverCache.c : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 267
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #12
    //   222: goto -> 251
    //   225: bipush #120
    //   227: goto -> 251
    //   230: iconst_5
    //   231: goto -> 251
    //   234: bipush #115
    //   236: goto -> 251
    //   239: bipush #109
    //   241: goto -> 251
    //   244: bipush #100
    //   246: goto -> 251
    //   249: bipush #33
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 173
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 169
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 106
    //   308: getstatic net/portswigger/swagger/v1/models/refs/RefType.PARAMETER : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   311: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   314: ldc '^'
    //   316: swap
    //   317: sipush #-3893
    //   320: sipush #9904
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   334: putstatic net/portswigger/swagger/v1/parser/ResolverCache.PARAMETER_PATTERN : Ljava/util/regex/Pattern;
    //   337: getstatic net/portswigger/swagger/v1/models/refs/RefType.DEFINITION : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   340: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   343: ldc '^'
    //   345: swap
    //   346: sipush #-3902
    //   349: sipush #-30441
    //   352: invokestatic a : (II)Ljava/lang/String;
    //   355: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   360: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   363: putstatic net/portswigger/swagger/v1/parser/ResolverCache.DEFINITION_PATTERN : Ljava/util/regex/Pattern;
    //   366: getstatic net/portswigger/swagger/v1/models/refs/RefType.RESPONSE : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   369: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   372: ldc '^'
    //   374: swap
    //   375: sipush #-3902
    //   378: sipush #-30441
    //   381: invokestatic a : (II)Ljava/lang/String;
    //   384: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   389: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   392: putstatic net/portswigger/swagger/v1/parser/ResolverCache.RESPONSE_PATTERN : Ljava/util/regex/Pattern;
    //   395: getstatic net/portswigger/swagger/v1/models/refs/RefType.PATH : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   398: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   401: ldc '^'
    //   403: swap
    //   404: sipush #-3902
    //   407: sipush #-30441
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   418: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   421: putstatic net/portswigger/swagger/v1/parser/ResolverCache.PATHS_PATTERN : Ljava/util/regex/Pattern;
    //   424: return
  }
  
  public static void ZD(String[] paramArrayOfString) {
    Zx = paramArrayOfString;
  }
  
  public static String[] ZL() {
    return Zx;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF0C2) & 0xFFFF;
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
      byte b1 = 119;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\ResolverCache.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */