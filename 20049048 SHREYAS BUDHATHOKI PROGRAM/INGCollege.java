import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class INGCollege implements ActionListener
{
    //Declaring Variables
    JFrame frame;
    JPanel jpanel;
    JLabel Heading,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,Title,l14,l15,l16,l17,l18,l19,l20,l21,l22;
    JTextField Fl1,Fl2,Fl3,Fl4,Fl5,Fl6,Fl7,Fl8,Fl9,Fl10,Fl11,Fl14,Fl15,Fl16,Fl17,Fl18,Fl19,Fl20,Fl21,Fl22;
    JButton Submit,Display,Clear,Register,Submit1,Remove,Display1,Clear1,Register1;
    
    //Creating arraylist
      ArrayList<course> abc = new ArrayList();
      AcademicCourse Academic;
      NonAcademicCourse nonAcademic;
    
    //Making the GUI  method 
    public void form(){
       frame=new JFrame();
       frame.setTitle("Course Form");
    
       jpanel=new JPanel();
       frame.setBackground(new java.awt.Color(217, 222, 202));
       
        /*
        * Academic Course
        */

       Heading=new JLabel();
       Heading.setText("Academic Course:");
       Heading.setBounds(130, 20, 500, 40);
       jpanel.add(Heading);
       Font ff=new Font("Times New Roman",Font.BOLD,22);
       Heading.setFont(ff);
       
        l1=new JLabel();
        l1.setText("Course ID:");
        l1.setBounds(60, 60, 300, 40);
        jpanel.add(l1);
       
       Fl1=new JTextField();
       Fl1.setText("");
       Fl1.setBounds(130,70,100,20);
       jpanel.add(Fl1);
       
       l2=new JLabel();
       l2.setText("Course Name:");
       l2.setBounds(280, 60, 300, 40);
       jpanel.add(l2);
       
       Fl2=new JTextField();
       Fl2.setText("");
       Fl2.setBounds(370,70,100,20);
       jpanel.add(Fl2);
       
       l3=new JLabel();
       l3.setText("Duration:");
       l3.setBounds(60, 90, 300, 40);
       jpanel.add(l3);
       
       Fl3=new JTextField();
       Fl3.setText("");
       Fl3.setBounds(130,100,100,20);
       jpanel.add(Fl3);
       
       l5=new JLabel();
       l5.setText("Lecturer Name:");
       l5.setBounds(280, 150, 300, 40);
       jpanel.add(l5);
       
       Fl5=new JTextField();
       Fl5.setText("");
       Fl5.setBounds(370,160,100,20);
       jpanel.add(Fl5);
       
       l11=new JLabel();
       l11.setText("Course leader:");
       l11.setBounds(40, 150, 300, 40);
       jpanel.add(l5);
       
       Fl11=new JTextField();
       Fl11.setText("");
       Fl11.setBounds(130,160,100,20);
       jpanel.add(Fl11);
       
       Submit=new JButton();
       Submit.setText("Add Course");
       Submit.setBounds(200,130,120,20);
       jpanel.add(Submit);
       Submit.addActionListener(this);
       
        
       l6=new JLabel();
       l6.setText("Level:");
       l6.setBounds(80, 180, 300, 40);
       jpanel.add(l6);
       
        
       
       Fl6=new JTextField();
       Fl6.setText("");
       Fl6.setBounds(130,190,100,20);
       jpanel.add(Fl6);
       
       l7=new JLabel();
       l7.setText("Credits:");
       l7.setBounds(320, 180, 300, 40);
       jpanel.add(l7);
       
       Fl7=new JTextField();
       Fl7.setText("");
       Fl7.setBounds(370,190,100,20);
       jpanel.add(Fl7);
       
       l8=new JLabel();
       l8.setText("Starting Date:");
       l8.setBounds(40, 210, 300, 40);
       jpanel.add(l8);
       
       Fl8=new JTextField();
       Fl8.setText("");
       Fl8.setBounds(130,220,100,20);
       jpanel.add(Fl8);
       
       l9=new JLabel();
       l9.setText("Complition Date:");
       l9.setBounds(270, 210, 300, 40);
       jpanel.add(l9);
       
       Fl9=new JTextField();
       Fl9.setText("");
       Fl9.setBounds(370,220,100,20);
       jpanel.add(Fl9);
       
       l10=new JLabel();
       l10.setText("Number of Assesments:");
       l10.setBounds(237, 90, 300, 40);
       jpanel.add(l10);
       
       Fl10=new JTextField();
       Fl10.setText("");
       Fl10.setBounds(370,100,100,20);
       jpanel.add(Fl10);
       
       Register=new JButton();
       Register.setText("Register");
       Register.setBounds(200,270,100,20);
       jpanel.add(Register);
       Register.addActionListener(this);
       
       Display=new JButton();
       Display.setText("Display");
       Display.setBounds(100,300,100,20);
       jpanel.add(Display);
       Display.addActionListener(this);
        
       
       Clear=new JButton();
       Clear.setText("Clear");
       Clear.setBounds(300,300,100,20);
       jpanel.add(Clear); 
       Clear.addActionListener(this);
       
       /* 
        * NonAcademic Course
        */
       
       Title=new JLabel();
       Title.setText("NonAcademic Course Form:");
       Title.setBounds(680, 20, 500, 40);
       jpanel.add(Title);
       Title.setFont(ff);
       
       l14=new JLabel();
       l14.setText("Course ID:");
       l14.setBounds(610, 60, 300, 40);
       jpanel.add(l14);
       
       Fl14=new JTextField();
       Fl14.setText("");
       Fl14.setBounds(680,70,100,20);
       jpanel.add(Fl14);
       
       l15=new JLabel();
       l15.setText("Course name:");
       l15.setBounds(830, 60, 300, 40);
       jpanel.add(l15);
       
       Fl15=new JTextField();
       Fl15.setText("");
       Fl15.setBounds(920,70,100,20);
       jpanel.add(Fl15);
       
       l16=new JLabel();
       l16.setText("Duration:");
       l16.setBounds(620, 90, 300, 40);
       jpanel.add(l16);
       
       Fl16=new JTextField();
       Fl16.setText("");
       Fl16.setBounds(680,100,100,20);
       jpanel.add(Fl16);
       
       l17=new JLabel();
       l17.setText("Course leader:");
       l17.setBounds(830,160,100,20);
       jpanel.add(l17);
       
       Fl17=new JTextField();
       Fl17.setText("");
       Fl17.setBounds(920,160,100,20);
       jpanel.add(Fl17);
       
       l18=new JLabel();
       l18.setText("Instructor Name:");
       l18.setBounds(580, 150, 300, 40);
       jpanel.add(l18);
       
       Fl18=new JTextField();
       Fl18.setText("");
       Fl18.setBounds(680,160,100,20);
       jpanel.add(Fl18);
       
             
       l19=new JLabel();
       l19.setText("Starting Date:");
       l19.setBounds(590, 180, 300, 40);
       jpanel.add(l19);
       
       Fl19=new JTextField();
       Fl19.setText("");
       Fl19.setBounds(680,190,100,20);
       jpanel.add(Fl19);
       
       Submit1=new JButton();
       Submit1.setText("Add Course");
       Submit1.setBounds(770,130,150,20);
       jpanel.add(Submit1);
       Submit1.addActionListener(this);
       
       l20=new JLabel();
       l20.setText("Completion Date:");
       l20.setBounds(810, 180, 300, 40);
       jpanel.add(l20);
       
       Fl20=new JTextField();
       Fl20.setText("");
       Fl20.setBounds(920,190,100,20);
       jpanel.add(Fl20);
       
       l21=new JLabel();
       l21.setText("Exam Date:");
       l21.setBounds(730, 210, 300, 40);
       jpanel.add(l21);
       
       Fl21=new JTextField();
       Fl21.setText("");
       Fl21.setBounds(800,220,150,20);
       jpanel.add(Fl21);
       
       l22=new JLabel();
       l22.setText("Prerequisite:");
       l22.setBounds(830, 90, 300, 40);
       jpanel.add(l22);
       
       Fl22=new JTextField();
       Fl22.setText("");
       Fl22.setBounds(920,100,100,20);
       jpanel.add(Fl22);
       
       Register1=new JButton();
       Register1.setText("Register");
       Register1.setBounds(800,250,100,20);
       jpanel.add(Register1);
       Register1.addActionListener(this);
       
       Remove=new JButton();
       Remove.setText("Remove");
       Remove.setBounds(800,280,100,20);
       jpanel.add(Remove);
       Remove.addActionListener(this);
        
       Display1=new JButton();
       Display1.setText("Display");
       Display1.setBounds(680,280,100,20);
       jpanel.add(Display1);
       Display1.addActionListener(this);
       
       Clear1=new JButton();
       Clear1.setText("Clear");
       Clear1.setBounds(920,280,100,20);
       jpanel.add(Clear1);
       Clear1.addActionListener(this);
       
        frame.add(Heading);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(l10);
        frame.add(l11);
        frame.add(l15);
        frame.add(l16);
        frame.add(l17);
        frame.add(l18);
        frame.add(l19);
        frame.add(l14);
        frame.add(l20);
        frame.add(l21);
        frame.add(l22);
        frame.add(Title);
        frame.add(Fl1);
        frame.add(Fl2);
        frame.add(Fl3);
        frame.add(Fl5);
        frame.add(Fl6);
        frame.add(Fl7);
        frame.add(Fl8);
        frame.add(Fl9);
        frame.add(Fl10);
        frame.add(Fl11);
        frame.add(Fl14);
        frame.add(Fl15);
        frame.add(Fl16);
        frame.add(Fl17);
        frame.add(Fl18);
        frame.add(Fl19);
        frame.add(Fl20);
        frame.add(Fl21);
        frame.add(Fl22);
        frame.add(Submit);
        frame.add(Display);
        frame.add(Clear);
        frame.add(Register);
        frame.add(Submit1);
        frame.add(Display1);
        frame.add(Clear1);
        frame.add(Register1);
        frame.add(Remove);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(165,130,1100,460);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {   
             //Adding ActionListener to the button "Add Course" of Academic Course
        if (e.getSource() == Submit)
            {
            try{
            String CourseID = Fl1.getText();
            String CourseName = Fl2.getText();
            String Credit = Fl7.getText();
            String Level = Fl6.getText();
            String NumberOfAssessments = Fl10.getText();
            String Duration = Fl3.getText();
            boolean isDuplicateCID = false;

            if(CourseID.isEmpty() || CourseName.isEmpty() || Credit.isEmpty() || Level.isEmpty() || NumberOfAssessments.isEmpty() || Duration.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the text fields!","Error!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int Duration1 = Integer.parseInt(Fl3.getText());
                int NumberOfAssessments1 = Integer.parseInt(Fl10.getText());

                for(course var:abc){
                    if(var.getCourseID().equals (CourseID)){
                        isDuplicateCID = true;
                        break;
                    }
                }
                    if(isDuplicateCID == false){
                        Academic = new AcademicCourse(CourseID,CourseName,Duration1,Credit,Level,NumberOfAssessments1);
                        abc.add(Academic);
                        JOptionPane.showMessageDialog(frame, "Academic Course is now successfully added","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Course ID has been repeated","ERROR!!",JOptionPane.ERROR_MESSAGE);
                }
                }
            }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame,"Please be certain that all the data are inserted correctly","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
        } 
       //Adding ActionListener to the button "Register" of Academic Course
       else if(e.getSource() == Register){
            try{
                String courseID = Fl1.getText();
                String courseLeader = Fl11.getText();
                String lecturerName = Fl5.getText();
                String startingDate =Fl8.getText();
                String completionDate =Fl9.getText();
                boolean hasbeenreg=false;
                for(course var:abc){
                    if(var.getCourseID() .equals (courseID)){
                        if(var instanceof AcademicCourse){
                              hasbeenreg=true;
                             AcademicCourse REGaca = (AcademicCourse) var;
                             if(REGaca.getisRegistered() == true){
                                 JOptionPane.showMessageDialog(frame,"Course is already Registered","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                             else{
                                REGaca.register(courseLeader,lecturerName,startingDate,completionDate);
                                JOptionPane.showMessageDialog(frame,"Course has been Registered Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Course not Found!","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                if(!hasbeenreg){
                JOptionPane.showMessageDialog(frame,"Invalid Course ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame,"Please enter the valid details","ERROR",JOptionPane.ERROR_MESSAGE);
            }
             }
        //Adding ActionListener to the button "Display" of Academic Course    
       else if (e.getSource() == Display){
                    for(course obj : abc){
                   if(obj instanceof AcademicCourse){
                       Academic = (AcademicCourse) obj;
                       Academic.Display();
                   }
                }
        }
       //Adding ActionListener to the button "clear" of Academic Course
        else if(e.getSource()==Clear){
            Fl1.setText("");
            Fl2.setText("");
            Fl3.setText("");
            Fl4.setText("");
            Fl5.setText("");
            Fl6.setText("");
            Fl7.setText("");
            Fl8.setText("");
            Fl9.setText("");
            Fl10.setText("");
            Fl11.setText("");
        }
      //Adding ActionListener to the button "Add Course" of NonAcademic Course
         if (e.getSource() == Submit1)
        {
            try{
            String CourseID = Fl14.getText();
            String CourseName = Fl15.getText();
            String Prerequisite = Fl22.getText();
            String Duration = Fl16.getText();
            boolean isDuplicateCID = false;

            if(CourseID.isEmpty() || CourseName.isEmpty() || Prerequisite.isEmpty() || Duration.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please enter all the text feilds!","Error!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int Duration1 = Integer.parseInt(Fl16.getText());
                
                for(course var:abc){
                    if(var.getCourseID().equals (CourseID)){
                        isDuplicateCID = true;
                        break;
                    }
                }
                    if(isDuplicateCID == false){
                        nonAcademic = new NonAcademicCourse(CourseID, CourseName, Duration1, Prerequisite);
                        abc.add(nonAcademic);
                        JOptionPane.showMessageDialog(frame, "NonAcademic Course is now successfully added","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Course ID has been repeated","ERROR!!",JOptionPane.ERROR_MESSAGE);
                }   
            }
           }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame, "Please be certain that all the data are inserted correctly","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
        }
    
        //Adding ActionListener to the button "Register" of NonAcademic Course
        else if(e.getSource() == Register1){
            try{
                String CourseID = Fl14.getText();
                String CourseLeader = Fl15.getText();
                String InstructorName = Fl18.getText();
                String StartingDate = Fl19.getText();
                String CompletionDate = Fl20.getText();
                String ExamDate = Fl21.getText();
                boolean foundCourseId = false;
                
                for(course var:abc){
                    if(var.getCourseID().equals (CourseID)){
                        foundCourseId = true;
                        if(var instanceof NonAcademicCourse){
                             NonAcademicCourse REGaca = (NonAcademicCourse) var;
                             if(REGaca.getisRegistered()== true){
                                 JOptionPane.showMessageDialog(frame,"Course is already Registered","ERROR",JOptionPane.ERROR_MESSAGE);
                                }
                             else{
                                REGaca.register(CourseLeader,InstructorName,StartingDate,CompletionDate,ExamDate);
                                JOptionPane.showMessageDialog(frame,"Course has been Registered Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                break;
                                }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Course not Found!","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                if (!foundCourseId){
                    JOptionPane.showMessageDialog(frame,"Invalid Courseid");
                }
            }
            catch(Exception A){
                JOptionPane.showMessageDialog(frame,"Please enter valid details","ERROR",JOptionPane.ERROR_MESSAGE);
            }
     }
        //Adding ActionListener to the button "Clear" of NonAcademic Course
        else if(e.getSource() == Clear1){
            Fl14.setText("");
            Fl15.setText("");
            Fl16.setText("");
            Fl17.setText("");
            Fl18.setText("");
            Fl19.setText("");
            Fl20.setText("");
            Fl21.setText("");
            Fl22.setText("");
        }
        //Adding ActionListener to the button "Remove" of NonAcademic Course
          else if(e.getSource() == Remove){
            try{
                String courseID = Fl14.getText();
                if(courseID.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "The Course ID must be insterted before removing Course","Error!!!", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    boolean isDuplicateNaCID = false;
                    for(course var:abc){
                        if(var.getCourseID().equals (courseID)){
                            isDuplicateNaCID = true;
                            if(var instanceof NonAcademicCourse){
                                nonAcademic = (NonAcademicCourse) var;
                                if(nonAcademic.getisRemoved()==true){
                                    JOptionPane.showMessageDialog(frame,"Course has already been removed","Error", JOptionPane.ERROR_MESSAGE);
                                }
                                else{
                                    nonAcademic.remove();
                                    JOptionPane.showMessageDialog(frame,"Course Removed Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame," Distruption has occured","ERROR",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                    }
                    if(!isDuplicateNaCID){
                        JOptionPane.showMessageDialog(frame,"Invalid Course ID","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException E){
                JOptionPane.showMessageDialog(frame, "Please check Course ID.","ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Adding ActionListener to the button "Display" of NonAcademic Course
        else if (e.getSource() == Display1){      
                for(course obj : abc){
                    if(obj instanceof NonAcademicCourse){
                        nonAcademic = (NonAcademicCourse)obj;
                        nonAcademic.Display();
                    }
                }
      
        }
     }
     //creating accessor method for both Academic and NonAcademic Course
     public String getl1(){
        return Fl1.getText();
    }

    public String getl2(){
        return Fl2.getText();
    }

    public String getl3(){
        return Fl3.getText();
    }

    public String getl4(){
        return Fl4.getText();
    }

    public String getl5(){
        return Fl5.getText();
    }

    public String getl6(){
        return Fl6.getText();
    }

    public String getl7(){
        return Fl7.getText();
    }

    public String getl8(){
        return Fl8.getText();
    }

    public String getl9(){
        return Fl9.getText();
    }

    public String getl10(){
        return Fl10.getText();
    }

    public String getl11(){
        return Fl11.getText();
    }

    public String getl14(){
        return Fl11.getText();
    }

    public String getl15(){
        return Fl11.getText();
    }

    public String getl16(){
        return Fl11.getText();
    }

    public String getl17(){
        return Fl11.getText();
    }

    public String getl18(){
        return Fl11.getText();
    }

    public String getl19(){
        return Fl11.getText();
    }

    public String getl20(){
        return Fl11.getText();
    }

    public String getl21(){
        return Fl11.getText();
    }

    public String getl22(){
        return Fl11.getText();
    }
    //Creating main method
       public static void main(String args[]){
          INGCollege Main=new INGCollege();
         Main.form();  
    }  
}
      

       
       
       
       