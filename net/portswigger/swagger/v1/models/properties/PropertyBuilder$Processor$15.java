package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;

enum PropertyBuilder$Processor$15 {
  protected boolean isType(String paramString1, String paramString2) {
    return UUIDProperty.isType(paramString1, paramString2);
  }
  
  protected UUIDProperty create() {
    return new UUIDProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    super.merge(paramProperty, paramMap);
    if (paramProperty instanceof UUIDProperty) {
      UUIDProperty uUIDProperty = (UUIDProperty)paramProperty;
      if (paramMap.containsKey(PropertyBuilder$PropertyId.DEFAULT)) {
        String str = PropertyBuilder$PropertyId.DEFAULT.<String>findValue(paramMap);
        paramProperty.setDefault(str);
      } 
      if (paramMap.containsKey(PropertyBuilder$PropertyId.MIN_LENGTH)) {
        Integer integer = PropertyBuilder$PropertyId.MIN_LENGTH.<Integer>findValue(paramMap);
        uUIDProperty.setMinLength(integer);
      } 
      if (paramMap.containsKey(PropertyBuilder$PropertyId.MAX_LENGTH)) {
        Integer integer = PropertyBuilder$PropertyId.MAX_LENGTH.<Integer>findValue(paramMap);
        uUIDProperty.setMaxLength(integer);
      } 
      if (paramMap.containsKey(PropertyBuilder$PropertyId.PATTERN)) {
        String str = PropertyBuilder$PropertyId.PATTERN.<String>findValue(paramMap);
        uUIDProperty.setPattern(str);
      } 
    } 
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    if (isType(paramProperty)) {
      UUIDProperty uUIDProperty = (UUIDProperty)paramProperty;
      ModelImpl modelImpl = createModel(uUIDProperty);
      modelImpl.setDefaultValue(uUIDProperty.getDefault());
      return (Model)modelImpl;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$15.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */