package burp;

import java.util.Iterator;

abstract class Zx4<T> {
  private final char ZN;
  
  private final char ZK;
  
  Ze1i Zf;
  
  public Zx4(char paramChar1, char paramChar2, Ze1i paramZe1i) {
    this.ZN = paramChar1;
    this.ZK = paramChar2;
    this.Zf = paramZe1i;
  }
  
  public void Zd(Iterator<T> paramIterator) {
    this.Zf.ZE(this.ZN);
    boolean bool = paramIterator.hasNext();
    String[] arrayOfString = Zzkm.Zq();
    if (bool) {
      this.Zf.ZH();
      this.Zf.Zn();
    } 
    while (paramIterator.hasNext()) {
      Zc(paramIterator.next());
      if (paramIterator.hasNext()) {
        this.Zf.Z_(",");
        this.Zf.Zn();
        if (arrayOfString != null)
          break; 
      } 
    } 
    if (bool) {
      this.Zf.Zi();
      this.Zf.Zn();
    } 
    this.Zf.ZE(this.ZK);
    if (Zbqc.Zwu() == null)
      Zzkm.Zv(new String[5]); 
  }
  
  public abstract void Zc(T paramT);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */