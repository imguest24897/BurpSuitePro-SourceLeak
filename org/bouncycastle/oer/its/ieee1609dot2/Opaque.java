package org.bouncycastle.oer.its.ieee1609dot2;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OERInputStream;
import org.bouncycastle.util.Arrays;

public class Opaque extends ASN1Object {
  private final byte[] content;
  
  public Opaque(byte[] paramArrayOfbyte) {
    this.content = Arrays.clone(paramArrayOfbyte);
  }
  
  private Opaque(ASN1OctetString paramASN1OctetString) {
    this(paramASN1OctetString.getOctets());
  }
  
  public static Opaque getInstance(Object paramObject) {
    return (paramObject instanceof Opaque) ? (Opaque)paramObject : ((paramObject != null) ? new Opaque(ASN1OctetString.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DEROctetString(this.content);
  }
  
  public byte[] getContent() {
    return this.content;
  }
  
  public InputStream getInputStream() {
    return new ByteArrayInputStream(this.content);
  }
  
  public static <T> T getValue(final Class<T> type, final Element definition, final Opaque src) {
    return AccessController.doPrivileged(new PrivilegedAction<T>() {
          public T run() {
            try {
              ASN1Encodable aSN1Encodable = OERInputStream.parse(src.content, definition);
              Method method = type.getMethod("getInstance", new Class[] { Object.class });
              return type.cast(method.invoke(null, new Object[] { aSN1Encodable }));
            } catch (Exception exception) {
              throw new IllegalStateException("could not invoke getInstance on type " + exception.getMessage(), exception);
            } 
          }
        });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\Opaque.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */