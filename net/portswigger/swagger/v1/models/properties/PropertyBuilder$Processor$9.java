package net.portswigger.swagger.v1.models.properties;

import java.util.Map;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.ModelImpl;

enum PropertyBuilder$Processor$9 {
  protected boolean isType(String paramString1, String paramString2) {
    return DoubleProperty.isType(paramString1, paramString2);
  }
  
  protected DoubleProperty create() {
    return new DoubleProperty();
  }
  
  public Property merge(Property paramProperty, Map<PropertyBuilder$PropertyId, Object> paramMap) {
    DoubleProperty doubleProperty;
    super.merge(paramProperty, paramMap);
    int[] arrayOfInt = AbstractProperty.ZB();
    if (paramProperty instanceof DoubleProperty) {
      doubleProperty = (DoubleProperty)paramProperty;
      mergeNumeric(doubleProperty, paramMap);
      if (paramMap.containsKey(PropertyBuilder$PropertyId.DEFAULT)) {
        String str = PropertyBuilder$PropertyId.DEFAULT.<String>findValue(paramMap);
        if (str != null) {
          doubleProperty.setDefault(str);
          if (arrayOfInt != null) {
            doubleProperty.setDefault((Double)null);
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
    doubleProperty.setDefault((Double)null);
    return paramProperty;
  }
  
  public Model toModel(Property paramProperty) {
    if (isType(paramProperty)) {
      DoubleProperty doubleProperty = (DoubleProperty)paramProperty;
      ModelImpl modelImpl = createModel(doubleProperty);
      Double double_ = doubleProperty.getDefault();
      if (double_ != null)
        modelImpl.setDefaultValue(double_.toString()); 
      return (Model)modelImpl;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */