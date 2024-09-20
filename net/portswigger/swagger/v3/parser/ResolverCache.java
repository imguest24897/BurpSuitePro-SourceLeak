package net.portswigger.swagger.v3.parser;

import com.fasterxml.Zor.Zb;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.swagger.StringUtils;
import net.portswigger.swagger.urlresolver.PermittedUrlsChecker;
import net.portswigger.swagger.urlresolver.exceptions.HostDeniedException;
import net.portswigger.swagger.v2.ParseOptions;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.parser.core.models.AuthorizationValue;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class ResolverCache {
  private static final Pattern SCHEMAS_PATTERN;
  
  private static final Pattern RESPONSES_PATTERN;
  
  private static final Pattern PARAMETERS_PATTERN;
  
  private static final Pattern REQUEST_BODIES_PATTERN;
  
  private static final Pattern EXAMPLES_PATTERN;
  
  private static final Pattern LINKS_PATTERN;
  
  private static final Pattern CALLBACKS_PATTERN;
  
  private static final Pattern HEADERS_PATTERN;
  
  private static final Pattern SECURITY_SCHEMES;
  
  private static final Pattern PATHS_PATTERN;
  
  private final OpenAPI openApi;
  
  private final List<AuthorizationValue> auths;
  
  private final Path parentDirectory;
  
  private final String rootPath;
  
  private Map<String, Object> resolutionCache;
  
  private Map<String, String> externalFileCache;
  
  private List<String> referencedModelKeys;
  
  private Set<String> resolveValidationMessages;
  
  private final ParseOptions parseOptions;
  
  protected boolean openapi31;
  
  private Map<String, String> renameCache;
  
  private static int ZA;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public ResolverCache(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList, String paramString) {
    this(paramOpenAPI, paramList, paramString, new HashSet<>());
  }
  
  public ResolverCache(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList, String paramString, Set<String> paramSet) {
    this(paramOpenAPI, paramList, paramString, paramSet, new ParseOptions());
  }
  
  public ResolverCache(OpenAPI paramOpenAPI, List<AuthorizationValue> paramList, String paramString, Set<String> paramSet, ParseOptions paramParseOptions) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: istore #6
    //   9: aload_0
    //   10: new java/util/HashMap
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: putfield resolutionCache : Ljava/util/Map;
    //   20: aload_0
    //   21: new java/util/HashMap
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: putfield externalFileCache : Ljava/util/Map;
    //   31: aload_0
    //   32: new java/util/ArrayList
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: putfield referencedModelKeys : Ljava/util/List;
    //   42: aload_0
    //   43: new java/util/HashMap
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: putfield renameCache : Ljava/util/Map;
    //   53: aload_0
    //   54: aload_1
    //   55: ifnull -> 106
    //   58: aload_1
    //   59: invokevirtual getOpenapi : ()Ljava/lang/String;
    //   62: ifnull -> 106
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_1
    //   73: invokevirtual getOpenapi : ()Ljava/lang/String;
    //   76: sipush #27974
    //   79: sipush #14697
    //   82: invokestatic a : (II)Ljava/lang/String;
    //   85: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   88: ifeq -> 106
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: iconst_1
    //   99: goto -> 107
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: iconst_0
    //   107: putfield openapi31 : Z
    //   110: aload_0
    //   111: aload_1
    //   112: putfield openApi : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   115: aload_0
    //   116: aload_2
    //   117: putfield auths : Ljava/util/List;
    //   120: aload_0
    //   121: aload_3
    //   122: putfield rootPath : Ljava/lang/String;
    //   125: aload_0
    //   126: aload #4
    //   128: putfield resolveValidationMessages : Ljava/util/Set;
    //   131: aload_0
    //   132: aload #5
    //   134: putfield parseOptions : Lnet/portswigger/swagger/v2/ParseOptions;
    //   137: aload_3
    //   138: ifnull -> 240
    //   141: aload_3
    //   142: sipush #27994
    //   145: sipush #-23882
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   154: ifne -> 187
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_3
    //   165: sipush #27969
    //   168: sipush #30278
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   177: ifeq -> 218
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: aload_0
    //   188: aconst_null
    //   189: putfield parentDirectory : Ljava/nio/file/Path;
    //   192: iload #6
    //   194: ifne -> 260
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: iconst_2
    //   205: anewarray burp/Zbqc
    //   208: invokestatic Zr : ([Lburp/Zbqc;)V
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: aload_0
    //   219: aload_3
    //   220: iconst_0
    //   221: anewarray java/lang/String
    //   224: invokestatic of : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   227: invokeinterface getParent : ()Ljava/nio/file/Path;
    //   232: putfield parentDirectory : Ljava/nio/file/Path;
    //   235: iload #6
    //   237: ifne -> 260
    //   240: new java/io/File
    //   243: dup
    //   244: ldc '.'
    //   246: invokespecial <init> : (Ljava/lang/String;)V
    //   249: astore #7
    //   251: aload_0
    //   252: aload #7
    //   254: invokevirtual toPath : ()Ljava/nio/file/Path;
    //   257: putfield parentDirectory : Ljava/nio/file/Path;
    //   260: return
    // Exception table:
    //   from	to	target	type
    //   9	65	68	java/lang/RuntimeException
    //   58	91	94	java/lang/RuntimeException
    //   72	102	102	java/lang/RuntimeException
    //   107	157	160	java/lang/RuntimeException
    //   141	180	183	java/lang/RuntimeException
    //   164	197	200	java/lang/RuntimeException
    //   187	211	214	java/lang/RuntimeException
  }
  
  public <T> T loadRef(String paramString, RefFormat paramRefFormat, Class<T> paramClass) {
    // Byte code:
    //   0: invokestatic ZL : ()I
    //   3: istore #4
    //   5: aload_2
    //   6: getstatic net/portswigger/swagger/v3/parser/models/RefFormat.INTERNAL : Lnet/portswigger/swagger/v3/parser/models/RefFormat;
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
    //   31: sipush #27998
    //   34: sipush #999
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
    //   57: sipush #28015
    //   60: sipush #2494
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
    //   121: ifnull -> 180
    //   124: aload_3
    //   125: ldc net/portswigger/swagger/v3/oas/models/headers/Header
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifeq -> 173
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: aload_3
    //   141: invokevirtual getClass : ()Ljava/lang/Class;
    //   144: aload #8
    //   146: invokevirtual getClass : ()Ljava/lang/Class;
    //   149: invokevirtual equals : (Ljava/lang/Object;)Z
    //   152: ifeq -> 180
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: aload_3
    //   163: aload #8
    //   165: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   168: areturn
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_3
    //   174: aload #8
    //   176: invokevirtual cast : (Ljava/lang/Object;)Ljava/lang/Object;
    //   179: areturn
    //   180: aload_0
    //   181: getfield externalFileCache : Ljava/util/Map;
    //   184: aload #6
    //   186: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   191: checkcast java/lang/String
    //   194: astore #9
    //   196: aload #9
    //   198: ifnonnull -> 364
    //   201: aload_0
    //   202: getfield parseOptions : Lnet/portswigger/swagger/v2/ParseOptions;
    //   205: invokevirtual isSafelyResolveURL : ()Z
    //   208: ifeq -> 231
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: aload_0
    //   219: aload #6
    //   221: invokevirtual checkUrlIsPermitted : (Ljava/lang/String;)V
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: aload_0
    //   232: getfield parentDirectory : Ljava/nio/file/Path;
    //   235: ifnull -> 259
    //   238: aload #6
    //   240: aload_2
    //   241: aload_0
    //   242: getfield auths : Ljava/util/List;
    //   245: aload_0
    //   246: getfield parentDirectory : Ljava/nio/file/Path;
    //   249: invokestatic readExternalRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/util/List;Ljava/nio/file/Path;)Ljava/lang/String;
    //   252: astore #9
    //   254: iload #4
    //   256: ifne -> 350
    //   259: aload_0
    //   260: getfield rootPath : Ljava/lang/String;
    //   263: ifnull -> 320
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: aload_0
    //   274: getfield rootPath : Ljava/lang/String;
    //   277: sipush #27980
    //   280: sipush #-6523
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   289: ifeq -> 320
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: aload #6
    //   301: aload_2
    //   302: aload_0
    //   303: getfield auths : Ljava/util/List;
    //   306: aload_0
    //   307: getfield rootPath : Ljava/lang/String;
    //   310: invokestatic readExternalUrlRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    //   313: astore #9
    //   315: iload #4
    //   317: ifne -> 350
    //   320: aload_0
    //   321: getfield rootPath : Ljava/lang/String;
    //   324: ifnull -> 350
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   333: athrow
    //   334: aload #6
    //   336: aload_2
    //   337: aload_0
    //   338: getfield auths : Ljava/util/List;
    //   341: aload_0
    //   342: getfield rootPath : Ljava/lang/String;
    //   345: invokestatic readExternalClasspathRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    //   348: astore #9
    //   350: aload_0
    //   351: getfield externalFileCache : Ljava/util/Map;
    //   354: aload #6
    //   356: aload #9
    //   358: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   363: pop
    //   364: new net/portswigger/swagger/v2/SwaggerParseResult
    //   367: dup
    //   368: invokespecial <init> : ()V
    //   371: astore #10
    //   373: aload #9
    //   375: aload #6
    //   377: aload_0
    //   378: getfield parseOptions : Lnet/portswigger/swagger/v2/ParseOptions;
    //   381: aload #10
    //   383: invokestatic deserializeIntoTree : (Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/ParseOptions;Lnet/portswigger/swagger/v2/SwaggerParseResult;)Lcom/fasterxml/Zor/Zb;
    //   386: astore #11
    //   388: aload #7
    //   390: ifnonnull -> 492
    //   393: aconst_null
    //   394: astore #12
    //   396: aload_0
    //   397: getfield parseOptions : Lnet/portswigger/swagger/v2/ParseOptions;
    //   400: invokevirtual isValidateExternalRefs : ()Z
    //   403: ifeq -> 422
    //   406: aload_0
    //   407: aload #11
    //   409: aload_3
    //   410: aload #6
    //   412: ldc '/'
    //   414: invokevirtual deserializeFragment : (Lcom/fasterxml/Zor/Zb;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   417: astore #12
    //   419: goto -> 432
    //   422: aload #9
    //   424: aload #6
    //   426: aload_3
    //   427: invokestatic deserialize : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   430: astore #12
    //   432: aload_0
    //   433: getfield resolutionCache : Ljava/util/Map;
    //   436: aload_1
    //   437: aload #12
    //   439: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   444: pop
    //   445: aload #10
    //   447: invokevirtual getMessages : ()Ljava/util/List;
    //   450: ifnull -> 489
    //   453: aload_0
    //   454: getfield resolveValidationMessages : Ljava/util/Set;
    //   457: ifnull -> 489
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   466: athrow
    //   467: aload_0
    //   468: getfield resolveValidationMessages : Ljava/util/Set;
    //   471: aload #10
    //   473: invokevirtual getMessages : ()Ljava/util/List;
    //   476: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   481: pop
    //   482: goto -> 489
    //   485: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   488: athrow
    //   489: aload #12
    //   491: areturn
    //   492: aload #7
    //   494: ldc '/'
    //   496: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   499: astore #12
    //   501: aload #12
    //   503: astore #13
    //   505: aload #13
    //   507: arraylength
    //   508: istore #14
    //   510: iconst_0
    //   511: istore #15
    //   513: iload #15
    //   515: iload #14
    //   517: if_icmpge -> 628
    //   520: aload #13
    //   522: iload #15
    //   524: aaload
    //   525: astore #16
    //   527: aload #11
    //   529: invokevirtual ZJ : ()Z
    //   532: ifeq -> 560
    //   535: aload #11
    //   537: aload #16
    //   539: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   542: invokevirtual intValue : ()I
    //   545: invokevirtual ZC : (I)Lcom/fasterxml/Zor/Zb;
    //   548: astore #11
    //   550: goto -> 573
    //   553: astore #17
    //   555: iload #4
    //   557: ifne -> 573
    //   560: aload #11
    //   562: aload_0
    //   563: aload #16
    //   565: invokevirtual unescapePointer : (Ljava/lang/String;)Ljava/lang/String;
    //   568: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   571: astore #11
    //   573: aload #11
    //   575: ifnonnull -> 620
    //   578: new java/lang/RuntimeException
    //   581: dup
    //   582: aload #7
    //   584: aload #6
    //   586: sipush #27996
    //   589: sipush #12087
    //   592: invokestatic a : (II)Ljava/lang/String;
    //   595: dup_x2
    //   596: pop
    //   597: sipush #28014
    //   600: sipush #-10104
    //   603: invokestatic a : (II)Ljava/lang/String;
    //   606: swap
    //   607: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   612: invokespecial <init> : (Ljava/lang/String;)V
    //   615: athrow
    //   616: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   619: athrow
    //   620: iinc #15, 1
    //   623: iload #4
    //   625: ifne -> 513
    //   628: aconst_null
    //   629: astore #13
    //   631: aload_0
    //   632: getfield parseOptions : Lnet/portswigger/swagger/v2/ParseOptions;
    //   635: invokevirtual isValidateExternalRefs : ()Z
    //   638: ifeq -> 657
    //   641: aload_0
    //   642: aload #11
    //   644: aload_3
    //   645: aload #6
    //   647: aload #7
    //   649: invokevirtual deserializeFragment : (Lcom/fasterxml/Zor/Zb;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   652: astore #13
    //   654: goto -> 723
    //   657: aload_3
    //   658: ldc net/portswigger/swagger/v3/oas/models/media/Schema
    //   660: invokevirtual equals : (Ljava/lang/Object;)Z
    //   663: ifeq -> 713
    //   666: new net/portswigger/swagger/v2/util/OpenAPIDeserializer
    //   669: dup
    //   670: invokespecial <init> : ()V
    //   673: astore #14
    //   675: aload #14
    //   677: aload #11
    //   679: checkcast com/fasterxml/Zg/Zr
    //   682: aload #7
    //   684: ldc '/'
    //   686: ldc '.'
    //   688: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   691: new net/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult
    //   694: dup
    //   695: invokespecial <init> : ()V
    //   698: aload_0
    //   699: getfield openapi31 : Z
    //   702: invokevirtual openapi31 : (Z)Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;
    //   705: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   708: astore #13
    //   710: goto -> 723
    //   713: aload #11
    //   715: aload #6
    //   717: aload_3
    //   718: invokestatic deserialize : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   721: astore #13
    //   723: aload_0
    //   724: aload #6
    //   726: aload #13
    //   728: invokevirtual updateLocalRefs : (Ljava/lang/String;Ljava/lang/Object;)V
    //   731: aload_0
    //   732: getfield resolutionCache : Ljava/util/Map;
    //   735: aload_1
    //   736: aload #13
    //   738: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   743: pop
    //   744: aload #10
    //   746: invokevirtual getMessages : ()Ljava/util/List;
    //   749: ifnull -> 788
    //   752: aload_0
    //   753: getfield resolveValidationMessages : Ljava/util/Set;
    //   756: ifnull -> 788
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   765: athrow
    //   766: aload_0
    //   767: getfield resolveValidationMessages : Ljava/util/Set;
    //   770: aload #10
    //   772: invokevirtual getMessages : ()Ljava/util/List;
    //   775: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   780: pop
    //   781: goto -> 788
    //   784: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   787: athrow
    //   788: aload #13
    //   790: areturn
    // Exception table:
    //   from	to	target	type
    //   19	25	26	java/lang/Exception
    //   45	76	76	java/lang/Exception
    //   86	100	100	java/lang/Exception
    //   119	133	136	java/lang/Exception
    //   124	155	158	java/lang/Exception
    //   140	169	169	java/lang/Exception
    //   196	211	214	java/lang/Exception
    //   201	224	227	java/lang/Exception
    //   254	266	269	java/lang/Exception
    //   259	292	295	java/lang/Exception
    //   315	327	330	java/lang/Exception
    //   432	460	463	java/lang/Exception
    //   453	482	485	java/lang/Exception
    //   535	550	553	java/lang/NumberFormatException
    //   573	616	616	java/lang/Exception
    //   723	759	762	java/lang/Exception
    //   752	781	784	java/lang/Exception
  }
  
  private <T> T deserializeFragment(Zb paramZb, Class<T> paramClass, String paramString1, String paramString2) {
    // Byte code:
    //   0: new net/portswigger/swagger/v2/util/OpenAPIDeserializer
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: new net/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #6
    //   18: aconst_null
    //   19: astore #7
    //   21: aload_2
    //   22: ldc net/portswigger/swagger/v3/oas/models/media/Schema
    //   24: invokevirtual equals : (Ljava/lang/Object;)Z
    //   27: ifeq -> 55
    //   30: aload #5
    //   32: aload_1
    //   33: checkcast com/fasterxml/Zg/Zr
    //   36: aload #4
    //   38: ldc '/'
    //   40: ldc '.'
    //   42: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   45: aload #6
    //   47: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   50: astore #7
    //   52: goto -> 358
    //   55: aload_2
    //   56: ldc net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 89
    //   64: aload #5
    //   66: aload_1
    //   67: checkcast com/fasterxml/Zg/Zr
    //   70: aload #4
    //   72: ldc '/'
    //   74: ldc '.'
    //   76: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   79: aload #6
    //   81: invokevirtual getRequestBody : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   84: astore #7
    //   86: goto -> 358
    //   89: aload_2
    //   90: ldc net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   92: invokevirtual equals : (Ljava/lang/Object;)Z
    //   95: ifeq -> 123
    //   98: aload #5
    //   100: aload_1
    //   101: checkcast com/fasterxml/Zg/Zr
    //   104: aload #4
    //   106: ldc '/'
    //   108: ldc '.'
    //   110: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   113: aload #6
    //   115: invokevirtual getResponse : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;
    //   118: astore #7
    //   120: goto -> 358
    //   123: aload_2
    //   124: ldc net/portswigger/swagger/v3/oas/models/callbacks/Callback
    //   126: invokevirtual equals : (Ljava/lang/Object;)Z
    //   129: ifeq -> 157
    //   132: aload #5
    //   134: aload_1
    //   135: checkcast com/fasterxml/Zg/Zr
    //   138: aload #4
    //   140: ldc '/'
    //   142: ldc '.'
    //   144: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   147: aload #6
    //   149: invokevirtual getCallback : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/callbacks/Callback;
    //   152: astore #7
    //   154: goto -> 358
    //   157: aload_2
    //   158: ldc net/portswigger/swagger/v3/oas/models/examples/Example
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 191
    //   166: aload #5
    //   168: aload_1
    //   169: checkcast com/fasterxml/Zg/Zr
    //   172: aload #4
    //   174: ldc '/'
    //   176: ldc '.'
    //   178: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   181: aload #6
    //   183: invokevirtual getExample : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/examples/Example;
    //   186: astore #7
    //   188: goto -> 358
    //   191: aload_2
    //   192: ldc net/portswigger/swagger/v3/oas/models/headers/Header
    //   194: invokevirtual equals : (Ljava/lang/Object;)Z
    //   197: ifeq -> 225
    //   200: aload #5
    //   202: aload_1
    //   203: checkcast com/fasterxml/Zg/Zr
    //   206: aload #4
    //   208: ldc '/'
    //   210: ldc '.'
    //   212: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   215: aload #6
    //   217: invokevirtual getHeader : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/headers/Header;
    //   220: astore #7
    //   222: goto -> 358
    //   225: aload_2
    //   226: ldc net/portswigger/swagger/v3/oas/models/links/Link
    //   228: invokevirtual equals : (Ljava/lang/Object;)Z
    //   231: ifeq -> 259
    //   234: aload #5
    //   236: aload_1
    //   237: checkcast com/fasterxml/Zg/Zr
    //   240: aload #4
    //   242: ldc '/'
    //   244: ldc '.'
    //   246: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   249: aload #6
    //   251: invokevirtual getLink : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/links/Link;
    //   254: astore #7
    //   256: goto -> 358
    //   259: aload_2
    //   260: ldc net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   262: invokevirtual equals : (Ljava/lang/Object;)Z
    //   265: ifeq -> 293
    //   268: aload #5
    //   270: aload_1
    //   271: checkcast com/fasterxml/Zg/Zr
    //   274: aload #4
    //   276: ldc '/'
    //   278: ldc '.'
    //   280: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   283: aload #6
    //   285: invokevirtual getParameter : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;
    //   288: astore #7
    //   290: goto -> 358
    //   293: aload_2
    //   294: ldc net/portswigger/swagger/v3/oas/models/security/SecurityScheme
    //   296: invokevirtual equals : (Ljava/lang/Object;)Z
    //   299: ifeq -> 327
    //   302: aload #5
    //   304: aload_1
    //   305: checkcast com/fasterxml/Zg/Zr
    //   308: aload #4
    //   310: ldc '/'
    //   312: ldc '.'
    //   314: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   317: aload #6
    //   319: invokevirtual getSecurityScheme : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme;
    //   322: astore #7
    //   324: goto -> 358
    //   327: aload_2
    //   328: ldc net/portswigger/swagger/v3/oas/models/PathItem
    //   330: invokevirtual equals : (Ljava/lang/Object;)Z
    //   333: ifeq -> 358
    //   336: aload #5
    //   338: aload_1
    //   339: checkcast com/fasterxml/Zg/Zr
    //   342: aload #4
    //   344: ldc '/'
    //   346: ldc '.'
    //   348: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   351: aload #6
    //   353: invokevirtual getPathItem : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/PathItem;
    //   356: astore #7
    //   358: aload #6
    //   360: invokevirtual getMessages : ()Ljava/util/List;
    //   363: aload_0
    //   364: aload_3
    //   365: <illegal opcode> accept : (Lnet/portswigger/swagger/v3/parser/ResolverCache;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   370: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   375: aload #7
    //   377: ifnull -> 387
    //   380: aload #7
    //   382: areturn
    //   383: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   386: athrow
    //   387: aload_1
    //   388: aload_3
    //   389: aload_2
    //   390: invokestatic deserialize : (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   393: areturn
    // Exception table:
    //   from	to	target	type
    //   358	383	383	java/lang/RuntimeException
  }
  
  protected <T> void updateLocalRefs(String paramString, T paramT) {
    int i = ZL();
    if (paramT instanceof Parameter) {
      Parameter parameter = (Parameter)paramT;
      try {
        if (parameter.getSchema() != null)
          updateLocalRefs(paramString, parameter.getSchema()); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (paramT instanceof Schema && ((Schema)paramT).get$ref() != null) {
        Schema schema = (Schema)paramT;
        try {
          updateLocalRefs(paramString, schema);
          if (i == 0) {
            if (paramT instanceof Schema) {
              schema = (Schema)paramT;
              updateLocalRefs(paramString, schema);
            } 
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (paramT instanceof Schema) {
      Schema schema = (Schema)paramT;
      updateLocalRefs(paramString, schema);
    } 
  }
  
  protected <T> void updateLocalRefs(String paramString, Schema paramSchema) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: invokevirtual get$ref : ()Ljava/lang/String;
    //   8: ifnull -> 32
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual get$ref : ()Ljava/lang/String;
    //   17: invokevirtual merge : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   20: astore #4
    //   22: aload_2
    //   23: aload #4
    //   25: invokevirtual set$ref : (Ljava/lang/String;)V
    //   28: iload_3
    //   29: ifeq -> 99
    //   32: aload_2
    //   33: invokevirtual getProperties : ()Ljava/util/Map;
    //   36: ifnull -> 99
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: aload_2
    //   47: invokevirtual getProperties : ()Ljava/util/Map;
    //   50: astore #4
    //   52: aload #4
    //   54: invokeinterface values : ()Ljava/util/Collection;
    //   59: invokeinterface iterator : ()Ljava/util/Iterator;
    //   64: astore #5
    //   66: aload #5
    //   68: invokeinterface hasNext : ()Z
    //   73: ifeq -> 99
    //   76: aload #5
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   86: astore #6
    //   88: aload_0
    //   89: aload_1
    //   90: aload #6
    //   92: invokevirtual updateLocalRefs : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   95: iload_3
    //   96: ifeq -> 66
    //   99: return
    // Exception table:
    //   from	to	target	type
    //   22	39	42	java/lang/RuntimeException
  }
  
  protected String merge(String paramString1, String paramString2) {
    try {
      if (StringUtils.isBlank(paramString1))
        return paramString2; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramString2.startsWith(a(27981, -22465)))
        try {
          if (!paramString2.startsWith(a(27985, -15045))) {
            try {
              if (!paramString1.startsWith(a(27978, -11342)))
                try {
                  if (!paramString1.startsWith(a(28008, 32096)))
                    try {
                      if (!paramString2.startsWith(a(27987, -15263)))
                        return paramString2; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
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
  
  private Object loadInternalRef(String paramString) {
    Object object = null;
    if (paramString.startsWith(a(27992, 21303))) {
      object = getFromMap(paramString, (Map)this.openApi.getPaths(), PATHS_PATTERN);
    } else {
      try {
        if (this.openApi.getComponents() != null)
          if (paramString.startsWith(a(27999, 27873))) {
            object = getFromMap(paramString, this.openApi.getComponents().getSchemas(), SCHEMAS_PATTERN);
          } else if (paramString.startsWith(a(27986, -16073))) {
            object = getFromMap(paramString, this.openApi.getComponents().getRequestBodies(), REQUEST_BODIES_PATTERN);
          } else if (paramString.startsWith(a(27997, -2792))) {
            object = getFromMap(paramString, this.openApi.getComponents().getExamples(), EXAMPLES_PATTERN);
          } else if (paramString.startsWith(a(27991, -16392))) {
            object = getFromMap(paramString, this.openApi.getComponents().getResponses(), RESPONSES_PATTERN);
          } else if (paramString.startsWith(a(27984, -8372))) {
            object = getFromMap(paramString, this.openApi.getComponents().getParameters(), PARAMETERS_PATTERN);
          } else if (paramString.startsWith(a(27988, 16964))) {
            object = getFromMap(paramString, this.openApi.getComponents().getLinks(), LINKS_PATTERN);
          } else if (paramString.startsWith(a(27972, -8372))) {
            object = getFromMap(paramString, this.openApi.getComponents().getHeaders(), HEADERS_PATTERN);
          } else if (paramString.startsWith(a(27971, 18906))) {
            object = getFromMap(paramString, this.openApi.getComponents().getCallbacks(), CALLBACKS_PATTERN);
          } else if (paramString.startsWith(a(27990, 7649))) {
            object = getFromMap(paramString, this.openApi.getComponents().getSecuritySchemes(), SECURITY_SCHEMES);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return object;
  }
  
  private String unescapePointer(String paramString) {
    try {
      paramString = URLDecoder.decode(paramString, a(27975, 9546));
    } catch (UnsupportedEncodingException unsupportedEncodingException) {}
    paramString = paramString.replaceAll(a(27968, 17958), "/");
    return paramString.replaceAll(a(27973, -11795), "~");
  }
  
  private Object getFromMap(String paramString, Map paramMap, Pattern paramPattern) {
    Matcher matcher = paramPattern.matcher(paramString);
    if (matcher.matches()) {
      String str = unescapePointer(matcher.group(a(28012, -12580)));
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
  
  public ParseOptions getParseOptions() {
    return this.parseOptions;
  }
  
  private void lambda$deserializeFragment$0(String paramString1, String paramString2) {
    this.resolveValidationMessages.add(paramString2 + paramString2 + a(28013, -17953) + paramString1);
  }
  
  static {
    // Byte code:
    //   0: bipush #38
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: bipush #28
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc '÷\®¯MoÉè7)"u)4ô7!\\b;æe$ÐÂÁZÔW4¼qã¸ÀR%#V«ô¬\c£/JºG8WN`Î¤EÑ«J*Ú\\r)LLnútùò¥¹wïsÔÉô\\r(Uî½6þ×i£]Üþ)å:\\tç­ï=íûI<Åz_)Ëå·ÄC¿æ'¹ï\\rÊ'DÎQc}ó\¦ÛG&ÂK,ø¹w¬CA÷©w\¾4Àm·[H\ÀQ97­º&£ÏÖ®Å_¶DÆ;1r'G<r¿+ü_¨m^\\rG²`FK:[lÍ}ÏÑí\\fµhh)?ìFét}µÀ\\tQ«-ùµI³{Ïø²ÔëØÓ¹gNõÅ¬ÚøÏ+L \öD°:F_JàH¹©¤YTïKÇ^~oþÏ;¯NäMù¢c&'dhãöÖéuôA«rn+Æ_ïm¶\\rZ²ÃF?<Þz\\b¥ cf|\\bßhaÊð\\t:ðÆÓÙ½ýñ7.¢5Ë\\tò¤i\\fløç·zaÇù#ZoqÚ¨µ¥Y¤m`§ñ`Ît¯@Ü¢¸;lh)£¯o¢ØÑ·+ ¥;ÖärT?îÖ»Bù #x{Tvo'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: iconst_5
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic Zx : (I)V
    //   27: bipush #78
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '/Ö\\r­2VÏ{|¬ÛÕèYìÓE&-#I*O'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #22
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #62
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic net/portswigger/swagger/v3/parser/ResolverCache.a : [Ljava/lang/String;
    //   136: bipush #38
    //   138: anewarray java/lang/String
    //   141: putstatic net/portswigger/swagger/v3/parser/ResolverCache.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #20
    //   218: goto -> 248
    //   221: bipush #72
    //   223: goto -> 248
    //   226: bipush #68
    //   228: goto -> 248
    //   231: bipush #32
    //   233: goto -> 248
    //   236: bipush #87
    //   238: goto -> 248
    //   241: bipush #70
    //   243: goto -> 248
    //   246: bipush #68
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   307: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   310: ldc '^'
    //   312: swap
    //   313: sipush #27983
    //   316: sipush #1139
    //   319: invokestatic a : (II)Ljava/lang/String;
    //   322: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   327: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   330: putstatic net/portswigger/swagger/v3/parser/ResolverCache.SCHEMAS_PATTERN : Ljava/util/regex/Pattern;
    //   333: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   336: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   339: ldc '^'
    //   341: swap
    //   342: sipush #27979
    //   345: sipush #-8408
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   356: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   359: putstatic net/portswigger/swagger/v3/parser/ResolverCache.RESPONSES_PATTERN : Ljava/util/regex/Pattern;
    //   362: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   365: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   368: ldc '^'
    //   370: swap
    //   371: sipush #28009
    //   374: sipush #-19825
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   385: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   388: putstatic net/portswigger/swagger/v3/parser/ResolverCache.PARAMETERS_PATTERN : Ljava/util/regex/Pattern;
    //   391: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   394: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   397: ldc '^'
    //   399: swap
    //   400: sipush #27989
    //   403: sipush #-4932
    //   406: invokestatic a : (II)Ljava/lang/String;
    //   409: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   414: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   417: putstatic net/portswigger/swagger/v3/parser/ResolverCache.REQUEST_BODIES_PATTERN : Ljava/util/regex/Pattern;
    //   420: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   423: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   426: ldc '^'
    //   428: swap
    //   429: sipush #27993
    //   432: sipush #16295
    //   435: invokestatic a : (II)Ljava/lang/String;
    //   438: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   443: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   446: putstatic net/portswigger/swagger/v3/parser/ResolverCache.EXAMPLES_PATTERN : Ljava/util/regex/Pattern;
    //   449: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   452: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   455: ldc '^'
    //   457: swap
    //   458: sipush #27982
    //   461: sipush #31490
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   472: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   475: putstatic net/portswigger/swagger/v3/parser/ResolverCache.LINKS_PATTERN : Ljava/util/regex/Pattern;
    //   478: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   481: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   484: ldc '^'
    //   486: swap
    //   487: sipush #27970
    //   490: sipush #20814
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   501: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   504: putstatic net/portswigger/swagger/v3/parser/ResolverCache.CALLBACKS_PATTERN : Ljava/util/regex/Pattern;
    //   507: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   510: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   513: ldc '^'
    //   515: swap
    //   516: sipush #27976
    //   519: sipush #-28672
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   530: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   533: putstatic net/portswigger/swagger/v3/parser/ResolverCache.HEADERS_PATTERN : Ljava/util/regex/Pattern;
    //   536: getstatic net/portswigger/swagger/v3/parser/models/RefType.COMPONENTS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   539: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   542: ldc '^'
    //   544: swap
    //   545: sipush #27977
    //   548: sipush #-25924
    //   551: invokestatic a : (II)Ljava/lang/String;
    //   554: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   559: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   562: putstatic net/portswigger/swagger/v3/parser/ResolverCache.SECURITY_SCHEMES : Ljava/util/regex/Pattern;
    //   565: getstatic net/portswigger/swagger/v3/parser/models/RefType.PATH : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   568: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   571: ldc '^'
    //   573: swap
    //   574: sipush #27995
    //   577: sipush #7874
    //   580: invokestatic a : (II)Ljava/lang/String;
    //   583: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   588: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   591: putstatic net/portswigger/swagger/v3/parser/ResolverCache.PATHS_PATTERN : Ljava/util/regex/Pattern;
    //   594: return
  }
  
  public static void Zx(int paramInt) {
    ZA = paramInt;
  }
  
  public static int ZL() {
    return ZA;
  }
  
  public static int Zv() {
    int i = ZL();
    try {
      if (i == 0)
        return 54; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6D4D) & 0xFFFF;
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
      byte b1 = 98;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\ResolverCache.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */