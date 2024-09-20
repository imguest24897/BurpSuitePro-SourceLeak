package net.portswigger.swagger.v3.parser.processors;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v2.util.RefUtils;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.media.Content;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.parser.ResolverCache;
import net.portswigger.swagger.v3.parser.models.RefFormat;

public class ParameterProcessor {
  private final ResolverCache cache;
  
  private final SchemaProcessor schemaProcessor;
  
  private final ExampleProcessor exampleProcessor;
  
  private final OpenAPI openAPI;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  private static final String a;
  
  public ParameterProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public ParameterProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    this.schemaProcessor = new SchemaProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.exampleProcessor = new ExampleProcessor(paramResolverCache, paramOpenAPI);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public void processParameter(Parameter paramParameter) {
    String str = paramParameter.get$ref();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.Zv();
    if (str != null) {
      RefFormat refFormat = RefUtils.computeRefFormat(paramParameter.get$ref());
      if (RefUtils.isAnExternalRefFormat(refFormat)) {
        String str1 = this.externalRefProcessor.processRefToExternalParameter(str, refFormat);
        if (str1 != null)
          paramParameter.set$ref(str1); 
      } 
    } 
    if (paramParameter.getSchema() != null)
      this.schemaProcessor.processSchema(paramParameter.getSchema()); 
    if (paramParameter.getExamples() != null) {
      Map map = paramParameter.getExamples();
      for (String str1 : map.keySet()) {
        Example example = (Example)map.get(str1);
        this.exampleProcessor.processExample(example);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    Schema schema = null;
    if (paramParameter.getContent() != null) {
      Content content = paramParameter.getContent();
      for (String str1 : content.keySet()) {
        MediaType mediaType = (MediaType)content.get(str1);
        if (mediaType.getSchema() != null) {
          schema = mediaType.getSchema();
          if (schema != null)
            this.schemaProcessor.processSchema(schema); 
        } 
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
  }
  
  public List<Parameter> processParameters(List<Parameter> paramList) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: new java/util/ArrayList
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore_3
    //   18: new java/util/ArrayList
    //   21: dup
    //   22: invokespecial <init> : ()V
    //   25: astore #4
    //   27: aload_1
    //   28: invokeinterface iterator : ()Ljava/util/Iterator;
    //   33: astore #5
    //   35: aload #5
    //   37: invokeinterface hasNext : ()Z
    //   42: ifeq -> 329
    //   45: aload #5
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   55: astore #6
    //   57: aload #6
    //   59: invokevirtual get$ref : ()Ljava/lang/String;
    //   62: ifnull -> 316
    //   65: aload #6
    //   67: invokevirtual get$ref : ()Ljava/lang/String;
    //   70: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   73: astore #7
    //   75: aload_0
    //   76: getfield cache : Lnet/portswigger/swagger/v3/parser/ResolverCache;
    //   79: aload #6
    //   81: invokevirtual get$ref : ()Ljava/lang/String;
    //   84: aload #7
    //   86: ldc net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   88: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   91: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   94: astore #8
    //   96: aload #6
    //   98: invokevirtual get$ref : ()Ljava/lang/String;
    //   101: ldc '#'
    //   103: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   106: ifeq -> 128
    //   109: aload #6
    //   111: invokevirtual get$ref : ()Ljava/lang/String;
    //   114: getstatic net/portswigger/swagger/v3/parser/processors/ParameterProcessor.a : Ljava/lang/String;
    //   117: invokevirtual indexOf : (Ljava/lang/String;)I
    //   120: iconst_m1
    //   121: if_icmpgt -> 128
    //   124: aload_2
    //   125: ifnonnull -> 35
    //   128: aload #8
    //   130: ifnonnull -> 146
    //   133: aload_3
    //   134: aload #6
    //   136: invokeinterface add : (Ljava/lang/Object;)Z
    //   141: pop
    //   142: aload_2
    //   143: ifnonnull -> 35
    //   146: iconst_0
    //   147: istore #9
    //   149: aload_3
    //   150: invokeinterface iterator : ()Ljava/util/Iterator;
    //   155: astore #10
    //   157: aload #10
    //   159: invokeinterface hasNext : ()Z
    //   164: ifeq -> 219
    //   167: aload #10
    //   169: invokeinterface next : ()Ljava/lang/Object;
    //   174: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   177: astore #11
    //   179: aload #11
    //   181: ifnull -> 215
    //   184: aload #11
    //   186: invokevirtual getName : ()Ljava/lang/String;
    //   189: ifnull -> 215
    //   192: aload #11
    //   194: invokevirtual getName : ()Ljava/lang/String;
    //   197: aload #8
    //   199: invokevirtual getName : ()Ljava/lang/String;
    //   202: invokevirtual equals : (Ljava/lang/Object;)Z
    //   205: ifeq -> 215
    //   208: iconst_1
    //   209: istore #9
    //   211: aload_2
    //   212: ifnonnull -> 219
    //   215: aload_2
    //   216: ifnonnull -> 157
    //   219: aload_1
    //   220: invokeinterface iterator : ()Ljava/util/Iterator;
    //   225: astore #10
    //   227: aload #10
    //   229: invokeinterface hasNext : ()Z
    //   234: ifeq -> 284
    //   237: aload #10
    //   239: invokeinterface next : ()Ljava/lang/Object;
    //   244: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   247: astore #11
    //   249: aload #11
    //   251: invokevirtual getName : ()Ljava/lang/String;
    //   254: ifnull -> 280
    //   257: aload #11
    //   259: invokevirtual getName : ()Ljava/lang/String;
    //   262: aload #8
    //   264: invokevirtual getName : ()Ljava/lang/String;
    //   267: invokevirtual equals : (Ljava/lang/Object;)Z
    //   270: ifeq -> 280
    //   273: iconst_1
    //   274: istore #9
    //   276: aload_2
    //   277: ifnonnull -> 284
    //   280: aload_2
    //   281: ifnonnull -> 227
    //   284: iload #9
    //   286: ifeq -> 303
    //   289: aload #4
    //   291: aload #8
    //   293: invokeinterface add : (Ljava/lang/Object;)Z
    //   298: pop
    //   299: aload_2
    //   300: ifnonnull -> 312
    //   303: aload_3
    //   304: aload #8
    //   306: invokeinterface add : (Ljava/lang/Object;)Z
    //   311: pop
    //   312: aload_2
    //   313: ifnonnull -> 325
    //   316: aload_3
    //   317: aload #6
    //   319: invokeinterface add : (Ljava/lang/Object;)Z
    //   324: pop
    //   325: aload_2
    //   326: ifnonnull -> 35
    //   329: aload #4
    //   331: invokeinterface iterator : ()Ljava/util/Iterator;
    //   336: astore #5
    //   338: aload #5
    //   340: invokeinterface hasNext : ()Z
    //   345: ifeq -> 435
    //   348: aload #5
    //   350: invokeinterface next : ()Ljava/lang/Object;
    //   355: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   358: astore #6
    //   360: iconst_0
    //   361: istore #7
    //   363: aload_3
    //   364: invokeinterface iterator : ()Ljava/util/Iterator;
    //   369: astore #8
    //   371: aload #8
    //   373: invokeinterface hasNext : ()Z
    //   378: ifeq -> 431
    //   381: aload #8
    //   383: invokeinterface next : ()Ljava/lang/Object;
    //   388: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   391: astore #9
    //   393: aload #9
    //   395: invokevirtual getName : ()Ljava/lang/String;
    //   398: aload #6
    //   400: invokevirtual getName : ()Ljava/lang/String;
    //   403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   406: ifeq -> 424
    //   409: aload_3
    //   410: iload #7
    //   412: aload #6
    //   414: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   419: pop
    //   420: aload_2
    //   421: ifnonnull -> 431
    //   424: iinc #7, 1
    //   427: aload_2
    //   428: ifnonnull -> 371
    //   431: aload_2
    //   432: ifnonnull -> 338
    //   435: aload_3
    //   436: invokeinterface iterator : ()Ljava/util/Iterator;
    //   441: astore #5
    //   443: aload #5
    //   445: invokeinterface hasNext : ()Z
    //   450: ifeq -> 652
    //   453: aload #5
    //   455: invokeinterface next : ()Ljava/lang/Object;
    //   460: checkcast net/portswigger/swagger/v3/oas/models/parameters/Parameter
    //   463: astore #6
    //   465: aload #6
    //   467: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   470: astore #7
    //   472: aload #7
    //   474: ifnull -> 490
    //   477: aload_0
    //   478: getfield schemaProcessor : Lnet/portswigger/swagger/v3/parser/processors/SchemaProcessor;
    //   481: aload #7
    //   483: invokevirtual processSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   486: aload_2
    //   487: ifnonnull -> 648
    //   490: aload #6
    //   492: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   495: ifnull -> 648
    //   498: aload #6
    //   500: invokevirtual getContent : ()Lnet/portswigger/swagger/v3/oas/models/media/Content;
    //   503: astore #8
    //   505: aload #8
    //   507: invokeinterface keySet : ()Ljava/util/Set;
    //   512: invokeinterface iterator : ()Ljava/util/Iterator;
    //   517: astore #9
    //   519: aload #9
    //   521: invokeinterface hasNext : ()Z
    //   526: ifeq -> 648
    //   529: aload #9
    //   531: invokeinterface next : ()Ljava/lang/Object;
    //   536: checkcast java/lang/String
    //   539: astore #10
    //   541: aload #8
    //   543: aload #10
    //   545: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   550: checkcast net/portswigger/swagger/v3/oas/models/media/MediaType
    //   553: astore #11
    //   555: aload #11
    //   557: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   560: ifnull -> 584
    //   563: aload #11
    //   565: invokevirtual getSchema : ()Lnet/portswigger/swagger/v3/oas/models/media/Schema;
    //   568: astore #7
    //   570: aload #7
    //   572: ifnull -> 584
    //   575: aload_0
    //   576: getfield schemaProcessor : Lnet/portswigger/swagger/v3/parser/processors/SchemaProcessor;
    //   579: aload #7
    //   581: invokevirtual processSchema : (Lnet/portswigger/swagger/v3/oas/models/media/Schema;)V
    //   584: aload #11
    //   586: invokevirtual getExamples : ()Ljava/util/Map;
    //   589: ifnull -> 644
    //   592: aload #11
    //   594: invokevirtual getExamples : ()Ljava/util/Map;
    //   597: invokeinterface values : ()Ljava/util/Collection;
    //   602: invokeinterface iterator : ()Ljava/util/Iterator;
    //   607: astore #12
    //   609: aload #12
    //   611: invokeinterface hasNext : ()Z
    //   616: ifeq -> 644
    //   619: aload #12
    //   621: invokeinterface next : ()Ljava/lang/Object;
    //   626: checkcast net/portswigger/swagger/v3/oas/models/examples/Example
    //   629: astore #13
    //   631: aload_0
    //   632: getfield exampleProcessor : Lnet/portswigger/swagger/v3/parser/processors/ExampleProcessor;
    //   635: aload #13
    //   637: invokevirtual processExample : (Lnet/portswigger/swagger/v3/oas/models/examples/Example;)V
    //   640: aload_2
    //   641: ifnonnull -> 609
    //   644: aload_2
    //   645: ifnonnull -> 519
    //   648: aload_2
    //   649: ifnonnull -> 443
    //   652: aload_3
    //   653: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc 'xSG5\]:E)'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v3/parser/processors/ParameterProcessor.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #70
    //   82: goto -> 112
    //   85: bipush #97
    //   87: goto -> 112
    //   90: bipush #106
    //   92: goto -> 112
    //   95: bipush #53
    //   97: goto -> 112
    //   100: bipush #126
    //   102: goto -> 112
    //   105: bipush #111
    //   107: goto -> 112
    //   110: bipush #125
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\ParameterProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */