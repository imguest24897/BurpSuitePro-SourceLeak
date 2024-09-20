package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;

enum PropertyBuilder$Processor$8 {
  protected boolean isType(String paramString1, String paramString2) {
    return FloatProperty.isType(paramString1, paramString2);
  }
  
  protected FloatProperty create() {
    return new FloatProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    FloatProperty floatProperty;
    super.merge(paramProperty, paramMap);
    int[] arrayOfInt = AbstractProperty.ZB();
    if (paramProperty instanceof FloatProperty) {
      floatProperty = (FloatProperty)paramProperty;
      mergeNumeric(floatProperty, paramMap);
      if (paramMap.containsKey(PropertyBuilder$PropertyId.DEFAULT)) {
        String str = PropertyBuilder$PropertyId.DEFAULT.<String>findValue(paramMap);
        if (str != null) {
          floatProperty.setDefault(str);
          if (arrayOfInt != null) {
            floatProperty.setDefault((Float)null);
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
    floatProperty.setDefault((Float)null);
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    if (isType(paramProperty)) {
      FloatProperty floatProperty = (FloatProperty)paramProperty;
      ModelImpl modelImpl = createModel(floatProperty);
      Float float_ = floatProperty.getDefault();
      if (float_ != null)
        modelImpl.setDefaultValue(float_.toString()); 
      return (Model)modelImpl;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */