package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;

enum PropertyBuilder$Processor$7 {
  protected boolean isType(String paramString1, String paramString2) {
    return LongProperty.isType(paramString1, paramString2);
  }
  
  protected LongProperty create() {
    return new LongProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    LongProperty longProperty;
    super.merge(paramProperty, paramMap);
    int[] arrayOfInt = AbstractProperty.ZB();
    if (paramProperty instanceof LongProperty) {
      longProperty = (LongProperty)paramProperty;
      mergeNumeric(longProperty, paramMap);
      if (paramMap.containsKey(PropertyBuilder$PropertyId.DEFAULT)) {
        String str = PropertyBuilder$PropertyId.DEFAULT.<String>findValue(paramMap);
        if (str != null) {
          longProperty.setDefault(str);
          if (arrayOfInt != null) {
            longProperty.setDefault((Long)null);
            return paramProperty;
          } 
          return paramProperty;
        } 
      } else {
        return paramProperty;
      } 
    } else {
      return paramProperty;
    } 
    longProperty.setDefault((Long)null);
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    if (isType(paramProperty)) {
      LongProperty longProperty = (LongProperty)paramProperty;
      ModelImpl modelImpl = createModel(longProperty);
      Long long_ = longProperty.getDefault();
      if (long_ != null)
        modelImpl.setDefaultValue(long_.toString()); 
      return (Model)modelImpl;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */