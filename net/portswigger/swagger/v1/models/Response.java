package net.portswigger.swagger.v1.models;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.LinkedHashMap;
import java.util.Map;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.util.PropertyModelConverter;

public class Response {
  private String description;
  
  private Model schemaAsModel;
  
  private Property schemaAsProperty;
  
  private Map<String, Object> examples;
  
  private Map<String, Property> headers;
  
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private static final String a;
  
  public Response description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public Response example(String paramString, Object paramObject) {
    if (this.examples == null)
      this.examples = new LinkedHashMap<>(); 
    this.examples.put(paramString, paramObject);
    return this;
  }
  
  public Response header(String paramString, Property paramProperty) {
    addHeader(paramString, paramProperty);
    return this;
  }
  
  public Response headers(Map<String, Property> paramMap) {
    this.headers = paramMap;
    return this;
  }
  
  public Response vendorExtension(String paramString, Object paramObject) {
    setVendorExtension(paramString, paramObject);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  @Deprecated
  public Property getSchema() {
    return (this.schemaAsProperty == null && this.schemaAsModel != null) ? (new PropertyModelConverter()).modelToProperty(this.schemaAsModel) : this.schemaAsProperty;
  }
  
  @Deprecated
  public void setSchema(Property paramProperty) {
    this.schemaAsProperty = paramProperty;
  }
  
  @Deprecated
  public Response schema(Property paramProperty) {
    setSchema(paramProperty);
    return this;
  }
  
  public Model getResponseSchema() {
    return (this.schemaAsModel == null && this.schemaAsProperty != null) ? (new PropertyModelConverter()).propertyToModel(this.schemaAsProperty) : this.schemaAsModel;
  }
  
  public void setResponseSchema(Model paramModel) {
    this.schemaAsModel = paramModel;
  }
  
  public Response responseSchema(Model paramModel) {
    setResponseSchema(paramModel);
    return this;
  }
  
  public Map<String, Object> getExamples() {
    return this.examples;
  }
  
  public void setExamples(Map<String, Object> paramMap) {
    this.examples = paramMap;
  }
  
  public Map<String, Property> getHeaders() {
    return this.headers;
  }
  
  public void setHeaders(Map<String, Property> paramMap) {
    this.headers = paramMap;
  }
  
  public void addHeader(String paramString, Property paramProperty) {
    if (this.headers == null)
      this.headers = new LinkedHashMap<>(); 
    this.headers.put(paramString, paramProperty);
  }
  
  @Zyi
  public Map<String, Object> getVendorExtensions() {
    return this.vendorExtensions;
  }
  
  @Zv8
  public void setVendorExtension(String paramString, Object paramObject) {
    if (paramString.startsWith(a))
      this.vendorExtensions.put(paramString, paramObject); 
  }
  
  public void setVendorExtensions(Map<String, Object> paramMap) {
    this.vendorExtensions = paramMap;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof Response))
      return false; 
    Response response = (Response)paramObject;
    return ((this.description != null) ? !this.description.equals(response.description) : (response.description != null)) ? false : (((this.schemaAsModel != null) ? !this.schemaAsModel.equals(response.schemaAsModel) : (response.schemaAsModel != null)) ? false : (((this.schemaAsProperty != null) ? !this.schemaAsProperty.equals(response.schemaAsProperty) : (response.schemaAsProperty != null)) ? false : (((this.examples != null) ? !this.examples.equals(response.examples) : (response.examples != null)) ? false : (((this.headers != null) ? !this.headers.equals(response.headers) : (response.headers != null)) ? false : ((this.vendorExtensions != null) ? this.vendorExtensions.equals(response.vendorExtensions) : ((response.vendorExtensions == null)))))));
  }
  
  public int hashCode() {
    null = (this.description != null) ? this.description.hashCode() : 0;
    null = 31 * null + ((this.schemaAsModel != null) ? this.schemaAsModel.hashCode() : 0);
    null = 31 * null + ((this.schemaAsProperty != null) ? this.schemaAsProperty.hashCode() : 0);
    null = 31 * null + ((this.examples != null) ? this.examples.hashCode() : 0);
    null = 31 * null + ((this.headers != null) ? this.headers.hashCode() : 0);
    return 31 * null + ((this.vendorExtensions != null) ? this.vendorExtensions.hashCode() : 0);
  }
  
  static {
    // Byte code:
    //   0: bipush #75
    //   2: ldc 'h'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/Response.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #91
    //   82: goto -> 111
    //   85: bipush #114
    //   87: goto -> 111
    //   90: bipush #125
    //   92: goto -> 111
    //   95: bipush #105
    //   97: goto -> 111
    //   100: bipush #59
    //   102: goto -> 111
    //   105: bipush #112
    //   107: goto -> 111
    //   110: iconst_3
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Response.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */