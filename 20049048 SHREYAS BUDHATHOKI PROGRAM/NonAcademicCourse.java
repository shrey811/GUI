public class NonAcademicCourse extends course
{
      String InstructorName;
      int Duration;
     String StartDate;
     String CompletionDate;
     String ExamDate;
     String Prerequisite;
     boolean isRegistered;
     boolean isRemoved;
     //created constructors for nonacademic course
        public NonAcademicCourse (String CourseID,String CourseName,int Duration,String Prerequisite){
        super ( CourseID, CourseName, Duration);
        this.InstructorName= InstructorName;
        this.Prerequisite=Prerequisite;
        this.Duration= Duration;
        StartDate="";
        CompletionDate="";
        ExamDate="";
        isRegistered= false;
        isRemoved= false;
    }
    //assessormethodcreadtedforallattributes
    public String getInstructorName(){
        return InstructorName;
    }
    public int getDuration (){
        return Duration;
    }
    public String getStartDate(){
        return StartDate;
    }
    public String getCompletionDate(){
        return  CompletionDate;
    }
    public String getExamDate(){
        return ExamDate;
    }
    public String getPrerequisite(){
        return Prerequisite;
    }
    public boolean getisRegistered(){
        return isRegistered;
    }
    public boolean getisRemoved(){
        return isRemoved;
    }
    //method created for changing value of Instructor Name whenever isSegistered is false
    public void setInstructorName(String InstructorName)
    {
       if (isRegistered == false)
       {this.InstructorName=InstructorName; }
       else 
       { 
           System.out.println("the instructor name is not possible to change");
       }
    
    }
    /*creating a method to register course details
     * if isRegister is false, the input will be taken
     * otherwise,a message is displayed
     */
    public void register(String CourseLeader,String InstructorName,String StartDate, String CompletionDate,String ExamDate)
    {
        if (isRegistered == false)
        {
            setInstructorName(InstructorName);
            this.StartDate = StartDate;
            this.CompletionDate= CompletionDate;
            this. ExamDate=ExamDate;
            this.isRegistered = true;
        }
        else
        {
            System.out.println("Course is already registered");
        }
    }
    //creating method to remove a course
    public void remove ()
    {
        if(  isRemoved == true)
        {
            System.out.println("Course is already removed");
        }
        else
        {
            super.setCourseLeader("");
            this.InstructorName ="";
            this.StartDate ="";
            this.CompletionDate="";
            this. ExamDate="";
            this.isRegistered= false;
            this.isRemoved=true;
        }
    }
    //creating method to display information
    public void Display()
    {
        super.Display();
        if (isRegistered == true)
        {
             System.out.println("The Instructor name is "+ getInstructorName());
             System.out.println("The Starting date is " + getStartDate());
             System.out.println("The Completion date is " + getCompletionDate());
             System.out.println("The Exam date is " + getExamDate());
        }
    }
}