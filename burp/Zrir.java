package burp;

import net.portswigger.Zvq;

class Zrir {
  private static Zvq Zo(Zxtl paramZxtl) {
    return new Zvq(paramZxtl.ZTr().Zk(), paramZxtl.ZTs());
  }
  
  private static Zvq[] Zf(Zefg<Zxtl> paramZefg) {
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    if (paramZefg == null)
      return null; 
    Zvq[] arrayOfZvq = new Zvq[paramZefg.size()];
    byte b = 0;
    for (Zxtl zxtl : paramZefg) {
      arrayOfZvq[b++] = Zo(zxtl);
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayOfZvq;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrir.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */