package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import com.fasterxml.Zg.Zb;
import com.fasterxml.Zg.Zfr;
import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zy6;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;
import java.text.ParseException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.swagger.StringUtils;
import net.portswigger.swagger.v1.util.Json;
import net.portswigger.swagger.v2.ParseOptions;
import net.portswigger.swagger.v2.SwaggerParseResult;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.ExternalDocumentation;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.info.Contact;
import net.portswigger.swagger.v3.oas.models.info.Info;
import net.portswigger.swagger.v3.oas.models.info.License;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.ByteArraySchema;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.DateSchema;
import net.portswigger.swagger.v3.oas.models.media.DateTimeSchema;
import net.portswigger.swagger.v3.oas.models.media.Discriminator;
import net.portswigger.swagger.v3.oas.models.media.Encoding;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.media.XML;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.oas.models.security.OAuthFlow;
import net.portswigger.swagger.v3.oas.models.security.OAuthFlows;
import net.portswigger.swagger.v3.oas.models.security.SecurityRequirement;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;
import net.portswigger.swagger.v3.oas.models.servers.Server;
import net.portswigger.swagger.v3.oas.models.servers.ServerVariable;
import net.portswigger.swagger.v3.oas.models.servers.ServerVariables;
import net.portswigger.swagger.v3.oas.models.tags.Tag;
import net.portswigger.swagger.v3.parser.RefUtils;
import net.portswigger.swagger.v3.parser.extensions.JsonSchemaParserExtension;

public class OpenAPIDeserializer {
  protected static Set<String> JSON_SCHEMA_2020_12_TYPES;
  
  protected static Set<String> ROOT_KEYS;
  
  protected static Set<String> INFO_KEYS;
  
  protected static Set<String> CONTACT_KEYS;
  
  protected static Set<String> LICENSE_KEYS;
  
  protected static Set<String> TAG_KEYS;
  
  protected static Set<String> RESPONSE_KEYS;
  
  protected static Set<String> SERVER_KEYS;
  
  protected static Set<String> SERVER_VARIABLE_KEYS;
  
  protected static Set<String> PATHITEM_KEYS;
  
  protected static Set<String> OPERATION_KEYS;
  
  protected static Set<String> PARAMETER_KEYS;
  
  protected static Set<String> REQUEST_BODY_KEYS;
  
  protected static Set<String> SECURITY_SCHEME_KEYS;
  
  protected static Set<String> EXTERNAL_DOCS_KEYS;
  
  protected static Set<String> COMPONENTS_KEYS;
  
  protected static Set<String> SCHEMA_KEYS;
  
  protected static Set<String> EXAMPLE_KEYS;
  
  protected static Set<String> HEADER_KEYS;
  
  protected static Set<String> LINK_KEYS;
  
  protected static Set<String> MEDIATYPE_KEYS;
  
  protected static Set<String> XML_KEYS;
  
  protected static Set<String> OAUTHFLOW_KEYS;
  
  protected static Set<String> OAUTHFLOWS_KEYS;
  
  protected static Set<String> ENCODING_KEYS;
  
  protected static Set<String> ROOT_KEYS_31;
  
  protected static Set<String> RESERVED_KEYWORDS_31;
  
  protected static Set<String> INFO_KEYS_31;
  
  protected static Set<String> CONTACT_KEYS_31;
  
  protected static Set<String> LICENSE_KEYS_31;
  
  protected static Set<String> TAG_KEYS_31;
  
  protected static Set<String> RESPONSE_KEYS_31;
  
  protected static Set<String> SERVER_KEYS_31;
  
  protected static Set<String> SERVER_VARIABLE_KEYS_31;
  
  protected static Set<String> PATHITEM_KEYS_31;
  
  protected static Set<String> OPERATION_KEYS_31;
  
  protected static Set<String> PARAMETER_KEYS_31;
  
  protected static Set<String> REQUEST_BODY_KEYS_31;
  
  protected static Set<String> SECURITY_SCHEME_KEYS_31;
  
  protected static Set<String> EXTERNAL_DOCS_KEYS_31;
  
  protected static Set<String> COMPONENTS_KEYS_31;
  
  protected static Set<String> SCHEMA_KEYS_31;
  
  protected static Set<String> EXAMPLE_KEYS_31;
  
  protected static Set<String> HEADER_KEYS_31;
  
  protected static Set<String> LINK_KEYS_31;
  
  protected static Set<String> MEDIATYPE_KEYS_31;
  
  protected static Set<String> XML_KEYS_31;
  
  protected static Set<String> OAUTHFLOW_KEYS_31;
  
  protected static Set<String> OAUTHFLOWS_KEYS_31;
  
  protected static Set<String> ENCODING_KEYS_31;
  
  protected static Map<String, Map<String, Set<String>>> KEYS;
  
  protected static Set<Zfr> validNodeTypes;
  
  private static final String QUERY_PARAMETER;
  
  private static final String COOKIE_PARAMETER;
  
  private static final String PATH_PARAMETER;
  
  private static final String HEADER_PARAMETER;
  
  private static final Pattern RFC3339_DATE_TIME_PATTERN;
  
  private static final Pattern RFC3339_DATE_PATTERN;
  
  private static final String REFERENCE_SEPARATOR;
  
  private static final int MAX_EXTENSION_ENTRIES = 20;
  
  private static final Map<ClassLoader, List<JsonSchemaParserExtension>> jsonSchemaParserExtensionMap;
  
  private Components components;
  
  private Zb rootNode;
  
  private Map<String, Object> rootMap;
  
  private String basePath;
  
  private final Set<String> operationIDs = new HashSet<>();
  
  private Map<String, String> localSchemaRefs = new HashMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public SwaggerParseResult deserialize(Zb paramZb) {
    return deserialize(paramZb, null);
  }
  
  public SwaggerParseResult deserialize(Zb paramZb, String paramString) {
    return deserialize(paramZb, paramString, new ParseOptions());
  }
  
  public SwaggerParseResult deserialize(Zb paramZb, String paramString, ParseOptions paramParseOptions) {
    return deserialize(paramZb, paramString, new ParseOptions(), false);
  }
  
  public SwaggerParseResult deserialize(Zb paramZb, String paramString, ParseOptions paramParseOptions, boolean paramBoolean) {
    this.basePath = paramString;
    this.rootNode = paramZb;
    this.rootMap = (Map<String, Object>)(new Zy6()).Zb(paramZb, Map.class);
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    SwaggerParseResult swaggerParseResult = new SwaggerParseResult();
    try {
      OpenAPIDeserializer$ParseResult openAPIDeserializer$ParseResult = new OpenAPIDeserializer$ParseResult();
      openAPIDeserializer$ParseResult.setOaiAuthor(paramParseOptions.isOaiAuthor());
      openAPIDeserializer$ParseResult.setInferSchemaType(paramParseOptions.isInferSchemaType());
      openAPIDeserializer$ParseResult.setAllowEmptyStrings(paramParseOptions.isAllowEmptyString());
      openAPIDeserializer$ParseResult.setValidateInternalRefs(paramParseOptions.isValidateInternalRefs());
      OpenAPI openAPI = parseRoot(paramZb, openAPIDeserializer$ParseResult, paramString);
      swaggerParseResult.setOpenAPI(openAPI);
      swaggerParseResult.setMessages(openAPIDeserializer$ParseResult.getMessages());
    } catch (Exception exception) {
      try {
        if (!StringUtils.isBlank(exception.getMessage())) {
          try {
            swaggerParseResult.setMessages(Arrays.asList(new String[] { exception.getMessage() }));
            if (arrayOfZbqc == null)
              swaggerParseResult.setMessages(Arrays.asList(new String[] { a(-7332, 23315) })); 
          } catch (Exception exception1) {
            throw a(null);
          } 
          return swaggerParseResult;
        } 
      } catch (Exception exception1) {
        throw a(null);
      } 
      swaggerParseResult.setMessages(Arrays.asList(new String[] { a(-7332, 23315) }));
    } 
    return swaggerParseResult;
  }
  
  public OpenAPI parseRoot(Zb paramZb, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: ldc ''
    //   5: astore #5
    //   7: astore #4
    //   9: new net/portswigger/swagger/v3/oas/models/OpenAPI
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #6
    //   18: aload_1
    //   19: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   22: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 1167
    //   31: aload_1
    //   32: checkcast com/fasterxml/Zg/Zr
    //   35: astore #7
    //   37: aload_0
    //   38: sipush #-7368
    //   41: sipush #-12912
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: aload #7
    //   49: iconst_1
    //   50: aload #5
    //   52: aload_2
    //   53: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   56: astore #8
    //   58: aload #8
    //   60: ifnull -> 97
    //   63: aload #8
    //   65: sipush #-7591
    //   68: sipush #-29914
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   77: ifne -> 99
    //   80: aload #8
    //   82: sipush #-7583
    //   85: sipush #-30425
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   94: ifne -> 99
    //   97: aconst_null
    //   98: areturn
    //   99: aload #8
    //   101: sipush #-7538
    //   104: sipush #-21407
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   113: ifeq -> 130
    //   116: aload_2
    //   117: iconst_1
    //   118: invokevirtual openapi31 : (Z)Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;
    //   121: pop
    //   122: aload #6
    //   124: getstatic net/portswigger/swagger/v3/oas/models/SpecVersion.V31 : Lnet/portswigger/swagger/v3/oas/models/SpecVersion;
    //   127: invokevirtual setSpecVersion : (Lnet/portswigger/swagger/v3/oas/models/SpecVersion;)V
    //   130: aload #8
    //   132: sipush #-7381
    //   135: sipush #-19709
    //   138: invokestatic a : (II)Ljava/lang/String;
    //   141: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   144: ifne -> 179
    //   147: aload #8
    //   149: sipush #-7206
    //   152: sipush #-10774
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   161: ifne -> 179
    //   164: aload_2
    //   165: aload #5
    //   167: sipush #-7366
    //   170: sipush #-16349
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   179: aload #6
    //   181: aload #8
    //   183: invokevirtual setOpenapi : (Ljava/lang/String;)V
    //   186: aload_0
    //   187: sipush #-7336
    //   190: sipush #-3897
    //   193: invokestatic a : (II)Ljava/lang/String;
    //   196: aload #7
    //   198: iconst_1
    //   199: aload #5
    //   201: aload_2
    //   202: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   205: astore #9
    //   207: aload #9
    //   209: ifnull -> 237
    //   212: aload_0
    //   213: aload #9
    //   215: sipush #-7336
    //   218: sipush #-3897
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: aload_2
    //   225: invokevirtual getInfo : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/info/Info;
    //   228: astore #10
    //   230: aload #6
    //   232: aload #10
    //   234: invokevirtual setInfo : (Lnet/portswigger/swagger/v3/oas/models/info/Info;)V
    //   237: aload_0
    //   238: sipush #-7303
    //   241: sipush #-32569
    //   244: invokestatic a : (II)Ljava/lang/String;
    //   247: aload #7
    //   249: iconst_0
    //   250: aload #5
    //   252: aload_2
    //   253: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   256: astore #9
    //   258: aload #9
    //   260: ifnull -> 423
    //   263: aload_0
    //   264: aload #9
    //   266: sipush #-7303
    //   269: sipush #-32569
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: aload_2
    //   276: invokevirtual getComponents : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   279: astore #10
    //   281: aload #6
    //   283: aload #10
    //   285: invokevirtual setComponents : (Lnet/portswigger/swagger/v3/oas/models/Components;)V
    //   288: aload_0
    //   289: aload #10
    //   291: putfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   294: aload_2
    //   295: getfield validateInternalRefs : Z
    //   298: ifeq -> 423
    //   301: aload_0
    //   302: getfield localSchemaRefs : Ljava/util/Map;
    //   305: invokeinterface keySet : ()Ljava/util/Set;
    //   310: invokeinterface iterator : ()Ljava/util/Iterator;
    //   315: astore #11
    //   317: aload #11
    //   319: invokeinterface hasNext : ()Z
    //   324: ifeq -> 423
    //   327: aload #11
    //   329: invokeinterface next : ()Ljava/lang/Object;
    //   334: checkcast java/lang/String
    //   337: astore #12
    //   339: aload #10
    //   341: invokevirtual getSchemas : ()Ljava/util/Map;
    //   344: ifnonnull -> 372
    //   347: aload_2
    //   348: aload_0
    //   349: getfield localSchemaRefs : Ljava/util/Map;
    //   352: aload #12
    //   354: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   359: checkcast java/lang/String
    //   362: aload #12
    //   364: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   367: aload #4
    //   369: ifnonnull -> 418
    //   372: aload #10
    //   374: invokevirtual getSchemas : ()Ljava/util/Map;
    //   377: aload #12
    //   379: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   384: ifnonnull -> 418
    //   387: aload_2
    //   388: aload_0
    //   389: getfield localSchemaRefs : Ljava/util/Map;
    //   392: aload #12
    //   394: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   399: checkcast java/lang/String
    //   402: aload #12
    //   404: sipush #-7384
    //   407: sipush #2478
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: aload #7
    //   415: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   418: aload #4
    //   420: ifnonnull -> 317
    //   423: iconst_1
    //   424: istore #10
    //   426: aload_2
    //   427: invokevirtual isOpenapi31 : ()Z
    //   430: ifeq -> 436
    //   433: iconst_0
    //   434: istore #10
    //   436: aload_0
    //   437: sipush #-7299
    //   440: sipush #26635
    //   443: invokestatic a : (II)Ljava/lang/String;
    //   446: aload #7
    //   448: iload #10
    //   450: aload #5
    //   452: aload_2
    //   453: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   456: astore #9
    //   458: aload #9
    //   460: ifnull -> 488
    //   463: aload_0
    //   464: aload #9
    //   466: sipush #-7299
    //   469: sipush #26635
    //   472: invokestatic a : (II)Ljava/lang/String;
    //   475: aload_2
    //   476: invokevirtual getPaths : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Paths;
    //   479: astore #11
    //   481: aload #6
    //   483: aload #11
    //   485: invokevirtual setPaths : (Lnet/portswigger/swagger/v3/oas/models/Paths;)V
    //   488: aload_0
    //   489: sipush #-7308
    //   492: sipush #-11859
    //   495: invokestatic a : (II)Ljava/lang/String;
    //   498: aload #7
    //   500: iconst_0
    //   501: aload #5
    //   503: aload_2
    //   504: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   507: astore #11
    //   509: aload #11
    //   511: ifnull -> 573
    //   514: aload #11
    //   516: invokevirtual Zv : ()I
    //   519: ifle -> 573
    //   522: aload #6
    //   524: aload_0
    //   525: aload #11
    //   527: sipush #-7674
    //   530: sipush #9134
    //   533: invokestatic a : (II)Ljava/lang/String;
    //   536: iconst_2
    //   537: anewarray java/lang/Object
    //   540: dup
    //   541: iconst_0
    //   542: aload #5
    //   544: aastore
    //   545: dup
    //   546: iconst_1
    //   547: sipush #-7308
    //   550: sipush #-11859
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: aastore
    //   557: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   560: aload_2
    //   561: aload_3
    //   562: invokevirtual getServersList : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;)Ljava/util/List;
    //   565: invokevirtual setServers : (Ljava/util/List;)V
    //   568: aload #4
    //   570: ifnonnull -> 615
    //   573: new net/portswigger/swagger/v3/oas/models/servers/Server
    //   576: dup
    //   577: invokespecial <init> : ()V
    //   580: astore #12
    //   582: aload #12
    //   584: ldc '/'
    //   586: invokevirtual setUrl : (Ljava/lang/String;)V
    //   589: new java/util/ArrayList
    //   592: dup
    //   593: invokespecial <init> : ()V
    //   596: astore #13
    //   598: aload #13
    //   600: aload #12
    //   602: invokeinterface add : (Ljava/lang/Object;)Z
    //   607: pop
    //   608: aload #6
    //   610: aload #13
    //   612: invokevirtual setServers : (Ljava/util/List;)V
    //   615: aload_0
    //   616: sipush #-7399
    //   619: sipush #-12918
    //   622: invokestatic a : (II)Ljava/lang/String;
    //   625: aload #7
    //   627: iconst_0
    //   628: aload #5
    //   630: aload_2
    //   631: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   634: astore #9
    //   636: aload #9
    //   638: ifnull -> 666
    //   641: aload_0
    //   642: aload #9
    //   644: sipush #-7399
    //   647: sipush #-12918
    //   650: invokestatic a : (II)Ljava/lang/String;
    //   653: aload_2
    //   654: invokevirtual getExternalDocs : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;
    //   657: astore #12
    //   659: aload #6
    //   661: aload #12
    //   663: invokevirtual setExternalDocs : (Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;)V
    //   666: aload_0
    //   667: sipush #-7222
    //   670: sipush #12152
    //   673: invokestatic a : (II)Ljava/lang/String;
    //   676: aload #7
    //   678: iconst_0
    //   679: aload #5
    //   681: aload_2
    //   682: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   685: astore #11
    //   687: aload #11
    //   689: ifnull -> 721
    //   692: aload #11
    //   694: invokevirtual Zv : ()I
    //   697: ifle -> 721
    //   700: aload #6
    //   702: aload_0
    //   703: aload #11
    //   705: sipush #-7222
    //   708: sipush #12152
    //   711: invokestatic a : (II)Ljava/lang/String;
    //   714: aload_2
    //   715: invokevirtual getTagList : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/List;
    //   718: invokevirtual setTags : (Ljava/util/List;)V
    //   721: aload_0
    //   722: sipush #-7424
    //   725: sipush #-12592
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: aload #7
    //   733: iconst_0
    //   734: aload #5
    //   736: aload_2
    //   737: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   740: astore #11
    //   742: aload #11
    //   744: ifnull -> 795
    //   747: aload #11
    //   749: invokevirtual Zv : ()I
    //   752: ifle -> 795
    //   755: aload_0
    //   756: aload #11
    //   758: sipush #-7424
    //   761: sipush #-12592
    //   764: invokestatic a : (II)Ljava/lang/String;
    //   767: aload_2
    //   768: invokevirtual getSecurityRequirementsList : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/List;
    //   771: astore #12
    //   773: aload #12
    //   775: ifnull -> 795
    //   778: aload #12
    //   780: invokeinterface size : ()I
    //   785: ifle -> 795
    //   788: aload #6
    //   790: aload #12
    //   792: invokevirtual setSecurity : (Ljava/util/List;)V
    //   795: aload_2
    //   796: invokevirtual isOpenapi31 : ()Z
    //   799: ifeq -> 853
    //   802: aload_0
    //   803: sipush #-7576
    //   806: sipush #-23678
    //   809: invokestatic a : (II)Ljava/lang/String;
    //   812: aload #7
    //   814: iconst_0
    //   815: aload #5
    //   817: aload_2
    //   818: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   821: astore #9
    //   823: aload #9
    //   825: ifnull -> 853
    //   828: aload_0
    //   829: aload #9
    //   831: sipush #-7576
    //   834: sipush #-23678
    //   837: invokestatic a : (II)Ljava/lang/String;
    //   840: aload_2
    //   841: invokevirtual getWebhooks : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/Map;
    //   844: astore #12
    //   846: aload #6
    //   848: aload #12
    //   850: invokevirtual setWebhooks : (Ljava/util/Map;)V
    //   853: aload_0
    //   854: aload #7
    //   856: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   859: astore #12
    //   861: aload #12
    //   863: ifnull -> 883
    //   866: aload #12
    //   868: invokeinterface size : ()I
    //   873: ifle -> 883
    //   876: aload #6
    //   878: aload #12
    //   880: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   883: aload_2
    //   884: invokevirtual isOpenapi31 : ()Z
    //   887: ifeq -> 960
    //   890: aload_0
    //   891: sipush #-7619
    //   894: sipush #32614
    //   897: invokestatic a : (II)Ljava/lang/String;
    //   900: aload #7
    //   902: iconst_0
    //   903: aload #5
    //   905: aload_2
    //   906: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   909: astore #8
    //   911: aload #8
    //   913: ifnull -> 960
    //   916: aload_0
    //   917: aload #8
    //   919: invokevirtual isValidURI : (Ljava/lang/String;)Z
    //   922: ifeq -> 937
    //   925: aload #6
    //   927: aload #8
    //   929: invokevirtual setJsonSchemaDialect : (Ljava/lang/String;)V
    //   932: aload #4
    //   934: ifnonnull -> 960
    //   937: aload_2
    //   938: aload #5
    //   940: aload #8
    //   942: sipush #-7440
    //   945: sipush #-30447
    //   948: invokestatic a : (II)Ljava/lang/String;
    //   951: swap
    //   952: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   957: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   960: aload_2
    //   961: invokevirtual isOpenapi31 : ()Z
    //   964: ifeq -> 1006
    //   967: aload #6
    //   969: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   972: ifnonnull -> 1006
    //   975: aload #6
    //   977: invokevirtual getPaths : ()Lnet/portswigger/swagger/v3/oas/models/Paths;
    //   980: ifnonnull -> 1006
    //   983: aload #6
    //   985: invokevirtual getWebhooks : ()Ljava/util/Map;
    //   988: ifnonnull -> 1006
    //   991: aload_2
    //   992: aload #5
    //   994: sipush #-7430
    //   997: sipush #12376
    //   1000: invokestatic a : (II)Ljava/lang/String;
    //   1003: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   1006: aload_0
    //   1007: aload #7
    //   1009: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1012: astore #13
    //   1014: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   1017: aload_2
    //   1018: invokevirtual isOpenapi31 : ()Z
    //   1021: ifeq -> 1036
    //   1024: sipush #-7188
    //   1027: sipush #9260
    //   1030: invokestatic a : (II)Ljava/lang/String;
    //   1033: goto -> 1045
    //   1036: sipush #-7446
    //   1039: sipush #984
    //   1042: invokestatic a : (II)Ljava/lang/String;
    //   1045: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1050: checkcast java/util/Map
    //   1053: astore #14
    //   1055: aload #13
    //   1057: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1062: astore #15
    //   1064: aload #15
    //   1066: invokeinterface hasNext : ()Z
    //   1071: ifeq -> 1162
    //   1074: aload #15
    //   1076: invokeinterface next : ()Ljava/lang/Object;
    //   1081: checkcast java/lang/String
    //   1084: astore #16
    //   1086: aload #14
    //   1088: sipush #-7620
    //   1091: sipush #24276
    //   1094: invokestatic a : (II)Ljava/lang/String;
    //   1097: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1102: checkcast java/util/Set
    //   1105: aload #16
    //   1107: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1112: ifne -> 1146
    //   1115: aload #16
    //   1117: sipush #-7344
    //   1120: sipush #-28932
    //   1123: invokestatic a : (II)Ljava/lang/String;
    //   1126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1129: ifne -> 1146
    //   1132: aload_2
    //   1133: aload #5
    //   1135: aload #16
    //   1137: aload_1
    //   1138: aload #16
    //   1140: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1143: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1146: aload_0
    //   1147: aload #14
    //   1149: aload #16
    //   1151: aload #5
    //   1153: aload_2
    //   1154: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   1157: aload #4
    //   1159: ifnonnull -> 1064
    //   1162: aload #4
    //   1164: ifnonnull -> 1198
    //   1167: aload_2
    //   1168: aload #5
    //   1170: sipush #-7368
    //   1173: sipush #-12912
    //   1176: invokestatic a : (II)Ljava/lang/String;
    //   1179: sipush #-7362
    //   1182: sipush #25325
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: aload_1
    //   1189: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1192: aload_2
    //   1193: invokevirtual invalid : ()V
    //   1196: aconst_null
    //   1197: areturn
    //   1198: aload #6
    //   1200: areturn
  }
  
  boolean isValidURI(String paramString) {
    try {
      URI uRI = new URI(paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private void validateReservedKeywords(Map<String, Set<String>> paramMap, String paramString1, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    if (!paramOpenAPIDeserializer$ParseResult.isOaiAuthor() && paramOpenAPIDeserializer$ParseResult.isOpenapi31() && ((Set)paramMap.get(a(-7680, -21515))).stream().filter(paramString1::lambda$validateReservedKeywords$0).findAny().orElse(null) != null)
      paramOpenAPIDeserializer$ParseResult.reserved(paramString2, paramString1); 
  }
  
  public String mungedRef(String paramString) {
    return (!paramString.contains(":") && !paramString.startsWith("#") && !paramString.startsWith("/") && paramString.indexOf(".") > 0) ? (a(-7523, 17329) + a(-7523, 17329)) : null;
  }
  
  public Map<String, Object> getExtensions(Zr paramZr) {
    Map<String, Object> map = tryDirectExtensions(paramZr);
    if (map.isEmpty())
      map = tryUnwrapLookupExtensions(paramZr); 
    return map;
  }
  
  private Map<String, Object> tryUnwrapLookupExtensions(Zr paramZr) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Zb zb = paramZr.ZL(a(-7211, 31512));
    if (Objects.nonNull(zb) && Zfr.OBJECT.equals(paramZr.ZF())) {
      Zr zr = (Zr)zb;
      linkedHashMap.putAll(tryDirectExtensions(zr));
    } 
    return (Map)linkedHashMap;
  }
  
  private Map<String, Object> tryDirectExtensions(Zr paramZr) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      if (str.startsWith(a(-7344, -28932)))
        linkedHashMap.put(str, Json.mapper().Zb(paramZr.ZL(str), Object.class)); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public Components getComponents(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    Components components = new Components();
    Zr zr = getObject(a(-7408, -304), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setSchemas(getSchemas(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7494, -15342) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7175, -3187), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setResponses((Map)getResponses(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7536, -29376) }), paramOpenAPIDeserializer$ParseResult, true)); 
    if (paramOpenAPIDeserializer$ParseResult.isOpenapi31()) {
      zr = getObject(a(-7498, -13215), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
      if (zr != null)
        components.setPathItems(getPathItems(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7170, -21429) }), paramOpenAPIDeserializer$ParseResult, true)); 
    } 
    zr = getObject(a(-7195, 27709), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setParameters(getParameters(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7195, 27709) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7372, 30748), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setExamples(getExamples(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7372, 30748) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7228, -12582), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setRequestBodies(getRequestBodies(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7445, 7435) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7613, 15237), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setHeaders(getHeaders(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7613, 15237) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7454, 9675), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setSecuritySchemes(getSecuritySchemes(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7522, -11175) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7350, 22421), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setLinks(getLinks(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7350, 22421) }), paramOpenAPIDeserializer$ParseResult, true)); 
    zr = getObject(a(-7417, -729), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      components.setCallbacks(getCallbacks(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7219, 28309) }), paramOpenAPIDeserializer$ParseResult, true)); 
    components.setExtensions(new LinkedHashMap<>());
    Map<String, Object> map = getExtensions(paramZr);
    if (map != null && map.size() > 0)
      components.setExtensions(map); 
    Set<String> set = getKeys(paramZr);
    Map<String, Set<String>> map1 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7188, 9260) : a(-7446, 984));
    for (String str : set) {
      if (!((Set)map1.get(a(-7200, 5741))).contains(str) && !str.startsWith(a(-7344, -28932)))
        paramOpenAPIDeserializer$ParseResult.extra(paramString, str, paramZr.ZL(str)); 
      validateReservedKeywords(map1, str, paramString, paramOpenAPIDeserializer$ParseResult);
      if (arrayOfZbqc == null)
        break; 
    } 
    return components;
  }
  
  public List<Tag> getTagList(Zh paramZh, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZh == null)
      return null; 
    ArrayList<Tag> arrayList = new ArrayList();
    HashSet<String> hashSet = new HashSet();
    for (Zb zb : paramZh) {
      if (zb.ZF().equals(Zfr.OBJECT)) {
        Tag tag = getTag((Zr)zb, paramString, paramOpenAPIDeserializer$ParseResult);
        if (tag != null) {
          arrayList.add(tag);
          if (hashSet.contains(tag.getName()))
            paramOpenAPIDeserializer$ParseResult.uniqueTags(paramString, tag.getName()); 
          hashSet.add(tag.getName());
        } 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  public Tag getTag(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    Tag tag = new Tag();
    String str = getString(a(-7664, 4608), paramZr, true, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      tag.setName(str); 
    str = getString(a(-7420, -24680), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      tag.setDescription(str); 
    Zr zr = getObject(a(-7306, -30025), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    ExternalDocumentation externalDocumentation = getExternalDocs(zr, String.format(a(-7584, -25148), new Object[] { paramString, a(-7399, -12918) }), paramOpenAPIDeserializer$ParseResult);
    if (externalDocumentation != null)
      tag.setExternalDocs(externalDocumentation); 
    Map<String, Object> map = getExtensions(paramZr);
    if (map != null && map.size() > 0)
      tag.setExtensions(map); 
    Set<String> set = getKeys(paramZr);
    Map<String, Set<String>> map1 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7597, -4685) : a(-7297, -31677));
    for (String str1 : set) {
      if (!((Set)map1.get(a(-7504, -14972))).contains(str1) && !str1.startsWith(a(-7480, 6650)))
        paramOpenAPIDeserializer$ParseResult.extra(paramString, str1, paramZr.ZL(str1)); 
      validateReservedKeywords(map1, str1, paramString, paramOpenAPIDeserializer$ParseResult);
      if (arrayOfZbqc == null)
        break; 
    } 
    return tag;
  }
  
  public List<Server> getServersList(Zh paramZh, String paramString1, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString2) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #6
    //   12: astore #5
    //   14: aload_1
    //   15: ifnonnull -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: aload_1
    //   21: invokevirtual iterator : ()Ljava/util/Iterator;
    //   24: astore #7
    //   26: aload #7
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 128
    //   36: aload #7
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast com/fasterxml/Zor/Zb
    //   46: astore #8
    //   48: aload #8
    //   50: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   53: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 123
    //   62: aload_0
    //   63: aload #8
    //   65: checkcast com/fasterxml/Zg/Zr
    //   68: aload_2
    //   69: aload_3
    //   70: aload #4
    //   72: invokevirtual getServer : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/servers/Server;
    //   75: astore #9
    //   77: aload #9
    //   79: ifnull -> 97
    //   82: aload #6
    //   84: aload #9
    //   86: invokeinterface add : (Ljava/lang/Object;)Z
    //   91: pop
    //   92: aload #5
    //   94: ifnonnull -> 123
    //   97: new net/portswigger/swagger/v3/oas/models/servers/Server
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore #10
    //   106: aload #10
    //   108: ldc '/'
    //   110: invokevirtual setUrl : (Ljava/lang/String;)V
    //   113: aload #6
    //   115: aload #10
    //   117: invokeinterface add : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: aload #5
    //   125: ifnonnull -> 26
    //   128: aload #6
    //   130: areturn
  }
  
  public List<Server> getServersList(Zh paramZh, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    return getServersList(paramZh, paramString, paramOpenAPIDeserializer$ParseResult, null);
  }
  
  public Server getServer(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    return getServer(paramZr, paramString, paramOpenAPIDeserializer$ParseResult, null);
  }
  
  public Server getServer(Zr paramZr, String paramString1, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString2) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 15
    //   9: aconst_null
    //   10: areturn
    //   11: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   14: athrow
    //   15: new net/portswigger/swagger/v3/oas/models/servers/Server
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #6
    //   24: aload_1
    //   25: sipush #-7265
    //   28: sipush #10752
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   37: ifnull -> 134
    //   40: aload_0
    //   41: sipush #-7265
    //   44: sipush #10752
    //   47: invokestatic a : (II)Ljava/lang/String;
    //   50: aload_1
    //   51: iconst_0
    //   52: aload_2
    //   53: aload_3
    //   54: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   57: astore #7
    //   59: aload_0
    //   60: aload #7
    //   62: sipush #-7674
    //   65: sipush #9134
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_2
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: sipush #-7265
    //   84: sipush #10752
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: aastore
    //   91: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   94: aload_3
    //   95: invokevirtual getServerVariables : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/servers/ServerVariables;
    //   98: astore #8
    //   100: aload #8
    //   102: ifnull -> 134
    //   105: aload #8
    //   107: invokevirtual size : ()I
    //   110: ifle -> 134
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload #6
    //   122: aload #8
    //   124: invokevirtual setVariables : (Lnet/portswigger/swagger/v3/oas/models/servers/ServerVariables;)V
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: sipush #-7316
    //   138: sipush #23477
    //   141: invokestatic a : (II)Ljava/lang/String;
    //   144: aload_1
    //   145: iconst_1
    //   146: aload_2
    //   147: aload_3
    //   148: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   151: astore #7
    //   153: aload_3
    //   154: invokevirtual isAllowEmptyStrings : ()Z
    //   157: ifeq -> 172
    //   160: aload #7
    //   162: ifnonnull -> 201
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: aload_3
    //   173: invokevirtual isAllowEmptyStrings : ()Z
    //   176: ifne -> 438
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload #7
    //   188: invokestatic isBlank : (Ljava/lang/String;)Z
    //   191: ifne -> 438
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload_0
    //   202: aload #7
    //   204: invokevirtual isValidURL : (Ljava/lang/String;)Z
    //   207: ifne -> 431
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: aload #4
    //   219: ifnull -> 431
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: new java/net/URI
    //   232: dup
    //   233: aload #4
    //   235: sipush #-7497
    //   238: sipush #-6160
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: ldc '/'
    //   246: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   249: invokespecial <init> : (Ljava/lang/String;)V
    //   252: astore #8
    //   254: sipush #-7546
    //   257: sipush #-21227
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: aload #8
    //   265: invokevirtual getScheme : ()Ljava/lang/String;
    //   268: invokevirtual equals : (Ljava/lang/Object;)Z
    //   271: ifne -> 300
    //   274: sipush #-7563
    //   277: bipush #40
    //   279: invokestatic a : (II)Ljava/lang/String;
    //   282: aload #8
    //   284: invokevirtual getScheme : ()Ljava/lang/String;
    //   287: invokevirtual equals : (Ljava/lang/Object;)Z
    //   290: ifeq -> 319
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   299: athrow
    //   300: aload #8
    //   302: new java/net/URI
    //   305: dup
    //   306: aload #7
    //   308: invokespecial <init> : (Ljava/lang/String;)V
    //   311: invokevirtual resolve : (Ljava/net/URI;)Ljava/net/URI;
    //   314: invokevirtual toString : ()Ljava/lang/String;
    //   317: astore #7
    //   319: goto -> 431
    //   322: astore #8
    //   324: aload #7
    //   326: ldc '{'
    //   328: invokevirtual indexOf : (Ljava/lang/String;)I
    //   331: istore #9
    //   333: aload #7
    //   335: ldc '}'
    //   337: invokevirtual indexOf : (Ljava/lang/String;)I
    //   340: istore #10
    //   342: iload #9
    //   344: iconst_m1
    //   345: if_icmple -> 431
    //   348: iload #10
    //   350: iconst_m1
    //   351: if_icmple -> 431
    //   354: goto -> 361
    //   357: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   360: athrow
    //   361: aload #7
    //   363: iload #9
    //   365: iconst_1
    //   366: iadd
    //   367: iload #10
    //   369: invokevirtual substring : (II)Ljava/lang/String;
    //   372: astore #11
    //   374: aload #6
    //   376: invokevirtual getVariables : ()Lnet/portswigger/swagger/v3/oas/models/servers/ServerVariables;
    //   379: ifnull -> 431
    //   382: aload #6
    //   384: invokevirtual getVariables : ()Lnet/portswigger/swagger/v3/oas/models/servers/ServerVariables;
    //   387: aload #11
    //   389: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   392: ifne -> 431
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   401: athrow
    //   402: aload_3
    //   403: aload_2
    //   404: aload #7
    //   406: sipush #-7377
    //   409: sipush #6756
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: swap
    //   416: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   421: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   424: goto -> 431
    //   427: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   430: athrow
    //   431: aload #6
    //   433: aload #7
    //   435: invokevirtual setUrl : (Ljava/lang/String;)V
    //   438: aload_0
    //   439: sipush #-7642
    //   442: sipush #4544
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: aload_1
    //   449: iconst_0
    //   450: aload_2
    //   451: aload_3
    //   452: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   455: astore #7
    //   457: aload_3
    //   458: invokevirtual isAllowEmptyStrings : ()Z
    //   461: ifeq -> 476
    //   464: aload #7
    //   466: ifnonnull -> 505
    //   469: goto -> 476
    //   472: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   475: athrow
    //   476: aload_3
    //   477: invokevirtual isAllowEmptyStrings : ()Z
    //   480: ifne -> 519
    //   483: goto -> 490
    //   486: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   489: athrow
    //   490: aload #7
    //   492: invokestatic isBlank : (Ljava/lang/String;)Z
    //   495: ifne -> 519
    //   498: goto -> 505
    //   501: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   504: athrow
    //   505: aload #6
    //   507: aload #7
    //   509: invokevirtual setDescription : (Ljava/lang/String;)V
    //   512: goto -> 519
    //   515: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   518: athrow
    //   519: aload_0
    //   520: aload_1
    //   521: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   524: astore #8
    //   526: aload #8
    //   528: ifnull -> 562
    //   531: aload #8
    //   533: invokeinterface size : ()I
    //   538: ifle -> 562
    //   541: goto -> 548
    //   544: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   547: athrow
    //   548: aload #6
    //   550: aload #8
    //   552: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   555: goto -> 562
    //   558: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   561: athrow
    //   562: aload_0
    //   563: aload_1
    //   564: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   567: astore #9
    //   569: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   572: aload_3
    //   573: invokevirtual isOpenapi31 : ()Z
    //   576: ifeq -> 595
    //   579: sipush #-7188
    //   582: sipush #9260
    //   585: invokestatic a : (II)Ljava/lang/String;
    //   588: goto -> 604
    //   591: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   594: athrow
    //   595: sipush #-7446
    //   598: sipush #984
    //   601: invokestatic a : (II)Ljava/lang/String;
    //   604: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   609: checkcast java/util/Map
    //   612: astore #10
    //   614: aload #9
    //   616: invokeinterface iterator : ()Ljava/util/Iterator;
    //   621: astore #11
    //   623: aload #11
    //   625: invokeinterface hasNext : ()Z
    //   630: ifeq -> 733
    //   633: aload #11
    //   635: invokeinterface next : ()Ljava/lang/Object;
    //   640: checkcast java/lang/String
    //   643: astore #12
    //   645: aload #10
    //   647: sipush #-7507
    //   650: sipush #-13058
    //   653: invokestatic a : (II)Ljava/lang/String;
    //   656: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   661: checkcast java/util/Set
    //   664: aload #12
    //   666: invokeinterface contains : (Ljava/lang/Object;)Z
    //   671: ifne -> 718
    //   674: aload #12
    //   676: sipush #-7344
    //   679: sipush #-28932
    //   682: invokestatic a : (II)Ljava/lang/String;
    //   685: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   688: ifne -> 718
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   697: athrow
    //   698: aload_3
    //   699: aload_2
    //   700: aload #12
    //   702: aload_1
    //   703: aload #12
    //   705: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   708: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   711: goto -> 718
    //   714: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   717: athrow
    //   718: aload_0
    //   719: aload #10
    //   721: aload #12
    //   723: aload_2
    //   724: aload_3
    //   725: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   728: aload #5
    //   730: ifnonnull -> 623
    //   733: aload #6
    //   735: areturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/net/URISyntaxException
    //   100	113	116	java/net/URISyntaxException
    //   105	127	130	java/net/URISyntaxException
    //   153	165	168	java/net/URISyntaxException
    //   160	179	182	java/net/URISyntaxException
    //   172	194	197	java/net/URISyntaxException
    //   186	210	213	java/net/URISyntaxException
    //   201	222	225	java/net/URISyntaxException
    //   229	319	322	java/net/URISyntaxException
    //   254	293	296	java/net/URISyntaxException
    //   342	354	357	java/net/URISyntaxException
    //   374	395	398	java/net/URISyntaxException
    //   382	424	427	java/net/URISyntaxException
    //   457	469	472	java/net/URISyntaxException
    //   464	483	486	java/net/URISyntaxException
    //   476	498	501	java/net/URISyntaxException
    //   490	512	515	java/net/URISyntaxException
    //   526	541	544	java/net/URISyntaxException
    //   531	555	558	java/net/URISyntaxException
    //   569	591	591	java/net/URISyntaxException
    //   645	691	694	java/net/URISyntaxException
    //   674	711	714	java/net/URISyntaxException
  }
  
  boolean isValidURL(String paramString) {
    try {
      URL uRL = new URL(paramString);
      uRL.toURI();
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public ServerVariables getServerVariables(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    ServerVariables serverVariables = new ServerVariables();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      Zb zb = paramZr.ZL(str);
      Zr zr = (Zr)zb;
      ServerVariable serverVariable = getServerVariable(zr, String.format(a(-7674, 9134), new Object[] { paramString, str }), paramOpenAPIDeserializer$ParseResult);
      serverVariables.addServerVariable(str, serverVariable);
      if (arrayOfZbqc == null)
        break; 
    } 
    return serverVariables;
  }
  
  public ServerVariable getServerVariable(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/servers/ServerVariable
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-7436
    //   24: sipush #-32663
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_0
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   37: astore #6
    //   39: aload #6
    //   41: ifnull -> 179
    //   44: aload #6
    //   46: invokevirtual Zv : ()I
    //   49: ifne -> 78
    //   52: aload_3
    //   53: invokevirtual isOpenapi31 : ()Z
    //   56: ifeq -> 78
    //   59: aload_3
    //   60: aload_2
    //   61: sipush #-7624
    //   64: sipush #14956
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload #4
    //   75: ifnonnull -> 179
    //   78: new java/util/ArrayList
    //   81: dup
    //   82: invokespecial <init> : ()V
    //   85: astore #7
    //   87: aload #6
    //   89: invokevirtual iterator : ()Ljava/util/Iterator;
    //   92: astore #8
    //   94: aload #8
    //   96: invokeinterface hasNext : ()Z
    //   101: ifeq -> 179
    //   104: aload #8
    //   106: invokeinterface next : ()Ljava/lang/Object;
    //   111: checkcast com/fasterxml/Zor/Zb
    //   114: astore #9
    //   116: aload #9
    //   118: invokevirtual ZA : ()Z
    //   121: ifeq -> 149
    //   124: aload #7
    //   126: aload #9
    //   128: invokevirtual Zp : ()Ljava/lang/String;
    //   131: invokeinterface add : (Ljava/lang/Object;)Z
    //   136: pop
    //   137: aload #5
    //   139: aload #7
    //   141: invokevirtual setEnum : (Ljava/util/List;)V
    //   144: aload #4
    //   146: ifnonnull -> 174
    //   149: aload_3
    //   150: aload_2
    //   151: sipush #-7602
    //   154: sipush #-21117
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: sipush #-7358
    //   163: sipush #29696
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: aload #9
    //   171: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   174: aload #4
    //   176: ifnonnull -> 94
    //   179: aload_0
    //   180: sipush #-7502
    //   183: sipush #-23871
    //   186: invokestatic a : (II)Ljava/lang/String;
    //   189: aload_1
    //   190: iconst_1
    //   191: sipush #-7674
    //   194: sipush #9134
    //   197: invokestatic a : (II)Ljava/lang/String;
    //   200: iconst_2
    //   201: anewarray java/lang/Object
    //   204: dup
    //   205: iconst_0
    //   206: aload_2
    //   207: aastore
    //   208: dup
    //   209: iconst_1
    //   210: sipush #-7403
    //   213: sipush #10714
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: aastore
    //   220: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   223: aload_3
    //   224: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   227: astore #7
    //   229: aload_3
    //   230: invokevirtual isAllowEmptyStrings : ()Z
    //   233: ifeq -> 241
    //   236: aload #7
    //   238: ifnonnull -> 256
    //   241: aload_3
    //   242: invokevirtual isAllowEmptyStrings : ()Z
    //   245: ifne -> 263
    //   248: aload #7
    //   250: invokestatic isBlank : (Ljava/lang/String;)Z
    //   253: ifne -> 263
    //   256: aload #5
    //   258: aload #7
    //   260: invokevirtual setDefault : (Ljava/lang/String;)V
    //   263: aload_0
    //   264: sipush #-7642
    //   267: sipush #4544
    //   270: invokestatic a : (II)Ljava/lang/String;
    //   273: aload_1
    //   274: iconst_0
    //   275: sipush #-7674
    //   278: sipush #9134
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: iconst_2
    //   285: anewarray java/lang/Object
    //   288: dup
    //   289: iconst_0
    //   290: aload_2
    //   291: aastore
    //   292: dup
    //   293: iconst_1
    //   294: sipush #-7642
    //   297: sipush #4544
    //   300: invokestatic a : (II)Ljava/lang/String;
    //   303: aastore
    //   304: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   307: aload_3
    //   308: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   311: astore #7
    //   313: aload_3
    //   314: invokevirtual isAllowEmptyStrings : ()Z
    //   317: ifeq -> 325
    //   320: aload #7
    //   322: ifnonnull -> 340
    //   325: aload_3
    //   326: invokevirtual isAllowEmptyStrings : ()Z
    //   329: ifne -> 347
    //   332: aload #7
    //   334: invokestatic isBlank : (Ljava/lang/String;)Z
    //   337: ifne -> 347
    //   340: aload #5
    //   342: aload #7
    //   344: invokevirtual setDescription : (Ljava/lang/String;)V
    //   347: aload_0
    //   348: aload_1
    //   349: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   352: astore #8
    //   354: aload #8
    //   356: ifnull -> 376
    //   359: aload #8
    //   361: invokeinterface size : ()I
    //   366: ifle -> 376
    //   369: aload #5
    //   371: aload #8
    //   373: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   376: aload_0
    //   377: aload_1
    //   378: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   381: astore #9
    //   383: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   386: aload_3
    //   387: invokevirtual isOpenapi31 : ()Z
    //   390: ifeq -> 405
    //   393: sipush #-7188
    //   396: sipush #9260
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: goto -> 414
    //   405: sipush #-7446
    //   408: sipush #984
    //   411: invokestatic a : (II)Ljava/lang/String;
    //   414: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   419: checkcast java/util/Map
    //   422: astore #10
    //   424: aload #9
    //   426: invokeinterface iterator : ()Ljava/util/Iterator;
    //   431: astore #11
    //   433: aload #11
    //   435: invokeinterface hasNext : ()Z
    //   440: ifeq -> 529
    //   443: aload #11
    //   445: invokeinterface next : ()Ljava/lang/Object;
    //   450: checkcast java/lang/String
    //   453: astore #12
    //   455: aload #10
    //   457: sipush #-7318
    //   460: sipush #-7455
    //   463: invokestatic a : (II)Ljava/lang/String;
    //   466: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   471: checkcast java/util/Set
    //   474: aload #12
    //   476: invokeinterface contains : (Ljava/lang/Object;)Z
    //   481: ifne -> 514
    //   484: aload #12
    //   486: sipush #-7344
    //   489: sipush #-28932
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   498: ifne -> 514
    //   501: aload_3
    //   502: aload_2
    //   503: aload #12
    //   505: aload_1
    //   506: aload #12
    //   508: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   511: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   514: aload_0
    //   515: aload #10
    //   517: aload #12
    //   519: aload_2
    //   520: aload_3
    //   521: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   524: aload #4
    //   526: ifnonnull -> 433
    //   529: aload #5
    //   531: areturn
  }
  
  public Paths getPaths(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Paths paths = new Paths();
    return getPathItems(paramZr, paramString, paramOpenAPIDeserializer$ParseResult, (Map<String, PathItem>)paths, false) ? paths : null;
  }
  
  public Map<String, PathItem> getPathItems(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      if (paramBoolean && !Pattern.matches(a(-7529, -20813), str))
        paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7406, 30316) + a(-7406, 30316) + str); 
      PathItem pathItem = getPathItem((Zr)paramZr.ZL(str), paramString, paramOpenAPIDeserializer$ParseResult);
      if (pathItem != null)
        linkedHashMap.put(str, pathItem); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public Map<String, PathItem> getWebhooks(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    return (Map)(getPathItems(paramZr, paramString, paramOpenAPIDeserializer$ParseResult, (Map)linkedHashMap, true) ? linkedHashMap : null);
  }
  
  protected boolean getPathItems(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, Map<String, PathItem> paramMap, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #6
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   16: astore #7
    //   18: aload #7
    //   20: invokeinterface iterator : ()Ljava/util/Iterator;
    //   25: astore #8
    //   27: aload #8
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 338
    //   37: aload #8
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast java/lang/String
    //   47: astore #9
    //   49: aload_1
    //   50: aload #9
    //   52: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   55: astore #10
    //   57: aload #4
    //   59: instanceof net/portswigger/swagger/v3/oas/models/Paths
    //   62: ifeq -> 119
    //   65: aload #9
    //   67: sipush #-7344
    //   70: sipush #-28932
    //   73: invokestatic a : (II)Ljava/lang/String;
    //   76: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   79: ifeq -> 119
    //   82: aload_0
    //   83: aload_1
    //   84: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   87: astore #11
    //   89: aload #11
    //   91: ifnull -> 114
    //   94: aload #11
    //   96: invokeinterface size : ()I
    //   101: ifle -> 114
    //   104: aload #4
    //   106: checkcast net/portswigger/swagger/v3/oas/models/Paths
    //   109: aload #11
    //   111: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   114: aload #6
    //   116: ifnonnull -> 333
    //   119: aload #10
    //   121: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   124: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 156
    //   133: aload_3
    //   134: aload_2
    //   135: aload #9
    //   137: sipush #-7362
    //   140: sipush #25325
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #10
    //   148: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   151: aload #6
    //   153: ifnonnull -> 333
    //   156: aload #9
    //   158: ldc '/'
    //   160: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   163: ifne -> 202
    //   166: iload #5
    //   168: ifne -> 202
    //   171: aload_3
    //   172: aload_2
    //   173: aload #9
    //   175: sipush #-7486
    //   178: sipush #10821
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: swap
    //   185: sipush #-7434
    //   188: sipush #-22284
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   199: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   202: aload #10
    //   204: checkcast com/fasterxml/Zg/Zr
    //   207: astore #11
    //   209: aload_0
    //   210: aload #11
    //   212: sipush #-7577
    //   215: sipush #18258
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: iconst_2
    //   222: anewarray java/lang/Object
    //   225: dup
    //   226: iconst_0
    //   227: aload_2
    //   228: aastore
    //   229: dup
    //   230: iconst_1
    //   231: aload #9
    //   233: aastore
    //   234: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   237: aload_3
    //   238: invokevirtual getPathItem : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/PathItem;
    //   241: astore #12
    //   243: sipush #-7478
    //   246: new java/util/ArrayList
    //   249: dup
    //   250: invokespecial <init> : ()V
    //   253: astore #13
    //   255: sipush #12387
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   264: aload #9
    //   266: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   269: astore #14
    //   271: aload #14
    //   273: invokevirtual find : ()Z
    //   276: ifeq -> 297
    //   279: aload #13
    //   281: aload #14
    //   283: invokevirtual group : ()Ljava/lang/String;
    //   286: invokeinterface add : (Ljava/lang/Object;)Z
    //   291: pop
    //   292: aload #6
    //   294: ifnonnull -> 271
    //   297: aload #13
    //   299: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   304: aload_0
    //   305: aload #12
    //   307: aload_3
    //   308: aload_2
    //   309: aload #9
    //   311: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer;Lnet/portswigger/swagger/v3/oas/models/PathItem;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   316: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   321: aload #4
    //   323: aload #9
    //   325: aload #12
    //   327: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   332: pop
    //   333: aload #6
    //   335: ifnonnull -> 27
    //   338: iconst_1
    //   339: ireturn
  }
  
  private boolean isPathParamDefined(String paramString, List<Parameter> paramList) {
    if (paramList == null || paramList.isEmpty())
      return false; 
    Parameter parameter = paramList.stream().filter(paramString::lambda$isPathParamDefined$4).findFirst().orElse(null);
    return !(parameter == null);
  }
  
  private void addToOperationsList(List<Operation> paramList, Operation paramOperation) {
    if (paramOperation == null)
      return; 
    paramList.add(paramOperation);
  }
  
  public List<Operation> getAllOperationsInAPath(PathItem paramPathItem) {
    ArrayList<Operation> arrayList = new ArrayList();
    addToOperationsList(arrayList, paramPathItem.getGet());
    addToOperationsList(arrayList, paramPathItem.getPut());
    addToOperationsList(arrayList, paramPathItem.getPost());
    addToOperationsList(arrayList, paramPathItem.getPatch());
    addToOperationsList(arrayList, paramPathItem.getDelete());
    addToOperationsList(arrayList, paramPathItem.getTrace());
    addToOperationsList(arrayList, paramPathItem.getOptions());
    addToOperationsList(arrayList, paramPathItem.getHead());
    return arrayList;
  }
  
  public PathItem getPathItem(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: new net/portswigger/swagger/v3/oas/models/PathItem
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: astore #4
    //   14: aload_1
    //   15: sipush #-7225
    //   18: sipush #-25842
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   27: ifnull -> 329
    //   30: aload_1
    //   31: sipush #-7225
    //   34: sipush #-25842
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   43: astore #6
    //   45: aload #6
    //   47: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   50: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 248
    //   59: aload_0
    //   60: aload #6
    //   62: invokevirtual Zz : ()Ljava/lang/String;
    //   65: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   68: astore #7
    //   70: aload #7
    //   72: ifnull -> 87
    //   75: aload #5
    //   77: aload #7
    //   79: invokevirtual set$ref : (Ljava/lang/String;)V
    //   82: aload #4
    //   84: ifnonnull -> 97
    //   87: aload #5
    //   89: aload #6
    //   91: invokevirtual Zz : ()Ljava/lang/String;
    //   94: invokevirtual set$ref : (Ljava/lang/String;)V
    //   97: aload #6
    //   99: invokevirtual Zz : ()Ljava/lang/String;
    //   102: sipush #-7548
    //   105: sipush #15663
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   114: ifeq -> 171
    //   117: aload #6
    //   119: invokevirtual Zz : ()Ljava/lang/String;
    //   122: sipush #-7338
    //   125: sipush #7280
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   134: ifne -> 171
    //   137: aload_3
    //   138: aload_2
    //   139: aload #6
    //   141: invokevirtual Zz : ()Ljava/lang/String;
    //   144: sipush #-7462
    //   147: sipush #8250
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: swap
    //   154: sipush #-7421
    //   157: sipush #-28764
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   168: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload_3
    //   172: invokevirtual isOpenapi31 : ()Z
    //   175: ifeq -> 245
    //   178: aload_0
    //   179: sipush #-7305
    //   182: bipush #-57
    //   184: invokestatic a : (II)Ljava/lang/String;
    //   187: aload_1
    //   188: iconst_0
    //   189: aload_2
    //   190: aload_3
    //   191: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   194: astore #8
    //   196: aload #8
    //   198: invokestatic isBlank : (Ljava/lang/String;)Z
    //   201: ifne -> 211
    //   204: aload #5
    //   206: aload #8
    //   208: invokevirtual setSummary : (Ljava/lang/String;)V
    //   211: aload_0
    //   212: sipush #-7642
    //   215: sipush #4544
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: aload_1
    //   222: iconst_0
    //   223: aload_2
    //   224: aload_3
    //   225: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   228: astore #8
    //   230: aload #8
    //   232: invokestatic isBlank : (Ljava/lang/String;)Z
    //   235: ifne -> 245
    //   238: aload #5
    //   240: aload #8
    //   242: invokevirtual setDescription : (Ljava/lang/String;)V
    //   245: aload #5
    //   247: areturn
    //   248: aload #6
    //   250: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   253: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   256: invokevirtual equals : (Ljava/lang/Object;)Z
    //   259: ifeq -> 327
    //   262: aload #6
    //   264: checkcast com/fasterxml/Zg/Zr
    //   267: astore #7
    //   269: aload_0
    //   270: aload #7
    //   272: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   275: astore #8
    //   277: aload #8
    //   279: invokeinterface iterator : ()Ljava/util/Iterator;
    //   284: astore #9
    //   286: aload #9
    //   288: invokeinterface hasNext : ()Z
    //   293: ifeq -> 327
    //   296: aload #9
    //   298: invokeinterface next : ()Ljava/lang/Object;
    //   303: checkcast java/lang/String
    //   306: astore #10
    //   308: aload_3
    //   309: aload_2
    //   310: aload #10
    //   312: aload #7
    //   314: aload #10
    //   316: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   319: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   322: aload #4
    //   324: ifnonnull -> 286
    //   327: aconst_null
    //   328: areturn
    //   329: aload_0
    //   330: sipush #-7305
    //   333: bipush #-57
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: aload_1
    //   339: iconst_0
    //   340: aload_2
    //   341: aload_3
    //   342: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   345: astore #6
    //   347: aload_3
    //   348: invokevirtual isAllowEmptyStrings : ()Z
    //   351: ifeq -> 359
    //   354: aload #6
    //   356: ifnonnull -> 374
    //   359: aload_3
    //   360: invokevirtual isAllowEmptyStrings : ()Z
    //   363: ifne -> 381
    //   366: aload #6
    //   368: invokestatic isBlank : (Ljava/lang/String;)Z
    //   371: ifne -> 381
    //   374: aload #5
    //   376: aload #6
    //   378: invokevirtual setSummary : (Ljava/lang/String;)V
    //   381: aload_0
    //   382: sipush #-7642
    //   385: sipush #4544
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: aload_1
    //   392: iconst_0
    //   393: aload_2
    //   394: aload_3
    //   395: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   398: astore #6
    //   400: aload_3
    //   401: invokevirtual isAllowEmptyStrings : ()Z
    //   404: ifeq -> 412
    //   407: aload #6
    //   409: ifnonnull -> 427
    //   412: aload_3
    //   413: invokevirtual isAllowEmptyStrings : ()Z
    //   416: ifne -> 434
    //   419: aload #6
    //   421: invokestatic isBlank : (Ljava/lang/String;)Z
    //   424: ifne -> 434
    //   427: aload #5
    //   429: aload #6
    //   431: invokevirtual setDescription : (Ljava/lang/String;)V
    //   434: aload_0
    //   435: sipush #-7195
    //   438: sipush #27709
    //   441: invokestatic a : (II)Ljava/lang/String;
    //   444: aload_1
    //   445: iconst_0
    //   446: aload_2
    //   447: aload_3
    //   448: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   451: astore #7
    //   453: aload #7
    //   455: ifnull -> 479
    //   458: aload #7
    //   460: invokevirtual Zv : ()I
    //   463: ifle -> 479
    //   466: aload #5
    //   468: aload_0
    //   469: aload #7
    //   471: aload_2
    //   472: aload_3
    //   473: invokevirtual getParameterList : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/List;
    //   476: invokevirtual setParameters : (Ljava/util/List;)V
    //   479: aload_0
    //   480: sipush #-7308
    //   483: sipush #-11859
    //   486: invokestatic a : (II)Ljava/lang/String;
    //   489: aload_1
    //   490: iconst_0
    //   491: aload_2
    //   492: aload_3
    //   493: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   496: astore #8
    //   498: aload #8
    //   500: ifnull -> 524
    //   503: aload #8
    //   505: invokevirtual Zv : ()I
    //   508: ifle -> 524
    //   511: aload #5
    //   513: aload_0
    //   514: aload #8
    //   516: aload_2
    //   517: aload_3
    //   518: invokevirtual getServersList : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/List;
    //   521: invokevirtual setServers : (Ljava/util/List;)V
    //   524: aload_0
    //   525: sipush #-7582
    //   528: sipush #-24695
    //   531: invokestatic a : (II)Ljava/lang/String;
    //   534: aload_1
    //   535: iconst_0
    //   536: aload_2
    //   537: aload_3
    //   538: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   541: astore #9
    //   543: aload #9
    //   545: ifnull -> 584
    //   548: aload_0
    //   549: aload #9
    //   551: aload_2
    //   552: sipush #-7570
    //   555: sipush #24656
    //   558: invokestatic a : (II)Ljava/lang/String;
    //   561: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   566: aload_3
    //   567: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   570: astore #10
    //   572: aload #10
    //   574: ifnull -> 584
    //   577: aload #5
    //   579: aload #10
    //   581: invokevirtual setGet : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   584: aload_0
    //   585: sipush #-7185
    //   588: sipush #21732
    //   591: invokestatic a : (II)Ljava/lang/String;
    //   594: aload_1
    //   595: iconst_0
    //   596: aload_2
    //   597: aload_3
    //   598: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   601: astore #9
    //   603: aload #9
    //   605: ifnull -> 644
    //   608: aload_0
    //   609: aload #9
    //   611: aload_2
    //   612: sipush #-7618
    //   615: sipush #7361
    //   618: invokestatic a : (II)Ljava/lang/String;
    //   621: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   626: aload_3
    //   627: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   630: astore #10
    //   632: aload #10
    //   634: ifnull -> 644
    //   637: aload #5
    //   639: aload #10
    //   641: invokevirtual setPut : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   644: aload_0
    //   645: sipush #-7339
    //   648: sipush #-17030
    //   651: invokestatic a : (II)Ljava/lang/String;
    //   654: aload_1
    //   655: iconst_0
    //   656: aload_2
    //   657: aload_3
    //   658: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   661: astore #9
    //   663: aload #9
    //   665: ifnull -> 704
    //   668: aload_0
    //   669: aload #9
    //   671: aload_2
    //   672: sipush #-7564
    //   675: sipush #-28502
    //   678: invokestatic a : (II)Ljava/lang/String;
    //   681: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   686: aload_3
    //   687: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   690: astore #10
    //   692: aload #10
    //   694: ifnull -> 704
    //   697: aload #5
    //   699: aload #10
    //   701: invokevirtual setPost : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   704: aload_0
    //   705: sipush #-7216
    //   708: sipush #-16989
    //   711: invokestatic a : (II)Ljava/lang/String;
    //   714: aload_1
    //   715: iconst_0
    //   716: aload_2
    //   717: aload_3
    //   718: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   721: astore #9
    //   723: aload #9
    //   725: ifnull -> 764
    //   728: aload_0
    //   729: aload #9
    //   731: aload_2
    //   732: sipush #-7337
    //   735: sipush #-29716
    //   738: invokestatic a : (II)Ljava/lang/String;
    //   741: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   746: aload_3
    //   747: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   750: astore #10
    //   752: aload #10
    //   754: ifnull -> 764
    //   757: aload #5
    //   759: aload #10
    //   761: invokevirtual setHead : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   764: aload_0
    //   765: sipush #-7415
    //   768: sipush #6083
    //   771: invokestatic a : (II)Ljava/lang/String;
    //   774: aload_1
    //   775: iconst_0
    //   776: aload_2
    //   777: aload_3
    //   778: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   781: astore #9
    //   783: aload #9
    //   785: ifnull -> 824
    //   788: aload_0
    //   789: aload #9
    //   791: aload_2
    //   792: sipush #-7307
    //   795: sipush #-16349
    //   798: invokestatic a : (II)Ljava/lang/String;
    //   801: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   806: aload_3
    //   807: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   810: astore #10
    //   812: aload #10
    //   814: ifnull -> 824
    //   817: aload #5
    //   819: aload #10
    //   821: invokevirtual setDelete : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   824: aload_0
    //   825: sipush #-7323
    //   828: sipush #-28767
    //   831: invokestatic a : (II)Ljava/lang/String;
    //   834: aload_1
    //   835: iconst_0
    //   836: aload_2
    //   837: aload_3
    //   838: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   841: astore #9
    //   843: aload #9
    //   845: ifnull -> 884
    //   848: aload_0
    //   849: aload #9
    //   851: aload_2
    //   852: sipush #-7405
    //   855: sipush #-23043
    //   858: invokestatic a : (II)Ljava/lang/String;
    //   861: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   866: aload_3
    //   867: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   870: astore #10
    //   872: aload #10
    //   874: ifnull -> 884
    //   877: aload #5
    //   879: aload #10
    //   881: invokevirtual setPatch : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   884: aload_0
    //   885: sipush #-7324
    //   888: sipush #-26899
    //   891: invokestatic a : (II)Ljava/lang/String;
    //   894: aload_1
    //   895: iconst_0
    //   896: aload_2
    //   897: aload_3
    //   898: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   901: astore #9
    //   903: aload #9
    //   905: ifnull -> 944
    //   908: aload_0
    //   909: aload #9
    //   911: aload_2
    //   912: sipush #-7550
    //   915: sipush #23342
    //   918: invokestatic a : (II)Ljava/lang/String;
    //   921: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   926: aload_3
    //   927: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   930: astore #10
    //   932: aload #10
    //   934: ifnull -> 944
    //   937: aload #5
    //   939: aload #10
    //   941: invokevirtual setOptions : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   944: aload_0
    //   945: sipush #-7449
    //   948: sipush #18540
    //   951: invokestatic a : (II)Ljava/lang/String;
    //   954: aload_1
    //   955: iconst_0
    //   956: aload_2
    //   957: aload_3
    //   958: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   961: astore #9
    //   963: aload #9
    //   965: ifnull -> 1004
    //   968: aload_0
    //   969: aload #9
    //   971: aload_2
    //   972: sipush #-7375
    //   975: sipush #-6586
    //   978: invokestatic a : (II)Ljava/lang/String;
    //   981: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   986: aload_3
    //   987: invokevirtual getOperation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/Operation;
    //   990: astore #10
    //   992: aload #10
    //   994: ifnull -> 1004
    //   997: aload #5
    //   999: aload #10
    //   1001: invokevirtual setTrace : (Lnet/portswigger/swagger/v3/oas/models/Operation;)V
    //   1004: aload_0
    //   1005: aload_1
    //   1006: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   1009: astore #10
    //   1011: aload #10
    //   1013: ifnull -> 1033
    //   1016: aload #10
    //   1018: invokeinterface size : ()I
    //   1023: ifle -> 1033
    //   1026: aload #5
    //   1028: aload #10
    //   1030: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   1033: aload_0
    //   1034: aload_1
    //   1035: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1038: astore #11
    //   1040: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   1043: aload_3
    //   1044: invokevirtual isOpenapi31 : ()Z
    //   1047: ifeq -> 1062
    //   1050: sipush #-7188
    //   1053: sipush #9260
    //   1056: invokestatic a : (II)Ljava/lang/String;
    //   1059: goto -> 1071
    //   1062: sipush #-7446
    //   1065: sipush #984
    //   1068: invokestatic a : (II)Ljava/lang/String;
    //   1071: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1076: checkcast java/util/Map
    //   1079: astore #12
    //   1081: aload #11
    //   1083: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1088: astore #13
    //   1090: aload #13
    //   1092: invokeinterface hasNext : ()Z
    //   1097: ifeq -> 1186
    //   1100: aload #13
    //   1102: invokeinterface next : ()Ljava/lang/Object;
    //   1107: checkcast java/lang/String
    //   1110: astore #14
    //   1112: aload #12
    //   1114: sipush #-7205
    //   1117: sipush #10057
    //   1120: invokestatic a : (II)Ljava/lang/String;
    //   1123: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1128: checkcast java/util/Set
    //   1131: aload #14
    //   1133: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1138: ifne -> 1171
    //   1141: aload #14
    //   1143: sipush #-7344
    //   1146: sipush #-28932
    //   1149: invokestatic a : (II)Ljava/lang/String;
    //   1152: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1155: ifne -> 1171
    //   1158: aload_3
    //   1159: aload_2
    //   1160: aload #14
    //   1162: aload_1
    //   1163: aload #14
    //   1165: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1168: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1171: aload_0
    //   1172: aload #12
    //   1174: aload #14
    //   1176: aload_2
    //   1177: aload_3
    //   1178: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   1181: aload #4
    //   1183: ifnonnull -> 1090
    //   1186: aload #5
    //   1188: areturn
  }
  
  public ExternalDocumentation getExternalDocs(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    ExternalDocumentation externalDocumentation = null;
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr != null) {
      externalDocumentation = new ExternalDocumentation();
      String str = getString(a(-7642, 4544), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
      if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
        externalDocumentation.description(str); 
      str = getString(a(-7316, 23477), paramZr, true, paramString, paramOpenAPIDeserializer$ParseResult);
      if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
        externalDocumentation.url(str); 
      Map<String, Object> map = getExtensions(paramZr);
      if (map != null && map.size() > 0)
        externalDocumentation.setExtensions(map); 
      Set<String> set = getKeys(paramZr);
      Map map1 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7188, 9260) : a(-7446, 984));
      for (String str1 : set) {
        if (!((Set)map1.get(a(-7481, -24759))).contains(str1) && !str1.startsWith(a(-7344, -28932)))
          paramOpenAPIDeserializer$ParseResult.extra(paramString, str1, paramZr.ZL(str1)); 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return externalDocumentation;
  }
  
  public String getString(String paramString1, Zr paramZr, boolean paramBoolean1, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, Set<String> paramSet, boolean paramBoolean2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #9
    //   3: invokestatic ZV : ()[Lburp/Zbqc;
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   11: astore #10
    //   13: astore #8
    //   15: aload_2
    //   16: ifnull -> 24
    //   19: aload #10
    //   21: ifnonnull -> 46
    //   24: iload_3
    //   25: ifeq -> 135
    //   28: aload #5
    //   30: aload #4
    //   32: aload_1
    //   33: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload #5
    //   38: invokevirtual invalid : ()V
    //   41: aload #8
    //   43: ifnonnull -> 135
    //   46: aload #10
    //   48: invokevirtual ZA : ()Z
    //   51: ifne -> 82
    //   54: iload #7
    //   56: ifne -> 135
    //   59: aload #5
    //   61: aload #4
    //   63: aload_1
    //   64: sipush #-7551
    //   67: sipush #15066
    //   70: invokestatic a : (II)Ljava/lang/String;
    //   73: aload_2
    //   74: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   77: aload #8
    //   79: ifnonnull -> 135
    //   82: aload #10
    //   84: invokevirtual Zt : ()Z
    //   87: ifne -> 135
    //   90: aload #10
    //   92: invokevirtual Zp : ()Ljava/lang/String;
    //   95: astore #9
    //   97: aload #6
    //   99: ifnull -> 135
    //   102: aload #6
    //   104: aload #9
    //   106: invokeinterface add : (Ljava/lang/Object;)Z
    //   111: ifne -> 135
    //   114: aload #5
    //   116: aload #4
    //   118: sipush #-7346
    //   121: sipush #15435
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: invokevirtual unique : (Ljava/lang/String;Ljava/lang/String;)V
    //   130: aload #5
    //   132: invokevirtual invalid : ()V
    //   135: aload #9
    //   137: areturn
  }
  
  public String getString(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, Set<String> paramSet) {
    return getString(paramString1, paramZr, paramBoolean, paramString2, paramOpenAPIDeserializer$ParseResult, paramSet, false);
  }
  
  public String getString(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    return getString(paramString1, paramZr, paramBoolean, paramString2, paramOpenAPIDeserializer$ParseResult, null);
  }
  
  public Set<String> getKeys(Zr paramZr) {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return linkedHashSet; 
    Iterator<String> iterator = paramZr.ZM();
    while (iterator.hasNext()) {
      linkedHashSet.add(iterator.next());
      if (arrayOfZbqc == null)
        break; 
    } 
    return linkedHashSet;
  }
  
  public Zr getObject(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: aload_1
    //   5: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   8: astore #7
    //   10: astore #6
    //   12: aconst_null
    //   13: astore #8
    //   15: aload #7
    //   17: ifnonnull -> 42
    //   20: iload_3
    //   21: ifeq -> 96
    //   24: aload #5
    //   26: aload #4
    //   28: aload_1
    //   29: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload #5
    //   34: invokevirtual invalid : ()V
    //   37: aload #6
    //   39: ifnonnull -> 96
    //   42: aload #7
    //   44: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   47: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifne -> 89
    //   56: aload #5
    //   58: aload #4
    //   60: aload_1
    //   61: sipush #-7362
    //   64: sipush #25325
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: aload #7
    //   72: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   75: iload_3
    //   76: ifeq -> 96
    //   79: aload #5
    //   81: invokevirtual invalid : ()V
    //   84: aload #6
    //   86: ifnonnull -> 96
    //   89: aload #7
    //   91: checkcast com/fasterxml/Zg/Zr
    //   94: astore #8
    //   96: aload #8
    //   98: areturn
  }
  
  public Zb getObjectOrBoolean(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zb zb = paramZr.ZL(paramString1);
    if (zb == null) {
      if (paramBoolean) {
        paramOpenAPIDeserializer$ParseResult.missing(paramString2, paramString1);
        paramOpenAPIDeserializer$ParseResult.invalid();
      } 
      return null;
    } 
    Boolean bool = null;
    if (zb.ZF().equals(Zfr.BOOLEAN)) {
      bool = Boolean.valueOf(zb.Zf());
    } else if (zb.ZF().equals(Zfr.STRING)) {
      String str = zb.Zz();
      if (a(-7669, -2742).equalsIgnoreCase(str) || a(-7347, -12799).equalsIgnoreCase(str)) {
        bool = Boolean.valueOf(Boolean.parseBoolean(str));
      } else {
        paramOpenAPIDeserializer$ParseResult.invalidType(paramString2, paramString1, a(-7215, -3814), zb);
        return null;
      } 
    } 
    if (bool != null)
      return zb; 
    if (!zb.ZB()) {
      paramOpenAPIDeserializer$ParseResult.invalidType(paramString2, paramString1, a(-7362, 25325), zb);
      return null;
    } 
    return zb;
  }
  
  public Info getInfo(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    Info info = new Info();
    String str = getString(a(-7513, 24359), paramZr, true, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      info.setTitle(str); 
    str = getString(a(-7642, 4544), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      info.setDescription(str); 
    if (paramOpenAPIDeserializer$ParseResult.isOpenapi31()) {
      str = getString(a(-7191, -27035), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
      if (!StringUtils.isBlank(str))
        info.setSummary(str); 
    } 
    str = getString(a(-7587, -29833), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      info.setTermsOfService(str); 
    Zr zr = getObject(a(-7369, -26238), paramZr, false, a(-7447, -28548), paramOpenAPIDeserializer$ParseResult);
    Contact contact = getContact(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7447, -28548) }), paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      info.setContact(contact); 
    zr = getObject(a(-7506, -366), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    License license = getLicense(zr, String.format(a(-7674, 9134), new Object[] { paramString, a(-7540, -9571) }), paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      info.setLicense(license); 
    str = getString(a(-7458, -5186), paramZr, true, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      info.setVersion(str); 
    Map<String, Object> map = getExtensions(paramZr);
    if (map != null && map.size() > 0)
      info.setExtensions(map); 
    Set<String> set = getKeys(paramZr);
    Map<String, Set<String>> map1 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7188, 9260) : a(-7446, 984));
    for (String str1 : set) {
      if (!((Set)map1.get(a(-7386, 30949))).contains(str1) && !str1.startsWith(a(-7344, -28932)))
        paramOpenAPIDeserializer$ParseResult.extra(paramString, str1, paramZr.ZL(str1)); 
      validateReservedKeywords(map1, str1, paramString, paramOpenAPIDeserializer$ParseResult);
      if (arrayOfZbqc == null)
        break; 
    } 
    return info;
  }
  
  public License getLicense(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 15
    //   9: aconst_null
    //   10: areturn
    //   11: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   14: athrow
    //   15: new net/portswigger/swagger/v3/oas/models/info/License
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #5
    //   24: aload_0
    //   25: sipush #-7657
    //   28: sipush #12130
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: aload_1
    //   35: iconst_1
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   41: astore #6
    //   43: aload_3
    //   44: invokevirtual isAllowEmptyStrings : ()Z
    //   47: ifeq -> 62
    //   50: aload #6
    //   52: ifnonnull -> 91
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_3
    //   63: invokevirtual isAllowEmptyStrings : ()Z
    //   66: ifne -> 105
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload #6
    //   78: invokestatic isBlank : (Ljava/lang/String;)Z
    //   81: ifne -> 105
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload #5
    //   93: aload #6
    //   95: invokevirtual setName : (Ljava/lang/String;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: sipush #-7326
    //   109: sipush #3176
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: aload_1
    //   116: iconst_0
    //   117: aload_2
    //   118: aload_3
    //   119: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   122: astore #6
    //   124: aload_3
    //   125: invokevirtual isAllowEmptyStrings : ()Z
    //   128: ifeq -> 143
    //   131: aload #6
    //   133: ifnonnull -> 172
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_3
    //   144: invokevirtual isAllowEmptyStrings : ()Z
    //   147: ifne -> 201
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload #6
    //   159: invokestatic isBlank : (Ljava/lang/String;)Z
    //   162: ifne -> 201
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: new java/net/URL
    //   175: dup
    //   176: aload #6
    //   178: invokespecial <init> : (Ljava/lang/String;)V
    //   181: pop
    //   182: goto -> 194
    //   185: astore #7
    //   187: aload_3
    //   188: aload_2
    //   189: aload #6
    //   191: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload #5
    //   196: aload #6
    //   198: invokevirtual setUrl : (Ljava/lang/String;)V
    //   201: aload_3
    //   202: invokevirtual isOpenapi31 : ()Z
    //   205: ifeq -> 319
    //   208: aload #5
    //   210: invokevirtual getUrl : ()Ljava/lang/String;
    //   213: ifnonnull -> 231
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: iconst_1
    //   224: goto -> 232
    //   227: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   230: athrow
    //   231: iconst_0
    //   232: istore #7
    //   234: aload_0
    //   235: sipush #-7444
    //   238: sipush #-14553
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: aload_1
    //   245: iload #7
    //   247: aload_2
    //   248: aload_3
    //   249: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   252: astore #6
    //   254: aload #6
    //   256: invokestatic isBlank : (Ljava/lang/String;)Z
    //   259: ifne -> 319
    //   262: iload #7
    //   264: ifne -> 305
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: aload_3
    //   275: aload_2
    //   276: sipush #-7429
    //   279: sipush #15041
    //   282: invokestatic a : (II)Ljava/lang/String;
    //   285: aload_1
    //   286: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   289: aload_3
    //   290: invokevirtual invalid : ()V
    //   293: aload #4
    //   295: ifnonnull -> 319
    //   298: goto -> 305
    //   301: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   304: athrow
    //   305: aload #5
    //   307: aload #6
    //   309: invokevirtual setIdentifier : (Ljava/lang/String;)V
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   318: athrow
    //   319: aload_0
    //   320: aload_1
    //   321: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   324: astore #7
    //   326: aload #7
    //   328: ifnull -> 362
    //   331: aload #7
    //   333: invokeinterface size : ()I
    //   338: ifle -> 362
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   347: athrow
    //   348: aload #5
    //   350: aload #7
    //   352: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   355: goto -> 362
    //   358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   361: athrow
    //   362: aload_0
    //   363: aload_1
    //   364: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   367: astore #8
    //   369: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   372: aload_3
    //   373: invokevirtual isOpenapi31 : ()Z
    //   376: ifeq -> 395
    //   379: sipush #-7188
    //   382: sipush #9260
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: goto -> 404
    //   391: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   394: athrow
    //   395: sipush #-7446
    //   398: sipush #984
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   409: checkcast java/util/Map
    //   412: astore #9
    //   414: aload #8
    //   416: invokeinterface iterator : ()Ljava/util/Iterator;
    //   421: astore #10
    //   423: aload #10
    //   425: invokeinterface hasNext : ()Z
    //   430: ifeq -> 533
    //   433: aload #10
    //   435: invokeinterface next : ()Ljava/lang/Object;
    //   440: checkcast java/lang/String
    //   443: astore #11
    //   445: aload #9
    //   447: sipush #-7387
    //   450: sipush #21726
    //   453: invokestatic a : (II)Ljava/lang/String;
    //   456: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   461: checkcast java/util/Set
    //   464: aload #11
    //   466: invokeinterface contains : (Ljava/lang/Object;)Z
    //   471: ifne -> 518
    //   474: aload #11
    //   476: sipush #-7344
    //   479: sipush #-28932
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   488: ifne -> 518
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   497: athrow
    //   498: aload_3
    //   499: aload_2
    //   500: aload #11
    //   502: aload_1
    //   503: aload #11
    //   505: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   508: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   511: goto -> 518
    //   514: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   517: athrow
    //   518: aload_0
    //   519: aload #9
    //   521: aload #11
    //   523: aload_2
    //   524: aload_3
    //   525: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   528: aload #4
    //   530: ifnonnull -> 423
    //   533: aload #5
    //   535: areturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/lang/Exception
    //   43	55	58	java/lang/Exception
    //   50	69	72	java/lang/Exception
    //   62	84	87	java/lang/Exception
    //   76	98	101	java/lang/Exception
    //   124	136	139	java/lang/Exception
    //   131	150	153	java/lang/Exception
    //   143	165	168	java/lang/Exception
    //   172	182	185	java/lang/Exception
    //   201	216	219	java/lang/Exception
    //   208	227	227	java/lang/Exception
    //   254	267	270	java/lang/Exception
    //   262	298	301	java/lang/Exception
    //   274	312	315	java/lang/Exception
    //   326	341	344	java/lang/Exception
    //   331	355	358	java/lang/Exception
    //   369	391	391	java/lang/Exception
    //   445	491	494	java/lang/Exception
    //   474	511	514	java/lang/Exception
  }
  
  public Contact getContact(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 15
    //   9: aconst_null
    //   10: areturn
    //   11: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   14: athrow
    //   15: new net/portswigger/swagger/v3/oas/models/info/Contact
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: astore #5
    //   24: aload_0
    //   25: sipush #-7657
    //   28: sipush #12130
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: aload_1
    //   35: iconst_0
    //   36: aload_2
    //   37: aload_3
    //   38: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   41: astore #6
    //   43: aload_3
    //   44: invokevirtual isAllowEmptyStrings : ()Z
    //   47: ifeq -> 62
    //   50: aload #6
    //   52: ifnonnull -> 91
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_3
    //   63: invokevirtual isAllowEmptyStrings : ()Z
    //   66: ifne -> 105
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   75: athrow
    //   76: aload #6
    //   78: invokestatic isBlank : (Ljava/lang/String;)Z
    //   81: ifne -> 105
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload #5
    //   93: aload #6
    //   95: invokevirtual setName : (Ljava/lang/String;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: sipush #-7316
    //   109: sipush #23477
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: aload_1
    //   116: iconst_0
    //   117: aload_2
    //   118: aload_3
    //   119: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   122: astore #6
    //   124: aload_3
    //   125: invokevirtual isAllowEmptyStrings : ()Z
    //   128: ifeq -> 143
    //   131: aload #6
    //   133: ifnonnull -> 172
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: aload_3
    //   144: invokevirtual isAllowEmptyStrings : ()Z
    //   147: ifne -> 201
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload #6
    //   159: invokestatic isBlank : (Ljava/lang/String;)Z
    //   162: ifne -> 201
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   171: athrow
    //   172: new java/net/URL
    //   175: dup
    //   176: aload #6
    //   178: invokespecial <init> : (Ljava/lang/String;)V
    //   181: pop
    //   182: goto -> 194
    //   185: astore #7
    //   187: aload_3
    //   188: aload_2
    //   189: aload #6
    //   191: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   194: aload #5
    //   196: aload #6
    //   198: invokevirtual setUrl : (Ljava/lang/String;)V
    //   201: aload_0
    //   202: sipush #-7371
    //   205: sipush #21017
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: aload_1
    //   212: iconst_0
    //   213: aload_2
    //   214: aload_3
    //   215: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   218: astore #6
    //   220: aload_3
    //   221: invokevirtual isAllowEmptyStrings : ()Z
    //   224: ifeq -> 239
    //   227: aload #6
    //   229: ifnonnull -> 268
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: aload_3
    //   240: invokevirtual isAllowEmptyStrings : ()Z
    //   243: ifne -> 282
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: aload #6
    //   255: invokestatic isBlank : (Ljava/lang/String;)Z
    //   258: ifne -> 282
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   267: athrow
    //   268: aload #5
    //   270: aload #6
    //   272: invokevirtual setEmail : (Ljava/lang/String;)V
    //   275: goto -> 282
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload_0
    //   283: aload_1
    //   284: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   287: astore #7
    //   289: aload #7
    //   291: ifnull -> 325
    //   294: aload #7
    //   296: invokeinterface size : ()I
    //   301: ifle -> 325
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   310: athrow
    //   311: aload #5
    //   313: aload #7
    //   315: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   324: athrow
    //   325: aload_0
    //   326: aload_1
    //   327: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   330: astore #8
    //   332: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   335: aload_3
    //   336: invokevirtual isOpenapi31 : ()Z
    //   339: ifeq -> 358
    //   342: sipush #-7188
    //   345: sipush #9260
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: goto -> 367
    //   354: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   357: athrow
    //   358: sipush #-7446
    //   361: sipush #984
    //   364: invokestatic a : (II)Ljava/lang/String;
    //   367: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   372: checkcast java/util/Map
    //   375: astore #9
    //   377: aload #8
    //   379: invokeinterface iterator : ()Ljava/util/Iterator;
    //   384: astore #10
    //   386: aload #10
    //   388: invokeinterface hasNext : ()Z
    //   393: ifeq -> 496
    //   396: aload #10
    //   398: invokeinterface next : ()Ljava/lang/Object;
    //   403: checkcast java/lang/String
    //   406: astore #11
    //   408: aload #9
    //   410: sipush #-7651
    //   413: sipush #-18691
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   424: checkcast java/util/Set
    //   427: aload #11
    //   429: invokeinterface contains : (Ljava/lang/Object;)Z
    //   434: ifne -> 481
    //   437: aload #11
    //   439: sipush #-7344
    //   442: sipush #-28932
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   451: ifne -> 481
    //   454: goto -> 461
    //   457: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   460: athrow
    //   461: aload_3
    //   462: aload_2
    //   463: aload #11
    //   465: aload_1
    //   466: aload #11
    //   468: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   471: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   474: goto -> 481
    //   477: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   480: athrow
    //   481: aload_0
    //   482: aload #9
    //   484: aload #11
    //   486: aload_2
    //   487: aload_3
    //   488: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   491: aload #4
    //   493: ifnonnull -> 386
    //   496: aload #5
    //   498: areturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/lang/Exception
    //   43	55	58	java/lang/Exception
    //   50	69	72	java/lang/Exception
    //   62	84	87	java/lang/Exception
    //   76	98	101	java/lang/Exception
    //   124	136	139	java/lang/Exception
    //   131	150	153	java/lang/Exception
    //   143	165	168	java/lang/Exception
    //   172	182	185	java/lang/Exception
    //   220	232	235	java/lang/Exception
    //   227	246	249	java/lang/Exception
    //   239	261	264	java/lang/Exception
    //   253	275	278	java/lang/Exception
    //   289	304	307	java/lang/Exception
    //   294	318	321	java/lang/Exception
    //   332	354	354	java/lang/Exception
    //   408	454	457	java/lang/Exception
    //   437	474	477	java/lang/Exception
  }
  
  public Content getContent(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    Content content = new Content();
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      MediaType mediaType = getMediaType((Zr)paramZr.ZL(str), String.format(a(-7464, -29626), new Object[] { paramString, str }), paramOpenAPIDeserializer$ParseResult);
      if (mediaType != null)
        content.addMediaType(str, mediaType); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return content;
  }
  
  public MediaType getMediaType(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/media/MediaType
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-7340
    //   24: sipush #22475
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_0
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   37: astore #6
    //   39: aload #6
    //   41: ifnull -> 88
    //   44: aload #5
    //   46: aload_0
    //   47: aload #6
    //   49: sipush #-7674
    //   52: sipush #9134
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: iconst_2
    //   59: anewarray java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: aload_2
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: sipush #-7384
    //   71: sipush #2478
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: aastore
    //   78: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   81: aload_3
    //   82: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   85: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   88: aload_0
    //   89: sipush #-7516
    //   92: sipush #21979
    //   95: invokestatic a : (II)Ljava/lang/String;
    //   98: aload_1
    //   99: iconst_0
    //   100: aload_2
    //   101: aload_3
    //   102: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   105: astore #7
    //   107: aload #7
    //   109: ifnull -> 266
    //   112: sipush #-7674
    //   115: sipush #9134
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: iconst_2
    //   122: anewarray java/lang/Object
    //   125: dup
    //   126: iconst_0
    //   127: aload_2
    //   128: aastore
    //   129: dup
    //   130: iconst_1
    //   131: sipush #-7677
    //   134: sipush #23837
    //   137: invokestatic a : (II)Ljava/lang/String;
    //   140: aastore
    //   141: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   144: astore #8
    //   146: aload #5
    //   148: aload_0
    //   149: aload #7
    //   151: aload #8
    //   153: aload_3
    //   154: invokevirtual getEncodingMap : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/Map;
    //   157: invokevirtual setEncoding : (Ljava/util/Map;)V
    //   160: aload #5
    //   162: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   165: ifnonnull -> 174
    //   168: invokestatic emptySet : ()Ljava/util/Set;
    //   171: goto -> 217
    //   174: aload #5
    //   176: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   179: invokevirtual get$ref : ()Ljava/lang/String;
    //   182: ifnonnull -> 216
    //   185: aload #5
    //   187: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   190: invokevirtual getProperties : ()Ljava/util/Map;
    //   193: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   196: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   201: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   204: invokestatic emptySet : ()Ljava/util/Set;
    //   207: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   210: checkcast java/util/Set
    //   213: goto -> 217
    //   216: aconst_null
    //   217: astore #9
    //   219: aload #9
    //   221: ifnull -> 266
    //   224: aload #5
    //   226: invokevirtual getEncoding : ()Ljava/util/Map;
    //   229: invokeinterface keySet : ()Ljava/util/Set;
    //   234: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   239: aload #9
    //   241: <illegal opcode> test : (Ljava/util/Set;)Ljava/util/function/Predicate;
    //   246: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   251: aload_3
    //   252: aload #8
    //   254: aload #7
    //   256: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;Lcom/fasterxml/Zg/Zr;)Ljava/util/function/Consumer;
    //   261: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   266: aload_0
    //   267: aload_1
    //   268: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   271: astore #8
    //   273: aload #8
    //   275: ifnull -> 295
    //   278: aload #8
    //   280: invokeinterface size : ()I
    //   285: ifle -> 295
    //   288: aload #5
    //   290: aload #8
    //   292: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   295: aload_0
    //   296: sipush #-7625
    //   299: sipush #23322
    //   302: invokestatic a : (II)Ljava/lang/String;
    //   305: aload_1
    //   306: iconst_0
    //   307: aload_2
    //   308: aload_3
    //   309: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   312: astore #9
    //   314: aload #9
    //   316: ifnull -> 364
    //   319: aload #5
    //   321: aload_0
    //   322: aload #9
    //   324: sipush #-7674
    //   327: sipush #9134
    //   330: invokestatic a : (II)Ljava/lang/String;
    //   333: iconst_2
    //   334: anewarray java/lang/Object
    //   337: dup
    //   338: iconst_0
    //   339: aload_2
    //   340: aastore
    //   341: dup
    //   342: iconst_1
    //   343: sipush #-7372
    //   346: sipush #30748
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   356: aload_3
    //   357: iconst_0
    //   358: invokevirtual getExamples : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   361: invokevirtual setExamples : (Ljava/util/Map;)V
    //   364: aload_0
    //   365: sipush #-7571
    //   368: sipush #16375
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: aload_1
    //   375: aload_2
    //   376: aload_3
    //   377: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   380: astore #10
    //   382: aload #10
    //   384: ifnull -> 430
    //   387: aload #9
    //   389: ifnull -> 411
    //   392: aload_3
    //   393: aload_2
    //   394: sipush #-7545
    //   397: sipush #16965
    //   400: invokestatic a : (II)Ljava/lang/String;
    //   403: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   406: aload #4
    //   408: ifnonnull -> 430
    //   411: aload #5
    //   413: aload #10
    //   415: instanceof com/fasterxml/Zg/Zs
    //   418: ifeq -> 425
    //   421: aconst_null
    //   422: goto -> 427
    //   425: aload #10
    //   427: invokevirtual setExample : (Ljava/lang/Object;)V
    //   430: aload_0
    //   431: aload_1
    //   432: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   435: astore #11
    //   437: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   440: aload_3
    //   441: invokevirtual isOpenapi31 : ()Z
    //   444: ifeq -> 459
    //   447: sipush #-7188
    //   450: sipush #9260
    //   453: invokestatic a : (II)Ljava/lang/String;
    //   456: goto -> 468
    //   459: sipush #-7446
    //   462: sipush #984
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   473: checkcast java/util/Map
    //   476: astore #12
    //   478: aload #11
    //   480: invokeinterface iterator : ()Ljava/util/Iterator;
    //   485: astore #13
    //   487: aload #13
    //   489: invokeinterface hasNext : ()Z
    //   494: ifeq -> 583
    //   497: aload #13
    //   499: invokeinterface next : ()Ljava/lang/Object;
    //   504: checkcast java/lang/String
    //   507: astore #14
    //   509: aload #12
    //   511: sipush #-7500
    //   514: sipush #16209
    //   517: invokestatic a : (II)Ljava/lang/String;
    //   520: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   525: checkcast java/util/Set
    //   528: aload #14
    //   530: invokeinterface contains : (Ljava/lang/Object;)Z
    //   535: ifne -> 568
    //   538: aload #14
    //   540: sipush #-7344
    //   543: sipush #-28932
    //   546: invokestatic a : (II)Ljava/lang/String;
    //   549: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   552: ifne -> 568
    //   555: aload_3
    //   556: aload_2
    //   557: aload #14
    //   559: aload_1
    //   560: aload #14
    //   562: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   565: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   568: aload_0
    //   569: aload #12
    //   571: aload #14
    //   573: aload_2
    //   574: aload_3
    //   575: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   578: aload #4
    //   580: ifnonnull -> 487
    //   583: aload #5
    //   585: areturn
  }
  
  public Map<String, Encoding> getEncodingMap(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      Encoding encoding = getEncoding((Zr)paramZr.ZL(str), paramString, paramOpenAPIDeserializer$ParseResult);
      if (encoding != null)
        linkedHashMap.put(str, encoding); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public Encoding getEncoding(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/media/Encoding
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-7364
    //   24: sipush #-22815
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_0
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   37: astore #6
    //   39: aload_3
    //   40: invokevirtual isAllowEmptyStrings : ()Z
    //   43: ifeq -> 51
    //   46: aload #6
    //   48: ifnonnull -> 66
    //   51: aload_3
    //   52: invokevirtual isAllowEmptyStrings : ()Z
    //   55: ifne -> 73
    //   58: aload #6
    //   60: invokestatic isBlank : (Ljava/lang/String;)Z
    //   63: ifne -> 73
    //   66: aload #5
    //   68: aload #6
    //   70: invokevirtual setContentType : (Ljava/lang/String;)V
    //   73: aload_0
    //   74: sipush #-7627
    //   77: sipush #-3030
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: aload_1
    //   84: iconst_0
    //   85: aload_2
    //   86: aload_3
    //   87: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   90: astore #6
    //   92: aload #6
    //   94: invokestatic isBlank : (Ljava/lang/String;)Z
    //   97: ifeq -> 113
    //   100: aload #5
    //   102: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   105: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;)V
    //   108: aload #4
    //   110: ifnonnull -> 245
    //   113: aload #6
    //   115: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   118: invokevirtual toString : ()Ljava/lang/String;
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifeq -> 140
    //   127: aload #5
    //   129: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   132: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;)V
    //   135: aload #4
    //   137: ifnonnull -> 245
    //   140: aload #6
    //   142: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.DEEP_OBJECT : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: invokevirtual equals : (Ljava/lang/Object;)Z
    //   151: ifeq -> 167
    //   154: aload #5
    //   156: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.DEEP_OBJECT : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   159: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;)V
    //   162: aload #4
    //   164: ifnonnull -> 245
    //   167: aload #6
    //   169: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.PIPE_DELIMITED : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   172: invokevirtual toString : ()Ljava/lang/String;
    //   175: invokevirtual equals : (Ljava/lang/Object;)Z
    //   178: ifeq -> 194
    //   181: aload #5
    //   183: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.PIPE_DELIMITED : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   186: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;)V
    //   189: aload #4
    //   191: ifnonnull -> 245
    //   194: aload #6
    //   196: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.SPACE_DELIMITED : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   199: invokevirtual toString : ()Ljava/lang/String;
    //   202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   205: ifeq -> 221
    //   208: aload #5
    //   210: getstatic net/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum.SPACE_DELIMITED : Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;
    //   213: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/media/Encoding$StyleEnum;)V
    //   216: aload #4
    //   218: ifnonnull -> 245
    //   221: aload_3
    //   222: aload_2
    //   223: sipush #-7588
    //   226: sipush #-10573
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: sipush #-7551
    //   235: sipush #15066
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: aload_1
    //   242: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   245: aload_0
    //   246: sipush #-7376
    //   249: sipush #20974
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: aload_1
    //   256: iconst_0
    //   257: aload_2
    //   258: aload_3
    //   259: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   262: astore #7
    //   264: aload #7
    //   266: ifnull -> 276
    //   269: aload #5
    //   271: aload #7
    //   273: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   276: aload_0
    //   277: sipush #-7533
    //   280: sipush #-14413
    //   283: invokestatic a : (II)Ljava/lang/String;
    //   286: aload_1
    //   287: iconst_0
    //   288: aload_2
    //   289: aload_3
    //   290: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   293: astore #8
    //   295: aload #8
    //   297: ifnull -> 307
    //   300: aload #5
    //   302: aload #8
    //   304: invokevirtual setAllowReserved : (Ljava/lang/Boolean;)V
    //   307: aload_0
    //   308: sipush #-7613
    //   311: sipush #15237
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: aload_1
    //   318: iconst_0
    //   319: aload_2
    //   320: aload_3
    //   321: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   324: astore #9
    //   326: aload #9
    //   328: ifnull -> 345
    //   331: aload #5
    //   333: aload_0
    //   334: aload #9
    //   336: aload_2
    //   337: aload_3
    //   338: iconst_0
    //   339: invokevirtual getHeaders : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   342: invokevirtual setHeaders : (Ljava/util/Map;)V
    //   345: aload_0
    //   346: aload_1
    //   347: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   350: astore #10
    //   352: aload #10
    //   354: ifnull -> 374
    //   357: aload #10
    //   359: invokeinterface size : ()I
    //   364: ifle -> 374
    //   367: aload #5
    //   369: aload #10
    //   371: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   374: aload_0
    //   375: aload_1
    //   376: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   379: astore #11
    //   381: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   384: aload_3
    //   385: invokevirtual isOpenapi31 : ()Z
    //   388: ifeq -> 403
    //   391: sipush #-7188
    //   394: sipush #9260
    //   397: invokestatic a : (II)Ljava/lang/String;
    //   400: goto -> 412
    //   403: sipush #-7446
    //   406: sipush #984
    //   409: invokestatic a : (II)Ljava/lang/String;
    //   412: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   417: checkcast java/util/Map
    //   420: astore #12
    //   422: aload #11
    //   424: invokeinterface iterator : ()Ljava/util/Iterator;
    //   429: astore #13
    //   431: aload #13
    //   433: invokeinterface hasNext : ()Z
    //   438: ifeq -> 527
    //   441: aload #13
    //   443: invokeinterface next : ()Ljava/lang/Object;
    //   448: checkcast java/lang/String
    //   451: astore #14
    //   453: aload #12
    //   455: sipush #-7473
    //   458: sipush #32369
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   469: checkcast java/util/Set
    //   472: aload #14
    //   474: invokeinterface contains : (Ljava/lang/Object;)Z
    //   479: ifne -> 512
    //   482: aload #14
    //   484: sipush #-7344
    //   487: sipush #-28932
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   496: ifne -> 512
    //   499: aload_3
    //   500: aload_2
    //   501: aload #14
    //   503: aload_1
    //   504: aload #14
    //   506: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   509: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   512: aload_0
    //   513: aload #12
    //   515: aload #14
    //   517: aload_2
    //   518: aload_3
    //   519: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   522: aload #4
    //   524: ifnonnull -> 431
    //   527: aload #5
    //   529: areturn
  }
  
  public Map<String, Link> getLinks(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 219
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7176
    //   66: sipush #-26739
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7367
    //   87: sipush #11991
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7379
    //   97: sipush #8783
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_1
    //   112: aload #9
    //   114: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   117: astore #10
    //   119: aload #10
    //   121: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   124: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 156
    //   133: aload_3
    //   134: aload_2
    //   135: aload #9
    //   137: sipush #-7362
    //   140: sipush #25325
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #10
    //   148: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   151: aload #5
    //   153: ifnonnull -> 214
    //   156: aload #10
    //   158: checkcast com/fasterxml/Zg/Zr
    //   161: astore #11
    //   163: aload_0
    //   164: aload #11
    //   166: sipush #-7674
    //   169: sipush #9134
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: iconst_2
    //   176: anewarray java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_2
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload #9
    //   187: aastore
    //   188: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   191: aload_3
    //   192: invokevirtual getLink : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/links/Link;
    //   195: astore #12
    //   197: aload #12
    //   199: ifnull -> 214
    //   202: aload #6
    //   204: aload #9
    //   206: aload #12
    //   208: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aload #5
    //   216: ifnonnull -> 36
    //   219: aload #6
    //   221: areturn
  }
  
  public Link getLink(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/links/Link
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-7225
    //   24: sipush #-25842
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 236
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 210
    //   54: aload_0
    //   55: aload #6
    //   57: invokevirtual Zz : ()Ljava/lang/String;
    //   60: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 82
    //   70: aload #5
    //   72: aload #7
    //   74: invokevirtual set$ref : (Ljava/lang/String;)V
    //   77: aload #4
    //   79: ifnonnull -> 92
    //   82: aload #5
    //   84: aload #6
    //   86: invokevirtual Zz : ()Ljava/lang/String;
    //   89: invokevirtual set$ref : (Ljava/lang/String;)V
    //   92: aload #6
    //   94: invokevirtual Zz : ()Ljava/lang/String;
    //   97: sipush #-7548
    //   100: sipush #15663
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 166
    //   112: aload #6
    //   114: invokevirtual Zz : ()Ljava/lang/String;
    //   117: sipush #-7608
    //   120: sipush #16661
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   129: ifne -> 166
    //   132: aload_3
    //   133: aload_2
    //   134: aload #6
    //   136: invokevirtual Zz : ()Ljava/lang/String;
    //   139: sipush #-7462
    //   142: sipush #8250
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: swap
    //   149: sipush #-7666
    //   152: sipush #-8628
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_3
    //   167: invokevirtual isOpenapi31 : ()Z
    //   170: ifeq -> 207
    //   173: aload_0
    //   174: sipush #-7642
    //   177: sipush #4544
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: aload_1
    //   184: iconst_0
    //   185: aload_2
    //   186: aload_3
    //   187: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   190: astore #8
    //   192: aload #8
    //   194: invokestatic isBlank : (Ljava/lang/String;)Z
    //   197: ifne -> 207
    //   200: aload #5
    //   202: aload #8
    //   204: invokevirtual setDescription : (Ljava/lang/String;)V
    //   207: aload #5
    //   209: areturn
    //   210: aload_3
    //   211: aload_2
    //   212: sipush #-7225
    //   215: sipush #-25842
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: sipush #-7551
    //   224: sipush #15066
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: aload_1
    //   231: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   234: aconst_null
    //   235: areturn
    //   236: aload_0
    //   237: sipush #-7603
    //   240: sipush #7212
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: aload_1
    //   247: iconst_0
    //   248: aload_2
    //   249: aload_3
    //   250: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   253: astore #7
    //   255: aload_3
    //   256: invokevirtual isAllowEmptyStrings : ()Z
    //   259: ifeq -> 267
    //   262: aload #7
    //   264: ifnonnull -> 282
    //   267: aload_3
    //   268: invokevirtual isAllowEmptyStrings : ()Z
    //   271: ifne -> 289
    //   274: aload #7
    //   276: invokestatic isBlank : (Ljava/lang/String;)Z
    //   279: ifne -> 289
    //   282: aload #5
    //   284: aload #7
    //   286: invokevirtual setOperationRef : (Ljava/lang/String;)V
    //   289: aload_0
    //   290: sipush #-7615
    //   293: sipush #15504
    //   296: invokestatic a : (II)Ljava/lang/String;
    //   299: aload_1
    //   300: iconst_0
    //   301: aload_2
    //   302: aload_3
    //   303: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   306: astore #7
    //   308: aload_3
    //   309: invokevirtual isAllowEmptyStrings : ()Z
    //   312: ifeq -> 320
    //   315: aload #7
    //   317: ifnonnull -> 335
    //   320: aload_3
    //   321: invokevirtual isAllowEmptyStrings : ()Z
    //   324: ifne -> 342
    //   327: aload #7
    //   329: invokestatic isBlank : (Ljava/lang/String;)Z
    //   332: ifne -> 342
    //   335: aload #5
    //   337: aload #7
    //   339: invokevirtual setOperationId : (Ljava/lang/String;)V
    //   342: aload_0
    //   343: sipush #-7515
    //   346: sipush #-2891
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aload_1
    //   353: iconst_0
    //   354: aload_2
    //   355: aload_3
    //   356: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   359: astore #8
    //   361: aload #8
    //   363: ifnull -> 379
    //   366: aload #5
    //   368: aload_0
    //   369: aload #8
    //   371: aload_2
    //   372: aload_3
    //   373: invokevirtual getLinkParameters : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/util/Map;
    //   376: invokevirtual setParameters : (Ljava/util/Map;)V
    //   379: aload_0
    //   380: sipush #-7488
    //   383: sipush #21011
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aload_1
    //   390: iconst_0
    //   391: aload_2
    //   392: aload_3
    //   393: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   396: astore #9
    //   398: aload_3
    //   399: invokevirtual isAllowEmptyStrings : ()Z
    //   402: ifeq -> 417
    //   405: aload #9
    //   407: ifnull -> 417
    //   410: aload #5
    //   412: aload #9
    //   414: invokevirtual setRequestBody : (Ljava/lang/Object;)V
    //   417: aload_0
    //   418: sipush #-7613
    //   421: sipush #15237
    //   424: invokestatic a : (II)Ljava/lang/String;
    //   427: aload_1
    //   428: iconst_0
    //   429: aload_2
    //   430: aload_3
    //   431: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   434: astore #10
    //   436: aload #10
    //   438: ifnull -> 455
    //   441: aload #5
    //   443: aload_0
    //   444: aload #10
    //   446: aload_2
    //   447: aload_3
    //   448: iconst_0
    //   449: invokevirtual getHeaders : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   452: invokevirtual setHeaders : (Ljava/util/Map;)V
    //   455: aload_0
    //   456: sipush #-7537
    //   459: sipush #-30050
    //   462: invokestatic a : (II)Ljava/lang/String;
    //   465: aload_1
    //   466: iconst_0
    //   467: aload_2
    //   468: aload_3
    //   469: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   472: astore #11
    //   474: aload #11
    //   476: ifnull -> 492
    //   479: aload #5
    //   481: aload_0
    //   482: aload #11
    //   484: aload_2
    //   485: aload_3
    //   486: invokevirtual getServer : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/servers/Server;
    //   489: invokevirtual setServer : (Lnet/portswigger/swagger/v3/oas/models/servers/Server;)V
    //   492: aload_0
    //   493: sipush #-7642
    //   496: sipush #4544
    //   499: invokestatic a : (II)Ljava/lang/String;
    //   502: aload_1
    //   503: iconst_0
    //   504: aload_2
    //   505: aload_3
    //   506: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   509: astore #7
    //   511: aload_3
    //   512: invokevirtual isAllowEmptyStrings : ()Z
    //   515: ifeq -> 523
    //   518: aload #7
    //   520: ifnonnull -> 538
    //   523: aload_3
    //   524: invokevirtual isAllowEmptyStrings : ()Z
    //   527: ifne -> 545
    //   530: aload #7
    //   532: invokestatic isBlank : (Ljava/lang/String;)Z
    //   535: ifne -> 545
    //   538: aload #5
    //   540: aload #7
    //   542: invokevirtual setDescription : (Ljava/lang/String;)V
    //   545: aload_0
    //   546: aload_1
    //   547: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   550: astore #12
    //   552: aload #12
    //   554: ifnull -> 574
    //   557: aload #12
    //   559: invokeinterface size : ()I
    //   564: ifle -> 574
    //   567: aload #5
    //   569: aload #12
    //   571: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   574: aload_0
    //   575: aload_1
    //   576: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   579: astore #13
    //   581: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   584: aload_3
    //   585: invokevirtual isOpenapi31 : ()Z
    //   588: ifeq -> 603
    //   591: sipush #-7188
    //   594: sipush #9260
    //   597: invokestatic a : (II)Ljava/lang/String;
    //   600: goto -> 612
    //   603: sipush #-7446
    //   606: sipush #984
    //   609: invokestatic a : (II)Ljava/lang/String;
    //   612: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   617: checkcast java/util/Map
    //   620: astore #14
    //   622: aload #13
    //   624: invokeinterface iterator : ()Ljava/util/Iterator;
    //   629: astore #15
    //   631: aload #15
    //   633: invokeinterface hasNext : ()Z
    //   638: ifeq -> 727
    //   641: aload #15
    //   643: invokeinterface next : ()Ljava/lang/Object;
    //   648: checkcast java/lang/String
    //   651: astore #16
    //   653: aload #14
    //   655: sipush #-7400
    //   658: sipush #-14327
    //   661: invokestatic a : (II)Ljava/lang/String;
    //   664: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   669: checkcast java/util/Set
    //   672: aload #16
    //   674: invokeinterface contains : (Ljava/lang/Object;)Z
    //   679: ifne -> 712
    //   682: aload #16
    //   684: sipush #-7344
    //   687: sipush #-28932
    //   690: invokestatic a : (II)Ljava/lang/String;
    //   693: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   696: ifne -> 712
    //   699: aload_3
    //   700: aload_2
    //   701: aload #16
    //   703: aload_1
    //   704: aload #16
    //   706: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   709: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   712: aload_0
    //   713: aload #14
    //   715: aload #16
    //   717: aload_2
    //   718: aload_3
    //   719: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   722: aload #4
    //   724: ifnonnull -> 631
    //   727: aload #5
    //   729: areturn
  }
  
  private Map<String, String> getLinkParameters(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Set<String> set = getKeys(paramZr);
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    for (String str : set) {
      Zb zb = paramZr.ZL(str);
      linkedHashMap.put(str, zb.Zp());
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public Map<String, Callback> getCallbacks(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      if (paramBoolean && !Pattern.matches(a(-7529, -20813), str))
        paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7178, 30298) + a(-7178, 30298) + str); 
      Callback callback = getCallback((Zr)paramZr.ZL(str), paramString, paramOpenAPIDeserializer$ParseResult);
      if (callback != null)
        linkedHashMap.put(str, callback); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public Callback getCallback(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/callbacks/Callback
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #6
    //   27: aload #6
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #7
    //   36: aload #7
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 329
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #8
    //   58: aload_1
    //   59: aload #8
    //   61: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   64: astore #9
    //   66: aload_1
    //   67: ifnull -> 324
    //   70: aload_1
    //   71: sipush #-7225
    //   74: sipush #-25842
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   83: astore #10
    //   85: aload #10
    //   87: ifnull -> 245
    //   90: aload #10
    //   92: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   95: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   98: invokevirtual equals : (Ljava/lang/Object;)Z
    //   101: ifeq -> 219
    //   104: aload_0
    //   105: aload #10
    //   107: invokevirtual Zz : ()Ljava/lang/String;
    //   110: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   113: astore #11
    //   115: aload #11
    //   117: ifnull -> 132
    //   120: aload #5
    //   122: aload #11
    //   124: invokevirtual set$ref : (Ljava/lang/String;)V
    //   127: aload #4
    //   129: ifnonnull -> 142
    //   132: aload #5
    //   134: aload #10
    //   136: invokevirtual Zz : ()Ljava/lang/String;
    //   139: invokevirtual set$ref : (Ljava/lang/String;)V
    //   142: aload #10
    //   144: invokevirtual Zz : ()Ljava/lang/String;
    //   147: sipush #-7548
    //   150: sipush #15663
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   159: ifeq -> 216
    //   162: aload #10
    //   164: invokevirtual Zz : ()Ljava/lang/String;
    //   167: sipush #-7632
    //   170: sipush #-1334
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   179: ifne -> 216
    //   182: aload_3
    //   183: aload_2
    //   184: aload #10
    //   186: invokevirtual Zz : ()Ljava/lang/String;
    //   189: sipush #-7462
    //   192: sipush #8250
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: swap
    //   199: sipush #-7389
    //   202: sipush #13568
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   213: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   216: aload #5
    //   218: areturn
    //   219: aload_3
    //   220: aload_2
    //   221: sipush #-7225
    //   224: sipush #-25842
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: sipush #-7551
    //   233: sipush #15066
    //   236: invokestatic a : (II)Ljava/lang/String;
    //   239: aload_1
    //   240: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   243: aconst_null
    //   244: areturn
    //   245: aload #9
    //   247: invokevirtual ZB : ()Z
    //   250: ifeq -> 277
    //   253: aload #5
    //   255: aload #8
    //   257: aload_0
    //   258: aload #9
    //   260: checkcast com/fasterxml/Zg/Zr
    //   263: aload_2
    //   264: aload_3
    //   265: invokevirtual getPathItem : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/PathItem;
    //   268: invokevirtual addPathItem : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/PathItem;)Lnet/portswigger/swagger/v3/oas/models/callbacks/Callback;
    //   271: pop
    //   272: aload #4
    //   274: ifnonnull -> 295
    //   277: aload_3
    //   278: aload_2
    //   279: aload #8
    //   281: sipush #-7362
    //   284: sipush #25325
    //   287: invokestatic a : (II)Ljava/lang/String;
    //   290: aload #9
    //   292: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   295: aload_0
    //   296: aload_1
    //   297: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   300: astore #11
    //   302: aload #11
    //   304: ifnull -> 324
    //   307: aload #11
    //   309: invokeinterface size : ()I
    //   314: ifle -> 324
    //   317: aload #5
    //   319: aload #11
    //   321: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   324: aload #4
    //   326: ifnonnull -> 36
    //   329: aload #5
    //   331: areturn
  }
  
  public XML getXml(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    XML xML = new XML();
    String str = getString(a(-7657, 12130), paramZr, false, String.format(a(-7674, 9134), new Object[] { paramString, a(-7657, 12130) }), paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      xML.setName(str); 
    str = getString(a(-7452, -22950), paramZr, false, String.format(a(-7674, 9134), new Object[] { paramString, a(-7452, -22950) }), paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      xML.setNamespace(str); 
    str = getString(a(-7527, 15009), paramZr, false, String.format(a(-7674, 9134), new Object[] { paramString, a(-7527, 15009) }), paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      xML.setPrefix(str); 
    Boolean bool1 = getBoolean(a(-7359, 297), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (bool1 != null)
      xML.setAttribute(bool1); 
    Boolean bool2 = getBoolean(a(-7470, 3031), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (bool2 != null)
      xML.setWrapped(bool2); 
    Map<String, Object> map = getExtensions(paramZr);
    if (map != null && map.size() > 0)
      xML.setExtensions(map); 
    Set<String> set = getKeys(paramZr);
    Map<String, Set<String>> map1 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7188, 9260) : a(-7446, 984));
    for (String str1 : set) {
      if (!((Set)map1.get(a(-7342, 1270))).contains(str1) && !str1.startsWith(a(-7344, -28932)))
        paramOpenAPIDeserializer$ParseResult.extra(paramString, str1, paramZr.ZL(str1)); 
      validateReservedKeywords(map1, str1, paramString, paramOpenAPIDeserializer$ParseResult);
      if (arrayOfZbqc == null)
        break; 
    } 
    return xML;
  }
  
  public Zh getArray(String paramString1, Zr paramZr, boolean paramBoolean1, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: aload_1
    //   5: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   8: astore #8
    //   10: astore #7
    //   12: aconst_null
    //   13: astore #9
    //   15: aload #8
    //   17: ifnonnull -> 42
    //   20: iload_3
    //   21: ifeq -> 92
    //   24: aload #5
    //   26: aload #4
    //   28: aload_1
    //   29: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload #5
    //   34: invokevirtual invalid : ()V
    //   37: aload #7
    //   39: ifnonnull -> 92
    //   42: aload #8
    //   44: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   47: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifne -> 85
    //   56: iload #6
    //   58: ifne -> 92
    //   61: aload #5
    //   63: aload #4
    //   65: aload_1
    //   66: sipush #-7227
    //   69: sipush #19597
    //   72: invokestatic a : (II)Ljava/lang/String;
    //   75: aload #8
    //   77: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   80: aload #7
    //   82: ifnonnull -> 92
    //   85: aload #8
    //   87: checkcast com/fasterxml/Zg/Zh
    //   90: astore #9
    //   92: aload #9
    //   94: areturn
  }
  
  public Zh getArray(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    return getArray(paramString1, paramZr, paramBoolean, paramString2, paramOpenAPIDeserializer$ParseResult, false);
  }
  
  public Boolean getBoolean(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aconst_null
    //   4: astore #7
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   11: astore #8
    //   13: astore #6
    //   15: aload_2
    //   16: ifnull -> 24
    //   19: aload #8
    //   21: ifnonnull -> 46
    //   24: iload_3
    //   25: ifeq -> 103
    //   28: aload #5
    //   30: aload #4
    //   32: aload_1
    //   33: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload #5
    //   38: invokevirtual invalid : ()V
    //   41: aload #6
    //   43: ifnonnull -> 103
    //   46: aload #8
    //   48: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   51: getstatic com/fasterxml/Zg/Zfr.BOOLEAN : Lcom/fasterxml/Zg/Zfr;
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifeq -> 73
    //   60: aload #8
    //   62: invokevirtual Zf : ()Z
    //   65: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   68: astore #7
    //   70: goto -> 103
    //   73: aload #8
    //   75: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   78: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   81: invokevirtual equals : (Ljava/lang/Object;)Z
    //   84: ifeq -> 103
    //   87: aload #8
    //   89: invokevirtual Zz : ()Ljava/lang/String;
    //   92: astore #9
    //   94: aload #9
    //   96: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   99: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   102: areturn
    //   103: aload #7
    //   105: areturn
  }
  
  public BigDecimal getBigDecimal(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #7
    //   3: invokestatic ZV : ()[Lburp/Zbqc;
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   11: astore #8
    //   13: astore #6
    //   15: aload_2
    //   16: ifnull -> 24
    //   19: aload #8
    //   21: ifnonnull -> 46
    //   24: iload_3
    //   25: ifeq -> 103
    //   28: aload #5
    //   30: aload #4
    //   32: aload_1
    //   33: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload #5
    //   38: invokevirtual invalid : ()V
    //   41: aload #6
    //   43: ifnonnull -> 103
    //   46: aload #8
    //   48: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   51: getstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifeq -> 77
    //   60: new java/math/BigDecimal
    //   63: dup
    //   64: aload #8
    //   66: invokevirtual Zp : ()Ljava/lang/String;
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: astore #7
    //   74: goto -> 103
    //   77: aload #8
    //   79: invokevirtual ZA : ()Z
    //   82: ifne -> 103
    //   85: aload #5
    //   87: aload #4
    //   89: aload_1
    //   90: sipush #-7210
    //   93: sipush #5644
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: aload_2
    //   100: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   103: aload #7
    //   105: areturn
  }
  
  public Integer getInteger(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aconst_null
    //   4: astore #7
    //   6: astore #6
    //   8: aload_2
    //   9: aload_1
    //   10: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   13: astore #8
    //   15: aload_2
    //   16: ifnull -> 24
    //   19: aload #8
    //   21: ifnonnull -> 46
    //   24: iload_3
    //   25: ifeq -> 107
    //   28: aload #5
    //   30: aload #4
    //   32: aload_1
    //   33: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload #5
    //   38: invokevirtual invalid : ()V
    //   41: aload #6
    //   43: ifnonnull -> 107
    //   46: aload #8
    //   48: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   51: getstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifeq -> 81
    //   60: aload #8
    //   62: invokevirtual Za : ()Z
    //   65: ifeq -> 107
    //   68: aload #8
    //   70: invokevirtual ZN : ()I
    //   73: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   76: astore #7
    //   78: goto -> 107
    //   81: aload #8
    //   83: invokevirtual ZA : ()Z
    //   86: ifne -> 107
    //   89: aload #5
    //   91: aload #4
    //   93: aload_1
    //   94: sipush #-7378
    //   97: sipush #-13326
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: aload_2
    //   104: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   107: aload #7
    //   109: areturn
  }
  
  public Map<String, Parameter> getParameters(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    HashSet hashSet = new HashSet();
    Parameter parameter = null;
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      if (paramBoolean && !Pattern.matches(a(-7529, -20813), str))
        paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7636, 5173) + a(-7636, 5173) + str); 
      Zb zb = paramZr.ZL(str);
      if (zb.ZF().equals(Zfr.OBJECT)) {
        Zr zr = (Zr)zb;
        if (zr != null) {
          parameter = getParameter(zr, String.format(a(-7674, 9134), new Object[] { paramString, str }), paramOpenAPIDeserializer$ParseResult);
          if (parameter != null) {
            if (a(-7638, -24907).equalsIgnoreCase(parameter.getIn()) && Boolean.FALSE.equals(parameter.getRequired()))
              paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7392, -29234) + a(-7392, -29234) + str); 
            linkedHashMap.put(str, parameter);
          } 
        } 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public List<Parameter> getParameterList(Zh paramZh, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: astore #4
    //   14: aload_1
    //   15: ifnonnull -> 21
    //   18: aload #5
    //   20: areturn
    //   21: aload_1
    //   22: invokevirtual iterator : ()Ljava/util/Iterator;
    //   25: astore #6
    //   27: aload #6
    //   29: invokeinterface hasNext : ()Z
    //   34: ifeq -> 96
    //   37: aload #6
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast com/fasterxml/Zor/Zb
    //   47: astore #7
    //   49: aload #7
    //   51: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   54: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 91
    //   63: aload_0
    //   64: aload #7
    //   66: checkcast com/fasterxml/Zg/Zr
    //   69: aload_2
    //   70: aload_3
    //   71: invokevirtual getParameter : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;
    //   74: astore #8
    //   76: aload #8
    //   78: ifnull -> 91
    //   81: aload #5
    //   83: aload #8
    //   85: invokeinterface add : (Ljava/lang/Object;)Z
    //   90: pop
    //   91: aload #4
    //   93: ifnonnull -> 27
    //   96: new java/util/HashSet
    //   99: dup
    //   100: invokespecial <init> : ()V
    //   103: astore #6
    //   105: aload #5
    //   107: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   112: aload_0
    //   113: <illegal opcode> apply : (Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer;)Ljava/util/function/Function;
    //   118: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   123: aload #6
    //   125: aload_3
    //   126: aload_2
    //   127: <illegal opcode> accept : (Ljava/util/Set;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   132: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   137: aload #5
    //   139: areturn
  }
  
  private Parameter getParameterDefinition(Parameter paramParameter) {
    if (paramParameter.get$ref() == null)
      return paramParameter; 
    String str = RefUtils.extractSimpleName(paramParameter.get$ref());
    return Optional.<Components>ofNullable(this.components).map(Components::getParameters).map(str::lambda$getParameterDefinition$8).orElse(paramParameter);
  }
  
  public Parameter getParameter(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aconst_null
    //   12: astore #5
    //   14: aload_1
    //   15: sipush #-7225
    //   18: sipush #-25842
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   27: astore #6
    //   29: aload #6
    //   31: ifnull -> 259
    //   34: aload #6
    //   36: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   39: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   42: invokevirtual equals : (Ljava/lang/Object;)Z
    //   45: ifeq -> 233
    //   48: new net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #5
    //   57: aload_0
    //   58: aload #6
    //   60: invokevirtual Zz : ()Ljava/lang/String;
    //   63: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   66: astore #7
    //   68: aload #7
    //   70: ifnull -> 85
    //   73: aload #5
    //   75: aload #7
    //   77: invokevirtual set$ref : (Ljava/lang/String;)V
    //   80: aload #4
    //   82: ifnonnull -> 95
    //   85: aload #5
    //   87: aload #6
    //   89: invokevirtual Zz : ()Ljava/lang/String;
    //   92: invokevirtual set$ref : (Ljava/lang/String;)V
    //   95: aload #6
    //   97: invokevirtual Zz : ()Ljava/lang/String;
    //   100: sipush #-7548
    //   103: sipush #15663
    //   106: invokestatic a : (II)Ljava/lang/String;
    //   109: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   112: ifeq -> 189
    //   115: aload #6
    //   117: invokevirtual Zz : ()Ljava/lang/String;
    //   120: sipush #-7477
    //   123: sipush #-23953
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   132: ifne -> 189
    //   135: aload #6
    //   137: invokevirtual Zz : ()Ljava/lang/String;
    //   140: sipush #-7461
    //   143: sipush #21250
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   152: ifne -> 189
    //   155: aload_3
    //   156: aload_2
    //   157: aload #6
    //   159: invokevirtual Zz : ()Ljava/lang/String;
    //   162: sipush #-7462
    //   165: sipush #8250
    //   168: invokestatic a : (II)Ljava/lang/String;
    //   171: swap
    //   172: sipush #-7678
    //   175: sipush #4614
    //   178: invokestatic a : (II)Ljava/lang/String;
    //   181: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   186: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   189: aload_3
    //   190: invokevirtual isOpenapi31 : ()Z
    //   193: ifeq -> 230
    //   196: aload_0
    //   197: sipush #-7642
    //   200: sipush #4544
    //   203: invokestatic a : (II)Ljava/lang/String;
    //   206: aload_1
    //   207: iconst_0
    //   208: aload_2
    //   209: aload_3
    //   210: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   213: astore #8
    //   215: aload #8
    //   217: invokestatic isBlank : (Ljava/lang/String;)Z
    //   220: ifne -> 230
    //   223: aload #5
    //   225: aload #8
    //   227: invokevirtual setDescription : (Ljava/lang/String;)V
    //   230: aload #5
    //   232: areturn
    //   233: aload_3
    //   234: aload_2
    //   235: sipush #-7225
    //   238: sipush #-25842
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: sipush #-7551
    //   247: sipush #15066
    //   250: invokestatic a : (II)Ljava/lang/String;
    //   253: aload_1
    //   254: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   257: aconst_null
    //   258: areturn
    //   259: aconst_null
    //   260: astore #7
    //   262: aload_1
    //   263: sipush #-7657
    //   266: sipush #12130
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   275: astore #8
    //   277: aload #8
    //   279: ifnull -> 292
    //   282: aload #8
    //   284: invokevirtual Zp : ()Ljava/lang/String;
    //   287: astore #7
    //   289: goto -> 303
    //   292: sipush #-7553
    //   295: sipush #23644
    //   298: invokestatic a : (II)Ljava/lang/String;
    //   301: astore #7
    //   303: aload_2
    //   304: aload #7
    //   306: sipush #-7468
    //   309: sipush #25914
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: swap
    //   316: ldc ']'
    //   318: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   323: astore_2
    //   324: aload_0
    //   325: sipush #-7617
    //   328: sipush #13295
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: aload_1
    //   335: iconst_1
    //   336: aload_2
    //   337: aload_3
    //   338: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   341: astore #9
    //   343: aload_3
    //   344: invokevirtual isAllowEmptyStrings : ()Z
    //   347: ifne -> 358
    //   350: aload #9
    //   352: invokestatic isBlank : (Ljava/lang/String;)Z
    //   355: ifne -> 370
    //   358: aload_3
    //   359: invokevirtual isAllowEmptyStrings : ()Z
    //   362: ifeq -> 372
    //   365: aload #9
    //   367: ifnonnull -> 372
    //   370: aconst_null
    //   371: areturn
    //   372: sipush #-7329
    //   375: sipush #20721
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: aload #9
    //   383: invokevirtual equals : (Ljava/lang/Object;)Z
    //   386: ifeq -> 401
    //   389: new net/portswigger/swagger/v3/oas/models/parameters/QueryParameter
    //   392: dup
    //   393: invokespecial <init> : ()V
    //   396: astore #5
    //   398: goto -> 485
    //   401: sipush #-7660
    //   404: sipush #868
    //   407: invokestatic a : (II)Ljava/lang/String;
    //   410: aload #9
    //   412: invokevirtual equals : (Ljava/lang/Object;)Z
    //   415: ifeq -> 430
    //   418: new net/portswigger/swagger/v3/oas/models/parameters/HeaderParameter
    //   421: dup
    //   422: invokespecial <init> : ()V
    //   425: astore #5
    //   427: goto -> 485
    //   430: sipush #-7335
    //   433: sipush #-26578
    //   436: invokestatic a : (II)Ljava/lang/String;
    //   439: aload #9
    //   441: invokevirtual equals : (Ljava/lang/Object;)Z
    //   444: ifeq -> 459
    //   447: new net/portswigger/swagger/v3/oas/models/parameters/PathParameter
    //   450: dup
    //   451: invokespecial <init> : ()V
    //   454: astore #5
    //   456: goto -> 485
    //   459: sipush #-7192
    //   462: sipush #-20041
    //   465: invokestatic a : (II)Ljava/lang/String;
    //   468: aload #9
    //   470: invokevirtual equals : (Ljava/lang/Object;)Z
    //   473: ifeq -> 485
    //   476: new net/portswigger/swagger/v3/oas/models/parameters/CookieParameter
    //   479: dup
    //   480: invokespecial <init> : ()V
    //   483: astore #5
    //   485: aload #5
    //   487: ifnonnull -> 516
    //   490: aload_3
    //   491: aload_2
    //   492: sipush #-7614
    //   495: sipush #-20403
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: sipush #-7607
    //   504: sipush #-5038
    //   507: invokestatic a : (II)Ljava/lang/String;
    //   510: aload_1
    //   511: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   514: aconst_null
    //   515: areturn
    //   516: aload #5
    //   518: aload #9
    //   520: invokevirtual setIn : (Ljava/lang/String;)V
    //   523: aload_0
    //   524: sipush #-7657
    //   527: sipush #12130
    //   530: invokestatic a : (II)Ljava/lang/String;
    //   533: aload_1
    //   534: iconst_1
    //   535: aload_2
    //   536: aload_3
    //   537: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   540: astore #9
    //   542: aload_3
    //   543: invokevirtual isAllowEmptyStrings : ()Z
    //   546: ifeq -> 554
    //   549: aload #9
    //   551: ifnonnull -> 569
    //   554: aload_3
    //   555: invokevirtual isAllowEmptyStrings : ()Z
    //   558: ifne -> 576
    //   561: aload #9
    //   563: invokestatic isBlank : (Ljava/lang/String;)Z
    //   566: ifne -> 576
    //   569: aload #5
    //   571: aload #9
    //   573: invokevirtual setName : (Ljava/lang/String;)V
    //   576: aload_0
    //   577: sipush #-7642
    //   580: sipush #4544
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: aload_1
    //   587: iconst_0
    //   588: aload_2
    //   589: aload_3
    //   590: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   593: astore #9
    //   595: aload_3
    //   596: invokevirtual isAllowEmptyStrings : ()Z
    //   599: ifeq -> 607
    //   602: aload #9
    //   604: ifnonnull -> 622
    //   607: aload_3
    //   608: invokevirtual isAllowEmptyStrings : ()Z
    //   611: ifne -> 629
    //   614: aload #9
    //   616: invokestatic isBlank : (Ljava/lang/String;)Z
    //   619: ifne -> 629
    //   622: aload #5
    //   624: aload #9
    //   626: invokevirtual setDescription : (Ljava/lang/String;)V
    //   629: aload_0
    //   630: sipush #-7325
    //   633: sipush #8426
    //   636: invokestatic a : (II)Ljava/lang/String;
    //   639: aload_1
    //   640: iconst_0
    //   641: aload_2
    //   642: aload_3
    //   643: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   646: astore #10
    //   648: aload #10
    //   650: ifnull -> 665
    //   653: aload #5
    //   655: aload #10
    //   657: invokevirtual setRequired : (Ljava/lang/Boolean;)V
    //   660: aload #4
    //   662: ifnonnull -> 674
    //   665: aload #5
    //   667: iconst_0
    //   668: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   671: invokevirtual setRequired : (Ljava/lang/Boolean;)V
    //   674: aload_0
    //   675: sipush #-7634
    //   678: sipush #-19192
    //   681: invokestatic a : (II)Ljava/lang/String;
    //   684: aload_1
    //   685: iconst_0
    //   686: aload_2
    //   687: aload_3
    //   688: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   691: astore #11
    //   693: aload #11
    //   695: ifnull -> 705
    //   698: aload #5
    //   700: aload #11
    //   702: invokevirtual setDeprecated : (Ljava/lang/Boolean;)V
    //   705: aload #5
    //   707: instanceof net/portswigger/swagger/v3/oas/models/parameters/QueryParameter
    //   710: ifeq -> 744
    //   713: aload_0
    //   714: sipush #-7218
    //   717: sipush #4755
    //   720: invokestatic a : (II)Ljava/lang/String;
    //   723: aload_1
    //   724: iconst_0
    //   725: aload_2
    //   726: aload_3
    //   727: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   730: astore #12
    //   732: aload #12
    //   734: ifnull -> 744
    //   737: aload #5
    //   739: aload #12
    //   741: invokevirtual setAllowEmptyValue : (Ljava/lang/Boolean;)V
    //   744: aload_0
    //   745: sipush #-7384
    //   748: sipush #2478
    //   751: invokestatic a : (II)Ljava/lang/String;
    //   754: aload_1
    //   755: iconst_0
    //   756: aload_2
    //   757: aload_3
    //   758: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   761: astore #12
    //   763: aload #12
    //   765: ifnull -> 812
    //   768: aload #5
    //   770: aload_0
    //   771: aload #12
    //   773: sipush #-7674
    //   776: sipush #9134
    //   779: invokestatic a : (II)Ljava/lang/String;
    //   782: iconst_2
    //   783: anewarray java/lang/Object
    //   786: dup
    //   787: iconst_0
    //   788: aload_2
    //   789: aastore
    //   790: dup
    //   791: iconst_1
    //   792: sipush #-7494
    //   795: sipush #-15342
    //   798: invokestatic a : (II)Ljava/lang/String;
    //   801: aastore
    //   802: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   805: aload_3
    //   806: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   809: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   812: aload_0
    //   813: sipush #-7372
    //   816: sipush #30748
    //   819: invokestatic a : (II)Ljava/lang/String;
    //   822: aload_1
    //   823: iconst_0
    //   824: aload_2
    //   825: aload_3
    //   826: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   829: astore #13
    //   831: aload #13
    //   833: ifnull -> 881
    //   836: aload #5
    //   838: aload_0
    //   839: aload #13
    //   841: sipush #-7674
    //   844: sipush #9134
    //   847: invokestatic a : (II)Ljava/lang/String;
    //   850: iconst_2
    //   851: anewarray java/lang/Object
    //   854: dup
    //   855: iconst_0
    //   856: aload_2
    //   857: aastore
    //   858: dup
    //   859: iconst_1
    //   860: sipush #-7372
    //   863: sipush #30748
    //   866: invokestatic a : (II)Ljava/lang/String;
    //   869: aastore
    //   870: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   873: aload_3
    //   874: iconst_0
    //   875: invokevirtual getExamples : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   878: invokevirtual setExamples : (Ljava/util/Map;)V
    //   881: aload_0
    //   882: sipush #-7193
    //   885: sipush #-4890
    //   888: invokestatic a : (II)Ljava/lang/String;
    //   891: aload_1
    //   892: aload_2
    //   893: aload_3
    //   894: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   897: astore #14
    //   899: aload #14
    //   901: ifnull -> 947
    //   904: aload #13
    //   906: ifnull -> 928
    //   909: aload_3
    //   910: aload_2
    //   911: sipush #-7302
    //   914: sipush #16410
    //   917: invokestatic a : (II)Ljava/lang/String;
    //   920: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   923: aload #4
    //   925: ifnonnull -> 947
    //   928: aload #5
    //   930: aload #14
    //   932: instanceof com/fasterxml/Zg/Zs
    //   935: ifeq -> 942
    //   938: aconst_null
    //   939: goto -> 944
    //   942: aload #14
    //   944: invokevirtual setExample : (Ljava/lang/Object;)V
    //   947: aload_0
    //   948: sipush #-7407
    //   951: sipush #11024
    //   954: invokestatic a : (II)Ljava/lang/String;
    //   957: aload_1
    //   958: iconst_0
    //   959: aload_2
    //   960: aload_3
    //   961: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   964: astore #15
    //   966: aload #15
    //   968: ifnull -> 978
    //   971: aload #5
    //   973: aload #15
    //   975: invokevirtual setAllowReserved : (Ljava/lang/Boolean;)V
    //   978: aload_0
    //   979: sipush #-7402
    //   982: sipush #23593
    //   985: invokestatic a : (II)Ljava/lang/String;
    //   988: aload_1
    //   989: iconst_0
    //   990: aload_2
    //   991: aload_3
    //   992: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   995: astore #16
    //   997: aload #16
    //   999: ifnull -> 1155
    //   1002: aload_0
    //   1003: aload #16
    //   1005: sipush #-7674
    //   1008: sipush #9134
    //   1011: invokestatic a : (II)Ljava/lang/String;
    //   1014: iconst_2
    //   1015: anewarray java/lang/Object
    //   1018: dup
    //   1019: iconst_0
    //   1020: aload_2
    //   1021: aastore
    //   1022: dup
    //   1023: iconst_1
    //   1024: sipush #-7402
    //   1027: sipush #23593
    //   1030: invokestatic a : (II)Ljava/lang/String;
    //   1033: aastore
    //   1034: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1037: aload_3
    //   1038: invokevirtual getContent : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   1041: astore #17
    //   1043: aload #17
    //   1045: invokevirtual size : ()I
    //   1048: ifne -> 1076
    //   1051: aload_3
    //   1052: aload_2
    //   1053: sipush #-7592
    //   1056: sipush #-31466
    //   1059: invokestatic a : (II)Ljava/lang/String;
    //   1062: aload #16
    //   1064: invokevirtual unsupported : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1067: aload_3
    //   1068: invokevirtual invalid : ()V
    //   1071: aload #4
    //   1073: ifnonnull -> 1150
    //   1076: aload #17
    //   1078: invokevirtual size : ()I
    //   1081: iconst_1
    //   1082: if_icmple -> 1110
    //   1085: aload_3
    //   1086: aload_2
    //   1087: sipush #-7514
    //   1090: sipush #-17993
    //   1093: invokestatic a : (II)Ljava/lang/String;
    //   1096: aload #16
    //   1098: invokevirtual unsupported : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1101: aload_3
    //   1102: invokevirtual invalid : ()V
    //   1105: aload #4
    //   1107: ifnonnull -> 1150
    //   1110: aload #5
    //   1112: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1115: ifnull -> 1143
    //   1118: aload_3
    //   1119: aload_2
    //   1120: sipush #-7574
    //   1123: sipush #-24844
    //   1126: invokestatic a : (II)Ljava/lang/String;
    //   1129: aload #16
    //   1131: invokevirtual unsupported : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1134: aload_3
    //   1135: invokevirtual invalid : ()V
    //   1138: aload #4
    //   1140: ifnonnull -> 1150
    //   1143: aload #5
    //   1145: aload #17
    //   1147: invokevirtual setContent : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)V
    //   1150: aload #4
    //   1152: ifnonnull -> 1177
    //   1155: aload #5
    //   1157: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1160: ifnonnull -> 1177
    //   1163: aload_3
    //   1164: aload_2
    //   1165: sipush #-7402
    //   1168: sipush #23593
    //   1171: invokestatic a : (II)Ljava/lang/String;
    //   1174: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   1177: aload_0
    //   1178: sipush #-7588
    //   1181: sipush #-10573
    //   1184: invokestatic a : (II)Ljava/lang/String;
    //   1187: aload_1
    //   1188: iconst_0
    //   1189: aload_2
    //   1190: aload_3
    //   1191: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   1194: astore #9
    //   1196: aload #5
    //   1198: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   1201: ifnonnull -> 1286
    //   1204: aload_0
    //   1205: aload #9
    //   1207: aload #5
    //   1209: aload_2
    //   1210: aload_1
    //   1211: aload_3
    //   1212: invokevirtual setStyle : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter;Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   1215: aload_0
    //   1216: sipush #-7354
    //   1219: sipush #8505
    //   1222: invokestatic a : (II)Ljava/lang/String;
    //   1225: aload_1
    //   1226: iconst_0
    //   1227: aload_2
    //   1228: aload_3
    //   1229: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1232: astore #17
    //   1234: aload #17
    //   1236: ifnull -> 1251
    //   1239: aload #5
    //   1241: aload #17
    //   1243: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   1246: aload #4
    //   1248: ifnonnull -> 1286
    //   1251: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   1254: aload #5
    //   1256: invokevirtual getStyle : ()Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   1259: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1262: ifeq -> 1278
    //   1265: aload #5
    //   1267: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   1270: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   1273: aload #4
    //   1275: ifnonnull -> 1286
    //   1278: aload #5
    //   1280: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   1283: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   1286: aload_0
    //   1287: aload_1
    //   1288: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   1291: astore #17
    //   1293: aload #17
    //   1295: ifnull -> 1315
    //   1298: aload #17
    //   1300: invokeinterface size : ()I
    //   1305: ifle -> 1315
    //   1308: aload #5
    //   1310: aload #17
    //   1312: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   1315: aload_0
    //   1316: aload_1
    //   1317: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1320: astore #18
    //   1322: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   1325: aload_3
    //   1326: invokevirtual isOpenapi31 : ()Z
    //   1329: ifeq -> 1344
    //   1332: sipush #-7188
    //   1335: sipush #9260
    //   1338: invokestatic a : (II)Ljava/lang/String;
    //   1341: goto -> 1353
    //   1344: sipush #-7446
    //   1347: sipush #984
    //   1350: invokestatic a : (II)Ljava/lang/String;
    //   1353: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1358: checkcast java/util/Map
    //   1361: astore #19
    //   1363: aload #18
    //   1365: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1370: astore #20
    //   1372: aload #20
    //   1374: invokeinterface hasNext : ()Z
    //   1379: ifeq -> 1468
    //   1382: aload #20
    //   1384: invokeinterface next : ()Ljava/lang/Object;
    //   1389: checkcast java/lang/String
    //   1392: astore #21
    //   1394: aload #19
    //   1396: sipush #-7621
    //   1399: sipush #-31303
    //   1402: invokestatic a : (II)Ljava/lang/String;
    //   1405: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1410: checkcast java/util/Set
    //   1413: aload #21
    //   1415: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1420: ifne -> 1453
    //   1423: aload #21
    //   1425: sipush #-7344
    //   1428: sipush #-28932
    //   1431: invokestatic a : (II)Ljava/lang/String;
    //   1434: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1437: ifne -> 1453
    //   1440: aload_3
    //   1441: aload_2
    //   1442: aload #21
    //   1444: aload_1
    //   1445: aload #21
    //   1447: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1450: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1453: aload_0
    //   1454: aload #19
    //   1456: aload #21
    //   1458: aload_2
    //   1459: aload_3
    //   1460: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   1463: aload #4
    //   1465: ifnonnull -> 1372
    //   1468: aload #5
    //   1470: areturn
  }
  
  public Map<String, Header> getHeaders(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 219
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7529
    //   66: sipush #-20813
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7397
    //   87: sipush #32629
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7220
    //   97: sipush #13072
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_1
    //   112: aload #9
    //   114: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   117: astore #10
    //   119: aload #10
    //   121: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   124: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 156
    //   133: aload_3
    //   134: aload_2
    //   135: aload #9
    //   137: sipush #-7362
    //   140: sipush #25325
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #10
    //   148: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   151: aload #5
    //   153: ifnonnull -> 214
    //   156: aload #10
    //   158: checkcast com/fasterxml/Zg/Zr
    //   161: astore #11
    //   163: aload_0
    //   164: aload #11
    //   166: sipush #-7674
    //   169: sipush #9134
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: iconst_2
    //   176: anewarray java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_2
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload #9
    //   187: aastore
    //   188: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   191: aload_3
    //   192: invokevirtual getHeader : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/headers/Header;
    //   195: astore #12
    //   197: aload #12
    //   199: ifnull -> 214
    //   202: aload #6
    //   204: aload #9
    //   206: aload #12
    //   208: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aload #5
    //   216: ifnonnull -> 36
    //   219: aload #6
    //   221: areturn
  }
  
  public Header getHeader(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/headers/Header
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-7225
    //   24: sipush #-25842
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 256
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 230
    //   54: aload_0
    //   55: aload #6
    //   57: invokevirtual Zz : ()Ljava/lang/String;
    //   60: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 82
    //   70: aload #5
    //   72: aload #7
    //   74: invokevirtual set$ref : (Ljava/lang/String;)V
    //   77: aload #4
    //   79: ifnonnull -> 92
    //   82: aload #5
    //   84: aload #6
    //   86: invokevirtual Zz : ()Ljava/lang/String;
    //   89: invokevirtual set$ref : (Ljava/lang/String;)V
    //   92: aload #6
    //   94: invokevirtual Zz : ()Ljava/lang/String;
    //   97: sipush #-7548
    //   100: sipush #15663
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 186
    //   112: aload #6
    //   114: invokevirtual Zz : ()Ljava/lang/String;
    //   117: sipush #-7365
    //   120: sipush #-13292
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   129: ifne -> 186
    //   132: aload #6
    //   134: invokevirtual Zz : ()Ljava/lang/String;
    //   137: sipush #-7544
    //   140: sipush #-23267
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   149: ifne -> 186
    //   152: aload_3
    //   153: aload_2
    //   154: aload #6
    //   156: invokevirtual Zz : ()Ljava/lang/String;
    //   159: sipush #-7462
    //   162: sipush #8250
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: swap
    //   169: sipush #-7404
    //   172: sipush #8911
    //   175: invokestatic a : (II)Ljava/lang/String;
    //   178: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   183: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload_3
    //   187: invokevirtual isOpenapi31 : ()Z
    //   190: ifeq -> 227
    //   193: aload_0
    //   194: sipush #-7642
    //   197: sipush #4544
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: aload_1
    //   204: iconst_0
    //   205: aload_2
    //   206: aload_3
    //   207: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   210: astore #8
    //   212: aload #8
    //   214: invokestatic isBlank : (Ljava/lang/String;)Z
    //   217: ifne -> 227
    //   220: aload #5
    //   222: aload #8
    //   224: invokevirtual setDescription : (Ljava/lang/String;)V
    //   227: aload #5
    //   229: areturn
    //   230: aload_3
    //   231: aload_2
    //   232: sipush #-7225
    //   235: sipush #-25842
    //   238: invokestatic a : (II)Ljava/lang/String;
    //   241: sipush #-7551
    //   244: sipush #15066
    //   247: invokestatic a : (II)Ljava/lang/String;
    //   250: aload_1
    //   251: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   254: aconst_null
    //   255: areturn
    //   256: aload_0
    //   257: sipush #-7642
    //   260: sipush #4544
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: aload_1
    //   267: iconst_0
    //   268: aload_2
    //   269: aload_3
    //   270: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   273: astore #7
    //   275: aload_3
    //   276: invokevirtual isAllowEmptyStrings : ()Z
    //   279: ifeq -> 287
    //   282: aload #7
    //   284: ifnonnull -> 302
    //   287: aload_3
    //   288: invokevirtual isAllowEmptyStrings : ()Z
    //   291: ifne -> 309
    //   294: aload #7
    //   296: invokestatic isBlank : (Ljava/lang/String;)Z
    //   299: ifne -> 309
    //   302: aload #5
    //   304: aload #7
    //   306: invokevirtual setDescription : (Ljava/lang/String;)V
    //   309: aload_0
    //   310: sipush #-7194
    //   313: sipush #-16772
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: aload_1
    //   320: iconst_0
    //   321: aload_2
    //   322: aload_3
    //   323: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   326: astore #8
    //   328: aload #8
    //   330: ifnull -> 340
    //   333: aload #5
    //   335: aload #8
    //   337: invokevirtual setRequired : (Ljava/lang/Boolean;)V
    //   340: aload_0
    //   341: sipush #-7363
    //   344: sipush #9893
    //   347: invokestatic a : (II)Ljava/lang/String;
    //   350: aload_1
    //   351: iconst_0
    //   352: aload_2
    //   353: aload_3
    //   354: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   357: astore #9
    //   359: aload #9
    //   361: ifnull -> 371
    //   364: aload #5
    //   366: aload #9
    //   368: invokevirtual setDeprecated : (Ljava/lang/Boolean;)V
    //   371: aload_0
    //   372: sipush #-7354
    //   375: sipush #8505
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: aload_1
    //   382: iconst_0
    //   383: aload_2
    //   384: aload_3
    //   385: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   388: astore #10
    //   390: aload #10
    //   392: ifnull -> 407
    //   395: aload #5
    //   397: aload #10
    //   399: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   402: aload #4
    //   404: ifnonnull -> 415
    //   407: aload #5
    //   409: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   412: invokevirtual setExplode : (Ljava/lang/Boolean;)V
    //   415: aload #5
    //   417: getstatic net/portswigger/swagger/v3/oas/models/headers/Header$StyleEnum.SIMPLE : Lnet/portswigger/swagger/v3/oas/models/headers/Header$StyleEnum;
    //   420: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/headers/Header$StyleEnum;)V
    //   423: aload_0
    //   424: sipush #-7384
    //   427: sipush #2478
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: aload_1
    //   434: iconst_0
    //   435: aload_2
    //   436: aload_3
    //   437: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   440: astore #11
    //   442: aload #11
    //   444: ifnull -> 460
    //   447: aload #5
    //   449: aload_0
    //   450: aload #11
    //   452: aload_2
    //   453: aload_3
    //   454: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   457: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   460: aload_0
    //   461: sipush #-7372
    //   464: sipush #30748
    //   467: invokestatic a : (II)Ljava/lang/String;
    //   470: aload_1
    //   471: iconst_0
    //   472: aload_2
    //   473: aload_3
    //   474: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   477: astore #12
    //   479: aload #12
    //   481: ifnull -> 498
    //   484: aload #5
    //   486: aload_0
    //   487: aload #12
    //   489: aload_2
    //   490: aload_3
    //   491: iconst_0
    //   492: invokevirtual getExamples : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   495: invokevirtual setExamples : (Ljava/util/Map;)V
    //   498: aload_0
    //   499: sipush #-7193
    //   502: sipush #-4890
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: aload_1
    //   509: aload_2
    //   510: aload_3
    //   511: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   514: astore #13
    //   516: aload #13
    //   518: ifnull -> 564
    //   521: aload #12
    //   523: ifnull -> 545
    //   526: aload_3
    //   527: aload_2
    //   528: sipush #-7302
    //   531: sipush #16410
    //   534: invokestatic a : (II)Ljava/lang/String;
    //   537: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   540: aload #4
    //   542: ifnonnull -> 564
    //   545: aload #5
    //   547: aload #13
    //   549: instanceof com/fasterxml/Zg/Zs
    //   552: ifeq -> 559
    //   555: aconst_null
    //   556: goto -> 561
    //   559: aload #13
    //   561: invokevirtual setExample : (Ljava/lang/Object;)V
    //   564: aload_0
    //   565: sipush #-7402
    //   568: sipush #23593
    //   571: invokestatic a : (II)Ljava/lang/String;
    //   574: aload_1
    //   575: iconst_0
    //   576: aload_2
    //   577: aload_3
    //   578: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   581: astore #14
    //   583: aload #14
    //   585: ifnull -> 632
    //   588: aload #5
    //   590: aload_0
    //   591: aload #14
    //   593: sipush #-7674
    //   596: sipush #9134
    //   599: invokestatic a : (II)Ljava/lang/String;
    //   602: iconst_2
    //   603: anewarray java/lang/Object
    //   606: dup
    //   607: iconst_0
    //   608: aload_2
    //   609: aastore
    //   610: dup
    //   611: iconst_1
    //   612: sipush #-7402
    //   615: sipush #23593
    //   618: invokestatic a : (II)Ljava/lang/String;
    //   621: aastore
    //   622: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   625: aload_3
    //   626: invokevirtual getContent : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   629: invokevirtual setContent : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)V
    //   632: aload_0
    //   633: aload_1
    //   634: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   637: astore #15
    //   639: aload #15
    //   641: ifnull -> 661
    //   644: aload #15
    //   646: invokeinterface size : ()I
    //   651: ifle -> 661
    //   654: aload #5
    //   656: aload #15
    //   658: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   661: aload_0
    //   662: aload_1
    //   663: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   666: astore #16
    //   668: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   671: aload_3
    //   672: invokevirtual isOpenapi31 : ()Z
    //   675: ifeq -> 690
    //   678: sipush #-7188
    //   681: sipush #9260
    //   684: invokestatic a : (II)Ljava/lang/String;
    //   687: goto -> 699
    //   690: sipush #-7446
    //   693: sipush #984
    //   696: invokestatic a : (II)Ljava/lang/String;
    //   699: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   704: checkcast java/util/Map
    //   707: astore #17
    //   709: aload #16
    //   711: invokeinterface iterator : ()Ljava/util/Iterator;
    //   716: astore #18
    //   718: aload #18
    //   720: invokeinterface hasNext : ()Z
    //   725: ifeq -> 804
    //   728: aload #18
    //   730: invokeinterface next : ()Ljava/lang/Object;
    //   735: checkcast java/lang/String
    //   738: astore #19
    //   740: aload #17
    //   742: sipush #-7231
    //   745: sipush #5379
    //   748: invokestatic a : (II)Ljava/lang/String;
    //   751: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   756: checkcast java/util/Set
    //   759: aload #19
    //   761: invokeinterface contains : (Ljava/lang/Object;)Z
    //   766: ifne -> 799
    //   769: aload #19
    //   771: sipush #-7344
    //   774: sipush #-28932
    //   777: invokestatic a : (II)Ljava/lang/String;
    //   780: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   783: ifne -> 799
    //   786: aload_3
    //   787: aload_2
    //   788: aload #19
    //   790: aload_1
    //   791: aload #19
    //   793: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   796: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   799: aload #4
    //   801: ifnonnull -> 718
    //   804: aload #5
    //   806: areturn
  }
  
  public Object getAnyType(String paramString1, Zr paramZr, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: aload_1
    //   5: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   8: astore #6
    //   10: astore #5
    //   12: aload #6
    //   14: ifnull -> 235
    //   17: aload #6
    //   19: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   22: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 42
    //   31: aload_0
    //   32: aload_1
    //   33: aload_2
    //   34: iconst_0
    //   35: aload_3
    //   36: aload #4
    //   38: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   41: areturn
    //   42: aload #6
    //   44: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   47: getstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 101
    //   56: aload_0
    //   57: aload_1
    //   58: aload_2
    //   59: iconst_0
    //   60: aload_3
    //   61: aload #4
    //   63: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   66: astore #7
    //   68: aload #7
    //   70: ifnull -> 76
    //   73: aload #7
    //   75: areturn
    //   76: aload_0
    //   77: aload_1
    //   78: aload_2
    //   79: iconst_0
    //   80: aload_3
    //   81: aload #4
    //   83: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   86: astore #8
    //   88: aload #8
    //   90: ifnull -> 96
    //   93: aload #8
    //   95: areturn
    //   96: aload #5
    //   98: ifnonnull -> 235
    //   101: aload #6
    //   103: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   106: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   109: invokevirtual equals : (Ljava/lang/Object;)Z
    //   112: ifeq -> 140
    //   115: aload_0
    //   116: aload_1
    //   117: aload_2
    //   118: iconst_0
    //   119: aload_3
    //   120: aload #4
    //   122: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   125: astore #7
    //   127: aload #7
    //   129: ifnull -> 135
    //   132: aload #7
    //   134: areturn
    //   135: aload #5
    //   137: ifnonnull -> 235
    //   140: aload #6
    //   142: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   145: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   148: invokevirtual equals : (Ljava/lang/Object;)Z
    //   151: ifeq -> 179
    //   154: aload_0
    //   155: aload_1
    //   156: aload_2
    //   157: iconst_0
    //   158: aload_3
    //   159: aload #4
    //   161: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   164: astore #7
    //   166: aload #7
    //   168: ifnull -> 174
    //   171: aload #7
    //   173: areturn
    //   174: aload #5
    //   176: ifnonnull -> 235
    //   179: aload #6
    //   181: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   184: getstatic com/fasterxml/Zg/Zfr.BOOLEAN : Lcom/fasterxml/Zg/Zfr;
    //   187: invokevirtual equals : (Ljava/lang/Object;)Z
    //   190: ifeq -> 218
    //   193: aload_0
    //   194: aload_1
    //   195: aload_2
    //   196: iconst_0
    //   197: aload_3
    //   198: aload #4
    //   200: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   203: astore #7
    //   205: aload #7
    //   207: ifnull -> 213
    //   210: aload #7
    //   212: areturn
    //   213: aload #5
    //   215: ifnonnull -> 235
    //   218: aload #6
    //   220: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   223: getstatic com/fasterxml/Zg/Zfr.NULL : Lcom/fasterxml/Zg/Zfr;
    //   226: invokevirtual equals : (Ljava/lang/Object;)Z
    //   229: ifeq -> 235
    //   232: aload #6
    //   234: areturn
    //   235: aconst_null
    //   236: areturn
  }
  
  public Map<String, SecurityScheme> getSecuritySchemes(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 219
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7529
    //   66: sipush #-20813
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7209
    //   87: sipush #23275
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7220
    //   97: sipush #13072
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_1
    //   112: aload #9
    //   114: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   117: astore #10
    //   119: aload #10
    //   121: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   124: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 156
    //   133: aload_3
    //   134: aload_2
    //   135: aload #9
    //   137: sipush #-7362
    //   140: sipush #25325
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #10
    //   148: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   151: aload #5
    //   153: ifnonnull -> 214
    //   156: aload #10
    //   158: checkcast com/fasterxml/Zg/Zr
    //   161: astore #11
    //   163: aload_0
    //   164: aload #11
    //   166: sipush #-7674
    //   169: sipush #9134
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: iconst_2
    //   176: anewarray java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_2
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload #9
    //   187: aastore
    //   188: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   191: aload_3
    //   192: invokevirtual getSecurityScheme : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme;
    //   195: astore #12
    //   197: aload #11
    //   199: ifnull -> 214
    //   202: aload #6
    //   204: aload #9
    //   206: aload #12
    //   208: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aload #5
    //   216: ifnonnull -> 36
    //   219: aload #6
    //   221: areturn
  }
  
  public SecurityScheme getSecurityScheme(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/security/SecurityScheme
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-7225
    //   24: sipush #-25842
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 236
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 210
    //   54: aload_0
    //   55: aload #6
    //   57: invokevirtual Zz : ()Ljava/lang/String;
    //   60: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 82
    //   70: aload #5
    //   72: aload #7
    //   74: invokevirtual set$ref : (Ljava/lang/String;)V
    //   77: aload #4
    //   79: ifnonnull -> 92
    //   82: aload #5
    //   84: aload #6
    //   86: invokevirtual Zz : ()Ljava/lang/String;
    //   89: invokevirtual set$ref : (Ljava/lang/String;)V
    //   92: aload #6
    //   94: invokevirtual Zz : ()Ljava/lang/String;
    //   97: sipush #-7548
    //   100: sipush #15663
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 166
    //   112: aload #6
    //   114: invokevirtual Zz : ()Ljava/lang/String;
    //   117: sipush #-7541
    //   120: sipush #29088
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   129: ifne -> 166
    //   132: aload_3
    //   133: aload_2
    //   134: aload #6
    //   136: invokevirtual Zz : ()Ljava/lang/String;
    //   139: sipush #-7462
    //   142: sipush #8250
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: swap
    //   149: sipush #-7671
    //   152: sipush #31707
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_3
    //   167: invokevirtual isOpenapi31 : ()Z
    //   170: ifeq -> 207
    //   173: aload_0
    //   174: sipush #-7642
    //   177: sipush #4544
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: aload_1
    //   184: iconst_0
    //   185: aload_2
    //   186: aload_3
    //   187: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   190: astore #8
    //   192: aload #8
    //   194: invokestatic isBlank : (Ljava/lang/String;)Z
    //   197: ifne -> 207
    //   200: aload #5
    //   202: aload #8
    //   204: invokevirtual setDescription : (Ljava/lang/String;)V
    //   207: aload #5
    //   209: areturn
    //   210: aload_3
    //   211: aload_2
    //   212: sipush #-7225
    //   215: sipush #-25842
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: sipush #-7551
    //   224: sipush #15066
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: aload_1
    //   231: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   234: aconst_null
    //   235: areturn
    //   236: iconst_0
    //   237: dup
    //   238: istore #13
    //   240: dup
    //   241: istore #12
    //   243: dup
    //   244: istore #11
    //   246: dup
    //   247: istore #10
    //   249: dup
    //   250: istore #9
    //   252: dup
    //   253: istore #8
    //   255: istore #7
    //   257: aload_0
    //   258: sipush #-7483
    //   261: sipush #19223
    //   264: invokestatic a : (II)Ljava/lang/String;
    //   267: aload_1
    //   268: iconst_1
    //   269: aload_2
    //   270: aload_3
    //   271: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   274: astore #14
    //   276: aload_3
    //   277: invokevirtual isAllowEmptyStrings : ()Z
    //   280: ifeq -> 288
    //   283: aload #14
    //   285: ifnonnull -> 303
    //   288: aload_3
    //   289: invokevirtual isAllowEmptyStrings : ()Z
    //   292: ifne -> 498
    //   295: aload #14
    //   297: invokestatic isBlank : (Ljava/lang/String;)Z
    //   300: ifne -> 498
    //   303: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.APIKEY : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   306: invokevirtual toString : ()Ljava/lang/String;
    //   309: aload #14
    //   311: invokevirtual equals : (Ljava/lang/Object;)Z
    //   314: ifeq -> 336
    //   317: aload #5
    //   319: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.APIKEY : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   322: invokevirtual setType : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;)V
    //   325: iconst_1
    //   326: dup
    //   327: istore #10
    //   329: istore #9
    //   331: aload #4
    //   333: ifnonnull -> 498
    //   336: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.HTTP : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   339: invokevirtual toString : ()Ljava/lang/String;
    //   342: aload #14
    //   344: invokevirtual equals : (Ljava/lang/Object;)Z
    //   347: ifeq -> 366
    //   350: aload #5
    //   352: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.HTTP : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   355: invokevirtual setType : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;)V
    //   358: iconst_1
    //   359: istore #11
    //   361: aload #4
    //   363: ifnonnull -> 498
    //   366: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.OAUTH2 : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   369: invokevirtual toString : ()Ljava/lang/String;
    //   372: aload #14
    //   374: invokevirtual equals : (Ljava/lang/Object;)Z
    //   377: ifeq -> 396
    //   380: aload #5
    //   382: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.OAUTH2 : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   385: invokevirtual setType : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;)V
    //   388: iconst_1
    //   389: istore #12
    //   391: aload #4
    //   393: ifnonnull -> 498
    //   396: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.OPENIDCONNECT : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   399: invokevirtual toString : ()Ljava/lang/String;
    //   402: aload #14
    //   404: invokevirtual equals : (Ljava/lang/Object;)Z
    //   407: ifeq -> 426
    //   410: aload #5
    //   412: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.OPENIDCONNECT : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   415: invokevirtual setType : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;)V
    //   418: iconst_1
    //   419: istore #13
    //   421: aload #4
    //   423: ifnonnull -> 498
    //   426: aload_3
    //   427: invokevirtual isOpenapi31 : ()Z
    //   430: ifeq -> 460
    //   433: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.MUTUALTLS : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   436: invokevirtual toString : ()Ljava/lang/String;
    //   439: aload #14
    //   441: invokevirtual equals : (Ljava/lang/Object;)Z
    //   444: ifeq -> 460
    //   447: aload #5
    //   449: getstatic net/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type.MUTUALTLS : Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;
    //   452: invokevirtual setType : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$Type;)V
    //   455: aload #4
    //   457: ifnonnull -> 498
    //   460: aload_3
    //   461: aload_2
    //   462: sipush #-7179
    //   465: sipush #-640
    //   468: invokestatic a : (II)Ljava/lang/String;
    //   471: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   476: sipush #-7483
    //   479: sipush #19223
    //   482: invokestatic a : (II)Ljava/lang/String;
    //   485: sipush #-7482
    //   488: sipush #-6548
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: aload_1
    //   495: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   498: aload_0
    //   499: sipush #-7642
    //   502: sipush #4544
    //   505: invokestatic a : (II)Ljava/lang/String;
    //   508: aload_1
    //   509: iload #7
    //   511: aload_2
    //   512: aload_3
    //   513: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   516: astore #14
    //   518: aload_3
    //   519: invokevirtual isAllowEmptyStrings : ()Z
    //   522: ifeq -> 530
    //   525: aload #14
    //   527: ifnonnull -> 545
    //   530: aload_3
    //   531: invokevirtual isAllowEmptyStrings : ()Z
    //   534: ifne -> 552
    //   537: aload #14
    //   539: invokestatic isBlank : (Ljava/lang/String;)Z
    //   542: ifne -> 552
    //   545: aload #5
    //   547: aload #14
    //   549: invokevirtual setDescription : (Ljava/lang/String;)V
    //   552: aload_0
    //   553: sipush #-7657
    //   556: sipush #12130
    //   559: invokestatic a : (II)Ljava/lang/String;
    //   562: aload_1
    //   563: iload #9
    //   565: aload_2
    //   566: aload_3
    //   567: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   570: astore #14
    //   572: aload_3
    //   573: invokevirtual isAllowEmptyStrings : ()Z
    //   576: ifeq -> 584
    //   579: aload #14
    //   581: ifnonnull -> 599
    //   584: aload_3
    //   585: invokevirtual isAllowEmptyStrings : ()Z
    //   588: ifne -> 606
    //   591: aload #14
    //   593: invokestatic isBlank : (Ljava/lang/String;)Z
    //   596: ifne -> 606
    //   599: aload #5
    //   601: aload #14
    //   603: invokevirtual setName : (Ljava/lang/String;)V
    //   606: aload_0
    //   607: sipush #-7614
    //   610: sipush #-20403
    //   613: invokestatic a : (II)Ljava/lang/String;
    //   616: aload_1
    //   617: iload #10
    //   619: aload_2
    //   620: aload_3
    //   621: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   624: astore #15
    //   626: invokestatic values : ()[Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$In;
    //   629: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   632: aload #15
    //   634: <illegal opcode> test : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   639: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   644: invokeinterface findFirst : ()Ljava/util/Optional;
    //   649: astore #16
    //   651: iload #10
    //   653: ifeq -> 693
    //   656: aload #15
    //   658: ifnull -> 693
    //   661: aload #16
    //   663: invokevirtual isPresent : ()Z
    //   666: ifne -> 693
    //   669: aload_3
    //   670: aload_2
    //   671: sipush #-7614
    //   674: sipush #-20403
    //   677: invokestatic a : (II)Ljava/lang/String;
    //   680: sipush #-7467
    //   683: sipush #4533
    //   686: invokestatic a : (II)Ljava/lang/String;
    //   689: aload_1
    //   690: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   693: aload #5
    //   695: aload #16
    //   697: aconst_null
    //   698: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   701: checkcast net/portswigger/swagger/v3/oas/models/security/SecurityScheme$In
    //   704: invokevirtual setIn : (Lnet/portswigger/swagger/v3/oas/models/security/SecurityScheme$In;)V
    //   707: aload_0
    //   708: sipush #-7174
    //   711: sipush #2653
    //   714: invokestatic a : (II)Ljava/lang/String;
    //   717: aload_1
    //   718: iload #11
    //   720: aload_2
    //   721: aload_3
    //   722: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   725: astore #14
    //   727: aload_3
    //   728: invokevirtual isAllowEmptyStrings : ()Z
    //   731: ifeq -> 739
    //   734: aload #14
    //   736: ifnonnull -> 754
    //   739: aload_3
    //   740: invokevirtual isAllowEmptyStrings : ()Z
    //   743: ifne -> 761
    //   746: aload #14
    //   748: invokestatic isBlank : (Ljava/lang/String;)Z
    //   751: ifne -> 761
    //   754: aload #5
    //   756: aload #14
    //   758: invokevirtual setScheme : (Ljava/lang/String;)V
    //   761: aload_0
    //   762: sipush #-7566
    //   765: sipush #-26842
    //   768: invokestatic a : (II)Ljava/lang/String;
    //   771: aload_1
    //   772: iload #8
    //   774: aload_2
    //   775: aload_3
    //   776: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   779: astore #14
    //   781: aload_3
    //   782: invokevirtual isAllowEmptyStrings : ()Z
    //   785: ifeq -> 793
    //   788: aload #14
    //   790: ifnonnull -> 808
    //   793: aload_3
    //   794: invokevirtual isAllowEmptyStrings : ()Z
    //   797: ifne -> 815
    //   800: aload #14
    //   802: invokestatic isBlank : (Ljava/lang/String;)Z
    //   805: ifne -> 815
    //   808: aload #5
    //   810: aload #14
    //   812: invokevirtual setBearerFormat : (Ljava/lang/String;)V
    //   815: aload_0
    //   816: sipush #-7217
    //   819: sipush #-12438
    //   822: invokestatic a : (II)Ljava/lang/String;
    //   825: aload_1
    //   826: iload #12
    //   828: aload_2
    //   829: aload_3
    //   830: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   833: astore #17
    //   835: aload #17
    //   837: ifnull -> 853
    //   840: aload #5
    //   842: aload_0
    //   843: aload #17
    //   845: aload_2
    //   846: aload_3
    //   847: invokevirtual getOAuthFlows : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlows;
    //   850: invokevirtual setFlows : (Lnet/portswigger/swagger/v3/oas/models/security/OAuthFlows;)V
    //   853: aload_0
    //   854: sipush #-7311
    //   857: sipush #13993
    //   860: invokestatic a : (II)Ljava/lang/String;
    //   863: aload_1
    //   864: iload #13
    //   866: aload_2
    //   867: aload_3
    //   868: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   871: astore #14
    //   873: aload_3
    //   874: invokevirtual isAllowEmptyStrings : ()Z
    //   877: ifeq -> 885
    //   880: aload #14
    //   882: ifnonnull -> 900
    //   885: aload_3
    //   886: invokevirtual isAllowEmptyStrings : ()Z
    //   889: ifne -> 907
    //   892: aload #14
    //   894: invokestatic isBlank : (Ljava/lang/String;)Z
    //   897: ifne -> 907
    //   900: aload #5
    //   902: aload #14
    //   904: invokevirtual setOpenIdConnectUrl : (Ljava/lang/String;)V
    //   907: aload_0
    //   908: aload_1
    //   909: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   912: astore #18
    //   914: aload #18
    //   916: ifnull -> 936
    //   919: aload #18
    //   921: invokeinterface size : ()I
    //   926: ifle -> 936
    //   929: aload #5
    //   931: aload #18
    //   933: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   936: aload_0
    //   937: aload_1
    //   938: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   941: astore #19
    //   943: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   946: aload_3
    //   947: invokevirtual isOpenapi31 : ()Z
    //   950: ifeq -> 965
    //   953: sipush #-7188
    //   956: sipush #9260
    //   959: invokestatic a : (II)Ljava/lang/String;
    //   962: goto -> 974
    //   965: sipush #-7446
    //   968: sipush #984
    //   971: invokestatic a : (II)Ljava/lang/String;
    //   974: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   979: checkcast java/util/Map
    //   982: astore #20
    //   984: aload #19
    //   986: invokeinterface iterator : ()Ljava/util/Iterator;
    //   991: astore #21
    //   993: aload #21
    //   995: invokeinterface hasNext : ()Z
    //   1000: ifeq -> 1079
    //   1003: aload #21
    //   1005: invokeinterface next : ()Ljava/lang/Object;
    //   1010: checkcast java/lang/String
    //   1013: astore #22
    //   1015: aload #20
    //   1017: sipush #-7199
    //   1020: sipush #28490
    //   1023: invokestatic a : (II)Ljava/lang/String;
    //   1026: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1031: checkcast java/util/Set
    //   1034: aload #22
    //   1036: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1041: ifne -> 1074
    //   1044: aload #22
    //   1046: sipush #-7344
    //   1049: sipush #-28932
    //   1052: invokestatic a : (II)Ljava/lang/String;
    //   1055: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1058: ifne -> 1074
    //   1061: aload_3
    //   1062: aload_2
    //   1063: aload #22
    //   1065: aload_1
    //   1066: aload #22
    //   1068: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1071: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1074: aload #4
    //   1076: ifnonnull -> 993
    //   1079: aload #5
    //   1081: areturn
  }
  
  public OAuthFlows getOAuthFlows(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    OAuthFlows oAuthFlows = new OAuthFlows();
    Zr zr = getObject(a(-7341, -11845), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      oAuthFlows.setImplicit(getOAuthFlow(a(-7409, 2196), zr, paramString, paramOpenAPIDeserializer$ParseResult)); 
    zr = getObject(a(-7443, -1396), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      oAuthFlows.setPassword(getOAuthFlow(a(-7396, 21758), zr, paramString, paramOpenAPIDeserializer$ParseResult)); 
    zr = getObject(a(-7543, 13180), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      oAuthFlows.setClientCredentials(getOAuthFlow(a(-7232, -20150), zr, paramString, paramOpenAPIDeserializer$ParseResult)); 
    zr = getObject(a(-7655, -2081), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null)
      oAuthFlows.setAuthorizationCode(getOAuthFlow(a(-7459, -23198), zr, paramString, paramOpenAPIDeserializer$ParseResult)); 
    Map<String, Object> map = getExtensions(paramZr);
    if (map != null && map.size() > 0)
      oAuthFlows.setExtensions(map); 
    Set<String> set = getKeys(paramZr);
    Map map1 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7188, 9260) : a(-7446, 984));
    for (String str : set) {
      if (!((Set)map1.get(a(-7202, -15383))).contains(str) && !str.startsWith(a(-7344, -28932)))
        paramOpenAPIDeserializer$ParseResult.extra(paramString, str, paramZr.ZL(str)); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return oAuthFlows;
  }
  
  public OAuthFlow getOAuthFlow(String paramString1, Zr paramZr, String paramString2, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_2
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/security/OAuthFlow
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: iconst_0
    //   21: dup
    //   22: istore #9
    //   24: dup
    //   25: istore #8
    //   27: istore #7
    //   29: iconst_1
    //   30: istore #10
    //   32: aload_1
    //   33: astore #11
    //   35: iconst_m1
    //   36: istore #12
    //   38: aload #11
    //   40: invokevirtual hashCode : ()I
    //   43: lookupswitch default -> 179, -1071113679 -> 134, -425423387 -> 84, 742596102 -> 159, 1216985755 -> 109
    //   84: aload #11
    //   86: sipush #-7409
    //   89: sipush #2196
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokevirtual equals : (Ljava/lang/Object;)Z
    //   98: ifeq -> 179
    //   101: iconst_0
    //   102: istore #12
    //   104: aload #5
    //   106: ifnonnull -> 179
    //   109: aload #11
    //   111: sipush #-7396
    //   114: sipush #21758
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: invokevirtual equals : (Ljava/lang/Object;)Z
    //   123: ifeq -> 179
    //   126: iconst_1
    //   127: istore #12
    //   129: aload #5
    //   131: ifnonnull -> 179
    //   134: aload #11
    //   136: sipush #-7232
    //   139: sipush #-20150
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokevirtual equals : (Ljava/lang/Object;)Z
    //   148: ifeq -> 179
    //   151: iconst_2
    //   152: istore #12
    //   154: aload #5
    //   156: ifnonnull -> 179
    //   159: aload #11
    //   161: sipush #-7459
    //   164: sipush #-23198
    //   167: invokestatic a : (II)Ljava/lang/String;
    //   170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   173: ifeq -> 179
    //   176: iconst_3
    //   177: istore #12
    //   179: iload #12
    //   181: tableswitch default -> 242, 0 -> 212, 1 -> 220, 2 -> 228, 3 -> 236
    //   212: iconst_1
    //   213: istore #7
    //   215: aload #5
    //   217: ifnonnull -> 242
    //   220: iconst_1
    //   221: istore #8
    //   223: aload #5
    //   225: ifnonnull -> 242
    //   228: iconst_1
    //   229: istore #8
    //   231: aload #5
    //   233: ifnonnull -> 242
    //   236: iconst_1
    //   237: dup
    //   238: istore #8
    //   240: istore #7
    //   242: aload_0
    //   243: sipush #-7586
    //   246: sipush #2621
    //   249: invokestatic a : (II)Ljava/lang/String;
    //   252: aload_2
    //   253: iload #7
    //   255: aload_3
    //   256: aload #4
    //   258: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   261: astore #11
    //   263: aload #4
    //   265: invokevirtual isAllowEmptyStrings : ()Z
    //   268: ifeq -> 276
    //   271: aload #11
    //   273: ifnonnull -> 292
    //   276: aload #4
    //   278: invokevirtual isAllowEmptyStrings : ()Z
    //   281: ifne -> 299
    //   284: aload #11
    //   286: invokestatic isBlank : (Ljava/lang/String;)Z
    //   289: ifne -> 299
    //   292: aload #6
    //   294: aload #11
    //   296: invokevirtual setAuthorizationUrl : (Ljava/lang/String;)V
    //   299: aload_0
    //   300: sipush #-7626
    //   303: sipush #-29713
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: aload_2
    //   310: iload #8
    //   312: aload_3
    //   313: aload #4
    //   315: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   318: astore #11
    //   320: aload #4
    //   322: invokevirtual isAllowEmptyStrings : ()Z
    //   325: ifeq -> 333
    //   328: aload #11
    //   330: ifnonnull -> 349
    //   333: aload #4
    //   335: invokevirtual isAllowEmptyStrings : ()Z
    //   338: ifne -> 356
    //   341: aload #11
    //   343: invokestatic isBlank : (Ljava/lang/String;)Z
    //   346: ifne -> 356
    //   349: aload #6
    //   351: aload #11
    //   353: invokevirtual setTokenUrl : (Ljava/lang/String;)V
    //   356: aload_0
    //   357: sipush #-7610
    //   360: sipush #17122
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: aload_2
    //   367: iload #9
    //   369: aload_3
    //   370: aload #4
    //   372: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   375: astore #11
    //   377: aload #4
    //   379: invokevirtual isAllowEmptyStrings : ()Z
    //   382: ifeq -> 390
    //   385: aload #11
    //   387: ifnonnull -> 406
    //   390: aload #4
    //   392: invokevirtual isAllowEmptyStrings : ()Z
    //   395: ifne -> 413
    //   398: aload #11
    //   400: invokestatic isBlank : (Ljava/lang/String;)Z
    //   403: ifne -> 413
    //   406: aload #6
    //   408: aload #11
    //   410: invokevirtual setRefreshUrl : (Ljava/lang/String;)V
    //   413: aload_0
    //   414: sipush #-7266
    //   417: sipush #13998
    //   420: invokestatic a : (II)Ljava/lang/String;
    //   423: aload_2
    //   424: iload #10
    //   426: aload_3
    //   427: aload #4
    //   429: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   432: astore #12
    //   434: new net/portswigger/swagger/v3/oas/models/security/Scopes
    //   437: dup
    //   438: invokespecial <init> : ()V
    //   441: astore #13
    //   443: aload_0
    //   444: aload #12
    //   446: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   449: astore #14
    //   451: aload #14
    //   453: invokeinterface iterator : ()Ljava/util/Iterator;
    //   458: astore #15
    //   460: aload #15
    //   462: invokeinterface hasNext : ()Z
    //   467: ifeq -> 514
    //   470: aload #15
    //   472: invokeinterface next : ()Ljava/lang/Object;
    //   477: checkcast java/lang/String
    //   480: astore #16
    //   482: aload #12
    //   484: aload #16
    //   486: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   489: astore #17
    //   491: aload #12
    //   493: ifnull -> 509
    //   496: aload #13
    //   498: aload #16
    //   500: aload #17
    //   502: invokevirtual Zp : ()Ljava/lang/String;
    //   505: invokevirtual addString : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/security/Scopes;
    //   508: pop
    //   509: aload #5
    //   511: ifnonnull -> 460
    //   514: aload #6
    //   516: aload #13
    //   518: invokevirtual setScopes : (Lnet/portswigger/swagger/v3/oas/models/security/Scopes;)V
    //   521: aload_0
    //   522: aload_2
    //   523: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   526: astore #15
    //   528: aload #15
    //   530: ifnull -> 550
    //   533: aload #15
    //   535: invokeinterface size : ()I
    //   540: ifle -> 550
    //   543: aload #6
    //   545: aload #15
    //   547: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   550: aload_0
    //   551: aload_2
    //   552: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   555: astore #16
    //   557: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   560: aload #4
    //   562: invokevirtual isOpenapi31 : ()Z
    //   565: ifeq -> 580
    //   568: sipush #-7188
    //   571: sipush #9260
    //   574: invokestatic a : (II)Ljava/lang/String;
    //   577: goto -> 589
    //   580: sipush #-7446
    //   583: sipush #984
    //   586: invokestatic a : (II)Ljava/lang/String;
    //   589: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   594: checkcast java/util/Map
    //   597: astore #17
    //   599: aload #16
    //   601: invokeinterface iterator : ()Ljava/util/Iterator;
    //   606: astore #18
    //   608: aload #18
    //   610: invokeinterface hasNext : ()Z
    //   615: ifeq -> 695
    //   618: aload #18
    //   620: invokeinterface next : ()Ljava/lang/Object;
    //   625: checkcast java/lang/String
    //   628: astore #19
    //   630: aload #17
    //   632: sipush #-7204
    //   635: sipush #-10748
    //   638: invokestatic a : (II)Ljava/lang/String;
    //   641: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   646: checkcast java/util/Set
    //   649: aload #19
    //   651: invokeinterface contains : (Ljava/lang/Object;)Z
    //   656: ifne -> 690
    //   659: aload #19
    //   661: sipush #-7344
    //   664: sipush #-28932
    //   667: invokestatic a : (II)Ljava/lang/String;
    //   670: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   673: ifne -> 690
    //   676: aload #4
    //   678: aload_3
    //   679: aload #19
    //   681: aload_2
    //   682: aload #19
    //   684: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   687: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   690: aload #5
    //   692: ifnonnull -> 608
    //   695: aload #6
    //   697: areturn
  }
  
  public Map<String, Schema> getSchemas(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 219
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7529
    //   66: sipush #-20813
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7659
    //   87: sipush #-16164
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7220
    //   97: sipush #13072
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_1
    //   112: aload #9
    //   114: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   117: astore #10
    //   119: aload #10
    //   121: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   124: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 156
    //   133: aload_3
    //   134: aload_2
    //   135: aload #9
    //   137: sipush #-7362
    //   140: sipush #25325
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #10
    //   148: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   151: aload #5
    //   153: ifnonnull -> 214
    //   156: aload #10
    //   158: checkcast com/fasterxml/Zg/Zr
    //   161: astore #11
    //   163: aload_0
    //   164: aload #11
    //   166: sipush #-7674
    //   169: sipush #9134
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: iconst_2
    //   176: anewarray java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_2
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload #9
    //   187: aastore
    //   188: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   191: aload_3
    //   192: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   195: astore #12
    //   197: aload #12
    //   199: ifnull -> 214
    //   202: aload #6
    //   204: aload #9
    //   206: aload #12
    //   208: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aload #5
    //   216: ifnonnull -> 36
    //   219: aload #6
    //   221: areturn
  }
  
  public Discriminator getDiscriminator(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Discriminator discriminator = new Discriminator();
    String str = getString(a(-7575, 12411), paramZr, true, paramString, paramOpenAPIDeserializer$ParseResult);
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      discriminator.setPropertyName(str); 
    Zr zr = getObject(a(-7635, -31633), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr != null) {
      LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
      Set<String> set = getKeys(zr);
      for (String str1 : set) {
        linkedHashMap.put(str1, zr.ZL(str1).Zp());
        if (arrayOfZbqc == null)
          break; 
      } 
      discriminator.setMapping(linkedHashMap);
    } 
    if (paramOpenAPIDeserializer$ParseResult.isOpenapi31()) {
      Set<String> set = getKeys(paramZr);
      for (String str1 : set) {
        if (str1.startsWith(a(-7344, -28932))) {
          Map<String, Object> map = getExtensions(paramZr);
          if (map != null && map.size() > 0)
            discriminator.setExtensions(map); 
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    return discriminator;
  }
  
  public Schema getSchema(Zb paramZb, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 15
    //   9: aconst_null
    //   10: areturn
    //   11: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   14: athrow
    //   15: aload_3
    //   16: ifnonnull -> 32
    //   19: new net/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: astore_3
    //   27: aload_3
    //   28: iconst_1
    //   29: invokevirtual setAllowEmptyStrings : (Z)V
    //   32: aconst_null
    //   33: astore #5
    //   35: invokestatic getJsonSchemaParserExtensions : ()Ljava/util/List;
    //   38: astore #6
    //   40: aload #6
    //   42: invokeinterface iterator : ()Ljava/util/Iterator;
    //   47: astore #7
    //   49: aload #7
    //   51: invokeinterface hasNext : ()Z
    //   56: ifeq -> 108
    //   59: aload #7
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast net/portswigger/swagger/v3/parser/extensions/JsonSchemaParserExtension
    //   69: astore #8
    //   71: aload #8
    //   73: aload_1
    //   74: aload_2
    //   75: aload_3
    //   76: aload_0
    //   77: getfield rootMap : Ljava/util/Map;
    //   80: aload_0
    //   81: getfield basePath : Ljava/lang/String;
    //   84: invokeinterface getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/util/Map;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   89: astore #5
    //   91: aload #5
    //   93: ifnull -> 103
    //   96: aload #5
    //   98: areturn
    //   99: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload #4
    //   105: ifnonnull -> 49
    //   108: aload_3
    //   109: invokevirtual isOpenapi31 : ()Z
    //   112: ifeq -> 127
    //   115: aload_0
    //   116: aload_1
    //   117: aload_2
    //   118: aload_3
    //   119: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   122: areturn
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: aconst_null
    //   128: astore #7
    //   130: aload_1
    //   131: invokevirtual ZB : ()Z
    //   134: ifeq -> 146
    //   137: aload_1
    //   138: checkcast com/fasterxml/Zg/Zr
    //   141: astore #7
    //   143: goto -> 165
    //   146: aload_3
    //   147: aload_2
    //   148: ldc ''
    //   150: sipush #-7362
    //   153: sipush #25325
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: aload_1
    //   160: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   163: aconst_null
    //   164: areturn
    //   165: aload_0
    //   166: sipush #-7395
    //   169: sipush #2834
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: aload #7
    //   177: iconst_0
    //   178: aload_2
    //   179: aload_3
    //   180: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   183: astore #8
    //   185: aload_0
    //   186: sipush #-7401
    //   189: sipush #16891
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: aload #7
    //   197: iconst_0
    //   198: aload_2
    //   199: aload_3
    //   200: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   203: astore #9
    //   205: aload_0
    //   206: sipush #-7317
    //   209: bipush #-68
    //   211: invokestatic a : (II)Ljava/lang/String;
    //   214: aload #7
    //   216: iconst_0
    //   217: aload_2
    //   218: aload_3
    //   219: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   222: astore #10
    //   224: aload_0
    //   225: sipush #-7670
    //   228: sipush #31159
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: aload #7
    //   236: iconst_0
    //   237: aload_2
    //   238: aload_3
    //   239: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   242: astore #11
    //   244: aload #9
    //   246: ifnonnull -> 273
    //   249: aload #10
    //   251: ifnonnull -> 273
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   260: athrow
    //   261: aload #8
    //   263: ifnull -> 498
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: new net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   276: dup
    //   277: invokespecial <init> : ()V
    //   280: astore #12
    //   282: aload #9
    //   284: ifnull -> 354
    //   287: aload #9
    //   289: invokevirtual iterator : ()Ljava/util/Iterator;
    //   292: astore #13
    //   294: aload #13
    //   296: invokeinterface hasNext : ()Z
    //   301: ifeq -> 350
    //   304: aload #13
    //   306: invokeinterface next : ()Ljava/lang/Object;
    //   311: checkcast com/fasterxml/Zor/Zb
    //   314: astore #14
    //   316: aload #14
    //   318: invokevirtual ZB : ()Z
    //   321: ifeq -> 345
    //   324: aload_0
    //   325: aload #14
    //   327: checkcast com/fasterxml/Zg/Zr
    //   330: aload_2
    //   331: aload_3
    //   332: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   335: astore #5
    //   337: aload #12
    //   339: aload #5
    //   341: invokevirtual addAllOfItem : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   344: pop
    //   345: aload #4
    //   347: ifnonnull -> 294
    //   350: aload #12
    //   352: astore #5
    //   354: aload #10
    //   356: ifnull -> 426
    //   359: aload #10
    //   361: invokevirtual iterator : ()Ljava/util/Iterator;
    //   364: astore #13
    //   366: aload #13
    //   368: invokeinterface hasNext : ()Z
    //   373: ifeq -> 422
    //   376: aload #13
    //   378: invokeinterface next : ()Ljava/lang/Object;
    //   383: checkcast com/fasterxml/Zor/Zb
    //   386: astore #14
    //   388: aload #14
    //   390: invokevirtual ZB : ()Z
    //   393: ifeq -> 417
    //   396: aload_0
    //   397: aload #14
    //   399: checkcast com/fasterxml/Zg/Zr
    //   402: aload_2
    //   403: aload_3
    //   404: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   407: astore #5
    //   409: aload #12
    //   411: aload #5
    //   413: invokevirtual addAnyOfItem : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   416: pop
    //   417: aload #4
    //   419: ifnonnull -> 366
    //   422: aload #12
    //   424: astore #5
    //   426: aload #8
    //   428: ifnull -> 498
    //   431: aload #8
    //   433: invokevirtual iterator : ()Ljava/util/Iterator;
    //   436: astore #13
    //   438: aload #13
    //   440: invokeinterface hasNext : ()Z
    //   445: ifeq -> 494
    //   448: aload #13
    //   450: invokeinterface next : ()Ljava/lang/Object;
    //   455: checkcast com/fasterxml/Zor/Zb
    //   458: astore #14
    //   460: aload #14
    //   462: invokevirtual ZB : ()Z
    //   465: ifeq -> 489
    //   468: aload_0
    //   469: aload #14
    //   471: checkcast com/fasterxml/Zg/Zr
    //   474: aload_2
    //   475: aload_3
    //   476: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   479: astore #5
    //   481: aload #12
    //   483: aload #5
    //   485: invokevirtual addOneOfItem : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   488: pop
    //   489: aload #4
    //   491: ifnonnull -> 438
    //   494: aload #12
    //   496: astore #5
    //   498: aload #11
    //   500: ifnull -> 657
    //   503: aload_3
    //   504: invokevirtual isInferSchemaType : ()Z
    //   507: ifeq -> 657
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   516: athrow
    //   517: new net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   520: dup
    //   521: invokespecial <init> : ()V
    //   524: astore #12
    //   526: aload #11
    //   528: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   531: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 565
    //   540: aload #12
    //   542: aload_0
    //   543: aload #11
    //   545: aload_2
    //   546: aload_3
    //   547: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   550: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   553: aload #4
    //   555: ifnonnull -> 648
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   564: athrow
    //   565: aload #11
    //   567: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   570: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   573: invokevirtual equals : (Ljava/lang/Object;)Z
    //   576: ifeq -> 648
    //   579: goto -> 586
    //   582: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   585: athrow
    //   586: aload #11
    //   588: invokevirtual iterator : ()Ljava/util/Iterator;
    //   591: astore #13
    //   593: aload #13
    //   595: invokeinterface hasNext : ()Z
    //   600: ifeq -> 648
    //   603: aload #13
    //   605: invokeinterface next : ()Ljava/lang/Object;
    //   610: checkcast com/fasterxml/Zor/Zb
    //   613: astore #14
    //   615: aload #14
    //   617: invokevirtual ZA : ()Z
    //   620: ifeq -> 643
    //   623: aload #12
    //   625: aload_0
    //   626: aload #11
    //   628: aload_2
    //   629: aload_3
    //   630: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   633: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   642: athrow
    //   643: aload #4
    //   645: ifnonnull -> 593
    //   648: aload #12
    //   650: astore #5
    //   652: aload #4
    //   654: ifnonnull -> 804
    //   657: aload #11
    //   659: ifnull -> 804
    //   662: goto -> 669
    //   665: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   668: athrow
    //   669: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   672: dup
    //   673: invokespecial <init> : ()V
    //   676: astore #12
    //   678: aload #11
    //   680: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   683: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   686: invokevirtual equals : (Ljava/lang/Object;)Z
    //   689: ifeq -> 717
    //   692: aload #12
    //   694: aload_0
    //   695: aload #11
    //   697: aload_2
    //   698: aload_3
    //   699: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   702: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   705: aload #4
    //   707: ifnonnull -> 800
    //   710: goto -> 717
    //   713: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   716: athrow
    //   717: aload #11
    //   719: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   722: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   725: invokevirtual equals : (Ljava/lang/Object;)Z
    //   728: ifeq -> 800
    //   731: goto -> 738
    //   734: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   737: athrow
    //   738: aload #11
    //   740: invokevirtual iterator : ()Ljava/util/Iterator;
    //   743: astore #13
    //   745: aload #13
    //   747: invokeinterface hasNext : ()Z
    //   752: ifeq -> 800
    //   755: aload #13
    //   757: invokeinterface next : ()Ljava/lang/Object;
    //   762: checkcast com/fasterxml/Zor/Zb
    //   765: astore #14
    //   767: aload #14
    //   769: invokevirtual ZA : ()Z
    //   772: ifeq -> 795
    //   775: aload #12
    //   777: aload_0
    //   778: aload #11
    //   780: aload_2
    //   781: aload_3
    //   782: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   785: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   788: goto -> 795
    //   791: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   794: athrow
    //   795: aload #4
    //   797: ifnonnull -> 745
    //   800: aload #12
    //   802: astore #5
    //   804: aload_0
    //   805: sipush #-7431
    //   808: sipush #10977
    //   811: invokestatic a : (II)Ljava/lang/String;
    //   814: aload #7
    //   816: iconst_0
    //   817: aload_2
    //   818: aload_3
    //   819: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   822: astore #12
    //   824: aload #12
    //   826: ifnonnull -> 854
    //   829: aload_0
    //   830: sipush #-7431
    //   833: sipush #10977
    //   836: invokestatic a : (II)Ljava/lang/String;
    //   839: aload #7
    //   841: iconst_0
    //   842: aload_2
    //   843: aload_3
    //   844: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   847: goto -> 855
    //   850: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   853: athrow
    //   854: aconst_null
    //   855: astore #13
    //   857: aload #13
    //   859: ifnull -> 877
    //   862: aload_0
    //   863: aload #13
    //   865: aload_2
    //   866: aload_3
    //   867: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   870: goto -> 879
    //   873: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   876: athrow
    //   877: aload #12
    //   879: astore #14
    //   881: aload #14
    //   883: ifnull -> 965
    //   886: aload_3
    //   887: invokevirtual isInferSchemaType : ()Z
    //   890: ifeq -> 965
    //   893: goto -> 900
    //   896: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   899: athrow
    //   900: aload #5
    //   902: ifnonnull -> 953
    //   905: goto -> 912
    //   908: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   911: athrow
    //   912: aload #14
    //   914: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   917: invokevirtual equals : (Ljava/lang/Object;)Z
    //   920: ifeq -> 944
    //   923: goto -> 930
    //   926: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   929: athrow
    //   930: new net/portswigger/swagger/v3/oas/models/media/ObjectSchema
    //   933: dup
    //   934: invokespecial <init> : ()V
    //   937: goto -> 951
    //   940: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   943: athrow
    //   944: new net/portswigger/swagger/v3/oas/models/media/MapSchema
    //   947: dup
    //   948: invokespecial <init> : ()V
    //   951: astore #5
    //   953: aload #5
    //   955: aload #14
    //   957: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   960: aload #4
    //   962: ifnonnull -> 1005
    //   965: aload #14
    //   967: ifnull -> 1005
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   976: athrow
    //   977: aload #5
    //   979: ifnonnull -> 998
    //   982: goto -> 989
    //   985: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   988: athrow
    //   989: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   992: dup
    //   993: invokespecial <init> : ()V
    //   996: astore #5
    //   998: aload #5
    //   1000: aload #14
    //   1002: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   1005: aload #5
    //   1007: ifnonnull -> 1017
    //   1010: aload #7
    //   1012: invokestatic createSchemaByType : (Lcom/fasterxml/Zg/Zr;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1015: astore #5
    //   1017: aload #7
    //   1019: sipush #-7225
    //   1022: sipush #-25842
    //   1025: invokestatic a : (II)Ljava/lang/String;
    //   1028: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1031: astore #15
    //   1033: aload #15
    //   1035: ifnull -> 1463
    //   1038: aload #15
    //   1040: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   1043: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   1046: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1049: ifeq -> 1436
    //   1052: goto -> 1059
    //   1055: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1058: athrow
    //   1059: aload_2
    //   1060: sipush #-7299
    //   1063: sipush #26635
    //   1066: invokestatic a : (II)Ljava/lang/String;
    //   1069: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1072: ifeq -> 1217
    //   1075: goto -> 1082
    //   1078: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1081: athrow
    //   1082: aload #15
    //   1084: invokevirtual Zp : ()Ljava/lang/String;
    //   1087: sipush #-7548
    //   1090: sipush #15663
    //   1093: invokestatic a : (II)Ljava/lang/String;
    //   1096: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   1099: astore #16
    //   1101: aload #15
    //   1103: invokevirtual Zp : ()Ljava/lang/String;
    //   1106: sipush #-7548
    //   1109: sipush #15663
    //   1112: invokestatic a : (II)Ljava/lang/String;
    //   1115: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1118: ifeq -> 1202
    //   1121: aload #16
    //   1123: arraylength
    //   1124: iconst_1
    //   1125: if_icmple -> 1202
    //   1128: goto -> 1135
    //   1131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1134: athrow
    //   1135: aload #16
    //   1137: iconst_1
    //   1138: aaload
    //   1139: ldc '/'
    //   1141: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   1144: astore #17
    //   1146: aload #17
    //   1148: iconst_1
    //   1149: aload #17
    //   1151: arraylength
    //   1152: invokestatic copyOfRange : ([Ljava/lang/Object;II)[Ljava/lang/Object;
    //   1155: checkcast [Ljava/lang/String;
    //   1158: astore #18
    //   1160: aload #18
    //   1162: iconst_0
    //   1163: aaload
    //   1164: invokestatic valueOf : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/util/ReferenceValidator;
    //   1167: aload_0
    //   1168: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   1171: aload #18
    //   1173: iconst_1
    //   1174: aaload
    //   1175: invokevirtual validateComponent : (Lnet/portswigger/swagger/v3/oas/models/Components;Ljava/lang/String;)Z
    //   1178: istore #19
    //   1180: iload #19
    //   1182: ifne -> 1202
    //   1185: aload_3
    //   1186: aload_2
    //   1187: aload #15
    //   1189: invokevirtual Zp : ()Ljava/lang/String;
    //   1192: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   1195: goto -> 1202
    //   1198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1201: athrow
    //   1202: goto -> 1217
    //   1205: astore #16
    //   1207: aload_3
    //   1208: aload_2
    //   1209: aload #15
    //   1211: invokevirtual Zp : ()Ljava/lang/String;
    //   1214: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   1217: aload_0
    //   1218: aload #15
    //   1220: invokevirtual Zz : ()Ljava/lang/String;
    //   1223: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   1226: astore #16
    //   1228: aload #16
    //   1230: ifnull -> 1252
    //   1233: aload #5
    //   1235: aload #16
    //   1237: invokevirtual set$ref : (Ljava/lang/String;)V
    //   1240: aload #4
    //   1242: ifnonnull -> 1269
    //   1245: goto -> 1252
    //   1248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1251: athrow
    //   1252: aload #5
    //   1254: aload #15
    //   1256: invokevirtual Zp : ()Ljava/lang/String;
    //   1259: invokevirtual set$ref : (Ljava/lang/String;)V
    //   1262: goto -> 1269
    //   1265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1268: athrow
    //   1269: aload #5
    //   1271: invokevirtual get$ref : ()Ljava/lang/String;
    //   1274: sipush #-7623
    //   1277: sipush #18865
    //   1280: invokestatic a : (II)Ljava/lang/String;
    //   1283: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1286: ifeq -> 1345
    //   1289: aload #5
    //   1291: invokevirtual get$ref : ()Ljava/lang/String;
    //   1294: ldc '/'
    //   1296: invokestatic countMatches : (Ljava/lang/String;Ljava/lang/String;)I
    //   1299: iconst_3
    //   1300: if_icmpne -> 1345
    //   1303: goto -> 1310
    //   1306: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1309: athrow
    //   1310: aload #5
    //   1312: invokevirtual get$ref : ()Ljava/lang/String;
    //   1315: aload #5
    //   1317: invokevirtual get$ref : ()Ljava/lang/String;
    //   1320: ldc '/'
    //   1322: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   1325: iconst_1
    //   1326: iadd
    //   1327: invokevirtual substring : (I)Ljava/lang/String;
    //   1330: astore #17
    //   1332: aload_0
    //   1333: getfield localSchemaRefs : Ljava/util/Map;
    //   1336: aload #17
    //   1338: aload_2
    //   1339: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1344: pop
    //   1345: aload #15
    //   1347: invokevirtual Zz : ()Ljava/lang/String;
    //   1350: sipush #-7548
    //   1353: sipush #15663
    //   1356: invokestatic a : (II)Ljava/lang/String;
    //   1359: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1362: ifeq -> 1433
    //   1365: aload #15
    //   1367: invokevirtual Zz : ()Ljava/lang/String;
    //   1370: sipush #-7623
    //   1373: sipush #18865
    //   1376: invokestatic a : (II)Ljava/lang/String;
    //   1379: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1382: ifne -> 1433
    //   1385: goto -> 1392
    //   1388: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1391: athrow
    //   1392: aload_3
    //   1393: aload_2
    //   1394: aload #15
    //   1396: invokevirtual Zz : ()Ljava/lang/String;
    //   1399: sipush #-7462
    //   1402: sipush #8250
    //   1405: invokestatic a : (II)Ljava/lang/String;
    //   1408: swap
    //   1409: sipush #-7532
    //   1412: sipush #13403
    //   1415: invokestatic a : (II)Ljava/lang/String;
    //   1418: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1423: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   1426: goto -> 1433
    //   1429: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1432: athrow
    //   1433: aload #5
    //   1435: areturn
    //   1436: aload_3
    //   1437: aload_2
    //   1438: sipush #-7225
    //   1441: sipush #-25842
    //   1444: invokestatic a : (II)Ljava/lang/String;
    //   1447: sipush #-7551
    //   1450: sipush #15066
    //   1453: invokestatic a : (II)Ljava/lang/String;
    //   1456: aload #7
    //   1458: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1461: aconst_null
    //   1462: areturn
    //   1463: aload_0
    //   1464: aload #7
    //   1466: aload_2
    //   1467: aload_3
    //   1468: aload #5
    //   1470: invokevirtual getCommonSchemaFields : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   1473: aload_0
    //   1474: sipush #-7665
    //   1477: sipush #-32134
    //   1480: invokestatic a : (II)Ljava/lang/String;
    //   1483: aload #7
    //   1485: iconst_0
    //   1486: aload_2
    //   1487: aload_3
    //   1488: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1491: astore #17
    //   1493: aload #17
    //   1495: ifnull -> 1512
    //   1498: aload #5
    //   1500: aload #17
    //   1502: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   1505: goto -> 1512
    //   1508: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1511: athrow
    //   1512: aload_0
    //   1513: sipush #-7177
    //   1516: sipush #10733
    //   1519: invokestatic a : (II)Ljava/lang/String;
    //   1522: aload #7
    //   1524: iconst_0
    //   1525: aload_2
    //   1526: aload_3
    //   1527: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1530: astore #17
    //   1532: aload #17
    //   1534: ifnull -> 1551
    //   1537: aload #5
    //   1539: aload #17
    //   1541: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   1544: goto -> 1551
    //   1547: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1550: athrow
    //   1551: aload_0
    //   1552: sipush #-7602
    //   1555: sipush #-21117
    //   1558: invokestatic a : (II)Ljava/lang/String;
    //   1561: aload #7
    //   1563: iconst_0
    //   1564: aload_2
    //   1565: aload_3
    //   1566: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   1569: astore #18
    //   1571: aload #18
    //   1573: ifnull -> 1840
    //   1576: aload #18
    //   1578: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1581: astore #19
    //   1583: aload #19
    //   1585: invokeinterface hasNext : ()Z
    //   1590: ifeq -> 1840
    //   1593: aload #19
    //   1595: invokeinterface next : ()Ljava/lang/Object;
    //   1600: checkcast com/fasterxml/Zor/Zb
    //   1603: astore #20
    //   1605: aload #20
    //   1607: invokevirtual Zd : ()Z
    //   1610: ifeq -> 1635
    //   1613: aload #5
    //   1615: aload #20
    //   1617: invokevirtual Zu : ()Ljava/lang/Number;
    //   1620: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1623: aload #4
    //   1625: ifnonnull -> 1835
    //   1628: goto -> 1635
    //   1631: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1634: athrow
    //   1635: aload #20
    //   1637: invokevirtual ZL : ()Z
    //   1640: ifeq -> 1675
    //   1643: goto -> 1650
    //   1646: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1649: athrow
    //   1650: aload #5
    //   1652: aload #20
    //   1654: invokevirtual ZY : ()Z
    //   1657: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1660: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1663: aload #4
    //   1665: ifnonnull -> 1835
    //   1668: goto -> 1675
    //   1671: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1674: athrow
    //   1675: aload #20
    //   1677: invokevirtual ZA : ()Z
    //   1680: ifeq -> 1753
    //   1683: goto -> 1690
    //   1686: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1689: athrow
    //   1690: aload #5
    //   1692: aload_0
    //   1693: aload #5
    //   1695: aload #20
    //   1697: aconst_null
    //   1698: invokevirtual ZR : (Ljava/lang/String;)Ljava/lang/String;
    //   1701: invokevirtual getDecodedObject : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Ljava/lang/Object;
    //   1704: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1707: goto -> 1835
    //   1710: astore #21
    //   1712: aload_3
    //   1713: aload_2
    //   1714: sipush #-7549
    //   1717: sipush #2060
    //   1720: invokestatic a : (II)Ljava/lang/String;
    //   1723: iconst_1
    //   1724: anewarray java/lang/Object
    //   1727: dup
    //   1728: iconst_0
    //   1729: aload #21
    //   1731: invokevirtual getMessage : ()Ljava/lang/String;
    //   1734: aastore
    //   1735: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1738: aload #5
    //   1740: invokevirtual getFormat : ()Ljava/lang/String;
    //   1743: aload #20
    //   1745: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1748: aload #4
    //   1750: ifnonnull -> 1835
    //   1753: aload #20
    //   1755: invokevirtual Zm : ()Z
    //   1758: ifeq -> 1803
    //   1761: goto -> 1768
    //   1764: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1767: athrow
    //   1768: aload #5
    //   1770: aload #20
    //   1772: invokevirtual Zt : ()Z
    //   1775: ifeq -> 1793
    //   1778: goto -> 1785
    //   1781: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1784: athrow
    //   1785: aconst_null
    //   1786: goto -> 1795
    //   1789: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1792: athrow
    //   1793: aload #20
    //   1795: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1798: aload #4
    //   1800: ifnonnull -> 1835
    //   1803: aload_3
    //   1804: aload_2
    //   1805: sipush #-7602
    //   1808: sipush #-21117
    //   1811: invokestatic a : (II)Ljava/lang/String;
    //   1814: sipush #-7181
    //   1817: sipush #-17116
    //   1820: invokestatic a : (II)Ljava/lang/String;
    //   1823: aload #20
    //   1825: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1828: goto -> 1835
    //   1831: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1834: athrow
    //   1835: aload #4
    //   1837: ifnonnull -> 1583
    //   1840: aload_0
    //   1841: sipush #-7483
    //   1844: sipush #19223
    //   1847: invokestatic a : (II)Ljava/lang/String;
    //   1850: aload #7
    //   1852: iconst_0
    //   1853: aload_2
    //   1854: aload_3
    //   1855: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   1858: astore #16
    //   1860: aload #5
    //   1862: invokevirtual getType : ()Ljava/lang/String;
    //   1865: invokestatic isBlank : (Ljava/lang/String;)Z
    //   1868: ifeq -> 2069
    //   1871: aload_3
    //   1872: invokevirtual isAllowEmptyStrings : ()Z
    //   1875: ifeq -> 1897
    //   1878: goto -> 1885
    //   1881: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1884: athrow
    //   1885: aload #16
    //   1887: ifnonnull -> 1926
    //   1890: goto -> 1897
    //   1893: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1896: athrow
    //   1897: aload_3
    //   1898: invokevirtual isAllowEmptyStrings : ()Z
    //   1901: ifne -> 1945
    //   1904: goto -> 1911
    //   1907: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1910: athrow
    //   1911: aload #16
    //   1913: invokestatic isBlank : (Ljava/lang/String;)Z
    //   1916: ifne -> 1945
    //   1919: goto -> 1926
    //   1922: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1925: athrow
    //   1926: aload #5
    //   1928: aload #16
    //   1930: invokevirtual setType : (Ljava/lang/String;)V
    //   1933: aload #4
    //   1935: ifnonnull -> 2013
    //   1938: goto -> 1945
    //   1941: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1944: athrow
    //   1945: aload_3
    //   1946: invokevirtual isInferSchemaType : ()Z
    //   1949: ifeq -> 2013
    //   1952: goto -> 1959
    //   1955: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1958: athrow
    //   1959: aload #7
    //   1961: sipush #-7602
    //   1964: sipush #-21117
    //   1967: invokestatic a : (II)Ljava/lang/String;
    //   1970: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1973: astore #19
    //   1975: aload #19
    //   1977: ifnull -> 2013
    //   1980: aload #19
    //   1982: invokevirtual ZJ : ()Z
    //   1985: ifeq -> 2013
    //   1988: goto -> 1995
    //   1991: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1994: athrow
    //   1995: aload_0
    //   1996: aload #19
    //   1998: checkcast com/fasterxml/Zg/Zh
    //   2001: invokevirtual inferTypeFromArray : (Lcom/fasterxml/Zg/Zh;)Ljava/lang/String;
    //   2004: astore #20
    //   2006: aload #5
    //   2008: aload #20
    //   2010: invokevirtual setType : (Ljava/lang/String;)V
    //   2013: sipush #-7198
    //   2016: sipush #10364
    //   2019: invokestatic a : (II)Ljava/lang/String;
    //   2022: aload #5
    //   2024: invokevirtual getType : ()Ljava/lang/String;
    //   2027: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2030: ifeq -> 2069
    //   2033: aload #5
    //   2035: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2038: ifnonnull -> 2069
    //   2041: goto -> 2048
    //   2044: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2047: athrow
    //   2048: aload_3
    //   2049: aload_2
    //   2050: sipush #-7670
    //   2053: sipush #31159
    //   2056: invokestatic a : (II)Ljava/lang/String;
    //   2059: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   2062: goto -> 2069
    //   2065: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2068: athrow
    //   2069: aload_0
    //   2070: sipush #-7438
    //   2073: sipush #10289
    //   2076: invokestatic a : (II)Ljava/lang/String;
    //   2079: aload #7
    //   2081: iconst_0
    //   2082: aload_2
    //   2083: aload_3
    //   2084: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   2087: astore #19
    //   2089: aload #19
    //   2091: ifnull -> 2123
    //   2094: aload_0
    //   2095: aload #19
    //   2097: aload_2
    //   2098: aload_3
    //   2099: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2102: astore #20
    //   2104: aload #20
    //   2106: ifnull -> 2123
    //   2109: aload #5
    //   2111: aload #20
    //   2113: invokevirtual setNot : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2116: goto -> 2123
    //   2119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2122: athrow
    //   2123: new java/util/LinkedHashMap
    //   2126: dup
    //   2127: invokespecial <init> : ()V
    //   2130: astore #20
    //   2132: aload_0
    //   2133: sipush #-7457
    //   2136: sipush #-2444
    //   2139: invokestatic a : (II)Ljava/lang/String;
    //   2142: aload #7
    //   2144: iconst_0
    //   2145: aload_2
    //   2146: aload_3
    //   2147: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   2150: astore #21
    //   2152: aconst_null
    //   2153: astore #22
    //   2155: aload_0
    //   2156: aload #21
    //   2158: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   2161: astore #23
    //   2163: aload #23
    //   2165: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2170: astore #24
    //   2172: aload #24
    //   2174: invokeinterface hasNext : ()Z
    //   2179: ifeq -> 2308
    //   2182: aload #24
    //   2184: invokeinterface next : ()Ljava/lang/Object;
    //   2189: checkcast java/lang/String
    //   2192: astore #25
    //   2194: aload #21
    //   2196: aload #25
    //   2198: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   2201: astore #26
    //   2203: aload #26
    //   2205: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   2208: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   2211: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2214: ifne -> 2254
    //   2217: aload_3
    //   2218: aload_2
    //   2219: sipush #-7457
    //   2222: sipush #-2444
    //   2225: invokestatic a : (II)Ljava/lang/String;
    //   2228: sipush #-7362
    //   2231: sipush #25325
    //   2234: invokestatic a : (II)Ljava/lang/String;
    //   2237: aload #26
    //   2239: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   2242: aload #4
    //   2244: ifnonnull -> 2303
    //   2247: goto -> 2254
    //   2250: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2253: athrow
    //   2254: aload #21
    //   2256: ifnull -> 2303
    //   2259: goto -> 2266
    //   2262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2265: athrow
    //   2266: aload_0
    //   2267: aload #26
    //   2269: checkcast com/fasterxml/Zg/Zr
    //   2272: aload_2
    //   2273: aload_3
    //   2274: invokevirtual getSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2277: astore #22
    //   2279: aload #22
    //   2281: ifnull -> 2303
    //   2284: aload #20
    //   2286: aload #25
    //   2288: aload #22
    //   2290: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2295: pop
    //   2296: goto -> 2303
    //   2299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2302: athrow
    //   2303: aload #4
    //   2305: ifnonnull -> 2172
    //   2308: aload #21
    //   2310: ifnull -> 2327
    //   2313: aload #5
    //   2315: aload #20
    //   2317: invokevirtual setProperties : (Ljava/util/Map;)V
    //   2320: goto -> 2327
    //   2323: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2326: athrow
    //   2327: aload #7
    //   2329: sipush #-7403
    //   2332: sipush #10714
    //   2335: invokestatic a : (II)Ljava/lang/String;
    //   2338: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   2341: ifnull -> 2888
    //   2344: aload_3
    //   2345: invokevirtual isInferSchemaType : ()Z
    //   2348: ifeq -> 2888
    //   2351: goto -> 2358
    //   2354: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2357: athrow
    //   2358: aload #5
    //   2360: invokevirtual getType : ()Ljava/lang/String;
    //   2363: invokestatic isBlank : (Ljava/lang/String;)Z
    //   2366: ifne -> 2847
    //   2369: goto -> 2376
    //   2372: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2375: athrow
    //   2376: aload #5
    //   2378: invokevirtual getType : ()Ljava/lang/String;
    //   2381: sipush #-7198
    //   2384: sipush #10364
    //   2387: invokestatic a : (II)Ljava/lang/String;
    //   2390: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2393: ifeq -> 2445
    //   2396: goto -> 2403
    //   2399: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2402: athrow
    //   2403: aload_0
    //   2404: sipush #-7403
    //   2407: sipush #10714
    //   2410: invokestatic a : (II)Ljava/lang/String;
    //   2413: aload #7
    //   2415: iconst_0
    //   2416: aload_2
    //   2417: aload_3
    //   2418: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   2421: astore #24
    //   2423: aload #24
    //   2425: ifnull -> 2442
    //   2428: aload #5
    //   2430: aload #24
    //   2432: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2435: goto -> 2442
    //   2438: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2441: athrow
    //   2442: goto -> 2952
    //   2445: aload #5
    //   2447: invokevirtual getType : ()Ljava/lang/String;
    //   2450: sipush #-7551
    //   2453: sipush #15066
    //   2456: invokestatic a : (II)Ljava/lang/String;
    //   2459: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2462: ifeq -> 2590
    //   2465: aload_0
    //   2466: sipush #-7403
    //   2469: sipush #10714
    //   2472: invokestatic a : (II)Ljava/lang/String;
    //   2475: aload #7
    //   2477: iconst_0
    //   2478: aload_2
    //   2479: aload_3
    //   2480: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   2483: astore #16
    //   2485: aload_3
    //   2486: invokevirtual isAllowEmptyStrings : ()Z
    //   2489: ifeq -> 2504
    //   2492: aload #16
    //   2494: ifnonnull -> 2533
    //   2497: goto -> 2504
    //   2500: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2503: athrow
    //   2504: aload_3
    //   2505: invokevirtual isAllowEmptyStrings : ()Z
    //   2508: ifne -> 2952
    //   2511: goto -> 2518
    //   2514: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2517: athrow
    //   2518: aload #16
    //   2520: invokestatic isBlank : (Ljava/lang/String;)Z
    //   2523: ifne -> 2952
    //   2526: goto -> 2533
    //   2529: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2532: athrow
    //   2533: aload #5
    //   2535: aload_0
    //   2536: aload #5
    //   2538: aload #16
    //   2540: invokevirtual getDecodedObject : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Ljava/lang/Object;
    //   2543: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2546: goto -> 2952
    //   2549: astore #24
    //   2551: aload_3
    //   2552: aload_2
    //   2553: sipush #-7345
    //   2556: sipush #-6426
    //   2559: invokestatic a : (II)Ljava/lang/String;
    //   2562: iconst_1
    //   2563: anewarray java/lang/Object
    //   2566: dup
    //   2567: iconst_0
    //   2568: aload #24
    //   2570: invokevirtual getMessage : ()Ljava/lang/String;
    //   2573: aastore
    //   2574: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   2577: aload #5
    //   2579: invokevirtual getFormat : ()Ljava/lang/String;
    //   2582: aload #7
    //   2584: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   2587: goto -> 2952
    //   2590: aload #5
    //   2592: invokevirtual getType : ()Ljava/lang/String;
    //   2595: sipush #-7573
    //   2598: sipush #23738
    //   2601: invokestatic a : (II)Ljava/lang/String;
    //   2604: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2607: ifeq -> 2654
    //   2610: aload_0
    //   2611: sipush #-7403
    //   2614: sipush #10714
    //   2617: invokestatic a : (II)Ljava/lang/String;
    //   2620: aload #7
    //   2622: iconst_0
    //   2623: aload_2
    //   2624: aload_3
    //   2625: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   2628: astore #17
    //   2630: aload #17
    //   2632: ifnull -> 2952
    //   2635: aload #5
    //   2637: aload #17
    //   2639: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2642: aload #4
    //   2644: ifnonnull -> 2952
    //   2647: goto -> 2654
    //   2650: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2653: athrow
    //   2654: aload #5
    //   2656: invokevirtual getType : ()Ljava/lang/String;
    //   2659: sipush #-7362
    //   2662: sipush #25325
    //   2665: invokestatic a : (II)Ljava/lang/String;
    //   2668: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2671: ifeq -> 2723
    //   2674: goto -> 2681
    //   2677: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2680: athrow
    //   2681: aload_0
    //   2682: sipush #-7403
    //   2685: sipush #10714
    //   2688: invokestatic a : (II)Ljava/lang/String;
    //   2691: aload #7
    //   2693: iconst_0
    //   2694: aload_2
    //   2695: aload_3
    //   2696: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   2699: astore #24
    //   2701: aload #24
    //   2703: ifnull -> 2720
    //   2706: aload #5
    //   2708: aload #24
    //   2710: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2713: goto -> 2720
    //   2716: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2719: athrow
    //   2720: goto -> 2952
    //   2723: aload #5
    //   2725: invokevirtual getType : ()Ljava/lang/String;
    //   2728: sipush #-7653
    //   2731: sipush #28341
    //   2734: invokestatic a : (II)Ljava/lang/String;
    //   2737: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2740: ifeq -> 2785
    //   2743: aload_0
    //   2744: sipush #-7403
    //   2747: sipush #10714
    //   2750: invokestatic a : (II)Ljava/lang/String;
    //   2753: aload #7
    //   2755: iconst_0
    //   2756: aload_2
    //   2757: aload_3
    //   2758: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   2761: astore #24
    //   2763: aload #24
    //   2765: ifnull -> 2782
    //   2768: aload #5
    //   2770: aload #24
    //   2772: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2775: goto -> 2782
    //   2778: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2781: athrow
    //   2782: goto -> 2952
    //   2785: aload #5
    //   2787: invokevirtual getType : ()Ljava/lang/String;
    //   2790: sipush #-7190
    //   2793: sipush #-25170
    //   2796: invokestatic a : (II)Ljava/lang/String;
    //   2799: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2802: ifeq -> 2952
    //   2805: aload_0
    //   2806: sipush #-7403
    //   2809: sipush #10714
    //   2812: invokestatic a : (II)Ljava/lang/String;
    //   2815: aload #7
    //   2817: iconst_0
    //   2818: aload_2
    //   2819: aload_3
    //   2820: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   2823: astore #24
    //   2825: aload #24
    //   2827: ifnull -> 2844
    //   2830: aload #5
    //   2832: aload #24
    //   2834: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2837: goto -> 2844
    //   2840: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2843: athrow
    //   2844: goto -> 2952
    //   2847: aload_0
    //   2848: sipush #-7403
    //   2851: sipush #10714
    //   2854: invokestatic a : (II)Ljava/lang/String;
    //   2857: aload #7
    //   2859: aload_2
    //   2860: aload_3
    //   2861: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   2864: astore #24
    //   2866: aload #24
    //   2868: ifnull -> 2885
    //   2871: aload #5
    //   2873: aload #24
    //   2875: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2878: goto -> 2885
    //   2881: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2884: athrow
    //   2885: goto -> 2952
    //   2888: aload #7
    //   2890: sipush #-7403
    //   2893: sipush #10714
    //   2896: invokestatic a : (II)Ljava/lang/String;
    //   2899: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   2902: ifnull -> 2946
    //   2905: aload_0
    //   2906: sipush #-7403
    //   2909: sipush #10714
    //   2912: invokestatic a : (II)Ljava/lang/String;
    //   2915: aload #7
    //   2917: aload_2
    //   2918: aload_3
    //   2919: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   2922: astore #24
    //   2924: aload #24
    //   2926: ifnull -> 2943
    //   2929: aload #5
    //   2931: aload #24
    //   2933: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2936: goto -> 2943
    //   2939: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2942: athrow
    //   2943: goto -> 2952
    //   2946: aload #5
    //   2948: aconst_null
    //   2949: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   2952: aload_0
    //   2953: sipush #-7183
    //   2956: sipush #-22460
    //   2959: invokestatic a : (II)Ljava/lang/String;
    //   2962: aload #7
    //   2964: iconst_0
    //   2965: aload_2
    //   2966: aload_3
    //   2967: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   2970: astore #17
    //   2972: aload #17
    //   2974: ifnull -> 2991
    //   2977: aload #5
    //   2979: aload #17
    //   2981: invokevirtual setNullable : (Ljava/lang/Boolean;)V
    //   2984: goto -> 2991
    //   2987: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2990: athrow
    //   2991: aload_0
    //   2992: aload #7
    //   2994: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   2997: astore #24
    //   2999: aload #24
    //   3001: ifnull -> 3035
    //   3004: aload #24
    //   3006: invokeinterface size : ()I
    //   3011: ifle -> 3035
    //   3014: goto -> 3021
    //   3017: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3020: athrow
    //   3021: aload #5
    //   3023: aload #24
    //   3025: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   3028: goto -> 3035
    //   3031: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3034: athrow
    //   3035: aload_0
    //   3036: aload #7
    //   3038: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   3041: astore #25
    //   3043: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   3046: sipush #-7446
    //   3049: sipush #984
    //   3052: invokestatic a : (II)Ljava/lang/String;
    //   3055: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3060: checkcast java/util/Map
    //   3063: astore #26
    //   3065: aload #25
    //   3067: invokeinterface iterator : ()Ljava/util/Iterator;
    //   3072: astore #27
    //   3074: aload #27
    //   3076: invokeinterface hasNext : ()Z
    //   3081: ifeq -> 3175
    //   3084: aload #27
    //   3086: invokeinterface next : ()Ljava/lang/Object;
    //   3091: checkcast java/lang/String
    //   3094: astore #28
    //   3096: aload #26
    //   3098: sipush #-7672
    //   3101: sipush #-11821
    //   3104: invokestatic a : (II)Ljava/lang/String;
    //   3107: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3112: checkcast java/util/Set
    //   3115: aload #28
    //   3117: invokeinterface contains : (Ljava/lang/Object;)Z
    //   3122: ifne -> 3170
    //   3125: aload #28
    //   3127: sipush #-7344
    //   3130: sipush #-28932
    //   3133: invokestatic a : (II)Ljava/lang/String;
    //   3136: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3139: ifne -> 3170
    //   3142: goto -> 3149
    //   3145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3148: athrow
    //   3149: aload_3
    //   3150: aload_2
    //   3151: aload #28
    //   3153: aload #7
    //   3155: aload #28
    //   3157: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   3160: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   3163: goto -> 3170
    //   3166: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3169: athrow
    //   3170: aload #4
    //   3172: ifnonnull -> 3074
    //   3175: aload #5
    //   3177: areturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/lang/Exception
    //   91	99	99	java/lang/Exception
    //   108	123	123	java/lang/Exception
    //   244	254	257	java/lang/Exception
    //   249	266	269	java/lang/Exception
    //   498	510	513	java/lang/Exception
    //   526	558	561	java/lang/Exception
    //   540	579	582	java/lang/Exception
    //   615	636	639	java/lang/Exception
    //   652	662	665	java/lang/Exception
    //   678	710	713	java/lang/Exception
    //   692	731	734	java/lang/Exception
    //   767	788	791	java/lang/Exception
    //   824	850	850	java/lang/Exception
    //   857	873	873	java/lang/Exception
    //   881	893	896	java/lang/Exception
    //   886	905	908	java/lang/Exception
    //   900	923	926	java/lang/Exception
    //   912	940	940	java/lang/Exception
    //   953	970	973	java/lang/Exception
    //   965	982	985	java/lang/Exception
    //   1033	1052	1055	java/lang/Exception
    //   1038	1075	1078	java/lang/Exception
    //   1082	1202	1205	java/lang/Exception
    //   1101	1128	1131	java/lang/Exception
    //   1180	1195	1198	java/lang/Exception
    //   1228	1245	1248	java/lang/Exception
    //   1233	1262	1265	java/lang/Exception
    //   1269	1303	1306	java/lang/Exception
    //   1345	1385	1388	java/lang/Exception
    //   1365	1426	1429	java/lang/Exception
    //   1493	1505	1508	java/lang/Exception
    //   1532	1544	1547	java/lang/Exception
    //   1605	1628	1631	java/lang/Exception
    //   1613	1643	1646	java/lang/Exception
    //   1635	1668	1671	java/lang/Exception
    //   1650	1683	1686	java/lang/Exception
    //   1690	1707	1710	java/text/ParseException
    //   1712	1761	1764	java/lang/Exception
    //   1753	1778	1781	java/lang/Exception
    //   1768	1789	1789	java/lang/Exception
    //   1795	1828	1831	java/lang/Exception
    //   1860	1878	1881	java/lang/Exception
    //   1871	1890	1893	java/lang/Exception
    //   1885	1904	1907	java/lang/Exception
    //   1897	1919	1922	java/lang/Exception
    //   1911	1938	1941	java/lang/Exception
    //   1926	1952	1955	java/lang/Exception
    //   1975	1988	1991	java/lang/Exception
    //   2013	2041	2044	java/lang/Exception
    //   2033	2062	2065	java/lang/Exception
    //   2104	2116	2119	java/lang/Exception
    //   2203	2247	2250	java/lang/Exception
    //   2217	2259	2262	java/lang/Exception
    //   2279	2296	2299	java/lang/Exception
    //   2308	2320	2323	java/lang/Exception
    //   2327	2351	2354	java/lang/Exception
    //   2344	2369	2372	java/lang/Exception
    //   2358	2396	2399	java/lang/Exception
    //   2423	2435	2438	java/lang/Exception
    //   2485	2497	2500	java/lang/Exception
    //   2492	2511	2514	java/lang/Exception
    //   2504	2526	2529	java/lang/Exception
    //   2533	2546	2549	java/text/ParseException
    //   2630	2647	2650	java/lang/Exception
    //   2635	2674	2677	java/lang/Exception
    //   2701	2713	2716	java/lang/Exception
    //   2763	2775	2778	java/lang/Exception
    //   2825	2837	2840	java/lang/Exception
    //   2866	2878	2881	java/lang/Exception
    //   2924	2936	2939	java/lang/Exception
    //   2972	2984	2987	java/lang/Exception
    //   2999	3014	3017	java/lang/Exception
    //   3004	3028	3031	java/lang/Exception
    //   3096	3142	3145	java/lang/Exception
    //   3125	3163	3166	java/lang/Exception
  }
  
  protected void getCommonSchemaFields(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, Schema paramSchema) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: sipush #-7213
    //   7: sipush #-22913
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: aload_1
    //   14: iconst_0
    //   15: aload_2
    //   16: aload_3
    //   17: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   20: astore #6
    //   22: astore #5
    //   24: aload_3
    //   25: invokevirtual isAllowEmptyStrings : ()Z
    //   28: ifeq -> 36
    //   31: aload #6
    //   33: ifnonnull -> 51
    //   36: aload_3
    //   37: invokevirtual isAllowEmptyStrings : ()Z
    //   40: ifne -> 58
    //   43: aload #6
    //   45: invokestatic isBlank : (Ljava/lang/String;)Z
    //   48: ifne -> 58
    //   51: aload #4
    //   53: aload #6
    //   55: invokevirtual setTitle : (Ljava/lang/String;)V
    //   58: aload_0
    //   59: sipush #-7521
    //   62: sipush #-13510
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: aload_1
    //   69: iconst_0
    //   70: aload_2
    //   71: aload_3
    //   72: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   75: astore #7
    //   77: aload #7
    //   79: ifnull -> 95
    //   82: aload #4
    //   84: aload_0
    //   85: aload #7
    //   87: aload_2
    //   88: aload_3
    //   89: invokevirtual getDiscriminator : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Discriminator;
    //   92: invokevirtual setDiscriminator : (Lnet/portswigger/swagger/v3/oas/models/media/Discriminator;)V
    //   95: aload_0
    //   96: sipush #-7300
    //   99: sipush #-23511
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: aload_1
    //   106: iconst_0
    //   107: aload_2
    //   108: aload_3
    //   109: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   112: astore #8
    //   114: aload #8
    //   116: ifnull -> 163
    //   119: aload #8
    //   121: getstatic java/math/BigDecimal.ZERO : Ljava/math/BigDecimal;
    //   124: invokevirtual compareTo : (Ljava/math/BigDecimal;)I
    //   127: ifle -> 149
    //   130: aload #4
    //   132: aload #8
    //   134: invokevirtual setMultipleOf : (Ljava/math/BigDecimal;)V
    //   137: aload #5
    //   139: ifnonnull -> 163
    //   142: iconst_1
    //   143: anewarray burp/Zbqc
    //   146: invokestatic Zr : ([Lburp/Zbqc;)V
    //   149: aload_3
    //   150: aload_2
    //   151: sipush #-7611
    //   154: sipush #32755
    //   157: invokestatic a : (II)Ljava/lang/String;
    //   160: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   163: aload_0
    //   164: sipush #-7186
    //   167: sipush #-10041
    //   170: invokestatic a : (II)Ljava/lang/String;
    //   173: aload_1
    //   174: iconst_0
    //   175: aload_2
    //   176: aload_3
    //   177: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   180: astore #8
    //   182: aload #8
    //   184: ifnull -> 194
    //   187: aload #4
    //   189: aload #8
    //   191: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   194: aload_0
    //   195: sipush #-7380
    //   198: sipush #12327
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: aload_1
    //   205: iconst_0
    //   206: aload_2
    //   207: aload_3
    //   208: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   211: astore #8
    //   213: aload #8
    //   215: ifnull -> 225
    //   218: aload #4
    //   220: aload #8
    //   222: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   225: aload_0
    //   226: sipush #-7567
    //   229: sipush #21487
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: aload_1
    //   236: iconst_0
    //   237: aload_2
    //   238: aload_3
    //   239: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   242: astore #9
    //   244: aload #9
    //   246: ifnull -> 256
    //   249: aload #4
    //   251: aload #9
    //   253: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   256: aload_0
    //   257: sipush #-7593
    //   260: sipush #12169
    //   263: invokestatic a : (II)Ljava/lang/String;
    //   266: aload_1
    //   267: iconst_0
    //   268: aload_2
    //   269: aload_3
    //   270: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   273: astore #9
    //   275: aload #9
    //   277: ifnull -> 287
    //   280: aload #4
    //   282: aload #9
    //   284: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   287: aload_0
    //   288: sipush #-7658
    //   291: sipush #16322
    //   294: invokestatic a : (II)Ljava/lang/String;
    //   297: aload_1
    //   298: iconst_0
    //   299: aload_2
    //   300: aload_3
    //   301: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   304: astore #10
    //   306: aload_3
    //   307: invokevirtual isAllowEmptyStrings : ()Z
    //   310: ifeq -> 325
    //   313: aload #10
    //   315: ifnull -> 325
    //   318: aload #4
    //   320: aload #10
    //   322: invokevirtual setPattern : (Ljava/lang/String;)V
    //   325: aload_0
    //   326: sipush #-7398
    //   329: sipush #23013
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: aload_1
    //   336: iconst_0
    //   337: aload_2
    //   338: aload_3
    //   339: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   342: astore #9
    //   344: aload #9
    //   346: ifnull -> 356
    //   349: aload #4
    //   351: aload #9
    //   353: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   356: aload_0
    //   357: sipush #-7173
    //   360: sipush #1836
    //   363: invokestatic a : (II)Ljava/lang/String;
    //   366: aload_1
    //   367: iconst_0
    //   368: aload_2
    //   369: aload_3
    //   370: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   373: astore #9
    //   375: aload #9
    //   377: ifnull -> 387
    //   380: aload #4
    //   382: aload #9
    //   384: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   387: aload_0
    //   388: sipush #-7423
    //   391: sipush #-29475
    //   394: invokestatic a : (II)Ljava/lang/String;
    //   397: aload_1
    //   398: iconst_0
    //   399: aload_2
    //   400: aload_3
    //   401: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   404: astore #11
    //   406: aload #11
    //   408: ifnull -> 418
    //   411: aload #4
    //   413: aload #11
    //   415: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   418: aload_0
    //   419: sipush #-7471
    //   422: sipush #10132
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aload_1
    //   429: iconst_0
    //   430: aload_2
    //   431: aload_3
    //   432: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   435: astore #9
    //   437: aload #9
    //   439: ifnull -> 449
    //   442: aload #4
    //   444: aload #9
    //   446: invokevirtual setMaxProperties : (Ljava/lang/Integer;)V
    //   449: aload_0
    //   450: sipush #-7508
    //   453: sipush #11970
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: aload_1
    //   460: iconst_0
    //   461: aload_2
    //   462: aload_3
    //   463: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   466: astore #9
    //   468: aload #9
    //   470: ifnull -> 480
    //   473: aload #4
    //   475: aload #9
    //   477: invokevirtual setMinProperties : (Ljava/lang/Integer;)V
    //   480: aload_0
    //   481: sipush #-7194
    //   484: sipush #-16772
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: aload_1
    //   491: iconst_0
    //   492: aload_2
    //   493: aload_3
    //   494: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   497: astore #12
    //   499: aload #12
    //   501: ifnull -> 624
    //   504: new java/util/ArrayList
    //   507: dup
    //   508: invokespecial <init> : ()V
    //   511: astore #13
    //   513: aload #12
    //   515: invokevirtual iterator : ()Ljava/util/Iterator;
    //   518: astore #14
    //   520: aload #14
    //   522: invokeinterface hasNext : ()Z
    //   527: ifeq -> 607
    //   530: aload #14
    //   532: invokeinterface next : ()Ljava/lang/Object;
    //   537: checkcast com/fasterxml/Zor/Zb
    //   540: astore #15
    //   542: aload #15
    //   544: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   547: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   550: invokevirtual equals : (Ljava/lang/Object;)Z
    //   553: ifeq -> 577
    //   556: aload #13
    //   558: aload #15
    //   560: checkcast com/fasterxml/Zg/Zb
    //   563: invokevirtual Zz : ()Ljava/lang/String;
    //   566: invokeinterface add : (Ljava/lang/Object;)Z
    //   571: pop
    //   572: aload #5
    //   574: ifnonnull -> 602
    //   577: aload_3
    //   578: aload_2
    //   579: sipush #-7194
    //   582: sipush #-16772
    //   585: invokestatic a : (II)Ljava/lang/String;
    //   588: sipush #-7551
    //   591: sipush #15066
    //   594: invokestatic a : (II)Ljava/lang/String;
    //   597: aload #15
    //   599: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   602: aload #5
    //   604: ifnonnull -> 520
    //   607: aload #13
    //   609: invokeinterface size : ()I
    //   614: ifle -> 624
    //   617: aload #4
    //   619: aload #13
    //   621: invokevirtual setRequired : (Ljava/util/List;)V
    //   624: aload_0
    //   625: sipush #-7642
    //   628: sipush #4544
    //   631: invokestatic a : (II)Ljava/lang/String;
    //   634: aload_1
    //   635: iconst_0
    //   636: aload_2
    //   637: aload_3
    //   638: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   641: astore #6
    //   643: aload_3
    //   644: invokevirtual isAllowEmptyStrings : ()Z
    //   647: ifeq -> 655
    //   650: aload #6
    //   652: ifnonnull -> 670
    //   655: aload_3
    //   656: invokevirtual isAllowEmptyStrings : ()Z
    //   659: ifne -> 677
    //   662: aload #6
    //   664: invokestatic isBlank : (Ljava/lang/String;)Z
    //   667: ifne -> 677
    //   670: aload #4
    //   672: aload #6
    //   674: invokevirtual setDescription : (Ljava/lang/String;)V
    //   677: aload_0
    //   678: sipush #-7322
    //   681: sipush #31547
    //   684: invokestatic a : (II)Ljava/lang/String;
    //   687: aload_1
    //   688: iconst_0
    //   689: aload_2
    //   690: aload_3
    //   691: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   694: astore #6
    //   696: aload_3
    //   697: invokevirtual isAllowEmptyStrings : ()Z
    //   700: ifeq -> 708
    //   703: aload #6
    //   705: ifnonnull -> 723
    //   708: aload_3
    //   709: invokevirtual isAllowEmptyStrings : ()Z
    //   712: ifne -> 730
    //   715: aload #6
    //   717: invokestatic isBlank : (Ljava/lang/String;)Z
    //   720: ifne -> 730
    //   723: aload #4
    //   725: aload #6
    //   727: invokevirtual setFormat : (Ljava/lang/String;)V
    //   730: aload_0
    //   731: sipush #-7503
    //   734: sipush #-30171
    //   737: invokestatic a : (II)Ljava/lang/String;
    //   740: aload_1
    //   741: iconst_0
    //   742: aload_2
    //   743: aload_3
    //   744: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   747: astore #11
    //   749: aload #11
    //   751: ifnull -> 761
    //   754: aload #4
    //   756: aload #11
    //   758: invokevirtual setReadOnly : (Ljava/lang/Boolean;)V
    //   761: aload_0
    //   762: sipush #-7349
    //   765: sipush #17694
    //   768: invokestatic a : (II)Ljava/lang/String;
    //   771: aload_1
    //   772: iconst_0
    //   773: aload_2
    //   774: aload_3
    //   775: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   778: astore #11
    //   780: aload #11
    //   782: ifnull -> 792
    //   785: aload #4
    //   787: aload #11
    //   789: invokevirtual setWriteOnly : (Ljava/lang/Boolean;)V
    //   792: aload_0
    //   793: sipush #-7349
    //   796: sipush #17694
    //   799: invokestatic a : (II)Ljava/lang/String;
    //   802: aload_1
    //   803: iconst_0
    //   804: aload_2
    //   805: aload_3
    //   806: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   809: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   812: iconst_0
    //   813: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   816: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   819: checkcast java/lang/Boolean
    //   822: invokevirtual booleanValue : ()Z
    //   825: ifeq -> 868
    //   828: aload_0
    //   829: sipush #-7503
    //   832: sipush #-30171
    //   835: invokestatic a : (II)Ljava/lang/String;
    //   838: aload_1
    //   839: iconst_0
    //   840: aload_2
    //   841: aload_3
    //   842: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   845: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   848: iconst_0
    //   849: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   852: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   855: checkcast java/lang/Boolean
    //   858: invokevirtual booleanValue : ()Z
    //   861: ifeq -> 868
    //   864: iconst_1
    //   865: goto -> 869
    //   868: iconst_0
    //   869: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   872: astore #11
    //   874: aload #11
    //   876: invokevirtual booleanValue : ()Z
    //   879: iconst_1
    //   880: if_icmpne -> 897
    //   883: aload_3
    //   884: aload_2
    //   885: sipush #-7518
    //   888: sipush #13945
    //   891: invokestatic a : (II)Ljava/lang/String;
    //   894: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   897: aload_0
    //   898: sipush #-7214
    //   901: sipush #-24112
    //   904: invokestatic a : (II)Ljava/lang/String;
    //   907: aload_1
    //   908: iconst_0
    //   909: aload_2
    //   910: aload_3
    //   911: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   914: astore #13
    //   916: aload #13
    //   918: ifnull -> 943
    //   921: aload_0
    //   922: aload #13
    //   924: aload_2
    //   925: aload_3
    //   926: invokevirtual getXml : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/XML;
    //   929: astore #14
    //   931: aload #14
    //   933: ifnull -> 943
    //   936: aload #4
    //   938: aload #14
    //   940: invokevirtual setXml : (Lnet/portswigger/swagger/v3/oas/models/media/XML;)V
    //   943: aload_0
    //   944: sipush #-7399
    //   947: sipush #-12918
    //   950: invokestatic a : (II)Ljava/lang/String;
    //   953: aload_1
    //   954: iconst_0
    //   955: aload_2
    //   956: aload_3
    //   957: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   960: astore #14
    //   962: aload #14
    //   964: ifnull -> 989
    //   967: aload_0
    //   968: aload #14
    //   970: aload_2
    //   971: aload_3
    //   972: invokevirtual getExternalDocs : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;
    //   975: astore #15
    //   977: aload #15
    //   979: ifnull -> 989
    //   982: aload #4
    //   984: aload #15
    //   986: invokevirtual setExternalDocs : (Lnet/portswigger/swagger/v3/oas/models/ExternalDocumentation;)V
    //   989: aload_0
    //   990: sipush #-7193
    //   993: sipush #-4890
    //   996: invokestatic a : (II)Ljava/lang/String;
    //   999: aload_1
    //   1000: aload_2
    //   1001: aload_3
    //   1002: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   1005: astore #15
    //   1007: aload #15
    //   1009: ifnull -> 1031
    //   1012: aload #4
    //   1014: aload #15
    //   1016: instanceof com/fasterxml/Zg/Zs
    //   1019: ifeq -> 1026
    //   1022: aconst_null
    //   1023: goto -> 1028
    //   1026: aload #15
    //   1028: invokevirtual setExample : (Ljava/lang/Object;)V
    //   1031: aload_0
    //   1032: sipush #-7363
    //   1035: sipush #9893
    //   1038: invokestatic a : (II)Ljava/lang/String;
    //   1041: aload_1
    //   1042: iconst_0
    //   1043: aload_2
    //   1044: aload_3
    //   1045: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1048: astore #11
    //   1050: aload #11
    //   1052: ifnull -> 1062
    //   1055: aload #4
    //   1057: aload #11
    //   1059: invokevirtual setDeprecated : (Ljava/lang/Boolean;)V
    //   1062: return
  }
  
  private Object getDecodedObject(Schema paramSchema, String paramString) throws ParseException {
    try {
      try {
        try {
          try {
          
          } catch (ParseException parseException) {
            throw a(null);
          } 
        } catch (ParseException parseException) {
          throw a(null);
        } 
      } catch (ParseException parseException) {
        throw a(null);
      } 
    } catch (ParseException parseException) {
      throw a(null);
    } 
    Object object = (paramString == null) ? null : (paramSchema.getClass().equals(DateSchema.class) ? toDate(paramString) : (paramSchema.getClass().equals(DateTimeSchema.class) ? toDateTime(paramString) : (paramSchema.getClass().equals(ByteArraySchema.class) ? toBytes(paramString) : paramString)));
    try {
      if (object == null)
        try {
          if (paramString != null)
            throw new ParseException(paramString, 0); 
        } catch (ParseException parseException) {
          throw a(null);
        }  
    } catch (ParseException parseException) {
      throw a(null);
    } 
    return object;
  }
  
  private Object getDecodedObject31(Schema paramSchema, String paramString) throws ParseException {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 12
    //   4: aconst_null
    //   5: goto -> 184
    //   8: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   11: athrow
    //   12: sipush #-7551
    //   15: sipush #15066
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: aload_1
    //   22: invokevirtual getType : ()Ljava/lang/String;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 69
    //   31: sipush #-7520
    //   34: sipush #12431
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: aload_1
    //   41: invokevirtual getFormat : ()Ljava/lang/String;
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 69
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: aload_2
    //   59: invokevirtual toDate : (Ljava/lang/String;)Ljava/util/Date;
    //   62: goto -> 184
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: sipush #-7551
    //   72: sipush #15066
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: aload_1
    //   79: invokevirtual getType : ()Ljava/lang/String;
    //   82: invokevirtual equals : (Ljava/lang/Object;)Z
    //   85: ifeq -> 126
    //   88: sipush #-7229
    //   91: sipush #-27284
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: aload_1
    //   98: invokevirtual getFormat : ()Ljava/lang/String;
    //   101: invokevirtual equals : (Ljava/lang/Object;)Z
    //   104: ifeq -> 126
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: aload_0
    //   115: aload_2
    //   116: invokevirtual toDateTime : (Ljava/lang/String;)Ljava/time/OffsetDateTime;
    //   119: goto -> 184
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: sipush #-7551
    //   129: sipush #15066
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: aload_1
    //   136: invokevirtual getType : ()Ljava/lang/String;
    //   139: invokevirtual equals : (Ljava/lang/Object;)Z
    //   142: ifeq -> 183
    //   145: sipush #-7510
    //   148: sipush #7901
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: aload_1
    //   155: invokevirtual getFormat : ()Ljava/lang/String;
    //   158: invokevirtual equals : (Ljava/lang/Object;)Z
    //   161: ifeq -> 183
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   170: athrow
    //   171: aload_0
    //   172: aload_2
    //   173: invokevirtual toBytes : (Ljava/lang/String;)[B
    //   176: goto -> 184
    //   179: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: aload_2
    //   184: astore_3
    //   185: aload_3
    //   186: ifnonnull -> 214
    //   189: aload_2
    //   190: ifnull -> 214
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   199: athrow
    //   200: new java/text/ParseException
    //   203: dup
    //   204: aload_2
    //   205: iconst_0
    //   206: invokespecial <init> : (Ljava/lang/String;I)V
    //   209: athrow
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload_3
    //   215: areturn
    // Exception table:
    //   from	to	target	type
    //   0	8	8	java/text/ParseException
    //   12	50	53	java/text/ParseException
    //   31	65	65	java/text/ParseException
    //   69	107	110	java/text/ParseException
    //   88	122	122	java/text/ParseException
    //   126	164	167	java/text/ParseException
    //   145	179	179	java/text/ParseException
    //   185	193	196	java/text/ParseException
    //   189	210	210	java/text/ParseException
  }
  
  private OffsetDateTime toDateTime(String paramString) {
    OffsetDateTime offsetDateTime = null;
    try {
      offsetDateTime = OffsetDateTime.parse(paramString);
    } catch (Exception exception) {}
    return offsetDateTime;
  }
  
  private Date toDate(String paramString) {
    Matcher matcher = RFC3339_DATE_PATTERN.matcher(paramString);
    Date date = null;
    if (matcher.matches()) {
      String str1 = matcher.group(1);
      String str2 = matcher.group(2);
      String str3 = matcher.group(3);
      try {
        date = (new Calendar.Builder()).setDate(Integer.parseInt(str1), Integer.parseInt(str2) - 1, Integer.parseInt(str3)).build().getTime();
      } catch (Exception exception) {}
    } 
    return date;
  }
  
  private byte[] toBytes(String paramString) {
    byte[] arrayOfByte;
    try {
      arrayOfByte = Base64.getDecoder().decode(paramString);
    } catch (Exception exception) {
      arrayOfByte = null;
    } 
    return arrayOfByte;
  }
  
  public Map<String, Example> getExamples(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 282
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7529
    //   66: sipush #-20813
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7569
    //   87: sipush #25004
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7220
    //   97: sipush #13072
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_1
    //   112: aload #9
    //   114: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   117: astore #10
    //   119: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.validNodeTypes : Ljava/util/Set;
    //   122: aload #10
    //   124: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   127: invokeinterface contains : (Ljava/lang/Object;)Z
    //   132: ifne -> 158
    //   135: aload_3
    //   136: aload_2
    //   137: aload #9
    //   139: sipush #-7362
    //   142: sipush #25325
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: aload #10
    //   150: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   153: aload #5
    //   155: ifnonnull -> 277
    //   158: aload #10
    //   160: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   163: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   166: invokevirtual equals : (Ljava/lang/Object;)Z
    //   169: ifeq -> 214
    //   172: aload #10
    //   174: checkcast com/fasterxml/Zg/Zb
    //   177: astore #11
    //   179: aload #11
    //   181: ifnull -> 209
    //   184: aload_0
    //   185: aload #11
    //   187: invokevirtual getTextExample : (Lcom/fasterxml/Zg/Zb;)Lnet/portswigger/swagger/v3/oas/models/examples/Example;
    //   190: astore #12
    //   192: aload #12
    //   194: ifnull -> 209
    //   197: aload #6
    //   199: aload #9
    //   201: aload #12
    //   203: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   208: pop
    //   209: aload #5
    //   211: ifnonnull -> 277
    //   214: aload #10
    //   216: checkcast com/fasterxml/Zg/Zr
    //   219: astore #11
    //   221: aload #11
    //   223: ifnull -> 277
    //   226: aload_0
    //   227: aload #11
    //   229: sipush #-7674
    //   232: sipush #9134
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: iconst_2
    //   239: anewarray java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: aload_2
    //   245: aastore
    //   246: dup
    //   247: iconst_1
    //   248: aload #9
    //   250: aastore
    //   251: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   254: aload_3
    //   255: invokevirtual getExample : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/examples/Example;
    //   258: astore #12
    //   260: aload #12
    //   262: ifnull -> 277
    //   265: aload #6
    //   267: aload #9
    //   269: aload #12
    //   271: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   276: pop
    //   277: aload #5
    //   279: ifnonnull -> 36
    //   282: aload #6
    //   284: areturn
  }
  
  private Example getTextExample(Zb paramZb) {
    if (paramZb == null)
      return null; 
    Example example = new Example();
    example.setValue(paramZb.Zz());
    return example;
  }
  
  public Example getExample(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/examples/Example
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-7225
    //   24: sipush #-25842
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 269
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 243
    //   54: aload_0
    //   55: aload #6
    //   57: invokevirtual Zz : ()Ljava/lang/String;
    //   60: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 82
    //   70: aload #5
    //   72: aload #7
    //   74: invokevirtual set$ref : (Ljava/lang/String;)V
    //   77: aload #4
    //   79: ifnonnull -> 92
    //   82: aload #5
    //   84: aload #6
    //   86: invokevirtual Zz : ()Ljava/lang/String;
    //   89: invokevirtual set$ref : (Ljava/lang/String;)V
    //   92: aload #6
    //   94: invokevirtual Zz : ()Ljava/lang/String;
    //   97: sipush #-7548
    //   100: sipush #15663
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 166
    //   112: aload #6
    //   114: invokevirtual Zz : ()Ljava/lang/String;
    //   117: sipush #-7493
    //   120: sipush #12154
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   129: ifne -> 166
    //   132: aload_3
    //   133: aload_2
    //   134: aload #6
    //   136: invokevirtual Zz : ()Ljava/lang/String;
    //   139: sipush #-7462
    //   142: sipush #8250
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: swap
    //   149: sipush #-7435
    //   152: sipush #19597
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_3
    //   167: invokevirtual isOpenapi31 : ()Z
    //   170: ifeq -> 240
    //   173: aload_0
    //   174: sipush #-7305
    //   177: bipush #-57
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: aload_1
    //   183: iconst_0
    //   184: aload_2
    //   185: aload_3
    //   186: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   189: astore #8
    //   191: aload #8
    //   193: invokestatic isBlank : (Ljava/lang/String;)Z
    //   196: ifne -> 206
    //   199: aload #5
    //   201: aload #8
    //   203: invokevirtual setSummary : (Ljava/lang/String;)V
    //   206: aload_0
    //   207: sipush #-7642
    //   210: sipush #4544
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: aload_1
    //   217: iconst_0
    //   218: aload_2
    //   219: aload_3
    //   220: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   223: astore #8
    //   225: aload #8
    //   227: invokestatic isBlank : (Ljava/lang/String;)Z
    //   230: ifne -> 240
    //   233: aload #5
    //   235: aload #8
    //   237: invokevirtual setDescription : (Ljava/lang/String;)V
    //   240: aload #5
    //   242: areturn
    //   243: aload_3
    //   244: aload_2
    //   245: sipush #-7225
    //   248: sipush #-25842
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: sipush #-7551
    //   257: sipush #15066
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: aload_1
    //   264: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   267: aconst_null
    //   268: areturn
    //   269: aload_0
    //   270: sipush #-7305
    //   273: bipush #-57
    //   275: invokestatic a : (II)Ljava/lang/String;
    //   278: aload_1
    //   279: iconst_0
    //   280: aload_2
    //   281: aload_3
    //   282: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   285: astore #7
    //   287: aload_3
    //   288: invokevirtual isAllowEmptyStrings : ()Z
    //   291: ifeq -> 299
    //   294: aload #7
    //   296: ifnonnull -> 314
    //   299: aload_3
    //   300: invokevirtual isAllowEmptyStrings : ()Z
    //   303: ifne -> 321
    //   306: aload #7
    //   308: invokestatic isBlank : (Ljava/lang/String;)Z
    //   311: ifne -> 321
    //   314: aload #5
    //   316: aload #7
    //   318: invokevirtual setSummary : (Ljava/lang/String;)V
    //   321: aload_0
    //   322: sipush #-7642
    //   325: sipush #4544
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: aload_1
    //   332: iconst_0
    //   333: aload_2
    //   334: aload_3
    //   335: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   338: astore #7
    //   340: aload_3
    //   341: invokevirtual isAllowEmptyStrings : ()Z
    //   344: ifeq -> 352
    //   347: aload #7
    //   349: ifnonnull -> 367
    //   352: aload_3
    //   353: invokevirtual isAllowEmptyStrings : ()Z
    //   356: ifne -> 374
    //   359: aload #7
    //   361: invokestatic isBlank : (Ljava/lang/String;)Z
    //   364: ifne -> 374
    //   367: aload #5
    //   369: aload #7
    //   371: invokevirtual setDescription : (Ljava/lang/String;)V
    //   374: aload_0
    //   375: sipush #-7181
    //   378: sipush #-17116
    //   381: invokestatic a : (II)Ljava/lang/String;
    //   384: aload_1
    //   385: aload_2
    //   386: aload_3
    //   387: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   390: astore #8
    //   392: aload #8
    //   394: ifnull -> 416
    //   397: aload #5
    //   399: aload #8
    //   401: instanceof com/fasterxml/Zg/Zs
    //   404: ifeq -> 411
    //   407: aconst_null
    //   408: goto -> 413
    //   411: aload #8
    //   413: invokevirtual setValue : (Ljava/lang/Object;)V
    //   416: aload_0
    //   417: sipush #-7410
    //   420: sipush #-17067
    //   423: invokestatic a : (II)Ljava/lang/String;
    //   426: aload_1
    //   427: iconst_0
    //   428: aload_2
    //   429: aload_3
    //   430: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   433: astore #7
    //   435: aload_3
    //   436: invokevirtual isAllowEmptyStrings : ()Z
    //   439: ifeq -> 447
    //   442: aload #7
    //   444: ifnonnull -> 462
    //   447: aload_3
    //   448: invokevirtual isAllowEmptyStrings : ()Z
    //   451: ifne -> 469
    //   454: aload #7
    //   456: invokestatic isBlank : (Ljava/lang/String;)Z
    //   459: ifne -> 469
    //   462: aload #5
    //   464: aload #7
    //   466: invokevirtual setExternalValue : (Ljava/lang/String;)V
    //   469: aload #8
    //   471: ifnull -> 493
    //   474: aload #7
    //   476: ifnull -> 493
    //   479: aload_3
    //   480: aload_2
    //   481: sipush #-7433
    //   484: sipush #6980
    //   487: invokestatic a : (II)Ljava/lang/String;
    //   490: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   493: aload_0
    //   494: aload_1
    //   495: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   498: astore #9
    //   500: aload #9
    //   502: ifnull -> 522
    //   505: aload #9
    //   507: invokeinterface size : ()I
    //   512: ifle -> 522
    //   515: aload #5
    //   517: aload #9
    //   519: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   522: aload_0
    //   523: aload_1
    //   524: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   527: astore #10
    //   529: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   532: aload_3
    //   533: invokevirtual isOpenapi31 : ()Z
    //   536: ifeq -> 551
    //   539: sipush #-7188
    //   542: sipush #9260
    //   545: invokestatic a : (II)Ljava/lang/String;
    //   548: goto -> 560
    //   551: sipush #-7446
    //   554: sipush #984
    //   557: invokestatic a : (II)Ljava/lang/String;
    //   560: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   565: checkcast java/util/Map
    //   568: astore #11
    //   570: aload #10
    //   572: invokeinterface iterator : ()Ljava/util/Iterator;
    //   577: astore #12
    //   579: aload #12
    //   581: invokeinterface hasNext : ()Z
    //   586: ifeq -> 675
    //   589: aload #12
    //   591: invokeinterface next : ()Ljava/lang/Object;
    //   596: checkcast java/lang/String
    //   599: astore #13
    //   601: aload #11
    //   603: sipush #-7343
    //   606: sipush #-31264
    //   609: invokestatic a : (II)Ljava/lang/String;
    //   612: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   617: checkcast java/util/Set
    //   620: aload #13
    //   622: invokeinterface contains : (Ljava/lang/Object;)Z
    //   627: ifne -> 660
    //   630: aload #13
    //   632: sipush #-7344
    //   635: sipush #-28932
    //   638: invokestatic a : (II)Ljava/lang/String;
    //   641: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   644: ifne -> 660
    //   647: aload_3
    //   648: aload_2
    //   649: aload #13
    //   651: aload_1
    //   652: aload #13
    //   654: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   657: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   660: aload_0
    //   661: aload #11
    //   663: aload #13
    //   665: aload_2
    //   666: aload_3
    //   667: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   670: aload #4
    //   672: ifnonnull -> 579
    //   675: aload #5
    //   677: areturn
  }
  
  public void setStyle(String paramString1, Parameter paramParameter, String paramString2, Zr paramZr, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #6
    //   5: aload_1
    //   6: invokestatic isBlank : (Ljava/lang/String;)Z
    //   9: ifeq -> 112
    //   12: sipush #-7223
    //   15: sipush #12794
    //   18: invokestatic a : (II)Ljava/lang/String;
    //   21: aload_2
    //   22: invokevirtual getIn : ()Ljava/lang/String;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifne -> 50
    //   31: sipush #-7328
    //   34: sipush #17229
    //   37: invokestatic a : (II)Ljava/lang/String;
    //   40: aload_2
    //   41: invokevirtual getIn : ()Ljava/lang/String;
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 62
    //   50: aload_2
    //   51: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   54: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   57: aload #6
    //   59: ifnonnull -> 313
    //   62: sipush #-7638
    //   65: sipush #-24907
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: aload_2
    //   72: invokevirtual getIn : ()Ljava/lang/String;
    //   75: invokevirtual equals : (Ljava/lang/Object;)Z
    //   78: ifne -> 100
    //   81: sipush #-7172
    //   84: sipush #28655
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: aload_2
    //   91: invokevirtual getIn : ()Ljava/lang/String;
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: ifeq -> 313
    //   100: aload_2
    //   101: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SIMPLE : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   104: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   107: aload #6
    //   109: ifnonnull -> 313
    //   112: aload_1
    //   113: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: invokevirtual equals : (Ljava/lang/Object;)Z
    //   122: ifeq -> 137
    //   125: aload_2
    //   126: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.FORM : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   129: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   132: aload #6
    //   134: ifnonnull -> 313
    //   137: aload_1
    //   138: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.DEEPOBJECT : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifeq -> 162
    //   150: aload_2
    //   151: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.DEEPOBJECT : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   154: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   157: aload #6
    //   159: ifnonnull -> 313
    //   162: aload_1
    //   163: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.LABEL : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   166: invokevirtual toString : ()Ljava/lang/String;
    //   169: invokevirtual equals : (Ljava/lang/Object;)Z
    //   172: ifeq -> 187
    //   175: aload_2
    //   176: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.LABEL : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   179: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   182: aload #6
    //   184: ifnonnull -> 313
    //   187: aload_1
    //   188: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.MATRIX : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: invokevirtual equals : (Ljava/lang/Object;)Z
    //   197: ifeq -> 212
    //   200: aload_2
    //   201: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.MATRIX : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   204: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   207: aload #6
    //   209: ifnonnull -> 313
    //   212: aload_1
    //   213: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.PIPEDELIMITED : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: invokevirtual equals : (Ljava/lang/Object;)Z
    //   222: ifeq -> 237
    //   225: aload_2
    //   226: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.PIPEDELIMITED : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   229: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   232: aload #6
    //   234: ifnonnull -> 313
    //   237: aload_1
    //   238: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SIMPLE : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   241: invokevirtual toString : ()Ljava/lang/String;
    //   244: invokevirtual equals : (Ljava/lang/Object;)Z
    //   247: ifeq -> 262
    //   250: aload_2
    //   251: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SIMPLE : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   254: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   257: aload #6
    //   259: ifnonnull -> 313
    //   262: aload_1
    //   263: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SPACEDELIMITED : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   266: invokevirtual toString : ()Ljava/lang/String;
    //   269: invokevirtual equals : (Ljava/lang/Object;)Z
    //   272: ifeq -> 287
    //   275: aload_2
    //   276: getstatic net/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum.SPACEDELIMITED : Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;
    //   279: invokevirtual setStyle : (Lnet/portswigger/swagger/v3/oas/models/parameters/Parameter$StyleEnum;)V
    //   282: aload #6
    //   284: ifnonnull -> 313
    //   287: aload #5
    //   289: aload_3
    //   290: sipush #-7588
    //   293: sipush #-10573
    //   296: invokestatic a : (II)Ljava/lang/String;
    //   299: sipush #-7196
    //   302: sipush #31210
    //   305: invokestatic a : (II)Ljava/lang/String;
    //   308: aload #4
    //   310: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   313: return
  }
  
  public ApiResponses getResponses(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/responses/ApiResponses
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 233
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7529
    //   66: sipush #-20813
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7629
    //   87: sipush #-14048
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7220
    //   97: sipush #13072
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload #9
    //   113: sipush #-7344
    //   116: sipush #-28932
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   125: ifeq -> 162
    //   128: aload_0
    //   129: aload_1
    //   130: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   133: astore #10
    //   135: aload #10
    //   137: ifnull -> 157
    //   140: aload #10
    //   142: invokeinterface size : ()I
    //   147: ifle -> 157
    //   150: aload #6
    //   152: aload #10
    //   154: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   157: aload #5
    //   159: ifnonnull -> 228
    //   162: aload_0
    //   163: aload #9
    //   165: aload_1
    //   166: iconst_0
    //   167: aload_2
    //   168: aload_3
    //   169: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   172: astore #10
    //   174: aload #10
    //   176: ifnull -> 228
    //   179: aload_0
    //   180: aload #10
    //   182: sipush #-7674
    //   185: sipush #9134
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: iconst_2
    //   192: anewarray java/lang/Object
    //   195: dup
    //   196: iconst_0
    //   197: aload_2
    //   198: aastore
    //   199: dup
    //   200: iconst_1
    //   201: aload #9
    //   203: aastore
    //   204: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   207: aload_3
    //   208: invokevirtual getResponse : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;
    //   211: astore #11
    //   213: aload #11
    //   215: ifnull -> 228
    //   218: aload #6
    //   220: aload #9
    //   222: aload #11
    //   224: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   227: pop
    //   228: aload #5
    //   230: ifnonnull -> 36
    //   233: aload #6
    //   235: areturn
  }
  
  public ApiResponse getResponse(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-7451
    //   24: sipush #-18886
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 236
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 210
    //   54: aload_0
    //   55: aload #6
    //   57: invokevirtual Zz : ()Ljava/lang/String;
    //   60: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 82
    //   70: aload #5
    //   72: aload #7
    //   74: invokevirtual set$ref : (Ljava/lang/String;)V
    //   77: aload #4
    //   79: ifnonnull -> 92
    //   82: aload #5
    //   84: aload #6
    //   86: invokevirtual Zz : ()Ljava/lang/String;
    //   89: invokevirtual set$ref : (Ljava/lang/String;)V
    //   92: aload #6
    //   94: invokevirtual Zz : ()Ljava/lang/String;
    //   97: sipush #-7499
    //   100: sipush #-21306
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 166
    //   112: aload #6
    //   114: invokevirtual Zz : ()Ljava/lang/String;
    //   117: sipush #-7631
    //   120: sipush #-30161
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   129: ifne -> 166
    //   132: aload_3
    //   133: aload_2
    //   134: aload #6
    //   136: invokevirtual Zz : ()Ljava/lang/String;
    //   139: sipush #-7616
    //   142: sipush #-25955
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: swap
    //   149: sipush #-7679
    //   152: sipush #-14884
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_3
    //   167: invokevirtual isOpenapi31 : ()Z
    //   170: ifeq -> 207
    //   173: aload_0
    //   174: sipush #-7642
    //   177: sipush #4544
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: aload_1
    //   184: iconst_0
    //   185: aload_2
    //   186: aload_3
    //   187: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   190: astore #8
    //   192: aload #8
    //   194: invokestatic isBlank : (Ljava/lang/String;)Z
    //   197: ifne -> 207
    //   200: aload #5
    //   202: aload #8
    //   204: invokevirtual setDescription : (Ljava/lang/String;)V
    //   207: aload #5
    //   209: areturn
    //   210: aload_3
    //   211: aload_2
    //   212: sipush #-7225
    //   215: sipush #-25842
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: sipush #-7418
    //   224: sipush #13253
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: aload_1
    //   231: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   234: aconst_null
    //   235: areturn
    //   236: aload_0
    //   237: sipush #-7642
    //   240: sipush #4544
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: aload_1
    //   247: iconst_1
    //   248: aload_2
    //   249: aload_3
    //   250: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   253: astore #7
    //   255: aload_3
    //   256: invokevirtual isAllowEmptyStrings : ()Z
    //   259: ifeq -> 267
    //   262: aload #7
    //   264: ifnonnull -> 282
    //   267: aload_3
    //   268: invokevirtual isAllowEmptyStrings : ()Z
    //   271: ifne -> 290
    //   274: aload #7
    //   276: invokestatic isBlank : (Ljava/lang/String;)Z
    //   279: ifne -> 290
    //   282: aload #5
    //   284: aload #7
    //   286: invokevirtual description : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/responses/ApiResponse;
    //   289: pop
    //   290: aload_0
    //   291: sipush #-7585
    //   294: sipush #27473
    //   297: invokestatic a : (II)Ljava/lang/String;
    //   300: aload_1
    //   301: iconst_0
    //   302: aload_2
    //   303: aload_3
    //   304: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   307: astore #8
    //   309: aload #8
    //   311: ifnull -> 378
    //   314: aload_0
    //   315: aload #8
    //   317: sipush #-7674
    //   320: sipush #9134
    //   323: invokestatic a : (II)Ljava/lang/String;
    //   326: iconst_2
    //   327: anewarray java/lang/Object
    //   330: dup
    //   331: iconst_0
    //   332: aload_2
    //   333: aastore
    //   334: dup
    //   335: iconst_1
    //   336: sipush #-7613
    //   339: sipush #15237
    //   342: invokestatic a : (II)Ljava/lang/String;
    //   345: aastore
    //   346: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   349: aload_3
    //   350: iconst_0
    //   351: invokevirtual getHeaders : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   354: astore #9
    //   356: aload #9
    //   358: ifnull -> 378
    //   361: aload #9
    //   363: invokeinterface size : ()I
    //   368: ifle -> 378
    //   371: aload #5
    //   373: aload #9
    //   375: invokevirtual setHeaders : (Ljava/util/Map;)V
    //   378: aload_0
    //   379: sipush #-7388
    //   382: sipush #-5579
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: aload_1
    //   389: iconst_0
    //   390: aload_2
    //   391: aload_3
    //   392: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   395: astore #9
    //   397: aload #9
    //   399: ifnull -> 466
    //   402: aload_0
    //   403: aload #9
    //   405: sipush #-7674
    //   408: sipush #9134
    //   411: invokestatic a : (II)Ljava/lang/String;
    //   414: iconst_2
    //   415: anewarray java/lang/Object
    //   418: dup
    //   419: iconst_0
    //   420: aload_2
    //   421: aastore
    //   422: dup
    //   423: iconst_1
    //   424: sipush #-7350
    //   427: sipush #22421
    //   430: invokestatic a : (II)Ljava/lang/String;
    //   433: aastore
    //   434: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   437: aload_3
    //   438: iconst_0
    //   439: invokevirtual getLinks : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Ljava/util/Map;
    //   442: astore #10
    //   444: aload #10
    //   446: ifnull -> 466
    //   449: aload #10
    //   451: invokeinterface size : ()I
    //   456: ifle -> 466
    //   459: aload #5
    //   461: aload #10
    //   463: invokevirtual setLinks : (Ljava/util/Map;)V
    //   466: aload_0
    //   467: sipush #-7667
    //   470: sipush #19540
    //   473: invokestatic a : (II)Ljava/lang/String;
    //   476: aload_1
    //   477: iconst_0
    //   478: aload_2
    //   479: aload_3
    //   480: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   483: astore #10
    //   485: aload #10
    //   487: ifnull -> 534
    //   490: aload #5
    //   492: aload_0
    //   493: aload #10
    //   495: sipush #-7674
    //   498: sipush #9134
    //   501: invokestatic a : (II)Ljava/lang/String;
    //   504: iconst_2
    //   505: anewarray java/lang/Object
    //   508: dup
    //   509: iconst_0
    //   510: aload_2
    //   511: aastore
    //   512: dup
    //   513: iconst_1
    //   514: sipush #-7402
    //   517: sipush #23593
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: aastore
    //   524: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   527: aload_3
    //   528: invokevirtual getContent : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   531: invokevirtual setContent : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)V
    //   534: aload_0
    //   535: aload_1
    //   536: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   539: astore #11
    //   541: aload #11
    //   543: ifnull -> 563
    //   546: aload #11
    //   548: invokeinterface size : ()I
    //   553: ifle -> 563
    //   556: aload #5
    //   558: aload #11
    //   560: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   563: aload_0
    //   564: aload_1
    //   565: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   568: astore #12
    //   570: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   573: aload_3
    //   574: invokevirtual isOpenapi31 : ()Z
    //   577: ifeq -> 592
    //   580: sipush #-7188
    //   583: sipush #9260
    //   586: invokestatic a : (II)Ljava/lang/String;
    //   589: goto -> 601
    //   592: sipush #-7446
    //   595: sipush #984
    //   598: invokestatic a : (II)Ljava/lang/String;
    //   601: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   606: checkcast java/util/Map
    //   609: astore #13
    //   611: aload #12
    //   613: invokeinterface iterator : ()Ljava/util/Iterator;
    //   618: astore #14
    //   620: aload #14
    //   622: invokeinterface hasNext : ()Z
    //   627: ifeq -> 716
    //   630: aload #14
    //   632: invokeinterface next : ()Ljava/lang/Object;
    //   637: checkcast java/lang/String
    //   640: astore #15
    //   642: aload #13
    //   644: sipush #-7382
    //   647: sipush #7265
    //   650: invokestatic a : (II)Ljava/lang/String;
    //   653: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   658: checkcast java/util/Set
    //   661: aload #15
    //   663: invokeinterface contains : (Ljava/lang/Object;)Z
    //   668: ifne -> 701
    //   671: aload #15
    //   673: sipush #-7344
    //   676: sipush #-28932
    //   679: invokestatic a : (II)Ljava/lang/String;
    //   682: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   685: ifne -> 701
    //   688: aload_3
    //   689: aload_2
    //   690: aload #15
    //   692: aload_1
    //   693: aload #15
    //   695: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   698: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   701: aload_0
    //   702: aload #13
    //   704: aload #15
    //   706: aload_2
    //   707: aload_3
    //   708: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   711: aload #4
    //   713: ifnonnull -> 620
    //   716: aload #5
    //   718: areturn
  }
  
  public List<String> getTagsStrings(Zh paramZh, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZh == null)
      return null; 
    ArrayList<String> arrayList = new ArrayList();
    for (Zb zb : paramZh) {
      if (zb.ZF().equals(Zfr.STRING))
        arrayList.add(zb.Zz()); 
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  public Operation getOperation(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramZr == null)
      return null; 
    Operation operation = new Operation();
    Zh zh1 = getArray(a(-7222, 12152), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    List<String> list = getTagsStrings(zh1, String.format(a(-7674, 9134), new Object[] { paramString, a(-7222, 12152) }), paramOpenAPIDeserializer$ParseResult);
    if (list != null)
      operation.setTags(list); 
    String str = getString(a(-7305, -57), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      operation.setSummary(str); 
    str = getString(a(-7642, 4544), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      operation.setDescription(str); 
    Zr zr1 = getObject(a(-7399, -12918), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    ExternalDocumentation externalDocumentation = getExternalDocs(zr1, String.format(a(-7674, 9134), new Object[] { paramString, a(-7399, -12918) }), paramOpenAPIDeserializer$ParseResult);
    if (externalDocumentation != null)
      operation.setExternalDocs(externalDocumentation); 
    str = getString(a(-7615, 15504), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult, this.operationIDs);
    if ((paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && str != null) || (!paramOpenAPIDeserializer$ParseResult.isAllowEmptyStrings() && !StringUtils.isBlank(str)))
      operation.operationId(str); 
    Zh zh2 = getArray(a(-7195, 27709), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zh2 != null)
      operation.setParameters(getParameterList(zh2, String.format(a(-7674, 9134), new Object[] { paramString, a(-7195, 27709) }), paramOpenAPIDeserializer$ParseResult)); 
    Zr zr2 = getObject(a(-7309, 2463), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zr2 != null)
      operation.setRequestBody(getRequestBody(zr2, String.format(a(-7674, 9134), new Object[] { paramString, a(-7309, 2463) }), paramOpenAPIDeserializer$ParseResult)); 
    Zr zr3 = getObject(a(-7536, -29376), paramZr, true, paramString, paramOpenAPIDeserializer$ParseResult);
    ApiResponses apiResponses = getResponses(zr3, String.format(a(-7674, 9134), new Object[] { paramString, a(-7536, -29376) }), paramOpenAPIDeserializer$ParseResult, false);
    if (apiResponses != null)
      operation.setResponses(apiResponses); 
    Zr zr4 = getObject(a(-7219, 28309), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    Map<String, Callback> map = getCallbacks(zr4, String.format(a(-7674, 9134), new Object[] { paramString, a(-7219, 28309) }), paramOpenAPIDeserializer$ParseResult, false);
    if (map != null)
      operation.setCallbacks(map); 
    Boolean bool = getBoolean(a(-7363, 9893), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (bool != null)
      operation.setDeprecated(bool); 
    zh1 = getArray(a(-7308, -11859), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zh1 != null && zh1.Zv() > 0)
      operation.setServers(getServersList(zh1, String.format(a(-7674, 9134), new Object[] { paramString, a(-7308, -11859) }), paramOpenAPIDeserializer$ParseResult)); 
    zh1 = getArray(a(-7424, -12592), paramZr, false, paramString, paramOpenAPIDeserializer$ParseResult);
    if (zh1 != null)
      operation.setSecurity(getSecurityRequirementsList(zh1, String.format(a(-7674, 9134), new Object[] { paramString, a(-7424, -12592) }), paramOpenAPIDeserializer$ParseResult)); 
    Map<String, Object> map1 = getExtensions(paramZr);
    if (map1 != null && map1.size() > 0)
      operation.setExtensions(map1); 
    Set<String> set = getKeys(paramZr);
    Map<String, Set<String>> map2 = KEYS.get(paramOpenAPIDeserializer$ParseResult.isOpenapi31() ? a(-7188, 9260) : a(-7446, 984));
    for (String str1 : set) {
      if (!((Set)map2.get(a(-7663, -25943))).contains(str1) && !str1.startsWith(a(-7344, -28932)))
        paramOpenAPIDeserializer$ParseResult.extra(paramString, str1, paramZr.ZL(str1)); 
      validateReservedKeywords(map2, str1, paramString, paramOpenAPIDeserializer$ParseResult);
      if (arrayOfZbqc == null)
        break; 
    } 
    return operation;
  }
  
  public List<SecurityRequirement> getSecurityRequirementsList(Zh paramZh, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/ArrayList
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: invokevirtual iterator : ()Ljava/util/Iterator;
    //   24: astore #6
    //   26: aload #6
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 268
    //   36: aload #6
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast com/fasterxml/Zor/Zb
    //   46: astore #7
    //   48: aload #7
    //   50: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   53: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 263
    //   62: new net/portswigger/swagger/v3/oas/models/security/SecurityRequirement
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: astore #8
    //   71: aload_0
    //   72: aload #7
    //   74: checkcast com/fasterxml/Zg/Zr
    //   77: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   80: astore #9
    //   82: aload #9
    //   84: invokeinterface size : ()I
    //   89: ifne -> 107
    //   92: aload #5
    //   94: aload #8
    //   96: invokeinterface add : (Ljava/lang/Object;)Z
    //   101: pop
    //   102: aload #4
    //   104: ifnonnull -> 263
    //   107: aload #9
    //   109: invokeinterface iterator : ()Ljava/util/Iterator;
    //   114: astore #10
    //   116: aload #10
    //   118: invokeinterface hasNext : ()Z
    //   123: ifeq -> 245
    //   126: aload #10
    //   128: invokeinterface next : ()Ljava/lang/Object;
    //   133: checkcast java/lang/String
    //   136: astore #11
    //   138: aload #11
    //   140: ifnull -> 240
    //   143: aload #7
    //   145: aload #11
    //   147: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   150: astore #12
    //   152: aload #11
    //   154: ifnull -> 240
    //   157: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   160: aload #12
    //   162: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   165: invokevirtual equals : (Ljava/lang/Object;)Z
    //   168: ifeq -> 240
    //   171: aload #12
    //   173: checkcast com/fasterxml/Zg/Zh
    //   176: astore #13
    //   178: aload #13
    //   180: invokevirtual Zn : ()Ljava/util/Iterator;
    //   183: dup
    //   184: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: <illegal opcode> get : (Ljava/util/Iterator;)Ljava/util/function/Supplier;
    //   193: invokestatic generate : (Ljava/util/function/Supplier;)Ljava/util/stream/Stream;
    //   196: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   201: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   206: aload #13
    //   208: invokevirtual Zv : ()I
    //   211: i2l
    //   212: invokeinterface limit : (J)Ljava/util/stream/Stream;
    //   217: invokestatic toList : ()Ljava/util/stream/Collector;
    //   220: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   225: checkcast java/util/List
    //   228: astore #14
    //   230: aload #8
    //   232: aload #11
    //   234: aload #14
    //   236: invokevirtual addList : (Ljava/lang/String;Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/security/SecurityRequirement;
    //   239: pop
    //   240: aload #4
    //   242: ifnonnull -> 116
    //   245: aload #8
    //   247: invokevirtual size : ()I
    //   250: ifle -> 263
    //   253: aload #5
    //   255: aload #8
    //   257: invokeinterface add : (Ljava/lang/Object;)Z
    //   262: pop
    //   263: aload #4
    //   265: ifnonnull -> 26
    //   268: aload #5
    //   270: areturn
  }
  
  public Map<String, RequestBody> getRequestBodies(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #6
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #7
    //   27: aload #7
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #8
    //   36: aload #8
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 219
    //   46: aload #8
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #9
    //   58: iload #4
    //   60: ifeq -> 111
    //   63: sipush #-7529
    //   66: sipush #-20813
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload #9
    //   74: invokestatic matches : (Ljava/lang/String;Ljava/lang/CharSequence;)Z
    //   77: ifne -> 111
    //   80: aload_3
    //   81: aload_2
    //   82: aload #9
    //   84: sipush #-7413
    //   87: sipush #-16749
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: swap
    //   94: sipush #-7220
    //   97: sipush #13072
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   111: aload_1
    //   112: aload #9
    //   114: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   117: astore #10
    //   119: aload #10
    //   121: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   124: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   127: invokevirtual equals : (Ljava/lang/Object;)Z
    //   130: ifne -> 156
    //   133: aload_3
    //   134: aload_2
    //   135: aload #9
    //   137: sipush #-7362
    //   140: sipush #25325
    //   143: invokestatic a : (II)Ljava/lang/String;
    //   146: aload #10
    //   148: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   151: aload #5
    //   153: ifnonnull -> 214
    //   156: aload #10
    //   158: checkcast com/fasterxml/Zg/Zr
    //   161: astore #11
    //   163: aload_0
    //   164: aload #11
    //   166: sipush #-7674
    //   169: sipush #9134
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: iconst_2
    //   176: anewarray java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_2
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload #9
    //   187: aastore
    //   188: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   191: aload_3
    //   192: invokevirtual getRequestBody : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/parameters/RequestBody;
    //   195: astore #12
    //   197: aload #12
    //   199: ifnull -> 214
    //   202: aload #6
    //   204: aload #9
    //   206: aload #12
    //   208: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   213: pop
    //   214: aload #5
    //   216: ifnonnull -> 36
    //   219: aload #6
    //   221: areturn
  }
  
  public RequestBody getRequestBody(Zr paramZr, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v3/oas/models/parameters/RequestBody
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-7225
    //   24: sipush #-25842
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 236
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 210
    //   54: aload_0
    //   55: aload #6
    //   57: invokevirtual Zz : ()Ljava/lang/String;
    //   60: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   63: astore #7
    //   65: aload #7
    //   67: ifnull -> 82
    //   70: aload #5
    //   72: aload #7
    //   74: invokevirtual set$ref : (Ljava/lang/String;)V
    //   77: aload #4
    //   79: ifnonnull -> 92
    //   82: aload #5
    //   84: aload #6
    //   86: invokevirtual Zz : ()Ljava/lang/String;
    //   89: invokevirtual set$ref : (Ljava/lang/String;)V
    //   92: aload #6
    //   94: invokevirtual Zz : ()Ljava/lang/String;
    //   97: sipush #-7548
    //   100: sipush #15663
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 166
    //   112: aload #6
    //   114: invokevirtual Zz : ()Ljava/lang/String;
    //   117: sipush #-7673
    //   120: sipush #2464
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   129: ifne -> 166
    //   132: aload_3
    //   133: aload_2
    //   134: aload #6
    //   136: invokevirtual Zz : ()Ljava/lang/String;
    //   139: sipush #-7462
    //   142: sipush #8250
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: swap
    //   149: sipush #-7466
    //   152: sipush #28704
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   163: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   166: aload_3
    //   167: invokevirtual isOpenapi31 : ()Z
    //   170: ifeq -> 207
    //   173: aload_0
    //   174: sipush #-7642
    //   177: sipush #4544
    //   180: invokestatic a : (II)Ljava/lang/String;
    //   183: aload_1
    //   184: iconst_0
    //   185: aload_2
    //   186: aload_3
    //   187: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   190: astore #8
    //   192: aload #8
    //   194: invokestatic isBlank : (Ljava/lang/String;)Z
    //   197: ifne -> 207
    //   200: aload #5
    //   202: aload #8
    //   204: invokevirtual setDescription : (Ljava/lang/String;)V
    //   207: aload #5
    //   209: areturn
    //   210: aload_3
    //   211: aload_2
    //   212: sipush #-7225
    //   215: sipush #-25842
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: sipush #-7551
    //   224: sipush #15066
    //   227: invokestatic a : (II)Ljava/lang/String;
    //   230: aload_1
    //   231: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   234: aconst_null
    //   235: areturn
    //   236: aload_0
    //   237: sipush #-7642
    //   240: sipush #4544
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: aload_1
    //   247: iconst_0
    //   248: aload_2
    //   249: aload_3
    //   250: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   253: astore #7
    //   255: aload_3
    //   256: invokevirtual isAllowEmptyStrings : ()Z
    //   259: ifeq -> 274
    //   262: aload #7
    //   264: ifnull -> 274
    //   267: aload #5
    //   269: aload #7
    //   271: invokevirtual setDescription : (Ljava/lang/String;)V
    //   274: aload_0
    //   275: sipush #-7194
    //   278: sipush #-16772
    //   281: invokestatic a : (II)Ljava/lang/String;
    //   284: aload_1
    //   285: iconst_0
    //   286: aload_2
    //   287: aload_3
    //   288: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   291: astore #8
    //   293: aload #8
    //   295: ifnull -> 305
    //   298: aload #5
    //   300: aload #8
    //   302: invokevirtual setRequired : (Ljava/lang/Boolean;)V
    //   305: aload_0
    //   306: sipush #-7402
    //   309: sipush #23593
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: aload_1
    //   316: iconst_1
    //   317: aload_2
    //   318: aload_3
    //   319: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   322: astore #9
    //   324: aload_0
    //   325: aload #9
    //   327: aload_2
    //   328: sipush #-7589
    //   331: sipush #16524
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   342: aload_3
    //   343: invokevirtual getContent : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   346: astore #10
    //   348: aload #10
    //   350: ifnull -> 386
    //   353: aload #10
    //   355: invokevirtual isEmpty : ()Z
    //   358: ifeq -> 386
    //   361: aload_3
    //   362: aload_2
    //   363: sipush #-7495
    //   366: sipush #9974
    //   369: invokestatic a : (II)Ljava/lang/String;
    //   372: aload #9
    //   374: invokevirtual unsupported : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   377: aload_3
    //   378: invokevirtual invalid : ()V
    //   381: aload #4
    //   383: ifnonnull -> 393
    //   386: aload #5
    //   388: aload #10
    //   390: invokevirtual setContent : (Lnet/portswigger/swagger/v3/oas/models/media/Content;)V
    //   393: aload_0
    //   394: aload_1
    //   395: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   398: astore #11
    //   400: aload #11
    //   402: ifnull -> 422
    //   405: aload #11
    //   407: invokeinterface size : ()I
    //   412: ifle -> 422
    //   415: aload #5
    //   417: aload #11
    //   419: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   422: aload_0
    //   423: aload_1
    //   424: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   427: astore #12
    //   429: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   432: aload_3
    //   433: invokevirtual isOpenapi31 : ()Z
    //   436: ifeq -> 451
    //   439: sipush #-7188
    //   442: sipush #9260
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: goto -> 460
    //   451: sipush #-7446
    //   454: sipush #984
    //   457: invokestatic a : (II)Ljava/lang/String;
    //   460: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   465: checkcast java/util/Map
    //   468: astore #13
    //   470: aload #12
    //   472: invokeinterface iterator : ()Ljava/util/Iterator;
    //   477: astore #14
    //   479: aload #14
    //   481: invokeinterface hasNext : ()Z
    //   486: ifeq -> 575
    //   489: aload #14
    //   491: invokeinterface next : ()Ljava/lang/Object;
    //   496: checkcast java/lang/String
    //   499: astore #15
    //   501: aload #13
    //   503: sipush #-7568
    //   506: sipush #-2833
    //   509: invokestatic a : (II)Ljava/lang/String;
    //   512: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   517: checkcast java/util/Set
    //   520: aload #15
    //   522: invokeinterface contains : (Ljava/lang/Object;)Z
    //   527: ifne -> 560
    //   530: aload #15
    //   532: sipush #-7344
    //   535: sipush #-28932
    //   538: invokestatic a : (II)Ljava/lang/String;
    //   541: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   544: ifne -> 560
    //   547: aload_3
    //   548: aload_2
    //   549: aload #15
    //   551: aload_1
    //   552: aload #15
    //   554: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   557: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   560: aload_0
    //   561: aload #13
    //   563: aload #15
    //   565: aload_2
    //   566: aload_3
    //   567: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   570: aload #4
    //   572: ifnonnull -> 479
    //   575: aload #5
    //   577: areturn
  }
  
  public String inferTypeFromArray(Zh paramZh) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zv : ()I
    //   8: ifne -> 21
    //   11: sipush #-7551
    //   14: sipush #15066
    //   17: invokestatic a : (II)Ljava/lang/String;
    //   20: areturn
    //   21: aconst_null
    //   22: astore_3
    //   23: iconst_0
    //   24: istore #4
    //   26: iload #4
    //   28: aload_1
    //   29: invokevirtual Zv : ()I
    //   32: if_icmpge -> 171
    //   35: aload_1
    //   36: iconst_0
    //   37: invokevirtual ZC : (I)Lcom/fasterxml/Zor/Zb;
    //   40: astore #5
    //   42: aload #5
    //   44: invokevirtual ZL : ()Z
    //   47: ifeq -> 98
    //   50: aload_3
    //   51: ifnonnull -> 68
    //   54: sipush #-7662
    //   57: sipush #28606
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: astore_3
    //   64: aload_2
    //   65: ifnonnull -> 164
    //   68: sipush #-7573
    //   71: sipush #23738
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: aload_3
    //   78: invokevirtual equals : (Ljava/lang/Object;)Z
    //   81: ifne -> 164
    //   84: sipush #-7551
    //   87: sipush #15066
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: astore_3
    //   94: aload_2
    //   95: ifnonnull -> 164
    //   98: aload #5
    //   100: invokevirtual Zd : ()Z
    //   103: ifeq -> 154
    //   106: aload_3
    //   107: ifnonnull -> 124
    //   110: sipush #-7320
    //   113: sipush #-12874
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: astore_3
    //   120: aload_2
    //   121: ifnonnull -> 164
    //   124: sipush #-7190
    //   127: sipush #-25170
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: aload_3
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifne -> 164
    //   140: sipush #-7551
    //   143: sipush #15066
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: astore_3
    //   150: aload_2
    //   151: ifnonnull -> 164
    //   154: sipush #-7551
    //   157: sipush #15066
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: astore_3
    //   164: iinc #4, 1
    //   167: aload_2
    //   168: ifnonnull -> 26
    //   171: aload_3
    //   172: areturn
  }
  
  public static List<JsonSchemaParserExtension> getJsonSchemaParserExtensions() {
    ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
    List<JsonSchemaParserExtension> list = getJsonSchemaParserExtensions(classLoader1);
    ClassLoader classLoader2 = JsonSchemaParserExtension.class.getClassLoader();
    if (classLoader2 != classLoader1)
      list.addAll(getJsonSchemaParserExtensions(classLoader2)); 
    return list;
  }
  
  protected static List<JsonSchemaParserExtension> getJsonSchemaParserExtensions(ClassLoader paramClassLoader) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (jsonSchemaParserExtensionMap.containsKey(paramClassLoader))
      return jsonSchemaParserExtensionMap.get(paramClassLoader); 
    ArrayList<JsonSchemaParserExtension> arrayList = new ArrayList();
    ServiceLoader<JsonSchemaParserExtension> serviceLoader = ServiceLoader.load(JsonSchemaParserExtension.class, paramClassLoader);
    for (JsonSchemaParserExtension jsonSchemaParserExtension : serviceLoader) {
      arrayList.add(jsonSchemaParserExtension);
      if (arrayOfZbqc == null)
        break; 
    } 
    if (paramClassLoader != null)
      jsonSchemaParserExtensionMap.put(paramClassLoader, arrayList); 
    return arrayList;
  }
  
  public Schema getJsonSchema(Zb paramZb, String paramString, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 15
    //   9: aconst_null
    //   10: areturn
    //   11: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   14: athrow
    //   15: aconst_null
    //   16: astore #5
    //   18: aconst_null
    //   19: astore #6
    //   21: aload_1
    //   22: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   25: getstatic com/fasterxml/Zg/Zfr.BOOLEAN : Lcom/fasterxml/Zg/Zfr;
    //   28: invokevirtual equals : (Ljava/lang/Object;)Z
    //   31: ifeq -> 46
    //   34: aload_1
    //   35: invokevirtual Zf : ()Z
    //   38: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   41: astore #6
    //   43: goto -> 138
    //   46: aload_1
    //   47: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   50: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 138
    //   59: aload_1
    //   60: invokevirtual Zz : ()Ljava/lang/String;
    //   63: astore #7
    //   65: sipush #-7474
    //   68: sipush #31878
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: aload #7
    //   76: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   79: ifne -> 106
    //   82: sipush #-7230
    //   85: sipush #-26886
    //   88: invokestatic a : (II)Ljava/lang/String;
    //   91: aload #7
    //   93: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   96: ifeq -> 119
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload #7
    //   108: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   111: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   114: astore #6
    //   116: goto -> 138
    //   119: aload_3
    //   120: aload_2
    //   121: ldc ''
    //   123: sipush #-7362
    //   126: sipush #25325
    //   129: invokestatic a : (II)Ljava/lang/String;
    //   132: aload_1
    //   133: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   136: aconst_null
    //   137: areturn
    //   138: aload #6
    //   140: ifnull -> 160
    //   143: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   146: dup
    //   147: invokespecial <init> : ()V
    //   150: aload #6
    //   152: invokevirtual booleanSchemaValue : (Ljava/lang/Boolean;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   155: areturn
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: aconst_null
    //   161: astore #7
    //   163: aload_1
    //   164: invokevirtual ZB : ()Z
    //   167: ifeq -> 179
    //   170: aload_1
    //   171: checkcast com/fasterxml/Zg/Zr
    //   174: astore #7
    //   176: goto -> 198
    //   179: aload_3
    //   180: aload_2
    //   181: ldc ''
    //   183: sipush #-7362
    //   186: sipush #25325
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: aload_1
    //   193: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   196: aconst_null
    //   197: areturn
    //   198: aload_0
    //   199: sipush #-7351
    //   202: sipush #-8854
    //   205: invokestatic a : (II)Ljava/lang/String;
    //   208: aload #7
    //   210: iconst_0
    //   211: aload_2
    //   212: aload_3
    //   213: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   216: astore #8
    //   218: aload_0
    //   219: sipush #-7525
    //   222: sipush #-24425
    //   225: invokestatic a : (II)Ljava/lang/String;
    //   228: aload #7
    //   230: iconst_0
    //   231: aload_2
    //   232: aload_3
    //   233: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   236: astore #9
    //   238: aload_0
    //   239: sipush #-7360
    //   242: sipush #15970
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: aload #7
    //   250: iconst_0
    //   251: aload_2
    //   252: aload_3
    //   253: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   256: astore #10
    //   258: aload_0
    //   259: sipush #-7644
    //   262: sipush #-26902
    //   265: invokestatic a : (II)Ljava/lang/String;
    //   268: aload #7
    //   270: iconst_0
    //   271: aload_2
    //   272: aload_3
    //   273: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   276: astore #11
    //   278: aload #9
    //   280: ifnonnull -> 307
    //   283: aload #10
    //   285: ifnonnull -> 307
    //   288: goto -> 295
    //   291: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   294: athrow
    //   295: aload #8
    //   297: ifnull -> 499
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: astore #12
    //   316: aload #9
    //   318: ifnull -> 377
    //   321: aload #9
    //   323: invokevirtual iterator : ()Ljava/util/Iterator;
    //   326: astore #13
    //   328: aload #13
    //   330: invokeinterface hasNext : ()Z
    //   335: ifeq -> 373
    //   338: aload #13
    //   340: invokeinterface next : ()Ljava/lang/Object;
    //   345: checkcast com/fasterxml/Zor/Zb
    //   348: astore #14
    //   350: aload_0
    //   351: aload #14
    //   353: aload_2
    //   354: aload_3
    //   355: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   358: astore #5
    //   360: aload #12
    //   362: aload #5
    //   364: invokevirtual addAllOfItem : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   367: pop
    //   368: aload #4
    //   370: ifnonnull -> 328
    //   373: aload #12
    //   375: astore #5
    //   377: aload #10
    //   379: ifnull -> 438
    //   382: aload #10
    //   384: invokevirtual iterator : ()Ljava/util/Iterator;
    //   387: astore #13
    //   389: aload #13
    //   391: invokeinterface hasNext : ()Z
    //   396: ifeq -> 434
    //   399: aload #13
    //   401: invokeinterface next : ()Ljava/lang/Object;
    //   406: checkcast com/fasterxml/Zor/Zb
    //   409: astore #14
    //   411: aload_0
    //   412: aload #14
    //   414: aload_2
    //   415: aload_3
    //   416: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   419: astore #5
    //   421: aload #12
    //   423: aload #5
    //   425: invokevirtual addAnyOfItem : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   428: pop
    //   429: aload #4
    //   431: ifnonnull -> 389
    //   434: aload #12
    //   436: astore #5
    //   438: aload #8
    //   440: ifnull -> 499
    //   443: aload #8
    //   445: invokevirtual iterator : ()Ljava/util/Iterator;
    //   448: astore #13
    //   450: aload #13
    //   452: invokeinterface hasNext : ()Z
    //   457: ifeq -> 495
    //   460: aload #13
    //   462: invokeinterface next : ()Ljava/lang/Object;
    //   467: checkcast com/fasterxml/Zor/Zb
    //   470: astore #14
    //   472: aload_0
    //   473: aload #14
    //   475: aload_2
    //   476: aload_3
    //   477: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   480: astore #5
    //   482: aload #12
    //   484: aload #5
    //   486: invokevirtual addOneOfItem : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   489: pop
    //   490: aload #4
    //   492: ifnonnull -> 450
    //   495: aload #12
    //   497: astore #5
    //   499: aload #11
    //   501: ifnull -> 530
    //   504: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   507: dup
    //   508: invokespecial <init> : ()V
    //   511: astore #12
    //   513: aload #12
    //   515: aload_0
    //   516: aload #11
    //   518: aload_2
    //   519: aload_3
    //   520: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   523: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   526: aload #12
    //   528: astore #5
    //   530: aload_0
    //   531: sipush #-7517
    //   534: sipush #4897
    //   537: invokestatic a : (II)Ljava/lang/String;
    //   540: aload #7
    //   542: iconst_0
    //   543: aload_2
    //   544: aload_3
    //   545: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   548: astore #12
    //   550: aload #12
    //   552: ifnull -> 586
    //   555: aload_0
    //   556: aload #12
    //   558: aload_2
    //   559: aload_3
    //   560: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   563: astore #13
    //   565: aload #5
    //   567: ifnonnull -> 579
    //   570: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   573: dup
    //   574: invokespecial <init> : ()V
    //   577: astore #5
    //   579: aload #5
    //   581: aload #13
    //   583: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   586: aload_0
    //   587: sipush #-7530
    //   590: sipush #-23128
    //   593: invokestatic a : (II)Ljava/lang/String;
    //   596: aload #7
    //   598: iconst_0
    //   599: aload_2
    //   600: aload_3
    //   601: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   604: astore #13
    //   606: aload #13
    //   608: ifnull -> 642
    //   611: aload_0
    //   612: aload #13
    //   614: aload_2
    //   615: aload_3
    //   616: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   619: astore #14
    //   621: aload #5
    //   623: ifnonnull -> 635
    //   626: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   629: dup
    //   630: invokespecial <init> : ()V
    //   633: astore #5
    //   635: aload #5
    //   637: aload #14
    //   639: invokevirtual setUnevaluatedProperties : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   642: aload #5
    //   644: ifnonnull -> 656
    //   647: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   650: dup
    //   651: invokespecial <init> : ()V
    //   654: astore #5
    //   656: aload #7
    //   658: sipush #-7225
    //   661: sipush #-25842
    //   664: invokestatic a : (II)Ljava/lang/String;
    //   667: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   670: astore #14
    //   672: aload #14
    //   674: ifnull -> 1033
    //   677: aload #14
    //   679: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   682: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   688: ifeq -> 1001
    //   691: goto -> 698
    //   694: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   697: athrow
    //   698: aload_2
    //   699: sipush #-7333
    //   702: sipush #12143
    //   705: invokestatic a : (II)Ljava/lang/String;
    //   708: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   711: ifeq -> 856
    //   714: goto -> 721
    //   717: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   720: athrow
    //   721: aload #14
    //   723: invokevirtual Zp : ()Ljava/lang/String;
    //   726: sipush #-7548
    //   729: sipush #15663
    //   732: invokestatic a : (II)Ljava/lang/String;
    //   735: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   738: astore #15
    //   740: aload #14
    //   742: invokevirtual Zp : ()Ljava/lang/String;
    //   745: sipush #-7548
    //   748: sipush #15663
    //   751: invokestatic a : (II)Ljava/lang/String;
    //   754: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   757: ifeq -> 841
    //   760: aload #15
    //   762: arraylength
    //   763: iconst_1
    //   764: if_icmple -> 841
    //   767: goto -> 774
    //   770: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   773: athrow
    //   774: aload #15
    //   776: iconst_1
    //   777: aaload
    //   778: ldc '/'
    //   780: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   783: astore #16
    //   785: aload #16
    //   787: iconst_1
    //   788: aload #16
    //   790: arraylength
    //   791: invokestatic copyOfRange : ([Ljava/lang/Object;II)[Ljava/lang/Object;
    //   794: checkcast [Ljava/lang/String;
    //   797: astore #17
    //   799: aload #17
    //   801: iconst_0
    //   802: aaload
    //   803: invokestatic valueOf : (Ljava/lang/String;)Lnet/portswigger/swagger/v2/util/ReferenceValidator;
    //   806: aload_0
    //   807: getfield components : Lnet/portswigger/swagger/v3/oas/models/Components;
    //   810: aload #17
    //   812: iconst_1
    //   813: aaload
    //   814: invokevirtual validateComponent : (Lnet/portswigger/swagger/v3/oas/models/Components;Ljava/lang/String;)Z
    //   817: istore #18
    //   819: iload #18
    //   821: ifne -> 841
    //   824: aload_3
    //   825: aload_2
    //   826: aload #14
    //   828: invokevirtual Zp : ()Ljava/lang/String;
    //   831: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   834: goto -> 841
    //   837: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   840: athrow
    //   841: goto -> 856
    //   844: astore #15
    //   846: aload_3
    //   847: aload_2
    //   848: aload #14
    //   850: invokevirtual Zp : ()Ljava/lang/String;
    //   853: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   856: aload_0
    //   857: aload #14
    //   859: invokevirtual Zz : ()Ljava/lang/String;
    //   862: invokevirtual mungedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   865: astore #15
    //   867: aload #15
    //   869: ifnull -> 891
    //   872: aload #5
    //   874: aload #15
    //   876: invokevirtual set$ref : (Ljava/lang/String;)V
    //   879: aload #4
    //   881: ifnonnull -> 908
    //   884: goto -> 891
    //   887: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   890: athrow
    //   891: aload #5
    //   893: aload #14
    //   895: invokevirtual Zp : ()Ljava/lang/String;
    //   898: invokevirtual set$ref : (Ljava/lang/String;)V
    //   901: goto -> 908
    //   904: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   907: athrow
    //   908: aload #14
    //   910: invokevirtual Zz : ()Ljava/lang/String;
    //   913: sipush #-7548
    //   916: sipush #15663
    //   919: invokestatic a : (II)Ljava/lang/String;
    //   922: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   925: ifeq -> 996
    //   928: aload #14
    //   930: invokevirtual Zz : ()Ljava/lang/String;
    //   933: sipush #-7524
    //   936: sipush #-19076
    //   939: invokestatic a : (II)Ljava/lang/String;
    //   942: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   945: ifne -> 996
    //   948: goto -> 955
    //   951: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   954: athrow
    //   955: aload_3
    //   956: aload_2
    //   957: aload #14
    //   959: invokevirtual Zz : ()Ljava/lang/String;
    //   962: sipush #-7462
    //   965: sipush #8250
    //   968: invokestatic a : (II)Ljava/lang/String;
    //   971: swap
    //   972: sipush #-7547
    //   975: sipush #25849
    //   978: invokestatic a : (II)Ljava/lang/String;
    //   981: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   986: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   989: goto -> 996
    //   992: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   995: athrow
    //   996: aload #4
    //   998: ifnonnull -> 1033
    //   1001: aload_3
    //   1002: aload_2
    //   1003: sipush #-7225
    //   1006: sipush #-25842
    //   1009: invokestatic a : (II)Ljava/lang/String;
    //   1012: sipush #-7551
    //   1015: sipush #15066
    //   1018: invokestatic a : (II)Ljava/lang/String;
    //   1021: aload #7
    //   1023: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1026: goto -> 1033
    //   1029: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1032: athrow
    //   1033: aload_0
    //   1034: aload #7
    //   1036: aload_2
    //   1037: aload_3
    //   1038: aload #5
    //   1040: invokevirtual getCommonSchemaFields : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   1043: aload #7
    //   1045: sipush #-7403
    //   1048: sipush #10714
    //   1051: invokestatic a : (II)Ljava/lang/String;
    //   1054: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1057: ifnull -> 1089
    //   1060: aload #5
    //   1062: aload_0
    //   1063: sipush #-7403
    //   1066: sipush #10714
    //   1069: invokestatic a : (II)Ljava/lang/String;
    //   1072: aload #7
    //   1074: aload_2
    //   1075: aload_3
    //   1076: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   1079: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   1082: goto -> 1089
    //   1085: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1088: athrow
    //   1089: aload_0
    //   1090: sipush #-7501
    //   1093: sipush #-19968
    //   1096: invokestatic a : (II)Ljava/lang/String;
    //   1099: aload #7
    //   1101: iconst_0
    //   1102: aload_2
    //   1103: aload_3
    //   1104: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   1107: astore #18
    //   1109: aload #18
    //   1111: ifnull -> 1128
    //   1114: aload #5
    //   1116: aload #18
    //   1118: invokevirtual setExclusiveMaximumValue : (Ljava/math/BigDecimal;)V
    //   1121: goto -> 1128
    //   1124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1127: athrow
    //   1128: aload_0
    //   1129: sipush #-7475
    //   1132: sipush #29641
    //   1135: invokestatic a : (II)Ljava/lang/String;
    //   1138: aload #7
    //   1140: iconst_0
    //   1141: aload_2
    //   1142: aload_3
    //   1143: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   1146: astore #18
    //   1148: aload #18
    //   1150: ifnull -> 1167
    //   1153: aload #5
    //   1155: aload #18
    //   1157: invokevirtual setExclusiveMinimumValue : (Ljava/math/BigDecimal;)V
    //   1160: goto -> 1167
    //   1163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1166: athrow
    //   1167: aload_0
    //   1168: sipush #-7622
    //   1171: sipush #-20565
    //   1174: invokestatic a : (II)Ljava/lang/String;
    //   1177: aload #7
    //   1179: iconst_0
    //   1180: aload_2
    //   1181: aload_3
    //   1182: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   1185: astore #17
    //   1187: aload #17
    //   1189: ifnull -> 1206
    //   1192: aload #5
    //   1194: aload #17
    //   1196: invokevirtual setMinContains : (Ljava/lang/Integer;)V
    //   1199: goto -> 1206
    //   1202: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1205: athrow
    //   1206: aload_0
    //   1207: sipush #-7656
    //   1210: sipush #-23157
    //   1213: invokestatic a : (II)Ljava/lang/String;
    //   1216: aload #7
    //   1218: iconst_0
    //   1219: aload_2
    //   1220: aload_3
    //   1221: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Integer;
    //   1224: astore #17
    //   1226: aload #17
    //   1228: ifnull -> 1245
    //   1231: aload #5
    //   1233: aload #17
    //   1235: invokevirtual setMaxContains : (Ljava/lang/Integer;)V
    //   1238: goto -> 1245
    //   1241: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1244: athrow
    //   1245: aload_0
    //   1246: sipush #-7432
    //   1249: sipush #-4320
    //   1252: invokestatic a : (II)Ljava/lang/String;
    //   1255: aload #7
    //   1257: iconst_0
    //   1258: aload_2
    //   1259: aload_3
    //   1260: aconst_null
    //   1261: iconst_1
    //   1262: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/util/Set;Z)Ljava/lang/String;
    //   1265: astore #19
    //   1267: aload_0
    //   1268: sipush #-7483
    //   1271: sipush #19223
    //   1274: invokestatic a : (II)Ljava/lang/String;
    //   1277: aload #7
    //   1279: iconst_0
    //   1280: aload_2
    //   1281: aload_3
    //   1282: iconst_1
    //   1283: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Z)Lcom/fasterxml/Zg/Zh;
    //   1286: astore #20
    //   1288: aload_3
    //   1289: invokevirtual isAllowEmptyStrings : ()Z
    //   1292: ifeq -> 1307
    //   1295: aload #19
    //   1297: ifnonnull -> 1336
    //   1300: goto -> 1307
    //   1303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1306: athrow
    //   1307: aload_3
    //   1308: invokevirtual isAllowEmptyStrings : ()Z
    //   1311: ifne -> 1356
    //   1314: goto -> 1321
    //   1317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1320: athrow
    //   1321: aload #19
    //   1323: invokestatic isBlank : (Ljava/lang/String;)Z
    //   1326: ifne -> 1356
    //   1329: goto -> 1336
    //   1332: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1335: athrow
    //   1336: aload #5
    //   1338: aload #19
    //   1340: invokevirtual addType : (Ljava/lang/String;)Z
    //   1343: pop
    //   1344: aload #4
    //   1346: ifnonnull -> 1607
    //   1349: goto -> 1356
    //   1352: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1355: athrow
    //   1356: aload #20
    //   1358: ifnull -> 1552
    //   1361: goto -> 1368
    //   1364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1367: athrow
    //   1368: aload #20
    //   1370: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1373: astore #21
    //   1375: aload #21
    //   1377: invokeinterface hasNext : ()Z
    //   1382: ifeq -> 1547
    //   1385: aload #21
    //   1387: invokeinterface next : ()Ljava/lang/Object;
    //   1392: checkcast com/fasterxml/Zor/Zb
    //   1395: astore #22
    //   1397: aload #22
    //   1399: invokevirtual ZA : ()Z
    //   1402: ifeq -> 1510
    //   1405: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.JSON_SCHEMA_2020_12_TYPES : Ljava/util/Set;
    //   1408: aload #22
    //   1410: invokevirtual Zp : ()Ljava/lang/String;
    //   1413: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1418: ifne -> 1460
    //   1421: goto -> 1428
    //   1424: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1427: athrow
    //   1428: aload_3
    //   1429: aload_2
    //   1430: aload #22
    //   1432: invokevirtual Zp : ()Ljava/lang/String;
    //   1435: sipush #-7416
    //   1438: sipush #1571
    //   1441: invokestatic a : (II)Ljava/lang/String;
    //   1444: swap
    //   1445: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1450: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   1453: goto -> 1460
    //   1456: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1459: athrow
    //   1460: aload #5
    //   1462: aload #22
    //   1464: invokevirtual Zp : ()Ljava/lang/String;
    //   1467: invokevirtual addType : (Ljava/lang/String;)Z
    //   1470: ifne -> 1542
    //   1473: aload_3
    //   1474: aload_2
    //   1475: aload #22
    //   1477: invokevirtual Zp : ()Ljava/lang/String;
    //   1480: sipush #-7465
    //   1483: sipush #25945
    //   1486: invokestatic a : (II)Ljava/lang/String;
    //   1489: swap
    //   1490: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1495: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   1498: aload #4
    //   1500: ifnonnull -> 1542
    //   1503: goto -> 1510
    //   1506: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1509: athrow
    //   1510: aload_3
    //   1511: aload_2
    //   1512: sipush #-7483
    //   1515: sipush #19223
    //   1518: invokestatic a : (II)Ljava/lang/String;
    //   1521: sipush #-7181
    //   1524: sipush #-17116
    //   1527: invokestatic a : (II)Ljava/lang/String;
    //   1530: aload #22
    //   1532: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1535: goto -> 1542
    //   1538: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1541: athrow
    //   1542: aload #4
    //   1544: ifnonnull -> 1375
    //   1547: aload #4
    //   1549: ifnonnull -> 1607
    //   1552: aload #7
    //   1554: sipush #-7602
    //   1557: sipush #-21117
    //   1560: invokestatic a : (II)Ljava/lang/String;
    //   1563: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1566: astore #21
    //   1568: aload #21
    //   1570: ifnull -> 1607
    //   1573: aload #21
    //   1575: invokevirtual ZJ : ()Z
    //   1578: ifeq -> 1607
    //   1581: goto -> 1588
    //   1584: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1587: athrow
    //   1588: aload_0
    //   1589: aload #21
    //   1591: checkcast com/fasterxml/Zg/Zh
    //   1594: invokevirtual inferTypeFromArray : (Lcom/fasterxml/Zg/Zh;)Ljava/lang/String;
    //   1597: astore #22
    //   1599: aload #5
    //   1601: aload #22
    //   1603: invokevirtual addType : (Ljava/lang/String;)Z
    //   1606: pop
    //   1607: aload_0
    //   1608: sipush #-7602
    //   1611: sipush #-21117
    //   1614: invokestatic a : (II)Ljava/lang/String;
    //   1617: aload #7
    //   1619: iconst_0
    //   1620: aload_2
    //   1621: aload_3
    //   1622: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   1625: astore #21
    //   1627: aload #21
    //   1629: ifnull -> 1896
    //   1632: aload #21
    //   1634: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1637: astore #22
    //   1639: aload #22
    //   1641: invokeinterface hasNext : ()Z
    //   1646: ifeq -> 1896
    //   1649: aload #22
    //   1651: invokeinterface next : ()Ljava/lang/Object;
    //   1656: checkcast com/fasterxml/Zor/Zb
    //   1659: astore #23
    //   1661: aload #23
    //   1663: invokevirtual Zd : ()Z
    //   1666: ifeq -> 1691
    //   1669: aload #5
    //   1671: aload #23
    //   1673: invokevirtual Zu : ()Ljava/lang/Number;
    //   1676: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1679: aload #4
    //   1681: ifnonnull -> 1891
    //   1684: goto -> 1691
    //   1687: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1690: athrow
    //   1691: aload #23
    //   1693: invokevirtual ZL : ()Z
    //   1696: ifeq -> 1731
    //   1699: goto -> 1706
    //   1702: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1705: athrow
    //   1706: aload #5
    //   1708: aload #23
    //   1710: invokevirtual ZY : ()Z
    //   1713: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1716: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1719: aload #4
    //   1721: ifnonnull -> 1891
    //   1724: goto -> 1731
    //   1727: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1730: athrow
    //   1731: aload #23
    //   1733: invokevirtual ZA : ()Z
    //   1736: ifeq -> 1809
    //   1739: goto -> 1746
    //   1742: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1745: athrow
    //   1746: aload #5
    //   1748: aload_0
    //   1749: aload #5
    //   1751: aload #23
    //   1753: aconst_null
    //   1754: invokevirtual ZR : (Ljava/lang/String;)Ljava/lang/String;
    //   1757: invokevirtual getDecodedObject31 : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Ljava/lang/Object;
    //   1760: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1763: goto -> 1891
    //   1766: astore #24
    //   1768: aload_3
    //   1769: aload_2
    //   1770: sipush #-7539
    //   1773: sipush #-28020
    //   1776: invokestatic a : (II)Ljava/lang/String;
    //   1779: iconst_1
    //   1780: anewarray java/lang/Object
    //   1783: dup
    //   1784: iconst_0
    //   1785: aload #24
    //   1787: invokevirtual getMessage : ()Ljava/lang/String;
    //   1790: aastore
    //   1791: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1794: aload #5
    //   1796: invokevirtual getFormat : ()Ljava/lang/String;
    //   1799: aload #23
    //   1801: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1804: aload #4
    //   1806: ifnonnull -> 1891
    //   1809: aload #23
    //   1811: invokevirtual Zm : ()Z
    //   1814: ifeq -> 1859
    //   1817: goto -> 1824
    //   1820: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1823: athrow
    //   1824: aload #5
    //   1826: aload #23
    //   1828: invokevirtual Zt : ()Z
    //   1831: ifeq -> 1849
    //   1834: goto -> 1841
    //   1837: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1840: athrow
    //   1841: aconst_null
    //   1842: goto -> 1851
    //   1845: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1848: athrow
    //   1849: aload #23
    //   1851: invokevirtual addEnumItemObject : (Ljava/lang/Object;)V
    //   1854: aload #4
    //   1856: ifnonnull -> 1891
    //   1859: aload_3
    //   1860: aload_2
    //   1861: sipush #-7602
    //   1864: sipush #-21117
    //   1867: invokestatic a : (II)Ljava/lang/String;
    //   1870: sipush #-7181
    //   1873: sipush #-17116
    //   1876: invokestatic a : (II)Ljava/lang/String;
    //   1879: aload #23
    //   1881: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1884: goto -> 1891
    //   1887: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1890: athrow
    //   1891: aload #4
    //   1893: ifnonnull -> 1639
    //   1896: aload_0
    //   1897: sipush #-7439
    //   1900: sipush #-11641
    //   1903: invokestatic a : (II)Ljava/lang/String;
    //   1906: aload #7
    //   1908: iconst_0
    //   1909: aload_2
    //   1910: aload_3
    //   1911: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   1914: astore #22
    //   1916: aload #22
    //   1918: ifnull -> 1950
    //   1921: aload_0
    //   1922: aload #22
    //   1924: aload_2
    //   1925: aload_3
    //   1926: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1929: astore #23
    //   1931: aload #23
    //   1933: ifnull -> 1950
    //   1936: aload #5
    //   1938: aload #23
    //   1940: invokevirtual setNot : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   1943: goto -> 1950
    //   1946: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1949: athrow
    //   1950: aload_0
    //   1951: sipush #-7469
    //   1954: sipush #23245
    //   1957: invokestatic a : (II)Ljava/lang/String;
    //   1960: aload #7
    //   1962: iconst_0
    //   1963: aload_2
    //   1964: aload_3
    //   1965: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   1968: astore #23
    //   1970: aload #23
    //   1972: ifnull -> 2004
    //   1975: aload_0
    //   1976: aload #23
    //   1978: aload_2
    //   1979: aload_3
    //   1980: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1983: astore #24
    //   1985: aload #24
    //   1987: ifnull -> 2004
    //   1990: aload #5
    //   1992: aload #24
    //   1994: invokevirtual setContentSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   1997: goto -> 2004
    //   2000: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2003: athrow
    //   2004: aload_0
    //   2005: sipush #-7460
    //   2008: sipush #3119
    //   2011: invokestatic a : (II)Ljava/lang/String;
    //   2014: aload #7
    //   2016: iconst_0
    //   2017: aload_2
    //   2018: aload_3
    //   2019: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   2022: astore #24
    //   2024: aload #24
    //   2026: ifnull -> 2058
    //   2029: aload_0
    //   2030: aload #24
    //   2032: aload_2
    //   2033: aload_3
    //   2034: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2037: astore #25
    //   2039: aload #25
    //   2041: ifnull -> 2058
    //   2044: aload #5
    //   2046: aload #25
    //   2048: invokevirtual setPropertyNames : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2051: goto -> 2058
    //   2054: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2057: athrow
    //   2058: aload_0
    //   2059: sipush #-7509
    //   2062: sipush #-19993
    //   2065: invokestatic a : (II)Ljava/lang/String;
    //   2068: aload #7
    //   2070: iconst_0
    //   2071: aload_2
    //   2072: aload_3
    //   2073: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   2076: astore #25
    //   2078: aload #25
    //   2080: ifnull -> 2112
    //   2083: aload_0
    //   2084: aload #25
    //   2086: aload_2
    //   2087: aload_3
    //   2088: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2091: astore #26
    //   2093: aload #26
    //   2095: ifnull -> 2112
    //   2098: aload #5
    //   2100: aload #26
    //   2102: invokevirtual setIf : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2105: goto -> 2112
    //   2108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2111: athrow
    //   2112: aload_0
    //   2113: sipush #-7212
    //   2116: sipush #25228
    //   2119: invokestatic a : (II)Ljava/lang/String;
    //   2122: aload #7
    //   2124: iconst_0
    //   2125: aload_2
    //   2126: aload_3
    //   2127: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   2130: astore #26
    //   2132: aload #26
    //   2134: ifnull -> 2166
    //   2137: aload_0
    //   2138: aload #26
    //   2140: aload_2
    //   2141: aload_3
    //   2142: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2145: astore #27
    //   2147: aload #27
    //   2149: ifnull -> 2166
    //   2152: aload #5
    //   2154: aload #27
    //   2156: invokevirtual setThen : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2159: goto -> 2166
    //   2162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2165: athrow
    //   2166: aload_0
    //   2167: sipush #-7357
    //   2170: sipush #-19994
    //   2173: invokestatic a : (II)Ljava/lang/String;
    //   2176: aload #7
    //   2178: iconst_0
    //   2179: aload_2
    //   2180: aload_3
    //   2181: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   2184: astore #27
    //   2186: aload #27
    //   2188: ifnull -> 2220
    //   2191: aload_0
    //   2192: aload #27
    //   2194: aload_2
    //   2195: aload_3
    //   2196: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2199: astore #28
    //   2201: aload #28
    //   2203: ifnull -> 2220
    //   2206: aload #5
    //   2208: aload #28
    //   2210: invokevirtual setElse : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2213: goto -> 2220
    //   2216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2219: athrow
    //   2220: aload_0
    //   2221: sipush #-7554
    //   2224: sipush #16914
    //   2227: invokestatic a : (II)Ljava/lang/String;
    //   2230: aload #7
    //   2232: iconst_0
    //   2233: aload_2
    //   2234: aload_3
    //   2235: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   2238: astore #28
    //   2240: aload #28
    //   2242: ifnull -> 2274
    //   2245: aload_0
    //   2246: aload #28
    //   2248: aload_2
    //   2249: aload_3
    //   2250: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2253: astore #29
    //   2255: aload #29
    //   2257: ifnull -> 2274
    //   2260: aload #5
    //   2262: aload #29
    //   2264: invokevirtual setUnevaluatedItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2267: goto -> 2274
    //   2270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2273: athrow
    //   2274: new java/util/LinkedHashMap
    //   2277: dup
    //   2278: invokespecial <init> : ()V
    //   2281: astore #29
    //   2283: aload_0
    //   2284: sipush #-7668
    //   2287: sipush #13637
    //   2290: invokestatic a : (II)Ljava/lang/String;
    //   2293: aload #7
    //   2295: iconst_0
    //   2296: aload_2
    //   2297: aload_3
    //   2298: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   2301: astore #30
    //   2303: new java/util/ArrayList
    //   2306: dup
    //   2307: invokespecial <init> : ()V
    //   2310: astore #31
    //   2312: aload_0
    //   2313: aload #30
    //   2315: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   2318: astore #32
    //   2320: aload #32
    //   2322: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2327: astore #33
    //   2329: aload #33
    //   2331: invokeinterface hasNext : ()Z
    //   2336: ifeq -> 2520
    //   2339: aload #33
    //   2341: invokeinterface next : ()Ljava/lang/Object;
    //   2346: checkcast java/lang/String
    //   2349: astore #34
    //   2351: aload #30
    //   2353: aload #34
    //   2355: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   2358: astore #35
    //   2360: aload #35
    //   2362: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   2365: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   2368: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2371: ifne -> 2411
    //   2374: aload_3
    //   2375: aload_2
    //   2376: sipush #-7552
    //   2379: sipush #22816
    //   2382: invokestatic a : (II)Ljava/lang/String;
    //   2385: sipush #-7362
    //   2388: sipush #25325
    //   2391: invokestatic a : (II)Ljava/lang/String;
    //   2394: aload #35
    //   2396: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   2399: aload #4
    //   2401: ifnonnull -> 2515
    //   2404: goto -> 2411
    //   2407: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2410: athrow
    //   2411: aload #30
    //   2413: ifnull -> 2515
    //   2416: goto -> 2423
    //   2419: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2422: athrow
    //   2423: aload #35
    //   2425: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2428: astore #36
    //   2430: aload #36
    //   2432: invokeinterface hasNext : ()Z
    //   2437: ifeq -> 2491
    //   2440: aload #36
    //   2442: invokeinterface next : ()Ljava/lang/Object;
    //   2447: checkcast com/fasterxml/Zor/Zb
    //   2450: astore #37
    //   2452: aload #37
    //   2454: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   2457: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   2460: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2463: ifeq -> 2486
    //   2466: aload #31
    //   2468: aload #37
    //   2470: invokevirtual Zz : ()Ljava/lang/String;
    //   2473: invokeinterface add : (Ljava/lang/Object;)Z
    //   2478: pop
    //   2479: goto -> 2486
    //   2482: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2485: athrow
    //   2486: aload #4
    //   2488: ifnonnull -> 2430
    //   2491: aload #31
    //   2493: ifnull -> 2515
    //   2496: aload #29
    //   2498: aload #34
    //   2500: aload #31
    //   2502: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2507: pop
    //   2508: goto -> 2515
    //   2511: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2514: athrow
    //   2515: aload #4
    //   2517: ifnonnull -> 2329
    //   2520: aload #30
    //   2522: ifnull -> 2539
    //   2525: aload #5
    //   2527: aload #29
    //   2529: invokevirtual setDependentRequired : (Ljava/util/Map;)V
    //   2532: goto -> 2539
    //   2535: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2538: athrow
    //   2539: new java/util/LinkedHashMap
    //   2542: dup
    //   2543: invokespecial <init> : ()V
    //   2546: astore #33
    //   2548: aload_0
    //   2549: sipush #-7455
    //   2552: sipush #25008
    //   2555: invokestatic a : (II)Ljava/lang/String;
    //   2558: aload #7
    //   2560: iconst_0
    //   2561: aload_2
    //   2562: aload_3
    //   2563: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   2566: astore #34
    //   2568: aload #34
    //   2570: ifnull -> 2682
    //   2573: aconst_null
    //   2574: astore #35
    //   2576: aload_0
    //   2577: aload #34
    //   2579: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   2582: astore #36
    //   2584: aload #36
    //   2586: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2591: astore #37
    //   2593: aload #37
    //   2595: invokeinterface hasNext : ()Z
    //   2600: ifeq -> 2663
    //   2603: aload #37
    //   2605: invokeinterface next : ()Ljava/lang/Object;
    //   2610: checkcast java/lang/String
    //   2613: astore #38
    //   2615: aload #34
    //   2617: aload #38
    //   2619: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   2622: astore #39
    //   2624: aload_0
    //   2625: aload #39
    //   2627: aload_2
    //   2628: aload_3
    //   2629: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2632: astore #35
    //   2634: aload #35
    //   2636: ifnull -> 2658
    //   2639: aload #33
    //   2641: aload #38
    //   2643: aload #35
    //   2645: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2650: pop
    //   2651: goto -> 2658
    //   2654: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2657: athrow
    //   2658: aload #4
    //   2660: ifnonnull -> 2593
    //   2663: aload #34
    //   2665: ifnull -> 2682
    //   2668: aload #5
    //   2670: aload #33
    //   2672: invokevirtual setDependentSchemas : (Ljava/util/Map;)V
    //   2675: goto -> 2682
    //   2678: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2681: athrow
    //   2682: aload_0
    //   2683: sipush #-7348
    //   2686: sipush #-30539
    //   2689: invokestatic a : (II)Ljava/lang/String;
    //   2692: aload #7
    //   2694: iconst_0
    //   2695: aload_2
    //   2696: aload_3
    //   2697: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   2700: astore #35
    //   2702: aload #35
    //   2704: ifnull -> 2815
    //   2707: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   2710: dup
    //   2711: invokespecial <init> : ()V
    //   2714: astore #36
    //   2716: new java/util/ArrayList
    //   2719: dup
    //   2720: invokespecial <init> : ()V
    //   2723: astore #37
    //   2725: aload #35
    //   2727: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2730: astore #38
    //   2732: aload #38
    //   2734: invokeinterface hasNext : ()Z
    //   2739: ifeq -> 2791
    //   2742: aload #38
    //   2744: invokeinterface next : ()Ljava/lang/Object;
    //   2749: checkcast com/fasterxml/Zor/Zb
    //   2752: astore #39
    //   2754: aload_0
    //   2755: aload #39
    //   2757: aload_2
    //   2758: aload_3
    //   2759: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2762: astore #36
    //   2764: aload #36
    //   2766: ifnull -> 2786
    //   2769: aload #37
    //   2771: aload #36
    //   2773: invokeinterface add : (Ljava/lang/Object;)Z
    //   2778: pop
    //   2779: goto -> 2786
    //   2782: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2785: athrow
    //   2786: aload #4
    //   2788: ifnonnull -> 2732
    //   2791: aload #37
    //   2793: invokeinterface size : ()I
    //   2798: ifle -> 2815
    //   2801: aload #5
    //   2803: aload #37
    //   2805: invokevirtual setPrefixItems : (Ljava/util/List;)V
    //   2808: goto -> 2815
    //   2811: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2814: athrow
    //   2815: aload_0
    //   2816: sipush #-7352
    //   2819: sipush #-14125
    //   2822: invokestatic a : (II)Ljava/lang/String;
    //   2825: aload #7
    //   2827: iconst_0
    //   2828: aload_2
    //   2829: aload_3
    //   2830: invokevirtual getObjectOrBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zor/Zb;
    //   2833: astore #36
    //   2835: aload #36
    //   2837: ifnull -> 2869
    //   2840: aload_0
    //   2841: aload #36
    //   2843: aload_2
    //   2844: aload_3
    //   2845: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2848: astore #37
    //   2850: aload #37
    //   2852: ifnull -> 2869
    //   2855: aload #5
    //   2857: aload #37
    //   2859: invokevirtual setContains : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   2862: goto -> 2869
    //   2865: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2868: athrow
    //   2869: new java/util/LinkedHashMap
    //   2872: dup
    //   2873: invokespecial <init> : ()V
    //   2876: astore #37
    //   2878: aload_0
    //   2879: sipush #-7201
    //   2882: sipush #11589
    //   2885: invokestatic a : (II)Ljava/lang/String;
    //   2888: aload #7
    //   2890: iconst_0
    //   2891: aload_2
    //   2892: aload_3
    //   2893: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   2896: astore #38
    //   2898: aconst_null
    //   2899: astore #39
    //   2901: aload_0
    //   2902: aload #38
    //   2904: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   2907: astore #40
    //   2909: aload #40
    //   2911: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2916: astore #41
    //   2918: aload #41
    //   2920: invokeinterface hasNext : ()Z
    //   2925: ifeq -> 2993
    //   2928: aload #41
    //   2930: invokeinterface next : ()Ljava/lang/Object;
    //   2935: checkcast java/lang/String
    //   2938: astore #42
    //   2940: aload #38
    //   2942: aload #42
    //   2944: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   2947: astore #43
    //   2949: aload #38
    //   2951: ifnull -> 2988
    //   2954: aload_0
    //   2955: aload #43
    //   2957: aload_2
    //   2958: aload_3
    //   2959: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   2962: astore #39
    //   2964: aload #39
    //   2966: ifnull -> 2988
    //   2969: aload #37
    //   2971: aload #42
    //   2973: aload #39
    //   2975: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2980: pop
    //   2981: goto -> 2988
    //   2984: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   2987: athrow
    //   2988: aload #4
    //   2990: ifnonnull -> 2918
    //   2993: aload #38
    //   2995: ifnull -> 3012
    //   2998: aload #5
    //   3000: aload #37
    //   3002: invokevirtual setProperties : (Ljava/util/Map;)V
    //   3005: goto -> 3012
    //   3008: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3011: athrow
    //   3012: new java/util/LinkedHashMap
    //   3015: dup
    //   3016: invokespecial <init> : ()V
    //   3019: astore #41
    //   3021: aload_0
    //   3022: sipush #-7189
    //   3025: sipush #13407
    //   3028: invokestatic a : (II)Ljava/lang/String;
    //   3031: aload #7
    //   3033: iconst_0
    //   3034: aload_2
    //   3035: aload_3
    //   3036: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   3039: astore #42
    //   3041: aconst_null
    //   3042: astore #43
    //   3044: aload_0
    //   3045: aload #42
    //   3047: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   3050: astore #44
    //   3052: aload #44
    //   3054: invokeinterface iterator : ()Ljava/util/Iterator;
    //   3059: astore #45
    //   3061: aload #45
    //   3063: invokeinterface hasNext : ()Z
    //   3068: ifeq -> 3136
    //   3071: aload #45
    //   3073: invokeinterface next : ()Ljava/lang/Object;
    //   3078: checkcast java/lang/String
    //   3081: astore #46
    //   3083: aload #42
    //   3085: aload #46
    //   3087: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   3090: astore #47
    //   3092: aload #42
    //   3094: ifnull -> 3131
    //   3097: aload_0
    //   3098: aload #47
    //   3100: aload_2
    //   3101: aload_3
    //   3102: invokevirtual getJsonSchema : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   3105: astore #43
    //   3107: aload #43
    //   3109: ifnull -> 3131
    //   3112: aload #41
    //   3114: aload #46
    //   3116: aload #43
    //   3118: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3123: pop
    //   3124: goto -> 3131
    //   3127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3130: athrow
    //   3131: aload #4
    //   3133: ifnonnull -> 3061
    //   3136: aload #42
    //   3138: ifnull -> 3155
    //   3141: aload #5
    //   3143: aload #41
    //   3145: invokevirtual setPatternProperties : (Ljava/util/Map;)V
    //   3148: goto -> 3155
    //   3151: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3154: athrow
    //   3155: aload_0
    //   3156: sipush #-7334
    //   3159: sipush #14427
    //   3162: invokestatic a : (II)Ljava/lang/String;
    //   3165: aload #7
    //   3167: aload_2
    //   3168: aload_3
    //   3169: invokevirtual getAnyType : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/Object;
    //   3172: astore #45
    //   3174: aload #45
    //   3176: ifnull -> 3193
    //   3179: aload #5
    //   3181: aload #45
    //   3183: invokevirtual setConst : (Ljava/lang/Object;)V
    //   3186: goto -> 3193
    //   3189: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3192: athrow
    //   3193: aload_0
    //   3194: sipush #-7595
    //   3197: sipush #19561
    //   3200: invokestatic a : (II)Ljava/lang/String;
    //   3203: aload #7
    //   3205: iconst_0
    //   3206: aload_2
    //   3207: aload_3
    //   3208: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3211: astore #15
    //   3213: aload #15
    //   3215: ifnull -> 3232
    //   3218: aload #5
    //   3220: aload #15
    //   3222: invokevirtual setContentEncoding : (Ljava/lang/String;)V
    //   3225: goto -> 3232
    //   3228: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3231: athrow
    //   3232: aload_0
    //   3233: sipush #-7572
    //   3236: sipush #-32518
    //   3239: invokestatic a : (II)Ljava/lang/String;
    //   3242: aload #7
    //   3244: iconst_0
    //   3245: aload_2
    //   3246: aload_3
    //   3247: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3250: astore #15
    //   3252: aload #15
    //   3254: ifnull -> 3271
    //   3257: aload #5
    //   3259: aload #15
    //   3261: invokevirtual setContentMediaType : (Ljava/lang/String;)V
    //   3264: goto -> 3271
    //   3267: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3270: athrow
    //   3271: aload_0
    //   3272: sipush #-7372
    //   3275: sipush #30748
    //   3278: invokestatic a : (II)Ljava/lang/String;
    //   3281: aload #7
    //   3283: iconst_0
    //   3284: aload_2
    //   3285: aload_3
    //   3286: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   3289: astore #46
    //   3291: new java/util/ArrayList
    //   3294: dup
    //   3295: invokespecial <init> : ()V
    //   3298: astore #47
    //   3300: aload #46
    //   3302: ifnull -> 3349
    //   3305: aload #46
    //   3307: invokevirtual iterator : ()Ljava/util/Iterator;
    //   3310: astore #48
    //   3312: aload #48
    //   3314: invokeinterface hasNext : ()Z
    //   3319: ifeq -> 3349
    //   3322: aload #48
    //   3324: invokeinterface next : ()Ljava/lang/Object;
    //   3329: checkcast com/fasterxml/Zor/Zb
    //   3332: astore #49
    //   3334: aload #47
    //   3336: aload #49
    //   3338: invokeinterface add : (Ljava/lang/Object;)Z
    //   3343: pop
    //   3344: aload #4
    //   3346: ifnonnull -> 3312
    //   3349: aload #47
    //   3351: invokeinterface size : ()I
    //   3356: ifle -> 3373
    //   3359: aload #5
    //   3361: aload #47
    //   3363: invokevirtual setExamples : (Ljava/util/List;)V
    //   3366: goto -> 3373
    //   3369: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3372: athrow
    //   3373: aload_0
    //   3374: sipush #-7605
    //   3377: sipush #-9964
    //   3380: invokestatic a : (II)Ljava/lang/String;
    //   3383: aload #7
    //   3385: iconst_0
    //   3386: aload_2
    //   3387: aload_3
    //   3388: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3391: astore #15
    //   3393: aload #15
    //   3395: ifnull -> 3412
    //   3398: aload #5
    //   3400: aload #15
    //   3402: invokevirtual set$anchor : (Ljava/lang/String;)V
    //   3405: goto -> 3412
    //   3408: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3411: athrow
    //   3412: aload_0
    //   3413: sipush #-7601
    //   3416: sipush #-18033
    //   3419: invokestatic a : (II)Ljava/lang/String;
    //   3422: aload #7
    //   3424: iconst_0
    //   3425: aload_2
    //   3426: aload_3
    //   3427: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3430: astore #15
    //   3432: aload #15
    //   3434: ifnull -> 3451
    //   3437: aload #5
    //   3439: aload #15
    //   3441: invokevirtual set$vocabulary : (Ljava/lang/String;)V
    //   3444: goto -> 3451
    //   3447: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3450: athrow
    //   3451: aload_0
    //   3452: sipush #-7353
    //   3455: sipush #-14032
    //   3458: invokestatic a : (II)Ljava/lang/String;
    //   3461: aload #7
    //   3463: iconst_0
    //   3464: aload_2
    //   3465: aload_3
    //   3466: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3469: astore #15
    //   3471: aload #15
    //   3473: ifnull -> 3490
    //   3476: aload #5
    //   3478: aload #15
    //   3480: invokevirtual set$dynamicAnchor : (Ljava/lang/String;)V
    //   3483: goto -> 3490
    //   3486: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3489: athrow
    //   3490: aload_0
    //   3491: sipush #-7314
    //   3494: sipush #-20976
    //   3497: invokestatic a : (II)Ljava/lang/String;
    //   3500: aload #7
    //   3502: iconst_0
    //   3503: aload_2
    //   3504: aload_3
    //   3505: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3508: astore #15
    //   3510: aload #15
    //   3512: ifnull -> 3529
    //   3515: aload #5
    //   3517: aload #15
    //   3519: invokevirtual set$id : (Ljava/lang/String;)V
    //   3522: goto -> 3529
    //   3525: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3528: athrow
    //   3529: aload_0
    //   3530: sipush #-7633
    //   3533: sipush #-32649
    //   3536: invokestatic a : (II)Ljava/lang/String;
    //   3539: aload #7
    //   3541: iconst_0
    //   3542: aload_2
    //   3543: aload_3
    //   3544: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3547: astore #15
    //   3549: aload #15
    //   3551: ifnull -> 3568
    //   3554: aload #5
    //   3556: aload #15
    //   3558: invokevirtual set$schema : (Ljava/lang/String;)V
    //   3561: goto -> 3568
    //   3564: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3567: athrow
    //   3568: aload_0
    //   3569: sipush #-7652
    //   3572: sipush #18776
    //   3575: invokestatic a : (II)Ljava/lang/String;
    //   3578: aload #7
    //   3580: iconst_0
    //   3581: aload_2
    //   3582: aload_3
    //   3583: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)Ljava/lang/String;
    //   3586: astore #15
    //   3588: aload #15
    //   3590: ifnull -> 3607
    //   3593: aload #5
    //   3595: aload #15
    //   3597: invokevirtual set$comment : (Ljava/lang/String;)V
    //   3600: goto -> 3607
    //   3603: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3606: athrow
    //   3607: aload_0
    //   3608: aload #7
    //   3610: invokevirtual getExtensions : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Map;
    //   3613: astore #48
    //   3615: aload #48
    //   3617: ifnull -> 3651
    //   3620: aload #48
    //   3622: invokeinterface size : ()I
    //   3627: ifle -> 3651
    //   3630: goto -> 3637
    //   3633: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3636: athrow
    //   3637: aload #5
    //   3639: aload #48
    //   3641: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   3644: goto -> 3651
    //   3647: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3650: athrow
    //   3651: aload_0
    //   3652: aload #7
    //   3654: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   3657: astore #49
    //   3659: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   3662: sipush #-7188
    //   3665: sipush #9260
    //   3668: invokestatic a : (II)Ljava/lang/String;
    //   3671: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3676: checkcast java/util/Map
    //   3679: astore #50
    //   3681: aload #49
    //   3683: invokeinterface iterator : ()Ljava/util/Iterator;
    //   3688: astore #51
    //   3690: aload #51
    //   3692: invokeinterface hasNext : ()Z
    //   3697: ifeq -> 3819
    //   3700: aload #51
    //   3702: invokeinterface next : ()Ljava/lang/Object;
    //   3707: checkcast java/lang/String
    //   3710: astore #52
    //   3712: aload_0
    //   3713: aload #50
    //   3715: aload #52
    //   3717: aload_2
    //   3718: aload_3
    //   3719: invokevirtual validateReservedKeywords : (Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;)V
    //   3722: aload #50
    //   3724: sipush #-7330
    //   3727: sipush #8159
    //   3730: invokestatic a : (II)Ljava/lang/String;
    //   3733: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   3738: checkcast java/util/Set
    //   3741: aload #52
    //   3743: invokeinterface contains : (Ljava/lang/Object;)Z
    //   3748: ifne -> 3814
    //   3751: aload #52
    //   3753: sipush #-7344
    //   3756: sipush #-28932
    //   3759: invokestatic a : (II)Ljava/lang/String;
    //   3762: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   3765: ifne -> 3814
    //   3768: goto -> 3775
    //   3771: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3774: athrow
    //   3775: aload #48
    //   3777: aload #52
    //   3779: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   3782: aload #7
    //   3784: aload #52
    //   3786: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   3789: ldc java/lang/Object
    //   3791: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   3794: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3799: pop
    //   3800: aload #5
    //   3802: aload #48
    //   3804: invokevirtual setExtensions : (Ljava/util/Map;)V
    //   3807: goto -> 3814
    //   3810: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   3813: athrow
    //   3814: aload #4
    //   3816: ifnonnull -> 3690
    //   3819: aload #5
    //   3821: areturn
    // Exception table:
    //   from	to	target	type
    //   5	11	11	java/lang/Exception
    //   65	99	102	java/lang/Exception
    //   138	156	156	java/lang/Exception
    //   278	288	291	java/lang/Exception
    //   283	300	303	java/lang/Exception
    //   672	691	694	java/lang/Exception
    //   677	714	717	java/lang/Exception
    //   721	841	844	java/lang/Exception
    //   740	767	770	java/lang/Exception
    //   819	834	837	java/lang/Exception
    //   867	884	887	java/lang/Exception
    //   872	901	904	java/lang/Exception
    //   908	948	951	java/lang/Exception
    //   928	989	992	java/lang/Exception
    //   996	1026	1029	java/lang/Exception
    //   1033	1082	1085	java/lang/Exception
    //   1109	1121	1124	java/lang/Exception
    //   1148	1160	1163	java/lang/Exception
    //   1187	1199	1202	java/lang/Exception
    //   1226	1238	1241	java/lang/Exception
    //   1288	1300	1303	java/lang/Exception
    //   1295	1314	1317	java/lang/Exception
    //   1307	1329	1332	java/lang/Exception
    //   1321	1349	1352	java/lang/Exception
    //   1336	1361	1364	java/lang/Exception
    //   1397	1421	1424	java/lang/Exception
    //   1405	1453	1456	java/lang/Exception
    //   1460	1503	1506	java/lang/Exception
    //   1473	1535	1538	java/lang/Exception
    //   1568	1581	1584	java/lang/Exception
    //   1661	1684	1687	java/lang/Exception
    //   1669	1699	1702	java/lang/Exception
    //   1691	1724	1727	java/lang/Exception
    //   1706	1739	1742	java/lang/Exception
    //   1746	1763	1766	java/text/ParseException
    //   1768	1817	1820	java/lang/Exception
    //   1809	1834	1837	java/lang/Exception
    //   1824	1845	1845	java/lang/Exception
    //   1851	1884	1887	java/lang/Exception
    //   1931	1943	1946	java/lang/Exception
    //   1985	1997	2000	java/lang/Exception
    //   2039	2051	2054	java/lang/Exception
    //   2093	2105	2108	java/lang/Exception
    //   2147	2159	2162	java/lang/Exception
    //   2201	2213	2216	java/lang/Exception
    //   2255	2267	2270	java/lang/Exception
    //   2360	2404	2407	java/lang/Exception
    //   2374	2416	2419	java/lang/Exception
    //   2452	2479	2482	java/lang/Exception
    //   2491	2508	2511	java/lang/Exception
    //   2520	2532	2535	java/lang/Exception
    //   2634	2651	2654	java/lang/Exception
    //   2663	2675	2678	java/lang/Exception
    //   2764	2779	2782	java/lang/Exception
    //   2791	2808	2811	java/lang/Exception
    //   2850	2862	2865	java/lang/Exception
    //   2964	2981	2984	java/lang/Exception
    //   2993	3005	3008	java/lang/Exception
    //   3107	3124	3127	java/lang/Exception
    //   3136	3148	3151	java/lang/Exception
    //   3174	3186	3189	java/lang/Exception
    //   3213	3225	3228	java/lang/Exception
    //   3252	3264	3267	java/lang/Exception
    //   3349	3366	3369	java/lang/Exception
    //   3393	3405	3408	java/lang/Exception
    //   3432	3444	3447	java/lang/Exception
    //   3471	3483	3486	java/lang/Exception
    //   3510	3522	3525	java/lang/Exception
    //   3549	3561	3564	java/lang/Exception
    //   3588	3600	3603	java/lang/Exception
    //   3615	3630	3633	java/lang/Exception
    //   3620	3644	3647	java/lang/Exception
    //   3712	3768	3771	java/lang/Exception
    //   3751	3807	3810	java/lang/Exception
  }
  
  private static String lambda$getSecurityRequirementsList$10(Zb paramZb) {
    return paramZb.Zp();
  }
  
  private static boolean lambda$getSecurityScheme$9(String paramString, SecurityScheme.In paramIn) {
    return paramIn.toString().equals(paramString);
  }
  
  private static Parameter lambda$getParameterDefinition$8(Object paramObject, Map paramMap) {
    return (Parameter)paramMap.get(paramObject);
  }
  
  private static void lambda$getParameterList$7(Set<String> paramSet, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString, Parameter paramParameter) {
    String str = paramParameter.get$ref();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (!paramSet.add(paramParameter.getName() + "#" + paramParameter.getName())) {
      if (str != null) {
        if (str.startsWith(a(-7645, 31870))) {
          paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7492, -11069));
          if (arrayOfZbqc == null) {
            paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7370, -13924));
            return;
          } 
        } 
        return;
      } 
    } else {
      return;
    } 
    paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7370, -13924));
  }
  
  private static void lambda$getMediaType$6(OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString1, Zr paramZr, String paramString2) {
    paramOpenAPIDeserializer$ParseResult.extra(paramString1, paramString2, (Zb)paramZr);
  }
  
  private static boolean lambda$getMediaType$5(Set paramSet, String paramString) {
    return !paramSet.contains(paramString);
  }
  
  private static boolean lambda$isPathParamDefined$4(String paramString, Parameter paramParameter) {
    return (paramParameter.get$ref() != null || (paramString.equals(paramParameter.getName()) && a(-7638, -24907).equals(paramParameter.getIn())));
  }
  
  private void lambda$getPathItems$3(PathItem paramPathItem, OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString1, String paramString2, String paramString3) {
    // Byte code:
    //   0: aload #5
    //   2: iconst_1
    //   3: aload #5
    //   5: invokevirtual length : ()I
    //   8: iconst_1
    //   9: isub
    //   10: invokevirtual substring : (II)Ljava/lang/String;
    //   13: astore #6
    //   15: aload_0
    //   16: aload #6
    //   18: aload_1
    //   19: invokevirtual getParameters : ()Ljava/util/List;
    //   22: invokevirtual isPathParamDefined : (Ljava/lang/String;Ljava/util/List;)Z
    //   25: istore #7
    //   27: iload #7
    //   29: ifne -> 58
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual getAllOperationsInAPath : (Lnet/portswigger/swagger/v3/oas/models/PathItem;)Ljava/util/List;
    //   37: astore #8
    //   39: aload #8
    //   41: aload_0
    //   42: aload_2
    //   43: aload_3
    //   44: aload #6
    //   46: aload #4
    //   48: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer;Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   53: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   58: return
  }
  
  private void lambda$getPathItems$2(OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString1, String paramString2, String paramString3, Operation paramOperation) {
    // Byte code:
    //   0: aload #5
    //   2: invokevirtual getParameters : ()Ljava/util/List;
    //   5: astore #6
    //   7: aload #6
    //   9: ifnonnull -> 17
    //   12: invokestatic emptyList : ()Ljava/util/List;
    //   15: astore #6
    //   17: aload #6
    //   19: aload_1
    //   20: aload_2
    //   21: <illegal opcode> accept : (Lnet/portswigger/swagger/v2/util/OpenAPIDeserializer$ParseResult;Ljava/lang/String;)Ljava/util/function/Consumer;
    //   26: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   31: aload_0
    //   32: aload_3
    //   33: aload #6
    //   35: invokevirtual isPathParamDefined : (Ljava/lang/String;Ljava/util/List;)Z
    //   38: ifne -> 91
    //   41: aload_1
    //   42: aload_2
    //   43: aload #4
    //   45: sipush #-7268
    //   48: sipush #7397
    //   51: invokestatic a : (II)Ljava/lang/String;
    //   54: swap
    //   55: ldc '''
    //   57: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   62: aload_3
    //   63: sipush #-7312
    //   66: sipush #768
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: swap
    //   73: sipush #-7526
    //   76: sipush #-22184
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   87: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   90: return
    //   91: return
  }
  
  private static void lambda$getPathItems$1(OpenAPIDeserializer$ParseResult paramOpenAPIDeserializer$ParseResult, String paramString, Parameter paramParameter) {
    if (a(-7638, -24907).equalsIgnoreCase(paramParameter.getIn()) && Boolean.FALSE.equals(paramParameter.getRequired()))
      paramOpenAPIDeserializer$ParseResult.warning(paramString, a(-7224, -31050) + a(-7224, -31050) + paramParameter.getName()); 
  }
  
  private static boolean lambda$validateReservedKeywords$0(String paramString1, String paramString2) {
    return paramString1.startsWith(paramString2);
  }
  
  static {
    // Byte code:
    //   0: sipush #455
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '´07ª© `\\tÃÀ¯=D\\b,+¥"ªp;{iØZWVDð$Ûdû\\f»iMbaÐ¸Lå­sþ×ùÔZ¾¹ :(«7Ò;å¦3÷©È?ÕÃDþÑõ¡öVi¢ÀÒ0Â}\\ts«?lì\\t/W\\bÁ¤\\tÏ MSþ6¯õK¾Â\\tdý[ÿÈ¹\\rT|K·÷Ô&AO#uã¿r@9D:ÐÓ Á2äþÒ/öEÇ@#0/â6vÉ!ÝG±åçàp\%Ú ÉlÙL®â9Åe­$àçÂÀÇò||'Ãá÷YBÒ#ïü@&ô±ñ+\\nù\\f°[:ûÃQ­lÉ^g ºBM\\fzéTeIæ ê¾Ïq¼7beõ*\\n]ÙÁ­¯´B´q¢\\fmÍnæE¬ðGÒ!¾ç9Åu0J«²\Ëÿ¾xCê6X®DT«j{ú{TÓG¦\\rYÂ¤&X6WZ+-\\tç]Ú©:é¥ñw©ã¹¿JÆ\\nÔÙåû-NálT4.aïÀü\\rV%­G%,<}Ü¹ÇqÆÉ]2øöÕ¸\\ft±®ÌL¦M+)y þ\\t8ÄùÏäóPZô¯t "ÙËO`p}ä:?\\t©òôé3µäBÑJVx#Rg,«iì¹¥ùx1¸Q[7hÁ°' \rÈØ¥{vÿÑuåF:Ï\\bX¦4T)\\f¦*ªHÝ}x¨_3ÌØÈ\\r·LÒ..~ûkUâ3d¶îaª`HLS±¢¢d*|ÔÜî 8sÆ©üÜEøU8ïÓ7{F7&íöºÕ\\b?pG-¶ØØYMcÒ2dX@M«U ÊÙÂ`,=¨¬^\\fÅùi\\r·ÑZÔ¼RWú 9g³ÄZì_~<.âÝ*+Ô¾=µíÓR"Ìuo]Du\\nÍ$Ý\\bgàÏBFÒ\\fHa~iR¦ÜJ¡FC.FjÔB°èàUëÖñ#æä²±À»XÔðO{Ab/\-*Ì"¿/|!\\f~\\räìCA.¬`¢JHB ¨^{Õ@|ûR^N(è2%cfÿ»¢áyßQ3x$}µûÞ`ÐÄñæãÕðË×î±ó!\\ty·>&Þ)Å÷ÑCÊI6SºÀæÝpÇ¡bÝaG&|>ü0r§;ì]Cs\\fø×=Í.ËÞÜ)¶Øî>T××cèð/ÌÎ¶èê¿Ô«]-#v63,6ÃMÔævE\\bìW01 úmëRm¡EbòÑNÛí!yø: ÔsÇøÕüÄ.îOìÕ?3»y]¶`}mÚû¿Þ(NõL}m\\rQÀ'×´´Eí±ØÉqTªFÓP~\\tÞ+vÈËâêßTLEQhÒÎs/}Nn°l@°Ze7!MÔ]üÞBÉ\\bpZI½ééH%Ù[\\t|=1ªå]´Ç1xïD[\\tdÎh{ñ30»yi¤ ºÊ\\tå]ØNJMôçæÛîÅ-YbîÙ¨³Â÷Ö¯îC¬\ÿl¿.é\\r,t}MgøÕ!w$ µ¦IÍ LC¶Ä¶Öëûa5ííYnÂÏ¼[k\\n`\]\\n9'¶\\b¤j¤Ðãv\\b mÇötª58y¶!aS`wnA¿%Ç¯/wê±8RT=ÏKÕèW9Ùî%\\n`FöbYD¯£¾Ã{L´Y<ÀNø9tê\\bNõß6äz^·´>qèYµk6\\fY'ÂvóWÛtA\\rìËO*Ð:çwä-©ù¡àÀ÷Æ@4Ç9\\rÀ`ÏPMçEä§Nàçóù{q¹%Y`·pðN³÷çd_OÂ2\\fº¥ý¯çó\\t\\nÿºl<ÆcFn')FÙ©6à\\n)#½w¸4âkwÔwxKô4;\\nd×ò÷\\b*ï¥\\rl8ó\\n(\\b´Y=²Ì/w³RL0(¥!FEûä÷ÿh®\\rõ_°\aÇ1÷¼À¼¡çªZ0$%\\r·!¿þ[Ð¹.$çíÄZ<MÁî¼ÄzûN¯k|1\\fH20úÞFÂ¹fîÊ{T=Òã§\\tÄ¢ü(Å¾ ZÞÒOlee­\\tÏijASà´¶Ý2hlb¤îh¼ ZTDÉ ºR×ÚÖzE¯°\\r\\bÀiÆúø ÕbôÎéqgÿo:·¼Rú«dâÞò\\n< ©*"õùØå¸m´|ðmYr\\næ)e»ÞU&!´96±Ç\\bÊt¹~å²+ jkzªl»m÷LÌ£ìý5|£ò1Ã3½ÉKû&Y&\\b±,,ª.M)P?Ì]§ ]ö¿!]12pbü½×Rb´Bt¯i"æ7gá½#ÒG¹ûRÔg7>t{ìÀóá~\\r­8wËKó·ò8Ëh®£wýc|Øî3qYCi»Mï¾ulXÖ§¶w6tÎ Ô\\n÷@°Ïë¯#¬ïbÕ*ü²Ec}ÍÃT§>rø·ðßUØõÜV\\t*pñ}0æ·Ha±13i®C9®¥³öÚãøÌÕÿ Ãð`ïöôé¼p÷eFy\\tD¦4é/±ôÊïCÞ[z]Po\\f­óûüôÐ)dþ¦J]ðõWø(#yÝ¤sÒ"UAU1$®g}È´Bý;§G*F³ù!0Y#é÷J£ßYU³hq&õ\\nß^ÆOô\\f BNk\\tüýîûÖûh\\b\\rJ|kræ>Ág®í bC'Úy\\r1PË w··*\\t8¹ã]óÇÃP1.½Á~\3Àóà\\nf×j7(w\\tËKK®üv¢Rþ#ãÒÓïRz¦ñHæ>Ð#Ô)ô«mmèqá&ÅÚÄÎ»­\\r#ìÅ­º|õwù\\nÌ\\f^Ùé}d\\b²½úº­î¤ XnãÖ»Ê¬}\\by¬LuøÂ\\bºÞe7¸2Ôm\\fç«Bê½ CS"ÉXÕ·Ù]hCèú|4Z³hl¾ü¨0I]$yóØÉï'd\\tö«ía`º[ýpC_Å6¤¤ü×õ[N½Ä\\tî'Mûà\\tH#4ÑcßÝï$)\\b*ª¨l$x1h\\tèÜgn¹ %å$IÏýbÅ#ðNÆòkÖ<ëþkî´¬óo\\t}MÝùª5ã=mZa!Äæ2Vm\\r- QrôðoÌ@ÓéÓéîùÒÐ¾¸+vh [vnÔùU\\r:Id^ÀÖ@Ü#"\\rwU e3¤: è ãèx\\tèPåÉth·`\\t,\\r Äèfxä³Mâ°Pu}épL7:$¼`ÐncV0L1.ý·WÝÓ0ÀØ{Ü£Ô¶\\t¡|¢¢·*r\£¦ûCâá #+ûê\\rAfé]ÞGÃçªè{ò\\bªb¯sÜµÚ/a®È3Ï_æ¬èB!K´ôÀ¨&>}³¼énv)¬qcÒ\\rWtºXiË pÑ_ò¤£öè+Þn·ö.6×øòB·\\t·%?óaÎ\\tºãeË\\n4Ëð\\tîÚÔâÍ¼[¼Ç`­×ÓÄîF¬6ÃäOR¡±J7h4âÏ¢ÿ Dib>EIôÔÌ­>Æ7æêþõwÊ?Qùjzè/.båLùØý´Ë!ZÉ{­\\f5íçnÖÂ5¼ká³$N¡§©Ti}©¶ØÈÉ2wþLVÕÕ%Ã1sá»Jmb<%Gï\\f.«Ê½ñK_d3ÁÍMÅ´{¤ôcOøð|äP´Hº4lbÊÛëÊ¤Þ¿ù[¢iÿ³ïcE+Wh`Þg7u¤V%Ì?w[¹>pÚz[;dåïÑÊ·\\n}Ç¤\\fhRnÐôð~BQë4ÇÒ³M¦¤XQQá`.ç^9\\b_¾ ö=æ\\bHÉ;ÕÔäð¹\\tc¬\\tñ#÷Á:[=aÖ°äV?Ô\\f7f­(f/Ã\\nãoÍZ9ö00!4DyF$At]|A]=òÂ&vÉ«\\tAÃJ<ÛËW\\rÒ6:+«}z}[F5Ì\u¼e÷S(@ù1ß(î]EÒ!&½ê«A¯À¶u1^ÆÈ³Ô~\\\f¹ÔÒ·¯Ã ¤O¶:HÁLÚ2\\buI¿#! -³Ò:G;fE`5on-ph0ª(°GF.  ¸H®è¼3\\b°òÓÓ I2õ\\nÝ>Øªû¥kçæ)"âJì/Ë©Q»í0'·uÜ&DßU\\t¾ÞÕEï@ü#R·ÐþÐbX%ú\\fcwM£dm|îMÓæ(Q\\nÝø^¿v\\tMÈhPzyAÈ\\bÿ+ÎÚ\\bðÑE× L&î\\f®[4Jöö»{éU2nT oû\\tÝÝÚ¶ÛãìKØt ©Q)­¯hL}Ò98·G£\\tOvÚ^6Ìó@\\b(²ÂÛkZÕÃfâÝÔöNô£·Ðp\\fR`«åEl¡ÜdÇ«nÇ½±xÍ¤]=Ô&i½?Ú2/÷¾SV\\t¹wa'bPé·ÄÂNijùø\\t}Æ¡NÊ~ñ¶â9 ÷}[S<åZ®v4 @ÇSt5®LÆVL7ÛÑÜIkmÔ2Y2úNAmÍ¡KèéÛ=Ô× 8«s÷6&+ôN\\\te.3ÌöôÙ«â\\n²Z¥æù8Ç\\njÞþÅÿÐA¥\\bEð¹ãû \\tóöÇY|ø\\ntÒM´Ä|þOè'x7-êªõn°ïëv\\rÓì!'â²r¸Z¡xãTúS«¸ð2\\blL Kþw>{^ÍHÁO»n¨:b×\\fðÌ# éS7\\b1Ô9Ð pÆØóñd\\byêÿ.wSê±$1r/SI£¾UäÇywvO6ýB&Ü«sè(©!q©0éÃ(j[è\\rn«9ùÜÎItcÿS'·<\\brlí\\nÌÀ>q4!.~~5.sÜeuV &l¶ÞE[JY-^xã*ö··Q\\bIêþmÞ\\f(<JkÐ/SH,¨ìD\\tO8\\rmÈH´\\fuýÀ(ÙäÕÜ\\tðDHA+®ôp#\\rA¥ÒXL%Ñ°Å\\b5iÄRCà#;ðï³ã\\r".¡¢ýñ×Ô>\\tb08MµDëCn\\rîõqU&öPq\\nÐ©×}MØåüÝp)îûåZ~Ø¸FåÓÂþA26í½3ø: wnaæÙ{æTPØMî´°Õ÷S\\fÏ÷Ù¢{nM¬Çöþ#T"dE6Ñ&ßõÐ1Ì¼Áä4üdl¶ù(æ 7éÂI\\r¢ómPíó4"\\b¦NWgöÖÌFåÎüt¡¢T)\\n©] Q~½Î Íü\\bXéÊq?óÐ;! ±,GñceAOVmÓ@dÚ§tÅ²ßäË÷úN!\\bDcÿXÉå^/K[¢m¬V=óuU\\ttb(¡ÜKk`çíBQ>\\n¬¦T9+R3ÞùßÒS\\rÚ>¿S#nlC<Ýo\\b<«®øß\váçñzÄÉUI¿Â¦¬S¥Y8yÔ*°ÐG´ÔavDNGëòuJqc!ÀÒä;ªfZ[hvFãÑw¾\\naÞèµ/ ñ+±*Â{­\\n\\fÉ\\tVW\\t|¿µøà«æ9Á/¸$e\\nøKè·õþ:ô¶"AáÓØÐÐL­þHù'ZÀ¹o}ÃB®ué×XÊÑ·Êp%"HgóJ\\nõë ¬­ù¡ÒPúhK@èp\\t]ª-^QÇ²ý{SaÝ_úr\\b;q uÚ¨6hÄå\\b\\r§FÐ4ÝJît¸G§"éø¹ä"oiõL\ÃÞ'\Èÿ@ìÀS}IÏ¯âQ¥²Ø)ò(99¯ y3Ûgï¹JdV^À 0õ¢ÜÛ¹ÎÎzc%6Z¤ÚîçÐßÒ1-T¬n:æt8\\t>,ø¨ÛeÔíÊºÊ½6cÛÆç!âÍdN ¾]AË®ýÌRÛ<J»ëþ!Àn "\\fÓw,}fRQàðÅd¼1c×»M´`Îª0\\tÓp3Å<\\b2H§z¿Ì?â2A\\fUCÖ¼¼õ_YäÞåÐ8\\rÚ";bªÉ9ç¡6R"UJ>ïÚìÇrvëZ,{PôçFPe4=@©Ót\\n.ç»ñ!ê9÷»¦ûãîzâÍ'¤b\\tìv¥}üâÎØd§Dá0$mhh/ï¤àÒîûÛì\\tN(!Ç¢ÁèýjìÔ¥[^\\nÞU\\tù]ê&tZo ÎÓ'öHkAþË"äîF²ëd[&¨\\rMùf×ÍkÖ#C½<Õ0ÒëÜUÑ ô¾I9§Ý´Ä\\f°aâ-Èð®MÊ{SBaìé3\\fª7;kN uÚæd°òuÐJp¾1ú\\tNTÅê¼yè©9X¦\\tÙÈë®k÷h×§Ã¤ðiO?'H¯Pih¯y_4\\r!ñÃK\\bt¡5©Ú\\béQ!Þqÿ4Ô?î\\b4îGïæ¸Aa³pð¦/o¶£³]ª ïÚ\\t2pfö°û{\\t¾ý²ÛT²/>\}¸y@s»ZB¥òsãBh·Lòâ²Å\\bÔqlYØÀ¢ðI Ñ:·üªtèåñ\\bp¤®bäV\\r%Pj£{mãcMS¹¯m>çÕhòÉ«W»D\\n\\r%¬*6wxQÿéöÂ}$|Õñ¤[ìEÍ¯*'éµé«éª÷²ñþddea³ÛfX¡¯ã×û÷©ïP\\t¸F:ÃÃÊ"Iã÷ð¡yÜ¿¾ûKJJSú Ì\\nk®`Þâ'Ó´fb\\tð:'Çµ|êG\«½Ï\\f9B%m±Tþä3Zä*`ó )¬ì%WÂ\\bÎ(ûøønj? :3ª\\tckô \\n\\n["¤0U\\bÜL¥;iPh\\fÏq7sbe?+(\\râ"üK_Ó\" Ýo òQ¶+äO×f/'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #25
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: iconst_5
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 204
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
    //   65: goto -> 24
    //   68: ldc 'Ãle*Ú²åè'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #30
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 204
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
    //   129: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.a : [Ljava/lang/String;
    //   132: sipush #455
    //   135: anewarray java/lang/String
    //   138: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.b : [Ljava/lang/String;
    //   141: sipush #-7271
    //   144: sipush #-20018
    //   147: invokestatic a : (II)Ljava/lang/String;
    //   150: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.QUERY_PARAMETER : Ljava/lang/String;
    //   153: sipush #-7649
    //   156: sipush #-7619
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PATH_PARAMETER : Ljava/lang/String;
    //   165: sipush #-7207
    //   168: sipush #-4172
    //   171: invokestatic a : (II)Ljava/lang/String;
    //   174: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.REFERENCE_SEPARATOR : Ljava/lang/String;
    //   177: sipush #-7490
    //   180: sipush #-386
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.HEADER_PARAMETER : Ljava/lang/String;
    //   189: sipush #-7310
    //   192: sipush #1855
    //   195: invokestatic a : (II)Ljava/lang/String;
    //   198: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.COOKIE_PARAMETER : Ljava/lang/String;
    //   201: goto -> 360
    //   204: dup_x2
    //   205: pop
    //   206: invokevirtual toCharArray : ()[C
    //   209: dup_x1
    //   210: arraylength
    //   211: dup_x2
    //   212: pop
    //   213: iconst_0
    //   214: istore #6
    //   216: dup2_x1
    //   217: pop2
    //   218: dup_x2
    //   219: iconst_1
    //   220: if_icmpgt -> 320
    //   223: dup2
    //   224: swap
    //   225: iload #6
    //   227: dup2_x1
    //   228: caload
    //   229: swap
    //   230: iload #6
    //   232: bipush #7
    //   234: irem
    //   235: tableswitch default -> 302, 0 -> 272, 1 -> 277, 2 -> 282, 3 -> 287, 4 -> 292, 5 -> 297
    //   272: bipush #85
    //   274: goto -> 304
    //   277: bipush #102
    //   279: goto -> 304
    //   282: bipush #96
    //   284: goto -> 304
    //   287: bipush #40
    //   289: goto -> 304
    //   292: bipush #24
    //   294: goto -> 304
    //   297: bipush #120
    //   299: goto -> 304
    //   302: bipush #6
    //   304: ixor
    //   305: ixor
    //   306: i2c
    //   307: castore
    //   308: iinc #6, 1
    //   311: dup
    //   312: ifne -> 320
    //   315: dup2
    //   316: dup_x1
    //   317: goto -> 227
    //   320: dup2_x1
    //   321: pop2
    //   322: dup_x2
    //   323: iload #6
    //   325: if_icmpgt -> 223
    //   328: pop
    //   329: new java/lang/String
    //   332: dup_x1
    //   333: swap
    //   334: invokespecial <init> : ([C)V
    //   337: invokevirtual intern : ()Ljava/lang/String;
    //   340: swap
    //   341: pop
    //   342: swap
    //   343: tableswitch default -> 40, 0 -> 99
    //   360: new java/util/LinkedHashSet
    //   363: dup
    //   364: bipush #7
    //   366: anewarray java/lang/String
    //   369: dup
    //   370: iconst_0
    //   371: sipush #-7661
    //   374: sipush #-30112
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: sipush #-7573
    //   386: sipush #23738
    //   389: invokestatic a : (II)Ljava/lang/String;
    //   392: aastore
    //   393: dup
    //   394: iconst_2
    //   395: sipush #-7362
    //   398: sipush #25325
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: aastore
    //   405: dup
    //   406: iconst_3
    //   407: sipush #-7198
    //   410: sipush #10364
    //   413: invokestatic a : (II)Ljava/lang/String;
    //   416: aastore
    //   417: dup
    //   418: iconst_4
    //   419: sipush #-7190
    //   422: sipush #-25170
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: iconst_5
    //   431: sipush #-7551
    //   434: sipush #15066
    //   437: invokestatic a : (II)Ljava/lang/String;
    //   440: aastore
    //   441: dup
    //   442: bipush #6
    //   444: sipush #-7653
    //   447: sipush #28341
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: aastore
    //   454: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   457: invokespecial <init> : (Ljava/util/Collection;)V
    //   460: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.JSON_SCHEMA_2020_12_TYPES : Ljava/util/Set;
    //   463: new java/util/LinkedHashSet
    //   466: dup
    //   467: bipush #8
    //   469: anewarray java/lang/String
    //   472: dup
    //   473: iconst_0
    //   474: sipush #-7327
    //   477: sipush #-5133
    //   480: invokestatic a : (II)Ljava/lang/String;
    //   483: aastore
    //   484: dup
    //   485: iconst_1
    //   486: sipush #-7479
    //   489: sipush #-18809
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: aastore
    //   496: dup
    //   497: iconst_2
    //   498: sipush #-7221
    //   501: sipush #-7465
    //   504: invokestatic a : (II)Ljava/lang/String;
    //   507: aastore
    //   508: dup
    //   509: iconst_3
    //   510: sipush #-7299
    //   513: sipush #26635
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: aastore
    //   520: dup
    //   521: iconst_4
    //   522: sipush #-7180
    //   525: sipush #-11288
    //   528: invokestatic a : (II)Ljava/lang/String;
    //   531: aastore
    //   532: dup
    //   533: iconst_5
    //   534: sipush #-7298
    //   537: sipush #-29444
    //   540: invokestatic a : (II)Ljava/lang/String;
    //   543: aastore
    //   544: dup
    //   545: bipush #6
    //   547: sipush #-7383
    //   550: sipush #8920
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: aastore
    //   557: dup
    //   558: bipush #7
    //   560: sipush #-7399
    //   563: sipush #-12918
    //   566: invokestatic a : (II)Ljava/lang/String;
    //   569: aastore
    //   570: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   573: invokespecial <init> : (Ljava/util/Collection;)V
    //   576: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ROOT_KEYS : Ljava/util/Set;
    //   579: new java/util/LinkedHashSet
    //   582: dup
    //   583: bipush #6
    //   585: anewarray java/lang/String
    //   588: dup
    //   589: iconst_0
    //   590: sipush #-7213
    //   593: sipush #-22913
    //   596: invokestatic a : (II)Ljava/lang/String;
    //   599: aastore
    //   600: dup
    //   601: iconst_1
    //   602: sipush #-7642
    //   605: sipush #4544
    //   608: invokestatic a : (II)Ljava/lang/String;
    //   611: aastore
    //   612: dup
    //   613: iconst_2
    //   614: sipush #-7565
    //   617: sipush #29759
    //   620: invokestatic a : (II)Ljava/lang/String;
    //   623: aastore
    //   624: dup
    //   625: iconst_3
    //   626: sipush #-7447
    //   629: sipush #-28548
    //   632: invokestatic a : (II)Ljava/lang/String;
    //   635: aastore
    //   636: dup
    //   637: iconst_4
    //   638: sipush #-7540
    //   641: sipush #-9571
    //   644: invokestatic a : (II)Ljava/lang/String;
    //   647: aastore
    //   648: dup
    //   649: iconst_5
    //   650: sipush #-7374
    //   653: sipush #-28338
    //   656: invokestatic a : (II)Ljava/lang/String;
    //   659: aastore
    //   660: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   663: invokespecial <init> : (Ljava/util/Collection;)V
    //   666: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.INFO_KEYS : Ljava/util/Set;
    //   669: new java/util/LinkedHashSet
    //   672: dup
    //   673: iconst_3
    //   674: anewarray java/lang/String
    //   677: dup
    //   678: iconst_0
    //   679: sipush #-7657
    //   682: sipush #12130
    //   685: invokestatic a : (II)Ljava/lang/String;
    //   688: aastore
    //   689: dup
    //   690: iconst_1
    //   691: sipush #-7316
    //   694: sipush #23477
    //   697: invokestatic a : (II)Ljava/lang/String;
    //   700: aastore
    //   701: dup
    //   702: iconst_2
    //   703: sipush #-7425
    //   706: sipush #27485
    //   709: invokestatic a : (II)Ljava/lang/String;
    //   712: aastore
    //   713: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   716: invokespecial <init> : (Ljava/util/Collection;)V
    //   719: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.CONTACT_KEYS : Ljava/util/Set;
    //   722: new java/util/LinkedHashSet
    //   725: dup
    //   726: iconst_2
    //   727: anewarray java/lang/String
    //   730: dup
    //   731: iconst_0
    //   732: sipush #-7657
    //   735: sipush #12130
    //   738: invokestatic a : (II)Ljava/lang/String;
    //   741: aastore
    //   742: dup
    //   743: iconst_1
    //   744: sipush #-7316
    //   747: sipush #23477
    //   750: invokestatic a : (II)Ljava/lang/String;
    //   753: aastore
    //   754: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   757: invokespecial <init> : (Ljava/util/Collection;)V
    //   760: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LICENSE_KEYS : Ljava/util/Set;
    //   763: new java/util/LinkedHashSet
    //   766: dup
    //   767: iconst_3
    //   768: anewarray java/lang/String
    //   771: dup
    //   772: iconst_0
    //   773: sipush #-7642
    //   776: sipush #4544
    //   779: invokestatic a : (II)Ljava/lang/String;
    //   782: aastore
    //   783: dup
    //   784: iconst_1
    //   785: sipush #-7657
    //   788: sipush #12130
    //   791: invokestatic a : (II)Ljava/lang/String;
    //   794: aastore
    //   795: dup
    //   796: iconst_2
    //   797: sipush #-7399
    //   800: sipush #-12918
    //   803: invokestatic a : (II)Ljava/lang/String;
    //   806: aastore
    //   807: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   810: invokespecial <init> : (Ljava/util/Collection;)V
    //   813: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.TAG_KEYS : Ljava/util/Set;
    //   816: new java/util/LinkedHashSet
    //   819: dup
    //   820: iconst_5
    //   821: anewarray java/lang/String
    //   824: dup
    //   825: iconst_0
    //   826: sipush #-7225
    //   829: sipush #-25842
    //   832: invokestatic a : (II)Ljava/lang/String;
    //   835: aastore
    //   836: dup
    //   837: iconst_1
    //   838: sipush #-7642
    //   841: sipush #4544
    //   844: invokestatic a : (II)Ljava/lang/String;
    //   847: aastore
    //   848: dup
    //   849: iconst_2
    //   850: sipush #-7613
    //   853: sipush #15237
    //   856: invokestatic a : (II)Ljava/lang/String;
    //   859: aastore
    //   860: dup
    //   861: iconst_3
    //   862: sipush #-7402
    //   865: sipush #23593
    //   868: invokestatic a : (II)Ljava/lang/String;
    //   871: aastore
    //   872: dup
    //   873: iconst_4
    //   874: sipush #-7350
    //   877: sipush #22421
    //   880: invokestatic a : (II)Ljava/lang/String;
    //   883: aastore
    //   884: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   887: invokespecial <init> : (Ljava/util/Collection;)V
    //   890: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RESPONSE_KEYS : Ljava/util/Set;
    //   893: new java/util/LinkedHashSet
    //   896: dup
    //   897: iconst_3
    //   898: anewarray java/lang/String
    //   901: dup
    //   902: iconst_0
    //   903: sipush #-7316
    //   906: sipush #23477
    //   909: invokestatic a : (II)Ljava/lang/String;
    //   912: aastore
    //   913: dup
    //   914: iconst_1
    //   915: sipush #-7642
    //   918: sipush #4544
    //   921: invokestatic a : (II)Ljava/lang/String;
    //   924: aastore
    //   925: dup
    //   926: iconst_2
    //   927: sipush #-7535
    //   930: sipush #1537
    //   933: invokestatic a : (II)Ljava/lang/String;
    //   936: aastore
    //   937: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   940: invokespecial <init> : (Ljava/util/Collection;)V
    //   943: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_KEYS : Ljava/util/Set;
    //   946: new java/util/LinkedHashSet
    //   949: dup
    //   950: iconst_3
    //   951: anewarray java/lang/String
    //   954: dup
    //   955: iconst_0
    //   956: sipush #-7602
    //   959: sipush #-21117
    //   962: invokestatic a : (II)Ljava/lang/String;
    //   965: aastore
    //   966: dup
    //   967: iconst_1
    //   968: sipush #-7403
    //   971: sipush #10714
    //   974: invokestatic a : (II)Ljava/lang/String;
    //   977: aastore
    //   978: dup
    //   979: iconst_2
    //   980: sipush #-7642
    //   983: sipush #4544
    //   986: invokestatic a : (II)Ljava/lang/String;
    //   989: aastore
    //   990: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   993: invokespecial <init> : (Ljava/util/Collection;)V
    //   996: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_VARIABLE_KEYS : Ljava/util/Set;
    //   999: new java/util/LinkedHashSet
    //   1002: dup
    //   1003: bipush #13
    //   1005: anewarray java/lang/String
    //   1008: dup
    //   1009: iconst_0
    //   1010: sipush #-7225
    //   1013: sipush #-25842
    //   1016: invokestatic a : (II)Ljava/lang/String;
    //   1019: aastore
    //   1020: dup
    //   1021: iconst_1
    //   1022: sipush #-7305
    //   1025: bipush #-57
    //   1027: invokestatic a : (II)Ljava/lang/String;
    //   1030: aastore
    //   1031: dup
    //   1032: iconst_2
    //   1033: sipush #-7642
    //   1036: sipush #4544
    //   1039: invokestatic a : (II)Ljava/lang/String;
    //   1042: aastore
    //   1043: dup
    //   1044: iconst_3
    //   1045: sipush #-7556
    //   1048: sipush #32471
    //   1051: invokestatic a : (II)Ljava/lang/String;
    //   1054: aastore
    //   1055: dup
    //   1056: iconst_4
    //   1057: sipush #-7391
    //   1060: sipush #-28908
    //   1063: invokestatic a : (II)Ljava/lang/String;
    //   1066: aastore
    //   1067: dup
    //   1068: iconst_5
    //   1069: sipush #-7226
    //   1072: sipush #-2559
    //   1075: invokestatic a : (II)Ljava/lang/String;
    //   1078: aastore
    //   1079: dup
    //   1080: bipush #6
    //   1082: sipush #-7640
    //   1085: sipush #-16616
    //   1088: invokestatic a : (II)Ljava/lang/String;
    //   1091: aastore
    //   1092: dup
    //   1093: bipush #7
    //   1095: sipush #-7184
    //   1098: sipush #-12756
    //   1101: invokestatic a : (II)Ljava/lang/String;
    //   1104: aastore
    //   1105: dup
    //   1106: bipush #8
    //   1108: sipush #-7472
    //   1111: sipush #-7660
    //   1114: invokestatic a : (II)Ljava/lang/String;
    //   1117: aastore
    //   1118: dup
    //   1119: bipush #9
    //   1121: sipush #-7484
    //   1124: sipush #-31291
    //   1127: invokestatic a : (II)Ljava/lang/String;
    //   1130: aastore
    //   1131: dup
    //   1132: bipush #10
    //   1134: sipush #-7562
    //   1137: sipush #413
    //   1140: invokestatic a : (II)Ljava/lang/String;
    //   1143: aastore
    //   1144: dup
    //   1145: bipush #11
    //   1147: sipush #-7308
    //   1150: sipush #-11859
    //   1153: invokestatic a : (II)Ljava/lang/String;
    //   1156: aastore
    //   1157: dup
    //   1158: bipush #12
    //   1160: sipush #-7195
    //   1163: sipush #27709
    //   1166: invokestatic a : (II)Ljava/lang/String;
    //   1169: aastore
    //   1170: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1173: invokespecial <init> : (Ljava/util/Collection;)V
    //   1176: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PATHITEM_KEYS : Ljava/util/Set;
    //   1179: new java/util/LinkedHashSet
    //   1182: dup
    //   1183: bipush #12
    //   1185: anewarray java/lang/String
    //   1188: dup
    //   1189: iconst_0
    //   1190: sipush #-7222
    //   1193: sipush #12152
    //   1196: invokestatic a : (II)Ljava/lang/String;
    //   1199: aastore
    //   1200: dup
    //   1201: iconst_1
    //   1202: sipush #-7305
    //   1205: bipush #-57
    //   1207: invokestatic a : (II)Ljava/lang/String;
    //   1210: aastore
    //   1211: dup
    //   1212: iconst_2
    //   1213: sipush #-7642
    //   1216: sipush #4544
    //   1219: invokestatic a : (II)Ljava/lang/String;
    //   1222: aastore
    //   1223: dup
    //   1224: iconst_3
    //   1225: sipush #-7399
    //   1228: sipush #-12918
    //   1231: invokestatic a : (II)Ljava/lang/String;
    //   1234: aastore
    //   1235: dup
    //   1236: iconst_4
    //   1237: sipush #-7615
    //   1240: sipush #15504
    //   1243: invokestatic a : (II)Ljava/lang/String;
    //   1246: aastore
    //   1247: dup
    //   1248: iconst_5
    //   1249: sipush #-7195
    //   1252: sipush #27709
    //   1255: invokestatic a : (II)Ljava/lang/String;
    //   1258: aastore
    //   1259: dup
    //   1260: bipush #6
    //   1262: sipush #-7309
    //   1265: sipush #2463
    //   1268: invokestatic a : (II)Ljava/lang/String;
    //   1271: aastore
    //   1272: dup
    //   1273: bipush #7
    //   1275: sipush #-7536
    //   1278: sipush #-29376
    //   1281: invokestatic a : (II)Ljava/lang/String;
    //   1284: aastore
    //   1285: dup
    //   1286: bipush #8
    //   1288: sipush #-7219
    //   1291: sipush #28309
    //   1294: invokestatic a : (II)Ljava/lang/String;
    //   1297: aastore
    //   1298: dup
    //   1299: bipush #9
    //   1301: sipush #-7363
    //   1304: sipush #9893
    //   1307: invokestatic a : (II)Ljava/lang/String;
    //   1310: aastore
    //   1311: dup
    //   1312: bipush #10
    //   1314: sipush #-7424
    //   1317: sipush #-12592
    //   1320: invokestatic a : (II)Ljava/lang/String;
    //   1323: aastore
    //   1324: dup
    //   1325: bipush #11
    //   1327: sipush #-7308
    //   1330: sipush #-11859
    //   1333: invokestatic a : (II)Ljava/lang/String;
    //   1336: aastore
    //   1337: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1340: invokespecial <init> : (Ljava/util/Collection;)V
    //   1343: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OPERATION_KEYS : Ljava/util/Set;
    //   1346: new java/util/LinkedHashSet
    //   1349: dup
    //   1350: bipush #14
    //   1352: anewarray java/lang/String
    //   1355: dup
    //   1356: iconst_0
    //   1357: sipush #-7225
    //   1360: sipush #-25842
    //   1363: invokestatic a : (II)Ljava/lang/String;
    //   1366: aastore
    //   1367: dup
    //   1368: iconst_1
    //   1369: sipush #-7657
    //   1372: sipush #12130
    //   1375: invokestatic a : (II)Ljava/lang/String;
    //   1378: aastore
    //   1379: dup
    //   1380: iconst_2
    //   1381: sipush #-7614
    //   1384: sipush #-20403
    //   1387: invokestatic a : (II)Ljava/lang/String;
    //   1390: aastore
    //   1391: dup
    //   1392: iconst_3
    //   1393: sipush #-7642
    //   1396: sipush #4544
    //   1399: invokestatic a : (II)Ljava/lang/String;
    //   1402: aastore
    //   1403: dup
    //   1404: iconst_4
    //   1405: sipush #-7194
    //   1408: sipush #-16772
    //   1411: invokestatic a : (II)Ljava/lang/String;
    //   1414: aastore
    //   1415: dup
    //   1416: iconst_5
    //   1417: sipush #-7363
    //   1420: sipush #9893
    //   1423: invokestatic a : (II)Ljava/lang/String;
    //   1426: aastore
    //   1427: dup
    //   1428: bipush #6
    //   1430: sipush #-7598
    //   1433: sipush #17204
    //   1436: invokestatic a : (II)Ljava/lang/String;
    //   1439: aastore
    //   1440: dup
    //   1441: bipush #7
    //   1443: sipush #-7588
    //   1446: sipush #-10573
    //   1449: invokestatic a : (II)Ljava/lang/String;
    //   1452: aastore
    //   1453: dup
    //   1454: bipush #8
    //   1456: sipush #-7354
    //   1459: sipush #8505
    //   1462: invokestatic a : (II)Ljava/lang/String;
    //   1465: aastore
    //   1466: dup
    //   1467: bipush #9
    //   1469: sipush #-7407
    //   1472: sipush #11024
    //   1475: invokestatic a : (II)Ljava/lang/String;
    //   1478: aastore
    //   1479: dup
    //   1480: bipush #10
    //   1482: sipush #-7384
    //   1485: sipush #2478
    //   1488: invokestatic a : (II)Ljava/lang/String;
    //   1491: aastore
    //   1492: dup
    //   1493: bipush #11
    //   1495: sipush #-7193
    //   1498: sipush #-4890
    //   1501: invokestatic a : (II)Ljava/lang/String;
    //   1504: aastore
    //   1505: dup
    //   1506: bipush #12
    //   1508: sipush #-7372
    //   1511: sipush #30748
    //   1514: invokestatic a : (II)Ljava/lang/String;
    //   1517: aastore
    //   1518: dup
    //   1519: bipush #13
    //   1521: sipush #-7402
    //   1524: sipush #23593
    //   1527: invokestatic a : (II)Ljava/lang/String;
    //   1530: aastore
    //   1531: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1534: invokespecial <init> : (Ljava/util/Collection;)V
    //   1537: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PARAMETER_KEYS : Ljava/util/Set;
    //   1540: new java/util/LinkedHashSet
    //   1543: dup
    //   1544: iconst_4
    //   1545: anewarray java/lang/String
    //   1548: dup
    //   1549: iconst_0
    //   1550: sipush #-7225
    //   1553: sipush #-25842
    //   1556: invokestatic a : (II)Ljava/lang/String;
    //   1559: aastore
    //   1560: dup
    //   1561: iconst_1
    //   1562: sipush #-7642
    //   1565: sipush #4544
    //   1568: invokestatic a : (II)Ljava/lang/String;
    //   1571: aastore
    //   1572: dup
    //   1573: iconst_2
    //   1574: sipush #-7402
    //   1577: sipush #23593
    //   1580: invokestatic a : (II)Ljava/lang/String;
    //   1583: aastore
    //   1584: dup
    //   1585: iconst_3
    //   1586: sipush #-7194
    //   1589: sipush #-16772
    //   1592: invokestatic a : (II)Ljava/lang/String;
    //   1595: aastore
    //   1596: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1599: invokespecial <init> : (Ljava/util/Collection;)V
    //   1602: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.REQUEST_BODY_KEYS : Ljava/util/Set;
    //   1605: new java/util/LinkedHashSet
    //   1608: dup
    //   1609: bipush #9
    //   1611: anewarray java/lang/String
    //   1614: dup
    //   1615: iconst_0
    //   1616: sipush #-7225
    //   1619: sipush #-25842
    //   1622: invokestatic a : (II)Ljava/lang/String;
    //   1625: aastore
    //   1626: dup
    //   1627: iconst_1
    //   1628: sipush #-7483
    //   1631: sipush #19223
    //   1634: invokestatic a : (II)Ljava/lang/String;
    //   1637: aastore
    //   1638: dup
    //   1639: iconst_2
    //   1640: sipush #-7657
    //   1643: sipush #12130
    //   1646: invokestatic a : (II)Ljava/lang/String;
    //   1649: aastore
    //   1650: dup
    //   1651: iconst_3
    //   1652: sipush #-7614
    //   1655: sipush #-20403
    //   1658: invokestatic a : (II)Ljava/lang/String;
    //   1661: aastore
    //   1662: dup
    //   1663: iconst_4
    //   1664: sipush #-7642
    //   1667: sipush #4544
    //   1670: invokestatic a : (II)Ljava/lang/String;
    //   1673: aastore
    //   1674: dup
    //   1675: iconst_5
    //   1676: sipush #-7594
    //   1679: sipush #19402
    //   1682: invokestatic a : (II)Ljava/lang/String;
    //   1685: aastore
    //   1686: dup
    //   1687: bipush #6
    //   1689: sipush #-7463
    //   1692: sipush #-27301
    //   1695: invokestatic a : (II)Ljava/lang/String;
    //   1698: aastore
    //   1699: dup
    //   1700: bipush #7
    //   1702: sipush #-7414
    //   1705: sipush #-28259
    //   1708: invokestatic a : (II)Ljava/lang/String;
    //   1711: aastore
    //   1712: dup
    //   1713: bipush #8
    //   1715: sipush #-7528
    //   1718: sipush #2912
    //   1721: invokestatic a : (II)Ljava/lang/String;
    //   1724: aastore
    //   1725: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1728: invokespecial <init> : (Ljava/util/Collection;)V
    //   1731: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SECURITY_SCHEME_KEYS : Ljava/util/Set;
    //   1734: new java/util/LinkedHashSet
    //   1737: dup
    //   1738: iconst_2
    //   1739: anewarray java/lang/String
    //   1742: dup
    //   1743: iconst_0
    //   1744: sipush #-7642
    //   1747: sipush #4544
    //   1750: invokestatic a : (II)Ljava/lang/String;
    //   1753: aastore
    //   1754: dup
    //   1755: iconst_1
    //   1756: sipush #-7316
    //   1759: sipush #23477
    //   1762: invokestatic a : (II)Ljava/lang/String;
    //   1765: aastore
    //   1766: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1769: invokespecial <init> : (Ljava/util/Collection;)V
    //   1772: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXTERNAL_DOCS_KEYS : Ljava/util/Set;
    //   1775: new java/util/LinkedHashSet
    //   1778: dup
    //   1779: bipush #9
    //   1781: anewarray java/lang/String
    //   1784: dup
    //   1785: iconst_0
    //   1786: sipush #-7494
    //   1789: sipush #-15342
    //   1792: invokestatic a : (II)Ljava/lang/String;
    //   1795: aastore
    //   1796: dup
    //   1797: iconst_1
    //   1798: sipush #-7536
    //   1801: sipush #-29376
    //   1804: invokestatic a : (II)Ljava/lang/String;
    //   1807: aastore
    //   1808: dup
    //   1809: iconst_2
    //   1810: sipush #-7195
    //   1813: sipush #27709
    //   1816: invokestatic a : (II)Ljava/lang/String;
    //   1819: aastore
    //   1820: dup
    //   1821: iconst_3
    //   1822: sipush #-7372
    //   1825: sipush #30748
    //   1828: invokestatic a : (II)Ljava/lang/String;
    //   1831: aastore
    //   1832: dup
    //   1833: iconst_4
    //   1834: sipush #-7445
    //   1837: sipush #7435
    //   1840: invokestatic a : (II)Ljava/lang/String;
    //   1843: aastore
    //   1844: dup
    //   1845: iconst_5
    //   1846: sipush #-7613
    //   1849: sipush #15237
    //   1852: invokestatic a : (II)Ljava/lang/String;
    //   1855: aastore
    //   1856: dup
    //   1857: bipush #6
    //   1859: sipush #-7522
    //   1862: sipush #-11175
    //   1865: invokestatic a : (II)Ljava/lang/String;
    //   1868: aastore
    //   1869: dup
    //   1870: bipush #7
    //   1872: sipush #-7350
    //   1875: sipush #22421
    //   1878: invokestatic a : (II)Ljava/lang/String;
    //   1881: aastore
    //   1882: dup
    //   1883: bipush #8
    //   1885: sipush #-7219
    //   1888: sipush #28309
    //   1891: invokestatic a : (II)Ljava/lang/String;
    //   1894: aastore
    //   1895: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1898: invokespecial <init> : (Ljava/util/Collection;)V
    //   1901: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.COMPONENTS_KEYS : Ljava/util/Set;
    //   1904: new java/util/LinkedHashSet
    //   1907: dup
    //   1908: bipush #36
    //   1910: anewarray java/lang/String
    //   1913: dup
    //   1914: iconst_0
    //   1915: sipush #-7225
    //   1918: sipush #-25842
    //   1921: invokestatic a : (II)Ljava/lang/String;
    //   1924: aastore
    //   1925: dup
    //   1926: iconst_1
    //   1927: sipush #-7213
    //   1930: sipush #-22913
    //   1933: invokestatic a : (II)Ljava/lang/String;
    //   1936: aastore
    //   1937: dup
    //   1938: iconst_2
    //   1939: sipush #-7304
    //   1942: sipush #25510
    //   1945: invokestatic a : (II)Ljava/lang/String;
    //   1948: aastore
    //   1949: dup
    //   1950: iconst_3
    //   1951: sipush #-7561
    //   1954: sipush #15898
    //   1957: invokestatic a : (II)Ljava/lang/String;
    //   1960: aastore
    //   1961: dup
    //   1962: iconst_4
    //   1963: sipush #-7637
    //   1966: sipush #29132
    //   1969: invokestatic a : (II)Ljava/lang/String;
    //   1972: aastore
    //   1973: dup
    //   1974: iconst_5
    //   1975: sipush #-7665
    //   1978: sipush #-32134
    //   1981: invokestatic a : (II)Ljava/lang/String;
    //   1984: aastore
    //   1985: dup
    //   1986: bipush #6
    //   1988: sipush #-7599
    //   1991: sipush #6693
    //   1994: invokestatic a : (II)Ljava/lang/String;
    //   1997: aastore
    //   1998: dup
    //   1999: bipush #7
    //   2001: sipush #-7177
    //   2004: sipush #10733
    //   2007: invokestatic a : (II)Ljava/lang/String;
    //   2010: aastore
    //   2011: dup
    //   2012: bipush #8
    //   2014: sipush #-7428
    //   2017: sipush #23535
    //   2020: invokestatic a : (II)Ljava/lang/String;
    //   2023: aastore
    //   2024: dup
    //   2025: bipush #9
    //   2027: sipush #-7331
    //   2030: sipush #-2396
    //   2033: invokestatic a : (II)Ljava/lang/String;
    //   2036: aastore
    //   2037: dup
    //   2038: bipush #10
    //   2040: sipush #-7511
    //   2043: sipush #-31567
    //   2046: invokestatic a : (II)Ljava/lang/String;
    //   2049: aastore
    //   2050: dup
    //   2051: bipush #11
    //   2053: sipush #-7270
    //   2056: sipush #-19312
    //   2059: invokestatic a : (II)Ljava/lang/String;
    //   2062: aastore
    //   2063: dup
    //   2064: bipush #12
    //   2066: sipush #-7422
    //   2069: sipush #-6552
    //   2072: invokestatic a : (II)Ljava/lang/String;
    //   2075: aastore
    //   2076: dup
    //   2077: bipush #13
    //   2079: sipush #-7321
    //   2082: sipush #-22743
    //   2085: invokestatic a : (II)Ljava/lang/String;
    //   2088: aastore
    //   2089: dup
    //   2090: bipush #14
    //   2092: sipush #-7641
    //   2095: sipush #-6270
    //   2098: invokestatic a : (II)Ljava/lang/String;
    //   2101: aastore
    //   2102: dup
    //   2103: bipush #15
    //   2105: sipush #-7531
    //   2108: sipush #-21830
    //   2111: invokestatic a : (II)Ljava/lang/String;
    //   2114: aastore
    //   2115: dup
    //   2116: bipush #16
    //   2118: sipush #-7194
    //   2121: sipush #-16772
    //   2124: invokestatic a : (II)Ljava/lang/String;
    //   2127: aastore
    //   2128: dup
    //   2129: bipush #17
    //   2131: sipush #-7602
    //   2134: sipush #-21117
    //   2137: invokestatic a : (II)Ljava/lang/String;
    //   2140: aastore
    //   2141: dup
    //   2142: bipush #18
    //   2144: sipush #-7483
    //   2147: sipush #19223
    //   2150: invokestatic a : (II)Ljava/lang/String;
    //   2153: aastore
    //   2154: dup
    //   2155: bipush #19
    //   2157: sipush #-7401
    //   2160: sipush #16891
    //   2163: invokestatic a : (II)Ljava/lang/String;
    //   2166: aastore
    //   2167: dup
    //   2168: bipush #20
    //   2170: sipush #-7395
    //   2173: sipush #2834
    //   2176: invokestatic a : (II)Ljava/lang/String;
    //   2179: aastore
    //   2180: dup
    //   2181: bipush #21
    //   2183: sipush #-7317
    //   2186: bipush #-68
    //   2188: invokestatic a : (II)Ljava/lang/String;
    //   2191: aastore
    //   2192: dup
    //   2193: bipush #22
    //   2195: sipush #-7438
    //   2198: sipush #10289
    //   2201: invokestatic a : (II)Ljava/lang/String;
    //   2204: aastore
    //   2205: dup
    //   2206: bipush #23
    //   2208: sipush #-7670
    //   2211: sipush #31159
    //   2214: invokestatic a : (II)Ljava/lang/String;
    //   2217: aastore
    //   2218: dup
    //   2219: bipush #24
    //   2221: sipush #-7457
    //   2224: sipush #-2444
    //   2227: invokestatic a : (II)Ljava/lang/String;
    //   2230: aastore
    //   2231: dup
    //   2232: bipush #25
    //   2234: sipush #-7431
    //   2237: sipush #10977
    //   2240: invokestatic a : (II)Ljava/lang/String;
    //   2243: aastore
    //   2244: dup
    //   2245: bipush #26
    //   2247: sipush #-7642
    //   2250: sipush #4544
    //   2253: invokestatic a : (II)Ljava/lang/String;
    //   2256: aastore
    //   2257: dup
    //   2258: bipush #27
    //   2260: sipush #-7403
    //   2263: sipush #10714
    //   2266: invokestatic a : (II)Ljava/lang/String;
    //   2269: aastore
    //   2270: dup
    //   2271: bipush #28
    //   2273: sipush #-7600
    //   2276: sipush #-27065
    //   2279: invokestatic a : (II)Ljava/lang/String;
    //   2282: aastore
    //   2283: dup
    //   2284: bipush #29
    //   2286: sipush #-7315
    //   2289: sipush #-2899
    //   2292: invokestatic a : (II)Ljava/lang/String;
    //   2295: aastore
    //   2296: dup
    //   2297: bipush #30
    //   2299: sipush #-7456
    //   2302: sipush #17412
    //   2305: invokestatic a : (II)Ljava/lang/String;
    //   2308: aastore
    //   2309: dup
    //   2310: bipush #31
    //   2312: sipush #-7301
    //   2315: sipush #24161
    //   2318: invokestatic a : (II)Ljava/lang/String;
    //   2321: aastore
    //   2322: dup
    //   2323: bipush #32
    //   2325: sipush #-7489
    //   2328: sipush #-9468
    //   2331: invokestatic a : (II)Ljava/lang/String;
    //   2334: aastore
    //   2335: dup
    //   2336: bipush #33
    //   2338: sipush #-7399
    //   2341: sipush #-12918
    //   2344: invokestatic a : (II)Ljava/lang/String;
    //   2347: aastore
    //   2348: dup
    //   2349: bipush #34
    //   2351: sipush #-7193
    //   2354: sipush #-4890
    //   2357: invokestatic a : (II)Ljava/lang/String;
    //   2360: aastore
    //   2361: dup
    //   2362: bipush #35
    //   2364: sipush #-7363
    //   2367: sipush #9893
    //   2370: invokestatic a : (II)Ljava/lang/String;
    //   2373: aastore
    //   2374: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2377: invokespecial <init> : (Ljava/util/Collection;)V
    //   2380: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SCHEMA_KEYS : Ljava/util/Set;
    //   2383: new java/util/LinkedHashSet
    //   2386: dup
    //   2387: iconst_5
    //   2388: anewarray java/lang/String
    //   2391: dup
    //   2392: iconst_0
    //   2393: sipush #-7225
    //   2396: sipush #-25842
    //   2399: invokestatic a : (II)Ljava/lang/String;
    //   2402: aastore
    //   2403: dup
    //   2404: iconst_1
    //   2405: sipush #-7305
    //   2408: bipush #-57
    //   2410: invokestatic a : (II)Ljava/lang/String;
    //   2413: aastore
    //   2414: dup
    //   2415: iconst_2
    //   2416: sipush #-7642
    //   2419: sipush #4544
    //   2422: invokestatic a : (II)Ljava/lang/String;
    //   2425: aastore
    //   2426: dup
    //   2427: iconst_3
    //   2428: sipush #-7181
    //   2431: sipush #-17116
    //   2434: invokestatic a : (II)Ljava/lang/String;
    //   2437: aastore
    //   2438: dup
    //   2439: iconst_4
    //   2440: sipush #-7647
    //   2443: sipush #24424
    //   2446: invokestatic a : (II)Ljava/lang/String;
    //   2449: aastore
    //   2450: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2453: invokespecial <init> : (Ljava/util/Collection;)V
    //   2456: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXAMPLE_KEYS : Ljava/util/Set;
    //   2459: new java/util/LinkedHashSet
    //   2462: dup
    //   2463: bipush #14
    //   2465: anewarray java/lang/String
    //   2468: dup
    //   2469: iconst_0
    //   2470: sipush #-7225
    //   2473: sipush #-25842
    //   2476: invokestatic a : (II)Ljava/lang/String;
    //   2479: aastore
    //   2480: dup
    //   2481: iconst_1
    //   2482: sipush #-7657
    //   2485: sipush #12130
    //   2488: invokestatic a : (II)Ljava/lang/String;
    //   2491: aastore
    //   2492: dup
    //   2493: iconst_2
    //   2494: sipush #-7614
    //   2497: sipush #-20403
    //   2500: invokestatic a : (II)Ljava/lang/String;
    //   2503: aastore
    //   2504: dup
    //   2505: iconst_3
    //   2506: sipush #-7642
    //   2509: sipush #4544
    //   2512: invokestatic a : (II)Ljava/lang/String;
    //   2515: aastore
    //   2516: dup
    //   2517: iconst_4
    //   2518: sipush #-7194
    //   2521: sipush #-16772
    //   2524: invokestatic a : (II)Ljava/lang/String;
    //   2527: aastore
    //   2528: dup
    //   2529: iconst_5
    //   2530: sipush #-7363
    //   2533: sipush #9893
    //   2536: invokestatic a : (II)Ljava/lang/String;
    //   2539: aastore
    //   2540: dup
    //   2541: bipush #6
    //   2543: sipush #-7598
    //   2546: sipush #17204
    //   2549: invokestatic a : (II)Ljava/lang/String;
    //   2552: aastore
    //   2553: dup
    //   2554: bipush #7
    //   2556: sipush #-7588
    //   2559: sipush #-10573
    //   2562: invokestatic a : (II)Ljava/lang/String;
    //   2565: aastore
    //   2566: dup
    //   2567: bipush #8
    //   2569: sipush #-7354
    //   2572: sipush #8505
    //   2575: invokestatic a : (II)Ljava/lang/String;
    //   2578: aastore
    //   2579: dup
    //   2580: bipush #9
    //   2582: sipush #-7407
    //   2585: sipush #11024
    //   2588: invokestatic a : (II)Ljava/lang/String;
    //   2591: aastore
    //   2592: dup
    //   2593: bipush #10
    //   2595: sipush #-7384
    //   2598: sipush #2478
    //   2601: invokestatic a : (II)Ljava/lang/String;
    //   2604: aastore
    //   2605: dup
    //   2606: bipush #11
    //   2608: sipush #-7193
    //   2611: sipush #-4890
    //   2614: invokestatic a : (II)Ljava/lang/String;
    //   2617: aastore
    //   2618: dup
    //   2619: bipush #12
    //   2621: sipush #-7372
    //   2624: sipush #30748
    //   2627: invokestatic a : (II)Ljava/lang/String;
    //   2630: aastore
    //   2631: dup
    //   2632: bipush #13
    //   2634: sipush #-7402
    //   2637: sipush #23593
    //   2640: invokestatic a : (II)Ljava/lang/String;
    //   2643: aastore
    //   2644: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2647: invokespecial <init> : (Ljava/util/Collection;)V
    //   2650: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.HEADER_KEYS : Ljava/util/Set;
    //   2653: new java/util/LinkedHashSet
    //   2656: dup
    //   2657: bipush #7
    //   2659: anewarray java/lang/String
    //   2662: dup
    //   2663: iconst_0
    //   2664: sipush #-7225
    //   2667: sipush #-25842
    //   2670: invokestatic a : (II)Ljava/lang/String;
    //   2673: aastore
    //   2674: dup
    //   2675: iconst_1
    //   2676: sipush #-7269
    //   2679: sipush #8592
    //   2682: invokestatic a : (II)Ljava/lang/String;
    //   2685: aastore
    //   2686: dup
    //   2687: iconst_2
    //   2688: sipush #-7615
    //   2691: sipush #15504
    //   2694: invokestatic a : (II)Ljava/lang/String;
    //   2697: aastore
    //   2698: dup
    //   2699: iconst_3
    //   2700: sipush #-7195
    //   2703: sipush #27709
    //   2706: invokestatic a : (II)Ljava/lang/String;
    //   2709: aastore
    //   2710: dup
    //   2711: iconst_4
    //   2712: sipush #-7309
    //   2715: sipush #2463
    //   2718: invokestatic a : (II)Ljava/lang/String;
    //   2721: aastore
    //   2722: dup
    //   2723: iconst_5
    //   2724: sipush #-7642
    //   2727: sipush #4544
    //   2730: invokestatic a : (II)Ljava/lang/String;
    //   2733: aastore
    //   2734: dup
    //   2735: bipush #6
    //   2737: sipush #-7313
    //   2740: sipush #-30034
    //   2743: invokestatic a : (II)Ljava/lang/String;
    //   2746: aastore
    //   2747: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2750: invokespecial <init> : (Ljava/util/Collection;)V
    //   2753: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LINK_KEYS : Ljava/util/Set;
    //   2756: new java/util/LinkedHashSet
    //   2759: dup
    //   2760: iconst_4
    //   2761: anewarray java/lang/String
    //   2764: dup
    //   2765: iconst_0
    //   2766: sipush #-7384
    //   2769: sipush #2478
    //   2772: invokestatic a : (II)Ljava/lang/String;
    //   2775: aastore
    //   2776: dup
    //   2777: iconst_1
    //   2778: sipush #-7193
    //   2781: sipush #-4890
    //   2784: invokestatic a : (II)Ljava/lang/String;
    //   2787: aastore
    //   2788: dup
    //   2789: iconst_2
    //   2790: sipush #-7372
    //   2793: sipush #30748
    //   2796: invokestatic a : (II)Ljava/lang/String;
    //   2799: aastore
    //   2800: dup
    //   2801: iconst_3
    //   2802: sipush #-7677
    //   2805: sipush #23837
    //   2808: invokestatic a : (II)Ljava/lang/String;
    //   2811: aastore
    //   2812: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2815: invokespecial <init> : (Ljava/util/Collection;)V
    //   2818: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.MEDIATYPE_KEYS : Ljava/util/Set;
    //   2821: new java/util/LinkedHashSet
    //   2824: dup
    //   2825: iconst_5
    //   2826: anewarray java/lang/String
    //   2829: dup
    //   2830: iconst_0
    //   2831: sipush #-7657
    //   2834: sipush #12130
    //   2837: invokestatic a : (II)Ljava/lang/String;
    //   2840: aastore
    //   2841: dup
    //   2842: iconst_1
    //   2843: sipush #-7560
    //   2846: sipush #10338
    //   2849: invokestatic a : (II)Ljava/lang/String;
    //   2852: aastore
    //   2853: dup
    //   2854: iconst_2
    //   2855: sipush #-7519
    //   2858: sipush #-10372
    //   2861: invokestatic a : (II)Ljava/lang/String;
    //   2864: aastore
    //   2865: dup
    //   2866: iconst_3
    //   2867: sipush #-7394
    //   2870: sipush #17843
    //   2873: invokestatic a : (II)Ljava/lang/String;
    //   2876: aastore
    //   2877: dup
    //   2878: iconst_4
    //   2879: sipush #-7559
    //   2882: sipush #-2972
    //   2885: invokestatic a : (II)Ljava/lang/String;
    //   2888: aastore
    //   2889: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2892: invokespecial <init> : (Ljava/util/Collection;)V
    //   2895: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.XML_KEYS : Ljava/util/Set;
    //   2898: new java/util/LinkedHashSet
    //   2901: dup
    //   2902: iconst_4
    //   2903: anewarray java/lang/String
    //   2906: dup
    //   2907: iconst_0
    //   2908: sipush #-7373
    //   2911: sipush #-4803
    //   2914: invokestatic a : (II)Ljava/lang/String;
    //   2917: aastore
    //   2918: dup
    //   2919: iconst_1
    //   2920: sipush #-7453
    //   2923: sipush #14200
    //   2926: invokestatic a : (II)Ljava/lang/String;
    //   2929: aastore
    //   2930: dup
    //   2931: iconst_2
    //   2932: sipush #-7411
    //   2935: sipush #-18714
    //   2938: invokestatic a : (II)Ljava/lang/String;
    //   2941: aastore
    //   2942: dup
    //   2943: iconst_3
    //   2944: sipush #-7182
    //   2947: sipush #3229
    //   2950: invokestatic a : (II)Ljava/lang/String;
    //   2953: aastore
    //   2954: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2957: invokespecial <init> : (Ljava/util/Collection;)V
    //   2960: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOW_KEYS : Ljava/util/Set;
    //   2963: new java/util/LinkedHashSet
    //   2966: dup
    //   2967: iconst_4
    //   2968: anewarray java/lang/String
    //   2971: dup
    //   2972: iconst_0
    //   2973: sipush #-7409
    //   2976: sipush #2196
    //   2979: invokestatic a : (II)Ljava/lang/String;
    //   2982: aastore
    //   2983: dup
    //   2984: iconst_1
    //   2985: sipush #-7396
    //   2988: sipush #21758
    //   2991: invokestatic a : (II)Ljava/lang/String;
    //   2994: aastore
    //   2995: dup
    //   2996: iconst_2
    //   2997: sipush #-7232
    //   3000: sipush #-20150
    //   3003: invokestatic a : (II)Ljava/lang/String;
    //   3006: aastore
    //   3007: dup
    //   3008: iconst_3
    //   3009: sipush #-7459
    //   3012: sipush #-23198
    //   3015: invokestatic a : (II)Ljava/lang/String;
    //   3018: aastore
    //   3019: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3022: invokespecial <init> : (Ljava/util/Collection;)V
    //   3025: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOWS_KEYS : Ljava/util/Set;
    //   3028: new java/util/LinkedHashSet
    //   3031: dup
    //   3032: iconst_5
    //   3033: anewarray java/lang/String
    //   3036: dup
    //   3037: iconst_0
    //   3038: sipush #-7628
    //   3041: sipush #-29411
    //   3044: invokestatic a : (II)Ljava/lang/String;
    //   3047: aastore
    //   3048: dup
    //   3049: iconst_1
    //   3050: sipush #-7613
    //   3053: sipush #15237
    //   3056: invokestatic a : (II)Ljava/lang/String;
    //   3059: aastore
    //   3060: dup
    //   3061: iconst_2
    //   3062: sipush #-7588
    //   3065: sipush #-10573
    //   3068: invokestatic a : (II)Ljava/lang/String;
    //   3071: aastore
    //   3072: dup
    //   3073: iconst_3
    //   3074: sipush #-7354
    //   3077: sipush #8505
    //   3080: invokestatic a : (II)Ljava/lang/String;
    //   3083: aastore
    //   3084: dup
    //   3085: iconst_4
    //   3086: sipush #-7407
    //   3089: sipush #11024
    //   3092: invokestatic a : (II)Ljava/lang/String;
    //   3095: aastore
    //   3096: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3099: invokespecial <init> : (Ljava/util/Collection;)V
    //   3102: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ENCODING_KEYS : Ljava/util/Set;
    //   3105: new java/util/LinkedHashSet
    //   3108: dup
    //   3109: bipush #10
    //   3111: anewarray java/lang/String
    //   3114: dup
    //   3115: iconst_0
    //   3116: sipush #-7368
    //   3119: sipush #-12912
    //   3122: invokestatic a : (II)Ljava/lang/String;
    //   3125: aastore
    //   3126: dup
    //   3127: iconst_1
    //   3128: sipush #-7336
    //   3131: sipush #-3897
    //   3134: invokestatic a : (II)Ljava/lang/String;
    //   3137: aastore
    //   3138: dup
    //   3139: iconst_2
    //   3140: sipush #-7308
    //   3143: sipush #-11859
    //   3146: invokestatic a : (II)Ljava/lang/String;
    //   3149: aastore
    //   3150: dup
    //   3151: iconst_3
    //   3152: sipush #-7299
    //   3155: sipush #26635
    //   3158: invokestatic a : (II)Ljava/lang/String;
    //   3161: aastore
    //   3162: dup
    //   3163: iconst_4
    //   3164: sipush #-7303
    //   3167: sipush #-32569
    //   3170: invokestatic a : (II)Ljava/lang/String;
    //   3173: aastore
    //   3174: dup
    //   3175: iconst_5
    //   3176: sipush #-7424
    //   3179: sipush #-12592
    //   3182: invokestatic a : (II)Ljava/lang/String;
    //   3185: aastore
    //   3186: dup
    //   3187: bipush #6
    //   3189: sipush #-7222
    //   3192: sipush #12152
    //   3195: invokestatic a : (II)Ljava/lang/String;
    //   3198: aastore
    //   3199: dup
    //   3200: bipush #7
    //   3202: sipush #-7399
    //   3205: sipush #-12918
    //   3208: invokestatic a : (II)Ljava/lang/String;
    //   3211: aastore
    //   3212: dup
    //   3213: bipush #8
    //   3215: sipush #-7487
    //   3218: sipush #-27930
    //   3221: invokestatic a : (II)Ljava/lang/String;
    //   3224: aastore
    //   3225: dup
    //   3226: bipush #9
    //   3228: sipush #-7512
    //   3231: sipush #-17499
    //   3234: invokestatic a : (II)Ljava/lang/String;
    //   3237: aastore
    //   3238: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3241: invokespecial <init> : (Ljava/util/Collection;)V
    //   3244: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ROOT_KEYS_31 : Ljava/util/Set;
    //   3247: new java/util/LinkedHashSet
    //   3250: dup
    //   3251: iconst_2
    //   3252: anewarray java/lang/String
    //   3255: dup
    //   3256: iconst_0
    //   3257: sipush #-7476
    //   3260: sipush #32474
    //   3263: invokestatic a : (II)Ljava/lang/String;
    //   3266: aastore
    //   3267: dup
    //   3268: iconst_1
    //   3269: sipush #-7646
    //   3272: sipush #-20124
    //   3275: invokestatic a : (II)Ljava/lang/String;
    //   3278: aastore
    //   3279: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3282: invokespecial <init> : (Ljava/util/Collection;)V
    //   3285: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RESERVED_KEYWORDS_31 : Ljava/util/Set;
    //   3288: new java/util/LinkedHashSet
    //   3291: dup
    //   3292: bipush #7
    //   3294: anewarray java/lang/String
    //   3297: dup
    //   3298: iconst_0
    //   3299: sipush #-7213
    //   3302: sipush #-22913
    //   3305: invokestatic a : (II)Ljava/lang/String;
    //   3308: aastore
    //   3309: dup
    //   3310: iconst_1
    //   3311: sipush #-7305
    //   3314: bipush #-57
    //   3316: invokestatic a : (II)Ljava/lang/String;
    //   3319: aastore
    //   3320: dup
    //   3321: iconst_2
    //   3322: sipush #-7642
    //   3325: sipush #4544
    //   3328: invokestatic a : (II)Ljava/lang/String;
    //   3331: aastore
    //   3332: dup
    //   3333: iconst_3
    //   3334: sipush #-7565
    //   3337: sipush #29759
    //   3340: invokestatic a : (II)Ljava/lang/String;
    //   3343: aastore
    //   3344: dup
    //   3345: iconst_4
    //   3346: sipush #-7447
    //   3349: sipush #-28548
    //   3352: invokestatic a : (II)Ljava/lang/String;
    //   3355: aastore
    //   3356: dup
    //   3357: iconst_5
    //   3358: sipush #-7540
    //   3361: sipush #-9571
    //   3364: invokestatic a : (II)Ljava/lang/String;
    //   3367: aastore
    //   3368: dup
    //   3369: bipush #6
    //   3371: sipush #-7374
    //   3374: sipush #-28338
    //   3377: invokestatic a : (II)Ljava/lang/String;
    //   3380: aastore
    //   3381: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3384: invokespecial <init> : (Ljava/util/Collection;)V
    //   3387: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.INFO_KEYS_31 : Ljava/util/Set;
    //   3390: new java/util/LinkedHashSet
    //   3393: dup
    //   3394: iconst_3
    //   3395: anewarray java/lang/String
    //   3398: dup
    //   3399: iconst_0
    //   3400: sipush #-7657
    //   3403: sipush #12130
    //   3406: invokestatic a : (II)Ljava/lang/String;
    //   3409: aastore
    //   3410: dup
    //   3411: iconst_1
    //   3412: sipush #-7316
    //   3415: sipush #23477
    //   3418: invokestatic a : (II)Ljava/lang/String;
    //   3421: aastore
    //   3422: dup
    //   3423: iconst_2
    //   3424: sipush #-7371
    //   3427: sipush #21017
    //   3430: invokestatic a : (II)Ljava/lang/String;
    //   3433: aastore
    //   3434: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3437: invokespecial <init> : (Ljava/util/Collection;)V
    //   3440: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.CONTACT_KEYS_31 : Ljava/util/Set;
    //   3443: new java/util/LinkedHashSet
    //   3446: dup
    //   3447: iconst_3
    //   3448: anewarray java/lang/String
    //   3451: dup
    //   3452: iconst_0
    //   3453: sipush #-7657
    //   3456: sipush #12130
    //   3459: invokestatic a : (II)Ljava/lang/String;
    //   3462: aastore
    //   3463: dup
    //   3464: iconst_1
    //   3465: sipush #-7316
    //   3468: sipush #23477
    //   3471: invokestatic a : (II)Ljava/lang/String;
    //   3474: aastore
    //   3475: dup
    //   3476: iconst_2
    //   3477: sipush #-7429
    //   3480: sipush #15041
    //   3483: invokestatic a : (II)Ljava/lang/String;
    //   3486: aastore
    //   3487: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3490: invokespecial <init> : (Ljava/util/Collection;)V
    //   3493: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LICENSE_KEYS_31 : Ljava/util/Set;
    //   3496: new java/util/LinkedHashSet
    //   3499: dup
    //   3500: iconst_3
    //   3501: anewarray java/lang/String
    //   3504: dup
    //   3505: iconst_0
    //   3506: sipush #-7642
    //   3509: sipush #4544
    //   3512: invokestatic a : (II)Ljava/lang/String;
    //   3515: aastore
    //   3516: dup
    //   3517: iconst_1
    //   3518: sipush #-7657
    //   3521: sipush #12130
    //   3524: invokestatic a : (II)Ljava/lang/String;
    //   3527: aastore
    //   3528: dup
    //   3529: iconst_2
    //   3530: sipush #-7399
    //   3533: sipush #-12918
    //   3536: invokestatic a : (II)Ljava/lang/String;
    //   3539: aastore
    //   3540: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3543: invokespecial <init> : (Ljava/util/Collection;)V
    //   3546: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.TAG_KEYS_31 : Ljava/util/Set;
    //   3549: new java/util/LinkedHashSet
    //   3552: dup
    //   3553: iconst_5
    //   3554: anewarray java/lang/String
    //   3557: dup
    //   3558: iconst_0
    //   3559: sipush #-7225
    //   3562: sipush #-25842
    //   3565: invokestatic a : (II)Ljava/lang/String;
    //   3568: aastore
    //   3569: dup
    //   3570: iconst_1
    //   3571: sipush #-7642
    //   3574: sipush #4544
    //   3577: invokestatic a : (II)Ljava/lang/String;
    //   3580: aastore
    //   3581: dup
    //   3582: iconst_2
    //   3583: sipush #-7613
    //   3586: sipush #15237
    //   3589: invokestatic a : (II)Ljava/lang/String;
    //   3592: aastore
    //   3593: dup
    //   3594: iconst_3
    //   3595: sipush #-7402
    //   3598: sipush #23593
    //   3601: invokestatic a : (II)Ljava/lang/String;
    //   3604: aastore
    //   3605: dup
    //   3606: iconst_4
    //   3607: sipush #-7350
    //   3610: sipush #22421
    //   3613: invokestatic a : (II)Ljava/lang/String;
    //   3616: aastore
    //   3617: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3620: invokespecial <init> : (Ljava/util/Collection;)V
    //   3623: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RESPONSE_KEYS_31 : Ljava/util/Set;
    //   3626: new java/util/LinkedHashSet
    //   3629: dup
    //   3630: iconst_3
    //   3631: anewarray java/lang/String
    //   3634: dup
    //   3635: iconst_0
    //   3636: sipush #-7316
    //   3639: sipush #23477
    //   3642: invokestatic a : (II)Ljava/lang/String;
    //   3645: aastore
    //   3646: dup
    //   3647: iconst_1
    //   3648: sipush #-7642
    //   3651: sipush #4544
    //   3654: invokestatic a : (II)Ljava/lang/String;
    //   3657: aastore
    //   3658: dup
    //   3659: iconst_2
    //   3660: sipush #-7265
    //   3663: sipush #10752
    //   3666: invokestatic a : (II)Ljava/lang/String;
    //   3669: aastore
    //   3670: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3673: invokespecial <init> : (Ljava/util/Collection;)V
    //   3676: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_KEYS_31 : Ljava/util/Set;
    //   3679: new java/util/LinkedHashSet
    //   3682: dup
    //   3683: iconst_3
    //   3684: anewarray java/lang/String
    //   3687: dup
    //   3688: iconst_0
    //   3689: sipush #-7602
    //   3692: sipush #-21117
    //   3695: invokestatic a : (II)Ljava/lang/String;
    //   3698: aastore
    //   3699: dup
    //   3700: iconst_1
    //   3701: sipush #-7403
    //   3704: sipush #10714
    //   3707: invokestatic a : (II)Ljava/lang/String;
    //   3710: aastore
    //   3711: dup
    //   3712: iconst_2
    //   3713: sipush #-7642
    //   3716: sipush #4544
    //   3719: invokestatic a : (II)Ljava/lang/String;
    //   3722: aastore
    //   3723: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3726: invokespecial <init> : (Ljava/util/Collection;)V
    //   3729: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_VARIABLE_KEYS_31 : Ljava/util/Set;
    //   3732: new java/util/LinkedHashSet
    //   3735: dup
    //   3736: bipush #13
    //   3738: anewarray java/lang/String
    //   3741: dup
    //   3742: iconst_0
    //   3743: sipush #-7225
    //   3746: sipush #-25842
    //   3749: invokestatic a : (II)Ljava/lang/String;
    //   3752: aastore
    //   3753: dup
    //   3754: iconst_1
    //   3755: sipush #-7305
    //   3758: bipush #-57
    //   3760: invokestatic a : (II)Ljava/lang/String;
    //   3763: aastore
    //   3764: dup
    //   3765: iconst_2
    //   3766: sipush #-7642
    //   3769: sipush #4544
    //   3772: invokestatic a : (II)Ljava/lang/String;
    //   3775: aastore
    //   3776: dup
    //   3777: iconst_3
    //   3778: sipush #-7582
    //   3781: sipush #-24695
    //   3784: invokestatic a : (II)Ljava/lang/String;
    //   3787: aastore
    //   3788: dup
    //   3789: iconst_4
    //   3790: sipush #-7185
    //   3793: sipush #21732
    //   3796: invokestatic a : (II)Ljava/lang/String;
    //   3799: aastore
    //   3800: dup
    //   3801: iconst_5
    //   3802: sipush #-7339
    //   3805: sipush #-17030
    //   3808: invokestatic a : (II)Ljava/lang/String;
    //   3811: aastore
    //   3812: dup
    //   3813: bipush #6
    //   3815: sipush #-7415
    //   3818: sipush #6083
    //   3821: invokestatic a : (II)Ljava/lang/String;
    //   3824: aastore
    //   3825: dup
    //   3826: bipush #7
    //   3828: sipush #-7216
    //   3831: sipush #-16989
    //   3834: invokestatic a : (II)Ljava/lang/String;
    //   3837: aastore
    //   3838: dup
    //   3839: bipush #8
    //   3841: sipush #-7323
    //   3844: sipush #-28767
    //   3847: invokestatic a : (II)Ljava/lang/String;
    //   3850: aastore
    //   3851: dup
    //   3852: bipush #9
    //   3854: sipush #-7324
    //   3857: sipush #-26899
    //   3860: invokestatic a : (II)Ljava/lang/String;
    //   3863: aastore
    //   3864: dup
    //   3865: bipush #10
    //   3867: sipush #-7449
    //   3870: sipush #18540
    //   3873: invokestatic a : (II)Ljava/lang/String;
    //   3876: aastore
    //   3877: dup
    //   3878: bipush #11
    //   3880: sipush #-7308
    //   3883: sipush #-11859
    //   3886: invokestatic a : (II)Ljava/lang/String;
    //   3889: aastore
    //   3890: dup
    //   3891: bipush #12
    //   3893: sipush #-7195
    //   3896: sipush #27709
    //   3899: invokestatic a : (II)Ljava/lang/String;
    //   3902: aastore
    //   3903: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   3906: invokespecial <init> : (Ljava/util/Collection;)V
    //   3909: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PATHITEM_KEYS_31 : Ljava/util/Set;
    //   3912: new java/util/LinkedHashSet
    //   3915: dup
    //   3916: bipush #12
    //   3918: anewarray java/lang/String
    //   3921: dup
    //   3922: iconst_0
    //   3923: sipush #-7222
    //   3926: sipush #12152
    //   3929: invokestatic a : (II)Ljava/lang/String;
    //   3932: aastore
    //   3933: dup
    //   3934: iconst_1
    //   3935: sipush #-7305
    //   3938: bipush #-57
    //   3940: invokestatic a : (II)Ljava/lang/String;
    //   3943: aastore
    //   3944: dup
    //   3945: iconst_2
    //   3946: sipush #-7642
    //   3949: sipush #4544
    //   3952: invokestatic a : (II)Ljava/lang/String;
    //   3955: aastore
    //   3956: dup
    //   3957: iconst_3
    //   3958: sipush #-7399
    //   3961: sipush #-12918
    //   3964: invokestatic a : (II)Ljava/lang/String;
    //   3967: aastore
    //   3968: dup
    //   3969: iconst_4
    //   3970: sipush #-7615
    //   3973: sipush #15504
    //   3976: invokestatic a : (II)Ljava/lang/String;
    //   3979: aastore
    //   3980: dup
    //   3981: iconst_5
    //   3982: sipush #-7195
    //   3985: sipush #27709
    //   3988: invokestatic a : (II)Ljava/lang/String;
    //   3991: aastore
    //   3992: dup
    //   3993: bipush #6
    //   3995: sipush #-7309
    //   3998: sipush #2463
    //   4001: invokestatic a : (II)Ljava/lang/String;
    //   4004: aastore
    //   4005: dup
    //   4006: bipush #7
    //   4008: sipush #-7536
    //   4011: sipush #-29376
    //   4014: invokestatic a : (II)Ljava/lang/String;
    //   4017: aastore
    //   4018: dup
    //   4019: bipush #8
    //   4021: sipush #-7219
    //   4024: sipush #28309
    //   4027: invokestatic a : (II)Ljava/lang/String;
    //   4030: aastore
    //   4031: dup
    //   4032: bipush #9
    //   4034: sipush #-7363
    //   4037: sipush #9893
    //   4040: invokestatic a : (II)Ljava/lang/String;
    //   4043: aastore
    //   4044: dup
    //   4045: bipush #10
    //   4047: sipush #-7424
    //   4050: sipush #-12592
    //   4053: invokestatic a : (II)Ljava/lang/String;
    //   4056: aastore
    //   4057: dup
    //   4058: bipush #11
    //   4060: sipush #-7308
    //   4063: sipush #-11859
    //   4066: invokestatic a : (II)Ljava/lang/String;
    //   4069: aastore
    //   4070: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4073: invokespecial <init> : (Ljava/util/Collection;)V
    //   4076: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OPERATION_KEYS_31 : Ljava/util/Set;
    //   4079: new java/util/LinkedHashSet
    //   4082: dup
    //   4083: bipush #14
    //   4085: anewarray java/lang/String
    //   4088: dup
    //   4089: iconst_0
    //   4090: sipush #-7225
    //   4093: sipush #-25842
    //   4096: invokestatic a : (II)Ljava/lang/String;
    //   4099: aastore
    //   4100: dup
    //   4101: iconst_1
    //   4102: sipush #-7657
    //   4105: sipush #12130
    //   4108: invokestatic a : (II)Ljava/lang/String;
    //   4111: aastore
    //   4112: dup
    //   4113: iconst_2
    //   4114: sipush #-7614
    //   4117: sipush #-20403
    //   4120: invokestatic a : (II)Ljava/lang/String;
    //   4123: aastore
    //   4124: dup
    //   4125: iconst_3
    //   4126: sipush #-7642
    //   4129: sipush #4544
    //   4132: invokestatic a : (II)Ljava/lang/String;
    //   4135: aastore
    //   4136: dup
    //   4137: iconst_4
    //   4138: sipush #-7194
    //   4141: sipush #-16772
    //   4144: invokestatic a : (II)Ljava/lang/String;
    //   4147: aastore
    //   4148: dup
    //   4149: iconst_5
    //   4150: sipush #-7363
    //   4153: sipush #9893
    //   4156: invokestatic a : (II)Ljava/lang/String;
    //   4159: aastore
    //   4160: dup
    //   4161: bipush #6
    //   4163: sipush #-7598
    //   4166: sipush #17204
    //   4169: invokestatic a : (II)Ljava/lang/String;
    //   4172: aastore
    //   4173: dup
    //   4174: bipush #7
    //   4176: sipush #-7588
    //   4179: sipush #-10573
    //   4182: invokestatic a : (II)Ljava/lang/String;
    //   4185: aastore
    //   4186: dup
    //   4187: bipush #8
    //   4189: sipush #-7354
    //   4192: sipush #8505
    //   4195: invokestatic a : (II)Ljava/lang/String;
    //   4198: aastore
    //   4199: dup
    //   4200: bipush #9
    //   4202: sipush #-7407
    //   4205: sipush #11024
    //   4208: invokestatic a : (II)Ljava/lang/String;
    //   4211: aastore
    //   4212: dup
    //   4213: bipush #10
    //   4215: sipush #-7384
    //   4218: sipush #2478
    //   4221: invokestatic a : (II)Ljava/lang/String;
    //   4224: aastore
    //   4225: dup
    //   4226: bipush #11
    //   4228: sipush #-7193
    //   4231: sipush #-4890
    //   4234: invokestatic a : (II)Ljava/lang/String;
    //   4237: aastore
    //   4238: dup
    //   4239: bipush #12
    //   4241: sipush #-7372
    //   4244: sipush #30748
    //   4247: invokestatic a : (II)Ljava/lang/String;
    //   4250: aastore
    //   4251: dup
    //   4252: bipush #13
    //   4254: sipush #-7402
    //   4257: sipush #23593
    //   4260: invokestatic a : (II)Ljava/lang/String;
    //   4263: aastore
    //   4264: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4267: invokespecial <init> : (Ljava/util/Collection;)V
    //   4270: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PARAMETER_KEYS_31 : Ljava/util/Set;
    //   4273: new java/util/LinkedHashSet
    //   4276: dup
    //   4277: iconst_4
    //   4278: anewarray java/lang/String
    //   4281: dup
    //   4282: iconst_0
    //   4283: sipush #-7225
    //   4286: sipush #-25842
    //   4289: invokestatic a : (II)Ljava/lang/String;
    //   4292: aastore
    //   4293: dup
    //   4294: iconst_1
    //   4295: sipush #-7642
    //   4298: sipush #4544
    //   4301: invokestatic a : (II)Ljava/lang/String;
    //   4304: aastore
    //   4305: dup
    //   4306: iconst_2
    //   4307: sipush #-7402
    //   4310: sipush #23593
    //   4313: invokestatic a : (II)Ljava/lang/String;
    //   4316: aastore
    //   4317: dup
    //   4318: iconst_3
    //   4319: sipush #-7194
    //   4322: sipush #-16772
    //   4325: invokestatic a : (II)Ljava/lang/String;
    //   4328: aastore
    //   4329: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4332: invokespecial <init> : (Ljava/util/Collection;)V
    //   4335: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.REQUEST_BODY_KEYS_31 : Ljava/util/Set;
    //   4338: new java/util/LinkedHashSet
    //   4341: dup
    //   4342: bipush #9
    //   4344: anewarray java/lang/String
    //   4347: dup
    //   4348: iconst_0
    //   4349: sipush #-7225
    //   4352: sipush #-25842
    //   4355: invokestatic a : (II)Ljava/lang/String;
    //   4358: aastore
    //   4359: dup
    //   4360: iconst_1
    //   4361: sipush #-7483
    //   4364: sipush #19223
    //   4367: invokestatic a : (II)Ljava/lang/String;
    //   4370: aastore
    //   4371: dup
    //   4372: iconst_2
    //   4373: sipush #-7657
    //   4376: sipush #12130
    //   4379: invokestatic a : (II)Ljava/lang/String;
    //   4382: aastore
    //   4383: dup
    //   4384: iconst_3
    //   4385: sipush #-7614
    //   4388: sipush #-20403
    //   4391: invokestatic a : (II)Ljava/lang/String;
    //   4394: aastore
    //   4395: dup
    //   4396: iconst_4
    //   4397: sipush #-7642
    //   4400: sipush #4544
    //   4403: invokestatic a : (II)Ljava/lang/String;
    //   4406: aastore
    //   4407: dup
    //   4408: iconst_5
    //   4409: sipush #-7594
    //   4412: sipush #19402
    //   4415: invokestatic a : (II)Ljava/lang/String;
    //   4418: aastore
    //   4419: dup
    //   4420: bipush #6
    //   4422: sipush #-7463
    //   4425: sipush #-27301
    //   4428: invokestatic a : (II)Ljava/lang/String;
    //   4431: aastore
    //   4432: dup
    //   4433: bipush #7
    //   4435: sipush #-7414
    //   4438: sipush #-28259
    //   4441: invokestatic a : (II)Ljava/lang/String;
    //   4444: aastore
    //   4445: dup
    //   4446: bipush #8
    //   4448: sipush #-7528
    //   4451: sipush #2912
    //   4454: invokestatic a : (II)Ljava/lang/String;
    //   4457: aastore
    //   4458: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4461: invokespecial <init> : (Ljava/util/Collection;)V
    //   4464: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SECURITY_SCHEME_KEYS_31 : Ljava/util/Set;
    //   4467: new java/util/LinkedHashSet
    //   4470: dup
    //   4471: iconst_2
    //   4472: anewarray java/lang/String
    //   4475: dup
    //   4476: iconst_0
    //   4477: sipush #-7642
    //   4480: sipush #4544
    //   4483: invokestatic a : (II)Ljava/lang/String;
    //   4486: aastore
    //   4487: dup
    //   4488: iconst_1
    //   4489: sipush #-7316
    //   4492: sipush #23477
    //   4495: invokestatic a : (II)Ljava/lang/String;
    //   4498: aastore
    //   4499: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4502: invokespecial <init> : (Ljava/util/Collection;)V
    //   4505: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXTERNAL_DOCS_KEYS_31 : Ljava/util/Set;
    //   4508: new java/util/LinkedHashSet
    //   4511: dup
    //   4512: bipush #10
    //   4514: anewarray java/lang/String
    //   4517: dup
    //   4518: iconst_0
    //   4519: sipush #-7494
    //   4522: sipush #-15342
    //   4525: invokestatic a : (II)Ljava/lang/String;
    //   4528: aastore
    //   4529: dup
    //   4530: iconst_1
    //   4531: sipush #-7536
    //   4534: sipush #-29376
    //   4537: invokestatic a : (II)Ljava/lang/String;
    //   4540: aastore
    //   4541: dup
    //   4542: iconst_2
    //   4543: sipush #-7170
    //   4546: sipush #-21429
    //   4549: invokestatic a : (II)Ljava/lang/String;
    //   4552: aastore
    //   4553: dup
    //   4554: iconst_3
    //   4555: sipush #-7195
    //   4558: sipush #27709
    //   4561: invokestatic a : (II)Ljava/lang/String;
    //   4564: aastore
    //   4565: dup
    //   4566: iconst_4
    //   4567: sipush #-7372
    //   4570: sipush #30748
    //   4573: invokestatic a : (II)Ljava/lang/String;
    //   4576: aastore
    //   4577: dup
    //   4578: iconst_5
    //   4579: sipush #-7445
    //   4582: sipush #7435
    //   4585: invokestatic a : (II)Ljava/lang/String;
    //   4588: aastore
    //   4589: dup
    //   4590: bipush #6
    //   4592: sipush #-7613
    //   4595: sipush #15237
    //   4598: invokestatic a : (II)Ljava/lang/String;
    //   4601: aastore
    //   4602: dup
    //   4603: bipush #7
    //   4605: sipush #-7522
    //   4608: sipush #-11175
    //   4611: invokestatic a : (II)Ljava/lang/String;
    //   4614: aastore
    //   4615: dup
    //   4616: bipush #8
    //   4618: sipush #-7350
    //   4621: sipush #22421
    //   4624: invokestatic a : (II)Ljava/lang/String;
    //   4627: aastore
    //   4628: dup
    //   4629: bipush #9
    //   4631: sipush #-7219
    //   4634: sipush #28309
    //   4637: invokestatic a : (II)Ljava/lang/String;
    //   4640: aastore
    //   4641: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   4644: invokespecial <init> : (Ljava/util/Collection;)V
    //   4647: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.COMPONENTS_KEYS_31 : Ljava/util/Set;
    //   4650: new java/util/LinkedHashSet
    //   4653: dup
    //   4654: bipush #59
    //   4656: anewarray java/lang/String
    //   4659: dup
    //   4660: iconst_0
    //   4661: sipush #-7225
    //   4664: sipush #-25842
    //   4667: invokestatic a : (II)Ljava/lang/String;
    //   4670: aastore
    //   4671: dup
    //   4672: iconst_1
    //   4673: sipush #-7213
    //   4676: sipush #-22913
    //   4679: invokestatic a : (II)Ljava/lang/String;
    //   4682: aastore
    //   4683: dup
    //   4684: iconst_2
    //   4685: sipush #-7300
    //   4688: sipush #-23511
    //   4691: invokestatic a : (II)Ljava/lang/String;
    //   4694: aastore
    //   4695: dup
    //   4696: iconst_3
    //   4697: sipush #-7186
    //   4700: sipush #-10041
    //   4703: invokestatic a : (II)Ljava/lang/String;
    //   4706: aastore
    //   4707: dup
    //   4708: iconst_4
    //   4709: sipush #-7322
    //   4712: sipush #31547
    //   4715: invokestatic a : (II)Ljava/lang/String;
    //   4718: aastore
    //   4719: dup
    //   4720: iconst_5
    //   4721: sipush #-7665
    //   4724: sipush #-32134
    //   4727: invokestatic a : (II)Ljava/lang/String;
    //   4730: aastore
    //   4731: dup
    //   4732: bipush #6
    //   4734: sipush #-7380
    //   4737: sipush #12327
    //   4740: invokestatic a : (II)Ljava/lang/String;
    //   4743: aastore
    //   4744: dup
    //   4745: bipush #7
    //   4747: sipush #-7177
    //   4750: sipush #10733
    //   4753: invokestatic a : (II)Ljava/lang/String;
    //   4756: aastore
    //   4757: dup
    //   4758: bipush #8
    //   4760: sipush #-7593
    //   4763: sipush #12169
    //   4766: invokestatic a : (II)Ljava/lang/String;
    //   4769: aastore
    //   4770: dup
    //   4771: bipush #9
    //   4773: sipush #-7567
    //   4776: sipush #21487
    //   4779: invokestatic a : (II)Ljava/lang/String;
    //   4782: aastore
    //   4783: dup
    //   4784: bipush #10
    //   4786: sipush #-7658
    //   4789: sipush #16322
    //   4792: invokestatic a : (II)Ljava/lang/String;
    //   4795: aastore
    //   4796: dup
    //   4797: bipush #11
    //   4799: sipush #-7398
    //   4802: sipush #23013
    //   4805: invokestatic a : (II)Ljava/lang/String;
    //   4808: aastore
    //   4809: dup
    //   4810: bipush #12
    //   4812: sipush #-7173
    //   4815: sipush #1836
    //   4818: invokestatic a : (II)Ljava/lang/String;
    //   4821: aastore
    //   4822: dup
    //   4823: bipush #13
    //   4825: sipush #-7423
    //   4828: sipush #-29475
    //   4831: invokestatic a : (II)Ljava/lang/String;
    //   4834: aastore
    //   4835: dup
    //   4836: bipush #14
    //   4838: sipush #-7471
    //   4841: sipush #10132
    //   4844: invokestatic a : (II)Ljava/lang/String;
    //   4847: aastore
    //   4848: dup
    //   4849: bipush #15
    //   4851: sipush #-7508
    //   4854: sipush #11970
    //   4857: invokestatic a : (II)Ljava/lang/String;
    //   4860: aastore
    //   4861: dup
    //   4862: bipush #16
    //   4864: sipush #-7194
    //   4867: sipush #-16772
    //   4870: invokestatic a : (II)Ljava/lang/String;
    //   4873: aastore
    //   4874: dup
    //   4875: bipush #17
    //   4877: sipush #-7602
    //   4880: sipush #-21117
    //   4883: invokestatic a : (II)Ljava/lang/String;
    //   4886: aastore
    //   4887: dup
    //   4888: bipush #18
    //   4890: sipush #-7483
    //   4893: sipush #19223
    //   4896: invokestatic a : (II)Ljava/lang/String;
    //   4899: aastore
    //   4900: dup
    //   4901: bipush #19
    //   4903: sipush #-7401
    //   4906: sipush #16891
    //   4909: invokestatic a : (II)Ljava/lang/String;
    //   4912: aastore
    //   4913: dup
    //   4914: bipush #20
    //   4916: sipush #-7395
    //   4919: sipush #2834
    //   4922: invokestatic a : (II)Ljava/lang/String;
    //   4925: aastore
    //   4926: dup
    //   4927: bipush #21
    //   4929: sipush #-7317
    //   4932: bipush #-68
    //   4934: invokestatic a : (II)Ljava/lang/String;
    //   4937: aastore
    //   4938: dup
    //   4939: bipush #22
    //   4941: sipush #-7438
    //   4944: sipush #10289
    //   4947: invokestatic a : (II)Ljava/lang/String;
    //   4950: aastore
    //   4951: dup
    //   4952: bipush #23
    //   4954: sipush #-7670
    //   4957: sipush #31159
    //   4960: invokestatic a : (II)Ljava/lang/String;
    //   4963: aastore
    //   4964: dup
    //   4965: bipush #24
    //   4967: sipush #-7457
    //   4970: sipush #-2444
    //   4973: invokestatic a : (II)Ljava/lang/String;
    //   4976: aastore
    //   4977: dup
    //   4978: bipush #25
    //   4980: sipush #-7431
    //   4983: sipush #10977
    //   4986: invokestatic a : (II)Ljava/lang/String;
    //   4989: aastore
    //   4990: dup
    //   4991: bipush #26
    //   4993: sipush #-7642
    //   4996: sipush #4544
    //   4999: invokestatic a : (II)Ljava/lang/String;
    //   5002: aastore
    //   5003: dup
    //   5004: bipush #27
    //   5006: sipush #-7403
    //   5009: sipush #10714
    //   5012: invokestatic a : (II)Ljava/lang/String;
    //   5015: aastore
    //   5016: dup
    //   5017: bipush #28
    //   5019: sipush #-7521
    //   5022: sipush #-13510
    //   5025: invokestatic a : (II)Ljava/lang/String;
    //   5028: aastore
    //   5029: dup
    //   5030: bipush #29
    //   5032: sipush #-7503
    //   5035: sipush #-30171
    //   5038: invokestatic a : (II)Ljava/lang/String;
    //   5041: aastore
    //   5042: dup
    //   5043: bipush #30
    //   5045: sipush #-7349
    //   5048: sipush #17694
    //   5051: invokestatic a : (II)Ljava/lang/String;
    //   5054: aastore
    //   5055: dup
    //   5056: bipush #31
    //   5058: sipush #-7214
    //   5061: sipush #-24112
    //   5064: invokestatic a : (II)Ljava/lang/String;
    //   5067: aastore
    //   5068: dup
    //   5069: bipush #32
    //   5071: sipush #-7399
    //   5074: sipush #-12918
    //   5077: invokestatic a : (II)Ljava/lang/String;
    //   5080: aastore
    //   5081: dup
    //   5082: bipush #33
    //   5084: sipush #-7193
    //   5087: sipush #-4890
    //   5090: invokestatic a : (II)Ljava/lang/String;
    //   5093: aastore
    //   5094: dup
    //   5095: bipush #34
    //   5097: sipush #-7363
    //   5100: sipush #9893
    //   5103: invokestatic a : (II)Ljava/lang/String;
    //   5106: aastore
    //   5107: dup
    //   5108: bipush #35
    //   5110: sipush #-7505
    //   5113: sipush #-12280
    //   5116: invokestatic a : (II)Ljava/lang/String;
    //   5119: aastore
    //   5120: dup
    //   5121: bipush #36
    //   5123: sipush #-7372
    //   5126: sipush #30748
    //   5129: invokestatic a : (II)Ljava/lang/String;
    //   5132: aastore
    //   5133: dup
    //   5134: bipush #37
    //   5136: sipush #-7609
    //   5139: sipush #-19696
    //   5142: invokestatic a : (II)Ljava/lang/String;
    //   5145: aastore
    //   5146: dup
    //   5147: bipush #38
    //   5149: sipush #-7578
    //   5152: sipush #19495
    //   5155: invokestatic a : (II)Ljava/lang/String;
    //   5158: aastore
    //   5159: dup
    //   5160: bipush #39
    //   5162: sipush #-7427
    //   5165: sipush #-761
    //   5168: invokestatic a : (II)Ljava/lang/String;
    //   5171: aastore
    //   5172: dup
    //   5173: bipush #40
    //   5175: sipush #-7606
    //   5178: sipush #15935
    //   5181: invokestatic a : (II)Ljava/lang/String;
    //   5184: aastore
    //   5185: dup
    //   5186: bipush #41
    //   5188: sipush #-7639
    //   5191: sipush #-30869
    //   5194: invokestatic a : (II)Ljava/lang/String;
    //   5197: aastore
    //   5198: dup
    //   5199: bipush #42
    //   5201: sipush #-7496
    //   5204: sipush #27855
    //   5207: invokestatic a : (II)Ljava/lang/String;
    //   5210: aastore
    //   5211: dup
    //   5212: bipush #43
    //   5214: sipush #-7485
    //   5217: sipush #-23891
    //   5220: invokestatic a : (II)Ljava/lang/String;
    //   5223: aastore
    //   5224: dup
    //   5225: bipush #44
    //   5227: sipush #-7676
    //   5230: sipush #4609
    //   5233: invokestatic a : (II)Ljava/lang/String;
    //   5236: aastore
    //   5237: dup
    //   5238: bipush #45
    //   5240: sipush #-7385
    //   5243: sipush #2430
    //   5246: invokestatic a : (II)Ljava/lang/String;
    //   5249: aastore
    //   5250: dup
    //   5251: bipush #46
    //   5253: sipush #-7558
    //   5256: sipush #24979
    //   5259: invokestatic a : (II)Ljava/lang/String;
    //   5262: aastore
    //   5263: dup
    //   5264: bipush #47
    //   5266: sipush #-7208
    //   5269: sipush #-23717
    //   5272: invokestatic a : (II)Ljava/lang/String;
    //   5275: aastore
    //   5276: dup
    //   5277: bipush #48
    //   5279: sipush #-7604
    //   5282: sipush #-18669
    //   5285: invokestatic a : (II)Ljava/lang/String;
    //   5288: aastore
    //   5289: dup
    //   5290: bipush #49
    //   5292: sipush #-7356
    //   5295: sipush #13331
    //   5298: invokestatic a : (II)Ljava/lang/String;
    //   5301: aastore
    //   5302: dup
    //   5303: bipush #50
    //   5305: sipush #-7534
    //   5308: sipush #-26095
    //   5311: invokestatic a : (II)Ljava/lang/String;
    //   5314: aastore
    //   5315: dup
    //   5316: bipush #51
    //   5318: sipush #-7272
    //   5321: sipush #3120
    //   5324: invokestatic a : (II)Ljava/lang/String;
    //   5327: aastore
    //   5328: dup
    //   5329: bipush #52
    //   5331: sipush #-7419
    //   5334: sipush #-30189
    //   5337: invokestatic a : (II)Ljava/lang/String;
    //   5340: aastore
    //   5341: dup
    //   5342: bipush #53
    //   5344: sipush #-7552
    //   5347: sipush #22816
    //   5350: invokestatic a : (II)Ljava/lang/String;
    //   5353: aastore
    //   5354: dup
    //   5355: bipush #54
    //   5357: sipush #-7650
    //   5360: sipush #31675
    //   5363: invokestatic a : (II)Ljava/lang/String;
    //   5366: aastore
    //   5367: dup
    //   5368: bipush #55
    //   5370: sipush #-7448
    //   5373: sipush #5941
    //   5376: invokestatic a : (II)Ljava/lang/String;
    //   5379: aastore
    //   5380: dup
    //   5381: bipush #56
    //   5383: sipush #-7390
    //   5386: sipush #-30435
    //   5389: invokestatic a : (II)Ljava/lang/String;
    //   5392: aastore
    //   5393: dup
    //   5394: bipush #57
    //   5396: sipush #-7580
    //   5399: sipush #24070
    //   5402: invokestatic a : (II)Ljava/lang/String;
    //   5405: aastore
    //   5406: dup
    //   5407: bipush #58
    //   5409: sipush #-7426
    //   5412: sipush #-19552
    //   5415: invokestatic a : (II)Ljava/lang/String;
    //   5418: aastore
    //   5419: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   5422: invokespecial <init> : (Ljava/util/Collection;)V
    //   5425: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SCHEMA_KEYS_31 : Ljava/util/Set;
    //   5428: new java/util/LinkedHashSet
    //   5431: dup
    //   5432: iconst_5
    //   5433: anewarray java/lang/String
    //   5436: dup
    //   5437: iconst_0
    //   5438: sipush #-7225
    //   5441: sipush #-25842
    //   5444: invokestatic a : (II)Ljava/lang/String;
    //   5447: aastore
    //   5448: dup
    //   5449: iconst_1
    //   5450: sipush #-7305
    //   5453: bipush #-57
    //   5455: invokestatic a : (II)Ljava/lang/String;
    //   5458: aastore
    //   5459: dup
    //   5460: iconst_2
    //   5461: sipush #-7642
    //   5464: sipush #4544
    //   5467: invokestatic a : (II)Ljava/lang/String;
    //   5470: aastore
    //   5471: dup
    //   5472: iconst_3
    //   5473: sipush #-7181
    //   5476: sipush #-17116
    //   5479: invokestatic a : (II)Ljava/lang/String;
    //   5482: aastore
    //   5483: dup
    //   5484: iconst_4
    //   5485: sipush #-7410
    //   5488: sipush #-17067
    //   5491: invokestatic a : (II)Ljava/lang/String;
    //   5494: aastore
    //   5495: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   5498: invokespecial <init> : (Ljava/util/Collection;)V
    //   5501: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXAMPLE_KEYS_31 : Ljava/util/Set;
    //   5504: new java/util/LinkedHashSet
    //   5507: dup
    //   5508: bipush #14
    //   5510: anewarray java/lang/String
    //   5513: dup
    //   5514: iconst_0
    //   5515: sipush #-7225
    //   5518: sipush #-25842
    //   5521: invokestatic a : (II)Ljava/lang/String;
    //   5524: aastore
    //   5525: dup
    //   5526: iconst_1
    //   5527: sipush #-7657
    //   5530: sipush #12130
    //   5533: invokestatic a : (II)Ljava/lang/String;
    //   5536: aastore
    //   5537: dup
    //   5538: iconst_2
    //   5539: sipush #-7614
    //   5542: sipush #-20403
    //   5545: invokestatic a : (II)Ljava/lang/String;
    //   5548: aastore
    //   5549: dup
    //   5550: iconst_3
    //   5551: sipush #-7642
    //   5554: sipush #4544
    //   5557: invokestatic a : (II)Ljava/lang/String;
    //   5560: aastore
    //   5561: dup
    //   5562: iconst_4
    //   5563: sipush #-7194
    //   5566: sipush #-16772
    //   5569: invokestatic a : (II)Ljava/lang/String;
    //   5572: aastore
    //   5573: dup
    //   5574: iconst_5
    //   5575: sipush #-7363
    //   5578: sipush #9893
    //   5581: invokestatic a : (II)Ljava/lang/String;
    //   5584: aastore
    //   5585: dup
    //   5586: bipush #6
    //   5588: sipush #-7598
    //   5591: sipush #17204
    //   5594: invokestatic a : (II)Ljava/lang/String;
    //   5597: aastore
    //   5598: dup
    //   5599: bipush #7
    //   5601: sipush #-7588
    //   5604: sipush #-10573
    //   5607: invokestatic a : (II)Ljava/lang/String;
    //   5610: aastore
    //   5611: dup
    //   5612: bipush #8
    //   5614: sipush #-7354
    //   5617: sipush #8505
    //   5620: invokestatic a : (II)Ljava/lang/String;
    //   5623: aastore
    //   5624: dup
    //   5625: bipush #9
    //   5627: sipush #-7407
    //   5630: sipush #11024
    //   5633: invokestatic a : (II)Ljava/lang/String;
    //   5636: aastore
    //   5637: dup
    //   5638: bipush #10
    //   5640: sipush #-7384
    //   5643: sipush #2478
    //   5646: invokestatic a : (II)Ljava/lang/String;
    //   5649: aastore
    //   5650: dup
    //   5651: bipush #11
    //   5653: sipush #-7193
    //   5656: sipush #-4890
    //   5659: invokestatic a : (II)Ljava/lang/String;
    //   5662: aastore
    //   5663: dup
    //   5664: bipush #12
    //   5666: sipush #-7372
    //   5669: sipush #30748
    //   5672: invokestatic a : (II)Ljava/lang/String;
    //   5675: aastore
    //   5676: dup
    //   5677: bipush #13
    //   5679: sipush #-7402
    //   5682: sipush #23593
    //   5685: invokestatic a : (II)Ljava/lang/String;
    //   5688: aastore
    //   5689: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   5692: invokespecial <init> : (Ljava/util/Collection;)V
    //   5695: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.HEADER_KEYS_31 : Ljava/util/Set;
    //   5698: new java/util/LinkedHashSet
    //   5701: dup
    //   5702: bipush #7
    //   5704: anewarray java/lang/String
    //   5707: dup
    //   5708: iconst_0
    //   5709: sipush #-7225
    //   5712: sipush #-25842
    //   5715: invokestatic a : (II)Ljava/lang/String;
    //   5718: aastore
    //   5719: dup
    //   5720: iconst_1
    //   5721: sipush #-7269
    //   5724: sipush #8592
    //   5727: invokestatic a : (II)Ljava/lang/String;
    //   5730: aastore
    //   5731: dup
    //   5732: iconst_2
    //   5733: sipush #-7615
    //   5736: sipush #15504
    //   5739: invokestatic a : (II)Ljava/lang/String;
    //   5742: aastore
    //   5743: dup
    //   5744: iconst_3
    //   5745: sipush #-7195
    //   5748: sipush #27709
    //   5751: invokestatic a : (II)Ljava/lang/String;
    //   5754: aastore
    //   5755: dup
    //   5756: iconst_4
    //   5757: sipush #-7309
    //   5760: sipush #2463
    //   5763: invokestatic a : (II)Ljava/lang/String;
    //   5766: aastore
    //   5767: dup
    //   5768: iconst_5
    //   5769: sipush #-7642
    //   5772: sipush #4544
    //   5775: invokestatic a : (II)Ljava/lang/String;
    //   5778: aastore
    //   5779: dup
    //   5780: bipush #6
    //   5782: sipush #-7313
    //   5785: sipush #-30034
    //   5788: invokestatic a : (II)Ljava/lang/String;
    //   5791: aastore
    //   5792: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   5795: invokespecial <init> : (Ljava/util/Collection;)V
    //   5798: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LINK_KEYS_31 : Ljava/util/Set;
    //   5801: new java/util/LinkedHashSet
    //   5804: dup
    //   5805: iconst_4
    //   5806: anewarray java/lang/String
    //   5809: dup
    //   5810: iconst_0
    //   5811: sipush #-7384
    //   5814: sipush #2478
    //   5817: invokestatic a : (II)Ljava/lang/String;
    //   5820: aastore
    //   5821: dup
    //   5822: iconst_1
    //   5823: sipush #-7193
    //   5826: sipush #-4890
    //   5829: invokestatic a : (II)Ljava/lang/String;
    //   5832: aastore
    //   5833: dup
    //   5834: iconst_2
    //   5835: sipush #-7372
    //   5838: sipush #30748
    //   5841: invokestatic a : (II)Ljava/lang/String;
    //   5844: aastore
    //   5845: dup
    //   5846: iconst_3
    //   5847: sipush #-7677
    //   5850: sipush #23837
    //   5853: invokestatic a : (II)Ljava/lang/String;
    //   5856: aastore
    //   5857: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   5860: invokespecial <init> : (Ljava/util/Collection;)V
    //   5863: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.MEDIATYPE_KEYS_31 : Ljava/util/Set;
    //   5866: new java/util/LinkedHashSet
    //   5869: dup
    //   5870: iconst_5
    //   5871: anewarray java/lang/String
    //   5874: dup
    //   5875: iconst_0
    //   5876: sipush #-7657
    //   5879: sipush #12130
    //   5882: invokestatic a : (II)Ljava/lang/String;
    //   5885: aastore
    //   5886: dup
    //   5887: iconst_1
    //   5888: sipush #-7452
    //   5891: sipush #-22950
    //   5894: invokestatic a : (II)Ljava/lang/String;
    //   5897: aastore
    //   5898: dup
    //   5899: iconst_2
    //   5900: sipush #-7527
    //   5903: sipush #15009
    //   5906: invokestatic a : (II)Ljava/lang/String;
    //   5909: aastore
    //   5910: dup
    //   5911: iconst_3
    //   5912: sipush #-7359
    //   5915: sipush #297
    //   5918: invokestatic a : (II)Ljava/lang/String;
    //   5921: aastore
    //   5922: dup
    //   5923: iconst_4
    //   5924: sipush #-7470
    //   5927: sipush #3031
    //   5930: invokestatic a : (II)Ljava/lang/String;
    //   5933: aastore
    //   5934: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   5937: invokespecial <init> : (Ljava/util/Collection;)V
    //   5940: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.XML_KEYS_31 : Ljava/util/Set;
    //   5943: new java/util/LinkedHashSet
    //   5946: dup
    //   5947: iconst_4
    //   5948: anewarray java/lang/String
    //   5951: dup
    //   5952: iconst_0
    //   5953: sipush #-7586
    //   5956: sipush #2621
    //   5959: invokestatic a : (II)Ljava/lang/String;
    //   5962: aastore
    //   5963: dup
    //   5964: iconst_1
    //   5965: sipush #-7626
    //   5968: sipush #-29713
    //   5971: invokestatic a : (II)Ljava/lang/String;
    //   5974: aastore
    //   5975: dup
    //   5976: iconst_2
    //   5977: sipush #-7610
    //   5980: sipush #17122
    //   5983: invokestatic a : (II)Ljava/lang/String;
    //   5986: aastore
    //   5987: dup
    //   5988: iconst_3
    //   5989: sipush #-7266
    //   5992: sipush #13998
    //   5995: invokestatic a : (II)Ljava/lang/String;
    //   5998: aastore
    //   5999: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   6002: invokespecial <init> : (Ljava/util/Collection;)V
    //   6005: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOW_KEYS_31 : Ljava/util/Set;
    //   6008: new java/util/LinkedHashSet
    //   6011: dup
    //   6012: iconst_4
    //   6013: anewarray java/lang/String
    //   6016: dup
    //   6017: iconst_0
    //   6018: sipush #-7409
    //   6021: sipush #2196
    //   6024: invokestatic a : (II)Ljava/lang/String;
    //   6027: aastore
    //   6028: dup
    //   6029: iconst_1
    //   6030: sipush #-7396
    //   6033: sipush #21758
    //   6036: invokestatic a : (II)Ljava/lang/String;
    //   6039: aastore
    //   6040: dup
    //   6041: iconst_2
    //   6042: sipush #-7232
    //   6045: sipush #-20150
    //   6048: invokestatic a : (II)Ljava/lang/String;
    //   6051: aastore
    //   6052: dup
    //   6053: iconst_3
    //   6054: sipush #-7459
    //   6057: sipush #-23198
    //   6060: invokestatic a : (II)Ljava/lang/String;
    //   6063: aastore
    //   6064: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   6067: invokespecial <init> : (Ljava/util/Collection;)V
    //   6070: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOWS_KEYS_31 : Ljava/util/Set;
    //   6073: new java/util/LinkedHashSet
    //   6076: dup
    //   6077: iconst_5
    //   6078: anewarray java/lang/String
    //   6081: dup
    //   6082: iconst_0
    //   6083: sipush #-7628
    //   6086: sipush #-29411
    //   6089: invokestatic a : (II)Ljava/lang/String;
    //   6092: aastore
    //   6093: dup
    //   6094: iconst_1
    //   6095: sipush #-7613
    //   6098: sipush #15237
    //   6101: invokestatic a : (II)Ljava/lang/String;
    //   6104: aastore
    //   6105: dup
    //   6106: iconst_2
    //   6107: sipush #-7588
    //   6110: sipush #-10573
    //   6113: invokestatic a : (II)Ljava/lang/String;
    //   6116: aastore
    //   6117: dup
    //   6118: iconst_3
    //   6119: sipush #-7354
    //   6122: sipush #8505
    //   6125: invokestatic a : (II)Ljava/lang/String;
    //   6128: aastore
    //   6129: dup
    //   6130: iconst_4
    //   6131: sipush #-7407
    //   6134: sipush #11024
    //   6137: invokestatic a : (II)Ljava/lang/String;
    //   6140: aastore
    //   6141: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   6144: invokespecial <init> : (Ljava/util/Collection;)V
    //   6147: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ENCODING_KEYS_31 : Ljava/util/Set;
    //   6150: new java/util/LinkedHashMap
    //   6153: dup
    //   6154: invokespecial <init> : ()V
    //   6157: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   6160: new java/util/LinkedHashSet
    //   6163: dup
    //   6164: iconst_2
    //   6165: anewarray com/fasterxml/Zg/Zfr
    //   6168: dup
    //   6169: iconst_0
    //   6170: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   6173: aastore
    //   6174: dup
    //   6175: iconst_1
    //   6176: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   6179: aastore
    //   6180: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   6183: invokespecial <init> : (Ljava/util/Collection;)V
    //   6186: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.validNodeTypes : Ljava/util/Set;
    //   6189: new java/util/LinkedHashMap
    //   6192: dup
    //   6193: invokespecial <init> : ()V
    //   6196: astore #7
    //   6198: new java/util/LinkedHashMap
    //   6201: dup
    //   6202: invokespecial <init> : ()V
    //   6205: astore #8
    //   6207: aload #7
    //   6209: sipush #-7203
    //   6212: sipush #-5763
    //   6215: invokestatic a : (II)Ljava/lang/String;
    //   6218: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ROOT_KEYS : Ljava/util/Set;
    //   6221: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6226: pop
    //   6227: aload #7
    //   6229: sipush #-7197
    //   6232: sipush #24067
    //   6235: invokestatic a : (II)Ljava/lang/String;
    //   6238: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.INFO_KEYS : Ljava/util/Set;
    //   6241: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6246: pop
    //   6247: aload #7
    //   6249: sipush #-7361
    //   6252: sipush #-11785
    //   6255: invokestatic a : (II)Ljava/lang/String;
    //   6258: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.CONTACT_KEYS : Ljava/util/Set;
    //   6261: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6266: pop
    //   6267: aload #7
    //   6269: sipush #-7648
    //   6272: sipush #28583
    //   6275: invokestatic a : (II)Ljava/lang/String;
    //   6278: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LICENSE_KEYS : Ljava/util/Set;
    //   6281: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6286: pop
    //   6287: aload #7
    //   6289: sipush #-7171
    //   6292: sipush #9120
    //   6295: invokestatic a : (II)Ljava/lang/String;
    //   6298: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.TAG_KEYS : Ljava/util/Set;
    //   6301: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6306: pop
    //   6307: aload #7
    //   6309: sipush #-7557
    //   6312: sipush #18109
    //   6315: invokestatic a : (II)Ljava/lang/String;
    //   6318: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RESPONSE_KEYS : Ljava/util/Set;
    //   6321: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6326: pop
    //   6327: aload #7
    //   6329: sipush #-7393
    //   6332: sipush #4536
    //   6335: invokestatic a : (II)Ljava/lang/String;
    //   6338: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_KEYS : Ljava/util/Set;
    //   6341: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6346: pop
    //   6347: aload #7
    //   6349: sipush #-7555
    //   6352: sipush #4390
    //   6355: invokestatic a : (II)Ljava/lang/String;
    //   6358: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_VARIABLE_KEYS : Ljava/util/Set;
    //   6361: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6366: pop
    //   6367: aload #7
    //   6369: sipush #-7654
    //   6372: sipush #-575
    //   6375: invokestatic a : (II)Ljava/lang/String;
    //   6378: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PATHITEM_KEYS : Ljava/util/Set;
    //   6381: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6386: pop
    //   6387: aload #7
    //   6389: sipush #-7491
    //   6392: sipush #8391
    //   6395: invokestatic a : (II)Ljava/lang/String;
    //   6398: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OPERATION_KEYS : Ljava/util/Set;
    //   6401: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6406: pop
    //   6407: aload #7
    //   6409: sipush #-7355
    //   6412: sipush #-15933
    //   6415: invokestatic a : (II)Ljava/lang/String;
    //   6418: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PARAMETER_KEYS : Ljava/util/Set;
    //   6421: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6426: pop
    //   6427: aload #7
    //   6429: sipush #-7579
    //   6432: sipush #13565
    //   6435: invokestatic a : (II)Ljava/lang/String;
    //   6438: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.REQUEST_BODY_KEYS : Ljava/util/Set;
    //   6441: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6446: pop
    //   6447: aload #7
    //   6449: sipush #-7437
    //   6452: sipush #16078
    //   6455: invokestatic a : (II)Ljava/lang/String;
    //   6458: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SECURITY_SCHEME_KEYS : Ljava/util/Set;
    //   6461: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6466: pop
    //   6467: aload #7
    //   6469: sipush #-7169
    //   6472: sipush #-4397
    //   6475: invokestatic a : (II)Ljava/lang/String;
    //   6478: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXTERNAL_DOCS_KEYS : Ljava/util/Set;
    //   6481: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6486: pop
    //   6487: aload #7
    //   6489: sipush #-7675
    //   6492: sipush #-8476
    //   6495: invokestatic a : (II)Ljava/lang/String;
    //   6498: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.COMPONENTS_KEYS : Ljava/util/Set;
    //   6501: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6506: pop
    //   6507: aload #7
    //   6509: sipush #-7672
    //   6512: sipush #-11821
    //   6515: invokestatic a : (II)Ljava/lang/String;
    //   6518: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SCHEMA_KEYS : Ljava/util/Set;
    //   6521: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6526: pop
    //   6527: aload #7
    //   6529: sipush #-7612
    //   6532: sipush #31998
    //   6535: invokestatic a : (II)Ljava/lang/String;
    //   6538: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXAMPLE_KEYS : Ljava/util/Set;
    //   6541: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6546: pop
    //   6547: aload #7
    //   6549: sipush #-7319
    //   6552: sipush #-6100
    //   6555: invokestatic a : (II)Ljava/lang/String;
    //   6558: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.HEADER_KEYS : Ljava/util/Set;
    //   6561: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6566: pop
    //   6567: aload #7
    //   6569: sipush #-7442
    //   6572: sipush #17621
    //   6575: invokestatic a : (II)Ljava/lang/String;
    //   6578: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LINK_KEYS : Ljava/util/Set;
    //   6581: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6586: pop
    //   6587: aload #7
    //   6589: sipush #-7630
    //   6592: sipush #23453
    //   6595: invokestatic a : (II)Ljava/lang/String;
    //   6598: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.MEDIATYPE_KEYS : Ljava/util/Set;
    //   6601: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6606: pop
    //   6607: aload #7
    //   6609: sipush #-7542
    //   6612: sipush #-21569
    //   6615: invokestatic a : (II)Ljava/lang/String;
    //   6618: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.XML_KEYS : Ljava/util/Set;
    //   6621: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6626: pop
    //   6627: aload #7
    //   6629: sipush #-7412
    //   6632: sipush #-16229
    //   6635: invokestatic a : (II)Ljava/lang/String;
    //   6638: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOW_KEYS : Ljava/util/Set;
    //   6641: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6646: pop
    //   6647: aload #7
    //   6649: sipush #-7643
    //   6652: sipush #-23384
    //   6655: invokestatic a : (II)Ljava/lang/String;
    //   6658: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOWS_KEYS : Ljava/util/Set;
    //   6661: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6666: pop
    //   6667: aload #7
    //   6669: sipush #-7596
    //   6672: sipush #-17493
    //   6675: invokestatic a : (II)Ljava/lang/String;
    //   6678: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ENCODING_KEYS : Ljava/util/Set;
    //   6681: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6686: pop
    //   6687: aload #8
    //   6689: sipush #-7620
    //   6692: sipush #24276
    //   6695: invokestatic a : (II)Ljava/lang/String;
    //   6698: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ROOT_KEYS_31 : Ljava/util/Set;
    //   6701: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6706: pop
    //   6707: aload #8
    //   6709: sipush #-7197
    //   6712: sipush #24067
    //   6715: invokestatic a : (II)Ljava/lang/String;
    //   6718: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.INFO_KEYS_31 : Ljava/util/Set;
    //   6721: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6726: pop
    //   6727: aload #8
    //   6729: sipush #-7651
    //   6732: sipush #-18691
    //   6735: invokestatic a : (II)Ljava/lang/String;
    //   6738: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.CONTACT_KEYS_31 : Ljava/util/Set;
    //   6741: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6746: pop
    //   6747: aload #8
    //   6749: sipush #-7648
    //   6752: sipush #28583
    //   6755: invokestatic a : (II)Ljava/lang/String;
    //   6758: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LICENSE_KEYS_31 : Ljava/util/Set;
    //   6761: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6766: pop
    //   6767: aload #8
    //   6769: sipush #-7171
    //   6772: sipush #9120
    //   6775: invokestatic a : (II)Ljava/lang/String;
    //   6778: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.TAG_KEYS_31 : Ljava/util/Set;
    //   6781: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6786: pop
    //   6787: aload #8
    //   6789: sipush #-7557
    //   6792: sipush #18109
    //   6795: invokestatic a : (II)Ljava/lang/String;
    //   6798: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RESPONSE_KEYS_31 : Ljava/util/Set;
    //   6801: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6806: pop
    //   6807: aload #8
    //   6809: sipush #-7507
    //   6812: sipush #-13058
    //   6815: invokestatic a : (II)Ljava/lang/String;
    //   6818: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_KEYS_31 : Ljava/util/Set;
    //   6821: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6826: pop
    //   6827: aload #8
    //   6829: sipush #-7555
    //   6832: sipush #4390
    //   6835: invokestatic a : (II)Ljava/lang/String;
    //   6838: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SERVER_VARIABLE_KEYS_31 : Ljava/util/Set;
    //   6841: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6846: pop
    //   6847: aload #8
    //   6849: sipush #-7205
    //   6852: sipush #10057
    //   6855: invokestatic a : (II)Ljava/lang/String;
    //   6858: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PATHITEM_KEYS_31 : Ljava/util/Set;
    //   6861: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6866: pop
    //   6867: aload #8
    //   6869: sipush #-7663
    //   6872: sipush #-25943
    //   6875: invokestatic a : (II)Ljava/lang/String;
    //   6878: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OPERATION_KEYS_31 : Ljava/util/Set;
    //   6881: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6886: pop
    //   6887: aload #8
    //   6889: sipush #-7355
    //   6892: sipush #-15933
    //   6895: invokestatic a : (II)Ljava/lang/String;
    //   6898: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.PARAMETER_KEYS_31 : Ljava/util/Set;
    //   6901: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6906: pop
    //   6907: aload #8
    //   6909: sipush #-7568
    //   6912: sipush #-2833
    //   6915: invokestatic a : (II)Ljava/lang/String;
    //   6918: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.REQUEST_BODY_KEYS_31 : Ljava/util/Set;
    //   6921: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6926: pop
    //   6927: aload #8
    //   6929: sipush #-7437
    //   6932: sipush #16078
    //   6935: invokestatic a : (II)Ljava/lang/String;
    //   6938: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SECURITY_SCHEME_KEYS_31 : Ljava/util/Set;
    //   6941: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6946: pop
    //   6947: aload #8
    //   6949: sipush #-7169
    //   6952: sipush #-4397
    //   6955: invokestatic a : (II)Ljava/lang/String;
    //   6958: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXTERNAL_DOCS_KEYS_31 : Ljava/util/Set;
    //   6961: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6966: pop
    //   6967: aload #8
    //   6969: sipush #-7675
    //   6972: sipush #-8476
    //   6975: invokestatic a : (II)Ljava/lang/String;
    //   6978: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.COMPONENTS_KEYS_31 : Ljava/util/Set;
    //   6981: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   6986: pop
    //   6987: aload #8
    //   6989: sipush #-7672
    //   6992: sipush #-11821
    //   6995: invokestatic a : (II)Ljava/lang/String;
    //   6998: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.SCHEMA_KEYS_31 : Ljava/util/Set;
    //   7001: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7006: pop
    //   7007: aload #8
    //   7009: sipush #-7343
    //   7012: sipush #-31264
    //   7015: invokestatic a : (II)Ljava/lang/String;
    //   7018: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.EXAMPLE_KEYS_31 : Ljava/util/Set;
    //   7021: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7026: pop
    //   7027: aload #8
    //   7029: sipush #-7231
    //   7032: sipush #5379
    //   7035: invokestatic a : (II)Ljava/lang/String;
    //   7038: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.HEADER_KEYS_31 : Ljava/util/Set;
    //   7041: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7046: pop
    //   7047: aload #8
    //   7049: sipush #-7442
    //   7052: sipush #17621
    //   7055: invokestatic a : (II)Ljava/lang/String;
    //   7058: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.LINK_KEYS_31 : Ljava/util/Set;
    //   7061: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7066: pop
    //   7067: aload #8
    //   7069: sipush #-7630
    //   7072: sipush #23453
    //   7075: invokestatic a : (II)Ljava/lang/String;
    //   7078: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.MEDIATYPE_KEYS_31 : Ljava/util/Set;
    //   7081: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7086: pop
    //   7087: aload #8
    //   7089: sipush #-7342
    //   7092: sipush #1270
    //   7095: invokestatic a : (II)Ljava/lang/String;
    //   7098: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.XML_KEYS_31 : Ljava/util/Set;
    //   7101: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7106: pop
    //   7107: aload #8
    //   7109: sipush #-7204
    //   7112: sipush #-10748
    //   7115: invokestatic a : (II)Ljava/lang/String;
    //   7118: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOW_KEYS_31 : Ljava/util/Set;
    //   7121: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7126: pop
    //   7127: aload #8
    //   7129: sipush #-7643
    //   7132: sipush #-23384
    //   7135: invokestatic a : (II)Ljava/lang/String;
    //   7138: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.OAUTHFLOWS_KEYS_31 : Ljava/util/Set;
    //   7141: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7146: pop
    //   7147: aload #8
    //   7149: sipush #-7596
    //   7152: sipush #-17493
    //   7155: invokestatic a : (II)Ljava/lang/String;
    //   7158: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.ENCODING_KEYS_31 : Ljava/util/Set;
    //   7161: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7166: pop
    //   7167: aload #8
    //   7169: sipush #-7581
    //   7172: sipush #22412
    //   7175: invokestatic a : (II)Ljava/lang/String;
    //   7178: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RESERVED_KEYWORDS_31 : Ljava/util/Set;
    //   7181: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7186: pop
    //   7187: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   7190: sipush #-7446
    //   7193: sipush #984
    //   7196: invokestatic a : (II)Ljava/lang/String;
    //   7199: aload #7
    //   7201: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7206: pop
    //   7207: getstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.KEYS : Ljava/util/Map;
    //   7210: sipush #-7188
    //   7213: sipush #9260
    //   7216: invokestatic a : (II)Ljava/lang/String;
    //   7219: aload #8
    //   7221: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   7226: pop
    //   7227: sipush #-7441
    //   7230: sipush #25853
    //   7233: invokestatic a : (II)Ljava/lang/String;
    //   7236: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   7239: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RFC3339_DATE_TIME_PATTERN : Ljava/util/regex/Pattern;
    //   7242: sipush #-7590
    //   7245: sipush #28514
    //   7248: invokestatic a : (II)Ljava/lang/String;
    //   7251: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   7254: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.RFC3339_DATE_PATTERN : Ljava/util/regex/Pattern;
    //   7257: new net/portswigger/swagger/v2/util/OpenAPIDeserializer$1
    //   7260: dup
    //   7261: invokespecial <init> : ()V
    //   7264: putstatic net/portswigger/swagger/v2/util/OpenAPIDeserializer.jsonSchemaParserExtensionMap : Ljava/util/Map;
    //   7267: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE25A) & 0xFFFF;
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
      byte b1 = 51;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\OpenAPIDeserializer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */