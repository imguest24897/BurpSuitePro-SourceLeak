package META-INF.versions.9.org.bouncycastle.pqc.crypto.xmss;

import java.io.Serializable;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

public final class XMSSNode implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final int height;
  
  private final byte[] value;
  
  protected XMSSNode(int paramInt, byte[] paramArrayOfbyte) {
    this.height = paramInt;
    this.value = paramArrayOfbyte;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public byte[] getValue() {
    return XMSSUtil.cloneArray(this.value);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\xmss\XMSSNode.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */