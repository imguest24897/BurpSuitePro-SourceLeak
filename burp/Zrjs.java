package burp;

class Zrjs implements Ztka {
  private final int Zc;
  
  private final int ZK;
  
  Zrjs(Zsb paramZsb, int paramInt1, int paramInt2) {
    this(paramZsb, null, paramInt1, paramInt2);
  }
  
  Zrjs(Zsb paramZsb, Ztka paramZtka, int paramInt) {
    this(paramZsb, paramZtka, 0, paramInt);
  }
  
  private Zrjs(Zsb paramZsb, Ztka paramZtka, int paramInt1, int paramInt2) {
    String[] arrayOfString = Zgzu.Zk();
    if (paramZtka == null) {
      this.Zc = paramZsb.ZS.size() + paramInt1;
      this.ZK = paramZsb.ZS.size() + paramInt2;
      if (arrayOfString != null) {
        this.Zc = paramZtka.ZL() + paramInt1;
        this.ZK = paramZtka.Zp() + paramInt2;
        return;
      } 
      return;
    } 
    this.Zc = paramZtka.ZL() + paramInt1;
    this.ZK = paramZtka.Zp() + paramInt2;
  }
  
  public int ZL() {
    return this.Zc;
  }
  
  public int Zp() {
    return this.ZK;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrjs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */