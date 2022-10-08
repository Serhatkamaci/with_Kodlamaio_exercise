import Categories.Categories;
import CourseSections.CourseSections;
import Control.Control;
import ILogger.ICourseSections;
import ILogger.*;
import Managers.*;
import Instructors.Instructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> list=new ArrayList<String>();
        int id;
        int i=0;
        int unitPrice;
        String name;
        boolean bool;
        Control control=new Control();
        Scanner input=new Scanner(System.in);
        int secim;
        while(1==1)
        {
            System.out.println("\n\n****************************\nWelcome to Kodlama.io :)\n****************************");
            System.out.println("Course-->(1)\nInstructors-->(2)\nCategories -->(3)\nLogout -->(4)\n\n");
            System.out.print("Make a choice --> ");
            secim=input.nextInt();
            switch (secim)
            {
                case 1:
                    System.out.print("Course id--> ");
                    id=input.nextInt();
                    input.nextLine();
                    System.out.print("Course Name--> ");
                    name=input.nextLine();

                    System.out.print("Course Price--> ");
                    unitPrice= input.nextInt();
                    list.add(name);
                    list.remove(i);
                    bool=control.control(name,list);

                    if(bool==false)
                    {
                        CourseSections courseSections=new CourseSections();
                        courseSections.setCourseID(id);
                        courseSections.setCourseName(name);
                        courseSections.setUnitPrice(unitPrice);
                        CourseSectionManager courseSectionManager=new CourseSectionManager();
                        courseSectionManager.add();
                        ILogger iLogger=new ICourseSections();
                        iLogger.dataBaseLogger(name);
                        iLogger.fileLogger(name);
                        iLogger.mailLogger(name);
                        list.add(name);
                        i+=1;
                    }
                    else
                    {
                        System.out.println("\nCourse error with the same name!\n");
                    }
                    break;
                case 2:
                    System.out.print("Instructor Id--> ");
                    id=input.nextInt();
                    input.nextLine();
                    System.out.print("Instructor Name--> ");
                    name=input.nextLine();
                    Instructors instructors=new Instructors();
                    instructors.setInstructorID(id);
                    instructors.setInstructorName(name);
                    InstructorManager instructorManager=new InstructorManager();
                    instructorManager.add();
                    ILogger iLogger= new IInstructors();
                    iLogger.dataBaseLogger(name);
                    iLogger.fileLogger(name);
                    iLogger.mailLogger(name);
                    break;
                case 3:
                    System.out.print("Category Id --> ");
                    id=input.nextInt();
                    input.nextLine();
                    System.out.print("Category Name --> ");
                    name=input.nextLine();
                    list.add(name);
                    list.remove(i);
                    bool=control.control(name,list);
                    if(bool==false)
                    {
                        Categories categories=new Categories();
                        categories.setCategoryID(id);
                        categories.setCategoryName(name);
                        CategoryManager categoryManager=new CategoryManager();
                        categoryManager.add();
                        ILogger iLogger1=new ICategories();
                        iLogger1.dataBaseLogger(name);
                        iLogger1.fileLogger(name);
                        iLogger1.mailLogger(name);
                        list.add(name);
                        i+=1;
                    }
                    else
                    {
                        System.out.println("\nCategory error with the same name");
                    }
                    break;
                case 4:
                    System.out.println("\nlogging out :)");
                    return;
                default:
                    System.out.println("\nWrong choice!\nPlease try again");
            }
        }

    }
}
