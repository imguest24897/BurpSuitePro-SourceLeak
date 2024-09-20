package burp;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.List;
import java.util.Optional;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanServer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlxx {
  public static Optional<Long> ZE(Zl_6 paramZl_6, MBeanServer paramMBeanServer) {
    try {
      OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
      AttributeList attributeList = paramMBeanServer.getAttributes(operatingSystemMXBean.getObjectName(), new String[] { paramZl_6.name });
      List<Attribute> list = attributeList.asList();
      if (list.size() == 1)
        return Optional.of(Long.valueOf(((Long)((Attribute)list.get(0)).getValue()).longValue())); 
    } catch (InstanceNotFoundException|javax.management.ReflectionException instanceNotFoundException) {
      Zah.Zl(instanceNotFoundException, Zk_.UNEXPECTED);
    } 
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlxx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */