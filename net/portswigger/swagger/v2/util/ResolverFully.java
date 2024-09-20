package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.SpecVersion;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.ComposedSchema;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class ResolverFully {
  private boolean aggregateCombinators;
  
  private Map<String, Schema> schemas;
  
  private Map<String, Schema> resolvedModels = new HashMap<>();
  
  private Map<String, Example> examples;
  
  private Map<String, Parameter> parameters;
  
  private Map<String, RequestBody> requestBodies;
  
  private Map<String, Header> headers;
  
  private Map<String, Link> links;
  
  private Map<String, Schema> resolvedProperties = new IdentityHashMap<>();
  
  private Map<String, Callback> callbacks;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public ResolverFully() {
    this(true);
  }
  
  public ResolverFully(boolean paramBoolean) {
    this.aggregateCombinators = paramBoolean;
  }
  
  public void resolveFully(OpenAPI paramOpenAPI) {
    Components components = paramOpenAPI.getComponents();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (components != null && components.getRequestBodies() != null) {
      this.requestBodies = components.getRequestBodies();
      if (this.requestBodies == null)
        this.requestBodies = new HashMap<>(); 
    } 
    if (components != null && components.getSchemas() != null) {
      this.schemas = components.getSchemas();
      if (this.schemas == null)
        this.schemas = new HashMap<>(); 
    } 
    if (components != null && components.getExamples() != null) {
      this.examples = components.getExamples();
      if (this.examples == null)
        this.examples = new HashMap<>(); 
    } 
    if (components != null && components.getHeaders() != null) {
      this.headers = components.getHeaders();
      if (this.headers == null)
        this.headers = new HashMap<>(); 
    } 
    if (components != null && components.getParameters() != null) {
      this.parameters = components.getParameters();
      if (this.parameters == null)
        this.parameters = new HashMap<>(); 
    } 
    if (components != null && components.getLinks() != null) {
      this.links = components.getLinks();
      if (this.links == null)
        this.links = new HashMap<>(); 
    } 
    if (components != null && components.getCallbacks() != null) {
      this.callbacks = components.getCallbacks();
      if (this.callbacks == null)
        this.callbacks = new HashMap<>(); 
    } 
    Paths paths = paramOpenAPI.getPaths();
    if (paths != null)
      for (String str : paths.keySet()) {
        PathItem pathItem = (PathItem)paths.get(str);
        resolvePath(pathItem);
        if (arrayOfZbqc == null)
          break; 
      }  
  }
  
  public void resolvePath(PathItem paramPathItem) {
    Iterator<Operation> iterator = paramPathItem.readOperations().iterator();
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    while (iterator.hasNext()) {
      Operation operation = iterator.next();
      if (operation.getParameters() != null)
        for (Parameter parameter : operation.getParameters()) {
          parameter = (parameter.get$ref() != null) ? resolveParameter(parameter) : parameter;
          if (parameter.getSchema() != null) {
            Schema schema = resolveSchema(parameter.getSchema());
            if (schema != null)
              parameter.setSchema(schema); 
          } 
          if (parameter.getContent() != null) {
            Content content = parameter.getContent();
            for (String str : content.keySet()) {
              if (content.get(str) != null && ((MediaType)content.get(str)).getSchema() != null) {
                Schema schema = resolveSchema(((MediaType)content.get(str)).getSchema());
                if (schema != null)
                  ((MediaType)content.get(str)).setSchema(schema); 
              } 
              if (arrayOfZbqc == null)
                break; 
            } 
          } 
          if (arrayOfZbqc == null)
            break; 
        }  
      if (operation.getCallbacks() != null) {
        Map map = operation.getCallbacks();
        for (String str : map.keySet()) {
          Callback callback = (Callback)map.get(str);
          callback = (callback.get$ref() != null) ? resolveCallback(callback) : callback;
          if (callback != null)
            for (String str1 : callback.keySet()) {
              PathItem pathItem = (PathItem)callback.get(str1);
              if (pathItem != null)
                resolvePath(pathItem); 
              if (arrayOfZbqc == null)
                break; 
            }  
          operation.getCallbacks().put(str, callback);
          if (arrayOfZbqc == null)
            break; 
        } 
      } 
      RequestBody requestBody = operation.getRequestBody();
      if (requestBody != null) {
        RequestBody requestBody1 = (requestBody.get$ref() != null) ? resolveRequestBody(requestBody) : requestBody;
        operation.setRequestBody(requestBody1);
        if (requestBody1.getContent() != null) {
          Content content = requestBody1.getContent();
          for (String str : content.keySet()) {
            if (content.get(str) != null && ((MediaType)content.get(str)).getSchema() != null) {
              Schema schema = resolveSchema(((MediaType)content.get(str)).getSchema());
              if (schema != null)
                ((MediaType)content.get(str)).setSchema(schema); 
            } 
            if (arrayOfZbqc == null)
              break; 
          } 
        } 
      } 
      ApiResponses apiResponses = operation.getResponses();
      if (apiResponses != null)
        for (String str : apiResponses.keySet()) {
          ApiResponse apiResponse = (ApiResponse)apiResponses.get(str);
          if (apiResponse.getContent() != null) {
            Content content = apiResponse.getContent();
            for (String str1 : content.keySet()) {
              if (((MediaType)content.get(str1)).getSchema() != null) {
                Schema schema = resolveSchema(((MediaType)content.get(str1)).getSchema());
                ((MediaType)apiResponse.getContent().get(str1)).setSchema(schema);
              } 
              if (((MediaType)content.get(str1)).getExamples() != null) {
                Map<String, Example> map1 = resolveExample(((MediaType)content.get(str1)).getExamples());
                ((MediaType)apiResponse.getContent().get(str1)).setExamples(map1);
              } 
              if (arrayOfZbqc == null)
                break; 
            } 
          } 
          resolveHeaders(apiResponse.getHeaders());
          Map map = apiResponse.getLinks();
          if (map != null)
            for (Map.Entry entry : map.entrySet()) {
              Link link1 = (Link)entry.getValue();
              Link link2 = (link1.get$ref() != null) ? resolveLink(link1) : link1;
              entry.setValue(link2);
              if (arrayOfZbqc == null)
                break; 
            }  
          if (arrayOfZbqc == null)
            break; 
        }  
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void resolveHeaders(Map<String, Header> paramMap) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramMap == null || paramMap.isEmpty())
      return; 
    for (Map.Entry<String, Header> entry : paramMap.entrySet()) {
      Header header1 = (Header)entry.getValue();
      Header header2 = (header1.get$ref() != null) ? resolveHeader(header1) : header1;
      Map<String, Example> map = header2.getExamples();
      if (map != null) {
        Map<String, Example> map1 = resolveExample(map);
        header2.setExamples(map1);
      } 
      Schema schema = header2.getSchema();
      if (schema != null) {
        Schema schema1 = resolveSchema(schema);
        if (schema1 != null)
          header2.setSchema(schema1); 
      } 
      entry.setValue(header2);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public Header resolveHeader(Header paramHeader) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramHeader.get$ref());
    String str = paramHeader.get$ref();
    if (!RefUtils.isAnExternalRefFormat(refFormat) && this.headers != null && !this.headers.isEmpty()) {
      String str1 = RefUtils.computeDefinitionName(str);
      return this.headers.getOrDefault(str1, paramHeader);
    } 
    return paramHeader;
  }
  
  public Link resolveLink(Link paramLink) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramLink.get$ref());
    String str = paramLink.get$ref();
    if (!RefUtils.isAnExternalRefFormat(refFormat) && this.links != null && !this.links.isEmpty()) {
      String str1 = RefUtils.computeDefinitionName(str);
      Link link = this.links.getOrDefault(str1, paramLink);
      if (link == null)
        return null; 
      resolveHeaders(link.getHeaders());
      return link;
    } 
    return paramLink;
  }
  
  public RequestBody resolveRequestBody(RequestBody paramRequestBody) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramRequestBody.get$ref());
    String str = paramRequestBody.get$ref();
    if (!RefUtils.isAnExternalRefFormat(refFormat) && this.requestBodies != null && !this.requestBodies.isEmpty()) {
      String str1 = RefUtils.computeDefinitionName(str);
      return this.requestBodies.getOrDefault(str1, paramRequestBody);
    } 
    return paramRequestBody;
  }
  
  public Callback resolveCallback(Callback paramCallback) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramCallback.get$ref());
    String str = paramCallback.get$ref();
    if (!RefUtils.isAnExternalRefFormat(refFormat) && this.callbacks != null && !this.callbacks.isEmpty()) {
      String str1 = RefUtils.computeDefinitionName(str);
      return this.callbacks.getOrDefault(str1, paramCallback);
    } 
    return paramCallback;
  }
  
  public Parameter resolveParameter(Parameter paramParameter) {
    String str = paramParameter.get$ref();
    RefFormat refFormat = RefUtils.computeRefFormat(str);
    if (!RefUtils.isAnExternalRefFormat(refFormat) && this.parameters != null && !this.parameters.isEmpty()) {
      String str1 = RefUtils.computeDefinitionName(str);
      return this.parameters.getOrDefault(str1, paramParameter);
    } 
    return paramParameter;
  }
  
  public Schema resolveSchema(Schema paramSchema) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_1
    //   11: invokevirtual get$ref : ()Ljava/lang/String;
    //   14: ifnull -> 223
    //   17: aload_1
    //   18: invokevirtual get$ref : ()Ljava/lang/String;
    //   21: astore_3
    //   22: aload_3
    //   23: sipush #26288
    //   26: sipush #1983
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   35: ifeq -> 101
    //   38: aload_3
    //   39: ldc '/'
    //   41: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   44: astore #5
    //   46: aload #5
    //   48: iconst_3
    //   49: aaload
    //   50: astore #6
    //   52: aload_0
    //   53: getfield schemas : Ljava/util/Map;
    //   56: aload #6
    //   58: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   66: astore #7
    //   68: aload_3
    //   69: aload_3
    //   70: ldc '/'
    //   72: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   75: iconst_1
    //   76: iadd
    //   77: invokevirtual substring : (I)Ljava/lang/String;
    //   80: astore_3
    //   81: aload #7
    //   83: invokevirtual getProperties : ()Ljava/util/Map;
    //   86: aload_3
    //   87: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   95: astore #4
    //   97: aload_2
    //   98: ifnonnull -> 140
    //   101: aload_3
    //   102: aload_3
    //   103: ldc '/'
    //   105: invokevirtual lastIndexOf : (Ljava/lang/String;)I
    //   108: iconst_1
    //   109: iadd
    //   110: invokevirtual substring : (I)Ljava/lang/String;
    //   113: astore_3
    //   114: aload_0
    //   115: getfield schemas : Ljava/util/Map;
    //   118: ifnull -> 137
    //   121: aload_0
    //   122: getfield schemas : Ljava/util/Map;
    //   125: aload_3
    //   126: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   131: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   134: goto -> 138
    //   137: aconst_null
    //   138: astore #4
    //   140: aload #4
    //   142: ifnull -> 221
    //   145: aload_0
    //   146: getfield resolvedModels : Ljava/util/Map;
    //   149: aload_3
    //   150: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   155: ifeq -> 172
    //   158: aload_0
    //   159: getfield resolvedModels : Ljava/util/Map;
    //   162: aload_3
    //   163: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   168: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   171: areturn
    //   172: aload_0
    //   173: getfield resolvedModels : Ljava/util/Map;
    //   176: aload_3
    //   177: aload_1
    //   178: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   183: pop
    //   184: aload_0
    //   185: aload #4
    //   187: invokevirtual resolveSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   190: astore #5
    //   192: aload_0
    //   193: getfield resolvedModels : Ljava/util/Map;
    //   196: aload_3
    //   197: aload #5
    //   199: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: aload_0
    //   206: getfield schemas : Ljava/util/Map;
    //   209: aload_3
    //   210: aload #5
    //   212: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: aload #5
    //   220: areturn
    //   221: aload_1
    //   222: areturn
    //   223: aload_1
    //   224: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   227: ifeq -> 249
    //   230: aload_1
    //   231: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   234: astore_3
    //   235: aload_3
    //   236: aload_0
    //   237: aload_3
    //   238: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   241: invokevirtual resolveSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   244: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   247: aload_3
    //   248: areturn
    //   249: aload_1
    //   250: instanceof net/portswigger/swagger/v3/oas/models/media/MapSchema
    //   253: ifeq -> 290
    //   256: aload_1
    //   257: checkcast net/portswigger/swagger/v3/oas/models/media/MapSchema
    //   260: astore_3
    //   261: aload_3
    //   262: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   265: instanceof net/portswigger/swagger/v3/oas/models/media/Schema
    //   268: ifeq -> 290
    //   271: aload_3
    //   272: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   275: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   278: astore #4
    //   280: aload_3
    //   281: aload_0
    //   282: aload #4
    //   284: invokevirtual resolveSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   287: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   290: aload_1
    //   291: instanceof net/portswigger/swagger/v3/oas/models/media/ObjectSchema
    //   294: ifeq -> 408
    //   297: aload_1
    //   298: checkcast net/portswigger/swagger/v3/oas/models/media/ObjectSchema
    //   301: astore_3
    //   302: aload_3
    //   303: invokevirtual getProperties : ()Ljava/util/Map;
    //   306: ifnull -> 406
    //   309: new java/util/LinkedHashMap
    //   312: dup
    //   313: invokespecial <init> : ()V
    //   316: astore #4
    //   318: aload_3
    //   319: invokevirtual getProperties : ()Ljava/util/Map;
    //   322: invokeinterface keySet : ()Ljava/util/Set;
    //   327: invokeinterface iterator : ()Ljava/util/Iterator;
    //   332: astore #5
    //   334: aload #5
    //   336: invokeinterface hasNext : ()Z
    //   341: ifeq -> 400
    //   344: aload #5
    //   346: invokeinterface next : ()Ljava/lang/Object;
    //   351: checkcast java/lang/String
    //   354: astore #6
    //   356: aload_3
    //   357: invokevirtual getProperties : ()Ljava/util/Map;
    //   360: aload #6
    //   362: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   367: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   370: astore #7
    //   372: aload_1
    //   373: aload #7
    //   375: if_acmpeq -> 396
    //   378: aload #4
    //   380: aload #6
    //   382: aload_0
    //   383: aload #6
    //   385: aload #7
    //   387: invokevirtual resolveSchemaProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   390: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   395: pop
    //   396: aload_2
    //   397: ifnonnull -> 334
    //   400: aload_3
    //   401: aload #4
    //   403: invokevirtual setProperties : (Ljava/util/Map;)V
    //   406: aload_3
    //   407: areturn
    //   408: aload_1
    //   409: astore_3
    //   410: aload_1
    //   411: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   414: ifeq -> 1057
    //   417: aload_1
    //   418: checkcast net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   421: astore #4
    //   423: aload #4
    //   425: invokevirtual getAllOf : ()Ljava/util/List;
    //   428: ifnull -> 435
    //   431: iconst_1
    //   432: goto -> 436
    //   435: iconst_0
    //   436: istore #5
    //   438: aload #4
    //   440: invokevirtual getAnyOf : ()Ljava/util/List;
    //   443: ifnull -> 450
    //   446: iconst_1
    //   447: goto -> 451
    //   450: iconst_0
    //   451: istore #6
    //   453: aload #4
    //   455: invokevirtual getOneOf : ()Ljava/util/List;
    //   458: ifnull -> 465
    //   461: iconst_1
    //   462: goto -> 466
    //   465: iconst_0
    //   466: istore #7
    //   468: iload #5
    //   470: ifeq -> 478
    //   473: iload #6
    //   475: ifne -> 498
    //   478: iload #5
    //   480: ifeq -> 488
    //   483: iload #7
    //   485: ifne -> 498
    //   488: iload #6
    //   490: ifeq -> 502
    //   493: iload #7
    //   495: ifeq -> 502
    //   498: iconst_1
    //   499: goto -> 503
    //   502: iconst_0
    //   503: istore #8
    //   505: aload_0
    //   506: getfield aggregateCombinators : Z
    //   509: ifeq -> 928
    //   512: iload #5
    //   514: ifne -> 522
    //   517: iload #8
    //   519: ifeq -> 928
    //   522: aconst_null
    //   523: astore #9
    //   525: getstatic net/portswigger/swagger/v3/oas/models/SpecVersion.V30 : Lnet/portswigger/swagger/v3/oas/models/SpecVersion;
    //   528: aload #4
    //   530: invokevirtual getSpecVersion : ()Lnet/portswigger/swagger/v3/oas/models/SpecVersion;
    //   533: invokevirtual equals : (Ljava/lang/Object;)Z
    //   536: ifeq -> 558
    //   539: aload_0
    //   540: aload #4
    //   542: invokevirtual getSchemaType : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   545: aload #4
    //   547: invokevirtual getFormat : ()Ljava/lang/String;
    //   550: invokestatic createSchema : (Ljava/lang/String;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   553: astore #9
    //   555: goto -> 587
    //   558: new net/portswigger/swagger/v3/oas/models/media/JsonSchema
    //   561: dup
    //   562: invokespecial <init> : ()V
    //   565: astore #9
    //   567: aload #9
    //   569: aload #4
    //   571: invokevirtual getFormat : ()Ljava/lang/String;
    //   574: invokevirtual setFormat : (Ljava/lang/String;)V
    //   577: aload #9
    //   579: aload #4
    //   581: invokevirtual getTypes : ()Ljava/util/Set;
    //   584: invokevirtual setTypes : (Ljava/util/Set;)V
    //   587: new java/util/HashSet
    //   590: dup
    //   591: invokespecial <init> : ()V
    //   594: astore #10
    //   596: new java/util/HashSet
    //   599: dup
    //   600: invokespecial <init> : ()V
    //   603: astore #11
    //   605: iload #5
    //   607: ifeq -> 627
    //   610: aload_0
    //   611: aload #4
    //   613: aload #9
    //   615: aload #4
    //   617: invokevirtual getAllOf : ()Ljava/util/List;
    //   620: aload #10
    //   622: aload #11
    //   624: invokevirtual aggregateSchemaCombinators : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    //   627: iload #7
    //   629: ifeq -> 649
    //   632: aload_0
    //   633: aload #4
    //   635: aload #9
    //   637: aload #4
    //   639: invokevirtual getOneOf : ()Ljava/util/List;
    //   642: aload #10
    //   644: aload #11
    //   646: invokevirtual aggregateSchemaCombinators : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    //   649: iload #6
    //   651: ifeq -> 671
    //   654: aload_0
    //   655: aload #4
    //   657: aload #9
    //   659: aload #4
    //   661: invokevirtual getAnyOf : ()Ljava/util/List;
    //   664: aload #10
    //   666: aload #11
    //   668: invokevirtual aggregateSchemaCombinators : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    //   671: aload #11
    //   673: invokeinterface size : ()I
    //   678: iconst_1
    //   679: if_icmpne -> 699
    //   682: aload #9
    //   684: aload #11
    //   686: invokeinterface iterator : ()Ljava/util/Iterator;
    //   691: invokeinterface next : ()Ljava/lang/Object;
    //   696: invokevirtual setDefault : (Ljava/lang/Object;)V
    //   699: aload_1
    //   700: invokevirtual getExample : ()Ljava/lang/Object;
    //   703: ifnull -> 719
    //   706: aload #9
    //   708: aload_1
    //   709: invokevirtual getExample : ()Ljava/lang/Object;
    //   712: invokevirtual setExample : (Ljava/lang/Object;)V
    //   715: aload_2
    //   716: ifnonnull -> 736
    //   719: aload #10
    //   721: invokeinterface isEmpty : ()Z
    //   726: ifne -> 736
    //   729: aload #9
    //   731: aload #10
    //   733: invokevirtual setExample : (Ljava/lang/Object;)V
    //   736: aload_1
    //   737: invokevirtual getXml : ()Lnet/portswigger/swagger/v3/oas/models/media/XML;
    //   740: ifnull -> 752
    //   743: aload #9
    //   745: aload_1
    //   746: invokevirtual getXml : ()Lnet/portswigger/swagger/v3/oas/models/media/XML;
    //   749: invokevirtual setXml : (Lnet/portswigger/swagger/v3/oas/models/media/XML;)V
    //   752: aload_1
    //   753: invokevirtual getDescription : ()Ljava/lang/String;
    //   756: ifnull -> 768
    //   759: aload #9
    //   761: aload_1
    //   762: invokevirtual getDescription : ()Ljava/lang/String;
    //   765: invokevirtual setDescription : (Ljava/lang/String;)V
    //   768: aload_1
    //   769: invokevirtual getExtensions : ()Ljava/util/Map;
    //   772: ifnull -> 837
    //   775: aload_1
    //   776: invokevirtual getExtensions : ()Ljava/util/Map;
    //   779: astore #12
    //   781: aload #12
    //   783: invokeinterface keySet : ()Ljava/util/Set;
    //   788: invokeinterface iterator : ()Ljava/util/Iterator;
    //   793: astore #13
    //   795: aload #13
    //   797: invokeinterface hasNext : ()Z
    //   802: ifeq -> 837
    //   805: aload #13
    //   807: invokeinterface next : ()Ljava/lang/Object;
    //   812: checkcast java/lang/String
    //   815: astore #14
    //   817: aload #9
    //   819: aload #14
    //   821: aload #12
    //   823: aload #14
    //   825: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   830: invokevirtual addExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   833: aload_2
    //   834: ifnonnull -> 795
    //   837: aload_1
    //   838: invokevirtual getProperties : ()Ljava/util/Map;
    //   841: ifnull -> 878
    //   844: aload #9
    //   846: invokevirtual getProperties : ()Ljava/util/Map;
    //   849: ifnonnull -> 864
    //   852: aload #9
    //   854: new java/util/HashMap
    //   857: dup
    //   858: invokespecial <init> : ()V
    //   861: invokevirtual setProperties : (Ljava/util/Map;)V
    //   864: aload #9
    //   866: invokevirtual getProperties : ()Ljava/util/Map;
    //   869: aload_1
    //   870: invokevirtual getProperties : ()Ljava/util/Map;
    //   873: invokeinterface putAll : (Ljava/util/Map;)V
    //   878: aload_1
    //   879: invokevirtual getRequired : ()Ljava/util/List;
    //   882: ifnull -> 921
    //   885: aload #9
    //   887: invokevirtual getRequired : ()Ljava/util/List;
    //   890: ifnonnull -> 906
    //   893: aload #9
    //   895: new java/util/ArrayList
    //   898: dup
    //   899: invokespecial <init> : ()V
    //   902: invokevirtual required : (Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   905: pop
    //   906: aload #9
    //   908: invokevirtual getRequired : ()Ljava/util/List;
    //   911: aload_1
    //   912: invokevirtual getRequired : ()Ljava/util/List;
    //   915: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   920: pop
    //   921: aload #9
    //   923: astore_3
    //   924: aload_2
    //   925: ifnonnull -> 1057
    //   928: iload #5
    //   930: ifeq -> 971
    //   933: aload #4
    //   935: aload #4
    //   937: invokevirtual getAllOf : ()Ljava/util/List;
    //   940: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   945: aload_0
    //   946: <illegal opcode> apply : (Lnet/portswigger/swagger/v2/util/ResolverFully;)Ljava/util/function/Function;
    //   951: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   956: invokestatic toList : ()Ljava/util/stream/Collector;
    //   959: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   964: checkcast java/util/List
    //   967: invokevirtual allOf : (Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   970: pop
    //   971: iload #7
    //   973: ifeq -> 1014
    //   976: aload #4
    //   978: aload #4
    //   980: invokevirtual getOneOf : ()Ljava/util/List;
    //   983: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   988: aload_0
    //   989: <illegal opcode> apply : (Lnet/portswigger/swagger/v2/util/ResolverFully;)Ljava/util/function/Function;
    //   994: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   999: invokestatic toList : ()Ljava/util/stream/Collector;
    //   1002: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   1007: checkcast java/util/List
    //   1010: invokevirtual oneOf : (Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1013: pop
    //   1014: iload #6
    //   1016: ifeq -> 1057
    //   1019: aload #4
    //   1021: aload #4
    //   1023: invokevirtual getAnyOf : ()Ljava/util/List;
    //   1026: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   1031: aload_0
    //   1032: <illegal opcode> apply : (Lnet/portswigger/swagger/v2/util/ResolverFully;)Ljava/util/function/Function;
    //   1037: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   1042: invokestatic toList : ()Ljava/util/stream/Collector;
    //   1045: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   1050: checkcast java/util/List
    //   1053: invokevirtual anyOf : (Ljava/util/List;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1056: pop
    //   1057: aload_3
    //   1058: invokevirtual getProperties : ()Ljava/util/Map;
    //   1061: ifnull -> 1317
    //   1064: aload_3
    //   1065: astore #4
    //   1067: new java/util/LinkedHashMap
    //   1070: dup
    //   1071: invokespecial <init> : ()V
    //   1074: astore #5
    //   1076: aload #4
    //   1078: invokevirtual getProperties : ()Ljava/util/Map;
    //   1081: astore #6
    //   1083: aload #6
    //   1085: invokeinterface keySet : ()Ljava/util/Set;
    //   1090: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1095: astore #7
    //   1097: aload #7
    //   1099: invokeinterface hasNext : ()Z
    //   1104: ifeq -> 1158
    //   1107: aload #7
    //   1109: invokeinterface next : ()Ljava/lang/Object;
    //   1114: checkcast java/lang/String
    //   1117: astore #8
    //   1119: aload #4
    //   1121: invokevirtual getProperties : ()Ljava/util/Map;
    //   1124: aload #8
    //   1126: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1131: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   1134: astore #9
    //   1136: aload #5
    //   1138: aload #8
    //   1140: aload_0
    //   1141: aload #8
    //   1143: aload #9
    //   1145: invokevirtual resolveSchemaProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1148: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1153: pop
    //   1154: aload_2
    //   1155: ifnonnull -> 1097
    //   1158: aload #5
    //   1160: invokeinterface keySet : ()Ljava/util/Set;
    //   1165: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1170: astore #7
    //   1172: aload #7
    //   1174: invokeinterface hasNext : ()Z
    //   1179: ifeq -> 1314
    //   1182: aload #7
    //   1184: invokeinterface next : ()Ljava/lang/Object;
    //   1189: checkcast java/lang/String
    //   1192: astore #8
    //   1194: aload #5
    //   1196: aload #8
    //   1198: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1203: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   1206: astore #9
    //   1208: aload #9
    //   1210: invokevirtual getProperties : ()Ljava/util/Map;
    //   1213: aload #4
    //   1215: invokevirtual getProperties : ()Ljava/util/Map;
    //   1218: if_acmpeq -> 1291
    //   1221: aload_0
    //   1222: aload #9
    //   1224: invokevirtual hasSchemaType : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   1227: ifne -> 1277
    //   1230: getstatic net/portswigger/swagger/v3/oas/models/SpecVersion.V30 : Lnet/portswigger/swagger/v3/oas/models/SpecVersion;
    //   1233: aload #9
    //   1235: invokevirtual getSpecVersion : ()Lnet/portswigger/swagger/v3/oas/models/SpecVersion;
    //   1238: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1241: ifeq -> 1262
    //   1244: aload #9
    //   1246: sipush #26289
    //   1249: sipush #-27219
    //   1252: invokestatic a : (II)Ljava/lang/String;
    //   1255: invokevirtual setType : (Ljava/lang/String;)V
    //   1258: aload_2
    //   1259: ifnonnull -> 1277
    //   1262: aload #9
    //   1264: sipush #26291
    //   1267: sipush #16019
    //   1270: invokestatic a : (II)Ljava/lang/String;
    //   1273: invokevirtual addType : (Ljava/lang/String;)Z
    //   1276: pop
    //   1277: aload #4
    //   1279: aload #8
    //   1281: aload #9
    //   1283: invokevirtual addProperties : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1286: pop
    //   1287: aload_2
    //   1288: ifnonnull -> 1310
    //   1291: new net/portswigger/swagger/v3/oas/models/media/ObjectSchema
    //   1294: dup
    //   1295: invokespecial <init> : ()V
    //   1298: astore #10
    //   1300: aload #4
    //   1302: aload #8
    //   1304: aload #10
    //   1306: invokevirtual addProperties : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   1309: pop
    //   1310: aload_2
    //   1311: ifnonnull -> 1172
    //   1314: aload #4
    //   1316: areturn
    //   1317: aload_3
    //   1318: areturn
  }
  
  protected String getSchemaType(Schema paramSchema) {
    return SpecVersion.V30.equals(paramSchema.getSpecVersion()) ? paramSchema.getType() : ((paramSchema.getTypes() != null && paramSchema.getTypes().size() == 1) ? paramSchema.getTypes().iterator().next() : null);
  }
  
  protected boolean hasSchemaType(Schema paramSchema) {
    return SpecVersion.V30.equals(paramSchema.getSpecVersion()) ? ((paramSchema.getType() != null)) : ((paramSchema.getTypes() != null && paramSchema.getTypes().size() > 0));
  }
  
  public Map<String, Example> resolveExample(Map<String, Example> paramMap) {
    Map<String, Example> map = paramMap;
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramMap != null)
      for (String str : paramMap.keySet()) {
        if (((Example)paramMap.get(str)).get$ref() != null) {
          String str1 = ((Example)paramMap.get(str)).get$ref();
          str1 = str1.substring(str1.lastIndexOf("/") + 1);
          Example example = this.examples.get(str1);
          map.replace(str, example);
        } 
        if (arrayOfZbqc == null)
          break; 
      }  
    return map;
  }
  
  private void aggregateSchemaCombinators(ComposedSchema paramComposedSchema, Schema paramSchema, List<Schema> paramList, Set<Object> paramSet1, Set<Object> paramSet2) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: new java/util/HashSet
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore #7
    //   12: aload_3
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #8
    //   20: astore #6
    //   22: aload #8
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 911
    //   32: aload #8
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   42: astore #9
    //   44: aload_0
    //   45: aload #9
    //   47: invokevirtual resolveSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   50: astore #10
    //   52: aload #10
    //   54: invokevirtual getProperties : ()Ljava/util/Map;
    //   57: astore #11
    //   59: aload #10
    //   61: invokevirtual getProperties : ()Ljava/util/Map;
    //   64: ifnull -> 202
    //   67: aload #11
    //   69: invokeinterface keySet : ()Ljava/util/Set;
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #12
    //   81: aload #12
    //   83: invokeinterface hasNext : ()Z
    //   88: ifeq -> 140
    //   91: aload #12
    //   93: invokeinterface next : ()Ljava/lang/Object;
    //   98: checkcast java/lang/String
    //   101: astore #13
    //   103: aload #10
    //   105: invokevirtual getProperties : ()Ljava/util/Map;
    //   108: aload #13
    //   110: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   115: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   118: astore #14
    //   120: aload_2
    //   121: aload #13
    //   123: aload_0
    //   124: aload #13
    //   126: aload #14
    //   128: invokevirtual resolveSchemaProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   131: invokevirtual addProperties : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   134: pop
    //   135: aload #6
    //   137: ifnonnull -> 81
    //   140: aload #10
    //   142: invokevirtual getRequired : ()Ljava/util/List;
    //   145: ifnull -> 202
    //   148: aload #10
    //   150: invokevirtual getRequired : ()Ljava/util/List;
    //   153: invokeinterface iterator : ()Ljava/util/Iterator;
    //   158: astore #12
    //   160: aload #12
    //   162: invokeinterface hasNext : ()Z
    //   167: ifeq -> 202
    //   170: aload #12
    //   172: invokeinterface next : ()Ljava/lang/Object;
    //   177: astore #13
    //   179: aload #13
    //   181: ifnull -> 197
    //   184: aload #7
    //   186: aload #13
    //   188: invokevirtual toString : ()Ljava/lang/String;
    //   191: invokeinterface add : (Ljava/lang/Object;)Z
    //   196: pop
    //   197: aload #6
    //   199: ifnonnull -> 160
    //   202: aload #9
    //   204: invokevirtual getAllOf : ()Ljava/util/List;
    //   207: ifnull -> 214
    //   210: iconst_1
    //   211: goto -> 215
    //   214: iconst_0
    //   215: istore #12
    //   217: aload #9
    //   219: invokevirtual getAnyOf : ()Ljava/util/List;
    //   222: ifnull -> 229
    //   225: iconst_1
    //   226: goto -> 230
    //   229: iconst_0
    //   230: istore #13
    //   232: aload #9
    //   234: invokevirtual getOneOf : ()Ljava/util/List;
    //   237: ifnull -> 244
    //   240: iconst_1
    //   241: goto -> 245
    //   244: iconst_0
    //   245: istore #14
    //   247: iload #12
    //   249: ifeq -> 267
    //   252: aload_0
    //   253: aload_1
    //   254: aload_2
    //   255: aload #9
    //   257: invokevirtual getAllOf : ()Ljava/util/List;
    //   260: aload #4
    //   262: aload #5
    //   264: invokevirtual aggregateSchemaCombinators : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    //   267: iload #14
    //   269: ifeq -> 287
    //   272: aload_0
    //   273: aload_1
    //   274: aload_2
    //   275: aload #9
    //   277: invokevirtual getOneOf : ()Ljava/util/List;
    //   280: aload #4
    //   282: aload #5
    //   284: invokevirtual aggregateSchemaCombinators : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    //   287: iload #13
    //   289: ifeq -> 307
    //   292: aload_0
    //   293: aload_1
    //   294: aload_2
    //   295: aload #9
    //   297: invokevirtual getAnyOf : ()Ljava/util/List;
    //   300: aload #4
    //   302: aload #5
    //   304: invokevirtual aggregateSchemaCombinators : (Lnet/portswigger/swagger/v3/oas/models/media/ComposedSchema;Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    //   307: aload #10
    //   309: invokevirtual getEnum : ()Ljava/util/List;
    //   312: ifnull -> 324
    //   315: aload_2
    //   316: aload #10
    //   318: invokevirtual getEnum : ()Ljava/util/List;
    //   321: invokevirtual setEnum : (Ljava/util/List;)V
    //   324: aload #10
    //   326: invokevirtual getExample : ()Ljava/lang/Object;
    //   329: ifnull -> 345
    //   332: aload #4
    //   334: aload #10
    //   336: invokevirtual getExample : ()Ljava/lang/Object;
    //   339: invokeinterface add : (Ljava/lang/Object;)Z
    //   344: pop
    //   345: aload_1
    //   346: invokevirtual getDefault : ()Ljava/lang/Object;
    //   349: ifnull -> 377
    //   352: aload #10
    //   354: invokevirtual getDefault : ()Ljava/lang/Object;
    //   357: ifnonnull -> 377
    //   360: aload #5
    //   362: aload_1
    //   363: invokevirtual getDefault : ()Ljava/lang/Object;
    //   366: invokeinterface add : (Ljava/lang/Object;)Z
    //   371: pop
    //   372: aload #6
    //   374: ifnonnull -> 390
    //   377: aload #5
    //   379: aload #10
    //   381: invokevirtual getDefault : ()Ljava/lang/Object;
    //   384: invokeinterface add : (Ljava/lang/Object;)Z
    //   389: pop
    //   390: aload #10
    //   392: invokevirtual getExtensions : ()Ljava/util/Map;
    //   395: ifnull -> 461
    //   398: aload #10
    //   400: invokevirtual getExtensions : ()Ljava/util/Map;
    //   403: astore #15
    //   405: aload #15
    //   407: invokeinterface keySet : ()Ljava/util/Set;
    //   412: invokeinterface iterator : ()Ljava/util/Iterator;
    //   417: astore #16
    //   419: aload #16
    //   421: invokeinterface hasNext : ()Z
    //   426: ifeq -> 461
    //   429: aload #16
    //   431: invokeinterface next : ()Ljava/lang/Object;
    //   436: checkcast java/lang/String
    //   439: astore #17
    //   441: aload_2
    //   442: aload #17
    //   444: aload #15
    //   446: aload #17
    //   448: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   453: invokevirtual addExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   456: aload #6
    //   458: ifnonnull -> 419
    //   461: aload_1
    //   462: invokevirtual getExtensions : ()Ljava/util/Map;
    //   465: ifnull -> 532
    //   468: aload_1
    //   469: invokevirtual getExtensions : ()Ljava/util/Map;
    //   472: astore #15
    //   474: aload #15
    //   476: invokeinterface keySet : ()Ljava/util/Set;
    //   481: invokeinterface iterator : ()Ljava/util/Iterator;
    //   486: astore #16
    //   488: aload #16
    //   490: invokeinterface hasNext : ()Z
    //   495: ifeq -> 532
    //   498: aload #16
    //   500: invokeinterface next : ()Ljava/lang/Object;
    //   505: checkcast java/lang/String
    //   508: astore #17
    //   510: aload_2
    //   511: aload #17
    //   513: aload_1
    //   514: invokevirtual getExtensions : ()Ljava/util/Map;
    //   517: aload #17
    //   519: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   524: invokevirtual addExtension : (Ljava/lang/String;Ljava/lang/Object;)V
    //   527: aload #6
    //   529: ifnonnull -> 488
    //   532: aload #10
    //   534: invokevirtual getMaximum : ()Ljava/math/BigDecimal;
    //   537: ifnull -> 549
    //   540: aload_2
    //   541: aload #10
    //   543: invokevirtual getMaximum : ()Ljava/math/BigDecimal;
    //   546: invokevirtual setMaximum : (Ljava/math/BigDecimal;)V
    //   549: aload #10
    //   551: invokevirtual getExclusiveMaximum : ()Ljava/lang/Boolean;
    //   554: ifnull -> 566
    //   557: aload_2
    //   558: aload #10
    //   560: invokevirtual getExclusiveMaximum : ()Ljava/lang/Boolean;
    //   563: invokevirtual setExclusiveMaximum : (Ljava/lang/Boolean;)V
    //   566: aload #10
    //   568: invokevirtual getMinimum : ()Ljava/math/BigDecimal;
    //   571: ifnull -> 583
    //   574: aload_2
    //   575: aload #10
    //   577: invokevirtual getMinimum : ()Ljava/math/BigDecimal;
    //   580: invokevirtual setMinimum : (Ljava/math/BigDecimal;)V
    //   583: aload #10
    //   585: invokevirtual getExclusiveMinimum : ()Ljava/lang/Boolean;
    //   588: ifnull -> 600
    //   591: aload_2
    //   592: aload #10
    //   594: invokevirtual getExclusiveMinimum : ()Ljava/lang/Boolean;
    //   597: invokevirtual setExclusiveMinimum : (Ljava/lang/Boolean;)V
    //   600: aload #10
    //   602: invokevirtual getMaxLength : ()Ljava/lang/Integer;
    //   605: ifnull -> 617
    //   608: aload_2
    //   609: aload #10
    //   611: invokevirtual getMaxLength : ()Ljava/lang/Integer;
    //   614: invokevirtual setMaxLength : (Ljava/lang/Integer;)V
    //   617: aload #10
    //   619: invokevirtual getMinLength : ()Ljava/lang/Integer;
    //   622: ifnull -> 634
    //   625: aload_2
    //   626: aload #10
    //   628: invokevirtual getMinLength : ()Ljava/lang/Integer;
    //   631: invokevirtual setMinLength : (Ljava/lang/Integer;)V
    //   634: aload #10
    //   636: invokevirtual getPattern : ()Ljava/lang/String;
    //   639: ifnull -> 651
    //   642: aload_2
    //   643: aload #10
    //   645: invokevirtual getPattern : ()Ljava/lang/String;
    //   648: invokevirtual setPattern : (Ljava/lang/String;)V
    //   651: aload #10
    //   653: invokevirtual getMaxItems : ()Ljava/lang/Integer;
    //   656: ifnull -> 668
    //   659: aload_2
    //   660: aload #10
    //   662: invokevirtual getMaxItems : ()Ljava/lang/Integer;
    //   665: invokevirtual setMaxItems : (Ljava/lang/Integer;)V
    //   668: aload #10
    //   670: invokevirtual getMinItems : ()Ljava/lang/Integer;
    //   673: ifnull -> 685
    //   676: aload_2
    //   677: aload #10
    //   679: invokevirtual getMinItems : ()Ljava/lang/Integer;
    //   682: invokevirtual setMinItems : (Ljava/lang/Integer;)V
    //   685: aload #10
    //   687: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   690: ifnull -> 702
    //   693: aload_2
    //   694: aload #10
    //   696: invokevirtual getUniqueItems : ()Ljava/lang/Boolean;
    //   699: invokevirtual setUniqueItems : (Ljava/lang/Boolean;)V
    //   702: aload #10
    //   704: invokevirtual getMaxProperties : ()Ljava/lang/Integer;
    //   707: ifnull -> 719
    //   710: aload_2
    //   711: aload #10
    //   713: invokevirtual getMaxProperties : ()Ljava/lang/Integer;
    //   716: invokevirtual setMaxProperties : (Ljava/lang/Integer;)V
    //   719: aload #10
    //   721: invokevirtual getMinProperties : ()Ljava/lang/Integer;
    //   724: ifnull -> 736
    //   727: aload_2
    //   728: aload #10
    //   730: invokevirtual getMinProperties : ()Ljava/lang/Integer;
    //   733: invokevirtual setMinProperties : (Ljava/lang/Integer;)V
    //   736: aload #10
    //   738: invokevirtual getType : ()Ljava/lang/String;
    //   741: ifnull -> 753
    //   744: aload_2
    //   745: aload #10
    //   747: invokevirtual getType : ()Ljava/lang/String;
    //   750: invokevirtual setType : (Ljava/lang/String;)V
    //   753: aload #10
    //   755: invokevirtual getDescription : ()Ljava/lang/String;
    //   758: ifnull -> 770
    //   761: aload_2
    //   762: aload #10
    //   764: invokevirtual getDescription : ()Ljava/lang/String;
    //   767: invokevirtual setDescription : (Ljava/lang/String;)V
    //   770: aload #10
    //   772: invokevirtual getFormat : ()Ljava/lang/String;
    //   775: ifnull -> 787
    //   778: aload_2
    //   779: aload #10
    //   781: invokevirtual getFormat : ()Ljava/lang/String;
    //   784: invokevirtual setFormat : (Ljava/lang/String;)V
    //   787: aload #10
    //   789: invokevirtual getNullable : ()Ljava/lang/Boolean;
    //   792: ifnull -> 804
    //   795: aload_2
    //   796: aload #10
    //   798: invokevirtual getNullable : ()Ljava/lang/Boolean;
    //   801: invokevirtual setNullable : (Ljava/lang/Boolean;)V
    //   804: aload #10
    //   806: invokevirtual getReadOnly : ()Ljava/lang/Boolean;
    //   809: ifnull -> 821
    //   812: aload_2
    //   813: aload #10
    //   815: invokevirtual getReadOnly : ()Ljava/lang/Boolean;
    //   818: invokevirtual setReadOnly : (Ljava/lang/Boolean;)V
    //   821: aload #10
    //   823: invokevirtual getWriteOnly : ()Ljava/lang/Boolean;
    //   826: ifnull -> 838
    //   829: aload_2
    //   830: aload #10
    //   832: invokevirtual getWriteOnly : ()Ljava/lang/Boolean;
    //   835: invokevirtual setWriteOnly : (Ljava/lang/Boolean;)V
    //   838: aload #10
    //   840: invokevirtual getExclusiveMaximumValue : ()Ljava/math/BigDecimal;
    //   843: ifnull -> 855
    //   846: aload_2
    //   847: aload #10
    //   849: invokevirtual getExclusiveMaximumValue : ()Ljava/math/BigDecimal;
    //   852: invokevirtual setExclusiveMaximumValue : (Ljava/math/BigDecimal;)V
    //   855: aload #10
    //   857: invokevirtual getExclusiveMinimumValue : ()Ljava/math/BigDecimal;
    //   860: ifnull -> 872
    //   863: aload_2
    //   864: aload #10
    //   866: invokevirtual getExclusiveMinimumValue : ()Ljava/math/BigDecimal;
    //   869: invokevirtual setExclusiveMinimumValue : (Ljava/math/BigDecimal;)V
    //   872: aload #10
    //   874: invokevirtual getMaxContains : ()Ljava/lang/Integer;
    //   877: ifnull -> 889
    //   880: aload_2
    //   881: aload #10
    //   883: invokevirtual getMaxContains : ()Ljava/lang/Integer;
    //   886: invokevirtual setMaxContains : (Ljava/lang/Integer;)V
    //   889: aload #10
    //   891: invokevirtual getMinContains : ()Ljava/lang/Integer;
    //   894: ifnull -> 906
    //   897: aload_2
    //   898: aload #10
    //   900: invokevirtual getMinContains : ()Ljava/lang/Integer;
    //   903: invokevirtual setMinContains : (Ljava/lang/Integer;)V
    //   906: aload #6
    //   908: ifnonnull -> 22
    //   911: aload #7
    //   913: invokeinterface size : ()I
    //   918: ifle -> 965
    //   921: new java/util/ArrayList
    //   924: dup
    //   925: invokespecial <init> : ()V
    //   928: astore #8
    //   930: aload_2
    //   931: invokevirtual getRequired : ()Ljava/util/List;
    //   934: ifnull -> 949
    //   937: aload #8
    //   939: aload_2
    //   940: invokevirtual getRequired : ()Ljava/util/List;
    //   943: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   948: pop
    //   949: aload #8
    //   951: aload #7
    //   953: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   958: pop
    //   959: aload_2
    //   960: aload #8
    //   962: invokevirtual setRequired : (Ljava/util/List;)V
    //   965: return
  }
  
  private Schema resolveSchemaProperty(String paramString, Schema paramSchema) {
    if (this.resolvedProperties.get(paramString) == null || this.resolvedProperties.get(paramString) != paramSchema) {
      Schema schema = resolveSchema(paramSchema);
      this.resolvedProperties.put(paramString, schema);
      return schema;
    } 
    return this.resolvedProperties.get(paramString);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÂÓqQ\\fÕ`H(Ñø3}³ý°*´¿é'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #98
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
    //   69: putstatic net/portswigger/swagger/v2/util/ResolverFully.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic net/portswigger/swagger/v2/util/ResolverFully.b : [Ljava/lang/String;
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
    //   152: bipush #120
    //   154: goto -> 184
    //   157: bipush #90
    //   159: goto -> 184
    //   162: bipush #107
    //   164: goto -> 184
    //   167: bipush #125
    //   169: goto -> 184
    //   172: bipush #46
    //   174: goto -> 184
    //   177: bipush #23
    //   179: goto -> 184
    //   182: bipush #26
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
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x66B1) & 0xFFFF;
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
      char c = '¨';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ResolverFully.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */