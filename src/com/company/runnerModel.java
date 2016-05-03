package com.company;

public class runnerModel extends Character {


    int runner_id;
    String first_name;
    String last_name;
    char gender;
    String finish_time;

    public runnerModel(int runner_id, String first_name, String last_name, char gender, String finish_time) {

        runner_id = this.runner_id;
        first_name = this.first_name;
        last_name = this.last_name;
        gender = this.gender;
        finish_time = this.finish_time;


    }


    public String getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(String finish_time) {
        this.finish_time = finish_time;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getRunner_id() {
        return runner_id;
    }

    public void setRunner_id(int runner_id) {
        this.runner_id = runner_id;
    }





}
