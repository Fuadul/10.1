import javax.swing.JOptionPane;
public class enumcancel {
public enum months {January, February, March, April, May, June, July, August, September, October, November, December}
public static void main(String[] args) {
months[] choices = {months.January,months.February, months.March, months.April, months.May, months.June, months.July, months.August,
months.September,months.October,months.November,months.December};
months input = (months) JOptionPane.showInputDialog(null, "Choose a month...","months",JOptionPane.INFORMATION_MESSAGE, null,choices,choices[0]);
while (input!=null){
switch(input){
case January: case February: case December:
JOptionPane.showMessageDialog(null, "Do you want to build a snow man?" );
break;
case March: case April: case May:
JOptionPane.showMessageDialog(null, "Happy Spring days!" );
break;
case June: case July: case August:
JOptionPane.showMessageDialog(null, "It's a summer time" );
break;
case September: case October: case November:
JOptionPane.showMessageDialog(null, " Welcome to the foliage season!" );
break;
}
input = (months) JOptionPane.showInputDialog(null, "Choose a month...","months",JOptionPane.INFORMATION_MESSAGE, null,choices,choices[0]);
}	
}
}
