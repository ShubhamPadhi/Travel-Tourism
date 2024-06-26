
package travel.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BookHotel extends JFrame implements ActionListener{
    Choice chotel,cac,cfood;
    JTextField tfdays,tfperson;
    String username;
    JLabel labelusername,labelid,labelidnum,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    BookHotel(String username){
        this.username=username;
        setBounds(350,200,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("BOOK Hotel");
        text.setBounds(100,10,200,30);
       // text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setFont(new Font("Tahoma",Font.BOLD,20) );
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblusername.setBounds(30,70,100,20);
         add(lblusername);
         
        labelusername=new JLabel();
          labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
         labelusername.setBounds(250,70,200,20);
         add(labelusername);
         
        
          JLabel lblpackage=new JLabel("Select Hotel");
         lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(30,110,150,20);
         add(lblpackage);
         
         chotel=new Choice();
       
         chotel.setBounds(250,110,200,20);
         add( chotel);
         try{
             Database db=new Database();
             ResultSet rs=db.s.executeQuery("select * from hotel");
             while(rs.next()){
                 chotel.add(rs.getString("name"));
             }
         }catch (Exception e){
             e.printStackTrace();
         }
         
         
          JLabel lblpersons=new JLabel("Total Persons");
          lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));   
         lblpersons.setBounds(30,150,150,25);
         add(lblpersons);
         
         tfperson=new JTextField("1");
         tfperson.setBounds(250,150,200,25);
         add(tfperson);
         
          JLabel lbldays=new JLabel("No. of Days");
          lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));   
         lbldays.setBounds(30,190,150,25);
         add(lbldays);
         
         tfdays=new JTextField("1");
         tfdays.setBounds(250,190,200,25);
         add(tfdays);
         
           JLabel lblac=new JLabel("AC or NON-AC");
          lblac.setFont(new Font("Tahoma",Font.PLAIN,16));   
         lblac.setBounds(30,230,150,25);
         add(lblac);
         
         cac=new Choice();
         cac.add("AC");
         cac.add("Non-AC");
         cac.setBounds(250,230,200,20);
         add( cac);
         
           JLabel lblfood=new JLabel("Food Included!");
          lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));   
         lblfood.setBounds(30,270,150,25);
         add(lblfood);
         
         cfood=new Choice();
         cfood.add("Yes");
         cfood.add("No");
         cfood.setBounds(250,270,200,20);
         add( cfood);
         
          JLabel lblid=new JLabel("Id");
          lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
         lblid.setBounds(30,310,150,20);
         add(lblid);
         
       labelid=new JLabel();
        labelid.setBounds(250,310,200,25);
         add(labelid);
         
         JLabel idnumber=new JLabel("Number");
         idnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        idnumber.setBounds(30,350,150,25);
         add(idnumber);
         
          labelidnum=new JLabel();
       labelidnum.setBounds(250,350,150,25);
         add(labelidnum);
         
          JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(30,390,150,25);
         add(lblphone);
         
          labelphone=new JLabel();
         labelphone.setBounds(250,390,200,25);
         add(labelphone);
         
         JLabel lbltotal=new JLabel("Total Price");
         lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
         lbltotal.setBounds(30,430,150,25);
         add(lbltotal);
         
          labelprice=new JLabel();
         labelprice.setBounds(250,430,200,25);
         add(labelprice);
         try{
             Database db=new Database();
             String query="select * from customer where username ='"+username+"'";
             ResultSet rs=db.s.executeQuery(query);
             while(rs.next()){
                 labelusername.setText(rs.getString("username"));
                 labelid.setText(rs.getString("Id"));
                 labelidnum.setText(rs.getString("number"));
                 labelphone.setText(rs.getString("phone"));
             }
         }
         catch(Exception e){
             e.printStackTrace();
         }
         
         checkprice=new JButton("Check Price");
         checkprice.setBackground(Color.BLACK);
         checkprice.setForeground(Color.WHITE);
         checkprice.setBounds(60,490,120,25);
         checkprice.addActionListener(this);
         add(checkprice);
         
        bookpackage=new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBounds(200,490,120,25);
        bookpackage.addActionListener(this);
         add( bookpackage);
         
         
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(340,490,120,25);
        back.addActionListener(this);
         add(back);
         

           ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
            Image i2 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l1 = new JLabel(i3);
            l1.setBounds(500,50,600,300);
            add(l1);
         
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try{
            Database db=new Database();
            ResultSet rs=db.s.executeQuery("select * from hotel where name='"+chotel.getSelectedItem()+"'");
          while(rs.next()){
              int cost=Integer.parseInt(rs.getString("costperperson"));
              int food=Integer.parseInt(rs.getString("foodincluded"));
              int ac=Integer.parseInt(rs.getString("acroom"));
              
              
              int person=Integer.parseInt(tfperson.getText());
              int days=Integer.parseInt(tfdays.getText());
              
              String acselected=cac.getSelectedItem();
              String foodselected=cfood.getSelectedItem();
              
              if(person*days>0){
                  int total=0;
                  total+=acselected.equals("AC")? ac:0;
                  total+=foodselected.equals("Yes")?food:0;
                  total+=cost;
                  total=total*person*days;
                  labelprice.setText("Rs"+total);
                  
              }else{
                  JOptionPane.showMessageDialog(null,"Please Enter a Valid Number");
              }
          }
         //   String pack=chotel.getSelectedItem();
          
            }catch(Exception e){
                e.printStackTrace();
            }
           
        }else if(ae.getSource()==bookpackage){
            try{
               Database db=new Database();
               db.s.executeUpdate("insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"', '"+tfperson.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"', '"+labelid.getText()+"', '"+labelidnum.getText()+"' ,'"+labelphone.getText()+"','"+labelprice.getText()+"')");
               
               JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
               setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }
    
    public static void main(String [] args){
        new BookHotel("");
    }
}

