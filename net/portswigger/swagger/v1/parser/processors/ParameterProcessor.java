package net.portswigger.swagger.v1.parser.processors;

import java.util.List;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.parser.ResolverCache;

public class ParameterProcessor {
  private final ResolverCache cache;
  
  private final ModelProcessor modelProcessor;
  
  public ParameterProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.cache = paramResolverCache;
    this.modelProcessor = new ModelProcessor(paramResolverCache, paramSwagger);
  }
  
  public List<Parameter> processParameters(List<Parameter> paramList) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
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
    //   42: ifeq -> 366
    //   45: aload #5
    //   47: invokeinterface next : ()Ljava/lang/Object;
    //   52: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   55: astore #6
    //   57: aload #6
    //   59: instanceof net/portswigger/swagger/v1/models/parameters/RefParameter
    //   62: ifeq -> 322
    //   65: aload #6
    //   67: checkcast net/portswigger/swagger/v1/models/parameters/RefParameter
    //   70: astore #7
    //   72: aload_0
    //   73: getfield cache : Lnet/portswigger/swagger/v1/parser/ResolverCache;
    //   76: aload #7
    //   78: invokevirtual get$ref : ()Ljava/lang/String;
    //   81: aload #7
    //   83: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   86: ldc net/portswigger/swagger/v1/models/parameters/Parameter
    //   88: invokevirtual loadRef : (Ljava/lang/String;Lnet/portswigger/swagger/v1/models/refs/RefFormat;Ljava/lang/Class;)Ljava/lang/Object;
    //   91: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   94: astore #8
    //   96: aload #8
    //   98: ifnonnull -> 114
    //   101: aload_3
    //   102: aload #7
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: aload_2
    //   111: ifnonnull -> 35
    //   114: iconst_0
    //   115: istore #9
    //   117: aload_3
    //   118: invokeinterface iterator : ()Ljava/util/Iterator;
    //   123: astore #10
    //   125: aload #10
    //   127: invokeinterface hasNext : ()Z
    //   132: ifeq -> 188
    //   135: aload #10
    //   137: invokeinterface next : ()Ljava/lang/Object;
    //   142: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   145: astore #11
    //   147: aload #11
    //   149: invokeinterface getName : ()Ljava/lang/String;
    //   154: ifnull -> 184
    //   157: aload #11
    //   159: invokeinterface getName : ()Ljava/lang/String;
    //   164: aload #8
    //   166: invokeinterface getName : ()Ljava/lang/String;
    //   171: invokevirtual equals : (Ljava/lang/Object;)Z
    //   174: ifeq -> 184
    //   177: iconst_1
    //   178: istore #9
    //   180: aload_2
    //   181: ifnonnull -> 188
    //   184: aload_2
    //   185: ifnonnull -> 125
    //   188: aload_1
    //   189: invokeinterface iterator : ()Ljava/util/Iterator;
    //   194: astore #10
    //   196: aload #10
    //   198: invokeinterface hasNext : ()Z
    //   203: ifeq -> 259
    //   206: aload #10
    //   208: invokeinterface next : ()Ljava/lang/Object;
    //   213: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   216: astore #11
    //   218: aload #11
    //   220: invokeinterface getName : ()Ljava/lang/String;
    //   225: ifnull -> 255
    //   228: aload #11
    //   230: invokeinterface getName : ()Ljava/lang/String;
    //   235: aload #8
    //   237: invokeinterface getName : ()Ljava/lang/String;
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: ifeq -> 255
    //   248: iconst_1
    //   249: istore #9
    //   251: aload_2
    //   252: ifnonnull -> 259
    //   255: aload_2
    //   256: ifnonnull -> 196
    //   259: aload #8
    //   261: instanceof net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   264: ifeq -> 290
    //   267: aload #8
    //   269: checkcast net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   272: astore #10
    //   274: aload #10
    //   276: invokevirtual getSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   279: astore #11
    //   281: aload_0
    //   282: getfield modelProcessor : Lnet/portswigger/swagger/v1/parser/processors/ModelProcessor;
    //   285: aload #11
    //   287: invokevirtual processModel : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   290: iload #9
    //   292: ifeq -> 309
    //   295: aload #4
    //   297: aload #8
    //   299: invokeinterface add : (Ljava/lang/Object;)Z
    //   304: pop
    //   305: aload_2
    //   306: ifnonnull -> 318
    //   309: aload_3
    //   310: aload #8
    //   312: invokeinterface add : (Ljava/lang/Object;)Z
    //   317: pop
    //   318: aload_2
    //   319: ifnonnull -> 362
    //   322: aload #6
    //   324: instanceof net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   327: ifeq -> 353
    //   330: aload #6
    //   332: checkcast net/portswigger/swagger/v1/models/parameters/BodyParameter
    //   335: astore #7
    //   337: aload #7
    //   339: invokevirtual getSchema : ()Lnet/portswigger/swagger/v1/models/Model;
    //   342: astore #8
    //   344: aload_0
    //   345: getfield modelProcessor : Lnet/portswigger/swagger/v1/parser/processors/ModelProcessor;
    //   348: aload #8
    //   350: invokevirtual processModel : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   353: aload_3
    //   354: aload #6
    //   356: invokeinterface add : (Ljava/lang/Object;)Z
    //   361: pop
    //   362: aload_2
    //   363: ifnonnull -> 35
    //   366: aload #4
    //   368: invokeinterface iterator : ()Ljava/util/Iterator;
    //   373: astore #5
    //   375: aload #5
    //   377: invokeinterface hasNext : ()Z
    //   382: ifeq -> 476
    //   385: aload #5
    //   387: invokeinterface next : ()Ljava/lang/Object;
    //   392: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   395: astore #6
    //   397: iconst_0
    //   398: istore #7
    //   400: aload_3
    //   401: invokeinterface iterator : ()Ljava/util/Iterator;
    //   406: astore #8
    //   408: aload #8
    //   410: invokeinterface hasNext : ()Z
    //   415: ifeq -> 472
    //   418: aload #8
    //   420: invokeinterface next : ()Ljava/lang/Object;
    //   425: checkcast net/portswigger/swagger/v1/models/parameters/Parameter
    //   428: astore #9
    //   430: aload #9
    //   432: invokeinterface getName : ()Ljava/lang/String;
    //   437: aload #6
    //   439: invokeinterface getName : ()Ljava/lang/String;
    //   444: invokevirtual equals : (Ljava/lang/Object;)Z
    //   447: ifeq -> 465
    //   450: aload_3
    //   451: iload #7
    //   453: aload #6
    //   455: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   460: pop
    //   461: aload_2
    //   462: ifnonnull -> 472
    //   465: iinc #7, 1
    //   468: aload_2
    //   469: ifnonnull -> 408
    //   472: aload_2
    //   473: ifnonnull -> 375
    //   476: aload_3
    //   477: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\ParameterProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */