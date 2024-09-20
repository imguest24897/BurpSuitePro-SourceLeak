package net.portswigger.swagger.v1.parser.util;

import com.fasterxml.Zg.Zb;
import com.fasterxml.Zg.Zfr;
import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.swagger.v1.models.AbstractModel;
import net.portswigger.swagger.v1.models.Contact;
import net.portswigger.swagger.v1.models.ExternalDocs;
import net.portswigger.swagger.v1.models.Info;
import net.portswigger.swagger.v1.models.License;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.Path;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.RefPath;
import net.portswigger.swagger.v1.models.RefResponse;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Responses;
import net.portswigger.swagger.v1.models.SecurityRequirement;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.Tag;
import net.portswigger.swagger.v1.models.auth.SecuritySchemeDefinition;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.models.parameters.RefParameter;
import net.portswigger.swagger.v1.models.properties.BooleanValueProperty;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.util.Json;

public class SwaggerDeserializer {
  protected static Set<String> ROOT_KEYS;
  
  protected static Set<String> EXTERNAL_DOCS_KEYS;
  
  protected static Set<String> SCHEMA_KEYS;
  
  protected static Set<String> INFO_KEYS;
  
  protected static Set<String> TAG_KEYS;
  
  protected static Set<String> RESPONSE_KEYS;
  
  protected static Set<String> CONTACT_KEYS;
  
  protected static Set<String> LICENSE_KEYS;
  
  protected static Set<String> REF_MODEL_KEYS;
  
  protected static Set<String> PATH_KEYS;
  
  protected static Set<String> OPERATION_KEYS;
  
  protected static Set<String> PARAMETER_KEYS;
  
  protected static Set<String> BODY_PARAMETER_KEYS;
  
  protected static Set<String> SECURITY_SCHEME_KEYS;
  
  private final Set<String> operationIDs = new HashSet<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public SwaggerDeserializationResult deserialize(Zb paramZb) {
    SwaggerDeserializationResult swaggerDeserializationResult = new SwaggerDeserializationResult();
    SwaggerDeserializer$ParseResult swaggerDeserializer$ParseResult = new SwaggerDeserializer$ParseResult();
    Swagger swagger = parseRoot(paramZb, swaggerDeserializer$ParseResult);
    swaggerDeserializationResult.setSwagger(swagger);
    swaggerDeserializationResult.setMessages(swaggerDeserializer$ParseResult.getMessages());
    swaggerDeserializationResult.setValid(swaggerDeserializer$ParseResult.isValid());
    return swaggerDeserializationResult;
  }
  
  public Swagger parseRoot(Zb paramZb, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: ldc ''
    //   5: astore #4
    //   7: astore_3
    //   8: new net/portswigger/swagger/v1/models/Swagger
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #5
    //   17: aload_1
    //   18: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   21: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   24: invokevirtual equals : (Ljava/lang/Object;)Z
    //   27: ifeq -> 1139
    //   30: aload_1
    //   31: checkcast com/fasterxml/Zg/Zr
    //   34: astore #6
    //   36: aconst_null
    //   37: astore #7
    //   39: aload_0
    //   40: sipush #-28956
    //   43: sipush #19237
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: aload #6
    //   51: iconst_1
    //   52: aload #4
    //   54: aload_2
    //   55: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   58: astore #8
    //   60: aload #5
    //   62: aload #8
    //   64: invokevirtual setSwagger : (Ljava/lang/String;)V
    //   67: aload_0
    //   68: sipush #-28996
    //   71: sipush #21759
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: aload #6
    //   79: iconst_1
    //   80: ldc ''
    //   82: aload_2
    //   83: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   86: astore #9
    //   88: aload #9
    //   90: ifnull -> 119
    //   93: aload_0
    //   94: aload #9
    //   96: sipush #-28996
    //   99: sipush #21759
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: aload_2
    //   106: invokevirtual info : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Info;
    //   109: astore #10
    //   111: aload #5
    //   113: aload #10
    //   115: invokevirtual info : (Lnet/portswigger/swagger/v1/models/Info;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   118: pop
    //   119: aload_0
    //   120: sipush #-28970
    //   123: sipush #4633
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: aload #6
    //   131: iconst_0
    //   132: aload #4
    //   134: aload_2
    //   135: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   138: astore #8
    //   140: aload #5
    //   142: aload #8
    //   144: invokevirtual setHost : (Ljava/lang/String;)V
    //   147: aload_0
    //   148: sipush #-28978
    //   151: sipush #13346
    //   154: invokestatic a : (II)Ljava/lang/String;
    //   157: aload #6
    //   159: iconst_0
    //   160: aload #4
    //   162: aload_2
    //   163: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   166: astore #8
    //   168: aload #5
    //   170: aload #8
    //   172: invokevirtual setBasePath : (Ljava/lang/String;)V
    //   175: aload_0
    //   176: sipush #-29029
    //   179: sipush #-28087
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: aload #6
    //   187: iconst_0
    //   188: aload #4
    //   190: aload_2
    //   191: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   194: astore #10
    //   196: aload #10
    //   198: ifnull -> 284
    //   201: aload #10
    //   203: invokevirtual iterator : ()Ljava/util/Iterator;
    //   206: astore #7
    //   208: aload #7
    //   210: invokeinterface hasNext : ()Z
    //   215: ifeq -> 284
    //   218: aload #7
    //   220: invokeinterface next : ()Ljava/lang/Object;
    //   225: checkcast com/fasterxml/Zor/Zb
    //   228: astore #11
    //   230: aload_0
    //   231: aload #11
    //   233: aload #4
    //   235: sipush #-28950
    //   238: sipush #7575
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   249: aload_2
    //   250: invokevirtual getString : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   253: astore #12
    //   255: aload #12
    //   257: ifnull -> 280
    //   260: aload #12
    //   262: invokestatic forValue : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Scheme;
    //   265: astore #13
    //   267: aload #13
    //   269: ifnull -> 280
    //   272: aload #5
    //   274: aload #13
    //   276: invokevirtual scheme : (Lnet/portswigger/swagger/v1/models/Scheme;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   279: pop
    //   280: aload_3
    //   281: ifnonnull -> 208
    //   284: aload_0
    //   285: sipush #-29103
    //   288: sipush #-30592
    //   291: invokestatic a : (II)Ljava/lang/String;
    //   294: aload #6
    //   296: iconst_0
    //   297: aload #4
    //   299: aload_2
    //   300: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   303: astore #10
    //   305: aload #10
    //   307: ifnull -> 381
    //   310: aload #10
    //   312: invokevirtual iterator : ()Ljava/util/Iterator;
    //   315: astore #7
    //   317: aload #7
    //   319: invokeinterface hasNext : ()Z
    //   324: ifeq -> 381
    //   327: aload #7
    //   329: invokeinterface next : ()Ljava/lang/Object;
    //   334: checkcast com/fasterxml/Zor/Zb
    //   337: astore #11
    //   339: aload_0
    //   340: aload #11
    //   342: aload #4
    //   344: sipush #-29050
    //   347: sipush #-19844
    //   350: invokestatic a : (II)Ljava/lang/String;
    //   353: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   358: aload_2
    //   359: invokevirtual getString : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   362: astore #12
    //   364: aload #12
    //   366: ifnull -> 377
    //   369: aload #5
    //   371: aload #12
    //   373: invokevirtual consumes : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   376: pop
    //   377: aload_3
    //   378: ifnonnull -> 317
    //   381: aload_0
    //   382: sipush #-29023
    //   385: sipush #-19256
    //   388: invokestatic a : (II)Ljava/lang/String;
    //   391: aload #6
    //   393: iconst_0
    //   394: aload #4
    //   396: aload_2
    //   397: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   400: astore #10
    //   402: aload #10
    //   404: ifnull -> 478
    //   407: aload #10
    //   409: invokevirtual iterator : ()Ljava/util/Iterator;
    //   412: astore #7
    //   414: aload #7
    //   416: invokeinterface hasNext : ()Z
    //   421: ifeq -> 478
    //   424: aload #7
    //   426: invokeinterface next : ()Ljava/lang/Object;
    //   431: checkcast com/fasterxml/Zor/Zb
    //   434: astore #11
    //   436: aload_0
    //   437: aload #11
    //   439: aload #4
    //   441: sipush #-29021
    //   444: sipush #12576
    //   447: invokestatic a : (II)Ljava/lang/String;
    //   450: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   455: aload_2
    //   456: invokevirtual getString : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   459: astore #12
    //   461: aload #12
    //   463: ifnull -> 474
    //   466: aload #5
    //   468: aload #12
    //   470: invokevirtual produces : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   473: pop
    //   474: aload_3
    //   475: ifnonnull -> 414
    //   478: aload_0
    //   479: sipush #-29090
    //   482: sipush #6176
    //   485: invokestatic a : (II)Ljava/lang/String;
    //   488: aload #6
    //   490: iconst_1
    //   491: aload #4
    //   493: aload_2
    //   494: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   497: astore #9
    //   499: aload_0
    //   500: aload #9
    //   502: sipush #-29090
    //   505: sipush #6176
    //   508: invokestatic a : (II)Ljava/lang/String;
    //   511: aload_2
    //   512: invokevirtual paths : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/Map;
    //   515: astore #11
    //   517: aload #5
    //   519: aload #11
    //   521: invokevirtual paths : (Ljava/util/Map;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   524: pop
    //   525: aload_0
    //   526: sipush #-29028
    //   529: sipush #13276
    //   532: invokestatic a : (II)Ljava/lang/String;
    //   535: aload #6
    //   537: iconst_0
    //   538: aload #4
    //   540: aload_2
    //   541: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   544: astore #9
    //   546: aload_0
    //   547: aload #9
    //   549: sipush #-29028
    //   552: sipush #13276
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aload_2
    //   559: invokevirtual definitions : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/Map;
    //   562: astore #12
    //   564: aload #5
    //   566: aload #12
    //   568: invokevirtual setDefinitions : (Ljava/util/Map;)V
    //   571: aload_0
    //   572: sipush #-28968
    //   575: sipush #-2799
    //   578: invokestatic a : (II)Ljava/lang/String;
    //   581: aload #6
    //   583: iconst_0
    //   584: aload #4
    //   586: aload_2
    //   587: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   590: astore #9
    //   592: aload #9
    //   594: ifnull -> 792
    //   597: new java/util/LinkedHashMap
    //   600: dup
    //   601: invokespecial <init> : ()V
    //   604: astore #13
    //   606: aload_0
    //   607: aload #9
    //   609: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   612: astore #14
    //   614: aload #14
    //   616: invokeinterface iterator : ()Ljava/util/Iterator;
    //   621: astore #15
    //   623: aload #15
    //   625: invokeinterface hasNext : ()Z
    //   630: ifeq -> 785
    //   633: aload #15
    //   635: invokeinterface next : ()Ljava/lang/Object;
    //   640: checkcast java/lang/String
    //   643: astore #16
    //   645: aload #9
    //   647: aload #16
    //   649: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   652: astore #17
    //   654: aload #17
    //   656: instanceof com/fasterxml/Zg/Zr
    //   659: ifeq -> 781
    //   662: aload_0
    //   663: aload #17
    //   665: checkcast com/fasterxml/Zg/Zr
    //   668: aload #4
    //   670: aload_2
    //   671: invokevirtual parameter : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/parameters/Parameter;
    //   674: astore #18
    //   676: sipush #-29111
    //   679: sipush #-1643
    //   682: invokestatic a : (II)Ljava/lang/String;
    //   685: aload #18
    //   687: invokeinterface getIn : ()Ljava/lang/String;
    //   692: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   695: ifeq -> 769
    //   698: aload #18
    //   700: invokeinterface getRequired : ()Z
    //   705: ifne -> 769
    //   708: aload_2
    //   709: aload #4
    //   711: aload #18
    //   713: invokeinterface getName : ()Ljava/lang/String;
    //   718: sipush #-29011
    //   721: sipush #14962
    //   724: invokestatic a : (II)Ljava/lang/String;
    //   727: swap
    //   728: ldc '''
    //   730: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   735: aload #18
    //   737: invokeinterface getName : ()Ljava/lang/String;
    //   742: sipush #-28941
    //   745: sipush #5073
    //   748: invokestatic a : (II)Ljava/lang/String;
    //   751: swap
    //   752: sipush #-29091
    //   755: sipush #25529
    //   758: invokestatic a : (II)Ljava/lang/String;
    //   761: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   766: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   769: aload #13
    //   771: aload #16
    //   773: aload #18
    //   775: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   780: pop
    //   781: aload_3
    //   782: ifnonnull -> 623
    //   785: aload #5
    //   787: aload #13
    //   789: invokevirtual setParameters : (Ljava/util/Map;)V
    //   792: aload_0
    //   793: sipush #-29048
    //   796: sipush #27878
    //   799: invokestatic a : (II)Ljava/lang/String;
    //   802: aload #6
    //   804: iconst_0
    //   805: aload #4
    //   807: aload_2
    //   808: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   811: astore #9
    //   813: aload_0
    //   814: aload #9
    //   816: sipush #-29048
    //   819: sipush #27878
    //   822: invokestatic a : (II)Ljava/lang/String;
    //   825: aload_2
    //   826: invokevirtual responses : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Responses;
    //   829: astore #13
    //   831: aload #5
    //   833: aload #13
    //   835: invokevirtual responses : (Ljava/util/Map;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   838: pop
    //   839: aload_0
    //   840: sipush #-29027
    //   843: sipush #13496
    //   846: invokestatic a : (II)Ljava/lang/String;
    //   849: aload #6
    //   851: iconst_0
    //   852: aload #4
    //   854: aload_2
    //   855: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   858: astore #9
    //   860: aload_0
    //   861: aload #9
    //   863: sipush #-29027
    //   866: sipush #13496
    //   869: invokestatic a : (II)Ljava/lang/String;
    //   872: aload_2
    //   873: invokevirtual securityDefinitions : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/Map;
    //   876: astore #14
    //   878: aload #5
    //   880: aload #14
    //   882: invokevirtual setSecurityDefinitions : (Ljava/util/Map;)V
    //   885: aload_0
    //   886: sipush #-29014
    //   889: sipush #-9809
    //   892: invokestatic a : (II)Ljava/lang/String;
    //   895: aload #6
    //   897: iconst_0
    //   898: aload #4
    //   900: aload_2
    //   901: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   904: astore #10
    //   906: aload_0
    //   907: aload #10
    //   909: sipush #-29014
    //   912: sipush #-9809
    //   915: invokestatic a : (II)Ljava/lang/String;
    //   918: aload_2
    //   919: invokevirtual securityRequirements : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/List;
    //   922: astore #15
    //   924: aload #5
    //   926: aload #15
    //   928: invokevirtual setSecurity : (Ljava/util/List;)V
    //   931: aload_0
    //   932: sipush #-28959
    //   935: sipush #-21097
    //   938: invokestatic a : (II)Ljava/lang/String;
    //   941: aload #6
    //   943: iconst_0
    //   944: aload #4
    //   946: aload_2
    //   947: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   950: astore #10
    //   952: aload_0
    //   953: aload #10
    //   955: sipush #-28959
    //   958: sipush #-21097
    //   961: invokestatic a : (II)Ljava/lang/String;
    //   964: aload_2
    //   965: invokevirtual tags : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/List;
    //   968: astore #16
    //   970: aload #5
    //   972: aload #16
    //   974: invokevirtual tags : (Ljava/util/List;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   977: pop
    //   978: aload_0
    //   979: sipush #-29150
    //   982: sipush #-2998
    //   985: invokestatic a : (II)Ljava/lang/String;
    //   988: aload #6
    //   990: iconst_0
    //   991: aload #4
    //   993: aload_2
    //   994: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   997: astore #9
    //   999: aload_0
    //   1000: aload #9
    //   1002: sipush #-29150
    //   1005: sipush #-2998
    //   1008: invokestatic a : (II)Ljava/lang/String;
    //   1011: aload_2
    //   1012: invokevirtual externalDocs : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   1015: astore #17
    //   1017: aload #5
    //   1019: aload #17
    //   1021: invokevirtual externalDocs : (Lnet/portswigger/swagger/v1/models/ExternalDocs;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   1024: pop
    //   1025: aload_0
    //   1026: aload #6
    //   1028: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1031: astore #18
    //   1033: aload #18
    //   1035: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1040: astore #19
    //   1042: aload #19
    //   1044: invokeinterface hasNext : ()Z
    //   1049: ifeq -> 1135
    //   1052: aload #19
    //   1054: invokeinterface next : ()Ljava/lang/Object;
    //   1059: checkcast java/lang/String
    //   1062: astore #20
    //   1064: aload #20
    //   1066: sipush #-29005
    //   1069: sipush #17481
    //   1072: invokestatic a : (II)Ljava/lang/String;
    //   1075: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1078: ifeq -> 1104
    //   1081: aload #5
    //   1083: aload #20
    //   1085: aload_0
    //   1086: aload #6
    //   1088: aload #20
    //   1090: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1093: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   1096: invokevirtual vendorExtension : (Ljava/lang/String;Ljava/lang/Object;)Lnet/portswigger/swagger/v1/models/Swagger;
    //   1099: pop
    //   1100: aload_3
    //   1101: ifnonnull -> 1131
    //   1104: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.ROOT_KEYS : Ljava/util/Set;
    //   1107: aload #20
    //   1109: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1114: ifne -> 1131
    //   1117: aload_2
    //   1118: aload #4
    //   1120: aload #20
    //   1122: aload_1
    //   1123: aload #20
    //   1125: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1128: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1131: aload_3
    //   1132: ifnonnull -> 1042
    //   1135: aload_3
    //   1136: ifnonnull -> 1163
    //   1139: aload_2
    //   1140: ldc ''
    //   1142: ldc ''
    //   1144: sipush #-29145
    //   1147: sipush #1594
    //   1150: invokestatic a : (II)Ljava/lang/String;
    //   1153: aload_1
    //   1154: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1157: aload_2
    //   1158: invokevirtual invalid : ()V
    //   1161: aconst_null
    //   1162: areturn
    //   1163: aload #5
    //   1165: areturn
  }
  
  public Map<String, Path> paths(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: new java/util/LinkedHashMap
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #5
    //   12: astore #4
    //   14: aload_1
    //   15: ifnonnull -> 20
    //   18: aconst_null
    //   19: areturn
    //   20: aload_0
    //   21: aload_1
    //   22: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   25: astore #6
    //   27: aload #6
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #7
    //   36: aload #7
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 595
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #8
    //   58: aload_1
    //   59: aload #8
    //   61: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   64: astore #9
    //   66: aload #8
    //   68: sipush #-29005
    //   71: sipush #17481
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   80: ifeq -> 97
    //   83: aload_3
    //   84: aload_2
    //   85: aload #8
    //   87: aload #9
    //   89: invokevirtual unsupported : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   92: aload #4
    //   94: ifnonnull -> 590
    //   97: aload #9
    //   99: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   102: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   105: invokevirtual equals : (Ljava/lang/Object;)Z
    //   108: ifne -> 134
    //   111: aload_3
    //   112: aload_2
    //   113: aload #8
    //   115: sipush #-29145
    //   118: sipush #1594
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: aload #9
    //   126: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   129: aload #4
    //   131: ifnonnull -> 590
    //   134: aload #9
    //   136: checkcast com/fasterxml/Zg/Zr
    //   139: astore #10
    //   141: aload_0
    //   142: aload #10
    //   144: aload_2
    //   145: aload #8
    //   147: sipush #-28963
    //   150: sipush #9961
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: swap
    //   157: ldc '''
    //   159: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   164: aload_3
    //   165: invokevirtual path : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Path;
    //   168: astore #11
    //   170: sipush #-29061
    //   173: new java/util/ArrayList
    //   176: dup
    //   177: invokespecial <init> : ()V
    //   180: astore #12
    //   182: sipush #17649
    //   185: invokestatic a : (II)Ljava/lang/String;
    //   188: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   191: aload #8
    //   193: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   196: astore #13
    //   198: aload #13
    //   200: invokevirtual find : ()Z
    //   203: ifeq -> 224
    //   206: aload #12
    //   208: aload #13
    //   210: invokevirtual group : ()Ljava/lang/String;
    //   213: invokeinterface add : (Ljava/lang/Object;)Z
    //   218: pop
    //   219: aload #4
    //   221: ifnonnull -> 198
    //   224: aload_0
    //   225: aload #11
    //   227: invokevirtual getAllOperationsInAPath : (Lnet/portswigger/swagger/v1/models/Path;)Ljava/util/List;
    //   230: astore #14
    //   232: aload #14
    //   234: invokeinterface iterator : ()Ljava/util/Iterator;
    //   239: astore #15
    //   241: aload #15
    //   243: invokeinterface hasNext : ()Z
    //   248: ifeq -> 399
    //   251: aload #15
    //   253: invokeinterface next : ()Ljava/lang/Object;
    //   258: checkcast net/portswigger/swagger/v1/models/Operation
    //   261: astore #16
    //   263: aload #16
    //   265: invokevirtual getParameters : ()Ljava/util/List;
    //   268: invokeinterface iterator : ()Ljava/util/Iterator;
    //   273: astore #17
    //   275: aload #17
    //   277: invokeinterface hasNext : ()Z
    //   282: ifeq -> 394
    //   285: aload #17
    //   287: invokeinterface next : ()Ljava/lang/Object;
    //   292: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   295: astore #18
    //   297: sipush #-29111
    //   300: sipush #-1643
    //   303: invokestatic a : (II)Ljava/lang/String;
    //   306: aload #18
    //   308: invokeinterface getIn : ()Ljava/lang/String;
    //   313: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   316: ifeq -> 389
    //   319: aload #18
    //   321: invokeinterface getRequired : ()Z
    //   326: ifne -> 389
    //   329: aload_3
    //   330: aload_2
    //   331: aload #18
    //   333: invokeinterface getName : ()Ljava/lang/String;
    //   338: sipush #-29011
    //   341: sipush #14962
    //   344: invokestatic a : (II)Ljava/lang/String;
    //   347: swap
    //   348: ldc '''
    //   350: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   355: aload #18
    //   357: invokeinterface getName : ()Ljava/lang/String;
    //   362: sipush #-28939
    //   365: sipush #-20182
    //   368: invokestatic a : (II)Ljava/lang/String;
    //   371: swap
    //   372: sipush #-29056
    //   375: sipush #11414
    //   378: invokestatic a : (II)Ljava/lang/String;
    //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   386: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   389: aload #4
    //   391: ifnonnull -> 275
    //   394: aload #4
    //   396: ifnonnull -> 241
    //   399: aload #12
    //   401: invokeinterface iterator : ()Ljava/util/Iterator;
    //   406: astore #15
    //   408: aload #15
    //   410: invokeinterface hasNext : ()Z
    //   415: ifeq -> 578
    //   418: aload #15
    //   420: invokeinterface next : ()Ljava/lang/Object;
    //   425: checkcast java/lang/String
    //   428: astore #16
    //   430: aload #16
    //   432: iconst_1
    //   433: aload #16
    //   435: invokevirtual length : ()I
    //   438: iconst_1
    //   439: isub
    //   440: invokevirtual substring : (II)Ljava/lang/String;
    //   443: astore #17
    //   445: aload_0
    //   446: aload #17
    //   448: aload #11
    //   450: invokevirtual getParameters : ()Ljava/util/List;
    //   453: invokevirtual isPathParamDefined : (Ljava/lang/String;Ljava/util/List;)Z
    //   456: istore #18
    //   458: iload #18
    //   460: ifeq -> 468
    //   463: aload #4
    //   465: ifnonnull -> 408
    //   468: aload #14
    //   470: invokeinterface iterator : ()Ljava/util/Iterator;
    //   475: astore #19
    //   477: aload #19
    //   479: invokeinterface hasNext : ()Z
    //   484: ifeq -> 573
    //   487: aload #19
    //   489: invokeinterface next : ()Ljava/lang/Object;
    //   494: checkcast net/portswigger/swagger/v1/models/Operation
    //   497: astore #20
    //   499: aload_0
    //   500: aload #17
    //   502: aload #20
    //   504: invokevirtual getParameters : ()Ljava/util/List;
    //   507: invokevirtual isPathParamDefined : (Ljava/lang/String;Ljava/util/List;)Z
    //   510: ifne -> 568
    //   513: aload_3
    //   514: aload_2
    //   515: aload #8
    //   517: sipush #-29011
    //   520: sipush #14962
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: swap
    //   527: ldc '''
    //   529: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   534: aload #17
    //   536: sipush #-29055
    //   539: sipush #24059
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: swap
    //   546: sipush #-28944
    //   549: sipush #32291
    //   552: invokestatic a : (II)Ljava/lang/String;
    //   555: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   560: invokevirtual warning : (Ljava/lang/String;Ljava/lang/String;)V
    //   563: aload #4
    //   565: ifnonnull -> 573
    //   568: aload #4
    //   570: ifnonnull -> 477
    //   573: aload #4
    //   575: ifnonnull -> 408
    //   578: aload #5
    //   580: aload #8
    //   582: aload #11
    //   584: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   589: pop
    //   590: aload #4
    //   592: ifnonnull -> 36
    //   595: aload #5
    //   597: areturn
  }
  
  private boolean isPathParamDefined(String paramString, List<Parameter> paramList) {
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramList == null || paramList.isEmpty())
      return false; 
    for (Parameter parameter : paramList) {
      if (parameter instanceof RefParameter || (paramString.equals(parameter.getName()) && a(-29100, 8122).equals(parameter.getIn()))) {
        if (!parameter.getRequired());
        return true;
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  private void addToOperationsList(List<Operation> paramList, Operation paramOperation) {
    if (paramOperation == null)
      return; 
    paramList.add(paramOperation);
  }
  
  private List<Operation> getAllOperationsInAPath(Path paramPath) {
    ArrayList<Operation> arrayList = new ArrayList();
    addToOperationsList(arrayList, paramPath.getGet());
    addToOperationsList(arrayList, paramPath.getPut());
    addToOperationsList(arrayList, paramPath.getPost());
    addToOperationsList(arrayList, paramPath.getPatch());
    addToOperationsList(arrayList, paramPath.getDelete());
    addToOperationsList(arrayList, paramPath.getOptions());
    addToOperationsList(arrayList, paramPath.getHead());
    return arrayList;
  }
  
  public Path path(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: sipush #-28971
    //   9: sipush #19067
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   18: ifnull -> 143
    //   21: aload_1
    //   22: sipush #-28971
    //   25: sipush #19067
    //   28: invokestatic a : (II)Ljava/lang/String;
    //   31: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   34: astore #5
    //   36: aload #5
    //   38: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   41: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: ifeq -> 62
    //   50: aload_0
    //   51: aload #5
    //   53: checkcast com/fasterxml/Zg/Zb
    //   56: aload_2
    //   57: aload_3
    //   58: invokevirtual pathRef : (Lcom/fasterxml/Zg/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Path;
    //   61: areturn
    //   62: aload #5
    //   64: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   67: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   70: invokevirtual equals : (Ljava/lang/Object;)Z
    //   73: ifeq -> 141
    //   76: aload #5
    //   78: checkcast com/fasterxml/Zg/Zr
    //   81: astore #6
    //   83: aload_0
    //   84: aload #6
    //   86: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   89: astore #7
    //   91: aload #7
    //   93: invokeinterface iterator : ()Ljava/util/Iterator;
    //   98: astore #8
    //   100: aload #8
    //   102: invokeinterface hasNext : ()Z
    //   107: ifeq -> 141
    //   110: aload #8
    //   112: invokeinterface next : ()Ljava/lang/Object;
    //   117: checkcast java/lang/String
    //   120: astore #9
    //   122: aload_3
    //   123: aload_2
    //   124: aload #9
    //   126: aload #6
    //   128: aload #9
    //   130: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   133: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   136: aload #4
    //   138: ifnonnull -> 100
    //   141: aconst_null
    //   142: areturn
    //   143: new net/portswigger/swagger/v1/models/Path
    //   146: dup
    //   147: invokespecial <init> : ()V
    //   150: astore #5
    //   152: aload_0
    //   153: sipush #-28968
    //   156: sipush #-2799
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: aload_1
    //   163: iconst_0
    //   164: aload_2
    //   165: aload_3
    //   166: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   169: astore #6
    //   171: aload #5
    //   173: aload_0
    //   174: aload #6
    //   176: aload_2
    //   177: aload_3
    //   178: invokevirtual parameters : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/List;
    //   181: invokevirtual setParameters : (Ljava/util/List;)V
    //   184: aload_0
    //   185: sipush #-29016
    //   188: sipush #-28356
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: aload_1
    //   195: iconst_0
    //   196: aload_2
    //   197: aload_3
    //   198: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   201: astore #7
    //   203: aload #7
    //   205: ifnull -> 244
    //   208: aload_0
    //   209: aload #7
    //   211: aload_2
    //   212: sipush #-29006
    //   215: sipush #1932
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   226: aload_3
    //   227: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   230: astore #8
    //   232: aload #8
    //   234: ifnull -> 244
    //   237: aload #5
    //   239: aload #8
    //   241: invokevirtual setGet : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   244: aload_0
    //   245: sipush #-29025
    //   248: sipush #-1595
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: aload_1
    //   255: iconst_0
    //   256: aload_2
    //   257: aload_3
    //   258: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   261: astore #7
    //   263: aload #7
    //   265: ifnull -> 304
    //   268: aload_0
    //   269: aload #7
    //   271: aload_2
    //   272: sipush #-29030
    //   275: sipush #22722
    //   278: invokestatic a : (II)Ljava/lang/String;
    //   281: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   286: aload_3
    //   287: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   290: astore #8
    //   292: aload #8
    //   294: ifnull -> 304
    //   297: aload #5
    //   299: aload #8
    //   301: invokevirtual setPut : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   304: aload_0
    //   305: sipush #-29042
    //   308: sipush #-20933
    //   311: invokestatic a : (II)Ljava/lang/String;
    //   314: aload_1
    //   315: iconst_0
    //   316: aload_2
    //   317: aload_3
    //   318: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   321: astore #7
    //   323: aload #7
    //   325: ifnull -> 364
    //   328: aload_0
    //   329: aload #7
    //   331: aload_2
    //   332: sipush #-29089
    //   335: sipush #3202
    //   338: invokestatic a : (II)Ljava/lang/String;
    //   341: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   346: aload_3
    //   347: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   350: astore #8
    //   352: aload #8
    //   354: ifnull -> 364
    //   357: aload #5
    //   359: aload #8
    //   361: invokevirtual setPost : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   364: aload_0
    //   365: sipush #-29007
    //   368: sipush #16555
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: aload_1
    //   375: iconst_0
    //   376: aload_2
    //   377: aload_3
    //   378: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   381: astore #7
    //   383: aload #7
    //   385: ifnull -> 424
    //   388: aload_0
    //   389: aload #7
    //   391: aload_2
    //   392: sipush #-29138
    //   395: sipush #-29740
    //   398: invokestatic a : (II)Ljava/lang/String;
    //   401: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   406: aload_3
    //   407: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   410: astore #8
    //   412: aload #8
    //   414: ifnull -> 424
    //   417: aload #5
    //   419: aload #8
    //   421: invokevirtual setHead : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   424: aload_0
    //   425: sipush #-29038
    //   428: sipush #-14529
    //   431: invokestatic a : (II)Ljava/lang/String;
    //   434: aload_1
    //   435: iconst_0
    //   436: aload_2
    //   437: aload_3
    //   438: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   441: astore #7
    //   443: aload #7
    //   445: ifnull -> 484
    //   448: aload_0
    //   449: aload #7
    //   451: aload_2
    //   452: sipush #-29078
    //   455: sipush #24363
    //   458: invokestatic a : (II)Ljava/lang/String;
    //   461: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   466: aload_3
    //   467: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   470: astore #8
    //   472: aload #8
    //   474: ifnull -> 484
    //   477: aload #5
    //   479: aload #8
    //   481: invokevirtual setDelete : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   484: aload_0
    //   485: sipush #-28958
    //   488: sipush #-946
    //   491: invokestatic a : (II)Ljava/lang/String;
    //   494: aload_1
    //   495: iconst_0
    //   496: aload_2
    //   497: aload_3
    //   498: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   501: astore #7
    //   503: aload #7
    //   505: ifnull -> 544
    //   508: aload_0
    //   509: aload #7
    //   511: aload_2
    //   512: sipush #-28964
    //   515: sipush #-11486
    //   518: invokestatic a : (II)Ljava/lang/String;
    //   521: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   526: aload_3
    //   527: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   530: astore #8
    //   532: aload #8
    //   534: ifnull -> 544
    //   537: aload #5
    //   539: aload #8
    //   541: invokevirtual setPatch : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   544: aload_0
    //   545: sipush #-28942
    //   548: sipush #-10584
    //   551: invokestatic a : (II)Ljava/lang/String;
    //   554: aload_1
    //   555: iconst_0
    //   556: aload_2
    //   557: aload_3
    //   558: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   561: astore #7
    //   563: aload #7
    //   565: ifnull -> 604
    //   568: aload_0
    //   569: aload #7
    //   571: aload_2
    //   572: sipush #-28957
    //   575: sipush #-27681
    //   578: invokestatic a : (II)Ljava/lang/String;
    //   581: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   586: aload_3
    //   587: invokevirtual operation : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Operation;
    //   590: astore #8
    //   592: aload #8
    //   594: ifnull -> 604
    //   597: aload #5
    //   599: aload #8
    //   601: invokevirtual setOptions : (Lnet/portswigger/swagger/v1/models/Operation;)V
    //   604: aload_0
    //   605: aload_1
    //   606: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   609: astore #8
    //   611: aload #8
    //   613: invokeinterface iterator : ()Ljava/util/Iterator;
    //   618: astore #9
    //   620: aload #9
    //   622: invokeinterface hasNext : ()Z
    //   627: ifeq -> 712
    //   630: aload #9
    //   632: invokeinterface next : ()Ljava/lang/Object;
    //   637: checkcast java/lang/String
    //   640: astore #10
    //   642: aload #10
    //   644: sipush #-29005
    //   647: sipush #17481
    //   650: invokestatic a : (II)Ljava/lang/String;
    //   653: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   656: ifeq -> 681
    //   659: aload #5
    //   661: aload #10
    //   663: aload_0
    //   664: aload_1
    //   665: aload #10
    //   667: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   670: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   673: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   676: aload #4
    //   678: ifnonnull -> 707
    //   681: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.PATH_KEYS : Ljava/util/Set;
    //   684: aload #10
    //   686: invokeinterface contains : (Ljava/lang/Object;)Z
    //   691: ifne -> 707
    //   694: aload_3
    //   695: aload_2
    //   696: aload #10
    //   698: aload_1
    //   699: aload #10
    //   701: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   704: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   707: aload #4
    //   709: ifnonnull -> 620
    //   712: aload #5
    //   714: areturn
  }
  
  public Operation operation(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v1/models/Operation
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-29148
    //   24: sipush #27490
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_0
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   37: astore #6
    //   39: aload_0
    //   40: aload #6
    //   42: aload_2
    //   43: aload_3
    //   44: invokevirtual tagStrings : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/List;
    //   47: astore #7
    //   49: aload #7
    //   51: ifnull -> 62
    //   54: aload #5
    //   56: aload #7
    //   58: invokevirtual tags : (Ljava/util/List;)Lnet/portswigger/swagger/v1/models/Operation;
    //   61: pop
    //   62: aload_0
    //   63: sipush #-29018
    //   66: sipush #-20471
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: aload_1
    //   73: iconst_0
    //   74: aload_2
    //   75: aload_3
    //   76: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   79: astore #8
    //   81: aload #5
    //   83: aload #8
    //   85: invokevirtual summary : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Operation;
    //   88: pop
    //   89: aload_0
    //   90: sipush #-29094
    //   93: sipush #23166
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: aload_1
    //   100: iconst_0
    //   101: aload_2
    //   102: aload_3
    //   103: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   106: astore #8
    //   108: aload #5
    //   110: aload #8
    //   112: invokevirtual description : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Operation;
    //   115: pop
    //   116: aload_0
    //   117: sipush #-29150
    //   120: sipush #-2998
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: aload_1
    //   127: iconst_0
    //   128: aload_2
    //   129: aload_3
    //   130: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   133: astore #9
    //   135: aload_0
    //   136: aload #9
    //   138: aload_2
    //   139: aload_3
    //   140: invokevirtual externalDocs : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   143: astore #10
    //   145: aload #5
    //   147: aload #10
    //   149: invokevirtual setExternalDocs : (Lnet/portswigger/swagger/v1/models/ExternalDocs;)V
    //   152: aload_0
    //   153: sipush #-28953
    //   156: sipush #4462
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: aload_1
    //   163: iconst_0
    //   164: aload_2
    //   165: aload_3
    //   166: aload_0
    //   167: getfield operationIDs : Ljava/util/Set;
    //   170: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;Ljava/util/Set;)Ljava/lang/String;
    //   173: astore #8
    //   175: aload #5
    //   177: aload #8
    //   179: invokevirtual operationId : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Operation;
    //   182: pop
    //   183: aload_0
    //   184: sipush #-29114
    //   187: sipush #-2798
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: aload_1
    //   194: iconst_0
    //   195: aload_2
    //   196: aload_3
    //   197: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   200: astore #6
    //   202: aload #6
    //   204: ifnull -> 300
    //   207: aload #6
    //   209: invokevirtual Zv : ()I
    //   212: ifne -> 229
    //   215: aload #5
    //   217: invokestatic emptyList : ()Ljava/util/List;
    //   220: invokevirtual consumes : (Ljava/util/List;)Lnet/portswigger/swagger/v1/models/Operation;
    //   223: pop
    //   224: aload #4
    //   226: ifnonnull -> 300
    //   229: aload #6
    //   231: invokevirtual iterator : ()Ljava/util/Iterator;
    //   234: astore #11
    //   236: aload #11
    //   238: invokeinterface hasNext : ()Z
    //   243: ifeq -> 300
    //   246: aload #11
    //   248: invokeinterface next : ()Ljava/lang/Object;
    //   253: checkcast com/fasterxml/Zor/Zb
    //   256: astore #12
    //   258: aload_0
    //   259: aload #12
    //   261: aload_2
    //   262: sipush #-28973
    //   265: sipush #-16402
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   276: aload_3
    //   277: invokevirtual getString : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   280: astore #13
    //   282: aload #13
    //   284: ifnull -> 295
    //   287: aload #5
    //   289: aload #13
    //   291: invokevirtual consumes : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Operation;
    //   294: pop
    //   295: aload #4
    //   297: ifnonnull -> 236
    //   300: aload_0
    //   301: sipush #-29107
    //   304: sipush #-16742
    //   307: invokestatic a : (II)Ljava/lang/String;
    //   310: aload_1
    //   311: iconst_0
    //   312: aload_2
    //   313: aload_3
    //   314: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   317: astore #6
    //   319: aload #6
    //   321: ifnull -> 417
    //   324: aload #6
    //   326: invokevirtual Zv : ()I
    //   329: ifne -> 346
    //   332: aload #5
    //   334: invokestatic emptyList : ()Ljava/util/List;
    //   337: invokevirtual produces : (Ljava/util/List;)Lnet/portswigger/swagger/v1/models/Operation;
    //   340: pop
    //   341: aload #4
    //   343: ifnonnull -> 417
    //   346: aload #6
    //   348: invokevirtual iterator : ()Ljava/util/Iterator;
    //   351: astore #11
    //   353: aload #11
    //   355: invokeinterface hasNext : ()Z
    //   360: ifeq -> 417
    //   363: aload #11
    //   365: invokeinterface next : ()Ljava/lang/Object;
    //   370: checkcast com/fasterxml/Zor/Zb
    //   373: astore #12
    //   375: aload_0
    //   376: aload #12
    //   378: aload_2
    //   379: sipush #-29073
    //   382: sipush #-12145
    //   385: invokestatic a : (II)Ljava/lang/String;
    //   388: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   393: aload_3
    //   394: invokevirtual getString : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   397: astore #13
    //   399: aload #13
    //   401: ifnull -> 412
    //   404: aload #5
    //   406: aload #13
    //   408: invokevirtual produces : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Operation;
    //   411: pop
    //   412: aload #4
    //   414: ifnonnull -> 353
    //   417: aload_0
    //   418: sipush #-29049
    //   421: sipush #-10258
    //   424: invokestatic a : (II)Ljava/lang/String;
    //   427: aload_1
    //   428: iconst_0
    //   429: aload_2
    //   430: aload_3
    //   431: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   434: astore #11
    //   436: aload #5
    //   438: aload_0
    //   439: aload #11
    //   441: aload_2
    //   442: aload_3
    //   443: invokevirtual parameters : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/List;
    //   446: invokevirtual setParameters : (Ljava/util/List;)V
    //   449: aload_0
    //   450: sipush #-29000
    //   453: sipush #7356
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: aload_1
    //   460: iconst_1
    //   461: aload_2
    //   462: sipush #-29024
    //   465: sipush #16952
    //   468: invokestatic a : (II)Ljava/lang/String;
    //   471: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   476: aload_3
    //   477: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   480: astore #12
    //   482: aload_0
    //   483: aload #12
    //   485: aload_2
    //   486: sipush #-29024
    //   489: sipush #16952
    //   492: invokestatic a : (II)Ljava/lang/String;
    //   495: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   500: aload_3
    //   501: invokevirtual responses : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Responses;
    //   504: astore #13
    //   506: aload #13
    //   508: ifnull -> 533
    //   511: aload #13
    //   513: invokevirtual size : ()I
    //   516: ifne -> 533
    //   519: aload_3
    //   520: aload_2
    //   521: sipush #-29048
    //   524: sipush #27878
    //   527: invokestatic a : (II)Ljava/lang/String;
    //   530: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   533: aload #5
    //   535: aload #13
    //   537: invokevirtual setResponsesObject : (Lnet/portswigger/swagger/v1/models/Responses;)V
    //   540: aload_0
    //   541: sipush #-29101
    //   544: sipush #25225
    //   547: invokestatic a : (II)Ljava/lang/String;
    //   550: aload_1
    //   551: iconst_0
    //   552: aload_2
    //   553: aload_3
    //   554: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   557: astore #6
    //   559: aload #6
    //   561: ifnull -> 647
    //   564: aload #6
    //   566: invokevirtual iterator : ()Ljava/util/Iterator;
    //   569: astore #14
    //   571: aload #14
    //   573: invokeinterface hasNext : ()Z
    //   578: ifeq -> 647
    //   581: aload #14
    //   583: invokeinterface next : ()Ljava/lang/Object;
    //   588: checkcast com/fasterxml/Zor/Zb
    //   591: astore #15
    //   593: aload_0
    //   594: aload #15
    //   596: aload_2
    //   597: sipush #-29074
    //   600: sipush #8456
    //   603: invokestatic a : (II)Ljava/lang/String;
    //   606: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   611: aload_3
    //   612: invokevirtual getString : (Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   615: astore #16
    //   617: aload #16
    //   619: ifnull -> 642
    //   622: aload #16
    //   624: invokestatic forValue : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Scheme;
    //   627: astore #17
    //   629: aload #17
    //   631: ifnull -> 642
    //   634: aload #5
    //   636: aload #17
    //   638: invokevirtual scheme : (Lnet/portswigger/swagger/v1/models/Scheme;)Lnet/portswigger/swagger/v1/models/Operation;
    //   641: pop
    //   642: aload #4
    //   644: ifnonnull -> 571
    //   647: aload_0
    //   648: sipush #-29012
    //   651: sipush #4416
    //   654: invokestatic a : (II)Ljava/lang/String;
    //   657: aload_1
    //   658: iconst_0
    //   659: aload_2
    //   660: aload_3
    //   661: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   664: astore #14
    //   666: aload #14
    //   668: ifnull -> 678
    //   671: aload #5
    //   673: aload #14
    //   675: invokevirtual setDeprecated : (Ljava/lang/Boolean;)V
    //   678: aload_0
    //   679: sipush #-29093
    //   682: sipush #9629
    //   685: invokestatic a : (II)Ljava/lang/String;
    //   688: aload_1
    //   689: iconst_0
    //   690: aload_2
    //   691: aload_3
    //   692: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   695: astore #6
    //   697: aload_0
    //   698: aload #6
    //   700: aload_2
    //   701: aload_3
    //   702: invokevirtual securityRequirements : (Lcom/fasterxml/Zg/Zh;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/List;
    //   705: astore #15
    //   707: aload #15
    //   709: ifnull -> 814
    //   712: new java/util/ArrayList
    //   715: dup
    //   716: invokespecial <init> : ()V
    //   719: astore #16
    //   721: aload #15
    //   723: invokeinterface iterator : ()Ljava/util/Iterator;
    //   728: astore #17
    //   730: aload #17
    //   732: invokeinterface hasNext : ()Z
    //   737: ifeq -> 807
    //   740: aload #17
    //   742: invokeinterface next : ()Ljava/lang/Object;
    //   747: checkcast net/portswigger/swagger/v1/models/SecurityRequirement
    //   750: astore #18
    //   752: aload #18
    //   754: invokevirtual getRequirements : ()Ljava/util/Map;
    //   757: ifnull -> 802
    //   760: aload #18
    //   762: invokevirtual getRequirements : ()Ljava/util/Map;
    //   765: invokeinterface size : ()I
    //   770: ifle -> 791
    //   773: aload #16
    //   775: aload #18
    //   777: invokevirtual getRequirements : ()Ljava/util/Map;
    //   780: invokeinterface add : (Ljava/lang/Object;)Z
    //   785: pop
    //   786: aload #4
    //   788: ifnonnull -> 802
    //   791: aload #16
    //   793: invokestatic emptyMap : ()Ljava/util/Map;
    //   796: invokeinterface add : (Ljava/lang/Object;)Z
    //   801: pop
    //   802: aload #4
    //   804: ifnonnull -> 730
    //   807: aload #5
    //   809: aload #16
    //   811: invokevirtual setSecurity : (Ljava/util/List;)V
    //   814: aload_0
    //   815: aload_1
    //   816: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   819: astore #16
    //   821: aload #16
    //   823: invokeinterface iterator : ()Ljava/util/Iterator;
    //   828: astore #17
    //   830: aload #17
    //   832: invokeinterface hasNext : ()Z
    //   837: ifeq -> 922
    //   840: aload #17
    //   842: invokeinterface next : ()Ljava/lang/Object;
    //   847: checkcast java/lang/String
    //   850: astore #18
    //   852: aload #18
    //   854: sipush #-29005
    //   857: sipush #17481
    //   860: invokestatic a : (II)Ljava/lang/String;
    //   863: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   866: ifeq -> 891
    //   869: aload #5
    //   871: aload #18
    //   873: aload_0
    //   874: aload_1
    //   875: aload #18
    //   877: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   880: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   883: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   886: aload #4
    //   888: ifnonnull -> 917
    //   891: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.OPERATION_KEYS : Ljava/util/Set;
    //   894: aload #18
    //   896: invokeinterface contains : (Ljava/lang/Object;)Z
    //   901: ifne -> 917
    //   904: aload_3
    //   905: aload_2
    //   906: aload #18
    //   908: aload_1
    //   909: aload #18
    //   911: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   914: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   917: aload #4
    //   919: ifnonnull -> 830
    //   922: aload #5
    //   924: areturn
  }
  
  public Boolean getBoolean(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
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
  
  public List<Parameter> parameters(Zh paramZh, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    ArrayList<Parameter> arrayList = new ArrayList();
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramZh == null)
      return arrayList; 
    for (Zb zb : paramZh) {
      if (zb.ZF().equals(Zfr.OBJECT)) {
        Parameter parameter = parameter((Zr)zb, paramString, paramSwaggerDeserializer$ParseResult);
        if (parameter != null)
          arrayList.add(parameter); 
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  public Parameter parameter(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aconst_null
    //   12: astore #5
    //   14: aload_1
    //   15: sipush #-28971
    //   18: sipush #19067
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   27: astore #6
    //   29: aload #6
    //   31: ifnull -> 86
    //   34: aload #6
    //   36: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   39: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   42: invokevirtual equals : (Ljava/lang/Object;)Z
    //   45: ifeq -> 60
    //   48: aload_0
    //   49: aload #6
    //   51: checkcast com/fasterxml/Zg/Zb
    //   54: aload_2
    //   55: aload_3
    //   56: invokevirtual refParameter : (Lcom/fasterxml/Zg/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/parameters/RefParameter;
    //   59: areturn
    //   60: aload_3
    //   61: aload_2
    //   62: sipush #-28971
    //   65: sipush #19067
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: sipush #-28931
    //   74: sipush #-32249
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: aload_1
    //   81: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   84: aconst_null
    //   85: areturn
    //   86: aconst_null
    //   87: astore #7
    //   89: aload_1
    //   90: sipush #-28955
    //   93: sipush #-27372
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   102: astore #8
    //   104: aload #8
    //   106: ifnull -> 119
    //   109: aload #8
    //   111: invokevirtual Zp : ()Ljava/lang/String;
    //   114: astore #7
    //   116: goto -> 130
    //   119: sipush #-28982
    //   122: sipush #-3006
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: astore #7
    //   130: aload_2
    //   131: aload #7
    //   133: sipush #-29119
    //   136: sipush #-21119
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: swap
    //   143: ldc ']'
    //   145: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   150: astore_2
    //   151: aload_0
    //   152: sipush #-29034
    //   155: sipush #227
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: aload_1
    //   162: iconst_1
    //   163: aload_2
    //   164: aload_3
    //   165: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   168: astore #9
    //   170: aload #9
    //   172: ifnull -> 1789
    //   175: aload_0
    //   176: sipush #-29008
    //   179: sipush #-24795
    //   182: invokestatic a : (II)Ljava/lang/String;
    //   185: aload_1
    //   186: iconst_0
    //   187: aload_2
    //   188: aload_3
    //   189: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   192: astore #10
    //   194: aload_0
    //   195: sipush #-29066
    //   198: sipush #-18193
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: aload_1
    //   205: iconst_0
    //   206: aload_2
    //   207: aload_3
    //   208: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   211: astore #11
    //   213: sipush #-29084
    //   216: aconst_null
    //   217: astore #12
    //   219: sipush #-26243
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: aload #9
    //   227: invokevirtual equals : (Ljava/lang/Object;)Z
    //   230: ifeq -> 245
    //   233: new net/portswigger/swagger/v1/models/parameters/QueryParameter
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: astore #12
    //   242: goto -> 329
    //   245: sipush #-28947
    //   248: sipush #15747
    //   251: invokestatic a : (II)Ljava/lang/String;
    //   254: aload #9
    //   256: invokevirtual equals : (Ljava/lang/Object;)Z
    //   259: ifeq -> 274
    //   262: new net/portswigger/swagger/v1/models/parameters/HeaderParameter
    //   265: dup
    //   266: invokespecial <init> : ()V
    //   269: astore #12
    //   271: goto -> 329
    //   274: sipush #-29111
    //   277: sipush #-1643
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: aload #9
    //   285: invokevirtual equals : (Ljava/lang/Object;)Z
    //   288: ifeq -> 303
    //   291: new net/portswigger/swagger/v1/models/parameters/PathParameter
    //   294: dup
    //   295: invokespecial <init> : ()V
    //   298: astore #12
    //   300: goto -> 329
    //   303: sipush #-29045
    //   306: sipush #-850
    //   309: invokestatic a : (II)Ljava/lang/String;
    //   312: aload #9
    //   314: invokevirtual equals : (Ljava/lang/Object;)Z
    //   317: ifeq -> 329
    //   320: new net/portswigger/swagger/v1/models/parameters/FormParameter
    //   323: dup
    //   324: invokespecial <init> : ()V
    //   327: astore #12
    //   329: aload #12
    //   331: ifnull -> 1389
    //   334: aload_0
    //   335: sipush #-29008
    //   338: sipush #-24795
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: aload_1
    //   345: iconst_1
    //   346: aload_2
    //   347: aload_3
    //   348: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   351: astore #13
    //   353: new java/util/LinkedHashMap
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: astore #14
    //   362: aload #14
    //   364: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.TYPE : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   367: aload #10
    //   369: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   374: pop
    //   375: aload #14
    //   377: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.FORMAT : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   380: aload #11
    //   382: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   387: pop
    //   388: aload_0
    //   389: aload_1
    //   390: aload #13
    //   392: aload_2
    //   393: aload_3
    //   394: invokevirtual parameterDefault : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   397: astore #15
    //   399: aload #14
    //   401: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.DEFAULT : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   404: aload #15
    //   406: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   411: pop
    //   412: aload #12
    //   414: aload #15
    //   416: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   419: aload_0
    //   420: sipush #-29064
    //   423: sipush #31731
    //   426: invokestatic a : (II)Ljava/lang/String;
    //   429: aload_1
    //   430: iconst_0
    //   431: aload_2
    //   432: aload_3
    //   433: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   436: astore #16
    //   438: aload #16
    //   440: ifnull -> 463
    //   443: aload #14
    //   445: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MAXIMUM : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   448: aload #16
    //   450: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   455: pop
    //   456: aload #12
    //   458: aload #16
    //   460: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   463: aload_0
    //   464: sipush #-29069
    //   467: sipush #16292
    //   470: invokestatic a : (II)Ljava/lang/String;
    //   473: aload_1
    //   474: iconst_0
    //   475: aload_2
    //   476: aload_3
    //   477: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   480: astore #17
    //   482: aload #17
    //   484: ifnull -> 507
    //   487: aload #14
    //   489: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.EXCLUSIVE_MAXIMUM : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   492: aload #17
    //   494: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   499: pop
    //   500: aload #12
    //   502: aload #17
    //   504: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   507: aload_0
    //   508: sipush #-29033
    //   511: sipush #15352
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: aload_1
    //   518: iconst_0
    //   519: aload_2
    //   520: aload_3
    //   521: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   524: astore #16
    //   526: aload #16
    //   528: ifnull -> 551
    //   531: aload #14
    //   533: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MINIMUM : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   536: aload #16
    //   538: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   543: pop
    //   544: aload #12
    //   546: aload #16
    //   548: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   551: aload_0
    //   552: sipush #-29099
    //   555: sipush #-4649
    //   558: invokestatic a : (II)Ljava/lang/String;
    //   561: aload_1
    //   562: iconst_0
    //   563: aload_2
    //   564: aload_3
    //   565: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   568: astore #17
    //   570: aload #17
    //   572: ifnull -> 595
    //   575: aload #14
    //   577: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.EXCLUSIVE_MINIMUM : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   580: aload #17
    //   582: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   587: pop
    //   588: aload #12
    //   590: aload #17
    //   592: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   595: aload_0
    //   596: sipush #-28961
    //   599: sipush #-10878
    //   602: invokestatic a : (II)Ljava/lang/String;
    //   605: aload_1
    //   606: iconst_0
    //   607: aload_2
    //   608: aload_3
    //   609: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   612: astore #18
    //   614: aload #14
    //   616: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MAX_LENGTH : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   619: aload #18
    //   621: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   626: pop
    //   627: aload #12
    //   629: aload #18
    //   631: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   634: aload_0
    //   635: sipush #-29054
    //   638: sipush #-21018
    //   641: invokestatic a : (II)Ljava/lang/String;
    //   644: aload_1
    //   645: iconst_0
    //   646: aload_2
    //   647: aload_3
    //   648: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   651: astore #19
    //   653: aload #14
    //   655: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MIN_LENGTH : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   658: aload #19
    //   660: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   665: pop
    //   666: aload #12
    //   668: aload #19
    //   670: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   673: aload_0
    //   674: sipush #-29083
    //   677: sipush #-24709
    //   680: invokestatic a : (II)Ljava/lang/String;
    //   683: aload_1
    //   684: iconst_0
    //   685: aload_2
    //   686: aload_3
    //   687: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   690: astore #20
    //   692: aload #14
    //   694: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.PATTERN : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   697: aload #20
    //   699: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   704: pop
    //   705: aload #12
    //   707: aload #20
    //   709: invokevirtual setPattern : (Ljava/lang/String;)V
    //   712: aload_0
    //   713: sipush #-28994
    //   716: sipush #-27336
    //   719: invokestatic a : (II)Ljava/lang/String;
    //   722: aload_1
    //   723: iconst_0
    //   724: aload_2
    //   725: aload_3
    //   726: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   729: astore #21
    //   731: aload #14
    //   733: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MAX_ITEMS : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   736: aload #21
    //   738: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   743: pop
    //   744: aload #12
    //   746: aload #21
    //   748: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   751: aload_0
    //   752: sipush #-28993
    //   755: sipush #-30228
    //   758: invokestatic a : (II)Ljava/lang/String;
    //   761: aload_1
    //   762: iconst_0
    //   763: aload_2
    //   764: aload_3
    //   765: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   768: astore #21
    //   770: aload #14
    //   772: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MIN_ITEMS : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   775: aload #21
    //   777: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   782: pop
    //   783: aload #12
    //   785: aload #21
    //   787: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   790: aload_0
    //   791: sipush #-29054
    //   794: sipush #-21018
    //   797: invokestatic a : (II)Ljava/lang/String;
    //   800: aload_1
    //   801: iconst_0
    //   802: aload_2
    //   803: aload_3
    //   804: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   807: astore #21
    //   809: aload #14
    //   811: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MIN_LENGTH : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   814: aload #21
    //   816: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   821: pop
    //   822: aload #12
    //   824: aload #21
    //   826: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   829: aload_0
    //   830: sipush #-28961
    //   833: sipush #-10878
    //   836: invokestatic a : (II)Ljava/lang/String;
    //   839: aload_1
    //   840: iconst_0
    //   841: aload_2
    //   842: aload_3
    //   843: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   846: astore #21
    //   848: aload #14
    //   850: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MAX_LENGTH : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   853: aload #21
    //   855: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   860: pop
    //   861: aload #12
    //   863: aload #21
    //   865: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   868: aload_0
    //   869: sipush #-29015
    //   872: sipush #-12485
    //   875: invokestatic a : (II)Ljava/lang/String;
    //   878: aload_1
    //   879: iconst_0
    //   880: aload_2
    //   881: aload_3
    //   882: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   885: astore #16
    //   887: aload #16
    //   889: ifnull -> 918
    //   892: aload #14
    //   894: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.MULTIPLE_OF : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   897: aload #16
    //   899: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   904: pop
    //   905: aload #12
    //   907: aload #16
    //   909: invokevirtual doubleValue : ()D
    //   912: invokestatic valueOf : (D)Ljava/lang/Double;
    //   915: invokevirtual setMultipleOf : (Ljava/lang/Number;)V
    //   918: aload_0
    //   919: sipush #-29057
    //   922: sipush #21805
    //   925: invokestatic a : (II)Ljava/lang/String;
    //   928: aload_1
    //   929: iconst_0
    //   930: aload_2
    //   931: aload_3
    //   932: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   935: astore #22
    //   937: aload #14
    //   939: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.UNIQUE_ITEMS : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   942: aload #22
    //   944: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   949: pop
    //   950: aload #12
    //   952: aload #22
    //   954: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   957: aload_0
    //   958: sipush #-28998
    //   961: sipush #32674
    //   964: invokestatic a : (II)Ljava/lang/String;
    //   967: aload_1
    //   968: iconst_0
    //   969: aload_2
    //   970: aload_3
    //   971: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   974: astore #23
    //   976: aload #23
    //   978: ifnull -> 1095
    //   981: new java/util/ArrayList
    //   984: dup
    //   985: invokespecial <init> : ()V
    //   988: astore #24
    //   990: aload #23
    //   992: invokevirtual iterator : ()Ljava/util/Iterator;
    //   995: astore #25
    //   997: aload #25
    //   999: invokeinterface hasNext : ()Z
    //   1004: ifeq -> 1075
    //   1007: aload #25
    //   1009: invokeinterface next : ()Ljava/lang/Object;
    //   1014: checkcast com/fasterxml/Zor/Zb
    //   1017: astore #26
    //   1019: aload #26
    //   1021: invokevirtual ZA : ()Z
    //   1024: ifeq -> 1045
    //   1027: aload #24
    //   1029: aload #26
    //   1031: invokevirtual Zp : ()Ljava/lang/String;
    //   1034: invokeinterface add : (Ljava/lang/Object;)Z
    //   1039: pop
    //   1040: aload #4
    //   1042: ifnonnull -> 1070
    //   1045: aload_3
    //   1046: aload_2
    //   1047: sipush #-28998
    //   1050: sipush #32674
    //   1053: invokestatic a : (II)Ljava/lang/String;
    //   1056: sipush #-29031
    //   1059: sipush #4541
    //   1062: invokestatic a : (II)Ljava/lang/String;
    //   1065: aload #26
    //   1067: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1070: aload #4
    //   1072: ifnonnull -> 997
    //   1075: aload #12
    //   1077: aload #24
    //   1079: invokevirtual setEnum : (Ljava/util/List;)V
    //   1082: aload #14
    //   1084: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.ENUM : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   1087: aload #24
    //   1089: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1094: pop
    //   1095: aload_0
    //   1096: sipush #-29087
    //   1099: sipush #-17784
    //   1102: invokestatic a : (II)Ljava/lang/String;
    //   1105: aload_1
    //   1106: iconst_0
    //   1107: aload_2
    //   1108: aload_3
    //   1109: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1112: astore #17
    //   1114: aload #17
    //   1116: ifnull -> 1139
    //   1119: aload #14
    //   1121: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.READ_ONLY : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   1124: aload #17
    //   1126: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1131: pop
    //   1132: aload #12
    //   1134: aload #17
    //   1136: invokevirtual setReadOnly : (Ljava/lang/Boolean;)V
    //   1139: aload_0
    //   1140: sipush #-28943
    //   1143: sipush #-19284
    //   1146: invokestatic a : (II)Ljava/lang/String;
    //   1149: aload_1
    //   1150: iconst_0
    //   1151: aload_2
    //   1152: aload_3
    //   1153: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1156: astore #17
    //   1158: aload #17
    //   1160: ifnull -> 1183
    //   1163: aload #14
    //   1165: getstatic net/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId.ALLOW_EMPTY_VALUE : Lnet/portswigger/swagger/v1/models/properties/PropertyBuilder$PropertyId;
    //   1168: aload #17
    //   1170: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1175: pop
    //   1176: aload #12
    //   1178: aload #17
    //   1180: invokevirtual setAllowEmptyValue : (Ljava/lang/Boolean;)V
    //   1183: aload #10
    //   1185: aload #11
    //   1187: aload #14
    //   1189: invokestatic build : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   1192: astore #24
    //   1194: aload #24
    //   1196: ifnull -> 1248
    //   1199: aload #12
    //   1201: aload #24
    //   1203: invokevirtual setProperty : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   1206: aload_0
    //   1207: sipush #-29004
    //   1210: sipush #2368
    //   1213: invokestatic a : (II)Ljava/lang/String;
    //   1216: aload_1
    //   1217: iconst_0
    //   1218: aload_2
    //   1219: aload_3
    //   1220: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   1223: astore #25
    //   1225: aload #25
    //   1227: ifnull -> 1248
    //   1230: aload_0
    //   1231: aconst_null
    //   1232: aload #25
    //   1234: aload_2
    //   1235: aload_3
    //   1236: invokevirtual schema : (Ljava/util/Map;Lcom/fasterxml/Zor/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   1239: astore #26
    //   1241: aload #12
    //   1243: aload #26
    //   1245: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   1248: aload_0
    //   1249: aload_1
    //   1250: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1253: astore #25
    //   1255: aload #25
    //   1257: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1262: astore #26
    //   1264: aload #26
    //   1266: invokeinterface hasNext : ()Z
    //   1271: ifeq -> 1356
    //   1274: aload #26
    //   1276: invokeinterface next : ()Ljava/lang/Object;
    //   1281: checkcast java/lang/String
    //   1284: astore #27
    //   1286: aload #27
    //   1288: sipush #-29005
    //   1291: sipush #17481
    //   1294: invokestatic a : (II)Ljava/lang/String;
    //   1297: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1300: ifeq -> 1325
    //   1303: aload #12
    //   1305: aload #27
    //   1307: aload_0
    //   1308: aload_1
    //   1309: aload #27
    //   1311: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1314: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   1317: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1320: aload #4
    //   1322: ifnonnull -> 1351
    //   1325: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.PARAMETER_KEYS : Ljava/util/Set;
    //   1328: aload #27
    //   1330: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1335: ifne -> 1351
    //   1338: aload_3
    //   1339: aload_2
    //   1340: aload #27
    //   1342: aload_1
    //   1343: aload #27
    //   1345: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1348: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1351: aload #4
    //   1353: ifnonnull -> 1264
    //   1356: aload_0
    //   1357: sipush #-29137
    //   1360: sipush #16026
    //   1363: invokestatic a : (II)Ljava/lang/String;
    //   1366: aload_1
    //   1367: iconst_0
    //   1368: aload_2
    //   1369: aload_3
    //   1370: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   1373: astore #26
    //   1375: aload #12
    //   1377: aload #26
    //   1379: invokevirtual setCollectionFormat : (Ljava/lang/String;)V
    //   1382: aload #12
    //   1384: astore #5
    //   1386: goto -> 1692
    //   1389: sipush #-29052
    //   1392: sipush #26595
    //   1395: invokestatic a : (II)Ljava/lang/String;
    //   1398: aload #9
    //   1400: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1403: ifeq -> 1692
    //   1406: new net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   1409: dup
    //   1410: invokespecial <init> : ()V
    //   1413: astore #13
    //   1415: aload_1
    //   1416: sipush #-28977
    //   1419: sipush #-32496
    //   1422: invokestatic a : (II)Ljava/lang/String;
    //   1425: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1428: astore #14
    //   1430: aload #14
    //   1432: ifnull -> 1459
    //   1435: aload #14
    //   1437: instanceof com/fasterxml/Zg/Zr
    //   1440: ifeq -> 1459
    //   1443: aload #13
    //   1445: aload_0
    //   1446: aload #14
    //   1448: checkcast com/fasterxml/Zg/Zr
    //   1451: aload_2
    //   1452: aload_3
    //   1453: invokevirtual definition : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Model;
    //   1456: invokevirtual setSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   1459: aload_0
    //   1460: sipush #-29105
    //   1463: sipush #-1695
    //   1466: invokestatic a : (II)Ljava/lang/String;
    //   1469: aload_1
    //   1470: iconst_0
    //   1471: aload_2
    //   1472: aload_3
    //   1473: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   1476: astore #15
    //   1478: aload #15
    //   1480: ifnull -> 1518
    //   1483: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   1486: aload #15
    //   1488: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   1491: invokevirtual ZS : ()Lcom/fasterxml/Zh/Zi;
    //   1494: ldc java/util/Map
    //   1496: ldc java/lang/String
    //   1498: ldc java/lang/Object
    //   1500: invokevirtual Zv : (Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/Zh/Zf;
    //   1503: invokevirtual Zh : (Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   1506: checkcast java/util/Map
    //   1509: astore #16
    //   1511: aload #13
    //   1513: aload #16
    //   1515: invokevirtual setExamples : (Ljava/util/Map;)V
    //   1518: aload_0
    //   1519: sipush #-29083
    //   1522: sipush #-24709
    //   1525: invokestatic a : (II)Ljava/lang/String;
    //   1528: aload_1
    //   1529: iconst_0
    //   1530: aload_2
    //   1531: aload_3
    //   1532: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   1535: astore #16
    //   1537: aload #16
    //   1539: ifnull -> 1549
    //   1542: aload #13
    //   1544: aload #16
    //   1546: invokevirtual setPattern : (Ljava/lang/String;)V
    //   1549: aload_0
    //   1550: sipush #-29087
    //   1553: sipush #-17784
    //   1556: invokestatic a : (II)Ljava/lang/String;
    //   1559: aload_1
    //   1560: iconst_0
    //   1561: aload_2
    //   1562: aload_3
    //   1563: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1566: astore #17
    //   1568: aload #17
    //   1570: ifnull -> 1580
    //   1573: aload #13
    //   1575: aload #17
    //   1577: invokevirtual setReadOnly : (Ljava/lang/Boolean;)V
    //   1580: aload_0
    //   1581: aload_1
    //   1582: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1585: astore #18
    //   1587: aload #18
    //   1589: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1594: astore #19
    //   1596: aload #19
    //   1598: invokeinterface hasNext : ()Z
    //   1603: ifeq -> 1688
    //   1606: aload #19
    //   1608: invokeinterface next : ()Ljava/lang/Object;
    //   1613: checkcast java/lang/String
    //   1616: astore #20
    //   1618: aload #20
    //   1620: sipush #-29005
    //   1623: sipush #17481
    //   1626: invokestatic a : (II)Ljava/lang/String;
    //   1629: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1632: ifeq -> 1657
    //   1635: aload #13
    //   1637: aload #20
    //   1639: aload_0
    //   1640: aload_1
    //   1641: aload #20
    //   1643: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1646: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   1649: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1652: aload #4
    //   1654: ifnonnull -> 1683
    //   1657: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.BODY_PARAMETER_KEYS : Ljava/util/Set;
    //   1660: aload #20
    //   1662: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1667: ifne -> 1683
    //   1670: aload_3
    //   1671: aload_2
    //   1672: aload #20
    //   1674: aload_1
    //   1675: aload #20
    //   1677: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1680: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1683: aload #4
    //   1685: ifnonnull -> 1596
    //   1688: aload #13
    //   1690: astore #5
    //   1692: aload #5
    //   1694: ifnull -> 1789
    //   1697: aload_0
    //   1698: sipush #-28955
    //   1701: sipush #-27372
    //   1704: invokestatic a : (II)Ljava/lang/String;
    //   1707: aload_1
    //   1708: iconst_1
    //   1709: aload_2
    //   1710: aload_3
    //   1711: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   1714: astore #9
    //   1716: aload #5
    //   1718: aload #9
    //   1720: invokeinterface setName : (Ljava/lang/String;)V
    //   1725: aload_0
    //   1726: sipush #-29094
    //   1729: sipush #23166
    //   1732: invokestatic a : (II)Ljava/lang/String;
    //   1735: aload_1
    //   1736: iconst_0
    //   1737: aload_2
    //   1738: aload_3
    //   1739: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   1742: astore #9
    //   1744: aload #5
    //   1746: aload #9
    //   1748: invokeinterface setDescription : (Ljava/lang/String;)V
    //   1753: aload_0
    //   1754: sipush #-28995
    //   1757: sipush #-24018
    //   1760: invokestatic a : (II)Ljava/lang/String;
    //   1763: aload_1
    //   1764: iconst_0
    //   1765: aload_2
    //   1766: aload_3
    //   1767: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   1770: astore #13
    //   1772: aload #13
    //   1774: ifnull -> 1789
    //   1777: aload #5
    //   1779: aload #13
    //   1781: invokevirtual booleanValue : ()Z
    //   1784: invokeinterface setRequired : (Z)V
    //   1789: aload #5
    //   1791: areturn
  }
  
  private String parameterDefault(Zr paramZr, String paramString1, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    String str = a(-28932, -10988);
    if (paramString1 != null && paramString1.equals(a(-29082, 3900))) {
      Zh zh = getArray(str, paramZr, false, paramString2, paramSwaggerDeserializer$ParseResult);
      return (zh != null) ? zh.toString() : null;
    } 
    return getString(str, paramZr, false, paramString2, paramSwaggerDeserializer$ParseResult);
  }
  
  private Property schema(Map<String, Object> paramMap, Zb paramZb, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    return (Property)Json.mapper().Zb(paramZb, Property.class);
  }
  
  public RefParameter refParameter(Zb paramZb, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    return new RefParameter(paramZb.Zp());
  }
  
  public RefResponse refResponse(Zb paramZb, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    return new RefResponse(paramZb.Zp());
  }
  
  public Path pathRef(Zb paramZb, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    RefPath refPath = new RefPath();
    refPath.set$ref(paramZb.Zz());
    return (Path)refPath;
  }
  
  public Map<String, Model> definitions(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   16: astore #5
    //   18: new java/util/LinkedHashMap
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore #6
    //   27: aload #5
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #7
    //   36: aload #7
    //   38: invokeinterface hasNext : ()Z
    //   43: ifeq -> 145
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #8
    //   58: aload_1
    //   59: aload #8
    //   61: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   64: astore #9
    //   66: aload #9
    //   68: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   71: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 122
    //   80: aload_0
    //   81: aload #9
    //   83: checkcast com/fasterxml/Zg/Zr
    //   86: aload_2
    //   87: aload #8
    //   89: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   94: aload_3
    //   95: invokevirtual definition : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Model;
    //   98: astore #10
    //   100: aload #10
    //   102: ifnull -> 117
    //   105: aload #6
    //   107: aload #8
    //   109: aload #10
    //   111: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: aload #4
    //   119: ifnonnull -> 140
    //   122: aload_3
    //   123: aload_2
    //   124: aload #8
    //   126: sipush #-29145
    //   129: sipush #1594
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: aload #9
    //   137: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   140: aload #4
    //   142: ifnonnull -> 36
    //   145: aload #6
    //   147: areturn
  }
  
  public Model definition(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_3
    //   6: ifnonnull -> 17
    //   9: new net/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore_3
    //   17: aload_1
    //   18: ifnonnull -> 37
    //   21: aload_3
    //   22: aload_2
    //   23: sipush #-29077
    //   26: sipush #-2221
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   35: aconst_null
    //   36: areturn
    //   37: aload_1
    //   38: invokevirtual ZL : ()Z
    //   41: ifeq -> 59
    //   44: new net/portswigger/swagger/v1/models/BooleanValueModel
    //   47: dup
    //   48: aload_1
    //   49: invokevirtual Zf : ()Z
    //   52: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   55: invokespecial <init> : (Ljava/lang/Boolean;)V
    //   58: areturn
    //   59: aload_1
    //   60: sipush #-28979
    //   63: sipush #-13697
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   72: ifnull -> 83
    //   75: aload_0
    //   76: aload_1
    //   77: aload_2
    //   78: aload_3
    //   79: invokevirtual refModel : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/RefModel;
    //   82: areturn
    //   83: aload_1
    //   84: sipush #-29020
    //   87: sipush #22362
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   96: ifnull -> 107
    //   99: aload_0
    //   100: aload_1
    //   101: aload_2
    //   102: aload_3
    //   103: invokevirtual allOfModel : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Model;
    //   106: areturn
    //   107: aconst_null
    //   108: astore #5
    //   110: aconst_null
    //   111: astore #6
    //   113: aload_0
    //   114: sipush #-28946
    //   117: sipush #20878
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: aload_1
    //   124: iconst_0
    //   125: aload_2
    //   126: aload_3
    //   127: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   130: astore #7
    //   132: aload_1
    //   133: sipush #-29139
    //   136: sipush #24494
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   145: astore #8
    //   147: sipush #-29151
    //   150: new net/portswigger/swagger/v1/models/ModelImpl
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #9
    //   159: sipush #6825
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: aload #7
    //   167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   170: ifne -> 178
    //   173: aload #8
    //   175: ifnull -> 470
    //   178: new net/portswigger/swagger/v1/models/ArrayModel
    //   181: dup
    //   182: invokespecial <init> : ()V
    //   185: astore #10
    //   187: aload_0
    //   188: sipush #-29001
    //   191: sipush #-5514
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: aload_1
    //   198: iconst_0
    //   199: aload_2
    //   200: aload_3
    //   201: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   204: astore #11
    //   206: aload_0
    //   207: aload #11
    //   209: aload_2
    //   210: aload_3
    //   211: invokevirtual properties : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/util/Map;
    //   214: astore #12
    //   216: aload #10
    //   218: aload #12
    //   220: invokevirtual setProperties : (Ljava/util/Map;)V
    //   223: aload_0
    //   224: sipush #-29004
    //   227: sipush #2368
    //   230: invokestatic a : (II)Ljava/lang/String;
    //   233: aload_1
    //   234: iconst_0
    //   235: aload_2
    //   236: aload_3
    //   237: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   240: astore #13
    //   242: aload_0
    //   243: aload #13
    //   245: aload_2
    //   246: aload_3
    //   247: invokevirtual property : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   250: astore #14
    //   252: aload #14
    //   254: ifnull -> 265
    //   257: aload #10
    //   259: aload #14
    //   261: invokevirtual items : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/ArrayModel;
    //   264: pop
    //   265: aload_0
    //   266: sipush #-28980
    //   269: sipush #10964
    //   272: invokestatic a : (II)Ljava/lang/String;
    //   275: aload_1
    //   276: iconst_0
    //   277: aload_2
    //   278: aload_3
    //   279: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   282: astore #15
    //   284: aload #10
    //   286: aload #15
    //   288: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   291: aload_0
    //   292: sipush #-29102
    //   295: sipush #-18234
    //   298: invokestatic a : (II)Ljava/lang/String;
    //   301: aload_1
    //   302: iconst_0
    //   303: aload_2
    //   304: aload_3
    //   305: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   308: astore #16
    //   310: aload #10
    //   312: aload #16
    //   314: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   317: aload_0
    //   318: sipush #-29019
    //   321: sipush #11811
    //   324: invokestatic a : (II)Ljava/lang/String;
    //   327: aload_1
    //   328: iconst_0
    //   329: aload_2
    //   330: aload_3
    //   331: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   334: astore #17
    //   336: aload #17
    //   338: ifnull -> 348
    //   341: aload #10
    //   343: aload #17
    //   345: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   348: aload_1
    //   349: sipush #-29080
    //   352: sipush #26114
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   361: astore #18
    //   363: aload #18
    //   365: ifnull -> 386
    //   368: aload #10
    //   370: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   373: aload #18
    //   375: ldc net/portswigger/swagger/v1/models/Xml
    //   377: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   380: checkcast net/portswigger/swagger/v1/models/Xml
    //   383: invokevirtual setXml : (Lnet/portswigger/swagger/v1/models/Xml;)V
    //   386: aload_0
    //   387: aload_1
    //   388: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   391: astore #19
    //   393: aload #19
    //   395: invokeinterface iterator : ()Ljava/util/Iterator;
    //   400: astore #20
    //   402: aload #20
    //   404: invokeinterface hasNext : ()Z
    //   409: ifeq -> 463
    //   412: aload #20
    //   414: invokeinterface next : ()Ljava/lang/Object;
    //   419: checkcast java/lang/String
    //   422: astore #21
    //   424: aload #21
    //   426: sipush #-28985
    //   429: sipush #-24416
    //   432: invokestatic a : (II)Ljava/lang/String;
    //   435: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   438: ifeq -> 458
    //   441: aload #10
    //   443: aload #21
    //   445: aload_0
    //   446: aload_1
    //   447: aload #21
    //   449: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   452: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   455: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   458: aload #4
    //   460: ifnonnull -> 402
    //   463: aload #10
    //   465: astore #5
    //   467: goto -> 1448
    //   470: new net/portswigger/swagger/v1/models/ModelImpl
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: astore #10
    //   479: aload #10
    //   481: aload #7
    //   483: invokevirtual setType : (Ljava/lang/String;)V
    //   486: aload_1
    //   487: sipush #-28966
    //   490: sipush #5058
    //   493: invokestatic a : (II)Ljava/lang/String;
    //   496: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   499: astore #11
    //   501: aload #11
    //   503: ifnull -> 543
    //   506: aload #11
    //   508: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   511: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   514: invokevirtual equals : (Ljava/lang/Object;)Z
    //   517: ifeq -> 543
    //   520: aload #10
    //   522: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   525: aload #11
    //   527: ldc net/portswigger/swagger/v1/models/properties/Property
    //   529: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   532: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   535: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   538: aload #4
    //   540: ifnonnull -> 576
    //   543: aload #11
    //   545: ifnull -> 576
    //   548: aload #11
    //   550: invokevirtual ZL : ()Z
    //   553: ifeq -> 576
    //   556: aload #10
    //   558: new net/portswigger/swagger/v1/models/properties/BooleanValueProperty
    //   561: dup
    //   562: aload #11
    //   564: invokevirtual Zf : ()Z
    //   567: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   570: invokespecial <init> : (Ljava/lang/Boolean;)V
    //   573: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   576: aload_0
    //   577: sipush #-29096
    //   580: sipush #-8698
    //   583: invokestatic a : (II)Ljava/lang/String;
    //   586: aload_1
    //   587: iconst_0
    //   588: aload_2
    //   589: aload_3
    //   590: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   593: astore #6
    //   595: aload #10
    //   597: aload #6
    //   599: invokevirtual setDefaultValue : (Ljava/lang/String;)V
    //   602: aload_0
    //   603: sipush #-28936
    //   606: sipush #27618
    //   609: invokestatic a : (II)Ljava/lang/String;
    //   612: aload_1
    //   613: iconst_0
    //   614: aload_2
    //   615: aload_3
    //   616: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   619: astore #6
    //   621: aload #10
    //   623: aload #6
    //   625: invokevirtual setFormat : (Ljava/lang/String;)V
    //   628: aload_0
    //   629: sipush #-29002
    //   632: sipush #-841
    //   635: invokestatic a : (II)Ljava/lang/String;
    //   638: aload_1
    //   639: iconst_0
    //   640: aload_2
    //   641: aload_3
    //   642: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   645: astore #6
    //   647: aload #10
    //   649: aload #6
    //   651: invokevirtual setDiscriminator : (Ljava/lang/String;)V
    //   654: aload_0
    //   655: sipush #-29057
    //   658: sipush #21805
    //   661: invokestatic a : (II)Ljava/lang/String;
    //   664: aload_1
    //   665: iconst_0
    //   666: aload_2
    //   667: aload_3
    //   668: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   671: astore #12
    //   673: aload #12
    //   675: ifnull -> 685
    //   678: aload #10
    //   680: aload #12
    //   682: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   685: aload_0
    //   686: sipush #-29063
    //   689: sipush #12774
    //   692: invokestatic a : (II)Ljava/lang/String;
    //   695: aload_1
    //   696: iconst_0
    //   697: aload_2
    //   698: aload_3
    //   699: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   702: astore #13
    //   704: aload #10
    //   706: aload #13
    //   708: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   711: aload_0
    //   712: sipush #-29036
    //   715: sipush #-23018
    //   718: invokestatic a : (II)Ljava/lang/String;
    //   721: aload_1
    //   722: iconst_0
    //   723: aload_2
    //   724: aload_3
    //   725: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   728: astore #13
    //   730: aload #10
    //   732: aload #13
    //   734: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   737: aload_0
    //   738: sipush #-28976
    //   741: sipush #-24253
    //   744: invokestatic a : (II)Ljava/lang/String;
    //   747: aload_1
    //   748: iconst_0
    //   749: aload_2
    //   750: aload_3
    //   751: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   754: astore #12
    //   756: aload #12
    //   758: ifnull -> 768
    //   761: aload #10
    //   763: aload #12
    //   765: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   768: aload_0
    //   769: sipush #-28945
    //   772: sipush #-25839
    //   775: invokestatic a : (II)Ljava/lang/String;
    //   778: aload_1
    //   779: iconst_0
    //   780: aload_2
    //   781: aload_3
    //   782: invokevirtual getBoolean : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Boolean;
    //   785: astore #12
    //   787: aload #12
    //   789: ifnull -> 799
    //   792: aload #10
    //   794: aload #12
    //   796: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   799: aload_0
    //   800: sipush #-29040
    //   803: sipush #5793
    //   806: invokestatic a : (II)Ljava/lang/String;
    //   809: aload_1
    //   810: iconst_0
    //   811: aload_2
    //   812: aload_3
    //   813: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   816: astore #6
    //   818: aload #10
    //   820: aload #6
    //   822: invokevirtual setPattern : (Ljava/lang/String;)V
    //   825: aload_0
    //   826: sipush #-29064
    //   829: sipush #31731
    //   832: invokestatic a : (II)Ljava/lang/String;
    //   835: aload_1
    //   836: iconst_0
    //   837: aload_2
    //   838: aload_3
    //   839: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   842: astore #14
    //   844: aload #14
    //   846: ifnull -> 857
    //   849: aload #10
    //   851: aload #14
    //   853: invokevirtual maximum : (Ljava/math/BigDecimal;)Lnet/portswigger/swagger/v1/models/ModelImpl;
    //   856: pop
    //   857: aload_0
    //   858: sipush #-29033
    //   861: sipush #15352
    //   864: invokestatic a : (II)Ljava/lang/String;
    //   867: aload_1
    //   868: iconst_0
    //   869: aload_2
    //   870: aload_3
    //   871: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   874: astore #15
    //   876: aload #15
    //   878: ifnull -> 889
    //   881: aload #10
    //   883: aload #15
    //   885: invokevirtual minimum : (Ljava/math/BigDecimal;)Lnet/portswigger/swagger/v1/models/ModelImpl;
    //   888: pop
    //   889: aload_0
    //   890: sipush #-29068
    //   893: sipush #-26026
    //   896: invokestatic a : (II)Ljava/lang/String;
    //   899: aload_1
    //   900: iconst_0
    //   901: aload_2
    //   902: aload_3
    //   903: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   906: astore #16
    //   908: aload #16
    //   910: ifnull -> 920
    //   913: aload #10
    //   915: aload #16
    //   917: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   920: aload_0
    //   921: sipush #-28992
    //   924: sipush #-6351
    //   927: invokestatic a : (II)Ljava/lang/String;
    //   930: aload_1
    //   931: iconst_0
    //   932: aload_2
    //   933: aload_3
    //   934: invokevirtual getInteger : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/Integer;
    //   937: astore #17
    //   939: aload #17
    //   941: ifnull -> 951
    //   944: aload #10
    //   946: aload #17
    //   948: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   951: aload_0
    //   952: sipush #-29147
    //   955: sipush #-18883
    //   958: invokestatic a : (II)Ljava/lang/String;
    //   961: aload_1
    //   962: iconst_0
    //   963: aload_2
    //   964: aload_3
    //   965: invokevirtual getBigDecimal : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/math/BigDecimal;
    //   968: astore #18
    //   970: aload #18
    //   972: ifnull -> 982
    //   975: aload #10
    //   977: aload #18
    //   979: invokevirtual setMultipleOf : (Ljava/math/BigDecimal;)V
    //   982: aload_1
    //   983: sipush #-29010
    //   986: sipush #-22733
    //   989: invokestatic a : (II)Ljava/lang/String;
    //   992: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   995: astore #11
    //   997: aload #11
    //   999: ifnull -> 1109
    //   1002: aload_0
    //   1003: sipush #-28998
    //   1006: sipush #32674
    //   1009: invokestatic a : (II)Ljava/lang/String;
    //   1012: aload_1
    //   1013: iconst_0
    //   1014: aload_2
    //   1015: aload_3
    //   1016: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   1019: astore #19
    //   1021: aload #19
    //   1023: ifnull -> 1109
    //   1026: aload #19
    //   1028: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1031: astore #20
    //   1033: aload #20
    //   1035: invokeinterface hasNext : ()Z
    //   1040: ifeq -> 1109
    //   1043: aload #20
    //   1045: invokeinterface next : ()Ljava/lang/Object;
    //   1050: checkcast com/fasterxml/Zor/Zb
    //   1053: astore #21
    //   1055: aload #21
    //   1057: invokevirtual ZA : ()Z
    //   1060: ifeq -> 1079
    //   1063: aload #10
    //   1065: aload #21
    //   1067: invokevirtual Zp : ()Ljava/lang/String;
    //   1070: invokevirtual _enum : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/ModelImpl;
    //   1073: pop
    //   1074: aload #4
    //   1076: ifnonnull -> 1104
    //   1079: aload_3
    //   1080: aload_2
    //   1081: sipush #-28998
    //   1084: sipush #32674
    //   1087: invokestatic a : (II)Ljava/lang/String;
    //   1090: sipush #-29032
    //   1093: sipush #30609
    //   1096: invokestatic a : (II)Ljava/lang/String;
    //   1099: aload #21
    //   1101: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1104: aload #4
    //   1106: ifnonnull -> 1033
    //   1109: aload_1
    //   1110: sipush #-29067
    //   1113: sipush #-18233
    //   1116: invokestatic a : (II)Ljava/lang/String;
    //   1119: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1122: astore #19
    //   1124: aload #19
    //   1126: ifnull -> 1147
    //   1129: aload #10
    //   1131: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   1134: aload #19
    //   1136: ldc net/portswigger/swagger/v1/models/Xml
    //   1138: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1141: checkcast net/portswigger/swagger/v1/models/Xml
    //   1144: invokevirtual setXml : (Lnet/portswigger/swagger/v1/models/Xml;)V
    //   1147: aload_0
    //   1148: sipush #-28948
    //   1151: sipush #6636
    //   1154: invokestatic a : (II)Ljava/lang/String;
    //   1157: aload_1
    //   1158: iconst_0
    //   1159: aload_2
    //   1160: aload_3
    //   1161: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   1164: astore #20
    //   1166: aload_0
    //   1167: aload #20
    //   1169: aload_2
    //   1170: aload_3
    //   1171: invokevirtual externalDocs : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   1174: astore #21
    //   1176: aload #10
    //   1178: aload #21
    //   1180: invokevirtual setExternalDocs : (Lnet/portswigger/swagger/v1/models/ExternalDocs;)V
    //   1183: aload_0
    //   1184: aload_2
    //   1185: aload_1
    //   1186: aload_3
    //   1187: aload #10
    //   1189: invokevirtual addProperties : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;Lnet/portswigger/swagger/v1/models/AbstractModel;)V
    //   1192: aload_0
    //   1193: sipush #-29044
    //   1196: sipush #-12758
    //   1199: invokestatic a : (II)Ljava/lang/String;
    //   1202: aload_1
    //   1203: iconst_0
    //   1204: aload_2
    //   1205: aload_3
    //   1206: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   1209: astore #22
    //   1211: aload #22
    //   1213: ifnull -> 1336
    //   1216: new java/util/ArrayList
    //   1219: dup
    //   1220: invokespecial <init> : ()V
    //   1223: astore #23
    //   1225: aload #22
    //   1227: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1230: astore #24
    //   1232: aload #24
    //   1234: invokeinterface hasNext : ()Z
    //   1239: ifeq -> 1319
    //   1242: aload #24
    //   1244: invokeinterface next : ()Ljava/lang/Object;
    //   1249: checkcast com/fasterxml/Zor/Zb
    //   1252: astore #25
    //   1254: aload #25
    //   1256: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   1259: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   1262: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1265: ifeq -> 1289
    //   1268: aload #23
    //   1270: aload #25
    //   1272: checkcast com/fasterxml/Zg/Zb
    //   1275: invokevirtual Zz : ()Ljava/lang/String;
    //   1278: invokeinterface add : (Ljava/lang/Object;)Z
    //   1283: pop
    //   1284: aload #4
    //   1286: ifnonnull -> 1314
    //   1289: aload_3
    //   1290: aload_2
    //   1291: sipush #-28995
    //   1294: sipush #-24018
    //   1297: invokestatic a : (II)Ljava/lang/String;
    //   1300: sipush #-28938
    //   1303: sipush #-27242
    //   1306: invokestatic a : (II)Ljava/lang/String;
    //   1309: aload #25
    //   1311: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1314: aload #4
    //   1316: ifnonnull -> 1232
    //   1319: aload #23
    //   1321: invokeinterface size : ()I
    //   1326: ifle -> 1336
    //   1329: aload #10
    //   1331: aload #23
    //   1333: invokevirtual setRequired : (Ljava/util/List;)V
    //   1336: aload_0
    //   1337: aload_1
    //   1338: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   1341: astore #23
    //   1343: aload #23
    //   1345: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1350: astore #24
    //   1352: aload #24
    //   1354: invokeinterface hasNext : ()Z
    //   1359: ifeq -> 1444
    //   1362: aload #24
    //   1364: invokeinterface next : ()Ljava/lang/Object;
    //   1369: checkcast java/lang/String
    //   1372: astore #25
    //   1374: aload #25
    //   1376: sipush #-29005
    //   1379: sipush #17481
    //   1382: invokestatic a : (II)Ljava/lang/String;
    //   1385: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1388: ifeq -> 1413
    //   1391: aload #10
    //   1393: aload #25
    //   1395: aload_0
    //   1396: aload_1
    //   1397: aload #25
    //   1399: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1402: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   1405: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1408: aload #4
    //   1410: ifnonnull -> 1439
    //   1413: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.SCHEMA_KEYS : Ljava/util/Set;
    //   1416: aload #25
    //   1418: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1423: ifne -> 1439
    //   1426: aload_3
    //   1427: aload_2
    //   1428: aload #25
    //   1430: aload_1
    //   1431: aload #25
    //   1433: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1436: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   1439: aload #4
    //   1441: ifnonnull -> 1352
    //   1444: aload #10
    //   1446: astore #5
    //   1448: aload_1
    //   1449: sipush #-28967
    //   1452: sipush #29592
    //   1455: invokestatic a : (II)Ljava/lang/String;
    //   1458: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   1461: astore #10
    //   1463: aload #10
    //   1465: ifnull -> 1489
    //   1468: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   1471: aload #10
    //   1473: ldc java/lang/Object
    //   1475: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   1478: astore #11
    //   1480: aload #5
    //   1482: aload #11
    //   1484: invokeinterface setExample : (Ljava/lang/Object;)V
    //   1489: aload #5
    //   1491: ifnull -> 1550
    //   1494: aload_0
    //   1495: sipush #-28935
    //   1498: sipush #31080
    //   1501: invokestatic a : (II)Ljava/lang/String;
    //   1504: aload_1
    //   1505: iconst_0
    //   1506: aload_2
    //   1507: aload_3
    //   1508: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   1511: astore #6
    //   1513: aload #5
    //   1515: aload #6
    //   1517: invokeinterface setDescription : (Ljava/lang/String;)V
    //   1522: aload_0
    //   1523: sipush #-29070
    //   1526: sipush #4810
    //   1529: invokestatic a : (II)Ljava/lang/String;
    //   1532: aload_1
    //   1533: iconst_0
    //   1534: aload_2
    //   1535: aload_3
    //   1536: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   1539: astore #6
    //   1541: aload #5
    //   1543: aload #6
    //   1545: invokeinterface setTitle : (Ljava/lang/String;)V
    //   1550: aload #5
    //   1552: areturn
  }
  
  public Object extension(Zb paramZb) {
    return Json.mapper().Zb(paramZb, Object.class);
  }
  
  public Model allOfModel(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aload_1
    //   4: sipush #-28971
    //   7: sipush #19067
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   16: astore #5
    //   18: aload_1
    //   19: sipush #-29108
    //   22: sipush #29186
    //   25: invokestatic a : (II)Ljava/lang/String;
    //   28: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   31: astore #6
    //   33: astore #4
    //   35: aload #5
    //   37: ifnull -> 93
    //   40: aload #5
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 66
    //   54: aload_0
    //   55: aload #5
    //   57: checkcast com/fasterxml/Zg/Zr
    //   60: aload_2
    //   61: aload_3
    //   62: invokevirtual refModel : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/RefModel;
    //   65: areturn
    //   66: aload_3
    //   67: aload_2
    //   68: sipush #-28971
    //   71: sipush #19067
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: sipush #-29053
    //   80: sipush #15579
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: aload #5
    //   88: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   91: aconst_null
    //   92: areturn
    //   93: aload #6
    //   95: ifnull -> 706
    //   98: aconst_null
    //   99: astore #7
    //   101: aload #6
    //   103: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   106: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   109: invokevirtual equals : (Ljava/lang/Object;)Z
    //   112: ifeq -> 360
    //   115: new net/portswigger/swagger/v1/models/ComposedModel
    //   118: dup
    //   119: invokespecial <init> : ()V
    //   122: astore #7
    //   124: iconst_0
    //   125: istore #8
    //   127: aload #6
    //   129: invokevirtual iterator : ()Ljava/util/Iterator;
    //   132: astore #9
    //   134: aload #9
    //   136: invokeinterface hasNext : ()Z
    //   141: ifeq -> 249
    //   144: aload #9
    //   146: invokeinterface next : ()Ljava/lang/Object;
    //   151: checkcast com/fasterxml/Zor/Zb
    //   154: astore #10
    //   156: aload #10
    //   158: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   161: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   167: ifeq -> 206
    //   170: aload_0
    //   171: aload #10
    //   173: checkcast com/fasterxml/Zg/Zr
    //   176: aload_2
    //   177: aload_3
    //   178: invokevirtual definition : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Model;
    //   181: astore #11
    //   183: aload #11
    //   185: ifnull -> 201
    //   188: aload #7
    //   190: invokevirtual getAllOf : ()Ljava/util/List;
    //   193: aload #11
    //   195: invokeinterface add : (Ljava/lang/Object;)Z
    //   200: pop
    //   201: aload #4
    //   203: ifnonnull -> 241
    //   206: aload_3
    //   207: aload_2
    //   208: iload #8
    //   210: sipush #-28984
    //   213: sipush #-23386
    //   216: invokestatic a : (II)Ljava/lang/String;
    //   219: swap
    //   220: ldc ']'
    //   222: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    //   227: sipush #-29145
    //   230: sipush #1594
    //   233: invokestatic a : (II)Ljava/lang/String;
    //   236: aload #10
    //   238: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   241: iinc #8, 1
    //   244: aload #4
    //   246: ifnonnull -> 134
    //   249: aconst_null
    //   250: astore #9
    //   252: new java/util/ArrayList
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: astore #10
    //   261: aload #7
    //   263: invokevirtual getAllOf : ()Ljava/util/List;
    //   266: invokeinterface iterator : ()Ljava/util/Iterator;
    //   271: astore #11
    //   273: aload #11
    //   275: invokeinterface hasNext : ()Z
    //   280: ifeq -> 338
    //   283: aload #11
    //   285: invokeinterface next : ()Ljava/lang/Object;
    //   290: checkcast net/portswigger/swagger/v1/models/Model
    //   293: astore #12
    //   295: aload #12
    //   297: instanceof net/portswigger/swagger/v1/models/RefModel
    //   300: ifeq -> 321
    //   303: aload #10
    //   305: aload #12
    //   307: checkcast net/portswigger/swagger/v1/models/RefModel
    //   310: invokeinterface add : (Ljava/lang/Object;)Z
    //   315: pop
    //   316: aload #4
    //   318: ifnonnull -> 333
    //   321: aload #12
    //   323: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   326: ifeq -> 333
    //   329: aload #12
    //   331: astore #9
    //   333: aload #4
    //   335: ifnonnull -> 273
    //   338: aload #7
    //   340: aload #10
    //   342: invokevirtual setInterfaces : (Ljava/util/List;)V
    //   345: aload #9
    //   347: ifnull -> 357
    //   350: aload #7
    //   352: aload #9
    //   354: invokevirtual setChild : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   357: goto -> 385
    //   360: aload_3
    //   361: aload_2
    //   362: sipush #-29108
    //   365: sipush #29186
    //   368: invokestatic a : (II)Ljava/lang/String;
    //   371: sipush #-29082
    //   374: sipush #3900
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aload #6
    //   382: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   385: aload_0
    //   386: aload_1
    //   387: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   390: astore #8
    //   392: aload #8
    //   394: invokeinterface iterator : ()Ljava/util/Iterator;
    //   399: astore #9
    //   401: aload #9
    //   403: invokeinterface hasNext : ()Z
    //   408: ifeq -> 550
    //   411: aload #9
    //   413: invokeinterface next : ()Ljava/lang/Object;
    //   418: checkcast java/lang/String
    //   421: astore #10
    //   423: aload #10
    //   425: sipush #-29005
    //   428: sipush #17481
    //   431: invokestatic a : (II)Ljava/lang/String;
    //   434: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   437: ifeq -> 462
    //   440: aload #7
    //   442: aload #10
    //   444: aload_0
    //   445: aload_1
    //   446: aload #10
    //   448: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   451: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   454: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   457: aload #4
    //   459: ifnonnull -> 545
    //   462: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.SCHEMA_KEYS : Ljava/util/Set;
    //   465: aload #10
    //   467: invokeinterface contains : (Ljava/lang/Object;)Z
    //   472: ifne -> 493
    //   475: aload_3
    //   476: aload_2
    //   477: aload #10
    //   479: aload_1
    //   480: aload #10
    //   482: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   485: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   488: aload #4
    //   490: ifnonnull -> 545
    //   493: aload_0
    //   494: sipush #-29041
    //   497: sipush #14660
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: aload_1
    //   504: iconst_0
    //   505: aload_2
    //   506: aload_3
    //   507: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   510: astore #11
    //   512: aload #7
    //   514: aload #11
    //   516: invokevirtual setTitle : (Ljava/lang/String;)V
    //   519: aload_0
    //   520: sipush #-29094
    //   523: sipush #23166
    //   526: invokestatic a : (II)Ljava/lang/String;
    //   529: aload_1
    //   530: iconst_0
    //   531: aload_2
    //   532: aload_3
    //   533: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   536: astore #11
    //   538: aload #7
    //   540: aload #11
    //   542: invokevirtual setDescription : (Ljava/lang/String;)V
    //   545: aload #4
    //   547: ifnonnull -> 401
    //   550: aload_0
    //   551: aload_2
    //   552: aload_1
    //   553: aload_3
    //   554: aload #7
    //   556: invokevirtual addProperties : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;Lnet/portswigger/swagger/v1/models/AbstractModel;)V
    //   559: aload_0
    //   560: sipush #-28995
    //   563: sipush #-24018
    //   566: invokestatic a : (II)Ljava/lang/String;
    //   569: aload_1
    //   570: iconst_0
    //   571: aload_2
    //   572: aload_3
    //   573: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   576: astore #9
    //   578: aload #9
    //   580: ifnull -> 703
    //   583: new java/util/ArrayList
    //   586: dup
    //   587: invokespecial <init> : ()V
    //   590: astore #10
    //   592: aload #9
    //   594: invokevirtual iterator : ()Ljava/util/Iterator;
    //   597: astore #11
    //   599: aload #11
    //   601: invokeinterface hasNext : ()Z
    //   606: ifeq -> 686
    //   609: aload #11
    //   611: invokeinterface next : ()Ljava/lang/Object;
    //   616: checkcast com/fasterxml/Zor/Zb
    //   619: astore #12
    //   621: aload #12
    //   623: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   626: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   629: invokevirtual equals : (Ljava/lang/Object;)Z
    //   632: ifeq -> 656
    //   635: aload #10
    //   637: aload #12
    //   639: checkcast com/fasterxml/Zg/Zb
    //   642: invokevirtual Zz : ()Ljava/lang/String;
    //   645: invokeinterface add : (Ljava/lang/Object;)Z
    //   650: pop
    //   651: aload #4
    //   653: ifnonnull -> 681
    //   656: aload_3
    //   657: aload_2
    //   658: sipush #-28995
    //   661: sipush #-24018
    //   664: invokestatic a : (II)Ljava/lang/String;
    //   667: sipush #-28931
    //   670: sipush #-32249
    //   673: invokestatic a : (II)Ljava/lang/String;
    //   676: aload #12
    //   678: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   681: aload #4
    //   683: ifnonnull -> 599
    //   686: aload #10
    //   688: invokeinterface size : ()I
    //   693: ifle -> 703
    //   696: aload #7
    //   698: aload #10
    //   700: invokevirtual setRequired : (Ljava/util/List;)V
    //   703: aload #7
    //   705: areturn
    //   706: aconst_null
    //   707: areturn
  }
  
  private void addProperties(String paramString, Zr paramZr, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult, AbstractModel paramAbstractModel) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aload_0
    //   4: sipush #-28960
    //   7: sipush #7891
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: aload_2
    //   14: iconst_0
    //   15: aload_1
    //   16: aload_3
    //   17: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   20: astore #6
    //   22: astore #5
    //   24: aload #6
    //   26: ifnull -> 212
    //   29: aload_0
    //   30: aload #6
    //   32: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   35: astore #7
    //   37: aload #7
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #8
    //   46: aload #8
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 212
    //   56: aload #8
    //   58: invokeinterface next : ()Ljava/lang/Object;
    //   63: checkcast java/lang/String
    //   66: astore #9
    //   68: aload #6
    //   70: aload #9
    //   72: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   75: astore #10
    //   77: aload #10
    //   79: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   82: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   85: invokevirtual equals : (Ljava/lang/Object;)Z
    //   88: ifeq -> 182
    //   91: aload #10
    //   93: checkcast com/fasterxml/Zg/Zr
    //   96: astore #11
    //   98: aload_0
    //   99: aload #11
    //   101: aload_1
    //   102: aload_3
    //   103: invokevirtual property : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   106: astore #12
    //   108: aload #12
    //   110: ifnull -> 168
    //   113: sipush #-29082
    //   116: sipush #3900
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: aload #12
    //   124: invokeinterface getType : ()Ljava/lang/String;
    //   129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   132: ifeq -> 168
    //   135: aload #12
    //   137: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   140: ifeq -> 154
    //   143: aload #12
    //   145: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   148: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   151: ifnonnull -> 168
    //   154: aload_3
    //   155: aload_1
    //   156: sipush #-29004
    //   159: sipush #2368
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   168: aload #4
    //   170: aload #9
    //   172: aload #12
    //   174: invokevirtual addProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   177: aload #5
    //   179: ifnonnull -> 207
    //   182: aload_3
    //   183: aload_1
    //   184: sipush #-28960
    //   187: sipush #7891
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: sipush #-29145
    //   196: sipush #1594
    //   199: invokestatic a : (II)Ljava/lang/String;
    //   202: aload #10
    //   204: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   207: aload #5
    //   209: ifnonnull -> 46
    //   212: return
  }
  
  public Map<String, Property> properties(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new java/util/LinkedHashMap
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
    //   43: ifeq -> 133
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #8
    //   58: aload_1
    //   59: aload #8
    //   61: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   64: astore #9
    //   66: aload #9
    //   68: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   71: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifeq -> 110
    //   80: aload_0
    //   81: aload #9
    //   83: checkcast com/fasterxml/Zg/Zr
    //   86: aload_2
    //   87: aload_3
    //   88: invokevirtual property : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   91: astore #10
    //   93: aload #5
    //   95: aload #8
    //   97: aload #10
    //   99: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   104: pop
    //   105: aload #4
    //   107: ifnonnull -> 128
    //   110: aload_3
    //   111: aload_2
    //   112: aload #8
    //   114: sipush #-29145
    //   117: sipush #1594
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: aload #9
    //   125: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   128: aload #4
    //   130: ifnonnull -> 36
    //   133: aload #5
    //   135: areturn
  }
  
  public Property property(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    if (paramZr != null) {
      if (paramZr.ZL())
        return (Property)new BooleanValueProperty(Boolean.valueOf(paramZr.Zf())); 
      if (paramZr.ZL(a(-29008, -24795)) == null) {
        Zb zb = paramZr.ZL(a(-28998, 32674));
        if (zb != null && zb.ZJ()) {
          String str = inferTypeFromArray((Zh)zb);
          paramZr.ZG(a(-29008, -24795), str);
        } 
      } 
    } 
    return (Property)Json.mapper().Zb(paramZr, Property.class);
  }
  
  public String inferTypeFromArray(Zh paramZh) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zv : ()I
    //   8: ifne -> 21
    //   11: sipush #-28931
    //   14: sipush #-32249
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
    //   54: sipush #-28952
    //   57: sipush #-12115
    //   60: invokestatic a : (II)Ljava/lang/String;
    //   63: astore_3
    //   64: aload_2
    //   65: ifnonnull -> 164
    //   68: sipush #-29039
    //   71: sipush #-11028
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: aload_3
    //   78: invokevirtual equals : (Ljava/lang/Object;)Z
    //   81: ifne -> 164
    //   84: sipush #-28931
    //   87: sipush #-32249
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: astore_3
    //   94: aload_2
    //   95: ifnonnull -> 164
    //   98: aload #5
    //   100: invokevirtual Zd : ()Z
    //   103: ifeq -> 154
    //   106: aload_3
    //   107: ifnonnull -> 124
    //   110: sipush #-29026
    //   113: sipush #32381
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: astore_3
    //   120: aload_2
    //   121: ifnonnull -> 164
    //   124: sipush #-29026
    //   127: sipush #32381
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: aload_3
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifne -> 164
    //   140: sipush #-28931
    //   143: sipush #-32249
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: astore_3
    //   150: aload_2
    //   151: ifnonnull -> 164
    //   154: sipush #-28931
    //   157: sipush #-32249
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: astore_3
    //   164: iinc #4, 1
    //   167: aload_2
    //   168: ifnonnull -> 26
    //   171: aload_3
    //   172: areturn
  }
  
  public RefModel refModel(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    RefModel refModel = new RefModel();
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramZr.ZF().equals(Zfr.OBJECT)) {
      String str = ((Zb)paramZr.ZL(a(-28971, 19067))).Zz();
      refModel.set$ref(str);
      if (arrayOfInt != null) {
        Set<String> set = getKeys(paramZr);
        for (String str1 : set) {
          if (!REF_MODEL_KEYS.contains(str1))
            paramSwaggerDeserializer$ParseResult.extra(paramString, str1, paramZr.ZL(str1)); 
          if (arrayOfInt == null)
            break; 
        } 
        return refModel;
      } 
    } 
    paramSwaggerDeserializer$ParseResult.invalidType(paramString, a(-28971, 19067), a(-29145, 1594), (Zb)paramZr);
    return null;
  }
  
  public Responses responses(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v1/models/Responses
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
    //   43: ifeq -> 159
    //   46: aload #7
    //   48: invokeinterface next : ()Ljava/lang/Object;
    //   53: checkcast java/lang/String
    //   56: astore #8
    //   58: aload_1
    //   59: aload #8
    //   61: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   64: astore #9
    //   66: aload #8
    //   68: sipush #-29005
    //   71: sipush #17481
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   80: ifeq -> 101
    //   83: aload #5
    //   85: aload #8
    //   87: aload_0
    //   88: aload #9
    //   90: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   93: invokevirtual addVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   96: aload #4
    //   98: ifnonnull -> 154
    //   101: aload_0
    //   102: aload #8
    //   104: aload_1
    //   105: iconst_0
    //   106: aload_2
    //   107: sipush #-29060
    //   110: sipush #-11375
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   121: aload_3
    //   122: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   125: astore #10
    //   127: aload_0
    //   128: aload #10
    //   130: aload_2
    //   131: aload #8
    //   133: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   138: aload_3
    //   139: invokevirtual response : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Response;
    //   142: astore #11
    //   144: aload #5
    //   146: aload #8
    //   148: aload #11
    //   150: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: aload #4
    //   156: ifnonnull -> 36
    //   159: aload #5
    //   161: areturn
  }
  
  public Response response(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v1/models/Response
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_1
    //   21: sipush #-28971
    //   24: sipush #19067
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   33: astore #6
    //   35: aload #6
    //   37: ifnull -> 92
    //   40: aload #6
    //   42: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   45: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   48: invokevirtual equals : (Ljava/lang/Object;)Z
    //   51: ifeq -> 66
    //   54: aload_0
    //   55: aload #6
    //   57: checkcast com/fasterxml/Zg/Zb
    //   60: aload_2
    //   61: aload_3
    //   62: invokevirtual refResponse : (Lcom/fasterxml/Zg/Zb;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/RefResponse;
    //   65: areturn
    //   66: aload_3
    //   67: aload_2
    //   68: sipush #-28971
    //   71: sipush #19067
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: sipush #-28931
    //   80: sipush #-32249
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: aload_1
    //   87: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   90: aconst_null
    //   91: areturn
    //   92: aload_0
    //   93: sipush #-29094
    //   96: sipush #23166
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: aload_1
    //   103: iconst_1
    //   104: aload_2
    //   105: aload_3
    //   106: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   109: astore #7
    //   111: aload #5
    //   113: aload #7
    //   115: invokevirtual description : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Response;
    //   118: pop
    //   119: aload_0
    //   120: sipush #-28977
    //   123: sipush #-32496
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: aload_1
    //   130: iconst_0
    //   131: aload_2
    //   132: aload_3
    //   133: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   136: astore #8
    //   138: aload #8
    //   140: ifnull -> 262
    //   143: aload #8
    //   145: sipush #-28971
    //   148: sipush #19067
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   157: astore #9
    //   159: aload #9
    //   161: ifnull -> 234
    //   164: aload #9
    //   166: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   169: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   172: invokevirtual equals : (Ljava/lang/Object;)Z
    //   175: ifeq -> 205
    //   178: new net/portswigger/swagger/v1/models/RefModel
    //   181: dup
    //   182: aload #9
    //   184: invokevirtual Zz : ()Ljava/lang/String;
    //   187: invokespecial <init> : (Ljava/lang/String;)V
    //   190: astore #10
    //   192: aload #5
    //   194: aload #10
    //   196: invokevirtual responseSchema : (Lnet/portswigger/swagger/v1/models/Model;)Lnet/portswigger/swagger/v1/models/Response;
    //   199: pop
    //   200: aload #4
    //   202: ifnonnull -> 262
    //   205: aload_3
    //   206: aload_2
    //   207: sipush #-28971
    //   210: sipush #19067
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: sipush #-28931
    //   219: sipush #-32249
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: aload_1
    //   226: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   229: aload #4
    //   231: ifnonnull -> 262
    //   234: aload #5
    //   236: aload_0
    //   237: aload #8
    //   239: aload_2
    //   240: sipush #-29072
    //   243: sipush #-22787
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   254: aload_3
    //   255: invokevirtual definition : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Model;
    //   258: invokevirtual responseSchema : (Lnet/portswigger/swagger/v1/models/Model;)Lnet/portswigger/swagger/v1/models/Response;
    //   261: pop
    //   262: aload_0
    //   263: sipush #-28929
    //   266: sipush #6779
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: aload_1
    //   273: iconst_0
    //   274: aload_2
    //   275: aload_3
    //   276: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   279: astore #9
    //   281: aload #9
    //   283: ifnull -> 322
    //   286: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   289: aload #9
    //   291: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   294: invokevirtual ZS : ()Lcom/fasterxml/Zh/Zi;
    //   297: ldc java/util/Map
    //   299: ldc java/lang/String
    //   301: ldc net/portswigger/swagger/v1/models/properties/Property
    //   303: invokevirtual Zv : (Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/Zh/Zf;
    //   306: invokevirtual Zh : (Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   309: checkcast java/util/Map
    //   312: astore #10
    //   314: aload #5
    //   316: aload #10
    //   318: invokevirtual headers : (Ljava/util/Map;)Lnet/portswigger/swagger/v1/models/Response;
    //   321: pop
    //   322: aload_0
    //   323: sipush #-29105
    //   326: sipush #-1695
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: aload_1
    //   333: iconst_0
    //   334: aload_2
    //   335: aload_3
    //   336: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   339: astore #10
    //   341: aload #10
    //   343: ifnull -> 381
    //   346: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   349: aload #10
    //   351: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   354: invokevirtual ZS : ()Lcom/fasterxml/Zh/Zi;
    //   357: ldc java/util/Map
    //   359: ldc java/lang/String
    //   361: ldc java/lang/Object
    //   363: invokevirtual Zv : (Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/fasterxml/Zh/Zf;
    //   366: invokevirtual Zh : (Ljava/lang/Object;Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   369: checkcast java/util/Map
    //   372: astore #11
    //   374: aload #5
    //   376: aload #11
    //   378: invokevirtual setExamples : (Ljava/util/Map;)V
    //   381: aload_0
    //   382: aload_1
    //   383: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   386: astore #11
    //   388: aload #11
    //   390: invokeinterface iterator : ()Ljava/util/Iterator;
    //   395: astore #12
    //   397: aload #12
    //   399: invokeinterface hasNext : ()Z
    //   404: ifeq -> 489
    //   407: aload #12
    //   409: invokeinterface next : ()Ljava/lang/Object;
    //   414: checkcast java/lang/String
    //   417: astore #13
    //   419: aload #13
    //   421: sipush #-29005
    //   424: sipush #17481
    //   427: invokestatic a : (II)Ljava/lang/String;
    //   430: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   433: ifeq -> 458
    //   436: aload #5
    //   438: aload #13
    //   440: aload_0
    //   441: aload_1
    //   442: aload #13
    //   444: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   447: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   450: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   453: aload #4
    //   455: ifnonnull -> 484
    //   458: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.RESPONSE_KEYS : Ljava/util/Set;
    //   461: aload #13
    //   463: invokeinterface contains : (Ljava/lang/Object;)Z
    //   468: ifne -> 484
    //   471: aload_3
    //   472: aload_2
    //   473: aload #13
    //   475: aload_1
    //   476: aload #13
    //   478: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   481: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   484: aload #4
    //   486: ifnonnull -> 397
    //   489: aload #5
    //   491: areturn
  }
  
  public Info info(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v1/models/Info
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-29041
    //   24: sipush #14660
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_1
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   37: astore #6
    //   39: aload #5
    //   41: aload #6
    //   43: invokevirtual title : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Info;
    //   46: pop
    //   47: aload_0
    //   48: sipush #-29094
    //   51: sipush #23166
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: aload_1
    //   58: iconst_0
    //   59: aload_2
    //   60: aload_3
    //   61: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   64: astore #6
    //   66: aload #5
    //   68: aload #6
    //   70: invokevirtual description : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Info;
    //   73: pop
    //   74: aload_0
    //   75: sipush #-28949
    //   78: sipush #-28189
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: aload_1
    //   85: iconst_0
    //   86: aload_2
    //   87: aload_3
    //   88: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   91: astore #6
    //   93: aload #5
    //   95: aload #6
    //   97: invokevirtual termsOfService : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Info;
    //   100: pop
    //   101: aload_0
    //   102: sipush #-29117
    //   105: sipush #-5085
    //   108: invokestatic a : (II)Ljava/lang/String;
    //   111: aload_1
    //   112: iconst_0
    //   113: sipush #-29117
    //   116: sipush #-5085
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: aload_3
    //   123: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   126: astore #7
    //   128: aload_0
    //   129: aload #7
    //   131: aload_2
    //   132: aload_3
    //   133: invokevirtual contact : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/Contact;
    //   136: astore #8
    //   138: aload #5
    //   140: aload #8
    //   142: invokevirtual contact : (Lnet/portswigger/swagger/v1/models/Contact;)Lnet/portswigger/swagger/v1/models/Info;
    //   145: pop
    //   146: aload_0
    //   147: sipush #-28940
    //   150: sipush #20212
    //   153: invokestatic a : (II)Ljava/lang/String;
    //   156: aload_1
    //   157: iconst_0
    //   158: aload_2
    //   159: aload_3
    //   160: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   163: astore #7
    //   165: aload_0
    //   166: aload #7
    //   168: aload_2
    //   169: aload_3
    //   170: invokevirtual license : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/License;
    //   173: astore #9
    //   175: aload #5
    //   177: aload #9
    //   179: invokevirtual license : (Lnet/portswigger/swagger/v1/models/License;)Lnet/portswigger/swagger/v1/models/Info;
    //   182: pop
    //   183: aload_0
    //   184: sipush #-29149
    //   187: sipush #-26798
    //   190: invokestatic a : (II)Ljava/lang/String;
    //   193: aload_1
    //   194: iconst_0
    //   195: aload_2
    //   196: aload_3
    //   197: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   200: astore #6
    //   202: aload #5
    //   204: aload #6
    //   206: invokevirtual version : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Info;
    //   209: pop
    //   210: aload_0
    //   211: aload_1
    //   212: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   215: astore #10
    //   217: aload #10
    //   219: invokeinterface iterator : ()Ljava/util/Iterator;
    //   224: astore #11
    //   226: aload #11
    //   228: invokeinterface hasNext : ()Z
    //   233: ifeq -> 318
    //   236: aload #11
    //   238: invokeinterface next : ()Ljava/lang/Object;
    //   243: checkcast java/lang/String
    //   246: astore #12
    //   248: aload #12
    //   250: sipush #-29005
    //   253: sipush #17481
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   262: ifeq -> 287
    //   265: aload #5
    //   267: aload #12
    //   269: aload_0
    //   270: aload_1
    //   271: aload #12
    //   273: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   276: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   279: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   282: aload #4
    //   284: ifnonnull -> 313
    //   287: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.INFO_KEYS : Ljava/util/Set;
    //   290: aload #12
    //   292: invokeinterface contains : (Ljava/lang/Object;)Z
    //   297: ifne -> 313
    //   300: aload_3
    //   301: aload_2
    //   302: aload #12
    //   304: aload_1
    //   305: aload #12
    //   307: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   310: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   313: aload #4
    //   315: ifnonnull -> 226
    //   318: aload #5
    //   320: areturn
  }
  
  public License license(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v1/models/License
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-28955
    //   24: sipush #-27372
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_1
    //   32: aload_2
    //   33: aload_3
    //   34: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   37: astore #6
    //   39: aload #5
    //   41: aload #6
    //   43: invokevirtual name : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/License;
    //   46: pop
    //   47: aload_0
    //   48: sipush #-28983
    //   51: sipush #-22175
    //   54: invokestatic a : (II)Ljava/lang/String;
    //   57: aload_1
    //   58: iconst_0
    //   59: aload_2
    //   60: aload_3
    //   61: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   64: astore #6
    //   66: aload #5
    //   68: aload #6
    //   70: invokevirtual url : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/License;
    //   73: pop
    //   74: aload_0
    //   75: aload_1
    //   76: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   79: astore #7
    //   81: aload #7
    //   83: invokeinterface iterator : ()Ljava/util/Iterator;
    //   88: astore #8
    //   90: aload #8
    //   92: invokeinterface hasNext : ()Z
    //   97: ifeq -> 196
    //   100: aload #8
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast java/lang/String
    //   110: astore #9
    //   112: aload #9
    //   114: sipush #-29005
    //   117: sipush #17481
    //   120: invokestatic a : (II)Ljava/lang/String;
    //   123: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   126: ifeq -> 151
    //   129: aload #5
    //   131: aload #9
    //   133: aload_0
    //   134: aload_1
    //   135: aload #9
    //   137: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   140: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   143: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   146: aload #4
    //   148: ifnonnull -> 191
    //   151: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.LICENSE_KEYS : Ljava/util/Set;
    //   154: aload #9
    //   156: invokeinterface contains : (Ljava/lang/Object;)Z
    //   161: ifne -> 191
    //   164: aload_3
    //   165: aload_2
    //   166: sipush #-29051
    //   169: sipush #32354
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: aload #9
    //   182: aload_1
    //   183: aload #9
    //   185: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   188: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   191: aload #4
    //   193: ifnonnull -> 90
    //   196: aload #5
    //   198: areturn
  }
  
  public Contact contact(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new net/portswigger/swagger/v1/models/Contact
    //   14: dup
    //   15: invokespecial <init> : ()V
    //   18: astore #5
    //   20: aload_0
    //   21: sipush #-28955
    //   24: sipush #-27372
    //   27: invokestatic a : (II)Ljava/lang/String;
    //   30: aload_1
    //   31: iconst_0
    //   32: aload_2
    //   33: sipush #-29113
    //   36: sipush #-10009
    //   39: invokestatic a : (II)Ljava/lang/String;
    //   42: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   47: aload_3
    //   48: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   51: astore #6
    //   53: aload #5
    //   55: aload #6
    //   57: invokevirtual name : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Contact;
    //   60: pop
    //   61: aload_0
    //   62: sipush #-28983
    //   65: sipush #-22175
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: aload_1
    //   72: iconst_0
    //   73: aload_2
    //   74: sipush #-29092
    //   77: sipush #31821
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   88: aload_3
    //   89: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   92: astore #6
    //   94: aload #5
    //   96: aload #6
    //   98: invokevirtual url : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Contact;
    //   101: pop
    //   102: aload_0
    //   103: sipush #-28934
    //   106: sipush #25413
    //   109: invokestatic a : (II)Ljava/lang/String;
    //   112: aload_1
    //   113: iconst_0
    //   114: aload_2
    //   115: sipush #-29058
    //   118: sipush #1626
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   129: aload_3
    //   130: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   133: astore #6
    //   135: aload #5
    //   137: aload #6
    //   139: invokevirtual email : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Contact;
    //   142: pop
    //   143: aload_0
    //   144: aload_1
    //   145: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   148: astore #7
    //   150: aload #7
    //   152: invokeinterface iterator : ()Ljava/util/Iterator;
    //   157: astore #8
    //   159: aload #8
    //   161: invokeinterface hasNext : ()Z
    //   166: ifeq -> 265
    //   169: aload #8
    //   171: invokeinterface next : ()Ljava/lang/Object;
    //   176: checkcast java/lang/String
    //   179: astore #9
    //   181: aload #9
    //   183: sipush #-29005
    //   186: sipush #17481
    //   189: invokestatic a : (II)Ljava/lang/String;
    //   192: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   195: ifeq -> 220
    //   198: aload #5
    //   200: aload #9
    //   202: aload_0
    //   203: aload_1
    //   204: aload #9
    //   206: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   209: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   212: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   215: aload #4
    //   217: ifnonnull -> 260
    //   220: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.CONTACT_KEYS : Ljava/util/Set;
    //   223: aload #9
    //   225: invokeinterface contains : (Ljava/lang/Object;)Z
    //   230: ifne -> 260
    //   233: aload_3
    //   234: aload_2
    //   235: sipush #-29022
    //   238: sipush #-30360
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   249: aload #9
    //   251: aload_1
    //   252: aload #9
    //   254: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   257: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   260: aload #4
    //   262: ifnonnull -> 159
    //   265: aload #5
    //   267: areturn
  }
  
  public Map<String, SecuritySchemeDefinition> securityDefinitions(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramZr == null)
      return null; 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Set<String> set = getKeys(paramZr);
    for (String str : set) {
      Zr zr = getObject(str, paramZr, false, paramString, paramSwaggerDeserializer$ParseResult);
      SecuritySchemeDefinition securitySchemeDefinition = securityDefinition(zr, paramString + "." + paramString, paramSwaggerDeserializer$ParseResult);
      if (securitySchemeDefinition != null)
        linkedHashMap.put(str, securitySchemeDefinition); 
      if (arrayOfInt == null)
        break; 
    } 
    return (Map)linkedHashMap;
  }
  
  public SecuritySchemeDefinition securityDefinition(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aconst_null
    //   12: astore #5
    //   14: aload_0
    //   15: sipush #-29008
    //   18: sipush #-24795
    //   21: invokestatic a : (II)Ljava/lang/String;
    //   24: aload_1
    //   25: iconst_1
    //   26: aload_2
    //   27: aload_3
    //   28: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   31: astore #6
    //   33: aload #6
    //   35: ifnull -> 474
    //   38: aload #6
    //   40: sipush #-29013
    //   43: sipush #-23912
    //   46: invokestatic a : (II)Ljava/lang/String;
    //   49: invokevirtual equals : (Ljava/lang/Object;)Z
    //   52: ifeq -> 72
    //   55: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   58: aload_1
    //   59: ldc net/portswigger/swagger/v1/models/auth/BasicAuthDefinition
    //   61: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   64: checkcast net/portswigger/swagger/v1/models/auth/SecuritySchemeDefinition
    //   67: astore #5
    //   69: goto -> 364
    //   72: aload #6
    //   74: sipush #-29095
    //   77: sipush #-6882
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual equals : (Ljava/lang/Object;)Z
    //   86: ifeq -> 260
    //   89: aload_0
    //   90: sipush #-29034
    //   93: sipush #227
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: aload_1
    //   100: iconst_1
    //   101: aload_2
    //   102: aload_3
    //   103: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   106: astore #7
    //   108: aload_0
    //   109: sipush #-28955
    //   112: sipush #-27372
    //   115: invokestatic a : (II)Ljava/lang/String;
    //   118: aload_1
    //   119: iconst_1
    //   120: aload_2
    //   121: aload_3
    //   122: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   125: astore #8
    //   127: aload #8
    //   129: ifnull -> 225
    //   132: sipush #-29081
    //   135: sipush #-7260
    //   138: invokestatic a : (II)Ljava/lang/String;
    //   141: aload #7
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifne -> 166
    //   149: sipush #-28988
    //   152: sipush #23931
    //   155: invokestatic a : (II)Ljava/lang/String;
    //   158: aload #7
    //   160: invokevirtual equals : (Ljava/lang/Object;)Z
    //   163: ifeq -> 225
    //   166: aload #7
    //   168: invokestatic forValue : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/auth/In;
    //   171: astore #9
    //   173: aload #9
    //   175: ifnull -> 225
    //   178: new net/portswigger/swagger/v1/models/auth/ApiKeyAuthDefinition
    //   181: dup
    //   182: invokespecial <init> : ()V
    //   185: aload #8
    //   187: invokevirtual name : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/auth/ApiKeyAuthDefinition;
    //   190: aload #9
    //   192: invokevirtual in : (Lnet/portswigger/swagger/v1/models/auth/In;)Lnet/portswigger/swagger/v1/models/auth/ApiKeyAuthDefinition;
    //   195: astore #5
    //   197: aload_0
    //   198: sipush #-29094
    //   201: sipush #23166
    //   204: invokestatic a : (II)Ljava/lang/String;
    //   207: aload_1
    //   208: iconst_0
    //   209: aload_2
    //   210: aload_3
    //   211: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   214: astore #10
    //   216: aload #5
    //   218: aload #10
    //   220: invokeinterface setDescription : (Ljava/lang/String;)V
    //   225: aload_1
    //   226: sipush #-29094
    //   229: sipush #23166
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   238: astore #9
    //   240: aload #9
    //   242: ifnull -> 257
    //   245: aload #5
    //   247: aload #9
    //   249: invokevirtual Zz : ()Ljava/lang/String;
    //   252: invokeinterface setDescription : (Ljava/lang/String;)V
    //   257: goto -> 364
    //   260: aload #6
    //   262: sipush #-28991
    //   265: sipush #22186
    //   268: invokestatic a : (II)Ljava/lang/String;
    //   271: invokevirtual equals : (Ljava/lang/Object;)Z
    //   274: ifeq -> 326
    //   277: invokestatic mapper : ()Lcom/fasterxml/Zor/Zy6;
    //   280: aload_1
    //   281: ldc net/portswigger/swagger/v1/models/auth/OAuth2Definition
    //   283: invokevirtual Zb : (Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    //   286: checkcast net/portswigger/swagger/v1/models/auth/SecuritySchemeDefinition
    //   289: astore #5
    //   291: aload_1
    //   292: sipush #-29094
    //   295: sipush #23166
    //   298: invokestatic a : (II)Ljava/lang/String;
    //   301: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   304: astore #7
    //   306: aload #7
    //   308: ifnull -> 323
    //   311: aload #5
    //   313: aload #7
    //   315: invokevirtual Zz : ()Ljava/lang/String;
    //   318: invokeinterface setDescription : (Ljava/lang/String;)V
    //   323: goto -> 364
    //   326: aload_3
    //   327: aload_2
    //   328: sipush #-28951
    //   331: sipush #-10199
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   342: sipush #-29008
    //   345: sipush #-24795
    //   348: invokestatic a : (II)Ljava/lang/String;
    //   351: sipush #-29104
    //   354: sipush #25423
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: aload_1
    //   361: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   364: aload_0
    //   365: aload_1
    //   366: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   369: astore #7
    //   371: aload #7
    //   373: invokeinterface iterator : ()Ljava/util/Iterator;
    //   378: astore #8
    //   380: aload #8
    //   382: invokeinterface hasNext : ()Z
    //   387: ifeq -> 474
    //   390: aload #8
    //   392: invokeinterface next : ()Ljava/lang/Object;
    //   397: checkcast java/lang/String
    //   400: astore #9
    //   402: aload #9
    //   404: sipush #-29005
    //   407: sipush #17481
    //   410: invokestatic a : (II)Ljava/lang/String;
    //   413: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   416: ifeq -> 443
    //   419: aload #5
    //   421: aload #9
    //   423: aload_0
    //   424: aload_1
    //   425: aload #9
    //   427: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   430: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   433: invokeinterface setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   438: aload #4
    //   440: ifnonnull -> 469
    //   443: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.SECURITY_SCHEME_KEYS : Ljava/util/Set;
    //   446: aload #9
    //   448: invokeinterface contains : (Ljava/lang/Object;)Z
    //   453: ifne -> 469
    //   456: aload_3
    //   457: aload_2
    //   458: aload #9
    //   460: aload_1
    //   461: aload #9
    //   463: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   466: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   469: aload #4
    //   471: ifnonnull -> 380
    //   474: aload #5
    //   476: areturn
  }
  
  public List<SecurityRequirement> securityRequirements(Zh paramZh, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
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
    //   33: ifeq -> 272
    //   36: aload #6
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast com/fasterxml/Zor/Zb
    //   46: astore #7
    //   48: new net/portswigger/swagger/v1/models/SecurityRequirement
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: astore #8
    //   57: aload #7
    //   59: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   62: getstatic com/fasterxml/Zg/Zfr.OBJECT : Lcom/fasterxml/Zg/Zfr;
    //   65: invokevirtual equals : (Ljava/lang/Object;)Z
    //   68: ifeq -> 257
    //   71: aload #7
    //   73: checkcast com/fasterxml/Zg/Zr
    //   76: astore #9
    //   78: aload_0
    //   79: aload #9
    //   81: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   84: astore #10
    //   86: aload #10
    //   88: invokeinterface iterator : ()Ljava/util/Iterator;
    //   93: astore #11
    //   95: aload #11
    //   97: invokeinterface hasNext : ()Z
    //   102: ifeq -> 257
    //   105: aload #11
    //   107: invokeinterface next : ()Ljava/lang/Object;
    //   112: checkcast java/lang/String
    //   115: astore #12
    //   117: new java/util/ArrayList
    //   120: dup
    //   121: invokespecial <init> : ()V
    //   124: astore #13
    //   126: aload_0
    //   127: aload #12
    //   129: aload #9
    //   131: iconst_0
    //   132: aload_2
    //   133: sipush #-29009
    //   136: sipush #-11214
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   147: aload_3
    //   148: invokevirtual getArray : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zh;
    //   151: astore #14
    //   153: aload #14
    //   155: ifnull -> 242
    //   158: aload #14
    //   160: invokevirtual iterator : ()Ljava/util/Iterator;
    //   163: astore #15
    //   165: aload #15
    //   167: invokeinterface hasNext : ()Z
    //   172: ifeq -> 242
    //   175: aload #15
    //   177: invokeinterface next : ()Ljava/lang/Object;
    //   182: checkcast com/fasterxml/Zor/Zb
    //   185: astore #16
    //   187: aload #16
    //   189: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   192: getstatic com/fasterxml/Zg/Zfr.STRING : Lcom/fasterxml/Zg/Zfr;
    //   195: invokevirtual equals : (Ljava/lang/Object;)Z
    //   198: ifeq -> 219
    //   201: aload #13
    //   203: aload #16
    //   205: invokevirtual Zp : ()Ljava/lang/String;
    //   208: invokeinterface add : (Ljava/lang/Object;)Z
    //   213: pop
    //   214: aload #4
    //   216: ifnonnull -> 237
    //   219: aload_3
    //   220: aload_2
    //   221: aload #12
    //   223: sipush #-28931
    //   226: sipush #-32249
    //   229: invokestatic a : (II)Ljava/lang/String;
    //   232: aload #16
    //   234: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   237: aload #4
    //   239: ifnonnull -> 165
    //   242: aload #8
    //   244: aload #12
    //   246: aload #13
    //   248: invokevirtual requirement : (Ljava/lang/String;Ljava/util/List;)Lnet/portswigger/swagger/v1/models/SecurityRequirement;
    //   251: pop
    //   252: aload #4
    //   254: ifnonnull -> 95
    //   257: aload #5
    //   259: aload #8
    //   261: invokeinterface add : (Ljava/lang/Object;)Z
    //   266: pop
    //   267: aload #4
    //   269: ifnonnull -> 26
    //   272: aload #5
    //   274: areturn
  }
  
  public List<String> tagStrings(Zh paramZh, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramZh == null)
      return null; 
    ArrayList<String> arrayList = new ArrayList();
    for (Zb zb : paramZh) {
      if (zb.ZF().equals(Zfr.STRING))
        arrayList.add(zb.Zz()); 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  public List<Tag> tags(Zh paramZh, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramZh == null)
      return null; 
    ArrayList<Tag> arrayList = new ArrayList();
    for (Zb zb : paramZh) {
      if (zb.ZF().equals(Zfr.OBJECT)) {
        Tag tag = tag((Zr)zb, paramString + paramString, paramSwaggerDeserializer$ParseResult);
        if (tag != null)
          arrayList.add(tag); 
      } 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  public Tag tag(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aconst_null
    //   4: astore #5
    //   6: astore #4
    //   8: aload_1
    //   9: ifnull -> 248
    //   12: new net/portswigger/swagger/v1/models/Tag
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #5
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   26: astore #6
    //   28: aload_0
    //   29: sipush #-28955
    //   32: sipush #-27372
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: aload_1
    //   39: iconst_1
    //   40: aload_2
    //   41: aload_3
    //   42: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   45: astore #7
    //   47: aload #5
    //   49: aload #7
    //   51: invokevirtual name : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Tag;
    //   54: pop
    //   55: aload_0
    //   56: sipush #-29094
    //   59: sipush #23166
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: aload_1
    //   66: iconst_0
    //   67: aload_2
    //   68: aload_3
    //   69: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   72: astore #7
    //   74: aload #5
    //   76: aload #7
    //   78: invokevirtual description : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Tag;
    //   81: pop
    //   82: aload_0
    //   83: sipush #-29150
    //   86: sipush #-2998
    //   89: invokestatic a : (II)Ljava/lang/String;
    //   92: aload_1
    //   93: iconst_0
    //   94: aload_2
    //   95: aload_3
    //   96: invokevirtual getObject : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lcom/fasterxml/Zg/Zr;
    //   99: astore #8
    //   101: aload_0
    //   102: aload #8
    //   104: aload_2
    //   105: sipush #-29150
    //   108: sipush #-2998
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: aload_3
    //   120: invokevirtual externalDocs : (Lcom/fasterxml/Zg/Zr;Ljava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   123: astore #9
    //   125: aload #5
    //   127: aload #9
    //   129: invokevirtual externalDocs : (Lnet/portswigger/swagger/v1/models/ExternalDocs;)Lnet/portswigger/swagger/v1/models/Tag;
    //   132: pop
    //   133: aload #6
    //   135: invokeinterface iterator : ()Ljava/util/Iterator;
    //   140: astore #10
    //   142: aload #10
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 248
    //   152: aload #10
    //   154: invokeinterface next : ()Ljava/lang/Object;
    //   159: checkcast java/lang/String
    //   162: astore #11
    //   164: aload #11
    //   166: sipush #-29005
    //   169: sipush #17481
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   178: ifeq -> 203
    //   181: aload #5
    //   183: aload #11
    //   185: aload_0
    //   186: aload_1
    //   187: aload #11
    //   189: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   192: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   195: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   198: aload #4
    //   200: ifnonnull -> 243
    //   203: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.TAG_KEYS : Ljava/util/Set;
    //   206: aload #11
    //   208: invokeinterface contains : (Ljava/lang/Object;)Z
    //   213: ifne -> 243
    //   216: aload_3
    //   217: aload_2
    //   218: sipush #-29106
    //   221: sipush #-8379
    //   224: invokestatic a : (II)Ljava/lang/String;
    //   227: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   232: aload #11
    //   234: aload_1
    //   235: aload #11
    //   237: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   240: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   243: aload #4
    //   245: ifnonnull -> 142
    //   248: aload #5
    //   250: areturn
  }
  
  public ExternalDocs externalDocs(Zr paramZr, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aconst_null
    //   4: astore #5
    //   6: astore #4
    //   8: aload_1
    //   9: ifnull -> 197
    //   12: new net/portswigger/swagger/v1/models/ExternalDocs
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore #5
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual getKeys : (Lcom/fasterxml/Zg/Zr;)Ljava/util/Set;
    //   26: astore #6
    //   28: aload_0
    //   29: sipush #-29094
    //   32: sipush #23166
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: aload_1
    //   39: iconst_0
    //   40: aload_2
    //   41: aload_3
    //   42: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   45: astore #7
    //   47: aload #5
    //   49: aload #7
    //   51: invokevirtual description : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   54: pop
    //   55: aload_0
    //   56: sipush #-28954
    //   59: sipush #5676
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: aload_1
    //   66: iconst_1
    //   67: aload_2
    //   68: aload_3
    //   69: invokevirtual getString : (Ljava/lang/String;Lcom/fasterxml/Zg/Zr;ZLjava/lang/String;Lnet/portswigger/swagger/v1/parser/util/SwaggerDeserializer$ParseResult;)Ljava/lang/String;
    //   72: astore #7
    //   74: aload #5
    //   76: aload #7
    //   78: invokevirtual url : (Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/ExternalDocs;
    //   81: pop
    //   82: aload #6
    //   84: invokeinterface iterator : ()Ljava/util/Iterator;
    //   89: astore #8
    //   91: aload #8
    //   93: invokeinterface hasNext : ()Z
    //   98: ifeq -> 197
    //   101: aload #8
    //   103: invokeinterface next : ()Ljava/lang/Object;
    //   108: checkcast java/lang/String
    //   111: astore #9
    //   113: aload #9
    //   115: sipush #-29005
    //   118: sipush #17481
    //   121: invokestatic a : (II)Ljava/lang/String;
    //   124: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   127: ifeq -> 152
    //   130: aload #5
    //   132: aload #9
    //   134: aload_0
    //   135: aload_1
    //   136: aload #9
    //   138: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   141: invokevirtual extension : (Lcom/fasterxml/Zor/Zb;)Ljava/lang/Object;
    //   144: invokevirtual setVendorExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   147: aload #4
    //   149: ifnonnull -> 192
    //   152: getstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.EXTERNAL_DOCS_KEYS : Ljava/util/Set;
    //   155: aload #9
    //   157: invokeinterface contains : (Ljava/lang/Object;)Z
    //   162: ifne -> 192
    //   165: aload_3
    //   166: aload_2
    //   167: sipush #-29065
    //   170: sipush #-13307
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   181: aload #9
    //   183: aload_1
    //   184: aload #9
    //   186: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   189: invokevirtual extra : (Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   192: aload #4
    //   194: ifnonnull -> 91
    //   197: aload #5
    //   199: areturn
  }
  
  public String getString(Zb paramZb, String paramString, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    null = null;
    int[] arrayOfInt = RemoteUrl.ZS();
    if (!paramZb.ZF().equals(Zfr.STRING)) {
      paramSwaggerDeserializer$ParseResult.invalidType(paramString, "", a(-28931, -32249), paramZb);
      return (arrayOfInt == null) ? ((Zb)paramZb).Zp() : null;
    } 
    return ((Zb)paramZb).Zp();
  }
  
  public Zh getArray(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aload_2
    //   4: aload_1
    //   5: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   8: astore #7
    //   10: aconst_null
    //   11: astore #8
    //   13: astore #6
    //   15: aload #7
    //   17: ifnonnull -> 42
    //   20: iload_3
    //   21: ifeq -> 87
    //   24: aload #5
    //   26: aload #4
    //   28: aload_1
    //   29: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload #5
    //   34: invokevirtual invalid : ()V
    //   37: aload #6
    //   39: ifnonnull -> 87
    //   42: aload #7
    //   44: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   47: getstatic com/fasterxml/Zg/Zfr.ARRAY : Lcom/fasterxml/Zg/Zfr;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifne -> 80
    //   56: aload #5
    //   58: aload #4
    //   60: aload_1
    //   61: sipush #-29082
    //   64: sipush #3900
    //   67: invokestatic a : (II)Ljava/lang/String;
    //   70: aload #7
    //   72: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   75: aload #6
    //   77: ifnonnull -> 87
    //   80: aload #7
    //   82: checkcast com/fasterxml/Zg/Zh
    //   85: astore #8
    //   87: aload #8
    //   89: areturn
  }
  
  public Zr getObject(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
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
    //   61: sipush #-29145
    //   64: sipush #1594
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
  
  public BigDecimal getBigDecimal(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #7
    //   3: invokestatic ZS : ()[I
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
    //   90: sipush #-29086
    //   93: sipush #-1022
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: aload_2
    //   100: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   103: aload #7
    //   105: areturn
  }
  
  public Number getNumber(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aconst_null
    //   4: astore #7
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   11: astore #8
    //   13: astore #6
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
    //   37: aload #6
    //   39: ifnonnull -> 92
    //   42: aload #8
    //   44: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   47: getstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   50: invokevirtual equals : (Ljava/lang/Object;)Z
    //   53: ifeq -> 66
    //   56: aload #8
    //   58: invokevirtual Zu : ()Ljava/lang/Number;
    //   61: astore #7
    //   63: goto -> 92
    //   66: aload #8
    //   68: invokevirtual ZA : ()Z
    //   71: ifne -> 92
    //   74: aload #5
    //   76: aload #4
    //   78: aload_1
    //   79: sipush #-28930
    //   82: sipush #12673
    //   85: invokestatic a : (II)Ljava/lang/String;
    //   88: aload_2
    //   89: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   92: aload #7
    //   94: areturn
  }
  
  public Integer getInteger(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
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
    //   25: ifeq -> 99
    //   28: aload #5
    //   30: aload #4
    //   32: aload_1
    //   33: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload #5
    //   38: invokevirtual invalid : ()V
    //   41: aload #6
    //   43: ifnonnull -> 99
    //   46: aload #8
    //   48: invokevirtual ZF : ()Lcom/fasterxml/Zg/Zfr;
    //   51: getstatic com/fasterxml/Zg/Zfr.NUMBER : Lcom/fasterxml/Zg/Zfr;
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifeq -> 73
    //   60: aload #8
    //   62: invokevirtual ZN : ()I
    //   65: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   68: astore #7
    //   70: goto -> 99
    //   73: aload #8
    //   75: invokevirtual ZA : ()Z
    //   78: ifne -> 99
    //   81: aload #5
    //   83: aload #4
    //   85: aload_1
    //   86: sipush #-28972
    //   89: sipush #3573
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: aload_2
    //   96: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   99: aload #7
    //   101: areturn
  }
  
  public String getString(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult) {
    return getString(paramString1, paramZr, paramBoolean, paramString2, paramSwaggerDeserializer$ParseResult, null);
  }
  
  public String getString(String paramString1, Zr paramZr, boolean paramBoolean, String paramString2, SwaggerDeserializer$ParseResult paramSwaggerDeserializer$ParseResult, Set<String> paramSet) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #8
    //   3: invokestatic ZS : ()[I
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   11: astore #9
    //   13: astore #7
    //   15: aload_2
    //   16: ifnull -> 24
    //   19: aload #9
    //   21: ifnonnull -> 46
    //   24: iload_3
    //   25: ifeq -> 122
    //   28: aload #5
    //   30: aload #4
    //   32: aload_1
    //   33: invokevirtual missing : (Ljava/lang/String;Ljava/lang/String;)V
    //   36: aload #5
    //   38: invokevirtual invalid : ()V
    //   41: aload #7
    //   43: ifnonnull -> 122
    //   46: aload #9
    //   48: invokevirtual ZA : ()Z
    //   51: ifne -> 77
    //   54: aload #5
    //   56: aload #4
    //   58: aload_1
    //   59: sipush #-28931
    //   62: sipush #-32249
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: aload_2
    //   69: invokevirtual invalidType : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)V
    //   72: aload #7
    //   74: ifnonnull -> 122
    //   77: aload #9
    //   79: invokevirtual Zp : ()Ljava/lang/String;
    //   82: astore #8
    //   84: aload #6
    //   86: ifnull -> 122
    //   89: aload #6
    //   91: aload #8
    //   93: invokeinterface add : (Ljava/lang/Object;)Z
    //   98: ifne -> 122
    //   101: aload #5
    //   103: aload #4
    //   105: sipush #-29118
    //   108: sipush #10106
    //   111: invokestatic a : (II)Ljava/lang/String;
    //   114: invokevirtual unique : (Ljava/lang/String;Ljava/lang/String;)V
    //   117: aload #5
    //   119: invokevirtual invalid : ()V
    //   122: aload #8
    //   124: areturn
  }
  
  public Set<String> getKeys(Zr paramZr) {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    int[] arrayOfInt = RemoteUrl.ZS();
    if (paramZr == null)
      return linkedHashSet; 
    Iterator<String> iterator = paramZr.ZM();
    while (iterator.hasNext()) {
      linkedHashSet.add(iterator.next());
      if (arrayOfInt == null)
        break; 
    } 
    return linkedHashSet;
  }
  
  static {
    // Byte code:
    //   0: sipush #204
    //   3: anewarray java/lang/String
    //   6: astore #5
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ØÓoÛV1hÚ²DY\\buW!\òÀØn\\t\\tjXÄ%³ KV§ÐY\\\nã^Zÿð ;gµR+)CÉys\\b¸Rz¤j$.Ï¬¦´ r\\f8 neRËë®ÐW¯6æ7ÌÇå?µB4\\b¬_Ýe´À£ÞÑ)UÁNårBJ6ÃË½!\*Ö/BÌÍ«_ Fù¥&ÆKVÉIíý*-â?dWe,cÁ-U¼Ø£1 òæC´aÁ´.`µ¶ôê®¾¿L¬CñH,øAtM>1ÚVUT¬)ÞÅíâ¹tf[aAÉZ¶Åv;³Ôü¢ö§4*njTâý¬~ãüýç)åÁ¥ÿä]9j9¬z®lÓ%Í\\bqS±\\bWÓR7»¡èå`_?G5Û¾8\\r¥óÍ\\rV6Ë\\fUp%hÕ;éÏäfQ¿×5óª÷[Ifø \\nTr_~RXåÙ5·f·#@\\t´Ïï·(û\\rEÚêI\\tÿ\\b«ªòvÓ4÷\\fñ\\bKÍæÅÃD«(ósî4Ì¾ëóøu{'é ¦ÙÂí>s¯¼<ÃÕüÖøIÅy u\\tü,Û(ÓÖáÞKdµG+Â"$Õ3\\n3FÉ~@Ä¬8<³|ëì[qzæ\\fòÛçÙ\\t,ã\\nuì¦ökÐµxÜæ[Â*p©\\r'Êk<4Ìi¡©¾Jæ"Â½ä%iÏÕuØA#¬î¸^oÂ)\\nÙ6¶Ñ¥:9P9Î+@S\\f¸}­!½bÏ ¾Î*ÒÎ×s*Ã'õD|Ù«-£~\\t¯p[goeÅÍL\\bXJ¸P½¶0\\bo)ËÒUG\\t\\nùÃO5åì\\tA²PÒ\\tK¶Üü3Ð·\\n¤æ; ÂüA6>W­¶\\b&*üù}\\n^¢PÞPT,¿?\\nÕ;S(t1\\r#Î;ê¯Ó±ÕHLùù*¶0:Ú$8Ð:)¼K*"\\b£4íó6òÅ\\bØATÍñ[\\bFÝ²<8±'PÝ9nS)s¦à_ªî|Ëy³!"×/t~Õ\\t«ò[09Á\\n9A|ÙÆHØ\\t#Ð×WÈ9x\\bÆK¥v­×v³sÍWfÙÔø\\t¤ºäÍI´!ýwÍnêÝmL}WOóø¶¤$ä«Æ|I#aì¬©VÒ_`½ùèÄ+}UÏÕ¼Ò%Æ&ýçµ\\rLÈª ×ÿÙq ©\\bÞå¡x^ØI\\bº¸%3{}\\rÓãñÑi¾§ú7êJN¸º\\tôæâò2\\f_g³\\t#³+xõeak"¦½ù.³¿¼k¹U¸öQ$&Óq# @ÜI§òÈëçy'ûÙ>ø1ÆÒõ\\n¸ÍäXÇéG³Ì\\f$Ö¿á/=(ôql3ïü%Ý¶ïí'\%eÖO1¦ç7¼>ºdøD9Æ>¬±¨wÖÞ_æ00£½ I8Æ\\bxÉeìòe7©¶ÆXFìR\\toþÛSB\\bQU§<\\bÍHlWu«Î­Fdµ\\fÈìQ©³Itz\\bñ¹AËØ^KJ.8<OÆÅ\\r*XáÎr/JgÒ7©i8èEbe1\\tÙa¢\Î^ÔÃñia°O0K@¹Èm C13ß8gáÝýÉº12£ìÙYÏ;ãs1²0w\\nK%Ðÿ~LáÇe\\tpL)#á?Åò\\n§\\b-¸¸\\n«Ñ÷v|ò;þM§Ä \¤ÄcBÑþN\\b!xrÄÞ·9eÂø\\rc=Àø+ÔP5tP«ì#úÅ"gfÚKËÞÆRWû/\\b4ÁZBð~\\rÝxÊ­¯±wqÐØé\\bÛ[y2pôEñï8cTZ a-gJÔÍÁÛû>B\\bü<õ×¯,xÕÏ%Å¡ ðMHgÚÆÐþöÎjpÖ'ßXÞ6ÓÈ8S³z\\bæEå#ÇP\\bJHi0`çf îR®ÀZyPÎÁM\\bªt $Nëo 8#·ªva\\r¹|òu]U¼Á;\ÓÖ¾¿A6JKÕcK¢XúÄ\\bGz,nI&Ëù¬GAðÇñg¾Em»à\\n9©ðÎN0Ù #Ã\\b¤B2×r<O\\nÊ;Â°âe N®¾*L> \\f+ïx)ÖÛÊúà±õJ\\bL<ÔR.ShkpSèÏ]ÒÔ&kÞ'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #11
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
    //   65: goto -> 24
    //   68: ldc 'èTâð3o'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #75
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 143
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
    //   128: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.a : [Ljava/lang/String;
    //   131: sipush #204
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #116
    //   214: goto -> 243
    //   217: iconst_4
    //   218: goto -> 243
    //   221: bipush #28
    //   223: goto -> 243
    //   226: bipush #93
    //   228: goto -> 243
    //   231: bipush #122
    //   233: goto -> 243
    //   236: bipush #112
    //   238: goto -> 243
    //   241: bipush #73
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: new java/util/LinkedHashSet
    //   303: dup
    //   304: bipush #15
    //   306: anewarray java/lang/String
    //   309: dup
    //   310: iconst_0
    //   311: sipush #-28981
    //   314: sipush #31414
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: aastore
    //   321: dup
    //   322: iconst_1
    //   323: sipush #-29003
    //   326: sipush #10355
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: aastore
    //   333: dup
    //   334: iconst_2
    //   335: sipush #-29059
    //   338: sipush #12927
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_3
    //   347: sipush #-29112
    //   350: sipush #-22726
    //   353: invokestatic a : (II)Ljava/lang/String;
    //   356: aastore
    //   357: dup
    //   358: iconst_4
    //   359: sipush #-29029
    //   362: sipush #-28087
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: aastore
    //   369: dup
    //   370: iconst_5
    //   371: sipush #-29103
    //   374: sipush #-30592
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aastore
    //   381: dup
    //   382: bipush #6
    //   384: sipush #-29023
    //   387: sipush #-19256
    //   390: invokestatic a : (II)Ljava/lang/String;
    //   393: aastore
    //   394: dup
    //   395: bipush #7
    //   397: sipush #-29152
    //   400: sipush #23866
    //   403: invokestatic a : (II)Ljava/lang/String;
    //   406: aastore
    //   407: dup
    //   408: bipush #8
    //   410: sipush #-28986
    //   413: sipush #13914
    //   416: invokestatic a : (II)Ljava/lang/String;
    //   419: aastore
    //   420: dup
    //   421: bipush #9
    //   423: sipush #-28968
    //   426: sipush #-2799
    //   429: invokestatic a : (II)Ljava/lang/String;
    //   432: aastore
    //   433: dup
    //   434: bipush #10
    //   436: sipush #-29048
    //   439: sipush #27878
    //   442: invokestatic a : (II)Ljava/lang/String;
    //   445: aastore
    //   446: dup
    //   447: bipush #11
    //   449: sipush #-29017
    //   452: sipush #-9946
    //   455: invokestatic a : (II)Ljava/lang/String;
    //   458: aastore
    //   459: dup
    //   460: bipush #12
    //   462: sipush #-29014
    //   465: sipush #-9809
    //   468: invokestatic a : (II)Ljava/lang/String;
    //   471: aastore
    //   472: dup
    //   473: bipush #13
    //   475: sipush #-28959
    //   478: sipush #-21097
    //   481: invokestatic a : (II)Ljava/lang/String;
    //   484: aastore
    //   485: dup
    //   486: bipush #14
    //   488: sipush #-29150
    //   491: sipush #-2998
    //   494: invokestatic a : (II)Ljava/lang/String;
    //   497: aastore
    //   498: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   501: invokespecial <init> : (Ljava/util/Collection;)V
    //   504: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.ROOT_KEYS : Ljava/util/Set;
    //   507: new java/util/LinkedHashSet
    //   510: dup
    //   511: iconst_2
    //   512: anewarray java/lang/String
    //   515: dup
    //   516: iconst_0
    //   517: sipush #-29094
    //   520: sipush #23166
    //   523: invokestatic a : (II)Ljava/lang/String;
    //   526: aastore
    //   527: dup
    //   528: iconst_1
    //   529: sipush #-28983
    //   532: sipush #-22175
    //   535: invokestatic a : (II)Ljava/lang/String;
    //   538: aastore
    //   539: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   542: invokespecial <init> : (Ljava/util/Collection;)V
    //   545: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.EXTERNAL_DOCS_KEYS : Ljava/util/Set;
    //   548: new java/util/LinkedHashSet
    //   551: dup
    //   552: bipush #30
    //   554: anewarray java/lang/String
    //   557: dup
    //   558: iconst_0
    //   559: sipush #-29116
    //   562: bipush #33
    //   564: invokestatic a : (II)Ljava/lang/String;
    //   567: aastore
    //   568: dup
    //   569: iconst_1
    //   570: sipush #-29097
    //   573: sipush #22627
    //   576: invokestatic a : (II)Ljava/lang/String;
    //   579: aastore
    //   580: dup
    //   581: iconst_2
    //   582: sipush #-28971
    //   585: sipush #19067
    //   588: invokestatic a : (II)Ljava/lang/String;
    //   591: aastore
    //   592: dup
    //   593: iconst_3
    //   594: sipush #-29066
    //   597: sipush #-18193
    //   600: invokestatic a : (II)Ljava/lang/String;
    //   603: aastore
    //   604: dup
    //   605: iconst_4
    //   606: sipush #-29041
    //   609: sipush #14660
    //   612: invokestatic a : (II)Ljava/lang/String;
    //   615: aastore
    //   616: dup
    //   617: iconst_5
    //   618: sipush #-29094
    //   621: sipush #23166
    //   624: invokestatic a : (II)Ljava/lang/String;
    //   627: aastore
    //   628: dup
    //   629: bipush #6
    //   631: sipush #-28932
    //   634: sipush #-10988
    //   637: invokestatic a : (II)Ljava/lang/String;
    //   640: aastore
    //   641: dup
    //   642: bipush #7
    //   644: sipush #-29015
    //   647: sipush #-12485
    //   650: invokestatic a : (II)Ljava/lang/String;
    //   653: aastore
    //   654: dup
    //   655: bipush #8
    //   657: sipush #-29064
    //   660: sipush #31731
    //   663: invokestatic a : (II)Ljava/lang/String;
    //   666: aastore
    //   667: dup
    //   668: bipush #9
    //   670: sipush #-29069
    //   673: sipush #16292
    //   676: invokestatic a : (II)Ljava/lang/String;
    //   679: aastore
    //   680: dup
    //   681: bipush #10
    //   683: sipush #-29033
    //   686: sipush #15352
    //   689: invokestatic a : (II)Ljava/lang/String;
    //   692: aastore
    //   693: dup
    //   694: bipush #11
    //   696: sipush #-29099
    //   699: sipush #-4649
    //   702: invokestatic a : (II)Ljava/lang/String;
    //   705: aastore
    //   706: dup
    //   707: bipush #12
    //   709: sipush #-28961
    //   712: sipush #-10878
    //   715: invokestatic a : (II)Ljava/lang/String;
    //   718: aastore
    //   719: dup
    //   720: bipush #13
    //   722: sipush #-29054
    //   725: sipush #-21018
    //   728: invokestatic a : (II)Ljava/lang/String;
    //   731: aastore
    //   732: dup
    //   733: bipush #14
    //   735: sipush #-29083
    //   738: sipush #-24709
    //   741: invokestatic a : (II)Ljava/lang/String;
    //   744: aastore
    //   745: dup
    //   746: bipush #15
    //   748: sipush #-28994
    //   751: sipush #-27336
    //   754: invokestatic a : (II)Ljava/lang/String;
    //   757: aastore
    //   758: dup
    //   759: bipush #16
    //   761: sipush #-28993
    //   764: sipush #-30228
    //   767: invokestatic a : (II)Ljava/lang/String;
    //   770: aastore
    //   771: dup
    //   772: bipush #17
    //   774: sipush #-29057
    //   777: sipush #21805
    //   780: invokestatic a : (II)Ljava/lang/String;
    //   783: aastore
    //   784: dup
    //   785: bipush #18
    //   787: sipush #-28965
    //   790: sipush #9654
    //   793: invokestatic a : (II)Ljava/lang/String;
    //   796: aastore
    //   797: dup
    //   798: bipush #19
    //   800: sipush #-29046
    //   803: sipush #13191
    //   806: invokestatic a : (II)Ljava/lang/String;
    //   809: aastore
    //   810: dup
    //   811: bipush #20
    //   813: sipush #-28995
    //   816: sipush #-24018
    //   819: invokestatic a : (II)Ljava/lang/String;
    //   822: aastore
    //   823: dup
    //   824: bipush #21
    //   826: sipush #-28998
    //   829: sipush #32674
    //   832: invokestatic a : (II)Ljava/lang/String;
    //   835: aastore
    //   836: dup
    //   837: bipush #22
    //   839: sipush #-29008
    //   842: sipush #-24795
    //   845: invokestatic a : (II)Ljava/lang/String;
    //   848: aastore
    //   849: dup
    //   850: bipush #23
    //   852: sipush #-29004
    //   855: sipush #2368
    //   858: invokestatic a : (II)Ljava/lang/String;
    //   861: aastore
    //   862: dup
    //   863: bipush #24
    //   865: sipush #-29108
    //   868: sipush #29186
    //   871: invokestatic a : (II)Ljava/lang/String;
    //   874: aastore
    //   875: dup
    //   876: bipush #25
    //   878: sipush #-28960
    //   881: sipush #7891
    //   884: invokestatic a : (II)Ljava/lang/String;
    //   887: aastore
    //   888: dup
    //   889: bipush #26
    //   891: sipush #-29110
    //   894: sipush #-11408
    //   897: invokestatic a : (II)Ljava/lang/String;
    //   900: aastore
    //   901: dup
    //   902: bipush #27
    //   904: sipush #-29067
    //   907: sipush #-18233
    //   910: invokestatic a : (II)Ljava/lang/String;
    //   913: aastore
    //   914: dup
    //   915: bipush #28
    //   917: sipush #-29075
    //   920: sipush #-20712
    //   923: invokestatic a : (II)Ljava/lang/String;
    //   926: aastore
    //   927: dup
    //   928: bipush #29
    //   930: sipush #-28999
    //   933: sipush #5121
    //   936: invokestatic a : (II)Ljava/lang/String;
    //   939: aastore
    //   940: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   943: invokespecial <init> : (Ljava/util/Collection;)V
    //   946: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.SCHEMA_KEYS : Ljava/util/Set;
    //   949: new java/util/LinkedHashSet
    //   952: dup
    //   953: bipush #6
    //   955: anewarray java/lang/String
    //   958: dup
    //   959: iconst_0
    //   960: sipush #-29041
    //   963: sipush #14660
    //   966: invokestatic a : (II)Ljava/lang/String;
    //   969: aastore
    //   970: dup
    //   971: iconst_1
    //   972: sipush #-29094
    //   975: sipush #23166
    //   978: invokestatic a : (II)Ljava/lang/String;
    //   981: aastore
    //   982: dup
    //   983: iconst_2
    //   984: sipush #-28974
    //   987: sipush #31784
    //   990: invokestatic a : (II)Ljava/lang/String;
    //   993: aastore
    //   994: dup
    //   995: iconst_3
    //   996: sipush #-29088
    //   999: sipush #14582
    //   1002: invokestatic a : (II)Ljava/lang/String;
    //   1005: aastore
    //   1006: dup
    //   1007: iconst_4
    //   1008: sipush #-29037
    //   1011: sipush #18118
    //   1014: invokestatic a : (II)Ljava/lang/String;
    //   1017: aastore
    //   1018: dup
    //   1019: iconst_5
    //   1020: sipush #-28987
    //   1023: sipush #-10928
    //   1026: invokestatic a : (II)Ljava/lang/String;
    //   1029: aastore
    //   1030: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1033: invokespecial <init> : (Ljava/util/Collection;)V
    //   1036: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.INFO_KEYS : Ljava/util/Set;
    //   1039: new java/util/LinkedHashSet
    //   1042: dup
    //   1043: iconst_3
    //   1044: anewarray java/lang/String
    //   1047: dup
    //   1048: iconst_0
    //   1049: sipush #-29094
    //   1052: sipush #23166
    //   1055: invokestatic a : (II)Ljava/lang/String;
    //   1058: aastore
    //   1059: dup
    //   1060: iconst_1
    //   1061: sipush #-29120
    //   1064: sipush #26131
    //   1067: invokestatic a : (II)Ljava/lang/String;
    //   1070: aastore
    //   1071: dup
    //   1072: iconst_2
    //   1073: sipush #-29150
    //   1076: sipush #-2998
    //   1079: invokestatic a : (II)Ljava/lang/String;
    //   1082: aastore
    //   1083: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1086: invokespecial <init> : (Ljava/util/Collection;)V
    //   1089: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.TAG_KEYS : Ljava/util/Set;
    //   1092: new java/util/LinkedHashSet
    //   1095: dup
    //   1096: iconst_4
    //   1097: anewarray java/lang/String
    //   1100: dup
    //   1101: iconst_0
    //   1102: sipush #-29094
    //   1105: sipush #23166
    //   1108: invokestatic a : (II)Ljava/lang/String;
    //   1111: aastore
    //   1112: dup
    //   1113: iconst_1
    //   1114: sipush #-29115
    //   1117: sipush #-25871
    //   1120: invokestatic a : (II)Ljava/lang/String;
    //   1123: aastore
    //   1124: dup
    //   1125: iconst_2
    //   1126: sipush #-28997
    //   1129: sipush #4513
    //   1132: invokestatic a : (II)Ljava/lang/String;
    //   1135: aastore
    //   1136: dup
    //   1137: iconst_3
    //   1138: sipush #-28933
    //   1141: sipush #30385
    //   1144: invokestatic a : (II)Ljava/lang/String;
    //   1147: aastore
    //   1148: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1151: invokespecial <init> : (Ljava/util/Collection;)V
    //   1154: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.RESPONSE_KEYS : Ljava/util/Set;
    //   1157: new java/util/LinkedHashSet
    //   1160: dup
    //   1161: iconst_3
    //   1162: anewarray java/lang/String
    //   1165: dup
    //   1166: iconst_0
    //   1167: sipush #-28955
    //   1170: sipush #-27372
    //   1173: invokestatic a : (II)Ljava/lang/String;
    //   1176: aastore
    //   1177: dup
    //   1178: iconst_1
    //   1179: sipush #-28983
    //   1182: sipush #-22175
    //   1185: invokestatic a : (II)Ljava/lang/String;
    //   1188: aastore
    //   1189: dup
    //   1190: iconst_2
    //   1191: sipush #-29076
    //   1194: sipush #15702
    //   1197: invokestatic a : (II)Ljava/lang/String;
    //   1200: aastore
    //   1201: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1204: invokespecial <init> : (Ljava/util/Collection;)V
    //   1207: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.CONTACT_KEYS : Ljava/util/Set;
    //   1210: new java/util/LinkedHashSet
    //   1213: dup
    //   1214: iconst_2
    //   1215: anewarray java/lang/String
    //   1218: dup
    //   1219: iconst_0
    //   1220: sipush #-28955
    //   1223: sipush #-27372
    //   1226: invokestatic a : (II)Ljava/lang/String;
    //   1229: aastore
    //   1230: dup
    //   1231: iconst_1
    //   1232: sipush #-28983
    //   1235: sipush #-22175
    //   1238: invokestatic a : (II)Ljava/lang/String;
    //   1241: aastore
    //   1242: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1245: invokespecial <init> : (Ljava/util/Collection;)V
    //   1248: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.LICENSE_KEYS : Ljava/util/Set;
    //   1251: new java/util/LinkedHashSet
    //   1254: dup
    //   1255: iconst_1
    //   1256: anewarray java/lang/String
    //   1259: dup
    //   1260: iconst_0
    //   1261: sipush #-28971
    //   1264: sipush #19067
    //   1267: invokestatic a : (II)Ljava/lang/String;
    //   1270: aastore
    //   1271: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1274: invokespecial <init> : (Ljava/util/Collection;)V
    //   1277: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.REF_MODEL_KEYS : Ljava/util/Set;
    //   1280: new java/util/LinkedHashSet
    //   1283: dup
    //   1284: bipush #9
    //   1286: anewarray java/lang/String
    //   1289: dup
    //   1290: iconst_0
    //   1291: sipush #-28971
    //   1294: sipush #19067
    //   1297: invokestatic a : (II)Ljava/lang/String;
    //   1300: aastore
    //   1301: dup
    //   1302: iconst_1
    //   1303: sipush #-28937
    //   1306: sipush #31475
    //   1309: invokestatic a : (II)Ljava/lang/String;
    //   1312: aastore
    //   1313: dup
    //   1314: iconst_2
    //   1315: sipush #-29109
    //   1318: sipush #11840
    //   1321: invokestatic a : (II)Ljava/lang/String;
    //   1324: aastore
    //   1325: dup
    //   1326: iconst_3
    //   1327: sipush #-29140
    //   1330: sipush #13178
    //   1333: invokestatic a : (II)Ljava/lang/String;
    //   1336: aastore
    //   1337: dup
    //   1338: iconst_4
    //   1339: sipush #-29085
    //   1342: sipush #-8973
    //   1345: invokestatic a : (II)Ljava/lang/String;
    //   1348: aastore
    //   1349: dup
    //   1350: iconst_5
    //   1351: sipush #-28989
    //   1354: sipush #-20076
    //   1357: invokestatic a : (II)Ljava/lang/String;
    //   1360: aastore
    //   1361: dup
    //   1362: bipush #6
    //   1364: sipush #-29098
    //   1367: sipush #13607
    //   1370: invokestatic a : (II)Ljava/lang/String;
    //   1373: aastore
    //   1374: dup
    //   1375: bipush #7
    //   1377: sipush #-28969
    //   1380: sipush #-22490
    //   1383: invokestatic a : (II)Ljava/lang/String;
    //   1386: aastore
    //   1387: dup
    //   1388: bipush #8
    //   1390: sipush #-28968
    //   1393: sipush #-2799
    //   1396: invokestatic a : (II)Ljava/lang/String;
    //   1399: aastore
    //   1400: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1403: invokespecial <init> : (Ljava/util/Collection;)V
    //   1406: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.PATH_KEYS : Ljava/util/Set;
    //   1409: new java/util/LinkedHashSet
    //   1412: dup
    //   1413: bipush #13
    //   1415: anewarray java/lang/String
    //   1418: dup
    //   1419: iconst_0
    //   1420: sipush #-28990
    //   1423: sipush #-20228
    //   1426: invokestatic a : (II)Ljava/lang/String;
    //   1429: aastore
    //   1430: dup
    //   1431: iconst_1
    //   1432: sipush #-28959
    //   1435: sipush #-21097
    //   1438: invokestatic a : (II)Ljava/lang/String;
    //   1441: aastore
    //   1442: dup
    //   1443: iconst_2
    //   1444: sipush #-29079
    //   1447: sipush #-17466
    //   1450: invokestatic a : (II)Ljava/lang/String;
    //   1453: aastore
    //   1454: dup
    //   1455: iconst_3
    //   1456: sipush #-29094
    //   1459: sipush #23166
    //   1462: invokestatic a : (II)Ljava/lang/String;
    //   1465: aastore
    //   1466: dup
    //   1467: iconst_4
    //   1468: sipush #-29150
    //   1471: sipush #-2998
    //   1474: invokestatic a : (II)Ljava/lang/String;
    //   1477: aastore
    //   1478: dup
    //   1479: iconst_5
    //   1480: sipush #-29118
    //   1483: sipush #10106
    //   1486: invokestatic a : (II)Ljava/lang/String;
    //   1489: aastore
    //   1490: dup
    //   1491: bipush #6
    //   1493: sipush #-29103
    //   1496: sipush #-30592
    //   1499: invokestatic a : (II)Ljava/lang/String;
    //   1502: aastore
    //   1503: dup
    //   1504: bipush #7
    //   1506: sipush #-29023
    //   1509: sipush #-19256
    //   1512: invokestatic a : (II)Ljava/lang/String;
    //   1515: aastore
    //   1516: dup
    //   1517: bipush #8
    //   1519: sipush #-28968
    //   1522: sipush #-2799
    //   1525: invokestatic a : (II)Ljava/lang/String;
    //   1528: aastore
    //   1529: dup
    //   1530: bipush #9
    //   1532: sipush #-29048
    //   1535: sipush #27878
    //   1538: invokestatic a : (II)Ljava/lang/String;
    //   1541: aastore
    //   1542: dup
    //   1543: bipush #10
    //   1545: sipush #-29029
    //   1548: sipush #-28087
    //   1551: invokestatic a : (II)Ljava/lang/String;
    //   1554: aastore
    //   1555: dup
    //   1556: bipush #11
    //   1558: sipush #-28975
    //   1561: sipush #-18758
    //   1564: invokestatic a : (II)Ljava/lang/String;
    //   1567: aastore
    //   1568: dup
    //   1569: bipush #12
    //   1571: sipush #-29014
    //   1574: sipush #-9809
    //   1577: invokestatic a : (II)Ljava/lang/String;
    //   1580: aastore
    //   1581: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1584: invokespecial <init> : (Ljava/util/Collection;)V
    //   1587: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.OPERATION_KEYS : Ljava/util/Set;
    //   1590: new java/util/LinkedHashSet
    //   1593: dup
    //   1594: bipush #24
    //   1596: anewarray java/lang/String
    //   1599: dup
    //   1600: iconst_0
    //   1601: sipush #-28955
    //   1604: sipush #-27372
    //   1607: invokestatic a : (II)Ljava/lang/String;
    //   1610: aastore
    //   1611: dup
    //   1612: iconst_1
    //   1613: sipush #-29043
    //   1616: sipush #885
    //   1619: invokestatic a : (II)Ljava/lang/String;
    //   1622: aastore
    //   1623: dup
    //   1624: iconst_2
    //   1625: sipush #-29094
    //   1628: sipush #23166
    //   1631: invokestatic a : (II)Ljava/lang/String;
    //   1634: aastore
    //   1635: dup
    //   1636: iconst_3
    //   1637: sipush #-28995
    //   1640: sipush #-24018
    //   1643: invokestatic a : (II)Ljava/lang/String;
    //   1646: aastore
    //   1647: dup
    //   1648: iconst_4
    //   1649: sipush #-29008
    //   1652: sipush #-24795
    //   1655: invokestatic a : (II)Ljava/lang/String;
    //   1658: aastore
    //   1659: dup
    //   1660: iconst_5
    //   1661: sipush #-29066
    //   1664: sipush #-18193
    //   1667: invokestatic a : (II)Ljava/lang/String;
    //   1670: aastore
    //   1671: dup
    //   1672: bipush #6
    //   1674: sipush #-28943
    //   1677: sipush #-19284
    //   1680: invokestatic a : (II)Ljava/lang/String;
    //   1683: aastore
    //   1684: dup
    //   1685: bipush #7
    //   1687: sipush #-29004
    //   1690: sipush #2368
    //   1693: invokestatic a : (II)Ljava/lang/String;
    //   1696: aastore
    //   1697: dup
    //   1698: bipush #8
    //   1700: sipush #-29062
    //   1703: sipush #-16713
    //   1706: invokestatic a : (II)Ljava/lang/String;
    //   1709: aastore
    //   1710: dup
    //   1711: bipush #9
    //   1713: sipush #-28932
    //   1716: sipush #-10988
    //   1719: invokestatic a : (II)Ljava/lang/String;
    //   1722: aastore
    //   1723: dup
    //   1724: bipush #10
    //   1726: sipush #-29064
    //   1729: sipush #31731
    //   1732: invokestatic a : (II)Ljava/lang/String;
    //   1735: aastore
    //   1736: dup
    //   1737: bipush #11
    //   1739: sipush #-29069
    //   1742: sipush #16292
    //   1745: invokestatic a : (II)Ljava/lang/String;
    //   1748: aastore
    //   1749: dup
    //   1750: bipush #12
    //   1752: sipush #-29033
    //   1755: sipush #15352
    //   1758: invokestatic a : (II)Ljava/lang/String;
    //   1761: aastore
    //   1762: dup
    //   1763: bipush #13
    //   1765: sipush #-29099
    //   1768: sipush #-4649
    //   1771: invokestatic a : (II)Ljava/lang/String;
    //   1774: aastore
    //   1775: dup
    //   1776: bipush #14
    //   1778: sipush #-28961
    //   1781: sipush #-10878
    //   1784: invokestatic a : (II)Ljava/lang/String;
    //   1787: aastore
    //   1788: dup
    //   1789: bipush #15
    //   1791: sipush #-29054
    //   1794: sipush #-21018
    //   1797: invokestatic a : (II)Ljava/lang/String;
    //   1800: aastore
    //   1801: dup
    //   1802: bipush #16
    //   1804: sipush #-29083
    //   1807: sipush #-24709
    //   1810: invokestatic a : (II)Ljava/lang/String;
    //   1813: aastore
    //   1814: dup
    //   1815: bipush #17
    //   1817: sipush #-28994
    //   1820: sipush #-27336
    //   1823: invokestatic a : (II)Ljava/lang/String;
    //   1826: aastore
    //   1827: dup
    //   1828: bipush #18
    //   1830: sipush #-28993
    //   1833: sipush #-30228
    //   1836: invokestatic a : (II)Ljava/lang/String;
    //   1839: aastore
    //   1840: dup
    //   1841: bipush #19
    //   1843: sipush #-29057
    //   1846: sipush #21805
    //   1849: invokestatic a : (II)Ljava/lang/String;
    //   1852: aastore
    //   1853: dup
    //   1854: bipush #20
    //   1856: sipush #-28998
    //   1859: sipush #32674
    //   1862: invokestatic a : (II)Ljava/lang/String;
    //   1865: aastore
    //   1866: dup
    //   1867: bipush #21
    //   1869: sipush #-29015
    //   1872: sipush #-12485
    //   1875: invokestatic a : (II)Ljava/lang/String;
    //   1878: aastore
    //   1879: dup
    //   1880: bipush #22
    //   1882: sipush #-29087
    //   1885: sipush #-17784
    //   1888: invokestatic a : (II)Ljava/lang/String;
    //   1891: aastore
    //   1892: dup
    //   1893: bipush #23
    //   1895: sipush #-28943
    //   1898: sipush #-19284
    //   1901: invokestatic a : (II)Ljava/lang/String;
    //   1904: aastore
    //   1905: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1908: invokespecial <init> : (Ljava/util/Collection;)V
    //   1911: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.PARAMETER_KEYS : Ljava/util/Set;
    //   1914: new java/util/LinkedHashSet
    //   1917: dup
    //   1918: iconst_5
    //   1919: anewarray java/lang/String
    //   1922: dup
    //   1923: iconst_0
    //   1924: sipush #-28955
    //   1927: sipush #-27372
    //   1930: invokestatic a : (II)Ljava/lang/String;
    //   1933: aastore
    //   1934: dup
    //   1935: iconst_1
    //   1936: sipush #-29034
    //   1939: sipush #227
    //   1942: invokestatic a : (II)Ljava/lang/String;
    //   1945: aastore
    //   1946: dup
    //   1947: iconst_2
    //   1948: sipush #-29094
    //   1951: sipush #23166
    //   1954: invokestatic a : (II)Ljava/lang/String;
    //   1957: aastore
    //   1958: dup
    //   1959: iconst_3
    //   1960: sipush #-28995
    //   1963: sipush #-24018
    //   1966: invokestatic a : (II)Ljava/lang/String;
    //   1969: aastore
    //   1970: dup
    //   1971: iconst_4
    //   1972: sipush #-28977
    //   1975: sipush #-32496
    //   1978: invokestatic a : (II)Ljava/lang/String;
    //   1981: aastore
    //   1982: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1985: invokespecial <init> : (Ljava/util/Collection;)V
    //   1988: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.BODY_PARAMETER_KEYS : Ljava/util/Set;
    //   1991: new java/util/LinkedHashSet
    //   1994: dup
    //   1995: bipush #8
    //   1997: anewarray java/lang/String
    //   2000: dup
    //   2001: iconst_0
    //   2002: sipush #-29008
    //   2005: sipush #-24795
    //   2008: invokestatic a : (II)Ljava/lang/String;
    //   2011: aastore
    //   2012: dup
    //   2013: iconst_1
    //   2014: sipush #-28955
    //   2017: sipush #-27372
    //   2020: invokestatic a : (II)Ljava/lang/String;
    //   2023: aastore
    //   2024: dup
    //   2025: iconst_2
    //   2026: sipush #-29034
    //   2029: sipush #227
    //   2032: invokestatic a : (II)Ljava/lang/String;
    //   2035: aastore
    //   2036: dup
    //   2037: iconst_3
    //   2038: sipush #-29094
    //   2041: sipush #23166
    //   2044: invokestatic a : (II)Ljava/lang/String;
    //   2047: aastore
    //   2048: dup
    //   2049: iconst_4
    //   2050: sipush #-29071
    //   2053: sipush #5273
    //   2056: invokestatic a : (II)Ljava/lang/String;
    //   2059: aastore
    //   2060: dup
    //   2061: iconst_5
    //   2062: sipush #-29035
    //   2065: sipush #32464
    //   2068: invokestatic a : (II)Ljava/lang/String;
    //   2071: aastore
    //   2072: dup
    //   2073: bipush #6
    //   2075: sipush #-29146
    //   2078: sipush #-17616
    //   2081: invokestatic a : (II)Ljava/lang/String;
    //   2084: aastore
    //   2085: dup
    //   2086: bipush #7
    //   2088: sipush #-29047
    //   2091: sipush #-10088
    //   2094: invokestatic a : (II)Ljava/lang/String;
    //   2097: aastore
    //   2098: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2101: invokespecial <init> : (Ljava/util/Collection;)V
    //   2104: putstatic net/portswigger/swagger/v1/parser/util/SwaggerDeserializer.SECURITY_SCHEME_KEYS : Ljava/util/Set;
    //   2107: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8EE7) & 0xFFFF;
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
      char c = 'þ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\SwaggerDeserializer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */