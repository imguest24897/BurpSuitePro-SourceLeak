package org.yaml;

import java.io.IOException;

class Z_2 implements Zd {
  final Zb Zm;
  
  private Z_2(Zb paramZb) {}
  
  public void Zt() throws IOException {
    try {
      Zb.Za(this.Zm, Zb.ZM(this.Zm).ZY(Zb.ZJ(this.Zm)));
      if (!Zb.ZM(this.Zm).ZR())
        try {
          Zb.ZB(this.Zm);
          if (Zb.ZJ(this.Zm) instanceof Zle) {
            (new Z_x(this.Zm, null)).Zt();
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zb.Za(this.Zm).Zq(new Z_x(this.Zm, null));
    Zb.Zu(this.Zm, true, false, false);
  }
  
  Z_2(Zb paramZb, Zjq paramZjq) {
    this(paramZb);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */