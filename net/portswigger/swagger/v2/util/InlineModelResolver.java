package net.portswigger.swagger.v2.util;

import burp.Zbqc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.util.Json;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.media.ArraySchema;
import net.portswigger.swagger.v3.oas.models.media.ComposedSchema;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.media.XML;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;

public class InlineModelResolver {
  private OpenAPI openAPI;
  
  Map<String, Schema> addedModels = new HashMap<>();
  
  Map<String, String> generatedSignature = new HashMap<>();
  
  private final boolean flattenComposedSchemas;
  
  private final boolean camelCaseFlattenNaming;
  
  private boolean skipMatches;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public InlineModelResolver() {
    this(false, false, false);
  }
  
  public InlineModelResolver(boolean paramBoolean1, boolean paramBoolean2) {
    this(paramBoolean1, paramBoolean2, false);
  }
  
  public InlineModelResolver(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this.flattenComposedSchemas = paramBoolean1;
    this.camelCaseFlattenNaming = paramBoolean2;
    this.skipMatches = paramBoolean3;
  }
  
  public void flatten(OpenAPI paramOpenAPI) {
    this.openAPI = paramOpenAPI;
    if (paramOpenAPI.getComponents() != null && paramOpenAPI.getComponents().getSchemas() == null)
      paramOpenAPI.getComponents().setSchemas(new HashMap<>()); 
    Paths paths = paramOpenAPI.getPaths();
    if (paramOpenAPI.getComponents() == null)
      paramOpenAPI.setComponents(new Components()); 
    Map<String, Schema> map = paramOpenAPI.getComponents().getSchemas();
    flattenPaths((Map<String, PathItem>)paths);
    flattenDefinitions(map);
  }
  
  private void flattenPaths(Map<String, PathItem> paramMap) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramMap == null)
      return; 
    for (String str : paramMap.keySet()) {
      PathItem pathItem = paramMap.get(str);
      for (Operation operation : pathItem.readOperations()) {
        flattenBody(str, operation.getRequestBody());
        flattenParams(str, operation.getParameters());
        flattenResponses(str, (Map<String, ApiResponse>)operation.getResponses());
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void flattenBody(String paramString, RequestBody paramRequestBody) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: ifnonnull -> 9
    //   8: return
    //   9: aload_2
    //   10: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   13: astore #4
    //   15: aload #4
    //   17: ifnonnull -> 21
    //   20: return
    //   21: aload #4
    //   23: invokeinterface keySet : ()Ljava/util/Set;
    //   28: invokeinterface iterator : ()Ljava/util/Iterator;
    //   33: astore #5
    //   35: aload #5
    //   37: invokeinterface hasNext : ()Z
    //   42: ifeq -> 525
    //   45: aload #5
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: checkcast java/lang/String
    //   55: astore #6
    //   57: aload #4
    //   59: aload #6
    //   61: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: ifnull -> 521
    //   69: aload #4
    //   71: aload #6
    //   73: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   78: checkcast net/portswigger/swagger/v3/oas/models/media/MediaType
    //   81: astore #7
    //   83: aload #7
    //   85: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   88: ifnull -> 521
    //   91: aload #7
    //   93: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   96: astore #8
    //   98: aload_1
    //   99: invokestatic pathBody : (Ljava/lang/String;)Ljava/lang/String;
    //   102: astore #9
    //   104: aload #8
    //   106: invokevirtual getProperties : ()Ljava/util/Map;
    //   109: ifnull -> 192
    //   112: aload #8
    //   114: invokevirtual getProperties : ()Ljava/util/Map;
    //   117: invokeinterface size : ()I
    //   122: ifle -> 192
    //   125: aload_0
    //   126: aload #8
    //   128: invokevirtual getProperties : ()Ljava/util/Map;
    //   131: aload_1
    //   132: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   135: aload_0
    //   136: aload #8
    //   138: invokevirtual getTitle : ()Ljava/lang/String;
    //   141: aload #9
    //   143: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   146: astore #10
    //   148: aload #7
    //   150: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: aload #10
    //   159: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   162: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   165: aload_0
    //   166: aload #10
    //   168: aload #8
    //   170: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   173: aload_0
    //   174: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   177: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   180: aload #10
    //   182: aload #8
    //   184: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   187: pop
    //   188: aload_3
    //   189: ifnonnull -> 521
    //   192: aload #8
    //   194: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   197: ifeq -> 268
    //   200: aload_0
    //   201: aload #8
    //   203: aload_1
    //   204: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   207: aload #8
    //   209: invokevirtual get$ref : ()Ljava/lang/String;
    //   212: ifnonnull -> 521
    //   215: aload_0
    //   216: aload #8
    //   218: invokevirtual getTitle : ()Ljava/lang/String;
    //   221: aload #9
    //   223: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   226: astore #10
    //   228: aload #7
    //   230: aload_0
    //   231: aload #10
    //   233: aload #8
    //   235: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   238: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   241: aload_0
    //   242: aload #10
    //   244: aload #8
    //   246: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   249: aload_0
    //   250: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   253: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   256: aload #10
    //   258: aload #8
    //   260: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   263: pop
    //   264: aload_3
    //   265: ifnonnull -> 521
    //   268: aload #8
    //   270: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   273: ifeq -> 521
    //   276: aload #8
    //   278: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   281: astore #10
    //   283: aload #10
    //   285: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   288: astore #11
    //   290: aload_0
    //   291: aload #11
    //   293: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   296: ifeq -> 521
    //   299: aload #11
    //   301: invokevirtual getProperties : ()Ljava/util/Map;
    //   304: ifnull -> 421
    //   307: aload #11
    //   309: invokevirtual getProperties : ()Ljava/util/Map;
    //   312: invokeinterface size : ()I
    //   317: ifle -> 421
    //   320: aload_0
    //   321: aload #11
    //   323: invokevirtual getProperties : ()Ljava/util/Map;
    //   326: aload_1
    //   327: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   330: aload_0
    //   331: aload #11
    //   333: invokevirtual getTitle : ()Ljava/lang/String;
    //   336: aload #9
    //   338: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   341: astore #12
    //   343: aload_0
    //   344: aload #11
    //   346: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   349: astore #13
    //   351: aload #13
    //   353: ifnull -> 377
    //   356: aload #10
    //   358: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   361: dup
    //   362: invokespecial <init> : ()V
    //   365: aload #13
    //   367: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   370: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   373: aload_3
    //   374: ifnonnull -> 417
    //   377: aload #10
    //   379: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   382: dup
    //   383: invokespecial <init> : ()V
    //   386: aload #12
    //   388: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   391: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   394: aload_0
    //   395: aload #12
    //   397: aload #11
    //   399: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   402: aload_0
    //   403: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   406: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   409: aload #12
    //   411: aload #11
    //   413: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   416: pop
    //   417: aload_3
    //   418: ifnonnull -> 521
    //   421: aload #11
    //   423: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   426: ifeq -> 521
    //   429: aload_0
    //   430: getfield flattenComposedSchemas : Z
    //   433: ifeq -> 521
    //   436: aload_0
    //   437: aload #11
    //   439: aload #6
    //   441: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   444: aload #11
    //   446: invokevirtual get$ref : ()Ljava/lang/String;
    //   449: ifnonnull -> 521
    //   452: aload_0
    //   453: aload #11
    //   455: invokevirtual getTitle : ()Ljava/lang/String;
    //   458: aload #6
    //   460: aload_1
    //   461: sipush #1393
    //   464: sipush #-12899
    //   467: invokestatic a : (II)Ljava/lang/String;
    //   470: dup_x2
    //   471: pop
    //   472: ldc '_'
    //   474: swap
    //   475: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   480: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   483: astore #12
    //   485: aload #10
    //   487: aload_0
    //   488: aload #12
    //   490: aload #11
    //   492: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   495: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   498: aload_0
    //   499: aload #12
    //   501: aload #11
    //   503: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   506: aload_0
    //   507: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   510: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   513: aload #12
    //   515: aload #11
    //   517: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   520: pop
    //   521: aload_3
    //   522: ifnonnull -> 35
    //   525: return
  }
  
  private void flattenParams(String paramString, List<Parameter> paramList) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: ifnonnull -> 9
    //   8: return
    //   9: aload_2
    //   10: invokeinterface iterator : ()Ljava/util/Iterator;
    //   15: astore #4
    //   17: aload #4
    //   19: invokeinterface hasNext : ()Z
    //   24: ifeq -> 510
    //   27: aload #4
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   37: astore #5
    //   39: aload #5
    //   41: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   44: ifnull -> 506
    //   47: aload #5
    //   49: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   52: astore #6
    //   54: aload #6
    //   56: invokevirtual getProperties : ()Ljava/util/Map;
    //   59: ifnull -> 181
    //   62: aload #6
    //   64: invokevirtual getType : ()Ljava/lang/String;
    //   67: ifnull -> 90
    //   70: sipush #1405
    //   73: sipush #17934
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: aload #6
    //   81: invokevirtual getType : ()Ljava/lang/String;
    //   84: invokevirtual equals : (Ljava/lang/Object;)Z
    //   87: ifeq -> 506
    //   90: aload #6
    //   92: invokevirtual getProperties : ()Ljava/util/Map;
    //   95: ifnull -> 506
    //   98: aload #6
    //   100: invokevirtual getProperties : ()Ljava/util/Map;
    //   103: invokeinterface size : ()I
    //   108: ifle -> 506
    //   111: aload_0
    //   112: aload #6
    //   114: invokevirtual getProperties : ()Ljava/util/Map;
    //   117: aload_1
    //   118: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   121: aload_0
    //   122: aload #6
    //   124: invokevirtual getTitle : ()Ljava/lang/String;
    //   127: aload #5
    //   129: invokevirtual getName : ()Ljava/lang/String;
    //   132: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   135: astore #7
    //   137: aload #5
    //   139: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: aload #7
    //   148: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   151: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   154: aload_0
    //   155: aload #7
    //   157: aload #6
    //   159: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   162: aload_0
    //   163: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   166: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   169: aload #7
    //   171: aload #6
    //   173: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   176: pop
    //   177: aload_3
    //   178: ifnonnull -> 506
    //   181: aload #6
    //   183: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   186: ifeq -> 249
    //   189: aload_0
    //   190: aload #6
    //   192: invokevirtual getTitle : ()Ljava/lang/String;
    //   195: aload #5
    //   197: invokevirtual getName : ()Ljava/lang/String;
    //   200: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   203: astore #7
    //   205: aload #5
    //   207: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   210: dup
    //   211: invokespecial <init> : ()V
    //   214: aload #7
    //   216: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   219: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   222: aload_0
    //   223: aload #7
    //   225: aload #6
    //   227: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   230: aload_0
    //   231: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   234: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   237: aload #7
    //   239: aload #6
    //   241: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   244: pop
    //   245: aload_3
    //   246: ifnonnull -> 506
    //   249: aload #6
    //   251: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   254: ifeq -> 506
    //   257: aload #6
    //   259: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   262: astore #7
    //   264: aload #7
    //   266: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   269: astore #8
    //   271: aload_0
    //   272: aload #8
    //   274: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   277: ifeq -> 506
    //   280: aload #8
    //   282: invokevirtual getProperties : ()Ljava/util/Map;
    //   285: ifnull -> 405
    //   288: aload #8
    //   290: invokevirtual getProperties : ()Ljava/util/Map;
    //   293: invokeinterface size : ()I
    //   298: ifle -> 405
    //   301: aload_0
    //   302: aload #8
    //   304: invokevirtual getProperties : ()Ljava/util/Map;
    //   307: aload_1
    //   308: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   311: aload_0
    //   312: aload #8
    //   314: invokevirtual getTitle : ()Ljava/lang/String;
    //   317: aload #5
    //   319: invokevirtual getName : ()Ljava/lang/String;
    //   322: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   325: astore #9
    //   327: aload_0
    //   328: aload #8
    //   330: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   333: astore #10
    //   335: aload #10
    //   337: ifnull -> 361
    //   340: aload #7
    //   342: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   345: dup
    //   346: invokespecial <init> : ()V
    //   349: aload #10
    //   351: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   354: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   357: aload_3
    //   358: ifnonnull -> 401
    //   361: aload #7
    //   363: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   366: dup
    //   367: invokespecial <init> : ()V
    //   370: aload #9
    //   372: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   375: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   378: aload_0
    //   379: aload #9
    //   381: aload #7
    //   383: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   386: aload_0
    //   387: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   390: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   393: aload #9
    //   395: aload #7
    //   397: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   400: pop
    //   401: aload_3
    //   402: ifnonnull -> 506
    //   405: aload #8
    //   407: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   410: ifeq -> 506
    //   413: aload_0
    //   414: getfield flattenComposedSchemas : Z
    //   417: ifeq -> 506
    //   420: aload_0
    //   421: aload #8
    //   423: aload #5
    //   425: invokevirtual getName : ()Ljava/lang/String;
    //   428: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   431: aload #8
    //   433: invokevirtual get$ref : ()Ljava/lang/String;
    //   436: ifnonnull -> 506
    //   439: aload_0
    //   440: aload #8
    //   442: invokevirtual getTitle : ()Ljava/lang/String;
    //   445: aload #5
    //   447: invokevirtual getName : ()Ljava/lang/String;
    //   450: sipush #1392
    //   453: sipush #24859
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: swap
    //   460: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   465: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   468: astore #9
    //   470: aload #7
    //   472: aload_0
    //   473: aload #9
    //   475: aload #8
    //   477: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   480: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   483: aload_0
    //   484: aload #9
    //   486: aload #8
    //   488: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   491: aload_0
    //   492: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   495: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   498: aload #9
    //   500: aload #8
    //   502: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   505: pop
    //   506: aload_3
    //   507: ifnonnull -> 17
    //   510: return
  }
  
  private void flattenResponses(String paramString, Map<String, ApiResponse> paramMap) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_2
    //   5: ifnonnull -> 9
    //   8: return
    //   9: aload_2
    //   10: invokeinterface keySet : ()Ljava/util/Set;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore #4
    //   22: aload #4
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 544
    //   32: aload #4
    //   34: invokeinterface next : ()Ljava/lang/Object;
    //   39: checkcast java/lang/String
    //   42: astore #5
    //   44: aload_2
    //   45: aload #5
    //   47: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast net/portswigger/swagger/v3/oas/models/responses/ApiResponse
    //   55: astore #6
    //   57: aload #6
    //   59: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   62: ifnull -> 540
    //   65: aload #6
    //   67: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   70: astore #7
    //   72: aload #7
    //   74: invokeinterface keySet : ()Ljava/util/Set;
    //   79: invokeinterface iterator : ()Ljava/util/Iterator;
    //   84: astore #8
    //   86: aload #8
    //   88: invokeinterface hasNext : ()Z
    //   93: ifeq -> 540
    //   96: aload #8
    //   98: invokeinterface next : ()Ljava/lang/Object;
    //   103: checkcast java/lang/String
    //   106: astore #9
    //   108: aload #7
    //   110: aload #9
    //   112: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   117: ifnull -> 536
    //   120: aload #7
    //   122: aload #9
    //   124: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   129: checkcast net/portswigger/swagger/v3/oas/models/media/MediaType
    //   132: astore #10
    //   134: aload #10
    //   136: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   139: ifnull -> 536
    //   142: aload #10
    //   144: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   147: astore #11
    //   149: aload_0
    //   150: aload #11
    //   152: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   155: ifeq -> 422
    //   158: aload #11
    //   160: invokevirtual getProperties : ()Ljava/util/Map;
    //   163: ifnull -> 179
    //   166: aload #11
    //   168: invokevirtual getProperties : ()Ljava/util/Map;
    //   171: invokeinterface size : ()I
    //   176: ifgt -> 187
    //   179: aload #11
    //   181: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   184: ifeq -> 285
    //   187: aload_0
    //   188: aload #11
    //   190: invokevirtual getTitle : ()Ljava/lang/String;
    //   193: aload #5
    //   195: sipush #1381
    //   198: sipush #-4201
    //   201: invokestatic a : (II)Ljava/lang/String;
    //   204: swap
    //   205: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   210: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   213: astore #12
    //   215: aload_0
    //   216: aload #11
    //   218: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   221: astore #13
    //   223: aload #13
    //   225: ifnull -> 245
    //   228: aload #10
    //   230: aload_0
    //   231: aload #13
    //   233: aload #11
    //   235: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   238: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   241: aload_3
    //   242: ifnonnull -> 281
    //   245: aload #10
    //   247: aload_0
    //   248: aload #12
    //   250: aload #11
    //   252: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   255: invokevirtual setSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   258: aload_0
    //   259: aload #12
    //   261: aload #11
    //   263: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   266: aload_0
    //   267: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   270: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   273: aload #12
    //   275: aload #11
    //   277: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   280: pop
    //   281: aload_3
    //   282: ifnonnull -> 536
    //   285: aload #11
    //   287: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   290: ifnull -> 536
    //   293: aload #11
    //   295: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   298: instanceof java/lang/Boolean
    //   301: ifne -> 536
    //   304: aload #11
    //   306: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   309: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   312: astore #12
    //   314: aload_0
    //   315: aload #12
    //   317: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   320: ifeq -> 357
    //   323: aload #5
    //   325: sipush #1395
    //   328: sipush #13949
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: swap
    //   335: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   340: astore #5
    //   342: aload_0
    //   343: aload #12
    //   345: aload #5
    //   347: aload_1
    //   348: aload #11
    //   350: invokevirtual flattenMapSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   353: aload_3
    //   354: ifnonnull -> 418
    //   357: aload #12
    //   359: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   362: ifeq -> 418
    //   365: aload #12
    //   367: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   370: astore #13
    //   372: aload #13
    //   374: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   377: astore #14
    //   379: aload_0
    //   380: aload #14
    //   382: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   385: ifeq -> 418
    //   388: aload #5
    //   390: sipush #1401
    //   393: sipush #1319
    //   396: invokestatic a : (II)Ljava/lang/String;
    //   399: swap
    //   400: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   405: astore #5
    //   407: aload_0
    //   408: aload #14
    //   410: aload #5
    //   412: aload_1
    //   413: aload #11
    //   415: invokevirtual flattenMapSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   418: aload_3
    //   419: ifnonnull -> 536
    //   422: aload #11
    //   424: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   427: ifeq -> 468
    //   430: aload #11
    //   432: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   435: astore #12
    //   437: aload #12
    //   439: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   442: astore #13
    //   444: aload_0
    //   445: aload #13
    //   447: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   450: ifeq -> 464
    //   453: aload_0
    //   454: aload #13
    //   456: aload #5
    //   458: aload_1
    //   459: aload #12
    //   461: invokevirtual flattenArraySchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/ArraySchema;)V
    //   464: aload_3
    //   465: ifnonnull -> 536
    //   468: aload #11
    //   470: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   473: ifnull -> 536
    //   476: aload #11
    //   478: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   481: instanceof java/lang/Boolean
    //   484: ifne -> 536
    //   487: aload #11
    //   489: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   492: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   495: astore #12
    //   497: aload_0
    //   498: aload #12
    //   500: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   503: ifeq -> 536
    //   506: aload #5
    //   508: sipush #1377
    //   511: sipush #30940
    //   514: invokestatic a : (II)Ljava/lang/String;
    //   517: swap
    //   518: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   523: astore #5
    //   525: aload_0
    //   526: aload #12
    //   528: aload #5
    //   530: aload_1
    //   531: aload #11
    //   533: invokevirtual flattenMapSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   536: aload_3
    //   537: ifnonnull -> 86
    //   540: aload_3
    //   541: ifnonnull -> 22
    //   544: return
  }
  
  private void flattenDefinitions(Map<String, Schema> paramMap) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 9
    //   8: return
    //   9: new java/util/ArrayList
    //   12: dup
    //   13: aload_1
    //   14: invokeinterface keySet : ()Ljava/util/Set;
    //   19: invokespecial <init> : (Ljava/util/Collection;)V
    //   22: astore_3
    //   23: aload_3
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #4
    //   31: aload #4
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 618
    //   41: aload #4
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast java/lang/String
    //   51: astore #5
    //   53: aload_1
    //   54: aload #5
    //   56: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   61: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   64: astore #6
    //   66: aload #6
    //   68: invokevirtual getProperties : ()Ljava/util/Map;
    //   71: ifnull -> 99
    //   74: aload #6
    //   76: invokevirtual getProperties : ()Ljava/util/Map;
    //   79: astore #7
    //   81: aload_0
    //   82: aload #7
    //   84: aload #5
    //   86: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   89: aload_0
    //   90: aload #6
    //   92: invokevirtual fixStringModel : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   95: aload_2
    //   96: ifnonnull -> 614
    //   99: aload #6
    //   101: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   104: ifeq -> 355
    //   107: aload #6
    //   109: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   112: astore #7
    //   114: aload #7
    //   116: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   119: astore #8
    //   121: aload_0
    //   122: aload #8
    //   124: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   127: ifeq -> 351
    //   130: aload #8
    //   132: invokevirtual getProperties : ()Ljava/util/Map;
    //   135: ifnull -> 256
    //   138: aload #8
    //   140: invokevirtual getProperties : ()Ljava/util/Map;
    //   143: invokeinterface size : ()I
    //   148: ifle -> 256
    //   151: aload_0
    //   152: aload #8
    //   154: invokevirtual getTitle : ()Ljava/lang/String;
    //   157: aload #5
    //   159: sipush #1406
    //   162: sipush #12085
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   173: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   176: astore #9
    //   178: aload_0
    //   179: aload #8
    //   181: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   184: astore #10
    //   186: aload #10
    //   188: ifnonnull -> 235
    //   191: aload_0
    //   192: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   195: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   198: aload #9
    //   200: aload #8
    //   202: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   205: pop
    //   206: aload_0
    //   207: aload #9
    //   209: aload #8
    //   211: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   214: aload #7
    //   216: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   219: dup
    //   220: invokespecial <init> : ()V
    //   223: aload #9
    //   225: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   228: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   231: aload_2
    //   232: ifnonnull -> 252
    //   235: aload #7
    //   237: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   240: dup
    //   241: invokespecial <init> : ()V
    //   244: aload #10
    //   246: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   249: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   252: aload_2
    //   253: ifnonnull -> 351
    //   256: aload #8
    //   258: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   261: ifeq -> 351
    //   264: aload_0
    //   265: getfield flattenComposedSchemas : Z
    //   268: ifeq -> 351
    //   271: aload_0
    //   272: aload #8
    //   274: aload #5
    //   276: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   279: aload #8
    //   281: invokevirtual get$ref : ()Ljava/lang/String;
    //   284: ifnonnull -> 351
    //   287: aload_0
    //   288: aload #8
    //   290: invokevirtual getTitle : ()Ljava/lang/String;
    //   293: aload #5
    //   295: sipush #1380
    //   298: sipush #768
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: swap
    //   305: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   310: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   313: astore #5
    //   315: aload #7
    //   317: aload_0
    //   318: aload #5
    //   320: aload #8
    //   322: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   325: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   328: aload_0
    //   329: aload #5
    //   331: aload #8
    //   333: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   336: aload_0
    //   337: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   340: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   343: aload #5
    //   345: aload #8
    //   347: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   350: pop
    //   351: aload_2
    //   352: ifnonnull -> 614
    //   355: aload #6
    //   357: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   360: ifeq -> 614
    //   363: aload #6
    //   365: checkcast net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   368: astore #7
    //   370: ldc ''
    //   372: astore #8
    //   374: aconst_null
    //   375: astore #9
    //   377: aload #7
    //   379: invokevirtual getAllOf : ()Ljava/util/List;
    //   382: ifnull -> 406
    //   385: aload #7
    //   387: invokevirtual getAllOf : ()Ljava/util/List;
    //   390: astore #9
    //   392: sipush #1397
    //   395: sipush #-20400
    //   398: invokestatic a : (II)Ljava/lang/String;
    //   401: astore #8
    //   403: goto -> 461
    //   406: aload #7
    //   408: invokevirtual getAnyOf : ()Ljava/util/List;
    //   411: ifnull -> 435
    //   414: aload #7
    //   416: invokevirtual getAnyOf : ()Ljava/util/List;
    //   419: astore #9
    //   421: sipush #1379
    //   424: sipush #-15937
    //   427: invokestatic a : (II)Ljava/lang/String;
    //   430: astore #8
    //   432: goto -> 461
    //   435: aload #7
    //   437: invokevirtual getOneOf : ()Ljava/util/List;
    //   440: ifnull -> 461
    //   443: aload #7
    //   445: invokevirtual getOneOf : ()Ljava/util/List;
    //   448: astore #9
    //   450: sipush #1399
    //   453: sipush #15636
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: astore #8
    //   461: iconst_0
    //   462: istore #10
    //   464: iload #10
    //   466: aload #9
    //   468: invokeinterface size : ()I
    //   473: if_icmpge -> 614
    //   476: aload #9
    //   478: iload #10
    //   480: invokeinterface get : (I)Ljava/lang/Object;
    //   485: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   488: invokevirtual get$ref : ()Ljava/lang/String;
    //   491: ifnonnull -> 607
    //   494: aload #9
    //   496: iload #10
    //   498: invokeinterface get : (I)Ljava/lang/Object;
    //   503: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   506: astore #11
    //   508: aload #11
    //   510: invokevirtual getProperties : ()Ljava/util/Map;
    //   513: ifnull -> 527
    //   516: aload_0
    //   517: aload #11
    //   519: invokevirtual getProperties : ()Ljava/util/Map;
    //   522: aload #5
    //   524: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   527: aload_0
    //   528: getfield flattenComposedSchemas : Z
    //   531: ifeq -> 607
    //   534: iload #10
    //   536: iconst_1
    //   537: iadd
    //   538: istore #12
    //   540: aload_0
    //   541: aload #11
    //   543: invokevirtual getTitle : ()Ljava/lang/String;
    //   546: aload #5
    //   548: aload #8
    //   550: iload #12
    //   552: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   557: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   560: astore #8
    //   562: aload #9
    //   564: iload #10
    //   566: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   569: dup
    //   570: invokespecial <init> : ()V
    //   573: aload #8
    //   575: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   578: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   583: pop
    //   584: aload_0
    //   585: aload #8
    //   587: aload #11
    //   589: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   592: aload_0
    //   593: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   596: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   599: aload #8
    //   601: aload #11
    //   603: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   606: pop
    //   607: iinc #10, 1
    //   610: aload_2
    //   611: ifnonnull -> 464
    //   614: aload_2
    //   615: ifnonnull -> 31
    //   618: return
  }
  
  private void flattenArraySchema(Schema paramSchema, String paramString1, String paramString2, ArraySchema paramArraySchema) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: invokevirtual getProperties : ()Ljava/util/Map;
    //   9: ifnull -> 128
    //   12: aload_1
    //   13: invokevirtual getProperties : ()Ljava/util/Map;
    //   16: invokeinterface size : ()I
    //   21: ifle -> 128
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual getProperties : ()Ljava/util/Map;
    //   29: aload_3
    //   30: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   33: aload_2
    //   34: sipush #1376
    //   37: sipush #27567
    //   40: invokestatic a : (II)Ljava/lang/String;
    //   43: swap
    //   44: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   49: astore_2
    //   50: aload_0
    //   51: aload_1
    //   52: invokevirtual getTitle : ()Ljava/lang/String;
    //   55: aload_2
    //   56: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   59: astore #6
    //   61: aload_0
    //   62: aload_1
    //   63: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   66: astore #7
    //   68: aload #7
    //   70: ifnull -> 90
    //   73: aload #4
    //   75: aload_0
    //   76: aload #7
    //   78: aload_1
    //   79: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   82: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   85: aload #5
    //   87: ifnonnull -> 123
    //   90: aload #4
    //   92: aload_0
    //   93: aload #6
    //   95: aload_1
    //   96: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   99: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   102: aload_0
    //   103: aload #6
    //   105: aload_1
    //   106: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   109: aload_0
    //   110: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   113: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   116: aload #6
    //   118: aload_1
    //   119: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   122: pop
    //   123: aload #5
    //   125: ifnonnull -> 216
    //   128: aload_1
    //   129: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   132: ifeq -> 216
    //   135: aload_0
    //   136: getfield flattenComposedSchemas : Z
    //   139: ifeq -> 216
    //   142: aload_0
    //   143: aload_1
    //   144: aload_2
    //   145: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   148: aload_1
    //   149: invokevirtual get$ref : ()Ljava/lang/String;
    //   152: ifnonnull -> 216
    //   155: aload_2
    //   156: sipush #1382
    //   159: sipush #-28484
    //   162: invokestatic a : (II)Ljava/lang/String;
    //   165: swap
    //   166: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   171: astore_2
    //   172: aload_0
    //   173: aload_1
    //   174: invokevirtual getTitle : ()Ljava/lang/String;
    //   177: aload_2
    //   178: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   181: astore #6
    //   183: aload #4
    //   185: aload_0
    //   186: aload #6
    //   188: aload_1
    //   189: invokevirtual makeRefProperty : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   192: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   195: aload_0
    //   196: aload #6
    //   198: aload_1
    //   199: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   202: aload_0
    //   203: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   206: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   209: aload #6
    //   211: aload_1
    //   212: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   215: pop
    //   216: return
  }
  
  private void flattenMapSchema(Schema paramSchema1, String paramString1, String paramString2, Schema paramSchema2) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: invokevirtual getProperties : ()Ljava/util/Map;
    //   9: ifnull -> 121
    //   12: aload_1
    //   13: invokevirtual getProperties : ()Ljava/util/Map;
    //   16: invokeinterface size : ()I
    //   21: ifle -> 121
    //   24: aload_0
    //   25: aload_1
    //   26: invokevirtual getProperties : ()Ljava/util/Map;
    //   29: aload_3
    //   30: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   33: aload_0
    //   34: aload_1
    //   35: invokevirtual getTitle : ()Ljava/lang/String;
    //   38: aload_2
    //   39: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   42: astore #6
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   49: astore #7
    //   51: aload #7
    //   53: ifnull -> 78
    //   56: aload #4
    //   58: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: aload #7
    //   67: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   70: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   73: aload #5
    //   75: ifnonnull -> 116
    //   78: aload #4
    //   80: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: aload #6
    //   89: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   92: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   95: aload_0
    //   96: aload #6
    //   98: aload_1
    //   99: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   102: aload_0
    //   103: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   106: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   109: aload #6
    //   111: aload_1
    //   112: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   115: pop
    //   116: aload #5
    //   118: ifnonnull -> 197
    //   121: aload_1
    //   122: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   125: ifeq -> 197
    //   128: aload_0
    //   129: getfield flattenComposedSchemas : Z
    //   132: ifeq -> 197
    //   135: aload_0
    //   136: aload_1
    //   137: aload_2
    //   138: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   141: aload_1
    //   142: invokevirtual get$ref : ()Ljava/lang/String;
    //   145: ifnonnull -> 197
    //   148: aload_0
    //   149: aload_1
    //   150: invokevirtual getTitle : ()Ljava/lang/String;
    //   153: aload_2
    //   154: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   157: astore #6
    //   159: aload #4
    //   161: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   164: dup
    //   165: invokespecial <init> : ()V
    //   168: aload #6
    //   170: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   173: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   176: aload_0
    //   177: aload #6
    //   179: aload_1
    //   180: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   183: aload_0
    //   184: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   187: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   190: aload #6
    //   192: aload_1
    //   193: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   196: pop
    //   197: return
  }
  
  private void fixStringModel(Schema paramSchema) {
    if (paramSchema.getType() != null && paramSchema.getType().equals(a(1396, -30336)) && paramSchema.getExample() != null) {
      String str = paramSchema.getExample().toString();
      if (str.substring(0, 1).equals("\"") && str.substring(str.length() - 1).equals("\"") && (str != null || (str == null && paramSchema.getExampleSetFlag())))
        paramSchema.setExample(str.substring(1, str.length() - 1)); 
    } 
  }
  
  private static String pathBody(String paramString) {
    String[] arrayOfString = paramString.split("/");
    StringBuilder stringBuilder = new StringBuilder();
    if (arrayOfString.length > 2)
      stringBuilder.append(normalize(arrayOfString[arrayOfString.length - 2])).append('_'); 
    if (arrayOfString.length > 1)
      stringBuilder.append(normalize(arrayOfString[arrayOfString.length - 1])).append('_'); 
    stringBuilder.append(a(1378, 1166));
    return stringBuilder.toString();
  }
  
  private static String normalize(String paramString) {
    return paramString.replace(".", "_");
  }
  
  private String resolveModelName(String paramString1, String paramString2) {
    return (paramString1 == null) ? uniqueName(paramString2) : uniqueName(paramString1);
  }
  
  public String matchGenerated(Schema paramSchema) {
    if (this.skipMatches)
      return null; 
    String str = Json.pretty(paramSchema);
    return this.generatedSignature.containsKey(str) ? this.generatedSignature.get(str) : null;
  }
  
  public void addGenerated(String paramString, Schema paramSchema) {
    this.generatedSignature.put(Json.pretty(paramSchema), paramString);
  }
  
  public String uniqueName(String paramString) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: invokestatic ZV : ()[Lburp/Zbqc;
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: aload_0
    //   10: getfield camelCaseFlattenNaming : Z
    //   13: ifeq -> 120
    //   16: ldc ''
    //   18: astore #6
    //   20: iconst_0
    //   21: istore #7
    //   23: iload #7
    //   25: aload_1
    //   26: sipush #1403
    //   29: sipush #-5723
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   38: arraylength
    //   39: if_icmpge -> 99
    //   42: aload_1
    //   43: sipush #1400
    //   46: sipush #12272
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   55: iload #7
    //   57: aaload
    //   58: astore #5
    //   60: aload #5
    //   62: iconst_0
    //   63: iconst_1
    //   64: invokevirtual substring : (II)Ljava/lang/String;
    //   67: invokevirtual toUpperCase : ()Ljava/lang/String;
    //   70: aload #5
    //   72: iconst_1
    //   73: invokevirtual substring : (I)Ljava/lang/String;
    //   76: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   81: astore #5
    //   83: aload #6
    //   85: aload #5
    //   87: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   90: astore #6
    //   92: iinc #7, 1
    //   95: aload_2
    //   96: ifnonnull -> 23
    //   99: aload #6
    //   101: sipush #1402
    //   104: sipush #-22537
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: ldc ''
    //   112: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   115: astore_1
    //   116: aload_2
    //   117: ifnonnull -> 136
    //   120: aload_1
    //   121: sipush #1383
    //   124: sipush #21395
    //   127: invokestatic a : (II)Ljava/lang/String;
    //   130: ldc ''
    //   132: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   135: astore_1
    //   136: iload #4
    //   138: ifne -> 203
    //   141: aload_1
    //   142: astore #5
    //   144: iload_3
    //   145: ifle -> 157
    //   148: aload_1
    //   149: iload_3
    //   150: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   155: astore #5
    //   157: aload_0
    //   158: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   161: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   164: invokevirtual getSchemas : ()Ljava/util/Map;
    //   167: ifnonnull -> 173
    //   170: aload #5
    //   172: areturn
    //   173: aload_0
    //   174: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   177: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   180: invokevirtual getSchemas : ()Ljava/util/Map;
    //   183: aload #5
    //   185: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   190: ifne -> 196
    //   193: aload #5
    //   195: areturn
    //   196: iinc #3, 1
    //   199: aload_2
    //   200: ifnonnull -> 136
    //   203: aload_1
    //   204: areturn
  }
  
  public void flattenProperties(Map<String, Schema> paramMap, String paramString) {
    // Byte code:
    //   0: invokestatic ZV : ()[Lburp/Zbqc;
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
    //   47: ifeq -> 720
    //   50: aload #6
    //   52: invokeinterface next : ()Ljava/lang/Object;
    //   57: checkcast java/lang/String
    //   60: astore #7
    //   62: aload_1
    //   63: aload #7
    //   65: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   73: astore #8
    //   75: aload_0
    //   76: aload #8
    //   78: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   81: ifeq -> 245
    //   84: aload #8
    //   86: invokevirtual getProperties : ()Ljava/util/Map;
    //   89: ifnull -> 245
    //   92: aload #8
    //   94: invokevirtual getProperties : ()Ljava/util/Map;
    //   97: invokeinterface size : ()I
    //   102: ifle -> 245
    //   105: aload_0
    //   106: aload #8
    //   108: invokevirtual getTitle : ()Ljava/lang/String;
    //   111: aload_2
    //   112: aload #7
    //   114: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   122: astore #9
    //   124: aload_0
    //   125: aload #8
    //   127: aload #9
    //   129: invokevirtual createModelFromProperty : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   132: astore #10
    //   134: aload_0
    //   135: aload #10
    //   137: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   140: astore #11
    //   142: aload #11
    //   144: ifnull -> 173
    //   147: aload #4
    //   149: aload #7
    //   151: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: aload #11
    //   160: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   163: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   168: pop
    //   169: aload_3
    //   170: ifnonnull -> 241
    //   173: aload #4
    //   175: aload #7
    //   177: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   180: dup
    //   181: invokespecial <init> : ()V
    //   184: getstatic net/portswigger/swagger/v3/parser/models/RefType.SCHEMAS : Lnet/portswigger/swagger/v3/parser/models/RefType;
    //   187: invokevirtual getInternalPrefix : ()Ljava/lang/String;
    //   190: aload #9
    //   192: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   197: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   200: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   205: pop
    //   206: aload #5
    //   208: aload #9
    //   210: aload #10
    //   212: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: aload_0
    //   219: aload #9
    //   221: aload #10
    //   223: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   226: aload_0
    //   227: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   230: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   233: aload #9
    //   235: aload #10
    //   237: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   240: pop
    //   241: aload_3
    //   242: ifnonnull -> 716
    //   245: aload #8
    //   247: instanceof net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   250: ifeq -> 544
    //   253: aload #8
    //   255: checkcast net/portswigger/swagger/v3/oas/models/media/ArraySchema
    //   258: astore #9
    //   260: aload #9
    //   262: invokevirtual getItems : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   265: astore #10
    //   267: aload_0
    //   268: aload #10
    //   270: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   273: ifeq -> 540
    //   276: aload #10
    //   278: invokevirtual getProperties : ()Ljava/util/Map;
    //   281: ifnull -> 414
    //   284: aload #10
    //   286: invokevirtual getProperties : ()Ljava/util/Map;
    //   289: invokeinterface size : ()I
    //   294: ifle -> 414
    //   297: aload_0
    //   298: aload #10
    //   300: invokevirtual getProperties : ()Ljava/util/Map;
    //   303: aload_2
    //   304: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   307: aload_0
    //   308: aload #10
    //   310: invokevirtual getTitle : ()Ljava/lang/String;
    //   313: aload_2
    //   314: aload #7
    //   316: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   321: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   324: astore #11
    //   326: aload_0
    //   327: aload #10
    //   329: aload #11
    //   331: invokevirtual createModelFromProperty : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   334: astore #12
    //   336: aload_0
    //   337: aload #12
    //   339: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   342: astore #13
    //   344: aload #13
    //   346: ifnull -> 370
    //   349: aload #9
    //   351: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   354: dup
    //   355: invokespecial <init> : ()V
    //   358: aload #13
    //   360: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   363: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   366: aload_3
    //   367: ifnonnull -> 410
    //   370: aload #9
    //   372: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   375: dup
    //   376: invokespecial <init> : ()V
    //   379: aload #11
    //   381: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   384: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   387: aload_0
    //   388: aload #11
    //   390: aload #12
    //   392: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   395: aload_0
    //   396: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   399: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   402: aload #11
    //   404: aload #12
    //   406: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   409: pop
    //   410: aload_3
    //   411: ifnonnull -> 540
    //   414: aload #10
    //   416: instanceof net/portswigger/swagger/v3/oas/models/media/ComposedSchema
    //   419: ifeq -> 540
    //   422: aload_0
    //   423: getfield flattenComposedSchemas : Z
    //   426: ifeq -> 540
    //   429: aload_0
    //   430: aload #10
    //   432: aload #7
    //   434: invokevirtual flattenComposedSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)V
    //   437: aload_0
    //   438: aload #10
    //   440: invokevirtual getTitle : ()Ljava/lang/String;
    //   443: aload_2
    //   444: aload #7
    //   446: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   451: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   454: astore #11
    //   456: aload_0
    //   457: aload #10
    //   459: aload #11
    //   461: invokevirtual createModelFromProperty : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   464: astore #12
    //   466: aload_0
    //   467: aload #12
    //   469: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   472: astore #13
    //   474: aload #13
    //   476: ifnull -> 500
    //   479: aload #9
    //   481: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   484: dup
    //   485: invokespecial <init> : ()V
    //   488: aload #13
    //   490: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   493: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   496: aload_3
    //   497: ifnonnull -> 540
    //   500: aload #9
    //   502: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   505: dup
    //   506: invokespecial <init> : ()V
    //   509: aload #11
    //   511: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   514: invokevirtual setItems : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   517: aload_0
    //   518: aload #11
    //   520: aload #12
    //   522: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   525: aload_0
    //   526: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   529: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   532: aload #11
    //   534: aload #12
    //   536: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   539: pop
    //   540: aload_3
    //   541: ifnonnull -> 716
    //   544: aload #8
    //   546: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   549: ifnull -> 716
    //   552: aload #8
    //   554: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   557: instanceof java/lang/Boolean
    //   560: ifne -> 716
    //   563: aload #8
    //   565: invokevirtual getAdditionalProperties : ()Ljava/lang/Object;
    //   568: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   571: astore #9
    //   573: aload_0
    //   574: aload #9
    //   576: invokevirtual isObjectSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Z
    //   579: ifeq -> 716
    //   582: aload #9
    //   584: invokevirtual getProperties : ()Ljava/util/Map;
    //   587: ifnull -> 716
    //   590: aload #9
    //   592: invokevirtual getProperties : ()Ljava/util/Map;
    //   595: invokeinterface size : ()I
    //   600: ifle -> 716
    //   603: aload_0
    //   604: aload #9
    //   606: invokevirtual getProperties : ()Ljava/util/Map;
    //   609: aload_2
    //   610: invokevirtual flattenProperties : (Ljava/util/Map;Ljava/lang/String;)V
    //   613: aload_0
    //   614: aload #9
    //   616: invokevirtual getTitle : ()Ljava/lang/String;
    //   619: aload_2
    //   620: aload #7
    //   622: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   627: invokevirtual resolveModelName : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   630: astore #10
    //   632: aload_0
    //   633: aload #9
    //   635: aload #10
    //   637: invokevirtual createModelFromProperty : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   640: astore #11
    //   642: aload_0
    //   643: aload #11
    //   645: invokevirtual matchGenerated : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Ljava/lang/String;
    //   648: astore #12
    //   650: aload #12
    //   652: ifnull -> 676
    //   655: aload #8
    //   657: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   660: dup
    //   661: invokespecial <init> : ()V
    //   664: aload #12
    //   666: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   669: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   672: aload_3
    //   673: ifnonnull -> 716
    //   676: aload #8
    //   678: new net/portswigger/swagger/v3/oas/models/media/Schema
    //   681: dup
    //   682: invokespecial <init> : ()V
    //   685: aload #10
    //   687: invokevirtual $ref : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   690: invokevirtual setAdditionalProperties : (Ljava/lang/Object;)V
    //   693: aload_0
    //   694: aload #10
    //   696: aload #11
    //   698: invokevirtual addGenerated : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   701: aload_0
    //   702: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   705: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   708: aload #10
    //   710: aload #11
    //   712: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   715: pop
    //   716: aload_3
    //   717: ifnonnull -> 40
    //   720: aload #4
    //   722: invokeinterface size : ()I
    //   727: ifle -> 791
    //   730: aload #4
    //   732: invokeinterface keySet : ()Ljava/util/Set;
    //   737: invokeinterface iterator : ()Ljava/util/Iterator;
    //   742: astore #6
    //   744: aload #6
    //   746: invokeinterface hasNext : ()Z
    //   751: ifeq -> 791
    //   754: aload #6
    //   756: invokeinterface next : ()Ljava/lang/Object;
    //   761: checkcast java/lang/String
    //   764: astore #7
    //   766: aload_1
    //   767: aload #7
    //   769: aload #4
    //   771: aload #7
    //   773: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   778: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   781: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   786: pop
    //   787: aload_3
    //   788: ifnonnull -> 744
    //   791: aload #5
    //   793: invokeinterface keySet : ()Ljava/util/Set;
    //   798: invokeinterface iterator : ()Ljava/util/Iterator;
    //   803: astore #6
    //   805: aload #6
    //   807: invokeinterface hasNext : ()Z
    //   812: ifeq -> 880
    //   815: aload #6
    //   817: invokeinterface next : ()Ljava/lang/Object;
    //   822: checkcast java/lang/String
    //   825: astore #7
    //   827: aload_0
    //   828: getfield openAPI : Lnet/portswigger/swagger/v3/oas/models/OpenAPI;
    //   831: invokevirtual getComponents : ()Lnet/portswigger/swagger/v3/oas/models/Components;
    //   834: aload #7
    //   836: aload #5
    //   838: aload #7
    //   840: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   845: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   848: invokevirtual addSchemas : (Ljava/lang/String;Lnet/portswigger/swagger/v3/oas/models/media/Schema;)Lnet/portswigger/swagger/v3/oas/models/Components;
    //   851: pop
    //   852: aload_0
    //   853: getfield addedModels : Ljava/util/Map;
    //   856: aload #7
    //   858: aload #5
    //   860: aload #7
    //   862: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   867: checkcast net/portswigger/swagger/v3/oas/models/media/Schema
    //   870: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   875: pop
    //   876: aload_3
    //   877: ifnonnull -> 805
    //   880: return
  }
  
  private void flattenComposedSchema(Schema paramSchema, String paramString) {
    ComposedSchema composedSchema = (ComposedSchema)paramSchema;
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    String str = "";
    List<Schema> list = null;
    if (composedSchema.getAllOf() != null) {
      list = composedSchema.getAllOf();
      str = a(1398, 22506);
    } else if (composedSchema.getAnyOf() != null) {
      list = composedSchema.getAnyOf();
      str = a(1407, -11655);
    } else if (composedSchema.getOneOf() != null) {
      list = composedSchema.getOneOf();
      str = a(1394, 10848);
    } 
    byte b = 0;
    while (b < list.size()) {
      if (((Schema)list.get(b)).get$ref() == null) {
        Schema schema = list.get(b);
        if (schema.getProperties() != null)
          flattenProperties(schema.getProperties(), paramString); 
        if (this.flattenComposedSchemas) {
          int i = b + 1;
          str = resolveModelName(schema.getTitle(), paramString + paramString + "_" + str);
          list.set(b, (new Schema()).$ref(str));
          addGenerated(str, schema);
          this.openAPI.getComponents().addSchemas(str, schema);
        } 
      } 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  public Schema modelFromProperty(ArraySchema paramArraySchema, String paramString) {
    String str1 = paramArraySchema.getDescription();
    String str2 = null;
    Object object = paramArraySchema.getExample();
    if (object != null)
      str2 = object.toString(); 
    Schema schema = paramArraySchema.getItems();
    if (schema instanceof net.portswigger.swagger.v3.oas.models.media.ObjectSchema) {
      ArraySchema arraySchema = new ArraySchema();
      arraySchema.setDescription(str1);
      if (str2 != null || (str2 == null && paramArraySchema.getExampleSetFlag()))
        arraySchema.setExample(str2); 
      arraySchema.setItems(paramArraySchema.getItems());
      return (Schema)arraySchema;
    } 
    return null;
  }
  
  public Schema createModelFromProperty(Schema paramSchema, String paramString) {
    String str1 = paramSchema.getDescription();
    String str2 = null;
    List list = paramSchema.getRequired();
    Object object = paramSchema.getExample();
    if (object != null)
      str2 = object.toString(); 
    String str3 = paramSchema.getName();
    XML xML = paramSchema.getXml();
    Map<String, Schema> map = paramSchema.getProperties();
    if (paramSchema instanceof ComposedSchema && this.flattenComposedSchemas) {
      ComposedSchema composedSchema = (ComposedSchema)paramSchema;
      composedSchema.setDescription(str1);
      if (str2 != null || (str2 == null && paramSchema.getExampleSetFlag()))
        composedSchema.setExample(str2); 
      composedSchema.setName(str3);
      composedSchema.setXml(xML);
      composedSchema.setType(paramSchema.getType());
      composedSchema.setRequired(list);
      return (Schema)composedSchema;
    } 
    Schema schema = new Schema();
    schema.setAdditionalProperties(paramSchema.getAdditionalProperties());
    schema.setDescription(str1);
    schema.setDeprecated(paramSchema.getDeprecated());
    schema.setDiscriminator(paramSchema.getDiscriminator());
    schema.setEnum(paramSchema.getEnum());
    if (str2 != null || (str2 == null && paramSchema.getExampleSetFlag()))
      schema.setExample(str2); 
    schema.setExclusiveMaximum(paramSchema.getExclusiveMaximum());
    schema.setExclusiveMinimum(paramSchema.getExclusiveMinimum());
    schema.setFormat(paramSchema.getFormat());
    schema.setMinLength(paramSchema.getMinLength());
    schema.setMaximum(paramSchema.getMaximum());
    schema.setMaxItems(paramSchema.getMaxItems());
    schema.setMaxProperties(paramSchema.getMaxProperties());
    schema.setMaxLength(paramSchema.getMaxLength());
    schema.setMinimum(paramSchema.getMinimum());
    schema.setMinItems(paramSchema.getMinItems());
    schema.setMinLength(paramSchema.getMinLength());
    schema.setMinProperties(paramSchema.getMinProperties());
    schema.setMultipleOf(paramSchema.getMultipleOf());
    schema.setName(str3);
    schema.setNullable(paramSchema.getNullable());
    schema.setNot(paramSchema.getNot());
    schema.setPattern(paramSchema.getPattern());
    schema.setReadOnly(paramSchema.getReadOnly());
    schema.setRequired(list);
    schema.setUniqueItems(paramSchema.getUniqueItems());
    schema.setTitle(paramSchema.getTitle());
    schema.setType(paramSchema.getType());
    schema.setXml(xML);
    schema.setWriteOnly(paramSchema.getWriteOnly());
    if (map != null) {
      flattenProperties(map, paramString);
      schema.setProperties(map);
    } 
    if (paramSchema instanceof ComposedSchema) {
      schema.setAllOf(((ComposedSchema)paramSchema).getAllOf());
      schema.setAnyOf(((ComposedSchema)paramSchema).getAnyOf());
      schema.setOneOf(((ComposedSchema)paramSchema).getOneOf());
    } 
    return schema;
  }
  
  public Schema modelFromProperty(Schema paramSchema, String paramString) {
    String str1 = paramSchema.getDescription();
    String str2 = null;
    Object object = paramSchema.getExample();
    if (object != null)
      str2 = object.toString(); 
    ArraySchema arraySchema = new ArraySchema();
    arraySchema.setDescription(str1);
    if (str2 != null || (str2 == null && paramSchema.getExampleSetFlag()))
      arraySchema.setExample(str2); 
    if (paramSchema.getAdditionalProperties() != null && !(paramSchema.getAdditionalProperties() instanceof Boolean))
      arraySchema.setItems((Schema)paramSchema.getAdditionalProperties()); 
    return (Schema)arraySchema;
  }
  
  public Schema makeRefProperty(String paramString, Schema paramSchema) {
    Schema schema = (new Schema()).$ref(paramString);
    copyVendorExtensions(paramSchema, schema);
    return schema;
  }
  
  public void copyVendorExtensions(Schema paramSchema1, Schema paramSchema2) {
    Zbqc[] arrayOfZbqc = RefUtils.ZV();
    if (paramSchema1.getExtensions() != null) {
      Map map = paramSchema1.getExtensions();
      for (String str : map.keySet()) {
        paramSchema2.addExtension(str, map.get(str));
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  private boolean isObjectSchema(Schema paramSchema) {
    return (paramSchema == null) ? false : ((paramSchema instanceof net.portswigger.swagger.v3.oas.models.media.ObjectSchema || a(1404, 8578).equalsIgnoreCase(paramSchema.getType()) || (paramSchema.getType() == null && paramSchema.getProperties() != null && !paramSchema.getProperties().isEmpty()) || paramSchema instanceof ComposedSchema));
  }
  
  public boolean isSkipMatches() {
    return this.skipMatches;
  }
  
  public void setSkipMatches(boolean paramBoolean) {
    this.skipMatches = paramBoolean;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿5o7ÖAvÁñ5S®òD²»+Â¼Í*O-¶·L)Íb«ÝfÈ"×áñVÇ Â?4Rs®cµ\\rd'Øå¿ÓÎ:GÇýitÙûOPxþïR.$OÃüÕbAãW<°^êÛ:GLm°GÍÖ\\bx\\r$\\bîÒ6±AÒä\\bØµÊ]²,²IlþAXtðAæ~#ßÍ1×Øð®ë1p|×s(è!Ôõo*X°ï§©ÜcLf\\f8ÌNUNö2¾?B÷á4Rà|©zÑB`ðà/÷AÍèiØÚ§±r/r²ê9dÍWýq\\nÛ¥vî!0¢h´©ù'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #115
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'H"ÔÇê>ÚS'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #97
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic net/portswigger/swagger/v2/util/InlineModelResolver.a : [Ljava/lang/String;
    //   130: bipush #24
    //   132: anewarray java/lang/String
    //   135: putstatic net/portswigger/swagger/v2/util/InlineModelResolver.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #92
    //   214: goto -> 244
    //   217: bipush #27
    //   219: goto -> 244
    //   222: bipush #11
    //   224: goto -> 244
    //   227: bipush #65
    //   229: goto -> 244
    //   232: bipush #23
    //   234: goto -> 244
    //   237: bipush #25
    //   239: goto -> 244
    //   242: bipush #89
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x575) & 0xFFFF;
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
      byte b1 = 68;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\InlineModelResolver.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */