package org.bouncycastle.oer.its;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class ItsUtils {
  public static byte[] octetStringFixed(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte.length != paramInt)
      throw new IllegalArgumentException("octet string out of range"); 
    return paramArrayOfbyte;
  }
  
  public static byte[] octetStringFixed(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length < 1 || paramArrayOfbyte.length > 32)
      throw new IllegalArgumentException("octet string out of range"); 
    return Arrays.clone(paramArrayOfbyte);
  }
  
  public static ASN1Sequence toSequence(List paramList) {
    return (ASN1Sequence)new DERSequence((ASN1Encodable[])paramList.toArray((Object[])new ASN1Encodable[0]));
  }
  
  public static ASN1Sequence toSequence(ASN1Encodable... paramVarArgs) {
    return (ASN1Sequence)new DERSequence(paramVarArgs);
  }
  
  @Deprecated
  public static <T> List<T> fillList(final Class<T> type, final ASN1Sequence sequence) {
    return AccessController.<List<T>>doPrivileged((PrivilegedAction)new PrivilegedAction<List<List<T>>>() {
          public List<T> run() {
            try {
              ArrayList<T> arrayList = new ArrayList();
              Iterator iterator = sequence.iterator();
              while (iterator.hasNext()) {
                Method method = type.getMethod("getInstance", new Class[] { Object.class });
                arrayList.add(type.cast(method.invoke(null, new Object[] { iterator.next() })));
              } 
              return arrayList;
            } catch (Exception exception) {
              throw new IllegalStateException("could not invoke getInstance on type " + exception.getMessage(), exception);
            } 
          }
        });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ItsUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */