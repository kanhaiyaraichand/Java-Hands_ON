Q1) Create a class developer having fields {id, name, experience,
salary} print the developer messy data according to their
experience and find out who is getting highest salary. Arrange
the developer in alphabetical order.

Ans
package com.org.gen.15thfebHandsOn

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Developer
{
 private int id,salary,experience;
 private String name;
 public Developer(int id,String name,int experience, int salary) {
 this.id = id;
 this.name = name;
 this.experience = experience;
 this.salary = salary;
 }
 @Override
 public String toString() {
 return "{" + "id='" + id + '\''+"name='" + name + '\''+"experience='" + experience + '\'' +
 ", age=" + salary + '}';
 }
 public int getId() {
 return id;
 }
 public int getExperience() {
 return experience;
 }
 public String getName() {
 return name;
 }
 public int getSalary() {
 return salary;
 }
}
class sortByName implements Comparator<Developer>{
 public int compare(Developer a, Developer b) {
 return a.getName().compareTo(b.getName());
 }
}
class sortByExperience implements Comparator<Developer>{
 public int compare(Developer a, Developer b) {
 if (a.getExperience() > b.getExperience()) {
 return 1;
 } else if (a.getExperience() > b.getExperience()) {
 return -1;
 }
 return 0;
 }
}
class sortBySalary implements Comparator<Developer>{
 public int compare(Developer a, Developer b) {
 if (a.getSalary() > b.getSalary()) {
 return 1;
 } else if (a.getSalary() > b.getSalary()) {
 return -1;
 }
 return 0;
 }
}
public class Q1 {
 public static void main(String[] args)
 {
 ArrayList<Developer> students = new ArrayList<Developer>();
 students.add(new Developer(101,"honey",2, 15));
 students.add(new Developer(102,"john",3, 20));
 students.add(new Developer(103,"Dan",4, 20));
 students.add(new Developer(104,"Joe",6, 10));
 Collections.sort(students,new sortByExperience());
 System.out.println("Developer sorted according to experience : ");
 for (Developer d :students) {
 System.out.println(d);
 }
 Collections.sort(students,new sortBySalary());
 System.out.println("Developer sorted according to salary : ");
 for (Developer d :students) {
 System.out.println(d);
 }
 Collections.sort(students,new sortByName());
 System.out.println("Developer sorted according to name : ");
 for (Developer d :students) {
 System.out.println(d);
 }
 }
}