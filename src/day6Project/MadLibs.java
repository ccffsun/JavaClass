package day6Project;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    String name1;
    String name2;
    String noun1;
    String noun2;
    String adj1;
    String adj2;
    String adv1;
    String adv2;
    String randomNum;
    String story;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public String getName1(){
        return name1;
    }

    public String getName2(){
        return name2;
    }

    public String getNoun1(){
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getAdj1() {
        return adj1;
    }

    public String getAdj2() {
        return adj2;
    }

    public String getAdv1() {
        return adv1;
    }

    public String getAdv2() {
        return adv2;
    }

    public String getRandomNum() {
        return randomNum;
    }

    public String getTheStory(){
        return story;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setAdj1(String adj1) {
        this.adj1 = adj1;
    }

    public void setAdj2(String adj2) {
        this.adj2 = adj2;
    }

    public void setAdv1(String adv1) {
        this.adv1 = adv1;
    }

    public void setAdv2(String adv2) {
        this.adv2 = adv2;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public void printInstruction(){
        System.out.println("Welcome to the MadLibs games! If you type in words, you'll get a story. ");
    }

    public void putTogetherTheStory(){
        this.story = "One day, " + getName1() +" and "+ getName2() +" went to see the design pattern master to know how to"
                +" make a " +getNoun1()+" remote control. The master was living in a " + getAdj1() + " house, and she was "+ getAdv1()+
                " sitting on the "+getNoun2()+" , waiting for them. "+getName1()+" was very "+getAdj2()+" when he saw the master and "+getAdv2()
                +" rushed to her. However the master didn't say anything until they wait for "+getRandomNum()+" minutes, for her"+
                " meditation. When the master recover from the meditation, she gave them a book which name was Head First , design pattern. "+
                " They were so happy and they read the book again and again. Finally they make the remote control by ood command pattern."
                +" Now they were ready for control everything by this fantastic pattern!";

    }

    public void enterName1(){
        System.out.println("Hi, give me your pet's name please!");
        setName1(scanner.nextLine());
    }

    public void enterName2(){
        System.out.println("Now, give me your name.");
        setName2(scanner.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Well done! Next will you tell me your favorite electrical appliance?");
        setNoun1(scanner.nextLine());
    }

    public void enterAdj1(){
        System.out.println("What kind of house do you want to live?");
        setAdj1(scanner.nextLine());
    }

    public void enterAdv1(){
        System.out.println("Think about a adv to describe the feeling when you sleeping.");
        setAdv1(scanner.nextLine());
    }

    public void enterNoun2(){
        System.out.println("The most expensive thing in you house?");
        setNoun2(scanner.nextLine());
    }

    public void enterAdj2(){
        System.out.println("If one day you see the president of America, what's word to tell your feeling?");
        setAdj2(scanner.nextLine());
    }

    public void enterAdv2(){
        System.out.println("Print a adv to describe when your dog see you come back home");
        setAdv2(scanner.nextLine());
    }

    public void enterRandonNumber(){
        System.out.println("what's your lucky number?");
        setRandomNum(scanner.nextLine());
    }



    public static void main(String[] args) {
        MadLibs madLibs = new MadLibs();
        madLibs.printInstruction();
        madLibs.play();
    }

    public void play(){
        enterName1();
        enterName2();
        enterNoun1();
        enterAdj1();
        enterAdv1();
        enterNoun2();
        enterAdj2();
        enterAdv2();
        enterRandonNumber();
        putTogetherTheStory();
        System.out.println(getTheStory());
    }
}
