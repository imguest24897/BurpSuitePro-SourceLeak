package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.ArrayModel;
import net.portswigger.swagger.v1.models.Model;

enum PropertyBuilder$Processor$18 {
  protected boolean isType(String paramString1, String paramString2) {
    return ArrayProperty.isType(paramString1);
  }
  
  protected ArrayProperty create() {
    return new ArrayProperty();
  }
  
  public Model toModel(Property paramProperty) {
    if (paramProperty instanceof ArrayProperty) {
      ArrayProperty arrayProperty = (ArrayProperty)paramProperty;
      return (Model)(new ArrayModel()).items(arrayProperty.getItems()).description(arrayProperty.getDescription());
    } 
    return null;
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    super.merge(paramProperty, paramMap);
    if (paramProperty instanceof ArrayProperty) {
      ArrayProperty arrayProperty = (ArrayProperty)paramProperty;
      if (paramMap.containsKey(PropertyBuilder$PropertyId.MIN_ITEMS)) {
        Integer integer = PropertyBuilder$PropertyId.MIN_ITEMS.<Integer>findValue(paramMap);
        arrayProperty.setMinItems(integer);
      } 
      if (paramMap.containsKey(PropertyBuilder$PropertyId.MAX_ITEMS)) {
        Integer integer = PropertyBuilder$PropertyId.MAX_ITEMS.<Integer>findValue(paramMap);
        arrayProperty.setMaxItems(integer);
      } 
      if (paramMap.containsKey(PropertyBuilder$PropertyId.UNIQUE_ITEMS)) {
        Boolean bool = PropertyBuilder$PropertyId.UNIQUE_ITEMS.<Boolean>findValue(paramMap);
        arrayProperty.setUniqueItems(bool);
      } 
    } 
    return paramProperty;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$18.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */