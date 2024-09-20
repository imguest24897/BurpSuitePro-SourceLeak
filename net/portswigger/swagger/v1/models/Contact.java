package net.portswigger.swagger.v1.models;

import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.LinkedHashMap;
import java.util.Map;

public class Contact {
  private String name;
  
  private String url;
  
  private String email;
  
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private static final String a;
  
  public Contact name(String paramString) {
    setName(paramString);
    return this;
  }
  
  public Contact url(String paramString) {
    setUrl(paramString);
    return this;
  }
  
  public Contact email(String paramString) {
    setEmail(paramString);
    return this;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(String paramString) {
    this.email = paramString;
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
    null = 31 * null + ((this.email == null) ? 0 : this.email.hashCode());
    null = 31 * null + ((this.name == null) ? 0 : this.name.hashCode());
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
    Contact contact = (Contact)paramObject;
    if (this.email == null) {
      if (contact.email != null)
        return false; 
    } else if (!this.email.equals(contact.email)) {
      return false;
    } 
    if (this.name == null) {
      if (contact.name != null)
        return false; 
    } else if (!this.name.equals(contact.name)) {
      return false;
    } 
    if (this.url == null) {
      if (contact.url != null)
        return false; 
    } else if (!this.url.equals(contact.url)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (contact.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(contact.vendorExtensions)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc 'sU'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/Contact.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #118
    //   82: goto -> 111
    //   85: iconst_5
    //   86: goto -> 111
    //   89: bipush #37
    //   91: goto -> 111
    //   94: bipush #50
    //   96: goto -> 111
    //   99: bipush #28
    //   101: goto -> 111
    //   104: bipush #101
    //   106: goto -> 111
    //   109: bipush #84
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\Contact.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */