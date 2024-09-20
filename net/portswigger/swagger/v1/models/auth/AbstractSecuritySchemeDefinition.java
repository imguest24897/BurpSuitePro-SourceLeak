package net.portswigger.swagger.v1.models.auth;

import burp.Zbqc;
import com.fasterxml.Zv8;
import com.fasterxml.Zyi;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractSecuritySchemeDefinition implements SecuritySchemeDefinition {
  private Map<String, Object> vendorExtensions = new LinkedHashMap<>();
  
  private String description;
  
  private static Zbqc[] Zi;
  
  private static final String a;
  
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
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public int hashCode() {
    byte b = 31;
    null = 1;
    null = 31 * null + ((this.description == null) ? 0 : this.description.hashCode());
    return 31 * null + ((this.vendorExtensions == null) ? 0 : this.vendorExtensions.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    AbstractSecuritySchemeDefinition abstractSecuritySchemeDefinition = (AbstractSecuritySchemeDefinition)paramObject;
    if (this.description == null) {
      if (abstractSecuritySchemeDefinition.description != null)
        return false; 
    } else if (!this.description.equals(abstractSecuritySchemeDefinition.description)) {
      return false;
    } 
    if (this.vendorExtensions == null) {
      if (abstractSecuritySchemeDefinition.vendorExtensions != null)
        return false; 
    } else if (!this.vendorExtensions.equals(abstractSecuritySchemeDefinition.vendorExtensions)) {
      return false;
    } 
    return true;
  }
  
  public static void ZZ(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZS() {
    return Zi;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZS : ()[Lburp/Zbqc;
    //   3: ifnull -> 13
    //   6: iconst_3
    //   7: anewarray burp/Zbqc
    //   10: invokestatic ZZ : ([Lburp/Zbqc;)V
    //   13: bipush #102
    //   15: ldc '\\rp'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic net/portswigger/swagger/v1/models/auth/AbstractSecuritySchemeDefinition.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #19
    //   94: goto -> 124
    //   97: bipush #59
    //   99: goto -> 124
    //   102: bipush #105
    //   104: goto -> 124
    //   107: bipush #45
    //   109: goto -> 124
    //   112: bipush #105
    //   114: goto -> 124
    //   117: bipush #114
    //   119: goto -> 124
    //   122: bipush #55
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\auth\AbstractSecuritySchemeDefinition.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */