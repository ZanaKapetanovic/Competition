/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author Zana Kapetanovic
 */
public class CompetitionProject {
 public static void main(String[] args) {
        Team team1 = TeamDemo.getTeam();
        Team team2 = new Team(team1);
        team1.teamName = "changed team name";
        team1.competition1.nameOfCompetition = "changed name of competition";
        System.out.println(team1.toString());
        System.out.println(team1.toString());
        System.out.println(team2.toString());

    }

}

class Team {

    String teamName;
    String name1, name2, name3, name4;
    Competition competition1, competition2;

    public Team(String teamN, String n1, String n2, String n3, String n4, Competition comp1, Competition comp2) {
        teamName = teamN;
        name1 = n1;
        name2 = n2;
        name3 = n3;
        name4 = n4;
        competition1 = comp1;
        competition2 = comp2;
    }

    public Team() {
        teamName = "";
        name1 = "";
        name2 = "";
        name3 = "";
        name4 = "";
        competition1 = null;
        competition2 = null;
    }

    public void setTeamName(String teamN) {
        teamName = teamN;
    }

    public void setName2(String n2) {
        name2 = n2;
    }

    public void setName3(String n3) {
        name3 = n3;
    }

    public void setName4(String n4) {
        name4 = n4;
    }

    public void setCompetition1(Competition comp1) {
        competition1 = comp1;
    }

    public void setCompetition2(Competition comp2) {
        competition2 = comp2;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getName3() {
        return name3;
    }

    public String getName4() {
        return name4;
    }

    public Competition getCompetition1() {
        return competition1;
    }

    public Competition getCompetition2() {
        return competition2;
    }

    public Team(Team aTeam) //Copy constructor
    {
        if (aTeam != null) {
            this.teamName = aTeam.teamName;
            this.name1 = aTeam.name1;
            this.name2 = aTeam.name2;
            this.name3 = aTeam.name3;
            this.name4 = aTeam.name4;
            this.competition1 = new Competition(aTeam.competition1);
            this.competition2 = new Competition(aTeam.competition2);
        } else {
            System.out.println("Error.");
            System.exit(0);
        }
    }

    public String toString() {
        return ("\nName of the team is: " + getTeamName() + "\nName of member 1: " + getName1() + "\nName of memeber2: " + getName2() + "\nName of member 3: " + getName3() + "\nName of member 4: " + getName4() + "\nCompetition 1:" + getCompetition1() + "\nCompetition2: " + getCompetition2());
    }

    public boolean equals(Team otherTeam) {
        if (otherTeam == null) {
            return false;
        } else {
            return (teamName.equals(otherTeam.teamName)
                    && name1 == otherTeam.name1
                    && name2 == otherTeam.name2
                    && name3 == otherTeam.name3 && name4 == otherTeam.name4 && competition1.equals(otherTeam.competition1) && competition2.equals(otherTeam.competition2));
        }
    }
}

class Competition {

    String nameOfCompetition;
    String nameOfWinningTeam;
    String nameOfRunnerUpTeam;
    int yearOfCompetition;

    public Competition(String nameComp, String nameWin, String nameRun, int year) {
        nameOfCompetition = nameComp;
        nameOfWinningTeam = nameWin;
        nameOfRunnerUpTeam = nameRun;
        yearOfCompetition = year;
    }

    public Competition() {
        nameOfCompetition = "";
        nameOfWinningTeam = "";
        nameOfRunnerUpTeam = "";
        yearOfCompetition = 0;
    }

    public Competition(Competition aCompetition) {
        this.nameOfCompetition = aCompetition.nameOfCompetition;
        this.nameOfWinningTeam = aCompetition.nameOfWinningTeam;
        this.nameOfRunnerUpTeam = aCompetition.nameOfRunnerUpTeam;
        this.yearOfCompetition = aCompetition.yearOfCompetition;
    }

    public void setName(String nameComp) {
        nameOfCompetition = nameComp;
    }

    public void setNameWin(String nameWin) {
        nameOfWinningTeam = nameWin;
    }

    public void setNameRun(String nameRun) {
        nameOfRunnerUpTeam = nameRun;
    }

    public void setYearComp(int year) {
        yearOfCompetition = year;
    }

    public String getName() {
        return nameOfCompetition;
    }

    public String getNameWin() {
        return nameOfWinningTeam;
    }

    public String getNameRun() {
        return nameOfRunnerUpTeam;
    }

    public int getYear() {
        return yearOfCompetition;
    }

    public String toString() {
        return ("\nName of the competition is: " + getName() + "\nWinning team is: " + getNameWin() + "\nRunner up team: " + getNameRun() + "\nYear of competition: " + getYear());
    }

    public boolean equals(Competition otherCompetition) {
        if (otherCompetition == null) {
            return false;
        } else {
            return (nameOfCompetition.equals(otherCompetition.nameOfCompetition) && nameOfWinningTeam == otherCompetition.nameOfWinningTeam && nameOfRunnerUpTeam == otherCompetition.nameOfRunnerUpTeam);
        }

    }
}

class TeamDemo {

    public static String enterTeamName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the team: ");
        String teamName = keyboard.nextLine();
        return teamName;
    }

    public static String enter1stMember() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the first member: ");
        String name1 = keyboard.nextLine();
        return name1;
    }

    public static String enter2ndMember() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the second member: ");
        String name2 = keyboard.nextLine();
        return name2;
    }

    public static String enter3rdMember() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the third member: ");
        String name3 = keyboard.nextLine();
        return name3;
    }

    public static String enter4thMember() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the fourth member: ");
        String name4 = keyboard.nextLine();
        return name4;
    }

    public static Competition enterCompInfo() {
        Competition comp1 = CompetitionDemo.getComp();
        return comp1;
    }

    public static Team getTeam() {
        String teamName = enterTeamName();
        String name1 = enter1stMember();
        String name2 = enter2ndMember();
        String name3 = enter3rdMember();
        String name4 = enter4thMember();
        Competition competition1 = enterCompInfo();
        Competition competition2 = enterCompInfo();
        Team te = new Team(teamName, name1, name2, name3, name4, competition1, competition2);
        return te;
    }
}

class CompetitionDemo {

    public static String enterCompName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the competition: ");
        String nameOfCompetition = keyboard.nextLine();
        return nameOfCompetition;
    }

    public static String enterNameWin() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the winning team: ");
        String nameOfWinningTeam = keyboard.nextLine();
        return nameOfWinningTeam;
    }

    public static String enterNameRun() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of the runner-up: ");
        String nameOfRunnerUpTeam = keyboard.nextLine();
        return nameOfRunnerUpTeam;
    }

    public static int enterYearOfComp() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter year of the competition: ");
        int yearOfCompetition = keyboard.nextInt();
        return yearOfCompetition;
    }

    public static Competition getComp() {
        String nameOfCompetition = enterCompName();
        String nameOfWinningTeam = enterNameWin();
        String nameOfRunnerUpTeam = enterNameRun();
        int yearOfCompetition = enterYearOfComp();
        Competition c = new Competition(nameOfCompetition, nameOfWinningTeam, nameOfRunnerUpTeam, yearOfCompetition);
        return c;
    }
}


