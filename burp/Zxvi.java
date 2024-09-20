package burp;

class Zxvi extends Zxv1 implements Zg9m {
  Zxvi(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public void ZV(byte[] paramArrayOfbyte, int paramInt) {
    Zmrq zmrq = this.Za.<Zmrq>ZJ(this, Zkp0.Zh);
    if (zmrq == null) {
      zmrq = this.Za.Zc(4096);
      this.Za.Zq(this, Zkp0.Zh, zmrq);
    } 
    zmrq.Zj(paramArrayOfbyte, 0, paramInt);
    int i = Zlq() + paramInt;
    this.Za.ZM(this, Zkp0.Zq, i);
  }
  
  public Zbr Zo3() {
    Zstu zstu = this.Za.<Zstu>ZA(this, Zkp_.Za);
    return Zbr.Zy(zstu, Zkyt.HTTP1);
  }
  
  public Zstu Zos() {
    return this.Za.<Zstu>ZA(this, Zkp_.Za);
  }
  
  public Zstu ZoO() {
    return this.Za.<Zstu>ZJ(this, (Zekb)Zkp0.Zh);
  }
  
  public boolean ZoZ() {
    return true;
  }
  
  public String ZYN() {
    return null;
  }
  
  public String ZYT() {
    return null;
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject) ? true : Zea7.Ze(this, paramObject);
  }
  
  public int hashCode() {
    return Zea7.Zg(this);
  }
  
  public Zeu4<Zg9m> ZF() {
    return Zg9m.Zg;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxvi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */