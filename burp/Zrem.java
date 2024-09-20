package burp;

public class Zrem {
  private final String Zo;
  
  private final Ztgy Zf;
  
  private final Zz8t ZT;
  
  private String Zg;
  
  private int ZX = -1;
  
  private Zsw6 Zl;
  
  private Zswz ZZ;
  
  private Znl ZN;
  
  public Zrem(String paramString, Ztgy paramZtgy, Zz8t paramZz8t) {
    this.Zo = paramString;
    this.Zf = paramZtgy;
    this.ZT = paramZz8t;
    if (paramZtgy == Ztgy.PROPERTY)
      try {
        if (paramZz8t == Zz8t.PRESERVER)
          throw new IllegalArgumentException(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      }  
  }
  
  public Zrem ZK(String paramString) {
    this.Zg = paramString;
    return this;
  }
  
  public Zrem ZO(int paramInt) {
    this.ZX = paramInt;
    return this;
  }
  
  public Zrem ZQ(Zswz paramZswz) {
    this.ZZ = paramZswz;
    return this;
  }
  
  public Zrem Zm(Znl paramZnl) {
    this.ZN = paramZnl;
    return this;
  }
  
  public Zrem ZK(Zsw6 paramZsw6) {
    this.Zl = paramZsw6;
    return this;
  }
  
  public Zgud Zi() {
    try {
      switch (Zthc.ZR[this.ZT.ordinal()]) {
        case 1:
          try {
            switch (Zthc.Zw[this.Zf.ordinal()]) {
              case 1:
                return new Zrkl(this.ZZ, this.Zg, this.Zo);
              case 2:
                return new Zrk6(this.ZZ, this.Zg, this.Zo);
              case 3:
                return new Zrkz(this.ZZ, this.Zg, this.Zo);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          break;
        case 2:
          try {
            switch (Zthc.Zw[this.Zf.ordinal()]) {
              case 1:
                return new Zrkf(this.Zl, this.Zg, this.Zo, this.ZX);
              case 2:
                return new Zrkj(this.Zl, this.Zg, this.Zo);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          break;
        case 3:
          return new Zrk8(this.ZN, this.Zg, this.Zo);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */