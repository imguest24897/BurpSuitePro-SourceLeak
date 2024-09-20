package net.portswigger.swagger.v1.parser.processors;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.models.ArrayModel;
import net.portswigger.swagger.v1.models.ComposedModel;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.RefModel;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.refs.RefType;
import net.portswigger.swagger.v1.parser.ResolverCache;
import net.portswigger.swagger.v1.parser.util.RefUtils;

public class ModelProcessor {
  private final PropertyProcessor propertyProcessor;
  
  private final ExternalRefProcessor externalRefProcessor;
  
  public ModelProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.propertyProcessor = new PropertyProcessor(paramResolverCache, paramSwagger);
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramSwagger);
  }
  
  public void processModel(Model paramModel) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 9
    //   8: return
    //   9: aload_1
    //   10: instanceof net/portswigger/swagger/v1/models/RefModel
    //   13: ifeq -> 28
    //   16: aload_0
    //   17: aload_1
    //   18: checkcast net/portswigger/swagger/v1/models/RefModel
    //   21: invokevirtual processRefModel : (Lnet/portswigger/swagger/v1/models/RefModel;)V
    //   24: aload_2
    //   25: ifnonnull -> 78
    //   28: aload_1
    //   29: instanceof net/portswigger/swagger/v1/models/ArrayModel
    //   32: ifeq -> 47
    //   35: aload_0
    //   36: aload_1
    //   37: checkcast net/portswigger/swagger/v1/models/ArrayModel
    //   40: invokevirtual processArrayModel : (Lnet/portswigger/swagger/v1/models/ArrayModel;)V
    //   43: aload_2
    //   44: ifnonnull -> 78
    //   47: aload_1
    //   48: instanceof net/portswigger/swagger/v1/models/ComposedModel
    //   51: ifeq -> 66
    //   54: aload_0
    //   55: aload_1
    //   56: checkcast net/portswigger/swagger/v1/models/ComposedModel
    //   59: invokevirtual processComposedModel : (Lnet/portswigger/swagger/v1/models/ComposedModel;)V
    //   62: aload_2
    //   63: ifnonnull -> 78
    //   66: aload_1
    //   67: instanceof net/portswigger/swagger/v1/models/ModelImpl
    //   70: ifeq -> 78
    //   73: aload_0
    //   74: aload_1
    //   75: invokevirtual processModelProperties : (Lnet/portswigger/swagger/v1/models/Model;)V
    //   78: return
  }
  
  private void processModelProperties(Model paramModel) {
    Map map = paramModel.getProperties();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (map == null)
      return; 
    for (Map.Entry entry : map.entrySet()) {
      Property property = (Property)entry.getValue();
      this.propertyProcessor.processProperty(property);
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void processComposedModel(ComposedModel paramComposedModel) {
    processModel(paramComposedModel.getParent());
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    processModel(paramComposedModel.getChild());
    List list = paramComposedModel.getInterfaces();
    if (list != null)
      for (RefModel refModel : list) {
        processRefModel(refModel);
        if (arrayOfZbqc == null)
          break; 
      }  
    processModelProperties((Model)paramComposedModel);
  }
  
  private void processArrayModel(ArrayModel paramArrayModel) {
    Property property = paramArrayModel.getItems();
    if (property != null)
      this.propertyProcessor.processProperty(property); 
  }
  
  private void processRefModel(RefModel paramRefModel) {
    String str = null;
    if (RefUtils.isAnExternalRefFormat(paramRefModel.getRefFormat()))
      str = this.externalRefProcessor.processRefToExternalDefinition(paramRefModel.get$ref(), paramRefModel.getRefFormat()); 
    if (str != null)
      paramRefModel.set$ref(RefType.DEFINITION.getInternalPrefix() + RefType.DEFINITION.getInternalPrefix()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\ModelProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */