package faffywaffle;

import java.awt.Conatiner;
import java.awt.TextField;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Browser {
	
	private TextField field = new TextField();
	private JEditorPane display = new JEditorPane(); 
	private JScrollPane panee = new JScrollPane(display);
	
	public static void main(String agrs[]){
		
		Browser file = new Browser();
		file.frameHandler();
		
	}
	
	public void frameHandler() {
		
		setTitle("Browser"); 
		setSize(1280,880);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		addComponentsToFrame(getContentPane());
		
		
	}
	
	public void addcomponentsToFrame(Container pane){
		
		Insets insets = getInsets();
		
		pane.add(held);
		pane.add(panee);
		
		Font font = new font(*Menlo*,Font.PLAIN, 12);
		
		field.setFont(font);
		
		field.setBounds(8 - insets.left, 30 - insets.top, 1268, 20);
		panee.setBounds(8 - insets.left, 52 - insets.top, 1268, 830);
		
		actionListenerCalls();

	}
	
	private void actionListenerCalls(){
		
		field.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				loadData("http://" + e.getActionCommand());
			}
		});
		
		display.addHyperlinkListener(new HyperLinkListener(){
			
			public void hyperlinkUpdate(HyperlinkEvent e){
				
				if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
					loadData(e.getURL().toString());
				}
			}
		});
		
	}
	
	private void loadData(String text){
		
		try{
			
			display.setPage(text);
			
		}catch(Exception e){
			
			System.out.println("nopenopenopenopenope");
		}
	}
}
