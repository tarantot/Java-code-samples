import javax.swing.JOptionPane;

public class Reader1 {
	int i, k;
	String n1, n2;
	
	public void Scan() {
		
		n1 = JOptionPane.showInputDialog("Введите первое число: ");
		n2 = JOptionPane.showInputDialog("Введите второе число: ");
		i = Integer.parseInt(n1);
		k = Integer.parseInt(n2);
	}
	
	public void Scan(int a, int b){
		JOptionPane.showMessageDialogue(null, "Теперь Ваше первое число = %d " + a);
		JOptionPane.showMessageDialogue(null, "Теперь Ваше второе число = %d " + b);
	}
	
}