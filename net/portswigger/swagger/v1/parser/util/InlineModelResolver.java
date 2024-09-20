package net.portswigger.swagger.v1.parser.util;

import java.util.HashMap;
import java.util.Map;
import net.portswigger.swagger.v1.models.ArrayModel;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.Xml;
import net.portswigger.swagger.v1.models.properties.AbstractProperty;
import net.portswigger.swagger.v1.models.properties.ArrayProperty;
import net.portswigger.swagger.v1.models.properties.ComposedProperty;
import net.portswigger.swagger.v1.models.properties.MapProperty;
import net.portswigger.swagger.v1.models.properties.ObjectProperty;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.util.Json;

public class InlineModelResolver {
  private Swagger swagger;
  
  private boolean skipMatches;
  
  Map<String, Model> addedModels = new HashMap<>();
  
  Map<String, String> generatedSignature = new HashMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void flatten(Swagger paramSwagger) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: aload_0
    //   4: aload_1
    //   5: putfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   8: astore_2
    //   9: aload_1
    //   10: invokevirtual getDefinitions : ()Ljava/util/Map;
    //   13: ifnonnull -> 27
    //   16: aload_1
    //   17: new java/util/HashMap
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: invokevirtual setDefinitions : (Ljava/util/Map;)V
    //   27: aload_1
    //   28: invokevirtual getPaths : ()Ljava/util/Map;
    //   31: astore_3
    //   32: aload_1
    //   33: invokevirtual getDefinitions : ()Ljava/util/Map;
    //   36: astore #4
    //   38: aload_3
    //   39: ifnull -> 1254
    //   42: aload_3
    //   43: invokeinterface keySet : ()Ljava/util/Set;
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #5
    //   55: aload #5
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 1254
    //   65: aload #5
    //   67: invokeinterface next : ()Ljava/lang/Object;
    //   72: checkcast java/lang/String
    //   75: astore #6
    //   77: aload_3
    //   78: aload #6
    //   80: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   85: checkcast net/portswigger/swagger/v1/models/Path
    //   88: astore #7
    //   90: aload #7
    //   92: invokevirtual getOperations : ()Ljava/util/List;
    //   95: invokeinterface iterator : ()Ljava/util/Iterator;
    //   100: astore #8
    //   102: aload #8
    //   104: invokeinterface hasNext : ()Z
    //   109: ifeq -> 1250
    //   112: aload #8
    //   114: invokeinterface next : ()Ljava/lang/Object;
    //   119: checkcast net/portswigger/swagger/v1/models/Operation
    //   122: astore #9
    //   124: aload #9
    //   126: invokevirtual getParameters : ()Ljava/util/List;
    //   129: astore #10
    //   131: aload #10
    //   133: ifnull -> 510
    //   136: aload #10
    //   138: invokeinterface iterator : ()Ljava/util/Iterator;
    //   143: astore #11
    //   145: aload #11
    //   147: invokeinterface hasNext : ()Z
    //   152: ifeq -> 510
    //   155: aload #11
    //   157: invokeinterface next : ()Ljava/lang/Object;
    //   162: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   165: astore #12
    //   167: aload #12
    //   169: instanceof net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   172: ifeq -> 506
    //   175: aload #12
    //   177: checkcast net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   180: astore #13
    //   182: aload #13
    //   184: invokevirtual getSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   187: ifnull -> 506
    //   190: aload #13
    //   192: invokevirtual getSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   195: astore #14
    //   197: aload #14
    //   199: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   202: ifeq -> 322
    //   205: aload #14
    //   207: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   210: astore #15
    //   212: aload #15
    //   214: invokevirtual getType : ()Ljava/lang/String;
    //   217: ifnull -> 240
    //   220: sipush #-18171
    //   223: sipush #-10015
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: aload #15
    //   231: invokevirtual getType : ()Ljava/lang/String;
    //   234: invokevirtual equals : (Ljava/lang/Object;)Z
    //   237: ifeq -> 318
    //   240: aload #15
    //   242: invokevirtual getProperties : ()Ljava/util/Map;
    //   245: ifnull -> 318
    //   248: aload #15
    //   250: invokevirtual getProperties : ()Ljava/util/Map;
    //   253: invokeinterface size : ()I
    //   258: ifle -> 318
    //   261: aload_0
    //   262: aload #15
    //   264: invokevirtual getProperties : ()Ljava/util/Map;
    //   267: aload #6
    //   269: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   272: aload_0
    //   273: aload #15
    //   275: invokevirtual getTitle : ()Ljava/lang/String;
    //   278: aload #13
    //   280: invokevirtual getName : ()Ljava/lang/String;
    //   283: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   286: astore #16
    //   288: aload #13
    //   290: new net/portswigger/swagger/v1/models/RefModel
    //   293: dup
    //   294: aload #16
    //   296: invokespecial <init> : (Ljava/lang/String;)V
    //   299: invokevirtual setSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   302: aload_0
    //   303: aload #16
    //   305: aload #14
    //   307: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   310: aload_1
    //   311: aload #16
    //   313: aload #14
    //   315: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   318: aload_2
    //   319: ifnonnull -> 506
    //   322: aload #14
    //   324: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   327: ifeq -> 506
    //   330: aload #14
    //   332: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   335: astore #15
    //   337: aload #15
    //   339: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   342: astore #16
    //   344: aload #16
    //   346: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   349: ifeq -> 506
    //   352: aload #16
    //   354: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   357: astore #17
    //   359: aload #17
    //   361: invokevirtual getProperties : ()Ljava/util/Map;
    //   364: ifnull -> 506
    //   367: aload #17
    //   369: invokevirtual getProperties : ()Ljava/util/Map;
    //   372: invokeinterface size : ()I
    //   377: ifle -> 506
    //   380: aload_0
    //   381: aload #17
    //   383: invokevirtual getProperties : ()Ljava/util/Map;
    //   386: aload #6
    //   388: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   391: aload_0
    //   392: aload #17
    //   394: invokevirtual getTitle : ()Ljava/lang/String;
    //   397: aload #13
    //   399: invokevirtual getName : ()Ljava/lang/String;
    //   402: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   405: astore #18
    //   407: aload_0
    //   408: aload #17
    //   410: aload #18
    //   412: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   415: astore #19
    //   417: aload_0
    //   418: aload #19
    //   420: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   423: astore #20
    //   425: aload #20
    //   427: ifnull -> 462
    //   430: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   433: dup
    //   434: aload #20
    //   436: invokespecial <init> : (Ljava/lang/String;)V
    //   439: astore #21
    //   441: aload #21
    //   443: aload #17
    //   445: invokevirtual getRequired : ()Z
    //   448: invokevirtual setRequired : (Z)V
    //   451: aload #15
    //   453: aload #21
    //   455: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   458: aload_2
    //   459: ifnonnull -> 506
    //   462: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   465: dup
    //   466: aload #18
    //   468: invokespecial <init> : (Ljava/lang/String;)V
    //   471: astore #21
    //   473: aload #21
    //   475: aload #17
    //   477: invokevirtual getRequired : ()Z
    //   480: invokevirtual setRequired : (Z)V
    //   483: aload #15
    //   485: aload #21
    //   487: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   490: aload_0
    //   491: aload #18
    //   493: aload #19
    //   495: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   498: aload_1
    //   499: aload #18
    //   501: aload #19
    //   503: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   506: aload_2
    //   507: ifnonnull -> 145
    //   510: aload #9
    //   512: invokevirtual getResponses : ()Ljava/util/Map;
    //   515: astore #11
    //   517: aload #11
    //   519: ifnull -> 1246
    //   522: aload #11
    //   524: invokeinterface keySet : ()Ljava/util/Set;
    //   529: invokeinterface iterator : ()Ljava/util/Iterator;
    //   534: astore #12
    //   536: aload #12
    //   538: invokeinterface hasNext : ()Z
    //   543: ifeq -> 1246
    //   546: aload #12
    //   548: invokeinterface next : ()Ljava/lang/Object;
    //   553: checkcast java/lang/String
    //   556: astore #13
    //   558: aload #11
    //   560: aload #13
    //   562: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   567: checkcast net/portswigger/swagger/v1/models/Response
    //   570: astore #14
    //   572: aload #14
    //   574: invokevirtual getSchema : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   577: ifnull -> 1242
    //   580: aload #14
    //   582: invokevirtual getSchema : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   585: astore #15
    //   587: aload #15
    //   589: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   592: ifeq -> 776
    //   595: aload #15
    //   597: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   600: astore #16
    //   602: aload #16
    //   604: invokevirtual getProperties : ()Ljava/util/Map;
    //   607: ifnull -> 772
    //   610: aload #16
    //   612: invokevirtual getProperties : ()Ljava/util/Map;
    //   615: invokeinterface size : ()I
    //   620: ifle -> 772
    //   623: aload_0
    //   624: aload #16
    //   626: invokevirtual getTitle : ()Ljava/lang/String;
    //   629: aload #13
    //   631: sipush #-18174
    //   634: sipush #19734
    //   637: invokestatic a : (II)Ljava/lang/String;
    //   640: swap
    //   641: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   646: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   649: astore #17
    //   651: aload_0
    //   652: aload #16
    //   654: aload #17
    //   656: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   659: astore #18
    //   661: aload_0
    //   662: aload #18
    //   664: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   667: astore #19
    //   669: aload #19
    //   671: ifnull -> 717
    //   674: aload_0
    //   675: aload #19
    //   677: aload #15
    //   679: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   682: astore #20
    //   684: aload #20
    //   686: aload #16
    //   688: invokevirtual getRequired : ()Z
    //   691: invokeinterface setRequired : (Z)V
    //   696: aload #14
    //   698: new net/portswigger/swagger/v1/util/PropertyModelConverter
    //   701: dup
    //   702: invokespecial <init> : ()V
    //   705: aload #20
    //   707: invokevirtual propertyToModel : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/Model;
    //   710: invokevirtual setResponseSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   713: aload_2
    //   714: ifnonnull -> 772
    //   717: aload_0
    //   718: aload #17
    //   720: aload #15
    //   722: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   725: astore #20
    //   727: aload #20
    //   729: aload #16
    //   731: invokevirtual getRequired : ()Z
    //   734: invokeinterface setRequired : (Z)V
    //   739: aload #14
    //   741: new net/portswigger/swagger/v1/util/PropertyModelConverter
    //   744: dup
    //   745: invokespecial <init> : ()V
    //   748: aload #20
    //   750: invokevirtual propertyToModel : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/Model;
    //   753: invokevirtual setResponseSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   756: aload_0
    //   757: aload #17
    //   759: aload #18
    //   761: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   764: aload_1
    //   765: aload #17
    //   767: aload #18
    //   769: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   772: aload_2
    //   773: ifnonnull -> 1242
    //   776: aload #15
    //   778: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   781: ifeq -> 1012
    //   784: aload #15
    //   786: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   789: astore #16
    //   791: aload #16
    //   793: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   796: astore #17
    //   798: aload #17
    //   800: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   803: ifeq -> 1008
    //   806: aload #17
    //   808: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   811: astore #18
    //   813: aload #18
    //   815: invokevirtual getProperties : ()Ljava/util/Map;
    //   818: ifnull -> 1008
    //   821: aload #18
    //   823: invokevirtual getProperties : ()Ljava/util/Map;
    //   826: invokeinterface size : ()I
    //   831: ifle -> 1008
    //   834: aload_0
    //   835: aload #18
    //   837: invokevirtual getProperties : ()Ljava/util/Map;
    //   840: aload #6
    //   842: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   845: aload_0
    //   846: aload #18
    //   848: invokevirtual getTitle : ()Ljava/lang/String;
    //   851: aload #13
    //   853: sipush #-18172
    //   856: sipush #18325
    //   859: invokestatic a : (II)Ljava/lang/String;
    //   862: swap
    //   863: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   868: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   871: astore #19
    //   873: aload_0
    //   874: aload #18
    //   876: aload #19
    //   878: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   881: astore #20
    //   883: aload_0
    //   884: aload #20
    //   886: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   889: astore #21
    //   891: aload #21
    //   893: ifnull -> 946
    //   896: aload_0
    //   897: aload #21
    //   899: aload #18
    //   901: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   904: astore #22
    //   906: aload #22
    //   908: aload #18
    //   910: invokevirtual getRequired : ()Z
    //   913: invokeinterface setRequired : (Z)V
    //   918: aload #16
    //   920: aload #22
    //   922: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   925: aload #14
    //   927: new net/portswigger/swagger/v1/util/PropertyModelConverter
    //   930: dup
    //   931: invokespecial <init> : ()V
    //   934: aload #16
    //   936: invokevirtual propertyToModel : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/Model;
    //   939: invokevirtual setResponseSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   942: aload_2
    //   943: ifnonnull -> 1008
    //   946: aload_0
    //   947: aload #19
    //   949: aload #18
    //   951: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/properties/Property;
    //   954: astore #22
    //   956: aload #22
    //   958: aload #18
    //   960: invokevirtual getRequired : ()Z
    //   963: invokeinterface setRequired : (Z)V
    //   968: aload #16
    //   970: aload #22
    //   972: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   975: aload #14
    //   977: new net/portswigger/swagger/v1/util/PropertyModelConverter
    //   980: dup
    //   981: invokespecial <init> : ()V
    //   984: aload #16
    //   986: invokevirtual propertyToModel : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/Model;
    //   989: invokevirtual setResponseSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   992: aload_0
    //   993: aload #19
    //   995: aload #20
    //   997: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   1000: aload_1
    //   1001: aload #19
    //   1003: aload #20
    //   1005: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   1008: aload_2
    //   1009: ifnonnull -> 1242
    //   1012: aload #15
    //   1014: instanceof net/portswigger/swagger/v1/models/properties/MapProperty
    //   1017: ifeq -> 1242
    //   1020: aload #15
    //   1022: checkcast net/portswigger/swagger/v1/models/properties/MapProperty
    //   1025: astore #16
    //   1027: aload #16
    //   1029: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   1032: astore #17
    //   1034: aload #17
    //   1036: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   1039: ifeq -> 1242
    //   1042: aload #17
    //   1044: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   1047: astore #18
    //   1049: aload #18
    //   1051: invokevirtual getProperties : ()Ljava/util/Map;
    //   1054: ifnull -> 1242
    //   1057: aload #18
    //   1059: invokevirtual getProperties : ()Ljava/util/Map;
    //   1062: invokeinterface size : ()I
    //   1067: ifle -> 1242
    //   1070: aload_0
    //   1071: aload #18
    //   1073: invokevirtual getProperties : ()Ljava/util/Map;
    //   1076: aload #6
    //   1078: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   1081: aload_0
    //   1082: aload #18
    //   1084: invokevirtual getTitle : ()Ljava/lang/String;
    //   1087: aload #13
    //   1089: sipush #-18172
    //   1092: sipush #18325
    //   1095: invokestatic a : (II)Ljava/lang/String;
    //   1098: swap
    //   1099: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1104: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1107: astore #19
    //   1109: aload_0
    //   1110: aload #18
    //   1112: aload #19
    //   1114: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   1117: astore #20
    //   1119: aload_0
    //   1120: aload #20
    //   1122: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   1125: astore #21
    //   1127: aload #21
    //   1129: ifnull -> 1181
    //   1132: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   1135: dup
    //   1136: aload #21
    //   1138: invokespecial <init> : (Ljava/lang/String;)V
    //   1141: astore #22
    //   1143: aload #22
    //   1145: aload #18
    //   1147: invokevirtual getRequired : ()Z
    //   1150: invokevirtual setRequired : (Z)V
    //   1153: aload #16
    //   1155: aload #22
    //   1157: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   1160: aload #14
    //   1162: new net/portswigger/swagger/v1/util/PropertyModelConverter
    //   1165: dup
    //   1166: invokespecial <init> : ()V
    //   1169: aload #16
    //   1171: invokevirtual propertyToModel : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/Model;
    //   1174: invokevirtual setResponseSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   1177: aload_2
    //   1178: ifnonnull -> 1242
    //   1181: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   1184: dup
    //   1185: aload #19
    //   1187: invokespecial <init> : (Ljava/lang/String;)V
    //   1190: astore #22
    //   1192: aload #22
    //   1194: aload #18
    //   1196: invokevirtual getRequired : ()Z
    //   1199: invokevirtual setRequired : (Z)V
    //   1202: aload #16
    //   1204: aload #22
    //   1206: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   1209: aload #14
    //   1211: new net/portswigger/swagger/v1/util/PropertyModelConverter
    //   1214: dup
    //   1215: invokespecial <init> : ()V
    //   1218: aload #16
    //   1220: invokevirtual propertyToModel : (Lnet/portswigger/swagger/v1/models/properties/Property;)Lnet/portswigger/swagger/v1/models/Model;
    //   1223: invokevirtual setResponseSchema : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   1226: aload_0
    //   1227: aload #19
    //   1229: aload #20
    //   1231: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   1234: aload_1
    //   1235: aload #19
    //   1237: aload #20
    //   1239: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   1242: aload_2
    //   1243: ifnonnull -> 536
    //   1246: aload_2
    //   1247: ifnonnull -> 102
    //   1250: aload_2
    //   1251: ifnonnull -> 55
    //   1254: aload #4
    //   1256: ifnull -> 1595
    //   1259: new java/util/ArrayList
    //   1262: dup
    //   1263: aload #4
    //   1265: invokeinterface keySet : ()Ljava/util/Set;
    //   1270: invokespecial <init> : (Ljava/util/Collection;)V
    //   1273: astore #5
    //   1275: aload #5
    //   1277: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1282: astore #6
    //   1284: aload #6
    //   1286: invokeinterface hasNext : ()Z
    //   1291: ifeq -> 1595
    //   1294: aload #6
    //   1296: invokeinterface next : ()Ljava/lang/Object;
    //   1301: checkcast java/lang/String
    //   1304: astore #7
    //   1306: aload #4
    //   1308: aload #7
    //   1310: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1315: checkcast net/portswigger/swagger/v1/models/Model
    //   1318: astore #8
    //   1320: aload #8
    //   1322: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   1325: ifeq -> 1360
    //   1328: aload #8
    //   1330: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   1333: astore #9
    //   1335: aload #9
    //   1337: invokevirtual getProperties : ()Ljava/util/Map;
    //   1340: astore #10
    //   1342: aload_0
    //   1343: aload #10
    //   1345: aload #7
    //   1347: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   1350: aload_0
    //   1351: aload #9
    //   1353: invokevirtual fixStringModel : (Lnet/portswigger/swagger/v1/models/ModelImpl;)V
    //   1356: aload_2
    //   1357: ifnonnull -> 1591
    //   1360: aload #8
    //   1362: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   1365: ifeq -> 1548
    //   1368: aload #8
    //   1370: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   1373: astore #9
    //   1375: aload #9
    //   1377: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   1380: astore #10
    //   1382: aload #10
    //   1384: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   1387: ifeq -> 1544
    //   1390: aload #10
    //   1392: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   1395: astore #11
    //   1397: aload #11
    //   1399: invokevirtual getProperties : ()Ljava/util/Map;
    //   1402: ifnull -> 1544
    //   1405: aload #11
    //   1407: invokevirtual getProperties : ()Ljava/util/Map;
    //   1410: invokeinterface size : ()I
    //   1415: ifle -> 1544
    //   1418: aload_0
    //   1419: aload #11
    //   1421: invokevirtual getTitle : ()Ljava/lang/String;
    //   1424: aload #7
    //   1426: sipush #-18169
    //   1429: sipush #-4825
    //   1432: invokestatic a : (II)Ljava/lang/String;
    //   1435: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1440: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1443: astore #12
    //   1445: aload_0
    //   1446: aload #11
    //   1448: aload #12
    //   1450: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   1453: astore #13
    //   1455: aload_0
    //   1456: aload #13
    //   1458: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   1461: astore #14
    //   1463: aload #14
    //   1465: ifnonnull -> 1516
    //   1468: aload_1
    //   1469: aload #12
    //   1471: aload #13
    //   1473: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   1476: aload_0
    //   1477: aload #12
    //   1479: aload #13
    //   1481: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   1484: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   1487: dup
    //   1488: aload #12
    //   1490: invokespecial <init> : (Ljava/lang/String;)V
    //   1493: astore #15
    //   1495: aload #15
    //   1497: aload #11
    //   1499: invokevirtual getRequired : ()Z
    //   1502: invokevirtual setRequired : (Z)V
    //   1505: aload #9
    //   1507: aload #15
    //   1509: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   1512: aload_2
    //   1513: ifnonnull -> 1544
    //   1516: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   1519: dup
    //   1520: aload #14
    //   1522: invokespecial <init> : (Ljava/lang/String;)V
    //   1525: astore #15
    //   1527: aload #15
    //   1529: aload #11
    //   1531: invokevirtual getRequired : ()Z
    //   1534: invokevirtual setRequired : (Z)V
    //   1537: aload #9
    //   1539: aload #15
    //   1541: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   1544: aload_2
    //   1545: ifnonnull -> 1591
    //   1548: aload #8
    //   1550: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   1553: ifeq -> 1591
    //   1556: aload #8
    //   1558: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   1561: astore #9
    //   1563: aload #9
    //   1565: invokevirtual getChild : ()Lnet/portswigger/swagger/v1/models/Model;
    //   1568: ifnull -> 1591
    //   1571: aload #9
    //   1573: invokevirtual getChild : ()Lnet/portswigger/swagger/v1/models/Model;
    //   1576: invokeinterface getProperties : ()Ljava/util/Map;
    //   1581: astore #10
    //   1583: aload_0
    //   1584: aload #10
    //   1586: aload #7
    //   1588: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   1591: aload_2
    //   1592: ifnonnull -> 1284
    //   1595: return
  }
  
  private void fixStringModel(ModelImpl paramModelImpl) {
    if (paramModelImpl.getType() != null && paramModelImpl.getType().equals(a(-18170, 26513)) && paramModelImpl.getExample() != null) {
      String str = paramModelImpl.getExample().toString();
      if (!str.isEmpty() && str.substring(0, 1).equals("\"") && str.substring(str.length() - 1).equals("\""))
        paramModelImpl.setExample(str.substring(1, str.length() - 1)); 
    } 
  }
  
  private String resolveModelName(String paramString1, String paramString2) {
    return (paramString1 == null) ? uniqueName(paramString2) : uniqueName(paramString1);
  }
  
  public String matchGenerated(Model paramModel) {
    if (this.skipMatches)
      return null; 
    String str = Json.pretty(paramModel);
    return this.generatedSignature.containsKey(str) ? this.generatedSignature.get(str) : null;
  }
  
  public void addGenerated(String paramString, Model paramModel) {
    this.generatedSignature.put(Json.pretty(paramModel), paramString);
  }
  
  public String uniqueName(String paramString) {
    byte b = 0;
    int[] arrayOfInt = RemoteUrl.ZS();
    boolean bool = false;
    paramString = paramString.replaceAll(a(-18173, 21358), "");
    while (!bool) {
      String str = paramString;
      if (b)
        str = paramString + "_" + paramString; 
      if (this.swagger.getDefinitions() == null)
        return str; 
      if (!this.swagger.getDefinitions().containsKey(str))
        return str; 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return paramString;
  }
  
  public void flattenProperties(Map<String, Property> paramMap, String paramString) {
    // Byte code:
    //   0: invokestatic ZS : ()[I
    //   3: astore_3
    //   4: aload_1
    //   5: ifnonnull -> 9
    //   8: return
    //   9: new java/util/HashMap
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #4
    //   18: new java/util/HashMap
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore #5
    //   27: aload_1
    //   28: invokeinterface keySet : ()Ljava/util/Set;
    //   33: invokeinterface iterator : ()Ljava/util/Iterator;
    //   38: astore #6
    //   40: aload #6
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 800
    //   50: aload #6
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: checkcast java/lang/String
    //   60: astore #7
    //   62: aload_1
    //   63: aload #7
    //   65: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   73: astore #8
    //   75: aload #8
    //   77: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   80: ifeq -> 264
    //   83: aload #8
    //   85: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   88: invokevirtual getProperties : ()Ljava/util/Map;
    //   91: ifnull -> 264
    //   94: aload #8
    //   96: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   99: invokevirtual getProperties : ()Ljava/util/Map;
    //   102: invokeinterface size : ()I
    //   107: ifle -> 264
    //   110: aload #8
    //   112: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   115: astore #9
    //   117: aload_0
    //   118: aload #9
    //   120: invokevirtual getTitle : ()Ljava/lang/String;
    //   123: aload_2
    //   124: aload #7
    //   126: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   134: astore #10
    //   136: aload_0
    //   137: aload #9
    //   139: aload #10
    //   141: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   144: astore #11
    //   146: aload_0
    //   147: aload #11
    //   149: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   152: astore #12
    //   154: aload #12
    //   156: ifnull -> 196
    //   159: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   162: dup
    //   163: aload #12
    //   165: invokespecial <init> : (Ljava/lang/String;)V
    //   168: astore #13
    //   170: aload #13
    //   172: aload #9
    //   174: invokevirtual getRequired : ()Z
    //   177: invokevirtual setRequired : (Z)V
    //   180: aload #4
    //   182: aload #7
    //   184: aload #13
    //   186: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   191: pop
    //   192: aload_3
    //   193: ifnonnull -> 260
    //   196: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   199: dup
    //   200: aload #10
    //   202: invokespecial <init> : (Ljava/lang/String;)V
    //   205: astore #13
    //   207: aload #13
    //   209: aload #9
    //   211: invokevirtual getRequired : ()Z
    //   214: invokevirtual setRequired : (Z)V
    //   217: aload #4
    //   219: aload #7
    //   221: aload #13
    //   223: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   228: pop
    //   229: aload #5
    //   231: aload #10
    //   233: aload #11
    //   235: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   240: pop
    //   241: aload_0
    //   242: aload #10
    //   244: aload #11
    //   246: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   249: aload_0
    //   250: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   253: aload #10
    //   255: aload #11
    //   257: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   260: aload_3
    //   261: ifnonnull -> 796
    //   264: aload #8
    //   266: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   269: ifeq -> 457
    //   272: aload #8
    //   274: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   277: astore #9
    //   279: aload #9
    //   281: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   284: astore #10
    //   286: aload #10
    //   288: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   291: ifeq -> 453
    //   294: aload #10
    //   296: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   299: astore #11
    //   301: aload #11
    //   303: invokevirtual getProperties : ()Ljava/util/Map;
    //   306: ifnull -> 453
    //   309: aload #11
    //   311: invokevirtual getProperties : ()Ljava/util/Map;
    //   314: invokeinterface size : ()I
    //   319: ifle -> 453
    //   322: aload_0
    //   323: aload #11
    //   325: invokevirtual getProperties : ()Ljava/util/Map;
    //   328: aload_2
    //   329: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   332: aload_0
    //   333: aload #11
    //   335: invokevirtual getTitle : ()Ljava/lang/String;
    //   338: aload_2
    //   339: aload #7
    //   341: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   346: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   349: astore #12
    //   351: aload_0
    //   352: aload #11
    //   354: aload #12
    //   356: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   359: astore #13
    //   361: aload_0
    //   362: aload #13
    //   364: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   367: astore #14
    //   369: aload #14
    //   371: ifnull -> 406
    //   374: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   377: dup
    //   378: aload #14
    //   380: invokespecial <init> : (Ljava/lang/String;)V
    //   383: astore #15
    //   385: aload #15
    //   387: aload #11
    //   389: invokevirtual getRequired : ()Z
    //   392: invokevirtual setRequired : (Z)V
    //   395: aload #9
    //   397: aload #15
    //   399: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   402: aload_3
    //   403: ifnonnull -> 453
    //   406: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   409: dup
    //   410: aload #12
    //   412: invokespecial <init> : (Ljava/lang/String;)V
    //   415: astore #15
    //   417: aload #15
    //   419: aload #11
    //   421: invokevirtual getRequired : ()Z
    //   424: invokevirtual setRequired : (Z)V
    //   427: aload #9
    //   429: aload #15
    //   431: invokevirtual setItems : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   434: aload_0
    //   435: aload #12
    //   437: aload #13
    //   439: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   442: aload_0
    //   443: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   446: aload #12
    //   448: aload #13
    //   450: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   453: aload_3
    //   454: ifnonnull -> 796
    //   457: aload #8
    //   459: instanceof net/portswigger/swagger/v1/models/properties/MapProperty
    //   462: ifeq -> 650
    //   465: aload #8
    //   467: checkcast net/portswigger/swagger/v1/models/properties/MapProperty
    //   470: astore #9
    //   472: aload #9
    //   474: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   477: astore #10
    //   479: aload #10
    //   481: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   484: ifeq -> 646
    //   487: aload #10
    //   489: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   492: astore #11
    //   494: aload #11
    //   496: invokevirtual getProperties : ()Ljava/util/Map;
    //   499: ifnull -> 646
    //   502: aload #11
    //   504: invokevirtual getProperties : ()Ljava/util/Map;
    //   507: invokeinterface size : ()I
    //   512: ifle -> 646
    //   515: aload_0
    //   516: aload #11
    //   518: invokevirtual getProperties : ()Ljava/util/Map;
    //   521: aload_2
    //   522: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   525: aload_0
    //   526: aload #11
    //   528: invokevirtual getTitle : ()Ljava/lang/String;
    //   531: aload_2
    //   532: aload #7
    //   534: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   539: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   542: astore #12
    //   544: aload_0
    //   545: aload #11
    //   547: aload #12
    //   549: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   552: astore #13
    //   554: aload_0
    //   555: aload #13
    //   557: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   560: astore #14
    //   562: aload #14
    //   564: ifnull -> 599
    //   567: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   570: dup
    //   571: aload #14
    //   573: invokespecial <init> : (Ljava/lang/String;)V
    //   576: astore #15
    //   578: aload #15
    //   580: aload #11
    //   582: invokevirtual getRequired : ()Z
    //   585: invokevirtual setRequired : (Z)V
    //   588: aload #9
    //   590: aload #15
    //   592: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   595: aload_3
    //   596: ifnonnull -> 646
    //   599: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   602: dup
    //   603: aload #12
    //   605: invokespecial <init> : (Ljava/lang/String;)V
    //   608: astore #15
    //   610: aload #15
    //   612: aload #11
    //   614: invokevirtual getRequired : ()Z
    //   617: invokevirtual setRequired : (Z)V
    //   620: aload #9
    //   622: aload #15
    //   624: invokevirtual setAdditionalProperties : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   627: aload_0
    //   628: aload #12
    //   630: aload #13
    //   632: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   635: aload_0
    //   636: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   639: aload #12
    //   641: aload #13
    //   643: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   646: aload_3
    //   647: ifnonnull -> 796
    //   650: aload #8
    //   652: instanceof net/portswigger/swagger/v1/models/properties/ComposedProperty
    //   655: ifeq -> 796
    //   658: aload #8
    //   660: checkcast net/portswigger/swagger/v1/models/properties/ComposedProperty
    //   663: astore #9
    //   665: aload_0
    //   666: aload #9
    //   668: invokevirtual getTitle : ()Ljava/lang/String;
    //   671: aload_2
    //   672: aload #7
    //   674: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   679: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   682: astore #10
    //   684: aload_0
    //   685: aload #9
    //   687: aload #10
    //   689: invokevirtual modelFromProperty : (Lnet/portswigger/swagger/v1/models/properties/ComposedProperty;Ljava/lang/String;)Lnet/portswigger/swagger/v1/models/Model;
    //   692: astore #11
    //   694: aload_0
    //   695: aload #11
    //   697: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v1/models/Model;)Ljava/lang/String;
    //   700: astore #12
    //   702: aload #12
    //   704: ifnull -> 744
    //   707: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   710: dup
    //   711: aload #12
    //   713: invokespecial <init> : (Ljava/lang/String;)V
    //   716: astore #13
    //   718: aload #13
    //   720: aload #9
    //   722: invokevirtual getRequired : ()Z
    //   725: invokevirtual setRequired : (Z)V
    //   728: aload #4
    //   730: aload #7
    //   732: aload #13
    //   734: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   739: pop
    //   740: aload_3
    //   741: ifnonnull -> 796
    //   744: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   747: dup
    //   748: aload #10
    //   750: invokespecial <init> : (Ljava/lang/String;)V
    //   753: astore #13
    //   755: aload #13
    //   757: aload #9
    //   759: invokevirtual getRequired : ()Z
    //   762: invokevirtual setRequired : (Z)V
    //   765: aload #4
    //   767: aload #7
    //   769: aload #13
    //   771: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   776: pop
    //   777: aload_0
    //   778: aload #10
    //   780: aload #11
    //   782: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   785: aload_0
    //   786: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   789: aload #10
    //   791: aload #11
    //   793: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   796: aload_3
    //   797: ifnonnull -> 40
    //   800: aload #4
    //   802: invokeinterface size : ()I
    //   807: ifle -> 871
    //   810: aload #4
    //   812: invokeinterface keySet : ()Ljava/util/Set;
    //   817: invokeinterface iterator : ()Ljava/util/Iterator;
    //   822: astore #6
    //   824: aload #6
    //   826: invokeinterface hasNext : ()Z
    //   831: ifeq -> 871
    //   834: aload #6
    //   836: invokeinterface next : ()Ljava/lang/Object;
    //   841: checkcast java/lang/String
    //   844: astore #7
    //   846: aload_1
    //   847: aload #7
    //   849: aload #4
    //   851: aload #7
    //   853: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   858: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   861: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   866: pop
    //   867: aload_3
    //   868: ifnonnull -> 824
    //   871: aload #5
    //   873: invokeinterface keySet : ()Ljava/util/Set;
    //   878: invokeinterface iterator : ()Ljava/util/Iterator;
    //   883: astore #6
    //   885: aload #6
    //   887: invokeinterface hasNext : ()Z
    //   892: ifeq -> 956
    //   895: aload #6
    //   897: invokeinterface next : ()Ljava/lang/Object;
    //   902: checkcast java/lang/String
    //   905: astore #7
    //   907: aload_0
    //   908: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   911: aload #7
    //   913: aload #5
    //   915: aload #7
    //   917: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   922: checkcast net/portswigger/swagger/v1/models/Model
    //   925: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   928: aload_0
    //   929: getfield addedModels : Ljava/util/Map;
    //   932: aload #7
    //   934: aload #5
    //   936: aload #7
    //   938: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   943: checkcast net/portswigger/swagger/v1/models/Model
    //   946: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   951: pop
    //   952: aload_3
    //   953: ifnonnull -> 885
    //   956: return
  }
  
  public Model modelFromProperty(ArrayProperty paramArrayProperty, String paramString) {
    String str1 = paramArrayProperty.getDescription();
    String str2 = null;
    Object object = paramArrayProperty.getExample();
    int[] arrayOfInt = RemoteUrl.ZS();
    if (object != null)
      str2 = object.toString(); 
    Property property = paramArrayProperty.getItems();
    if (property instanceof ObjectProperty) {
      ArrayModel arrayModel = new ArrayModel();
      arrayModel.setDescription(str1);
      arrayModel.setExample(str2);
      arrayModel.setItems(paramArrayProperty.getItems());
      if (paramArrayProperty.getVendorExtensions() != null)
        for (String str : paramArrayProperty.getVendorExtensions().keySet()) {
          arrayModel.setVendorExtension(str, paramArrayProperty.getVendorExtensions().get(str));
          if (arrayOfInt == null)
            break; 
        }  
      return (Model)arrayModel;
    } 
    return null;
  }
  
  public Model modelFromProperty(ObjectProperty paramObjectProperty, String paramString) {
    String str1 = paramObjectProperty.getDescription();
    int[] arrayOfInt = RemoteUrl.ZS();
    String str2 = null;
    Object object = paramObjectProperty.getExample();
    if (object != null)
      str2 = object.toString(); 
    String str3 = paramObjectProperty.getName();
    Xml xml = paramObjectProperty.getXml();
    Map<String, Property> map = paramObjectProperty.getProperties();
    ModelImpl modelImpl = new ModelImpl();
    modelImpl.type(paramObjectProperty.getType());
    modelImpl.setDescription(str1);
    modelImpl.setExample(str2);
    modelImpl.setName(str3);
    modelImpl.setXml(xml);
    if (paramObjectProperty.getVendorExtensions() != null)
      for (String str : paramObjectProperty.getVendorExtensions().keySet()) {
        modelImpl.setVendorExtension(str, paramObjectProperty.getVendorExtensions().get(str));
        if (arrayOfInt == null)
          break; 
      }  
    if (map != null) {
      flattenProperties(map, paramString);
      modelImpl.setProperties(map);
    } 
    return (Model)modelImpl;
  }
  
  public Model modelFromProperty(ComposedProperty paramComposedProperty, String paramString) {
    String str1 = paramComposedProperty.getDescription();
    String str2 = null;
    int[] arrayOfInt = RemoteUrl.ZS();
    Object object = paramComposedProperty.getExample();
    if (object != null)
      str2 = object.toString(); 
    Xml xml = paramComposedProperty.getXml();
    ModelImpl modelImpl = new ModelImpl();
    modelImpl.type(paramComposedProperty.getType());
    modelImpl.setDescription(str1);
    modelImpl.setExample(str2);
    modelImpl.setName(paramString);
    modelImpl.setXml(xml);
    if (paramComposedProperty.getVendorExtensions() != null)
      for (String str : paramComposedProperty.getVendorExtensions().keySet()) {
        modelImpl.setVendorExtension(str, paramComposedProperty.getVendorExtensions().get(str));
        if (arrayOfInt == null)
          break; 
      }  
    return (Model)modelImpl;
  }
  
  public Model modelFromProperty(MapProperty paramMapProperty, String paramString) {
    String str1 = paramMapProperty.getDescription();
    String str2 = null;
    int[] arrayOfInt = RemoteUrl.ZS();
    Object object = paramMapProperty.getExample();
    if (object != null)
      str2 = object.toString(); 
    ArrayModel arrayModel = new ArrayModel();
    arrayModel.setDescription(str1);
    arrayModel.setExample(str2);
    arrayModel.setItems(paramMapProperty.getAdditionalProperties());
    if (paramMapProperty.getVendorExtensions() != null)
      for (String str : paramMapProperty.getVendorExtensions().keySet()) {
        arrayModel.setVendorExtension(str, paramMapProperty.getVendorExtensions().get(str));
        if (arrayOfInt == null)
          break; 
      }  
    return (Model)arrayModel;
  }
  
  public Property makeRefProperty(String paramString, Property paramProperty) {
    RefProperty refProperty = new RefProperty(paramString);
    copyVendorExtensions(paramProperty, (AbstractProperty)refProperty);
    return (Property)refProperty;
  }
  
  public void copyVendorExtensions(Property paramProperty, AbstractProperty paramAbstractProperty) {
    Map map = paramProperty.getVendorExtensions();
    int[] arrayOfInt = RemoteUrl.ZS();
    for (String str : map.keySet()) {
      paramAbstractProperty.setVendorExtension(str, map.get(str));
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  public boolean isSkipMatches() {
    return this.skipMatches;
  }
  
  public void setSkipMatches(boolean paramBoolean) {
    this.skipMatches = paramBoolean;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'À¬½æÌF"\\r¤Ü9Àªk&÷bü¯ÝnMfÖ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
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
    //   68: ldc '¸\\tÿÏþúÌvëc\\tÓÝÚ<NÑ>¬õû¾Ð|ÜÔ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #16
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #53
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
    //   129: putstatic net/portswigger/swagger/v1/parser/util/InlineModelResolver.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/swagger/v1/parser/util/InlineModelResolver.b : [Ljava/lang/String;
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
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #97
    //   229: goto -> 244
    //   232: bipush #13
    //   234: goto -> 244
    //   237: bipush #105
    //   239: goto -> 244
    //   242: bipush #88
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
    int i = (paramInt1 ^ 0xFFFFB907) & 0xFFFF;
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
      byte b1 = 58;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\InlineModelResolver.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */