/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author keert
 */
public class Employeehistory {
    private ArrayList<Employee> history;
    public Employeehistory(){
        this.history = new ArrayList< Employee>();
        }
    public ArrayList<Employee> gethistory(){
        return history;
        }
    public void sethistory(ArrayList<Employee>history)
    {
        this.history = history;
        
    }
    public Employee addnewEmp()
               {
                 Employee newEmp = new Employee();
               history.add(newEmp);
               return newEmp;
               }
}
