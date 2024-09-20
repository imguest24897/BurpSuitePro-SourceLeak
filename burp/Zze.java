package burp;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import net.portswigger.Zrzt;

class Zze {
  private final Zreg ZQ;
  
  private final Zeqn ZF;
  
  private final boolean ZC;
  
  private final boolean Zi;
  
  private final boolean Zs;
  
  private final boolean Zy;
  
  private Zze(Zrdb paramZrdb) {
    Ztub ztub = paramZrdb.Za7();
    this.ZQ = ztub.Zc();
    this.ZF = ztub.ZD();
    this.ZC = ztub.ZN();
    this.Zi = ztub.Zn();
    this.Zs = (this.ZC && !this.Zi);
    this.Zy = (this.Zi && !this.ZC);
  }
  
  boolean Zd(Zze paramZze) {
    return (this.ZC && paramZze.ZC && !this.ZQ.equals(paramZze.ZQ));
  }
  
  boolean ZZ(Zze paramZze) {
    return (this.Zi && paramZze.Zi && Zg(this.ZF, paramZze.ZF));
  }
  
  boolean Zm(Zze paramZze) {
    return (Zs(this.ZF, paramZze.ZQ) || Zs(paramZze.ZF, this.ZQ));
  }
  
  private static boolean Zg(Zeqn paramZeqn1, Zeqn paramZeqn2) {
    return (!Zh(paramZeqn1, paramZeqn2, Zeqn::Zm0) || !Zh(paramZeqn1, paramZeqn2, Zeqn::Zma) || !paramZeqn1.ZmD().equals(paramZeqn2.ZmD()) || !paramZeqn1.Zmz().equals(paramZeqn2.Zmz()) || !Zc(paramZeqn1, paramZeqn2));
  }
  
  private static boolean Zh(Zeqn paramZeqn1, Zeqn paramZeqn2, Function<Zeqn, String> paramFunction) {
    return Zc(paramZeqn1, paramFunction.apply(paramZeqn1)).equals(Zc(paramZeqn2, paramFunction.apply(paramZeqn2)));
  }
  
  private static String Zc(Zeqn paramZeqn, String paramString) {
    Zrde zrde = paramZeqn.ZmQ();
    if (zrde == null)
      return paramString; 
    AtomicReference<Zlit> atomicReference = new AtomicReference();
    zrde.ZC(new Zr2z(atomicReference));
    return (atomicReference.get() != null) ? Zrzt.ZJ(paramString).replace(Zrzt.ZJ(((Zlit)atomicReference.get()).toString()), "") : paramString;
  }
  
  private static boolean Zc(Zeqn paramZeqn1, Zeqn paramZeqn2) {
    Zrde zrde = paramZeqn1.ZmQ();
    return ((zrde != null && zrde.Zuo()) || paramZeqn1.ZmO().equals(paramZeqn2.ZmO()));
  }
  
  private static boolean Zs(Zeqn paramZeqn, Zreg paramZreg) {
    if (paramZeqn instanceof Zsqh || paramZreg instanceof Zsqe)
      return false; 
    boolean bool = Zrfv.ZT(paramZeqn.Zmz(), paramZreg.Zmz());
    boolean bool1 = (paramZeqn.ZmQ().Zuo() || Zgbw.ZA(paramZeqn.ZmO(), paramZreg.ZmO())) ? true : false;
    return (!bool || !bool1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zze.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */