package cpe200;

public class Student {

    private
    String name ;
    String id ;
<<<<<<< Updated upstream
    int yob;
    boolean status ;
    public Student() {
        name = "John Doe";
        id = "560610000";
        yob = 1990;
        status = false;
    }

    public Student(String name2 , String id2 , int yob2 , boolean status2) {
=======
    int Birth;
    boolean status ;

    public Student() {
        name = "John Doe";
        id = "560610000";
        Birth = 1990;
        status = false;
    }

    public Student(String name2 , String id2 , int Birth2 , boolean status2) {
        name = name2==""?"John Doe":name2;
        id = isValidStudent_id(id2)?id2:"560610000";
        Birth = isValidYOB(Birth2)?Birth2:1990;
        status = status2;
    }
    public String getName()
    {
        return name;
    }
    public String getStudent_id()
    {
        return id;
    }
    public int getYearOfBirth()
    {
        return Birth;
    }
    public boolean isActive(){
        return status;
    }
    public void setName(String name2)
    {
        name = name2!=""?name2:name;
    }
    public void setStudent_id(String id2)
    {
        id = isValidStudent_id(id2)?id2:id;
    }
    public void setYearOfBirth(int Birth2)
    {
        Birth = isValidYOB(Birth2)?Birth2:Birth;
    }
>>>>>>> Stashed changes

       name = name2==""?"John Doe":name2;
       id = isValidStudent_id(id2)?id2:"560610000";
        yob = isValidYOB(yob2)?yob2:1990;
        status = status2;
    }
    public String getName(){
        return name;
    }
    public String getStudent_id(){
        return id;
    }
    public int getYearOfBirth(){
        return yob;
    }
    public boolean isActive(){
        return status;
    }
    public void setName(String name2){
       name = name2!=""?name2:name;
    }
    public void setStudent_id(String id2){id = isValidStudent_id(id2)?id2:id;}
    public void setYearOfBirth(int yob2){
        yob = isValidYOB(yob2)?yob2:yob;
    }
    @Override
    public String toString() {
<<<<<<< Updated upstream
        String o = name +" ("+id+") was born in "+yob+" is an ";
=======
        String o = name +" ("+id+") was born in "+Birth+" is an ";
>>>>>>> Stashed changes
        return status?o+"ACTIVE student.":o+"INACTIVE student.";
    }

    private boolean isValidStudent_id(String id) {
<<<<<<< Updated upstream
        return id.matches("5[6-9]{1}061[0-2]{1}[0-9]{3}") ? true : false;
    }

    private boolean isValidYOB(int yob) {
       return yob > 1989?true:false;
    }
}
=======

        return id.matches("5[6-9]{1}061[0-2]{1}[0-9]{3}") ? true : false;
    }

    private boolean isValidYOB(int Birth)
    {
        return Birth > 1989?true:false;
    }

}
>>>>>>> Stashed changes
