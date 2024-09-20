package net.portswigger.swagger.v1.models.properties;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import net.portswigger.swagger.v1.models.Model;

public class PropertyBuilder {
  public static Property build(String paramString1, String paramString2, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    PropertyBuilder$Processor propertyBuilder$Processor = PropertyBuilder$Processor.fromType(paramString1, paramString2);
    int[] arrayOfInt = AbstractProperty.ZB();
    if (propertyBuilder$Processor == null)
      return null; 
    Map<PropertyBuilder$PropertyId, Object> map1 = (Map<PropertyBuilder$PropertyId, Object>)((paramMap == null) ? Collections.emptyMap() : paramMap);
    if (paramString2 != null) {
      Map<PropertyBuilder$PropertyId, Object> map = new EnumMap<>(PropertyBuilder$PropertyId.class);
      map.putAll(map1);
      map.put(PropertyBuilder$PropertyId.FORMAT, paramString2);
      if (arrayOfInt != null) {
        map = map1;
        return propertyBuilder$Processor.build(map);
      } 
      return propertyBuilder$Processor.build(map);
    } 
    Map<PropertyBuilder$PropertyId, Object> map2 = map1;
    return propertyBuilder$Processor.build(map2);
  }
  
  public static Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    if (paramMap != null && !paramMap.isEmpty()) {
      PropertyBuilder$Processor propertyBuilder$Processor = PropertyBuilder$Processor.fromProperty(paramProperty);
      if (propertyBuilder$Processor != null)
        propertyBuilder$Processor.merge(paramProperty, paramMap); 
    } 
    return paramProperty;
  }
  
  public static Model toModel(Property paramProperty) {
    PropertyBuilder$Processor propertyBuilder$Processor = PropertyBuilder$Processor.fromProperty(paramProperty);
    return (propertyBuilder$Processor != null) ? propertyBuilder$Processor.toModel(paramProperty) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */