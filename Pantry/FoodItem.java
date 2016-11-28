// Created by Author: Issa Alkhamees, Nicholas Salter
// Due Date: November 28
// Class: CSCI 2000
// Instructor: Dr. Greer
// Program Assignment: 12
// Program Title: FoodItem
// Program Description:
//  This program calculate circle area.
//
// Plagiarism Statement:
//  I swear that I have not received or given aid on this program
//  beyond guidelines of the course including giving or receiving
//  specific code content.


public class FoodItem
{
  private String name;
  private int calories;
  private int fatGrams;  
  private double totalCalories;
  
  
  public FoodItem(String StartName, int StartCalories, int StartFatGrams)
  {
   name = StartName;
   calories = StartCalories;
   fatGrams = StartFatGrams;
  }
  
  public void setName(String newName)
  {
   name = newName;
  }
  public void setCalories(int newCalories)
  {
   calories = newCalories;
  }
  public void setFatGrams(int NewFatGrams)
  {
   fatGrams = NewFatGrams;
  }
  public String getName()
  {
   return name;
  }
  public int getCalories()
  {
   return calories;
  }
  public int getFatGrams()
  {
   return fatGrams;
  }
  public String toString()
  {
   return name + " contains " + calories + " calories and " + fatGrams + "fat grams.";
  }
  public int caloriesFromFat()
  {
   return fatGrams * 9;
  }
  public double percentFat()
  {
   totalCalories = caloriesFromFat() + calories;
   return caloriesFromFat() / totalCalories;
  }
}