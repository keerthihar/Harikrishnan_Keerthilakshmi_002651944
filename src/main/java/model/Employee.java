/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author keert
 */
public class Employee {
    private String Name;
    private int EmployeeId;
    private int Age;
    private String Gender;
    private int Start_date;
    private String Level;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getStart_date() {
        return Start_date;
    }

    public void setStart_date(int Start_date) {
        this.Start_date = Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPosition_Title() {
        return Position_Title;
    }

    public void setPosition_Title(String Position_Title) {
        this.Position_Title = Position_Title;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(int ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    private String TeamInfo;
    private String Position_Title;
    private int ContactNumber;
    private String Email;
    
    
    
}
