package net.portswigger.swagger.v1.models.properties;

enum PropertyBuilder$Processor$5 {
  protected boolean isType(String paramString1, String paramString2) {
    return DateTimeProperty.isType(paramString1, paramString2);
  }
  
  protected DateTimeProperty create() {
    return new DateTimeProperty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PropertyBuilder$Processor$5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */