package net.portswigger.swagger.v2;

import burp.Zbqc;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.Path;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.Tag;
import net.portswigger.swagger.v1.models.parameters.BodyParameter;
import net.portswigger.swagger.v1.models.parameters.Parameter;
import net.portswigger.swagger.v1.models.properties.Property;

public class SwaggerInventory {
  private List<Path> paths = new ArrayList<>();
  
  private List<Property> properties = new ArrayList<>();
  
  private List<Parameter> parameters = new ArrayList<>();
  
  private List<Operation> operations = new ArrayList<>();
  
  private List<Response> responses = new ArrayList<>();
  
  private List<Model> models = new ArrayList<>();
  
  private List<Tag> tags = new ArrayList<>();
  
  public SwaggerInventory() {
    String[] arrayOfString = ParseOptions.ZG();
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public List<Path> getPaths() {
    return this.paths;
  }
  
  public void setPaths(List<Path> paramList) {
    this.paths = paramList;
  }
  
  public List<Property> getProperties() {
    return this.properties;
  }
  
  public void setProperties(List<Property> paramList) {
    this.properties = paramList;
  }
  
  public List<Parameter> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(List<Parameter> paramList) {
    this.parameters = paramList;
  }
  
  public List<Operation> getOperations() {
    return this.operations;
  }
  
  public void setOperations(List<Operation> paramList) {
    this.operations = paramList;
  }
  
  public List<Response> getResponses() {
    return this.responses;
  }
  
  public void setResponses(List<Response> paramList) {
    this.responses = paramList;
  }
  
  public List<Model> getModels() {
    return this.models;
  }
  
  public void setModels(List<Model> paramList) {
    this.models = paramList;
  }
  
  public List<Tag> getTags() {
    return this.tags;
  }
  
  public void setTags(List<Tag> paramList) {
    this.tags = paramList;
  }
  
  public SwaggerInventory process(Swagger paramSwagger) {
    String[] arrayOfString = ParseOptions.ZG();
    if (paramSwagger.getTags() != null)
      for (Tag tag : paramSwagger.getTags()) {
        process(tag);
        if (arrayOfString != null)
          break; 
      }  
    if (paramSwagger.getPaths() != null)
      for (String str : paramSwagger.getPaths().keySet()) {
        Path path = paramSwagger.getPath(str);
        process(path);
        if (arrayOfString != null)
          break; 
      }  
    if (paramSwagger.getDefinitions() != null)
      for (String str : paramSwagger.getDefinitions().keySet()) {
        Model model = (Model)paramSwagger.getDefinitions().get(str);
        process(model);
        if (arrayOfString != null)
          break; 
      }  
    return this;
  }
  
  public void process(Tag paramTag) {
    this.tags.add(paramTag);
  }
  
  public void process(Path paramPath) {
    this.paths.add(paramPath);
    String[] arrayOfString = ParseOptions.ZG();
    if (paramPath.getParameters() != null)
      for (Parameter parameter : paramPath.getParameters()) {
        process(parameter);
        if (arrayOfString != null)
          break; 
      }  
    if (paramPath.getOperations() != null)
      for (Operation operation : paramPath.getOperations()) {
        process(operation);
        if (arrayOfString != null)
          break; 
      }  
  }
  
  public void process(Operation paramOperation) {
    this.operations.add(paramOperation);
    String[] arrayOfString = ParseOptions.ZG();
    if (paramOperation.getParameters() != null)
      for (Parameter parameter : paramOperation.getParameters()) {
        process(parameter);
        if (arrayOfString != null)
          break; 
      }  
    if (paramOperation.getResponses() != null)
      for (String str : paramOperation.getResponses().keySet()) {
        Response response = (Response)paramOperation.getResponses().get(str);
        process(response);
        if (arrayOfString != null)
          break; 
      }  
  }
  
  public void process(Response paramResponse) {
    this.responses.add(paramResponse);
    if (paramResponse.getSchema() != null)
      process(paramResponse.getSchema()); 
  }
  
  public void process(Parameter paramParameter) {
    this.parameters.add(paramParameter);
    if (paramParameter instanceof BodyParameter) {
      BodyParameter bodyParameter = (BodyParameter)paramParameter;
      if (bodyParameter.getSchema() != null) {
        Model model = bodyParameter.getSchema();
        if (model != null)
          process(model); 
      } 
    } 
  }
  
  public void process(Model paramModel) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield models : Ljava/util/List;
    //   7: aload_1
    //   8: invokeinterface add : (Ljava/lang/Object;)Z
    //   13: pop
    //   14: astore_2
    //   15: aload_1
    //   16: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   19: ifeq -> 103
    //   22: aload_1
    //   23: checkcast net/portswigger/swagger/v1/models/ModelImpl
    //   26: astore #6
    //   28: aload #6
    //   30: invokevirtual getProperties : ()Ljava/util/Map;
    //   33: ifnull -> 99
    //   36: aload #6
    //   38: invokevirtual getProperties : ()Ljava/util/Map;
    //   41: invokeinterface keySet : ()Ljava/util/Set;
    //   46: invokeinterface iterator : ()Ljava/util/Iterator;
    //   51: astore_3
    //   52: aload_3
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 99
    //   61: aload_3
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: checkcast java/lang/String
    //   70: astore #4
    //   72: aload #6
    //   74: invokevirtual getProperties : ()Ljava/util/Map;
    //   77: aload #4
    //   79: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   84: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   87: astore #5
    //   89: aload_0
    //   90: aload #5
    //   92: invokevirtual process : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   95: aload_2
    //   96: ifnull -> 52
    //   99: aload_2
    //   100: ifnull -> 253
    //   103: aload_1
    //   104: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   107: ifeq -> 169
    //   110: aload_1
    //   111: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   114: astore #6
    //   116: aload #6
    //   118: invokevirtual getAllOf : ()Ljava/util/List;
    //   121: ifnull -> 165
    //   124: aload #6
    //   126: invokevirtual getAllOf : ()Ljava/util/List;
    //   129: invokeinterface iterator : ()Ljava/util/Iterator;
    //   134: astore_3
    //   135: aload_3
    //   136: invokeinterface hasNext : ()Z
    //   141: ifeq -> 165
    //   144: aload_3
    //   145: invokeinterface next : ()Ljava/lang/Object;
    //   150: checkcast net/portswigger/swagger/v1/models/Model
    //   153: astore #7
    //   155: aload_0
    //   156: aload #7
    //   158: invokevirtual process : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   161: aload_2
    //   162: ifnull -> 135
    //   165: aload_2
    //   166: ifnull -> 253
    //   169: aload_1
    //   170: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   173: ifeq -> 253
    //   176: aload_1
    //   177: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   180: astore #6
    //   182: aload #6
    //   184: invokevirtual getProperties : ()Ljava/util/Map;
    //   187: ifnull -> 253
    //   190: aload #6
    //   192: invokevirtual getProperties : ()Ljava/util/Map;
    //   195: invokeinterface keySet : ()Ljava/util/Set;
    //   200: invokeinterface iterator : ()Ljava/util/Iterator;
    //   205: astore_3
    //   206: aload_3
    //   207: invokeinterface hasNext : ()Z
    //   212: ifeq -> 253
    //   215: aload_3
    //   216: invokeinterface next : ()Ljava/lang/Object;
    //   221: checkcast java/lang/String
    //   224: astore #4
    //   226: aload #6
    //   228: invokevirtual getProperties : ()Ljava/util/Map;
    //   231: aload #4
    //   233: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   238: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   241: astore #5
    //   243: aload_0
    //   244: aload #5
    //   246: invokevirtual process : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   249: aload_2
    //   250: ifnull -> 206
    //   253: return
  }
  
  public void process(Property paramProperty) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield properties : Ljava/util/List;
    //   7: aload_1
    //   8: invokeinterface add : (Ljava/lang/Object;)Z
    //   13: pop
    //   14: astore_2
    //   15: aload_1
    //   16: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   19: ifeq -> 43
    //   22: aload_1
    //   23: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual getItems : ()Lnet/portswigger/swagger/v1/models/properties/Property;
    //   31: astore #4
    //   33: aload_0
    //   34: aload #4
    //   36: invokevirtual process : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   39: aload_2
    //   40: ifnull -> 142
    //   43: aload_1
    //   44: instanceof net/portswigger/swagger/v1/models/properties/MapProperty
    //   47: ifeq -> 59
    //   50: aload_1
    //   51: checkcast net/portswigger/swagger/v1/models/properties/MapProperty
    //   54: astore_3
    //   55: aload_2
    //   56: ifnull -> 142
    //   59: aload_1
    //   60: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   63: ifeq -> 142
    //   66: aload_1
    //   67: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   70: astore_3
    //   71: aload_3
    //   72: invokevirtual getProperties : ()Ljava/util/Map;
    //   75: ifnull -> 142
    //   78: aload_3
    //   79: invokevirtual getProperties : ()Ljava/util/Map;
    //   82: invokeinterface keySet : ()Ljava/util/Set;
    //   87: invokeinterface iterator : ()Ljava/util/Iterator;
    //   92: astore #4
    //   94: aload #4
    //   96: invokeinterface hasNext : ()Z
    //   101: ifeq -> 142
    //   104: aload #4
    //   106: invokeinterface next : ()Ljava/lang/Object;
    //   111: checkcast java/lang/String
    //   114: astore #5
    //   116: aload_3
    //   117: invokevirtual getProperties : ()Ljava/util/Map;
    //   120: aload #5
    //   122: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   127: checkcast net/portswigger/swagger/v1/models/properties/Property
    //   130: astore #6
    //   132: aload_0
    //   133: aload #6
    //   135: invokevirtual process : (Lnet/portswigger/swagger/v1/models/properties/Property;)V
    //   138: aload_2
    //   139: ifnull -> 94
    //   142: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v2\SwaggerInventory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */