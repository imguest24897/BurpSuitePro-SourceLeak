package org.bouncycastle.oer;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.bouncycastle.asn1.ASN1Absent;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class OEROptional extends ASN1Object {
  public static final OEROptional ABSENT = new OEROptional(false, null);
  
  private final boolean defined;
  
  private final ASN1Encodable value;
  
  private OEROptional(boolean paramBoolean, ASN1Encodable paramASN1Encodable) {
    this.defined = paramBoolean;
    this.value = paramASN1Encodable;
  }
  
  public static OEROptional getInstance(Object paramObject) {
    return (paramObject instanceof OEROptional) ? (OEROptional)paramObject : ((paramObject instanceof ASN1Encodable) ? new OEROptional(true, (ASN1Encodable)paramObject) : ABSENT);
  }
  
  public static <T> T getValue(Class<T> paramClass, Object paramObject) {
    OEROptional oEROptional = getInstance(paramObject);
    return !oEROptional.defined ? null : oEROptional.getObject(paramClass);
  }
  
  public <T> T getObject(final Class<T> type) {
    return this.defined ? (this.value.getClass().isInstance(type) ? type.cast(this.value) : AccessController.doPrivileged(new PrivilegedAction<T>() {
          public T run() {
            try {
              Method method = type.getMethod("getInstance", new Class[] { Object.class });
              return type.cast(method.invoke(null, new Object[] { OEROptional.access$000(this.this$0) }));
            } catch (Exception exception) {
              throw new IllegalStateException("could not invoke getInstance on type " + exception.getMessage(), exception);
            } 
          }
        })) : null;
  }
  
  public ASN1Encodable get() {
    return (ASN1Encodable)(!this.defined ? ABSENT : this.value);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)(!this.defined ? ASN1Absent.INSTANCE : get().toASN1Primitive());
  }
  
  public boolean isDefined() {
    return this.defined;
  }
  
  public String toString() {
    return this.defined ? ("OPTIONAL(" + this.value + ")") : "ABSENT";
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    if (!super.equals(paramObject))
      return false; 
    OEROptional oEROptional = (OEROptional)paramObject;
    return (this.defined != oEROptional.defined) ? false : ((this.value != null) ? this.value.equals(oEROptional.value) : ((oEROptional.value == null)));
  }
  
  public int hashCode() {
    null = super.hashCode();
    null = 31 * null + (this.defined ? 1 : 0);
    return 31 * null + ((this.value != null) ? this.value.hashCode() : 0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\OEROptional.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */