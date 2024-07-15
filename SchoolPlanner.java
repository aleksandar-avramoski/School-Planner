import java.util.ArrayList;
import java.util.Scanner;

public class SchoolPlanner {
    public static String subject;
    public static String day;
    public static String description;
    public static String monday;
    public static String tuesday;
    public static String wednesday;
    public static String thursday;
    public static String friday;
    public static int pickSubject;

    public static void main(String[] args) {

        System.out.println("Hello user! \nWelcome to the SchoolPlanner!");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        ArrayList<String> subjects = new ArrayList<>();

        ArrayList<String> days = new ArrayList<>();

        //DAYS FOR SUBJECTS
        ArrayList<String> subFromMondays = new ArrayList<>();
        ArrayList<String> subFromTuesdays = new ArrayList<>();
        ArrayList<String> subFromWednesdays = new ArrayList<>();
        ArrayList<String> subFromThursdays = new ArrayList<>();
        ArrayList<String> subFromFridays = new ArrayList<>();

        String[] descriptionArr = new String[subjects.size()];

        //DESCRIPTIONS
        ArrayList<String> descriptionList = new ArrayList<>();
        ArrayList<String> descriptionList1 = new ArrayList<>();
        ArrayList<String> descriptionList2 = new ArrayList<>();
        ArrayList<String> descriptionList3 = new ArrayList<>();
        ArrayList<String> descriptionList4 = new ArrayList<>();
        ArrayList<String> descriptionList5 = new ArrayList<>();
        ArrayList<String> descriptionList6 = new ArrayList<>();
        ArrayList<String> descriptionList7 = new ArrayList<>();
        ArrayList<String> descriptionList8 = new ArrayList<>();
        ArrayList<String> descriptionList9 = new ArrayList<>();

        String[] examForSub = new String[subjects.size()];

        //EXAMS
        ArrayList<String> exam = new ArrayList<>();
        ArrayList<String> exam1 = new ArrayList<>();
        ArrayList<String> exam2 = new ArrayList<>();
        ArrayList<String> exam3 = new ArrayList<>();
        ArrayList<String> exam4 = new ArrayList<>();
        ArrayList<String> exam5 = new ArrayList<>();
        ArrayList<String> exam6 = new ArrayList<>();
        ArrayList<String> exam7 = new ArrayList<>();
        ArrayList<String> exam8 = new ArrayList<>();
        ArrayList<String> exam9 = new ArrayList<>();

        String[] homeworkArr = new String[subjects.size()];

        //HOMEWORKS
        ArrayList<String> homework = new ArrayList<>();
        ArrayList<String> homework1 = new ArrayList<>();
        ArrayList<String> homework2 = new ArrayList<>();
        ArrayList<String> homework3 = new ArrayList<>();
        ArrayList<String> homework4 = new ArrayList<>();
        ArrayList<String> homework5 = new ArrayList<>();
        ArrayList<String> homework6 = new ArrayList<>();
        ArrayList<String> homework7 = new ArrayList<>();
        ArrayList<String> homework8 = new ArrayList<>();
        ArrayList<String> homework9 = new ArrayList<>();

        String[] gradeArr = new String[subjects.size()];

        //GRADE
        ArrayList<String> grade = new ArrayList<>();
        ArrayList<String> grade1 = new ArrayList<>();
        ArrayList<String> grade2 = new ArrayList<>();
        ArrayList<String> grade3 = new ArrayList<>();
        ArrayList<String> grade4 = new ArrayList<>();
        ArrayList<String> grade5 = new ArrayList<>();
        ArrayList<String> grade6 = new ArrayList<>();
        ArrayList<String> grade7 = new ArrayList<>();
        ArrayList<String> grade8 = new ArrayList<>();
        ArrayList<String> grade9 = new ArrayList<>();

        String[] overviewArr = new String[subjects.size()];

        String[] setADayForSub = new String[subjects.size()];

        for (; ; ) {
            //OVERVIEW
            System.out.println(" ");
            System.out.println("Overview");

            System.out.println(" ");
            System.out.println("Press 'A' to add a subject \nPress 'W' to set the subject to a specific day \nPress 'D' to add a description \nPress 'X' for exam \nPress 'H' for homework \nPress 'G' for grades \nPress 'O' for overview of all subjects \nPress 'E' for exiting the category you picked ");

            String answer = scanner.nextLine();

            switch (answer) {

                //ADDING SUBJECTS
                case "A":
                    for (; ; ) {
                        System.out.println(" ");
                        System.out.println("Add a subject:");

                        subject = scanner.nextLine();

                        if ("E".equals(subject)) {
                            System.out.println("Exiting");
                            break;
                        }

                        System.out.println(" ");
                        System.out.println(subject + " " + "added as a subject");

                        subjects.add(subject);
                    }

                    break;

                //SETTING A DAY FOR THE SUBJECT
                case "W":
                    System.out.println("Pick a subject to set in a specific day");
                    System.out.println(" ");
                    System.out.println("In total" + " " + subjects.size() + " " + "subjects");

                    System.out.println(" ");
                    System.out.println("Enter the number that depends on the subject that you want:");
                    System.out.println(" ");

                    setADayForSub = new String[subjects.size()];

                    for (int i = 0; i < subjects.size(); i++) {

                        for (String x : subjects) {
                            subject = String.valueOf(x);

                            i = i + 1;
                            System.out.println(i + "-" + subject);
                        }

                        if (subjects.size() == 1) {
                            setADayForSub[0] = subjects.get(0);
                        } else if (subjects.size() == 2) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                        } else if (subjects.size() == 3) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                        } else if (subjects.size() == 4) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                        } else if (subjects.size() == 5) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                            setADayForSub[4] = subjects.get(4);
                        } else if (subjects.size() == 6) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                            setADayForSub[4] = subjects.get(4);
                            setADayForSub[5] = subjects.get(5);
                        } else if (subjects.size() == 7) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                            setADayForSub[4] = subjects.get(4);
                            setADayForSub[5] = subjects.get(5);
                            setADayForSub[6] = subjects.get(6);
                        } else if (subjects.size() == 8) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                            setADayForSub[4] = subjects.get(4);
                            setADayForSub[5] = subjects.get(5);
                            setADayForSub[6] = subjects.get(6);
                            setADayForSub[7] = subjects.get(7);
                        } else if (subjects.size() == 9) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                            setADayForSub[4] = subjects.get(4);
                            setADayForSub[5] = subjects.get(5);
                            setADayForSub[6] = subjects.get(6);
                            setADayForSub[7] = subjects.get(7);
                            setADayForSub[8] = subjects.get(8);
                        } else if (subjects.size() == 10) {
                            setADayForSub[0] = subjects.get(0);
                            setADayForSub[1] = subjects.get(1);
                            setADayForSub[2] = subjects.get(2);
                            setADayForSub[3] = subjects.get(3);
                            setADayForSub[4] = subjects.get(4);
                            setADayForSub[5] = subjects.get(5);
                            setADayForSub[6] = subjects.get(6);
                            setADayForSub[7] = subjects.get(7);
                            setADayForSub[8] = subjects.get(8);
                            setADayForSub[9] = subjects.get(9);
                        }

                        pickSubject = scanner1.nextInt();

                        String selectEl = null;

                        System.out.println(" ");
                        if (1 == pickSubject) {
                            selectEl = setADayForSub[0];
                            System.out.println(selectEl);
                        } else if (2 == pickSubject) {
                            selectEl = setADayForSub[1];
                            System.out.println(selectEl);
                        } else if (3 == pickSubject) {
                            selectEl = setADayForSub[2];
                            System.out.println(selectEl);
                        } else if (4 == pickSubject) {
                            selectEl = setADayForSub[3];
                            System.out.println(selectEl);
                        } else if (5 == pickSubject) {
                            selectEl = setADayForSub[4];
                            System.out.println(selectEl);
                        } else if (6 == pickSubject) {
                            selectEl = setADayForSub[5];
                            System.out.println(selectEl);
                        } else if (7 == pickSubject) {
                            selectEl = setADayForSub[6];
                            System.out.println(selectEl);
                        } else if (8 == pickSubject) {
                            selectEl = setADayForSub[7];
                            System.out.println(selectEl);
                        } else if (9 == pickSubject) {
                            selectEl = setADayForSub[8];
                            System.out.println(selectEl);
                        }  else if (10 == pickSubject) {
                            selectEl = setADayForSub[9];
                            System.out.println(selectEl);
                        }

                        System.out.println(" ");

                        for (; ; ) {
                            System.out.println("Set the" + " " + selectEl + " " + "in some day:");

                            System.out.println(" ");
                            System.out.println("Press 'M' for monday \nPress 'T' for tuesday \nPress 'W' for wednesday \nPress 'H' for thursday \nPress 'F' for friday");

                            day = scanner.nextLine();

                            if ("M".equals(day)) {
                                day = "Monday";

                                monday = selectEl;

                                System.out.println(day + ":" + selectEl);

                                subFromMondays.add(monday);
                                days.add(day);

                            } else if ("T".equals(day)) {
                                day = "Tuesday";

                                tuesday = selectEl;

                                System.out.println(day + ":" + selectEl);

                                subFromTuesdays.add(tuesday);
                                days.add(day);

                            } else if ("W".equals(day)) {
                                day = "Wednesday";

                                wednesday = selectEl;

                                System.out.println(day + ":" + selectEl);

                                subFromWednesdays.add(wednesday);
                                days.add(day);

                            } else if ("H".equals(day)) {
                                day = "Thursday";

                                thursday = selectEl;

                                System.out.println(day + ":" + selectEl);

                                subFromThursdays.add(thursday);
                                days.add(day);

                            } else if ("F".equals(day)) {
                                day = "Friday";

                                friday = selectEl;

                                System.out.println(day + ":" + selectEl);

                                subFromFridays.add(friday);
                                days.add(day);
                            }

                            if ("E".equals(day)) {
                                break;
                            }

                            System.out.println(" ");


                            day = String.valueOf(days);

                            subject = String.valueOf(subjects);

                            monday = String.valueOf(subFromMondays);
                            tuesday = String.valueOf(subFromTuesdays);
                            wednesday = String.valueOf(subFromWednesdays);
                            thursday = String.valueOf(subFromThursdays);
                            friday = String.valueOf(subFromFridays);

                        }

                    }

                    break;

                //DESCRIPTION
                case "D":
                    System.out.println("Description:");

                    System.out.println(" ");
                    System.out.println("Pick the subject which do you want to add a description");
                    System.out.println("Enter the number that depends on the subject that you want:");
                    System.out.println(" ");

                    String selectSub = null;

                    descriptionArr = new String[subjects.size()];

                    for (int i = 0; i < subjects.size(); i++) {

                        for (String x : subjects) {
                            subject = String.valueOf(x);

                            i = i + 1;
                            System.out.println(i + "-" + subject);
                        }

                        if (subjects.size() == 1) {
                            descriptionArr[0] = subjects.get(0);

                        } else if (subjects.size() == 2) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                        } else if (subjects.size() == 3) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                        } else if (subjects.size() == 4) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                        } else if (subjects.size() == 5) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                        } else if (subjects.size() == 6) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                            descriptionArr[5] = subjects.get(5);
                        } else if (subjects.size() == 7) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                            descriptionArr[5] = subjects.get(5);
                            descriptionArr[6] = subjects.get(6);
                        } else if (subjects.size() == 7) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                            descriptionArr[5] = subjects.get(5);
                            descriptionArr[6] = subjects.get(6);
                        } else if (subjects.size() == 8) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                            descriptionArr[5] = subjects.get(5);
                            descriptionArr[6] = subjects.get(6);
                            descriptionArr[7] = subjects.get(7);
                        } else if (subjects.size() == 9) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                            descriptionArr[5] = subjects.get(5);
                            descriptionArr[6] = subjects.get(6);
                            descriptionArr[7] = subjects.get(7);
                            descriptionArr[8] = subjects.get(8);
                        } else if (subjects.size() == 10) {
                            descriptionArr[0] = subjects.get(0);
                            descriptionArr[1] = subjects.get(1);
                            descriptionArr[2] = subjects.get(2);
                            descriptionArr[3] = subjects.get(3);
                            descriptionArr[4] = subjects.get(4);
                            descriptionArr[5] = subjects.get(5);
                            descriptionArr[6] = subjects.get(6);
                            descriptionArr[7] = subjects.get(7);
                            descriptionArr[8] = subjects.get(8);
                            descriptionArr[10] = subjects.get(10);
                        }

                        pickSubject = scanner1.nextInt();

                        System.out.println(" ");
                        if (1 == pickSubject) {
                            selectSub = descriptionArr[0];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + descriptionArr[0] + ":");

                            description = scanner.nextLine();

                            descriptionList.add(description);

                            descriptionArr[0] = String.valueOf(descriptionList);

                            break;

                        } else if (2 == pickSubject) {
                            selectSub = descriptionArr[1];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList1.add(description);

                            descriptionArr[1] = String.valueOf(descriptionList1);

                            break;

                        } else if (3 == pickSubject) {
                            selectSub = descriptionArr[2];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList2.add(description);

                            descriptionArr[2] = String.valueOf(descriptionList2);

                            break;

                        } else if (4 == pickSubject) {
                            selectSub = descriptionArr[3];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList3.add(description);

                            descriptionArr[3] = String.valueOf(descriptionList7);

                            break;

                        } else if (5 == pickSubject) {
                            selectSub = descriptionArr[4];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList4.add(description);

                            descriptionArr[4] = String.valueOf(descriptionList4);

                            break;

                        } else if (6 == pickSubject) {
                            selectSub = descriptionArr[5];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList5.add(description);

                            descriptionArr[5] = String.valueOf(descriptionList5);

                            break;

                        } else if (7 == pickSubject) {
                            selectSub = descriptionArr[6];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList6.add(description);

                            descriptionArr[6] = String.valueOf(descriptionList6);

                            break;

                        } else if (8 == pickSubject) {
                            selectSub = descriptionArr[7];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList7.add(description);

                            descriptionArr[7] = String.valueOf(descriptionList7);

                            break;

                        } else if (9 == pickSubject) {
                            selectSub = descriptionArr[8];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList8.add(description);

                            descriptionArr[8] = String.valueOf(descriptionList8);

                            break;

                        } else if (10 == pickSubject) {
                            selectSub = descriptionArr[9];
                            System.out.println(selectSub);

                            System.out.println(" ");
                            System.out.println("Add a description for subject:" + selectSub + ":");

                            description = scanner.nextLine();

                            descriptionList9.add(description);

                            descriptionArr[9] = String.valueOf(descriptionList9);

                            break;
                        }

                        if ("E".equals(selectSub)) {
                            break;
                        }
                    }

                    break;

                //EXAM
                case "X":

                    System.out.println("Exam");

                    System.out.println(" ");
                    System.out.println("Add a title:");

                    String tittle = scanner.nextLine();

                    System.out.println(" ");
                    System.out.println("Pick a subject:");
                    System.out.println("Enter the number that depends on the subject that you want:");
                    System.out.println(" ");

                    examForSub = new String[subjects.size()];

                    for (int i = 0; i < subjects.size(); i++) {

                        for (String x : subjects) {
                            subject = String.valueOf(x);
                            i = i + 1;
                            System.out.println(i + "-" + subject);
                        }

                        if (subjects.size() == 1) {
                            examForSub[0] = subjects.get(0);
                        } else if (subjects.size() == 2) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                        } else if (subjects.size() == 3) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                        } else if (subjects.size() == 4) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                        } else if (subjects.size() == 5) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                            examForSub[4] = subjects.get(4);
                        } else if (subjects.size() == 6) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                            examForSub[4] = subjects.get(4);
                            examForSub[5] = subjects.get(5);
                        } else if (subjects.size() == 7) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                            examForSub[4] = subjects.get(4);
                            examForSub[5] = subjects.get(5);
                            examForSub[6] = subjects.get(6);
                        } else if (subjects.size() == 8) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                            examForSub[4] = subjects.get(4);
                            examForSub[5] = subjects.get(5);
                            examForSub[6] = subjects.get(6);
                            examForSub[7] = subjects.get(7);
                        } else if (subjects.size() == 9) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                            examForSub[4] = subjects.get(4);
                            examForSub[5] = subjects.get(5);
                            examForSub[6] = subjects.get(6);
                            examForSub[7] = subjects.get(7);
                            examForSub[8] = subjects.get(8);
                        } else if (subjects.size() == 10) {
                            examForSub[0] = subjects.get(0);
                            examForSub[1] = subjects.get(1);
                            examForSub[2] = subjects.get(2);
                            examForSub[3] = subjects.get(3);
                            examForSub[4] = subjects.get(4);
                            examForSub[5] = subjects.get(5);
                            examForSub[6] = subjects.get(6);
                            examForSub[7] = subjects.get(7);
                            examForSub[8] = subjects.get(8);
                            examForSub[9] = subjects.get(9);
                        }

                        pickSubject = scanner1.nextInt();

                        String selectEl = null;

                        System.out.println(" ");
                        if (1 == pickSubject) {
                            selectEl = examForSub[0];
                            System.out.println(selectEl);

                            System.out.println(" ");

                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                category = "Oral exam";
                                System.out.println(category);
                            } else if ("W".equals(category)) {
                                category = "Writing exam";
                                System.out.println(category);
                            }

                            exam.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[0] = String.valueOf(exam);

                        } else if (2 == pickSubject) {
                            selectEl = examForSub[1];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                category = "Oral exam";
                                System.out.println(category);
                            } else if ("W".equals(category)) {
                                category = "Writing exam";
                                System.out.println(category);
                            }

                            exam1.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[1] = String.valueOf(exam1);

                        } else if (3 == pickSubject) {
                            selectEl = examForSub[2];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                category = "Oral exam";
                                System.out.println(category);
                            } else if ("W".equals(category)) {
                                category = "Writing exam";
                                System.out.println(category);
                            }

                            exam2.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[2] = String.valueOf(exam2);

                        } else if (4 == pickSubject) {
                            selectEl = examForSub[3];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam3.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[3] = String.valueOf(exam3);

                        } else if (5 == pickSubject) {
                            selectEl = examForSub[4];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam4.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[4] = String.valueOf(exam4);

                        } else if (6 == pickSubject) {
                            selectEl = examForSub[5];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam5.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[5] = String.valueOf(exam5);

                        } else if (7 == pickSubject) {
                            selectEl = examForSub[6];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam6.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[6] = String.valueOf(exam6);

                        } else if (8 == pickSubject) {
                            selectEl = examForSub[7];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam7.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[7] = String.valueOf(exam7);

                        } else if (9 == pickSubject) {
                            selectEl = examForSub[8];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam8.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[8] = String.valueOf(exam8);

                        } else if (10 == pickSubject) {
                            selectEl = examForSub[9];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            System.out.println(" ");
                            System.out.println("Pick a category:");

                            System.out.println(" ");
                            System.out.println("Press 'O' for oral exam \nPress 'W' for writing exam");

                            String category = scanner.nextLine();

                            if ("O".equals(category)) {
                                System.out.println("Oral exam");
                            } else if ("W".equals(category)) {
                                System.out.println("Writing exam");
                            }

                            exam9.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year + "\n" + "Category:" + category);

                            examForSub[9] = String.valueOf(exam9);

                        }
                    }

                    break;

                case "H":
                    System.out.println("Homework");

                    System.out.println(" ");
                    System.out.println("Add a title:");

                    tittle = scanner.nextLine();

                    System.out.println(" ");
                    System.out.println("Pick a subject:");
                    System.out.println("Enter the number that depends on the subject that you want:");
                    System.out.println(" ");

                    homeworkArr = new String[subjects.size()];

                    for (int i = 0; i < subjects.size(); i++) {

                        for (String x : subjects) {
                            subject = String.valueOf(x);

                            i = i + 1;
                            System.out.println(i + "-" + subject);
                        }

                        if (subjects.size() == 1) {
                            homeworkArr[0] = subjects.get(0);
                        } else if (subjects.size() == 2) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                        } else if (subjects.size() == 3) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                        } else if (subjects.size() == 4) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                            homeworkArr[3] = subjects.get(3);
                        } else if (subjects.size() == 5) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                            homeworkArr[3] = subjects.get(3);
                            homeworkArr[4] = subjects.get(4);
                        } else if (subjects.size() == 6) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                            homeworkArr[3] = subjects.get(3);
                            homeworkArr[4] = subjects.get(4);
                            homeworkArr[5] = subjects.get(5);
                        } else if (subjects.size() == 8) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                            homeworkArr[3] = subjects.get(3);
                            homeworkArr[4] = subjects.get(4);
                            homeworkArr[5] = subjects.get(5);
                            homeworkArr[6] = subjects.get(6);
                            homeworkArr[7] = subjects.get(7);
                        } else if (subjects.size() == 9) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                            homeworkArr[3] = subjects.get(3);
                            homeworkArr[4] = subjects.get(4);
                            homeworkArr[5] = subjects.get(5);
                            homeworkArr[6] = subjects.get(6);
                            homeworkArr[7] = subjects.get(7);
                            homeworkArr[8] = subjects.get(8);
                        } else if (subjects.size() == 10) {
                            homeworkArr[0] = subjects.get(0);
                            homeworkArr[1] = subjects.get(1);
                            homeworkArr[2] = subjects.get(2);
                            homeworkArr[3] = subjects.get(3);
                            homeworkArr[4] = subjects.get(4);
                            homeworkArr[5] = subjects.get(5);
                            homeworkArr[6] = subjects.get(6);
                            homeworkArr[7] = subjects.get(7);
                            homeworkArr[8] = subjects.get(8);
                            homeworkArr[8] = subjects.get(8);
                        }

                        pickSubject = scanner1.nextInt();

                        String selectEl = null;

                        System.out.println(" ");
                        if (1 == pickSubject) {
                            selectEl = homeworkArr[0];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[0] = String.valueOf(homework);

                        } else if (2 == pickSubject) {
                            selectEl = homeworkArr[1];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework1.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[1] = String.valueOf(homework1);

                        } else if (3 == pickSubject) {
                            selectEl = homeworkArr[2];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework2.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[2] = String.valueOf(homework2);

                        } else if (4 == pickSubject) {
                            selectEl = homeworkArr[3];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework3.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[3] = String.valueOf(homework3);

                        } else if (5 == pickSubject) {
                            selectEl = homeworkArr[4];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework4.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[4] = String.valueOf(homework4);

                        } else if (6 == pickSubject) {
                            selectEl = homeworkArr[5];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework5.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[5] = String.valueOf(homework5);

                        } else if (7 == pickSubject) {
                            selectEl = homeworkArr[6];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework6.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[6] = String.valueOf(homework6);

                        } else if (8 == pickSubject) {
                            selectEl = homeworkArr[7];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework7.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[7] = String.valueOf(homework7);

                        } else if (9 == pickSubject) {
                            selectEl = homeworkArr[7];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework8.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[8] = String.valueOf(homework8);

                        } else if (10 == pickSubject) {
                            selectEl = homeworkArr[9];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Pick a date for exam:");

                            System.out.println(" ");

                            System.out.println("Day:");
                            int day = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Month:");
                            int month = scanner1.nextInt();

                            System.out.println(" ");
                            System.out.println("Year:");
                            int year = scanner1.nextInt();

                            System.out.println(day + "." + month + "." + year);

                            homework9.add("Tittle:" + tittle + "\n" + "Date for the exam:" + day + "." + month + "." + year);

                            homeworkArr[9] = String.valueOf(homework9);

                        }
                    }

                    break;

                //GRADES
                case "G":
                    System.out.println("Grades:");

                    System.out.println(" ");
                    System.out.println("Pick a subject:");

                    System.out.println(" ");
                    System.out.println("Enter the number that depends on the subject that you want:");
                    System.out.println(" ");

                    gradeArr = new String[subjects.size()];

                    for (int i = 0; i < subjects.size(); i++) {

                        for (String x : subjects) {
                            subject = String.valueOf(x);

                            i = i + 1;
                            System.out.println(i + "-" + subject);
                        }

                        if (subjects.size() == 1) {
                            gradeArr[0] = subjects.get(0);
                        } else if (subjects.size() == 2) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                        } else if (subjects.size() == 3) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                        } else if (subjects.size() == 4) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                        } else if (subjects.size() == 5) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                            gradeArr[4] = subjects.get(4);
                        } else if (subjects.size() == 6) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                            gradeArr[4] = subjects.get(4);
                            gradeArr[5] = subjects.get(5);
                        } else if (subjects.size() == 7) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                            gradeArr[4] = subjects.get(4);
                            gradeArr[5] = subjects.get(5);
                            gradeArr[6] = subjects.get(6);
                        } else if (subjects.size() == 8) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                            gradeArr[4] = subjects.get(4);
                            gradeArr[5] = subjects.get(5);
                            gradeArr[6] = subjects.get(6);
                            gradeArr[7] = subjects.get(7);
                        } else if (subjects.size() == 9) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                            gradeArr[4] = subjects.get(4);
                            gradeArr[5] = subjects.get(5);
                            gradeArr[6] = subjects.get(6);
                            gradeArr[7] = subjects.get(7);
                            gradeArr[8] = subjects.get(8);
                        } else if (subjects.size() == 10) {
                            gradeArr[0] = subjects.get(0);
                            gradeArr[1] = subjects.get(1);
                            gradeArr[2] = subjects.get(2);
                            gradeArr[3] = subjects.get(3);
                            gradeArr[4] = subjects.get(4);
                            gradeArr[5] = subjects.get(5);
                            gradeArr[6] = subjects.get(6);
                            gradeArr[7] = subjects.get(7);
                            gradeArr[8] = subjects.get(8);
                            gradeArr[9] = subjects.get(9);
                        }

                        pickSubject = scanner1.nextInt();

                        String selectEl = null;

                        System.out.println(" ");
                        if (1 == pickSubject) {
                            selectEl = gradeArr[0];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade.add(String.valueOf(setAGrade));
                            gradeArr[0] = String.valueOf(grade);

                        } else if (2 == pickSubject) {
                            selectEl = gradeArr[1];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade1.add(String.valueOf(setAGrade));
                            gradeArr[1] = String.valueOf(grade1);

                        } else if (3 == pickSubject) {
                            selectEl = gradeArr[2];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade2.add(String.valueOf(setAGrade));
                            gradeArr[2] = String.valueOf(grade2);

                        } else if (4 == pickSubject) {
                            selectEl = gradeArr[3];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade3.add(String.valueOf(setAGrade));
                            gradeArr[3] = String.valueOf(grade3);

                        } else if (5 == pickSubject) {
                            selectEl = gradeArr[4];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade4.add(String.valueOf(setAGrade));
                            gradeArr[4] = String.valueOf(grade4);

                        } else if (6 == pickSubject) {
                            selectEl = gradeArr[5];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade5.add(String.valueOf(setAGrade));
                            gradeArr[5] = String.valueOf(grade5);

                        } else if (7 == pickSubject) {
                            selectEl = gradeArr[6];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade6.add(String.valueOf(setAGrade));
                            gradeArr[6] = String.valueOf(grade6);

                        } else if (8 == pickSubject) {
                            selectEl = gradeArr[7];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade7.add(String.valueOf(setAGrade));
                            gradeArr[7] = String.valueOf(grade7);

                        } else if (9 == pickSubject) {
                            selectEl = gradeArr[8];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade8.add(String.valueOf(setAGrade));
                            gradeArr[8] = String.valueOf(grade8);

                        } else if (10 == pickSubject) {
                            selectEl = gradeArr[9];
                            System.out.println(selectEl);

                            System.out.println(" ");
                            System.out.println("Enter a grade for subject:" + selectEl);

                            int setAGrade = scanner1.nextInt();

                            if (setAGrade > 5) {
                                System.out.println("Enter a grade from 1-5");

                                for (; ; ) {
                                    setAGrade = scanner1.nextInt();

                                    if (setAGrade > 5) {
                                        System.out.println("Enter a grade from 1-5");
                                    }

                                    if (setAGrade <= 5) {
                                        break;
                                    }
                                }
                            }

                            System.out.println(" ");
                            System.out.println("Grade for subject" + " " + selectEl + " " + "is:" + setAGrade);

                            grade9.add(String.valueOf(setAGrade));
                            gradeArr[9] = String.valueOf(grade9);

                        }
                    }

                    break;

                //OVERVIEW OF ALL SUBJECTS
                case "O":
                    System.out.println("Overview of all subjects");

                    System.out.println(" ");
                    for (String x : subjects) {

                        subject = String.valueOf(x);

                        System.out.println("Monday:");
                        for (String i : subFromMondays) {
                            monday = String.valueOf(i);
                            System.out.println(monday);
                        }

                        System.out.println(" ");
                        System.out.println("Tuesday:");
                        for (String i : subFromTuesdays) {
                            tuesday = String.valueOf(i);
                            System.out.println(tuesday);
                        }

                        System.out.println(" ");
                        System.out.println("Wednesday:");
                        for (String i : subFromWednesdays) {
                            wednesday = String.valueOf(i);
                            System.out.println(wednesday);
                        }

                        System.out.println(" ");
                        System.out.println("Thursday:");
                        for (String i : subFromThursdays) {
                            thursday = String.valueOf(i);
                            System.out.println(thursday);
                        }

                        System.out.println(" ");
                        System.out.println("Friday:");
                        for (String i : subFromFridays) {
                            friday = String.valueOf(i);
                            System.out.println(friday);
                        }

                        System.out.println(" ");
                        System.out.println("You can pick a subject to see all his informations:");

                        overviewArr = new String[subjects.size()];

                        for (int i = 0; i < subjects.size(); i++) {

                            for (String a : subjects) {
                                subject = String.valueOf(a);

                                i = i + 1;
                                System.out.println(i + "-" + subject);
                            }

                            if (subjects.size() == 1) {
                                overviewArr[0] = subjects.get(0);
                            } else if (subjects.size() == 2) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                            } else if (subjects.size() == 3) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                            } else if (subjects.size() == 4) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                            } else if (subjects.size() == 5) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                                overviewArr[4] = subjects.get(4);
                            } else if (subjects.size() == 6) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                                overviewArr[4] = subjects.get(4);
                                overviewArr[5] = subjects.get(5);
                            } else if (subjects.size() == 7) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                                overviewArr[4] = subjects.get(4);
                                overviewArr[5] = subjects.get(5);
                                overviewArr[6] = subjects.get(6);
                            } else if (subjects.size() == 8) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                                overviewArr[4] = subjects.get(4);
                                overviewArr[5] = subjects.get(5);
                                overviewArr[6] = subjects.get(6);
                                overviewArr[7] = subjects.get(7);
                            } else if (subjects.size() == 9) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                                overviewArr[4] = subjects.get(4);
                                overviewArr[5] = subjects.get(5);
                                overviewArr[6] = subjects.get(6);
                                overviewArr[7] = subjects.get(7);
                                overviewArr[8] = subjects.get(8);
                            }  else if (subjects.size() == 10) {
                                overviewArr[0] = subjects.get(0);
                                overviewArr[1] = subjects.get(1);
                                overviewArr[2] = subjects.get(2);
                                overviewArr[3] = subjects.get(3);
                                overviewArr[4] = subjects.get(4);
                                overviewArr[5] = subjects.get(5);
                                overviewArr[6] = subjects.get(6);
                                overviewArr[7] = subjects.get(7);
                                overviewArr[8] = subjects.get(8);
                                overviewArr[9] = subjects.get(9);
                            }

                            pickSubject = scanner1.nextInt();

                            String selectEl = null;

                            System.out.println(" ");
                            if (1 == pickSubject) {
                                selectEl = overviewArr[0];
                                System.out.println("Informations of:" + selectEl);

                                //DESCRIPTION
                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String p : descriptionList) {
                                    descriptionArr[0] = String.valueOf(p);
                                    System.out.println(descriptionArr[0]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam) {
                                    examForSub[0] = String.valueOf(e);
                                    System.out.println(examForSub[0]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework) {
                                    homeworkArr[0] = String.valueOf(e);
                                    System.out.println(homeworkArr[0]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade) {
                                    gradeArr[0] = String.valueOf(e);
                                    System.out.println(gradeArr[0]);
                                    break;
                                }


                            } else if (2 == pickSubject) {
                                selectEl = overviewArr[1];
                                System.out.println("Informations of:" + selectEl);

                                //DESCRIPTION
                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList1) {
                                    descriptionArr[1] = String.valueOf(k);
                                    System.out.println(descriptionArr[1]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam1) {
                                    examForSub[1] = String.valueOf(e);
                                    System.out.println(examForSub[1]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework1) {
                                    homeworkArr[1] = String.valueOf(e);
                                    System.out.println(homeworkArr[1]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade1) {
                                    gradeArr[1] = String.valueOf(e);
                                    System.out.println(gradeArr[1]);
                                    break;
                                }

                            } else if (3 == pickSubject) {
                                selectEl = overviewArr[2];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList2) {
                                    descriptionArr[2] = String.valueOf(k);
                                    System.out.println(descriptionArr[2]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam2) {
                                    examForSub[2] = String.valueOf(e);
                                    System.out.println(examForSub[2]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework2) {
                                    homeworkArr[2] = String.valueOf(e);
                                    System.out.println(homeworkArr[2]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade2) {
                                    gradeArr[2] = String.valueOf(e);
                                    System.out.println(gradeArr[2]);
                                    break;
                                }

                            } else if (4 == pickSubject) {
                                selectEl = overviewArr[3];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList2) {
                                    descriptionArr[3] = String.valueOf(k);
                                    System.out.println(descriptionArr[3]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam3) {
                                    examForSub[3] = String.valueOf(e);
                                    System.out.println(examForSub[3]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework3) {
                                    homeworkArr[3] = String.valueOf(e);
                                    System.out.println(homeworkArr[3]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade3) {
                                    gradeArr[3] = String.valueOf(e);
                                    System.out.println(gradeArr[3]);
                                    break;
                                }

                            } else if (5 == pickSubject) {
                                selectEl = overviewArr[4];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList4) {
                                    descriptionArr[4] = String.valueOf(k);
                                    System.out.println(descriptionArr[4]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam4) {
                                    examForSub[4] = String.valueOf(e);
                                    System.out.println(examForSub[4]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework4) {
                                    homeworkArr[4] = String.valueOf(e);
                                    System.out.println(homeworkArr[4]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade4) {
                                    gradeArr[4] = String.valueOf(e);
                                    System.out.println(gradeArr[4]);
                                    break;
                                }

                            } else if (6 == pickSubject) {
                                selectEl = overviewArr[5];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList5) {
                                    descriptionArr[5] = String.valueOf(k);
                                    System.out.println(descriptionArr[5]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam5) {
                                    examForSub[5] = String.valueOf(e);
                                    System.out.println(examForSub[5]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework5) {
                                    homeworkArr[5] = String.valueOf(e);
                                    System.out.println(homeworkArr[5]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade5) {
                                    gradeArr[5] = String.valueOf(e);
                                    System.out.println(gradeArr[5]);
                                    break;
                                }

                            } else if (7 == pickSubject) {
                                selectEl = overviewArr[6];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList6) {
                                    descriptionArr[6] = String.valueOf(k);
                                    System.out.println(descriptionArr[6]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam6) {
                                    examForSub[6] = String.valueOf(e);
                                    System.out.println(examForSub[6]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework6) {
                                    homeworkArr[6] = String.valueOf(e);
                                    System.out.println(homeworkArr[6]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade6) {
                                    gradeArr[6] = String.valueOf(e);
                                    System.out.println(gradeArr[6]);
                                    break;
                                }

                            } else if (8 == pickSubject) {
                                selectEl = overviewArr[7];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList7) {
                                    descriptionArr[7] = String.valueOf(k);
                                    System.out.println(descriptionArr[7]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam7) {
                                    examForSub[7] = String.valueOf(e);
                                    System.out.println(examForSub[7]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework7) {
                                    homeworkArr[7] = String.valueOf(e);
                                    System.out.println(homeworkArr[7]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade7) {
                                    gradeArr[7] = String.valueOf(e);
                                    System.out.println(gradeArr[7]);
                                    break;
                                }

                            } else if (9 == pickSubject) {
                                selectEl = overviewArr[8];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList7) {
                                    descriptionArr[7] = String.valueOf(k);
                                    System.out.println(descriptionArr[7]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam8) {
                                    examForSub[8] = String.valueOf(e);
                                    System.out.println(examForSub[8]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework8) {
                                    homeworkArr[8] = String.valueOf(e);
                                    System.out.println(homeworkArr[8]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade8) {
                                    gradeArr[8] = String.valueOf(e);
                                    System.out.println(gradeArr[8]);
                                    break;
                                }

                            } else if (10 == pickSubject) {
                                selectEl = overviewArr[9];
                                System.out.println("Informations of:" + selectEl);

                                System.out.println(" ");
                                System.out.println("Description:");

                                for (String k : descriptionList7) {
                                    descriptionArr[7] = String.valueOf(k);
                                    System.out.println(descriptionArr[7]);
                                    break;
                                }

                                //EXAM
                                System.out.println(" ");
                                System.out.println("Exam:");

                                for (String e : exam9) {
                                    examForSub[9] = String.valueOf(e);
                                    System.out.println(examForSub[9]);
                                    break;
                                }

                                //HOMEWORK
                                System.out.println(" ");
                                System.out.println("Homework:");

                                for (String e : homework9) {
                                    homeworkArr[9] = String.valueOf(e);
                                    System.out.println(homeworkArr[9]);
                                    break;
                                }

                                //GRADE
                                System.out.println(" ");
                                System.out.println("Grade:");

                                for (String e : grade9) {
                                    gradeArr[9] = String.valueOf(e);
                                    System.out.println(gradeArr[9]);
                                    break;
                                }
                            }

                                String exit = scanner.nextLine();

                                if ("E".equals(exit)) {
                                    break;
                                }
                            }

                            break;
                        }
                    }
            }
        }
    }

