import java.util.ArrayList;

public class ArrayListPractice {
    /**
     * Get the first element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The first element in the list.
     */
    public static int GetFirst(ArrayList<Integer> numbers) {
        return numbers.get(0);
    }

    /**
     * Get the third element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The third element in the list.
     */
    public static int GetThird(ArrayList<Integer> numbers) {
        return numbers.get(2);
    }

    /**
     * Get the last element in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The last element in the list.
     */
    public static int GetLast(ArrayList<Integer> numbers) {
        return numbers.get(numbers.size()-1);
    }

    /**
     * Get the sum of all elements in the ArrayList.
     * 
     * @param numbers List of numbers to search over.
     * @return The sum of the elements in the list.
     */
    public static int GetSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum+=numbers.get(i);
        }
        return sum;
    }

    /**
     * Returns a string that contains all of the numbers in the ArrayList
     * separated by one space.
     * 
     * For example, if numbers = {1, 4, 3, 2, 6}, your output should
     * be "1 4 3 2 6".
     * 
     * @param numbers List of numbers to search over.
     * @return A string representing the list.
     */
    public static String ConvertToString(ArrayList<Integer> numbers) {
String numberList = "";
        for(int i = 0; i <numbers.size() - 1; i++)
            numberList+=numbers.get(i) + " ";
        numberList+=numbers.get(numbers.size()-1); return numberList;
    }

    /**
     * Returns the largest element in the array
     * 
     * @param numbers List of numbers to search over.
     * @return The largest element in the list.
     */
    public static int GetMax(ArrayList<Integer> numbers) {
        int highest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > highest){
                highest = numbers.get(i);
            }
        }
        return highest;
    }

    /**
     * Creates an array of continuous numbers represented by the range [first, last).
     * Include the first element, but not the last one.
     * If the first and last elements are the same, then the list should be empty.
     * If the last number is less than the first, then the list should also be empty.
     *
     * For example:
     *  CreateNumberArray(4, 8) returns {4, 5, 6, 7}
     *  CreateNumberArray(2, 2) returns {} (an empty list)
     * 
     * @param first The first number in the list (inclusive).
     * @param last The last number in the list (exclusive).
     * @return A list of all numbers between first and last.
     */
    public static ArrayList<Integer> CreateNumberArray(int first, int last) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = first;
        while(i < last){
            result.add(i);
            i++;
        }
        return result;
    }

    /**
     * Finds the first student whose favorite color is the one specified.
     *
     * @param students The list of students to search over.
     * @param color The favorite color the student must have.
     * @return The first student whose favorite color is the one specified.
     */
    public static Student GetFirstStudentWithFavoriteColor(ArrayList<Student> students, String color) {
        Student result = null;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).GetFavoriteColor().equals(color)){
                result = students.get(i);
            }
        }
        return result;
    }

    /**
     * Gets the favorite color for a specified student.
     *
     * @param students The list of students to search over.
     * @param name The name of the student to look for.
     * @return The favorite color of the specified student.
     */
    public static String GetFavoriteColorOfStudent(ArrayList<Student> students, String name) {
        String result = null;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).GetName().equals(name)){
                result = students.get(i).GetFavoriteColor();
            }
        }
        return result;
    }

    /**
     * Finds the tallest student.
     *
     * @param students The list of students to search over.
     * @return The tallest student in the list.
     */
    public static Student GetTallestStudent(ArrayList<Student> students) {
        Student result = students.get(0);
        int maxHeight = students.get(0).GetHeight();
        for (int i = 1; i < students.size(); i++) {
            if(students.get(i).GetHeight() > maxHeight){
                result = students.get(i);
                maxHeight = students.get(i).GetHeight();
            }
        }
        return result;
    }

    /**
     *  Creates an array of Student objects using the information provided in via the parameters.
     * (names[0], heights[0] ...) are for the first student. (names[1], height[1]...)
     * are for the second student, etc.
     * 
     * @param names The list of names of the students.
     * @param heights The list of heights of the students.
     * @param gradeLevels The list of gradeLevels of the students.
     * @param favoriteColors The list of favoriteColors of the students.
     * @param bankAccounts The list of bankAccounts of the students.
     * @return List of Student objects.
     */
    public static ArrayList<Student> CreateStudentArray(ArrayList<String> names, ArrayList<Integer> heights, ArrayList<Integer> gradeLevels, ArrayList<String> favoriteColors, ArrayList<BankAccount> bankAccounts) {
            ArrayList<Student> objects = new ArrayList<Student>();
            for (int i = 0; i < objects.size(); i++) {
                Student newStudent = new Student(names.get(i), heights.get(i), gradeLevels.get(i), favoriteColors.get(i), bankAccounts.get(i));
                objects.add(newStudent);
            }
            return objects;
            // write your code above and remove the line below
        }


    /**
     * Returns a string that lists teams from a 2-D ArrayList. Each ArrayList in
     * the bigger ArrayList contains members of the team.
     * 
     * The expected output looks like this:
     * Team 1: Amy, Abby, Arnold
     * Team 2: Bob, Beatrice, Becky, Ben
     * Team 3: Claire
     * 
     * @param teams The list of teams of students.
     * @return A string that lists the team number followed by each team.
     */
    public static String GetTeamsString(ArrayList<ArrayList<Student>> teams) {
        String result = "";
        for (int i = 0; i < teams.size(); i++) {
            result += "Team " + (i +1) + ": ";
            for (int j = 0; j < teams.get(i).size(); j++) {
                if(j == 0){
                    result += teams.get(i).get(j).GetName();
                }
                else {
                    result += ", " + teams.get(i).get(j).GetName();
                }
            }
            result += "\n";

        }
        return result;
    }

    /**
     * Finds the student with the given name, and updates their favorite color to the given color.
     *
     * @param students The list of students to search over.
     * @param name The name of the student whose favorite color should be updated.
     * @param newFavoriteColor The new favorite color of the student.
     */
    public static void UpdateFavoriteColor(ArrayList<Student> students, String name, String newFavoriteColor) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).GetName().equals(name)){
                students.get(i).SetFavoriteColor(newFavoriteColor);
            }
        }
    }

    /**
     * Create an ArrayList consisting of all students in the given grade level.
     *
     * @param students The list of students to search over.
     * @param gradeLevel The grade level the students should be in.
     * @return An ArrayList containing all the students in gradeLevel.
     */
    public static ArrayList<Student> GetStudentsInGradeLevel(ArrayList<Student> students, int gradeLevel) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).GetGradeLevel() == gradeLevel){
                result.add(students.get(i));
            }
        }
        return result;
    }

    /**
     * Transfer money from one student to another.
     *
     * @param students A list of students.
     * @param fromStudentName The name of the student to transfer money from.
     * @param toStudentName The name of the student to transfer money to.
     * @param amount The amount of money to transfer.
     * @return true if the transfer was successful, i.e. the student to transfer money from
     *     had sufficient funds in their account. Otherwise, false.
     */
    public static boolean TransferMoney(ArrayList<Student> students, String fromStudentName, String toStudentName, double amount) {
        int a = -1;
        int b = -1;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).GetName().equals(fromStudentName)){
                a = i;
            }
            if(students.get(i).GetName().equals((toStudentName))){
                b = i;
            }
        }
        if(a == -1 || b == -1){
            return false;
        }
        if(students.get(a).GetBankAccount().Withdraw(amount) != 0){
            students.get(b).GetBankAccount().Deposit(amount);
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * EXTRA CREDIT:
     * Increments everyone's grade level by one. If a student is in 12th grade, remove them from the array.
     *
     * @param students The list of students to advance to the next grade.
     */
    public static void UpdateGradeLevels(ArrayList<Student> students) {
        for (int i = students.size() -1; i >= 0; i--) {
            if(students.get(i).GetGradeLevel()==12){
                students.remove(i);
            }
            else{
                students.get(i).SetGradeLevel(students.get(i).GetGradeLevel() + 1);
            }
        }
    }

    /**
     * EXTRA CREDIT:
     * Sort the array list by increasing grade level (all the 9th graders, then 10th graders, etc.)
     * If there is a tie (aka 2 people in the same grade), the person whose name is first in the
     * alphabet should appear first.
     *
     * @param students The list of students to sort.
     */
    public static void SortByGradeAndName(ArrayList<Student> students) {
        for(int i = 0; i < students.size() - 1; i++){
            for(int j = 0; j < students.size() - i - 1; j++){
                if(students.get(j).GetGradeLevel() > students.get(j + 1).GetGradeLevel()){
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j+1, temp);
                } else if (students.get(j).GetGradeLevel() == students.get(j + 1).GetGradeLevel()) {
                    if(students.get(j).GetName().compareToIgnoreCase(students.get(j + 1).GetName()) > 0){
                        Student temp = students.get(j);
                        students.set(j, students.get(j + 1));
                        students.set(j+1, temp);
                    }
                }
            }
        }
    }
}
