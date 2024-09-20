package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zxvn extends Zxvx implements Zmwv {
  Zxvn(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void Zc(Zs68 paramZs68, Zstu paramZstu) {
    Zst6 zst6 = new Zst6(paramZs68);
    this.Za.ZE(this, Zkpf.ZE, zst6.Zg());
    Zbqc[] arrayOfZbqc = Zth0.ZN();
    this.Za.Zi(this, Zkpf.ZN, zst6.ZG());
    this.Za.Zi(this, Zkpf.ZM, zst6.ZQ());
    short s = zst6.Zj();
    try {
      if (s != 0)
        this.Za.ZE(this, Zkpf.Zb, s); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (arrayOfZbqc != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  public void ZG(byte[] paramArrayOfbyte, int paramInt) {
    Zmrq zmrq = (Zmrq)ZX7();
    if (zmrq == null) {
      zmrq = this.Za.Zc(4096);
      this.Za.Zq(this, Zkpf.Zm, zmrq);
    } 
    zmrq.Zj(paramArrayOfbyte, 0, paramInt);
  }
  
  public Zbr ZX9() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkpf.ZA);
    return Zbr.Zy(zstu, Zkyt.HTTP1);
  }
  
  public void ZJ(Zbr paramZbr) {
    // Byte code:
    //   0: invokestatic ZN : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 22
    //   8: aload_1
    //   9: invokevirtual Zd : ()Z
    //   12: ifeq -> 45
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   21: athrow
    //   22: aload_0
    //   23: getfield Za : Lburp/Zkit;
    //   26: aload_0
    //   27: getstatic burp/Zkpf.ZA : Lburp/Zeki;
    //   30: aconst_null
    //   31: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   34: aload_2
    //   35: ifnull -> 67
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   44: athrow
    //   45: aload_0
    //   46: getfield Za : Lburp/Zkit;
    //   49: aload_0
    //   50: getstatic burp/Zkpf.ZA : Lburp/Zeki;
    //   53: aload_1
    //   54: invokevirtual Zr : ()Lburp/Zstu;
    //   57: invokevirtual ZQ : (Lburp/Zgpi;Lburp/Zeki;Lburp/Ze34;)V
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   66: athrow
    //   67: return
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/lang/UnsupportedOperationException
    //   8	38	41	java/lang/UnsupportedOperationException
    //   22	60	63	java/lang/UnsupportedOperationException
  }
  
  public Zstu ZX7() {
    return this.Za.<Zstu>ZJ(this, (Zekb)Zkpf.Zm);
  }
  
  public boolean ZoZ() {
    return true;
  }
  
  public void ZR(Zstu paramZstu) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public Zstu ZX8() {
    return null;
  }
  
  public void Zp(Zstu paramZstu) {}
  
  public Zstu ZXq() {
    return null;
  }
  
  public void Zh(Zstu paramZstu) {}
  
  public Zeu4<Zmwv> ZF() {
    return Zmwv.ZC;
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */