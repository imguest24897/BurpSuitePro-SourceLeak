package net.portswigger.swagger.v3.parser.processors;

import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.parser.ResolverCache;

public class LinkProcessor {
  private final ResolverCache cache;
  
  private final OpenAPI openAPI;
  
  private final HeaderProcessor headerProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  public LinkProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI) {
    this(paramResolverCache, paramOpenAPI, false);
  }
  
  public LinkProcessor(ResolverCache paramResolverCache, OpenAPI paramOpenAPI, boolean paramBoolean) {
    this.cache = paramResolverCache;
    this.openAPI = paramOpenAPI;
    this.headerProcessor = new HeaderProcessor(paramResolverCache, paramOpenAPI, paramBoolean);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramOpenAPI);
  }
  
  public void processLink(Link paramLink) {
    // Byte code:
    //   0: invokestatic Zv : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual get$ref : ()Ljava/lang/String;
    //   8: ifnull -> 59
    //   11: aload_1
    //   12: invokevirtual get$ref : ()Ljava/lang/String;
    //   15: invokestatic computeRefFormat : (Ljava/lang/String;)Lnet/portswigger/swagger/v3/parser/models/RefFormat;
    //   18: astore_3
    //   19: aload_1
    //   20: invokevirtual get$ref : ()Ljava/lang/String;
    //   23: astore #4
    //   25: aload_3
    //   26: invokestatic isAnExternalRefFormat : (Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Z
    //   29: ifeq -> 55
    //   32: aload_0
    //   33: getfield externalRefProcessor : Lnet/portswigger/swagger/v3/parser/processors/ExternalRefProcessor;
    //   36: aload #4
    //   38: aload_3
    //   39: invokevirtual processRefToExternalLink : (Ljava/lang/String;Lnet/portswigger/swagger/v3/parser/models/RefFormat;)Ljava/lang/String;
    //   42: astore #5
    //   44: aload #5
    //   46: ifnull -> 55
    //   49: aload_1
    //   50: aload #5
    //   52: invokevirtual set$ref : (Ljava/lang/String;)V
    //   55: aload_2
    //   56: ifnonnull -> 132
    //   59: aload_1
    //   60: invokevirtual getHeaders : ()Ljava/util/Map;
    //   63: ifnull -> 132
    //   66: aload_1
    //   67: invokevirtual getHeaders : ()Ljava/util/Map;
    //   70: astore_3
    //   71: aload_3
    //   72: invokeinterface keySet : ()Ljava/util/Set;
    //   77: invokeinterface iterator : ()Ljava/util/Iterator;
    //   82: astore #4
    //   84: aload #4
    //   86: invokeinterface hasNext : ()Z
    //   91: ifeq -> 132
    //   94: aload #4
    //   96: invokeinterface next : ()Ljava/lang/Object;
    //   101: checkcast java/lang/String
    //   104: astore #5
    //   106: aload_3
    //   107: aload #5
    //   109: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   114: checkcast net/portswigger/swagger/v3/oas/models/headers/Header
    //   117: astore #6
    //   119: aload_0
    //   120: getfield headerProcessor : Lnet/portswigger/swagger/v3/parser/processors/HeaderProcessor;
    //   123: aload #6
    //   125: invokevirtual processHeader : (Lnet/portswigger/swagger/v3/oas/models/headers/Header;)V
    //   128: aload_2
    //   129: ifnonnull -> 84
    //   132: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\processors\LinkProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */