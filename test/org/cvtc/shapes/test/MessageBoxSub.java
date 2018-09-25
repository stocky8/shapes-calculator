package org.cvtc.shapes.test;

import org.cvtc.shapes.Dialog;

/**
 * @author hstockdill
 *
 */
public class MessageBoxSub implements Dialog {

	@Override
	public int show(String message, String title) {
		return 0x00; // Same as JOptionPane.OK_OPTION
	}

}
