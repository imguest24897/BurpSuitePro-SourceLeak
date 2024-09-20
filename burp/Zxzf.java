package burp;

public class Zxzf {
  private final Zlit Zw;
  
  private final Zstu ZQ;
  
  private final Zk5d Zp;
  
  private final Zbnt Zr;
  
  private Zsb8 ZM;
  
  private boolean Z_ = false;
  
  private static int[] ZL;
  
  public Zxzf(Zlit paramZlit, Zstu paramZstu, Zk5d paramZk5d, Zbnt paramZbnt) {
    int[] arrayOfInt = ZR();
    try {
      this.Zw = paramZlit;
      this.ZQ = paramZstu;
      this.Zp = paramZk5d;
      this.Zr = paramZbnt;
      if (arrayOfInt == null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  public Zxzf(Zlit paramZlit, Zk5d paramZk5d, Zsb8 paramZsb8) {
    this(paramZlit, null, paramZk5d, null);
    this.ZM = paramZsb8;
  }
  
  public boolean Ze(Zeko paramZeko) {
    return Zy(ZM(paramZeko));
  }
  
  public boolean Zy(int paramInt) {
    int[] arrayOfInt = ZR();
    byte b = 0;
    while (b < paramInt) {
      try {
        if (!Zo())
          return false; 
      } catch (MatchException matchException) {
        throw a(null);
      } 
      try {
      
      } catch (MatchException matchException) {
        throw a(null);
      } 
      this.Z_ = !this.Z_;
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  public Zsb8 ZX() {
    return this.ZM;
  }
  
  private boolean Zo() {
    try {
      if (this.ZM == null)
        try {
          if (this.ZQ != null) {
            try {
              this.ZM = new Zsb8(this.Zw, this.ZQ, this.Zp.ZQ(), this.Zr);
              if (this.ZM.Zw())
                try {
                  if (Za());
                } catch (MatchException matchException) {
                  throw a(null);
                }  
            } catch (MatchException matchException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (this.ZM == null) {
        this.ZM = new Zsb8(this.Zw, this.Zp.Zi(), this.Zp.ZQ(), this.Zr);
        return this.ZM.Zw();
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (this.Z_) {
        try {
          if (Za())
            try {
              if (Z_());
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (Z_())
        try {
          if (Za());
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private boolean Z_() {
    this.ZM.Zr(this.Zp.ZQ());
    return this.ZM.Zw();
  }
  
  private boolean Za() {
    this.ZM.ZQ(this.Zp.Zi());
    return this.ZM.Zw();
  }
  
  public static int ZM(Zeko paramZeko) {
    try {
      switch (Zsdi.ZK[paramZeko.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return 10;
  }
  
  public static void Zy(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] ZR() {
    return ZL;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    if (ZR() == null)
      Zy(new int[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxzf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */