package burp;

import java.io.IOException;
import java.net.Socket;

abstract class Zx0q<T> {
  private final Zle7 ZU;
  
  private final Zxgx<T> ZR;
  
  private final T ZJ;
  
  Zx0q(Zle7 paramZle7, Zxgx<T> paramZxgx, T paramT) {
    this.ZU = paramZle7;
    this.ZR = paramZxgx;
    this.ZJ = paramT;
  }
  
  Zgke Zh(Socket paramSocket, Zmzk paramZmzk, Zly6 paramZly6) throws IOException {
    return this.ZU.Zh(paramSocket, paramZmzk, this.ZR, this.ZJ, paramZly6.ZD());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx0q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */