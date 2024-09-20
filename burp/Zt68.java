package burp;

import java.util.List;

public abstract class Zt68 {
  public static final Zt68 Zv = new Zt6f();
  
  public abstract Zlit Zo();
  
  public abstract String ZX();
  
  public abstract String ZV();
  
  public abstract List<String> ZP();
  
  public abstract Zsba Zr();
  
  abstract boolean Zy();
  
  public abstract List<Zlou> Zm();
  
  public abstract int Zl();
  
  abstract void ZO(Zbi1 paramZbi1);
  
  public boolean Zf(byte paramByte) {
    return (paramByte == 0) ? true : ((paramByte == 1) ? ((Zo() != null || ZX() != null || ZP() != null)) : ((paramByte == 2) ? ((Zm() != null || Zr() != null)) : false));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt68.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */