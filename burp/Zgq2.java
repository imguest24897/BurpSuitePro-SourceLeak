package burp;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zgq2 {
  public static boolean ZA(Zzme paramZzme, Pattern paramPattern) {
    return ZV(paramZzme, paramPattern::lambda$requestContainsPattern$0);
  }
  
  public static boolean Zk(Zzme paramZzme, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: aload_1
    //   3: <illegal opcode> apply : (ZLjava/lang/String;)Ljava/util/function/Function;
    //   8: invokestatic ZV : (Lburp/Zzme;Ljava/util/function/Function;)Z
    //   11: ireturn
  }
  
  private static boolean ZV(Zzme paramZzme, Function<String, Boolean> paramFunction) {
    boolean bool = Zkep.ZK();
    if (paramZzme == null)
      return false; 
    Zbr zbr = paramZzme.ZH6();
    Zefg<Zk94> zefg = zbr.ZO();
    if (zefg != null)
      for (Zk94 zk94 : zefg) {
        String str = zk94.ZZ1();
        if (((Boolean)paramFunction.apply(str)).booleanValue())
          return true; 
        if (bool)
          break; 
      }  
    Zstu zstu = zbr.Zr();
    if (zstu != null) {
      String str = zstu.Zis();
      return ((Boolean)paramFunction.apply(str)).booleanValue();
    } 
    return false;
  }
  
  private static Boolean lambda$requestContainsSearchTerm$1(boolean paramBoolean, String paramString1, String paramString2) {
    String str1 = paramBoolean ? paramString2 : paramString2.toLowerCase();
    String str2 = paramBoolean ? paramString1 : paramString1.toLowerCase();
    return Boolean.valueOf(str1.contains(str2));
  }
  
  private static Boolean lambda$requestContainsPattern$0(Pattern paramPattern, String paramString) {
    Matcher matcher = paramPattern.matcher(paramString);
    return Boolean.valueOf(matcher.find());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgq2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */