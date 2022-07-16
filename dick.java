import javax.swing.JFrame;

public class dick {
	public static void main(String args[]) {
		Reader2 r = new Reader2("G-гурда");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXITONCLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}