package net.portswigger.swagger.v1.models.auth;

public class BasicAuthDefinition extends AbstractSecuritySchemeDefinition {
  private String type = b;
  
  private static final String b;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    return 31 * null + ((this.type == null) ? 0 : this.type.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!super.equals(paramObject))
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    BasicAuthDefinition basicAuthDefinition = (BasicAuthDefinition)paramObject;
    if (this.type == null) {
      if (basicAuthDefinition.type != null)
        return false; 
    } else if (!this.type.equals(basicAuthDefinition.type)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: ldc 'FEyU'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic net/portswigger/swagger/v1/models/auth/BasicAuthDefinition.b : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #32
    //   82: goto -> 111
    //   85: bipush #32
    //   87: goto -> 111
    //   90: bipush #99
    //   92: goto -> 111
    //   95: bipush #20
    //   97: goto -> 111
    //   100: bipush #50
    //   102: goto -> 111
    //   105: bipush #36
    //   107: goto -> 111
    //   110: iconst_5
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
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
    //   150: goto -> 7
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\auth\BasicAuthDefinition.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */