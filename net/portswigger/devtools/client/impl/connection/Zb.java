package net.portswigger.devtools.client.impl.connection;

import java.io.ByteArrayOutputStream;

class Zb extends ByteArrayOutputStream {
  Zb(Zs paramZs) {}
  
  public synchronized byte[] toByteArray() {
    return this.buf;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\Zb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */