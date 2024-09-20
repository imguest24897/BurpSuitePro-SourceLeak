/*     */ package com.sun.javafx.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.MethodHelper;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyVetoException;
/*     */ import java.beans.VetoableChangeListener;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import javafx.beans.property.Property;
/*     */ import javafx.beans.property.adapter.ReadOnlyJavaBeanProperty;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableValue;
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
/*     */ public class Listener
/*     */   extends ReadOnlyPropertyDescriptor<T>.ReadOnlyListener
/*     */   implements ChangeListener<T>, VetoableChangeListener
/*     */ {
/*     */   private boolean updating;
/*     */   
/*     */   public Listener(Object paramObject, ReadOnlyJavaBeanProperty<T> paramReadOnlyJavaBeanProperty) {
/* 150 */     super(paramObject, paramReadOnlyJavaBeanProperty);
/*     */   }
/*     */ 
/*     */   
/*     */   public void changed(ObservableValue<? extends T> paramObservableValue, T paramT1, T paramT2) {
/* 155 */     ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = checkRef();
/* 156 */     if (readOnlyJavaBeanProperty == null) {
/* 157 */       paramObservableValue.removeListener(this);
/* 158 */     } else if (!this.updating) {
/* 159 */       this.updating = true;
/*     */       try {
/* 161 */         MethodHelper.invoke(PropertyDescriptor.this.setter, this.bean, new Object[] { paramT2 });
/* 162 */         readOnlyJavaBeanProperty.fireValueChangedEvent();
/* 163 */       } catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 165 */       } catch (InvocationTargetException invocationTargetException) {
/*     */       
/*     */       } finally {
/* 168 */         this.updating = false;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void vetoableChange(PropertyChangeEvent paramPropertyChangeEvent) throws PropertyVetoException {
/* 175 */     if (this.bean.equals(paramPropertyChangeEvent.getSource()) && PropertyDescriptor.this.name.equals(paramPropertyChangeEvent.getPropertyName())) {
/* 176 */       ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = checkRef(); if (readOnlyJavaBeanProperty instanceof Property) { Property property = (Property)readOnlyJavaBeanProperty; if (property.isBound() && !this.updating)
/* 177 */           throw new PropertyVetoException("A bound value cannot be set.", paramPropertyChangeEvent);  }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\PropertyDescriptor$Listener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */