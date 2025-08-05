package com.gqt.corejava.project;
import java.util.Scanner;

		class Quiz {
		    public static final String ANSI_RESET = "\u001B[0m";
		    public static final String ANSI_RED = "\u001B[31m";
		    public static final String ANSI_GREEN = "\u001B[32m";
		    public static final String ANSI_YELLOW = "\u001B[33m";
		    public static final String ANSI_PURPLE = "\u001B[35m";

		    Scanner sc = new Scanner(System.in);
		    int lifelineAudienceUsed = 0;
		    int lifeline5050Used = 0;
		    int totalWon = 0;
		    int questionNo = 0;
		    boolean safeReached = false;

		    void showMoneyTree() {
		        System.out.println(ANSI_YELLOW + "Prize Money Tree:" + ANSI_RESET);
		        System.out.println("Q1 - Rs 10,000");
		        System.out.println("Q2 - Rs 20,000");
		        System.out.println("Q3 - Rs 40,000");
		        System.out.println("Q4 - Rs 80,000");
		        System.out.println("Q5 - Rs 1,60,000  <-- SAFE AMOUNT");
		        System.out.println("Q6 - Rs 3,20,000");
		        System.out.println("Q7 - Rs 6,40,000");
		        System.out.println("Q8 - Rs 12,50,000");
		        System.out.println("Q9 - Rs 25,00,000");
		        System.out.println("Q10 - Rs 1,00,00,000");
		        System.out.println();
		    }

		    void startQuiz() {
		        askQuestion("What is the size of an int in Java?",
		                new String[]{"2 bytes", "4 bytes", "8 bytes", "Depends on system"}, 1, 10000);

		        askQuestion("Which of these is not a Java keyword?",
		                new String[]{"statuc", "void", "Integer", "new"}, 2, 20000);

		        askQuestion("Which method is used to start a thread in Java?",
		                new String[]{"run()", "start()", "execute", "init()"}, 1, 40000);

		        askQuestion("Which is a valid declaration of a variable in Java?",
		                new String[]{"int 1x = 10;", "float value = \"10.5\";", "boolean flag = true;", "char ch = 'A';"}, 2, 80000);

		        askQuestion("Which of these is a superclass of all classes in Java?",
		                new String[]{"String", "object", "class", "System"}, 1, 160000);

		        safeReached = true;

		        askQuestionWithQuit("What is the default value of a boolean in Java?",
		                new String[]{"true", "1", "false", "null"}, 2, 320000);

		        askQuestionWithQuit("What is the output of: System.out.println(10 + 20 + \"java\")?",
		                new String[]{"30java", "1020java", "java1020", "java30"}, 0, 640000);

		        askQuestionWithQuit("Which of these is not a Java keyword?",
		                new String[]{"new", "delete", "this", "static"}, 1, 1250000);

		        askQuestionWithQuit("What is the extension of a Java bytecode file?",
		                new String[]{".java", ".txt", ".exe", ".class"}, 3, 2500000);

		        askQuestionWithQuit("Which of these is a loop in Java?",
		                new String[]{"loop", "foreach", "while", "iterate"}, 2, 10000000);

		        System.out.println(ANSI_PURPLE + "\nCongratulations! You completed the quiz and won Rs. " + totalWon + ANSI_RESET);
		    }

		    void askQuestion(String question, String[] options, int correctAnswer, int reward) {
		        questionNo++;
		        System.out.println("\n" + ANSI_YELLOW + "Q" + questionNo + ": Rs. " + reward + ANSI_RESET);
		        System.out.println(question);
		        for (int i = 0; i < options.length; i++) {
		            System.out.println((i + 1) + ". " + options[i]);
		        }
		        System.out.println("5. Use Lifeline");

		        int userAnswer = getAnswer(correctAnswer);

		        if (userAnswer == correctAnswer + 1) {
		            totalWon = reward;
		            System.out.println(ANSI_GREEN + "Correct! You won Rs. " + reward + ANSI_RESET);
		        } else {
		            endGame();
		        }
		    }

		    void askQuestionWithQuit(String question, String[] options, int correctAnswer, int reward) {
		        questionNo++;
		        System.out.println("\n" + ANSI_YELLOW + "Q" + questionNo + ": Rs. " + reward + ANSI_RESET);
		        System.out.println(question);
		        for (int i = 0; i < options.length; i++) {
		            System.out.println((i + 1) + ". " + options[i]);
		        }
		        System.out.println("5. Use Lifeline");
		        System.out.println("6. Quit");

		        int userAnswer = getAnswerWithQuit(correctAnswer);

		        if (userAnswer == 6) {
		            System.out.println(ANSI_YELLOW + "You chose to quit. You take home Rs. " + totalWon + ANSI_RESET);
		            System.exit(0);
		        } else if (userAnswer == correctAnswer + 1) {
		            totalWon = reward;
		            System.out.println(ANSI_GREEN + "Correct! You won Rs. " + reward + ANSI_RESET);
		        } else {
		            endGame();
		        }
		    }

		    int getAnswer(int correctAnswer) {
		        System.out.print(ANSI_PURPLE + "Enter your answer (1-4) or 5 for lifeline: " + ANSI_RESET);
		        int choice = sc.nextInt();

		        if (choice == 5) {
		            choice = useLifeline(correctAnswer);
		        }

		        return choice;
		    }

		    int getAnswerWithQuit(int correctAnswer) {
		        System.out.print(ANSI_PURPLE + "Enter your answer (1-4), 5 for lifeline, 6 to quit: " + ANSI_RESET);
		        int choice = sc.nextInt();

		        if (choice == 5) {
		            choice = useLifeline(correctAnswer);
		        }

		        return choice;
		    }

		    int useLifeline(int correctAnswer) {
		        System.out.println(ANSI_YELLOW + "Choose Lifeline:" + ANSI_RESET);
		        if (lifelineAudienceUsed == 0) System.out.println("1. Audience Poll");
		        if (lifeline5050Used == 0) System.out.println("2. 50-50");

		        int lifelineChoice = sc.nextInt();

		        if (lifelineChoice == 1 && lifelineAudienceUsed == 0) {
		            lifelineAudienceUsed = 1;
		            System.out.println("--- Audience Poll ---");
		            System.out.println("Most audience voted for option " + (correctAnswer + 1));
		        } else if (lifelineChoice == 2 && lifeline5050Used == 0) {
		            lifeline5050Used = 1;
		            System.out.println("--- 50-50 Lifeline ---");
		            System.out.println("Correct option and one random wrong option shown.");
		        } else {
		            System.out.println("Lifeline not available or already used.");
		        }

		        System.out.print("Enter your final answer (1-4): ");
		        return sc.nextInt();
		    }

		    void endGame() {
		        System.out.println(ANSI_RED + "Wrong Answer! Game Over." + ANSI_RESET);
		        if (safeReached) {
		            System.out.println(ANSI_YELLOW + "You reached a safe level. You take home Rs. " + totalWon + ANSI_RESET);
		        } else {
		            System.out.println(ANSI_RED + "You did not reach a safe level. You won Rs. 0" + ANSI_RESET);
		        }
		        System.exit(0);
		    }
		}

		public class Quizgame {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Quiz quiz = new Quiz();

		        System.out.println(Quiz.ANSI_YELLOW + "Welcome to the Quiz Game!" + Quiz.ANSI_RESET);
		        System.out.print(Quiz.ANSI_PURPLE + "Enter your name: " + Quiz.ANSI_RESET);
		        String name = sc.nextLine();

		        System.out.print(Quiz.ANSI_PURPLE + "Enter your city: " + Quiz.ANSI_RESET);
		        String city = sc.nextLine();

		        System.out.print(Quiz.ANSI_PURPLE + "Enter your age: " + Quiz.ANSI_RESET);
		        int age = sc.nextInt();

		        System.out.println("\nHello " + name + " from " + city + "! Let's begin the quiz.\n");

		        quiz.showMoneyTree();
		        quiz.startQuiz();
		    }
		}
		

	


