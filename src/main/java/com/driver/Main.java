package com.driver;

public class Main {
  public static void main(String args[]){
      RWOnly obj=new RWOnly();
      //obj.name="asif"; //The name variable is private and cannot be accessed outside of its class
      obj.setter("Asif Azmi");
      System.out.println(obj.getter());
    }
}