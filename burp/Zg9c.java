package burp;

import java.util.List;
import java.util.stream.Collectors;

public interface Zg9c extends Ztwd {
  int Z_G();
  
  boolean Z_L();
  
  boolean Z_j();
  
  boolean Z_K();
  
  boolean Z_e();
  
  boolean Z_q();
  
  boolean Z_r();
  
  boolean Z_Y();
  
  boolean Z_w();
  
  boolean Z_S();
  
  boolean Z_J();
  
  boolean Z_t();
  
  boolean Z_b();
  
  boolean Z_P();
  
  boolean Z_u();
  
  boolean Z_4();
  
  boolean Zv(Zeew paramZeew);
  
  boolean Z_T();
  
  int Z_Q();
  
  int Z_E();
  
  boolean Z_g();
  
  int Z_l();
  
  String Z_W();
  
  void ZiY(String paramString);
  
  Zzca Z_D();
  
  void Zr(Zzca paramZzca);
  
  default List<Zeew> Z_A() {
    return (List<Zeew>)Zeew.Zc().stream().filter(this::lambda$getToolsToDiscard$0).collect(Collectors.toList());
  }
  
  private boolean lambda$getToolsToDiscard$0(Zeew paramZeew) {
    return !Zv(paramZeew);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg9c.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */