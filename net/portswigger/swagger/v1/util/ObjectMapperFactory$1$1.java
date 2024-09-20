package net.portswigger.swagger.v1.util;

import com.fasterxml.Zk.Ze;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyv;
import net.portswigger.swagger.v1.models.Model;
import net.portswigger.swagger.v1.models.properties.Property;
import net.portswigger.swagger.v1.util.jackson.ModelSerializer;
import net.portswigger.swagger.v1.util.jackson.PropertySerializer;

class ObjectMapperFactory$1$1 extends Ze {
  final ObjectMapperFactory$1 this$0;
  
  public Zyd<?> modifySerializer(Zy7 paramZy7, Zyv paramZyv, Zyd<?> paramZyd) {
    return (Zyd<?>)(Property.class.isAssignableFrom(paramZyv.Zl()) ? new PropertySerializer(paramZyd) : (Model.class.isAssignableFrom(paramZyv.Zl()) ? new ModelSerializer(paramZyd) : paramZyd));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ObjectMapperFactory$1$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */