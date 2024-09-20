package burp;

public abstract class Zje extends Zjb implements Zxo_ {
  private static int[] Zt;
  
  protected Zje(int paramInt) {
    super(paramInt);
  }
  
  protected Zje(int paramInt, Ze68 paramZe68, boolean paramBoolean) {
    super(paramInt, paramZe68, paramBoolean);
  }
  
  public void ZG(Object paramObject) {
    super.ZG(Zp(paramObject));
  }
  
  public boolean Zm(Object paramObject) {
    return super.Zm(Zp(paramObject));
  }
  
  protected abstract Object Zp(Object paramObject);
  
  public Zeu4<? extends Zxo_> ZF() {
    return new Zkxv();
  }
  
  public static void Zt(int[] paramArrayOfint) {
    Zt = paramArrayOfint;
  }
  
  public static int[] ZlQ() {
    return Zt;
  }
  
  static {
    if (ZlQ() == null)
      Zt(new int[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zje.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */