package org.example.main.Beverages;

public abstract class Beverage {
 public enum Size {TALL,GRANGE,VENTY}
 private Size size;
protected String desctiption="Unknown beverage";
public String getDescription(){
 return desctiption;
}
public abstract double cost();

 public Size getSize() {
  return size;
 }

 public void setSize(Size size) {
  this.size = size;
 }
}
