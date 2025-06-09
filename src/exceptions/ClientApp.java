/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since Jun 8, 2025
 */

package exceptions;

import javax.swing.JOptionPane;

public class ClientApp {

	public static void main(String[] args) {
		String option = JOptionPane.showInputDialog(null, "Insert Client Code", "Search Client",
				JOptionPane.INFORMATION_MESSAGE);
		try {
			ClientService.searchClient(option);
		} catch (ClientNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
