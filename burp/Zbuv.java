package burp;

public class Zbuv {
  public final int Zh;
  
  public final int Zi;
  
  public Zbuv(String paramString) {
    Zbqc[] arrayOfZbqc = Ztsr.Zb();
    if (paramString.isEmpty()) {
      this.Zh = 0;
      this.Zi = 0;
      return;
    } 
    int i = paramString.lastIndexOf('+');
    if (i != -1) {
      String str1 = paramString.substring(0, i + 1);
      String str2 = paramString.substring(i + 1);
      this.Zh = Zsqw.ZF(str1);
      this.Zi = Zsqw.Zg(str2);
      if (arrayOfZbqc == null) {
        this.Zh = 0;
        this.Zi = Zsqw.Zg(paramString);
        return;
      } 
      return;
    } 
    this.Zh = 0;
    this.Zi = Zsqw.Zg(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbuv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */