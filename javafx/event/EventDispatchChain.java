package javafx.event;

public interface EventDispatchChain {
  EventDispatchChain append(EventDispatcher paramEventDispatcher);
  
  EventDispatchChain prepend(EventDispatcher paramEventDispatcher);
  
  Event dispatchEvent(Event paramEvent);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\EventDispatchChain.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */