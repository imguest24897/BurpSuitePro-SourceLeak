package burp;

public class Zlye extends Zlyv {
  public String ZC(Zku6 paramZku6, Zkv8 paramZkv8) {
    Ztie ztie = paramZkv8.ZD(paramZku6);
    return (ztie != null) ? ztie.ZW.toLowerCase() : super.ZC(paramZku6, paramZkv8);
  }
  
  public void ZM(Zxs7 paramZxs7, Zgit paramZgit, Zz4_ paramZz4_, String paramString, Zmzk paramZmzk) {
    if (paramZgit.ZI())
      return; 
    Zzmd.ZG(paramString, paramZmzk, paramZxs7, paramZgit, paramZz4_, (byte)0);
  }
  
  public void ZC(String paramString, Zmzk paramZmzk, Zxs7 paramZxs7, Zgit paramZgit, Zz4_ paramZz4_, boolean paramBoolean) {
    Zzmd.ZG(paramString, paramZmzk, paramZxs7, paramZgit, paramZz4_, paramBoolean ? 2 : 1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlye.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */