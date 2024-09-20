package burp;

interface Zrn2 {
  public static final Zrn2 ZP = Zrn2::lambda$static$0;
  
  public static final Zrn2 Zu = Zrn2::lambda$static$1;
  
  public static final Zrn2 Zw = Zrn2::lambda$static$2;
  
  boolean Zk(String paramString, Zgit paramZgit);
  
  private static boolean lambda$static$2(String paramString, Zgit paramZgit) {
    return paramZgit.ZC.Zv(paramString.toLowerCase());
  }
  
  private static boolean lambda$static$1(String paramString, Zgit paramZgit) {
    return paramZgit.ZC.Zr(paramString.toLowerCase());
  }
  
  private static boolean lambda$static$0(String paramString, Zgit paramZgit) {
    return Zsw8.Zh(paramZgit.Zj, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrn2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */