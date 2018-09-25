/**
 * 
 */
package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author hstockdill
 *
 */
public class MessageBox implements Dialog {

	/**
	 * 
	 */
	public MessageBox() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int show(String message, String title) {

		JOptionPane.showMessageDialog(null, message, title, JOptionPane.OK_OPTION);
		
		return JOptionPane.OK_OPTION;
	}

}
