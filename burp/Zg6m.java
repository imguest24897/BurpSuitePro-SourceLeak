package burp;

public class Zg6m implements Ze0c {
  private final Zr1k[] ZC;
  
  public Zg6m(Zr1k... paramVarArgs) {
    this.ZC = paramVarArgs;
  }
  
  public void ZE(Zlit paramZlit, Zs68 paramZs68, byte[] paramArrayOfbyte, Zm4 paramZm4) {
    Zr1k[] arrayOfZr1k = this.ZC;
    int i = arrayOfZr1k.length;
    boolean bool = Zt2c.ZK();
    byte b = 0;
    while (b < i) {
      Zr1k zr1k = arrayOfZr1k[b];
      zr1k.Zf(paramZlit, paramZs68.Zd, paramZm4);
      b++;
      if (bool)
        break; 
    } 
    if (Zbqc.Zwu() == null)
      Zt2c.ZS(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg6m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */