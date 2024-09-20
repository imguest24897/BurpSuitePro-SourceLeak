package org.bouncycastle.cms;

import java.io.OutputStream;

interface CMSSecureReadableWithAAD extends CMSSecureReadable {
  void setAADStream(OutputStream paramOutputStream);
  
  OutputStream getAADStream();
  
  byte[] getMAC();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSSecureReadableWithAAD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */