package net.portswigger.browser;

import burp.Zbqc;
import java.util.List;

public class Zdn {
  private final String ZE;
  
  private final String Ze;
  
  private final String ZL;
  
  private final List<Zc7> ZM;
  
  private final String Zo;
  
  private boolean Zs;
  
  public Zdn(String paramString1, String paramString2, String paramString3, List<Zc7> paramList, String paramString4) {
    this.ZE = paramString1;
    String str = Zc7.ZRu();
    this.Ze = paramString2;
    this.ZL = paramString3;
    this.ZM = paramList;
    this.Zo = paramString4;
    if (str == null)
      Zbqc.Zr(new Zbqc[5]); 
  }
  
  public String Zp() {
    return this.ZE;
  }
  
  public String ZD() {
    return this.Ze;
  }
  
  public String ZR() {
    return this.ZL;
  }
  
  public String ZW() {
    // Byte code:
    //   0: invokestatic ZRu : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Ze : Ljava/lang/String;
    //   7: astore_2
    //   8: astore_1
    //   9: aload_0
    //   10: getfield ZL : Ljava/lang/String;
    //   13: ifnull -> 54
    //   16: aload_0
    //   17: getfield ZL : Ljava/lang/String;
    //   20: ldc '#'
    //   22: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   25: ifeq -> 43
    //   28: aload_2
    //   29: aload_0
    //   30: getfield ZL : Ljava/lang/String;
    //   33: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_2
    //   39: aload_1
    //   40: ifnonnull -> 54
    //   43: aload_2
    //   44: aload_0
    //   45: getfield ZL : Ljava/lang/String;
    //   48: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   53: astore_2
    //   54: aload_2
    //   55: invokestatic Zwu : ()[Lburp/Zbqc;
    //   58: ifnonnull -> 66
    //   61: ldc 'bJPi3b'
    //   63: invokestatic ZL : (Ljava/lang/String;)V
    //   66: areturn
  }
  
  public List<Zc7> ZL() {
    return this.ZM;
  }
  
  public String Zb() {
    return this.Zo;
  }
  
  public boolean Zo() {
    return this.Zs;
  }
  
  public Zdn Zj() {
    this.Zs = true;
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zdn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */