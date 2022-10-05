/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruolin Li
 */

public class EmployeeProfile {
    private String name;
    private String employeeId;
    private int age;
    private String gender;
    private LocalDate startDate;
    private String level;
    private String teamInfo;
    private String positionTitle;
    private String cellPhoneNumber;
    private String emailAddress;
    private ImageIcon Photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ImageIcon getPhoto() {
        return Photo;
    }

    public void setPhoto(ImageIcon Photo) {
        this.Photo = Photo;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" + "name=" + name + ", employeeId=" + employeeId + ", age=" + age + ", gender=" + gender + ", startDate=" + startDate + ", level=" + level + ", teamInfo=" + teamInfo + ", positionTitle=" + positionTitle + ", cellPhoneNumber=" + cellPhoneNumber + ", emailAddress=" + emailAddress + ", Photo=" + Photo + '}';
    }
    
    
}
