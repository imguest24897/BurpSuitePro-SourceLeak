package net.portswigger.swagger.v1.parser.processors;

import burp.Zbqc;
import java.util.List;
import java.util.Map;
import net.portswigger.swagger.v1.models.Swagger;
import net.portswigger.swagger.v1.models.properties.ArrayProperty;
import net.portswigger.swagger.v1.models.properties.ComposedProperty;
import net.portswigger.swagger.v1.models.properties.MapProperty;
import net.portswigger.swagger.v1.models.properties.ObjectProperty;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.models.properties.RefProperty;
import net.portswigger.swagger.v1.models.refs.RefType;
import net.portswigger.swagger.v1.parser.ResolverCache;
import net.portswigger.swagger.v1.parser.util.RefUtils;

public class PropertyProcessor {
  private final ExternalRefProcessor externalRefProcessor;
  
  public PropertyProcessor(ResolverCache paramResolverCache, Swagger paramSwagger) {
    this.externalRefProcessor = new ExternalRefProcessor(paramResolverCache, paramSwagger);
  }
  
  public void processProperty(Property paramProperty) {
    // Byte code:
    //   0: invokestatic ZI : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: instanceof net/portswigger/swagger/v1/models/properties/RefProperty
    //   8: ifeq -> 23
    //   11: aload_0
    //   12: aload_1
    //   13: checkcast net/portswigger/swagger/v1/models/properties/RefProperty
    //   16: invokevirtual processRefProperty : (Lnet/portswigger/swagger/v1/models/properties/RefProperty;)V
    //   19: aload_2
    //   20: ifnonnull -> 95
    //   23: aload_1
    //   24: instanceof net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   27: ifeq -> 42
    //   30: aload_0
    //   31: aload_1
    //   32: checkcast net/portswigger/swagger/v1/models/properties/ArrayProperty
    //   35: invokevirtual processArrayProperty : (Lnet/portswigger/swagger/v1/models/properties/ArrayProperty;)V
    //   38: aload_2
    //   39: ifnonnull -> 95
    //   42: aload_1
    //   43: instanceof net/portswigger/swagger/v1/models/properties/MapProperty
    //   46: ifeq -> 61
    //   49: aload_0
    //   50: aload_1
    //   51: checkcast net/portswigger/swagger/v1/models/properties/MapProperty
    //   54: invokevirtual processMapProperty : (Lnet/portswigger/swagger/v1/models/properties/MapProperty;)V
    //   57: aload_2
    //   58: ifnonnull -> 95
    //   61: aload_1
    //   62: instanceof net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   65: ifeq -> 80
    //   68: aload_0
    //   69: aload_1
    //   70: checkcast net/portswigger/swagger/v1/models/properties/ObjectProperty
    //   73: invokevirtual processObjectProperty : (Lnet/portswigger/swagger/v1/models/properties/ObjectProperty;)V
    //   76: aload_2
    //   77: ifnonnull -> 95
    //   80: aload_1
    //   81: instanceof net/portswigger/swagger/v1/models/properties/ComposedProperty
    //   84: ifeq -> 95
    //   87: aload_0
    //   88: aload_1
    //   89: checkcast net/portswigger/swagger/v1/models/properties/ComposedProperty
    //   92: invokevirtual processComposedProperty : (Lnet/portswigger/swagger/v1/models/properties/ComposedProperty;)V
    //   95: return
  }
  
  private void processRefProperty(RefProperty paramRefProperty) {
    if (RefUtils.isAnExternalRefFormat(paramRefProperty.getRefFormat())) {
      String str = this.externalRefProcessor.processRefToExternalDefinition(paramRefProperty.get$ref(), paramRefProperty.getRefFormat());
      if (str != null)
        paramRefProperty.set$ref(RefType.DEFINITION.getInternalPrefix() + RefType.DEFINITION.getInternalPrefix()); 
    } 
  }
  
  private void processMapProperty(MapProperty paramMapProperty) {
    Property property = paramMapProperty.getAdditionalProperties();
    if (property != null)
      processProperty(property); 
  }
  
  private void processArrayProperty(ArrayProperty paramArrayProperty) {
    Property property = paramArrayProperty.getItems();
    if (property != null)
      processProperty(property); 
  }
  
  private void processObjectProperty(ObjectProperty paramObjectProperty) {
    Map map = paramObjectProperty.getProperties();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (map != null)
      for (Property property : map.values()) {
        processProperty(property);
        if (arrayOfZbqc == null)
          break; 
      }  
  }
  
  private void processComposedProperty(ComposedProperty paramComposedProperty) {
    List list = paramComposedProperty.getAllOf();
    Zbqc[] arrayOfZbqc = ExternalRefProcessor.ZI();
    if (list != null)
      for (Property property : list) {
        processProperty(property);
        if (arrayOfZbqc == null)
          break; 
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parser\processors\PropertyProcessor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */