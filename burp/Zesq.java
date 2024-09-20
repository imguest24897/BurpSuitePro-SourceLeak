package burp;

public class Zesq implements Zxlu {
  private final Zxlu[] Zd;
  
  public Zesq(Zxlu... paramVarArgs) {
    this.Zd = paramVarArgs;
  }
  
  public Zsqx<Zrdb> Zr() {
    Zxlu[] arrayOfZxlu = this.Zd;
    int i = arrayOfZxlu.length;
    Zbqc[] arrayOfZbqc = Zxpw.Za();
    byte b = 0;
    while (b < i) {
      Zxlu zxlu = arrayOfZxlu[b];
      if (zxlu != null) {
        Zsqx<Zrdb> zsqx = zxlu.Zr();
        if (zsqx != null)
          return zsqx; 
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zesq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */