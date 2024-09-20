package burp;

public class Zz4c {
  private static final Zr_4 ZI = new Zruo();
  
  private final Ztwr ZT;
  
  private final int ZQ;
  
  private Zs66 Zf = null;
  
  private Zs66 Zy = null;
  
  private Zs54 ZD = Zs54.ZX();
  
  private String Zw;
  
  private Zs54 Zi = Zs54.ZX();
  
  private String ZN;
  
  private Ztr2 Zn;
  
  public Zz4c(Ztwr paramZtwr, int paramInt) {
    if (paramZtwr == null)
      throw new IllegalArgumentException(); 
    this.ZT = paramZtwr;
    this.ZQ = paramInt;
  }
  
  public Zz4c ZN(Zs66 paramZs66, String paramString1, Zs54 paramZs541, String paramString2, Zs54 paramZs542) {
    try {
      if (paramZs66 == Zs66.AMF_PARAM)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zf = paramZs66;
    this.Zy = this.Zf;
    this.Zw = paramString1;
    this.ZD = paramZs541;
    this.ZN = paramString2;
    this.Zi = paramZs542;
    return this;
  }
  
  public Zz4c ZR(Zs66 paramZs661, Zs66 paramZs662, String paramString1, Zs54 paramZs541, String paramString2, Zs54 paramZs542) {
    ZN(paramZs662, paramString1, paramZs541, paramString2, paramZs542);
    this.Zf = paramZs661;
    return this;
  }
  
  public Zz4c Zq(Ztr2 paramZtr2) {
    this.Zn = paramZtr2;
    return this;
  }
  
  public Zgh_ Zs() {
    Zbqc[] arrayOfZbqc = Zs66.Zi();
    try {
      if (this.Zf != null)
        try {
          if (this.Zy != null)
            try {
              if (this.Zw != null)
                try {
                  if (this.Zi != Zs54.ZD) {
                    try {
                    
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    Ztr2 ztr2 = (this.Zn != null) ? this.Zn : Zmfe.ZD(this.Zy);
                    String str = ztr2.ZK(this.ZN);
                    Zro0 zro0 = ZI.<Zro0>ZH(new Zl3(this.Zy, this.Zf, this.ZQ));
                    Zxtl zxtl = ZI.<Zxtl>ZH(new Zrl2(this.Zy, this.Zw));
                    try {
                      if (this.Zy == Zs66.BODY_PARAM_MULTIPART)
                        try {
                          if (this.Zy == this.Zf)
                            try {
                              if (this.ZD.ZD() != -1 && this.ZD.ZS() != -1) {
                                Zsh7 zsh7 = new Zsh7(this.Zy, this.Zf, this.ZT, this.Zw, str, this.ZD, this.Zi, zro0, zxtl, ztr2);
                                try {
                                  if (zsh7.Zk())
                                    return zsh7; 
                                } catch (IllegalArgumentException illegalArgumentException) {
                                  throw a(null);
                                } 
                              } 
                            } catch (IllegalArgumentException illegalArgumentException) {
                              throw a(null);
                            }  
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        }  
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    try {
                      if (arrayOfZbqc != null)
                        Zbqc.Zr(new Zbqc[3]); 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                    return new Zshh(this.Zy, this.Zf, this.ZT, this.Zw, str, this.Zi, zro0, zxtl, ztr2);
                  } 
                  throw new IllegalArgumentException();
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException();
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz4c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */