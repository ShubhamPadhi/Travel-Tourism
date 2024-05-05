package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard1 extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,ViewPersonalDetails,UpdatePersonalDetails,viewpackage,checkpackages,bookpackages,viewhotels,destination,payment,bookhotel,viewbookhotel,notepad,calculator,about;
    Dashboard1(String username){
      this.username=username;
        
            setBounds(0,0,1600,1000);
        
     JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(0, 0,102 ));
       p1.setBounds(0,0,1600,65); // Adjusted size for the top bar
       add(p1);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
         JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(0,0,102 ));
        p3.setBounds(0,65,300,900); // Adjusted size for the top bar
        add(p3);
        
        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,3,300,50);
        addPersonalDetails.setBackground(new Color(0,102,0));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,50));
        addPersonalDetails.addActionListener(this);
        p3.add(addPersonalDetails);
        
         UpdatePersonalDetails=new JButton("Update Personal Details");
        UpdatePersonalDetails.setBounds(0,53,300,50);
        UpdatePersonalDetails.setBackground(new Color(0,102,0));
        UpdatePersonalDetails.setForeground(Color.WHITE);
        UpdatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        UpdatePersonalDetails.setMargin(new Insets(0,0,0,30));
        UpdatePersonalDetails.addActionListener(this);
        p3.add(UpdatePersonalDetails);
        
        
         ViewPersonalDetails=new JButton("View  Details");
       ViewPersonalDetails.setBounds(0,103,300,50);
        ViewPersonalDetails.setBackground(new Color(0,102,0));
        ViewPersonalDetails.setForeground(Color.WHITE);
        ViewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        ViewPersonalDetails.setMargin(new Insets(0,0,0,120));
        ViewPersonalDetails.addActionListener(this);
        p3.add(ViewPersonalDetails);
        
         JButton deletePersonalDetails=new JButton("Delete Personal Details");
       deletePersonalDetails.setBounds(0,153,300,50);
        deletePersonalDetails.setBackground(new Color(0,102,0));
       deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,30));
        p3.add(deletePersonalDetails);
        
         checkpackages=new JButton("Check Packages");
       checkpackages.setBounds(0,203,300,50);
       checkpackages.setBackground(new Color(0,102,0));
       checkpackages.setForeground(Color.WHITE);
       checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       checkpackages.setMargin(new Insets(0,0,0,90));
       checkpackages.addActionListener(this);
        p3.add(checkpackages);
        
       bookpackages=new JButton("Book Package");
      bookpackages.setBounds(0,253,300,50);
       bookpackages.setBackground(new Color(0,102,0));
      bookpackages.setForeground(Color.WHITE);
       bookpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookpackages.setMargin(new Insets(0,0,0,100));
       bookpackages.addActionListener(this);
        p3.add(bookpackages);
        
       viewpackage=new JButton("View Package");
     viewpackage.setBounds(0,303,300,50);
     viewpackage.setBackground(new Color(0,102,0));
      viewpackage.setForeground(Color.WHITE);
       viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
       viewpackage.setMargin(new Insets(0,0,0,100));
       viewpackage.addActionListener(this);
        p3.add(viewpackage);
        
        viewhotels=new JButton("View Hotels");
      viewhotels.setBounds(0,353,300,50);
      viewhotels.setBackground(new Color(0,102,0));
      viewhotels.setForeground(Color.WHITE);
      viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
      viewhotels.setMargin(new Insets(0,0,0,120));
      viewhotels.addActionListener(this);
        p3.add(viewhotels);
        
        bookhotel=new JButton("Book Hotel");
      bookhotel.setBounds(0,403,300,50);
       bookhotel.setBackground(new Color(0,102,0));
      bookhotel.setForeground(Color.WHITE);
       bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
       bookhotel.setMargin(new Insets(0,0,0,120));
        bookhotel.addActionListener(this);
        p3.add(bookhotel);
        
         viewbookhotel=new JButton("View Booked Hotel");
      viewbookhotel.setBounds(0,453,300,50);
       viewbookhotel.setBackground(new Color(0,102,0));
     viewbookhotel.setForeground(Color.WHITE);
      viewbookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
      viewbookhotel.setMargin(new Insets(0,0,0,50));
       viewbookhotel.addActionListener(this);
        p3.add(viewbookhotel);
        
         destination=new JButton("Destinations");
      destination.setBounds(0,503,300,50);
      destination.setBackground(new Color(0,102,0));
      destination.setForeground(Color.WHITE);
      destination.setFont(new Font("Tahoma",Font.PLAIN,20));
      destination.setMargin(new Insets(0,0,0,120));
      destination.addActionListener(this);
        p3.add(destination);
        
       payment=new JButton("Payment");
      payment.setBounds(0,553,300,50);
      payment.setBackground(new Color(0,102,0));
      payment.setForeground(Color.WHITE);
      payment.setFont(new Font("Tahoma",Font.PLAIN,20));
      payment.setMargin(new Insets(0,0,0,150));
      payment.addActionListener(this);
        p3.add(payment);
        
        
      calculator=new JButton("Calculator");
      calculator.setBounds(0,603,300,50);
      calculator.setBackground(new Color(0,102,0));
      calculator.setForeground(Color.WHITE);
      calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
      calculator.setMargin(new Insets(0,0,0,150));
      calculator.addActionListener(this);
        p3.add(calculator);
        
        notepad=new JButton("Notepad");
      notepad.setBounds(0,653,300,50);
       notepad.setBackground(new Color(0,102,0));
      notepad.setForeground(Color.WHITE);
     notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
      notepad.setMargin(new Insets(0,0,0,150));
      notepad.addActionListener(this);
        p3.add(notepad);
        
       about=new JButton("About Us");
      about.setBounds(0,703,300,50);
      about.setBackground(new Color(0,102,0));
     about.setForeground(Color.WHITE);
       about.setFont(new Font("Tahoma",Font.PLAIN,20));
       about.setMargin(new Insets(0,0,0,150));
       about.addActionListener(this);
        p3.add(about);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text =new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        image.add(text);
         setVisible(true);
         
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }
        else if(ae.getSource()==ViewPersonalDetails){
            new ViewCustomers(username);
        }
        else if(ae.getSource()==UpdatePersonalDetails){
            
                new UpdateCustomer(username).setVisible(true);
           
        }
         else if(ae.getSource()==checkpackages){
            
                new CheckPackage1().setVisible(true);
           
        }else if(ae.getSource()==bookpackages){
            new BookPackage(username);
        }else if(ae.getSource()==viewpackage){
            new ViewPackage(username);
        }
        else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }
         else if(ae.getSource()==destination){
            new Destination().setVisible(true);
        }
         else if(ae.getSource()==payment){
            new Payment();
        }
        else if(ae.getSource()==bookhotel){
            new BookHotel(username);
        }
        else if(ae.getSource()==viewbookhotel){
            new ViewBookedHotel(username);
        }
         else if(ae.getSource()==calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
         else if(ae.getSource()==notepad){
             try{
                Runtime.getRuntime().exec("notepad.exe");
             } catch(Exception e){
                 e.printStackTrace();
             }
        }
         else if(ae.getSource()==about){
            new About();
        }
    }
    catch(Exception e){
        
    }}
    public static void main(String [] args){
        new Dashboard1("");
    }
}