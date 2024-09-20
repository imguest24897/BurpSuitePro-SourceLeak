package net.portswigger.swagger.v1.parser.util;

public class SwaggerDeserializer$Location {
  private String location;
  
  private String key;
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof SwaggerDeserializer$Location))
      return false; 
    SwaggerDeserializer$Location swaggerDeserializer$Location = (SwaggerDeserializer$Location)paramObject;
    if ((this.location != null) ? !this.location.equals(swaggerDeserializer$Location.location) : (swaggerDeserializer$Location.location != null))
      return false; 
    if ((this.key != null) ? !this.key.equals(swaggerDeserializer$Location.key) : (swaggerDeserializer$Location.key != null))
      return false; 
  }
  
  public int hashCode() {
    null = (this.location != null) ? this.location.hashCode() : 0;
    return 31 * null + ((this.key != null) ? this.key.hashCode() : 0);
  }
  
  public SwaggerDeserializer$Location(String paramString1, String paramString2) {
    this.location = paramString1;
    this.key = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\SwaggerDeserializer$Location.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */