package net.portswigger.swagger.v1.parser.processors;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.models.HttpMethod;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.Path;
import net.portswigger.swagger.v1.models.RefPath;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.parameters.BodyParameter;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.parser.ResolverCache;
import net.portswigger.swagger.v1.parser.SwaggerResolver;

public class PathsProcessor {
  private final Swagger swagger;
  
  private final ResolverCache cache;
  
  private final SwaggerResolver.Settings settings;
  
  private final ParameterProcessor parameterProcessor;
  
  private final OperationProcessor operationProcessor;
  
  public PathsProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this(paramResolverCache, paramSwagger, new SwaggerResolver.Settings());
  }
  
  public PathsProcessor(ResolverCache paramResolverCache, Swagger paramSwagger, SwaggerResolver.Settings paramSettings) {
    this.swagger = paramSwagger;
    this.cache = paramResolverCache;
    this.settings = paramSettings;
    this.parameterProcessor = new ParameterProcessor(paramResolverCache, paramSwagger);
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    this.operationProcessor = new OperationProcessor(paramResolverCache, paramSwagger);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void processPaths() {
    Map map = this.swagger.getPaths();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (map == null)
      return; 
    for (String str : map.keySet()) {
      Path path = (Path)map.get(str);
      if (this.settings.addParametersToEachOperation()) {
        List list1 = path.getParameters();
        if (list1 != null) {
          List list2 = path.getOperations();
          if (list2 != null)
            for (Operation operation : list2) {
              ArrayList<Parameter> arrayList = new ArrayList();
              List list3 = operation.getParameters();
              for (Parameter parameter : list1) {
                boolean bool = false;
                for (Parameter parameter1 : list3) {
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
        path.setParameters(null);
      } 
      if (path instanceof RefPath) {
        RefPath refPath = (RefPath)path;
        Path path1 = (Path)this.cache.loadRef(refPath.get$ref(), refPath.getRefFormat(), Path.class);
        String str1 = refPath.get$ref().split("#")[0];
        if (path1 != null) {
          updateLocalRefs(path1, str1);
          this.swagger.path(str, path1);
          path = path1;
        } 
      } 
      List<Parameter> list = this.parameterProcessor.processParameters(path.getParameters());
      path.setParameters(list);
      Map map1 = path.getOperationMap();
      for (HttpMethod httpMethod : map1.keySet()) {
        Operation operation = (Operation)map1.get(httpMethod);
        this.operationProcessor.processOperation(operation);
        if (arrayOfZbqc == null)
          break; 
      } 
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  protected void updateLocalRefs(Path paramPath, String paramString) {
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (paramPath.getParameters() != null) {
      List list1 = paramPath.getParameters();
      for (Parameter parameter : list1) {
        updateLocalRefs(parameter, paramString);
        if (arrayOfZbqc == null)
          break; 
      } 
    } 
    List list = paramPath.getOperations();
    for (Operation operation : list) {
      if (operation.getParameters() != null)
        for (Parameter parameter : operation.getParameters()) {
          updateLocalRefs(parameter, paramString);
          if (arrayOfZbqc == null)
            break; 
        }  
      if (operation.getResponsesObject() != null)
        for (Response response : operation.getResponsesObject().values()) {
          updateLocalRefs(response, paramString);
          if (arrayOfZbqc == null)
            break; 
        }  
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  protected void updateLocalRefs(Response paramResponse, String paramString) {
    if (paramResponse.getResponseSchema() != null)
      updateLocalRefs(paramResponse.getResponseSchema(), paramString); 
  }
  
  protected void updateLocalRefs(Parameter paramParameter, String paramString) {
    if (paramParameter instanceof BodyParameter) {
      BodyParameter bodyParameter = (BodyParameter)paramParameter;
      if (bodyParameter.getSchema() != null)
        updateLocalRefs(bodyParameter.getSchema(), paramString); 
    } 
  }
  
  protected void updateLocalRefs(Model paramModel, String paramString) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: instanceof net/portswigger/swagger/v1/models/RefModel
    //   8: ifeq -> 77
    //   11: aload_1
    //   12: checkcast net/portswigger/swagger/v1/models/RefModel
    //   15: astore #4
    //   17: aload #4
    //   19: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   22: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.INTERNAL : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   25: if_acmpne -> 47
    //   28: aload #4
    //   30: aload_0
    //   31: aload #4
    //   33: invokevirtual get$ref : ()Ljava/lang/String;
    //   36: aload_2
    //   37: invokevirtual computeLocalRef : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   40: invokevirtual set$ref : (Ljava/lang/String;)V
    //   43: aload_3
    //   44: ifnonnull -> 73
    //   47: aload #4
    //   49: invokevirtual getRefFormat : ()Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   52: getstatic net/portswigger/swagger/v1/models/refs/RefFormat.RELATIVE : Lnet/portswigger/swagger/v1/models/refs/RefFormat;
    //   55: if_acmpne -> 73
    //   58: aload #4
    //   60: aload_0
    //   61: aload #4
    //   63: invokevirtual get$ref : ()Ljava/lang/String;
    //   66: aload_2
    //   67: invokevirtual computeRelativeRef : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   70: invokevirtual set$ref : (Ljava/lang/String;)V
    //   73: aload_3
    //   74: ifnonnull -> 245
    //   77: aload_1
    //   78: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   81: ifeq -> 152
    //   84: aload_1
    //   85: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   88: astore #4
    //   90: aload #4
    //   92: invokevirtual getProperties : ()Ljava/util/Map;
    //   95: ifnull -> 148
    //   98: aload #4
    //   100: invokevirtual getProperties : ()Ljava/util/Map;
    //   103: invokeinterface values : ()Ljava/util/Collection;
    //   108: invokeinterface iterator : ()Ljava/util/Iterator;
    //   113: astore #5
    //   115: aload #5
    //   117: invokeinterface hasNext : ()Z
    //   122: ifeq -> 148
    //   125: aload #5
    //   127: invokeinterface next : ()Ljava/lang/Object;
    //   132: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   135: astore #6
    //   137: aload_0
    //   138: aload #6
    //   140: aload_2
    //   141: invokevirtual updateLocalRefs : (Lnet/portswigger/swagger/v1/models/properties/Property;Ljava/lang/String;)V
    //   144: aload_3
    //   145: ifnonnull -> 115
    //   148: aload_3
    //   149: ifnonnull -> 245
    //   152: aload_1
    //   153: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   156: ifeq -> 214
    //   159: aload_1
    //   160: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   163: astore #4
    //   165: aload #4
    //   167: invokevirtual getAllOf : ()Ljava/util/List;
    //   170: invokeinterface iterator : ()Ljava/util/Iterator;
    //   175: astore #5
    //   177: aload #5
    //   179: invokeinterface hasNext : ()Z
    //   184: ifeq -> 210
    //   187: aload #5
    //   189: invokeinterface next : ()Ljava/lang/Object;
    //   194: checkcast net/portswigger/swagger/v1/models/Model
    //   197: astore #6
    //   199: aload_0
    //   200: aload #6
    //   202: aload_2
    //   203: invokevirtual updateLocalRefs : (Lnet/portswigger/swagger/v1/models/Model;Ljava/lang/String;)V
    //   206: aload_3
    //   207: ifnonnull -> 177
    //   210: aload_3
    //   211: ifnonnull -> 245
    //   214: aload_1
    //   215: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   218: ifeq -> 245
    //   221: aload_1
    //   222: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   225: astore #4
    //   227: aload #4
    //   229: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   232: ifnull -> 245
    //   235: aload_0
    //   236: aload #4
    //   238: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   241: aload_2
    //   242: invokevirtual updateLocalRefs : (Lnet/portswigger/swagger/v1/models/properties/Property;Ljava/lang/String;)V
    //   245: return
  }
  
  protected void updateLocalRefs(Property paramProperty, String paramString) {
    RefProperty refProperty;
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (paramProperty instanceof RefProperty) {
      refProperty = (RefProperty)paramProperty;
      if (refProperty.getRefFormat() == RefFormat.INTERNAL) {
        refProperty.set$ref(computeLocalRef(refProperty.get$ref(), paramString));
        if (arrayOfZbqc == null) {
          if (refProperty.getRefFormat() == RefFormat.RELATIVE)
            refProperty.set$ref(computeRelativeRef(refProperty.get$ref(), paramString)); 
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    if (refProperty.getRefFormat() == RefFormat.RELATIVE)
      refProperty.set$ref(computeRelativeRef(refProperty.get$ref(), paramString)); 
  }
  
  protected String computeLocalRef(String paramString1, String paramString2) {
    return paramString2 + paramString2;
  }
  
  protected String computeRelativeRef(String paramString1, String paramString2) {
    int i = paramString2.lastIndexOf('/');
    return (i > 1) ? (paramString2.substring(0, i + 1) + paramString2.substring(0, i + 1)) : paramString1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\PathsProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */