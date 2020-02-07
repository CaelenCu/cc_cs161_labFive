class Person{
    //Members
    public String firstName;
    private String lastName;
    private String error = "Information not found";
    private int age;

    //Constructor
    public Person(String fn, String ln, int a){
        setFirstName(fn);
        setLastName(ln);
        setAge(a);
    }
    //Setters for attributes
    public void setFirstName(String arg){
        firstName = arg;
    }

    public void setLastName(String arg){
        lastName = arg;
    }

    public void setAge(int arg){
        age = arg;
    }

    //Getters for attributes
    public String getFirstName(){
        //Tries to return the person's first name
        try{
         return firstName;
        } 
        //if an exception occurs, return an error message
        catch(Exception NullReferenceException){
            return error;

        }
    
    }

    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }

    //Returns Person's full name
    public String getName(){
        return firstName + " " + lastName;
    }

    //Returns all of a Person's information
    public String getInfo(){
        return firstName + " " + lastName + " " + age;
    }

    //Edits a Person's information
    public void changeInformation(String fn, String ln, int a){
        setFirstName(fn);
        setLastName(ln);
        setAge(a);
    }
}