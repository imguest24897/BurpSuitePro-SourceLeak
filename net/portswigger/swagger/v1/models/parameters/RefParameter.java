package net.portswigger.swagger.v1.models.parameters;

import com.fasterxml.Zyx;
import net.portswigger.swagger.v1.models.refs.GenericRef;
import net.portswigger.swagger.v1.models.refs.RefFormat;
import net.portswigger.swagger.v1.models.refs.RefType;

public class RefParameter extends AbstractParameter implements Parameter {
  private GenericRef genericRef;
  
  private static final String b;
  
  public RefParameter(String paramString) {
    set$ref(paramString);
  }
  
  public RefParameter(String paramString, RefFormat paramRefFormat) {
    this.genericRef = new GenericRef(RefType.PARAMETER, paramString, paramRefFormat);
  }
  
  public static boolean isType(String paramString1, String paramString2) {
    return b.equals(paramString1);
  }
  
  public RefParameter asDefault(String paramString) {
    set$ref(RefType.PARAMETER.getInternalPrefix() + RefType.PARAMETER.getInternalPrefix());
    return this;
  }
  
  public RefParameter description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public String get$ref() {
    return this.genericRef.getRef();
  }
  
  public void set$ref(String paramString) {
    this.genericRef = new GenericRef(RefType.PARAMETER, paramString);
  }
  
  @Zyx
  public RefFormat getRefFormat() {
    return this.genericRef.getFormat();
  }
  
  @Zyx
  public boolean getRequired() {
    return this.required;
  }
  
  @Zyx
  public String getSimpleRef() {
    return this.genericRef.getSimpleRef();
  }
  
  public String getOriginalRef() {
    return (this.genericRef != null) ? this.genericRef.getOriginalRef() : null;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    return 31 * null + ((this.genericRef == null) ? 0 : this.genericRef.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!super.equals(paramObject))
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    RefParameter refParameter = (RefParameter)paramObject;
    if (this.genericRef == null) {
      if (refParameter.genericRef != null)
        return false; 
    } else if (!this.genericRef.equals(refParameter.genericRef)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #96
    //   2: ldc 'sEW'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/parameters/RefParameter.b : Ljava/lang/String;
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
    //   80: bipush #55
    //   82: goto -> 111
    //   85: iconst_4
    //   86: goto -> 111
    //   89: bipush #64
    //   91: goto -> 111
    //   94: bipush #81
    //   96: goto -> 111
    //   99: bipush #39
    //   101: goto -> 111
    //   104: bipush #64
    //   106: goto -> 111
    //   109: bipush #18
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\parameters\RefParameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */