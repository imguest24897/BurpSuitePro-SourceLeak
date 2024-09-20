package burp;

import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlu6 implements Ze24 {
  private final Zr_4 ZL;
  
  private final boolean Zb;
  
  private final boolean Zr;
  
  private final boolean ZM;
  
  private final boolean ZF;
  
  private final boolean Za;
  
  private final boolean Z_;
  
  private final boolean ZS;
  
  private final boolean Zn;
  
  private final boolean ZR;
  
  private final boolean ZI;
  
  private final boolean ZP;
  
  private final Set<Zm31> Zc;
  
  private final Zljz ZJ;
  
  private final Zz28 ZB;
  
  private final Zewu ZH;
  
  private final Zbnt Zv;
  
  private final Zem2 Zg;
  
  private boolean Zl;
  
  private boolean ZC;
  
  private boolean Zo;
  
  private boolean ZQ;
  
  private boolean Zf;
  
  private boolean ZZ;
  
  private boolean ZK;
  
  private boolean Ze;
  
  private boolean Zs;
  
  private boolean Zz;
  
  private volatile boolean Zx;
  
  private RuntimeException ZY;
  
  private static boolean Zw;
  
  public static Zlu6 Zh(Zr_4 paramZr_4, Ztg4 paramZtg4) throws Zev3 {
    return (new Zm6w(paramZr_4, paramZtg4)).Zo();
  }
  
  public static Zlu6 Zi() throws Zev3 {
    return (new Zm6w(null, null)).ZT().Zo();
  }
  
  Zlu6(Zm6w paramZm6w) {
    this.ZL = paramZm6w.Zf;
    this.Zb = paramZm6w.ZR;
    boolean bool = ZN();
    try {
      this.Zr = paramZm6w.Zq;
      this.ZM = paramZm6w.Zw;
      this.ZF = paramZm6w.ZY;
      this.Za = paramZm6w.ZN;
      this.Z_ = paramZm6w.Zt;
      this.ZS = paramZm6w.Z_;
      this.Zn = paramZm6w.Za;
      this.ZR = paramZm6w.Zp;
      this.ZI = paramZm6w.ZB;
      this.ZP = paramZm6w.ZJ;
      this.Zc = paramZm6w.Zn;
      this.ZJ = paramZm6w.Zh;
      this.ZB = paramZm6w.ZG;
      this.ZH = paramZm6w.ZQ;
      this.Zv = paramZm6w.Zx;
      this.Zg = new Zem2(paramZm6w.ZG, paramZm6w.Zj, paramZm6w.Zl);
      if (!bool)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public <T extends Zgpi> T Zw(T paramT, Zkit paramZkit) {
    try {
      if (paramT instanceof Zlod)
        try {
          if (this.Zb)
            return paramZkit.ZH(new Zbsx()); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramT instanceof Zeh6)
        try {
          if (this.ZM)
            return paramZkit.ZH(new Ztx3()); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramT instanceof Zz4b)
        try {
          if (this.Zr)
            return paramZkit.ZH(new Zmff()); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramT instanceof Zskz)
        try {
          if (this.ZF)
            return paramZkit.ZH(new Zrkx()); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramT instanceof Zg94)
        try {
          if (this.ZS)
            return paramZkit.ZH(new Zewj()); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramT instanceof Zsph && this.Zn) {
        Zs8g zs8g = paramZkit.<Zs8g>ZH(new Zeha());
        return paramZkit.ZH(new Ztp6(zs8g));
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramT instanceof Zb_9)
        try {
          if (this.ZR)
            return paramZkit.ZH(new Zm9s()); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return null;
  }
  
  public <T extends Zgpi> T ZS(T paramT, Zeu4<T> paramZeu4) {
    try {
      if (paramZeu4 == Zmzk.Zj && this.ZP) {
        Zmzk zmzk1 = (Zmzk)paramT;
        Zmzk zmzk2 = ZM(zmzk1.ZJ1(), zmzk1.ZJO(), zmzk1.ZJZ());
        Zb((Zgpi)paramT, zmzk2);
        return (T)zmzk2;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return null;
  }
  
  private Zmzk ZM(String paramString, int paramInt, boolean paramBoolean) {
    try {
      return this.Zv.ZY(paramString, paramInt, paramBoolean);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      throw new Zkfw();
    } 
  }
  
  public void Zb(Zgpi paramZgpi1, Zgpi paramZgpi2) {
    this.ZH.Zi(paramZgpi1, paramZgpi2);
  }
  
  public Long ZY(Zgpi paramZgpi, Zkit paramZkit) {
    return this.ZH.ZY(paramZgpi, paramZkit);
  }
  
  public boolean Zj() {
    return this.Zz;
  }
  
  public void Zr() {
    this.Zz = true;
  }
  
  boolean ZS() {
    return this.Za;
  }
  
  boolean Zm() {
    return this.Z_;
  }
  
  public boolean ZN(Zgpi paramZgpi) {
    try {
      if (!this.ZI)
        return false; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramZgpi instanceof Zldi) {
        try {
        
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
        return !this.Zg.Zc(paramZgpi);
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    if (paramZgpi instanceof Zt53) {
      Zt53 zt53 = (Zt53)paramZgpi;
      try {
      
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      return !zt53.Zd(this.ZB);
    } 
    return false;
  }
  
  public boolean ZA(Zm31 paramZm31) {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return !this.Zc.contains(paramZm31);
  }
  
  public void ZU() {
    ZI();
  }
  
  public void ZI() {
    this.Zl = true;
  }
  
  public boolean ZM() {
    return this.Zl;
  }
  
  public void Zh() {
    this.ZC = true;
    this.Zc.add(Zk3e.ZD);
    this.Zc.add(Zk3e.ZX);
  }
  
  public boolean ZF() {
    return this.ZC;
  }
  
  public void ZT() {
    Zw();
    ZH();
    ZB();
    Zy();
  }
  
  public void Zw() {
    this.Zo = true;
  }
  
  public boolean ZW() {
    return this.Zo;
  }
  
  public void ZH() {
    this.ZQ = true;
  }
  
  public boolean Zt() {
    return this.ZQ;
  }
  
  public void ZB() {
    this.Zf = true;
  }
  
  public boolean Zu() {
    return this.Zf;
  }
  
  public void Zy() {
    this.ZZ = true;
  }
  
  public boolean Zp() {
    return this.ZZ;
  }
  
  public void Zb() {
    Zs();
  }
  
  public void Zs() {
    this.ZK = true;
  }
  
  public boolean ZC() {
    return this.ZK;
  }
  
  public void Zv() {
    this.Ze = true;
  }
  
  public boolean ZE() {
    return this.Ze;
  }
  
  public void ZD() {
    ZR();
  }
  
  public void ZR() {
    this.Zs = true;
  }
  
  public boolean ZJ() {
    return this.Zs;
  }
  
  public void ZO() {
    ZU();
    Zh();
    ZT();
    Zb();
    ZD();
  }
  
  public void ZA(Zkit paramZkit) {
    boolean bool = ZA();
    try {
      if (this.ZJ != null) {
        try {
          if (this.ZL != null)
            try {
              if (this.ZL.Zi()) {
                try {
                  if (!this.ZJ.Zt(this.ZL.Zl(), paramZkit))
                    try {
                      Zd();
                      if (bool) {
                        try {
                          if (this.ZJ.ZW())
                            Zd(); 
                        } catch (Zkfw zkfw) {
                          throw a(null);
                        } 
                        return;
                      } 
                    } catch (Zkfw zkfw) {
                      throw a(null);
                    }  
                } catch (Zkfw zkfw) {
                  throw a(null);
                } 
                return;
              } 
            } catch (Zkfw zkfw) {
              throw a(null);
            }  
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (this.ZJ.ZW())
        Zd(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public void ZQ(int paramInt) {
    try {
      if (this.ZJ != null)
        try {
          if (!this.ZJ.ZW(paramInt))
            Zd(); 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public void Zd() {
    this.Zx = true;
  }
  
  public boolean Zg() {
    return this.Zx;
  }
  
  public void ZM(RuntimeException paramRuntimeException) {
    try {
      if (paramRuntimeException == null)
        throw new IllegalArgumentException(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.ZY = paramRuntimeException;
  }
  
  public boolean ZP() {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (this.ZY != null);
  }
  
  public RuntimeException ZQ() {
    return this.ZY;
  }
  
  public void Zn() {
    this.ZH.Zk();
  }
  
  public static void ZF(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean ZA() {
    return Zw;
  }
  
  public static boolean ZN() {
    boolean bool = ZA();
    try {
      if (!bool)
        return true; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return false;
  }
  
  private static Zkfw a(Zkfw paramZkfw) {
    return paramZkfw;
  }
  
  static {
    if (!ZN())
      ZF(true); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlu6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */