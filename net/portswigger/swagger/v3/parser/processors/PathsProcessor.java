package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.callbacks.Callback;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.parser.OpenAPIResolver;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class PathsProcessor {
  private final OpenAPI openAPI;
  
  private final ResolverCache cache;
  
  private final OpenAPIResolver.Settings settings;
  
  private final ParameterProcessor parameterProcessor;
  
  private final OperationProcessor operationProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public PathsProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, new OpenAPIResolver.Settings());
  }
  
  public PathsProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, OpenAPIResolver.Settings paramSettings) {
    this(paramResolverCache, paramOpenAPI, paramSettings, false);
  }
  
  public PathsProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, OpenAPIResolver.Settings paramSettings, boolean paramBoolean) {
    this.openAPI = paramOpenAPI;
    this.cache = paramResolverCache;
    this.settings = paramSettings;
    this.parameterProcessor = new ParameterProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.operationProcessor = new OperationProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public void processPaths() {
    Paths paths = this.openAPI.getPaths();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paths == null)
      return; 
    for (String str : paths.keySet()) {
      PathItem pathItem = (PathItem)paths.get(str);
      if (pathItem.get$ref() != null) {
        PathItem pathItem1 = processReferencePath(pathItem);
        String str1 = pathItem.get$ref().split("#")[0];
        if (pathItem1 != null) {
          updateRefs(pathItem1, str1);
          this.openAPI.path(str, pathItem1);
          pathItem = pathItem1;
        } 
      } 
      addParametersToEachOperation(pathItem);
      List<Parameter> list = this.parameterProcessor.processParameters(pathItem.getParameters());
      pathItem.setParameters(list);
      Map map = pathItem.readOperationsMap();
      for (PathItem.HttpMethod httpMethod : map.keySet()) {
        Operation operation = (Operation)map.get(httpMethod);
        this.operationProcessor.processOperation(operation);
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void addParametersToEachOperation(PathItem paramPathItem) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (this.settings.addParametersToEachOperation()) {
      List list = paramPathItem.getParameters();
      if (list != null) {
        List list1 = paramPathItem.readOperations();
        if (list1 != null)
          for (Operation operation : list1) {
            ArrayList<Parameter> arrayList = new ArrayList();
            List list2 = operation.getParameters();
            if (list2 == null) {
              list2 = new ArrayList();
              operation.setParameters(list2);
            } 
            for (Parameter parameter : list) {
              boolean bool = false;
              for (Parameter parameter1 : list2) {
                if (parameter.getIn() != null && parameter.getIn().equals(parameter1.getIn()) && parameter.getName().equals(parameter1.getName()))
                  bool = true; 
                if (arrayOfZbqc == null)
                  break; 
              } 
              if (!bool)
                arrayList.add(parameter); 
              if (arrayOfZbqc == null)
                break; 
            } 
            if (arrayList.size() > 0)
              operation.getParameters().addAll(0, arrayList); 
            if (arrayOfZbqc == null)
              break; 
          }  
      } 
      paramPathItem.setParameters(null);
    } 
  }
  
  protected void updateRefs(PathItem paramPathItem, String paramString) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramPathItem.getParameters() != null) {
      List list1 = paramPathItem.getParameters();
      for (Parameter parameter : list1) {
        updateRefs(parameter, paramString);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    List list = paramPathItem.readOperations();
    for (Operation operation : list) {
      if (operation.getParameters() != null)
        for (Parameter parameter : operation.getParameters()) {
          updateRefs(parameter, paramString);
          if (arrayOfZbqc == null)
            break; 
        }  
      if (operation.getResponses() != null)
        for (ApiResponse apiResponse : operation.getResponses().values()) {
          updateRefs(apiResponse, paramString);
          if (arrayOfZbqc == null)
            break; 
        }  
      if (operation.getRequestBody() != null)
        updateRefs(operation.getRequestBody(), paramString); 
      if (operation.getCallbacks() != null) {
        Map map = operation.getCallbacks();
        for (String str : map.keySet()) {
          Callback callback = (Callback)map.get(str);
          if (callback != null)
            for (String str1 : callback.keySet()) {
              PathItem pathItem = (PathItem)callback.get(str1);
              updateRefs(pathItem, paramString);
              if (arrayOfZbqc == null)
                break; 
            }  
          if (arrayOfZbqc == null)
            break; 
        } 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  protected void updateRefs(ApiResponse paramApiResponse, String paramString) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramApiResponse.get$ref() != null)
      paramApiResponse.set$ref(computeRef(paramApiResponse.get$ref(), paramString)); 
    if (paramApiResponse.getContent() != null) {
      Content content = paramApiResponse.getContent();
      for (String str : content.keySet()) {
        MediaType mediaType = (MediaType)content.get(str);
        if (mediaType.getSchema() != null)
          updateRefs(mediaType.getSchema(), paramString); 
        Map map = ((MediaType)content.get(str)).getExamples();
        if (map != null)
          for (Example example : map.values()) {
            updateRefs(example, paramString);
            if (arrayOfZbqc == null)
              break; 
          }  
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  protected void updateRefs(Example paramExample, String paramString) {
    if (paramExample.get$ref() != null)
      paramExample.set$ref(computeRef(paramExample.get$ref(), paramString)); 
  }
  
  protected void updateRefs(Parameter paramParameter, String paramString) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramParameter.get$ref() != null)
      paramParameter.set$ref(computeRef(paramParameter.get$ref(), paramString)); 
    if (paramParameter.getSchema() != null)
      updateRefs(paramParameter.getSchema(), paramString); 
    if (paramParameter.getContent() != null) {
      Content content = paramParameter.getContent();
      for (String str : content.keySet()) {
        MediaType mediaType = (MediaType)content.get(str);
        if (mediaType.getSchema() != null)
          updateRefs(mediaType.getSchema(), paramString); 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  protected void updateRefs(RequestBody paramRequestBody, String paramString) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (paramRequestBody.get$ref() != null)
      paramRequestBody.set$ref(computeRef(paramRequestBody.get$ref(), paramString)); 
    if (paramRequestBody.getContent() != null) {
      Content content = paramRequestBody.getContent();
      for (String str : content.keySet()) {
        MediaType mediaType = (MediaType)content.get(str);
        if (mediaType.getSchema() != null)
          updateRefs(mediaType.getSchema(), paramString); 
        Map map = ((MediaType)content.get(str)).getExamples();
        if (map != null)
          for (Example example : map.values()) {
            updateRefs(example, paramString);
            if (arrayOfZbqc == null)
              break; 
          }  
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null) {
        if (paramRequestBody.get$ref() != null);
        return;
      } 
      return;
    } 
    if (paramRequestBody.get$ref() != null);
  }
  
  protected void updateRefs(Schema paramSchema, String paramString) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokevirtual get$ref : ()Ljava/lang/String;
    //   8: ifnull -> 28
    //   11: aload_1
    //   12: aload_0
    //   13: aload_1
    //   14: invokevirtual get$ref : ()Ljava/lang/String;
    //   17: aload_2
    //   18: invokevirtual computeRef : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   21: invokevirtual set$ref : (Ljava/lang/String;)V
    //   24: aload_3
    //   25: ifnonnull -> 325
    //   28: aload_1
    //   29: invokevirtual getProperties : ()Ljava/util/Map;
    //   32: ifnull -> 118
    //   35: aload_1
    //   36: invokevirtual getProperties : ()Ljava/util/Map;
    //   39: ifnull -> 325
    //   42: aload_1
    //   43: invokevirtual getProperties : ()Ljava/util/Map;
    //   46: astore #4
    //   48: aload #4
    //   50: invokeinterface keySet : ()Ljava/util/Set;
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #5
    //   62: aload #5
    //   64: invokeinterface hasNext : ()Z
    //   69: ifeq -> 114
    //   72: aload #5
    //   74: invokeinterface next : ()Ljava/lang/Object;
    //   79: checkcast java/lang/String
    //   82: astore #6
    //   84: aload #4
    //   86: aload #6
    //   88: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   93: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   96: astore #7
    //   98: aload #7
    //   100: ifnull -> 110
    //   103: aload_0
    //   104: aload #7
    //   106: aload_2
    //   107: invokevirtual updateRefs : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   110: aload_3
    //   111: ifnonnull -> 62
    //   114: aload_3
    //   115: ifnonnull -> 325
    //   118: aload_1
    //   119: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   122: ifeq -> 294
    //   125: aload_1
    //   126: checkcast net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   129: astore #4
    //   131: aload #4
    //   133: invokevirtual getAllOf : ()Ljava/util/List;
    //   136: ifnull -> 184
    //   139: aload #4
    //   141: invokevirtual getAllOf : ()Ljava/util/List;
    //   144: invokeinterface iterator : ()Ljava/util/Iterator;
    //   149: astore #5
    //   151: aload #5
    //   153: invokeinterface hasNext : ()Z
    //   158: ifeq -> 184
    //   161: aload #5
    //   163: invokeinterface next : ()Ljava/lang/Object;
    //   168: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   171: astore #6
    //   173: aload_0
    //   174: aload #6
    //   176: aload_2
    //   177: invokevirtual updateRefs : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   180: aload_3
    //   181: ifnonnull -> 151
    //   184: aload #4
    //   186: invokevirtual getAnyOf : ()Ljava/util/List;
    //   189: ifnull -> 237
    //   192: aload #4
    //   194: invokevirtual getAnyOf : ()Ljava/util/List;
    //   197: invokeinterface iterator : ()Ljava/util/Iterator;
    //   202: astore #5
    //   204: aload #5
    //   206: invokeinterface hasNext : ()Z
    //   211: ifeq -> 237
    //   214: aload #5
    //   216: invokeinterface next : ()Ljava/lang/Object;
    //   221: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   224: astore #6
    //   226: aload_0
    //   227: aload #6
    //   229: aload_2
    //   230: invokevirtual updateRefs : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   233: aload_3
    //   234: ifnonnull -> 204
    //   237: aload #4
    //   239: invokevirtual getOneOf : ()Ljava/util/List;
    //   242: ifnull -> 290
    //   245: aload #4
    //   247: invokevirtual getOneOf : ()Ljava/util/List;
    //   250: invokeinterface iterator : ()Ljava/util/Iterator;
    //   255: astore #5
    //   257: aload #5
    //   259: invokeinterface hasNext : ()Z
    //   264: ifeq -> 290
    //   267: aload #5
    //   269: invokeinterface next : ()Ljava/lang/Object;
    //   274: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   277: astore #6
    //   279: aload_0
    //   280: aload #6
    //   282: aload_2
    //   283: invokevirtual updateRefs : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   286: aload_3
    //   287: ifnonnull -> 257
    //   290: aload_3
    //   291: ifnonnull -> 325
    //   294: aload_1
    //   295: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   298: ifeq -> 325
    //   301: aload_1
    //   302: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   305: astore #4
    //   307: aload #4
    //   309: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   312: ifnull -> 325
    //   315: aload_0
    //   316: aload #4
    //   318: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   321: aload_2
    //   322: invokevirtual updateRefs : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   325: return
  }
  
  protected boolean isLocalRef(String paramString) {
    return paramString.startsWith("#");
  }
  
  protected boolean isAbsoluteRef(String paramString) {
    return !paramString.startsWith(".");
  }
  
  private boolean isInternalSchemaRef(String paramString) {
    return paramString.startsWith(a(-4606, 13478));
  }
  
  protected String computeRef(String paramString1, String paramString2) {
    return (isLocalRef(paramString1) && !isInternalSchemaRef(paramString1)) ? computeLocalRef(paramString1, paramString2) : (isAbsoluteRef(paramString1) ? paramString1 : (isInternalSchemaRef(paramString1) ? paramString1 : computeRelativeRef(paramString1, paramString2)));
  }
  
  protected String computeRelativeRef(String paramString1, String paramString2) {
    if (paramString1.startsWith(a(-4605, 21973)))
      return paramString1; 
    int i = paramString2.lastIndexOf('/');
    return (i != -1) ? (paramString2.substring(0, i + 1) + paramString2.substring(0, i + 1)) : (paramString2 + paramString2);
  }
  
  protected String computeLocalRef(String paramString1, String paramString2) {
    return paramString2 + paramString2;
  }
  
  public PathItem processReferencePath(PathItem paramPathItem) {
    RefFormat refFormat = RefUtils.computeRefFormat(paramPathItem.get$ref());
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    String str = paramPathItem.get$ref();
    if (RefUtils.isAnExternalRefFormat(refFormat)) {
      paramPathItem = this.externalRefProcessor.processRefToExternalPathItem(str, refFormat);
      return (arrayOfZbqc == null) ? (PathItem)this.cache.loadRef(paramPathItem.get$ref(), refFormat, PathItem.class) : paramPathItem;
    } 
    return (PathItem)this.cache.loadRef(paramPathItem.get$ref(), refFormat, PathItem.class);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'oÍwÌ87H~z¢+Ý:¬AË4ZË'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #20
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #30
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
    //   69: putstatic net/portswigger/swagger/v3/parser/processors/PathsProcessor.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic net/portswigger/swagger/v3/parser/processors/PathsProcessor.b : [Ljava/lang/String;
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
    //   152: bipush #74
    //   154: goto -> 184
    //   157: bipush #90
    //   159: goto -> 184
    //   162: bipush #42
    //   164: goto -> 184
    //   167: bipush #70
    //   169: goto -> 184
    //   172: bipush #44
    //   174: goto -> 184
    //   177: bipush #73
    //   179: goto -> 184
    //   182: bipush #105
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
    int i = (paramInt1 ^ 0xFFFFEE02) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\PathsProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */