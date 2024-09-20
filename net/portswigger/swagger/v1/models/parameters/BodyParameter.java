package net.portswigger.swagger.v1.models.parameters;

import com.fasterxml.Zy1;
import java.util.LinkedHashMap;
import java.util.Map;
import net.portswigger.swagger.v1.models.Model;

public class BodyParameter extends AbstractParameter implements Parameter {
  Model schema;
  
  Map<String, String> examples;
  
  private static final String b;
  
  public BodyParameter() {
    setIn(b);
  }
  
  public BodyParameter schema(Model paramModel) {
    setSchema(paramModel);
    return this;
  }
  
  public BodyParameter example(String paramString1, String paramString2) {
    addExample(paramString1, paramString2);
    return this;
  }
  
  public BodyParameter description(String paramString) {
    setDescription(paramString);
    return this;
  }
  
  public BodyParameter name(String paramString) {
    setName(paramString);
    return this;
  }
  
  public Model getSchema() {
    return this.schema;
  }
  
  public void setSchema(Model paramModel) {
    this.schema = paramModel;
  }
  
  public void addExample(String paramString1, String paramString2) {
    if (this.examples == null)
      this.examples = new LinkedHashMap<>(); 
    this.examples.put(paramString1, paramString2);
  }
  
  @Zy1("x-examples")
  public Map<String, String> getExamples() {
    return this.examples;
  }
  
  public void setExamples(Map<String, String> paramMap) {
    this.examples = paramMap;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    return 31 * null + ((this.schema == null) ? 0 : this.schema.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!super.equals(paramObject))
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    BodyParameter bodyParameter = (BodyParameter)paramObject;
    if (this.schema == null) {
      if (bodyParameter.schema != null)
        return false; 
    } else if (!this.schema.equals(bodyParameter.schema)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc 'NNZ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/swagger/v1/models/parameters/BodyParameter.b : Ljava/lang/String;
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
    //   80: bipush #52
    //   82: goto -> 112
    //   85: bipush #57
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #101
    //   97: goto -> 112
    //   100: bipush #43
    //   102: goto -> 112
    //   105: bipush #58
    //   107: goto -> 112
    //   110: bipush #89
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\parameters\BodyParameter.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */