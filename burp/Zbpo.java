package burp;

public class Zbpo {
  static int ZI(Zzjg paramZzjg, int paramInt) {
    return paramZzjg.ZT() * paramInt;
  }
  
  static int ZX(Zzjg paramZzjg, int paramInt) {
    return paramZzjg.ZT() * paramInt;
  }
  
  private static int ZJ(String paramString, int paramInt) {
    return paramString.chars().takeWhile(Zbpo::lambda$getIndentationOfLine$1).map(paramInt::lambda$getIndentationOfLine$2).sum();
  }
  
  private static int lambda$getIndentationOfLine$2(int paramInt1, int paramInt2) {
    return (paramInt2 == 9) ? paramInt1 : 1;
  }
  
  private static boolean lambda$getIndentationOfLine$1(int paramInt) {
    return (paramInt == 32 || paramInt == 9);
  }
  
  private static Integer lambda$calculateIndentationForNewLine$0(int paramInt, String paramString) {
    return Integer.valueOf(ZJ(paramString, paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */