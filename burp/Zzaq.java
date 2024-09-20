package burp;

import java.util.Objects;

class Zzaq {
  static Zkg3 Zq(Zk28 paramZk28) {
    return new Zkg3(paramZk28::lambda$createValueInputter$0, paramZk28.ZRC());
  }
  
  static String Zl(Zk28 paramZk28, Ze7n paramZe7n) {
    return paramZe7n.ZH().Zd() ? paramZe7n.Ze() : ((Zs2c.Zc(paramZe7n).equals(paramZk28.ZRT()) && paramZe7n.ZX().contains(paramZk28.ZRF())) ? paramZk28.ZRF() : ((paramZe7n.ZY() == Zmtz.TEXT || paramZe7n.ZY() == Zmtz.NUMBER || paramZe7n.ZY() == Zmtz.BOOLEAN) ? Zb(paramZe7n, paramZk28) : paramZe7n.Ze()));
  }
  
  private static String Zb(Ze7n paramZe7n, Zk28 paramZk28) {
    if (paramZe7n.ZH().Zl() && !paramZk28.ZRC())
      return ""; 
    if (paramZk28.ZY(paramZe7n))
      return paramZe7n.Ze(); 
    String str = paramZk28.ZRz().Za(paramZe7n);
    return paramZe7n.ZE().Zb().filter(Zzaq::lambda$generateTextField$1).filter(str::lambda$generateTextField$2).map(str::lambda$generateTextField$3).orElse(str);
  }
  
  static boolean ZY(Ze7n paramZe7n) {
    return Zsw8.ZS(paramZe7n.Ze());
  }
  
  static boolean ZL(Zk28 paramZk28, Object paramObject) {
    int i = Zx9q.Zdi();
    if (paramZk28.ZF(paramObject))
      return true; 
    if (paramObject instanceof Zk28) {
      Zk28 zk28 = (Zk28)paramObject;
      if (i != 0)
        return (Objects.equals(paramZk28.ZRT(), zk28.ZRT()) && Objects.equals(paramZk28.ZRF(), zk28.ZRF()) && Objects.equals(Boolean.valueOf(paramZk28.ZRC()), Boolean.valueOf(zk28.ZRC()))); 
    } 
    return false;
  }
  
  private static String lambda$generateTextField$3(String paramString, Integer paramInteger) {
    return paramString.substring(0, paramInteger.intValue());
  }
  
  private static boolean lambda$generateTextField$2(String paramString, Integer paramInteger) {
    return (paramInteger.intValue() < paramString.length());
  }
  
  private static boolean lambda$generateTextField$1(Integer paramInteger) {
    return (paramInteger.intValue() >= 0);
  }
  
  private static String lambda$createValueInputter$0(Zk28 paramZk28, Ze7n paramZe7n) {
    return Zl(paramZk28, paramZe7n);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzaq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */