package net.portswigger.swagger.v1.parser.processors;

import burp.Zbqc;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import net.portswigger.swagger.v1.models.ArrayModel;
import net.portswigger.swagger.v1.models.ComposedModel;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.properties.MapProperty;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.models.refs.RefType;
import net.portswigger.swagger.v1.parser.ResolverCache;
import net.portswigger.swagger.v1.parser.util.RefUtils;

public final class ExternalRefProcessor {
  private final ResolverCache cache;
  
  private final Swagger swagger;
  
  private static Zbqc[] Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public ExternalRefProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.cache = paramResolverCache;
    this.swagger = paramSwagger;
  }
  
  public String processRefToExternalDefinition(String paramString, RefFormat paramRefFormat) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   7: aload_1
    //   8: invokevirtual getRenamedRef : (Ljava/lang/String;)Ljava/lang/String;
    //   11: astore #4
    //   13: astore_3
    //   14: aload #4
    //   16: ifnull -> 22
    //   19: aload #4
    //   21: areturn
    //   22: aload_0
    //   23: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   26: aload_1
    //   27: aload_2
    //   28: ldc net/portswigger/swagger/v1/models/Model
    //   30: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   33: checkcast net/portswigger/swagger/v1/models/Model
    //   36: astore #5
    //   38: aload #5
    //   40: ifnonnull -> 45
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   49: invokevirtual getDefinitions : ()Ljava/util/Map;
    //   52: astore #7
    //   54: aload #7
    //   56: ifnonnull -> 68
    //   59: new java/util/LinkedHashMap
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: astore #7
    //   68: aload_1
    //   69: invokestatic computeDefinitionName : (Ljava/lang/String;)Ljava/lang/String;
    //   72: astore #8
    //   74: aconst_null
    //   75: astore #9
    //   77: aload #7
    //   79: aload #8
    //   81: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: checkcast net/portswigger/swagger/v1/models/Model
    //   89: astore #10
    //   91: aload #10
    //   93: ifnull -> 191
    //   96: aload #10
    //   98: instanceof net/portswigger/swagger/v1/models/RefModel
    //   101: ifeq -> 110
    //   104: aconst_null
    //   105: astore #10
    //   107: goto -> 191
    //   110: iconst_2
    //   111: istore #11
    //   113: aload #7
    //   115: invokeinterface keySet : ()Ljava/util/Set;
    //   120: invokeinterface iterator : ()Ljava/util/Iterator;
    //   125: astore #12
    //   127: aload #12
    //   129: invokeinterface hasNext : ()Z
    //   134: ifeq -> 191
    //   137: aload #12
    //   139: invokeinterface next : ()Ljava/lang/Object;
    //   144: checkcast java/lang/String
    //   147: astore #13
    //   149: aload #13
    //   151: aload #8
    //   153: invokevirtual equals : (Ljava/lang/Object;)Z
    //   156: ifeq -> 187
    //   159: aload #8
    //   161: iload #11
    //   163: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   168: astore #9
    //   170: aload #7
    //   172: aload #9
    //   174: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   179: checkcast net/portswigger/swagger/v1/models/Model
    //   182: astore #10
    //   184: iinc #11, 1
    //   187: aload_3
    //   188: ifnonnull -> 127
    //   191: aload #9
    //   193: invokestatic isBlank : (Ljava/lang/String;)Z
    //   196: ifne -> 207
    //   199: aload #9
    //   201: astore #6
    //   203: aload_3
    //   204: ifnonnull -> 211
    //   207: aload #8
    //   209: astore #6
    //   211: aload_0
    //   212: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   215: aload_1
    //   216: aload #6
    //   218: invokevirtual putRenamedRef : (Ljava/lang/String;Ljava/lang/String;)V
    //   221: aload #10
    //   223: ifnonnull -> 696
    //   226: aload_0
    //   227: getfield swagger : Lnet/portswigger/swagger/v1/models/Swagger;
    //   230: aload #6
    //   232: aload #5
    //   234: invokevirtual addDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/Model;)V
    //   237: aload_0
    //   238: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   241: aload #6
    //   243: invokevirtual addReferencedKey : (Ljava/lang/String;)V
    //   246: aload_1
    //   247: sipush #-24094
    //   250: sipush #32265
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   259: iconst_0
    //   260: aaload
    //   261: astore #11
    //   263: aload #5
    //   265: instanceof net/portswigger/swagger/v1/models/RefModel
    //   268: ifeq -> 336
    //   271: aload #5
    //   273: checkcast net/portswigger/swagger/v1/models/RefModel
    //   276: astore #12
    //   278: aload #12
    //   280: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   283: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Z
    //   286: ifeq -> 312
    //   289: aload #12
    //   291: aload_0
    //   292: aload #12
    //   294: invokevirtual get$ref : ()Ljava/lang/String;
    //   297: aload #12
    //   299: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   302: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   305: invokevirtual set$ref : (Ljava/lang/String;)V
    //   308: aload_3
    //   309: ifnonnull -> 336
    //   312: aload #12
    //   314: aload_0
    //   315: aload #11
    //   317: aload #12
    //   319: invokevirtual get$ref : ()Ljava/lang/String;
    //   322: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   327: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.RELATIVE : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   330: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   333: invokevirtual set$ref : (Ljava/lang/String;)V
    //   336: aload #5
    //   338: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   341: ifeq -> 496
    //   344: aload #5
    //   346: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   349: astore #12
    //   351: aload #12
    //   353: invokevirtual getAllOf : ()Ljava/util/List;
    //   356: astore #13
    //   358: aload #13
    //   360: invokeinterface iterator : ()Ljava/util/Iterator;
    //   365: astore #14
    //   367: aload #14
    //   369: invokeinterface hasNext : ()Z
    //   374: ifeq -> 496
    //   377: aload #14
    //   379: invokeinterface next : ()Ljava/lang/Object;
    //   384: checkcast net/portswigger/swagger/v1/models/Model
    //   387: astore #15
    //   389: aload #15
    //   391: instanceof net/portswigger/swagger/v1/models/RefModel
    //   394: ifeq -> 471
    //   397: aload #15
    //   399: checkcast net/portswigger/swagger/v1/models/RefModel
    //   402: astore #16
    //   404: aload #16
    //   406: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   409: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Z
    //   412: ifeq -> 447
    //   415: aload #11
    //   417: aload #16
    //   419: invokevirtual get$ref : ()Ljava/lang/String;
    //   422: invokestatic join : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   425: astore #17
    //   427: aload #16
    //   429: aload_0
    //   430: aload #17
    //   432: aload #16
    //   434: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   437: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   440: invokevirtual set$ref : (Ljava/lang/String;)V
    //   443: aload_3
    //   444: ifnonnull -> 467
    //   447: aload_0
    //   448: aload #11
    //   450: aload #16
    //   452: invokevirtual get$ref : ()Ljava/lang/String;
    //   455: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   460: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.RELATIVE : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   463: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   466: pop
    //   467: aload_3
    //   468: ifnonnull -> 492
    //   471: aload #15
    //   473: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   476: ifeq -> 492
    //   479: aload_0
    //   480: aload #15
    //   482: invokeinterface getProperties : ()Ljava/util/Map;
    //   487: aload #11
    //   489: invokevirtual processProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   492: aload_3
    //   493: ifnonnull -> 367
    //   496: aload_0
    //   497: aload #5
    //   499: invokeinterface getProperties : ()Ljava/util/Map;
    //   504: aload #11
    //   506: invokevirtual processProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   509: aload #5
    //   511: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   514: ifeq -> 570
    //   517: aload #5
    //   519: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   522: astore #12
    //   524: aload #12
    //   526: invokevirtual getDiscriminator : ()Ljava/lang/String;
    //   529: astore #13
    //   531: aload #13
    //   533: ifnull -> 549
    //   536: aload_0
    //   537: aload #13
    //   539: aload #12
    //   541: invokevirtual getProperties : ()Ljava/util/Map;
    //   544: aload #11
    //   546: invokevirtual processDiscriminator : (Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    //   549: aload_0
    //   550: iconst_1
    //   551: anewarray net/portswigger/swagger/v1/models/properties/Property
    //   554: dup
    //   555: iconst_0
    //   556: aload #12
    //   558: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   561: aastore
    //   562: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   565: aload #11
    //   567: invokevirtual processProperties : (Ljava/util/Collection;Ljava/lang/String;)V
    //   570: aload #5
    //   572: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   575: ifeq -> 609
    //   578: aload #5
    //   580: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   583: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   586: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   589: ifeq -> 609
    //   592: aload_0
    //   593: aload #5
    //   595: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   598: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   601: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   604: aload #11
    //   606: invokevirtual processRefProperty : (Lnet/portswigger/swagger/v1/models/properties/RefProperty;Ljava/lang/String;)V
    //   609: aload #5
    //   611: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   614: ifeq -> 696
    //   617: aload #5
    //   619: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   622: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   625: ifnull -> 696
    //   628: aload #5
    //   630: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   633: astore #12
    //   635: aload #12
    //   637: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   640: instanceof net/portswigger/swagger/v1/models/RefModel
    //   643: ifeq -> 667
    //   646: aload_0
    //   647: aload #5
    //   649: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   652: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   655: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   658: aload #11
    //   660: invokevirtual processRefProperty : (Lnet/portswigger/swagger/v1/models/properties/RefProperty;Ljava/lang/String;)V
    //   663: aload_3
    //   664: ifnonnull -> 696
    //   667: aload #12
    //   669: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   672: astore #13
    //   674: aload #13
    //   676: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   679: ifeq -> 696
    //   682: aload_0
    //   683: aload #13
    //   685: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   688: invokevirtual getProperties : ()Ljava/util/Map;
    //   691: aload #11
    //   693: invokevirtual processProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   696: aload #6
    //   698: areturn
  }
  
  public String processRefToExternalResponse(String paramString, RefFormat paramRefFormat) {
    String str1 = this.cache.getRenamedRef(paramString);
    if (str1 != null)
      return str1; 
    Response response1 = (Response)this.cache.loadRef(paramString, paramRefFormat, Response.class);
    Map<Object, Object> map = this.swagger.getResponses();
    if (map == null)
      map = new LinkedHashMap<>(); 
    String str3 = RefUtils.computeDefinitionName(paramString);
    Response response2 = (Response)map.get(str3);
    if (response2 != null && response2 instanceof net.portswigger.swagger.v1.models.RefResponse)
      response2 = null; 
    String str2 = str3;
    this.cache.putRenamedRef(paramString, str2);
    if (response1 != null) {
      Object object = null;
      if (response1.getResponseSchema() != null)
        processRefSchemaObject(response1.getResponseSchema(), paramString); 
    } 
    return str2;
  }
  
  private void processRefSchemaObject(Model paramModel, String paramString) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: sipush #-24094
    //   7: sipush #32265
    //   10: invokestatic a : (II)Ljava/lang/String;
    //   13: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   16: iconst_0
    //   17: aaload
    //   18: astore #4
    //   20: astore_3
    //   21: aload_1
    //   22: instanceof net/portswigger/swagger/v1/models/RefModel
    //   25: ifeq -> 84
    //   28: aload_1
    //   29: checkcast net/portswigger/swagger/v1/models/RefModel
    //   32: astore #5
    //   34: aload #5
    //   36: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   39: astore #6
    //   41: aload #6
    //   43: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Z
    //   46: ifeq -> 60
    //   49: aload_0
    //   50: aload #5
    //   52: aload_2
    //   53: invokevirtual processRefModel : (Lnet/portswigger/swagger/v1/models/RefModel;Ljava/lang/String;)V
    //   56: aload_3
    //   57: ifnonnull -> 80
    //   60: aload_0
    //   61: aload #4
    //   63: aload #5
    //   65: invokevirtual get$ref : ()Ljava/lang/String;
    //   68: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   73: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.RELATIVE : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   76: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   79: pop
    //   80: aload_3
    //   81: ifnonnull -> 91
    //   84: aload_0
    //   85: aload_1
    //   86: aload #4
    //   88: invokevirtual processSchema : (Lnet/portswigger/swagger/v1/models/Model;Ljava/lang/String;)V
    //   91: return
  }
  
  private void processSchema(Model paramModel, String paramString) {
    if (paramModel != null) {
      if (paramModel instanceof RefModel)
        processRefModel((RefModel)paramModel, paramString); 
      if (paramModel.getProperties() != null)
        processProperties(paramModel.getProperties(), paramString); 
      if (paramModel instanceof ArrayModel)
        processProperty(((ArrayModel)paramModel).getItems(), paramString); 
      if (paramModel instanceof MapProperty) {
        MapProperty mapProperty = (MapProperty)paramModel;
        if (mapProperty.getAdditionalProperties() instanceof Model)
          processProperty(mapProperty.getAdditionalProperties(), paramString); 
      } 
      if (paramModel instanceof ComposedModel) {
        ComposedModel composedModel = (ComposedModel)paramModel;
        processComposedProperties(composedModel.getAllOf(), paramString);
      } 
    } 
  }
  
  private void processProperty(Property paramProperty, String paramString) {}
  
  private void processComposedProperties(Collection<Model> paramCollection, String paramString) {
    Zbqc[] arrayOfZbqc = ZI();
    if (paramCollection != null)
      for (Model model : paramCollection) {
        processSchema(model, paramString);
        if (arrayOfZbqc == null)
          break; 
      }  
  }
  
  private void processDiscriminator(String paramString1, Map<String, Property> paramMap, String paramString2) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_2
    //   6: ifnull -> 18
    //   9: aload_2
    //   10: invokeinterface isEmpty : ()Z
    //   15: ifeq -> 19
    //   18: return
    //   19: aload_2
    //   20: invokeinterface entrySet : ()Ljava/util/Set;
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore #5
    //   32: aload #5
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 388
    //   42: aload #5
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: checkcast java/util/Map$Entry
    //   52: astore #6
    //   54: aload #6
    //   56: invokeinterface getKey : ()Ljava/lang/Object;
    //   61: checkcast java/lang/String
    //   64: aload_1
    //   65: invokevirtual equals : (Ljava/lang/Object;)Z
    //   68: ifeq -> 383
    //   71: aload #6
    //   73: invokeinterface getValue : ()Ljava/lang/Object;
    //   78: instanceof net/portswigger/swagger/v1/models/properties/StringProperty
    //   81: ifeq -> 173
    //   84: aload #6
    //   86: invokeinterface getValue : ()Ljava/lang/Object;
    //   91: checkcast net/portswigger/swagger/v1/models/properties/StringProperty
    //   94: astore #7
    //   96: aload #7
    //   98: invokevirtual getEnum : ()Ljava/util/List;
    //   101: ifnull -> 168
    //   104: aload #7
    //   106: invokevirtual getEnum : ()Ljava/util/List;
    //   109: invokeinterface iterator : ()Ljava/util/Iterator;
    //   114: astore #8
    //   116: aload #8
    //   118: invokeinterface hasNext : ()Z
    //   123: ifeq -> 168
    //   126: aload #8
    //   128: invokeinterface next : ()Ljava/lang/Object;
    //   133: checkcast java/lang/String
    //   136: astore #9
    //   138: aload_0
    //   139: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   142: dup
    //   143: getstatic net/portswigger/swagger/v1/models/refs/RefType.DEFINITION : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   146: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   149: aload #9
    //   151: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   156: invokespecial <init> : (Ljava/lang/String;)V
    //   159: aload_3
    //   160: invokevirtual processRefProperty : (Lnet/portswigger/swagger/v1/models/properties/RefProperty;Ljava/lang/String;)V
    //   163: aload #4
    //   165: ifnonnull -> 116
    //   168: aload #4
    //   170: ifnonnull -> 383
    //   173: aload #6
    //   175: invokeinterface getValue : ()Ljava/lang/Object;
    //   180: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   183: ifeq -> 383
    //   186: aload #6
    //   188: invokeinterface getValue : ()Ljava/lang/Object;
    //   193: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   196: invokevirtual getSimpleRef : ()Ljava/lang/String;
    //   199: astore #7
    //   201: aload_0
    //   202: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   205: invokevirtual getRenameCache : ()Ljava/util/Map;
    //   208: astore #8
    //   210: aload #8
    //   212: invokeinterface keySet : ()Ljava/util/Set;
    //   217: invokeinterface iterator : ()Ljava/util/Iterator;
    //   222: astore #9
    //   224: aload #9
    //   226: invokeinterface hasNext : ()Z
    //   231: ifeq -> 383
    //   234: aload #9
    //   236: invokeinterface next : ()Ljava/lang/Object;
    //   241: checkcast java/lang/String
    //   244: astore #10
    //   246: aload #8
    //   248: aload #10
    //   250: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   255: checkcast java/lang/String
    //   258: astore #11
    //   260: aload #11
    //   262: aload #7
    //   264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   267: ifeq -> 378
    //   270: aload_0
    //   271: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   274: invokevirtual getResolutionCache : ()Ljava/util/Map;
    //   277: aload #10
    //   279: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   284: astore #12
    //   286: aload #12
    //   288: ifnull -> 378
    //   291: aload #12
    //   293: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   296: ifeq -> 378
    //   299: aload #12
    //   301: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   304: astore #13
    //   306: aload #13
    //   308: invokevirtual getEnum : ()Ljava/util/List;
    //   311: ifnull -> 378
    //   314: aload #13
    //   316: invokevirtual getEnum : ()Ljava/util/List;
    //   319: invokeinterface iterator : ()Ljava/util/Iterator;
    //   324: astore #14
    //   326: aload #14
    //   328: invokeinterface hasNext : ()Z
    //   333: ifeq -> 378
    //   336: aload #14
    //   338: invokeinterface next : ()Ljava/lang/Object;
    //   343: checkcast java/lang/String
    //   346: astore #15
    //   348: aload_0
    //   349: new net/portswigger/swagger/v1/models/properties/RefProperty
    //   352: dup
    //   353: getstatic net/portswigger/swagger/v1/models/refs/RefType.DEFINITION : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   356: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   359: aload #15
    //   361: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   366: invokespecial <init> : (Ljava/lang/String;)V
    //   369: aload_3
    //   370: invokevirtual processRefProperty : (Lnet/portswigger/swagger/v1/models/properties/RefProperty;Ljava/lang/String;)V
    //   373: aload #4
    //   375: ifnonnull -> 326
    //   378: aload #4
    //   380: ifnonnull -> 224
    //   383: aload #4
    //   385: ifnonnull -> 32
    //   388: return
  }
  
  private void processProperties(Map<String, Property> paramMap, String paramString) {
    if (paramMap == null || paramMap.isEmpty())
      return; 
    processProperties(paramMap.values(), paramString);
  }
  
  private void processProperties(Collection<Property> paramCollection, String paramString) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: ifnull -> 17
    //   8: aload_1
    //   9: invokeinterface isEmpty : ()Z
    //   14: ifeq -> 18
    //   17: return
    //   18: aload_1
    //   19: invokeinterface iterator : ()Ljava/util/Iterator;
    //   24: astore #4
    //   26: aload #4
    //   28: invokeinterface hasNext : ()Z
    //   33: ifeq -> 190
    //   36: aload #4
    //   38: invokeinterface next : ()Ljava/lang/Object;
    //   43: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   46: astore #5
    //   48: aload #5
    //   50: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   53: ifeq -> 70
    //   56: aload_0
    //   57: aload #5
    //   59: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   62: aload_2
    //   63: invokevirtual processRefProperty : (Lnet/portswigger/swagger/v1/models/properties/RefProperty;Ljava/lang/String;)V
    //   66: aload_3
    //   67: ifnonnull -> 186
    //   70: aload #5
    //   72: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   75: ifeq -> 105
    //   78: aload_0
    //   79: iconst_1
    //   80: anewarray net/portswigger/swagger/v1/models/properties/Property
    //   83: dup
    //   84: iconst_0
    //   85: aload #5
    //   87: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   90: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   93: aastore
    //   94: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   97: aload_2
    //   98: invokevirtual processProperties : (Ljava/util/Collection;Ljava/lang/String;)V
    //   101: aload_3
    //   102: ifnonnull -> 186
    //   105: aload #5
    //   107: instanceof net/portswigger/swagger/v1/models/properties/MapProperty
    //   110: ifeq -> 140
    //   113: aload_0
    //   114: iconst_1
    //   115: anewarray net/portswigger/swagger/v1/models/properties/Property
    //   118: dup
    //   119: iconst_0
    //   120: aload #5
    //   122: checkcast net/portswigger/swagger/v1/models/properties/MapProperty
    //   125: invokevirtual getAdditionalProperties : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   128: aastore
    //   129: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   132: aload_2
    //   133: invokevirtual processProperties : (Ljava/util/Collection;Ljava/lang/String;)V
    //   136: aload_3
    //   137: ifnonnull -> 186
    //   140: aload #5
    //   142: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   145: ifeq -> 165
    //   148: aload_0
    //   149: aload #5
    //   151: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   154: invokevirtual getProperties : ()Ljava/util/Map;
    //   157: aload_2
    //   158: invokevirtual processProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   161: aload_3
    //   162: ifnonnull -> 186
    //   165: aload #5
    //   167: instanceof net/portswigger/swagger/v1/models/properties/ComposedProperty
    //   170: ifeq -> 186
    //   173: aload_0
    //   174: aload #5
    //   176: checkcast net/portswigger/swagger/v1/models/properties/ComposedProperty
    //   179: invokevirtual getAllOf : ()Ljava/util/List;
    //   182: aload_2
    //   183: invokevirtual processProperties : (Ljava/util/Collection;Ljava/lang/String;)V
    //   186: aload_3
    //   187: ifnonnull -> 26
    //   190: return
  }
  
  private void processDiscriminatorAsRefProperty(RefProperty paramRefProperty, String paramString) {
    Zbqc[] arrayOfZbqc = ZI();
    if (RefUtils.isAnExternalRefFormat(paramRefProperty.getRefFormat())) {
      String str1 = join(paramString, paramRefProperty.get$ref());
      paramRefProperty.set$ref(processRefToExternalDefinition(str1, paramRefProperty.getRefFormat()));
      if (arrayOfZbqc == null) {
        str1 = processRefToExternalDefinition(paramString + paramString, RefFormat.RELATIVE);
        paramRefProperty.set$ref(RefType.DEFINITION.getInternalPrefix() + RefType.DEFINITION.getInternalPrefix());
        return;
      } 
      return;
    } 
    String str = processRefToExternalDefinition(paramString + paramString, RefFormat.RELATIVE);
    paramRefProperty.set$ref(RefType.DEFINITION.getInternalPrefix() + RefType.DEFINITION.getInternalPrefix());
  }
  
  private void processRefProperty(RefProperty paramRefProperty, String paramString) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   8: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Z
    //   11: ifeq -> 101
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual get$ref : ()Ljava/lang/String;
    //   19: invokestatic join : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   22: astore #4
    //   24: aload_0
    //   25: aload #4
    //   27: aload_1
    //   28: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   31: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   34: astore #5
    //   36: aload #5
    //   38: sipush #-24095
    //   41: sipush #8413
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   50: ifne -> 70
    //   53: aload #5
    //   55: sipush #-24093
    //   58: sipush #-9852
    //   61: invokestatic a : (II)Ljava/lang/String;
    //   64: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   67: ifeq -> 80
    //   70: aload_1
    //   71: aload #5
    //   73: invokevirtual set$ref : (Ljava/lang/String;)V
    //   76: aload_3
    //   77: ifnonnull -> 97
    //   80: aload_1
    //   81: getstatic net/portswigger/swagger/v1/models/refs/RefType.DEFINITION : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   84: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   87: aload #5
    //   89: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   94: invokevirtual set$ref : (Ljava/lang/String;)V
    //   97: aload_3
    //   98: ifnonnull -> 137
    //   101: aload_0
    //   102: aload_2
    //   103: aload_1
    //   104: invokevirtual get$ref : ()Ljava/lang/String;
    //   107: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   112: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.RELATIVE : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   115: invokevirtual processRefToExternalDefinition : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;)Ljava/lang/String;
    //   118: astore #4
    //   120: aload_1
    //   121: getstatic net/portswigger/swagger/v1/models/refs/RefType.DEFINITION : Lnet/portswigger/swagger/v1/models/refs/RefType;
    //   124: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   127: aload #4
    //   129: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   134: invokevirtual set$ref : (Ljava/lang/String;)V
    //   137: return
  }
  
  private void processRefModel(RefModel paramRefModel, String paramString) {
    RefFormat refFormat = paramRefModel.getRefFormat();
    Zbqc[] arrayOfZbqc = ZI();
    if (!RefUtils.isAnExternalRefFormat(refFormat)) {
      paramRefModel.set$ref(RefType.DEFINITION.getInternalPrefix() + RefType.DEFINITION.getInternalPrefix());
      return;
    } 
    String str1 = paramRefModel.get$ref();
    String str2 = getExternalPath(paramRefModel.get$ref());
    if (refFormat.equals(RefFormat.RELATIVE) && !Objects.equals(str2, paramString)) {
      str1 = constructRef((Model)paramRefModel, paramString);
      paramRefModel.set$ref(str1);
      if (arrayOfZbqc == null) {
        processRefToExternalDefinition(str1, refFormat);
        return;
      } 
      return;
    } 
    processRefToExternalDefinition(str1, refFormat);
  }
  
  protected String constructRef(Model paramModel, String paramString) {
    RefModel refModel = (RefModel)paramModel;
    String str = refModel.get$ref();
    return join(paramString, str);
  }
  
  public static String getExternalPath(String paramString) {
    Zbqc[] arrayOfZbqc = ZI();
    if (paramString == null)
      return null; 
    String[] arrayOfString = paramString.split(a(-24096, 11026));
    String str = null;
    byte b = 0;
    while (b < arrayOfString.length) {
      if (arrayOfString[b].length() == 2)
        str = arrayOfString[b]; 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return str;
  }
  
  public static String join(String paramString1, String paramString2) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aload_0
    //   7: ldc '/'
    //   9: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   12: ifne -> 31
    //   15: aload_0
    //   16: ldc '.'
    //   18: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   21: ifeq -> 33
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: iconst_1
    //   32: istore_3
    //   33: new java/net/URI
    //   36: dup
    //   37: aload_0
    //   38: invokespecial <init> : (Ljava/lang/String;)V
    //   41: astore #4
    //   43: aload_0
    //   44: ldc '/'
    //   46: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   49: ifne -> 114
    //   52: aload_1
    //   53: sipush #-24089
    //   56: sipush #-5496
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   65: ifeq -> 114
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: ldc ''
    //   77: aload #4
    //   79: invokevirtual getPath : ()Ljava/lang/String;
    //   82: invokevirtual equals : (Ljava/lang/Object;)Z
    //   85: ifeq -> 114
    //   88: goto -> 95
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: new java/net/URI
    //   98: dup
    //   99: aload_0
    //   100: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   105: invokespecial <init> : (Ljava/lang/String;)V
    //   108: astore #4
    //   110: aload_2
    //   111: ifnonnull -> 165
    //   114: ldc ''
    //   116: aload #4
    //   118: invokevirtual getPath : ()Ljava/lang/String;
    //   121: invokevirtual equals : (Ljava/lang/Object;)Z
    //   124: ifeq -> 165
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_1
    //   135: ldc '/'
    //   137: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   140: ifne -> 165
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: new java/net/URI
    //   153: dup
    //   154: aload_0
    //   155: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: astore #4
    //   165: new java/net/URI
    //   168: dup
    //   169: aload_1
    //   170: invokespecial <init> : (Ljava/lang/String;)V
    //   173: astore #5
    //   175: aload #4
    //   177: aload #5
    //   179: invokevirtual resolve : (Ljava/net/URI;)Ljava/net/URI;
    //   182: astore #6
    //   184: aload #6
    //   186: invokevirtual normalize : ()Ljava/net/URI;
    //   189: astore #7
    //   191: aload #7
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: iconst_0
    //   197: invokevirtual charAt : (I)C
    //   200: invokestatic isAlphabetic : (I)Z
    //   203: ifeq -> 238
    //   206: iload_3
    //   207: ifeq -> 238
    //   210: goto -> 217
    //   213: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   216: athrow
    //   217: aload #7
    //   219: invokevirtual toString : ()Ljava/lang/String;
    //   222: sipush #-24090
    //   225: sipush #-23746
    //   228: invokestatic a : (II)Ljava/lang/String;
    //   231: swap
    //   232: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   237: areturn
    //   238: aload #7
    //   240: invokevirtual toString : ()Ljava/lang/String;
    //   243: areturn
    //   244: astore_3
    //   245: aload_0
    //   246: areturn
    // Exception table:
    //   from	to	target	type
    //   4	237	244	java/lang/Exception
    //   6	24	27	java/lang/Exception
    //   43	68	71	java/lang/Exception
    //   52	88	91	java/lang/Exception
    //   110	127	130	java/lang/Exception
    //   114	143	146	java/lang/Exception
    //   191	210	213	java/lang/Exception
    //   238	243	244	java/lang/Exception
  }
  
  public static void ZJ(Zbqc[] paramArrayOfZbqc) {
    Zz = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZI() {
    return Zz;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ÄäXs­\\b¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: anewarray burp/Zbqc
    //   22: bipush #6
    //   24: istore_1
    //   25: invokestatic ZJ : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #56
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 149
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
    //   75: ldc 'ÿ|G'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: iconst_2
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #110
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic net/portswigger/swagger/v1/parser/processors/ExternalRefProcessor.a : [Ljava/lang/String;
    //   138: bipush #6
    //   140: anewarray java/lang/String
    //   143: putstatic net/portswigger/swagger/v1/parser/processors/ExternalRefProcessor.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 267
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 239, 5 -> 244
    //   220: bipush #50
    //   222: goto -> 251
    //   225: bipush #117
    //   227: goto -> 251
    //   230: bipush #124
    //   232: goto -> 251
    //   235: iconst_1
    //   236: goto -> 251
    //   239: bipush #69
    //   241: goto -> 251
    //   244: bipush #64
    //   246: goto -> 251
    //   249: bipush #100
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 172
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 168
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 47, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA1E3) & 0xFFFF;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\ExternalRefProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */