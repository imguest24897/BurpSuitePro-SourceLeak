package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public final class ProtocolName {
  public static final org.bouncycastle.tls.ProtocolName HTTP_1_1 = asUtf8Encoding("http/1.1");
  
  public static final org.bouncycastle.tls.ProtocolName SPDY_1 = asUtf8Encoding("spdy/1");
  
  public static final org.bouncycastle.tls.ProtocolName SPDY_2 = asUtf8Encoding("spdy/2");
  
  public static final org.bouncycastle.tls.ProtocolName SPDY_3 = asUtf8Encoding("spdy/3");
  
  public static final org.bouncycastle.tls.ProtocolName STUN_TURN = asUtf8Encoding("stun.turn");
  
  public static final org.bouncycastle.tls.ProtocolName STUN_NAT_DISCOVERY = asUtf8Encoding("stun.nat-discovery");
  
  public static final org.bouncycastle.tls.ProtocolName HTTP_2_TLS = asUtf8Encoding("h2");
  
  public static final org.bouncycastle.tls.ProtocolName HTTP_2_TCP = asUtf8Encoding("h2c");
  
  public static final org.bouncycastle.tls.ProtocolName WEBRTC = asUtf8Encoding("webrtc");
  
  public static final org.bouncycastle.tls.ProtocolName WEBRTC_CONFIDENTIAL = asUtf8Encoding("c-webrtc");
  
  public static final org.bouncycastle.tls.ProtocolName FTP = asUtf8Encoding("ftp");
  
  public static final org.bouncycastle.tls.ProtocolName IMAP = asUtf8Encoding("imap");
  
  public static final org.bouncycastle.tls.ProtocolName POP3 = asUtf8Encoding("pop3");
  
  public static final org.bouncycastle.tls.ProtocolName MANAGESIEVE = asUtf8Encoding("managesieve");
  
  public static final org.bouncycastle.tls.ProtocolName COAP = asUtf8Encoding("coap");
  
  public static final org.bouncycastle.tls.ProtocolName XMPP_CLIENT = asUtf8Encoding("xmpp-client");
  
  public static final org.bouncycastle.tls.ProtocolName XMPP_SERVER = asUtf8Encoding("xmpp-server");
  
  public static final org.bouncycastle.tls.ProtocolName ACME_TLS_1 = asUtf8Encoding("acme-tls/1");
  
  public static final org.bouncycastle.tls.ProtocolName OASIS_MQTT = asUtf8Encoding("mqtt");
  
  public static final org.bouncycastle.tls.ProtocolName DNS_OVER_TLS = asUtf8Encoding("dot");
  
  public static final org.bouncycastle.tls.ProtocolName NTSKE_1 = asUtf8Encoding("ntske/1");
  
  public static final org.bouncycastle.tls.ProtocolName SNU_RPC = asUtf8Encoding("sunrpc");
  
  public static final org.bouncycastle.tls.ProtocolName HTTP_3 = asUtf8Encoding("h3");
  
  public static final org.bouncycastle.tls.ProtocolName SMB_2 = asUtf8Encoding("smb");
  
  public static final org.bouncycastle.tls.ProtocolName IRC = asUtf8Encoding("irc");
  
  public static final org.bouncycastle.tls.ProtocolName NNTP_READING = asUtf8Encoding("nntp");
  
  public static final org.bouncycastle.tls.ProtocolName NNTP_TRANSIT = asUtf8Encoding("nnsp");
  
  public static final org.bouncycastle.tls.ProtocolName DNS_OVER_QUIC = asUtf8Encoding("doq");
  
  private final byte[] bytes;
  
  public static org.bouncycastle.tls.ProtocolName asRawBytes(byte[] paramArrayOfbyte) {
    return new org.bouncycastle.tls.ProtocolName(Arrays.clone(paramArrayOfbyte));
  }
  
  public static org.bouncycastle.tls.ProtocolName asUtf8Encoding(String paramString) {
    return new org.bouncycastle.tls.ProtocolName(Strings.toUTF8ByteArray(paramString));
  }
  
  private ProtocolName(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      throw new IllegalArgumentException("'bytes' cannot be null"); 
    if (paramArrayOfbyte.length < 1 || paramArrayOfbyte.length > 255)
      throw new IllegalArgumentException("'bytes' must have length from 1 to 255"); 
    this.bytes = paramArrayOfbyte;
  }
  
  public byte[] getBytes() {
    return Arrays.clone(this.bytes);
  }
  
  public String getUtf8Decoding() {
    return Strings.fromUTF8ByteArray(this.bytes);
  }
  
  public void encode(OutputStream paramOutputStream) throws IOException {
    TlsUtils.writeOpaque8(this.bytes, paramOutputStream);
  }
  
  public static org.bouncycastle.tls.ProtocolName parse(InputStream paramInputStream) throws IOException {
    return new org.bouncycastle.tls.ProtocolName(TlsUtils.readOpaque8(paramInputStream, 1));
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof org.bouncycastle.tls.ProtocolName && Arrays.areEqual(this.bytes, ((org.bouncycastle.tls.ProtocolName)paramObject).bytes));
  }
  
  public int hashCode() {
    return Arrays.hashCode(this.bytes);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\ProtocolName.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */