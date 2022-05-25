package com.homie.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private int studentID;
    private String studentName;
    private String studentNumber;
    private int studentAge;
    private String detail;
}
