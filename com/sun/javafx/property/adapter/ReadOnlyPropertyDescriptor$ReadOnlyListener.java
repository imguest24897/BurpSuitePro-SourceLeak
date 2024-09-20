/*     */ package com.sun.javafx.property.adapter;
/*     */ 
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.property.adapter.ReadOnlyJavaBeanProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ReadOnlyListener
/*     */   implements PropertyChangeListener, WeakListener
/*     */ {
/*     */   protected final Object bean;
/*     */   private final WeakReference<ReadOnlyJavaBeanProperty<T>> propertyRef;
/*     */   
/*     */   public Object getBean() {
/* 157 */     return this.bean;
/*     */   }
/*     */   public ReadOnlyListener(Object paramObject, ReadOnlyJavaBeanProperty<T> paramReadOnlyJavaBeanProperty) {
/* 160 */     this.bean = paramObject;
/* 161 */     this.propertyRef = new WeakReference<>(paramReadOnlyJavaBeanProperty);
/*     */   }
/*     */   
/*     */   protected ReadOnlyJavaBeanProperty<T> checkRef() {
/* 165 */     ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = this.propertyRef.get();
/* 166 */     if (readOnlyJavaBeanProperty == null) {
/* 167 */       ReadOnlyPropertyDescriptor.this.removeListener(this);
/*     */     }
/* 169 */     return readOnlyJavaBeanProperty;
/*     */   }
/*     */ 
/*     */   
/*     */   public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
/* 174 */     if (this.bean.equals(paramPropertyChangeEvent.getSource()) && ReadOnlyPropertyDescriptor.this.name.equals(paramPropertyChangeEvent.getPropertyName())) {
/* 175 */       ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = checkRef();
/* 176 */       if (readOnlyJavaBeanProperty != null) {
/* 177 */         readOnlyJavaBeanProperty.fireValueChangedEvent();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 184 */     return (checkRef() == null);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\ReadOnlyPropertyDescriptor$ReadOnlyListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */