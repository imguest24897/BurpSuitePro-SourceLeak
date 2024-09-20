package burp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Zee_ {
  private final Zeqj ZP;
  
  public Zee_(Zeqj paramZeqj) {
    this.ZP = paramZeqj;
  }
  
  public Zmrn Zo(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic ZF : (Ljava/lang/String;)Lburp/Zmgt;
    //   4: astore_2
    //   5: aload_0
    //   6: aload_2
    //   7: aload_1
    //   8: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zmgt;Ljava/lang/String;)Lburp/Zmrn;
    //   13: areturn
  }
  
  public Zmrn Zw(Zeqj paramZeqj) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zeqj;)Lburp/Zmrn;
    //   7: areturn
  }
  
  public Zmrn ZB(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zm3v;)Lburp/Zmrn;
    //   7: areturn
  }
  
  public Zmrn Zt(Zeqj paramZeqj) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zeqj;)Lburp/Zmrn;
    //   7: areturn
  }
  
  public Zmrn Zl(Zeqj paramZeqj) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zeqj;)Lburp/Zmrn;
    //   7: areturn
  }
  
  public Zmrn Zq(Zm3v<String> paramZm3v) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zm3v;)Lburp/Zmrn;
    //   7: areturn
  }
  
  public Zmrn ZY(Set<?> paramSet) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   11: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   16: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   21: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   26: invokeinterface toList : ()Ljava/util/List;
    //   31: astore_2
    //   32: aload_0
    //   33: aload_2
    //   34: <illegal opcode> Zk : (Lburp/Zee_;Ljava/util/List;)Lburp/Zmrn;
    //   39: areturn
  }
  
  public Zmrn ZW(Zeqj paramZeqj) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> Zk : (Lburp/Zee_;Lburp/Zeqj;)Lburp/Zmrn;
    //   7: areturn
  }
  
  public Zmrn ZZ(Object... paramVarArgs) {
    return ZY(Set.of(paramVarArgs));
  }
  
  private boolean Zn(Pattern paramPattern, Object paramObject) {
    if (paramObject instanceof Zx69) {
      Zx69 zx69 = (Zx69)paramObject;
      return zx69.ZS() ? zx69.Zu(paramPattern) : paramPattern.matcher(zx69.Zs()).find();
    } 
    return paramPattern.matcher((String)paramObject).find();
  }
  
  private boolean lambda$isIn$8(Zeqj paramZeqj, Zzvx paramZzvx) {
    Object object = paramZeqj.Zj(paramZzvx, new String[0]);
    if (object instanceof List) {
      List<?> list = (List)object;
      return ZY(new HashSet(list)).Zk(paramZzvx);
    } 
    if (object instanceof Set) {
      Set<?> set = (Set)object;
      return ZY(set).Zk(paramZzvx);
    } 
    if (object instanceof String) {
      String str1 = (String)object;
      String str2 = this.ZP.ZA(paramZzvx, new String[0]);
      boolean bool = str1.contains(str2);
      paramZzvx.Zw().Ze(str2, str1, bool);
      return bool;
    } 
    return ZZ(new Object[] { object }).Zk(paramZzvx);
  }
  
  private boolean lambda$isIn$7(List paramList, Zzvx paramZzvx) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   6: aload_0
    //   7: aload_2
    //   8: <illegal opcode> test : (Lburp/Zee_;Lburp/Zzvx;)Ljava/util/function/Predicate;
    //   13: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   18: ireturn
  }
  
  private boolean lambda$isIn$6(Zzvx paramZzvx, Zmgt paramZmgt) {
    Pattern pattern = Pattern.compile("^" + Pattern.quote(paramZmgt.ZT(paramZzvx)) + "$");
    Object object = this.ZP.Zj(paramZzvx, new String[0]);
    return Zn(pattern, object);
  }
  
  private boolean lambda$isEqualTo$5(Zm3v<String> paramZm3v, Zzvx paramZzvx) {
    String str1 = paramZm3v.Zm(paramZzvx);
    Pattern pattern = Pattern.compile("^" + Pattern.quote(str1) + "$");
    Object object = this.ZP.Zj(paramZzvx, new String[0]);
    boolean bool = Zn(pattern, object);
    Zx69 zx69 = (Zx69)object;
    String str2 = (object instanceof Zx69) ? zx69.Zs() : String.valueOf(object);
    paramZzvx.Zw().ZE(str1, str2, bool);
    return bool;
  }
  
  private boolean lambda$isEqualTo$4(Zeqj paramZeqj, Zzvx paramZzvx) {
    String str = paramZeqj.ZA(paramZzvx, new String[0]);
    return Zq(Zm7g.ZF(str)).Zk(paramZzvx);
  }
  
  private boolean lambda$contains$3(Zeqj paramZeqj, Zzvx paramZzvx) {
    String str = paramZeqj.ZA(paramZzvx, new String[0]);
    return ZB(Zm7g.ZF(str)).Zk(paramZzvx);
  }
  
  private boolean lambda$contains$2(Zm3v<String> paramZm3v, Zzvx paramZzvx) {
    String str1 = paramZm3v.Zm(paramZzvx);
    Pattern pattern = Pattern.compile(Pattern.quote(str1));
    Object object = this.ZP.Zj(paramZzvx, new String[0]);
    boolean bool = Zn(pattern, object);
    Zx69 zx69 = (Zx69)object;
    String str2 = (object instanceof Zx69) ? zx69.Zs() : String.valueOf(object);
    paramZzvx.Zw().Ze(str1, str2, bool);
    return bool;
  }
  
  private boolean lambda$withRegex$1(Zeqj paramZeqj, Zzvx paramZzvx) {
    String str = paramZeqj.ZA(paramZzvx, new String[0]);
    return Zo(str).Zk(paramZzvx);
  }
  
  private boolean lambda$withRegex$0(Zmgt paramZmgt, String paramString, Zzvx paramZzvx) {
    String str1 = paramZmgt.ZT(paramZzvx);
    Pattern pattern = Pattern.compile(str1);
    Object object = this.ZP.Zj(paramZzvx, new String[0]);
    boolean bool = Zn(pattern, object);
    Zx69 zx69 = (Zx69)object;
    String str2 = (object instanceof Zx69) ? zx69.Zs() : String.valueOf(object);
    paramZzvx.Zw().ZJ(paramString, str2, bool);
    return bool;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zee_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */