//crate a push button and add it it to a  frame
import java.awt.*;//for button
import java.awt.event.*;//for action listener
class But extends  Frame{
    But()
    {
        //create  a push button b 
        Button b=new Button("OK");
        add(b);//add push button to frame
        //add action listener to button
        //Myclass is implementation class of actionlistener interface
        b.addActionListener(new Myclass());
    }
    public static void main(String[] args) {
        //create a frame by creating Button class object
        But  obj= new But();
        //set size of frame to width:400 px and height: 300 px
        obj.setSize(400,300);
        //display frame
        obj.setVisible(true);
    }
}
class Myclass implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        System.exit(0);
    }
    
}

