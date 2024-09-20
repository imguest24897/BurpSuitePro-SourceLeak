package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsUtils;

public class NewSessionTicket {
  protected long ticketLifetimeHint;
  
  protected byte[] ticket;
  
  public NewSessionTicket(long paramLong, byte[] paramArrayOfbyte) {
    this.ticketLifetimeHint = paramLong;
    this.ticket = paramArrayOfbyte;
  }
  
  public long getTicketLifetimeHint() {
    return this.ticketLifetimeHint;
  }
  
  public byte[] getTicket() {
    return this.ticket;
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeUint32(this.ticketLifetimeHint, paramOutputStream);
    TlsUtils.writeOpaque16(this.ticket, paramOutputStream);
  }
  
  public static org.bouncycastle.tls.NewSessionTicket parse(InputStream paramInputStream) throws IOException {
    long l = TlsUtils.readUint32(paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream);
    return new org.bouncycastle.tls.NewSessionTicket(l, arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\NewSessionTicket.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */