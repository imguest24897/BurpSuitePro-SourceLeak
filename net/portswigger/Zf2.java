package net.portswigger;

public interface Zf2 {
  void Zz(Zgl paramZgl, String paramString);
  
  default void ZN(String paramString) {
    Zz(new Zgl(), paramString);
  }
  
  void ZR(Zgl paramZgl, String paramString);
  
  default void ZK(String paramString) {
    ZR(new Zgl(), paramString);
  }
  
  void ZN(Zgl paramZgl, Zzr paramZzr, long paramLong);
  
  default void Zx(Zzr paramZzr, long paramLong) {
    ZN(new Zgl(), paramZzr, paramLong);
  }
  
  void ZU(Zgl paramZgl, Zip paramZip);
  
  default void Z_(Zip paramZip) {
    ZU(new Zgl(), paramZip);
  }
  
  void Zr(Zgl paramZgl, Zrmw paramZrmw, String paramString);
  
  default void ZU(Zrmw paramZrmw, String paramString) {
    Zr(new Zgl(), paramZrmw, paramString);
  }
  
  void Zj(Zfp paramZfp);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zf2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */