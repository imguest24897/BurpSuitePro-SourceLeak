package net.portswigger.swagger.v2.util;

public class OpenAPIDeserializer$Location {
  private String location;
  
  private String key;
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof OpenAPIDeserializer$Location))
      return false; 
    OpenAPIDeserializer$Location openAPIDeserializer$Location = (OpenAPIDeserializer$Location)paramObject;
    if ((this.location != null) ? !this.location.equals(openAPIDeserializer$Location.location) : (openAPIDeserializer$Location.location != null))
      return false; 
    if ((this.key != null) ? !this.key.equals(openAPIDeserializer$Location.key) : (openAPIDeserializer$Location.key != null))
      return false; 
  }
  
  public int hashCode() {
    null = (this.location != null) ? this.location.hashCode() : 0;
    return 31 * null + ((this.key != null) ? this.key.hashCode() : 0);
  }
  
  public OpenAPIDeserializer$Location(String paramString1, String paramString2) {
    this.location = paramString1;
    this.key = paramString2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\OpenAPIDeserializer$Location.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */