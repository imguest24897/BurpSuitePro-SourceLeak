package net.portswigger.swagger.v1.models;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExternalDocs {
  private String description;
  
  private String url;
  
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private static final String a;
  
  public ExternalDocs() {}
  
  public ExternalDocs(String paramString1, String paramString2) {
    setDescription(paramString1);
    setUrl(paramString2);
  }
  
  public ExternalDocs description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public ExternalDocs url(String paramString) {
    setUrl(paramString);
    return this;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
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
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    null = 31 * null + ((this.url == null) ? 0 : this.url.hashCode());
    return 31 * null + ((this.vendorExtensions == null) ? 0 : this.vendorExtensions.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    ExternalDocs externalDocs = (ExternalDocs)paramObject;
    if (this.description == null) {
      if (externalDocs.description != null)
        return false; 
    } else if (!this.description.equals(externalDocs.description)) {
      return false;
    } 
    if (this.url == null) {
      if (externalDocs.url != null)
        return false; 
    } else if (!this.url.equals(externalDocs.url)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (externalDocs.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(externalDocs.vendorExtensions)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #71
    //   2: ldc 's'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/ExternalDocs.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
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
    //   80: bipush #33
    //   82: goto -> 112
    //   85: bipush #25
    //   87: goto -> 112
    //   90: bipush #92
    //   92: goto -> 112
    //   95: bipush #119
    //   97: goto -> 112
    //   100: bipush #8
    //   102: goto -> 112
    //   105: bipush #18
    //   107: goto -> 112
    //   110: bipush #56
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\ExternalDocs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */