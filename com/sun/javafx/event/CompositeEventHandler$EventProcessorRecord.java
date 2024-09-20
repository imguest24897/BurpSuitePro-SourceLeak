package com.sun.javafx.event;

import javafx.event.Event;
import javafx.event.EventHandler;

abstract class EventProcessorRecord<T extends Event> {
  private EventProcessorRecord<T> nextRecord;
  
  private EventProcessorRecord<T> prevRecord;
  
  public abstract boolean stores(EventHandler<? super T> paramEventHandler, boolean paramBoolean);
  
  public abstract boolean isFilter();
  
  public abstract void handleBubblingEvent(T paramT);
  
  public abstract void handleCapturingEvent(T paramT);
  
  public abstract boolean isDisconnected();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\CompositeEventHandler$EventProcessorRecord.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */